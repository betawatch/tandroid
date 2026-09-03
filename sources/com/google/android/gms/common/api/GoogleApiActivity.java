package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int b = 0;
    public int a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.h g10 = com.google.android.gms.common.api.internal.h.g(this);
                if (i11 == -1) {
                    a7.e eVar = g10.x;
                    eVar.sendMessage(eVar.obtainMessage(3));
                } else if (i11 == 0) {
                    g10.h(new y5.a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                b6.m.h(num);
                y5.d.d.e(this, num.intValue(), this);
                this.a = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException e6) {
                e = e6;
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.a = 1;
            } catch (ActivityNotFoundException e11) {
                e = e11;
                if (extras.getBoolean("notify_manager", true)) {
                    com.google.android.gms.common.api.internal.h.g(this).h(new y5.a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String o10 = android.support.v4.media.a.o("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        o10 = o10.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", o10, e);
                }
                googleApiActivity.a = 1;
                finish();
            } catch (IntentSender.SendIntentException e12) {
                e = e12;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}
