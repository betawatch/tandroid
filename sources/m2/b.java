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
import m.s3;
import n7.ee;
import n7.fd;
import n7.gb;
import n7.i1;
import n7.ib;
import n7.j1;
import n7.ma;
import n7.mg;
import n7.xf;
import nh.d4;
import nh.g3;
import nh.i9;
import nh.s7;
import nh.y8;
import nh.z8;
import o5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.k7;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u5;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m7;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xt;
import org.telegram.ui.oi;
import org.telegram.ui.qw;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                        s3 s3Var = new s3();
                        s3Var.c = gb.b;
                        w0 w0Var = new w0(8, z4);
                        w0Var.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        w0Var.b = (i1) next;
                        w0Var.d = maVar;
                        s3Var.h = new j1(w0Var);
                        o.a.execute(new p(xfVar, new e0(s3Var, 0), ibVar, xfVar.c(), false, 7));
                        eVar = null;
                        i12 = 3;
                        j10 = 0;
                    }
                    hashMap.remove(ibVar);
                    break;
                }
                break;
            case 2:
                d4 d4Var = (d4) obj;
                if (d4Var.H1 && d4Var.Y0) {
                    i9 i9Var = ((z8) d4Var.N1).d;
                    i9Var.i1 = false;
                    i9Var.P();
                    break;
                }
                break;
            case 3:
                ((y8) obj).I0 = false;
                break;
            case 4:
                s7 s7Var = (s7) obj;
                s7Var.b = false;
                s7Var.invalidate();
                break;
            case 5:
                Object obj4 = ((i) obj).b;
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
                u5 u5Var = (u5) obj;
                TextView textView = u5Var.b;
                textView.setTag(null);
                AnimatorSet animatorSet = new AnimatorSet();
                u5Var.d = animatorSet;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(u5Var.a, (Property<TextView, Float>) property, 1.0f));
                u5Var.d.setDuration(250L);
                u5Var.d.setInterpolator(new DecelerateInterpolator());
                u5Var.d.addListener(new org.telegram.ui.u5(this, 8));
                u5Var.d.start();
                break;
            case 8:
                r6 r6Var = (r6) obj;
                r6Var.a();
                RectF rectF = r6Var.f;
                r6Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                AndroidUtilities.runOnUIThread(r6Var.v, 1000L);
                break;
            case 9:
                k7 k7Var = (k7) obj;
                if (k7Var.b == null) {
                    k7Var.b = new j(k7Var, i12);
                }
                j jVar2 = k7Var.b;
                int i16 = k7Var.c + 1;
                k7Var.c = i16;
                jVar2.b = i16;
                k7Var.postDelayed(jVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                break;
            case 10:
                t7 t7Var = (t7) obj;
                RectF rectF2 = t7Var.n;
                t7Var.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                AndroidUtilities.runOnUIThread(t7Var.y, 1000L);
                break;
            case 11:
                y9 y9Var = (y9) obj;
                if (y9Var.N && y9Var.E != null) {
                    if (y9Var.Z && y9Var.W == null) {
                        n10 = AndroidUtilities.dp(8.0f);
                    } else if (y9Var.W != null) {
                        n10 = y9Var.n() >> 1;
                    }
                    if (!y9Var.Z && !y9Var.k0) {
                        if (y9Var.O) {
                            if (y9Var.W.getBottom() - n10 < y9Var.F.getMeasuredHeight() - y9Var.p()) {
                                i10 = y9Var.W.getBottom() - y9Var.F.getMeasuredHeight();
                                q10 = y9Var.p();
                                n10 = i10 + q10;
                            }
                        } else if (y9Var.W.getTop() + n10 > y9Var.q()) {
                            i10 = -y9Var.W.getTop();
                            q10 = y9Var.q();
                            n10 = i10 + q10;
                        }
                    }
                    rl0 rl0Var = y9Var.E;
                    if (rl0Var != null) {
                        if (!y9Var.O) {
                            n10 = -n10;
                        }
                        rl0Var.scrollBy(0, n10);
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
                gk gkVar = (gk) obj;
                if (gkVar.P) {
                    gkVar.K.clear();
                    gkVar.M.clear();
                    gkVar.N.clear();
                    gkVar.l();
                    break;
                }
                break;
            case 16:
                mm mmVar = (mm) obj;
                nm nmVar = mmVar.M;
                if (nmVar.G != null && !nmVar.H) {
                    int computeVerticalScrollOffset = nmVar.r.computeVerticalScrollOffset();
                    boolean z10 = nmVar.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (mmVar.e() - mmVar.r) + mmVar.n;
                    float max = Math.max(0.0f, (nmVar.B - Math.max(0, computeVerticalScrollOffset - nmVar.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float max2 = Math.max(0.0f, ((nmVar.r.getMeasuredHeight() - (nmVar.B - computeVerticalScrollOffset)) - nmVar.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float dp2 = AndroidUtilities.dp(32.0f);
                    float dp3 = (max >= dp2 || computeVerticalScrollOffset <= nmVar.getListTopPadding()) ? max2 < dp2 ? AndroidUtilities.dp(6.0f) * (1.0f - (max2 / dp2)) : 0.0f : (-(1.0f - (max / dp2))) * AndroidUtilities.dp(6.0f);
                    int i19 = (int) dp3;
                    if (Math.abs(i19) > 0 && nmVar.r.canScrollVertically(i19) && (dp3 <= 0.0f || !z10)) {
                        nmVar.B += dp3;
                        nmVar.r.scrollBy(0, i19);
                        mmVar.invalidate();
                    }
                    mmVar.I = true;
                    mmVar.postDelayed(this, 15L);
                    break;
                }
                break;
            case 17:
                pn pnVar = (pn) obj;
                b bVar = pnVar.R0;
                b6 b6Var = pnVar.d1;
                if (b6Var != null) {
                    EditTextBoldCursor editField = b6Var.getEditField();
                    if (!pnVar.E && editField != null && pnVar.D && !pnVar.b1 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar, 100L);
                        break;
                    }
                }
                break;
            case 18:
                cu cuVar = (cu) obj;
                b bVar2 = cuVar.M;
                xt xtVar = cuVar.a;
                if (!cuVar.y && xtVar != null && cuVar.K && !cuVar.v && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                    xtVar.requestFocus();
                    AndroidUtilities.showKeyboard(xtVar);
                    AndroidUtilities.cancelRunOnUIThread(bVar2);
                    AndroidUtilities.runOnUIThread(bVar2, 100L);
                    break;
                }
                break;
            case 19:
                m mVar = (m) ((g3) obj).d;
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
                kz kzVar = (kz) obj;
                if (kzVar.y0.s == null) {
                    kzVar.U1 = false;
                    kzVar.a0();
                    break;
                }
                break;
            case 21:
                k00 k00Var = (k00) obj;
                if (k00Var.L) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f12 = k00Var.m0 + (elapsedRealtime / 320.0f);
                    k00Var.m0 = f12;
                    k00Var.setAnimationIdicatorProgress(k00Var.f0.getInterpolation(f12));
                    if (k00Var.m0 > 1.0f) {
                        k00Var.m0 = 1.0f;
                    }
                    if (k00Var.m0 >= 1.0f) {
                        k00Var.L = false;
                        k00Var.setEnabled(true);
                        f00 f00Var = k00Var.G;
                        if (f00Var != null) {
                            ((qw) f00Var).b(1.0f);
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(k00Var.s0);
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
                TextureView textureView = ((x50) obj).E0.i0;
                if (textureView != null) {
                    try {
                        AndroidUtilities.runOnUIThread(new em(25, this, textureView.getBitmap(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f))));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 24:
                s60 s60Var = (s60) obj;
                t60 t60Var = s60Var.x;
                g60 g60Var = t60Var.S;
                if (g60Var != null && g60Var.getAdapter() != null) {
                    t60Var.S.getClass();
                    int R = RecyclerView.R(s60Var);
                    if (R >= 0) {
                        t60Var.Q.v(t60Var.S.T(s60Var), R);
                    }
                }
                AndroidUtilities.runOnUIThread(this);
                break;
            case 25:
                xb0 xb0Var = (xb0) obj;
                ValueAnimator valueAnimator = xb0Var.h;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    xb0Var.h.start();
                    break;
                }
                break;
            case 26:
                wd0 wd0Var = (wd0) obj;
                wd0Var.e();
                AndroidUtilities.runOnUIThread(wd0Var.O, 100L);
                break;
            case 27:
                qi0 qi0Var = (qi0) obj;
                qi0Var.y = true;
                ValueAnimator valueAnimator2 = qi0Var.z;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                qi0Var.x = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qi0Var.z = ofFloat;
                ofFloat.addUpdateListener(qi0Var.b0);
                qi0Var.z.setInterpolator(new LinearInterpolator());
                qi0Var.z.setDuration(150L);
                qi0Var.z.start();
                break;
            case 28:
                rl0 rl0Var2 = (rl0) obj;
                oi oiVar = rl0Var2.e2;
                int[] iArr = rl0Var2.j2;
                zn znVar = oiVar.d;
                iArr[0] = (int) znVar.p9;
                iArr[1] = znVar.xa;
                if (rl0Var2.g2) {
                    dp = -AndroidUtilities.dp(12.0f);
                    rl0Var2.L0(0.0f, rl0Var2.j2[0]);
                } else {
                    dp = AndroidUtilities.dp(12.0f);
                    rl0Var2.L0(0.0f, rl0Var2.getMeasuredHeight() - rl0Var2.j2[1]);
                }
                rl0Var2.e2.d.u0.scrollBy(0, dp);
                if (rl0Var2.f2) {
                    AndroidUtilities.runOnUIThread(rl0Var2.A2);
                    break;
                }
                break;
            default:
                al0 al0Var = (al0) obj;
                b bVar3 = al0Var.f0;
                if (!al0Var.n) {
                    al0Var.R = false;
                    al0Var.invalidate();
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

    public b(i iVar, int i10) {
        this.a = 5;
        this.b = iVar;
    }
}
