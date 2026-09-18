package n2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import e2.d0;
import i2.g0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import w7.b0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class b implements h {
    public final List a;
    public final r b;
    public final of.b c;
    public final e d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final e2.i h;
    public final qb.b i;
    public final j2.k j;
    public final com.google.firebase.messaging.m k;
    public final UUID l;
    public final Looper m;
    public final androidx.mediarouter.app.c n;
    public int o;
    public int p;
    public HandlerThread q;
    public android.support.v4.media.session.f r;
    public h2.b s;
    public g t;
    public byte[] u;
    public byte[] v;
    public p w;
    public q x;

    public b(UUID uuid, r rVar, of.b bVar, e eVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar, Looper looper, qb.b bVar2, j2.k kVar) {
        this.l = uuid;
        this.c = bVar;
        this.d = eVar;
        this.b = rVar;
        this.e = z10;
        this.f = z11;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = mVar;
        this.h = new e2.i();
        this.i = bVar2;
        this.j = kVar;
        this.o = 2;
        this.m = looper;
        this.n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override // n2.h
    public final void a(k kVar) {
        p();
        int i10 = this.p;
        if (i10 <= 0) {
            e2.a.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.p = i11;
        if (i11 == 0) {
            this.o = 0;
            androidx.mediarouter.app.c cVar = this.n;
            String str = d0.a;
            cVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.r;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.b = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            byte[] bArr = this.u;
            if (bArr != null) {
                this.b.K(bArr);
                this.u = null;
            }
        }
        if (kVar != null) {
            this.h.n(kVar);
            if (this.h.i(kVar) == 0) {
                kVar.e();
            }
        }
        e eVar = this.d;
        int i12 = this.p;
        f fVar2 = (f) eVar.b;
        if (i12 == 1 && fVar2.E > 0 && fVar2.v != -9223372036854775807L) {
            fVar2.y.add(this);
            Handler handler = fVar2.J;
            handler.getClass();
            handler.postAtTime(new g0(this, 13), this, SystemClock.uptimeMillis() + fVar2.v);
        } else if (i12 == 0) {
            fVar2.w.remove(this);
            if (fVar2.G == this) {
                fVar2.G = null;
            }
            if (fVar2.H == this) {
                fVar2.H = null;
            }
            of.b bVar = fVar2.n;
            HashSet hashSet = (HashSet) bVar.b;
            hashSet.remove(this);
            if (((b) bVar.c) == this) {
                bVar.c = null;
                if (!hashSet.isEmpty()) {
                    b bVar2 = (b) hashSet.iterator().next();
                    bVar.c = bVar2;
                    q m10 = bVar2.b.m();
                    bVar2.x = m10;
                    android.support.v4.media.session.f fVar3 = bVar2.r;
                    String str2 = d0.a;
                    m10.getClass();
                    fVar3.getClass();
                    fVar3.obtainMessage(1, new a(u2.t.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
                }
            }
            if (fVar2.v != -9223372036854775807L) {
                Handler handler2 = fVar2.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar2.y.remove(this);
            }
        }
        fVar2.g();
    }

    @Override // n2.h
    public final void b(k kVar) {
        p();
        if (this.p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.p);
            this.p = 0;
        }
        if (kVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(kVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.c);
                        hashSet.add(kVar);
                        iVar.c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    iVar.b.put(kVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i10 = this.p + 1;
        this.p = i10;
        if (i10 == 1) {
            e2.d.g(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new android.support.v4.media.session.f(this, this.q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.i(kVar) == 1) {
            kVar.c(this.o);
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
        return this.o;
    }

    @Override // n2.h
    public final boolean f(String str) {
        p();
        byte[] bArr = this.u;
        e2.d.h(bArr);
        return this.b.r0(str, bArr);
    }

    @Override // n2.h
    public final g g() {
        p();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // n2.h
    public final h2.b h() {
        p();
        return this.s;
    }

    public final void i(ai.i iVar) {
        Set set;
        e2.i iVar2 = this.h;
        synchronized (iVar2.a) {
            set = iVar2.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(2:41|42)|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073 A[Catch: NumberFormatException -> 0x0077, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0077, blocks: (B:47:0x006b, B:49:0x0073), top: B:46:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z10) {
        long min;
        long j3;
        String str;
        String str2;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.u;
        String str3 = d0.a;
        boolean z11 = true;
        if (this.v == null) {
            o(1, z10, bArr);
            return;
        }
        if (this.o != 4) {
            try {
                this.b.J(this.u, this.v);
            } catch (Exception | NoSuchMethodError e) {
                l(1, e);
                z11 = false;
            }
            if (!z11) {
                return;
            }
        }
        if (b2.i.d.equals(this.l)) {
            p();
            byte[] bArr2 = this.u;
            Pair pair = null;
            Map c10 = bArr2 == null ? null : this.b.c(bArr2);
            if (c10 != null) {
                long j10 = -9223372036854775807L;
                try {
                    str2 = (String) c10.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j3 = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j3);
                    str = (String) c10.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j10 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j10));
                }
                j3 = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j3);
                str = (String) c10.get("PlaybackDurationRemaining");
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j10));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (min <= 60) {
            e2.a.d("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            o(2, z10, bArr);
            return;
        }
        if (min <= 0) {
            l(2, new v());
            return;
        }
        this.o = 4;
        e2.i iVar = this.h;
        synchronized (iVar.a) {
            set = iVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((k) it.next()).b();
        }
    }

    public final boolean k() {
        int i10 = this.o;
        return i10 == 3 || i10 == 4;
    }

    public final void l(int i10, Throwable th2) {
        int i11;
        Set set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i11 = d0.x(d0.y(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (Build.VERSION.SDK_INT < 23 || !e0.b.r(th2)) {
                if (!(th2 instanceof NotProvisionedException) && !b0.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i11 = 6007;
                    } else if (th2 instanceof x) {
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
        this.t = new g(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.a) {
                set = iVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((k) it.next()).d((Exception) th2);
            }
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!b0.c(th2) && !b0.b(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || b0.b(th2)) {
            this.c.R(this);
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
            byte[] C = this.b.C();
            this.u = C;
            this.b.l(C, this.j);
            this.s = this.b.B(this.u);
            this.o = 3;
            e2.i iVar = this.h;
            synchronized (iVar.a) {
                set = iVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((k) it.next()).c(3);
            }
            this.u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.R(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (b0.b(e)) {
                l(1, e);
                return false;
            }
            this.c.R(this);
            return false;
        } catch (NoSuchMethodError e7) {
            e = e7;
            if (b0.b(e)) {
            }
        }
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            p k02 = this.b.k0(bArr, this.a, i10, this.g);
            this.w = k02;
            android.support.v4.media.session.f fVar = this.r;
            String str = d0.a;
            k02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.t.b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), k02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
