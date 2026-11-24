// default package

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lj3 extends ScrollView {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj3(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i2), Math.min(gm.q.y * 0.35f, gm.L(400.0f))), View.MeasureSpec.getMode(i2)));
                break;
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), gm.L(320.0f)), TLObject.FLAG_31));
                break;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), gm.L(360.0f)), TLObject.FLAG_31));
                break;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(260.0f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
            case 4:
            default:
                super.onMeasure(i, i2);
                break;
            case 5:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(260.0f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        switch (this.a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        switch (this.a) {
            case 4:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = gm.L(20.0f) + rect.top;
                rect.bottom = gm.L(50.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }
}
