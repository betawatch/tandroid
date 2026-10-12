package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class j1 extends FrameLayout {
    public final Drawable a;

    public j1(Context context, c6 c6Var) {
        this(context, g6.H8, c6Var);
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
    public j1(Context context, int i10, c6 c6Var) {
        super(context);
        int w02 = g6.w0(i10, c6Var);
        int w03 = g6.w0(g6.b7, c6Var);
        this.a = g6.V0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
