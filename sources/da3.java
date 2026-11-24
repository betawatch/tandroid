// default package

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class da3 implements yq3 {
    public final Set E;
    public int F;
    public i54 G;
    public aa3 H;
    public aa3 I;
    public Looper J;
    public Handler K;
    public byte[] L;
    public uc8 M;
    public volatile c1 N;
    public final UUID a;
    public final wn4 b;
    public final xf4 c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final lv6 n;
    public final i2f r;
    public final qx4 s;
    public final int w;
    public final ArrayList x;
    public final Set y;

    public da3(UUID uuid, xf4 xf4Var, HashMap hashMap, boolean z, int[] iArr, boolean z2, i2f i2fVar) {
        uuid.getClass();
        gre.e("Use C.CLEARKEY_UUID instead", !g51.c.equals(uuid));
        this.a = uuid;
        this.b = mp4.d;
        this.c = xf4Var;
        this.d = hashMap;
        this.e = z;
        this.f = iArr;
        this.h = z2;
        this.r = i2fVar;
        this.n = new lv6((byte) 19);
        this.s = new qx4(this);
        this.x = new ArrayList();
        this.y = Collections.newSetFromMap(new IdentityHashMap());
        this.E = Collections.newSetFromMap(new IdentityHashMap());
        this.w = 300000;
    }

    public static boolean c(aa3 aa3Var) {
        aa3Var.p();
        if (aa3Var.p != 1) {
            return false;
        }
        rq3 g = aa3Var.g();
        g.getClass();
        Throwable cause = g.getCause();
        return (cause instanceof ResourceBusyException) || ree.c(cause);
    }

    public static ArrayList h(qq3 qq3Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(qq3Var.d);
        for (int i = 0; i < qq3Var.d; i++) {
            pq3 pq3Var = qq3Var.a[i];
            if ((pq3Var.a(uuid) || (g51.d.equals(uuid) && pq3Var.a(g51.c))) && (pq3Var.e != null || z)) {
                arrayList.add(pq3Var);
            }
        }
        return arrayList;
    }

    @Override // yq3
    public final void a() {
        i54 cffVar;
        j(true);
        int i = this.F;
        this.F = i + 1;
        if (i != 0) {
            return;
        }
        if (this.G == null) {
            UUID uuid = this.a;
            this.b.getClass();
            try {
                try {
                    cffVar = new mp4(uuid);
                } catch (g6c unused) {
                    lad.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    cffVar = new cff((byte) 18);
                }
                this.G = cffVar;
                cffVar.n(new lj9(this, (byte) 27));
                return;
            } catch (UnsupportedSchemeException e) {
                throw new g6c(e);
            } catch (Exception e2) {
                throw new g6c(e2);
            }
        }
        if (this.w == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((aa3) arrayList.get(i2)).d(null);
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (kp4.c == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sq3 b(Looper looper, vq3 vq3Var, fm4 fm4Var, boolean z) {
        ArrayList arrayList;
        if (this.N == null) {
            this.N = new c1(this, looper, (byte) 3);
        }
        qq3 qq3Var = fm4Var.x;
        int i = 0;
        aa3 aa3Var = null;
        if (qq3Var == null) {
            int h = ud7.h(fm4Var.t);
            i54 i54Var = this.G;
            i54Var.getClass();
            if (i54Var.v() == 2) {
                HashSet hashSet = cr6.a;
            }
            int[] iArr = this.f;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == h) {
                    break;
                }
                i++;
            }
            if (i != -1 && i54Var.v() != 1) {
                aa3 aa3Var2 = this.H;
                if (aa3Var2 == null) {
                    km5 km5Var = mm5.b;
                    aa3 g = g(w59.e, true, null, z);
                    this.x.add(g);
                    this.H = g;
                } else {
                    aa3Var2.d(null);
                }
                return this.H;
            }
            return null;
        }
        if (this.L == null) {
            arrayList = h(qq3Var, this.a, false);
            if (arrayList.isEmpty()) {
                ba3 ba3Var = new ba3("Media does not support uuid: " + this.a);
                lad.d("DefaultDrmSessionMgr", "DRM error", ba3Var);
                if (vq3Var != null) {
                    vq3Var.d(ba3Var);
                }
                return new y34(new rq3(6003, ba3Var));
            }
        } else {
            arrayList = null;
        }
        if (this.e) {
            ArrayList arrayList2 = this.x;
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i2);
                i2++;
                aa3 aa3Var3 = (aa3) obj;
                if (Objects.equals(aa3Var3.a, arrayList)) {
                    aa3Var = aa3Var3;
                    break;
                }
            }
        } else {
            aa3Var = this.I;
        }
        if (aa3Var != null) {
            aa3Var.d(vq3Var);
            return aa3Var;
        }
        aa3 g2 = g(arrayList, false, vq3Var, z);
        if (!this.e) {
            this.I = g2;
        }
        this.x.add(g2);
        return g2;
    }

    @Override // yq3
    public final sq3 d(vq3 vq3Var, fm4 fm4Var) {
        j(false);
        gre.p(this.F > 0);
        this.J.getClass();
        return b(this.J, vq3Var, fm4Var, true);
    }

    public final aa3 e(List list, boolean z, vq3 vq3Var) {
        this.G.getClass();
        boolean z2 = this.h | z;
        i54 i54Var = this.G;
        byte[] bArr = this.L;
        Looper looper = this.J;
        looper.getClass();
        uc8 uc8Var = this.M;
        uc8Var.getClass();
        aa3 aa3Var = new aa3(this.a, i54Var, this.n, this.s, list, z2, z, bArr, this.d, this.c, looper, this.r, uc8Var);
        aa3Var.d(vq3Var);
        if (this.w != -9223372036854775807L) {
            aa3Var.d(null);
        }
        return aa3Var;
    }

    @Override // yq3
    public final xq3 f(vq3 vq3Var, fm4 fm4Var) {
        gre.p(this.F > 0);
        this.J.getClass();
        ca3 ca3Var = new ca3(this, vq3Var);
        Handler handler = this.K;
        handler.getClass();
        handler.post(new gu2(ca3Var, fm4Var, (byte) 27));
        return ca3Var;
    }

    public final aa3 g(List list, boolean z, vq3 vq3Var, boolean z2) {
        aa3 e = e(list, z, vq3Var);
        boolean c = c(e);
        int i = this.w;
        Set set = this.E;
        if (c && !set.isEmpty()) {
            v5c it = ym5.q(set).iterator();
            while (it.hasNext()) {
                ((sq3) it.next()).c(null);
            }
            e.c(vq3Var);
            if (i != -9223372036854775807L) {
                e.c(null);
            }
            e = e(list, z, vq3Var);
        }
        if (c(e) && z2) {
            Set set2 = this.y;
            if (!set2.isEmpty()) {
                v5c it2 = ym5.q(set2).iterator();
                while (it2.hasNext()) {
                    ((ca3) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    v5c it3 = ym5.q(set).iterator();
                    while (it3.hasNext()) {
                        ((sq3) it3.next()).c(null);
                    }
                }
                e.c(vq3Var);
                if (i != -9223372036854775807L) {
                    e.c(null);
                }
                return e(list, z, vq3Var);
            }
        }
        return e;
    }

    public final void i() {
        if (this.G != null && this.F == 0 && this.x.isEmpty() && this.y.isEmpty()) {
            i54 i54Var = this.G;
            i54Var.getClass();
            i54Var.release();
            this.G = null;
        }
    }

    public final void j(boolean z) {
        if (z && this.J == null) {
            lad.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.J;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            lad.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.J.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // yq3
    public final void release() {
        j(true);
        int i = this.F - 1;
        this.F = i;
        if (i != 0) {
            return;
        }
        if (this.w != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.x);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((aa3) arrayList.get(i2)).c(null);
            }
        }
        v5c it = ym5.q(this.y).iterator();
        while (it.hasNext()) {
            ((ca3) it.next()).release();
        }
        i();
    }

    @Override // yq3
    public final void u(Looper looper, uc8 uc8Var) {
        synchronized (this) {
            Looper looper2 = this.J;
            if (looper2 == null) {
                this.J = looper;
                this.K = new Handler(looper);
            } else {
                gre.p(looper2 == looper);
                this.K.getClass();
            }
        }
        this.M = uc8Var;
    }

    @Override // yq3
    public final int w(fm4 fm4Var) {
        j(false);
        i54 i54Var = this.G;
        i54Var.getClass();
        int v = i54Var.v();
        qq3 qq3Var = fm4Var.x;
        if (qq3Var == null) {
            int h = ud7.h(fm4Var.t);
            int i = 0;
            while (true) {
                int[] iArr = this.f;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == h) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.L == null) {
            UUID uuid = this.a;
            if (h(qq3Var, uuid, true).isEmpty()) {
                if (qq3Var.d == 1 && qq3Var.a[0].a(g51.c)) {
                    lad.f("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = qq3Var.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return v;
    }
}
