package m4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import v7.q8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class o0 implements j9.t, v {
    public b2.s0 a;
    public String b;
    public Uri c;
    public long d;
    public final /* synthetic */ Object e;

    public o0(q0 q0Var) {
        this.e = q0Var;
        this.a = b2.s0.L;
        this.b = "";
        this.d = -9223372036854775807L;
    }

    @Override // m4.v
    public void c(int i10, b2.c1 c1Var) {
        q0 q0Var = (q0) this.e;
        n1 n1Var = q0Var.g.t;
        int i11 = n1Var.o0(20) ? 4 : 0;
        if (q0Var.s != i11) {
            q0Var.s = i11;
            ((n4.n) q0Var.m.b).a.setFlags(i11 | 3);
        }
        q0Var.O(n1Var);
    }

    @Override // m4.v
    public void e(int i10, p1 p1Var) {
        Bundle bundle = p1Var.c;
        Bundle bundle2 = Bundle.EMPTY;
        if (!bundle2.isEmpty()) {
            if (bundle.isEmpty()) {
                bundle = bundle2;
            } else {
                Bundle bundle3 = new Bundle(bundle);
                bundle3.putAll(bundle2);
                bundle = bundle3;
            }
        }
        n4.s sVar = ((q0) this.e).m;
        String str = p1Var.b;
        sVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((n4.n) sVar.b).a.sendSessionEvent(str, bundle);
    }

    @Override // m4.v
    public void f(int i10, s1 s1Var, boolean z10, boolean z11, int i11) {
        q0 q0Var = (q0) this.e;
        q0Var.O(q0Var.g.t);
    }

    @Override // j9.t
    public void i(Throwable th2) {
        if (this != ((q0) ((o0) this.e).e).r) {
            return;
        }
        e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void k() {
        q0 q0Var = (q0) this.e;
        n1 n1Var = q0Var.g.t;
        n1Var.J().getClass();
        ((n4.n) q0Var.m.b).a.setPlaybackToLocal((n1Var.o0(21) ? n1Var.H() : b2.f.i).b());
    }

    public void l(b2.p0 p0Var) {
        q0 q0Var = (q0) this.e;
        n4.s sVar = q0Var.m;
        r();
        if (p0Var == null) {
            ((n4.n) sVar.b).a.setRatingType(0);
        } else {
            ((n4.n) sVar.b).a.setRatingType(o.e(p0Var.d.i));
        }
        q0Var.O(q0Var.g.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (j$.util.Objects.equals(r4.o0(18) ? r4.i0() : b2.s0.L, r1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(int i10, n1 n1Var, n1 n1Var2) {
        q0 q0Var = (q0) this.e;
        b2.p1 T0 = n1Var2.T0();
        if (n1Var == null || !Objects.equals(n1Var.T0(), T0)) {
            q(T0);
        }
        b2.s0 i02 = n1Var2.o0(18) ? n1Var2.i0() : b2.s0.L;
        if (n1Var != null) {
        }
        n(i02);
        b2.s0 U0 = n1Var2.U0();
        if (n1Var == null || !Objects.equals(n1Var.U0(), U0)) {
            r();
        }
        if (n1Var == null || n1Var.D0() != n1Var2.D0()) {
            p(n1Var2.D0());
        }
        if (n1Var == null || n1Var.l() != n1Var2.l()) {
            o(n1Var2.l());
        }
        n1Var2.J();
        k();
        int i11 = n1Var2.o0(20) ? 4 : 0;
        if (q0Var.s != i11) {
            q0Var.s = i11;
            ((n4.n) q0Var.m.b).a.setFlags(i11 | 3);
        }
        b2.p0 S0 = n1Var2.S0();
        if (n1Var == null || !Objects.equals(n1Var.S0(), S0)) {
            l(S0);
        } else {
            q0Var.O(n1Var2);
        }
    }

    public void n(b2.s0 s0Var) {
        q0 q0Var = (q0) this.e;
        n4.s sVar = q0Var.m;
        CharSequence queueTitle = ((n4.f) ((n4.w) sVar.c).a).a.getQueueTitle();
        CharSequence charSequence = s0Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        n1 n1Var = q0Var.g.t;
        if (!q0Var.x.a(17) || !n1Var.s().a(17)) {
            charSequence = null;
        }
        ((n4.n) sVar.b).a.setQueueTitle(charSequence);
    }

    public void o(int i10) {
        n4.s sVar = ((q0) this.e).m;
        int i11 = o.a;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                i12 = 1;
            } else if (i10 != 2) {
                e2.a.l("LegacyConversions", "Unrecognized RepeatMode: " + i10 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
            } else {
                i12 = 2;
            }
        }
        n4.n nVar = (n4.n) sVar.b;
        if (nVar.j != i12) {
            nVar.j = i12;
            synchronized (nVar.d) {
                for (int beginBroadcast = nVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) nVar.f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                nVar.f.finishBroadcast();
            }
        }
    }

    @Override // j9.t
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        q0 q0Var = (q0) ((o0) this.e).e;
        if (this != q0Var.r) {
            return;
        }
        q0.E(q0Var.m, o.b(this.a, this.b, this.c, this.d, bitmap));
        f0 f0Var = q0Var.g;
        e2.m0.W(f0Var.o, new z(f0Var, 1));
    }

    public void p(boolean z10) {
        n4.s sVar = ((q0) this.e).m;
        int i10 = o.a;
        n4.n nVar = (n4.n) sVar.b;
        if (nVar.k != z10) {
            nVar.k = z10 ? 1 : 0;
            synchronized (nVar.d) {
                for (int beginBroadcast = nVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) nVar.f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                nVar.f.finishBroadcast();
            }
        }
    }

    public void q(b2.p1 p1Var) {
        s(p1Var);
        r();
    }

    public void r() {
        long j10;
        Uri uri;
        b2.s0 s0Var;
        Uri uri2;
        q0 q0Var = (q0) this.e;
        f0 f0Var = q0Var.g;
        n1 n1Var = f0Var.t;
        b2.p0 S0 = n1Var.S0();
        b2.s0 U0 = n1Var.U0();
        long j11 = -9223372036854775807L;
        if ((!n1Var.o0(16) || !n1Var.P0()) && n1Var.o0(16)) {
            j11 = n1Var.getDuration();
        }
        String str = S0 != null ? S0.a : "";
        Bitmap bitmap = null;
        Uri uri3 = (S0 == null || (uri2 = S0.f.a) == null) ? null : uri2;
        if (Objects.equals(this.a, U0) && Objects.equals(this.b, str) && Objects.equals(this.c, uri3) && this.d == j11) {
            return;
        }
        this.b = str;
        this.c = uri3;
        this.a = U0;
        this.d = j11;
        j9.y d = f0Var.m.d(U0);
        if (d != null) {
            q0Var.r = null;
            if (!d.isDone()) {
                j10 = j11;
                uri = uri3;
                s0Var = U0;
                o0 o0Var = new o0(this, s0Var, str, uri, j10);
                str = str;
                q0Var.r = o0Var;
                Handler handler = f0Var.l;
                Objects.requireNonNull(handler);
                d.a(new j9.u(0, d, o0Var), new i2.f0(handler, 1));
                q0.E(q0Var.m, o.b(s0Var, str, uri, j10, bitmap));
            }
            try {
                bitmap = (Bitmap) q8.a(d);
            } catch (CancellationException | ExecutionException e) {
                e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
            }
        }
        j10 = j11;
        uri = uri3;
        s0Var = U0;
        q0.E(q0Var.m, o.b(s0Var, str, uri, j10, bitmap));
    }

    public void s(b2.p1 p1Var) {
        q0 q0Var = (q0) this.e;
        f0 f0Var = q0Var.g;
        n1 n1Var = f0Var.t;
        if (!q0Var.x.a(17) || !n1Var.s().a(17) || p1Var.p()) {
            q0.D(q0Var.m, null);
            return;
        }
        int i10 = o.a;
        ArrayList arrayList = new ArrayList();
        b2.o1 o1Var = new b2.o1();
        for (int i11 = 0; i11 < p1Var.o(); i11++) {
            arrayList.add(p1Var.m(i11, o1Var, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(this, new AtomicInteger(0), arrayList, arrayList2, 21);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr = ((b2.p0) arrayList.get(i12)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                bVar.run();
            } else {
                j9.y q6 = f0Var.m.q(bArr);
                arrayList2.add(q6);
                Handler handler = f0Var.l;
                Objects.requireNonNull(handler);
                q6.a(bVar, new i2.f0(handler, 1));
            }
        }
    }

    public o0(o0 o0Var, b2.s0 s0Var, String str, Uri uri, long j10) {
        this.e = o0Var;
        this.a = s0Var;
        this.b = str;
        this.c = uri;
        this.d = j10;
    }

    @Override // m4.v
    public void g() {
    }

    @Override // m4.v
    public /* synthetic */ void b(int i10) {
    }

    @Override // m4.v
    public /* synthetic */ void a(int i10, p pVar) {
    }

    @Override // m4.v
    public /* synthetic */ void j(int i10, t1 t1Var) {
    }

    @Override // m4.v
    public /* synthetic */ void d(int i10, int i11, int i12) {
    }

    @Override // m4.v
    public /* synthetic */ void h(int i10, l1 l1Var, b2.c1 c1Var, boolean z10, boolean z11) {
    }
}
