package d1;

import android.content.Context;
import android.content.IntentFilter;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import b2.a2;
import b2.l1;
import b2.o1;
import bi.i6;
import com.google.android.gms.internal.play_billing.s0;
import di.o;
import di.p;
import di.r;
import e2.i0;
import e2.j0;
import e2.o0;
import e2.u;
import i2.c0;
import i2.m1;
import i2.p0;
import i2.r1;
import i2.w;
import ig.a1;
import ig.c1;
import ig.q0;
import ig.x0;
import j9.e0;
import j9.y;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.e2;
import jg.r0;
import jg.s2;
import jg.v2;
import ji.j;
import ji.k;
import kotlin.jvm.internal.i;
import l5.s;
import n4.q;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.u61;
import u2.g0;
import v0.h;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        PowerManager.WakeLock wakeLock;
        hf.b bVar = (hf.b) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        synchronized (bVar) {
            if (atomicBoolean.get() && (wakeLock = (PowerManager.WakeLock) bVar.c) != null) {
                wakeLock.release();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        k kVar = (k) this.b;
        j jVar = (j) this.c;
        byte[] bArr = new byte[65536];
        try {
            InputStream inputStream = jVar.b.getInputStream();
            while (true) {
                synchronized (kVar.a) {
                    while (!kVar.u && kVar.m.get(Integer.valueOf(jVar.a)) == jVar && (!kVar.t || !jVar.e || jVar.c == 0)) {
                        try {
                            kVar.a.wait();
                        } finally {
                        }
                    }
                    if (kVar.u || kVar.m.get(Integer.valueOf(jVar.a)) != jVar) {
                        break;
                    }
                    int read = inputStream.read(bArr, 0, (int) Math.min(65536L, jVar.c));
                    if (read < 0) {
                        kVar.e(jVar, true);
                        return;
                    }
                    if (read != 0) {
                        byte[] bArr2 = new byte[read];
                        System.arraycopy(bArr, 0, bArr2, 0, read);
                        synchronized (kVar.a) {
                            try {
                                if (kVar.u || kVar.m.get(Integer.valueOf(jVar.a)) != jVar || !kVar.t) {
                                    break;
                                }
                                jVar.c -= read;
                                kVar.n(2, jVar.a, bArr2);
                            } finally {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            kVar.e(jVar, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x044b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        q qVar;
        q qVar2;
        boolean z10;
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                v0.f fVar2 = (v0.f) this.c;
                h hVar = fVar.f;
                if (hVar != null) {
                    hVar.onResult(fVar2);
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            case 1:
                da.b bVar = (da.b) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    s.a().d.e(bVar.h.a.b(i5.d.c), 1);
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 2:
                ((i6) this.b).a((SpannableString) this.c);
                return;
            case 3:
                di.s sVar = (di.s) this.b;
                di.q qVar3 = (di.q) this.c;
                synchronized (sVar.a) {
                    try {
                        if (sVar.s) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) sVar.n.get(qVar3);
                        if (arrayList != null) {
                            int size = arrayList.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                if (((r) obj).a != null) {
                                    o oVar = (o) sVar.h.get(qVar3);
                                    Object obj2 = null;
                                    if (oVar != null) {
                                        qVar2 = oVar.a;
                                    } else {
                                        if (sVar.a()) {
                                            try {
                                                s0 c10 = sVar.w.a.c(qVar3.a, qVar3.b);
                                                c10.b();
                                                qVar = new q(c10, obj2);
                                            } catch (LinkageError | OutOfMemoryError | RuntimeException e) {
                                                if (sVar.c != null) {
                                                    try {
                                                        f8.g(e, true);
                                                    } catch (LinkageError | RuntimeException unused2) {
                                                    }
                                                }
                                                qVar = new q(obj2, e);
                                            }
                                            synchronized (sVar.a) {
                                                try {
                                                    if (sVar.s) {
                                                        return;
                                                    }
                                                    if (oVar == null && ((Throwable) qVar.b) == null) {
                                                        sVar.c(qVar3, qVar);
                                                    }
                                                    ArrayList arrayList2 = (ArrayList) sVar.n.remove(qVar3);
                                                    if (arrayList2 == null) {
                                                        return;
                                                    }
                                                    int size2 = arrayList2.size();
                                                    while (i10 < size2) {
                                                        Object obj3 = arrayList2.get(i10);
                                                        i10++;
                                                        r rVar = (r) obj3;
                                                        try {
                                                            p pVar = rVar.a;
                                                            rVar.a = null;
                                                            if (pVar != null) {
                                                                pVar.g(qVar);
                                                            }
                                                        } catch (LinkageError | RuntimeException e7) {
                                                            if (sVar.c != null) {
                                                                try {
                                                                    f8.g(e7, true);
                                                                } catch (LinkageError | RuntimeException unused3) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return;
                                                } finally {
                                                }
                                            }
                                        }
                                        qVar2 = new q(obj2, sVar.x);
                                    }
                                    qVar = qVar2;
                                    synchronized (sVar.a) {
                                    }
                                }
                            }
                        }
                        sVar.n.remove(qVar3);
                        return;
                    } finally {
                    }
                }
            case 4:
                ((h) this.b).g((w0.d) this.c);
                return;
            case 5:
                ((h) this.b).onResult((v0.f) this.c);
                return;
            case 6:
                e1.d dVar = (e1.d) this.b;
                v0.c cVar = (v0.c) this.c;
                h hVar2 = dVar.f;
                if (hVar2 != null) {
                    hVar2.onResult(cVar);
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            case 7:
                e2.c cVar2 = (e2.c) this.b;
                Object apply = ((w) this.c).apply(cVar2.f);
                cVar2.f = apply;
                e2.b bVar2 = new e2.b(cVar2, apply, 1);
                i0 i0Var = (i0) cVar2.c;
                if (i0Var.a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar2);
                    return;
                }
                return;
            case 8:
                e2.w wVar = (e2.w) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new androidx.mediarouter.app.f(wVar, 1), intentFilter);
                return;
            case 9:
                androidx.mediarouter.app.f fVar3 = (androidx.mediarouter.app.f) this.b;
                Context context2 = (Context) this.c;
                e2.w wVar2 = (e2.w) fVar3.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                int i12 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i12 = type != 9 ? 8 : 7;
                                        }
                                        i12 = 5;
                                    }
                                }
                                i12 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i12 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i12 = 4;
                                    break;
                                case 13:
                                    i12 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i12 = 6;
                                    break;
                                case 18:
                                    i12 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i12 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i12 = 1;
                        }
                    } catch (SecurityException unused4) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i12 != 5) {
                    wVar2.c(i12);
                    return;
                } else {
                    u.a(context2, wVar2);
                    return;
                }
            case 10:
                e0 e0Var = (e0) this.b;
                y yVar = (y) this.c;
                if (e0Var.a instanceof j9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 11:
                o0 o0Var = (o0) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                hf.b bVar3 = (hf.b) o0Var.c;
                bVar3.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new e(12, bVar3, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 12:
                a();
                return;
            case 13:
                ge.b bVar4 = (ge.b) this.b;
                View view = (View) this.c;
                ge.a aVar = (ge.a) bVar4.d;
                if ((bVar4.a & 2) != 0) {
                    if (!aVar.d1(view, bVar4.b, bVar4.c)) {
                        bVar4.a |= 8;
                        return;
                    }
                    bVar4.a &= -3;
                    bVar4.e = null;
                    view.performHapticFeedback(0);
                    bVar4.a = (bVar4.a | 4) & (-11);
                    bVar4.e = null;
                    return;
                }
                return;
            case 14:
                ((j0) this.b).h((Typeface) this.c);
                return;
            case 15:
                i2.i0 i0Var2 = (i2.i0) this.b;
                p0 p0Var = (p0) this.c;
                int i13 = i0Var2.J - p0Var.b;
                i0Var2.J = i13;
                boolean z11 = true;
                if (p0Var.d) {
                    i0Var2.K = p0Var.e;
                    i0Var2.L = true;
                }
                if (i13 == 0) {
                    o1 o1Var = ((m1) p0Var.f).a;
                    int i14 = -1;
                    if (!i0Var2.p0.a.p() && o1Var.p()) {
                        i0Var2.q0 = -1;
                        i0Var2.r0 = 0L;
                    }
                    if (!o1Var.p()) {
                        List asList = Arrays.asList(((r1) o1Var).l);
                        t6.p(asList.size() == i0Var2.p.size());
                        for (int i15 = 0; i15 < asList.size(); i15++) {
                            ((i2.e0) i0Var2.p.get(i15)).c = (o1) asList.get(i15);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (i0Var2.L) {
                        boolean z12 = ((m1) p0Var.f).a.p() && i0Var2.p0.a.p();
                        boolean equals = ((m1) p0Var.f).b.equals(i0Var2.p0.b);
                        boolean z13 = ((m1) p0Var.f).d == i0Var2.p0.s;
                        if (z12 || (equals && z13)) {
                            z11 = false;
                        }
                        if (z11) {
                            i14 = i0Var2.m0();
                            if (o1Var.p() || ((m1) p0Var.f).b.b()) {
                                j10 = ((m1) p0Var.f).d;
                            } else {
                                m1 m1Var = (m1) p0Var.f;
                                g0 g0Var = m1Var.b;
                                long j11 = m1Var.d;
                                Object obj4 = g0Var.a;
                                l1 l1Var = i0Var2.o;
                                o1Var.g(obj4, l1Var);
                                j10 = j11 + l1Var.e;
                            }
                        }
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    long j12 = j10;
                    int i16 = i14;
                    i0Var2.L = z10;
                    i0Var2.D1((m1) p0Var.f, 1, z11, i0Var2.K, j12, i16, false);
                    return;
                }
                return;
            case 16:
                c0 c0Var = (c0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList3 = c0Var.a.t0;
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj5 = arrayList3.get(i17);
                    i17++;
                    ((u61) ((a2) obj5)).J.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 17:
                q0 q0Var = (q0) this.b;
                x0 x0Var = (x0) this.c;
                q0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) q0Var.h(q0Var.f(), true, false, false).b;
                RectF f7 = q0Var.f();
                Object obj6 = q0Var.a.b;
                q0Var.w = new a5.a(byteBuffer, 0, f7);
                q0Var.a(false);
                x0Var.run();
                return;
            case 18:
                c1 c1Var = (c1) this.b;
                Runnable runnable = (Runnable) this.c;
                a1 a1Var = c1Var.d;
                if (a1Var == null || !a1Var.f) {
                    return;
                }
                a1.a(a1Var);
                runnable.run();
                return;
            case 19:
                ((j2.j) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 20:
                ((j2.j) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 21:
                ((j2.j) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 22:
                ((j2.j) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 23:
                ((j2.j) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 24:
                r0 r0Var = (r0) this.b;
                e2 e2Var = (e2) this.c;
                e2Var.m();
                r0Var.q0(e2Var, true);
                return;
            case 25:
                ((e2) this.b).s((Bitmap) this.c);
                return;
            case 26:
                v2 v2Var = (v2) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                v2Var.G = false;
                s2[] s2VarArr = (s2[]) arrayList4.toArray(new s2[0]);
                v2Var.H = s2VarArr;
                if (s2VarArr.length > 0) {
                    v2Var.b0.setScaleX(0.3f);
                    v2Var.b0.setScaleY(0.3f);
                    v2Var.b0.setAlpha(0.0f);
                    v2Var.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(gr.f).start();
                    return;
                }
                return;
            case 27:
                b();
                return;
            case 28:
                k kVar = (k) this.b;
                try {
                    byte[] decode = Base64.decode(((String) this.c).substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        kVar.m(decode);
                        return;
                    }
                    kVar.h();
                    return;
                } catch (IllegalArgumentException e10) {
                    f8.g(e10, true);
                    kVar.h();
                    return;
                }
            default:
                ((k) this.b).m((byte[]) this.c);
                return;
        }
    }
}
