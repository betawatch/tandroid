package ab;

import a8.ja;
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
import ch.q0;
import e2.v0;
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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.an;
import org.telegram.ui.cu0;
import org.telegram.ui.cy0;
import org.telegram.ui.e81;
import org.telegram.ui.fy0;
import org.telegram.ui.hy0;
import org.telegram.ui.web.e1;
import org.telegram.ui.xr0;
import p4.i1;
import p4.j1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c0 implements ib.b, li0, hy0 {
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

    public static synchronized c0 q() {
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

    public boolean A(p4.v vVar, int i7) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            j1 j1Var = hVar.d;
            j1Var.getClass();
            ja.e("Use contains(Command) for custom command", i7 != 0);
            Iterator<E> it = j1Var.a.iterator();
            while (it.hasNext()) {
                if (((i1) it.next()).a == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ boolean B() {
        switch (this.a) {
        }
        return false;
    }

    public boolean C(p4.v vVar, i1 i1Var) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar == null) {
            return false;
        }
        t0 t0Var = hVar.d.a;
        i1Var.getClass();
        return t0Var.contains(i1Var) || p4.d.j(i1Var.b);
    }

    public boolean D(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(m(aVar), new l.r((Context) this.c, (l0.a) menuItem));
    }

    public boolean E(k.a aVar, Menu menu) {
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

    public void H(p4.v vVar) {
        synchronized (this.b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.c).remove(hVar.a);
                hVar.b.g();
                p4.d0 d0Var = (p4.d0) ((WeakReference) this.e).get();
                if (d0Var == null || d0Var.j()) {
                    return;
                }
                h2.l0.W(d0Var.l, new p4.e(d0Var, vVar, 0));
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
    public Object I(kd.c cVar) {
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
                        af.b.c(obj);
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
                            af.b.c(obj);
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
                    af.b.c(obj);
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

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ void K() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ boolean L() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.hy0
    public void a() {
        org.telegram.messenger.g0.i3(new cy0((e2) this.b, (Context) this.c, (e6) this.d, (hh0) this.e, 2), 200L);
    }

    public void b(Object obj, p4.v vVar, j1 j1Var, y0 y0Var) {
        synchronized (this.b) {
            try {
                p4.v p10 = p(obj);
                if (p10 == null) {
                    ((a0.f) this.c).put(obj, vVar);
                    a0.f fVar = (a0.f) this.d;
                    com.google.android.gms.common.api.internal.t tVar = new com.google.android.gms.common.api.internal.t();
                    tVar.c = new Object();
                    tVar.d = new a0.f(0);
                    fVar.put(vVar, new p4.h(obj, tVar, j1Var, y0Var));
                } else {
                    p4.h hVar = (p4.h) ((a0.f) this.d).get(p10);
                    hVar.getClass();
                    hVar.d = j1Var;
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

    @Override // org.telegram.ui.hy0
    public void d() {
        org.telegram.messenger.g0.i3(new fy0(1, (e2) this.b, (hh0) this.e), 200L);
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
                    af.b.c(obj);
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
                    af.b.c(obj);
                    cVar2 = (m1.c) obj;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = hVar.a;
                    af.b.c(obj);
                    cVar2 = (m1.c) obj;
                }
                ((m1.b0) c0Var.e).h.X(cVar2);
                return gd.k.a;
            }
        }
        hVar = new m1.h(this, cVar);
        Object obj2 = hVar.b;
        jd.a aVar2 = jd.a.a;
        i7 = hVar.d;
        if (i7 != 0) {
        }
        ((m1.b0) c0Var.e).h.X(cVar2);
        return gd.k.a;
    }

    public void f(Canvas canvas, int i7) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i7, org.telegram.messenger.g0.L(14.66f));
        RectF rectF = org.telegram.messenger.g0.P;
        float f10 = i7;
        rectF.set(0.0f, 0.0f, f10, org.telegram.messenger.g0.L(14.66f));
        canvas.saveLayerAlpha(rectF, ns.e4, 31);
        if (hd.a0) {
            canvas.translate(f10, 0.0f);
        }
        int L = i7 - org.telegram.messenger.g0.L(25.0f);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            sr srVar = (sr) arrayList.get(i10);
            L = i20.w(4.0f, srVar.g, L);
            if (L < 0) {
                break;
            }
            if (hd.a0) {
                canvas.translate(-srVar.g, 0.0f);
                srVar.a(canvas);
                canvas.translate(-org.telegram.messenger.g0.L(4.0f), 0.0f);
            } else {
                srVar.a(canvas);
                canvas.translate(org.telegram.messenger.g0.L(4.0f) + srVar.g, 0.0f);
            }
            i10++;
        }
        if (i10 < arrayList.size()) {
            int size = arrayList.size() - i10;
            sr srVar2 = (sr) this.e;
            if (srVar2 == null || srVar2.a != size) {
                t2 t2Var = (t2) this.b;
                sr srVar3 = new sr();
                srVar3.a = size;
                oy0 oy0Var = new oy0(i5.c.i(size, "+"), 10.0f, org.telegram.messenger.g0.o());
                oy0Var.r(t2Var);
                srVar3.c = oy0Var;
                int L2 = org.telegram.messenger.g0.L(9.32f);
                oy0 oy0Var2 = srVar3.c;
                srVar3.g = L2 + ((int) oy0Var2.c);
                oy0Var2.i();
                int i11 = j6.n8;
                srVar3.f = i11;
                srVar3.e = true;
                srVar3.d = j6.x0(null, i11, false);
                this.e = srVar3;
            }
            if (hd.a0) {
                canvas.translate(-((sr) this.e).g, 0.0f);
                ((sr) this.e).a(canvas);
                canvas.translate(-org.telegram.messenger.g0.L(4.0f), 0.0f);
            } else {
                ((sr) this.e).a(canvas);
                canvas.translate(org.telegram.messenger.g0.L(4.0f) + ((sr) this.e).g, 0.0f);
            }
        }
        canvas.restore();
    }

    @Override // org.telegram.ui.hy0
    public void g() {
        e2 e2Var = (e2) this.b;
        e2Var.showDialog(new ug.x0(e2Var, 3, true));
    }

    @Override // fd.a
    public Object get() {
        return new gb.n((o9.g) ((d9.o) this.b).b, (jb.l) ((ib.c) this.c).get(), (id.h) ((ib.c) this.d).get(), (w0) ((ib.c) this.e).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    @Override // org.telegram.ui.Components.li0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
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
                an anVar = (an) this.b;
                org.telegram.ui.Cells.z J8 = anVar.J8(((gj) this.c).e1(), true);
                float f16 = 0.0f;
                if (J8 instanceof q1) {
                    q0 q0Var3 = ((q1) J8).O;
                    ch.n0 k12 = q0Var3.k(p0Var);
                    if (k12 == null) {
                        f12 = 0.0f;
                        f10 = f12;
                        anVar.Eb(J8, (gj) this.c, (mi0) this.d, view, f16, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                        ((xr0) this.e).c(false);
                        break;
                    } else {
                        f16 = q0Var3.b + k12.w + (k12.z / 2.0f);
                        f11 = q0Var3.c + k12.x;
                        i7 = k12.A;
                    }
                } else if (!(J8 instanceof org.telegram.ui.Cells.t0) || (k10 = (q0Var = ((org.telegram.ui.Cells.t0) J8).F0).k(p0Var)) == null) {
                    f10 = 0.0f;
                    anVar.Eb(J8, (gj) this.c, (mi0) this.d, view, f16, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                    ((xr0) this.e).c(false);
                } else {
                    f16 = q0Var.b + k10.w + (k10.z / 2.0f);
                    f11 = q0Var.c + k10.x;
                    i7 = k10.A;
                }
                f12 = f11 + (i7 / 2.0f);
                f10 = f12;
                anVar.Eb(J8, (gj) this.c, (mi0) this.d, view, f16, f10, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                ((xr0) this.e).c(false);
                break;
            default:
                an anVar2 = (an) this.b;
                org.telegram.ui.Cells.z J82 = anVar2.J8(((gj) this.c).e1(), true);
                float f17 = 0.0f;
                if (J82 instanceof q1) {
                    q0 q0Var4 = ((q1) J82).O;
                    ch.n0 k13 = q0Var4.k(p0Var);
                    if (k13 == null) {
                        f15 = 0.0f;
                        f13 = f15;
                        anVar2.Eb(J82, (gj) this.c, (mi0) this.d, view, f17, f13, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                        ((e81) this.e).c(false);
                        break;
                    } else {
                        f17 = q0Var4.b + k13.w + (k13.z / 2.0f);
                        f14 = q0Var4.c + k13.x;
                        i10 = k13.A;
                    }
                } else if (!(J82 instanceof org.telegram.ui.Cells.t0) || (k11 = (q0Var2 = ((org.telegram.ui.Cells.t0) J82).F0).k(p0Var)) == null) {
                    f13 = 0.0f;
                    anVar2.Eb(J82, (gj) this.c, (mi0) this.d, view, f17, f13, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                    ((e81) this.e).c(false);
                } else {
                    f17 = q0Var2.b + k11.w + (k11.z / 2.0f);
                    f14 = q0Var2.c + k11.x;
                    i10 = k11.A;
                }
                f15 = f14 + (i10 / 2.0f);
                f13 = f15;
                anVar2.Eb(J82, (gj) this.c, (mi0) this.d, view, f17, f13, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                ((e81) this.e).c(false);
                break;
        }
    }

    public void k(p4.h hVar) {
        p4.d0 d0Var = (p4.d0) ((WeakReference) this.e).get();
        if (d0Var == null) {
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
            h2.l0.W(d0Var.l, new e1(d0Var, p(hVar.a), new cu0(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 12)));
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
                        d0 d0Var = (d0) ((WeakReference) ab.c0.this.e).get();
                        if (d0Var != null) {
                            d0Var.p(this.b);
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

    public h9.i0 o() {
        h9.i0 q10;
        synchronized (this.b) {
            q10 = h9.i0.q(((a0.f) this.c).values());
        }
        return q10;
    }

    public p4.v p(Object obj) {
        p4.v vVar;
        synchronized (this.b) {
            vVar = (p4.v) ((a0.f) this.c).get(obj);
        }
        return vVar;
    }

    @Override // org.telegram.ui.Components.li0
    public /* synthetic */ boolean r() {
        switch (this.a) {
        }
        return true;
    }

    public v0 s(p4.v vVar) {
        synchronized (this.b) {
            try {
                return ((p4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p4.e1 t(p4.v vVar) {
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
                return ((ff) this.e).toString();
            default:
                return super.toString();
        }
    }

    public com.google.android.gms.common.api.internal.t u(p4.v vVar) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            return hVar.b;
        }
        return null;
    }

    public boolean v(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean w(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public boolean x(p4.v vVar) {
        boolean z10;
        synchronized (this.b) {
            z10 = ((a0.f) this.d).get(vVar) != null;
        }
        return z10;
    }

    public boolean y() {
        return ((ArrayList) this.d).isEmpty();
    }

    public boolean z(p4.v vVar, int i7) {
        p4.h hVar;
        synchronized (this.b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        p4.d0 d0Var = (p4.d0) ((WeakReference) this.e).get();
        return hVar != null && hVar.e.a(i7) && d0Var != null && d0Var.t.t().a(i7);
    }

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public c0(t2 t2Var) {
        this.a = 9;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = null;
        this.b = t2Var;
    }

    public c0(p4.d0 d0Var) {
        this.a = 13;
        this.c = new a0.f(0);
        this.d = new a0.f(0);
        this.b = new Object();
        this.e = new WeakReference(d0Var);
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

    private final /* synthetic */ void F() {
    }

    private final /* synthetic */ void G() {
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
        linearLayout.addView(textView2, c8.ja.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        o5 o5Var = new o5(eVar.getContext());
        this.b = o5Var;
        linearLayout.addView(o5Var, c8.ja.o(-1, -2));
        textView2.setGravity(8388611);
        o5Var.setGravity(8388613);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public c0(m1.b0 b0Var, List list) {
        this.a = 6;
        this.e = b0Var;
        this.b = new ie.d();
        this.c = zd.b0.a();
        this.d = hd.f.l(list);
    }

    public c0(x2.q1 q1Var, boolean[] zArr) {
        this.a = 15;
        this.b = q1Var;
        this.c = zArr;
        int i7 = q1Var.a;
        this.d = new boolean[i7];
        this.e = new boolean[i7];
    }

    private final /* synthetic */ void i(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }

    private final /* synthetic */ void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
