package ki;

import ai.a1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import m4.b1;
import m4.f1;
import m4.l1;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.s60;
import org.telegram.ui.h41;
import org.telegram.ui.nl;
import rg.y0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        l1 l1Var;
        int i10 = 4;
        int i11 = 1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                xa.d dVar = (xa.d) this.b;
                m0 m0Var = (m0) this.c;
                t0 t0Var = (t0) dVar.b;
                t0Var.N++;
                t0Var.w = true;
                t0Var.m.b("camera switch started: target=" + m0Var);
                s60 s60Var = (s60) t0Var.d.b;
                FrameLayout frameLayout = s60Var.x;
                s60Var.r0++;
                s60Var.removeCallbacks(s60Var.A0);
                s60Var.m0 = true;
                s60Var.n0 = false;
                s60Var.o0 = false;
                s60Var.p0 = false;
                s60Var.q0 = SystemClock.elapsedRealtime();
                nl nlVar = s60Var.E;
                s60Var.u(false);
                Bitmap bitmap = s60Var.s0;
                if (bitmap != null) {
                    nlVar.setImageBitmap(bitmap);
                    s60Var.l0 = true;
                    nlVar.animate().cancel();
                    nlVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                frameLayout.animate().rotationY(90.0f).setDuration(120L).setInterpolator(hs.h).setListener(null).start();
                FileLog.d("RoundVideo camera flip started: facing=" + m0Var + ", minimumDurationMs=580");
                s60Var.x();
                t0Var.o();
                return;
            case 1:
                ((t0) ((xa.d) this.b).b).h((Exception) this.c);
                return;
            case 2:
                ((i9.c0) this.c).m(Boolean.valueOf(((m4.b0) this.b).o()));
                return;
            case 3:
                m4.b0 b0Var = (m4.b0) this.b;
                Runnable runnable = (Runnable) this.c;
                b0Var.getClass();
                runnable.run();
                return;
            case 4:
                ((m4.b0) this.b).u(null, (f1) this.c);
                return;
            case 5:
                i9.u uVar = (i9.u) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    l1Var = (l1) uVar.a;
                    e2.d.e(l1Var, "SessionResult must not be null");
                } catch (InterruptedException e7) {
                    e = e7;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    l1Var = new l1(-1);
                } catch (CancellationException e10) {
                    e2.a.o("MediaSessionLegacyStub", "Custom command cancelled", e10);
                    l1Var = new l1(1);
                } catch (ExecutionException e11) {
                    e = e11;
                    e2.a.o("MediaSessionLegacyStub", "Custom command failed", e);
                    l1Var = new l1(-1);
                }
                resultReceiver.send(l1Var.a, l1Var.b);
                return;
            case 6:
                b1 b1Var = (b1) this.b;
                m4.i iVar = (m4.i) this.c;
                oi.f fVar = b1Var.b;
                m4.r t10 = fVar.t(iVar.asBinder());
                if (t10 != null) {
                    fVar.M(t10);
                    return;
                }
                return;
            case 7:
                ((b1) this.b).b.n((m4.r) this.c);
                return;
            case 8:
                n2.d dVar2 = (n2.d) this.b;
                b2.s sVar = (b2.s) this.c;
                n2.e eVar = dVar2.d;
                if (eVar.E == 0 || dVar2.c) {
                    return;
                }
                Looper looper = eVar.I;
                looper.getClass();
                dVar2.b = eVar.a(looper, dVar2.a, sVar, false);
                eVar.x.add(dVar2);
                return;
            case 9:
                ne.b bVar = (ne.b) this.b;
                View view = (View) this.c;
                ne.a aVar = bVar.a;
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
                ((p2.b) ((o2.k) ((o2.q) this.b).c.b).b.d.get(((o2.j) this.c).x)).c(true);
                return;
            case 11:
                oi.k kVar = (oi.k) this.b;
                oi.j jVar = (oi.j) this.c;
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
                            if (!kVar.u && kVar.m.get(Integer.valueOf(jVar.a)) == jVar) {
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
                                            if (!kVar.u && kVar.m.get(Integer.valueOf(jVar.a)) == jVar && kVar.t) {
                                                jVar.c -= read;
                                                kVar.l(2, jVar.a, bArr2);
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
            case 12:
                oi.k kVar2 = (oi.k) this.b;
                String str = (String) this.c;
                kVar2.getClass();
                try {
                    byte[] decode = Base64.decode(str.substring(14), 2);
                    if (decode.length >= 8 && decode.length <= 1048584) {
                        kVar2.k(decode);
                        return;
                    }
                    kVar2.f();
                    return;
                } catch (IllegalArgumentException e12) {
                    FileLog.e(e12);
                    kVar2.f();
                    return;
                }
            case 13:
                ((oi.k) this.b).k((byte[]) this.c);
                return;
            case 14:
                ((VideoAds) this.b).lambda$showPremium$19((y0) this.c);
                return;
            case 15:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 16:
                ((VideoAds) this.b).lambda$show$16((Utilities.Callback) this.c);
                return;
            case 17:
                h41.U((Context) this.b, null, false, (a1) this.c, null);
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
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.n0) this.c);
                return;
            case 24:
                ((VoIPService) this.b).lambda$startScreenCapture$58((TLRPC.Updates) this.c);
                return;
            case 25:
                ((AudioManager) this.b).setCommunicationDevice((AudioDeviceInfo) this.c);
                return;
            case 26:
                ((VoipAudioManager) this.b).lambda$isBluetoothAndSpeakerOnAsync$4((Utilities.Callback2) this.c);
                return;
            case 27:
                org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) this.b;
                boolean canScrollVertically = ((ep0) this.c).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (kVar3.r1 == z10) {
                    return;
                }
                ValueAnimator valueAnimator = kVar3.t1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f11 = kVar3.s1;
                kVar3.r1 = z10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, canScrollVertically ? 0.0f : 1.0f);
                kVar3.t1 = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar3, i12));
                kVar3.t1.addListener(new org.telegram.ui.ActionBar.c(kVar3, z10, i11));
                kVar3.t1.setDuration(320L);
                kVar3.t1.setInterpolator(hs.h);
                kVar3.t1.start();
                return;
            case 28:
                org.telegram.ui.ActionBar.k kVar4 = (org.telegram.ui.ActionBar.k) this.b;
                boolean canScrollVertically2 = ((RecyclerView) this.c).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (kVar4.r1 == z11) {
                    return;
                }
                ValueAnimator valueAnimator2 = kVar4.t1;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f12 = kVar4.s1;
                kVar4.r1 = z11;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f12, canScrollVertically2 ? 0.0f : 1.0f);
                kVar4.t1 = ofFloat2;
                ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar4, i10));
                kVar4.t1.addListener(new org.telegram.ui.ActionBar.c(kVar4, z11, i12));
                kVar4.t1.setDuration(320L);
                kVar4.t1.setInterpolator(hs.h);
                kVar4.t1.start();
                return;
            default:
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
        }
    }

    public /* synthetic */ i0(m4.b0 b0Var, m4.r rVar, Runnable runnable) {
        this.a = 3;
        this.b = b0Var;
        this.c = runnable;
    }
}
