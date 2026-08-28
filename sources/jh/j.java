package jh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.n1;
import f2.y0;
import org.telegram.ui.Cells.r7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j extends y0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ j(q qVar, int i9) {
        this.a = i9;
        this.b = qVar;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, n1 n1Var) {
        switch (this.a) {
            case 0:
                if (!(view instanceof r7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    r7 r7Var = (r7) view;
                    q qVar = this.b;
                    qVar.f.getClass();
                    int R = RecyclerView.R(r7Var);
                    int i9 = qVar.h.J;
                    r7Var.T = R < i9;
                    int i10 = R % i9;
                    r7Var.R = i10 == 0;
                    r7Var.S = i10 == i9 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof r7)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    r7 r7Var2 = (r7) view;
                    q qVar2 = this.b;
                    qVar2.r.getClass();
                    int R2 = RecyclerView.R(r7Var2);
                    int i11 = qVar2.s.J;
                    r7Var2.T = R2 < i11;
                    int i12 = R2 % i11;
                    r7Var2.R = i12 == 0;
                    r7Var2.S = i12 == i11 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
