package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d1 extends FrameLayout {
    public final Drawable a;

    public d1(Context context, i6 i6Var) {
        this(n6.H8, context, i6Var);
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
    public d1(int i7, Context context, i6 i6Var) {
        super(context);
        int w02 = n6.w0(i7, i6Var);
        int w03 = n6.w0(n6.b7, i6Var);
        this.a = n6.X0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
