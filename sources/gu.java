// default package

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gu extends c49 {
    public final /* synthetic */ mu a;

    public gu(mu muVar) {
        this.a = muVar;
    }

    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        lu luVar = this.a.w;
        int i = 0;
        rect.bottom = 0;
        c27 c27Var = view instanceof cv ? (c27) luVar.b.get(((cv) view).O) : view instanceof xv ? (c27) luVar.b.get(((xv) view).M) : null;
        if (c27Var == null || c27Var.m == null) {
            return;
        }
        Point point = gl.q;
        float max = Math.max(point.x, point.y) * 0.5f;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= c27Var.m.length) {
                break;
            }
            i3 += (int) Math.ceil(r2[i2] * max);
            i2++;
        }
        int M = (gl.M(11.0f) * (c27Var.d - c27Var.c)) + i3;
        int size = luVar.a.size();
        while (true) {
            if (i < size) {
                c27 c27Var2 = (c27) luVar.a.get(i);
                byte b = c27Var2.c;
                byte b2 = c27Var.c;
                if (b == b2 && ((c27Var2.a != c27Var.a || c27Var2.b != c27Var.b || b != b2 || c27Var2.d != c27Var.d) && b == b2)) {
                    M = de9.f(4.0f, (int) Math.ceil(max * c27Var2.f), M);
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
