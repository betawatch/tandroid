package c2;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.m1;
import com.google.android.gms.internal.cast.n1;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.cast.u6;
import com.google.android.gms.internal.cast.v6;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j7.c9;
import j7.g7;
import j7.g8;
import j7.h8;
import j7.j9;
import j7.l9;
import j7.m6;
import j7.n9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l7.la;
import l7.o9;
import l7.u7;
import l7.va;
import m.s3;
import n7.ib;
import n7.l4;
import n7.xe;
import n7.xf;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
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
        l7.w wVar;
        la laVar = (la) this.b;
        b4.e0 e0Var = (b4.e0) this.c;
        u7 u7Var = (u7) this.e;
        String str2 = (String) this.d;
        a9.a aVar = (a9.a) e0Var.c;
        aVar.b = u7Var;
        o9 o9Var = (o9) aVar.a;
        if (o9Var != null) {
            str = o9Var.d;
            int i10 = va.a;
            if (str != null) {
            }
        }
        str = "NA";
        g8 g8Var = new g8();
        g8Var.a = laVar.a;
        g8Var.b = laVar.b;
        synchronized (la.class) {
            wVar = la.k;
            if (wVar == null) {
                n0.c a2 = k7.w.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    b6.h hVar = cb.c.a;
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
                l7.q qVar = l7.s.b;
                wVar = i12 == 0 ? l7.w.e : new l7.w(i12, objArr);
                la.k = wVar;
            }
        }
        g8Var.k = wVar;
        g8Var.g = Boolean.TRUE;
        g8Var.d = str;
        g8Var.c = str2;
        g8Var.e = laVar.f.isSuccessful() ? (String) laVar.f.getResult() : laVar.d.a();
        g8Var.i = 10;
        g8Var.j = Integer.valueOf(laVar.h);
        e0Var.d = g8Var;
        laVar.c.a(e0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        n7.m mVar;
        xf xfVar = (xf) this.b;
        b4.e0 e0Var = (b4.e0) this.c;
        ib ibVar = (ib) this.e;
        String str2 = (String) this.d;
        s3 s3Var = (s3) e0Var.c;
        s3Var.b = ibVar;
        xe xeVar = (xe) s3Var.a;
        if (xeVar != null) {
            str = xeVar.d;
            int i10 = l4.a;
            if (str != null) {
            }
        }
        str = "NA";
        g8 g8Var = new g8();
        g8Var.a = xfVar.a;
        g8Var.b = xfVar.b;
        synchronized (xf.class) {
            mVar = xf.k;
            if (mVar == null) {
                n0.c a2 = k7.w.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    b6.h hVar = cb.c.a;
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
                mVar = n7.i.r(i12, objArr);
                xf.k = mVar;
            }
        }
        g8Var.k = mVar;
        g8Var.g = Boolean.TRUE;
        g8Var.d = str;
        g8Var.c = str2;
        g8Var.e = xfVar.f.isSuccessful() ? (String) xfVar.f.getResult() : xfVar.d.a();
        g8Var.i = 10;
        g8Var.j = Integer.valueOf(xfVar.h);
        e0Var.d = g8Var;
        xfVar.c.a(e0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r7.isEmpty() == false) goto L26;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        Task task;
        String str;
        n9 n9Var;
        q5.r rVar = null;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                ((androidx.biometric.e0) this.b).u((r) this.d, (n) this.c, (Collection) this.e);
                return;
            case 1:
                ((androidx.biometric.e0) this.b).u((r) this.d, (n) this.c, (ArrayList) this.e);
                return;
            case 2:
                com.google.android.gms.internal.cast.o oVar = (com.google.android.gms.internal.cast.o) this.b;
                b0 b0Var = (b0) this.c;
                b0 b0Var2 = (b0) this.e;
                c0.i iVar = (c0.i) this.d;
                com.google.android.gms.internal.cast.s sVar = oVar.a;
                sVar.getClass();
                u5.b bVar = com.google.android.gms.internal.cast.s.i;
                Set set = sVar.b;
                if (new HashSet(set).isEmpty()) {
                    bVar.b("No need to prepare transfer without any callback", new Object[0]);
                    iVar.a();
                    return;
                }
                if (b0Var.l != 1) {
                    bVar.b("No need to prepare transfer when transferring from local", new Object[0]);
                    iVar.a();
                    return;
                }
                s5.h a2 = sVar.a();
                if (a2 == null || !a2.h()) {
                    bVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    iVar.a();
                    return;
                }
                bVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (b0Var2.l == 0) {
                    d2.a(d1.d0);
                    i10 = 1;
                } else {
                    i10 = CastDevice.e(b0Var2.s) == null ? 3 : 2;
                }
                sVar.e = i10;
                sVar.g = iVar;
                bVar.b("notify transferring with type = %d", Integer.valueOf(i10));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.cast.y0 y0Var = (com.google.android.gms.internal.cast.y0) it.next();
                    int i13 = sVar.e;
                    switch (y0Var.a) {
                        case 0:
                            com.google.android.gms.internal.cast.a1.j.b("onTransferring with type = %d", Integer.valueOf(i13));
                            com.google.android.gms.internal.cast.a1 a1Var = (com.google.android.gms.internal.cast.a1) y0Var.b;
                            a1Var.i = true;
                            a1Var.c();
                            r1 b10 = a1Var.c.b(a1Var.g);
                            m1 m9 = n1.m(b10.d());
                            m9.c();
                            n1.v((n1) m9.b, i13);
                            b10.e((n1) m9.a());
                            a1Var.a.a((s1) b10.a(), 230);
                            break;
                        default:
                            b4.e0 e0Var = new b4.e0(10, 3);
                            c5.j jVar = (c5.j) y0Var.b;
                            e0Var.d = Boolean.valueOf(((com.google.android.gms.internal.cast.c) jVar.b).d == 2);
                            c5.j.D(jVar, new v6(e0Var));
                            u6 E = jVar.E();
                            com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a(new c5.c(i13));
                            aVar.c = E.h;
                            E.c.add(aVar);
                            break;
                    }
                }
                sVar.h = null;
                b6.m.e("Must be called from the main thread.");
                if (a2.w()) {
                    a2.g = new TaskCompletionSource();
                    s5.h.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a2.d();
                    q5.q e = a2.e();
                    if (d != null && e != null) {
                        Boolean bool = Boolean.TRUE;
                        long a10 = a2.a();
                        q5.n nVar = e.I;
                        double d10 = e.d;
                        if (Double.compare(d10, 2.0d) > 0 || Double.compare(d10, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        rVar = new q5.r(new q5.k(d, nVar, bool, a10, d10, e.v, e.B, null, null, null, null, 0L), null);
                    }
                    if (rVar != null) {
                        a2.g.setResult(rVar);
                    } else {
                        a2.g.setException(new u5.l());
                    }
                    task = a2.g.getTask();
                } else {
                    task = Tasks.forException(new u5.l());
                }
                task.addOnSuccessListener(new com.google.android.gms.internal.cast.q(sVar)).addOnFailureListener(new com.google.android.gms.internal.cast.q(sVar));
                a7.e eVar = sVar.c;
                b6.m.h(eVar);
                com.google.android.gms.internal.cast.r rVar2 = sVar.d;
                b6.m.h(rVar2);
                eVar.postDelayed(rVar2, 10000L);
                return;
            case 3:
                Handler handler = (Handler) this.b;
                if (((AtomicBoolean) this.d).compareAndSet(false, true)) {
                    handler.removeCallbacks((a1.e) this.e);
                    if (Looper.myLooper() == handler.getLooper()) {
                        ((df.b) this.c).a(false);
                        return;
                    } else {
                        handler.post(new e3.h(this, i12));
                        return;
                    }
                }
                return;
            case 4:
                c9 c9Var = (c9) this.b;
                b4.e0 e0Var2 = (b4.e0) this.c;
                m6 m6Var = (m6) this.e;
                String str2 = (String) this.d;
                com.google.firebase.messaging.r rVar3 = (com.google.firebase.messaging.r) e0Var2.c;
                rVar3.b = m6Var;
                h8 h8Var = (h8) rVar3.a;
                if (h8Var != null) {
                    str = h8Var.d;
                    int i14 = g7.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                g8 g8Var = new g8();
                g8Var.a = c9Var.a;
                g8Var.b = c9Var.b;
                synchronized (c9.class) {
                    n9Var = c9.j;
                    if (n9Var == null) {
                        n0.c a11 = k7.w.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i15 = 0;
                        while (i11 < a11.a.size()) {
                            Locale locale = a11.a.get(i11);
                            b6.h hVar = cb.c.a;
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
                            i11++;
                            i15 = i16;
                        }
                        j9 j9Var = l9.b;
                        n9Var = i15 == 0 ? n9.e : new n9(i15, objArr);
                        c9.j = n9Var;
                    }
                }
                g8Var.k = n9Var;
                g8Var.g = Boolean.TRUE;
                g8Var.d = str;
                g8Var.c = str2;
                g8Var.e = c9Var.f.isSuccessful() ? (String) c9Var.f.getResult() : c9Var.d.a();
                g8Var.i = 10;
                g8Var.j = Integer.valueOf(c9Var.h);
                e0Var2.d = g8Var;
                c9Var.c.a(e0Var2);
                return;
            case 5:
                l.e eVar2 = (l.e) ((androidx.biometric.e0) this.d).b;
                l.m mVar = (l.m) this.c;
                l.d dVar = (l.d) this.b;
                if (dVar != null) {
                    eVar2.M = true;
                    dVar.b.c(false);
                    eVar2.M = false;
                }
                if (mVar.isEnabled() && mVar.hasSubMenu()) {
                    ((l.k) this.e).q(mVar, null, 4);
                    return;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                b();
                return;
            default:
                r0.r0.h((View) this.b, (r0.w0) this.c, (q5.c0) this.e);
                ((ValueAnimator) this.d).start();
                return;
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    public p(Handler handler, df.b bVar, long j10) {
        this.a = 3;
        this.d = new AtomicBoolean(false);
        this.b = handler;
        this.c = bVar;
        a1.e eVar = new a1.e(24, this, bVar);
        this.e = eVar;
        if (j10 > 0) {
            handler.postDelayed(eVar, j10);
        }
    }
}
