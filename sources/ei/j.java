package ei;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.w7;
import s4.b1;
import s4.n0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ j(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, b1 b1Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof w7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    w7 w7Var = (w7) view;
                    r rVar = this.b;
                    rVar.f.getClass();
                    int R = RecyclerView.R(w7Var);
                    int i10 = rVar.h.J;
                    w7Var.a0 = R < i10;
                    int i11 = R % i10;
                    w7Var.V = i11 == 0;
                    w7Var.W = i11 == i10 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof w7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    w7 w7Var2 = (w7) view;
                    r rVar2 = this.b;
                    rVar2.r.getClass();
                    int R2 = RecyclerView.R(w7Var2);
                    int i12 = rVar2.s.J;
                    w7Var2.a0 = R2 < i12;
                    int i13 = R2 % i12;
                    w7Var2.V = i13 == 0;
                    w7Var2.W = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
