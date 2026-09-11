package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class dd0 extends TextView {
    public final /* synthetic */ ed0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(ed0 ed0Var, Context context, int i10) {
        super(context);
        this.a = ed0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ed0 ed0Var = this.a;
        if (ed0Var.e.getAdapter() instanceof cd0) {
            ((cd0) ed0Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        super.setSelected(z10);
        Drawable background = getBackground();
        ed0 ed0Var = this.a;
        if (background != null) {
            org.telegram.ui.ActionBar.j6.B1(background, ed0Var.c(z10 ? 0.1f : 0.05f), true);
        }
        setTextColor(ed0Var.c(z10 ? 0.8f : 0.6f));
    }
}
