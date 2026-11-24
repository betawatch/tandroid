package androidx.credentials.playservices.controllers.identityauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class HiddenActivity extends Activity {
    public ResultReceiver a;
    public boolean b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        e33 e33Var = j33.a;
        e33.c(resultReceiver, str, str2);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            e33 e33Var = j33.a;
            Bundle j = td4.j(i, "FAILURE_RESPONSE", "ACTIVITY_REQUEST_CODE", false);
            j.putParcelable("RESULT_DATA", intent);
            resultReceiver.send(i2, j);
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
                        resultReceiver2.getClass();
                        a(resultReceiver2, "GET_UNKNOWN", "internal error during the begin sign in operation");
                        break;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        ResultReceiver resultReceiver3 = this.a;
                        resultReceiver3.getClass();
                        a(resultReceiver3, "CREATE_UNKNOWN", "internal error during public key credential creation");
                        break;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        ResultReceiver resultReceiver4 = this.a;
                        resultReceiver4.getClass();
                        a(resultReceiver4, "CREATE_UNKNOWN", "internal error during password creation");
                        break;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        ResultReceiver resultReceiver5 = this.a;
                        resultReceiver5.getClass();
                        a(resultReceiver5, "GET_UNKNOWN", "internal error during the sign-in intent operation");
                        break;
                    }
                    break;
            }
        }
        try {
            this.b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        ResultReceiver resultReceiver6 = this.a;
                        resultReceiver6.getClass();
                        a(resultReceiver6, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e.getMessage());
                        break;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        ResultReceiver resultReceiver7 = this.a;
                        resultReceiver7.getClass();
                        a(resultReceiver7, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e.getMessage());
                        break;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        ResultReceiver resultReceiver8 = this.a;
                        resultReceiver8.getClass();
                        a(resultReceiver8, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e.getMessage());
                        break;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        ResultReceiver resultReceiver9 = this.a;
                        resultReceiver9.getClass();
                        a(resultReceiver9, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e.getMessage());
                        break;
                    }
                    break;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(bundle);
    }
}
