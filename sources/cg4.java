// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cg4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public cg4(b0b b0bVar, float f, int i) {
        this.a = (byte) 1;
        this.d = b0bVar;
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
                dg4 dg4Var = (dg4) view;
                dg4Var.b(i == 5 ? 0.0f : -f, i + 1);
                dg4Var.E = 0.0f;
                dg4Var.invalidate();
                break;
            case 1:
                b0b b0bVar = (b0b) view;
                b0bVar.d0 = f;
                if (b0bVar.getValue() != i) {
                    b0bVar.e(b0bVar.getValue());
                }
                b0bVar.invalidate();
                break;
            default:
                ((dxc) view).c(i, f, false);
                break;
        }
    }

    public /* synthetic */ cg4(View view, int i, float f, byte b) {
        this.a = b;
        this.d = view;
        this.c = i;
        this.b = f;
    }
}
