package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bk0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d2 extends Drawable implements p6 {
    public final View a;
    public final GradientDrawable b;
    public final int c;
    public final int d;
    public final u6 e;

    public d2(bk0 bk0Var, int i10, int i11, int i12, u6 u6Var) {
        this.a = bk0Var;
        this.c = i11;
        this.d = i12;
        this.e = u6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = this.a.getWidth();
        int i10 = this.c;
        int i11 = (int) ((width - i10) / 2.0f);
        int height = (int) ((r0.getHeight() - i10) / 2.0f);
        int width2 = (int) ((r0.getWidth() + i10) / 2.0f);
        int height2 = (int) ((r0.getHeight() + i10) / 2.0f);
        GradientDrawable gradientDrawable = this.b;
        gradientDrawable.setBounds(i11, height, width2, height2);
        gradientDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = this.d;
        if (i10 >= 0) {
            this.b.setColor(y6.w0(i10, this.e));
            invalidateSelf();
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
