// default package

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hu extends p79 {
    public final /* synthetic */ nu a;

    public hu(nu nuVar) {
        this.a = nuVar;
    }

    @Override // p79
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        mu muVar = this.a.w;
        int i = 0;
        rect.bottom = 0;
        j47 j47Var = view instanceof dv ? (j47) muVar.b.get(((dv) view).O) : view instanceof yv ? (j47) muVar.b.get(((yv) view).M) : null;
        if (j47Var == null || j47Var.m == null) {
            return;
        }
        Point point = hl.q;
        float max = Math.max(point.x, point.y) * 0.5f;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= j47Var.m.length) {
                break;
            }
            i3 += (int) Math.ceil(r2[i2] * max);
            i2++;
        }
        int M = (hl.M(11.0f) * (j47Var.d - j47Var.c)) + i3;
        int size = muVar.a.size();
        while (true) {
            if (i < size) {
                j47 j47Var2 = (j47) muVar.a.get(i);
                byte b = j47Var2.c;
                byte b2 = j47Var.c;
                if (b == b2 && ((j47Var2.a != j47Var.a || j47Var2.b != j47Var.b || b != b2 || j47Var2.d != j47Var.d) && b == b2)) {
                    M = uh9.f(4.0f, (int) Math.ceil(max * j47Var2.f), M);
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        rect.bottom = -M;
    }
}
