package oh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class l8 extends FrameLayout {
    public final TL_stories.MediaArea a;
    public final eg.j1 b;

    public l8(Context context, eg.j1 j1Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.a = mediaArea;
        this.b = j1Var;
        addView(j1Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        eg.j1 j1Var = this.b;
        j1Var.measure(i10, i11);
        int measuredWidth = (j1Var.getMeasuredWidth() - j1Var.getPaddingLeft()) - j1Var.getPaddingRight();
        int measuredHeight = (j1Var.getMeasuredHeight() - j1Var.getPaddingTop()) - j1Var.getPaddingBottom();
        float f10 = measuredWidth;
        float f11 = f10 / 2.0f;
        j1Var.setPivotX(j1Var.getPaddingLeft() + f11);
        float f12 = measuredHeight;
        float f13 = f12 / 2.0f;
        j1Var.setPivotY(j1Var.getPaddingTop() + f13);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f14 = size;
        float f15 = size2;
        float min = Math.min(f14 / f10, f15 / f12);
        j1Var.setTranslationX((f14 / 2.0f) - (f11 + j1Var.getPaddingLeft()));
        j1Var.setTranslationY((f15 / 2.0f) - (f13 + j1Var.getPaddingTop()));
        j1Var.setScaleX(min);
        j1Var.setScaleY(min);
    }
}
