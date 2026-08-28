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
import c2.u0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int b = 0;
    public int a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.h g10 = com.google.android.gms.common.api.internal.h.g(this);
                if (i10 == -1) {
                    u0 u0Var = g10.x;
                    u0Var.sendMessage(u0Var.obtainMessage(3));
                } else if (i10 == 0) {
                    g10.h(new u5.a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i9 == 2) {
            this.a = 0;
            setResult(i10, intent);
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
                x5.l.h(num);
                u5.d.d.e(this, num.intValue(), this);
                this.a = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException e10) {
                e = e10;
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.a = 1;
            } catch (ActivityNotFoundException e12) {
                e = e12;
                if (extras.getBoolean("notify_manager", true)) {
                    com.google.android.gms.common.api.internal.h.g(this).h(new u5.a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String o6 = aa.d.o("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        o6 = o6.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", o6, e);
                }
                googleApiActivity.a = 1;
                finish();
            } catch (IntentSender.SendIntentException e13) {
                e = e13;
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
