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
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.ni;
import org.telegram.ui.qw;
import org.telegram.ui.x30;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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

    @Override // java.lang.Runnable
    public final void run() {
        int n10;
        int i10;
        int q6;
        int dp;
        float f7;
        int i11;
        int i12 = 4;
        switch (this.a) {
            case 0:
                n7 n7Var = (n7) this.b;
                if (n7Var.b == null) {
                    n7Var.b = new androidx.emoji2.text.j(n7Var, i12);
                }
                androidx.emoji2.text.j jVar = n7Var.b;
                int i13 = n7Var.c + 1;
                n7Var.c = i13;
                jVar.b = i13;
                n7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 1:
                w7 w7Var = (w7) this.b;
                RectF rectF = w7Var.n;
                w7Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(w7Var.y, 1000L);
                return;
            case 2:
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
                ml0 ml0Var = eaVar.E;
                if (ml0Var != null) {
                    if (!eaVar.O) {
                        n10 = -n10;
                    }
                    ml0Var.scrollBy(0, n10);
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 3:
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) this.b;
                org.telegram.ui.Components.j8 j8Var = s7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() == null) {
                    return;
                }
                int i14 = j8Var.J0 + 1;
                j8Var.J0 = i14;
                if (i14 != 1) {
                    if (i14 != 2) {
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
            case 4:
                org.telegram.ui.Components.j8 j8Var2 = (org.telegram.ui.Components.j8) this.b;
                long duration = MediaController.getInstance().getDuration();
                if (duration == 0 || duration == -9223372036854775807L) {
                    j8Var2.K0 = System.currentTimeMillis();
                    return;
                }
                float f10 = j8Var2.I0;
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - j8Var2.K0;
                j8Var2.K0 = currentTimeMillis;
                long j10 = currentTimeMillis - j8Var2.L0;
                int i15 = j8Var2.J0;
                float f11 = ((long) ((f10 * r3) + (((i15 == 1 ? 3L : i15 == 2 ? 6L : 12L) * j3) - j3))) / duration;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                j8Var2.I0 = f11;
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
                        MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                    }
                    if (j8Var2.J0 <= 0 || j8Var2.I0 <= 0.0f) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(j8Var2.N0, 16L);
                    return;
                }
                return;
            case 5:
                fd fdVar = (fd) this.b;
                fdVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                fdVar.f.performHapticFeedback(0);
                Runnable runnable = fdVar.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ok okVar = (ok) this.b;
                if (okVar.S) {
                    okVar.N.clear();
                    okVar.P.clear();
                    okVar.Q.clear();
                    okVar.l();
                    return;
                }
                return;
            case 7:
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
                int i16 = (int) dp3;
                if (Math.abs(i16) > 0 && rmVar.r.canScrollVertically(i16) && (dp3 <= 0.0f || !z10)) {
                    rmVar.E += dp3;
                    rmVar.r.scrollBy(0, i16);
                    qmVar.invalidate();
                }
                qmVar.L = true;
                qmVar.postDelayed(this, 15L);
                return;
            case 8:
                vn vnVar = (vn) this.b;
                l7 l7Var = vnVar.U0;
                d6 d6Var = vnVar.g1;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (vnVar.H || editField == null || !vnVar.G || vnVar.e1 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
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
                ku kuVar = (ku) this.b;
                l7 l7Var2 = kuVar.P;
                fu fuVar = kuVar.a;
                if (kuVar.y || fuVar == null || !kuVar.N || kuVar.v || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                    return;
                }
                fuVar.requestFocus();
                AndroidUtilities.showKeyboard(fuVar);
                AndroidUtilities.cancelRunOnUIThread(l7Var2);
                AndroidUtilities.runOnUIThread(l7Var2, 100L);
                return;
            case 10:
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
            case 11:
                lz lzVar = (lz) this.b;
                if (lzVar.B0.s != null) {
                    return;
                }
                lzVar.X1 = false;
                lzVar.Y();
                return;
            case 12:
                l00 l00Var = (l00) this.b;
                if (l00Var.O) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f12 = l00Var.p0 + (elapsedRealtime / 320.0f);
                    l00Var.p0 = f12;
                    l00Var.setAnimationIdicatorProgress(l00Var.i0.getInterpolation(f12));
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
                        ((qw) f00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.O0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.s0, 1000L);
                return;
            case 14:
                TextureView textureView = ((w50) this.b).H0.l0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new oy(8, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 15:
                r60 r60Var = (r60) this.b;
                s60 s60Var = r60Var.x;
                f60 f60Var = s60Var.V;
                if (f60Var != null && f60Var.getAdapter() != null) {
                    s60Var.V.getClass();
                    int R = RecyclerView.R(r60Var);
                    if (R >= 0) {
                        s60Var.T.v(s60Var.V.T(r60Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 16:
                ub0 ub0Var = (ub0) this.b;
                ValueAnimator valueAnimator = ub0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                ub0Var.h.start();
                return;
            case 17:
                sd0 sd0Var = (sd0) this.b;
                sd0Var.e();
                AndroidUtilities.runOnUIThread(sd0Var.R, 100L);
                return;
            case 18:
                ji0 ji0Var = (ji0) this.b;
                ji0Var.y = true;
                ValueAnimator valueAnimator2 = ji0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ji0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ji0Var.z = ofFloat;
                ofFloat.addUpdateListener(ji0Var.b0);
                ji0Var.z.setInterpolator(new LinearInterpolator());
                ji0Var.z.setDuration(150L);
                ji0Var.z.start();
                return;
            case 19:
                ml0 ml0Var2 = (ml0) this.b;
                ni niVar = ml0Var2.h2;
                int[] iArr = ml0Var2.m2;
                xn xnVar = niVar.d;
                iArr[0] = (int) xnVar.s9;
                iArr[1] = xnVar.Aa;
                if (ml0Var2.j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    ml0Var2.M0(0.0f, ml0Var2.m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    ml0Var2.M0(0.0f, ml0Var2.getMeasuredHeight() - ml0Var2.m2[1]);
                }
                ml0Var2.h2.d.x0.scrollBy(0, dp);
                if (ml0Var2.i2) {
                    AndroidUtilities.runOnUIThread(ml0Var2.D2);
                    return;
                }
                return;
            case 20:
                tk0 tk0Var = (tk0) this.b;
                l7 l7Var3 = tk0Var.i0;
                if (tk0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(l7Var3);
                    AndroidUtilities.runOnUIThread(l7Var3, 4000L);
                    return;
                } else {
                    tk0Var.U = false;
                    tk0Var.invalidate();
                    return;
                }
            case 21:
                ol0 ol0Var = (ol0) this.b;
                RecyclerView recyclerView = ol0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (ol0Var.g) {
                    recyclerView.scrollBy(0, -ol0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (ol0Var.h) {
                        recyclerView.scrollBy(0, ol0Var.i);
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
                    mm0 mm0Var = scrollSlidingTextTabStrip.b;
                    if (mm0Var != null) {
                        mm0Var.C0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ShutterButton shutterButton = (ShutterButton) this.b;
                dv0 dv0Var = shutterButton.e;
                if (dv0Var == null || ((sl) dv0Var).a()) {
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
                g81 g81Var = (g81) this.b;
                if (g81Var.J) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime3 > 17) {
                        elapsedRealtime3 = 17;
                    }
                    float f14 = g81Var.f0 + (elapsedRealtime3 / 200.0f);
                    g81Var.f0 = f14;
                    g81Var.setAnimationIdicatorProgress(g81Var.a0.getInterpolation(f14));
                    if (g81Var.f0 > 1.0f) {
                        g81Var.f0 = 1.0f;
                    }
                    if (g81Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(g81Var.i0);
                        return;
                    }
                    g81Var.J = false;
                    g81Var.setEnabled(true);
                    f81 f81Var = g81Var.y;
                    if (f81Var != null) {
                        ((ka.c) f81Var).h(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                x30 x30Var = (x30) this.b;
                if (!x30Var.b || x30Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(x30Var.h0, 3000L);
                    return;
                } else {
                    x30Var.g0 = false;
                    x30Var.setUiVisible(false);
                    return;
                }
            case 27:
                ((p4.s0) this.b).c();
                return;
            case 28:
                a();
                return;
            default:
                pg.b1 b1Var = (pg.b1) this.b;
                if (!b1Var.f || b1Var.y.y) {
                    return;
                }
                pg.b1.b(b1Var);
                GLES20.glBindFramebuffer(36160, 0);
                pg.b1 b1Var2 = (pg.b1) this.b;
                GLES20.glViewport(0, 0, b1Var2.n, b1Var2.r);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                pg.r0 r0Var = ((pg.b1) this.b).y.c;
                if (r0Var.r != null) {
                    if (r0Var.D != null && r0Var.F != null && r0Var.E) {
                        GLES20.glBindFramebuffer(36160, 0);
                        pg.e1 e1Var = (pg.e1) r0Var.r.get("videoBlur");
                        if (e1Var != null) {
                            GLES20.glUseProgram(e1Var.a);
                            GLES20.glUniformMatrix4fv(e1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(r0Var.y));
                            GLES20.glUniform1f(e1Var.d("flipy"), 0.0f);
                            GLES20.glUniform1i(e1Var.d("texture"), 0);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, r0Var.D.c());
                            GLES20.glTexParameteri(3553, 10241, 9729);
                            GLES20.glUniform1i(e1Var.d("blured"), 1);
                            GLES20.glActiveTexture(33985);
                            org.telegram.ui.Components.pa paVar = r0Var.F.m;
                            GLES20.glBindTexture(3553, paVar != null ? paVar.s[2] : -1);
                            if (r0Var.b == null || !(r0Var.i instanceof pg.d)) {
                                GLES20.glUniform1f(e1Var.d("eraser"), 0.0f);
                            } else {
                                GLES20.glUniform1f(e1Var.d("eraser"), 1.0f);
                                GLES20.glUniform1i(e1Var.d("mask"), 2);
                                GLES20.glActiveTexture(33986);
                                GLES20.glBindTexture(3553, r0Var.g());
                            }
                            GLES20.glBlendFunc(1, 0);
                            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) r0Var.m);
                            GLES20.glEnableVertexAttribArray(0);
                            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) r0Var.n);
                            GLES20.glEnableVertexAttribArray(1);
                            synchronized (r0Var.F.h) {
                                GLES20.glDrawArrays(5, 0, 4);
                            }
                        }
                    }
                    if (r0Var.b != null) {
                        r0Var.n(r0Var.g(), r0Var.b, (1.0f - (r0Var.I * 0.5f)) - (r0Var.J * 0.5f));
                    } else if (r0Var.c != null) {
                        r0Var.o(r0Var.j(), r0Var.g(), r0Var.c, 1.0f);
                    } else {
                        int j11 = r0Var.j();
                        f7 = 0.5f;
                        pg.e1 e1Var2 = (pg.e1) r0Var.r.get(r0Var.G ? "maskingBlit" : "blit");
                        if (j11 != 0 && e1Var2 != null) {
                            GLES20.glUseProgram(e1Var2.a);
                            GLES20.glUniformMatrix4fv(e1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(r0Var.y));
                            GLES20.glUniform1f(e1Var2.d("alpha"), 1.0f);
                            if (r0Var.G) {
                                GLES20.glUniform1i(e1Var2.d("texture"), 1);
                                GLES20.glUniform1i(e1Var2.d("mask"), 0);
                                GLES20.glUniform1f(e1Var2.d("preview"), 0.4f);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, j11);
                                GLES20.glActiveTexture(33985);
                                GLES20.glBindTexture(3553, r0Var.l.c());
                            } else {
                                GLES20.glUniform1i(e1Var2.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, j11);
                            }
                            GLES20.glBlendFunc(1, 771);
                            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) r0Var.m);
                            GLES20.glEnableVertexAttribArray(0);
                            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) r0Var.n);
                            GLES20.glEnableVertexAttribArray(1);
                            GLES20.glDrawArrays(5, 0, 4);
                            w7.m6.a();
                        }
                        i11 = r0Var.q;
                        if (i11 != 0 && r0Var.d != null && r0Var.I > 0.0f) {
                            r0Var.o(i11, r0Var.g(), r0Var.d, (r0Var.J * f7) + (r0Var.I * f7));
                        }
                    }
                    f7 = 0.5f;
                    i11 = r0Var.q;
                    if (i11 != 0) {
                        r0Var.o(i11, r0Var.g(), r0Var.d, (r0Var.J * f7) + (r0Var.I * f7));
                    }
                }
                GLES20.glBlendFunc(1, 771);
                pg.b1 b1Var3 = (pg.b1) this.b;
                b1Var3.b.eglSwapBuffers(b1Var3.c, b1Var3.e);
                pg.d1 d1Var = ((pg.b1) this.b).y;
                if (!d1Var.s) {
                    d1Var.s = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t0(this, 11));
                }
                if (((pg.b1) this.b).h) {
                    return;
                }
                ((pg.b1) this.b).h = true;
                return;
        }
    }
}
