package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        int i10 = hVar.e;
        Matrix matrix = hVar.i;
        hVar.f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.a);
            int i11 = hVar.f;
            float f10 = (((i10 * 2) + i11) * hVar.g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f10 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.o.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        h hVar = this.c;
        hVar.a.setAlpha(i10);
        hVar.c.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
