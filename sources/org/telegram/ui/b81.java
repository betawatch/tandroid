package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b81 extends FrameLayout {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b81(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 5:
                org.telegram.ui.ActionBar.f6.i3.setBounds(0, 0, getMeasuredWidth(), org.telegram.ui.ActionBar.f6.i3.getIntrinsicHeight());
                org.telegram.ui.ActionBar.f6.i3.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 10:
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        switch (this.a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, org.telegram.ui.ActionBar.f6.k0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                int childCount = getChildCount();
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (getChildAt(i15).getMeasuredWidth() + i13 > getMeasuredWidth()) {
                        i14 += getChildAt(i15).getMeasuredHeight();
                        i13 = 0;
                    }
                    getChildAt(i15).layout(i13, i14, getChildAt(i15).getMeasuredWidth() + i13, getChildAt(i15).getMeasuredHeight() + i14);
                    i13 += getChildAt(i15).getMeasuredWidth();
                }
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i9, i10);
                break;
            case 1:
                int size = View.MeasureSpec.getSize(i9);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
                int childCount = getChildCount();
                int measuredHeight = childCount > 0 ? getChildAt(0).getMeasuredHeight() : 0;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (getChildAt(i13).getMeasuredWidth() + i11 > size) {
                        i12 += getChildAt(i13).getMeasuredHeight();
                        i11 = 0;
                    }
                    i11 += getChildAt(i13).getMeasuredWidth();
                }
                setMeasuredDimension(getMeasuredWidth(), getChildCount() != 0 ? AndroidUtilities.dp(16.0f) + measuredHeight + i12 : 0);
                break;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
                break;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
                break;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onMeasure(i9, i10);
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), TLObject.FLAG_30));
                break;
            case 8:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(60.0f)), View.MeasureSpec.getMode(i10)));
                break;
            case 11:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
                break;
        }
    }
}
