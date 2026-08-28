package ih;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dy;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                dy dyVar = ((vw) this.b).K0;
                if (!dyVar.H || !dyVar.X3().G()) {
                    dyVar.x4(true, true);
                    break;
                } else {
                    dyVar.A0.h();
                    break;
                }
                break;
            case 1:
                ((d1) this.b).a.t(false);
                break;
            case 2:
                f1 f1Var = ((e1) this.b).a;
                NotificationCenter.getInstance(f1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1Var.g()));
                break;
            case 3:
                k1 k1Var = (k1) this.b;
                k1Var.D = false;
                k1Var.p(false);
                k1Var.P = false;
                break;
            case 4:
                ((f3) this.b).a.Q0();
                break;
            case 5:
                i4 i4Var = ((l3) this.b).x;
                c4 c4Var = i4Var.M1;
                if (c4Var != null) {
                    if (!i4Var.P1 && !i4Var.Q1 && !i4Var.R1) {
                        m9 m9Var = ((d9) c4Var).d;
                        if (!m9Var.j0.getCurrentPeerView().d1(true) && !m9Var.j0.E(true)) {
                            m9Var.q(true);
                            break;
                        }
                    } else if (!i4Var.K1.e) {
                        i4Var.S0 = 0L;
                        break;
                    } else {
                        i4Var.I2.b.loopBack();
                        break;
                    }
                }
                break;
            case 6:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    break;
                }
                break;
            case 7:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i9 = ProfileStoriesView.o0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                break;
            case 8:
                g5.a(((c5) this.b).d);
                break;
            case 9:
                s5 s5Var = (s5) this.b;
                if (s5Var.isShowing()) {
                    s5Var.q(true);
                    break;
                }
                break;
            case 10:
                ((kh.c9) this.b).run();
                break;
            case 11:
                kh.b1 b1Var = (kh.b1) this.b;
                b1Var.b(b1Var.b);
                b1Var.c = false;
                break;
            case 12:
                z6 z6Var = (z6) this.b;
                z6Var.c();
                z6Var.a(true);
                break;
            case 13:
                ((y5) this.b).accept(null);
                break;
            case 14:
                ((k7) this.b).onDetachedFromWindow();
                break;
            case 15:
                t7 t7Var = (t7) this.b;
                ArrayList arrayList = t7Var.c;
                if (arrayList != null) {
                    t7Var.a.v1 = arrayList;
                }
                i4 i4Var2 = t7Var.a;
                long j10 = t7Var.b;
                if (i4Var2.x1 != j10 || i4Var2.v1 != null) {
                    i4Var2.x1 = j10;
                    i4Var2.j1();
                    i4Var2.i1();
                    i4Var2.f1(true);
                    TL_stories.PeerStories peerStories = i4Var2.F0.M0;
                    if (peerStories == null) {
                        v6 v6Var = i4Var2.O1;
                        TL_stories.PeerStories y10 = v6Var.y(j10);
                        if (y10 == null) {
                            y10 = v6Var.z(j10);
                            z10 = true;
                        }
                        v6Var.S(y10, z10);
                        break;
                    } else {
                        i4Var2.O1.S(peerStories, true);
                        break;
                    }
                }
                break;
            case 16:
                ((i80) this.b).d(true);
                break;
            case 17:
                ((h8) this.b).requestLayout();
                break;
            case 18:
                q8 q8Var = (q8) this.b;
                kh.x3 x3Var = q8Var.c;
                if (x3Var != null) {
                    x3Var.e(true);
                    q8Var.c = null;
                }
                q8Var.b(false);
                break;
            case 19:
                o8 o8Var = (o8) this.b;
                if (o8Var.v) {
                    o8Var.A = true;
                    o8Var.B = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    o8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    o8Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    o8Var.invalidate();
                    break;
                }
                break;
            case 20:
                m9 m9Var2 = ((v8) this.b).b;
                try {
                    a9 a9Var = m9Var2.s;
                    if (a9Var != null) {
                        if (m9Var2.b) {
                            AndroidUtilities.removeFromParent(a9Var);
                        } else {
                            m9Var2.n.removeView(a9Var);
                        }
                        m9Var2.s = null;
                        break;
                    } else {
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 21:
                ((a9) this.b).E0.K(true);
                break;
            case 22:
                ((v9) this.b).c();
                break;
            case 23:
                ((ki) this.b).hide();
                break;
            case 24:
                jh.q qVar = (jh.q) this.b;
                uq0 uq0Var = qVar.S;
                f6 f6Var = qVar.a;
                uq0Var.a(f6Var == null ? "" : f6Var.E);
                break;
            case 25:
                ((kh.h) this.b).c.S = false;
                break;
            case 26:
                ((kh.l) this.b).invalidateSelf();
                break;
            case 27:
                ((kh.e0) this.b).g = -1L;
                break;
            case 28:
                kh.n0 n0Var = (kh.n0) this.b;
                yf.i iVar = n0Var.b.D;
                if (iVar != null) {
                    iVar.b();
                }
                n0Var.b.k();
                break;
            default:
                ((kh.w0) this.b).a(false);
                break;
        }
    }
}
