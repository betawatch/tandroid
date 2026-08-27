package hh;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.gy;
import org.telegram.ui.rn;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class y9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean z10 = false;
        Object obj = this.b;
        switch (i10) {
            case 0:
                z9 z9Var = (z9) obj;
                z9Var.getClass();
                try {
                    zk0 currentListView = ((oa) z9Var.I0).N.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 1:
                we.e.s(((ea) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 2:
                we.e.s(((fa) obj).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 3:
                i3.f fVar = (i3.f) obj;
                i3.a a2 = fVar.a();
                fVar.l(a2, 1028, new i3.d(a2));
                fVar.f.d();
                break;
            case 4:
                ig.v vVar = (ig.v) ((ga.c) obj).b;
                ig.u uVar = vVar.b;
                if (uVar != null) {
                    uVar.d();
                }
                vVar.a.z7(true);
                break;
            case 5:
                ((ValueAnimator) obj).start();
                break;
            case 6:
                org.telegram.ui.ActionBar.n2 n2Var = ((ig.z) obj).b2.r;
                if (!(n2Var instanceof rn)) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new ag.g2(n2Var, 11, false));
                        break;
                    }
                } else {
                    n2Var.showDialog(new ag.g2(n2Var, 11, false));
                    break;
                }
                break;
            case 7:
                gy gyVar = ((yw) obj).K0;
                if (!gyVar.H || !gyVar.X3().G()) {
                    gyVar.x4(true, true);
                    break;
                } else {
                    gyVar.A0.h();
                    break;
                }
                break;
            case 8:
                ((jh.b1) obj).a.t(false);
                break;
            case 9:
                jh.d1 d1Var = ((jh.c1) obj).a;
                NotificationCenter.getInstance(d1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var.g()));
                break;
            case 10:
                jh.i1 i1Var = (jh.i1) obj;
                i1Var.D = false;
                i1Var.p(false);
                i1Var.P = false;
                break;
            case 11:
                ((jh.e3) obj).a.Q0();
                break;
            case 12:
                jh.e4 e4Var = ((jh.j3) obj).x;
                jh.y3 y3Var = e4Var.M1;
                if (y3Var != null) {
                    if (!e4Var.P1 && !e4Var.Q1 && !e4Var.R1) {
                        jh.i9 i9Var = ((jh.z8) y3Var).d;
                        if (!i9Var.j0.getCurrentPeerView().d1(true) && !i9Var.j0.E(true)) {
                            i9Var.q(true);
                            break;
                        }
                    } else if (!e4Var.K1.e) {
                        e4Var.S0 = 0L;
                        break;
                    } else {
                        e4Var.I2.b.loopBack();
                        break;
                    }
                }
                break;
            case 13:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 14:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                int i11 = ProfileStoriesView.o0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                break;
            case 15:
                jh.c5.a(((jh.y4) obj).d);
                break;
            case 16:
                jh.o5 o5Var = (jh.o5) obj;
                if (o5Var.isShowing()) {
                    o5Var.r(true);
                    break;
                }
                break;
            case 17:
                ((lh.z8) obj).run();
                break;
            case 18:
                lh.a1 a1Var = (lh.a1) obj;
                a1Var.b(a1Var.b);
                a1Var.c = false;
                break;
            case 19:
                jh.w6 w6Var = (jh.w6) obj;
                w6Var.c();
                w6Var.a(true);
                break;
            case 20:
                ((jh.u5) obj).accept(null);
                break;
            case 21:
                ((jh.g7) obj).onDetachedFromWindow();
                break;
            case 22:
                jh.p7 p7Var = (jh.p7) obj;
                ArrayList arrayList = p7Var.c;
                if (arrayList != null) {
                    p7Var.a.v1 = arrayList;
                }
                jh.e4 e4Var2 = p7Var.a;
                long j10 = p7Var.b;
                if (e4Var2.x1 != j10 || e4Var2.v1 != null) {
                    e4Var2.x1 = j10;
                    e4Var2.j1();
                    e4Var2.i1();
                    e4Var2.f1(true);
                    TL_stories.PeerStories peerStories = e4Var2.F0.M0;
                    if (peerStories == null) {
                        jh.s6 s6Var = e4Var2.O1;
                        TL_stories.PeerStories y10 = s6Var.y(j10);
                        if (y10 == null) {
                            y10 = s6Var.z(j10);
                            z10 = true;
                        }
                        s6Var.S(y10, z10);
                        break;
                    } else {
                        e4Var2.O1.S(peerStories, true);
                        break;
                    }
                }
                break;
            case 23:
                ((m80) obj).d(true);
                break;
            case 24:
                ((jh.d8) obj).requestLayout();
                break;
            case 25:
                jh.m8 m8Var = (jh.m8) obj;
                lh.w3 w3Var = m8Var.c;
                if (w3Var != null) {
                    w3Var.e(true);
                    m8Var.c = null;
                }
                m8Var.b(false);
                break;
            case 26:
                jh.k8 k8Var = (jh.k8) obj;
                if (k8Var.v) {
                    k8Var.A = true;
                    k8Var.B = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    k8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.invalidate();
                    break;
                }
                break;
            case 27:
                jh.i9 i9Var2 = ((jh.r8) obj).b;
                try {
                    jh.w8 w8Var = i9Var2.s;
                    if (w8Var != null) {
                        if (i9Var2.b) {
                            AndroidUtilities.removeFromParent(w8Var);
                        } else {
                            i9Var2.n.removeView(w8Var);
                        }
                        i9Var2.s = null;
                        break;
                    } else {
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
            case 28:
                ((jh.w8) obj).E0.K(true);
                break;
            default:
                ((jh.r9) obj).c();
                break;
        }
    }
}
