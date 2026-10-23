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
import org.telegram.tgnet.ConnectionsManager;
import v7.d7;
import v7.d8;
import v7.e8;
import v7.f9;
import v7.h9;
import v7.j9;
import v7.y8;
import x7.fa;
import x7.i9;
import x7.o7;
import x7.pa;
import z7.hb;
import z7.we;
import z7.wf;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
        j9 j9Var;
        y8 y8Var = (y8) this.b;
        a5.a aVar = (a5.a) this.c;
        v7.j6 j6Var = (v7.j6) this.d;
        String str2 = (String) this.e;
        qi.e eVar = (qi.e) aVar.c;
        eVar.b = j6Var;
        e8 e8Var = (e8) eVar.a;
        if (e8Var != null) {
            str = e8Var.d;
            int i10 = d7.a;
            if (str != null) {
            }
        }
        str = "NA";
        d8 d8Var = new d8();
        d8Var.a = y8Var.a;
        d8Var.b = y8Var.b;
        synchronized (y8.class) {
            j9Var = y8.j;
            if (j9Var == null) {
                n0.c a2 = w7.z.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    m2.t tVar = rb.c.a;
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
                f9 f9Var = h9.b;
                j9Var = i12 == 0 ? j9.e : new j9(i12, objArr);
                y8.j = j9Var;
            }
        }
        d8Var.k = j9Var;
        d8Var.g = Boolean.TRUE;
        d8Var.d = str;
        d8Var.c = str2;
        d8Var.e = y8Var.f.isSuccessful() ? (String) y8Var.f.getResult() : y8Var.d.a();
        d8Var.i = 10;
        d8Var.j = Integer.valueOf(y8Var.h);
        aVar.d = d8Var;
        y8Var.c.a(aVar);
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
        fa faVar = (fa) this.b;
        a5.a aVar = (a5.a) this.c;
        o7 o7Var = (o7) this.d;
        String str2 = (String) this.e;
        com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) aVar.c;
        lVar.b = o7Var;
        i9 i9Var = (i9) lVar.a;
        if (i9Var != null) {
            str = i9Var.d;
            int i10 = pa.a;
            if (str != null) {
            }
        }
        str = "NA";
        d8 d8Var = new d8();
        d8Var.a = faVar.a;
        d8Var.b = faVar.b;
        synchronized (fa.class) {
            sVar = fa.k;
            if (sVar == null) {
                n0.c a2 = w7.z.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    m2.t tVar = rb.c.a;
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
                fa.k = sVar;
            }
        }
        d8Var.k = sVar;
        d8Var.g = Boolean.TRUE;
        d8Var.d = str;
        d8Var.c = str2;
        d8Var.e = faVar.f.isSuccessful() ? (String) faVar.f.getResult() : faVar.d.a();
        d8Var.i = 10;
        d8Var.j = Integer.valueOf(faVar.h);
        aVar.d = d8Var;
        faVar.c.a(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r5.isEmpty() == false) goto L11;
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
        int i11 = 0;
        switch (this.a) {
            case 0:
                q qVar = (q) this.b;
                p4.v vVar = (p4.v) this.c;
                p4.v vVar2 = (p4.v) this.d;
                c0.i iVar = (c0.i) this.e;
                u uVar = qVar.a;
                uVar.getClass();
                g6.b bVar = u.i;
                Set set = uVar.b;
                if (new HashSet(set).isEmpty()) {
                    bVar.b("No need to prepare transfer without any callback", new Object[0]);
                    iVar.a(null);
                    return;
                }
                if (vVar.l != 1) {
                    bVar.b("No need to prepare transfer when transferring from local", new Object[0]);
                    iVar.a(null);
                    return;
                }
                e6.h a2 = uVar.a();
                if (a2 == null || !a2.h()) {
                    bVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    iVar.a(null);
                    return;
                }
                bVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (vVar2.l == 0) {
                    d2.a(d1.g0);
                    i10 = 1;
                } else {
                    i10 = CastDevice.b(vVar2.s) == null ? 3 : 2;
                }
                uVar.e = i10;
                uVar.g = iVar;
                bVar.b("notify transferring with type = %d", Integer.valueOf(i10));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    y0 y0Var = (y0) it.next();
                    int i12 = uVar.e;
                    switch (y0Var.a) {
                        case 0:
                            a1.j.b("onTransferring with type = %d", Integer.valueOf(i12));
                            a1 a1Var = (a1) y0Var.b;
                            a1Var.i = true;
                            a1Var.c();
                            r1 b10 = a1Var.c.b(a1Var.g);
                            m1 m10 = n1.m(b10.d());
                            m10.c();
                            n1.v((n1) m10.b, i12);
                            b10.e((n1) m10.a());
                            a1Var.a.a((s1) b10.a(), 230);
                            break;
                        default:
                            a5.a aVar = new a5.a(10, 2);
                            z5 z5Var = (z5) y0Var.b;
                            aVar.d = Boolean.valueOf(((d) z5Var.c).d == 2);
                            z5.D(z5Var, new x6(aVar));
                            w6 E = z5Var.E();
                            b bVar2 = new b(new a(i12));
                            bVar2.c = E.h;
                            E.c.add(bVar2);
                            break;
                    }
                }
                uVar.h = null;
                n6.l.e("Must be called from the main thread.");
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
                        rVar = new c6.r(new c6.k(d, nVar, bool, a10, d10, e.v, e.E, null, null, null, null, 0L), null);
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
                task.addOnSuccessListener(new s(uVar)).addOnFailureListener(new s(uVar));
                a0 a0Var = uVar.c;
                n6.l.h(a0Var);
                t tVar = uVar.d;
                n6.l.h(tVar);
                a0Var.postDelayed(tVar, 10000L);
                return;
            case 1:
                l.e eVar = (l.e) ((ki.t1) this.e).b;
                l.m mVar2 = (l.m) this.c;
                l.d dVar = (l.d) this.b;
                if (dVar != null) {
                    eVar.P = true;
                    dVar.b.c(false);
                    eVar.P = false;
                }
                if (mVar2.isEnabled() && mVar2.hasSubMenu()) {
                    ((l.k) this.d).q(mVar2, null, 4);
                    return;
                }
                return;
            case 2:
                ((k2.w0) this.b).h((p4.p) this.e, (p4.m) this.c, (Collection) this.d);
                return;
            case 3:
                ((k2.w0) this.b).h((p4.p) this.e, (p4.m) this.c, (ArrayList) this.d);
                return;
            case 4:
                r0.q0.h((View) this.b, (r0.v0) this.c, (mi.q) this.d);
                ((ValueAnimator) this.e).start();
                return;
            case 5:
                Handler handler = (Handler) this.b;
                if (((AtomicBoolean) this.e).compareAndSet(false, true)) {
                    handler.removeCallbacks((u2.k0) this.d);
                    if (Looper.myLooper() == handler.getLooper()) {
                        ((tf.b) this.c).a(false);
                        return;
                    } else {
                        handler.post(new tg.p(this, 2));
                        return;
                    }
                }
                return;
            case 6:
                a();
                return;
            case 7:
                b();
                return;
            default:
                wf wfVar = (wf) this.b;
                a5.a aVar2 = (a5.a) this.c;
                hb hbVar = (hb) this.d;
                String str2 = (String) this.e;
                m.s3 s3Var = (m.s3) aVar2.c;
                s3Var.b = hbVar;
                we weVar = (we) s3Var.a;
                if (weVar != null) {
                    str = weVar.d;
                    int i13 = z7.l4.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                d8 d8Var = new d8();
                d8Var.a = wfVar.a;
                d8Var.b = wfVar.b;
                synchronized (wf.class) {
                    mVar = wf.k;
                    if (mVar == null) {
                        n0.c a11 = w7.z.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i14 = 0;
                        while (i11 < a11.a.size()) {
                            Locale locale = a11.a.get(i11);
                            m2.t tVar2 = rb.c.a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i15 = i14 + 1;
                            int length = objArr.length;
                            if (length < i15) {
                                int i16 = length + (length >> 1) + 1;
                                if (i16 < i15) {
                                    int highestOneBit = Integer.highestOneBit(i14);
                                    i16 = highestOneBit + highestOneBit;
                                }
                                if (i16 < 0) {
                                    i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                }
                                objArr = Arrays.copyOf(objArr, i16);
                            }
                            objArr[i14] = languageTag;
                            i11++;
                            i14 = i15;
                        }
                        mVar = z7.i.q(i14, objArr);
                        wf.k = mVar;
                    }
                }
                d8Var.k = mVar;
                d8Var.g = Boolean.TRUE;
                d8Var.d = str;
                d8Var.c = str2;
                d8Var.e = wfVar.f.isSuccessful() ? (String) wfVar.f.getResult() : wfVar.d.a();
                d8Var.i = 10;
                d8Var.j = Integer.valueOf(wfVar.h);
                aVar2.d = d8Var;
                wfVar.c.a(aVar2);
                return;
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public p(Handler handler, tf.b bVar, long j10) {
        this.a = 5;
        this.e = new AtomicBoolean(false);
        this.b = handler;
        this.c = bVar;
        u2.k0 k0Var = new u2.k0(2, this, bVar);
        this.d = k0Var;
        if (j10 > 0) {
            handler.postDelayed(k0Var, j10);
        }
    }
}
