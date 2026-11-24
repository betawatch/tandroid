// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h09 extends c49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t09 b;

    public /* synthetic */ h09(t09 t09Var, byte b) {
        this.a = b;
        this.b = t09Var;
    }

    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        byte b = this.a;
        t09 t09Var = this.b;
        switch (b) {
            case 0:
                super.e(rect, view, recyclerView, p49Var);
                if (!t09Var.n()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = gl.L(6.0f);
                    }
                    rect.right = gl.L(4.0f);
                    if (R == t09Var.b0.b() - 1) {
                        if ((!t09Var.V.isEmpty() && !na7.q1(t09Var.K).F3()) || t09Var.n()) {
                            rect.right = gl.L(2.0f);
                            break;
                        } else {
                            rect.right = gl.L(6.0f);
                            break;
                        }
                    }
                } else {
                    rect.left = 0;
                    rect.right = 0;
                    break;
                }
                break;
            default:
                int R2 = RecyclerView.R(view);
                if (R2 == 0) {
                    rect.left = gl.L(8.0f);
                }
                if (R2 == t09Var.b0.b() - 1) {
                    rect.right = gl.L(8.0f);
                    break;
                }
                break;
        }
    }
}
