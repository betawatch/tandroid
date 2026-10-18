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
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ki.t1;
import v7.u6;
import w7.a0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class b implements h {
    public final List a;
    public final r b;
    public final e c;
    public final t1 d;
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
    public g u;
    public byte[] v;
    public byte[] w;
    public p x;
    public le.b y;
    public q z;

    public b(UUID uuid, r rVar, e eVar, t1 t1Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, c2.b bVar, Looper looper, oa.d dVar, j2.k kVar) {
        this.l = uuid;
        this.c = eVar;
        this.d = t1Var;
        this.b = rVar;
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

    @Override // n2.h
    public final void a(k kVar) {
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
                this.b.Y(bArr);
                this.v = null;
            }
        }
        if (kVar != null) {
            this.h.m(kVar);
            if (this.h.h(kVar) == 0) {
                kVar.e();
            }
        }
        t1 t1Var = this.d;
        int i12 = this.q;
        f fVar = (f) t1Var.b;
        if (i12 == 1 && fVar.E > 0 && fVar.v != -9223372036854775807L) {
            fVar.y.add(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.postAtTime(new ki.u(this, 8), this, SystemClock.uptimeMillis() + fVar.v);
        } else if (i12 == 0) {
            fVar.w.remove(this);
            if (fVar.G == this) {
                fVar.G = null;
            }
            if (fVar.H == this) {
                fVar.H = null;
            }
            e eVar = fVar.n;
            HashSet hashSet = (HashSet) eVar.b;
            hashSet.remove(this);
            if (((b) eVar.c) == this) {
                eVar.c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    eVar.c = bVar;
                    q o10 = bVar.b.o();
                    bVar.z = o10;
                    android.support.v4.media.session.f fVar2 = bVar.s;
                    String str2 = m0.a;
                    o10.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), o10)).sendToTarget();
                }
            }
            if (fVar.v != -9223372036854775807L) {
                Handler handler2 = fVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar.y.remove(this);
            }
        }
        fVar.g();
    }

    @Override // n2.h
    public final void b(k kVar) {
        p();
        if (this.q < 0) {
            e2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (kVar != null) {
            e2.k kVar2 = this.h;
            synchronized (kVar2.a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar2.d);
                    arrayList.add(kVar);
                    kVar2.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar2.b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar2.c);
                        hashSet.add(kVar);
                        kVar2.c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    kVar2.b.put(kVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
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
        } else if (kVar != null && k() && this.h.h(kVar) == 1) {
            kVar.c(this.p);
        }
        f fVar = (f) this.d.b;
        if (fVar.v != -9223372036854775807L) {
            fVar.y.remove(this);
            Handler handler = fVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // n2.h
    public final UUID c() {
        p();
        return this.l;
    }

    @Override // n2.h
    public final boolean d() {
        p();
        return this.e;
    }

    @Override // n2.h
    public final int e() {
        p();
        return this.p;
    }

    @Override // n2.h
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.B0(str, bArr);
    }

    @Override // n2.h
    public final g g() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // n2.h
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
            jVar.accept((k) it.next());
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
                this.b.U(this.v, this.w);
            } catch (Exception | NoSuchMethodError e) {
                l(1, e);
                z11 = false;
            }
            if (!z11) {
                return;
            }
        }
        if (b2.m.e.equals(this.l)) {
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
            l(2, new v());
            return;
        }
        this.p = 4;
        e2.k kVar = this.h;
        synchronized (kVar.a) {
            set = kVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((k) it.next()).b();
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
                    } else if (th2 instanceof y) {
                        i11 = 6001;
                    } else if (th2 instanceof c) {
                        i11 = 6003;
                    } else if (th2 instanceof v) {
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
        this.u = new g(i11, th2);
        e2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.k kVar = this.h;
            synchronized (kVar.a) {
                set = kVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((k) it.next()).d((Exception) th2);
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
            this.c.g0(this);
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
            byte[] H = this.b.H();
            this.v = H;
            this.b.h(H, this.j);
            this.t = this.b.u(this.v);
            this.p = 3;
            e2.k kVar = this.h;
            synchronized (kVar.a) {
                set = kVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((k) it.next()).c(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.g0(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (a0.b(e)) {
                l(1, e);
                return false;
            }
            this.c.g0(this);
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
                    this.y = new le.b(3);
                    List list = this.a;
                    if (list != null) {
                        n0.u(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p k02 = this.b.k0(bArr, this.a, i10, this.g);
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
