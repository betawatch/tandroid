package hh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class h {
    public final RecyclerView a;

    public void a(int i10) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
