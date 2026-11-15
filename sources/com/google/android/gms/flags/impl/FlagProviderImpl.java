package com.google.android.gms.flags.impl;

import a7.a;
import a7.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import c8.ac;
import c8.z;
import f5.r;
import g7.e;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class FlagProviderImpl extends e {
    public boolean a;
    public SharedPreferences b;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.a = false;
    }

    @Override // g7.f
    public boolean getBooleanFlagValue(String str, boolean z10, int i7) {
        if (!this.a) {
            return z10;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z10);
        try {
            valueOf = (Boolean) ac.a(new r(sharedPreferences, str, valueOf, 4));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.booleanValue();
    }

    @Override // g7.f
    public int getIntFlagValue(String str, int i7, int i10) {
        if (!this.a) {
            return i7;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i7);
        try {
            valueOf = (Integer) ac.a(new r(sharedPreferences, str, valueOf, 5));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.intValue();
    }

    @Override // g7.f
    public long getLongFlagValue(String str, long j3, int i7) {
        if (!this.a) {
            return j3;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j3);
        try {
            valueOf = (Long) ac.a(new r(sharedPreferences, str, valueOf, 6));
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.longValue();
    }

    @Override // g7.f
    public String getStringFlagValue(String str, String str2, int i7) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) ac.a(new r(this.b, str, str2, 7));
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // g7.f
    public void init(a aVar) {
        Context context = (Context) b.n1(aVar);
        if (this.a) {
            return;
        }
        try {
            this.b = z.a(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
