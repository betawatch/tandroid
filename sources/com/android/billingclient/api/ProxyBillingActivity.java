package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import c3.a;
import c5.e0;
import c5.h;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.u;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;

    public final Intent a(int i10, long j3) {
        Intent b10 = b();
        b10.putExtra("RESPONSE_CODE", 6);
        b10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        a a2 = h.a();
        a2.b = 6;
        a2.a = "An internal error occurred.";
        h a10 = a2.a();
        int i11 = e0.a;
        b10.putExtra("FAILURE_LOGGING_PAYLOAD", e0.b(i10, 2, a10, null, m3.b).a());
        b10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        b10.putExtra("billingClientTransactionId", j3);
        b10.putExtra("wasServiceAutoReconnected", this.f);
        return b10;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        Intent a2;
        int i12;
        ResultReceiver resultReceiver;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100 || i10 == 110) {
            int i13 = u.e("ProxyBillingActivity", intent).a;
            if (i11 == -1) {
                if (i13 != 0) {
                    i11 = -1;
                } else {
                    i11 = -1;
                    if (intent != null) {
                        u.h("ProxyBillingActivity", "Got null data with resultCode " + i11 + "!");
                        a2 = a(i11 != -1 ? i11 != 0 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? 117 : 118 : 116 : 115 : 114 : 113, this.e);
                    } else if (intent.getExtras() != null) {
                        String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                        if (string != null) {
                            a2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                            a2.setPackage(getApplicationContext().getPackageName());
                            a2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                            a2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        } else {
                            Intent b10 = b();
                            b10.putExtras(intent.getExtras());
                            b10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            a2 = b10;
                        }
                        a2.putExtra("billingClientTransactionId", this.e);
                        a2.putExtra("wasServiceAutoReconnected", this.f);
                    } else {
                        u.h("ProxyBillingActivity", "Got null bundle!");
                        a2 = a(22, this.e);
                    }
                    if (i10 == 110) {
                        a2.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(a2);
                }
            }
            u.h("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i13);
            if (intent != null) {
            }
            if (i10 == 110) {
            }
            sendBroadcast(a2);
        } else if (i10 == 101) {
            if (intent == null) {
                u.h("ProxyBillingActivity", "Got null intent!");
            } else {
                int i14 = u.a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    u.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i12 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    resultReceiver = this.a;
                    if (resultReceiver != null) {
                        resultReceiver.send(i12, intent == null ? null : intent.getExtras());
                    }
                }
            }
            i12 = 0;
            resultReceiver = this.a;
            if (resultReceiver != null) {
            }
        } else {
            u.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            u.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
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
        u.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.c = true;
                this.d = 110;
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
            u.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent a2 = a(137, this.e);
                if (this.c) {
                    a2.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(a2);
            }
            this.b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.b) {
            Intent b10 = b();
            b10.putExtra("RESPONSE_CODE", 1);
            b10.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.c) {
                b10.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.d;
            if (i10 == 110 || i10 == 100) {
                b10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                b10.putExtra("billingClientTransactionId", this.e);
            }
            sendBroadcast(b10);
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
