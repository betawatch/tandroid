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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s5 extends FrameLayout {
    public final /* synthetic */ x5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(x5 x5Var, Context context) {
        super(context);
        this.a = x5Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        x5 x5Var = this.a;
        t5 t5Var = x5Var.a;
        if (x5Var.M == null || view != t5Var) {
            return super.drawChild(canvas, view, j10);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (x5Var.N) {
            Rect rect = x5.a0;
            MediaController.PhotoEntry photoEntry = x5Var.G;
            if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                x5Var.M.c(canvas, x5Var.b, t5Var.getMeasuredWidth(), t5Var.getMeasuredHeight(), 1.0f, false);
                MediaController.PhotoEntry photoEntry2 = x5Var.G;
                if (photoEntry2 != null && photoEntry2.starsAmount > 0 && t5Var.y != null) {
                    Path path = t5Var.E;
                    if (path == null) {
                        t5Var.E = new Path();
                    } else {
                        path.rewind();
                    }
                    int i11 = t5Var.c;
                    if (i11 == -1 || (i10 = t5Var.d) == -1) {
                        measuredWidth = t5Var.getMeasuredWidth();
                        measuredHeight = t5Var.getMeasuredHeight();
                    } else {
                        measuredWidth = i11;
                        measuredHeight = i10;
                    }
                    float dp = t5Var.y.c + AndroidUtilities.dp(18.0f);
                    float dp2 = AndroidUtilities.dp(28.0f);
                    float f7 = (measuredWidth - dp) / 2.0f;
                    float f10 = measuredHeight / 2.0f;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = dp2 / 2.0f;
                    rectF.set(f7, f10 - f11, dp + f7, f10 + f11);
                    t5Var.E.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(t5Var.E);
                    ImageReceiver imageReceiver = t5Var.b;
                    if (imageReceiver != null && t5Var.s) {
                        imageReceiver.setColorFilter(t5Var.F);
                        float alpha = t5Var.b.getAlpha();
                        t5Var.b.setAlpha(1.0f);
                        t5Var.b.draw(canvas);
                        t5Var.b.setAlpha(alpha);
                        t5Var.b.setColorFilter(null);
                    }
                    t5Var.y.c(f7 + AndroidUtilities.dp(9.0f), f10, 1.0f, -1, canvas);
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }
}
