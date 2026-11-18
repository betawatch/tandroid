package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o31 extends ScrollView {
    public Drawable a;
    public c6 b;
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
