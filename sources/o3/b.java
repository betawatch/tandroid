package o3;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import h5.d0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import lh.c3;
import n7.qa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements i {
    public final List a;
    public final v b;
    public final qa c;
    public final o5.i d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final h5.e h;
    public final ab.a i;
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
    public h t;
    public byte[] u;
    public byte[] v;
    public t w;
    public u x;

    public b(UUID uuid, v vVar, qa qaVar, o5.i iVar, List list, boolean z4, boolean z10, byte[] bArr, HashMap hashMap, cb.m mVar, Looper looper, ab.a aVar, k3.k kVar) {
        this.l = uuid;
        this.c = qaVar;
        this.d = iVar;
        this.b = vVar;
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
        this.i = aVar;
        this.j = kVar;
        this.o = 2;
        this.m = looper;
        this.n = new androidx.mediarouter.app.d(this, looper, 7);
    }

    @Override // o3.i
    public final UUID a() {
        o();
        return this.l;
    }

    @Override // o3.i
    public final boolean b() {
        o();
        return this.e;
    }

    @Override // o3.i
    public final void c(l lVar) {
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
            int i12 = d0.a;
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
                this.b.q1(bArr);
                this.u = null;
            }
        }
        if (lVar != null) {
            this.h.n(lVar);
            if (this.h.i(lVar) == 0) {
                lVar.e();
            }
        }
        o5.i iVar = this.d;
        int i13 = this.p;
        e eVar = (e) iVar.b;
        if (i13 == 1 && eVar.B > 0 && eVar.v != -9223372036854775807L) {
            eVar.y.add(this);
            Handler handler = eVar.G;
            handler.getClass();
            handler.postAtTime(new c3(this, 23), this, SystemClock.uptimeMillis() + eVar.v);
        } else if (i13 == 0) {
            eVar.w.remove(this);
            if (eVar.D == this) {
                eVar.D = null;
            }
            if (eVar.E == this) {
                eVar.E = null;
            }
            qa qaVar = eVar.n;
            HashSet hashSet = (HashSet) qaVar.b;
            hashSet.remove(this);
            if (((b) qaVar.c) == this) {
                qaVar.c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    qaVar.c = bVar;
                    u J = bVar.b.J();
                    bVar.x = J;
                    android.support.v4.media.session.f fVar2 = bVar.r;
                    int i14 = d0.a;
                    J.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(0, new a(o4.j.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), J)).sendToTarget();
                }
            }
            if (eVar.v != -9223372036854775807L) {
                Handler handler2 = eVar.G;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.y.remove(this);
            }
        }
        eVar.j();
    }

    @Override // o3.i
    public final void d(l lVar) {
        o();
        if (this.p < 0) {
            h5.a.o("DefaultDrmSession", "Session reference count less than zero: " + this.p);
            this.p = 0;
        }
        if (lVar != null) {
            h5.e eVar = this.h;
            synchronized (eVar.a) {
                try {
                    ArrayList arrayList = new ArrayList(eVar.d);
                    arrayList.add(lVar);
                    eVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) eVar.b.get(lVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(eVar.c);
                        hashSet.add(lVar);
                        eVar.c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    eVar.b.put(lVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
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
        } else if (lVar != null && j() && this.h.i(lVar) == 1) {
            lVar.c(this.o);
        }
        e eVar2 = (e) this.d.b;
        if (eVar2.v != -9223372036854775807L) {
            eVar2.y.remove(this);
            Handler handler = eVar2.G;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // o3.i
    public final int e() {
        o();
        return this.o;
    }

    @Override // o3.i
    public final boolean f(String str) {
        o();
        byte[] bArr = this.u;
        h5.a.j(bArr);
        return this.b.C2(str, bArr);
    }

    @Override // o3.i
    public final h g() {
        o();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // o3.i
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
        int i10 = d0.a;
        byte[] bArr2 = this.v;
        if (bArr2 == null) {
            n(1, z4, bArr);
            return;
        }
        if (this.o != 4) {
            try {
                this.b.k1(bArr, bArr2);
            } catch (Exception e6) {
                k(e6, 1);
                return;
            }
        }
        if (j3.h.d.equals(this.l)) {
            o();
            byte[] bArr3 = this.u;
            Pair pair = null;
            Map w10 = bArr3 == null ? null : this.b.w(bArr3);
            if (w10 != null) {
                long j11 = -9223372036854775807L;
                try {
                    str2 = (String) w10.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j10 = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j10);
                    str = (String) w10.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j11 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j11));
                }
                j10 = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j10);
                str = (String) w10.get("PlaybackDurationRemaining");
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
            k(new a0(), 2);
            return;
        }
        this.o = 4;
        h5.e eVar = this.h;
        synchronized (eVar.a) {
            set = eVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((l) it.next()).b();
        }
    }

    public final boolean j() {
        int i10 = this.o;
        return i10 == 3 || i10 == 4;
    }

    public final void k(Exception exc, int i10) {
        int i11;
        Set set;
        int i12 = d0.a;
        if (i12 < 21 || !q.a(exc)) {
            if (i12 < 23 || !r.a(exc)) {
                if (i12 < 18 || !p.b(exc)) {
                    if (i12 >= 18 && p.a(exc)) {
                        i11 = 6007;
                    } else if (exc instanceof c0) {
                        i11 = 6001;
                    } else if (exc instanceof c) {
                        i11 = 6003;
                    } else if (exc instanceof a0) {
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
            i11 = q.b(exc);
        }
        this.t = new h(exc, i11);
        h5.a.p("DefaultDrmSession", "DRM session error", exc);
        h5.e eVar = this.h;
        synchronized (eVar.a) {
            set = eVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((l) it.next()).d(exc);
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
        u J = this.b.J();
        this.x = J;
        android.support.v4.media.session.f fVar = this.r;
        int i10 = d0.a;
        J.getClass();
        fVar.getClass();
        fVar.obtainMessage(0, new a(o4.j.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), J)).sendToTarget();
    }

    public final boolean m() {
        Set set;
        if (j()) {
            return true;
        }
        try {
            byte[] O0 = this.b.O0();
            this.u = O0;
            this.b.U(O0, this.j);
            this.s = this.b.E0(this.u);
            this.o = 3;
            h5.e eVar = this.h;
            synchronized (eVar.a) {
                set = eVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((l) it.next()).c(3);
            }
            this.u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            qa qaVar = this.c;
            ((HashSet) qaVar.b).add(this);
            if (((b) qaVar.c) == null) {
                qaVar.c = this;
                u J = this.b.J();
                this.x = J;
                android.support.v4.media.session.f fVar = this.r;
                int i10 = d0.a;
                J.getClass();
                fVar.getClass();
                fVar.obtainMessage(0, new a(o4.j.a.getAndIncrement(), true, SystemClock.elapsedRealtime(), J)).sendToTarget();
            }
            return false;
        } catch (Exception e6) {
            k(e6, 1);
            return false;
        }
    }

    public final void n(int i10, boolean z4, byte[] bArr) {
        try {
            t Z1 = this.b.Z1(bArr, this.a, i10, this.g);
            this.w = Z1;
            android.support.v4.media.session.f fVar = this.r;
            int i11 = d0.a;
            Z1.getClass();
            fVar.getClass();
            fVar.obtainMessage(1, new a(o4.j.a.getAndIncrement(), z4, SystemClock.elapsedRealtime(), Z1)).sendToTarget();
        } catch (Exception e6) {
            l(e6, true);
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
