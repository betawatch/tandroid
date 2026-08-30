package oh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.i1;
import f2.u0;
import org.telegram.ui.Cells.r7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class j extends u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ j(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, i1 i1Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof r7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    r7 r7Var = (r7) view;
                    r rVar = this.b;
                    rVar.f.getClass();
                    int R = RecyclerView.R(r7Var);
                    int i10 = rVar.h.J;
                    r7Var.U = R < i10;
                    int i11 = R % i10;
                    r7Var.S = i11 == 0;
                    r7Var.T = i11 == i10 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof r7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    r7 r7Var2 = (r7) view;
                    r rVar2 = this.b;
                    rVar2.r.getClass();
                    int R2 = RecyclerView.R(r7Var2);
                    int i12 = rVar2.s.J;
                    r7Var2.U = R2 < i12;
                    int i13 = R2 % i12;
                    r7Var2.S = i13 == 0;
                    r7Var2.T = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
