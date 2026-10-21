package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import ci.aa;
import ci.c9;
import ci.e9;
import ci.f1;
import ci.g1;
import ci.g6;
import ci.h1;
import ci.h8;
import ci.i6;
import ci.i7;
import ci.j4;
import ci.j9;
import ci.ja;
import ci.m3;
import ci.m7;
import ci.o9;
import ci.p1;
import ci.p5;
import ci.q4;
import ci.r3;
import ci.r9;
import ci.u5;
import ci.v8;
import ci.x7;
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
import org.telegram.ui.Components.u90;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cy;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                cy cyVar = ((tw) obj).O0;
                if (cyVar.L && cyVar.V3().G()) {
                    cyVar.E0.h();
                    return;
                } else {
                    cyVar.v4(true, true);
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
                p1 p1Var = (p1) obj;
                p1Var.H = false;
                p1Var.o(false);
                p1Var.T = false;
                return;
            case 10:
                ((m3) obj).a.Q0();
                return;
            case 11:
                q4 q4Var = ((r3) obj).x;
                j4 j4Var = q4Var.Q1;
                if (j4Var != null) {
                    if (q4Var.T1 || q4Var.U1 || q4Var.V1) {
                        if (q4Var.O1.e) {
                            ((z9) q4Var.M2.c).loopBack();
                            return;
                        } else {
                            q4Var.W0 = 0L;
                            return;
                        }
                    }
                    aa aaVar = ((r9) j4Var).d;
                    if (aaVar.n0.getCurrentPeerView().d1(true) || aaVar.n0.E(true)) {
                        return;
                    }
                    aaVar.q(true);
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
                u5.a(((p5) obj).d);
                return;
            case 15:
                g6 g6Var = (g6) obj;
                if (g6Var.isShowing()) {
                    g6Var.s(true);
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
                m7 m7Var = (m7) obj;
                m7Var.c();
                m7Var.a(true);
                return;
            case 19:
                ((i6) obj).run(null);
                return;
            case 20:
                ((x7) obj).onDetachedFromWindow();
                return;
            case 21:
                h8 h8Var = (h8) obj;
                ArrayList arrayList = h8Var.c;
                if (arrayList != null) {
                    h8Var.a.z1 = arrayList;
                }
                q4 q4Var2 = h8Var.a;
                long j10 = h8Var.b;
                if (q4Var2.B1 == j10 && q4Var2.z1 == null) {
                    return;
                }
                q4Var2.B1 = j10;
                q4Var2.j1();
                q4Var2.i1();
                q4Var2.f1(true);
                TL_stories.PeerStories peerStories = q4Var2.J0.Q0;
                if (peerStories != null) {
                    q4Var2.S1.S(peerStories, true);
                    return;
                }
                i7 i7Var = q4Var2.S1;
                TL_stories.PeerStories y3 = i7Var.y(j10);
                if (y3 == null) {
                    y3 = i7Var.z(j10);
                    z10 = true;
                }
                i7Var.S(y3, z10);
                return;
            case 22:
                ((u90) obj).d(true);
                return;
            case 23:
                ((v8) obj).requestLayout();
                return;
            case 24:
                e9 e9Var = (e9) obj;
                x3 x3Var = e9Var.c;
                if (x3Var != null) {
                    x3Var.e(true);
                    e9Var.c = null;
                }
                e9Var.b(false);
                return;
            case 25:
                c9 c9Var = (c9) obj;
                if (c9Var.v) {
                    c9Var.E = true;
                    c9Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    c9Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    c9Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    c9Var.invalidate();
                    return;
                }
                return;
            case 26:
                aa aaVar2 = ((j9) obj).b;
                try {
                    o9 o9Var = aaVar2.s;
                    if (o9Var == null) {
                        return;
                    }
                    if (aaVar2.b) {
                        AndroidUtilities.removeFromParent(o9Var);
                    } else {
                        aaVar2.n.removeView(o9Var);
                    }
                    aaVar2.s = null;
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 27:
                ((o9) obj).I0.K(true);
                return;
            case 28:
                ((ja) obj).c();
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
