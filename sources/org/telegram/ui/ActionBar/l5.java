package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class l5 extends TextView {
    public boolean a;
    public final org.telegram.ui.Components.z5 b;
    public final qp c;

    public l5(Context context) {
        super(context);
        this.a = false;
        this.b = new org.telegram.ui.Components.z5(this, 320L, mr.h);
        this.c = new qp(-1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.b.e(this.a);
        if (e < 1.0f) {
            if (e <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - e) * 255.0f), 31);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) * e);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (e > 0.0f) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int dp = width - ((int) ((1.0f - e) * AndroidUtilities.dp(6.0f)));
            qp qpVar = this.c;
            qpVar.setAlpha((int) (e * 255.0f));
            qpVar.setBounds(dp - (qpVar.getIntrinsicWidth() / 2), height - (qpVar.getIntrinsicWidth() / 2), (qpVar.getIntrinsicWidth() / 2) + dp, (qpVar.getIntrinsicHeight() / 2) + height);
            qpVar.draw(canvas2);
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.c.b(i10);
    }
}
