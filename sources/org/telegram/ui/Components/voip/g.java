package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends Drawable {
    public float a;
    public final SvgHelper.SvgDrawable b;
    public final /* synthetic */ h c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.c = hVar;
        this.b = svgDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        h hVar = this.c;
        int i9 = hVar.e;
        Matrix matrix = hVar.i;
        hVar.f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.a);
            int i10 = hVar.f;
            float f10 = (((i9 * 2) + i10) * hVar.g) - i9;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i9 / 2.0f, 0.0f);
            matrix.setTranslate((f10 - svgDrawable.getBounds().left) - (i9 / scale), 0.0f);
            hVar.b.setLocalMatrix(matrix);
            int i11 = ((int) (i10 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i11, getBounds().centerY() - i11, getBounds().centerX() + i11, getBounds().centerY() + i11);
            svgDrawable.draw(canvas);
        }
        hVar.o.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        h hVar = this.c;
        hVar.a.setAlpha(i9);
        hVar.c.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
