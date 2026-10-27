package com.google.android.gms.flags.impl;

import a8.ec;
import a8.jf;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import d5.u;
import e7.e;
import y6.a;
import y6.b;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class FlagProviderImpl extends e {
    public boolean a;
    public SharedPreferences b;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.a = false;
    }

    @Override // e7.f
    public boolean getBooleanFlagValue(String str, boolean z10, int i10) {
        if (!this.a) {
            return z10;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z10);
        try {
            valueOf = (Boolean) jf.a(new u(sharedPreferences, str, valueOf, 4));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.booleanValue();
    }

    @Override // e7.f
    public int getIntFlagValue(String str, int i10, int i11) {
        if (!this.a) {
            return i10;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i10);
        try {
            valueOf = (Integer) jf.a(new u(sharedPreferences, str, valueOf, 5));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.intValue();
    }

    @Override // e7.f
    public long getLongFlagValue(String str, long j10, int i10) {
        if (!this.a) {
            return j10;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j10);
        try {
            valueOf = (Long) jf.a(new u(sharedPreferences, str, valueOf, 6));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.longValue();
    }

    @Override // e7.f
    public String getStringFlagValue(String str, String str2, int i10) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) jf.a(new u(this.b, str, str2, 7));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // e7.f
    public void init(a aVar) {
        Context context = (Context) b.L0(aVar);
        if (this.a) {
            return;
        }
        try {
            this.b = ec.a(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
