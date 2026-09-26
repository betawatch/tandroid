package m4;

import ai.h5;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import v7.m8;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class i0 implements i9.r, q {
    public b2.n0 a;
    public String b;
    public Uri c;
    public long d;
    public final /* synthetic */ Object e;

    public i0(k0 k0Var) {
        this.e = k0Var;
        this.a = b2.n0.K;
        this.b = "";
        this.d = -9223372036854775807L;
    }

    @Override // m4.q
    public void c(int i10, b2.x0 x0Var) {
        k0 k0Var = (k0) this.e;
        e1 e1Var = k0Var.g.t;
        int i11 = e1Var.m0(20) ? 4 : 0;
        if (k0Var.q != i11) {
            k0Var.q = i11;
            ((n4.r) k0Var.k.b).a.setFlags(i11 | 3);
        }
        k0Var.N(e1Var);
    }

    @Override // m4.q
    public void d(int i10, g1 g1Var) {
        Bundle bundle = Bundle.EMPTY;
        n4.y yVar = ((k0) this.e).k;
        String str = g1Var.b;
        yVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        n4.r rVar = (n4.r) yVar.b;
        if (Build.VERSION.SDK_INT < 23) {
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f.getBroadcastItem(beginBroadcast)).t0(str);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in sendSessionEvent.", e);
                    }
                }
                rVar.f.finishBroadcast();
            }
        }
        rVar.a.sendSessionEvent(str, bundle);
    }

    @Override // m4.q
    public void e(int i10, j1 j1Var, boolean z10, boolean z11, int i11) {
        k0 k0Var = (k0) this.e;
        k0Var.N(k0Var.g.t);
    }

    @Override // i9.r
    public void h(Throwable th2) {
        if (this != ((k0) ((i0) this.e).e).p) {
            return;
        }
        e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void j(b2.e eVar) {
        k0 k0Var = (k0) this.e;
        k0Var.g.t.K().getClass();
        int e = k.e(eVar);
        n4.r rVar = (n4.r) k0Var.k.b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e);
        rVar.a.setPlaybackToLocal(builder.build());
    }

    public void k() {
        k0 k0Var = (k0) this.e;
        e1 e1Var = k0Var.g.t;
        e1Var.K().getClass();
        int e = k.e(e1Var.m0(21) ? e1Var.I() : b2.e.h);
        n4.r rVar = (n4.r) k0Var.k.b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e);
        rVar.a.setPlaybackToLocal(builder.build());
    }

    public void l(b2.k0 k0Var) {
        k0 k0Var2 = (k0) this.e;
        n4.y yVar = k0Var2.k;
        r();
        if (k0Var == null) {
            ((n4.r) yVar.b).e(0);
        } else {
            ((n4.r) yVar.b).e(k.f(k0Var.d.i));
        }
        k0Var2.N(k0Var2.g.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (j$.util.Objects.equals(r4.m0(18) ? r4.h0() : b2.n0.K, r1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(int i10, e1 e1Var, e1 e1Var2) {
        k0 k0Var = (k0) this.e;
        b2.k1 Q0 = e1Var2.Q0();
        if (e1Var == null || !Objects.equals(e1Var.Q0(), Q0)) {
            q(Q0);
        }
        b2.n0 h02 = e1Var2.m0(18) ? e1Var2.h0() : b2.n0.K;
        if (e1Var != null) {
        }
        n(h02);
        b2.n0 R0 = e1Var2.R0();
        if (e1Var == null || !Objects.equals(e1Var.R0(), R0)) {
            r();
        }
        if (e1Var == null || e1Var.A0() != e1Var2.A0()) {
            p(e1Var2.A0());
        }
        if (e1Var == null || e1Var.l() != e1Var2.l()) {
            o(e1Var2.l());
        }
        e1Var2.K();
        k();
        int i11 = e1Var2.m0(20) ? 4 : 0;
        if (k0Var.q != i11) {
            k0Var.q = i11;
            ((n4.r) k0Var.k.b).a.setFlags(i11 | 3);
        }
        b2.k0 P0 = e1Var2.P0();
        if (e1Var == null || !Objects.equals(e1Var.P0(), P0)) {
            l(P0);
        } else {
            k0Var.N(e1Var2);
        }
    }

    public void n(b2.n0 n0Var) {
        k0 k0Var = (k0) this.e;
        n4.y yVar = k0Var.k;
        CharSequence queueTitle = ((n4.j) ((k2.u) yVar.c).b).a.getQueueTitle();
        CharSequence charSequence = n0Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        e1 e1Var = k0Var.g.t;
        if (!k0Var.v.a(17) || !e1Var.t().a(17)) {
            charSequence = null;
        }
        ((n4.r) yVar.b).a.setQueueTitle(charSequence);
    }

    public void o(int i10) {
        n4.y yVar = ((k0) this.e).k;
        int i11 = k.a;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                i12 = 1;
            } else if (i10 != 2) {
                e2.a.n("LegacyConversions", "Unrecognized RepeatMode: " + i10 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
            } else {
                i12 = 2;
            }
        }
        n4.r rVar = (n4.r) yVar.b;
        if (rVar.k != i12) {
            rVar.k = i12;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                rVar.f.finishBroadcast();
            }
        }
    }

    @Override // i9.r
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        k0 k0Var = (k0) ((i0) this.e).e;
        if (this != k0Var.p) {
            return;
        }
        k0.E(k0Var.k, k.b(this.a, this.b, this.c, this.d, bitmap));
        a0 a0Var = k0Var.g;
        e2.d0.U(a0Var.o, new u(a0Var, 1));
    }

    public void p(boolean z10) {
        n4.y yVar = ((k0) this.e).k;
        int i10 = k.a;
        n4.r rVar = (n4.r) yVar.b;
        if (rVar.l != z10) {
            rVar.l = z10 ? 1 : 0;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                rVar.f.finishBroadcast();
            }
        }
    }

    public void q(b2.k1 k1Var) {
        s(k1Var);
        r();
    }

    public void r() {
        i9.w wVar;
        Uri uri;
        long j3;
        Uri uri2;
        b2.n0 n0Var;
        Uri uri3;
        k0 k0Var = (k0) this.e;
        a0 a0Var = k0Var.g;
        e1 e1Var = a0Var.t;
        b2.k0 P0 = e1Var.P0();
        b2.n0 R0 = e1Var.R0();
        long j10 = -9223372036854775807L;
        if ((!e1Var.m0(16) || !e1Var.M0()) && e1Var.m0(16)) {
            j10 = e1Var.getDuration();
        }
        String str = P0 != null ? P0.a : "";
        Bitmap bitmap = null;
        Uri uri4 = (P0 == null || (uri3 = P0.f.a) == null) ? null : uri3;
        if (Objects.equals(this.a, R0) && Objects.equals(this.b, str) && Objects.equals(this.c, uri4) && this.d == j10) {
            return;
        }
        this.b = str;
        this.c = uri4;
        this.a = R0;
        this.d = j10;
        n4.y yVar = a0Var.m;
        yVar.getClass();
        byte[] bArr = R0.k;
        if (bArr != null) {
            wVar = yVar.o(bArr);
        } else {
            Uri uri5 = R0.m;
            if (uri5 != null) {
                la.h hVar = (la.h) yVar.c;
                if (hVar == null || (uri = (Uri) hVar.c) == null || !uri.equals(uri5)) {
                    g2.i iVar = (g2.i) yVar.b;
                    i9.w a2 = ((i9.y) iVar.a).a(new com.google.firebase.messaging.h(2, iVar, uri5));
                    yVar.c = new la.h(uri5, a2);
                    wVar = a2;
                } else {
                    wVar = (i9.w) ((la.h) yVar.c).d;
                    e2.d.h(wVar);
                }
            } else {
                wVar = null;
            }
        }
        if (wVar != null) {
            k0Var.p = null;
            if (!wVar.isDone()) {
                j3 = j10;
                uri2 = uri4;
                n0Var = R0;
                i0 i0Var = new i0(this, n0Var, str, uri2, j3);
                str = str;
                k0Var.p = i0Var;
                Handler handler = a0Var.l;
                Objects.requireNonNull(handler);
                wVar.a(new i9.s(0, wVar, i0Var), new k2.b0(handler, 0));
                k0.E(k0Var.k, k.b(n0Var, str, uri2, j3, bitmap));
            }
            try {
                bitmap = (Bitmap) m8.a(wVar);
            } catch (CancellationException | ExecutionException e) {
                e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
            }
        }
        j3 = j10;
        uri2 = uri4;
        n0Var = R0;
        k0.E(k0Var.k, k.b(n0Var, str, uri2, j3, bitmap));
    }

    public void s(b2.k1 k1Var) {
        k0 k0Var = (k0) this.e;
        a0 a0Var = k0Var.g;
        e1 e1Var = a0Var.t;
        if (!k0Var.v.a(17) || !e1Var.t().a(17) || k1Var.p()) {
            k0.D(k0Var.k, null);
            return;
        }
        int i10 = k.a;
        ArrayList arrayList = new ArrayList();
        b2.j1 j1Var = new b2.j1();
        for (int i11 = 0; i11 < k1Var.o(); i11++) {
            arrayList.add(k1Var.m(i11, j1Var, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        h5 h5Var = new h5(this, new AtomicInteger(0), arrayList, arrayList2, 22);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr = ((b2.k0) arrayList.get(i12)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                h5Var.run();
            } else {
                i9.w o9 = a0Var.m.o(bArr);
                arrayList2.add(o9);
                Handler handler = a0Var.l;
                Objects.requireNonNull(handler);
                o9.a(h5Var, new k2.b0(handler, 0));
            }
        }
    }

    public i0(i0 i0Var, b2.n0 n0Var, String str, Uri uri, long j3) {
        this.e = i0Var;
        this.a = n0Var;
        this.b = str;
        this.c = uri;
        this.d = j3;
    }

    @Override // m4.q
    public void f() {
    }

    @Override // m4.q
    public /* synthetic */ void b(int i10) {
    }

    @Override // m4.q
    public /* synthetic */ void a(int i10, l lVar) {
    }

    @Override // m4.q
    public /* synthetic */ void i(int i10, k1 k1Var) {
    }

    @Override // m4.q
    public /* synthetic */ void g(int i10, c1 c1Var, b2.x0 x0Var, boolean z10, boolean z11) {
    }
}
