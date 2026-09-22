package ai;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class lb extends FrameLayout {
    public final TL_stories.MediaArea a;
    public final qg.v0 b;

    public lb(Context context, qg.v0 v0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.a = mediaArea;
        this.b = v0Var;
        addView(v0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        qg.v0 v0Var = this.b;
        v0Var.measure(i10, i11);
        int measuredWidth = (v0Var.getMeasuredWidth() - v0Var.getPaddingLeft()) - v0Var.getPaddingRight();
        int measuredHeight = (v0Var.getMeasuredHeight() - v0Var.getPaddingTop()) - v0Var.getPaddingBottom();
        float f7 = measuredWidth;
        float f10 = f7 / 2.0f;
        v0Var.setPivotX(v0Var.getPaddingLeft() + f10);
        float f11 = measuredHeight;
        float f12 = f11 / 2.0f;
        v0Var.setPivotY(v0Var.getPaddingTop() + f12);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f13 = size;
        float f14 = size2;
        float min = Math.min(f13 / f7, f14 / f11);
        v0Var.setTranslationX((f13 / 2.0f) - (f10 + v0Var.getPaddingLeft()));
        v0Var.setTranslationY((f14 / 2.0f) - (f12 + v0Var.getPaddingTop()));
        v0Var.setScaleX(min);
        v0Var.setScaleY(min);
    }
}
