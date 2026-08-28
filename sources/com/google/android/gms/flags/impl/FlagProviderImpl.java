package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import g7.j0;
import g7.r8;
import h6.a;
import h6.b;
import n2.s;
import n6.e;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class FlagProviderImpl extends e {
    public boolean a;
    public SharedPreferences b;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.a = false;
    }

    @Override // n6.f
    public boolean getBooleanFlagValue(String str, boolean z10, int i9) {
        if (!this.a) {
            return z10;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z10);
        try {
            valueOf = (Boolean) r8.a(new s(sharedPreferences, str, valueOf, 4));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.booleanValue();
    }

    @Override // n6.f
    public int getIntFlagValue(String str, int i9, int i10) {
        if (!this.a) {
            return i9;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i9);
        try {
            valueOf = (Integer) r8.a(new s(sharedPreferences, str, valueOf, 5));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.intValue();
    }

    @Override // n6.f
    public long getLongFlagValue(String str, long j10, int i9) {
        if (!this.a) {
            return j10;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j10);
        try {
            valueOf = (Long) r8.a(new s(sharedPreferences, str, valueOf, 6));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.longValue();
    }

    @Override // n6.f
    public String getStringFlagValue(String str, String str2, int i9) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) r8.a(new s(this.b, str, str2, 7));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // n6.f
    public void init(a aVar) {
        Context context = (Context) b.K0(aVar);
        if (this.a) {
            return;
        }
        try {
            this.b = j0.a(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
