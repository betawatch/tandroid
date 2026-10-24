package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j1 extends FrameLayout {
    public final Drawable a;

    public j1(Context context, g6 g6Var) {
        this(context, k6.H8, g6Var);
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
    public j1(Context context, int i10, g6 g6Var) {
        super(context);
        int w02 = k6.w0(i10, g6Var);
        int w03 = k6.w0(k6.b7, g6Var);
        this.a = k6.W0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
