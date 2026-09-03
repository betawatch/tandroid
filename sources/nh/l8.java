package nh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class l8 extends FrameLayout {
    public final TL_stories.MediaArea a;
    public final dg.l1 b;

    public l8(Context context, dg.l1 l1Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.a = mediaArea;
        this.b = l1Var;
        addView(l1Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        dg.l1 l1Var = this.b;
        l1Var.measure(i10, i11);
        int measuredWidth = (l1Var.getMeasuredWidth() - l1Var.getPaddingLeft()) - l1Var.getPaddingRight();
        int measuredHeight = (l1Var.getMeasuredHeight() - l1Var.getPaddingTop()) - l1Var.getPaddingBottom();
        float f10 = measuredWidth;
        float f11 = f10 / 2.0f;
        l1Var.setPivotX(l1Var.getPaddingLeft() + f11);
        float f12 = measuredHeight;
        float f13 = f12 / 2.0f;
        l1Var.setPivotY(l1Var.getPaddingTop() + f13);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f14 = size;
        float f15 = size2;
        float min = Math.min(f14 / f10, f15 / f12);
        l1Var.setTranslationX((f14 / 2.0f) - (f11 + l1Var.getPaddingLeft()));
        l1Var.setTranslationY((f15 / 2.0f) - (f13 + l1Var.getPaddingTop()));
        l1Var.setScaleX(min);
        l1Var.setScaleY(min);
    }
}
