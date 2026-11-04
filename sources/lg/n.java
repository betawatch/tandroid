package lg;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import gi.j8;
import gi.w5;
import ii.m2;
import mi.g2;
import mi.z1;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Animation animation = null;
        Object obj = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) obj).link);
                fc.a0(LaunchActivity.Q()).k(false).j();
                break;
            case 1:
                j0 j0Var = (j0) obj;
                f41 f41Var = j0Var.X1;
                if (f41Var != null) {
                    f41Var.O(true);
                }
                j0Var.d1(true);
                break;
            case 2:
                r0 r0Var = (r0) ((w5) obj).b;
                r0Var.c.g3.O(true);
                r0Var.g0();
                break;
            case 3:
                t0 t0Var = (t0) obj;
                t0Var.b.g3.O(true);
                t0Var.a0(true);
                break;
            case 4:
                d1 d1Var = (d1) obj;
                d1Var.a.g3.O(true);
                d1Var.d0(true);
                break;
            case 5:
                ((ai.v1) obj).a(Boolean.FALSE);
                break;
            case 6:
                hs.f(((u1) obj).a).k(hs.F1, new Object[0]);
                break;
            case 7:
                ((m2.e) obj).c();
                break;
            case 8:
                g2.s sVar = (g2.s) obj;
                sVar.getClass();
                if (Thread.currentThread() == sVar.a) {
                    sVar.e(-1, new l2.d(19));
                    break;
                }
                break;
            case 9:
                m2.s0 s0Var = (m2.s0) obj;
                if (s0Var.a0 >= 300000) {
                    s0Var.n.p();
                    s0Var.a0 = 0L;
                    break;
                }
                break;
            case 10:
                i3 i3Var = ((k3) obj).d;
                i3Var.requestFocus();
                org.telegram.messenger.g0.K3(i3Var);
                break;
            case 11:
                org.telegram.messenger.g0.K3(((mi.v) obj).X1.d);
                break;
            case 12:
                ((mi.c0) obj).invalidate();
                break;
            case 13:
                fa.f fVar = (fa.f) obj;
                fVar.d = null;
                fVar.e = null;
                fVar.f = null;
                fVar.h = null;
                fVar.j(null);
                break;
            case 14:
                ((z1) obj).invalidateSelf();
                break;
            case 15:
                ((g2) obj).c();
                break;
            case 16:
                ((nh.b) obj).invalidate();
                break;
            case 17:
                oh.c cVar = (oh.c) obj;
                GroupCallMessage groupCallMessage = cVar.I;
                if (groupCallMessage != null) {
                    cVar.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.b.a(cVar.I.isSendError(), true);
                    break;
                }
                break;
            case 18:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj);
                break;
            case 19:
                Drawable drawable = ActionBarLayout.w1;
                org.telegram.messenger.g0.h3((bi.q0) obj);
                break;
            case 20:
                ((org.telegram.ui.ActionBar.p0) obj).setSelectedForDelete(false);
                break;
            case 21:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                v0Var.a0 = true;
                org.telegram.messenger.g0.l2(new j8(v0Var, 16), 8.0f);
                break;
            case 22:
                ((org.telegram.ui.ActionBar.h1) obj).c();
                break;
            case 23:
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) obj;
                org.telegram.ui.ActionBar.s1 s1Var = o1Var.d;
                int i10 = org.telegram.messenger.g0.q.x;
                s1Var.M = i10;
                int min = Math.min(org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.P1() ? org.telegram.messenger.g0.L(446.0f) : org.telegram.messenger.g0.L(496.0f) : org.telegram.messenger.g0.L(356.0f), i10 - org.telegram.messenger.g0.L(56.0f));
                Rect rect = s1Var.D0;
                int i11 = min + rect.left + rect.right;
                if (s1Var.a1) {
                    ViewGroup.LayoutParams layoutParams = o1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i11) {
                        layoutParams.width = i11;
                        o1Var.requestLayout();
                        break;
                    }
                } else {
                    Window window = s1Var.getWindow();
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                    layoutParams2.copyFrom(window.getAttributes());
                    layoutParams2.width = i11;
                    try {
                        window.setAttributes(layoutParams2);
                        break;
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        return;
                    }
                }
                break;
            case 24:
                org.telegram.ui.ActionBar.v1 v1Var = (org.telegram.ui.ActionBar.v1) obj;
                v1Var.p1.setVisibility(0);
                v1Var.r1.setAlpha(0.0f);
                int i12 = v1Var.n1;
                if (i12 != 0 && i12 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(v1Var.getContext(), i12);
                    } catch (Resources.NotFoundException e10) {
                        a8.g(e10, true);
                    }
                }
                if (animation != null) {
                    v1Var.q1.startAnimation(animation);
                } else {
                    v1Var.q1.setAlpha(0.0f);
                    v1Var.q1.animate().setDuration(300L).alpha(1.0f).start();
                }
                v1Var.r1.animate().setDuration(300L).alpha(1.0f).setListener(new org.telegram.ui.ActionBar.t1(v1Var, 0)).start();
                break;
            case 25:
                t2 t2Var = (t2) ((m2) obj).c;
                DialogInterface.OnDismissListener onDismissListener = t2Var.I0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(t2Var);
                }
                try {
                    t2Var.K();
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 26:
                try {
                    ((l2) obj).b.K();
                    break;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 27:
                g3 g3Var = (g3) obj;
                if (g3Var.d() != null) {
                    g3Var.d().setDrawingFromOverlay(true);
                    break;
                }
                break;
            case 28:
                ((j3) obj).f();
                break;
            default:
                i4 i4Var = (i4) ((androidx.mediarouter.app.g0) obj).b;
                i4Var.k();
                i4Var.j();
                break;
        }
    }
}
