package oh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.i1;
import f2.u0;
import org.telegram.ui.Cells.q7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                if (!(view instanceof q7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    q7 q7Var = (q7) view;
                    r rVar = this.b;
                    rVar.f.getClass();
                    int R = RecyclerView.R(q7Var);
                    int i10 = rVar.h.J;
                    q7Var.U = R < i10;
                    int i11 = R % i10;
                    q7Var.S = i11 == 0;
                    q7Var.T = i11 == i10 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof q7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    q7 q7Var2 = (q7) view;
                    r rVar2 = this.b;
                    rVar2.r.getClass();
                    int R2 = RecyclerView.R(q7Var2);
                    int i12 = rVar2.s.J;
                    q7Var2.U = R2 < i12;
                    int i13 = R2 % i12;
                    q7Var2.S = i13 == 0;
                    q7Var2.T = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
