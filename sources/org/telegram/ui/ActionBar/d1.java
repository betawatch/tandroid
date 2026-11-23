package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d1 extends FrameLayout {
    public final Drawable a;

    public d1(Context context, h6 h6Var) {
        this(m6.H8, context, h6Var);
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
    public d1(int i7, Context context, h6 h6Var) {
        super(context);
        int w02 = m6.w0(i7, h6Var);
        int w03 = m6.w0(m6.b7, h6Var);
        this.a = m6.X0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
