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
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.f70;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.yw;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.a40;
import org.telegram.ui.ly;
import org.telegram.ui.oi;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                zl0 zl0Var = daVar.E;
                if (zl0Var != null) {
                    if (!daVar.O) {
                        n10 = -n10;
                    }
                    zl0Var.scrollBy(0, n10);
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
                gd gdVar = (gd) this.b;
                gdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                gdVar.f.performHapticFeedback(0);
                Runnable runnable = gdVar.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                qk qkVar = (qk) this.b;
                if (qkVar.S) {
                    qkVar.N.clear();
                    qkVar.P.clear();
                    qkVar.Q.clear();
                    qkVar.l();
                    return;
                }
                return;
            case 8:
                sm smVar = (sm) this.b;
                tm tmVar = smVar.P;
                if (tmVar.J == null || tmVar.K) {
                    return;
                }
                int computeVerticalScrollOffset = tmVar.r.computeVerticalScrollOffset();
                boolean z10 = tmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (smVar.e() - smVar.r) + smVar.n;
                float max = Math.max(0.0f, (tmVar.E - Math.max(0, computeVerticalScrollOffset - tmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                float max2 = Math.max(0.0f, ((tmVar.r.getMeasuredHeight() - (tmVar.E - computeVerticalScrollOffset)) - tmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                float dp2 = AndroidUtilities.dp(32.0f);
                float dp3 = (max >= dp2 || computeVerticalScrollOffset <= tmVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                int i14 = (int) dp3;
                if (Math.abs(i14) > 0 && tmVar.r.canScrollVertically(i14) && (dp3 <= 0.0f || !z10)) {
                    tmVar.E += dp3;
                    tmVar.r.scrollBy(0, i14);
                    smVar.invalidate();
                }
                smVar.L = true;
                smVar.postDelayed(this, 15L);
                return;
            case 9:
                xn xnVar = (xn) this.b;
                t6 t6Var = xnVar.U0;
                d6 d6Var = xnVar.g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (xnVar.H || editField == null || !xnVar.G || xnVar.e1 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
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
                mu muVar = (mu) this.b;
                t6 t6Var2 = muVar.P;
                hu huVar = muVar.a;
                if (muVar.y || huVar == null || !muVar.N || muVar.v || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                    return;
                }
                huVar.requestFocus();
                AndroidUtilities.showKeyboard(huVar);
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
                nz nzVar = (nz) this.b;
                if (nzVar.B0.s != null) {
                    return;
                }
                nzVar.X1 = false;
                nzVar.X();
                return;
            case 13:
                n00 n00Var = (n00) this.b;
                if (n00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f11 = n00Var.p0 + (elapsedRealtime / 320.0f);
                    n00Var.p0 = f11;
                    n00Var.setAnimationIdicatorProgress(n00Var.i0.getInterpolation(f11));
                    if (n00Var.p0 > 1.0f) {
                        n00Var.p0 = 1.0f;
                    }
                    if (n00Var.p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(n00Var.v0);
                        return;
                    }
                    n00Var.O = false;
                    n00Var.setEnabled(true);
                    h00 h00Var = n00Var.J;
                    if (h00Var != null) {
                        ((ly) h00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.P0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.s0, 1000L);
                return;
            case 15:
                TextureView textureView = ((y50) this.b).H0.q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new yw(12, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 16:
                e70 e70Var = (e70) this.b;
                f70 f70Var = e70Var.x;
                s60 s60Var = f70Var.V;
                if (s60Var != null && s60Var.getAdapter() != null) {
                    f70Var.V.getClass();
                    int R = RecyclerView.R(e70Var);
                    if (R >= 0) {
                        f70Var.T.v(f70Var.V.T(e70Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 17:
                ic0 ic0Var = (ic0) this.b;
                ValueAnimator valueAnimator = ic0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                ic0Var.h.start();
                return;
            case 18:
                ee0 ee0Var = (ee0) this.b;
                ee0Var.e();
                AndroidUtilities.runOnUIThread(ee0Var.R, 100L);
                return;
            case 19:
                vi0 vi0Var = (vi0) this.b;
                vi0Var.y = true;
                ValueAnimator valueAnimator2 = vi0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                vi0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                vi0Var.z = ofFloat;
                ofFloat.addUpdateListener(vi0Var.b0);
                vi0Var.z.setInterpolator(new LinearInterpolator());
                vi0Var.z.setDuration(150L);
                vi0Var.z.start();
                return;
            case 20:
                zl0 zl0Var2 = (zl0) this.b;
                oi oiVar = zl0Var2.h2;
                int[] iArr = zl0Var2.m2;
                yn ynVar = oiVar.d;
                iArr[0] = (int) ynVar.q9;
                iArr[1] = ynVar.ya;
                if (zl0Var2.j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    zl0Var2.N0(0.0f, zl0Var2.m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    zl0Var2.N0(0.0f, zl0Var2.getMeasuredHeight() - zl0Var2.m2[1]);
                }
                zl0Var2.h2.d.v0.scrollBy(0, dp);
                if (zl0Var2.i2) {
                    AndroidUtilities.runOnUIThread(zl0Var2.D2);
                    return;
                }
                return;
            case 21:
                fl0 fl0Var = (fl0) this.b;
                t6 t6Var3 = fl0Var.i0;
                if (fl0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var3);
                    AndroidUtilities.runOnUIThread(t6Var3, 4000L);
                    return;
                } else {
                    fl0Var.U = false;
                    fl0Var.invalidate();
                    return;
                }
            case 22:
                dm0 dm0Var = (dm0) this.b;
                RecyclerView recyclerView = dm0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (dm0Var.g) {
                    recyclerView.scrollBy(0, -dm0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (dm0Var.h) {
                        recyclerView.scrollBy(0, dm0Var.i);
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
                    dn0 dn0Var = scrollSlidingTextTabStrip.b;
                    if (dn0Var != null) {
                        dn0Var.E0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) this.b;
                vv0 vv0Var = shutterButton.e;
                if (vv0Var == null || ((ul) vv0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 25:
                ux0 ux0Var = (ux0) this.b;
                View view = ux0Var.s;
                if (view == null) {
                    ux0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    ux0Var.s.setVisibility(0);
                    ux0Var.s.setAlpha(0.0f);
                }
                ux0Var.s.animate().setListener(null).cancel();
                ux0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 26:
                g91 g91Var = (g91) this.b;
                if (g91Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f13 = g91Var.f0 + (elapsedRealtime3 / 200.0f);
                    g91Var.f0 = f13;
                    g91Var.setAnimationIdicatorProgress(g91Var.a0.getInterpolation(f13));
                    if (g91Var.f0 > 1.0f) {
                        g91Var.f0 = 1.0f;
                    }
                    if (g91Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(g91Var.i0);
                        return;
                    }
                    g91Var.J = false;
                    g91Var.setEnabled(true);
                    f91 f91Var = g91Var.y;
                    if (f91Var != null) {
                        ((n2.c) f91Var).k(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                a40 a40Var = (a40) this.b;
                if (!a40Var.b || a40Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(a40Var.h0, 3000L);
                    return;
                } else {
                    a40Var.g0 = false;
                    a40Var.setUiVisible(false);
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
