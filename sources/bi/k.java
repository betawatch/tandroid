package bi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.u7;
import s4.n0;
import s4.z0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class k extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ k(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
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
                    u uVar = this.b;
                    uVar.f.getClass();
                    int S = RecyclerView.S(u7Var);
                    int i10 = uVar.h.J;
                    u7Var.a0 = S < i10;
                    int i11 = S % i10;
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
                    u uVar2 = this.b;
                    uVar2.r.getClass();
                    int S2 = RecyclerView.S(u7Var2);
                    int i12 = uVar2.s.J;
                    u7Var2.a0 = S2 < i12;
                    int i13 = S2 % i12;
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
