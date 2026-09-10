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
import gg.g0;
import gg.v1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import n4.y;
import w7.a0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b implements g {
    public final List a;
    public final r b;
    public final y c;
    public final a4.m d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final e2.i h;
    public final rb.a i;
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
    public f t;
    public byte[] u;
    public byte[] v;
    public p w;
    public q x;

    public b(UUID uuid, r rVar, y yVar, a4.m mVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, com.google.firebase.messaging.m mVar2, Looper looper, rb.a aVar, j2.k kVar) {
        this.l = uuid;
        this.c = yVar;
        this.d = mVar;
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
        this.k = mVar2;
        this.h = new e2.i();
        this.i = aVar;
        this.j = kVar;
        this.o = 2;
        this.m = looper;
        this.n = new androidx.mediarouter.app.c(this, looper, 4);
    }

    @Override // n2.g
    public final void a(j jVar) {
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
                this.b.G(bArr);
                this.u = null;
            }
        }
        if (jVar != null) {
            this.h.n(jVar);
            if (this.h.i(jVar) == 0) {
                jVar.e();
            }
        }
        a4.m mVar = this.d;
        int i12 = this.p;
        e eVar = (e) mVar.b;
        if (i12 == 1 && eVar.E > 0 && eVar.v != -9223372036854775807L) {
            eVar.y.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new v1(this, 22), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i12 == 0) {
            eVar.w.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            y yVar = eVar.n;
            HashSet hashSet = (HashSet) yVar.b;
            hashSet.remove(this);
            if (((b) yVar.c) == this) {
                yVar.c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    yVar.c = bVar;
                    q p5 = bVar.b.p();
                    bVar.x = p5;
                    android.support.v4.media.session.f fVar2 = bVar.r;
                    String str2 = d0.a;
                    p5.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(u2.u.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), p5)).sendToTarget();
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
        if (this.p < 0) {
            e2.a.e("DefaultDrmSession", "Session reference count less than zero: " + this.p);
            this.p = 0;
        }
        if (jVar != null) {
            e2.i iVar = this.h;
            synchronized (iVar.a) {
                try {
                    ArrayList arrayList = new ArrayList(iVar.d);
                    arrayList.add(jVar);
                    iVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) iVar.b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(iVar.c);
                        hashSet.add(jVar);
                        iVar.c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    iVar.b.put(jVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
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
        } else if (jVar != null && k() && this.h.i(jVar) == 1) {
            jVar.c(this.o);
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
        return this.o;
    }

    @Override // n2.g
    public final boolean f(String str) {
        p();
        byte[] bArr = this.u;
        e2.d.h(bArr);
        return this.b.j0(str, bArr);
    }

    @Override // n2.g
    public final f g() {
        p();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // n2.g
    public final h2.b h() {
        p();
        return this.s;
    }

    public final void i(g0 g0Var) {
        Set set;
        e2.i iVar = this.h;
        synchronized (iVar.a) {
            set = iVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
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
                this.b.F(this.u, this.v);
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
            Map h = bArr2 == null ? null : this.b.h(bArr2);
            if (h != null) {
                long j10 = -9223372036854775807L;
                try {
                    str2 = (String) h.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j3 = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j3);
                    str = (String) h.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j10 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j10));
                }
                j3 = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j3);
                str = (String) h.get("PlaybackDurationRemaining");
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
            ((j) it.next()).b();
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
                if (!(th2 instanceof NotProvisionedException) && !a0.b(th2)) {
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
        this.t = new f(i11, th2);
        e2.a.f("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            e2.i iVar = this.h;
            synchronized (iVar.a) {
                set = iVar.c;
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
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || a0.b(th2)) {
            this.c.q(this);
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
            byte[] B = this.b.B();
            this.u = B;
            this.b.l(B, this.j);
            this.s = this.b.x(this.u);
            this.o = 3;
            e2.i iVar = this.h;
            synchronized (iVar.a) {
                set = iVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(3);
            }
            this.u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.q(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (a0.b(e)) {
                l(1, e);
                return false;
            }
            this.c.q(this);
            return false;
        } catch (NoSuchMethodError e7) {
            e = e7;
            if (a0.b(e)) {
            }
        }
    }

    public final void o(int i10, boolean z10, byte[] bArr) {
        try {
            p Z = this.b.Z(bArr, this.a, i10, this.g);
            this.w = Z;
            android.support.v4.media.session.f fVar = this.r;
            String str = d0.a;
            Z.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(u2.u.b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), Z)).sendToTarget();
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
