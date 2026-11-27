// default package

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k89 extends FrameLayout {
    public View a;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.a;
        if (view == null) {
            ViewParent parent = getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    view = null;
                    break;
                } else {
                    if (parent instanceof RecyclerView) {
                        view = (RecyclerView) parent;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        }
        int max = view != null ? Math.max(0, (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom()) : 0;
        if (max > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    public void setViewportView(View view) {
        if (this.a == view) {
            return;
        }
        this.a = view;
        requestLayout();
    }
}
