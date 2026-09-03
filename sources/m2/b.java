package m2;

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
import androidx.emoji2.text.j;
import androidx.recyclerview.widget.RecyclerView;
import b4.e0;
import c2.p;
import cb.m;
import cb.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import l7.f7;
import l7.w0;
import m.r3;
import n7.ee;
import n7.fd;
import n7.gb;
import n7.i1;
import n7.ib;
import n7.j1;
import n7.ma;
import n7.mg;
import n7.xf;
import oh.f4;
import oh.h3;
import oh.i9;
import oh.s7;
import oh.y8;
import oh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.m7;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.mi;
import org.telegram.ui.pw;
import org.telegram.ui.s5;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int n10;
        int i10;
        int q10;
        int dp;
        int i11 = this.a;
        l7.e eVar = null;
        int i12 = 3;
        long j10 = 0;
        int i13 = 2;
        boolean z4 = false;
        Object obj = this.b;
        switch (i11) {
            case 0:
                h hVar = (h) obj;
                hVar.setScrollState(0);
                hVar.s();
                break;
            case 1:
                xf xfVar = (xf) obj;
                ib ibVar = ib.K1;
                HashMap hashMap = xfVar.j;
                mg mgVar = (mg) hashMap.get(ibVar);
                if (mgVar != null) {
                    mg mgVar2 = mgVar;
                    fd fdVar = mgVar2.a;
                    if (fdVar == null) {
                        mg mgVar3 = mgVar2;
                        fd fdVar2 = new fd(mgVar3, mgVar3.c);
                        mgVar2.a = fdVar2;
                        fdVar = fdVar2;
                    }
                    Iterator it = fdVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) mgVar.c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(i12);
                        }
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list instanceof RandomAccess ? new ee(mgVar, next, list, eVar) : new l7.e(mgVar, next, list, eVar));
                        Collections.sort(arrayList);
                        f7 f7Var = new f7();
                        int size = arrayList.size();
                        long j11 = j10;
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj3 = arrayList.get(i14);
                            i14++;
                            j11 = ((Long) obj3).longValue() + j11;
                        }
                        f7Var.c = Long.valueOf((j11 / arrayList.size()) & Long.MAX_VALUE);
                        f7Var.a = Long.valueOf(xf.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        f7Var.f = Long.valueOf(xf.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        f7Var.e = Long.valueOf(xf.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        f7Var.d = Long.valueOf(xf.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        f7Var.b = Long.valueOf(xf.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(f7Var);
                        int size2 = arrayList.size();
                        r3 r3Var = new r3();
                        r3Var.c = gb.b;
                        w0 w0Var = new w0(8, z4);
                        w0Var.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        w0Var.b = (i1) next;
                        w0Var.d = maVar;
                        r3Var.h = new j1(w0Var);
                        o.a.execute(new p(xfVar, new e0(r3Var, 0), ibVar, xfVar.c(), false, 7));
                        eVar = null;
                        i12 = 3;
                        j10 = 0;
                    }
                    hashMap.remove(ibVar);
                    break;
                }
                break;
            case 2:
                Object obj4 = ((y5.h) obj).b;
                break;
            case 3:
                f4 f4Var = (f4) obj;
                if (f4Var.H1 && f4Var.Y0) {
                    i9 i9Var = ((z8) f4Var.N1).d;
                    i9Var.i1 = false;
                    i9Var.P();
                    break;
                }
                break;
            case 4:
                ((y8) obj).I0 = false;
                break;
            case 5:
                s7 s7Var = (s7) obj;
                s7Var.b = false;
                s7Var.invalidate();
                break;
            case 6:
                a0 a0Var = (a0) obj;
                if (a0Var.b == null) {
                    a0Var.b = new j(a0Var, i13);
                }
                j jVar = a0Var.b;
                int i15 = a0Var.c + 1;
                a0Var.c = i15;
                jVar.b = i15;
                a0Var.postDelayed(jVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 7:
                v5 v5Var = (v5) obj;
                TextView textView = v5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                v5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(v5Var.a, (Property<TextView, Float>) property, 1.0f));
                v5Var.d.setDuration(250L);
                v5Var.d.setInterpolator(new DecelerateInterpolator());
                v5Var.d.addListener(new s5(this, 8));
                v5Var.d.start();
                break;
            case 8:
                s6 s6Var = (s6) obj;
                s6Var.a();
                RectF rectF = s6Var.f;
                s6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(s6Var.v, 1000L);
                break;
            case 9:
                l7 l7Var = (l7) obj;
                if (l7Var.b == null) {
                    l7Var.b = new j(l7Var, i12);
                }
                j jVar2 = l7Var.b;
                int i16 = l7Var.c + 1;
                l7Var.c = i16;
                jVar2.b = i16;
                l7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 10:
                u7 u7Var = (u7) obj;
                RectF rectF2 = u7Var.n;
                u7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(u7Var.y, 1000L);
                break;
            case 11:
                z9 z9Var = (z9) obj;
                if (z9Var.N && z9Var.E != null) {
                    if (z9Var.Z && z9Var.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (z9Var.W != null) {
                        n10 = z9Var.n() >> 1;
                    }
                    if (!z9Var.Z && !z9Var.k0) {
                        if (z9Var.O) {
                            if (z9Var.W.getBottom() - n10 < z9Var.F.getMeasuredHeight() - z9Var.p()) {
                                i10 = z9Var.W.getBottom() - z9Var.F.getMeasuredHeight();
                                q10 = z9Var.p();
                                n10 = i10 + q10;
                            }
                        } else if (z9Var.W.getTop() + n10 > z9Var.q()) {
                            i10 = -z9Var.W.getTop();
                            q10 = z9Var.q();
                            n10 = i10 + q10;
                        }
                    }
                    sl0 sl0Var = z9Var.E;
                    if (sl0Var != null) {
                        if (!z9Var.O) {
                            n10 = -n10;
                        }
                        sl0Var.scrollBy(0, n10);
                    }
                    AndroidUtilities.runOnUIThread(this);
                    break;
                }
                break;
            case 12:
                m7 m7Var = (m7) obj;
                c8 c8Var = m7Var.y;
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    int i17 = c8Var.G0 + 1;
                    c8Var.G0 = i17;
                    if (i17 != 1) {
                        if (i17 != 2) {
                            MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                            break;
                        } else {
                            MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                            AndroidUtilities.runOnUIThread(this, 2000L);
                            break;
                        }
                    } else {
                        m7Var.v = true;
                        c8Var.E0 = 1;
                        if (MediaController.getInstance().isMessagePaused()) {
                            c8Var.C0();
                        } else if (c8Var.E0 == 1) {
                            AndroidUtilities.cancelRunOnUIThread(c8Var.K0);
                            c8Var.I0 = 0L;
                        }
                        MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                        AndroidUtilities.runOnUIThread(this, 2000L);
                        break;
                    }
                }
                break;
            case 13:
                c8 c8Var2 = (c8) obj;
                long duration = MediaController.getInstance().getDuration();
                if (duration != 0 && duration != -9223372036854775807L) {
                    float f10 = c8Var2.F0;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j12 = currentTimeMillis - c8Var2.H0;
                    c8Var2.H0 = currentTimeMillis;
                    long j13 = currentTimeMillis - c8Var2.I0;
                    int i18 = c8Var2.G0;
                    float f11 = ((long) ((f10 * r3) + (((i18 == 1 ? 3L : i18 == 2 ? 6L : 12L) * j12) - j12))) / duration;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    c8Var2.F0 = f11;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = c8Var2.F0;
                        }
                        c8Var2.G0(playingMessageObject, false);
                    }
                    if (c8Var2.E0 == 1 && c8Var2.G0 > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j13 > 200 || c8Var2.F0 == 0.0f) {
                            c8Var2.I0 = currentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f11);
                        }
                        if (c8Var2.G0 > 0 && c8Var2.F0 > 0.0f) {
                            AndroidUtilities.runOnUIThread(c8Var2.K0, 16L);
                            break;
                        }
                    }
                } else {
                    c8Var2.H0 = System.currentTimeMillis();
                    break;
                }
                break;
            case 14:
                xc xcVar = (xc) obj;
                xcVar.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                xcVar.f.performHapticFeedback(0);
                Runnable runnable = xcVar.j;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 15:
                ik ikVar = (ik) obj;
                if (ikVar.P) {
                    ikVar.K.clear();
                    ikVar.M.clear();
                    ikVar.N.clear();
                    ikVar.l();
                    break;
                }
                break;
            case 16:
                om omVar = (om) obj;
                pm pmVar = omVar.M;
                if (pmVar.G != null && !pmVar.H) {
                    int computeVerticalScrollOffset = pmVar.r.computeVerticalScrollOffset();
                    boolean z10 = pmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (omVar.e() - omVar.r) + omVar.n;
                    float max = Math.max(0.0f, (pmVar.B - Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((pmVar.r.getMeasuredHeight() - (pmVar.B - computeVerticalScrollOffset)) - pmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    float dp3 = (max >= dp2 || computeVerticalScrollOffset <= pmVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    int i19 = (int) dp3;
                    if (Math.abs(i19) > 0 && pmVar.r.canScrollVertically(i19) && (dp3 <= 0.0f || !z10)) {
                        pmVar.B += dp3;
                        pmVar.r.scrollBy(0, i19);
                        omVar.invalidate();
                    }
                    omVar.I = true;
                    omVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 17:
                rn rnVar = (rn) obj;
                b bVar = rnVar.R0;
                c6 c6Var = rnVar.d1;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!rnVar.E && editField != null && rnVar.D && !rnVar.b1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar, 100L);
                        break;
                    }
                }
                break;
            case 18:
                fu fuVar = (fu) obj;
                b bVar2 = fuVar.M;
                au auVar = fuVar.a;
                if (!fuVar.y && auVar != null && fuVar.K && !fuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    auVar.requestFocus();
                    AndroidUtilities.showKeyboard(auVar);
                    AndroidUtilities.cancelRunOnUIThread(bVar2);
                    AndroidUtilities.runOnUIThread(bVar2, 100L);
                    break;
                }
                break;
            case 19:
                m mVar = (m) ((h3) obj).d;
                if (mVar.a && !((ArrayList) mVar.d).isEmpty() && !((AnimatorSet) mVar.c).isRunning()) {
                    try {
                        ((AnimatorSet) mVar.c).start();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 20:
                mz mzVar = (mz) obj;
                if (mzVar.y0.s == null) {
                    mzVar.U1 = false;
                    mzVar.a0();
                    break;
                }
                break;
            case 21:
                l00 l00Var = (l00) obj;
                if (l00Var.L) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f12 = l00Var.m0 + (elapsedRealtime / 320.0f);
                    l00Var.m0 = f12;
                    l00Var.setAnimationIdicatorProgress(l00Var.f0.getInterpolation(f12));
                    if (l00Var.m0 > 1.0f) {
                        l00Var.m0 = 1.0f;
                    }
                    if (l00Var.m0 >= 1.0f) {
                        l00Var.L = false;
                        l00Var.setEnabled(true);
                        g00 g00Var = l00Var.G;
                        if (g00Var != null) {
                            ((pw) g00Var).b(1.0f);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(l00Var.s0);
                        break;
                    }
                }
                break;
            case 22:
                FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.J0;
                fragmentContextView.f();
                AndroidUtilities.runOnUIThread(fragmentContextView.p0, 1000L);
                break;
            case 23:
                TextureView textureView = ((y50) obj).E0.i0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new eo(24, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                break;
            case 24:
                t60 t60Var = (t60) obj;
                u60 u60Var = t60Var.x;
                h60 h60Var = u60Var.S;
                if (h60Var != null && h60Var.getAdapter() != null) {
                    u60Var.S.getClass();
                    int R = RecyclerView.R(t60Var);
                    if (R >= 0) {
                        u60Var.Q.v(u60Var.S.T(t60Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                break;
            case 25:
                yb0 yb0Var = (yb0) obj;
                ValueAnimator valueAnimator = yb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    yb0Var.h.start();
                    break;
                }
                break;
            case 26:
                xd0 xd0Var = (xd0) obj;
                xd0Var.e();
                AndroidUtilities.runOnUIThread(xd0Var.O, 100L);
                break;
            case 27:
                ri0 ri0Var = (ri0) obj;
                ri0Var.y = true;
                ValueAnimator valueAnimator2 = ri0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ri0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ri0Var.z = ofFloat;
                ofFloat.addUpdateListener(ri0Var.b0);
                ri0Var.z.setInterpolator(new LinearInterpolator());
                ri0Var.z.setDuration(150L);
                ri0Var.z.start();
                break;
            case 28:
                sl0 sl0Var2 = (sl0) obj;
                mi miVar = sl0Var2.e2;
                int[] iArr = sl0Var2.j2;
                xn xnVar = miVar.d;
                iArr[0] = (int) xnVar.p9;
                iArr[1] = xnVar.xa;
                if (sl0Var2.g2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    sl0Var2.L0(0.0f, sl0Var2.j2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    sl0Var2.L0(0.0f, sl0Var2.getMeasuredHeight() - sl0Var2.j2[1]);
                }
                sl0Var2.e2.d.u0.scrollBy(0, dp);
                if (sl0Var2.f2) {
                    AndroidUtilities.runOnUIThread(sl0Var2.A2);
                    break;
                }
                break;
            default:
                bl0 bl0Var = (bl0) obj;
                b bVar3 = bl0Var.f0;
                if (!bl0Var.n) {
                    bl0Var.R = false;
                    bl0Var.invalidate();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(bVar3);
                    AndroidUtilities.runOnUIThread(bVar3, 4000L);
                    break;
                }
        }
    }

    public /* synthetic */ b(xf xfVar) {
        this.a = 1;
        ib ibVar = ib.b;
        this.b = xfVar;
    }

    public b(y5.h hVar, int i10) {
        this.a = 2;
        this.b = hVar;
    }
}
