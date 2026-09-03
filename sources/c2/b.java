package c2;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ e c;

    public b(e eVar) {
        this.c = eVar;
    }

    public static void a(y yVar, int i10, Object obj, int i11) {
        d0 d0Var = yVar.a;
        x xVar = yVar.b;
        int i12 = 65280 & i10;
        if (i12 != 256) {
            if (i12 != 512) {
                if (i12 == 768 && i10 == 769) {
                    xVar.l((g0) obj);
                }
                return;
            }
            switch (i10) {
                case 513:
                    xVar.a();
                    break;
                case 514:
                    xVar.c();
                    break;
                case 515:
                    xVar.b();
                    break;
            }
        }
        b0 b0Var = (i10 == 264 || i10 == 262) ? (b0) ((q0.b) obj).b : (b0) obj;
        b0 b0Var2 = (i10 == 264 || i10 == 262) ? (b0) ((q0.b) obj).a : null;
        if (b0Var != null) {
            boolean z4 = true;
            if ((yVar.d & 2) == 0 && !b0Var.h(yVar.c)) {
                g0 g0Var = d0.c().u;
                z4 = ((g0Var == null ? false : g0Var.d) && b0Var.d() && i10 == 262 && i11 == 3 && b0Var2 != null) ? true ^ b0Var2.d() : false;
            }
            if (z4) {
                switch (i10) {
                    case 257:
                        xVar.d(b0Var);
                        break;
                    case 258:
                        xVar.f(b0Var);
                        break;
                    case 259:
                        xVar.e(b0Var);
                        break;
                    case 260:
                        xVar.k(b0Var);
                        break;
                    case 261:
                        xVar.getClass();
                        break;
                    case 262:
                        xVar.h(d0Var, b0Var, i11);
                        break;
                    case 263:
                        xVar.j(d0Var, b0Var, i11);
                        break;
                    case 264:
                        xVar.h(d0Var, b0Var, i11);
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
        q0 q0Var = eVar.s;
        int i10 = message.what;
        Object obj = message.obj;
        int i11 = message.arg1;
        if (i10 == 259 && eVar.e().c.equals(((b0) obj).c)) {
            eVar.o(true);
        }
        int i12 = 0;
        ArrayList arrayList3 = this.b;
        if (i10 == 262) {
            b0 b0Var = (b0) ((q0.b) obj).b;
            q0Var.x(b0Var);
            if (eVar.v != null && b0Var.d()) {
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    q0Var.w((b0) obj2);
                }
                arrayList3.clear();
            }
        } else if (i10 != 264) {
            switch (i10) {
                case 257:
                    q0Var.v((b0) obj);
                    break;
                case 258:
                    q0Var.w((b0) obj);
                    break;
                case 259:
                    b0 b0Var2 = (b0) obj;
                    q0Var.getClass();
                    if (b0Var2.c() != q0Var && (q10 = q0Var.q(b0Var2)) >= 0) {
                        q0Var.C((p0) q0Var.E.get(q10));
                        break;
                    }
                    break;
            }
        } else {
            b0 b0Var3 = (b0) ((q0.b) obj).b;
            arrayList3.add(b0Var3);
            q0Var.v(b0Var3);
            q0Var.x(b0Var3);
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
                        a((y) obj3, i10, obj, i11);
                    }
                    arrayList.clear();
                    return;
                }
                d0 d0Var = (d0) ((WeakReference) arrayList2.get(size2)).get();
                if (d0Var == null) {
                    arrayList2.remove(size2);
                } else {
                    arrayList.addAll(d0Var.b);
                }
            }
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }
}
