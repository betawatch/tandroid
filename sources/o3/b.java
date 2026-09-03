package o3;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import n7.qa;
import nh.n5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b implements j {
    public final List a;
    public final w b;
    public final qa c;
    public final ja.c d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final h5.e h;
    public final z9.d i;
    public final k3.k j;
    public final cb.m k;
    public final UUID l;
    public final Looper m;
    public final androidx.mediarouter.app.d n;
    public int o;
    public int p;
    public HandlerThread q;
    public android.support.v4.media.session.f r;
    public n3.b s;
    public i t;
    public byte[] u;
    public byte[] v;
    public u w;
    public v x;

    public b(UUID uuid, w wVar, qa qaVar, ja.c cVar, List list, boolean z4, boolean z10, byte[] bArr, HashMap hashMap, cb.m mVar, Looper looper, z9.d dVar, k3.k kVar) {
        this.l = uuid;
        this.c = qaVar;
        this.d = cVar;
        this.b = wVar;
        this.e = z4;
        this.f = z10;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = mVar;
        this.h = new h5.e();
        this.i = dVar;
        this.j = kVar;
        this.o = 2;
        this.m = looper;
        this.n = new androidx.mediarouter.app.d(this, looper, 7);
    }

    @Override // o3.j
    public final UUID a() {
        o();
        return this.l;
    }

    @Override // o3.j
    public final boolean b() {
        o();
        return this.e;
    }

    @Override // o3.j
    public final void c(m mVar) {
        o();
        int i10 = this.p;
        if (i10 <= 0) {
            h5.a.o("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.p = i11;
        if (i11 == 0) {
            this.o = 0;
            androidx.mediarouter.app.d dVar = this.n;
            int i12 = h5.d0.a;
            dVar.removeCallbacksAndMessages(null);
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
                this.b.H(bArr);
                this.u = null;
            }
        }
        if (mVar != null) {
            this.h.n(mVar);
            if (this.h.i(mVar) == 0) {
                mVar.e();
            }
        }
        ja.c cVar = this.d;
        int i13 = this.p;
        f fVar2 = (f) cVar.b;
        if (i13 == 1 && fVar2.B > 0 && fVar2.v != -9223372036854775807L) {
            fVar2.y.add(this);
            Handler handler = fVar2.G;
            handler.getClass();
            handler.postAtTime(new n5(this, 15), this, SystemClock.uptimeMillis() + fVar2.v);
        } else if (i13 == 0) {
            fVar2.w.remove(this);
            if (fVar2.D == this) {
                fVar2.D = null;
            }
            if (fVar2.E == this) {
                fVar2.E = null;
            }
            qa qaVar = fVar2.n;
            HashSet hashSet = (HashSet) qaVar.b;
            hashSet.remove(this);
            if (((b) qaVar.c) == this) {
                qaVar.c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    qaVar.c = bVar;
                    v d = bVar.b.d();
                    bVar.x = d;
                    android.support.v4.media.session.f fVar3 = bVar.r;
                    int i14 = h5.d0.a;
                    d.getClass();
                    fVar3.getClass();
                    fVar3.obtainMessage(0, new a(o4.j.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
                }
            }
            if (fVar2.v != -9223372036854775807L) {
                Handler handler2 = fVar2.G;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar2.y.remove(this);
            }
        }
        fVar2.g();
    }

    @Override // o3.j
    public final void d(m mVar) {
        o();
        if (this.p < 0) {
            h5.a.o("DefaultDrmSession", "Session reference count less than zero: " + this.p);
            this.p = 0;
        }
        if (mVar != null) {
            h5.e eVar = this.h;
            synchronized (eVar.a) {
                try {
                    ArrayList arrayList = new ArrayList(eVar.d);
                    arrayList.add(mVar);
                    eVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) eVar.b.get(mVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(eVar.c);
                        hashSet.add(mVar);
                        eVar.c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    eVar.b.put(mVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i10 = this.p + 1;
        this.p = i10;
        if (i10 == 1) {
            h5.a.i(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new android.support.v4.media.session.f(this, this.q.getLooper());
            if (m()) {
                i(true);
            }
        } else if (mVar != null && j() && this.h.i(mVar) == 1) {
            mVar.c(this.o);
        }
        f fVar = (f) this.d.b;
        if (fVar.v != -9223372036854775807L) {
            fVar.y.remove(this);
            Handler handler = fVar.G;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // o3.j
    public final int e() {
        o();
        return this.o;
    }

    @Override // o3.j
    public final boolean f(String str) {
        o();
        byte[] bArr = this.u;
        h5.a.j(bArr);
        return this.b.j0(str, bArr);
    }

    @Override // o3.j
    public final i g() {
        o();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // o3.j
    public final n3.b h() {
        o();
        return this.s;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(2:41|42)|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006b A[Catch: NumberFormatException -> 0x006f, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x006f, blocks: (B:47:0x0063, B:49:0x006b), top: B:46:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z4) {
        long min;
        long j10;
        String str;
        String str2;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.u;
        int i10 = h5.d0.a;
        byte[] bArr2 = this.v;
        if (bArr2 == null) {
            n(1, z4, bArr);
            return;
        }
        if (this.o != 4) {
            try {
                this.b.G(bArr, bArr2);
            } catch (Exception e) {
                k(e, 1);
                return;
            }
        }
        if (j3.h.d.equals(this.l)) {
            o();
            byte[] bArr3 = this.u;
            Pair pair = null;
            Map a2 = bArr3 == null ? null : this.b.a(bArr3);
            if (a2 != null) {
                long j11 = -9223372036854775807L;
                try {
                    str2 = (String) a2.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j10 = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j10);
                    str = (String) a2.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j11 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j11));
                }
                j10 = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j10);
                str = (String) a2.get("PlaybackDurationRemaining");
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
            h5.a.n("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            n(2, z4, bArr);
            return;
        }
        if (min <= 0) {
            k(new b0(), 2);
            return;
        }
        this.o = 4;
        h5.e eVar = this.h;
        synchronized (eVar.a) {
            set = eVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m) it.next()).b();
        }
    }

    public final boolean j() {
        int i10 = this.o;
        return i10 == 3 || i10 == 4;
    }

    public final void k(Exception exc, int i10) {
        int i11;
        Set set;
        int i12 = h5.d0.a;
        if (i12 < 21 || !r.a(exc)) {
            if (i12 < 23 || !s.a(exc)) {
                if (i12 < 18 || !q.b(exc)) {
                    if (i12 >= 18 && q.a(exc)) {
                        i11 = 6007;
                    } else if (exc instanceof d0) {
                        i11 = 6001;
                    } else if (exc instanceof d) {
                        i11 = 6003;
                    } else if (exc instanceof b0) {
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
        } else {
            i11 = r.b(exc);
        }
        this.t = new i(exc, i11);
        h5.a.p("DefaultDrmSession", "DRM session error", exc);
        h5.e eVar = this.h;
        synchronized (eVar.a) {
            set = eVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d(exc);
        }
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void l(Exception exc, boolean z4) {
        if (!(exc instanceof NotProvisionedException)) {
            k(exc, z4 ? 1 : 2);
            return;
        }
        qa qaVar = this.c;
        ((HashSet) qaVar.b).add(this);
        if (((b) qaVar.c) != null) {
            return;
        }
        qaVar.c = this;
        v d = this.b.d();
        this.x = d;
        android.support.v4.media.session.f fVar = this.r;
        int i10 = h5.d0.a;
        d.getClass();
        fVar.getClass();
        fVar.obtainMessage(0, new a(o4.j.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
    }

    public final boolean m() {
        Set set;
        if (j()) {
            return true;
        }
        try {
            byte[] B = this.b.B();
            this.u = B;
            this.b.k(B, this.j);
            this.s = this.b.z(this.u);
            this.o = 3;
            h5.e eVar = this.h;
            synchronized (eVar.a) {
                set = eVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((m) it.next()).c(3);
            }
            this.u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            qa qaVar = this.c;
            ((HashSet) qaVar.b).add(this);
            if (((b) qaVar.c) == null) {
                qaVar.c = this;
                v d = this.b.d();
                this.x = d;
                android.support.v4.media.session.f fVar = this.r;
                int i10 = h5.d0.a;
                d.getClass();
                fVar.getClass();
                fVar.obtainMessage(0, new a(o4.j.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            k(e, 1);
            return false;
        }
    }

    public final void n(int i10, boolean z4, byte[] bArr) {
        try {
            u b02 = this.b.b0(bArr, this.a, i10, this.g);
            this.w = b02;
            android.support.v4.media.session.f fVar = this.r;
            int i11 = h5.d0.a;
            b02.getClass();
            fVar.getClass();
            fVar.obtainMessage(1, new a(o4.j.a.getAndIncrement(), z4, SystemClock.elapsedRealtime(), b02)).sendToTarget();
        } catch (Exception e) {
            l(e, true);
        }
    }

    public final void o() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            h5.a.L("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
