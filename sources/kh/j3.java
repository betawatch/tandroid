package kh;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j3 extends ScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i11), Math.min(AndroidUtilities.displaySize.y * 0.35f, AndroidUtilities.dp(400.0f))), View.MeasureSpec.getMode(i11)));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        switch (this.a) {
            case 2:
                return false;
            default:
                return super.onRequestFocusInDescendants(i10, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        switch (this.a) {
            case 2:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = AndroidUtilities.dp(20.0f) + rect.top;
                rect.bottom = AndroidUtilities.dp(50.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }
}
