// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o65 extends p79 {
    public final /* synthetic */ j95 a;

    public o65(j95 j95Var) {
        this.a = j95Var;
    }

    @Override // p79
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        int S = RecyclerView.S(view);
        if (S >= 0) {
            rect.setEmpty();
            e95 e95Var = this.a.I1;
            int i = e95Var.H;
            if (S < i || S >= e95Var.I) {
                return;
            }
            int i2 = S - i;
            int i3 = j95.u5 ? 6 : 2;
            int i4 = i2 % i3;
            if (i4 == 0) {
                rect.right = hl.L(2.0f);
            } else if (i4 == i3 - 1) {
                rect.left = hl.L(2.0f);
            } else {
                rect.left = hl.L(1.0f);
            }
        }
    }
}
