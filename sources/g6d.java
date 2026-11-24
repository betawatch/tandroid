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
public abstract class g6d {
    public static final Object f = new Object();
    public static Context g;
    public static volatile Boolean h;
    public final vk9 a;
    public final String b;
    public final String c;
    public final Object d;
    public volatile p5d e = null;

    public g6d(vk9 vk9Var, String str, Object obj) {
        if (((Uri) vk9Var.b) == null) {
            w26.j("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.a = vk9Var;
        String valueOf = String.valueOf((String) vk9Var.c);
        this.c = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
        String valueOf2 = String.valueOf((String) vk9Var.d);
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

    public static Object c(g8d g8dVar) {
        try {
            return g8dVar.zzp();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return g8dVar.zzp();
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
            h = Boolean.valueOf(qqe.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null) == 0);
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
            sc8.j("Must call PhenotypeFlag.init() first");
            return null;
        }
        if (e() ? ((Boolean) c(new ss2("gms:phenotype:phenotype_flag:debug_bypass_phenotype"))).booleanValue() : false) {
            String str = this.b;
            Log.w("PhenotypeFlag", str.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(str) : new String("Bypass reading Phenotype values for flag: "));
        } else if (((Uri) this.a.b) != null) {
            if (this.e == null) {
                ContentResolver contentResolver = g.getContentResolver();
                Uri uri = (Uri) this.a.b;
                ConcurrentHashMap concurrentHashMap = p5d.h;
                p5d p5dVar = (p5d) concurrentHashMap.get(uri);
                if (p5dVar == null) {
                    p5dVar = new p5d(contentResolver, uri);
                    p5d p5dVar2 = (p5d) concurrentHashMap.putIfAbsent(uri, p5dVar);
                    if (p5dVar2 == null) {
                        p5dVar.a.registerContentObserver(p5dVar.b, false, p5dVar.c);
                    } else {
                        p5dVar = p5dVar2;
                    }
                }
                this.e = p5dVar;
            }
            String str2 = (String) c(new v8b(this, this.e, false, (byte) 12));
            if (str2 != null) {
                obj = d(str2);
                if (obj == null) {
                    return obj;
                }
                String str3 = this.c;
                if (e()) {
                    try {
                        b = qhf.b(g.getContentResolver(), str3);
                    } catch (SecurityException unused) {
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            b = qhf.b(g.getContentResolver(), str3);
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
