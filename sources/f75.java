// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
