// default package

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mb3 implements cs3 {
    public final List a;
    public final t64 b;
    public final hi2 c;
    public final ni6 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final ux2 h;
    public final k4f i;
    public final we8 j;
    public final yh4 k;
    public final UUID l;
    public final Looper m;
    public final c1 n;
    public final Object o;
    public byte p;
    public int q;
    public HandlerThread r;
    public kb3 s;
    public lr4 t;
    public bs3 u;
    public byte[] v;
    public byte[] w;
    public r64 x;
    public ai4 y;
    public s64 z;

    public mb3(UUID uuid, t64 t64Var, hi2 hi2Var, ni6 ni6Var, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, yh4 yh4Var, Looper looper, k4f k4fVar, we8 we8Var) {
        this.l = uuid;
        this.c = hi2Var;
        this.d = ni6Var;
        this.b = t64Var;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = yh4Var;
        this.h = new ux2();
        this.i = k4fVar;
        this.j = we8Var;
        this.p = (byte) 2;
        this.m = looper;
        this.n = new c1(this, looper, (byte) 2);
        this.o = new Object();
    }

    @Override // cs3
    public final UUID a() {
        p();
        return this.l;
    }

    @Override // cs3
    public final boolean b() {
        p();
        return this.e;
    }

    @Override // cs3
    public final void c(fs3 fs3Var) {
        p();
        int i = this.q;
        if (i <= 0) {
            ncd.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = (byte) 0;
            c1 c1Var = this.n;
            String str = hac.a;
            c1Var.removeCallbacksAndMessages(null);
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
                this.b.k(bArr);
                this.v = null;
            }
        }
        if (fs3Var != null) {
            this.h.i(fs3Var);
            if (this.h.h(fs3Var) == 0) {
                fs3Var.e();
            }
        }
        ni6 ni6Var = this.d;
        int i3 = this.q;
        pb3 pb3Var = (pb3) ni6Var.b;
        if (i3 == 1 && pb3Var.F > 0 && pb3Var.w != -9223372036854775807L) {
            pb3Var.E.add(this);
            Handler handler = pb3Var.K;
            handler.getClass();
            handler.postAtTime(new xf2(this, (byte) 26), this, SystemClock.uptimeMillis() + pb3Var.w);
        } else if (i3 == 0) {
            pb3Var.x.remove(this);
            if (pb3Var.H == this) {
                pb3Var.H = null;
            }
            if (pb3Var.I == this) {
                pb3Var.I = null;
            }
            hi2 hi2Var = pb3Var.n;
            HashSet hashSet = (HashSet) hi2Var.b;
            hashSet.remove(this);
            if (((mb3) hi2Var.c) == this) {
                hi2Var.c = null;
                if (!hashSet.isEmpty()) {
                    mb3 mb3Var = (mb3) hashSet.iterator().next();
                    hi2Var.c = mb3Var;
                    s64 c = mb3Var.b.c();
                    mb3Var.z = c;
                    kb3 kb3Var = mb3Var.s;
                    String str2 = hac.a;
                    c.getClass();
                    kb3Var.getClass();
                    kb3Var.obtainMessage(1, new lb3(ea6.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), c)).sendToTarget();
                }
            }
            if (pb3Var.w != -9223372036854775807L) {
                Handler handler2 = pb3Var.K;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                pb3Var.E.remove(this);
            }
        }
        pb3Var.i();
    }

    @Override // cs3
    public final void d(fs3 fs3Var) {
        p();
        if (this.q < 0) {
            ncd.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (fs3Var != null) {
            ux2 ux2Var = this.h;
            synchronized (ux2Var.a) {
                ArrayList arrayList = new ArrayList(ux2Var.d);
                arrayList.add(fs3Var);
                ux2Var.d = DesugarCollections.unmodifiableList(arrayList);
                Integer num = (Integer) ux2Var.b.get(fs3Var);
                if (num == null) {
                    HashSet hashSet = new HashSet(ux2Var.c);
                    hashSet.add(fs3Var);
                    ux2Var.c = DesugarCollections.unmodifiableSet(hashSet);
                }
                ux2Var.b.put(fs3Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            jte.p(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new kb3(this, this.r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (fs3Var != null && k() && this.h.h(fs3Var) == 1) {
            fs3Var.c(this.p);
        }
        pb3 pb3Var = (pb3) this.d.b;
        if (pb3Var.w != -9223372036854775807L) {
            pb3Var.E.remove(this);
            Handler handler = pb3Var.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // cs3
    public final int e() {
        p();
        return this.p;
    }

    @Override // cs3
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.u(str, bArr);
    }

    @Override // cs3
    public final bs3 g() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // cs3
    public final lr4 h() {
        p();
        return this.t;
    }

    public final void i(fu2 fu2Var) {
        Set set;
        ux2 ux2Var = this.h;
        synchronized (ux2Var.a) {
            set = ux2Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            fu2Var.accept((fs3) it.next());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:40|41|42|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070 A[Catch: NumberFormatException -> 0x0074, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0074, blocks: (B:47:0x0068, B:49:0x0070), top: B:46:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z) {
        long min;
        long j;
        String str;
        String str2;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.v;
        String str3 = hac.a;
        boolean z2 = true;
        if (this.w == null) {
            o(1, z, bArr);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.j(this.v, this.w);
            } catch (Exception | NoSuchMethodError e) {
                l(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (n61.e.equals(this.l)) {
            p();
            byte[] bArr2 = this.v;
            Pair pair = null;
            Map b = bArr2 == null ? null : this.b.b(bArr2);
            if (b != null) {
                long j2 = -9223372036854775807L;
                try {
                    str2 = (String) b.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j);
                    str = (String) b.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j2 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j2));
                }
                j = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j);
                str = (String) b.get("PlaybackDurationRemaining");
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j2));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (min <= 60) {
            ncd.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            o(2, z, bArr);
            return;
        }
        if (min <= 0) {
            l(2, new px5());
            return;
        }
        this.p = (byte) 4;
        ux2 ux2Var = this.h;
        synchronized (ux2Var.a) {
            set = ux2Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((fs3) it.next()).b();
        }
    }

    public final boolean k() {
        byte b = this.p;
        return b == 3 || b == 4;
    }

    public final void l(int i, Throwable th) {
        int i2;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = hac.A(hac.B(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (!(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !sge.b(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof h8c) {
                        i2 = 6001;
                    } else if (th instanceof nb3) {
                        i2 = 6003;
                    } else if (th instanceof px5) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            i98.g();
                            return;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.u = new bs3(i2, th);
        ncd.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            ux2 ux2Var = this.h;
            synchronized (ux2Var.a) {
                set = ux2Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((fs3) it.next()).d((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            wa3.h("Unexpected Throwable subclass", th);
            return;
        } else if (!sge.c(th) && !sge.b(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = (byte) 1;
        }
    }

    public final void m(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || sge.b(th)) {
            this.c.O(this);
        } else {
            l(z ? 1 : 2, th);
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
            byte[] i = this.b.i();
            this.v = i;
            this.b.t(i, this.j);
            this.t = this.b.f(this.v);
            this.p = (byte) 3;
            ux2 ux2Var = this.h;
            synchronized (ux2Var.a) {
                set = ux2Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((fs3) it.next()).c(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.O(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (sge.b(e)) {
                l(1, e);
                return false;
            }
            this.c.O(this);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (sge.b(e)) {
            }
        }
    }

    public final void o(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.o) {
                this.y = new ai4((byte) 9);
                List list = this.a;
                if (list != null) {
                    mo5.q(list);
                }
            }
            r64 q = this.b.q(bArr, this.a, i, this.g);
            this.x = q;
            kb3 kb3Var = this.s;
            String str = hac.a;
            q.getClass();
            kb3Var.getClass();
            kb3Var.obtainMessage(2, new lb3(ea6.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), q)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            ncd.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
