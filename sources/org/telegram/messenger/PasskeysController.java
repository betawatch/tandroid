package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.CancellationSignal;
import android.util.Base64;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.NoCredentialException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.json.JSONObject;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;

/* loaded from: classes3.dex */
public class PasskeysController {
    public static void create(final Context context, final int i, final Utilities.Callback2<TL_account.Passkey, String> callback2) {
        if (BuildVars.SUPPORTS_PASSKEYS) {
            final CredentialManager create = CredentialManager.-CC.create(context);
            final AlertDialog alertDialog = new AlertDialog(context, 3);
            alertDialog.showDelayed(500L);
            ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.initPasskeyRegistration(), new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda12
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    PasskeysController.lambda$create$9(AlertDialog.this, callback2, create, context, i, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$9(AlertDialog alertDialog, final Utilities.Callback2 callback2, CredentialManager credentialManager, final Context context, final int i, TL_account.passkeyRegistrationOptions passkeyregistrationoptions, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
            return;
        }
        try {
            try {
                credentialManager.createCredential(context, new CreatePublicKeyCredentialRequest(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), ktxCallback(new Utilities.Callback2() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda8
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        PasskeysController.lambda$create$7(Utilities.Callback2.this, context, i, (CreateCredentialResponse) obj, (Throwable) obj2);
                    }
                }));
            } catch (Exception e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        PasskeysController.lambda$create$8(Utilities.Callback2.this, e);
                    }
                });
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            callback2.run(null, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$7(final Utilities.Callback2 callback2, final Context context, final int i, CreateCredentialResponse createCredentialResponse, final Throwable th) {
        if ((th instanceof CreateCredentialCancellationException) || (th instanceof CreateCredentialInterruptedException)) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    Utilities.Callback2.this.run(null, "CANCELLED");
                }
            });
            return;
        }
        if (th instanceof CreateCredentialNoCreateOptionException) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    Utilities.Callback2.this.run(null, "EMPTY");
                }
            });
            return;
        }
        if (th != null) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    PasskeysController.lambda$create$2(Utilities.Callback2.this, th);
                }
            });
            return;
        }
        final TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
        try {
            JSONObject jSONObject = new JSONObject(createCredentialResponse.getData().getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
            TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
            registerpasskey.credential = inputpasskeycredentialpublickey;
            inputpasskeycredentialpublickey.id = jSONObject.getString("id");
            registerpasskey.credential.raw_id = jSONObject.getString("rawId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            TL_account.inputPasskeyResponseRegister inputpasskeyresponseregister = new TL_account.inputPasskeyResponseRegister();
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            inputpasskeyresponseregister.client_data = tL_dataJSON;
            tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
            inputpasskeyresponseregister.attestation_object = Base64.decode(jSONObject2.getString("attestationObject"), 8);
            FileLog.d("AAGUID: " + bytesToHex(Arrays.copyOfRange(inputpasskeyresponseregister.attestation_object, 67, 83)));
            registerpasskey.credential.response = inputpasskeyresponseregister;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    PasskeysController.lambda$create$6(context, i, registerpasskey, callback2);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    PasskeysController.lambda$create$3(Utilities.Callback2.this, e);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$2(Utilities.Callback2 callback2, Throwable th) {
        callback2.run(null, th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$3(Utilities.Callback2 callback2, Exception exc) {
        callback2.run(null, exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$6(Context context, final int i, TL_account.registerPasskey registerpasskey, final Utilities.Callback2 callback2) {
        final AlertDialog alertDialog = new AlertDialog(context, 3);
        alertDialog.showDelayed(500L);
        final int sendRequestTyped = ConnectionsManager.getInstance(i).sendRequestTyped(registerpasskey, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda10
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                PasskeysController.lambda$create$4(AlertDialog.this, callback2, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
            }
        });
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda11
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                PasskeysController.lambda$create$5(i, sendRequestTyped, callback2, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$4(AlertDialog alertDialog, Utilities.Callback2 callback2, TL_account.Passkey passkey, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
        } else {
            callback2.run(passkey, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$5(int i, int i2, Utilities.Callback2 callback2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
        callback2.run(null, "CANCELLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$8(Utilities.Callback2 callback2, Exception exc) {
        callback2.run(null, exc.getMessage());
    }

    public static Runnable login(final Context context, final int i, final boolean z, final Utilities.Callback3<Long, TLRPC.auth_Authorization, String> callback3) {
        if (!BuildVars.SUPPORTS_PASSKEYS) {
            return null;
        }
        final CredentialManager create = CredentialManager.-CC.create(context);
        final boolean[] zArr = new boolean[1];
        TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
        initpasskeylogin.api_id = BuildVars.APP_ID;
        initpasskeylogin.api_hash = BuildVars.APP_HASH;
        final int sendRequestTyped = ConnectionsManager.getInstance(i).sendRequestTyped(initpasskeylogin, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                PasskeysController.lambda$login$10(zArr, callback3, z, create, context, i, r7, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
            }
        }, 8);
        final Runnable[] runnableArr = {new Runnable() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                PasskeysController.lambda$login$11(i, sendRequestTyped);
            }
        }};
        return new Runnable() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                PasskeysController.lambda$login$12(zArr, runnableArr);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$login$10(boolean[] zArr, Utilities.Callback3 callback3, boolean z, CredentialManager credentialManager, Context context, int i, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        Executor mainExecutor;
        if (zArr[0]) {
            return;
        }
        if (tL_error != null) {
            callback3.run(0L, null, tL_error.text);
            return;
        }
        try {
            GetCredentialRequest build = new GetCredentialRequest.Builder().addCredentialOption(new GetPublicKeyCredentialOption(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString())).setPreferImmediatelyAvailableCredentials(!z).build();
            try {
                final CancellationSignal cancellationSignal = new CancellationSignal();
                mainExecutor = context.getMainExecutor();
                credentialManager.getCredentialAsync(context, build, cancellationSignal, mainExecutor, new 1(callback3, context, i));
                runnableArr[0] = new Runnable() { // from class: org.telegram.messenger.PasskeysController$$ExternalSyntheticLambda13
                    @Override // java.lang.Runnable
                    public final void run() {
                        cancellationSignal.cancel();
                    }
                };
            } catch (Exception e) {
                callback3.run(0L, null, e.getMessage());
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            callback3.run(0L, null, e2.getMessage());
        }
    }

    class 1 implements CredentialManagerCallback {
        final /* synthetic */ Context val$context;
        final /* synthetic */ int val$currentAccount;
        final /* synthetic */ Utilities.Callback3 val$done;

        1(Utilities.Callback3 callback3, Context context, int i) {
            this.val$done = callback3;
            this.val$context = context;
            this.val$currentAccount = i;
        }

        @Override // androidx.credentials.CredentialManagerCallback
        public void onResult(GetCredentialResponse getCredentialResponse) {
            Credential credential = getCredentialResponse.getCredential();
            TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
            finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
            try {
                JSONObject jSONObject = new JSONObject(credential.getData().getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
                finishpasskeylogin.credential.id = jSONObject.getString("id");
                finishpasskeylogin.credential.raw_id = jSONObject.getString("rawId");
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                TL_account.inputPasskeyResponseLogin inputpasskeyresponselogin = new TL_account.inputPasskeyResponseLogin();
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                inputpasskeyresponselogin.client_data = tL_dataJSON;
                tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
                inputpasskeyresponselogin.authenticator_data = Base64.decode(jSONObject2.getString("authenticatorData"), 8);
                inputpasskeyresponselogin.signature = Base64.decode(jSONObject2.getString("signature"), 8);
                String str = new String(Base64.decode(jSONObject2.getString("userHandle"), 8));
                inputpasskeyresponselogin.user_handle = str;
                int parseInt = Integer.parseInt(str.split(":")[0]);
                final long parseLong = Long.parseLong(inputpasskeyresponselogin.user_handle.split(":")[1]);
                finishpasskeylogin.credential.response = inputpasskeyresponselogin;
                final AlertDialog alertDialog = new AlertDialog(this.val$context, 3);
                alertDialog.showDelayed(500L);
                if (parseInt != ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId()) {
                    int currentDatacenterId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId();
                    long currentAuthKeyId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentAuthKeyId();
                    ConnectionsManager.getInstance(this.val$currentAccount).setDefaultDatacenterId(parseInt);
                    finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                    finishpasskeylogin.from_dc_id = currentDatacenterId;
                    finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.val$currentAccount);
                AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                final Utilities.Callback3 callback3 = this.val$done;
                final int sendRequestTyped = connectionsManager.sendRequestTyped(finishpasskeylogin, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() { // from class: org.telegram.messenger.PasskeysController$1$$ExternalSyntheticLambda0
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        PasskeysController.1.lambda$onResult$0(AlertDialog.this, callback3, parseLong, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                    }
                }, parseInt, 72);
                final int i = this.val$currentAccount;
                final Utilities.Callback3 callback32 = this.val$done;
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.messenger.PasskeysController$1$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        PasskeysController.1.lambda$onResult$1(i, sendRequestTyped, callback32, parseLong, dialogInterface);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
                this.val$done.run(0L, null, e.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onResult$0(AlertDialog alertDialog, Utilities.Callback3 callback3, long j, TLRPC.auth_Authorization auth_authorization, TLRPC.TL_error tL_error) {
            alertDialog.dismiss();
            if (tL_error != null) {
                callback3.run(Long.valueOf(j), null, tL_error.text);
            } else {
                callback3.run(Long.valueOf(j), auth_authorization, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onResult$1(int i, int i2, Utilities.Callback3 callback3, long j, DialogInterface dialogInterface) {
            ConnectionsManager.getInstance(i).cancelRequest(i2, true);
            callback3.run(Long.valueOf(j), null, "CANCELLED");
        }

        @Override // androidx.credentials.CredentialManagerCallback
        public void onError(GetCredentialException getCredentialException) {
            if (getCredentialException instanceof NoCredentialException) {
                this.val$done.run(0L, null, "EMPTY");
                return;
            }
            if (getCredentialException instanceof GetCredentialCancellationException) {
                this.val$done.run(0L, null, "CANCELLED");
            } else if (getCredentialException instanceof GetCredentialInterruptedException) {
                this.val$done.run(0L, null, "CANCELLED");
            } else if (getCredentialException != null) {
                this.val$done.run(0L, null, getCredentialException.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$login$11(int i, int i2) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$login$12(boolean[] zArr, Runnable[] runnableArr) {
        zArr[0] = true;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    public static <T> Continuation ktxCallback(Utilities.Callback2<T, Throwable> callback2) {
        return ktxCallback(EmptyCoroutineContext.INSTANCE, callback2);
    }

    public static <T> Continuation ktxCallback(final CoroutineContext coroutineContext, final Utilities.Callback2<T, Throwable> callback2) {
        return new Continuation() { // from class: org.telegram.messenger.PasskeysController.2
            @Override // kotlin.coroutines.Continuation
            public CoroutineContext getContext() {
                return CoroutineContext.this;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object obj) {
                if (obj instanceof Result.Failure) {
                    callback2.run(null, ((Result.Failure) obj).exception);
                } else {
                    callback2.run(obj, null);
                }
            }
        };
    }

    public static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
