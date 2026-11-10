package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fr extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public int d;
    public int e;
    public final ArrayList c = new ArrayList();
    public boolean f = false;
    public final org.telegram.ui.Components.v5 g = new org.telegram.ui.Components.v5(new dh(this, 14), 420, org.telegram.ui.Components.wq.h);
    public int h = org.telegram.messenger.qs.e4;

    public fr(Drawable drawable, Drawable drawable2) {
        this.a = drawable;
        this.b = drawable2;
    }

    public final void a(int i7, int i10) {
        this.d = i7;
        this.e = i10;
    }

    public final void b(boolean z9) {
        if (this.f == z9) {
            return;
        }
        this.f = z9;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).invalidate();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float d = this.g.d(this.f);
        int i7 = this.h;
        Drawable drawable = this.a;
        drawable.setAlpha(i7);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (d > 0.0f) {
            Drawable drawable2 = this.b;
            drawable2.setAlpha((int) (this.h * d));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.e);
            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, d);
            canvas.save();
            canvas.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.h = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }
}
