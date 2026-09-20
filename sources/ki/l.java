package ki;

import ai.a1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import m4.f1;
import m4.j1;
import m4.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.z50;
import org.telegram.ui.i41;
import org.telegram.ui.jl;
import rg.x0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x019a A[LOOP:0: B:2:0x000e->B:33:0x019a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0196 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        oi.k kVar = (oi.k) this.b;
        byte[] bArr = (byte[]) this.c;
        int i10 = 0;
        int i11 = 0;
        while (i11 < bArr.length) {
            if (bArr.length - i11 < 8) {
                kVar.f();
                return;
            }
            int i12 = bArr[i11] & 255;
            int i13 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8) | (bArr[i11 + 3] & 255);
            long j3 = ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8) | (255 & bArr[i11 + 7]);
            int i14 = i11 + 8;
            long j10 = i14 + j3;
            if (j3 > 1048576 || j10 > bArr.length) {
                kVar.f();
                return;
            }
            int i15 = (int) j3;
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i14, bArr2, i10, i15);
            boolean z10 = true;
            if (i13 != 0) {
                synchronized (kVar.a) {
                    try {
                        oi.j jVar = (oi.j) kVar.m.get(Integer.valueOf(i13));
                        if (jVar == null) {
                            if (i12 != 2 && i12 != 4 && i12 != 3) {
                                z10 = false;
                            }
                        } else if (i12 == 2) {
                            if (i15 != 0) {
                                synchronized (kVar.a) {
                                    try {
                                        long j11 = jVar.d;
                                        long j12 = i15;
                                        if (j11 >= j12) {
                                            jVar.d = j11 - j12;
                                            try {
                                                jVar.b.getOutputStream().write(bArr2);
                                                synchronized (kVar.a) {
                                                    try {
                                                        if (kVar.m.get(Integer.valueOf(jVar.a)) == jVar) {
                                                            jVar.d += j12;
                                                            kVar.k(4, jVar.a, ByteBuffer.allocate(4).putInt(i15).array());
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Exception unused) {
                                                kVar.c(jVar, true);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else if (i12 == 4 && i15 == 4) {
                            long j13 = ByteBuffer.wrap(bArr2).getInt() & 4294967295L;
                            if (j13 != 0) {
                                synchronized (kVar.a) {
                                    try {
                                        long j14 = jVar.c;
                                        if (j14 <= 4294967295L - j13) {
                                            jVar.c = j14 + j13;
                                            kVar.a.notifyAll();
                                            z10 = true;
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            if (i12 == 3 && i15 == 0) {
                                kVar.c(jVar, false);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                            }
                        }
                    } finally {
                    }
                }
                if (!z10) {
                }
            } else if (i12 == 17 && i15 == 0) {
                synchronized (kVar.a) {
                    try {
                        if (!kVar.r && !kVar.q) {
                            kVar.q = true;
                            ArrayList arrayList = new ArrayList(kVar.m.values());
                            int size = arrayList.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj = arrayList.get(i16);
                                i16++;
                                oi.j jVar2 = (oi.j) obj;
                                jVar2.e = true;
                                kVar.k(1, jVar2.a, null);
                            }
                            oi.d dVar = kVar.u;
                            kVar.a.notifyAll();
                            if (dVar != null) {
                                AndroidUtilities.runOnUIThread(new i2.g0(dVar, 17));
                            }
                        }
                    } finally {
                    }
                }
                if (!z10) {
                }
            } else if (i12 == 5 && i15 <= 64) {
                kVar.k(6, i10, bArr2);
                if (!z10) {
                    kVar.f();
                    return;
                } else {
                    i11 = (int) j10;
                    i10 = 0;
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        p1 p1Var;
        int i10 = 4;
        int i11 = 1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                Handler handler = (Handler) this.c;
                if (oVar.U && oVar.F == 0 && oVar.C) {
                    oVar.v.g(oVar.u, oVar.q, false);
                    oVar.D = false;
                    oVar.E = false;
                    oVar.F = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    oVar.G = elapsedRealtimeNanos;
                    oVar.H = elapsedRealtimeNanos;
                    oVar.e.b("synthetic camera switch started");
                    oVar.z = -1L;
                    handler.removeCallbacks(oVar.Z);
                    handler.post(oVar.Z);
                    return;
                }
                return;
            case 1:
                k2.u uVar = (k2.u) this.b;
                h0 h0Var = (h0) this.c;
                o0 o0Var = (o0) uVar.b;
                o0Var.L++;
                o0Var.v = true;
                o0Var.l.b("camera switch started: target=" + h0Var);
                z50 z50Var = (z50) o0Var.c.a;
                jl jlVar = z50Var.x;
                FrameLayout frameLayout = z50Var.v;
                z50Var.q(false);
                Bitmap bitmap = z50Var.h0;
                if (bitmap != null) {
                    jlVar.setImageBitmap(bitmap);
                    z50Var.g0 = true;
                    jlVar.animate().cancel();
                    jlVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                frameLayout.animate().rotationY(90.0f).setDuration(120L).start();
                o0Var.n();
                return;
            case 2:
                ((o0) ((k2.u) this.b).b).g((Exception) this.c);
                return;
            case 3:
                ((i9.c0) this.c).m(Boolean.valueOf(((m4.a0) this.b).o()));
                return;
            case 4:
                m4.a0 a0Var = (m4.a0) this.b;
                Runnable runnable = (Runnable) this.c;
                a0Var.getClass();
                runnable.run();
                return;
            case 5:
                ((m4.a0) this.b).u(null, (j1) this.c);
                return;
            case 6:
                i9.u uVar2 = (i9.u) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    p1Var = (p1) uVar2.a;
                    e2.d.e(p1Var, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    p1Var = new p1(-1);
                } catch (CancellationException e7) {
                    e2.a.o("MediaSessionLegacyStub", "Custom command cancelled", e7);
                    p1Var = new p1(1);
                } catch (ExecutionException e10) {
                    e = e10;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    p1Var = new p1(-1);
                }
                resultReceiver.send(p1Var.a, p1Var.b);
                return;
            case 7:
                f1 f1Var = (f1) this.b;
                m4.i iVar = (m4.i) this.c;
                oi.f fVar = f1Var.b;
                m4.r t10 = fVar.t(iVar.asBinder());
                if (t10 != null) {
                    fVar.M(t10);
                    return;
                }
                return;
            case 8:
                ((f1) this.b).b.n((m4.r) this.c);
                return;
            case 9:
                me.b bVar = (me.b) this.b;
                View view = (View) this.c;
                me.a aVar = bVar.a;
                if ((bVar.c & 2) != 0) {
                    if (!aVar.onLongPressRequestedAt(view, bVar.d, bVar.e)) {
                        bVar.c |= 8;
                        return;
                    }
                    bVar.c &= -3;
                    bVar.b = null;
                    float f7 = bVar.d;
                    float f10 = bVar.e;
                    bVar.f = f7;
                    bVar.g = f10;
                    if (aVar.ignoreHapticFeedbackSettings(f7, f10)) {
                        boolean forceEnableVibration = aVar.forceEnableVibration();
                        if (view != null) {
                            view.performHapticFeedback(0, forceEnableVibration ? 2 : 0);
                        }
                    } else {
                        view.performHapticFeedback(0);
                    }
                    bVar.c = (bVar.c | 4) & (-11);
                    bVar.b = null;
                    return;
                }
                return;
            case 10:
                n2.d dVar = (n2.d) this.b;
                b2.s sVar = (b2.s) this.c;
                n2.f fVar2 = dVar.d;
                if (fVar2.E == 0 || dVar.c) {
                    return;
                }
                Looper looper = fVar2.I;
                looper.getClass();
                dVar.b = fVar2.a(looper, dVar.a, sVar, false);
                fVar2.x.add(dVar);
                return;
            case 11:
                ((p2.b) ((o2.k) ((o2.q) this.b).c.b).b.d.get(((o2.j) this.c).x)).c(true);
                return;
            case 12:
                oi.k kVar = (oi.k) this.b;
                oi.j jVar = (oi.j) this.c;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = jVar.b.getInputStream();
                    while (true) {
                        synchronized (kVar.a) {
                            while (!kVar.r && kVar.m.get(Integer.valueOf(jVar.a)) == jVar && (!kVar.q || !jVar.e || jVar.c == 0)) {
                                try {
                                    kVar.a.wait();
                                } finally {
                                }
                            }
                            if (!kVar.r && kVar.m.get(Integer.valueOf(jVar.a)) == jVar) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, jVar.c));
                                if (read < 0) {
                                    kVar.c(jVar, true);
                                    return;
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (kVar.a) {
                                        try {
                                            if (!kVar.r && kVar.m.get(Integer.valueOf(jVar.a)) == jVar && kVar.q) {
                                                jVar.c -= read;
                                                kVar.k(2, jVar.a, bArr2);
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception unused) {
                    kVar.c(jVar, true);
                    return;
                }
            case 13:
                a();
                return;
            case 14:
                ((VideoAds) this.b).lambda$showPremium$19((x0) this.c);
                return;
            case 15:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 16:
                ((VideoAds) this.b).lambda$show$16((Utilities.Callback) this.c);
                return;
            case 17:
                i41.T((Context) this.b, null, false, (a1) this.c, null);
                return;
            case 18:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
            case 19:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                return;
            case 20:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                return;
            case 21:
                ((VoIPService) this.b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.c);
                return;
            case 22:
                ((VoIPService) this.b).lambda$createGroupInstance$71((String) this.c);
                return;
            case 23:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.l0) this.c);
                return;
            case 24:
                ((VoIPService) this.b).lambda$startScreenCapture$58((TLRPC.Updates) this.c);
                return;
            case 25:
                ((VoipAudioManager) this.b).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) this.c);
                return;
            case 26:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.b;
                boolean canScrollVertically = ((mo0) this.c).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (kVar2.r1 == z10) {
                    return;
                }
                ValueAnimator valueAnimator = kVar2.t1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f11 = kVar2.s1;
                kVar2.r1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, canScrollVertically ? 0.0f : 1.0f);
                kVar2.t1 = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, i12));
                kVar2.t1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z10, i11));
                kVar2.t1.setDuration(320L);
                kVar2.t1.setInterpolator(qr.h);
                kVar2.t1.start();
                return;
            case 27:
                org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) this.b;
                boolean canScrollVertically2 = ((RecyclerView) this.c).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (kVar3.r1 == z11) {
                    return;
                }
                ValueAnimator valueAnimator2 = kVar3.t1;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f12 = kVar3.s1;
                kVar3.r1 = z11;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, canScrollVertically2 ? 0.0f : 1.0f);
                kVar3.t1 = ofFloat2;
                ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar3, i10));
                kVar3.t1.addListener(new org.telegram.ui.ActionBar.c(kVar3, z11, i12));
                kVar3.t1.setDuration(320L);
                kVar3.t1.setInterpolator(qr.h);
                kVar3.t1.start();
                return;
            case 28:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                n2 n2Var = (n2) this.c;
                Drawable drawable = ActionBarLayout.p1;
                actionBarLayout.b0(n2Var, false);
                actionBarLayout.setVisibility(8);
                View view2 = actionBarLayout.B0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            default:
                n2 n2Var2 = (n2) this.b;
                n2 n2Var3 = (n2) this.c;
                Drawable drawable2 = ActionBarLayout.p1;
                if (n2Var2 != null) {
                    n2Var2.onTransitionAnimationEnd(false, false);
                }
                n2Var3.onTransitionAnimationEnd(true, false);
                n2Var3.onBecomeFullyVisible();
                return;
        }
    }

    public /* synthetic */ l(m4.a0 a0Var, m4.r rVar, Runnable runnable) {
        this.a = 4;
        this.b = a0Var;
        this.c = runnable;
    }
}
