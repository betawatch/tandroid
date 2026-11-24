// default package

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gv extends e69 {
    public final /* synthetic */ mv a;

    public gv(mv mvVar) {
        this.a = mvVar;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        lv lvVar = this.a.w;
        int i = 0;
        rect.bottom = 0;
        c47 c47Var = view instanceof cw ? (c47) lvVar.b.get(((cw) view).O) : view instanceof xw ? (c47) lvVar.b.get(((xw) view).M) : null;
        if (c47Var == null || c47Var.m == null) {
            return;
        }
        Point point = gm.q;
        float max = Math.max(point.x, point.y) * 0.5f;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= c47Var.m.length) {
                break;
            }
            i3 += (int) Math.ceil(r2[i2] * max);
            i2++;
        }
        int M = (gm.M(11.0f) * (c47Var.d - c47Var.c)) + i3;
        int size = lvVar.a.size();
        while (true) {
            if (i < size) {
                c47 c47Var2 = (c47) lvVar.a.get(i);
                byte b = c47Var2.c;
                byte b2 = c47Var.c;
                if (b == b2 && ((c47Var2.a != c47Var.a || c47Var2.b != c47Var.b || b != b2 || c47Var2.d != c47Var.d) && b == b2)) {
                    M = hg9.f(4.0f, (int) Math.ceil(max * c47Var2.f), M);
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
