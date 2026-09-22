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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.a40;
import org.telegram.ui.qi;
import org.telegram.ui.tw;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class u6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u6(Object obj, int i10) {
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
                v6 v6Var = (v6) this.b;
                v6Var.a();
                RectF rectF = v6Var.f;
                v6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(v6Var.v, 1000L);
                return;
            case 1:
                o7 o7Var = (o7) this.b;
                if (o7Var.b == null) {
                    o7Var.b = new androidx.emoji2.text.j(o7Var, 4);
                }
                androidx.emoji2.text.j jVar = o7Var.b;
                int i11 = o7Var.c + 1;
                o7Var.c = i11;
                jVar.b = i11;
                o7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 2:
                x7 x7Var = (x7) this.b;
                RectF rectF2 = x7Var.n;
                x7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(x7Var.y, 1000L);
                return;
            case 3:
                ea eaVar = (ea) this.b;
                if (!eaVar.N || eaVar.E == null) {
                    return;
                }
                if (eaVar.Z && eaVar.W == null) {
                    n10 = AndroidUtilities.dp(8.0f);
                } else if (eaVar.W == null) {
                    return;
                } else {
                    n10 = eaVar.n() >> 1;
                }
                if (!eaVar.Z && !eaVar.k0) {
                    if (eaVar.O) {
                        if (eaVar.W.getBottom() - n10 < eaVar.F.getMeasuredHeight() - eaVar.p()) {
                            i10 = eaVar.W.getBottom() - eaVar.F.getMeasuredHeight();
                            q6 = eaVar.p();
                            n10 = i10 + q6;
                        }
                    } else if (eaVar.W.getTop() + n10 > eaVar.q()) {
                        i10 = -eaVar.W.getTop();
                        q6 = eaVar.q();
                        n10 = i10 + q6;
                    }
                }
                yl0 yl0Var = eaVar.E;
                if (yl0Var != null) {
                    if (!eaVar.O) {
                        n10 = -n10;
                    }
                    yl0Var.scrollBy(0, n10);
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 4:
                org.telegram.ui.Components.r7 r7Var = (org.telegram.ui.Components.r7) this.b;
                org.telegram.ui.Components.i8 i8Var = r7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() == null) {
                    return;
                }
                int i12 = i8Var.J0 + 1;
                i8Var.J0 = i12;
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
                r7Var.v = true;
                i8Var.H0 = 1;
                if (MediaController.getInstance().isMessagePaused()) {
                    i8Var.C0();
                } else if (i8Var.H0 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(i8Var.N0);
                    i8Var.L0 = 0L;
                }
                MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                AndroidUtilities.runOnUIThread(this, 2000L);
                return;
            case 5:
                org.telegram.ui.Components.i8 i8Var2 = (org.telegram.ui.Components.i8) this.b;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    i8Var2.K0 = System.currentTimeMillis();
                    return;
                }
                float f7 = i8Var2.I0;
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - i8Var2.K0;
                i8Var2.K0 = currentTimeMillis;
                long j10 = currentTimeMillis - i8Var2.L0;
                int i13 = i8Var2.J0;
                long j11 = i13 == 1 ? 3L : i13 == 2 ? 6L : 12L;
                float f10 = ((long) ((f7 * r3) + ((j11 * j3) - j3))) / duration;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                i8Var2.I0 = f10;
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isMusic()) {
                    if (!MediaController.getInstance().isMessagePaused()) {
                        MediaController.getInstance().getPlayingMessageObject().audioProgress = i8Var2.I0;
                    }
                    i8Var2.G0(playingMessageObject, false);
                }
                if (i8Var2.H0 == 1 && i8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                    if (j10 > 200 || i8Var2.I0 == 0.0f) {
                        i8Var2.L0 = currentTimeMillis;
                        MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                    }
                    if (i8Var2.J0 <= 0 || i8Var2.I0 <= 0.0f) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(i8Var2.N0, 16L);
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
                nk nkVar = (nk) this.b;
                if (nkVar.S) {
                    nkVar.N.clear();
                    nkVar.P.clear();
                    nkVar.Q.clear();
                    nkVar.l();
                    return;
                }
                return;
            case 8:
                pm pmVar = (pm) this.b;
                qm qmVar = pmVar.P;
                if (qmVar.J == null || qmVar.K) {
                    return;
                }
                int computeVerticalScrollOffset = qmVar.r.computeVerticalScrollOffset();
                boolean z10 = qmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (pmVar.e() - pmVar.r) + pmVar.n;
                float max = Math.max(0.0f, (qmVar.E - Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                float max2 = Math.max(0.0f, ((qmVar.r.getMeasuredHeight() - (qmVar.E - computeVerticalScrollOffset)) - qmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                float dp2 = AndroidUtilities.dp(32.0f);
                float dp3 = (max >= dp2 || computeVerticalScrollOffset <= qmVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                int i14 = (int) dp3;
                if (Math.abs(i14) > 0 && qmVar.r.canScrollVertically(i14) && (dp3 <= 0.0f || !z10)) {
                    qmVar.E += dp3;
                    qmVar.r.scrollBy(0, i14);
                    pmVar.invalidate();
                }
                pmVar.L = true;
                pmVar.postDelayed(this, 15L);
                return;
            case 9:
                un unVar = (un) this.b;
                u6 u6Var = unVar.U0;
                e6 e6Var = unVar.g1;
                if (e6Var != null) {
                    EditTextBoldCursor editField = e6Var.getEditField();
                    if (unVar.H || editField == null || !unVar.G || unVar.e1 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    editField.requestFocus();
                    AndroidUtilities.showKeyboard(editField);
                    AndroidUtilities.cancelRunOnUIThread(u6Var);
                    AndroidUtilities.runOnUIThread(u6Var, 100L);
                    return;
                }
                return;
            case 10:
                ju juVar = (ju) this.b;
                u6 u6Var2 = juVar.P;
                eu euVar = juVar.a;
                if (juVar.y || euVar == null || !juVar.N || juVar.v || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                    return;
                }
                euVar.requestFocus();
                AndroidUtilities.showKeyboard(euVar);
                AndroidUtilities.cancelRunOnUIThread(u6Var2);
                AndroidUtilities.runOnUIThread(u6Var2, 100L);
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
                kz kzVar = (kz) this.b;
                if (kzVar.B0.s != null) {
                    return;
                }
                kzVar.X1 = false;
                kzVar.Y();
                return;
            case 13:
                k00 k00Var = (k00) this.b;
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
                    if (k00Var.p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k00Var.v0);
                        return;
                    }
                    k00Var.O = false;
                    k00Var.setEnabled(true);
                    e00 e00Var = k00Var.J;
                    if (e00Var != null) {
                        ((tw) e00Var).b(1.0f);
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
                TextureView textureView = ((u50) this.b).H0.q0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new bv(14, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
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
                    int S = RecyclerView.S(b70Var);
                    if (S >= 0) {
                        c70Var.T.v(c70Var.V.U(b70Var), S);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 17:
                gc0 gc0Var = (gc0) this.b;
                ValueAnimator valueAnimator = gc0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                gc0Var.h.start();
                return;
            case 18:
                de0 de0Var = (de0) this.b;
                de0Var.e();
                AndroidUtilities.runOnUIThread(de0Var.R, 100L);
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
                yl0 yl0Var2 = (yl0) this.b;
                qi qiVar = yl0Var2.h2;
                int[] iArr = yl0Var2.m2;
                zn znVar = qiVar.d;
                iArr[0] = (int) znVar.s9;
                iArr[1] = znVar.Aa;
                if (yl0Var2.j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    yl0Var2.N0(0.0f, yl0Var2.m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    yl0Var2.N0(0.0f, yl0Var2.getMeasuredHeight() - yl0Var2.m2[1]);
                }
                yl0Var2.h2.d.x0.scrollBy(0, dp);
                if (yl0Var2.i2) {
                    AndroidUtilities.runOnUIThread(yl0Var2.D2);
                    return;
                }
                return;
            case 21:
                fl0 fl0Var = (fl0) this.b;
                u6 u6Var3 = fl0Var.i0;
                if (fl0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(u6Var3);
                    AndroidUtilities.runOnUIThread(u6Var3, 4000L);
                    return;
                } else {
                    fl0Var.U = false;
                    fl0Var.invalidate();
                    return;
                }
            case 22:
                am0 am0Var = (am0) this.b;
                RecyclerView recyclerView = am0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (am0Var.g) {
                    recyclerView.scrollBy(0, -am0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (am0Var.h) {
                        recyclerView.scrollBy(0, am0Var.i);
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
                    zm0 zm0Var = scrollSlidingTextTabStrip.b;
                    if (zm0Var != null) {
                        zm0Var.y0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ShutterButton shutterButton = (ShutterButton) this.b;
                qv0 qv0Var = shutterButton.e;
                if (qv0Var == null || ((rl) qv0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 25:
                lx0 lx0Var = (lx0) this.b;
                View view = lx0Var.s;
                if (view == null) {
                    lx0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    lx0Var.s.setVisibility(0);
                    lx0Var.s.setAlpha(0.0f);
                }
                lx0Var.s.animate().setListener(null).cancel();
                lx0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 26:
                y81 y81Var = (y81) this.b;
                if (y81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f13 = y81Var.f0 + (elapsedRealtime3 / 200.0f);
                    y81Var.f0 = f13;
                    y81Var.setAnimationIdicatorProgress(y81Var.a0.getInterpolation(f13));
                    if (y81Var.f0 > 1.0f) {
                        y81Var.f0 = 1.0f;
                    }
                    if (y81Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(y81Var.i0);
                        return;
                    }
                    y81Var.J = false;
                    y81Var.setEnabled(true);
                    x81 x81Var = y81Var.y;
                    if (x81Var != null) {
                        ((ki.e0) x81Var).i(1.0f);
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
