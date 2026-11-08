package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.u;
import f3.a;
import f5.f;
import f5.x;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;

    public final Intent a(int i7, long j3) {
        Intent b10 = b();
        b10.putExtra("RESPONSE_CODE", 6);
        b10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        a a10 = f.a();
        a10.b = 6;
        a10.a = "An internal error occurred.";
        f a11 = a10.a();
        int i10 = x.a;
        b10.putExtra("FAILURE_LOGGING_PAYLOAD", x.b(i7, 2, a11, null, m3.b).a());
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
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i7, int i10, Intent intent) {
        Intent a10;
        int i11;
        ResultReceiver resultReceiver;
        super.onActivityResult(i7, i10, intent);
        if (i7 == 100 || i7 == 110) {
            int i12 = u.e("ProxyBillingActivity", intent).a;
            if (i10 == -1) {
                if (i12 != 0) {
                    i10 = -1;
                } else {
                    i10 = -1;
                    if (intent != null) {
                        u.h("ProxyBillingActivity", "Got null data with resultCode " + i10 + "!");
                        a10 = a(i10 != -1 ? i10 != 0 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? qs.C1 : qs.D1 : qs.B1 : qs.A1 : qs.z1 : qs.y1, this.e);
                    } else if (intent.getExtras() != null) {
                        String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                        if (string != null) {
                            a10 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                            a10.setPackage(getApplicationContext().getPackageName());
                            a10.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                            a10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        } else {
                            Intent b10 = b();
                            b10.putExtras(intent.getExtras());
                            b10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            a10 = b10;
                        }
                        a10.putExtra("billingClientTransactionId", this.e);
                        a10.putExtra("wasServiceAutoReconnected", this.f);
                    } else {
                        u.h("ProxyBillingActivity", "Got null bundle!");
                        a10 = a(22, this.e);
                    }
                    if (i7 == 110) {
                        a10.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(a10);
                }
            }
            u.h("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + i12);
            if (intent != null) {
            }
            if (i7 == 110) {
            }
            sendBroadcast(a10);
        } else if (i7 == 101) {
            if (intent == null) {
                u.h("ProxyBillingActivity", "Got null intent!");
            } else {
                int i13 = u.a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    u.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i11 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    resultReceiver = this.a;
                    if (resultReceiver != null) {
                        resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                    }
                }
            }
            i11 = 0;
            resultReceiver = this.a;
            if (resultReceiver != null) {
            }
        } else {
            u.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i7 + "; skipping...");
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
                this.d = qs.v1;
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
        } catch (IntentSender.SendIntentException e10) {
            u.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent a10 = a(qs.T1, this.e);
                if (this.c) {
                    a10.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(a10);
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
            int i7 = this.d;
            if (i7 == 110 || i7 == 100) {
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
