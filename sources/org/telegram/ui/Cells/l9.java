package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wl;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zn;
import org.telegram.ui.b40;
import org.telegram.ui.eo;
import org.telegram.ui.si;
import org.telegram.ui.vw;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (r7 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008a, code lost:
    
        if (r7 > 0) goto L25;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int n10;
        int i10;
        int q6;
        int dp;
        int R;
        int i11;
        int i12 = 0;
        switch (this.a) {
            case 0:
                fa faVar = (fa) this.b;
                if (!faVar.N || faVar.E == null) {
                    return;
                }
                if (faVar.Z && faVar.W == null) {
                    n10 = AndroidUtilities.dp(8.0f);
                } else if (faVar.W == null) {
                    return;
                } else {
                    n10 = faVar.n() >> 1;
                }
                if (!faVar.Z && !faVar.k0) {
                    if (faVar.O) {
                        if (faVar.W.getBottom() - n10 < faVar.F.getMeasuredHeight() - faVar.p()) {
                            i10 = faVar.W.getBottom() - faVar.F.getMeasuredHeight();
                            q6 = faVar.p();
                            n10 = i10 + q6;
                        }
                    } else if (faVar.W.getTop() + n10 > faVar.q()) {
                        i10 = -faVar.W.getTop();
                        q6 = faVar.q();
                        n10 = i10 + q6;
                    }
                }
                vl0 vl0Var = faVar.E;
                if (vl0Var != null) {
                    if (!faVar.O) {
                        n10 = -n10;
                    }
                    vl0Var.scrollBy(0, n10);
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 1:
                org.telegram.ui.Components.s7 s7Var = (org.telegram.ui.Components.s7) this.b;
                org.telegram.ui.Components.j8 j8Var = s7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() == null) {
                    return;
                }
                int i13 = j8Var.J0 + 1;
                j8Var.J0 = i13;
                if (i13 != 1) {
                    if (i13 != 2) {
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
            case 2:
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
                int i14 = j8Var2.J0;
                float f10 = ((long) ((f7 * r2) + (((i14 == 1 ? 3L : i14 == 2 ? 6L : 12L) * j3) - j3))) / duration;
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
            case 3:
                ed edVar = (ed) this.b;
                edVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                edVar.f.performHapticFeedback(0);
                Runnable runnable = edVar.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                sk skVar = (sk) this.b;
                if (skVar.S) {
                    skVar.N.clear();
                    skVar.P.clear();
                    skVar.Q.clear();
                    skVar.l();
                    return;
                }
                return;
            case 5:
                wm wmVar = (wm) this.b;
                xm xmVar = wmVar.P;
                if (xmVar.J == null || xmVar.K) {
                    return;
                }
                int computeVerticalScrollOffset = xmVar.r.computeVerticalScrollOffset();
                boolean z10 = xmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (wmVar.e() - wmVar.r) + wmVar.n;
                float max = Math.max(0.0f, (xmVar.E - Math.max(0, computeVerticalScrollOffset - xmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                float max2 = Math.max(0.0f, ((xmVar.r.getMeasuredHeight() - (xmVar.E - computeVerticalScrollOffset)) - xmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                float dp2 = AndroidUtilities.dp(32.0f);
                float dp3 = (max >= dp2 || computeVerticalScrollOffset <= xmVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                int i15 = (int) dp3;
                if (Math.abs(i15) > 0 && xmVar.r.canScrollVertically(i15) && (dp3 <= 0.0f || !z10)) {
                    xmVar.E += dp3;
                    xmVar.r.scrollBy(0, i15);
                    wmVar.invalidate();
                }
                wmVar.L = true;
                wmVar.postDelayed(this, 15L);
                return;
            case 6:
                zn znVar = (zn) this.b;
                l9 l9Var = znVar.U0;
                e6 e6Var = znVar.g1;
                if (e6Var != null) {
                    EditTextBoldCursor editField = e6Var.getEditField();
                    if (znVar.H || editField == null || !znVar.G || znVar.e1 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    editField.requestFocus();
                    AndroidUtilities.showKeyboard(editField);
                    AndroidUtilities.cancelRunOnUIThread(l9Var);
                    AndroidUtilities.runOnUIThread(l9Var, 100L);
                    return;
                }
                return;
            case 7:
                nu nuVar = (nu) this.b;
                l9 l9Var2 = nuVar.P;
                iu iuVar = nuVar.a;
                if (nuVar.y || iuVar == null || !nuVar.N || nuVar.v || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                    return;
                }
                iuVar.requestFocus();
                AndroidUtilities.showKeyboard(iuVar);
                AndroidUtilities.cancelRunOnUIThread(l9Var2);
                AndroidUtilities.runOnUIThread(l9Var2, 100L);
                return;
            case 8:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) ((org.telegram.ui.ActionBar.l1) this.b).d;
                if (!mVar.a || ((ArrayList) mVar.d).isEmpty() || ((AnimatorSet) mVar.c).isRunning()) {
                    return;
                }
                try {
                    ((AnimatorSet) mVar.c).start();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 9:
                rz rzVar = (rz) this.b;
                if (rzVar.B0.s != null) {
                    return;
                }
                rzVar.X1 = false;
                rzVar.a0();
                return;
            case 10:
                r00 r00Var = (r00) this.b;
                if (r00Var.O) {
                    float f11 = r00Var.p0 + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / 320.0f);
                    r00Var.p0 = f11;
                    r00Var.setAnimationIdicatorProgress(r00Var.i0.getInterpolation(f11));
                    if (r00Var.p0 > 1.0f) {
                        r00Var.p0 = 1.0f;
                    }
                    if (r00Var.p0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(r00Var.v0);
                        return;
                    }
                    r00Var.O = false;
                    r00Var.setEnabled(true);
                    l00 l00Var = r00Var.J;
                    if (l00Var != null) {
                        ((vw) l00Var).b(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = FragmentContextView.M0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.s0, 1000L);
                return;
            case 12:
                TextureView textureView = ((e60) this.b).H0.l0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new hy(11, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 13:
                z60 z60Var = (z60) this.b;
                a70 a70Var = z60Var.x;
                n60 n60Var = a70Var.V;
                if (n60Var != null && n60Var.getAdapter() != null) {
                    a70Var.V.getClass();
                    int R2 = RecyclerView.R(z60Var);
                    if (R2 >= 0) {
                        a70Var.T.v(a70Var.V.T(z60Var), R2);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                return;
            case 14:
                ec0 ec0Var = (ec0) this.b;
                ValueAnimator valueAnimator = ec0Var.h;
                if (valueAnimator == null || valueAnimator.isRunning()) {
                    return;
                }
                ec0Var.h.start();
                return;
            case 15:
                be0 be0Var = (be0) this.b;
                be0Var.e();
                AndroidUtilities.runOnUIThread(be0Var.R, 100L);
                return;
            case 16:
                si0 si0Var = (si0) this.b;
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
                return;
            case 17:
                vl0 vl0Var2 = (vl0) this.b;
                si siVar = vl0Var2.h2;
                int[] iArr = vl0Var2.m2;
                eo eoVar = siVar.d;
                iArr[0] = (int) eoVar.s9;
                iArr[1] = eoVar.Aa;
                if (vl0Var2.j2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    vl0Var2.L0(0.0f, vl0Var2.m2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    vl0Var2.L0(0.0f, vl0Var2.getMeasuredHeight() - vl0Var2.m2[1]);
                }
                vl0Var2.h2.d.x0.scrollBy(0, dp);
                if (vl0Var2.i2) {
                    AndroidUtilities.runOnUIThread(vl0Var2.D2);
                    return;
                }
                return;
            case 18:
                cl0 cl0Var = (cl0) this.b;
                l9 l9Var3 = cl0Var.i0;
                if (cl0Var.n) {
                    AndroidUtilities.cancelRunOnUIThread(l9Var3);
                    AndroidUtilities.runOnUIThread(l9Var3, 4000L);
                    return;
                } else {
                    cl0Var.U = false;
                    cl0Var.invalidate();
                    return;
                }
            case 19:
                xl0 xl0Var = (xl0) this.b;
                RecyclerView recyclerView = xl0Var.a;
                if (recyclerView == null) {
                    return;
                }
                if (xl0Var.g) {
                    recyclerView.scrollBy(0, -xl0Var.i);
                    AndroidUtilities.runOnUIThread(this);
                    return;
                } else {
                    if (xl0Var.h) {
                        recyclerView.scrollBy(0, xl0Var.i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    }
                    return;
                }
            case 20:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                if (scrollSlidingTextTabStrip.H) {
                    float f12 = scrollSlidingTextTabStrip.S + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / scrollSlidingTextTabStrip.b0);
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
                    vm0 vm0Var = scrollSlidingTextTabStrip.b;
                    if (vm0Var != null) {
                        vm0Var.v0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ShutterButton shutterButton = (ShutterButton) this.b;
                nv0 nv0Var = shutterButton.e;
                if (nv0Var == null || ((wl) nv0Var).a()) {
                    return;
                }
                shutterButton.v = false;
                return;
            case 22:
                jx0 jx0Var = (jx0) this.b;
                View view = jx0Var.s;
                if (view == null) {
                    jx0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    jx0Var.s.setVisibility(0);
                    jx0Var.s.setAlpha(0.0f);
                }
                jx0Var.s.animate().setListener(null).cancel();
                jx0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 23:
                u81 u81Var = (u81) this.b;
                if (u81Var.J) {
                    float f13 = u81Var.f0 + ((SystemClock.elapsedRealtime() <= 17 ? r2 : 17L) / 200.0f);
                    u81Var.f0 = f13;
                    u81Var.setAnimationIdicatorProgress(u81Var.a0.getInterpolation(f13));
                    if (u81Var.f0 > 1.0f) {
                        u81Var.f0 = 1.0f;
                    }
                    if (u81Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(u81Var.i0);
                        return;
                    }
                    u81Var.J = false;
                    u81Var.setEnabled(true);
                    t81 t81Var = u81Var.y;
                    if (t81Var != null) {
                        ((l2.h) t81Var).z(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                b40 b40Var = (b40) this.b;
                if (!b40Var.b || b40Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(b40Var.h0, 3000L);
                    return;
                } else {
                    b40Var.g0 = false;
                    b40Var.setUiVisible(false);
                    return;
                }
            case 25:
                ((p4.s0) this.b).c();
                return;
            case 26:
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
            case 27:
                pg.j jVar = ((zt0) this.b).S0;
                if (jVar instanceof pg.v2) {
                    ((pg.v2) jVar).getEditText();
                    return;
                }
                return;
            case 28:
                qg.v0 v0Var = (qg.v0) this.b;
                ArrayList arrayList = v0Var.g3;
                if (v0Var.n3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((qg.p1) hc.b.i(1, arrayList))) >= 0) {
                        View m10 = v0Var.Y2.m(R + 1);
                        if (m10 != null) {
                            v0Var.d3 = false;
                            v0Var.v1(m10, true);
                            v0Var.v0(0, m10.getTop() - ((v0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    v0Var.w1();
                    return;
                }
                return;
            default:
                s4.y yVar = (s4.y) this.b;
                s4.v vVar = yVar.x;
                if (yVar.c != null) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j11 = yVar.R;
                    long j12 = j11 != Long.MIN_VALUE ? currentTimeMillis2 - j11 : 0L;
                    s4.o0 layoutManager = yVar.H.getLayoutManager();
                    if (yVar.Q == null) {
                        yVar.Q = new Rect();
                    }
                    layoutManager.c(yVar.c.a, yVar.Q);
                    if (layoutManager.d()) {
                        int i16 = (int) (yVar.s + yVar.n);
                        i11 = (i16 - yVar.Q.left) - yVar.H.getPaddingLeft();
                        float f14 = yVar.n;
                        if (f14 < 0.0f) {
                        }
                        if (f14 > 0.0f) {
                            i11 = ((yVar.c.a.getWidth() + i16) + yVar.Q.right) - (yVar.H.getWidth() - yVar.H.getPaddingRight());
                            break;
                        }
                    }
                    i11 = 0;
                    if (layoutManager.e()) {
                        int i17 = (int) (yVar.v + yVar.r);
                        int paddingTop = (i17 - yVar.Q.top) - yVar.H.getPaddingTop();
                        float f15 = yVar.r;
                        if ((f15 < 0.0f && paddingTop < 0) || (f15 > 0.0f && (paddingTop = ((yVar.c.a.getHeight() + i17) + yVar.Q.bottom) - (yVar.H.getHeight() - yVar.H.getPaddingBottom())) > 0)) {
                            i12 = paddingTop;
                        }
                    }
                    if (i11 != 0) {
                        int width = yVar.c.a.getWidth();
                        yVar.H.getWidth();
                        i11 = vVar.i(width, i11, j12);
                    }
                    if (i12 != 0) {
                        int height = yVar.c.a.getHeight();
                        yVar.H.getHeight();
                        i12 = vVar.i(height, i12, j12);
                    }
                    if (i11 == 0 && i12 == 0) {
                        yVar.R = Long.MIN_VALUE;
                        return;
                    }
                    if (yVar.R == Long.MIN_VALUE) {
                        yVar.R = currentTimeMillis2;
                    }
                    yVar.H.scrollBy(i11, i12);
                    s4.c1 c1Var = yVar.c;
                    if (c1Var != null) {
                        yVar.n(c1Var);
                    }
                    yVar.H.removeCallbacks(yVar.I);
                    RecyclerView recyclerView2 = yVar.H;
                    WeakHashMap weakHashMap = r0.i0.a;
                    recyclerView2.postOnAnimation(this);
                    return;
                }
                return;
        }
    }
}
