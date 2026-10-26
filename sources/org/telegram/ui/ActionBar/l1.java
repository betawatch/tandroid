package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final Drawable a;

    public l1(Context context, u6 u6Var) {
        this(context, y6.H8, u6Var);
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
    public l1(Context context, int i10, u6 u6Var) {
        super(context);
        int w02 = y6.w0(i10, u6Var);
        int w03 = y6.w0(y6.b7, u6Var);
        this.a = y6.W0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
