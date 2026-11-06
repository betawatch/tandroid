package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class t21 extends ScrollView {
    public Drawable a;
    public w5 b;
    public boolean c;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float e10 = this.b.e(false, canScrollVertically(-1) ? 1.0f : 0.0f) * 0.5f;
        if (e10 > 0.0f) {
            if (this.a == null) {
                this.a = getContext().getResources().getDrawable(R.drawable.header_shadow);
            }
            this.a.setBounds(0, getScrollY(), getWidth(), this.a.getIntrinsicHeight() + getScrollY());
            this.a.setAlpha((int) (e10 * 255.0f));
            this.a.draw(canvas);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        super.onNestedScroll(view, i7, i10, i11, i12);
        boolean canScrollVertically = canScrollVertically(-1);
        if (this.c != canScrollVertically) {
            invalidate();
            this.c = canScrollVertically;
        }
    }
}
