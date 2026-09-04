package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.a40;
import org.telegram.ui.co;
import org.telegram.ui.qi;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class l7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a() {
        p8.a aVar = (p8.a) this.b;
        synchronized (aVar.a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.d();
                    if (aVar.b()) {
                        aVar.c = 1;
                        aVar.e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int n10;
        int i10;
        int q6;
        int i11;
        int i12;
        float f7;
        int i13;
        int i14 = 14;
        int i15 = 4;
        switch (this.a) {
            case 0:
                n7 n7Var = (n7) this.b;
                if (n7Var.b == null) {
                    n7Var.b = new androidx.emoji2.text.j(n7Var, i15);
                }
                androidx.emoji2.text.j jVar = n7Var.b;
                int i16 = n7Var.c + 1;
                n7Var.c = i16;
                jVar.b = i16;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 1:
                w7 w7Var = (w7) this.b;
                RectF rectF = w7Var.n;
                w7Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.y, 1000L);
                return;
            case 2:
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
                ll0 ll0Var = daVar.E;
                if (ll0Var != null) {
                    if (!daVar.O) {
                        n10 = -n10;
                    }
                    ll0Var.scrollBy(0, n10);
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 3:
                org.telegram.ui.Components.t7 t7Var = (org.telegram.ui.Components.t7) this.b;
                org.telegram.ui.Components.k8 k8Var = t7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() == null) {
                    return;
                }
                int i17 = k8Var.J0 + 1;
                k8Var.J0 = i17;
                if (i17 != 1) {
                    if (i17 != 2) {
                        MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                        return;
                    } else {
                        MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        return;
                    }
                }
                t7Var.v = true;
                k8Var.H0 = 1;
                if (MediaController.getInstance().isMessagePaused()) {
                    k8Var.C0();
                } else if (k8Var.H0 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(k8Var.N0);
                    k8Var.L0 = 0L;
                }
                MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                AndroidUtilities.runOnUIThread(this, 2000L);
                return;
            case 4:
                org.telegram.ui.Components.k8 k8Var2 = (org.telegram.ui.Components.k8) this.b;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    k8Var2.K0 = System.currentTimeMillis();
                    return;
                }
                float f10 = k8Var2.I0;
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - k8Var2.K0;
                k8Var2.K0 = currentTimeMillis;
                long j10 = currentTimeMillis - k8Var2.L0;
                int i18 = k8Var2.J0;
                float f11 = ((long) ((f10 * r4) + (((i18 == 1 ? 3L : i18 == 2 ? 6L : 12L) * j3) - j3))) / duration;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                k8Var2.I0 = f11;
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isMusic()) {
                    if (!MediaController.getInstance().isMessagePaused()) {
                        MediaController.getInstance().getPlayingMessageObject().audioProgress = k8Var2.I0;
                    }
                    k8Var2.G0(playingMessageObject, false);
                }
                if (k8Var2.H0 == 1 && k8Var2.J0 > 0 && MediaController.getInstance().isMessagePaused()) {
                    if (j10 > 200 || k8Var2.I0 == 0.0f) {
                        k8Var2.L0 = currentTimeMillis;
                        MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                    }
                    if (k8Var2.J0 <= 0 || k8Var2.I0 <= 0.0f) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(k8Var2.N0, 16L);
                    return;
                }
                return;
            case 5:
                gd gdVar = (gd) this.b;
                gdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                gdVar.f.performHapticFeedback(0);
                Runnable runnable = gdVar.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                nk nkVar = (nk) this.b;
                if (nkVar.S) {
                    nkVar.N.clear();
                    nkVar.P.clear();
                    nkVar.Q.clear();
                    nkVar.l();
                    return;
                }
                return;
            case 7:
                pm pmVar = (pm) this.b;
                qm qmVar = pmVar.P;
                if (qmVar.J == null || qmVar.K) {
                    return;
                }
                int computeVerticalScrollOffset = qmVar.r.computeVerticalScrollOffset();
                boolean z10 = qmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (pmVar.e() - pmVar.r) + pmVar.n;
                float max = Math.max(0.0f, (qmVar.E - Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                float max2 = Math.max(0.0f, ((qmVar.r.getMeasuredHeight() - (qmVar.E - computeVerticalScrollOffset)) - qmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                float dp = AndroidUtilities.dp(32.0f);
                float dp2 = (max >= dp || computeVerticalScrollOffset <= qmVar.getListTopPadding()) ? max2 < dp ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp)) : 0.0f : (-(1.0f - (max / dp))) * AndroidUtilities.dp(6.0f);
                int i19 = (int) dp2;
                if (Math.abs(i19) > 0 && qmVar.r.canScrollVertically(i19) && (dp2 <= 0.0f || !z10)) {
                    qmVar.E += dp2;
                    qmVar.r.scrollBy(0, i19);
                    pmVar.invalidate();
                }
                pmVar.L = true;
                pmVar.postDelayed(this, 15L);
                return;
            case 8:
                tn tnVar = (tn) this.b;
                l7 l7Var = tnVar.U0;
                c6 c6Var = tnVar.g1;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (tnVar.H || editField == null || !tnVar.G || tnVar.e1 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    editField.requestFocus();
                    AndroidUtilities.showKeyboard(editField);
                    AndroidUtilities.cancelRunOnUIThread(l7Var);
                    AndroidUtilities.runOnUIThread(l7Var, 100L);
                    return;
                }
                return;
            case 9:
                hu huVar = (hu) this.b;
                l7 l7Var2 = huVar.P;
                cu cuVar = huVar.a;
                if (huVar.y || cuVar == null || !huVar.N || huVar.v || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                    return;
                }
                cuVar.requestFocus();
                AndroidUtilities.showKeyboard(cuVar);
                AndroidUtilities.cancelRunOnUIThread(l7Var2);
                AndroidUtilities.runOnUIThread(l7Var2, 100L);
                return;
            case 10:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((bi.j4) this.b).d;
                if (!mVar.a || ((ArrayList) mVar.d).isEmpty() || ((AnimatorSet) mVar.c).isRunning()) {
                    return;
                }
                try {
                    ((AnimatorSet) mVar.c).start();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 11:
                kz kzVar = (kz) this.b;
                if (kzVar.B0.s != null) {
                    return;
                }
                kzVar.X1 = false;
                kzVar.a0();
                return;
            case 12:
                k00 k00Var = (k00) this.b;
                if (k00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f12 = k00Var.p0 + (elapsedRealtime / 320.0f);
                    k00Var.p0 = f12;
                    k00Var.setAnimationIdicatorProgress(k00Var.i0.getInterpolation(f12));
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
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.M0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.s0, 1000L);
                return;
            case 14:
                TextureView textureView = ((v50) this.b).H0.l0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new zu(i14, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 15:
                q60 q60Var = (q60) this.b;
                r60 r60Var = q60Var.x;
                e60 e60Var = r60Var.V;
                if (e60Var != null && e60Var.getAdapter() != null) {
                    r60Var.V.getClass();
                    int R = RecyclerView.R(q60Var);
                    if (R >= 0) {
                        r60Var.T.v(r60Var.V.T(q60Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 16:
                wb0 wb0Var = (wb0) this.b;
                ValueAnimator valueAnimator = wb0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                wb0Var.h.start();
                return;
            case 17:
                sd0 sd0Var = (sd0) this.b;
                sd0Var.e();
                AndroidUtilities.runOnUIThread(sd0Var.R, 100L);
                return;
            case 18:
                ii0 ii0Var = (ii0) this.b;
                ii0Var.y = true;
                ValueAnimator valueAnimator2 = ii0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ii0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ii0Var.z = ofFloat;
                ofFloat.addUpdateListener(ii0Var.b0);
                ii0Var.z.setInterpolator(new LinearInterpolator());
                ii0Var.z.setDuration(150L);
                ii0Var.z.start();
                return;
            case 19:
                ll0 ll0Var2 = (ll0) this.b;
                qi qiVar = ll0Var2.h2;
                int[] iArr = ll0Var2.m2;
                co coVar = qiVar.d;
                iArr[0] = (int) coVar.s9;
                iArr[1] = coVar.Aa;
                if (ll0Var2.j2) {
                    i11 = -AndroidUtilities.dp(12.0f);
                    ll0Var2.L0(0.0f, ll0Var2.m2[0]);
                } else {
                    int dp3 = AndroidUtilities.dp(12.0f);
                    ll0Var2.L0(0.0f, ll0Var2.getMeasuredHeight() - ll0Var2.m2[1]);
                    i11 = dp3;
                }
                ll0Var2.h2.d.x0.scrollBy(0, i11);
                if (ll0Var2.i2) {
                    AndroidUtilities.runOnUIThread(ll0Var2.D2);
                    return;
                }
                return;
            case 20:
                sk0 sk0Var = (sk0) this.b;
                l7 l7Var3 = sk0Var.i0;
                if (sk0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(l7Var3);
                    AndroidUtilities.runOnUIThread(l7Var3, 4000L);
                    return;
                } else {
                    sk0Var.U = false;
                    sk0Var.invalidate();
                    return;
                }
            case 21:
                nl0 nl0Var = (nl0) this.b;
                RecyclerView recyclerView = nl0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (nl0Var.g) {
                    recyclerView.scrollBy(0, -nl0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (nl0Var.h) {
                        recyclerView.scrollBy(0, nl0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    }
                    return;
                }
            case 22:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                if (scrollSlidingTextTabStrip.H) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 > 17) {
                        elapsedRealtime2 = 17;
                    }
                    float f13 = scrollSlidingTextTabStrip.S + (elapsedRealtime2 / scrollSlidingTextTabStrip.b0);
                    scrollSlidingTextTabStrip.S = f13;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.N.getInterpolation(f13));
                    if (scrollSlidingTextTabStrip.S > 1.0f) {
                        scrollSlidingTextTabStrip.S = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.S < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.d0);
                        return;
                    }
                    scrollSlidingTextTabStrip.H = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    lm0 lm0Var = scrollSlidingTextTabStrip.b;
                    if (lm0Var != null) {
                        lm0Var.D0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ShutterButton shutterButton = (ShutterButton) this.b;
                cv0 cv0Var = shutterButton.e;
                if (cv0Var == null || ((rl) cv0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 24:
                xw0 xw0Var = (xw0) this.b;
                View view = xw0Var.s;
                if (view == null) {
                    xw0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    xw0Var.s.setVisibility(0);
                    xw0Var.s.setAlpha(0.0f);
                }
                xw0Var.s.animate().setListener(null).cancel();
                xw0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 25:
                h81 h81Var = (h81) this.b;
                if (h81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f14 = h81Var.f0 + (elapsedRealtime3 / 200.0f);
                    h81Var.f0 = f14;
                    h81Var.setAnimationIdicatorProgress(h81Var.a0.getInterpolation(f14));
                    if (h81Var.f0 > 1.0f) {
                        h81Var.f0 = 1.0f;
                    }
                    if (h81Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(h81Var.i0);
                        return;
                    }
                    h81Var.J = false;
                    h81Var.setEnabled(true);
                    g81 g81Var = h81Var.y;
                    if (g81Var != null) {
                        ((k2.g0) g81Var).A(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                a40 a40Var = (a40) this.b;
                if (!a40Var.b || a40Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(a40Var.h0, 3000L);
                    return;
                } else {
                    a40Var.g0 = false;
                    a40Var.setUiVisible(false);
                    return;
                }
            case 27:
                ((p4.s0) this.b).c();
                return;
            case 28:
                a();
                return;
            default:
                qg.a1 a1Var = (qg.a1) this.b;
                if (!a1Var.f || a1Var.y.y) {
                    return;
                }
                qg.a1.b(a1Var);
                GLES20.glBindFramebuffer(36160, 0);
                qg.a1 a1Var2 = (qg.a1) this.b;
                GLES20.glViewport(0, 0, a1Var2.n, a1Var2.r);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                qg.q0 q0Var = ((qg.a1) this.b).y.c;
                if (q0Var.r != null) {
                    if (q0Var.D != null && q0Var.F != null && q0Var.E) {
                        GLES20.glBindFramebuffer(36160, 0);
                        qg.d1 d1Var = (qg.d1) q0Var.r.get("videoBlur");
                        if (d1Var != null) {
                            GLES20.glUseProgram(d1Var.a);
                            i12 = 33985;
                            GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.y));
                            GLES20.glUniform1f(d1Var.d("flipy"), 0.0f);
                            GLES20.glUniform1i(d1Var.d("texture"), 0);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, q0Var.D.c());
                            GLES20.glTexParameteri(3553, 10241, 9729);
                            GLES20.glUniform1i(d1Var.d("blured"), 1);
                            GLES20.glActiveTexture(33985);
                            org.telegram.ui.Components.pa paVar = q0Var.F.m;
                            GLES20.glBindTexture(3553, paVar != null ? paVar.s[2] : -1);
                            if (q0Var.b == null || !(q0Var.i instanceof qg.d)) {
                                GLES20.glUniform1f(d1Var.d("eraser"), 0.0f);
                            } else {
                                GLES20.glUniform1f(d1Var.d("eraser"), 1.0f);
                                GLES20.glUniform1i(d1Var.d("mask"), 2);
                                GLES20.glActiveTexture(33986);
                                GLES20.glBindTexture(3553, q0Var.g());
                            }
                            GLES20.glBlendFunc(1, 0);
                            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.m);
                            GLES20.glEnableVertexAttribArray(0);
                            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.n);
                            GLES20.glEnableVertexAttribArray(1);
                            synchronized (q0Var.F.h) {
                                GLES20.glDrawArrays(5, 0, 4);
                            }
                            if (q0Var.b == null) {
                                q0Var.n(q0Var.g(), q0Var.b, (1.0f - (q0Var.I * 0.5f)) - (q0Var.J * 0.5f));
                            } else if (q0Var.c != null) {
                                q0Var.o(q0Var.j(), q0Var.g(), q0Var.c, 1.0f);
                            } else {
                                int j11 = q0Var.j();
                                f7 = 0.5f;
                                qg.d1 d1Var2 = (qg.d1) q0Var.r.get(q0Var.G ? "maskingBlit" : "blit");
                                if (j11 != 0 && d1Var2 != null) {
                                    GLES20.glUseProgram(d1Var2.a);
                                    GLES20.glUniformMatrix4fv(d1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.y));
                                    GLES20.glUniform1f(d1Var2.d("alpha"), 1.0f);
                                    if (q0Var.G) {
                                        GLES20.glUniform1i(d1Var2.d("texture"), 1);
                                        GLES20.glUniform1i(d1Var2.d("mask"), 0);
                                        GLES20.glUniform1f(d1Var2.d("preview"), 0.4f);
                                        GLES20.glActiveTexture(33984);
                                        GLES20.glBindTexture(3553, j11);
                                        GLES20.glActiveTexture(i12);
                                        GLES20.glBindTexture(3553, q0Var.l.c());
                                    } else {
                                        GLES20.glUniform1i(d1Var2.d("texture"), 0);
                                        GLES20.glActiveTexture(33984);
                                        GLES20.glBindTexture(3553, j11);
                                    }
                                    GLES20.glBlendFunc(1, 771);
                                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.m);
                                    GLES20.glEnableVertexAttribArray(0);
                                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.n);
                                    GLES20.glEnableVertexAttribArray(1);
                                    GLES20.glDrawArrays(5, 0, 4);
                                    w7.u6.a();
                                }
                                i13 = q0Var.q;
                                if (i13 != 0 && q0Var.d != null && q0Var.I > 0.0f) {
                                    q0Var.o(i13, q0Var.g(), q0Var.d, (q0Var.J * f7) + (q0Var.I * f7));
                                }
                            }
                            f7 = 0.5f;
                            i13 = q0Var.q;
                            if (i13 != 0) {
                                q0Var.o(i13, q0Var.g(), q0Var.d, (q0Var.J * f7) + (q0Var.I * f7));
                            }
                        }
                    }
                    i12 = 33985;
                    if (q0Var.b == null) {
                    }
                    f7 = 0.5f;
                    i13 = q0Var.q;
                    if (i13 != 0) {
                    }
                }
                GLES20.glBlendFunc(1, 771);
                qg.a1 a1Var3 = (qg.a1) this.b;
                a1Var3.b.eglSwapBuffers(a1Var3.c, a1Var3.e);
                qg.c1 c1Var = ((qg.a1) this.b).y;
                if (!c1Var.s) {
                    c1Var.s = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.b(this, i14));
                }
                if (((qg.a1) this.b).h) {
                    return;
                }
                ((qg.a1) this.b).h = true;
                return;
        }
    }
}
