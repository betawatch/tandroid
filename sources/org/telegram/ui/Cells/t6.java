package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Log;
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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.vw;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ni;
import org.telegram.ui.pw;
import org.telegram.ui.v30;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        switch (this.a) {
            case 0:
                u6 u6Var = (u6) this.b;
                u6Var.a();
                RectF rectF = u6Var.f;
                u6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(u6Var.v, 1000L);
                return;
            case 1:
                n7 n7Var = (n7) this.b;
                if (n7Var.b == null) {
                    n7Var.b = new androidx.emoji2.text.j(n7Var, 4);
                }
                androidx.emoji2.text.j jVar = n7Var.b;
                int i11 = n7Var.c + 1;
                n7Var.c = i11;
                jVar.b = i11;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                w7 w7Var = (w7) this.b;
                RectF rectF2 = w7Var.n;
                w7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.y, 1000L);
                return;
            case 3:
                da daVar = (da) this.b;
                if (!daVar.N || daVar.E == null) {
                    return;
                }
                if (daVar.Z && daVar.W == null) {
                    n10 = AndroidUtilities.dp(8.0f);
                } else if (daVar.W == null) {
                    return;
                } else {
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
                return;
            case 4:
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) this.b;
                org.telegram.ui.Components.j8 j8Var = s7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() == null) {
                    return;
                }
                int i12 = j8Var.J0 + 1;
                j8Var.J0 = i12;
                if (i12 != 1) {
                    if (i12 != 2) {
                        MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                        return;
                    } else {
                        MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    }
                }
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
                return;
            case 5:
                org.telegram.ui.Components.j8 j8Var2 = (org.telegram.ui.Components.j8) this.b;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    j8Var2.K0 = System.currentTimeMillis();
                    return;
                }
                float f7 = j8Var2.I0;
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - j8Var2.K0;
                j8Var2.K0 = currentTimeMillis;
                long j10 = currentTimeMillis - j8Var2.L0;
                int i13 = j8Var2.J0;
                long j11 = i13 == 1 ? 3L : i13 == 2 ? 6L : 12L;
                float f10 = ((long) ((f7 * r3) + ((j11 * j3) - j3))) / duration;
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
                    if (j8Var2.J0 <= 0 || j8Var2.I0 <= 0.0f) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(j8Var2.N0, 16L);
                    return;
                }
                return;
            case 6:
                fd fdVar = (fd) this.b;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f.performHapticFeedback(0);
                Runnable runnable = fdVar.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ok okVar = (ok) this.b;
                if (okVar.S) {
                    okVar.N.clear();
                    okVar.P.clear();
                    okVar.Q.clear();
                    okVar.l();
                    return;
                }
                return;
            case 8:
                qm qmVar = (qm) this.b;
                rm rmVar = qmVar.P;
                if (rmVar.J == null || rmVar.K) {
                    return;
                }
                int computeVerticalScrollOffset = rmVar.r.computeVerticalScrollOffset();
                boolean z10 = rmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (qmVar.e() - qmVar.r) + qmVar.n;
                float max = Math.max(0.0f, (rmVar.E - Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                float max2 = Math.max(0.0f, ((rmVar.r.getMeasuredHeight() - (rmVar.E - computeVerticalScrollOffset)) - rmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                float dp2 = AndroidUtilities.dp(32.0f);
                float dp3 = (max >= dp2 || computeVerticalScrollOffset <= rmVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                int i14 = (int) dp3;
                if (Math.abs(i14) > 0 && rmVar.r.canScrollVertically(i14) && (dp3 <= 0.0f || !z10)) {
                    rmVar.E += dp3;
                    rmVar.r.scrollBy(0, i14);
                    qmVar.invalidate();
                }
                qmVar.L = true;
                qmVar.postDelayed(this, 15L);
                return;
            case 9:
                vn vnVar = (vn) this.b;
                t6 t6Var = vnVar.U0;
                d6 d6Var = vnVar.g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (vnVar.H || editField == null || !vnVar.G || vnVar.e1 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    editField.requestFocus();
                    AndroidUtilities.showKeyboard(editField);
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    AndroidUtilities.runOnUIThread(t6Var, 100L);
                    return;
                }
                return;
            case 10:
                ku kuVar = (ku) this.b;
                t6 t6Var2 = kuVar.P;
                fu fuVar = kuVar.a;
                if (kuVar.y || fuVar == null || !kuVar.N || kuVar.v || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                    return;
                }
                fuVar.requestFocus();
                AndroidUtilities.showKeyboard(fuVar);
                AndroidUtilities.cancelRunOnUIThread(t6Var2);
                AndroidUtilities.runOnUIThread(t6Var2, 100L);
                return;
            case 11:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((ai.y4) this.b).d;
                if (!mVar.a || ((ArrayList) mVar.d).isEmpty() || ((AnimatorSet) mVar.c).isRunning()) {
                    return;
                }
                try {
                    ((AnimatorSet) mVar.c).start();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 12:
                lz lzVar = (lz) this.b;
                if (lzVar.B0.s != null) {
                    return;
                }
                lzVar.X1 = false;
                lzVar.Y();
                return;
            case 13:
                l00 l00Var = (l00) this.b;
                if (l00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f11 = l00Var.p0 + (elapsedRealtime / 320.0f);
                    l00Var.p0 = f11;
                    l00Var.setAnimationIdicatorProgress(l00Var.i0.getInterpolation(f11));
                    if (l00Var.p0 > 1.0f) {
                        l00Var.p0 = 1.0f;
                    }
                    if (l00Var.p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(l00Var.v0);
                        return;
                    }
                    l00Var.O = false;
                    l00Var.setEnabled(true);
                    f00 f00Var = l00Var.J;
                    if (f00Var != null) {
                        ((pw) f00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.s0, 1000L);
                return;
            case 15:
                TextureView textureView = ((v50) this.b).H0.q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new vw(13, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 16:
                b70 b70Var = (b70) this.b;
                c70 c70Var = b70Var.x;
                p60 p60Var = c70Var.V;
                if (p60Var != null && p60Var.getAdapter() != null) {
                    c70Var.V.getClass();
                    int R = RecyclerView.R(b70Var);
                    if (R >= 0) {
                        c70Var.T.v(c70Var.V.T(b70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 17:
                fc0 fc0Var = (fc0) this.b;
                ValueAnimator valueAnimator = fc0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                fc0Var.h.start();
                return;
            case 18:
                ce0 ce0Var = (ce0) this.b;
                ce0Var.e();
                AndroidUtilities.runOnUIThread(ce0Var.R, 100L);
                return;
            case 19:
                ti0 ti0Var = (ti0) this.b;
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
                return;
            case 20:
                wl0 wl0Var2 = (wl0) this.b;
                ni niVar = wl0Var2.h2;
                int[] iArr = wl0Var2.m2;
                wn wnVar = niVar.d;
                iArr[0] = (int) wnVar.s9;
                iArr[1] = wnVar.Aa;
                if (wl0Var2.j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    wl0Var2.M0(0.0f, wl0Var2.m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    wl0Var2.M0(0.0f, wl0Var2.getMeasuredHeight() - wl0Var2.m2[1]);
                }
                wl0Var2.h2.d.x0.scrollBy(0, dp);
                if (wl0Var2.i2) {
                    AndroidUtilities.runOnUIThread(wl0Var2.D2);
                    return;
                }
                return;
            case 21:
                dl0 dl0Var = (dl0) this.b;
                t6 t6Var3 = dl0Var.i0;
                if (dl0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                } else {
                    dl0Var.U = false;
                    dl0Var.invalidate();
                    return;
                }
            case 22:
                yl0 yl0Var = (yl0) this.b;
                RecyclerView recyclerView = yl0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (yl0Var.g) {
                    recyclerView.scrollBy(0, -yl0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (yl0Var.h) {
                        recyclerView.scrollBy(0, yl0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    }
                    return;
                }
            case 23:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f12 = scrollSlidingTextTabStrip.S + (elapsedRealtime2 / scrollSlidingTextTabStrip.b0);
                    scrollSlidingTextTabStrip.S = f12;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f12));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    xm0 xm0Var = scrollSlidingTextTabStrip.b;
                    if (xm0Var != null) {
                        xm0Var.C0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) this.b;
                ov0 ov0Var = shutterButton.e;
                if (ov0Var == null || ((sl) ov0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 25:
                ix0 ix0Var = (ix0) this.b;
                View view = ix0Var.s;
                if (view == null) {
                    ix0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    ix0Var.s.setVisibility(0);
                    ix0Var.s.setAlpha(0.0f);
                }
                ix0Var.s.animate().setListener(null).cancel();
                ix0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 26:
                v81 v81Var = (v81) this.b;
                if (v81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f13 = v81Var.f0 + (elapsedRealtime3 / 200.0f);
                    v81Var.f0 = f13;
                    v81Var.setAnimationIdicatorProgress(v81Var.a0.getInterpolation(f13));
                    if (v81Var.f0 > 1.0f) {
                        v81Var.f0 = 1.0f;
                    }
                    if (v81Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(v81Var.i0);
                        return;
                    }
                    v81Var.J = false;
                    v81Var.setEnabled(true);
                    u81 u81Var = v81Var.y;
                    if (u81Var != null) {
                        ((l.d) u81Var).L(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                v30 v30Var = (v30) this.b;
                if (!v30Var.b || v30Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(v30Var.h0, 3000L);
                    return;
                } else {
                    v30Var.g0 = false;
                    v30Var.setUiVisible(false);
                    return;
                }
            case 28:
                ((p4.s0) this.b).c();
                return;
            default:
                p8.a aVar = (p8.a) this.b;
                synchronized (aVar.a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
