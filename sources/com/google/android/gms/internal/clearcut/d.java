package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class d {
    public static final Object f = new Object();
    public static Context g;
    public static volatile Boolean h;
    public final i a;
    public final String b;
    public final String c;
    public final Object d;
    public volatile b e = null;

    public d(i iVar, String str, Object obj) {
        iVar.getClass();
        if (iVar.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = iVar;
        String valueOf = String.valueOf(iVar.b);
        this.c = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
        String valueOf2 = String.valueOf(iVar.c);
        this.b = str.length() != 0 ? valueOf2.concat(str) : new String(valueOf2);
        this.d = obj;
    }

    public static void b(Context context) {
        Context applicationContext;
        if (g == null) {
            synchronized (f) {
                try {
                    if ((Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                        context = applicationContext;
                    }
                    if (g != context) {
                        h = null;
                    }
                    g = context;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Object c(h hVar) {
        try {
            return hVar.zzp();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return hVar.zzp();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public static boolean e() {
        if (h == null) {
            Context context = g;
            if (context == null) {
                return false;
            }
            h = Boolean.valueOf(f0.e.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null) == 0);
        }
        return h.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        String b10;
        Object d;
        if (g == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        this.a.getClass();
        Object obj = null;
        if (e() ? ((Boolean) c(new e("gms:phenotype:phenotype_flag:debug_bypass_phenotype"))).booleanValue() : false) {
            String valueOf = String.valueOf(this.b);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else if (this.a.a != null) {
            if (this.e == null) {
                ContentResolver contentResolver = g.getContentResolver();
                Uri uri = this.a.a;
                ConcurrentHashMap concurrentHashMap = b.h;
                b bVar = (b) concurrentHashMap.get(uri);
                if (bVar == null) {
                    bVar = new b(contentResolver, uri);
                    b bVar2 = (b) concurrentHashMap.putIfAbsent(uri, bVar);
                    if (bVar2 == null) {
                        bVar.a.registerContentObserver(bVar.b, false, bVar.c);
                    } else {
                        bVar = bVar2;
                    }
                }
                this.e = bVar;
            }
            String str = (String) c(new we.b(this, this.e, false, 16));
            if (str != null) {
                obj = d(str);
            }
        }
        if (obj != null) {
            return obj;
        }
        String str2 = this.c;
        this.a.getClass();
        if (e()) {
            try {
                b10 = g2.b(g.getContentResolver(), str2);
            } catch (SecurityException unused) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    b10 = g2.b(g.getContentResolver(), str2);
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            if (b10 != null) {
                d = d(b10);
                return d == null ? d : this.d;
            }
        }
        d = null;
        if (d == null) {
        }
    }

    public abstract Object d(String str);
}
