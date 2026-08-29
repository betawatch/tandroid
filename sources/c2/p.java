package c2;

import ag.j2;
import ag.o1;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import bg.c2;
import cg.m2;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.e1;
import com.google.android.gms.internal.cast.e2;
import com.google.android.gms.internal.cast.n1;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.cast.v6;
import com.google.android.gms.internal.cast.w6;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h7.a9;
import h7.d8;
import h7.e7;
import h7.e8;
import h7.h9;
import h7.j9;
import h7.k6;
import h7.l9;
import j7.la;
import j7.o9;
import j7.u7;
import j7.va;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l7.hb;
import l7.l4;
import l7.we;
import l7.wf;
import m.s3;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        j7.w wVar;
        la laVar = (la) this.b;
        j2 j2Var = (j2) this.c;
        u7 u7Var = (u7) this.e;
        String str2 = (String) this.d;
        c2 c2Var = (c2) j2Var.c;
        c2Var.b = u7Var;
        o9 o9Var = (o9) c2Var.a;
        if (o9Var != null) {
            str = o9Var.d;
            int i10 = va.a;
            if (str != null) {
            }
        }
        str = "NA";
        d8 d8Var = new d8();
        d8Var.a = laVar.a;
        d8Var.b = laVar.b;
        synchronized (la.class) {
            wVar = la.k;
            if (wVar == null) {
                n0.c a2 = i7.c0.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    d9.c cVar = ab.c.a;
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
                j7.q qVar = j7.s.b;
                wVar = i12 == 0 ? j7.w.e : new j7.w(i12, objArr);
                la.k = wVar;
            }
        }
        d8Var.k = wVar;
        d8Var.g = Boolean.TRUE;
        d8Var.d = str;
        d8Var.c = str2;
        d8Var.e = laVar.f.isSuccessful() ? (String) laVar.f.getResult() : laVar.d.a();
        d8Var.i = 10;
        d8Var.j = Integer.valueOf(laVar.h);
        j2Var.d = d8Var;
        laVar.c.a(j2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        l7.m mVar;
        wf wfVar = (wf) this.b;
        j2 j2Var = (j2) this.c;
        hb hbVar = (hb) this.e;
        String str2 = (String) this.d;
        s3 s3Var = (s3) j2Var.c;
        s3Var.b = hbVar;
        we weVar = (we) s3Var.a;
        if (weVar != null) {
            str = weVar.d;
            int i10 = l4.a;
            if (str != null) {
            }
        }
        str = "NA";
        d8 d8Var = new d8();
        d8Var.a = wfVar.a;
        d8Var.b = wfVar.b;
        synchronized (wf.class) {
            mVar = wf.k;
            if (mVar == null) {
                n0.c a2 = i7.c0.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    d9.c cVar = ab.c.a;
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
                mVar = l7.i.r(i12, objArr);
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
        j2Var.d = d8Var;
        wfVar.c.a(j2Var);
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
        l9 l9Var;
        o5.r rVar = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                ((o1) this.b).f((r) this.d, (n) this.c, (Collection) this.e);
                return;
            case 1:
                ((o1) this.b).f((r) this.d, (n) this.c, (ArrayList) this.e);
                return;
            case 2:
                com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.b;
                b0 b0Var = (b0) this.c;
                b0 b0Var2 = (b0) this.e;
                c0.i iVar = (c0.i) this.d;
                com.google.android.gms.internal.cast.t tVar = pVar.a;
                tVar.getClass();
                s5.b bVar = com.google.android.gms.internal.cast.t.i;
                Set set = tVar.b;
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
                q5.h a2 = tVar.a();
                if (a2 == null || !a2.h()) {
                    bVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    iVar.a();
                    return;
                }
                bVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (b0Var2.l == 0) {
                    e2.a(e1.c0);
                    i10 = 1;
                } else {
                    i10 = CastDevice.b(b0Var2.s) == null ? 3 : 2;
                }
                tVar.e = i10;
                tVar.g = iVar;
                bVar.b("notify transferring with type = %d", Integer.valueOf(i10));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.cast.z0 z0Var = (com.google.android.gms.internal.cast.z0) it.next();
                    int i12 = tVar.e;
                    switch (z0Var.a) {
                        case 0:
                            com.google.android.gms.internal.cast.b1.j.b("onTransferring with type = %d", Integer.valueOf(i12));
                            com.google.android.gms.internal.cast.b1 b1Var = (com.google.android.gms.internal.cast.b1) z0Var.b;
                            b1Var.i = true;
                            b1Var.c();
                            s1 b10 = b1Var.c.b(b1Var.g);
                            n1 m10 = com.google.android.gms.internal.cast.o1.m(b10.d());
                            m10.c();
                            com.google.android.gms.internal.cast.o1.v((com.google.android.gms.internal.cast.o1) m10.b, i12);
                            b10.e((com.google.android.gms.internal.cast.o1) m10.a());
                            b1Var.a.a((t1) b10.a(), 230);
                            break;
                        default:
                            j2 j2Var = new j2(10, 4);
                            a5.j jVar = (a5.j) z0Var.b;
                            j2Var.d = Boolean.valueOf(((com.google.android.gms.internal.cast.d) jVar.b).d == 2);
                            a5.j.y(jVar, new w6(j2Var));
                            v6 A = jVar.A();
                            com.google.android.gms.internal.cast.b bVar2 = new com.google.android.gms.internal.cast.b(new a5.c(i12));
                            bVar2.c = A.h;
                            A.c.add(bVar2);
                            break;
                    }
                }
                tVar.h = null;
                z5.l.e("Must be called from the main thread.");
                if (a2.w()) {
                    a2.g = new TaskCompletionSource();
                    q5.h.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a2.d();
                    o5.q e10 = a2.e();
                    if (d != null && e10 != null) {
                        Boolean bool = Boolean.TRUE;
                        long a10 = a2.a();
                        o5.n nVar = e10.H;
                        double d10 = e10.d;
                        if (Double.compare(d10, 2.0d) > 0 || Double.compare(d10, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        rVar = new o5.r(new o5.k(d, nVar, bool, a10, d10, e10.v, e10.A, null, null, null, null, 0L), null);
                    }
                    if (rVar != null) {
                        a2.g.setResult(rVar);
                    } else {
                        a2.g.setException(new s5.l());
                    }
                    task = a2.g.getTask();
                } else {
                    task = Tasks.forException(new s5.l());
                }
                task.addOnSuccessListener(new com.google.android.gms.internal.cast.r(tVar)).addOnFailureListener(new com.google.android.gms.internal.cast.r(tVar));
                v0 v0Var = tVar.c;
                z5.l.h(v0Var);
                com.google.android.gms.internal.cast.s sVar = tVar.d;
                z5.l.h(sVar);
                v0Var.postDelayed(sVar, 10000L);
                return;
            case 3:
                Handler handler = (Handler) this.b;
                if (((AtomicBoolean) this.d).compareAndSet(false, true)) {
                    handler.removeCallbacks((a1.e) this.e);
                    if (Looper.myLooper() == handler.getLooper()) {
                        ((cf.b) this.c).a(false);
                        return;
                    } else {
                        handler.post(new m2(this, 5));
                        return;
                    }
                }
                return;
            case 4:
                a9 a9Var = (a9) this.b;
                j2 j2Var2 = (j2) this.c;
                k6 k6Var = (k6) this.e;
                String str2 = (String) this.d;
                com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) j2Var2.c;
                sVar2.c = k6Var;
                e8 e8Var = (e8) sVar2.b;
                if (e8Var != null) {
                    str = e8Var.d;
                    int i13 = e7.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                d8 d8Var = new d8();
                d8Var.a = a9Var.a;
                d8Var.b = a9Var.b;
                synchronized (a9.class) {
                    l9Var = a9.j;
                    if (l9Var == null) {
                        n0.c a11 = i7.c0.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i14 = 0;
                        while (i11 < a11.a.size()) {
                            Locale locale = a11.a.get(i11);
                            d9.c cVar = ab.c.a;
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
                        h9 h9Var = j9.b;
                        l9Var = i14 == 0 ? l9.e : new l9(i14, objArr);
                        a9.j = l9Var;
                    }
                }
                d8Var.k = l9Var;
                d8Var.g = Boolean.TRUE;
                d8Var.d = str;
                d8Var.c = str2;
                d8Var.e = a9Var.f.isSuccessful() ? (String) a9Var.f.getResult() : a9Var.d.a();
                d8Var.i = 10;
                d8Var.j = Integer.valueOf(a9Var.h);
                j2Var2.d = d8Var;
                a9Var.c.a(j2Var2);
                return;
            case 5:
                a();
                return;
            case 6:
                l.e eVar = (l.e) ((o1) this.d).b;
                l.m mVar = (l.m) this.c;
                l.d dVar = (l.d) this.b;
                if (dVar != null) {
                    eVar.L = true;
                    dVar.b.c(false);
                    eVar.L = false;
                }
                if (mVar.isEnabled() && mVar.hasSubMenu()) {
                    ((l.k) this.e).q(mVar, null, 4);
                    return;
                }
                return;
            case 7:
                b();
                return;
            default:
                r0.r0.h((View) this.b, (r0.w0) this.c, (oc.i) this.e);
                ((ValueAnimator) this.d).start();
                return;
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    public p(Handler handler, cf.b bVar, long j10) {
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
