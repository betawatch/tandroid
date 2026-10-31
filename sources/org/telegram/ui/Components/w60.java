package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w60 extends ScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w60(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(260.0f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) Math.min(View.MeasureSpec.getSize(i11), Math.min(org.telegram.messenger.i0.q.y * 0.35f, org.telegram.messenger.i0.L(400.0f))), View.MeasureSpec.getMode(i11)));
                break;
            case 2:
            default:
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(320.0f)), TLObject.FLAG_31));
                break;
            case 4:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(360.0f)), TLObject.FLAG_31));
                break;
            case 5:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(260.0f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
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
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.a) {
            case 2:
                rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                rect.top = org.telegram.messenger.i0.L(20.0f) + rect.top;
                rect.bottom = org.telegram.messenger.i0.L(50.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }
}
