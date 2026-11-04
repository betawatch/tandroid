package fi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.n7;
import u4.a1;
import u4.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ f(m mVar, int i3) {
        this.a = i3;
        this.b = mVar;
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, a1 a1Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof n7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    n7 n7Var = (n7) view;
                    m mVar = this.b;
                    mVar.f.getClass();
                    int R = RecyclerView.R(n7Var);
                    int i3 = mVar.h.J;
                    n7Var.b0 = R < i3;
                    int i10 = R % i3;
                    n7Var.W = i10 == 0;
                    n7Var.a0 = i10 == i3 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof n7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    n7 n7Var2 = (n7) view;
                    m mVar2 = this.b;
                    mVar2.r.getClass();
                    int R2 = RecyclerView.R(n7Var2);
                    int i11 = mVar2.s.J;
                    n7Var2.b0 = R2 < i11;
                    int i12 = R2 % i11;
                    n7Var2.W = i12 == 0;
                    n7Var2.a0 = i12 == i11 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
