package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a10 extends View implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.r6 a;
    public eh.d b;
    public String c;

    public a10(Activity activity) {
        super(activity);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, false, false);
        this.a = r6Var;
        r6Var.u(-1);
        r6Var.b = 17;
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.r6 r6Var = this.a;
        int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + r6Var.c());
        int width = (getWidth() - dpf2) / 2;
        int i10 = dpf2 + width;
        eh.d dVar = this.b;
        if (dVar != null) {
            dVar.setBounds(width, 0, i10, getHeight());
            this.b.draw(canvas);
        }
        r6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.a.setBounds(0, 0, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        eh.d dVar = this.b;
        if (dVar != null) {
            dVar.updateColors();
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
