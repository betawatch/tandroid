package gi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.p7;
import v4.c1;
import v4.o0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class f extends o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ f(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, c1 c1Var) {
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
                    m mVar = this.b;
                    mVar.f.getClass();
                    int R = RecyclerView.R(p7Var);
                    int i7 = mVar.h.J;
                    p7Var.b0 = R < i7;
                    int i10 = R % i7;
                    p7Var.W = i10 == 0;
                    p7Var.a0 = i10 == i7 - 1;
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
                    m mVar2 = this.b;
                    mVar2.r.getClass();
                    int R2 = RecyclerView.R(p7Var2);
                    int i11 = mVar2.s.J;
                    p7Var2.b0 = R2 < i11;
                    int i12 = R2 % i11;
                    p7Var2.W = i12 == 0;
                    p7Var2.a0 = i12 == i11 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
