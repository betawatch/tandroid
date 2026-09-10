package ai;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.u7;
import s4.n0;
import s4.z0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ p(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, z0 z0Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof u7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    u7 u7Var = (u7) view;
                    a0 a0Var = this.b;
                    a0Var.f.getClass();
                    int R = RecyclerView.R(u7Var);
                    int i10 = a0Var.h.J;
                    u7Var.a0 = R < i10;
                    int i11 = R % i10;
                    u7Var.V = i11 == 0;
                    u7Var.W = i11 == i10 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof u7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    u7 u7Var2 = (u7) view;
                    a0 a0Var2 = this.b;
                    a0Var2.r.getClass();
                    int R2 = RecyclerView.R(u7Var2);
                    int i12 = a0Var2.s.J;
                    u7Var2.a0 = R2 < i12;
                    int i13 = R2 % i12;
                    u7Var2.V = i13 == 0;
                    u7Var2.W = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
