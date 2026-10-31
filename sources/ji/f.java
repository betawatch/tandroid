package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.emoji2.text.o;
import androidx.emoji2.text.s;
import b2.a0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.l;
import k1.n;
import kg.i1;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.u0;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.et0;
import org.telegram.ui.kt0;
import org.telegram.ui.tz0;
import org.telegram.ui.un;
import org.telegram.ui.x91;
import org.telegram.ui.xz0;
import sg.m0;
import sg.o0;
import sg.p0;
import td.b0;
import td.c0;
import td.e0;
import td.f1;
import td.j2;
import u2.r1;
import w7.b6;
import yd.t;
import z9.w0;
import z9.x0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class f implements lj0, xz0 {
    public static volatile f f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ f(int i10, boolean z10) {
        this.a = i10;
    }

    public static final Message a(f fVar, ArrayList arrayList, int i10) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((Message) obj2).what == i10) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean A() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.xz0
    public void b() {
        i0.h3(new tz0((k2) this.b, (Context) this.c, (p6) this.d, (gi0) this.e, 2), 200L);
    }

    @Override // org.telegram.ui.xz0
    public void c() {
        i0.h3(new et0(27, (k2) this.b, (gi0) this.e), 200L);
    }

    @Override // org.telegram.ui.xz0
    public void d() {
        k2 k2Var = (k2) this.b;
        k2Var.showDialog(new i1(k2Var, 3, true));
    }

    public w0 e() {
        String str = ((x0) this.b) == null ? " rolloutVariant" : "";
        if (((String) this.c) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.d) == null) {
            str = sc.e.A(str, " parameterValue");
        }
        if (((Long) this.e) == null) {
            str = sc.e.A(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.b, (String) this.c, (String) this.d, ((Long) this.e).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return true;
    }

    public void g(Canvas canvas, int i10) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i10, i0.L(14.66f));
        RectF rectF = i0.P;
        float f7 = i10;
        rectF.set(0.0f, 0.0f, f7, i0.L(14.66f));
        canvas.saveLayerAlpha(rectF, zs.e4, 31);
        if (cd.X) {
            canvas.translate(f7, 0.0f);
        }
        int L = i10 - i0.L(25.0f);
        int i11 = 0;
        while (i11 < arrayList.size()) {
            wr wrVar = (wr) arrayList.get(i11);
            L = z20.w(4.0f, wrVar.g, L);
            if (L < 0) {
                break;
            }
            if (cd.X) {
                canvas.translate(-wrVar.g, 0.0f);
                wrVar.a(canvas);
                canvas.translate(-i0.L(4.0f), 0.0f);
            } else {
                wrVar.a(canvas);
                canvas.translate(i0.L(4.0f) + wrVar.g, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            wr wrVar2 = (wr) this.e;
            if (wrVar2 == null || wrVar2.a != size) {
                v2 v2Var = (v2) this.b;
                wr wrVar3 = new wr();
                wrVar3.a = size;
                qz0 qz0Var = new qz0(i0.a.i(size, "+"), 10.0f, i0.o());
                qz0Var.r(v2Var);
                wrVar3.c = qz0Var;
                int L2 = i0.L(9.32f);
                qz0 qz0Var2 = wrVar3.c;
                wrVar3.g = L2 + ((int) qz0Var2.c);
                qz0Var2.i();
                int i12 = t6.n8;
                wrVar3.f = i12;
                wrVar3.e = true;
                wrVar3.d = t6.x0(null, i12, false);
                this.e = wrVar3;
            }
            if (cd.X) {
                canvas.translate(-((wr) this.e).g, 0.0f);
                ((wr) this.e).a(canvas);
                canvas.translate(-i0.L(4.0f), 0.0f);
            } else {
                ((wr) this.e).a(canvas);
                canvas.translate(i0.L(4.0f) + ((wr) this.e).g, 0.0f);
            }
        }
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean h() {
        switch (this.a) {
        }
        return false;
    }

    public void k(e eVar) {
        if (((e) this.c) != eVar) {
            return;
        }
        c cVar = (c) this.d;
        if (cVar != null) {
            i0.r(cVar);
            this.d = null;
        }
        c cVar2 = (c) this.e;
        if (cVar2 != null) {
            i0.r(cVar2);
            this.e = null;
        }
        synchronized (k.y) {
            try {
                k kVar = k.A;
                if (kVar != null) {
                    kVar.q();
                    k.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.c = null;
        eVar.c.run(-1L);
        q();
    }

    public boolean l() {
        return ((ArrayList) this.d).isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0268, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020d  */
    /* JADX WARN: Type inference failed for: r2v19, types: [vd.h, yd.d, yd.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(l lVar) {
        vd.b bVar;
        ea.a aVar;
        int i10;
        int i11;
        boolean z10;
        l lVar2;
        vd.h hVar;
        ea.a aVar2;
        long j10;
        boolean z11;
        int i12;
        int i13;
        Object obj;
        Object a2;
        long j11;
        vd.h hVar2;
        l lVar3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        vd.c cVar;
        l lVar4 = lVar;
        vd.b bVar2 = (vd.b) this.d;
        bVar2.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = vd.b.b;
        boolean z12 = false;
        boolean z13 = true;
        long j12 = 1152921504606846975L;
        boolean z14 = bVar2.i(atomicLongFieldUpdater2.get(bVar2), false) ? false : !bVar2.a(r2 & 1152921504606846975L);
        Object obj2 = vd.g.a;
        if (z14) {
            obj = obj2;
        } else {
            ea.a aVar3 = vd.d.j;
            vd.h hVar3 = (vd.h) vd.b.f.get(bVar2);
            while (true) {
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bVar2);
                long j13 = andIncrement & j12;
                boolean i14 = bVar2.i(andIncrement, z12);
                int i15 = vd.d.b;
                long j14 = i15;
                long j15 = j12;
                long j16 = j13 / j14;
                int i16 = (int) (j13 % j14);
                if (hVar3.c != j16) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = vd.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vd.b.f;
                    vd.h hVar4 = vd.d.a;
                    vd.c cVar2 = vd.c.a;
                    while (true) {
                        a2 = yd.a.a(hVar3, j16, cVar2);
                        if (!yd.a.d(a2)) {
                            t b10 = yd.a.b(a2);
                            while (true) {
                                t tVar = (t) atomicReferenceFieldUpdater.get(bVar2);
                                z10 = z13;
                                j11 = j16;
                                aVar = aVar3;
                                cVar = cVar2;
                                if (tVar.c >= b10.c) {
                                    break;
                                }
                                if (!b10.j()) {
                                    break;
                                }
                                while (!atomicReferenceFieldUpdater.compareAndSet(bVar2, tVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(bVar2) != tVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
                                        aVar3 = aVar;
                                        z13 = z10;
                                        j16 = j11;
                                        cVar2 = cVar;
                                    }
                                }
                                if (tVar.f()) {
                                    tVar.e();
                                }
                            }
                        } else {
                            z10 = z13;
                            j11 = j16;
                            aVar = aVar3;
                            break;
                        }
                        aVar3 = aVar;
                        z13 = z10;
                        j16 = j11;
                        cVar2 = cVar;
                    }
                    if (yd.a.d(a2)) {
                        bVar2.c();
                        if (hVar3.c * vd.d.b < atomicLongFieldUpdater3.get(bVar2)) {
                            hVar3.b();
                            vd.h hVar5 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar5;
                            i10 = i15;
                            i11 = i16;
                            lVar3 = null;
                            lVar2 = null;
                            if (lVar3 == null) {
                                hVar = lVar3;
                            } else {
                                if (i14) {
                                    obj = new vd.e(bVar.f());
                                    break;
                                }
                                vd.b bVar3 = bVar;
                                hVar3 = hVar2;
                                bVar2 = bVar3;
                                aVar3 = aVar;
                                j12 = j15;
                                z13 = z10;
                                z12 = false;
                            }
                        } else {
                            vd.h hVar6 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar6;
                            i10 = i15;
                            i11 = i16;
                            lVar2 = null;
                            lVar3 = lVar2;
                            if (lVar3 == null) {
                            }
                        }
                    } else {
                        ?? r22 = (vd.h) yd.a.b(a2);
                        long j17 = r22.c;
                        if (j17 > j11) {
                            long j18 = vd.d.b * j17;
                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = vd.b.b;
                            int i17 = i15;
                            int i18 = i16;
                            while (true) {
                                long j19 = atomicLongFieldUpdater4.get(bVar2);
                                long j20 = j19 & j15;
                                if (j20 >= j18) {
                                    vd.h hVar7 = hVar3;
                                    bVar = bVar2;
                                    hVar2 = hVar7;
                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                    i11 = i18;
                                    lVar2 = null;
                                    i10 = i17;
                                    break;
                                }
                                vd.b bVar4 = bVar2;
                                long j21 = j18;
                                AtomicLongFieldUpdater atomicLongFieldUpdater5 = atomicLongFieldUpdater4;
                                i11 = i18;
                                lVar2 = null;
                                i10 = i17;
                                hVar2 = hVar3;
                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                bVar = bVar4;
                                if (vd.b.b.compareAndSet(bVar, j19, (((int) (j19 >> 60)) << 60) + j20)) {
                                    break;
                                }
                                hVar3 = hVar2;
                                bVar2 = bVar;
                                atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                i17 = i10;
                                atomicLongFieldUpdater4 = atomicLongFieldUpdater5;
                                i18 = i11;
                                j18 = j21;
                            }
                            if (j17 * vd.d.b < atomicLongFieldUpdater.get(bVar)) {
                                r22.b();
                            }
                            lVar3 = lVar2;
                            if (lVar3 == null) {
                            }
                        } else {
                            vd.h hVar8 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar8;
                            i10 = i15;
                            i11 = i16;
                            lVar2 = null;
                            lVar3 = r22;
                            if (lVar3 == null) {
                            }
                        }
                    }
                } else {
                    vd.h hVar9 = hVar3;
                    bVar = bVar2;
                    aVar = aVar3;
                    i10 = i15;
                    i11 = i16;
                    z10 = z13;
                    lVar2 = null;
                    hVar = hVar9;
                }
                hVar.n(i11, lVar4);
                if (i14) {
                    bVar2 = bVar;
                    aVar2 = aVar;
                    j10 = j13;
                    z11 = i14;
                    i12 = 5;
                    i13 = bVar2.p(hVar, i11, lVar4, j10, aVar2, z11);
                } else {
                    bVar2 = bVar;
                    aVar2 = aVar;
                    j10 = j13;
                    z11 = i14;
                    l lVar5 = lVar2;
                    i12 = 5;
                    Object l4 = hVar.l(i11);
                    if (l4 == null) {
                        if (bVar2.a(j10)) {
                            if (hVar.k(i11, lVar5, vd.d.d)) {
                                z13 = z10;
                                i13 = z13;
                                Object obj3 = ad.j.a;
                                if (i13 == 0) {
                                    hVar.b();
                                    break;
                                }
                                if (i13 == z13) {
                                    break;
                                }
                                if (i13 != 2) {
                                    if (i13 == 3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    if (i13 != 4) {
                                        if (i13 == i12) {
                                            hVar.b();
                                        }
                                        lVar4 = lVar;
                                        hVar3 = hVar;
                                        aVar3 = aVar2;
                                        j12 = j15;
                                        z12 = false;
                                    } else {
                                        if (j10 < vd.b.c.get(bVar2)) {
                                            hVar.b();
                                        }
                                        obj = new vd.e(bVar2.f());
                                    }
                                } else if (z11) {
                                    hVar.i();
                                    obj = new vd.e(bVar2.f());
                                } else {
                                    j2 j2Var = aVar2 instanceof j2 ? (j2) aVar2 : null;
                                    if (j2Var != null) {
                                        j2Var.a(hVar, i11 + i10);
                                    }
                                    hVar.i();
                                    obj = obj2;
                                }
                            }
                        } else if (aVar2 == null) {
                            i13 = 3;
                        } else if (hVar.k(i11, lVar5, aVar2)) {
                            i13 = 2;
                        }
                        z13 = z10;
                        i13 = bVar2.p(hVar, i11, lVar4, j10, aVar2, z11);
                        Object obj32 = ad.j.a;
                        if (i13 == 0) {
                        }
                    } else {
                        if (l4 instanceof j2) {
                            hVar.n(i11, lVar5);
                            if (bVar2.m(l4, lVar4)) {
                                hVar.o(i11, vd.d.i);
                                z13 = z10;
                                i13 = 0;
                            } else {
                                ea.a aVar4 = vd.d.k;
                                if (hVar.f.getAndSet((i11 * 2) + 1, aVar4) != aVar4) {
                                    z13 = z10;
                                    hVar.m(i11, z13);
                                } else {
                                    z13 = z10;
                                }
                                i13 = 5;
                            }
                            Object obj322 = ad.j.a;
                            if (i13 == 0) {
                            }
                        }
                        z13 = z10;
                        i13 = bVar2.p(hVar, i11, lVar4, j10, aVar2, z11);
                        Object obj3222 = ad.j.a;
                        if (i13 == 0) {
                        }
                    }
                }
                z13 = z10;
                Object obj32222 = ad.j.a;
                if (i13 == 0) {
                }
            }
        }
        i12 = 5;
        if (obj instanceof vd.e) {
            Throwable th2 = ((vd.e) obj).a;
            if (th2 != null) {
                throw th2;
            }
            throw new a0("Channel was closed normally");
        }
        if (obj instanceof vd.f) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.e).getAndIncrement() == 0) {
            e0.q((c0) this.b, new bb.l(this, null, i12));
        }
    }

    public ve.f p(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        se.d dVar = new se.d((ArrayList) this.b, (we.b) this.d, (ArrayList) this.c);
        int i10 = 0;
        while (true) {
            int length = str.length();
            int i11 = i10;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                char charAt = str.charAt(i11);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                break;
            }
            dVar.i(str.substring(i10, i11));
            i10 = i11 + 1;
            if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                i10 = i11 + 2;
            }
        }
        if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
            dVar.i(str.substring(i10));
        }
        dVar.f(dVar.n);
        we.a a2 = dVar.j.a(new m5.e(24, dVar.k, dVar.m));
        Iterator it = dVar.o.iterator();
        while (it.hasNext()) {
            ((xe.a) it.next()).g(a2);
        }
        ve.f fVar = (ve.f) dVar.l.b;
        Iterator it2 = ((ArrayList) this.e).iterator();
        if (it2.hasNext()) {
            throw a1.g.h(it2);
        }
        return fVar;
    }

    public void q() {
        boolean z10;
        if (((e) this.c) != null) {
            return;
        }
        e eVar = (e) ((ArrayDeque) this.b).pollFirst();
        this.c = eVar;
        if (eVar == null) {
            return;
        }
        c cVar = new c(this, eVar, 0);
        this.d = cVar;
        i0.h3(cVar, 10000L);
        b bVar = eVar.b;
        String str = bVar.b;
        String str2 = bVar.f;
        d dVar = new d(this, eVar);
        android.support.v4.media.session.a0 k10 = k.k(str);
        byte[] f7 = k.f(str2);
        int i10 = 0;
        if (k10 != null && f7 != null) {
            try {
                z10 = a.a.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                f8.g(th2, true);
                z10 = false;
            }
            if (z10) {
                synchronized (k.y) {
                    k kVar = k.A;
                    if (kVar != null) {
                        kVar.q();
                        k.A = null;
                    }
                    try {
                        k kVar2 = new k(k10, str2, f7);
                        k.A = kVar2;
                        kVar2.x = dVar;
                        u0 u0Var = u0.f;
                        if (u0Var != null) {
                            u0Var.d.add(kVar2);
                        }
                        kVar2.j.execute(new g(kVar2, 1));
                        i0.g3(new g(kVar2, 2));
                        i10 = k.A.i.getLocalPort();
                    } catch (Exception e) {
                        f8.g(e, true);
                        k kVar3 = k.A;
                        if (kVar3 != null) {
                            kVar3.q();
                            k.A = null;
                        }
                    }
                }
            }
        }
        eVar.d = i10;
        if (i10 == 0) {
            k(eVar);
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        int i11 = this.a;
    }

    public void s(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.d;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ void t() {
        int i10 = this.a;
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return ((za.c) this.e).toString();
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.d).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        e0.q(e0.b((cd.h) this.b), new bb.l(this, arrayList, null, 2));
    }

    public void v(View view) {
        l.d dVar = (l.d) this.e;
        if (((View) this.c) == view) {
            return;
        }
        w(null);
        View view2 = (View) this.c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(dVar);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(dVar);
            if (view.isAttachedToWindow()) {
                w(view.getViewTreeObserver());
            }
        }
        this.c = view;
    }

    public void w(ViewTreeObserver viewTreeObserver) {
        jf.d dVar = (jf.d) this.b;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.d;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.d).removeOnGlobalLayoutListener(dVar);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
        }
        this.d = viewTreeObserver;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    @Override // org.telegram.ui.Components.lj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(View view, o0 o0Var, boolean z10, boolean z11) {
        float f7;
        p0 p0Var;
        m0 l4;
        float f10;
        int i10;
        float f11;
        float f12;
        p0 p0Var2;
        m0 l10;
        float f13;
        int i11;
        float f14;
        switch (this.a) {
            case 10:
                un unVar = (un) this.b;
                z A8 = unVar.A8(((jj) this.c).f1(), true);
                float f15 = 0.0f;
                if (A8 instanceof q1) {
                    p0 p0Var3 = ((q1) A8).N;
                    m0 l11 = p0Var3.l(o0Var);
                    if (l11 == null) {
                        f11 = 0.0f;
                        f7 = f11;
                        unVar.qb(A8, (jj) this.c, (mj0) this.d, view, f15, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
                        ((kt0) this.e).c(false);
                        break;
                    } else {
                        f15 = p0Var3.b + l11.w + (l11.z / 2.0f);
                        f10 = p0Var3.c + l11.x;
                        i10 = l11.A;
                    }
                } else if (!(A8 instanceof s0) || (l4 = (p0Var = ((s0) A8).E0).l(o0Var)) == null) {
                    f7 = 0.0f;
                    unVar.qb(A8, (jj) this.c, (mj0) this.d, view, f15, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
                    ((kt0) this.e).c(false);
                } else {
                    f15 = p0Var.b + l4.w + (l4.z / 2.0f);
                    f10 = p0Var.c + l4.x;
                    i10 = l4.A;
                }
                f11 = f10 + (i10 / 2.0f);
                f7 = f11;
                unVar.qb(A8, (jj) this.c, (mj0) this.d, view, f15, f7, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
                ((kt0) this.e).c(false);
                break;
            default:
                un unVar2 = (un) this.b;
                z A82 = unVar2.A8(((jj) this.c).f1(), true);
                float f16 = 0.0f;
                if (A82 instanceof q1) {
                    p0 p0Var4 = ((q1) A82).N;
                    m0 l12 = p0Var4.l(o0Var);
                    if (l12 == null) {
                        f14 = 0.0f;
                        f12 = f14;
                        unVar2.qb(A82, (jj) this.c, (mj0) this.d, view, f16, f12, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
                        ((x91) this.e).c(false);
                        break;
                    } else {
                        f16 = p0Var4.b + l12.w + (l12.z / 2.0f);
                        f13 = p0Var4.c + l12.x;
                        i11 = l12.A;
                    }
                } else if (!(A82 instanceof s0) || (l10 = (p0Var2 = ((s0) A82).E0).l(o0Var)) == null) {
                    f12 = 0.0f;
                    unVar2.qb(A82, (jj) this.c, (mj0) this.d, view, f16, f12, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
                    ((x91) this.e).c(false);
                } else {
                    f16 = p0Var2.b + l10.w + (l10.z / 2.0f);
                    f13 = p0Var2.c + l10.x;
                    i11 = l10.A;
                }
                f14 = f13 + (i11 / 2.0f);
                f12 = f14;
                unVar2.qb(A82, (jj) this.c, (mj0) this.d, view, f16, f12, o0Var, false, (o0Var == null && o0Var.a) ? true : z10, z11, false);
                ((x91) this.e).c(false);
                break;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public f(jf.d dVar) {
        this.a = 7;
        this.e = new l.d(this, 2);
        this.b = dVar;
    }

    public f(c0 c0Var, ce.g gVar, n nVar) {
        this.a = 5;
        this.b = c0Var;
        this.c = nVar;
        vd.a[] aVarArr = vd.a.a;
        this.d = new vd.b(ConnectionsManager.DEFAULT_DATACENTER_ID);
        int i10 = 0;
        this.e = new AtomicInteger(0);
        f1 f1Var = (f1) c0Var.c().get(b0.b);
        if (f1Var == null) {
            return;
        }
        f1Var.invokeOnCompletion(new k1.i(i10, gVar, this));
    }

    public f(bh.d dVar) {
        this.a = 15;
        ArrayList arrayList = (ArrayList) dVar.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) dVar.d;
        LinkedHashSet linkedHashSet2 = se.d.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(se.d.q.get((Class) it.next()));
        }
        this.b = arrayList2;
        we.b bVar = (u9.b) dVar.e;
        bVar = bVar == null ? new oa.d(25) : bVar;
        this.d = bVar;
        this.e = (ArrayList) dVar.c;
        ArrayList arrayList3 = (ArrayList) dVar.b;
        this.c = arrayList3;
        bVar.a(new m5.e(24, arrayList3, Collections.EMPTY_MAP));
    }

    public f(v2 v2Var) {
        this.a = 9;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = null;
        this.b = v2Var;
    }

    public f(cd.h hVar) {
        this.a = 2;
        this.b = hVar;
        this.d = new LinkedBlockingDeque(20);
        this.e = new a9.d(this, 1);
    }

    public f(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                break;
            default:
                this.b = new ArrayDeque();
                break;
        }
    }

    public f(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.a = 1;
        this.e = typeface;
        this.b = bVar;
        this.d = new s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i14 = a2 + bVar.a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.c = new char[i10 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i15 = a10 + bVar.a;
            i11 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            o oVar = new o(this, i16);
            p1.a b10 = oVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.a) : 0, (char[]) this.c, i16 * 2);
            p1.a b11 = oVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                s sVar = (s) this.d;
                p1.a b12 = oVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.a;
                    i13 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                sVar.a(oVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public f(dg.f fVar) {
        this.a = 3;
        LinearLayout linearLayout = new LinearLayout(fVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(i0.L(4.0f), i0.L(2.0f), i0.L(4.0f), i0.L(2.0f));
        if (fVar.E) {
            TextView textView = new TextView(fVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = i0.L(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(i0.o());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(fVar.getContext());
        this.c = textView2;
        linearLayout.addView(textView2, b6.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        n5 n5Var = new n5(fVar.getContext());
        this.b = n5Var;
        linearLayout.addView(n5Var, b6.o(-1, -2));
        textView2.setGravity(8388611);
        n5Var.setGravity(8388613);
        n5Var.setTypeface(i0.o());
        n5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public f(r1 r1Var, boolean[] zArr) {
        this.a = 14;
        this.b = r1Var;
        this.c = zArr;
        int i10 = r1Var.a;
        this.d = new boolean[i10];
        this.e = new boolean[i10];
    }

    private final /* synthetic */ void n() {
    }

    private final /* synthetic */ void o() {
    }

    private final /* synthetic */ void i(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }

    private final /* synthetic */ void j(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
