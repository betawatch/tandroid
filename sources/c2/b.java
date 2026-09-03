package c2;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ e c;

    public b(e eVar) {
        this.c = eVar;
    }

    public static void a(x xVar, int i10, Object obj, int i11) {
        c0 c0Var = xVar.a;
        w wVar = xVar.b;
        int i12 = 65280 & i10;
        if (i12 != 256) {
            if (i12 != 512) {
                if (i12 == 768 && i10 == 769) {
                    wVar.l((f0) obj);
                }
                return;
            }
            switch (i10) {
                case 513:
                    wVar.a();
                    break;
                case 514:
                    wVar.c();
                    break;
                case 515:
                    wVar.b();
                    break;
            }
        }
        a0 a0Var = (i10 == 264 || i10 == 262) ? (a0) ((q0.b) obj).b : (a0) obj;
        a0 a0Var2 = (i10 == 264 || i10 == 262) ? (a0) ((q0.b) obj).a : null;
        if (a0Var != null) {
            boolean z4 = true;
            if ((xVar.d & 2) == 0 && !a0Var.h(xVar.c)) {
                f0 f0Var = c0.c().u;
                z4 = ((f0Var == null ? false : f0Var.d) && a0Var.d() && i10 == 262 && i11 == 3 && a0Var2 != null) ? true ^ a0Var2.d() : false;
            }
            if (z4) {
                switch (i10) {
                    case 257:
                        wVar.d(a0Var);
                        break;
                    case 258:
                        wVar.f(a0Var);
                        break;
                    case 259:
                        wVar.e(a0Var);
                        break;
                    case 260:
                        wVar.k(a0Var);
                        break;
                    case 261:
                        wVar.getClass();
                        break;
                    case 262:
                        wVar.h(c0Var, a0Var, i11);
                        break;
                    case 263:
                        wVar.j(c0Var, a0Var, i11);
                        break;
                    case 264:
                        wVar.h(c0Var, a0Var, i11);
                        break;
                }
            }
        }
    }

    public final void b(int i10, Object obj) {
        obtainMessage(i10, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int q10;
        ArrayList arrayList = this.a;
        e eVar = this.c;
        ArrayList arrayList2 = eVar.i;
        p0 p0Var = eVar.s;
        int i10 = message.what;
        Object obj = message.obj;
        int i11 = message.arg1;
        if (i10 == 259 && eVar.e().c.equals(((a0) obj).c)) {
            eVar.o(true);
        }
        int i12 = 0;
        ArrayList arrayList3 = this.b;
        if (i10 == 262) {
            a0 a0Var = (a0) ((q0.b) obj).b;
            p0Var.x(a0Var);
            if (eVar.v != null && a0Var.d()) {
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    p0Var.w((a0) obj2);
                }
                arrayList3.clear();
            }
        } else if (i10 != 264) {
            switch (i10) {
                case 257:
                    p0Var.v((a0) obj);
                    break;
                case 258:
                    p0Var.w((a0) obj);
                    break;
                case 259:
                    a0 a0Var2 = (a0) obj;
                    p0Var.getClass();
                    if (a0Var2.c() != p0Var && (q10 = p0Var.q(a0Var2)) >= 0) {
                        p0Var.C((o0) p0Var.E.get(q10));
                        break;
                    }
                    break;
            }
        } else {
            a0 a0Var3 = (a0) ((q0.b) obj).b;
            arrayList3.add(a0Var3);
            p0Var.v(a0Var3);
            p0Var.x(a0Var3);
        }
        try {
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    int size3 = arrayList.size();
                    while (i12 < size3) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        a((x) obj3, i10, obj, i11);
                    }
                    arrayList.clear();
                    return;
                }
                c0 c0Var = (c0) ((WeakReference) arrayList2.get(size2)).get();
                if (c0Var == null) {
                    arrayList2.remove(size2);
                } else {
                    arrayList.addAll(c0Var.b);
                }
            }
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }
}
