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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        androidx.biometric.e eVar2 = eVar.C;
        if (eVar2 != null) {
            android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) eVar2.b;
            if (c0Var != null) {
                return c0Var.a.b;
            }
            return null;
        }
        android.support.v4.media.session.c0 c0Var2 = eVar.D;
        if (c0Var2 != null) {
            return c0Var2.a.b;
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
        e c3 = c();
        f0 f0Var2 = c3.u;
        b bVar = c3.a;
        c3.u = f0Var;
        if (c3.f()) {
            if (c3.r == null) {
                l lVar = new l(c3.h, new ja.c(c3));
                c3.r = lVar;
                c3.a(lVar, true);
                c3.k();
                z0 z0Var = c3.c;
                ((Handler) z0Var.d).post((androidx.activity.i) z0Var.h);
            }
            if ((f0Var2 != null && f0Var2.d) != f0Var.d) {
                l lVar2 = c3.r;
                lVar2.h = c3.A;
                if (!lVar2.b) {
                    lVar2.b = true;
                    ((androidx.mediarouter.app.d) lVar2.e).sendEmptyMessage(2);
                }
            }
        } else {
            l lVar3 = c3.r;
            if (lVar3 != null) {
                z d = c3.d(lVar3);
                if (d != null) {
                    b();
                    lVar3.f = null;
                    lVar3.h(null);
                    c3.m(d, null);
                    bVar.b(514, d);
                    c3.l.remove(d);
                }
                c3.r = null;
                z0 z0Var2 = c3.c;
                ((Handler) z0Var2.d).post((androidx.activity.i) z0Var2.h);
            }
        }
        bVar.b(769, f0Var);
    }

    public static void j(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        e c3 = c();
        a0 c10 = c3.c();
        if (c3.e() != c10) {
            c3.i(c10, i10);
        }
    }

    public final void a(v vVar, w wVar, int i10) {
        x xVar;
        boolean z4;
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
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((x) arrayList.get(i12)).b == wVar) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            xVar = new x(this, wVar);
            arrayList.add(xVar);
        } else {
            xVar = (x) arrayList.get(i12);
        }
        boolean z10 = true;
        if (i10 != xVar.d) {
            xVar.d = i10;
            z4 = true;
        } else {
            z4 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i10 & 1) != 0) {
            z4 = true;
        }
        xVar.e = elapsedRealtime;
        v vVar3 = xVar.c;
        vVar3.a();
        vVar.a();
        if (vVar3.b.containsAll(vVar.b)) {
            z10 = z4;
        } else {
            v vVar4 = xVar.c;
            if (vVar4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            vVar4.a();
            ArrayList<String> arrayList2 = !vVar4.b.isEmpty() ? new ArrayList<>(vVar4.b) : null;
            ArrayList c3 = vVar.c();
            if (!c3.isEmpty()) {
                int size2 = c3.size();
                while (i11 < size2) {
                    Object obj = c3.get(i11);
                    i11++;
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
        if (z10) {
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
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((x) arrayList.get(i10)).b == wVar) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            arrayList.remove(i10);
            c().k();
        }
    }
}
