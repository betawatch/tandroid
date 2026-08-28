package m;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Components.zq;
import org.telegram.ui.dw;
import org.telegram.ui.ei;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        int n10;
        int i9;
        int q10;
        int dp;
        int i10 = this.a;
        int i11 = 2;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ActionMenuView actionMenuView = ((Toolbar) obj).a;
                if (actionMenuView != null && (iVar = actionMenuView.F) != null) {
                    iVar.l();
                    break;
                }
                break;
            case 1:
                m2.g gVar = (m2.g) obj;
                gVar.setScrollState(0);
                gVar.s();
                break;
            case 2:
                n2.t tVar = (n2.t) obj;
                n2.b bVar = tVar.d;
                bVar.k(0);
                n2.g gVar2 = n2.b0.i;
                bVar.j(24, gVar2);
                tVar.c(gVar2);
                break;
            case 3:
                Object obj2 = ((k5.i) obj).b;
                break;
            case 4:
                org.telegram.ui.Cells.a0 a0Var = (org.telegram.ui.Cells.a0) obj;
                if (a0Var.b == null) {
                    a0Var.b = new androidx.emoji2.text.i(a0Var, i11);
                }
                androidx.emoji2.text.i iVar2 = a0Var.b;
                int i12 = a0Var.c + 1;
                a0Var.c = i12;
                iVar2.b = i12;
                a0Var.postDelayed(iVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 5:
                v5 v5Var = (v5) obj;
                TextView textView = v5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(v5Var.a, (Property<TextView, Float>) property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new mh.x(this, 15));
                v5Var.d.start();
                break;
            case 6:
                s6 s6Var = (s6) obj;
                s6Var.a();
                RectF rectF = s6Var.f;
                s6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(s6Var.v, 1000L);
                break;
            case 7:
                l7 l7Var = (l7) obj;
                if (l7Var.b == null) {
                    l7Var.b = new androidx.emoji2.text.i(l7Var, 3);
                }
                androidx.emoji2.text.i iVar3 = l7Var.b;
                int i13 = l7Var.c + 1;
                l7Var.c = i13;
                iVar3.b = i13;
                l7Var.postDelayed(iVar3, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 8:
                u7 u7Var = (u7) obj;
                RectF rectF2 = u7Var.n;
                u7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(u7Var.y, 1000L);
                break;
            case 9:
                aa aaVar = (aa) obj;
                if (aaVar.N && aaVar.E != null) {
                    if (aaVar.Z && aaVar.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (aaVar.W != null) {
                        n10 = aaVar.n() >> 1;
                    }
                    if (!aaVar.Z && !aaVar.k0) {
                        if (aaVar.O) {
                            if (aaVar.W.getBottom() - n10 < aaVar.F.getMeasuredHeight() - aaVar.p()) {
                                i9 = aaVar.W.getBottom() - aaVar.F.getMeasuredHeight();
                                q10 = aaVar.p();
                                n10 = i9 + q10;
                            }
                        } else if (aaVar.W.getTop() + n10 > aaVar.q()) {
                            i9 = -aaVar.W.getTop();
                            q10 = aaVar.q();
                            n10 = i9 + q10;
                        }
                    }
                    wk0 wk0Var = aaVar.E;
                    if (wk0Var != null) {
                        if (!aaVar.O) {
                            n10 = -n10;
                        }
                        wk0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.l7 l7Var2 = (org.telegram.ui.Components.l7) obj;
                c8 c8Var = l7Var2.y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i14 = c8Var.F0 + 1;
                    c8Var.F0 = i14;
                    if (i14 != 1) {
                        if (i14 != 2) {
                            MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                            break;
                        } else {
                            MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                            AndroidUtilities.runOnUIThread(this, 2000L);
                            break;
                        }
                    } else {
                        l7Var2.v = true;
                        c8Var.D0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            c8Var.B0();
                        } else if (c8Var.D0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(c8Var.J0);
                            c8Var.H0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                }
                break;
            case 11:
                c8 c8Var2 = (c8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = c8Var2.E0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - c8Var2.G0;
                    c8Var2.G0 = currentTimeMillis;
                    long j11 = currentTimeMillis - c8Var2.H0;
                    int i15 = c8Var2.F0;
                    float f11 = ((long) ((f10 * r4) + (((i15 == 1 ? 3L : i15 == 2 ? 6L : 12L) * j10) - j10))) / duration;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    c8Var2.E0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = c8Var2.E0;
                        }
                        c8Var2.F0(playingMessageObject, false);
                    }
                    if (c8Var2.D0 == 1 && c8Var2.F0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j11 > 200 || c8Var2.E0 == 0.0f) {
                            c8Var2.H0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                        }
                        if (c8Var2.F0 > 0 && c8Var2.E0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(c8Var2.J0, 16L);
                            break;
                        }
                    }
                } else {
                    c8Var2.G0 = System.currentTimeMillis();
                    break;
                }
                break;
            case 12:
                wc wcVar = (wc) obj;
                wcVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                wcVar.f.performHapticFeedback(0);
                Runnable runnable = wcVar.j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                ek ekVar = (ek) obj;
                if (ekVar.O) {
                    ekVar.J.clear();
                    ekVar.L.clear();
                    ekVar.M.clear();
                    ekVar.l();
                    break;
                }
                break;
            case 14:
                gm gmVar = (gm) obj;
                hm hmVar = gmVar.L;
                if (hmVar.F != null && !hmVar.G) {
                    int computeVerticalScrollOffset = hmVar.r.computeVerticalScrollOffset();
                    boolean z10 = hmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (gmVar.e() - gmVar.r) + gmVar.n;
                    float max = Math.max(0.0f, (hmVar.A - Math.max(0, computeVerticalScrollOffset - hmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((hmVar.r.getMeasuredHeight() - (hmVar.A - computeVerticalScrollOffset)) - hmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    float dp3 = (max >= dp2 || computeVerticalScrollOffset <= hmVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    int i16 = (int) dp3;
                    if (Math.abs(i16) > 0 && hmVar.r.canScrollVertically(i16) && (dp3 <= 0.0f || !z10)) {
                        hmVar.A += dp3;
                        hmVar.r.scrollBy(0, i16);
                        gmVar.invalidate();
                    }
                    gmVar.H = true;
                    gmVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 15:
                jn jnVar = (jn) obj;
                i3 i3Var = jnVar.Q0;
                c6 c6Var = jnVar.c1;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!jnVar.D && editField != null && jnVar.C && !jnVar.a1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                        AndroidUtilities.runOnUIThread(i3Var, 100L);
                        break;
                    }
                }
                break;
            case 16:
                ut utVar = (ut) obj;
                i3 i3Var2 = utVar.L;
                pt ptVar = utVar.a;
                if (!utVar.y && ptVar != null && utVar.J && !utVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    ptVar.requestFocus();
                    AndroidUtilities.showKeyboard(ptVar);
                    AndroidUtilities.cancelRunOnUIThread(i3Var2);
                    AndroidUtilities.runOnUIThread(i3Var2, 100L);
                    break;
                }
                break;
            case 17:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) ((ih.j3) obj).d;
                if (lVar.a && !((ArrayList) lVar.d).isEmpty() && !((AnimatorSet) lVar.c).isRunning()) {
                    try {
                        ((AnimatorSet) lVar.c).start();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 18:
                wy wyVar = (wy) obj;
                if (wyVar.x0.s == null) {
                    wyVar.T1 = false;
                    wyVar.Z();
                    break;
                }
                break;
            case 19:
                vz vzVar = (vz) obj;
                if (vzVar.K) {
                    float f12 = vzVar.l0 + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / 320.0f);
                    vzVar.l0 = f12;
                    vzVar.setAnimationIdicatorProgress(vzVar.e0.getInterpolation(f12));
                    if (vzVar.l0 > 1.0f) {
                        vzVar.l0 = 1.0f;
                    }
                    if (vzVar.l0 >= 1.0f) {
                        vzVar.K = false;
                        vzVar.setEnabled(true);
                        qz qzVar = vzVar.F;
                        if (qzVar != null) {
                            ((dw) qzVar).b(1.0f);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(vzVar.r0);
                        break;
                    }
                }
                break;
            case 20:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.I0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.o0, 1000L);
                break;
            case 21:
                TextureView textureView = ((e50) obj).D0.h0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new zq(20, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 22:
                z50 z50Var = (z50) obj;
                a60 a60Var = z50Var.x;
                n50 n50Var = a60Var.R;
                if (n50Var != null && n50Var.getAdapter() != null) {
                    a60Var.R.getClass();
                    int R = RecyclerView.R(z50Var);
                    if (R >= 0) {
                        a60Var.P.v(a60Var.R.T(z50Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                break;
            case 23:
                cb0 cb0Var = (cb0) obj;
                ValueAnimator valueAnimator = cb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    cb0Var.h.start();
                    break;
                }
                break;
            case 24:
                yc0 yc0Var = (yc0) obj;
                yc0Var.e();
                AndroidUtilities.runOnUIThread(yc0Var.N, 100L);
                break;
            case 25:
                uh0 uh0Var = (uh0) obj;
                uh0Var.y = true;
                ValueAnimator valueAnimator2 = uh0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                uh0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                uh0Var.z = ofFloat;
                ofFloat.addUpdateListener(uh0Var.b0);
                uh0Var.z.setInterpolator(new LinearInterpolator());
                uh0Var.z.setDuration(150L);
                uh0Var.z.start();
                break;
            case 26:
                wk0 wk0Var2 = (wk0) obj;
                ei eiVar = wk0Var2.d2;
                int[] iArr = wk0Var2.i2;
                qn qnVar = eiVar.d;
                iArr[0] = (int) qnVar.o9;
                iArr[1] = qnVar.wa;
                if (wk0Var2.f2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    wk0Var2.L0(0.0f, wk0Var2.i2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    wk0Var2.L0(0.0f, wk0Var2.getMeasuredHeight() - wk0Var2.i2[1]);
                }
                wk0Var2.d2.d.t0.scrollBy(0, dp);
                if (wk0Var2.e2) {
                    AndroidUtilities.runOnUIThread(wk0Var2.z2);
                    break;
                }
                break;
            case 27:
                fk0 fk0Var = (fk0) obj;
                i3 i3Var3 = fk0Var.e0;
                if (!fk0Var.n) {
                    fk0Var.Q = false;
                    fk0Var.invalidate();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(i3Var3);
                    AndroidUtilities.runOnUIThread(i3Var3, 4000L);
                    break;
                }
            case 28:
                yk0 yk0Var = (yk0) obj;
                RecyclerView recyclerView = yk0Var.a;
                if (recyclerView != null) {
                    if (!yk0Var.g) {
                        if (yk0Var.h) {
                            recyclerView.scrollBy(0, yk0Var.i);
                            AndroidUtilities.runOnUIThread(this);
                            break;
                        }
                    } else {
                        recyclerView.scrollBy(0, -yk0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        break;
                    }
                }
                break;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                if (scrollSlidingTextTabStrip.D) {
                    float f13 = scrollSlidingTextTabStrip.O + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / scrollSlidingTextTabStrip.U);
                    scrollSlidingTextTabStrip.O = f13;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.J.getInterpolation(f13));
                    if (scrollSlidingTextTabStrip.O > 1.0f) {
                        scrollSlidingTextTabStrip.O = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.O >= 1.0f) {
                        scrollSlidingTextTabStrip.D = false;
                        scrollSlidingTextTabStrip.setEnabled(true);
                        wl0 wl0Var = scrollSlidingTextTabStrip.b;
                        if (wl0Var != null) {
                            wl0Var.v0(1.0f);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.W);
                        break;
                    }
                }
                break;
        }
    }

    public i3(k5.i iVar, int i9) {
        this.a = 3;
        this.b = iVar;
    }
}
