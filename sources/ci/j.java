package ci;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.t7;
import s4.m0;
import s4.y0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class j extends m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ j(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, y0 y0Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof t7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    t7 t7Var = (t7) view;
                    t tVar = this.b;
                    tVar.f.getClass();
                    int R = RecyclerView.R(t7Var);
                    int i10 = tVar.h.J;
                    t7Var.a0 = R < i10;
                    int i11 = R % i10;
                    t7Var.V = i11 == 0;
                    t7Var.W = i11 == i10 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof t7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    t7 t7Var2 = (t7) view;
                    t tVar2 = this.b;
                    tVar2.r.getClass();
                    int R2 = RecyclerView.R(t7Var2);
                    int i12 = tVar2.s.J;
                    t7Var2.a0 = R2 < i12;
                    int i13 = R2 % i12;
                    t7Var2.V = i13 == 0;
                    t7Var2.W = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
