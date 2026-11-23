package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class o5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.c6 b;
    public final rp c;

    public o5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.c6(this, 320L, kr.h);
        this.c = new rp(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(this.a);
        if (d < 1.0f) {
            if (d <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
            }
            canvas2.translate(0.0f, org.telegram.messenger.g0.L(6.0f) * d);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int L = width - ((int) ((1.0f - d) * org.telegram.messenger.g0.L(6.0f)));
            rp rpVar = this.c;
            rpVar.setAlpha((int) (d * 255.0f));
            rpVar.setBounds(L - (rpVar.getIntrinsicWidth() / 2), height - (rpVar.getIntrinsicWidth() / 2), (rpVar.getIntrinsicWidth() / 2) + L, (rpVar.getIntrinsicHeight() / 2) + height);
            rpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.c.b(i7);
    }
}
