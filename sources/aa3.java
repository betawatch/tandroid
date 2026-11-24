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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class aa3 implements sq3 {
    public final List a;
    public final i54 b;
    public final lv6 c;
    public final qx4 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final kw2 h;
    public final i2f i;
    public final uc8 j;
    public final xf4 k;
    public final UUID l;
    public final Looper m;
    public final c1 n;
    public final Object o;
    public byte p;
    public int q;
    public HandlerThread r;
    public y93 s;
    public kp4 t;
    public rq3 u;
    public byte[] v;
    public byte[] w;
    public g54 x;
    public z24 y;
    public h54 z;

    public aa3(UUID uuid, i54 i54Var, lv6 lv6Var, qx4 qx4Var, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, xf4 xf4Var, Looper looper, i2f i2fVar, uc8 uc8Var) {
        this.l = uuid;
        this.c = lv6Var;
        this.d = qx4Var;
        this.b = i54Var;
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
        this.k = xf4Var;
        this.h = new kw2();
        this.i = i2fVar;
        this.j = uc8Var;
        this.p = (byte) 2;
        this.m = looper;
        this.n = new c1(this, looper, (byte) 2);
        this.o = new Object();
    }

    @Override // sq3
    public final UUID a() {
        p();
        return this.l;
    }

    @Override // sq3
    public final boolean b() {
        p();
        return this.e;
    }

    @Override // sq3
    public final void c(vq3 vq3Var) {
        p();
        int i = this.q;
        if (i <= 0) {
            lad.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = (byte) 0;
            c1 c1Var = this.n;
            String str = g8c.a;
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
                this.b.l(bArr);
                this.v = null;
            }
        }
        if (vq3Var != null) {
            this.h.i(vq3Var);
            if (this.h.h(vq3Var) == 0) {
                vq3Var.e();
            }
        }
        qx4 qx4Var = this.d;
        int i3 = this.q;
        da3 da3Var = (da3) qx4Var.a;
        if (i3 == 1 && da3Var.F > 0 && da3Var.w != -9223372036854775807L) {
            da3Var.E.add(this);
            Handler handler = da3Var.K;
            handler.getClass();
            handler.postAtTime(new mk2(this, (byte) 21), this, SystemClock.uptimeMillis() + da3Var.w);
        } else if (i3 == 0) {
            da3Var.x.remove(this);
            if (da3Var.H == this) {
                da3Var.H = null;
            }
            if (da3Var.I == this) {
                da3Var.I = null;
            }
            lv6 lv6Var = da3Var.n;
            HashSet hashSet = (HashSet) lv6Var.b;
            hashSet.remove(this);
            if (((aa3) lv6Var.c) == this) {
                lv6Var.c = null;
                if (!hashSet.isEmpty()) {
                    aa3 aa3Var = (aa3) hashSet.iterator().next();
                    lv6Var.c = aa3Var;
                    h54 c = aa3Var.b.c();
                    aa3Var.z = c;
                    y93 y93Var = aa3Var.s;
                    String str2 = g8c.a;
                    c.getClass();
                    y93Var.getClass();
                    y93Var.obtainMessage(1, new z93(f86.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), c)).sendToTarget();
                }
            }
            if (da3Var.w != -9223372036854775807L) {
                Handler handler2 = da3Var.K;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                da3Var.E.remove(this);
            }
        }
        da3Var.i();
    }

    @Override // sq3
    public final void d(vq3 vq3Var) {
        p();
        if (this.q < 0) {
            lad.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (vq3Var != null) {
            kw2 kw2Var = this.h;
            synchronized (kw2Var.a) {
                ArrayList arrayList = new ArrayList(kw2Var.d);
                arrayList.add(vq3Var);
                kw2Var.d = DesugarCollections.unmodifiableList(arrayList);
                Integer num = (Integer) kw2Var.b.get(vq3Var);
                if (num == null) {
                    HashSet hashSet = new HashSet(kw2Var.c);
                    hashSet.add(vq3Var);
                    kw2Var.c = DesugarCollections.unmodifiableSet(hashSet);
                }
                kw2Var.b.put(vq3Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            gre.p(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new y93(this, this.r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (vq3Var != null && k() && this.h.h(vq3Var) == 1) {
            vq3Var.c(this.p);
        }
        da3 da3Var = (da3) this.d.a;
        if (da3Var.w != -9223372036854775807L) {
            da3Var.E.remove(this);
            Handler handler = da3Var.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // sq3
    public final int e() {
        p();
        return this.p;
    }

    @Override // sq3
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.x(str, bArr);
    }

    @Override // sq3
    public final rq3 g() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // sq3
    public final kp4 h() {
        p();
        return this.t;
    }

    public final void i(us2 us2Var) {
        Set set;
        kw2 kw2Var = this.h;
        synchronized (kw2Var.a) {
            set = kw2Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            us2Var.accept((vq3) it.next());
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
        String str3 = g8c.a;
        boolean z2 = true;
        if (this.w == null) {
            o(1, z, bArr);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.k(this.v, this.w);
            } catch (Exception | NoSuchMethodError e) {
                l(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (g51.e.equals(this.l)) {
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
            lad.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            o(2, z, bArr);
            return;
        }
        if (min <= 0) {
            l(2, new pv5());
            return;
        }
        this.p = (byte) 4;
        kw2 kw2Var = this.h;
        synchronized (kw2Var.a) {
            set = kw2Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((vq3) it.next()).b();
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
            i2 = g8c.A(g8c.B(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (!(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !ree.b(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof g6c) {
                        i2 = 6001;
                    } else if (th instanceof ba3) {
                        i2 = 6003;
                    } else if (th instanceof pv5) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            sc8.e();
                            return;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.u = new rq3(i2, th);
        lad.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            kw2 kw2Var = this.h;
            synchronized (kw2Var.a) {
                set = kw2Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((vq3) it.next()).d((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            k93.h("Unexpected Throwable subclass", th);
            return;
        } else if (!ree.c(th) && !ree.b(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = (byte) 1;
        }
    }

    public final void m(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || ree.b(th)) {
            this.c.G(this);
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
            byte[] j = this.b.j();
            this.v = j;
            this.b.w(j, this.j);
            this.t = this.b.g(this.v);
            this.p = (byte) 3;
            kw2 kw2Var = this.h;
            synchronized (kw2Var.a) {
                set = kw2Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((vq3) it.next()).c(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.G(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (ree.b(e)) {
                l(1, e);
                return false;
            }
            this.c.G(this);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (ree.b(e)) {
            }
        }
    }

    public final void o(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.o) {
                this.y = new z24((byte) 11);
                List list = this.a;
                if (list != null) {
                    mm5.q(list);
                }
            }
            g54 t = this.b.t(bArr, this.a, i, this.g);
            this.x = t;
            y93 y93Var = this.s;
            String str = g8c.a;
            t.getClass();
            y93Var.getClass();
            y93Var.obtainMessage(2, new z93(f86.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), t)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            lad.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
