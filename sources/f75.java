// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class f75 extends p79 {
    @Override // p79
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        RecyclerView.S(view);
        if (j95.u5) {
            rect.set(0, hl.L(4.0f), 0, hl.L(4.0f));
        } else {
            rect.set(hl.L(4.0f), 0, hl.L(4.0f), 0);
        }
    }
}
