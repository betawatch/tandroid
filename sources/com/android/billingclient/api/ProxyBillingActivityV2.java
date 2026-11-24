package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends hr2 {
    public u9 K;
    public u9 L;
    public u9 M;
    public ResultReceiver N;
    public ResultReceiver O;
    public ResultReceiver P;

    @Override // hr2, gr2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.K = t(new und(this), new s9((byte) 2));
        this.L = t(new cf9(this, (byte) 25), new s9((byte) 2));
        this.M = t(new eod(this, (byte) 0), new s9((byte) 2));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.N = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.O = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.P = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        yid.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.N = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            u9 u9Var = this.K;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            u9Var.a(new jr5(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.O = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            u9 u9Var2 = this.L;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            u9Var2.a(new jr5(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.P = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            u9 u9Var3 = this.M;
            pendingIntent3.getClass();
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            intentSender3.getClass();
            u9Var3.a(new jr5(intentSender3, null, 0, 0));
        }
    }

    @Override // hr2, gr2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.N;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.O;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.P;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
