package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class k1 extends FrameLayout {
    public final Drawable a;

    public k1(Context context, d6 d6Var) {
        this(context, i6.H8, d6Var);
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
    public k1(Context context, int i10, d6 d6Var) {
        super(context);
        int v02 = i6.v0(i10, d6Var);
        int v03 = i6.v0(i6.b7, d6Var);
        this.a = i6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
