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
import com.google.android.gms.internal.cast.y;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int b = 0;
    public int a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.g e10 = com.google.android.gms.common.api.internal.g.e(this);
                if (i10 == -1) {
                    y yVar = e10.y;
                    yVar.sendMessage(yVar.obtainMessage(3));
                } else if (i10 == 0) {
                    e10.h(new n6.a(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i7 == 2) {
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
        if (this.a == 1) {
            return;
        }
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
            q6.m.g(num);
            n6.d.e.e(this, num.intValue(), this);
            this.a = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.a = 1;
            } catch (ActivityNotFoundException e10) {
                e = e10;
                if (extras.getBoolean("notify_manager", true)) {
                    com.google.android.gms.common.api.internal.g.e(this).h(new n6.a(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    String n10 = f1.n("Activity not found while launching ", obj, ".", new StringBuilder(obj.length() + 36));
                    if (Build.FINGERPRINT.contains("generic")) {
                        n10 = n10.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", n10, e);
                }
                googleApiActivity.a = 1;
                finish();
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e12) {
            e = e12;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e13) {
            e = e13;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}
