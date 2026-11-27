package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;

    public final Intent a(int i, long j) {
        Intent b = b();
        b.putExtra("RESPONSE_CODE", 6);
        b.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        h1 a = gi0.a();
        a.a = 6;
        a.c = "An internal error occurred.";
        gi0 a2 = a.a();
        int i2 = pnd.a;
        b.putExtra("FAILURE_LOGGING_PAYLOAD", pnd.b(i, 2, a2, null, uoe.b).a());
        b.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        b.putExtra("billingClientTransactionId", j);
        b.putExtra("wasServiceAutoReconnected", this.f);
        return b;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r0 != 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Intent a;
        int i3;
        ResultReceiver resultReceiver;
        super.onActivityResult(i, i2, intent);
        if (i == 100 || i == 110) {
            int i4 = old.e("ProxyBillingActivity", intent).a;
            if (i2 == -1) {
                i2 = -1;
            }
            old.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i4);
            if (intent == null) {
                old.h("ProxyBillingActivity", "Got null data with resultCode " + i2 + "!");
                a = a(i2 != -1 ? i2 != 0 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? jn7.B1 : jn7.C1 : jn7.A1 : jn7.z1 : jn7.y1 : jn7.x1, this.e);
            } else if (intent.getExtras() != null) {
                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    a = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    a.setPackage(getApplicationContext().getPackageName());
                    a.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    a.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    Intent b = b();
                    b.putExtras(intent.getExtras());
                    b.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    a = b;
                }
                a.putExtra("billingClientTransactionId", this.e);
                a.putExtra("wasServiceAutoReconnected", this.f);
            } else {
                old.h("ProxyBillingActivity", "Got null bundle!");
                a = a(22, this.e);
            }
            if (i == 110) {
                a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(a);
        } else if (i == 101) {
            if (intent == null) {
                old.h("ProxyBillingActivity", "Got null intent!");
            } else {
                int i5 = old.a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    old.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i3 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    resultReceiver = this.a;
                    if (resultReceiver != null) {
                        resultReceiver.send(i3, intent == null ? null : intent.getExtras());
                    }
                }
            }
            i3 = 0;
            resultReceiver = this.a;
            if (resultReceiver != null) {
            }
        } else {
            old.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            old.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        old.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.c = true;
                this.d = jn7.u1;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            old.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent a = a(jn7.S1, this.e);
                if (this.c) {
                    a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(a);
            }
            this.b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.b) {
            Intent b = b();
            b.putExtra("RESPONSE_CODE", 1);
            b.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.c) {
                b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.d;
            if (i == 110 || i == 100) {
                b.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                b.putExtra("billingClientTransactionId", this.e);
            }
            sendBroadcast(b);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.c);
        bundle.putInt("activity_code", this.d);
        bundle.putLong("billingClientTransactionId", this.e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f);
    }
}
