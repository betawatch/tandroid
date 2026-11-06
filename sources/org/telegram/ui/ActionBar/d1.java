package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d1 extends FrameLayout {
    public final Drawable a;

    public d1(Context context, f6 f6Var) {
        this(k6.H8, context, f6Var);
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
    public d1(int i7, Context context, f6 f6Var) {
        super(context);
        int w02 = k6.w0(i7, f6Var);
        int w03 = k6.w0(k6.b7, f6Var);
        this.a = k6.X0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
