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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o5 extends FrameLayout {
    public final /* synthetic */ t5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(t5 t5Var, Context context) {
        super(context);
        this.a = t5Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i9;
        t5 t5Var = this.a;
        p5 p5Var = t5Var.a;
        if (t5Var.I == null || view != p5Var) {
            return super.drawChild(canvas, view, j10);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (t5Var.J) {
            Rect rect = t5.T;
            MediaController.PhotoEntry photoEntry = t5Var.C;
            if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                t5Var.I.c(canvas, t5Var.b, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), 1.0f, false);
                MediaController.PhotoEntry photoEntry2 = t5Var.C;
                if (photoEntry2 != null && photoEntry2.starsAmount > 0 && p5Var.y != null) {
                    Path path = p5Var.A;
                    if (path == null) {
                        p5Var.A = new Path();
                    } else {
                        path.rewind();
                    }
                    int i10 = p5Var.c;
                    if (i10 == -1 || (i9 = p5Var.d) == -1) {
                        measuredWidth = p5Var.getMeasuredWidth();
                        measuredHeight = p5Var.getMeasuredHeight();
                    } else {
                        measuredWidth = i10;
                        measuredHeight = i9;
                    }
                    float dp = p5Var.y.c + AndroidUtilities.dp(18.0f);
                    float dp2 = AndroidUtilities.dp(28.0f);
                    float f10 = (measuredWidth - dp) / 2.0f;
                    float f11 = measuredHeight / 2.0f;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = dp2 / 2.0f;
                    rectF.set(f10, f11 - f12, dp + f10, f11 + f12);
                    p5Var.A.addRoundRect(rectF, f12, f12, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(p5Var.A);
                    ImageReceiver imageReceiver = p5Var.b;
                    if (imageReceiver != null && p5Var.s) {
                        imageReceiver.setColorFilter(p5Var.B);
                        float alpha = p5Var.b.getAlpha();
                        p5Var.b.setAlpha(1.0f);
                        p5Var.b.draw(canvas);
                        p5Var.b.setAlpha(alpha);
                        p5Var.b.setColorFilter(null);
                    }
                    p5Var.y.c(f10 + AndroidUtilities.dp(9.0f), f11, 1.0f, -1, canvas);
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }
}
