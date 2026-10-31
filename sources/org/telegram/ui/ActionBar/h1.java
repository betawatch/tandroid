package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h1 extends FrameLayout {
    public final Drawable a;

    public h1(Context context, p6 p6Var) {
        this(t6.H8, context, p6Var);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i10, Context context, p6 p6Var) {
        super(context);
        int w02 = t6.w0(i10, p6Var);
        int w03 = t6.w0(t6.b7, p6Var);
        this.a = t6.X0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
