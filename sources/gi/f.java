package gi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.n7;
import v4.b1;
import v4.n0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f extends n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ f(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // v4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, b1 b1Var) {
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
                    int i7 = mVar.h.J;
                    n7Var.b0 = R < i7;
                    int i10 = R % i7;
                    n7Var.W = i10 == 0;
                    n7Var.a0 = i10 == i7 - 1;
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
