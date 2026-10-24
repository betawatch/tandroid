package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import ci.b9;
import ci.d9;
import ci.f1;
import ci.f6;
import ci.g1;
import ci.g8;
import ci.h1;
import ci.h6;
import ci.h7;
import ci.i4;
import ci.i9;
import ci.ia;
import ci.l3;
import ci.l7;
import ci.n9;
import ci.o1;
import ci.o5;
import ci.p4;
import ci.q3;
import ci.q9;
import ci.t5;
import ci.u8;
import ci.w7;
import ci.y9;
import ci.z9;
import ei.a1;
import ei.a9;
import ei.x3;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ey;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(l lVar, u0 u0Var) {
        this.a = 0;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean z10 = false;
        Object obj = this.b;
        switch (i10) {
            case 0:
                l this$0 = (l) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(null, "$operation");
                this$0.a(null);
                return;
            case 1:
                Iterator it = ((j0) obj).n.iterator();
                if (it.hasNext()) {
                    throw a1.g.j(it);
                }
                return;
            case 2:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) obj;
                androidx.lifecycle.v vVar = e0Var.f;
                if (e0Var.b == 0) {
                    e0Var.c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.a == 0 && e0Var.c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 3:
                ((c1.e) obj).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 4:
                c2.b bVar = (c2.b) obj;
                ((Context) bVar.b).unregisterReceiver((c2.a) bVar.c);
                return;
            case 5:
                c2.a aVar = (c2.a) obj;
                if (aVar.c.a) {
                    aVar.a.a.C1(3, false);
                    return;
                }
                return;
            case 6:
                ey eyVar = ((vw) obj).O0;
                if (eyVar.L && eyVar.V3().G()) {
                    eyVar.E0.h();
                    return;
                } else {
                    eyVar.v4(true, true);
                    return;
                }
            case 7:
                ((f1) obj).a.t(false);
                return;
            case 8:
                h1 h1Var = ((g1) obj).a;
                NotificationCenter.getInstance(h1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1Var.g()));
                return;
            case 9:
                o1 o1Var = (o1) obj;
                o1Var.H = false;
                o1Var.o(false);
                o1Var.T = false;
                return;
            case 10:
                ((l3) obj).a.P0();
                return;
            case 11:
                p4 p4Var = ((q3) obj).x;
                i4 i4Var = p4Var.Q1;
                if (i4Var != null) {
                    if (p4Var.T1 || p4Var.U1 || p4Var.V1) {
                        if (p4Var.O1.e) {
                            ((y9) p4Var.M2.c).loopBack();
                            return;
                        } else {
                            p4Var.W0 = 0L;
                            return;
                        }
                    }
                    z9 z9Var = ((q9) i4Var).d;
                    if (z9Var.n0.getCurrentPeerView().c1(true) || z9Var.n0.E(true)) {
                        return;
                    }
                    z9Var.q(true);
                    return;
                }
                return;
            case 12:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 13:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                int i11 = ProfileStoriesView.s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 14:
                t5.a(((o5) obj).d);
                return;
            case 15:
                f6 f6Var = (f6) obj;
                if (f6Var.isShowing()) {
                    f6Var.r(true);
                    return;
                }
                return;
            case 16:
                ((a9) obj).run();
                return;
            case 17:
                a1 a1Var = (a1) obj;
                a1Var.c(a1Var.b);
                a1Var.c = false;
                return;
            case 18:
                l7 l7Var = (l7) obj;
                l7Var.c();
                l7Var.a(true);
                return;
            case 19:
                ((h6) obj).run(null);
                return;
            case 20:
                ((w7) obj).onDetachedFromWindow();
                return;
            case 21:
                g8 g8Var = (g8) obj;
                ArrayList arrayList = g8Var.c;
                if (arrayList != null) {
                    g8Var.a.z1 = arrayList;
                }
                p4 p4Var2 = g8Var.a;
                long j10 = g8Var.b;
                if (p4Var2.B1 == j10 && p4Var2.z1 == null) {
                    return;
                }
                p4Var2.B1 = j10;
                p4Var2.i1();
                p4Var2.h1();
                p4Var2.e1(true);
                TL_stories.PeerStories peerStories = p4Var2.J0.Q0;
                if (peerStories != null) {
                    p4Var2.S1.S(peerStories, true);
                    return;
                }
                h7 h7Var = p4Var2.S1;
                TL_stories.PeerStories y3 = h7Var.y(j10);
                if (y3 == null) {
                    y3 = h7Var.z(j10);
                    z10 = true;
                }
                h7Var.S(y3, z10);
                return;
            case 22:
                ((v90) obj).d(true);
                return;
            case 23:
                ((u8) obj).requestLayout();
                return;
            case 24:
                d9 d9Var = (d9) obj;
                x3 x3Var = d9Var.c;
                if (x3Var != null) {
                    x3Var.e(true);
                    d9Var.c = null;
                }
                d9Var.b(false);
                return;
            case 25:
                b9 b9Var = (b9) obj;
                if (b9Var.v) {
                    b9Var.E = true;
                    b9Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    b9Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    b9Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    b9Var.invalidate();
                    return;
                }
                return;
            case 26:
                z9 z9Var2 = ((i9) obj).b;
                try {
                    n9 n9Var = z9Var2.s;
                    if (n9Var == null) {
                        return;
                    }
                    if (z9Var2.b) {
                        AndroidUtilities.removeFromParent(n9Var);
                    } else {
                        z9Var2.n.removeView(n9Var);
                    }
                    z9Var2.s = null;
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 27:
                ((n9) obj).I0.K(true);
                return;
            case 28:
                ((ia) obj).c();
                return;
            default:
                com.google.firebase.messaging.j.a((Intent) obj);
                return;
        }
    }

    public /* synthetic */ d(com.google.firebase.messaging.j jVar, Intent intent) {
        this.a = 29;
        this.b = intent;
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
