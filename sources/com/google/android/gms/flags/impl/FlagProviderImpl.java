package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import c5.u;
import d7.e;
import v7.y6;
import w7.g0;
import x6.a;
import x6.b;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class FlagProviderImpl extends e {
    public boolean a;
    public SharedPreferences b;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.a = false;
    }

    @Override // d7.f
    public boolean getBooleanFlagValue(String str, boolean z10, int i10) {
        if (!this.a) {
            return z10;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z10);
        try {
            valueOf = (Boolean) g0.a(new u(sharedPreferences, str, valueOf, 4));
        } catch (Exception e7) {
            String valueOf2 = String.valueOf(e7.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.booleanValue();
    }

    @Override // d7.f
    public int getIntFlagValue(String str, int i10, int i11) {
        if (!this.a) {
            return i10;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i10);
        try {
            valueOf = (Integer) g0.a(new u(sharedPreferences, str, valueOf, 5));
        } catch (Exception e7) {
            String valueOf2 = String.valueOf(e7.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.intValue();
    }

    @Override // d7.f
    public long getLongFlagValue(String str, long j3, int i10) {
        if (!this.a) {
            return j3;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j3);
        try {
            valueOf = (Long) g0.a(new u(sharedPreferences, str, valueOf, 6));
        } catch (Exception e7) {
            String valueOf2 = String.valueOf(e7.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.longValue();
    }

    @Override // d7.f
    public String getStringFlagValue(String str, String str2, int i10) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) g0.a(new u(this.b, str, str2, 7));
        } catch (Exception e7) {
            String valueOf = String.valueOf(e7.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // d7.f
    public void init(a aVar) {
        Context context = (Context) b.M0(aVar);
        if (this.a) {
            return;
        }
        try {
            this.b = y6.a(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e7) {
            String valueOf = String.valueOf(e7.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
