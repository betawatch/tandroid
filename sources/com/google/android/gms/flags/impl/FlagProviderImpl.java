package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class FlagProviderImpl extends pnd {
    public boolean a;
    public SharedPreferences b;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.a = false;
    }

    @Override // btd
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) c1f.a(new p4d(sharedPreferences, str, valueOf, (byte) 0));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.booleanValue();
    }

    @Override // btd
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) c1f.a(new p4d(sharedPreferences, str, valueOf, (byte) 4));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.intValue();
    }

    @Override // btd
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) c1f.a(new p4d(sharedPreferences, str, valueOf, (byte) 5));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.longValue();
    }

    @Override // btd
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) c1f.a(new p4d(this.b, str, str2, (byte) 6));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // btd
    public void init(yi5 yi5Var) {
        Context context = (Context) bo7.U(yi5Var);
        if (this.a) {
            return;
        }
        try {
            this.b = r1f.a(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
