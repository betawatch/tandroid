package n2;

import ab.o0;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import e2.m0;
import e9.n0;
import ig.t0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ji.h5;
import ji.w4;
import v7.u6;
import w7.a0;
import z7.xf;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class b implements g {
    public final List a;
    public final q b;
    public final xf c;
    public final w4 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final e2.k h;
    public final oa.d i;
    public final j2.k j;
    public final c2.b k;
    public final UUID l;
    public final Looper m;
    public final o0 n;
    public final Object o;
    public int p;
    public int q;
    public HandlerThread r;
    public android.support.v4.media.session.f s;
    public h2.b t;
    public f u;
    public byte[] v;
    public byte[] w;
    public o x;
    public h5 y;
    public p z;

    public b(UUID uuid, q qVar, xf xfVar, w4 w4Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, c2.b bVar, Looper looper, oa.d dVar, j2.k kVar) {
        this.l = uuid;
        this.c = xfVar;
        this.d = w4Var;
        this.b = qVar;
        this.e = z10;
        this.f = z11;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = bVar;
        this.h = new e2.k();
        this.i = dVar;
        this.j = kVar;
        this.p = 2;
        this.m = looper;
        this.n = new o0(this, looper, 5);
        this.o = new Object();
    }

    @Override // n2.g
    public final void a(j jVar) {
        p();
        int i10 = this.q;
        if (i10 <= 0) {
            e2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.q = i11;
        if (i11 == 0) {
            this.p = 0;
            o0 o0Var = this.n;
            String str = m0.a;
            o0Var.removeCallbacksAndMessages(null);
            this.s.b();
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            synchronized (this.o) {
                this.y = null;
            }
            this.z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.W(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.m(jVar);
            if (this.h.h(jVar) == 0) {
                jVar.e();
            }
        }
        w4 w4Var = this.d;
        int i12 = this.q;
        e eVar = (e) w4Var.b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new t0(this, 18), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            xf xfVar = eVar.n;
            HashSet hashSet = (HashSet) xfVar.a;
            hashSet.remove(this);
            if (((b) xfVar.b) == this) {
                xfVar.b = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    xfVar.b = bVar;
                    p p5 = bVar.b.p();
                    bVar.z = p5;
                    android.support.v4.media.session.f fVar = bVar.s;
                    String str2 = m0.a;
                    p5.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(u2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), p5)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.y.remove(this);
            }
        }
        eVar.g();
    }

    @Override // n2.g
    public final void b(j jVar) {
        p();
        if (this.q < 0) {
            e2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (jVar != null) {
            e2.k kVar = this.h;
            synchronized (kVar.a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.c);
                        hashSet.add(jVar);
                        kVar.c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    kVar.b.put(jVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i10 = this.q + 1;
        this.q = i10;
        if (i10 == 1) {
            u6.p(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new android.support.v4.media.session.f(this, this.r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.h(jVar) == 1) {
            jVar.c(this.p);
        }
        e eVar = (e) this.d.b;
        if (eVar.v != -9223372036854775807L) {
            eVar.y.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // n2.g
    public final UUID c() {
        p();
        return this.l;
    }

    @Override // n2.g
    public final boolean d() {
        p();
        return this.e;
    }

    @Override // n2.g
    public final int e() {
        p();
        return this.p;
    }

    @Override // n2.g
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.w0(str, bArr);
    }

    @Override // n2.g
    public final f g() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // n2.g
    public final h2.b h() {
        p();
        return this.t;
    }

    public final void i(e2.j jVar) {
        Set set;
        e2.k kVar = this.h;
        synchronized (kVar.a) {
            set = kVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jVar.accept((j) it.next());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(2:41|42)|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073 A[Catch: NumberFormatException -> 0x0077, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0077, blocks: (B:47:0x006b, B:49:0x0073), top: B:46:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z10) {
        long min;
        long j10;
        String str;
        String str2;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.v;
        String str3 = m0.a;
        boolean z11 = true;
        if (this.w == null) {
            o(1, z10, bArr);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.K(this.v, this.w);
            } catch (Exception | NoSuchMethodError e) {
                l(1, e);
                z11 = false;
            }
            if (!z11) {
                return;
            }
        }
        if (b2.n.e.equals(this.l)) {
            p();
            byte[] bArr2 = this.v;
            Pair pair = null;
            Map b10 = bArr2 == null ? null : this.b.b(bArr2);
            if (b10 != null) {
                long j11 = -9223372036854775807L;
                try {
                    str2 = (String) b10.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j10 = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j10);
                    str = (String) b10.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j11 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j11));
                }
                j10 = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j10);
                str = (String) b10.get("PlaybackDurationRemaining");
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j11));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (min <= 60) {
            e2.a.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            o(2, z10, bArr);
            return;
        }
        if (min <= 0) {
            l(2, new u());
            return;
        }
        this.p = 4;
        e2.k kVar = this.h;
        synchronized (kVar.a) {
            set = kVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j) it.next()).b();
        }
    }

    public final boolean k() {
        int i10 = this.p;
        return i10 == 3 || i10 == 4;
    }

    public final void l(int i10, Throwable th2) {
        int i11;
        Set set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i11 = m0.z(m0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !a0.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i11 = 6007;
                    } else if (th2 instanceof x) {
                        i11 = 6001;
                    } else if (th2 instanceof c) {
                        i11 = 6003;
                    } else if (th2 instanceof u) {
                        i11 = 6008;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = 6004;
                        } else if (i10 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i11 = 6002;
            }
            i11 = 6006;
        }
        this.u = new f(i11, th2);
        e2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.k kVar = this.h;
            synchronized (kVar.a) {
                set = kVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((j) it.next()).d((Exception) th2);
            }
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!a0.c(th2) && !a0.b(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || a0.b(th2)) {
            this.c.b(this);
        } else {
            l(z10 ? 1 : 2, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        Set set;
        if (k()) {
            return true;
        }
        try {
            byte[] D = this.b.D();
            this.v = D;
            this.b.k(D, this.j);
            this.t = this.b.q(this.v);
            this.p = 3;
            e2.k kVar = this.h;
            synchronized (kVar.a) {
                set = kVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.b(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (a0.b(e)) {
                l(1, e);
                return false;
            }
            this.c.b(this);
            return false;
        } catch (NoSuchMethodError e7) {
            e = e7;
            if (a0.b(e)) {
            }
        }
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            synchronized (this.o) {
                try {
                    this.y = new h5(7);
                    List list = this.a;
                    if (list != null) {
                        n0.u(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o k02 = this.b.k0(bArr, this.a, i10, this.g);
            this.x = k02;
            android.support.v4.media.session.f fVar = this.s;
            String str = m0.a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.u.g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            e2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
