package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d1 extends FrameLayout {
    public final Drawable a;

    public d1(Context context, e6 e6Var) {
        this(j6.H8, context, e6Var);
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

    public void setColor(int i7) {
        setBackgroundColor(i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(int i7, Context context, e6 e6Var) {
        super(context);
        int w02 = j6.w0(i7, e6Var);
        int w03 = j6.w0(j6.b7, e6Var);
        this.a = j6.X0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
