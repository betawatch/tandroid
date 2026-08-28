package c2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c0 {
    public static e c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public c0(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static e c() {
        e eVar = c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static c0 d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        b();
        if (c == null) {
            c = new e(context.getApplicationContext());
        }
        ArrayList arrayList = c.i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                c0 c0Var = new c0(context);
                arrayList.add(new WeakReference(c0Var));
                return c0Var;
            }
            c0 c0Var2 = (c0) ((WeakReference) arrayList.get(size)).get();
            if (c0Var2 == null) {
                arrayList.remove(size);
            } else if (c0Var2.a == context) {
                return c0Var2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        e eVar = c;
        if (eVar == null) {
            return null;
        }
        a5.m mVar = eVar.C;
        if (mVar != null) {
            android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) mVar.b;
            if (d0Var != null) {
                return d0Var.a.b;
            }
            return null;
        }
        android.support.v4.media.session.d0 d0Var2 = eVar.D;
        if (d0Var2 != null) {
            return d0Var2.a.b;
        }
        return null;
    }

    public static a0 f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        f0 f0Var = c().u;
        return f0Var == null || (bundle = f0Var.e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void i(f0 f0Var) {
        b();
        e c10 = c();
        f0 f0Var2 = c10.u;
        b bVar = c10.a;
        c10.u = f0Var;
        if (c10.f()) {
            if (c10.r == null) {
                l lVar = new l(c10.h, new fa.c(c10, 6));
                c10.r = lVar;
                c10.a(lVar, true);
                c10.k();
                a1 a1Var = c10.c;
                ((Handler) a1Var.d).post((androidx.activity.i) a1Var.h);
            }
            if ((f0Var2 != null && f0Var2.d) != f0Var.d) {
                l lVar2 = c10.r;
                lVar2.h = c10.A;
                if (!lVar2.b) {
                    lVar2.b = true;
                    ((androidx.mediarouter.app.d) lVar2.e).sendEmptyMessage(2);
                }
            }
        } else {
            l lVar3 = c10.r;
            if (lVar3 != null) {
                z d = c10.d(lVar3);
                if (d != null) {
                    b();
                    lVar3.f = null;
                    lVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.l.remove(d);
                }
                c10.r = null;
                a1 a1Var2 = c10.c;
                ((Handler) a1Var2.d).post((androidx.activity.i) a1Var2.h);
            }
        }
        bVar.b(769, f0Var);
    }

    public static void j(int i9) {
        if (i9 < 0 || i9 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        e c10 = c();
        a0 c11 = c10.c();
        if (c10.e() != c11) {
            c10.i(c11, i9);
        }
    }

    public final void a(v vVar, w wVar, int i9) {
        x xVar;
        boolean z10;
        v vVar2;
        if (vVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (wVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((x) arrayList.get(i11)).b == wVar) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            xVar = new x(this, wVar);
            arrayList.add(xVar);
        } else {
            xVar = (x) arrayList.get(i11);
        }
        boolean z11 = true;
        if (i9 != xVar.d) {
            xVar.d = i9;
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i9 & 1) != 0) {
            z10 = true;
        }
        xVar.e = elapsedRealtime;
        v vVar3 = xVar.c;
        vVar3.a();
        vVar.a();
        if (vVar3.b.containsAll(vVar.b)) {
            z11 = z10;
        } else {
            v vVar4 = xVar.c;
            if (vVar4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            vVar4.a();
            ArrayList<String> arrayList2 = !vVar4.b.isEmpty() ? new ArrayList<>(vVar4.b) : null;
            ArrayList c10 = vVar.c();
            if (!c10.isEmpty()) {
                int size2 = c10.size();
                while (i10 < size2) {
                    Object obj = c10.get(i10);
                    i10++;
                    String str = (String) obj;
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                vVar2 = v.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                vVar2 = new v(bundle, arrayList2);
            }
            xVar.c = vVar2;
        }
        if (z11) {
            c().k();
        }
    }

    public final void h(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((x) arrayList.get(i9)).b == wVar) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            arrayList.remove(i9);
            c().k();
        }
    }
}
