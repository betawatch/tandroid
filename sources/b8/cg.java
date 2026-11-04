package b8;

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
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class cg implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ cg(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
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
        hg hgVar = (hg) this.b;
        kg kgVar = (kg) this.c;
        ob obVar = (ob) this.d;
        String str2 = (String) this.e;
        fa.f fVar = (fa.f) kgVar.c;
        fVar.c = obVar;
        ef efVar = (ef) fVar.b;
        if (efVar != null) {
            str = efVar.d;
            int i3 = s4.a;
            if (str != null) {
            }
        }
        str = "NA";
        df dfVar = new df();
        dfVar.a = hgVar.a;
        dfVar.b = hgVar.b;
        synchronized (hg.class) {
            rVar = hg.k;
            if (rVar == null) {
                n0.c a10 = re.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < a10.a.size()) {
                    Locale locale = a10.a.get(i10);
                    org.telegram.messenger.m6 m6Var = mb.c.a;
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
                rVar = l.m(i11, objArr);
                hg.k = rVar;
            }
        }
        dfVar.k = rVar;
        dfVar.g = Boolean.TRUE;
        dfVar.d = str;
        dfVar.c = str2;
        dfVar.e = hgVar.f.isSuccessful() ? (String) hgVar.f.getResult() : hgVar.d.a();
        dfVar.i = 10;
        dfVar.j = Integer.valueOf(hgVar.h);
        kgVar.d = dfVar;
        hgVar.c.a(kgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        x7.k9 k9Var;
        x7.b9 b9Var = (x7.b9) this.b;
        kg kgVar = (kg) this.c;
        x7.k6 k6Var = (x7.k6) this.d;
        String str2 = (String) this.e;
        za.p pVar = (za.p) kgVar.c;
        pVar.b = k6Var;
        x7.f8 f8Var = (x7.f8) pVar.a;
        if (f8Var != null) {
            str = f8Var.d;
            int i3 = x7.f7.a;
            if (str != null) {
            }
        }
        str = "NA";
        df dfVar = new df();
        dfVar.a = b9Var.a;
        dfVar.b = b9Var.b;
        synchronized (x7.b9.class) {
            k9Var = x7.b9.j;
            if (k9Var == null) {
                n0.c a10 = re.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < a10.a.size()) {
                    Locale locale = a10.a.get(i10);
                    org.telegram.messenger.m6 m6Var = mb.c.a;
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
                x7.g9 g9Var = x7.i9.b;
                k9Var = i11 == 0 ? x7.k9.e : new x7.k9(i11, objArr);
                x7.b9.j = k9Var;
            }
        }
        dfVar.k = k9Var;
        dfVar.g = Boolean.TRUE;
        dfVar.d = str;
        dfVar.c = str2;
        dfVar.e = b9Var.f.isSuccessful() ? (String) b9Var.f.getResult() : b9Var.d.a();
        dfVar.i = 10;
        dfVar.j = Integer.valueOf(b9Var.h);
        kgVar.d = dfVar;
        b9Var.c.a(kgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r7.isEmpty() == false) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        Task task;
        String str;
        z7.r rVar;
        e6.r rVar2 = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.b;
                r4.w wVar = (r4.w) this.c;
                r4.w wVar2 = (r4.w) this.d;
                c0.i iVar = (c0.i) this.e;
                com.google.android.gms.internal.cast.t tVar = pVar.a;
                tVar.getClass();
                i6.b bVar = com.google.android.gms.internal.cast.t.i;
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
                g6.h a10 = tVar.a();
                if (a10 == null || !a10.h()) {
                    bVar.b("No need to prepare transfer when there is no media session", new Object[0]);
                    iVar.a(null);
                    return;
                }
                bVar.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (wVar2.l == 0) {
                    com.google.android.gms.internal.cast.b2.a(com.google.android.gms.internal.cast.b1.h0);
                    i3 = 1;
                } else {
                    i3 = CastDevice.b(wVar2.s) == null ? 3 : 2;
                }
                tVar.e = i3;
                tVar.g = iVar;
                bVar.b("notify transferring with type = %d", Integer.valueOf(i3));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.cast.w0 w0Var = (com.google.android.gms.internal.cast.w0) it.next();
                    int i11 = tVar.e;
                    switch (w0Var.a) {
                        case 0:
                            com.google.android.gms.internal.cast.y0.j.b("onTransferring with type = %d", Integer.valueOf(i11));
                            com.google.android.gms.internal.cast.y0 y0Var = (com.google.android.gms.internal.cast.y0) w0Var.b;
                            y0Var.i = true;
                            y0Var.c();
                            com.google.android.gms.internal.cast.p1 b10 = y0Var.c.b(y0Var.g);
                            com.google.android.gms.internal.cast.k1 m10 = com.google.android.gms.internal.cast.l1.m(b10.d());
                            m10.c();
                            com.google.android.gms.internal.cast.l1.v((com.google.android.gms.internal.cast.l1) m10.b, i11);
                            b10.e((com.google.android.gms.internal.cast.l1) m10.a());
                            y0Var.a.a((com.google.android.gms.internal.cast.q1) b10.a(), hs.G3);
                            break;
                        default:
                            kg kgVar = new kg(10, 4);
                            ke keVar = (ke) w0Var.b;
                            kgVar.d = Boolean.valueOf(((com.google.android.gms.internal.cast.c) keVar.c).d == 2);
                            ke.P(keVar, new com.google.android.gms.internal.cast.t6(kgVar));
                            com.google.android.gms.internal.cast.s6 Q = keVar.Q();
                            com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a(new a7.l(i11));
                            aVar.c = Q.h;
                            Q.c.add(aVar);
                            break;
                    }
                }
                tVar.h = null;
                p6.m.d("Must be called from the main thread.");
                if (a10.w()) {
                    a10.g = new TaskCompletionSource();
                    g6.h.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a10.d();
                    e6.q e10 = a10.e();
                    if (d != null && e10 != null) {
                        Boolean bool = Boolean.TRUE;
                        long a11 = a10.a();
                        e6.n nVar = e10.M;
                        double d10 = e10.d;
                        if (Double.compare(d10, 2.0d) > 0 || Double.compare(d10, 0.5d) < 0) {
                            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                        }
                        rVar2 = new e6.r(new e6.k(d, nVar, bool, a11, d10, e10.w, e10.F, null, null, null, null, 0L), null);
                    }
                    if (rVar2 != null) {
                        a10.g.setResult(rVar2);
                    } else {
                        a10.g.setException(new i6.k());
                    }
                    task = a10.g.getTask();
                } else {
                    task = Tasks.forException(new i6.k());
                }
                task.addOnSuccessListener(new com.google.android.gms.internal.cast.r(tVar)).addOnFailureListener(new com.google.android.gms.internal.cast.r(tVar));
                com.google.android.gms.internal.cast.z zVar = tVar.c;
                p6.m.g(zVar);
                com.google.android.gms.internal.cast.s sVar = tVar.d;
                p6.m.g(sVar);
                zVar.postDelayed(sVar, 10000L);
                return;
            case 2:
                l.e eVar = (l.e) ((gi.v5) this.e).b;
                l.m mVar = (l.m) this.c;
                l.d dVar = (l.d) this.b;
                if (dVar != null) {
                    eVar.Q = true;
                    dVar.b.c(false);
                    eVar.Q = false;
                }
                if (mVar.isEnabled() && mVar.hasSubMenu()) {
                    ((l.k) this.d).q(mVar, null, 4);
                    return;
                }
                return;
            case 3:
                r0.q0.h((View) this.b, (r0.v0) this.c, (mi.h0) this.d);
                ((ValueAnimator) this.e).start();
                return;
            case 4:
                ((nh) this.b).C((r4.p) this.e, (r4.m) this.c, (Collection) this.d);
                return;
            case 5:
                ((nh) this.b).C((r4.p) this.e, (r4.m) this.c, (ArrayList) this.d);
                return;
            case 6:
                b();
                return;
            case 7:
                Handler handler = (Handler) this.b;
                if (((AtomicBoolean) this.e).compareAndSet(false, true)) {
                    handler.removeCallbacks((u9.a) this.d);
                    if (Looper.myLooper() == handler.getLooper()) {
                        ((wf.b) this.c).a(false);
                        return;
                    } else {
                        handler.post(new xf.c(this, i10));
                        return;
                    }
                }
                return;
            default:
                z7.da daVar = (z7.da) this.b;
                kg kgVar2 = (kg) this.c;
                z7.n7 n7Var = (z7.n7) this.d;
                String str2 = (String) this.e;
                l2.e eVar2 = (l2.e) kgVar2.c;
                eVar2.b = n7Var;
                z7.h9 h9Var = (z7.h9) eVar2.a;
                if (h9Var != null) {
                    str = h9Var.d;
                    int i12 = z7.na.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                df dfVar = new df();
                dfVar.a = daVar.a;
                dfVar.b = daVar.b;
                synchronized (z7.da.class) {
                    rVar = z7.da.k;
                    if (rVar == null) {
                        n0.c a12 = re.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i13 = 0;
                        while (i10 < a12.a.size()) {
                            Locale locale = a12.a.get(i10);
                            org.telegram.messenger.m6 m6Var = mb.c.a;
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
                        z7.l lVar = z7.n.b;
                        rVar = i13 == 0 ? z7.r.e : new z7.r(i13, objArr);
                        z7.da.k = rVar;
                    }
                }
                dfVar.k = rVar;
                dfVar.g = Boolean.TRUE;
                dfVar.d = str;
                dfVar.c = str2;
                dfVar.e = daVar.f.isSuccessful() ? (String) daVar.f.getResult() : daVar.d.a();
                dfVar.i = 10;
                dfVar.j = Integer.valueOf(daVar.h);
                kgVar2.d = dfVar;
                daVar.c.a(kgVar2);
                return;
        }
    }

    public /* synthetic */ cg(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public cg(Handler handler, wf.b bVar, long j10) {
        this.a = 7;
        this.e = new AtomicBoolean(false);
        this.b = handler;
        this.c = bVar;
        u9.a aVar = new u9.a(22, this, bVar);
        this.d = aVar;
        if (j10 > 0) {
            handler.postDelayed(aVar, j10);
        }
    }
}
