package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class i8 extends FrameLayout {
    public final TL_stories.MediaArea a;
    public final tg.r0 b;

    public i8(Context context, tg.r0 r0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.a = mediaArea;
        this.b = r0Var;
        addView(r0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        tg.r0 r0Var = this.b;
        r0Var.measure(i7, i10);
        int measuredWidth = (r0Var.getMeasuredWidth() - r0Var.getPaddingLeft()) - r0Var.getPaddingRight();
        int measuredHeight = (r0Var.getMeasuredHeight() - r0Var.getPaddingTop()) - r0Var.getPaddingBottom();
        float f10 = measuredWidth;
        float f11 = f10 / 2.0f;
        r0Var.setPivotX(r0Var.getPaddingLeft() + f11);
        float f12 = measuredHeight;
        float f13 = f12 / 2.0f;
        r0Var.setPivotY(r0Var.getPaddingTop() + f13);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        float f14 = size;
        float f15 = size2;
        float min = Math.min(f14 / f10, f15 / f12);
        r0Var.setTranslationX((f14 / 2.0f) - (f11 + r0Var.getPaddingLeft()));
        r0Var.setTranslationY((f15 / 2.0f) - (f13 + r0Var.getPaddingTop()));
        r0Var.setScaleX(min);
        r0Var.setScaleY(min);
    }
}
