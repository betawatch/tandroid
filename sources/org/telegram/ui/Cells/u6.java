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
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Components.z60;
import org.telegram.ui.a40;
import org.telegram.ui.qi;
import org.telegram.ui.tw;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                v6 v6Var = (v6) obj;
                v6Var.a();
                RectF rectF = v6Var.f;
                v6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(v6Var.v, 1000L);
                break;
            case 1:
                o7 o7Var = (o7) obj;
                if (o7Var.b == null) {
                    o7Var.b = new androidx.emoji2.text.j(o7Var, 4);
                }
                androidx.emoji2.text.j jVar = o7Var.b;
                int i12 = o7Var.c + 1;
                o7Var.c = i12;
                jVar.b = i12;
                o7Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 2:
                x7 x7Var = (x7) obj;
                RectF rectF2 = x7Var.n;
                x7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(x7Var.y, 1000L);
                break;
            case 3:
                ea eaVar = (ea) obj;
                if (eaVar.N && eaVar.E != null) {
                    if (eaVar.Z && eaVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (eaVar.W != null) {
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
                    vl0 vl0Var = eaVar.E;
                    if (vl0Var != null) {
                        if (!eaVar.O) {
                            n10 = -n10;
                        }
                        vl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.r7 r7Var = (org.telegram.ui.Components.r7) obj;
                org.telegram.ui.Components.i8 i8Var = r7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i13 = i8Var.J0 + 1;
                    i8Var.J0 = i13;
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
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.Components.i8 i8Var2 = (org.telegram.ui.Components.i8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f7 = i8Var2.I0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - i8Var2.K0;
                    i8Var2.K0 = currentTimeMillis;
                    long j10 = currentTimeMillis - i8Var2.L0;
                    int i14 = i8Var2.J0;
                    float f10 = ((long) ((f7 * r4) + (((i14 == 1 ? 3L : i14 == 2 ? 6L : 12L) * j3) - j3))) / duration;
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
                        if (i8Var2.J0 > 0 && i8Var2.I0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(i8Var2.N0, 16L);
                            break;
                        }
                    }
                } else {
                    i8Var2.K0 = System.currentTimeMillis();
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
                u6 u6Var = unVar.U0;
                e6 e6Var = unVar.g1;
                if (e6Var != null) {
                    EditTextBoldCursor editField = e6Var.getEditField();
                    if (!unVar.H && editField != null && unVar.G && !unVar.e1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(u6Var);
                        AndroidUtilities.runOnUIThread(u6Var, 100L);
                        break;
                    }
                }
                break;
            case 10:
                ju juVar = (ju) obj;
                u6 u6Var2 = juVar.P;
                eu euVar = juVar.a;
                if (!juVar.y && euVar != null && juVar.N && !juVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    euVar.requestFocus();
                    AndroidUtilities.showKeyboard(euVar);
                    AndroidUtilities.cancelRunOnUIThread(u6Var2);
                    AndroidUtilities.runOnUIThread(u6Var2, 100L);
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
                        AndroidUtilities.runOnUIThread(new bv(14, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 16:
                z50 z50Var = (z50) obj;
                im0 im0Var = z50Var.s;
                ki.n0 n0Var = z50Var.M;
                if (n0Var != null && n0Var.a == 3) {
                    long elapsedRealtime2 = (SystemClock.elapsedRealtime() + n0Var.b) - n0Var.c;
                    z50Var.i0 = elapsedRealtime2;
                    im0Var.setProgress(Math.min(1.0f, elapsedRealtime2 / n0Var.d));
                    im0Var.postOnAnimation(this);
                    break;
                }
                break;
            case 17:
                y60 y60Var = (y60) obj;
                z60 z60Var = y60Var.x;
                m60 m60Var = z60Var.V;
                if (m60Var != null && m60Var.getAdapter() != null) {
                    z60Var.V.getClass();
                    int S = RecyclerView.S(y60Var);
                    if (S >= 0) {
                        z60Var.T.v(z60Var.V.U(y60Var), S);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                break;
            case 18:
                dc0 dc0Var = (dc0) obj;
                ValueAnimator valueAnimator = dc0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    dc0Var.h.start();
                    break;
                }
                break;
            case 19:
                ae0 ae0Var = (ae0) obj;
                ae0Var.e();
                AndroidUtilities.runOnUIThread(ae0Var.R, 100L);
                break;
            case 20:
                si0 si0Var = (si0) obj;
                si0Var.y = true;
                ValueAnimator valueAnimator2 = si0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                si0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                si0Var.z = ofFloat;
                ofFloat.addUpdateListener(si0Var.b0);
                si0Var.z.setInterpolator(new LinearInterpolator());
                si0Var.z.setDuration(150L);
                si0Var.z.start();
                break;
            case 21:
                vl0 vl0Var2 = (vl0) obj;
                qi qiVar = vl0Var2.h2;
                int[] iArr = vl0Var2.m2;
                zn znVar = qiVar.d;
                iArr[0] = (int) znVar.s9;
                iArr[1] = znVar.Aa;
                if (vl0Var2.j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    vl0Var2.N0(0.0f, vl0Var2.m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    vl0Var2.N0(0.0f, vl0Var2.getMeasuredHeight() - vl0Var2.m2[1]);
                }
                vl0Var2.h2.d.x0.scrollBy(0, dp);
                if (vl0Var2.i2) {
                    AndroidUtilities.runOnUIThread(vl0Var2.D2);
                    break;
                }
                break;
            case 22:
                cl0 cl0Var = (cl0) obj;
                u6 u6Var3 = cl0Var.i0;
                if (!cl0Var.n) {
                    cl0Var.U = false;
                    cl0Var.invalidate();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(u6Var3);
                    AndroidUtilities.runOnUIThread(u6Var3, 4000L);
                    break;
                }
            case 23:
                xl0 xl0Var = (xl0) obj;
                RecyclerView recyclerView = xl0Var.a;
                if (recyclerView != null) {
                    if (!xl0Var.g) {
                        if (xl0Var.h) {
                            recyclerView.scrollBy(0, xl0Var.i);
                            AndroidUtilities.runOnUIThread(this);
                            break;
                        }
                    } else {
                        recyclerView.scrollBy(0, -xl0Var.i);
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
                        xm0 xm0Var = scrollSlidingTextTabStrip.b;
                        if (xm0Var != null) {
                            xm0Var.y0(1.0f);
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
                ov0 ov0Var = shutterButton.e;
                if (ov0Var != null && !((rl) ov0Var).a()) {
                    shutterButton.v = false;
                    break;
                }
                break;
            case 26:
                jx0 jx0Var = (jx0) obj;
                View view = jx0Var.s;
                if (view == null) {
                    jx0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    break;
                } else {
                    if (view.getVisibility() != 0) {
                        jx0Var.s.setVisibility(0);
                        jx0Var.s.setAlpha(0.0f);
                    }
                    jx0Var.s.animate().setListener(null).cancel();
                    jx0Var.s.animate().alpha(1.0f).setDuration(150L).start();
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
                            ((l.d) v81Var).M(1.0f);
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
