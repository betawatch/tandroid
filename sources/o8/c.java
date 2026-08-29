package o8;

import android.app.IntentService;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import e0.t;
import i7.y5;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class c extends IntentService {
    private static final int CONNECTION_TIMEOUT_IN_MS = 1000;
    public static final String EXTRA_INTENT = "SearchActionVerificationClientExtraIntent";
    private static final long MS_TO_NS = 1000000;
    private static final String NOTIFICATION_CHANNEL_ID = "Assistant_verifier";
    private static final int NOTIFICATION_ID = 10000;
    private static final String REMOTE_ASSISTANT_GO_SERVICE_ACTION = "com.google.android.apps.assistant.go.verification.VERIFICATION_SERVICE";
    private static final String REMOTE_GSA_SERVICE_ACTION = "com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE";
    private static final String SEND_MESSAGE_ERROR_MESSAGE = "com.google.android.voicesearch.extra.ERROR_MESSAGE";
    private static final String SEND_MESSAGE_RESULT_RECEIVER = "com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER";
    private static final String TAG = "SAVerificationClientS";
    private static final int TIME_TO_SLEEP_IN_MS = 50;
    private final Intent assistantGoServiceIntent;
    private b assistantGoVerificationServiceConnection;
    private final long connectionTimeout;
    private final boolean dbg;
    private final Intent gsaServiceIntent;
    private b searchActionVerificationServiceConnection;

    public c() {
        super("SearchActionVerificationClientService");
        Intent intent = new Intent(REMOTE_GSA_SERVICE_ACTION).setPackage("com.google.android.googlequicksearchbox");
        this.gsaServiceIntent = intent;
        Intent intent2 = new Intent(REMOTE_ASSISTANT_GO_SERVICE_ACTION).setPackage("com.google.android.apps.assistant");
        this.assistantGoServiceIntent = intent2;
        this.dbg = a();
        if (isTestingMode()) {
            intent.setPackage("com.google.verificationdemo.fakeverification");
            intent2.setPackage("com.google.verificationdemo.fakeverification");
        }
        this.connectionTimeout = getConnectionTimeout();
    }

    public final boolean a() {
        return isTestingMode() || !"user".equals(Build.TYPE);
    }

    public final boolean b(String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                if (applicationInfo.enabled) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w(TAG, "Couldn't find package name ".concat(str), e10);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(String str, Intent intent, b bVar) {
        String message;
        boolean b10;
        if (str.equals("com.google.android.googlequicksearchbox") || str.equals("com.google.android.apps.assistant")) {
            if (a() || y5.a(this, str)) {
                if (intent.hasExtra(EXTRA_INTENT)) {
                    Intent intent2 = (Intent) intent.getParcelableExtra(EXTRA_INTENT);
                    if (this.dbg) {
                        Log.d("SAVerificationClientU", "Intent:");
                        String valueOf = String.valueOf(intent2);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1);
                        sb2.append("\t");
                        sb2.append(valueOf);
                        Log.d("SAVerificationClientU", sb2.toString());
                        Bundle extras = intent2.getExtras();
                        if (extras != null) {
                            Log.d("SAVerificationClientU", "Extras:");
                            for (String str2 : extras.keySet()) {
                                Log.d("SAVerificationClientU", String.format("\t%s: %s", str2, extras.get(str2)));
                            }
                        }
                    }
                    if (b.a(bVar)) {
                        try {
                            n8.a aVar = (n8.a) bVar.a;
                            aVar.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                            Parcel E0 = aVar.E0(obtain, 2);
                            int readInt = E0.readInt();
                            E0.recycle();
                            Log.i(TAG, str + " Service API version: " + readInt);
                            Bundle bundle = new Bundle();
                            b10 = bVar.b(intent2, bundle);
                            performAction(intent2, b10, bundle);
                            message = "";
                        } catch (RemoteException e10) {
                            String valueOf2 = String.valueOf(e10.getMessage());
                            Log.e(TAG, valueOf2.length() != 0 ? "Remote exception: ".concat(valueOf2) : new String("Remote exception: "));
                            message = e10.getMessage();
                        } catch (Exception e11) {
                            String valueOf3 = String.valueOf(e11.getMessage());
                            Log.e(TAG, valueOf3.length() != 0 ? "Exception: ".concat(valueOf3) : new String("Exception: "));
                            message = e11.getMessage();
                        }
                        if (intent2.hasExtra(SEND_MESSAGE_RESULT_RECEIVER)) {
                            ResultReceiver resultReceiver = (ResultReceiver) intent2.getExtras().getParcelable(SEND_MESSAGE_RESULT_RECEIVER);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(SEND_MESSAGE_ERROR_MESSAGE, message);
                            resultReceiver.send(b10 ? 0 : -1, bundle2);
                        }
                        return b10;
                    }
                    Object[] objArr = {str, intent};
                    message = "VerificationService is not connected to %s, unable to check intent: %s";
                    Log.e(TAG, String.format("VerificationService is not connected to %s, unable to check intent: %s", objArr));
                    b10 = false;
                    if (intent2.hasExtra(SEND_MESSAGE_RESULT_RECEIVER)) {
                    }
                    return b10;
                }
                if (this.dbg) {
                    String valueOf4 = String.valueOf(intent);
                    StringBuilder sb3 = new StringBuilder(valueOf4.length() + 28);
                    sb3.append("No extra, nothing to check: ");
                    sb3.append(valueOf4);
                    Log.d(TAG, sb3.toString());
                }
            } else if (this.dbg) {
                Log.d(TAG, "Cannot verify the intent with package " + str + " in unsafe mode.");
                return false;
            }
        } else if (this.dbg) {
            Log.d(TAG, "Unsupported package " + str + " for verification.");
            return false;
        }
        return false;
    }

    public long getConnectionTimeout() {
        return 1000L;
    }

    public boolean isTestingMode() {
        return false;
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        if (this.dbg) {
            Log.d(TAG, "onCreate");
        }
        super.onCreate();
        this.searchActionVerificationServiceConnection = new b(this);
        if (b("com.google.android.googlequicksearchbox") && (a() || y5.a(this, "com.google.android.googlequicksearchbox"))) {
            bindService(this.gsaServiceIntent, this.searchActionVerificationServiceConnection, 1);
        }
        this.assistantGoVerificationServiceConnection = new b(this);
        if (b("com.google.android.apps.assistant") && (a() || y5.a(this, "com.google.android.apps.assistant"))) {
            bindService(this.assistantGoServiceIntent, this.assistantGoVerificationServiceConnection, 1);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            postForegroundNotification();
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        if (this.dbg) {
            Log.d(TAG, "onDestroy");
        }
        super.onDestroy();
        if (b.a(this.searchActionVerificationServiceConnection)) {
            unbindService(this.searchActionVerificationServiceConnection);
        }
        if (b.a(this.assistantGoVerificationServiceConnection)) {
            unbindService(this.assistantGoVerificationServiceConnection);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            if (this.dbg) {
                Log.d(TAG, "Unable to verify null intent");
                return;
            }
            return;
        }
        long nanoTime = System.nanoTime();
        while (true) {
            boolean b10 = b("com.google.android.googlequicksearchbox");
            boolean z10 = true;
            boolean z11 = !b10 || b.a(this.searchActionVerificationServiceConnection);
            if (this.dbg) {
                Log.d(TAG, "GSA app com.google.android.googlequicksearchbox installed: " + b10 + " connected " + b.a(this.searchActionVerificationServiceConnection));
            }
            boolean b11 = b("com.google.android.apps.assistant");
            if (b11 && !b.a(this.assistantGoVerificationServiceConnection)) {
                z10 = false;
            }
            if (this.dbg) {
                Log.d(TAG, "AssistantGo app com.google.android.apps.assistant installed: " + b11 + " connected " + b.a(this.assistantGoVerificationServiceConnection));
            }
            if ((!z11 || !z10) && System.nanoTime() - nanoTime < this.connectionTimeout * MS_TO_NS) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e10) {
                    if (this.dbg) {
                        String valueOf = String.valueOf(e10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33);
                        sb2.append("Unexpected InterruptedException: ");
                        sb2.append(valueOf);
                        Log.d(TAG, sb2.toString());
                    }
                }
            }
        }
        if (c("com.google.android.googlequicksearchbox", intent, this.searchActionVerificationServiceConnection)) {
            Log.i(TAG, "Verified the intent with GSA.");
            return;
        }
        Log.i(TAG, "Unable to verify the intent with GSA.");
        if (c("com.google.android.apps.assistant", intent, this.assistantGoVerificationServiceConnection)) {
            Log.i(TAG, "Verified the intent with Assistant Go.");
        } else {
            Log.i(TAG, "Unable to verify the intent with Assistant Go.");
        }
    }

    public abstract void performAction(Intent intent, boolean z10, Bundle bundle);

    public void postForegroundNotification() {
        NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, getApplicationContext().getResources().getString(R.drawable.$avd_flip__0), 2);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setShowBadge(false);
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        t tVar = new t(getApplicationContext(), NOTIFICATION_CHANNEL_ID);
        tVar.q = NOTIFICATION_CHANNEL_ID;
        tVar.e = t.d(getApplicationContext().getResources().getString(R.drawable.$avd_flip__1));
        tVar.E.icon = android.R.drawable.ic_dialog_email;
        tVar.j = -2;
        tVar.x = 1;
        startForeground(NOTIFICATION_ID, tVar.b());
    }
}
