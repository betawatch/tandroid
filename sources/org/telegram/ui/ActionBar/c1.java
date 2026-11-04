package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c1 extends FrameLayout {
    public final Drawable a;

    public c1(Context context, e6 e6Var) {
        this(k6.H8, context, e6Var);
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

    public void setColor(int i3) {
        setBackgroundColor(i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(int i3, Context context, e6 e6Var) {
        super(context);
        int w02 = k6.w0(i3, e6Var);
        int w03 = k6.w0(k6.b7, e6Var);
        this.a = k6.X0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
