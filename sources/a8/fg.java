package a8;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class fg implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ fg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
        r rVar;
        kg kgVar = (kg) this.b;
        ng ngVar = (ng) this.c;
        rb rbVar = (rb) this.d;
        String str2 = (String) this.e;
        m.r3 r3Var = (m.r3) ngVar.c;
        r3Var.b = rbVar;
        gf gfVar = (gf) r3Var.a;
        if (gfVar != null) {
            str = gfVar.d;
            int i10 = u4.a;
            if (str != null) {
            }
        }
        str = "NA";
        ff ffVar = new ff();
        ffVar.a = kgVar.a;
        ffVar.b = kgVar.b;
        synchronized (kg.class) {
            rVar = kg.k;
            if (rVar == null) {
                n0.c a2 = se.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    d5.a aVar = sb.c.a;
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
                rVar = l.q(i12, objArr);
                kg.k = rVar;
            }
        }
        ffVar.g = rVar;
        ffVar.i = Boolean.TRUE;
        ffVar.e = str;
        ffVar.d = str2;
        ffVar.f = kgVar.f.isSuccessful() ? (String) kgVar.f.getResult() : kgVar.d.a();
        ffVar.c = 10;
        ffVar.k = Integer.valueOf(kgVar.h);
        ngVar.d = ffVar;
        kgVar.c.a(ngVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        w7.m9 m9Var;
        w7.d9 d9Var = (w7.d9) this.b;
        ng ngVar = (ng) this.c;
        w7.m6 m6Var = (w7.m6) this.d;
        String str2 = (String) this.e;
        ti.e eVar = (ti.e) ngVar.c;
        eVar.c = m6Var;
        w7.h8 h8Var = (w7.h8) eVar.b;
        if (h8Var != null) {
            str = h8Var.d;
            int i10 = w7.h7.a;
            if (str != null) {
            }
        }
        str = "NA";
        ff ffVar = new ff();
        ffVar.a = d9Var.a;
        ffVar.b = d9Var.b;
        synchronized (w7.d9.class) {
            m9Var = w7.d9.j;
            if (m9Var == null) {
                n0.c a2 = se.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < a2.a.size()) {
                    Locale locale = a2.a.get(i11);
                    d5.a aVar = sb.c.a;
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
                w7.i9 i9Var = w7.k9.b;
                m9Var = i12 == 0 ? w7.m9.e : new w7.m9(i12, objArr);
                w7.d9.j = m9Var;
            }
        }
        ffVar.g = m9Var;
        ffVar.i = Boolean.TRUE;
        ffVar.e = str;
        ffVar.d = str2;
        ffVar.f = d9Var.f.isSuccessful() ? (String) d9Var.f.getResult() : d9Var.d.a();
        ffVar.c = 10;
        ffVar.k = Integer.valueOf(d9Var.h);
        ngVar.d = ffVar;
        d9Var.c.a(ngVar);
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
        y7.r rVar;
        d6.r rVar2 = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                com.google.android.gms.internal.cast.o oVar = (com.google.android.gms.internal.cast.o) this.b;
                p4.v vVar = (p4.v) this.c;
                p4.v vVar2 = (p4.v) this.d;
                c0.i iVar = (c0.i) this.e;
                com.google.android.gms.internal.cast.s sVar = oVar.a;
                sVar.getClass();
                h6.b bVar = com.google.android.gms.internal.cast.s.i;
                Set set = sVar.b;
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
                f6.h a2 = sVar.a();
                if (a2 == null || !a2.h()) {
                    bVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    iVar.a(null);
                    return;
                }
                bVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (vVar2.l == 0) {
                    com.google.android.gms.internal.cast.a2.a(com.google.android.gms.internal.cast.a1.g0);
                    i10 = 1;
                } else {
                    i10 = CastDevice.b(vVar2.s) == null ? 3 : 2;
                }
                sVar.e = i10;
                sVar.g = iVar;
                bVar.b("notify transferring with type = %d", Integer.valueOf(i10));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.cast.v0 v0Var = (com.google.android.gms.internal.cast.v0) it.next();
                    int i12 = sVar.e;
                    switch (v0Var.a) {
                        case 0:
                            com.google.android.gms.internal.cast.x0.j.b("onTransferring with type = %d", Integer.valueOf(i12));
                            com.google.android.gms.internal.cast.x0 x0Var = (com.google.android.gms.internal.cast.x0) v0Var.b;
                            x0Var.i = true;
                            x0Var.c();
                            com.google.android.gms.internal.cast.o1 b10 = x0Var.c.b(x0Var.g);
                            com.google.android.gms.internal.cast.j1 m10 = com.google.android.gms.internal.cast.k1.m(b10.d());
                            m10.c();
                            com.google.android.gms.internal.cast.k1.v((com.google.android.gms.internal.cast.k1) m10.b, i12);
                            b10.e((com.google.android.gms.internal.cast.k1) m10.a());
                            x0Var.a.a((com.google.android.gms.internal.cast.p1) b10.a(), 230);
                            break;
                        default:
                            ng ngVar = new ng(10, 4);
                            me meVar = (me) v0Var.b;
                            ngVar.d = Boolean.valueOf(((com.google.android.gms.internal.cast.c) meVar.b).d == 2);
                            me.D(meVar, new com.google.android.gms.internal.cast.t6(ngVar));
                            com.google.android.gms.internal.cast.s6 F = meVar.F();
                            com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a(new ag.j(i12));
                            aVar.c = F.h;
                            F.c.add(aVar);
                            break;
                    }
                }
                sVar.h = null;
                o6.l.e("Must be called from the main thread.");
                if (a2.w()) {
                    a2.g = new TaskCompletionSource();
                    f6.h.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a2.d();
                    d6.q e = a2.e();
                    if (d != null && e != null) {
                        Boolean bool = Boolean.TRUE;
                        long a10 = a2.a();
                        d6.n nVar = e.L;
                        double d10 = e.d;
                        if (Double.compare(d10, 2.0d) > 0 || Double.compare(d10, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        rVar2 = new d6.r(new d6.k(d, nVar, bool, a10, d10, e.v, e.E, null, null, null, null, 0L), null);
                    }
                    if (rVar2 != null) {
                        a2.g.setResult(rVar2);
                    } else {
                        a2.g.setException(new h6.k());
                    }
                    task = a2.g.getTask();
                } else {
                    task = Tasks.forException(new h6.k());
                }
                task.addOnSuccessListener(new com.google.android.gms.internal.cast.q(sVar)).addOnFailureListener(new com.google.android.gms.internal.cast.q(sVar));
                com.google.android.gms.internal.cast.y yVar = sVar.c;
                o6.l.h(yVar);
                com.google.android.gms.internal.cast.r rVar3 = sVar.d;
                o6.l.h(rVar3);
                yVar.postDelayed(rVar3, 10000L);
                return;
            case 2:
                l.e eVar = (l.e) ((jg.i) this.e).a;
                l.m mVar = (l.m) this.c;
                l.d dVar = (l.d) this.b;
                if (dVar != null) {
                    eVar.P = true;
                    dVar.b.c(false);
                    eVar.P = false;
                }
                if (mVar.isEnabled() && mVar.hasSubMenu()) {
                    ((l.k) this.d).q(mVar, null, 4);
                    return;
                }
                return;
            case 3:
                ((li.h5) this.b).f((p4.p) this.e, (p4.m) this.c, (Collection) this.d);
                return;
            case 4:
                ((li.h5) this.b).f((p4.p) this.e, (p4.m) this.c, (ArrayList) this.d);
                return;
            case 5:
                r0.q0.h((View) this.b, (r0.v0) this.c, (m4.w1) this.d);
                ((ValueAnimator) this.e).start();
                return;
            case 6:
                Handler handler = (Handler) this.b;
                if (((AtomicBoolean) this.e).compareAndSet(false, true)) {
                    handler.removeCallbacks((s9.g) this.d);
                    if (Looper.myLooper() == handler.getLooper()) {
                        ((uf.b) this.c).a(false);
                        return;
                    } else {
                        handler.post(new ti.g(this, 5));
                        return;
                    }
                }
                return;
            case 7:
                b();
                return;
            default:
                y7.ca caVar = (y7.ca) this.b;
                ng ngVar2 = (ng) this.c;
                y7.m7 m7Var = (y7.m7) this.d;
                String str2 = (String) this.e;
                aa.m0 m0Var = (aa.m0) ngVar2.c;
                m0Var.b = m7Var;
                y7.g9 g9Var = (y7.g9) m0Var.a;
                if (g9Var != null) {
                    str = g9Var.d;
                    int i13 = y7.ma.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                ff ffVar = new ff();
                ffVar.a = caVar.a;
                ffVar.b = caVar.b;
                synchronized (y7.ca.class) {
                    rVar = y7.ca.k;
                    if (rVar == null) {
                        n0.c a11 = se.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i14 = 0;
                        while (i11 < a11.a.size()) {
                            Locale locale = a11.a.get(i11);
                            d5.a aVar2 = sb.c.a;
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
                        y7.l lVar = y7.n.b;
                        rVar = i14 == 0 ? y7.r.e : new y7.r(i14, objArr);
                        y7.ca.k = rVar;
                    }
                }
                ffVar.g = rVar;
                ffVar.i = Boolean.TRUE;
                ffVar.e = str;
                ffVar.d = str2;
                ffVar.f = caVar.f.isSuccessful() ? (String) caVar.f.getResult() : caVar.d.a();
                ffVar.c = 10;
                ffVar.k = Integer.valueOf(caVar.h);
                ngVar2.d = ffVar;
                caVar.c.a(ngVar2);
                return;
        }
    }

    public /* synthetic */ fg(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public fg(Handler handler, uf.b bVar, long j10) {
        this.a = 6;
        this.e = new AtomicBoolean(false);
        this.b = handler;
        this.c = bVar;
        s9.g gVar = new s9.g(19, this, bVar);
        this.d = gVar;
        if (j10 > 0) {
            handler.postDelayed(gVar, j10);
        }
    }
}
