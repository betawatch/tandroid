package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class r8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ r8(i9 i9Var, int i10) {
        this.a = i10;
        this.b = i9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f4 t6;
        mj0 mj0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.b;
                f9 f9Var = i9Var.p0;
                x8 x8Var = i9Var.v;
                if (x8Var != null) {
                    x8Var.a(true);
                }
                i9Var.o();
                i9Var.G0.unlock();
                x6 x6Var = i9Var.r1;
                if (x6Var != null) {
                    x6Var.b();
                    AndroidUtilities.removeFromParent(i9Var.r1);
                    i9Var.r1 = null;
                }
                ImageReceiver imageReceiver = f9Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    f9Var.b = null;
                }
                ImageReceiver imageReceiver2 = f9Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    f9Var.c.setVisible(true, true);
                }
                if (f9Var.d != null && (t6 = i9Var.t()) != null && (mj0Var = t6.l1.d) != null) {
                    mj0 mj0Var2 = f9Var.d;
                    mj0Var2.getClass();
                    mj0Var2.c = mj0Var.c;
                    mj0Var2.f = mj0Var.f;
                    mj0Var2.b = mj0Var.b;
                    mj0Var2.a = System.currentTimeMillis();
                    mj0Var2.c();
                }
                e4 e4Var = i9Var.D0;
                if (e4Var != null) {
                    e4Var.a();
                }
                SurfaceView surfaceView = i9Var.z0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                i9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new t3(this, 14));
                } catch (Exception unused) {
                }
                i9Var.j0 = false;
                i9Var.d = false;
                l3 l3Var = i9Var.l1;
                if (l3Var != null) {
                    l3Var.run();
                    i9Var.l1 = null;
                    break;
                }
                break;
            case 1:
                i9 i9Var2 = this.b;
                i9Var2.E = null;
                i9Var2.W = 0.0f;
                i9Var2.a0 = 0.0f;
                y8 y8Var = i9Var2.k0;
                f4 currentPeerView = y8Var != null ? y8Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                i9 i9Var3 = this.b;
                f9 f9Var2 = i9Var3.p0;
                i9Var3.R = 1.0f;
                i9Var3.o();
                i9.u1 = false;
                x8 x8Var2 = i9Var3.v;
                if (x8Var2 != null) {
                    x8Var2.a(true);
                }
                w8 w8Var = i9Var3.s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                ImageReceiver imageReceiver3 = f9Var2.b;
                if (imageReceiver3 != null && !i9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    f9Var2.b = null;
                }
                ImageReceiver imageReceiver4 = f9Var2.c;
                if (imageReceiver4 != null && !i9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    f9Var2.c.setVisible(true, true);
                    f9Var2.c = null;
                }
                f4 t9 = i9Var3.t();
                if (t9 != null) {
                    t9.f1(false);
                }
                e1 e1Var = i9Var3.x0;
                if (e1Var != null) {
                    e1Var.v((1.0f - i9Var3.S) * i9Var3.R);
                }
                if (i9Var3.t1) {
                    i9Var3.t1 = false;
                    i9Var3.p();
                    AndroidUtilities.runOnUIThread(new l3(i9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (i9Var3.r1 == null && i9Var3.v != null) {
                        x6 x6Var2 = new x6(i9Var3.v.getContext(), i9Var3.s);
                        i9Var3.r1 = x6Var2;
                        x6Var2.setAlpha(0.0f);
                        i9Var3.v.addView(i9Var3.r1);
                    }
                    x6 x6Var3 = i9Var3.r1;
                    if (x6Var3 != null) {
                        x6Var3.setOnClickListener(new androidx.mediarouter.app.c(this, 29));
                        i9Var3.r1.animate().alpha(1.0f).setDuration(150L).setListener(new b9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                i9Var3.P();
                i9Var3.G0.unlock();
                break;
        }
    }
}
