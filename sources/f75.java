// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
