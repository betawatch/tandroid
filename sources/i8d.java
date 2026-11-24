// default package

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class i8d {
    public static final Object f = new Object();
    public static Context g;
    public static volatile Boolean h;
    public final wm9 a;
    public final String b;
    public final String c;
    public final Object d;
    public volatile r7d e = null;

    public i8d(wm9 wm9Var, String str, Object obj) {
        if (((Uri) wm9Var.b) == null) {
            u36.j("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.a = wm9Var;
        String valueOf = String.valueOf((String) wm9Var.c);
        this.c = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
        String valueOf2 = String.valueOf((String) wm9Var.d);
        this.b = str.length() != 0 ? valueOf2.concat(str) : new String(valueOf2);
        this.d = obj;
    }

    public static void b(Context context) {
        Context applicationContext;
        if (g == null) {
            synchronized (f) {
                if ((Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (g != context) {
                    h = null;
                }
                g = context;
            }
        }
    }

    public static Object c(iad iadVar) {
        try {
            return iadVar.zzp();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return iadVar.zzp();
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
            h = Boolean.valueOf(tse.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null) == 0);
        }
        return h.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        Object obj;
        String b;
        Object obj2 = null;
        if (g == null) {
            dq9.m("Must call PhenotypeFlag.init() first");
            return null;
        }
        if (e() ? ((Boolean) c(new ld3("gms:phenotype:phenotype_flag:debug_bypass_phenotype"))).booleanValue() : false) {
            String str = this.b;
            Log.w("PhenotypeFlag", str.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(str) : new String("Bypass reading Phenotype values for flag: "));
        } else if (((Uri) this.a.b) != null) {
            if (this.e == null) {
                ContentResolver contentResolver = g.getContentResolver();
                Uri uri = (Uri) this.a.b;
                ConcurrentHashMap concurrentHashMap = r7d.h;
                r7d r7dVar = (r7d) concurrentHashMap.get(uri);
                if (r7dVar == null) {
                    r7dVar = new r7d(contentResolver, uri);
                    r7d r7dVar2 = (r7d) concurrentHashMap.putIfAbsent(uri, r7dVar);
                    if (r7dVar2 == null) {
                        r7dVar.a.registerContentObserver(r7dVar.b, false, r7dVar.c);
                    } else {
                        r7dVar = r7dVar2;
                    }
                }
                this.e = r7dVar;
            }
            String str2 = (String) c(new xab(this, this.e, false, (byte) 12));
            if (str2 != null) {
                obj = d(str2);
                if (obj == null) {
                    return obj;
                }
                String str3 = this.c;
                if (e()) {
                    try {
                        b = rjf.b(g.getContentResolver(), str3);
                    } catch (SecurityException unused) {
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            b = rjf.b(g.getContentResolver(), str3);
                        } finally {
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    }
                    if (b != null) {
                        obj2 = d(b);
                    }
                }
                return obj2 != null ? obj2 : this.d;
            }
        }
        obj = null;
        if (obj == null) {
        }
    }

    public abstract Object d(String str);
}
