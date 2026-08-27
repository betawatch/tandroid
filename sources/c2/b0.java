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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b0 {
    public static e c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public b0(Context context) {
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

    public static b0 d(Context context) {
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
                b0 b0Var = new b0(context);
                arrayList.add(new WeakReference(b0Var));
                return b0Var;
            }
            b0 b0Var2 = (b0) ((WeakReference) arrayList.get(size)).get();
            if (b0Var2 == null) {
                arrayList.remove(size);
            } else if (b0Var2.a == context) {
                return b0Var2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        e eVar = c;
        if (eVar == null) {
            return null;
        }
        a5.n nVar = eVar.C;
        if (nVar != null) {
            android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) nVar.b;
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

    public static z f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        e0 e0Var = c().u;
        return e0Var == null || (bundle = e0Var.e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static void i(e0 e0Var) {
        b();
        e c10 = c();
        e0 e0Var2 = c10.u;
        b bVar = c10.a;
        c10.u = e0Var;
        if (c10.f()) {
            if (c10.r == null) {
                l lVar = new l(c10.h, new ae.b(c10, 4));
                c10.r = lVar;
                c10.a(lVar, true);
                c10.k();
                z0 z0Var = c10.c;
                ((Handler) z0Var.d).post((a8.b) z0Var.h);
            }
            if ((e0Var2 != null && e0Var2.d) != e0Var.d) {
                l lVar2 = c10.r;
                lVar2.h = c10.A;
                if (!lVar2.b) {
                    lVar2.b = true;
                    ((androidx.mediarouter.app.c) lVar2.e).sendEmptyMessage(2);
                }
            }
        } else {
            l lVar3 = c10.r;
            if (lVar3 != null) {
                y d = c10.d(lVar3);
                if (d != null) {
                    b();
                    lVar3.f = null;
                    lVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.l.remove(d);
                }
                c10.r = null;
                z0 z0Var2 = c10.c;
                ((Handler) z0Var2.d).post((a8.b) z0Var2.h);
            }
        }
        bVar.b(769, e0Var);
    }

    public static void j(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        e c10 = c();
        z c11 = c10.c();
        if (c10.e() != c11) {
            c10.i(c11, i10);
        }
    }

    public final void a(u uVar, v vVar, int i10) {
        w wVar;
        boolean z10;
        u uVar2;
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (vVar == null) {
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
            } else if (((w) arrayList.get(i12)).b == vVar) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            wVar = new w(this, vVar);
            arrayList.add(wVar);
        } else {
            wVar = (w) arrayList.get(i12);
        }
        boolean z11 = true;
        if (i10 != wVar.d) {
            wVar.d = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        wVar.e = elapsedRealtime;
        u uVar3 = wVar.c;
        uVar3.a();
        uVar.a();
        if (uVar3.b.containsAll(uVar.b)) {
            z11 = z10;
        } else {
            u uVar4 = wVar.c;
            if (uVar4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            uVar4.a();
            ArrayList<String> arrayList2 = !uVar4.b.isEmpty() ? new ArrayList<>(uVar4.b) : null;
            ArrayList c10 = uVar.c();
            if (!c10.isEmpty()) {
                int size2 = c10.size();
                while (i11 < size2) {
                    Object obj = c10.get(i11);
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
                uVar2 = u.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                uVar2 = new u(bundle, arrayList2);
            }
            wVar.c = uVar2;
        }
        if (z11) {
            c().k();
        }
    }

    public final void h(v vVar) {
        if (vVar == null) {
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
            } else if (((w) arrayList.get(i10)).b == vVar) {
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
