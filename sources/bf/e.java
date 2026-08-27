package bf;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import c2.n;
import c2.t0;
import c2.z;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.l1;
import com.google.android.gms.internal.cast.m1;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.cast.q1;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.t6;
import com.google.android.gms.internal.cast.u6;
import com.google.android.gms.internal.cast.x0;
import com.google.android.gms.internal.cast.z0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.t;
import g7.b9;
import g7.e7;
import g7.e8;
import g7.f8;
import g7.i9;
import g7.k9;
import g7.l6;
import g7.m9;
import i7.ka;
import i7.n9;
import i7.q;
import i7.s;
import i7.t7;
import i7.ua;
import i7.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.hb;
import k7.i;
import k7.l4;
import k7.we;
import k7.wf;
import l.f;
import m.t3;
import m5.k;
import m5.r;
import o5.h;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.i6;
import r0.r0;
import r0.w0;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
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
        b6.a aVar = (b6.a) this.c;
        t7 t7Var = (t7) this.d;
        String str2 = (String) this.e;
        m mVar = (m) aVar.b;
        mVar.b = t7Var;
        n9 n9Var = (n9) mVar.a;
        if (n9Var != null) {
            str = n9Var.d;
            int i10 = ua.a;
            if (str != null) {
            }
        }
        str = "NA";
        e8 e8Var = new e8();
        e8Var.a = kaVar.a;
        e8Var.b = kaVar.b;
        synchronized (ka.class) {
            wVar = ka.k;
            if (wVar == null) {
                n0.c a2 = h7.w.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    c9.b bVar = za.c.a;
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
                q qVar = s.b;
                wVar = i12 == 0 ? w.e : new w(i12, objArr);
                ka.k = wVar;
            }
        }
        e8Var.k = wVar;
        e8Var.g = Boolean.TRUE;
        e8Var.d = str;
        e8Var.c = str2;
        e8Var.e = kaVar.f.isSuccessful() ? (String) kaVar.f.getResult() : kaVar.d.a();
        e8Var.i = 10;
        e8Var.j = Integer.valueOf(kaVar.h);
        aVar.d = e8Var;
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
        k7.m mVar;
        wf wfVar = (wf) this.b;
        b6.a aVar = (b6.a) this.c;
        hb hbVar = (hb) this.d;
        String str2 = (String) this.e;
        t3 t3Var = (t3) aVar.b;
        t3Var.b = hbVar;
        we weVar = (we) t3Var.a;
        if (weVar != null) {
            str = weVar.d;
            int i10 = l4.a;
            if (str != null) {
            }
        }
        str = "NA";
        e8 e8Var = new e8();
        e8Var.a = wfVar.a;
        e8Var.b = wfVar.b;
        synchronized (wf.class) {
            mVar = wf.k;
            if (mVar == null) {
                n0.c a2 = h7.w.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    c9.b bVar = za.c.a;
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
                mVar = i.r(i12, objArr);
                wf.k = mVar;
            }
        }
        e8Var.k = mVar;
        e8Var.g = Boolean.TRUE;
        e8Var.d = str;
        e8Var.c = str2;
        e8Var.e = wfVar.f.isSuccessful() ? (String) wfVar.f.getResult() : wfVar.d.a();
        e8Var.i = 10;
        e8Var.j = Integer.valueOf(wfVar.h);
        aVar.d = e8Var;
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
        int i10;
        Task task;
        String str;
        m9 m9Var;
        m5.s sVar = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                Handler handler = (Handler) this.b;
                if (((AtomicBoolean) this.e).compareAndSet(false, true)) {
                    handler.removeCallbacks((a1.e) this.d);
                    if (Looper.myLooper() == handler.getLooper()) {
                        ((af.b) this.c).a(false);
                        return;
                    } else {
                        handler.post(new af.e(this, 14));
                        return;
                    }
                }
                return;
            case 1:
                ((a9.i) this.b).O((c2.q) this.e, (n) this.c, (Collection) this.d);
                return;
            case 2:
                ((a9.i) this.b).O((c2.q) this.e, (n) this.c, (ArrayList) this.d);
                return;
            case 3:
                o oVar = (o) this.b;
                z zVar = (z) this.c;
                z zVar2 = (z) this.d;
                c0.i iVar = (c0.i) this.e;
                com.google.android.gms.internal.cast.s sVar2 = oVar.a;
                sVar2.getClass();
                r5.b bVar = com.google.android.gms.internal.cast.s.i;
                Set set = sVar2.b;
                if (new HashSet(set).isEmpty()) {
                    bVar.b("No need to prepare transfer without any callback", new Object[0]);
                    iVar.a();
                    return;
                }
                if (zVar.l != 1) {
                    bVar.b("No need to prepare transfer when transferring from local", new Object[0]);
                    iVar.a();
                    return;
                }
                h a2 = sVar2.a();
                if (a2 == null || !a2.h()) {
                    bVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    iVar.a();
                    return;
                }
                bVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (zVar2.l == 0) {
                    c2.a(c1.c0);
                    i10 = 1;
                } else {
                    i10 = CastDevice.b(zVar2.s) == null ? 3 : 2;
                }
                sVar2.e = i10;
                sVar2.g = iVar;
                bVar.b("notify transferring with type = %d", Integer.valueOf(i10));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    x0 x0Var = (x0) it.next();
                    int i12 = sVar2.e;
                    switch (x0Var.a) {
                        case 0:
                            z0.j.b("onTransferring with type = %d", Integer.valueOf(i12));
                            z0 z0Var = (z0) x0Var.b;
                            z0Var.i = true;
                            z0Var.c();
                            q1 b10 = z0Var.c.b(z0Var.g);
                            l1 m10 = m1.m(b10.d());
                            m10.c();
                            m1.v((m1) m10.b, i12);
                            b10.e((m1) m10.a());
                            z0Var.a.a((r1) b10.a(), 230);
                            break;
                        default:
                            b6.a aVar = new b6.a(10, 3);
                            af.h hVar = (af.h) x0Var.b;
                            aVar.d = Boolean.valueOf(((com.google.android.gms.internal.cast.d) hVar.b).d == 2);
                            af.h.E(hVar, new u6(aVar));
                            t6 F = hVar.F();
                            com.google.android.gms.internal.cast.b bVar2 = new com.google.android.gms.internal.cast.b(new com.google.android.gms.internal.cast.a(i12));
                            bVar2.c = F.h;
                            F.c.add(bVar2);
                            break;
                    }
                }
                sVar2.h = null;
                l.e("Must be called from the main thread.");
                if (a2.w()) {
                    a2.g = new TaskCompletionSource();
                    h.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a2.d();
                    r e9 = a2.e();
                    if (d != null && e9 != null) {
                        Boolean bool = Boolean.TRUE;
                        long a3 = a2.a();
                        m5.n nVar = e9.H;
                        double d10 = e9.d;
                        if (Double.compare(d10, 2.0d) > 0 || Double.compare(d10, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        sVar = new m5.s(new k(d, nVar, bool, a3, d10, e9.v, e9.A, null, null, null, null, 0L), null);
                    }
                    if (sVar != null) {
                        a2.g.setResult(sVar);
                    } else {
                        a2.g.setException(new r5.l());
                    }
                    task = a2.g.getTask();
                } else {
                    task = Tasks.forException(new r5.l());
                }
                task.addOnSuccessListener(new com.google.android.gms.internal.cast.q(sVar2)).addOnFailureListener(new com.google.android.gms.internal.cast.q(sVar2));
                t0 t0Var = sVar2.c;
                l.h(t0Var);
                com.google.android.gms.internal.cast.r rVar = sVar2.d;
                l.h(rVar);
                t0Var.postDelayed(rVar, 10000L);
                return;
            case 4:
                b9 b9Var = (b9) this.b;
                b6.a aVar2 = (b6.a) this.c;
                l6 l6Var = (l6) this.d;
                String str2 = (String) this.e;
                t tVar = (t) aVar2.b;
                tVar.c = l6Var;
                f8 f8Var = (f8) tVar.b;
                if (f8Var != null) {
                    str = f8Var.d;
                    int i13 = e7.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                e8 e8Var = new e8();
                e8Var.a = b9Var.a;
                e8Var.b = b9Var.b;
                synchronized (b9.class) {
                    m9Var = b9.j;
                    if (m9Var == null) {
                        n0.c a10 = h7.w.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i14 = 0;
                        while (i11 < a10.a.size()) {
                            Locale locale = a10.a.get(i11);
                            c9.b bVar3 = za.c.a;
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
                        i9 i9Var = k9.b;
                        m9Var = i14 == 0 ? m9.e : new m9(i14, objArr);
                        b9.j = m9Var;
                    }
                }
                e8Var.k = m9Var;
                e8Var.g = Boolean.TRUE;
                e8Var.d = str;
                e8Var.c = str2;
                e8Var.e = b9Var.f.isSuccessful() ? (String) b9Var.f.getResult() : b9Var.d.a();
                e8Var.i = 10;
                e8Var.j = Integer.valueOf(b9Var.h);
                aVar2.d = e8Var;
                b9Var.c.a(aVar2);
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                f fVar = (f) ((a9.i) this.e).b;
                l.n nVar2 = (l.n) this.c;
                l.e eVar = (l.e) this.b;
                if (eVar != null) {
                    fVar.L = true;
                    eVar.b.c(false);
                    fVar.L = false;
                }
                if (nVar2.isEnabled() && nVar2.hasSubMenu()) {
                    ((l.l) this.d).q(nVar2, null, 4);
                    return;
                }
                return;
            default:
                r0.h((View) this.b, (w0) this.c, (i6) this.d);
                ((ValueAnimator) this.e).start();
                return;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public e(Handler handler, af.b bVar, long j10) {
        this.a = 0;
        this.e = new AtomicBoolean(false);
        this.b = handler;
        this.c = bVar;
        a1.e eVar = new a1.e(11, this, bVar);
        this.d = eVar;
        if (j10 > 0) {
            handler.postDelayed(eVar, j10);
        }
    }
}
