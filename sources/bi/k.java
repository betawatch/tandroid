package bi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.t7;
import s4.n0;
import s4.z0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                if (!(view instanceof t7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    t7 t7Var = (t7) view;
                    u uVar = this.b;
                    uVar.f.getClass();
                    int S = RecyclerView.S(t7Var);
                    int i10 = uVar.h.J;
                    t7Var.a0 = S < i10;
                    int i11 = S % i10;
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
                    u uVar2 = this.b;
                    uVar2.r.getClass();
                    int S2 = RecyclerView.S(t7Var2);
                    int i12 = uVar2.s.J;
                    t7Var2.a0 = S2 < i12;
                    int i13 = S2 % i12;
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
