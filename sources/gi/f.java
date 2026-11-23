package gi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.o7;
import v4.c1;
import v4.o0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                if (!(view instanceof o7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    o7 o7Var = (o7) view;
                    m mVar = this.b;
                    mVar.f.getClass();
                    int R = RecyclerView.R(o7Var);
                    int i7 = mVar.h.J;
                    o7Var.b0 = R < i7;
                    int i10 = R % i7;
                    o7Var.W = i10 == 0;
                    o7Var.a0 = i10 == i7 - 1;
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
                    m mVar2 = this.b;
                    mVar2.r.getClass();
                    int R2 = RecyclerView.R(o7Var2);
                    int i11 = mVar2.s.J;
                    o7Var2.b0 = R2 < i11;
                    int i12 = R2 % i11;
                    o7Var2.W = i12 == 0;
                    o7Var2.a0 = i12 == i11 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
