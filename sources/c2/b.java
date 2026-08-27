package c2;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ e c;

    public b(e eVar) {
        this.c = eVar;
    }

    public static void a(w wVar, int i10, Object obj, int i11) {
        b0 b0Var = wVar.a;
        v vVar = wVar.b;
        int i12 = 65280 & i10;
        if (i12 != 256) {
            if (i12 != 512) {
                if (i12 == 768 && i10 == 769) {
                    vVar.l((e0) obj);
                }
                return;
            }
            switch (i10) {
                case 513:
                    vVar.a();
                    break;
                case 514:
                    vVar.c();
                    break;
                case 515:
                    vVar.b();
                    break;
            }
        }
        z zVar = (i10 == 264 || i10 == 262) ? (z) ((q0.b) obj).b : (z) obj;
        z zVar2 = (i10 == 264 || i10 == 262) ? (z) ((q0.b) obj).a : null;
        if (zVar != null) {
            boolean z10 = true;
            if ((wVar.d & 2) == 0 && !zVar.h(wVar.c)) {
                e0 e0Var = b0.c().u;
                z10 = ((e0Var == null ? false : e0Var.d) && zVar.d() && i10 == 262 && i11 == 3 && zVar2 != null) ? true ^ zVar2.d() : false;
            }
            if (z10) {
                switch (i10) {
                    case 257:
                        vVar.d(zVar);
                        break;
                    case 258:
                        vVar.f(zVar);
                        break;
                    case 259:
                        vVar.e(zVar);
                        break;
                    case 260:
                        vVar.k(zVar);
                        break;
                    case 261:
                        vVar.getClass();
                        break;
                    case 262:
                        vVar.h(b0Var, zVar, i11);
                        break;
                    case 263:
                        vVar.j(b0Var, zVar, i11);
                        break;
                    case 264:
                        vVar.h(b0Var, zVar, i11);
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
        int q6;
        ArrayList arrayList = this.a;
        e eVar = this.c;
        ArrayList arrayList2 = eVar.i;
        o0 o0Var = eVar.s;
        int i10 = message.what;
        Object obj = message.obj;
        int i11 = message.arg1;
        if (i10 == 259 && eVar.e().c.equals(((z) obj).c)) {
            eVar.o(true);
        }
        int i12 = 0;
        ArrayList arrayList3 = this.b;
        if (i10 == 262) {
            z zVar = (z) ((q0.b) obj).b;
            o0Var.x(zVar);
            if (eVar.v != null && zVar.d()) {
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    o0Var.w((z) obj2);
                }
                arrayList3.clear();
            }
        } else if (i10 != 264) {
            switch (i10) {
                case 257:
                    o0Var.v((z) obj);
                    break;
                case 258:
                    o0Var.w((z) obj);
                    break;
                case 259:
                    z zVar2 = (z) obj;
                    o0Var.getClass();
                    if (zVar2.c() != o0Var && (q6 = o0Var.q(zVar2)) >= 0) {
                        o0Var.C((n0) o0Var.D.get(q6));
                        break;
                    }
                    break;
            }
        } else {
            z zVar3 = (z) ((q0.b) obj).b;
            arrayList3.add(zVar3);
            o0Var.v(zVar3);
            o0Var.x(zVar3);
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
                        a((w) obj3, i10, obj, i11);
                    }
                    arrayList.clear();
                    return;
                }
                b0 b0Var = (b0) ((WeakReference) arrayList2.get(size2)).get();
                if (b0Var == null) {
                    arrayList2.remove(size2);
                } else {
                    arrayList.addAll(b0Var.b);
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
