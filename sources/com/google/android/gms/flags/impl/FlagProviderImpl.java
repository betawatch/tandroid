package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import f7.t;
import i7.z6;
import j6.a;
import j6.b;
import p2.r;
import p6.e;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class FlagProviderImpl extends e {
    public boolean a;
    public SharedPreferences b;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.a = false;
    }

    @Override // p6.f
    public boolean getBooleanFlagValue(String str, boolean z10, int i10) {
        if (!this.a) {
            return z10;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z10);
        try {
            valueOf = (Boolean) t.b(new r(sharedPreferences, str, valueOf, 4));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.booleanValue();
    }

    @Override // p6.f
    public int getIntFlagValue(String str, int i10, int i11) {
        if (!this.a) {
            return i10;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i10);
        try {
            valueOf = (Integer) t.b(new r(sharedPreferences, str, valueOf, 5));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.intValue();
    }

    @Override // p6.f
    public long getLongFlagValue(String str, long j10, int i10) {
        if (!this.a) {
            return j10;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j10);
        try {
            valueOf = (Long) t.b(new r(sharedPreferences, str, valueOf, 6));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.longValue();
    }

    @Override // p6.f
    public String getStringFlagValue(String str, String str2, int i10) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) t.b(new r(this.b, str, str2, 7));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // p6.f
    public void init(a aVar) {
        Context context = (Context) b.K0(aVar);
        if (this.a) {
            return;
        }
        try {
            this.b = z6.a(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
