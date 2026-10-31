package com.google.android.gms.internal.cast;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import v7.a7;
import v7.a8;
import v7.b8;
import v7.e9;
import v7.g9;
import v7.i9;
import v7.x8;
import x7.ga;
import x7.j9;
import x7.o7;
import x7.qa;
import z7.hb;
import z7.xe;
import z7.xf;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        i9 i9Var;
        x8 x8Var = (x8) this.b;
        a5.a aVar = (a5.a) this.c;
        v7.g6 g6Var = (v7.g6) this.d;
        String str2 = (String) this.e;
        xa.n nVar = (xa.n) aVar.c;
        nVar.b = g6Var;
        b8 b8Var = (b8) nVar.a;
        if (b8Var != null) {
            str = b8Var.d;
            int i10 = a7.a;
            if (str != null) {
            }
        }
        str = "NA";
        a8 a8Var = new a8();
        a8Var.a = x8Var.a;
        a8Var.b = x8Var.b;
        synchronized (x8.class) {
            i9Var = x8.j;
            if (i9Var == null) {
                n0.c a2 = w7.c0.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    c5.a aVar2 = jb.c.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i13 = i12 + 1;
                    int length = objArr.length;
                    if (length < i13) {
                        int i14 = length + (length >> 1) + 1;
                        if (i14 < i13) {
                            int highestOneBit = Integer.highestOneBit(i12);
                            i14 = highestOneBit + highestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i14);
                    }
                    objArr[i12] = languageTag;
                    i11++;
                    i12 = i13;
                }
                e9 e9Var = g9.b;
                i9Var = i12 == 0 ? i9.e : new i9(i12, objArr);
                x8.j = i9Var;
            }
        }
        a8Var.k = i9Var;
        a8Var.g = Boolean.TRUE;
        a8Var.d = str;
        a8Var.c = str2;
        a8Var.e = x8Var.f.isSuccessful() ? (String) x8Var.f.getResult() : x8Var.d.a();
        a8Var.i = 10;
        a8Var.j = Integer.valueOf(x8Var.h);
        aVar.d = a8Var;
        x8Var.c.a(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        x7.s sVar;
        ga gaVar = (ga) this.b;
        a5.a aVar = (a5.a) this.c;
        o7 o7Var = (o7) this.d;
        String str2 = (String) this.e;
        j2.f fVar = (j2.f) aVar.c;
        fVar.b = o7Var;
        j9 j9Var = (j9) fVar.a;
        if (j9Var != null) {
            str = j9Var.d;
            int i10 = qa.a;
            if (str != null) {
            }
        }
        str = "NA";
        a8 a8Var = new a8();
        a8Var.a = gaVar.a;
        a8Var.b = gaVar.b;
        synchronized (ga.class) {
            sVar = ga.k;
            if (sVar == null) {
                n0.c a2 = w7.c0.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    c5.a aVar2 = jb.c.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i13 = i12 + 1;
                    int length = objArr.length;
                    if (length < i13) {
                        int i14 = length + (length >> 1) + 1;
                        if (i14 < i13) {
                            int highestOneBit = Integer.highestOneBit(i12);
                            i14 = highestOneBit + highestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i14);
                    }
                    objArr[i12] = languageTag;
                    i11++;
                    i12 = i13;
                }
                x7.m mVar = x7.o.b;
                sVar = i12 == 0 ? x7.s.e : new x7.s(i12, objArr);
                ga.k = sVar;
            }
        }
        a8Var.k = sVar;
        a8Var.g = Boolean.TRUE;
        a8Var.d = str;
        a8Var.c = str2;
        a8Var.e = gaVar.f.isSuccessful() ? (String) gaVar.f.getResult() : gaVar.d.a();
        a8Var.i = 10;
        a8Var.j = Integer.valueOf(gaVar.h);
        aVar.d = a8Var;
        gaVar.c.a(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r7.isEmpty() == false) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        Task task;
        String str;
        z7.m mVar;
        c6.r rVar = null;
        int i11 = 4;
        int i12 = 0;
        switch (this.a) {
            case 0:
                p pVar = (p) this.b;
                p4.w wVar = (p4.w) this.c;
                p4.w wVar2 = (p4.w) this.d;
                c0.i iVar = (c0.i) this.e;
                t tVar = pVar.a;
                tVar.getClass();
                g6.b bVar = t.i;
                Set set = tVar.b;
                if (new HashSet(set).isEmpty()) {
                    bVar.b("No need to prepare transfer without any callback", new Object[0]);
                    iVar.a(null);
                    return;
                }
                if (wVar.l != 1) {
                    bVar.b("No need to prepare transfer when transferring from local", new Object[0]);
                    iVar.a(null);
                    return;
                }
                e6.h a2 = tVar.a();
                if (a2 == null || !a2.h()) {
                    bVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    iVar.a(null);
                    return;
                }
                bVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (wVar2.l == 0) {
                    c2.a(c1.g0);
                    i10 = 1;
                } else {
                    i10 = CastDevice.b(wVar2.s) == null ? 3 : 2;
                }
                tVar.e = i10;
                tVar.g = iVar;
                bVar.b("notify transferring with type = %d", Integer.valueOf(i10));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    x0 x0Var = (x0) it.next();
                    int i13 = tVar.e;
                    switch (x0Var.a) {
                        case 0:
                            z0.j.b("onTransferring with type = %d", Integer.valueOf(i13));
                            z0 z0Var = (z0) x0Var.b;
                            z0Var.i = true;
                            z0Var.c();
                            q1 b10 = z0Var.c.b(z0Var.g);
                            l1 m10 = m1.m(b10.d());
                            m10.c();
                            m1.v((m1) m10.b, i13);
                            b10.e((m1) m10.a());
                            z0Var.a.a((r1) b10.a(), zs.G3);
                            break;
                        default:
                            a5.a aVar = new a5.a(10, 3);
                            bh.d dVar = (bh.d) x0Var.b;
                            aVar.d = Boolean.valueOf(((c) dVar.b).d == 2);
                            bh.d.O(dVar, new u6(aVar));
                            t6 P = dVar.P();
                            a aVar2 = new a(new ae.j(i13));
                            aVar2.c = P.h;
                            P.c.add(aVar2);
                            break;
                    }
                }
                tVar.h = null;
                n6.l.d("Must be called from the main thread.");
                if (a2.w()) {
                    a2.g = new TaskCompletionSource();
                    e6.h.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a2.d();
                    c6.q e = a2.e();
                    if (d != null && e != null) {
                        Boolean bool = Boolean.TRUE;
                        long a10 = a2.a();
                        c6.n nVar = e.L;
                        double d10 = e.d;
                        if (Double.compare(d10, 2.0d) > 0 || Double.compare(d10, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        rVar = new c6.r(new c6.k(d, nVar, bool, a10, d10, e.w, e.E, null, null, null, null, 0L), null);
                    }
                    if (rVar != null) {
                        a2.g.setResult(rVar);
                    } else {
                        a2.g.setException(new g6.k());
                    }
                    task = a2.g.getTask();
                } else {
                    task = Tasks.forException(new g6.k());
                }
                task.addOnSuccessListener(new r(tVar)).addOnFailureListener(new r(tVar));
                z zVar = tVar.c;
                n6.l.g(zVar);
                s sVar = tVar.d;
                n6.l.g(sVar);
                zVar.postDelayed(sVar, 10000L);
                return;
            case 1:
                l.f fVar = (l.f) ((a4.l) this.e).b;
                l.n nVar2 = (l.n) this.c;
                l.e eVar = (l.e) this.b;
                if (eVar != null) {
                    fVar.P = true;
                    eVar.b.c(false);
                    fVar.P = false;
                }
                if (nVar2.isEnabled() && nVar2.hasSubMenu()) {
                    ((l.l) this.d).q(nVar2, null, 4);
                    return;
                }
                return;
            case 2:
                Handler handler = (Handler) this.b;
                if (((AtomicBoolean) this.e).compareAndSet(false, true)) {
                    handler.removeCallbacks((k2.u) this.d);
                    if (Looper.myLooper() == handler.getLooper()) {
                        ((lf.b) this.c).a(false);
                        return;
                    } else {
                        handler.post(new lg.s(this, i11));
                        return;
                    }
                }
                return;
            case 3:
                ((n2.u) this.b).P((p4.p) this.e, (p4.m) this.c, (Collection) this.d);
                return;
            case 4:
                ((n2.u) this.b).P((p4.p) this.e, (p4.m) this.c, (ArrayList) this.d);
                return;
            case 5:
                r0.p0.h((View) this.b, (r0.u0) this.c, (m5.e) this.d);
                ((ValueAnimator) this.e).start();
                return;
            case 6:
                a();
                return;
            case 7:
                b();
                return;
            default:
                xf xfVar = (xf) this.b;
                a5.a aVar3 = (a5.a) this.c;
                hb hbVar = (hb) this.d;
                String str2 = (String) this.e;
                m.p3 p3Var = (m.p3) aVar3.c;
                p3Var.b = hbVar;
                xe xeVar = (xe) p3Var.a;
                if (xeVar != null) {
                    str = xeVar.d;
                    int i14 = z7.l4.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                a8 a8Var = new a8();
                a8Var.a = xfVar.a;
                a8Var.b = xfVar.b;
                synchronized (xf.class) {
                    mVar = xf.k;
                    if (mVar == null) {
                        n0.c a11 = w7.c0.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i15 = 0;
                        while (i12 < a11.a.size()) {
                            Locale locale = a11.a.get(i12);
                            c5.a aVar4 = jb.c.a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i16 = i15 + 1;
                            int length = objArr.length;
                            if (length < i16) {
                                int i17 = length + (length >> 1) + 1;
                                if (i17 < i16) {
                                    int highestOneBit = Integer.highestOneBit(i15);
                                    i17 = highestOneBit + highestOneBit;
                                }
                                if (i17 < 0) {
                                    i17 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                }
                                objArr = Arrays.copyOf(objArr, i17);
                            }
                            objArr[i15] = languageTag;
                            i12++;
                            i15 = i16;
                        }
                        mVar = z7.i.q(i15, objArr);
                        xf.k = mVar;
                    }
                }
                a8Var.k = mVar;
                a8Var.g = Boolean.TRUE;
                a8Var.d = str;
                a8Var.c = str2;
                a8Var.e = xfVar.f.isSuccessful() ? (String) xfVar.f.getResult() : xfVar.d.a();
                a8Var.i = 10;
                a8Var.j = Integer.valueOf(xfVar.h);
                aVar3.d = a8Var;
                xfVar.c.a(aVar3);
                return;
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public o(Handler handler, lf.b bVar, long j10) {
        this.a = 2;
        this.e = new AtomicBoolean(false);
        this.b = handler;
        this.c = bVar;
        k2.u uVar = new k2.u(22, this, bVar);
        this.d = uVar;
        if (j10 > 0) {
            handler.postDelayed(uVar, j10);
        }
    }
}
