package lh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import nh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.fw;
import org.telegram.ui.hi;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class m7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.i iVar;
        int n10;
        int i10;
        int q6;
        int dp;
        int i11 = this.a;
        int i12 = 17;
        int i13 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((y8) obj).H0 = false;
                break;
            case 1:
                s7 s7Var = (s7) obj;
                s7Var.b = false;
                s7Var.invalidate();
                break;
            case 2:
                m.s1 s1Var = (m.s1) obj;
                s1Var.w = null;
                s1Var.drawableStateChanged();
                break;
            case 3:
                ActionMenuView actionMenuView = ((Toolbar) obj).a;
                if (actionMenuView != null && (iVar = actionMenuView.F) != null) {
                    iVar.l();
                    break;
                }
                break;
            case 4:
                m2.g gVar = (m2.g) obj;
                gVar.setScrollState(0);
                gVar.s();
                break;
            case 5:
                bg.k kVar = ((ja) obj).F0;
                if (kVar instanceof bg.f4) {
                    ((bg.f4) kVar).getEditText();
                    break;
                }
                break;
            case 6:
                Object obj2 = ((ag.o1) obj).b;
                break;
            case 7:
                org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) obj;
                if (a0Var.b == null) {
                    a0Var.b = new androidx.emoji2.text.j(a0Var, i13);
                }
                androidx.emoji2.text.j jVar = a0Var.b;
                int i14 = a0Var.c + 1;
                a0Var.c = i14;
                jVar.b = i14;
                a0Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) obj;
                TextView textView = t5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                t5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(t5Var.a, (Property<TextView, Float>) property, 1.0f));
                t5Var.d.setDuration(250L);
                t5Var.d.setInterpolator(new DecelerateInterpolator());
                t5Var.d.addListener(new nh.q5(this, i12));
                t5Var.d.start();
                break;
            case 9:
                org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) obj;
                q6Var.a();
                RectF rectF = q6Var.f;
                q6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(q6Var.v, 1000L);
                break;
            case 10:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) obj;
                if (j7Var.b == null) {
                    j7Var.b = new androidx.emoji2.text.j(j7Var, 3);
                }
                androidx.emoji2.text.j jVar2 = j7Var.b;
                int i15 = j7Var.c + 1;
                j7Var.c = i15;
                jVar2.b = i15;
                j7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 11:
                org.telegram.ui.Cells.s7 s7Var2 = (org.telegram.ui.Cells.s7) obj;
                RectF rectF2 = s7Var2.n;
                s7Var2.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(s7Var2.y, 1000L);
                break;
            case 12:
                x9 x9Var = (x9) obj;
                if (x9Var.N && x9Var.E != null) {
                    if (x9Var.Z && x9Var.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (x9Var.W != null) {
                        n10 = x9Var.n() >> 1;
                    }
                    if (!x9Var.Z && !x9Var.k0) {
                        if (x9Var.O) {
                            if (x9Var.W.getBottom() - n10 < x9Var.F.getMeasuredHeight() - x9Var.p()) {
                                i10 = x9Var.W.getBottom() - x9Var.F.getMeasuredHeight();
                                q6 = x9Var.p();
                                n10 = i10 + q6;
                            }
                        } else if (x9Var.W.getTop() + n10 > x9Var.q()) {
                            i10 = -x9Var.W.getTop();
                            q6 = x9Var.q();
                            n10 = i10 + q6;
                        }
                    }
                    jl0 jl0Var = x9Var.E;
                    if (jl0Var != null) {
                        if (!x9Var.O) {
                            n10 = -n10;
                        }
                        jl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.q7 q7Var = (org.telegram.ui.Components.q7) obj;
                org.telegram.ui.Components.g8 g8Var = q7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i16 = g8Var.F0 + 1;
                    g8Var.F0 = i16;
                    if (i16 != 1) {
                        if (i16 != 2) {
                            MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                            break;
                        } else {
                            MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                            AndroidUtilities.runOnUIThread(this, 2000L);
                            break;
                        }
                    } else {
                        q7Var.v = true;
                        g8Var.D0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            g8Var.C0();
                        } else if (g8Var.D0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(g8Var.J0);
                            g8Var.H0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.Components.g8 g8Var2 = (org.telegram.ui.Components.g8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f9 = g8Var2.E0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - g8Var2.G0;
                    g8Var2.G0 = currentTimeMillis;
                    long j11 = currentTimeMillis - g8Var2.H0;
                    int i17 = g8Var2.F0;
                    float f10 = ((long) ((f9 * r0) + (((i17 == 1 ? 3L : i17 == 2 ? 6L : 12L) * j10) - j10))) / duration;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    }
                    g8Var2.E0 = f10;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = g8Var2.E0;
                        }
                        g8Var2.G0(playingMessageObject, false);
                    }
                    if (g8Var2.D0 == 1 && g8Var2.F0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j11 > 200 || g8Var2.E0 == 0.0f) {
                            g8Var2.H0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
                        }
                        if (g8Var2.F0 > 0 && g8Var2.E0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(g8Var2.J0, 16L);
                            break;
                        }
                    }
                } else {
                    g8Var2.G0 = System.currentTimeMillis();
                    break;
                }
                break;
            case 15:
                ad adVar = (ad) obj;
                adVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                adVar.f.performHapticFeedback(0);
                Runnable runnable = adVar.j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 16:
                ik ikVar = (ik) obj;
                if (ikVar.O) {
                    ikVar.J.clear();
                    ikVar.L.clear();
                    ikVar.M.clear();
                    ikVar.l();
                    break;
                }
                break;
            case 17:
                km kmVar = (km) obj;
                lm lmVar = kmVar.L;
                if (lmVar.F != null && !lmVar.G) {
                    int computeVerticalScrollOffset = lmVar.r.computeVerticalScrollOffset();
                    boolean z10 = lmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (kmVar.e() - kmVar.r) + kmVar.n;
                    float max = Math.max(0.0f, (lmVar.A - Math.max(0, computeVerticalScrollOffset - lmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((lmVar.r.getMeasuredHeight() - (lmVar.A - computeVerticalScrollOffset)) - lmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    float dp3 = (max >= dp2 || computeVerticalScrollOffset <= lmVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    int i18 = (int) dp3;
                    if (Math.abs(i18) > 0 && lmVar.r.canScrollVertically(i18) && (dp3 <= 0.0f || !z10)) {
                        lmVar.A += dp3;
                        lmVar.r.scrollBy(0, i18);
                        kmVar.invalidate();
                    }
                    kmVar.H = true;
                    kmVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 18:
                on onVar = (on) obj;
                m7 m7Var = onVar.Q0;
                org.telegram.ui.Cells.a6 a6Var = onVar.c1;
                if (a6Var != null) {
                    EditTextBoldCursor editField = a6Var.getEditField();
                    if (!onVar.D && editField != null && onVar.C && !onVar.a1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(m7Var);
                        AndroidUtilities.runOnUIThread(m7Var, 100L);
                        break;
                    }
                }
                break;
            case 19:
                au auVar = (au) obj;
                m7 m7Var2 = auVar.L;
                vt vtVar = auVar.a;
                if (!auVar.y && vtVar != null && auVar.J && !auVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    vtVar.requestFocus();
                    AndroidUtilities.showKeyboard(vtVar);
                    AndroidUtilities.cancelRunOnUIThread(m7Var2);
                    AndroidUtilities.runOnUIThread(m7Var2, 100L);
                    break;
                }
                break;
            case 20:
                ab.m mVar = (ab.m) ((f3) obj).d;
                if (mVar.a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.c).start();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 21:
                fz fzVar = (fz) obj;
                if (fzVar.x0.s == null) {
                    fzVar.T1 = false;
                    fzVar.a0();
                    break;
                }
                break;
            case 22:
                f00 f00Var = (f00) obj;
                if (f00Var.K) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f11 = f00Var.l0 + (elapsedRealtime / 320.0f);
                    f00Var.l0 = f11;
                    f00Var.setAnimationIdicatorProgress(f00Var.e0.getInterpolation(f11));
                    if (f00Var.l0 > 1.0f) {
                        f00Var.l0 = 1.0f;
                    }
                    if (f00Var.l0 >= 1.0f) {
                        f00Var.K = false;
                        f00Var.setEnabled(true);
                        a00 a00Var = f00Var.F;
                        if (a00Var != null) {
                            ((fw) a00Var).b(1.0f);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(f00Var.r0);
                        break;
                    }
                }
                break;
            case 23:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.I0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.o0, 1000L);
                break;
            case 24:
                TextureView textureView = ((r50) obj).D0.h0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new gt(i12, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 25:
                m60 m60Var = (m60) obj;
                n60 n60Var = m60Var.x;
                a60 a60Var = n60Var.R;
                if (a60Var != null && a60Var.getAdapter() != null) {
                    n60Var.R.getClass();
                    int R = RecyclerView.R(m60Var);
                    if (R >= 0) {
                        n60Var.P.v(n60Var.R.T(m60Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                break;
            case 26:
                rb0 rb0Var = (rb0) obj;
                ValueAnimator valueAnimator = rb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    rb0Var.h.start();
                    break;
                }
                break;
            case 27:
                nd0 nd0Var = (nd0) obj;
                nd0Var.e();
                AndroidUtilities.runOnUIThread(nd0Var.N, 100L);
                break;
            case 28:
                ei0 ei0Var = (ei0) obj;
                ei0Var.y = true;
                ValueAnimator valueAnimator2 = ei0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ei0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ei0Var.z = ofFloat;
                ofFloat.addUpdateListener(ei0Var.b0);
                ei0Var.z.setInterpolator(new LinearInterpolator());
                ei0Var.z.setDuration(150L);
                ei0Var.z.start();
                break;
            default:
                jl0 jl0Var2 = (jl0) obj;
                hi hiVar = jl0Var2.d2;
                int[] iArr = jl0Var2.i2;
                tn tnVar = hiVar.d;
                iArr[0] = (int) tnVar.o9;
                iArr[1] = tnVar.wa;
                if (jl0Var2.f2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    jl0Var2.L0(0.0f, jl0Var2.i2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    jl0Var2.L0(0.0f, jl0Var2.getMeasuredHeight() - jl0Var2.i2[1]);
                }
                jl0Var2.d2.d.t0.scrollBy(0, dp);
                if (jl0Var2.e2) {
                    AndroidUtilities.runOnUIThread(jl0Var2.z2);
                    break;
                }
                break;
        }
    }

    public m7(ag.o1 o1Var, int i10) {
        this.a = 6;
        this.b = o1Var;
    }
}
