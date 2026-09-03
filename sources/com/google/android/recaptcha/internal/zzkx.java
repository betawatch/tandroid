package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class zzkx implements zzlb {
    private final Context zza;

    public zzkx(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzlb
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzla.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzlb
    public final Object zza(Object... objArr) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = Build.VERSION.SDK_INT >= 33 ? this.zza.registerReceiver(null, intentFilter, 4) : this.zza.registerReceiver(null, intentFilter);
        if (registerReceiver == null) {
            throw new zzdm(7, 19, null);
        }
        int intExtra = registerReceiver.getIntExtra("health", -1);
        int intExtra2 = registerReceiver.getIntExtra("level", -1);
        int intExtra3 = registerReceiver.getIntExtra("plugged", -1);
        boolean booleanExtra = registerReceiver.getBooleanExtra("present", false);
        int intExtra4 = registerReceiver.getIntExtra("scale", -1);
        int intExtra5 = registerReceiver.getIntExtra("status", -1);
        String stringExtra = registerReceiver.getStringExtra("technology");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Integer.valueOf(intExtra3), Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra4), Integer.valueOf(intExtra5), stringExtra, Integer.valueOf(registerReceiver.getIntExtra("temperature", -1)), Integer.valueOf(registerReceiver.getIntExtra("voltage", -1))};
    }
}
