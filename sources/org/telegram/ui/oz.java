package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oz extends View implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.g6 a;
    public gh.g b;
    public String c;

    public oz(Activity activity) {
        super(activity);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, false, false);
        this.a = g6Var;
        g6Var.u(-1);
        g6Var.b = 17;
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.g6 g6Var = this.a;
        int N = (int) (org.telegram.messenger.g0.N(30.0f) + g6Var.c());
        int width = (getWidth() - N) / 2;
        int i3 = N + width;
        gh.g gVar = this.b;
        if (gVar != null) {
            gVar.setBounds(width, 0, i3, getHeight());
            this.b.draw(canvas);
        }
        g6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        this.a.setBounds(0, 0, i3, i10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        gh.g gVar = this.b;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
