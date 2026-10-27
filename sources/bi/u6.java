package bi;

import a8.me;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ey;
import org.telegram.ui.sw;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u6(com.google.firebase.messaging.j jVar, Intent intent) {
        this.a = 10;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                b7 b7Var = (b7) this.b;
                u6 u6Var = b7Var.l0;
                org.telegram.ui.Components.y9[] y9VarArr = b7Var.d;
                if (!y9VarArr[2 - b7Var.u0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(u6Var);
                    AndroidUtilities.runOnUIThread(u6Var, 150L);
                    return;
                }
                c6 c6Var = b7Var.a0;
                if (c6Var != null && c6Var.c == 1 && b7Var.isAttachedToWindow()) {
                    AndroidUtilities.cancelRunOnUIThread(u6Var);
                    ValueAnimator valueAnimator = b7Var.k0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        b7Var.k0 = null;
                    }
                    int i10 = 1 - b7Var.u0;
                    b7Var.u0 = i10;
                    yj0 lottieAnimation = y9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
                    yj0 lottieAnimation2 = y9VarArr[b7Var.u0 + 1].getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    }
                    b7Var.c0.c();
                    int i11 = b7Var.u0 + 1;
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = b7Var.b0;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) b7Var.e0.c();
                    stargiftattributebackdropArr[i11] = stargiftattributebackdrop;
                    b7Var.e(i11, stargiftattributebackdrop);
                    b7Var.g(1, (TL_stars.starGiftAttributePattern) b7Var.d0.c(), true);
                    b7Var.a();
                    float f7 = b7Var.u0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
                    b7Var.k0 = ofFloat;
                    ofFloat.addUpdateListener(new x6(b7Var, 2));
                    b7Var.k0.addListener(new a7(b7Var));
                    b7Var.k0.setDuration(320L);
                    b7Var.k0.setInterpolator(ds.h);
                    b7Var.k0.start();
                    return;
                }
                return;
            case 1:
                dd ddVar = (dd) this.b;
                if (ddVar.U == null || ddVar.a0 == -1) {
                    return;
                }
                ddVar.j1("POSTED_ALIGN");
                ddVar.U.a();
                return;
            case 2:
                ((ug.n) this.b).setPaused(true);
                return;
            case 3:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) this.b);
                return;
            case 4:
                ((k1[]) this.b)[0].dismiss();
                return;
            case 5:
                qf.d.r(((tc) this.b).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 6:
                qf.d.r(((uc) this.b).getContext(), LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 7:
                ((c1.e) this.b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 8:
                c2.b bVar = (c2.b) this.b;
                ((Context) bVar.b).unregisterReceiver((c2.a) bVar.c);
                return;
            case 9:
                c2.a aVar = (c2.a) this.b;
                if (aVar.c.a) {
                    aVar.a.a.C1(3, false);
                    return;
                }
                return;
            case 10:
                com.google.firebase.messaging.j.a((Intent) this.b);
                return;
            case 11:
                me meVar = (me) this.b;
                synchronized (((ArrayDeque) meVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) meVar.a).edit();
                    String str = (String) meVar.b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) meVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) meVar.c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 12:
                com.google.firebase.messaging.b0 b0Var = (com.google.firebase.messaging.b0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + b0Var.a.getAction() + " finishing.");
                b0Var.b.trySetResult(null);
                return;
            case 13:
                ey eyVar = ((sw) this.b).O0;
                if (eyVar.L && eyVar.f4().I()) {
                    eyVar.E0.h();
                    return;
                } else {
                    eyVar.F4(true, true);
                    return;
                }
            case 14:
                ((di.f1) this.b).a.t(false);
                return;
            case 15:
                di.h1 h1Var = ((di.g1) this.b).a;
                NotificationCenter.getInstance(h1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1Var.g()));
                return;
            case 16:
                di.o1 o1Var = (di.o1) this.b;
                o1Var.H = false;
                o1Var.o(false);
                o1Var.T = false;
                return;
            case 17:
                ((di.l3) this.b).a.O0();
                return;
            case 18:
                di.q4 q4Var = ((di.q3) this.b).x;
                di.j4 j4Var = q4Var.F1;
                if (j4Var != null) {
                    if (q4Var.I1 || q4Var.J1 || q4Var.K1) {
                        if (q4Var.D1.e) {
                            ((di.x9) q4Var.B2.c).loopBack();
                            return;
                        } else {
                            q4Var.L0 = 0L;
                            return;
                        }
                    }
                    di.y9 y9Var = ((di.p9) j4Var).d;
                    if (y9Var.n0.getCurrentPeerView().b1(true) || y9Var.n0.E(true)) {
                        return;
                    }
                    y9Var.q(true);
                    return;
                }
                return;
            case 19:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                int i12 = ProfileStoriesView.s0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 21:
                di.t5.a(((di.o5) this.b).d);
                return;
            case 22:
                di.f6 f6Var = (di.f6) this.b;
                if (f6Var.isShowing()) {
                    f6Var.q(true);
                    return;
                }
                return;
            case 23:
                ((fi.w8) this.b).run();
                return;
            case 24:
                fi.a1 a1Var = (fi.a1) this.b;
                a1Var.c(a1Var.b);
                a1Var.c = false;
                return;
            case 25:
                di.l7 l7Var = (di.l7) this.b;
                l7Var.c();
                l7Var.a(true);
                return;
            case 26:
                ((di.h6) this.b).run(null);
                return;
            case 27:
                ((di.v7) this.b).onDetachedFromWindow();
                return;
            case 28:
                di.e8 e8Var = (di.e8) this.b;
                ArrayList arrayList = e8Var.c;
                if (arrayList != null) {
                    e8Var.a.o1 = arrayList;
                }
                di.q4 q4Var2 = e8Var.a;
                long j10 = e8Var.b;
                if (q4Var2.q1 == j10 && q4Var2.o1 == null) {
                    return;
                }
                q4Var2.q1 = j10;
                q4Var2.h1();
                q4Var2.g1();
                q4Var2.d1(true);
                TL_stories.PeerStories peerStories = q4Var2.y0.Q0;
                if (peerStories != null) {
                    q4Var2.H1.V(peerStories, true);
                    return;
                }
                di.h7 h7Var = q4Var2.H1;
                TL_stories.PeerStories y3 = h7Var.y(j10);
                if (y3 == null) {
                    y3 = h7Var.z(j10);
                    z10 = true;
                }
                h7Var.V(y3, z10);
                return;
            default:
                ((x90) this.b).d(true);
                return;
        }
    }

    public /* synthetic */ u6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
