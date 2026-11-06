package ei;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.o7;
import v4.a1;
import v4.m0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g extends m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ g(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, a1 a1Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof o7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    o7 o7Var = (o7) view;
                    n nVar = this.b;
                    nVar.f.getClass();
                    int R = RecyclerView.R(o7Var);
                    int i7 = nVar.h.J;
                    o7Var.a0 = R < i7;
                    int i10 = R % i7;
                    o7Var.V = i10 == 0;
                    o7Var.W = i10 == i7 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof o7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    o7 o7Var2 = (o7) view;
                    n nVar2 = this.b;
                    nVar2.r.getClass();
                    int R2 = RecyclerView.R(o7Var2);
                    int i11 = nVar2.s.J;
                    o7Var2.a0 = R2 < i11;
                    int i12 = R2 % i11;
                    o7Var2.V = i12 == 0;
                    o7Var2.W = i12 == i11 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
