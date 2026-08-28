package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final Drawable a;

    public l1(Context context, b6 b6Var) {
        this(context, f6.H8, b6Var);
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

    public void setColor(int i9) {
        setBackgroundColor(i9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Context context, int i9, b6 b6Var) {
        super(context);
        int v02 = f6.v0(i9, b6Var);
        int v03 = f6.v0(f6.b7, b6Var);
        this.a = f6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
