package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class j1 extends FrameLayout {
    public final Drawable a;

    public j1(Context context, d6 d6Var) {
        this(context, h6.H8, d6Var);
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
    public j1(Context context, int i10, d6 d6Var) {
        super(context);
        int v02 = h6.v0(i10, d6Var);
        int v03 = h6.v0(h6.b7, d6Var);
        this.a = h6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
