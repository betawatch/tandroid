// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ee4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public ee4(yva yvaVar, float f, int i) {
        this.a = (byte) 1;
        this.d = yvaVar;
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
                fe4 fe4Var = (fe4) view;
                fe4Var.b(i == 5 ? 0.0f : -f, i + 1);
                fe4Var.E = 0.0f;
                fe4Var.invalidate();
                break;
            case 1:
                yva yvaVar = (yva) view;
                yvaVar.d0 = f;
                if (yvaVar.getValue() != i) {
                    yvaVar.e(yvaVar.getValue());
                }
                yvaVar.invalidate();
                break;
            default:
                ((nsc) view).c(i, f, false);
                break;
        }
    }

    public /* synthetic */ ee4(View view, int i, float f, byte b) {
        this.a = b;
        this.d = view;
        this.c = i;
        this.b = f;
    }
}
