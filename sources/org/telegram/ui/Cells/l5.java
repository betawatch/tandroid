package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l5 extends FrameLayout {
    public final /* synthetic */ q5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(q5 q5Var, Context context) {
        super(context);
        this.a = q5Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        q5 q5Var = this.a;
        m5 m5Var = q5Var.a;
        if (q5Var.I == null || view != m5Var) {
            return super.drawChild(canvas, view, j10);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (q5Var.J) {
            Rect rect = q5.T;
            MediaController.PhotoEntry photoEntry = q5Var.C;
            if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                q5Var.I.c(canvas, q5Var.b, m5Var.getMeasuredWidth(), m5Var.getMeasuredHeight(), 1.0f, false);
                MediaController.PhotoEntry photoEntry2 = q5Var.C;
                if (photoEntry2 != null && photoEntry2.starsAmount > 0 && m5Var.y != null) {
                    Path path = m5Var.A;
                    if (path == null) {
                        m5Var.A = new Path();
                    } else {
                        path.rewind();
                    }
                    int i11 = m5Var.c;
                    if (i11 == -1 || (i10 = m5Var.d) == -1) {
                        measuredWidth = m5Var.getMeasuredWidth();
                        measuredHeight = m5Var.getMeasuredHeight();
                    } else {
                        measuredWidth = i11;
                        measuredHeight = i10;
                    }
                    float dp = m5Var.y.c + AndroidUtilities.dp(18.0f);
                    float dp2 = AndroidUtilities.dp(28.0f);
                    float f10 = (measuredWidth - dp) / 2.0f;
                    float f11 = measuredHeight / 2.0f;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = dp2 / 2.0f;
                    rectF.set(f10, f11 - f12, dp + f10, f11 + f12);
                    m5Var.A.addRoundRect(rectF, f12, f12, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(m5Var.A);
                    ImageReceiver imageReceiver = m5Var.b;
                    if (imageReceiver != null && m5Var.s) {
                        imageReceiver.setColorFilter(m5Var.B);
                        float alpha = m5Var.b.getAlpha();
                        m5Var.b.setAlpha(1.0f);
                        m5Var.b.draw(canvas);
                        m5Var.b.setAlpha(alpha);
                        m5Var.b.setColorFilter(null);
                    }
                    m5Var.y.c(f10 + AndroidUtilities.dp(9.0f), f11, 1.0f, -1, canvas);
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }
}
