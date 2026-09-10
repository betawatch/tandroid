package m4;

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
import m.e3;
import v7.o8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class j0 implements i9.r, q {
    public b2.n0 a;
    public String b;
    public Uri c;
    public long d;
    public final /* synthetic */ Object e;

    public j0(l0 l0Var) {
        this.e = l0Var;
        this.a = b2.n0.K;
        this.b = "";
        this.d = -9223372036854775807L;
    }

    @Override // m4.q
    public void c(int i10, b2.x0 x0Var) {
        l0 l0Var = (l0) this.e;
        l1 l1Var = l0Var.g.t;
        int i11 = l1Var.m0(20) ? 4 : 0;
        if (l0Var.q != i11) {
            l0Var.q = i11;
            ((n4.r) l0Var.k.b).a.setFlags(i11 | 3);
        }
        l0Var.N(l1Var);
    }

    @Override // m4.q
    public void d(int i10, n1 n1Var) {
        Bundle bundle = Bundle.EMPTY;
        n4.y yVar = ((l0) this.e).k;
        String str = n1Var.b;
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
    public void e(int i10, q1 q1Var, boolean z10, boolean z11, int i11) {
        l0 l0Var = (l0) this.e;
        l0Var.N(l0Var.g.t);
    }

    @Override // i9.r
    public void h(Throwable th2) {
        if (this != ((l0) ((j0) this.e).e).p) {
            return;
        }
        e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void j(b2.e eVar) {
        l0 l0Var = (l0) this.e;
        l0Var.g.t.K().getClass();
        int e = k.e(eVar);
        n4.r rVar = (n4.r) l0Var.k.b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e);
        rVar.a.setPlaybackToLocal(builder.build());
    }

    public void k() {
        l0 l0Var = (l0) this.e;
        l1 l1Var = l0Var.g.t;
        l1Var.K().getClass();
        int e = k.e(l1Var.m0(21) ? l1Var.I() : b2.e.h);
        n4.r rVar = (n4.r) l0Var.k.b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e);
        rVar.a.setPlaybackToLocal(builder.build());
    }

    public void l(b2.k0 k0Var) {
        l0 l0Var = (l0) this.e;
        n4.y yVar = l0Var.k;
        r();
        if (k0Var == null) {
            ((n4.r) yVar.b).e(0);
        } else {
            ((n4.r) yVar.b).e(k.f(k0Var.d.i));
        }
        l0Var.N(l0Var.g.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (j$.util.Objects.equals(r4.m0(18) ? r4.h0() : b2.n0.K, r1) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(int i10, l1 l1Var, l1 l1Var2) {
        l0 l0Var = (l0) this.e;
        b2.k1 Q0 = l1Var2.Q0();
        if (l1Var == null || !Objects.equals(l1Var.Q0(), Q0)) {
            q(Q0);
        }
        b2.n0 h02 = l1Var2.m0(18) ? l1Var2.h0() : b2.n0.K;
        if (l1Var != null) {
        }
        n(h02);
        b2.n0 R0 = l1Var2.R0();
        if (l1Var == null || !Objects.equals(l1Var.R0(), R0)) {
            r();
        }
        if (l1Var == null || l1Var.A0() != l1Var2.A0()) {
            p(l1Var2.A0());
        }
        if (l1Var == null || l1Var.l() != l1Var2.l()) {
            o(l1Var2.l());
        }
        l1Var2.K();
        k();
        int i11 = l1Var2.m0(20) ? 4 : 0;
        if (l0Var.q != i11) {
            l0Var.q = i11;
            ((n4.r) l0Var.k.b).a.setFlags(i11 | 3);
        }
        b2.k0 P0 = l1Var2.P0();
        if (l1Var == null || !Objects.equals(l1Var.P0(), P0)) {
            l(P0);
        } else {
            l0Var.N(l1Var2);
        }
    }

    public void n(b2.n0 n0Var) {
        l0 l0Var = (l0) this.e;
        n4.y yVar = l0Var.k;
        CharSequence queueTitle = ((n4.j) ((l2.h) yVar.c).b).a.getQueueTitle();
        CharSequence charSequence = n0Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        l1 l1Var = l0Var.g.t;
        if (!l0Var.v.a(17) || !l1Var.t().a(17)) {
            charSequence = null;
        }
        ((n4.r) yVar.b).a.setQueueTitle(charSequence);
    }

    public void o(int i10) {
        n4.y yVar = ((l0) this.e).k;
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
        l0 l0Var = (l0) ((j0) this.e).e;
        if (this != l0Var.p) {
            return;
        }
        l0.E(l0Var.k, k.b(this.a, this.b, this.c, this.d, bitmap));
        b0 b0Var = l0Var.g;
        e2.d0.U(b0Var.o, new u(b0Var, 1));
    }

    public void p(boolean z10) {
        n4.y yVar = ((l0) this.e).k;
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
        l0 l0Var = (l0) this.e;
        b0 b0Var = l0Var.g;
        l1 l1Var = b0Var.t;
        b2.k0 P0 = l1Var.P0();
        b2.n0 R0 = l1Var.R0();
        long j10 = -9223372036854775807L;
        if ((!l1Var.m0(16) || !l1Var.M0()) && l1Var.m0(16)) {
            j10 = l1Var.getDuration();
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
        of.b bVar = b0Var.m;
        bVar.getClass();
        byte[] bArr = R0.k;
        if (bArr != null) {
            wVar = bVar.H(bArr);
        } else {
            Uri uri5 = R0.m;
            if (uri5 != null) {
                e3 e3Var = (e3) bVar.c;
                if (e3Var == null || (uri = (Uri) e3Var.c) == null || !uri.equals(uri5)) {
                    g2.i iVar = (g2.i) bVar.b;
                    i9.w a2 = ((i9.y) iVar.a).a(new com.google.firebase.messaging.h(2, iVar, uri5));
                    bVar.c = new e3(uri5, a2);
                    wVar = a2;
                } else {
                    wVar = (i9.w) ((e3) bVar.c).d;
                    e2.d.h(wVar);
                }
            } else {
                wVar = null;
            }
        }
        if (wVar != null) {
            l0Var.p = null;
            if (!wVar.isDone()) {
                j3 = j10;
                uri2 = uri4;
                n0Var = R0;
                j0 j0Var = new j0(this, n0Var, str, uri2, j3);
                str = str;
                l0Var.p = j0Var;
                Handler handler = b0Var.l;
                Objects.requireNonNull(handler);
                wVar.a(new i9.s(0, wVar, j0Var), new k2.b0(handler, 0));
                l0.E(l0Var.k, k.b(n0Var, str, uri2, j3, bitmap));
            }
            try {
                bitmap = (Bitmap) o8.a(wVar);
            } catch (CancellationException | ExecutionException e) {
                e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
            }
        }
        j3 = j10;
        uri2 = uri4;
        n0Var = R0;
        l0.E(l0Var.k, k.b(n0Var, str, uri2, j3, bitmap));
    }

    public void s(b2.k1 k1Var) {
        l0 l0Var = (l0) this.e;
        b0 b0Var = l0Var.g;
        l1 l1Var = b0Var.t;
        if (!l0Var.v.a(17) || !l1Var.t().a(17) || k1Var.p()) {
            l0.D(l0Var.k, null);
            return;
        }
        int i10 = k.a;
        ArrayList arrayList = new ArrayList();
        b2.j1 j1Var = new b2.j1();
        for (int i11 = 0; i11 < k1Var.o(); i11++) {
            arrayList.add(k1Var.m(i11, j1Var, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(this, new AtomicInteger(0), arrayList, arrayList2, 18);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr = ((b2.k0) arrayList.get(i12)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                bVar.run();
            } else {
                i9.w H = b0Var.m.H(bArr);
                arrayList2.add(H);
                Handler handler = b0Var.l;
                Objects.requireNonNull(handler);
                H.a(bVar, new k2.b0(handler, 0));
            }
        }
    }

    public j0(j0 j0Var, b2.n0 n0Var, String str, Uri uri, long j3) {
        this.e = j0Var;
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
    public /* synthetic */ void i(int i10, r1 r1Var) {
    }

    @Override // m4.q
    public /* synthetic */ void g(int i10, j1 j1Var, b2.x0 x0Var, boolean z10, boolean z11) {
    }
}
