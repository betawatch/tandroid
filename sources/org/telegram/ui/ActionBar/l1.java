package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final Drawable a;

    public l1(Context context, c6 c6Var) {
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
    public l1(Context context, int i10, c6 c6Var) {
        super(context);
        int v02 = g6.v0(i10, c6Var);
        int v03 = g6.v0(g6.b7, c6Var);
        this.a = g6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
