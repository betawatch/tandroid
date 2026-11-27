// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class la5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public la5(klb klbVar, m12 m12Var, wb2 wb2Var, nr1 nr1Var, zu1 zu1Var) {
        this.f = klbVar;
        this.b = m12Var;
        this.c = wb2Var;
        this.d = nr1Var;
        this.e = zu1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.e;
        FrameLayout frameLayout = this.d;
        ViewGroup viewGroup = this.c;
        View view = this.b;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                zc zcVar = (zc) viewGroup;
                WindowManager windowManager = (WindowManager) obj;
                pa5 pa5Var = (pa5) view;
                if (pa5Var.getParent() != null) {
                    pa5Var.setVisibility(8);
                    zcVar.setVisibility(8);
                    frameLayout.setVisibility(8);
                    windowManager.removeView(pa5Var);
                    windowManager.removeView(zcVar);
                    windowManager.removeView(frameLayout);
                    windowManager.removeView((z71) obj2);
                    break;
                }
                break;
            default:
                klb klbVar = (klb) obj2;
                klbVar.E.e();
                m12 m12Var = (m12) view;
                ((ArrayList) m12Var.c).remove(klbVar);
                m12Var.a();
                ((ViewGroup) m12Var.d).invalidate();
                wb2 wb2Var = (wb2) viewGroup;
                wb2Var.setEnterTransitionInProgress(false);
                wb2Var.getTransitionParams().E0.set(wb2Var.getBackgroundDrawableLeft(), wb2Var.getBackgroundDrawableTop(), wb2Var.getBackgroundDrawableRight(), wb2Var.getBackgroundDrawableBottom());
                nr1 nr1Var = (nr1) frameLayout;
                nr1Var.setTextTransitionIsRunning(false);
                nr1Var.getEditField().setAlpha(1.0f);
                zu1 zu1Var = (zu1) obj;
                ((fd2[]) zu1Var.c0.b)[0].c.setAlpha(1.0f);
                ((fd2[]) zu1Var.c0.b)[0].d.setAlpha(1.0f);
                hm.release((View) null, klbVar.I);
                break;
        }
    }

    public la5(pa5 pa5Var, zc zcVar, FrameLayout frameLayout, WindowManager windowManager, z71 z71Var) {
        this.b = pa5Var;
        this.c = zcVar;
        this.d = frameLayout;
        this.e = windowManager;
        this.f = z71Var;
    }
}
