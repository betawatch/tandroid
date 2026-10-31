package kh;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class c extends Drawable {
    public final y a;
    public int b;
    public int c = zs.e4;

    public c(p6 p6Var) {
        int w02 = t6.w0(t6.i6, p6Var);
        this.b = w02;
        this.a = t6.a0(w02, 0, 0);
    }

    public abstract void a(int i10);

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.c != i10) {
            this.c = i10;
            a(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
