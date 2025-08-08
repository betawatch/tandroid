package com.google.android.gms.cast.internal;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;

/* loaded from: classes.dex */
public class Logger {
    protected final String zza;
    private final boolean zzb;
    private boolean zzc;
    private final String zzd;

    public Logger(String str) {
        this(str, null);
    }

    public void d(String str, Object... objArr) {
        if (zzc()) {
            Log.d(this.zza, zza(str, objArr));
        }
    }

    public void e(String str, Object... objArr) {
        Log.e(this.zza, zza(str, objArr));
    }

    public void i(String str, Object... objArr) {
        Log.i(this.zza, zza(str, objArr));
    }

    public void w(String str, Object... objArr) {
        Log.w(this.zza, zza(str, objArr));
    }

    protected final String zza(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.zzd)) {
            return str;
        }
        String str2 = this.zzd;
        return String.valueOf(str2).concat(String.valueOf(str));
    }

    public final boolean zzc() {
        if (Build.TYPE.equals("user")) {
            return false;
        }
        if (this.zzc) {
            return true;
        }
        return this.zzb && Log.isLoggable(this.zza, 3);
    }

    protected Logger(String str, String str2) {
        Preconditions.checkNotEmpty(str, "The log tag cannot be null or empty.");
        this.zza = str;
        this.zzb = str.length() <= 23;
        this.zzc = false;
        this.zzd = TextUtils.isEmpty(str2) ? null : String.format("[%s] ", str2);
    }

    public void e(Throwable th, String str, Object... objArr) {
        Log.e(this.zza, zza(str, objArr), th);
    }

    public void w(Throwable th, String str, Object... objArr) {
        Log.w(this.zza, zza(str, objArr), th);
    }

    public void d(Throwable th, String str, Object... objArr) {
        if (zzc()) {
            Log.d(this.zza, zza(str, objArr), th);
        }
    }
}
