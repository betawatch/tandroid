// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fg4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public fg4(bya byaVar, float f, int i) {
        this.a = (byte) 1;
        this.d = byaVar;
        this.b = f;
        this.c = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        int i = this.c;
        View view = this.d;
        switch (b) {
            case 0:
                gg4 gg4Var = (gg4) view;
                gg4Var.b(i == 5 ? 0.0f : -f, i + 1);
                gg4Var.E = 0.0f;
                gg4Var.invalidate();
                break;
            case 1:
                bya byaVar = (bya) view;
                byaVar.d0 = f;
                if (byaVar.getValue() != i) {
                    byaVar.e(byaVar.getValue());
                }
                byaVar.invalidate();
                break;
            default:
                ((puc) view).c(i, f, false);
                break;
        }
    }

    public /* synthetic */ fg4(View view, int i, float f, byte b) {
        this.a = b;
        this.d = view;
        this.c = i;
        this.b = f;
    }
}
