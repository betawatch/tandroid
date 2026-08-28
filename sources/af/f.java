package af;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import c2.n;
import c2.u0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.m1;
import com.google.android.gms.internal.cast.n1;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.cast.v6;
import com.google.android.gms.internal.cast.w6;
import com.google.android.gms.internal.cast.y0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.m;
import f7.c9;
import f7.f7;
import f7.f8;
import f7.g8;
import f7.j9;
import f7.l6;
import f7.l9;
import g7.a0;
import h7.ka;
import h7.n9;
import h7.q;
import h7.s;
import h7.t7;
import h7.ua;
import h7.w;
import j7.hb;
import j7.i;
import j7.l4;
import j7.we;
import j7.wf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m.t3;
import m5.k;
import m5.r;
import o5.h;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Cells.e3;
import r0.r0;
import r0.w0;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        w wVar;
        ka kaVar = (ka) this.b;
        a6.a aVar = (a6.a) this.c;
        t7 t7Var = (t7) this.d;
        String str2 = (String) this.e;
        m mVar = (m) aVar.b;
        mVar.b = t7Var;
        n9 n9Var = (n9) mVar.a;
        if (n9Var != null) {
            str = n9Var.d;
            int i9 = ua.a;
            if (str != null) {
            }
        }
        str = "NA";
        f8 f8Var = new f8();
        f8Var.a = kaVar.a;
        f8Var.b = kaVar.b;
        synchronized (ka.class) {
            wVar = ka.k;
            if (wVar == null) {
                n0.c a2 = a0.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < a2.a.size()) {
                    Locale locale = a2.a.get(i10);
                    b9.c cVar = ya.c.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i12 = i11 + 1;
                    int length = objArr.length;
                    if (length < i12) {
                        int i13 = length + (length >> 1) + 1;
                        if (i13 < i12) {
                            int highestOneBit = Integer.highestOneBit(i11);
                            i13 = highestOneBit + highestOneBit;
                        }
                        if (i13 < 0) {
                            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    objArr[i11] = languageTag;
                    i10++;
                    i11 = i12;
                }
                q qVar = s.b;
                wVar = i11 == 0 ? w.e : new w(i11, objArr);
                ka.k = wVar;
            }
        }
        f8Var.k = wVar;
        f8Var.g = Boolean.TRUE;
        f8Var.d = str;
        f8Var.c = str2;
        f8Var.e = kaVar.f.isSuccessful() ? (String) kaVar.f.getResult() : kaVar.d.a();
        f8Var.i = 10;
        f8Var.j = Integer.valueOf(kaVar.h);
        aVar.d = f8Var;
        kaVar.c.a(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        j7.m mVar;
        wf wfVar = (wf) this.b;
        a6.a aVar = (a6.a) this.c;
        hb hbVar = (hb) this.d;
        String str2 = (String) this.e;
        t3 t3Var = (t3) aVar.b;
        t3Var.b = hbVar;
        we weVar = (we) t3Var.a;
        if (weVar != null) {
            str = weVar.d;
            int i9 = l4.a;
            if (str != null) {
            }
        }
        str = "NA";
        f8 f8Var = new f8();
        f8Var.a = wfVar.a;
        f8Var.b = wfVar.b;
        synchronized (wf.class) {
            mVar = wf.k;
            if (mVar == null) {
                n0.c a2 = a0.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < a2.a.size()) {
                    Locale locale = a2.a.get(i10);
                    b9.c cVar = ya.c.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i12 = i11 + 1;
                    int length = objArr.length;
                    if (length < i12) {
                        int i13 = length + (length >> 1) + 1;
                        if (i13 < i12) {
                            int highestOneBit = Integer.highestOneBit(i11);
                            i13 = highestOneBit + highestOneBit;
                        }
                        if (i13 < 0) {
                            i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    objArr[i11] = languageTag;
                    i10++;
                    i11 = i12;
                }
                mVar = i.r(i11, objArr);
                wf.k = mVar;
            }
        }
        f8Var.k = mVar;
        f8Var.g = Boolean.TRUE;
        f8Var.d = str;
        f8Var.c = str2;
        f8Var.e = wfVar.f.isSuccessful() ? (String) wfVar.f.getResult() : wfVar.d.a();
        f8Var.i = 10;
        f8Var.j = Integer.valueOf(wfVar.h);
        aVar.d = f8Var;
        wfVar.c.a(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r7.isEmpty() == false) goto L26;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        Task task;
        String str;
        f7.n9 n9Var;
        r rVar = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                Handler handler = (Handler) this.b;
                if (((AtomicBoolean) this.e).compareAndSet(false, true)) {
                    handler.removeCallbacks((a1.e) this.d);
                    if (Looper.myLooper() == handler.getLooper()) {
                        ((ze.b) this.c).a(false);
                        return;
                    } else {
                        handler.post(new e(this, i10));
                        return;
                    }
                }
                return;
            case 1:
                ((xa.c) this.b).I((c2.q) this.e, (n) this.c, (Collection) this.d);
                return;
            case 2:
                ((xa.c) this.b).I((c2.q) this.e, (n) this.c, (ArrayList) this.d);
                return;
            case 3:
                p pVar = (p) this.b;
                c2.a0 a0Var = (c2.a0) this.c;
                c2.a0 a0Var2 = (c2.a0) this.d;
                c0.i iVar = (c0.i) this.e;
                t tVar = pVar.a;
                tVar.getClass();
                q5.b bVar = t.i;
                Set set = tVar.b;
                if (new HashSet(set).isEmpty()) {
                    bVar.b("No need to prepare transfer without any callback", new Object[0]);
                    iVar.a();
                    return;
                }
                if (a0Var.l != 1) {
                    bVar.b("No need to prepare transfer when transferring from local", new Object[0]);
                    iVar.a();
                    return;
                }
                h a2 = tVar.a();
                if (a2 == null || !a2.h()) {
                    bVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    iVar.a();
                    return;
                }
                bVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (a0Var2.l == 0) {
                    d2.a(d1.c0);
                    i9 = 1;
                } else {
                    i9 = CastDevice.b(a0Var2.s) == null ? 3 : 2;
                }
                tVar.e = i9;
                tVar.g = iVar;
                bVar.b("notify transferring with type = %d", Integer.valueOf(i9));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    y0 y0Var = (y0) it.next();
                    int i11 = tVar.e;
                    switch (y0Var.a) {
                        case 0:
                            a1.j.b("onTransferring with type = %d", Integer.valueOf(i11));
                            a1 a1Var = (a1) y0Var.b;
                            a1Var.i = true;
                            a1Var.c();
                            r1 b10 = a1Var.c.b(a1Var.g);
                            m1 m10 = n1.m(b10.d());
                            m10.c();
                            n1.v((n1) m10.b, i11);
                            b10.e((n1) m10.a());
                            a1Var.a.a((s1) b10.a(), 230);
                            break;
                        default:
                            a6.a aVar = new a6.a(10, 3);
                            b3.b bVar2 = (b3.b) y0Var.b;
                            aVar.d = Boolean.valueOf(((com.google.android.gms.internal.cast.d) bVar2.b).d == 2);
                            b3.b.D(bVar2, new w6(aVar));
                            v6 E = bVar2.E();
                            com.google.android.gms.internal.cast.b bVar3 = new com.google.android.gms.internal.cast.b(new com.google.android.gms.internal.cast.a(i11));
                            bVar3.c = E.h;
                            E.c.add(bVar3);
                            break;
                    }
                }
                tVar.h = null;
                l.e("Must be called from the main thread.");
                if (a2.w()) {
                    a2.g = new TaskCompletionSource();
                    h.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a2.d();
                    m5.q e10 = a2.e();
                    if (d != null && e10 != null) {
                        Boolean bool = Boolean.TRUE;
                        long a3 = a2.a();
                        m5.n nVar = e10.H;
                        double d9 = e10.d;
                        if (Double.compare(d9, 2.0d) > 0 || Double.compare(d9, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        rVar = new r(new k(d, nVar, bool, a3, d9, e10.v, e10.A, null, null, null, null, 0L), null);
                    }
                    if (rVar != null) {
                        a2.g.setResult(rVar);
                    } else {
                        a2.g.setException(new q5.l());
                    }
                    task = a2.g.getTask();
                } else {
                    task = Tasks.forException(new q5.l());
                }
                task.addOnSuccessListener(new com.google.android.gms.internal.cast.r(tVar)).addOnFailureListener(new com.google.android.gms.internal.cast.r(tVar));
                u0 u0Var = tVar.c;
                l.h(u0Var);
                com.google.android.gms.internal.cast.s sVar = tVar.d;
                l.h(sVar);
                u0Var.postDelayed(sVar, 10000L);
                return;
            case 4:
                c9 c9Var = (c9) this.b;
                a6.a aVar2 = (a6.a) this.c;
                l6 l6Var = (l6) this.d;
                String str2 = (String) this.e;
                com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) aVar2.b;
                tVar2.c = l6Var;
                g8 g8Var = (g8) tVar2.b;
                if (g8Var != null) {
                    str = g8Var.d;
                    int i12 = f7.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                f8 f8Var = new f8();
                f8Var.a = c9Var.a;
                f8Var.b = c9Var.b;
                synchronized (c9.class) {
                    n9Var = c9.j;
                    if (n9Var == null) {
                        n0.c a10 = a0.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i13 = 0;
                        while (i10 < a10.a.size()) {
                            Locale locale = a10.a.get(i10);
                            b9.c cVar = ya.c.a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i14 = i13 + 1;
                            int length = objArr.length;
                            if (length < i14) {
                                int i15 = length + (length >> 1) + 1;
                                if (i15 < i14) {
                                    int highestOneBit = Integer.highestOneBit(i13);
                                    i15 = highestOneBit + highestOneBit;
                                }
                                if (i15 < 0) {
                                    i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                }
                                objArr = Arrays.copyOf(objArr, i15);
                            }
                            objArr[i13] = languageTag;
                            i10++;
                            i13 = i14;
                        }
                        j9 j9Var = l9.b;
                        n9Var = i13 == 0 ? f7.n9.e : new f7.n9(i13, objArr);
                        c9.j = n9Var;
                    }
                }
                f8Var.k = n9Var;
                f8Var.g = Boolean.TRUE;
                f8Var.d = str;
                f8Var.c = str2;
                f8Var.e = c9Var.f.isSuccessful() ? (String) c9Var.f.getResult() : c9Var.d.a();
                f8Var.i = 10;
                f8Var.j = Integer.valueOf(c9Var.h);
                aVar2.d = f8Var;
                c9Var.c.a(aVar2);
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                l.e eVar = (l.e) ((k5.i) this.e).b;
                l.m mVar = (l.m) this.c;
                l.d dVar = (l.d) this.b;
                if (dVar != null) {
                    eVar.L = true;
                    dVar.b.c(false);
                    eVar.L = false;
                }
                if (mVar.isEnabled() && mVar.hasSubMenu()) {
                    ((l.k) this.d).q(mVar, null, 4);
                    return;
                }
                return;
            default:
                r0.h((View) this.b, (w0) this.c, (e3) this.d);
                ((ValueAnimator) this.e).start();
                return;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public f(Handler handler, ze.b bVar, long j10) {
        this.a = 0;
        this.e = new AtomicBoolean(false);
        this.b = handler;
        this.c = bVar;
        a1.e eVar = new a1.e(2, this, bVar);
        this.d = eVar;
        if (j10 > 0) {
            handler.postDelayed(eVar, j10);
        }
    }
}
