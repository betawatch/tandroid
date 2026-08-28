package fh;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v3 extends ScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
                break;
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i10), Math.min(AndroidUtilities.displaySize.y * 0.35f, AndroidUtilities.dp(400.0f))), View.MeasureSpec.getMode(i10)));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        switch (this.a) {
            case 2:
                return false;
            default:
                return super.onRequestFocusInDescendants(i9, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.a) {
            case 2:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = AndroidUtilities.dp(20.0f) + rect.top;
                rect.bottom = AndroidUtilities.dp(50.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }
}
