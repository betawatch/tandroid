package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.m;
import androidx.activity.result.c;
import androidx.activity.result.g;
import androidx.fragment.app.e0;
import com.google.android.gms.internal.play_billing.u;
import k5.i;
import m5.c0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends m {
    public c F;
    public c G;
    public c H;
    public ResultReceiver I;
    public ResultReceiver J;
    public ResultReceiver K;

    @Override // androidx.activity.m, e0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.F = r(new xa.c(this, 29), new e0(3));
        this.G = r(new c0(this, 2), new e0(3));
        this.H = r(new i(this, 29), new e0(3));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.I = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.J = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.K = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        u.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.I = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            c cVar = this.F;
            kotlin.jvm.internal.i.e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            kotlin.jvm.internal.i.d(intentSender, "pendingIntent.intentSender");
            cVar.a(new g(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.J = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            c cVar2 = this.G;
            kotlin.jvm.internal.i.e(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            kotlin.jvm.internal.i.d(intentSender2, "pendingIntent.intentSender");
            cVar2.a(new g(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.K = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            c cVar3 = this.H;
            kotlin.jvm.internal.i.e(pendingIntent3, "pendingIntent");
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            kotlin.jvm.internal.i.d(intentSender3, "pendingIntent.intentSender");
            cVar3.a(new g(intentSender3, null, 0, 0));
        }
    }

    @Override // androidx.activity.m, e0.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.I;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.J;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.K;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
