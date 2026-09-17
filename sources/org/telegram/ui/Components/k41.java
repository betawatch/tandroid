package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class k41 extends ScrollView {
    public Drawable a;
    public e6 b;
    public boolean c;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.b.d(canScrollVertically(-1) ? 1.0f : 0.0f, false) * 0.5f;
        if (d > 0.0f) {
            if (this.a == null) {
                this.a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.a.setBounds(0, getScrollY(), getWidth(), this.a.getIntrinsicHeight() + getScrollY());
            this.a.setAlpha((int) (d * 255.0f));
            this.a.draw(canvas);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        super.onNestedScroll(view, i10, i11, i12, i13);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.c != canScrollVertically) {
            invalidate();
            this.c = canScrollVertically;
        }
    }
}
