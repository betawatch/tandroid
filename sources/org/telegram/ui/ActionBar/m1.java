package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m1 extends FrameLayout {
    public final Drawable a;

    public m1(Context context, g6 g6Var) {
        this(context, k6.H8, g6Var);
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
    public m1(Context context, int i10, g6 g6Var) {
        super(context);
        int v02 = k6.v0(i10, g6Var);
        int v03 = k6.v0(k6.b7, g6Var);
        this.a = k6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
