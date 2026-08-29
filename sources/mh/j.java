package mh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.k1;
import f2.v0;
import org.telegram.ui.Cells.p7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j extends v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ j(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, k1 k1Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof p7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    p7 p7Var = (p7) view;
                    r rVar = this.b;
                    rVar.f.getClass();
                    int R = RecyclerView.R(p7Var);
                    int i10 = rVar.h.J;
                    p7Var.T = R < i10;
                    int i11 = R % i10;
                    p7Var.R = i11 == 0;
                    p7Var.S = i11 == i10 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof p7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    p7 p7Var2 = (p7) view;
                    r rVar2 = this.b;
                    rVar2.r.getClass();
                    int R2 = RecyclerView.R(p7Var2);
                    int i12 = rVar2.s.J;
                    p7Var2.T = R2 < i12;
                    int i13 = R2 % i12;
                    p7Var2.R = i13 == 0;
                    p7Var2.S = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
