package di;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.s7;
import s4.m0;
import s4.y0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class j extends m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ j(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, y0 y0Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof s7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    s7 s7Var = (s7) view;
                    r rVar = this.b;
                    rVar.f.getClass();
                    int R = RecyclerView.R(s7Var);
                    int i10 = rVar.h.J;
                    s7Var.a0 = R < i10;
                    int i11 = R % i10;
                    s7Var.V = i11 == 0;
                    s7Var.W = i11 == i10 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof s7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    s7 s7Var2 = (s7) view;
                    r rVar2 = this.b;
                    rVar2.r.getClass();
                    int R2 = RecyclerView.R(s7Var2);
                    int i12 = rVar2.s.J;
                    s7Var2.a0 = R2 < i12;
                    int i13 = R2 % i12;
                    s7Var2.V = i13 == 0;
                    s7Var2.W = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
