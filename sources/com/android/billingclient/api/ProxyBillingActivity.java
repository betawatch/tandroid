package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;

/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    private int activityCode;
    private long billingClientTransactionId;
    private ResultReceiver inAppMessageResultReceiver;
    private boolean isFlowFromFirstPartyClient;
    private boolean sendCancelledBroadcastIfFinished;
    private boolean wasServiceAutoReconnected;

    private zzie getReasonForNullData(int i) {
        return i != -1 ? i != 0 ? i != 3 ? i != 4 ? i != 5 ? zzie.zzbm : zzie.zzbn : zzie.zzbl : zzie.zzbk : zzie.zzbj : zzie.zzbi;
    }

    private Intent makeAlternativeBillingIntent(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent makePurchaseUpdatedIntentWithInternalErrorReason(zzie zzieVar, long j) {
        Intent makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
        makePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 6);
        makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(6);
        newBuilder.setDebugMessage("An internal error occurred.");
        BillingResult build = newBuilder.build();
        int i = zzcg.$r8$clinit;
        makePurchasesUpdatedIntent.putExtra("FAILURE_LOGGING_PAYLOAD", zzcg.zzb(zzieVar, 2, build, null, zzil.zza).zzM());
        makePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        makePurchasesUpdatedIntent.putExtra("billingClientTransactionId", j);
        makePurchasesUpdatedIntent.putExtra("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
        return makePurchasesUpdatedIntent;
    }

    private Intent makePurchasesUpdatedIntent() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onActivityResult(int i, int i2, Intent intent) {
        Intent makePurchaseUpdatedIntentWithInternalErrorReason;
        super.onActivityResult(i, i2, intent);
        if (i == 100 || i == 110) {
            int responseCode = zzc.zzh(intent, "ProxyBillingActivity").getResponseCode();
            int i3 = -1;
            if (i2 == -1) {
                if (responseCode != 0) {
                    i2 = -1;
                }
                if (intent != null) {
                    zzc.zzn("ProxyBillingActivity", "Got null data with resultCode " + i3 + "!");
                    makePurchaseUpdatedIntentWithInternalErrorReason = makePurchaseUpdatedIntentWithInternalErrorReason(getReasonForNullData(i3), this.billingClientTransactionId);
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        makePurchaseUpdatedIntentWithInternalErrorReason = makeAlternativeBillingIntent(string);
                        makePurchaseUpdatedIntentWithInternalErrorReason.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        makePurchaseUpdatedIntentWithInternalErrorReason = makePurchasesUpdatedIntent();
                        makePurchaseUpdatedIntentWithInternalErrorReason.putExtras(intent.getExtras());
                        makePurchaseUpdatedIntentWithInternalErrorReason.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                    makePurchaseUpdatedIntentWithInternalErrorReason.putExtra("billingClientTransactionId", this.billingClientTransactionId);
                    makePurchaseUpdatedIntentWithInternalErrorReason.putExtra("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
                } else {
                    zzc.zzn("ProxyBillingActivity", "Got null bundle!");
                    makePurchaseUpdatedIntentWithInternalErrorReason = makePurchaseUpdatedIntentWithInternalErrorReason(zzie.zzv, this.billingClientTransactionId);
                }
                if (i == 110) {
                    makePurchaseUpdatedIntentWithInternalErrorReason.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(makePurchaseUpdatedIntentWithInternalErrorReason);
            }
            zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + responseCode);
            i3 = i2;
            if (intent != null) {
            }
            if (i == 110) {
            }
            sendBroadcast(makePurchaseUpdatedIntentWithInternalErrorReason);
        } else if (i == 101) {
            int zza = zzc.zza(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver = this.inAppMessageResultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(zza, intent == null ? null : intent.getExtras());
            }
        } else {
            zzc.zzn("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.sendCancelledBroadcastIfFinished = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.sendCancelledBroadcastIfFinished = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.inAppMessageResultReceiver = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.isFlowFromFirstPartyClient = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.activityCode = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.billingClientTransactionId = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.wasServiceAutoReconnected = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
        this.activityCode = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.isFlowFromFirstPartyClient = true;
                this.activityCode = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.inAppMessageResultReceiver = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.activityCode = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.billingClientTransactionId = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.wasServiceAutoReconnected = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.sendCancelledBroadcastIfFinished = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.activityCode, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            zzc.zzo("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.inAppMessageResultReceiver;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent makePurchaseUpdatedIntentWithInternalErrorReason = makePurchaseUpdatedIntentWithInternalErrorReason(zzie.zzbG, this.billingClientTransactionId);
                if (this.isFlowFromFirstPartyClient) {
                    makePurchaseUpdatedIntentWithInternalErrorReason.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(makePurchaseUpdatedIntentWithInternalErrorReason);
            }
            this.sendCancelledBroadcastIfFinished = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.sendCancelledBroadcastIfFinished) {
            Intent makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
            makePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 1);
            makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.isFlowFromFirstPartyClient) {
                makePurchasesUpdatedIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.activityCode;
            if (i == 110 || i == 100) {
                makePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                makePurchasesUpdatedIntent.putExtra("billingClientTransactionId", this.billingClientTransactionId);
            }
            sendBroadcast(makePurchasesUpdatedIntent);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.inAppMessageResultReceiver;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.sendCancelledBroadcastIfFinished);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.isFlowFromFirstPartyClient);
        bundle.putInt("activity_code", this.activityCode);
        bundle.putLong("billingClientTransactionId", this.billingClientTransactionId);
        bundle.putBoolean("wasServiceAutoReconnected", this.wasServiceAutoReconnected);
    }
}
