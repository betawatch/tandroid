package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.uw;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.a40;
import org.telegram.ui.qi;
import org.telegram.ui.tw;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class t6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int n10;
        int i10;
        int q6;
        int dp;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                u6 u6Var = (u6) obj;
                u6Var.a();
                RectF rectF = u6Var.f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                break;
            case 1:
                n7 n7Var = (n7) obj;
                if (n7Var.b == null) {
                    n7Var.b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.b;
                int i12 = n7Var.c + 1;
                n7Var.c = i12;
                jVar.b = i12;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 2:
                w7 w7Var = (w7) obj;
                RectF rectF2 = w7Var.n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.y, 1000L);
                break;
            case 3:
                da daVar = (da) obj;
                if (daVar.N && daVar.E != null) {
                    if (daVar.Z && daVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (daVar.W != null) {
                        n10 = daVar.n() >> 1;
                    }
                    if (!daVar.Z && !daVar.k0) {
                        if (daVar.O) {
                            if (daVar.W.getBottom() - n10 < daVar.F.getMeasuredHeight() - daVar.p()) {
                                i10 = daVar.W.getBottom() - daVar.F.getMeasuredHeight();
                                q6 = daVar.p();
                                n10 = i10 + q6;
                            }
                        } else if (daVar.W.getTop() + n10 > daVar.q()) {
                            i10 = -daVar.W.getTop();
                            q6 = daVar.q();
                            n10 = i10 + q6;
                        }
                    }
                    wl0 wl0Var = daVar.E;
                    if (wl0Var != null) {
                        if (!daVar.O) {
                            n10 = -n10;
                        }
                        wl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) obj;
                org.telegram.ui.Components.j8 j8Var = s7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i13 = j8Var.J0 + 1;
                    j8Var.J0 = i13;
                    if (i13 != 1) {
                        if (i13 != 2) {
                            MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                            break;
                        } else {
                            MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                            AndroidUtilities.runOnUIThread(this, 2000L);
                            break;
                        }
                    } else {
                        s7Var.v = true;
                        j8Var.H0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            j8Var.C0();
                        } else if (j8Var.H0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(j8Var.N0);
                            j8Var.L0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.Components.j8 j8Var2 = (org.telegram.ui.Components.j8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f7 = j8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - j8Var2.K0;
                    j8Var2.K0 = currentTimeMillis;
                    long j10 = currentTimeMillis - j8Var2.L0;
                    int i14 = j8Var2.J0;
                    float f10 = ((long) ((f7 * r4) + (((i14 == 1 ? 3L : i14 == 2 ? 6L : 12L) * j3) - j3))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    j8Var2.I0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = j8Var2.I0;
                        }
                        j8Var2.G0(playingMessageObject, false);
                    }
                    if (j8Var2.H0 == 1 && j8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j10 > 200 || j8Var2.I0 == 0.0f) {
                            j8Var2.L0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                        }
                        if (j8Var2.J0 > 0 && j8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(j8Var2.N0, 16L);
                            break;
                        }
                    }
                } else {
                    j8Var2.K0 = System.currentTimeMillis();
                    break;
                }
                break;
            case 6:
                fd fdVar = (fd) obj;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f.performHapticFeedback(0);
                Runnable runnable = fdVar.j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                nk nkVar = (nk) obj;
                if (nkVar.S) {
                    nkVar.N.clear();
                    nkVar.P.clear();
                    nkVar.Q.clear();
                    nkVar.l();
                    break;
                }
                break;
            case 8:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.P;
                if (qmVar.J != null && !qmVar.K) {
                    int computeVerticalScrollOffset = qmVar.r.computeVerticalScrollOffset();
                    boolean z10 = qmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (pmVar.e() - pmVar.r) + pmVar.n;
                    float max = Math.max(0.0f, (qmVar.E - Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((qmVar.r.getMeasuredHeight() - (qmVar.E - computeVerticalScrollOffset)) - qmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    float dp3 = (max >= dp2 || computeVerticalScrollOffset <= qmVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    int i15 = (int) dp3;
                    if (Math.abs(i15) > 0 && qmVar.r.canScrollVertically(i15) && (dp3 <= 0.0f || !z10)) {
                        qmVar.E += dp3;
                        qmVar.r.scrollBy(0, i15);
                        pmVar.invalidate();
                    }
                    pmVar.L = true;
                    pmVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 9:
                un unVar = (un) obj;
                t6 t6Var = unVar.U0;
                d6 d6Var = unVar.g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!unVar.H && editField != null && unVar.G && !unVar.e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        AndroidUtilities.runOnUIThread(t6Var, 100L);
                        break;
                    }
                }
                break;
            case 10:
                ju juVar = (ju) obj;
                t6 t6Var2 = juVar.P;
                eu euVar = juVar.a;
                if (!juVar.y && euVar != null && juVar.N && !juVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    euVar.requestFocus();
                    AndroidUtilities.showKeyboard(euVar);
                    AndroidUtilities.cancelRunOnUIThread(t6Var2);
                    AndroidUtilities.runOnUIThread(t6Var2, 100L);
                    break;
                }
                break;
            case 11:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) obj).d;
                if (mVar.a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.c).start();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 12:
                kz kzVar = (kz) obj;
                if (kzVar.B0.s == null) {
                    kzVar.X1 = false;
                    kzVar.Y();
                    break;
                }
                break;
            case 13:
                k00 k00Var = (k00) obj;
                if (k00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f11 = k00Var.p0 + (elapsedRealtime / 320.0f);
                    k00Var.p0 = f11;
                    k00Var.setAnimationIdicatorProgress(k00Var.i0.getInterpolation(f11));
                    if (k00Var.p0 > 1.0f) {
                        k00Var.p0 = 1.0f;
                    }
                    if (k00Var.p0 >= 1.0f) {
                        k00Var.O = false;
                        k00Var.setEnabled(true);
                        e00 e00Var = k00Var.J;
                        if (e00Var != null) {
                            ((tw) e00Var).b(1.0f);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(k00Var.v0);
                        break;
                    }
                }
                break;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.s0, 1000L);
                break;
            case 15:
                TextureView textureView = ((u50) obj).H0.o0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new uw(12, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 16:
                a60 a60Var = (a60) obj;
                jm0 jm0Var = a60Var.s;
                ki.g0 g0Var = a60Var.K;
                if (g0Var != null && g0Var.a == 3) {
                    long elapsedRealtime2 = (SystemClock.elapsedRealtime() + g0Var.b) - g0Var.c;
                    a60Var.f0 = elapsedRealtime2;
                    jm0Var.setProgress(Math.min(1.0f, elapsedRealtime2 / g0Var.d));
                    jm0Var.postOnAnimation(this);
                    break;
                }
                break;
            case 17:
                z60 z60Var = (z60) obj;
                a70 a70Var = z60Var.x;
                n60 n60Var = a70Var.V;
                if (n60Var != null && n60Var.getAdapter() != null) {
                    a70Var.V.getClass();
                    int S = RecyclerView.S(z60Var);
                    if (S >= 0) {
                        a70Var.T.v(a70Var.V.U(z60Var), S);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                break;
            case 18:
                ec0 ec0Var = (ec0) obj;
                ValueAnimator valueAnimator = ec0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    ec0Var.h.start();
                    break;
                }
                break;
            case 19:
                be0 be0Var = (be0) obj;
                be0Var.e();
                AndroidUtilities.runOnUIThread(be0Var.R, 100L);
                break;
            case 20:
                ti0 ti0Var = (ti0) obj;
                ti0Var.y = true;
                ValueAnimator valueAnimator2 = ti0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ti0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ti0Var.z = ofFloat;
                ofFloat.addUpdateListener(ti0Var.b0);
                ti0Var.z.setInterpolator(new LinearInterpolator());
                ti0Var.z.setDuration(150L);
                ti0Var.z.start();
                break;
            case 21:
                wl0 wl0Var2 = (wl0) obj;
                qi qiVar = wl0Var2.h2;
                int[] iArr = wl0Var2.m2;
                zn znVar = qiVar.d;
                iArr[0] = (int) znVar.s9;
                iArr[1] = znVar.Aa;
                if (wl0Var2.j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    wl0Var2.N0(0.0f, wl0Var2.m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    wl0Var2.N0(0.0f, wl0Var2.getMeasuredHeight() - wl0Var2.m2[1]);
                }
                wl0Var2.h2.d.x0.scrollBy(0, dp);
                if (wl0Var2.i2) {
                    AndroidUtilities.runOnUIThread(wl0Var2.D2);
                    break;
                }
                break;
            case 22:
                dl0 dl0Var = (dl0) obj;
                t6 t6Var3 = dl0Var.i0;
                if (!dl0Var.n) {
                    dl0Var.U = false;
                    dl0Var.invalidate();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    break;
                }
            case 23:
                yl0 yl0Var = (yl0) obj;
                RecyclerView recyclerView = yl0Var.a;
                if (recyclerView != null) {
                    if (!yl0Var.g) {
                        if (yl0Var.h) {
                            recyclerView.scrollBy(0, yl0Var.i);
                            AndroidUtilities.runOnUIThread(this);
                            break;
                        }
                    } else {
                        recyclerView.scrollBy(0, -yl0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        break;
                    }
                }
                break;
            case 24:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f12 = scrollSlidingTextTabStrip.S + (elapsedRealtime3 / scrollSlidingTextTabStrip.b0);
                    scrollSlidingTextTabStrip.S = f12;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f12));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S >= 1.0f) {
                        scrollSlidingTextTabStrip.H = false;
                        scrollSlidingTextTabStrip.setEnabled(true);
                        ym0 ym0Var = scrollSlidingTextTabStrip.b;
                        if (ym0Var != null) {
                            ym0Var.C0(1.0f);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.d0);
                        break;
                    }
                }
                break;
            case 25:
                ShutterButton shutterButton = (ShutterButton) obj;
                pv0 pv0Var = shutterButton.e;
                if (pv0Var != null && !((rl) pv0Var).a()) {
                    shutterButton.v = false;
                    break;
                }
                break;
            case 26:
                kx0 kx0Var = (kx0) obj;
                View view = kx0Var.s;
                if (view == null) {
                    kx0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    break;
                } else {
                    if (view.getVisibility() != 0) {
                        kx0Var.s.setVisibility(0);
                        kx0Var.s.setAlpha(0.0f);
                    }
                    kx0Var.s.animate().setListener(null).cancel();
                    kx0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                    break;
                }
            case 27:
                w81 w81Var = (w81) obj;
                if (w81Var.J) {
                    long elapsedRealtime4 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime4 > 17) {
                        elapsedRealtime4 = 17;
                    }
                    float f13 = w81Var.f0 + (elapsedRealtime4 / 200.0f);
                    w81Var.f0 = f13;
                    w81Var.setAnimationIdicatorProgress(w81Var.a0.getInterpolation(f13));
                    if (w81Var.f0 > 1.0f) {
                        w81Var.f0 = 1.0f;
                    }
                    if (w81Var.f0 >= 1.0f) {
                        w81Var.J = false;
                        w81Var.setEnabled(true);
                        v81 v81Var = w81Var.y;
                        if (v81Var != null) {
                            ((l.d) v81Var).L(1.0f);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(w81Var.i0);
                        break;
                    }
                }
                break;
            case 28:
                a40 a40Var = (a40) obj;
                if (!a40Var.b || a40Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(a40Var.h0, 3000L);
                    break;
                } else {
                    a40Var.g0 = false;
                    a40Var.setUiVisible(false);
                    break;
                }
                break;
            default:
                ((p4.s0) obj).c();
                break;
        }
    }
}
