package kh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.l1;
import f2.w0;
import org.telegram.ui.Cells.o7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class k extends w0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ k(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, l1 l1Var) {
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
                    r rVar = this.b;
                    rVar.f.getClass();
                    int R = RecyclerView.R(o7Var);
                    int i10 = rVar.h.J;
                    o7Var.T = R < i10;
                    int i11 = R % i10;
                    o7Var.R = i11 == 0;
                    o7Var.S = i11 == i10 - 1;
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
                    r rVar2 = this.b;
                    rVar2.r.getClass();
                    int R2 = RecyclerView.R(o7Var2);
                    int i12 = rVar2.s.J;
                    o7Var2.T = R2 < i12;
                    int i13 = R2 % i12;
                    o7Var2.R = i13 == 0;
                    o7Var2.S = i13 == i12 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
