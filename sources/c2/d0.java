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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d0 {
    public static e c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public d0(Context context) {
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

    public static d0 d(Context context) {
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
                d0 d0Var = new d0(context);
                arrayList.add(new WeakReference(d0Var));
                return d0Var;
            }
            d0 d0Var2 = (d0) ((WeakReference) arrayList.get(size)).get();
            if (d0Var2 == null) {
                arrayList.remove(size);
            } else if (d0Var2.a == context) {
                return d0Var2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        e eVar = c;
        if (eVar == null) {
            return null;
        }
        af.d dVar = eVar.C;
        if (dVar != null) {
            android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) dVar.b;
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

    public static b0 f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        g0 g0Var = c().u;
        return g0Var == null || (bundle = g0Var.e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void i(g0 g0Var) {
        b();
        e c3 = c();
        g0 g0Var2 = c3.u;
        b bVar = c3.a;
        c3.u = g0Var;
        if (c3.f()) {
            if (c3.r == null) {
                l lVar = new l(c3.h, new bb.b(c3, 4));
                c3.r = lVar;
                c3.a(lVar, true);
                c3.k();
                a1 a1Var = c3.c;
                ((Handler) a1Var.d).post((androidx.activity.i) a1Var.h);
            }
            if ((g0Var2 != null && g0Var2.d) != g0Var.d) {
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
                a0 d = c3.d(lVar3);
                if (d != null) {
                    b();
                    lVar3.f = null;
                    lVar3.h(null);
                    c3.m(d, null);
                    bVar.b(514, d);
                    c3.l.remove(d);
                }
                c3.r = null;
                a1 a1Var2 = c3.c;
                ((Handler) a1Var2.d).post((androidx.activity.i) a1Var2.h);
            }
        }
        bVar.b(769, g0Var);
    }

    public static void j(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        e c3 = c();
        b0 c10 = c3.c();
        if (c3.e() != c10) {
            c3.i(c10, i10);
        }
    }

    public final void a(w wVar, x xVar, int i10) {
        y yVar;
        boolean z4;
        w wVar2;
        if (wVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (xVar == null) {
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
            } else if (((y) arrayList.get(i12)).b == xVar) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            yVar = new y(this, xVar);
            arrayList.add(yVar);
        } else {
            yVar = (y) arrayList.get(i12);
        }
        boolean z10 = true;
        if (i10 != yVar.d) {
            yVar.d = i10;
            z4 = true;
        } else {
            z4 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i10 & 1) != 0) {
            z4 = true;
        }
        yVar.e = elapsedRealtime;
        w wVar3 = yVar.c;
        wVar3.a();
        wVar.a();
        if (wVar3.b.containsAll(wVar.b)) {
            z10 = z4;
        } else {
            w wVar4 = yVar.c;
            if (wVar4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            wVar4.a();
            ArrayList<String> arrayList2 = !wVar4.b.isEmpty() ? new ArrayList<>(wVar4.b) : null;
            ArrayList c3 = wVar.c();
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
                wVar2 = w.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                wVar2 = new w(bundle, arrayList2);
            }
            yVar.c = wVar2;
        }
        if (z10) {
            c().k();
        }
    }

    public final void h(x xVar) {
        if (xVar == null) {
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
            } else if (((y) arrayList.get(i10)).b == xVar) {
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
