package androidx.credentials.playservices.controllers.identitycredentials;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import b1.a;
import b1.d;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class IdentityCredentialApiHiddenActivity extends Activity {
    public ResultReceiver a;
    public boolean b;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            int i12 = d.d;
            a.d(resultReceiver, i10, i11, intent);
        }
        this.b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_ERROR_NAME");
        if (stringExtra == null) {
            finish();
            return;
        }
        if (bundle != null) {
            this.b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.b) {
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
        if (pendingIntent != null) {
            this.b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), d.c, null, 0, 0, 0, null);
            return;
        }
        ResultReceiver resultReceiver2 = this.a;
        if (resultReceiver2 != null) {
            int i10 = d.d;
            a.c(resultReceiver2, stringExtra, "Internal error");
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        j.e(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.b);
        super.onSaveInstanceState(outState);
    }
}
