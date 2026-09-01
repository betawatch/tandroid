package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class PasskeysController {

    /* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
    public class 1 implements v0.i {
        final /* synthetic */ Context val$context;
        final /* synthetic */ int val$currentAccount;
        final /* synthetic */ Utilities.Callback3 val$done;

        public 1(Utilities.Callback3 callback3, Context context, int i10) {
            this.val$done = callback3;
            this.val$context = context;
            this.val$currentAccount = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onResult$0(org.telegram.ui.ActionBar.d2 d2Var, Utilities.Callback3 callback3, long j10, TLRPC.auth_Authorization auth_authorization, TLRPC.TL_error tL_error) {
            d2Var.dismiss();
            if (tL_error != null) {
                callback3.run(Long.valueOf(j10), null, tL_error.text);
            } else {
                callback3.run(Long.valueOf(j10), auth_authorization, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onResult$1(int i10, int i11, Utilities.Callback3 callback3, long j10, DialogInterface dialogInterface) {
            ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
            callback3.run(Long.valueOf(j10), null, "CANCELLED");
        }

        @Override // v0.i
        public void onError(w0.i iVar) {
            if (iVar instanceof w0.k) {
                this.val$done.run(0L, null, "EMPTY");
                return;
            }
            if (iVar instanceof w0.g) {
                this.val$done.run(0L, null, "CANCELLED");
            } else if (iVar instanceof w0.j) {
                this.val$done.run(0L, null, "CANCELLED");
            } else if (iVar != null) {
                this.val$done.run(0L, null, iVar.getMessage());
            }
        }

        @Override // v0.i
        public void onResult(v0.o oVar) {
            cb.e eVar = oVar.a;
            TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
            finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
            try {
                JSONObject jSONObject = new JSONObject(((Bundle) eVar.a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
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
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(this.val$context, 3, null);
                d2Var.q(500L);
                if (parseInt != ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId()) {
                    int currentDatacenterId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId();
                    long currentAuthKeyId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentAuthKeyId();
                    ConnectionsManager.getInstance(this.val$currentAccount).setDefaultDatacenterId(parseInt);
                    finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                    finishpasskeylogin.from_dc_id = currentDatacenterId;
                    finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
                }
                final int sendRequestTyped = ConnectionsManager.getInstance(this.val$currentAccount).sendRequestTyped(finishpasskeylogin, new a(), new rh(d2Var, this.val$done, parseLong, 0), parseInt, 72);
                final int i10 = this.val$currentAccount;
                final Utilities.Callback3 callback3 = this.val$done;
                d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.messenger.sh
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        PasskeysController.1.lambda$onResult$1(i10, sendRequestTyped, callback3, parseLong, dialogInterface);
                    }
                });
            } catch (Exception e6) {
                FileLog.e(e6);
                this.val$done.run(0L, null, e6.getMessage());
            }
        }
    }

    public static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb.toString();
    }

    public static void create(Context context, int i10, Utilities.Callback2<TL_account.Passkey, String> callback2) {
        if (BuildVars.SUPPORTS_PASSKEYS) {
            kotlin.jvm.internal.j.e(context, "context");
            k6.b bVar = new k6.b(context, 1);
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            d2Var.q(500L);
            ConnectionsManager.getInstance(i10).sendRequestTyped(new TL_account.initPasskeyRegistration(), new a(), new mh(d2Var, callback2, bVar, context, i10));
        }
    }

    public static <T> uc.c ktxCallback(Utilities.Callback2<T, Throwable> callback2) {
        return ktxCallback(uc.i.a, callback2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$2(Utilities.Callback2 callback2, Throwable th2) {
        callback2.run(null, th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$3(Utilities.Callback2 callback2, Exception exc) {
        callback2.run(null, exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$4(org.telegram.ui.ActionBar.d2 d2Var, Utilities.Callback2 callback2, TL_account.Passkey passkey, TLRPC.TL_error tL_error) {
        d2Var.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
        } else {
            callback2.run(passkey, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$5(int i10, int i11, Utilities.Callback2 callback2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
        callback2.run(null, "CANCELLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$create$6(Context context, final int i10, TL_account.registerPasskey registerpasskey, final Utilities.Callback2 callback2) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
        d2Var.q(500L);
        final int sendRequestTyped = ConnectionsManager.getInstance(i10).sendRequestTyped(registerpasskey, new a(), new d1(3, d2Var, callback2));
        d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.messenger.lh
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                PasskeysController.lambda$create$5(i10, sendRequestTyped, callback2, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$create$7(final Utilities.Callback2 callback2, Context context, int i10, v0.c cVar, Throwable th2) {
        if ((th2 instanceof w0.b) || (th2 instanceof w0.e)) {
            final int i11 = 0;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.oh
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            callback2.run(null, "CANCELLED");
                            break;
                        default:
                            callback2.run(null, "EMPTY");
                            break;
                    }
                }
            });
            return;
        }
        if (th2 instanceof w0.f) {
            final int i12 = 1;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.oh
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            callback2.run(null, "CANCELLED");
                            break;
                        default:
                            callback2.run(null, "EMPTY");
                            break;
                    }
                }
            });
            return;
        }
        if (th2 != null) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new yg(5, callback2, th2));
            return;
        }
        TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
        try {
            JSONObject jSONObject = new JSONObject(cVar.a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
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
            AndroidUtilities.runOnUIThread(new i0(context, i10, registerpasskey, callback2, 17));
        } catch (Exception e6) {
            FileLog.e(e6);
            AndroidUtilities.runOnUIThread(new ph(callback2, e6, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$8(Utilities.Callback2 callback2, Exception exc) {
        callback2.run(null, exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$9(org.telegram.ui.ActionBar.d2 d2Var, Utilities.Callback2 callback2, v0.h hVar, Context context, int i10, TL_account.passkeyRegistrationOptions passkeyregistrationoptions, TLRPC.TL_error tL_error) {
        d2Var.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
            return;
        }
        try {
            try {
                ((k6.b) hVar).a(context, new v0.e(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), ktxCallback(new qh(context, i10, callback2)));
            } catch (Exception e6) {
                FileLog.e(e6);
                AndroidUtilities.runOnUIThread(new ph(callback2, e6, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            callback2.run(null, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$login$10(boolean[] zArr, Utilities.Callback3 callback3, boolean z4, v0.h hVar, Context context, int i10, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (zArr[0]) {
            return;
        }
        if (tL_error != null) {
            callback3.run(0L, null, tL_error.text);
            return;
        }
        try {
            v0.p pVar = new v0.p(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(pVar);
            v0.n nVar = new v0.n(tc.g.m(arrayList), !z4);
            try {
                CancellationSignal cancellationSignal = new CancellationSignal();
                Executor executor = context.getMainExecutor();
                1 r82 = new 1(callback3, context, i10);
                ((k6.b) hVar).getClass();
                kotlin.jvm.internal.j.e(executor, "executor");
                v0.j b10 = androidx.biometric.u.b(new androidx.biometric.u(context, 2), nVar);
                if (b10 == null) {
                    r82.onError((Object) new w0.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
                } else {
                    b10.onGetCredential(context, nVar, cancellationSignal, executor, r82);
                }
                runnableArr[0] = new xg(cancellationSignal, 3);
            } catch (Exception e6) {
                callback3.run(0L, null, e6.getMessage());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            callback3.run(0L, null, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$login$11(int i10, int i11) {
        ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$login$12(boolean[] zArr, Runnable[] runnableArr) {
        zArr[0] = true;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    public static Runnable login(final Context context, final int i10, final boolean z4, final Utilities.Callback3<Long, TLRPC.auth_Authorization, String> callback3) {
        if (!BuildVars.SUPPORTS_PASSKEYS) {
            return null;
        }
        kotlin.jvm.internal.j.e(context, "context");
        final k6.b bVar = new k6.b(context, 1);
        final boolean[] zArr = new boolean[1];
        final Runnable[] runnableArr = new Runnable[1];
        TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
        initpasskeylogin.api_id = BuildVars.APP_ID;
        initpasskeylogin.api_hash = BuildVars.APP_HASH;
        runnableArr[0] = new nh(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(initpasskeylogin, new a(), new Utilities.Callback2() { // from class: org.telegram.messenger.kh
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                PasskeysController.lambda$login$10(zArr, callback3, z4, bVar, context, i10, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
            }
        }, 8), 0);
        return new sc(zArr, runnableArr, 1);
    }

    public static <T> uc.c ktxCallback(final uc.h hVar, final Utilities.Callback2<T, Throwable> callback2) {
        return new uc.c() { // from class: org.telegram.messenger.PasskeysController.2
            @Override // uc.c
            public uc.h getContext() {
                return uc.h.this;
            }

            @Override // uc.c
            public void resumeWith(Object obj) {
                if (obj instanceof sc.e) {
                    callback2.run(null, ((sc.e) obj).a);
                } else {
                    callback2.run(obj, null);
                }
            }
        };
    }
}
