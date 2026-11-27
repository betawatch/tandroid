// default package

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class e4c extends ScrollView {
    public Drawable a;
    public mm b;
    public boolean c;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e = this.b.e(false, canScrollVertically(-1) ? 1.0f : 0.0f) * 0.5f;
        if (e > 0.0f) {
            Drawable drawable = this.a;
            if (drawable == null) {
                drawable = getContext().getResources().getDrawable(R.drawable.header_shadow);
                this.a = drawable;
            }
            drawable.setBounds(0, getScrollY(), getWidth(), this.a.getIntrinsicHeight() + getScrollY());
            this.a.setAlpha((int) (e * 255.0f));
            this.a.draw(canvas);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        super.onNestedScroll(view, i, i2, i3, i4);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.c != canScrollVertically) {
            invalidate();
            this.c = canScrollVertically;
        }
    }
}
