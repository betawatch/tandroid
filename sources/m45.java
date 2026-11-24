// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m45 extends c49 {
    public final /* synthetic */ h75 a;

    public m45(h75 h75Var) {
        this.a = h75Var;
    }

    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            c75 c75Var = this.a.I1;
            int i = c75Var.H;
            if (R < i || R >= c75Var.I) {
                return;
            }
            int i2 = R - i;
            int i3 = h75.u5 ? 6 : 2;
            int i4 = i2 % i3;
            if (i4 == 0) {
                rect.right = gl.L(2.0f);
            } else if (i4 == i3 - 1) {
                rect.left = gl.L(2.0f);
            } else {
                rect.left = gl.L(1.0f);
            }
        }
    }
}
