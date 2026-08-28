package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cg1 extends ViewGroup {
    public final Paint a;
    public View b;
    public boolean c;

    public cg1(Context context) {
        super(context);
        this.a = new Paint(1);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(0.1f, 0.75f, getPaddingBottom());
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
        int h = i0.a.h(org.telegram.ui.ActionBar.f6.l1(navigationBarThirdButtonsFactor, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false)), w02);
        Paint paint = this.a;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - r0, paint);
        paint.setColor(h);
        canvas.drawRect(0.0f, getMeasuredHeight() - r0, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        View view = this.b;
        boolean z10 = view != null && view.getVisibility() == 0;
        int size = View.MeasureSpec.getSize(i9);
        int paddingBottom = z10 ? getPaddingBottom() + AndroidUtilities.dp(44.0f) : 0;
        setMeasuredDimension(size, paddingBottom);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.c != z10) {
            this.c = z10;
            WeakHashMap weakHashMap = r0.j0.a;
            r0.z.c(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.b = view;
    }

    @Override // android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
        super.setPadding(i9, i10, i11, i12);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).setPadding(i9, i10, i11, i12);
        }
    }
}
