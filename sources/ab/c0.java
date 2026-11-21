package ab;

import a8.la;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import ch.q0;
import e2.y0;
import gb.w0;
import h9.t0;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import m1.x0;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Wallet.u4;
import org.telegram.ui.as0;
import org.telegram.ui.bn;
import org.telegram.ui.hy0;
import org.telegram.ui.i81;
import org.telegram.ui.ly0;
import org.telegram.ui.tr0;
import org.telegram.ui.wt0;
import p4.g1;
import p4.k1;
import p4.l1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class c0 implements ib.b, wi0, ly0 {
    public static c0 f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public static synchronized c0 s() {
        c0 c0Var;
        synchronized (c0.class) {
            try {
                if (f == null) {
                    f = new c0(0);
                }
                c0Var = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0Var;
    }

    public boolean A(p4.v vVar) {
        boolean z10;
        synchronized (this.b) {
            z10 = ((a0.f) this.d).get(vVar) != null;
        }
        return z10;
    }

    public boolean B() {
        return ((ArrayList) this.d).isEmpty();
    }

    public boolean C(p4.v vVar, int i7) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        p4.e0 e0Var = (p4.e0) ((WeakReference) this.e).get();
        return hVar != null && hVar.e.a(i7) && e0Var != null && e0Var.t.t().a(i7);
    }

    public boolean D(p4.v vVar, int i7) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            l1 l1Var = hVar.d;
            l1Var.getClass();
            la.e("Use contains(Command) for custom command", i7 != 0);
            Iterator<E> it = l1Var.a.iterator();
            while (it.hasNext()) {
                if (((k1) it.next()).a == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean E() {
        switch (this.a) {
        }
        return false;
    }

    public boolean F(p4.v vVar, k1 k1Var) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar == null) {
            return false;
        }
        t0 t0Var = hVar.d.a;
        k1Var.getClass();
        return t0Var.contains(k1Var) || p4.d.j(k1Var.b);
    }

    public boolean G(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(m(aVar), new l.r((Context) this.c, (l0.a) menuItem));
    }

    public boolean H(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        k.e m10 = m(aVar);
        a0.l lVar = (a0.l) this.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) this.c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(m10, menu2);
    }

    public void K(p4.v vVar) {
        synchronized (this.b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.c).remove(hVar.a);
                hVar.b.g();
                p4.e0 e0Var = (p4.e0) ((WeakReference) this.e).get();
                if (e0Var == null || e0Var.j()) {
                    return;
                }
                h2.l0.W(e0Var.l, new p4.e(e0Var, vVar, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:25:0x0064, B:29:0x0074), top: B:24:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v5, types: [ie.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object L(kd.c cVar) {
        x0 x0Var;
        int i7;
        ie.d dVar;
        c0 c0Var;
        ie.a aVar;
        Throwable th2;
        c0 c0Var2;
        try {
            if (cVar instanceof x0) {
                x0Var = (x0) cVar;
                int i10 = x0Var.e;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    x0Var.e = i10 - TLObject.FLAG_31;
                    Object obj = x0Var.c;
                    jd.a aVar2 = jd.a.a;
                    i7 = x0Var.e;
                    gd.k kVar = gd.k.a;
                    if (i7 != 0) {
                        b7.h.b(obj);
                        if (((zd.t) this.c).A()) {
                            return kVar;
                        }
                        dVar = (ie.d) this.b;
                        x0Var.a = this;
                        x0Var.b = dVar;
                        x0Var.e = 1;
                        if (dVar.d(x0Var) != aVar2) {
                            c0Var = this;
                        }
                        return aVar2;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = x0Var.b;
                        c0Var2 = x0Var.a;
                        try {
                            b7.h.b(obj);
                            ((zd.t) c0Var2.c).C(kVar);
                            ((ie.d) aVar).f(null);
                            return kVar;
                        } catch (Throwable th3) {
                            th2 = th3;
                            ((ie.d) aVar).f(null);
                            throw th2;
                        }
                    }
                    ?? r22 = x0Var.b;
                    c0Var = x0Var.a;
                    b7.h.b(obj);
                    dVar = r22;
                    if (!((zd.t) c0Var.c).A()) {
                        dVar.f(null);
                        return kVar;
                    }
                    x0Var.a = c0Var;
                    x0Var.b = dVar;
                    x0Var.e = 2;
                    if (c0Var.e(x0Var) != aVar2) {
                        aVar = dVar;
                        c0Var2 = c0Var;
                        ((zd.t) c0Var2.c).C(kVar);
                        ((ie.d) aVar).f(null);
                        return kVar;
                    }
                    return aVar2;
                }
            }
            if (!((zd.t) c0Var.c).A()) {
            }
        } catch (Throwable th4) {
            aVar = dVar;
            th2 = th4;
            ((ie.d) aVar).f(null);
            throw th2;
        }
        x0Var = new x0(this, cVar);
        Object obj2 = x0Var.c;
        jd.a aVar22 = jd.a.a;
        i7 = x0Var.e;
        gd.k kVar2 = gd.k.a;
        if (i7 != 0) {
        }
    }

    @Override // org.telegram.ui.ly0
    public void a() {
        org.telegram.messenger.g0.h3(new hy0((g2) this.b, (Context) this.c, (h6) this.d, (ou) this.e, 2), 200L);
    }

    public void b(Object obj, p4.v vVar, l1 l1Var, y0 y0Var) {
        synchronized (this.b) {
            try {
                p4.v r10 = r(obj);
                if (r10 == null) {
                    ((a0.f) this.c).put(obj, vVar);
                    a0.f fVar = (a0.f) this.d;
                    com.google.android.gms.common.api.internal.t tVar = new com.google.android.gms.common.api.internal.t();
                    tVar.c = new Object();
                    tVar.d = new a0.f(0);
                    fVar.put(vVar, new p4.h(obj, tVar, l1Var, y0Var));
                } else {
                    p4.h hVar = (p4.h) ((a0.f) this.d).get(r10);
                    hVar.getClass();
                    hVar.d = l1Var;
                    hVar.e = y0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(p4.v vVar, int i7, p4.g gVar) {
        synchronized (this.b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    y0 y0Var = hVar.g;
                    y0Var.getClass();
                    ca.i iVar = new ca.i();
                    iVar.c(y0Var.a);
                    iVar.b(i7);
                    hVar.g = new y0(iVar.d());
                    hVar.c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.ly0
    public void d() {
        org.telegram.messenger.g0.h3(new tr0(28, (g2) this.b, (ou) this.e), 200L);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(kd.c cVar) {
        m1.h hVar;
        int i7;
        c0 c0Var;
        m1.c cVar2;
        m1.b0 b0Var = (m1.b0) this.e;
        if (cVar instanceof m1.h) {
            hVar = (m1.h) cVar;
            int i10 = hVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                hVar.d = i10 - TLObject.FLAG_31;
                Object obj = hVar.b;
                jd.a aVar = jd.a.a;
                i7 = hVar.d;
                if (i7 != 0) {
                    b7.h.b(obj);
                    List list = (List) this.d;
                    if (list == null || list.isEmpty()) {
                        hVar.a = this;
                        hVar.d = 1;
                        obj = m1.b0.f(b0Var, false, hVar);
                        if (obj != aVar) {
                            c0Var = this;
                            cVar2 = (m1.c) obj;
                        }
                    } else {
                        m1.m0 g10 = b0Var.g();
                        m1.k kVar = new m1.k(b0Var, this, null);
                        hVar.a = this;
                        hVar.d = 2;
                        obj = g10.c(kVar, hVar);
                        if (obj != aVar) {
                            c0Var = this;
                            cVar2 = (m1.c) obj;
                        }
                    }
                    return aVar;
                }
                if (i7 == 1) {
                    c0Var = hVar.a;
                    b7.h.b(obj);
                    cVar2 = (m1.c) obj;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = hVar.a;
                    b7.h.b(obj);
                    cVar2 = (m1.c) obj;
                }
                ((m1.b0) c0Var.e).h.L(cVar2);
                return gd.k.a;
            }
        }
        hVar = new m1.h(this, cVar);
        Object obj2 = hVar.b;
        jd.a aVar2 = jd.a.a;
        i7 = hVar.d;
        if (i7 != 0) {
        }
        ((m1.b0) c0Var.e).h.L(cVar2);
        return gd.k.a;
    }

    public void f(Canvas canvas, int i7) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i7, org.telegram.messenger.g0.L(14.66f));
        RectF rectF = org.telegram.messenger.g0.P;
        float f10 = i7;
        rectF.set(0.0f, 0.0f, f10, org.telegram.messenger.g0.L(14.66f));
        canvas.saveLayerAlpha(rectF, ks.e4, 31);
        if (gd.a0) {
            canvas.translate(f10, 0.0f);
        }
        int L = i7 - org.telegram.messenger.g0.L(25.0f);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            bs bsVar = (bs) arrayList.get(i10);
            L = n10.x(4.0f, bsVar.g, L);
            if (L < 0) {
                break;
            }
            if (gd.a0) {
                canvas.translate(-bsVar.g, 0.0f);
                bsVar.a(canvas);
                canvas.translate(-org.telegram.messenger.g0.L(4.0f), 0.0f);
            } else {
                bsVar.a(canvas);
                canvas.translate(org.telegram.messenger.g0.L(4.0f) + bsVar.g, 0.0f);
            }
            i10++;
        }
        if (i10 < arrayList.size()) {
            int size = arrayList.size() - i10;
            bs bsVar2 = (bs) this.e;
            if (bsVar2 == null || bsVar2.a != size) {
                u2 u2Var = (u2) this.b;
                bs bsVar3 = new bs();
                bsVar3.a = size;
                xy0 xy0Var = new xy0(i5.c.i(size, "+"), 10.0f, org.telegram.messenger.g0.o());
                xy0Var.r(u2Var);
                bsVar3.c = xy0Var;
                int L2 = org.telegram.messenger.g0.L(9.32f);
                xy0 xy0Var2 = bsVar3.c;
                bsVar3.g = L2 + ((int) xy0Var2.c);
                xy0Var2.i();
                int i11 = m6.n8;
                bsVar3.f = i11;
                bsVar3.e = true;
                bsVar3.d = m6.x0(null, i11, false);
                this.e = bsVar3;
            }
            if (gd.a0) {
                canvas.translate(-((bs) this.e).g, 0.0f);
                ((bs) this.e).a(canvas);
                canvas.translate(-org.telegram.messenger.g0.L(4.0f), 0.0f);
            } else {
                ((bs) this.e).a(canvas);
                canvas.translate(org.telegram.messenger.g0.L(4.0f) + ((bs) this.e).g, 0.0f);
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    @Override // org.telegram.ui.Components.wi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        float f10;
        q0 q0Var;
        ch.n0 k10;
        float f11;
        int i7;
        float f12;
        float f13;
        q0 q0Var2;
        ch.n0 k11;
        float f14;
        int i10;
        float f15;
        switch (this.a) {
            case 10:
                bn bnVar = (bn) this.b;
                org.telegram.ui.Cells.z J8 = bnVar.J8(((fj) this.c).e1(), true);
                float f16 = 0.0f;
                if (J8 instanceof r1) {
                    q0 q0Var3 = ((r1) J8).O;
                    ch.n0 k12 = q0Var3.k(p0Var);
                    if (k12 == null) {
                        f12 = 0.0f;
                        f10 = f12;
                        bnVar.Eb(J8, (fj) this.c, (xi0) this.d, view, f16, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                        ((as0) this.e).c(false);
                        break;
                    } else {
                        f16 = q0Var3.b + k12.w + (k12.z / 2.0f);
                        f11 = q0Var3.c + k12.x;
                        i7 = k12.A;
                    }
                } else if (!(J8 instanceof v0) || (k10 = (q0Var = ((v0) J8).F0).k(p0Var)) == null) {
                    f10 = 0.0f;
                    bnVar.Eb(J8, (fj) this.c, (xi0) this.d, view, f16, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                    ((as0) this.e).c(false);
                } else {
                    f16 = q0Var.b + k10.w + (k10.z / 2.0f);
                    f11 = q0Var.c + k10.x;
                    i7 = k10.A;
                }
                f12 = f11 + (i7 / 2.0f);
                f10 = f12;
                bnVar.Eb(J8, (fj) this.c, (xi0) this.d, view, f16, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                ((as0) this.e).c(false);
                break;
            default:
                bn bnVar2 = (bn) this.b;
                org.telegram.ui.Cells.z J82 = bnVar2.J8(((fj) this.c).e1(), true);
                float f17 = 0.0f;
                if (J82 instanceof r1) {
                    q0 q0Var4 = ((r1) J82).O;
                    ch.n0 k13 = q0Var4.k(p0Var);
                    if (k13 == null) {
                        f15 = 0.0f;
                        f13 = f15;
                        bnVar2.Eb(J82, (fj) this.c, (xi0) this.d, view, f17, f13, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                        ((i81) this.e).c(false);
                        break;
                    } else {
                        f17 = q0Var4.b + k13.w + (k13.z / 2.0f);
                        f14 = q0Var4.c + k13.x;
                        i10 = k13.A;
                    }
                } else if (!(J82 instanceof v0) || (k11 = (q0Var2 = ((v0) J82).F0).k(p0Var)) == null) {
                    f13 = 0.0f;
                    bnVar2.Eb(J82, (fj) this.c, (xi0) this.d, view, f17, f13, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                    ((i81) this.e).c(false);
                } else {
                    f17 = q0Var2.b + k11.w + (k11.z / 2.0f);
                    f14 = q0Var2.c + k11.x;
                    i10 = k11.A;
                }
                f15 = f14 + (i10 / 2.0f);
                f13 = f15;
                bnVar2.Eb(J82, (fj) this.c, (xi0) this.d, view, f17, f13, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                ((i81) this.e).c(false);
                break;
        }
    }

    @Override // fd.a
    public Object get() {
        return new gb.n((o9.g) ((d9.o) this.b).a, (jb.l) ((ib.c) this.c).get(), (id.h) ((ib.c) this.d).get(), (w0) ((ib.c) this.e).get());
    }

    @Override // org.telegram.ui.ly0
    public void h() {
        g2 g2Var = (g2) this.b;
        g2Var.showDialog(new ug.y0(g2Var, 3, true));
    }

    public void k(p4.h hVar) {
        p4.e0 e0Var = (p4.e0) ((WeakReference) this.e).get();
        if (e0Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            p4.g gVar = (p4.g) hVar.c.poll();
            if (gVar == null) {
                hVar.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            p4.h hVar2 = hVar;
            h2.l0.W(e0Var.l, new u4(e0Var, r(hVar.a), new wt0(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 13)));
            atomicBoolean2.set(false);
            hVar = hVar2;
        }
    }

    public void l(final p4.v vVar) {
        synchronized (this.b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return;
                }
                final y0 y0Var = hVar.g;
                hVar.g = y0.b;
                hVar.c.add(new p4.g(vVar, y0Var) { // from class: p4.f
                    public final /* synthetic */ v b;

                    @Override // p4.g
                    public final m9.y run() {
                        e0 e0Var = (e0) ((WeakReference) ab.c0.this.e).get();
                        if (e0Var != null) {
                            e0Var.p(this.b);
                        }
                        return m9.w.b;
                    }
                });
                if (hVar.f) {
                    return;
                }
                hVar.f = true;
                k(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e m(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            k.e eVar = (k.e) arrayList.get(i7);
            if (eVar != null && eVar.b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public y0 n(p4.v vVar) {
        synchronized (this.b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return null;
                }
                return hVar.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean o() {
        switch (this.a) {
        }
        return true;
    }

    public h9.i0 p() {
        h9.i0 q10;
        synchronized (this.b) {
            q10 = h9.i0.q(((a0.f) this.c).values());
        }
        return q10;
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ boolean q() {
        switch (this.a) {
        }
        return false;
    }

    public p4.v r(Object obj) {
        p4.v vVar;
        synchronized (this.b) {
            vVar = (p4.v) ((a0.f) this.c).get(obj);
        }
        return vVar;
    }

    public e2.v0 t(p4.v vVar) {
        synchronized (this.b) {
            try {
                return ((p4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return ((ze.b) this.e).toString();
            default:
                return super.toString();
        }
    }

    public g1 u(p4.v vVar) {
        synchronized (this.b) {
            try {
                return ((p4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.android.gms.common.api.internal.t v(p4.v vVar) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            return hVar.b;
        }
        return null;
    }

    public boolean w(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        int i10 = this.a;
    }

    public boolean y(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    @Override // org.telegram.ui.Components.wi0
    public /* synthetic */ void z() {
        int i7 = this.a;
    }

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public c0(u2 u2Var) {
        this.a = 9;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = null;
        this.b = u2Var;
    }

    public c0(p4.e0 e0Var) {
        this.a = 13;
        this.c = new a0.f(0);
        this.d = new a0.f(0);
        this.b = new Object();
        this.e = new WeakReference(e0Var);
    }

    public c0(Typeface typeface, s1.b bVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.a = 1;
        this.e = typeface;
        this.b = bVar;
        this.d = new androidx.emoji2.text.t(1024);
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.a;
            i7 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i13) + i13);
        } else {
            i7 = 0;
        }
        this.c = new char[i7 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this, i15);
            s1.a b10 = pVar.b();
            int a12 = b10.a(4);
            Character.toChars(a12 != 0 ? ((ByteBuffer) b10.d).getInt(a12 + b10.a) : 0, (char[]) this.c, i15 * 2);
            s1.a b11 = pVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i16 = a13 + b11.a;
                i11 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.d;
                s1.a b12 = pVar.b();
                int a14 = b12.a(16);
                if (a14 != 0) {
                    int i17 = a14 + b12.a;
                    i12 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i17) + i17);
                } else {
                    i12 = 0;
                }
                tVar.a(pVar, 0, i12 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    private final /* synthetic */ void I() {
    }

    private final /* synthetic */ void J() {
    }

    public c0(int i7) {
        this.a = i7;
        switch (i7) {
            case 2:
                break;
            case 8:
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public c0(Context context, ActionMode.Callback callback) {
        this.a = 5;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new a0.l(0);
    }

    public c0(ng.e eVar) {
        this.a = 7;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        if (eVar.F) {
            TextView textView = new TextView(eVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = org.telegram.messenger.g0.L(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(eVar.getContext());
        this.c = textView2;
        linearLayout.addView(textView2, ma.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        x5 x5Var = new x5(eVar.getContext());
        this.b = x5Var;
        linearLayout.addView(x5Var, ma.o(-1, -2));
        textView2.setGravity(8388611);
        x5Var.setGravity(8388613);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        x5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public c0(m1.b0 b0Var, List list) {
        this.a = 6;
        this.e = b0Var;
        this.b = new ie.d();
        this.c = zd.b0.a();
        this.d = hd.f.l(list);
    }

    public c0(x2.r1 r1Var, boolean[] zArr) {
        this.a = 15;
        this.b = r1Var;
        this.c = zArr;
        int i7 = r1Var.a;
        this.d = new boolean[i7];
        this.e = new boolean[i7];
    }

    private final /* synthetic */ void i(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }

    private final /* synthetic */ void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
