package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class uq extends Drawable {
    public final Paint a = new Paint(1);

    public uq(View view) {
        if (view != null) {
            view.addOnAttachStateChangeListener(new ai.u2(this, 7));
            if (view.isAttachedToWindow()) {
                view.post(new aq(this, 1));
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
