package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import j7.h5;
import k7.m7;
import l6.a;
import l6.b;
import p2.t;
import r6.e;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class FlagProviderImpl extends e {
    public boolean a;
    public SharedPreferences b;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.a = false;
    }

    @Override // r6.f
    public boolean getBooleanFlagValue(String str, boolean z4, int i10) {
        if (!this.a) {
            return z4;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z4);
        try {
            valueOf = (Boolean) h5.a(new t(sharedPreferences, str, valueOf, 4));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.booleanValue();
    }

    @Override // r6.f
    public int getIntFlagValue(String str, int i10, int i11) {
        if (!this.a) {
            return i10;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i10);
        try {
            valueOf = (Integer) h5.a(new t(sharedPreferences, str, valueOf, 5));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.intValue();
    }

    @Override // r6.f
    public long getLongFlagValue(String str, long j10, int i10) {
        if (!this.a) {
            return j10;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j10);
        try {
            valueOf = (Long) h5.a(new t(sharedPreferences, str, valueOf, 6));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
        }
        return valueOf.longValue();
    }

    @Override // r6.f
    public String getStringFlagValue(String str, String str2, int i10) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) h5.a(new t(this.b, str, str2, 7));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // r6.f
    public void init(a aVar) {
        Context context = (Context) b.K0(aVar);
        if (this.a) {
            return;
        }
        try {
            this.b = m7.a(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
