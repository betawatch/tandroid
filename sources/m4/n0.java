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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class n0 implements j9.t, u {
    public b2.r0 a;
    public String b;
    public Uri c;
    public long d;
    public final /* synthetic */ Object e;

    public n0(p0 p0Var) {
        this.e = p0Var;
        this.a = b2.r0.L;
        this.b = "";
        this.d = -9223372036854775807L;
    }

    @Override // m4.u
    public void c(int i10, b2.b1 b1Var) {
        p0 p0Var = (p0) this.e;
        m1 m1Var = p0Var.g.t;
        int i11 = m1Var.o0(20) ? 4 : 0;
        if (p0Var.s != i11) {
            p0Var.s = i11;
            ((n4.n) p0Var.m.b).a.setFlags(i11 | 3);
        }
        p0Var.O(m1Var);
    }

    @Override // m4.u
    public void e(int i10, o1 o1Var) {
        Bundle bundle = o1Var.c;
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
        n4.s sVar = ((p0) this.e).m;
        String str = o1Var.b;
        sVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        ((n4.n) sVar.b).a.sendSessionEvent(str, bundle);
    }

    @Override // m4.u
    public void f(int i10, r1 r1Var, boolean z10, boolean z11, int i11) {
        p0 p0Var = (p0) this.e;
        p0Var.O(p0Var.g.t);
    }

    @Override // j9.t
    public void i(Throwable th2) {
        if (this != ((p0) ((n0) this.e).e).r) {
            return;
        }
        e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void k() {
        p0 p0Var = (p0) this.e;
        m1 m1Var = p0Var.g.t;
        m1Var.J().getClass();
        ((n4.n) p0Var.m.b).a.setPlaybackToLocal((m1Var.o0(21) ? m1Var.H() : b2.f.i).b());
    }

    public void l(b2.o0 o0Var) {
        p0 p0Var = (p0) this.e;
        n4.s sVar = p0Var.m;
        r();
        if (o0Var == null) {
            ((n4.n) sVar.b).a.setRatingType(0);
        } else {
            ((n4.n) sVar.b).a.setRatingType(n.e(o0Var.d.i));
        }
        p0Var.O(p0Var.g.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (j$.util.Objects.equals(r4.o0(18) ? r4.i0() : b2.r0.L, r1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(int i10, m1 m1Var, m1 m1Var2) {
        p0 p0Var = (p0) this.e;
        b2.o1 T0 = m1Var2.T0();
        if (m1Var == null || !Objects.equals(m1Var.T0(), T0)) {
            q(T0);
        }
        b2.r0 i02 = m1Var2.o0(18) ? m1Var2.i0() : b2.r0.L;
        if (m1Var != null) {
        }
        n(i02);
        b2.r0 U0 = m1Var2.U0();
        if (m1Var == null || !Objects.equals(m1Var.U0(), U0)) {
            r();
        }
        if (m1Var == null || m1Var.D0() != m1Var2.D0()) {
            p(m1Var2.D0());
        }
        if (m1Var == null || m1Var.l() != m1Var2.l()) {
            o(m1Var2.l());
        }
        m1Var2.J();
        k();
        int i11 = m1Var2.o0(20) ? 4 : 0;
        if (p0Var.s != i11) {
            p0Var.s = i11;
            ((n4.n) p0Var.m.b).a.setFlags(i11 | 3);
        }
        b2.o0 S0 = m1Var2.S0();
        if (m1Var == null || !Objects.equals(m1Var.S0(), S0)) {
            l(S0);
        } else {
            p0Var.O(m1Var2);
        }
    }

    public void n(b2.r0 r0Var) {
        p0 p0Var = (p0) this.e;
        n4.s sVar = p0Var.m;
        CharSequence queueTitle = ((n4.f) ((n4.w) sVar.c).a).a.getQueueTitle();
        CharSequence charSequence = r0Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        m1 m1Var = p0Var.g.t;
        if (!p0Var.x.a(17) || !m1Var.s().a(17)) {
            charSequence = null;
        }
        ((n4.n) sVar.b).a.setQueueTitle(charSequence);
    }

    public void o(int i10) {
        n4.s sVar = ((p0) this.e).m;
        int i11 = n.a;
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
        p0 p0Var = (p0) ((n0) this.e).e;
        if (this != p0Var.r) {
            return;
        }
        p0.E(p0Var.m, n.b(this.a, this.b, this.c, this.d, bitmap));
        f0 f0Var = p0Var.g;
        e2.m0.W(f0Var.o, new y(f0Var, 1));
    }

    public void p(boolean z10) {
        n4.s sVar = ((p0) this.e).m;
        int i10 = n.a;
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

    public void q(b2.o1 o1Var) {
        s(o1Var);
        r();
    }

    public void r() {
        long j10;
        Uri uri;
        b2.r0 r0Var;
        Uri uri2;
        p0 p0Var = (p0) this.e;
        f0 f0Var = p0Var.g;
        m1 m1Var = f0Var.t;
        b2.o0 S0 = m1Var.S0();
        b2.r0 U0 = m1Var.U0();
        long j11 = -9223372036854775807L;
        if ((!m1Var.o0(16) || !m1Var.P0()) && m1Var.o0(16)) {
            j11 = m1Var.getDuration();
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
        j9.y g10 = f0Var.m.g(U0);
        if (g10 != null) {
            p0Var.r = null;
            if (!g10.isDone()) {
                j10 = j11;
                uri = uri3;
                r0Var = U0;
                n0 n0Var = new n0(this, r0Var, str, uri, j10);
                str = str;
                p0Var.r = n0Var;
                Handler handler = f0Var.l;
                Objects.requireNonNull(handler);
                g10.a(new j9.u(0, g10, n0Var), new i2.f0(handler, 1));
                p0.E(p0Var.m, n.b(r0Var, str, uri, j10, bitmap));
            }
            try {
                bitmap = (Bitmap) q8.a(g10);
            } catch (CancellationException | ExecutionException e) {
                e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
            }
        }
        j10 = j11;
        uri = uri3;
        r0Var = U0;
        p0.E(p0Var.m, n.b(r0Var, str, uri, j10, bitmap));
    }

    public void s(b2.o1 o1Var) {
        p0 p0Var = (p0) this.e;
        f0 f0Var = p0Var.g;
        m1 m1Var = f0Var.t;
        if (!p0Var.x.a(17) || !m1Var.s().a(17) || o1Var.p()) {
            p0.D(p0Var.m, null);
            return;
        }
        int i10 = n.a;
        ArrayList arrayList = new ArrayList();
        b2.n1 n1Var = new b2.n1();
        for (int i11 = 0; i11 < o1Var.o(); i11++) {
            arrayList.add(o1Var.m(i11, n1Var, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        ai.y0 y0Var = new ai.y0(this, new AtomicInteger(0), arrayList, arrayList2, 26);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr = ((b2.o0) arrayList.get(i12)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                y0Var.run();
            } else {
                j9.y v = f0Var.m.v(bArr);
                arrayList2.add(v);
                Handler handler = f0Var.l;
                Objects.requireNonNull(handler);
                v.a(y0Var, new i2.f0(handler, 1));
            }
        }
    }

    public n0(n0 n0Var, b2.r0 r0Var, String str, Uri uri, long j10) {
        this.e = n0Var;
        this.a = r0Var;
        this.b = str;
        this.c = uri;
        this.d = j10;
    }

    @Override // m4.u
    public void g() {
    }

    @Override // m4.u
    public /* synthetic */ void b(int i10) {
    }

    @Override // m4.u
    public /* synthetic */ void a(int i10, o oVar) {
    }

    @Override // m4.u
    public /* synthetic */ void j(int i10, s1 s1Var) {
    }

    @Override // m4.u
    public /* synthetic */ void d(int i10, int i11, int i12) {
    }

    @Override // m4.u
    public /* synthetic */ void h(int i10, k1 k1Var, b2.b1 b1Var, boolean z10, boolean z11) {
    }
}
