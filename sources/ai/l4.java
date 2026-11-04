package ai;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l4 extends ScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(Context context, int i3) {
        super(context);
        this.a = i3;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 1:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 2:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i10), Math.min(org.telegram.messenger.g0.q.y * 0.35f, org.telegram.messenger.g0.L(400.0f))), View.MeasureSpec.getMode(i10)));
                break;
            case 3:
            default:
                super.onMeasure(i3, i10);
                break;
            case 4:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(320.0f)), TLObject.FLAG_31));
                break;
            case 5:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(360.0f)), TLObject.FLAG_31));
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i3, Rect rect) {
        switch (this.a) {
            case 3:
                return false;
            default:
                return super.onRequestFocusInDescendants(i3, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.a) {
            case 3:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.g0.L(20.0f) + rect.top;
                rect.bottom = org.telegram.messenger.g0.L(50.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }
}
