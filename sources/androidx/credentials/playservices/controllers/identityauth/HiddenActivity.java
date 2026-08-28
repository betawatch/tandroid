package androidx.credentials.playservices.controllers.identityauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import b1.a;
import b1.d;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class HiddenActivity extends Activity {
    public ResultReceiver a;
    public boolean b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        int i9 = d.d;
        a.c(resultReceiver, str, str2);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            int i11 = d.d;
            a.d(resultReceiver, i9, i10, intent);
        }
        this.b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.b) {
            return;
        }
        if (stringExtra == null) {
            Log.w("HiddenActivity", "Activity handed an unsupported type");
            finish();
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (pendingIntent == null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        ResultReceiver resultReceiver2 = this.a;
                        i.b(resultReceiver2);
                        a(resultReceiver2, "GET_UNKNOWN", "internal error during the begin sign in operation");
                        break;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        ResultReceiver resultReceiver3 = this.a;
                        i.b(resultReceiver3);
                        a(resultReceiver3, "CREATE_UNKNOWN", "internal error during public key credential creation");
                        break;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        ResultReceiver resultReceiver4 = this.a;
                        i.b(resultReceiver4);
                        a(resultReceiver4, "CREATE_UNKNOWN", "internal error during password creation");
                        break;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        ResultReceiver resultReceiver5 = this.a;
                        i.b(resultReceiver5);
                        a(resultReceiver5, "GET_UNKNOWN", "internal error during the sign-in intent operation");
                        break;
                    }
                    break;
            }
        }
        try {
            this.b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e10) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        ResultReceiver resultReceiver6 = this.a;
                        i.b(resultReceiver6);
                        a(resultReceiver6, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e10.getMessage());
                        break;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        ResultReceiver resultReceiver7 = this.a;
                        i.b(resultReceiver7);
                        a(resultReceiver7, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e10.getMessage());
                        break;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        ResultReceiver resultReceiver8 = this.a;
                        i.b(resultReceiver8);
                        a(resultReceiver8, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e10.getMessage());
                        break;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        ResultReceiver resultReceiver9 = this.a;
                        i.b(resultReceiver9);
                        a(resultReceiver9, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e10.getMessage());
                        break;
                    }
                    break;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        i.e(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(outState);
    }
}
