package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class k1 extends FrameLayout {
    public final Drawable a;

    public k1(Context context, f6 f6Var) {
        this(context, j6.H8, f6Var);
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
    public k1(Context context, int i10, f6 f6Var) {
        super(context);
        int v02 = j6.v0(i10, f6Var);
        int v03 = j6.v0(j6.b7, f6Var);
        this.a = j6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
