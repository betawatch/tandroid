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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o5 extends FrameLayout {
    public final /* synthetic */ t5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(t5 t5Var, Context context) {
        super(context);
        this.a = t5Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        t5 t5Var = this.a;
        p5 p5Var = t5Var.a;
        if (t5Var.M == null || view != p5Var) {
            return super.drawChild(canvas, view, j3);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (t5Var.N) {
            Rect rect = t5.a0;
            MediaController.PhotoEntry photoEntry = t5Var.G;
            if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                t5Var.M.c(canvas, t5Var.b, p5Var.getMeasuredWidth(), p5Var.getMeasuredHeight(), 1.0f, false);
                MediaController.PhotoEntry photoEntry2 = t5Var.G;
                if (photoEntry2 != null && photoEntry2.starsAmount > 0 && p5Var.y != null) {
                    Path path = p5Var.E;
                    if (path == null) {
                        p5Var.E = new Path();
                    } else {
                        path.rewind();
                    }
                    int i11 = p5Var.c;
                    if (i11 == -1 || (i10 = p5Var.d) == -1) {
                        measuredWidth = p5Var.getMeasuredWidth();
                        measuredHeight = p5Var.getMeasuredHeight();
                    } else {
                        measuredWidth = i11;
                        measuredHeight = i10;
                    }
                    float dp = p5Var.y.c + AndroidUtilities.dp(18.0f);
                    float dp2 = AndroidUtilities.dp(28.0f);
                    float f7 = (measuredWidth - dp) / 2.0f;
                    float f10 = measuredHeight / 2.0f;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = dp2 / 2.0f;
                    rectF.set(f7, f10 - f11, dp + f7, f10 + f11);
                    p5Var.E.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(p5Var.E);
                    ImageReceiver imageReceiver = p5Var.b;
                    if (imageReceiver != null && p5Var.s) {
                        imageReceiver.setColorFilter(p5Var.F);
                        float alpha = p5Var.b.getAlpha();
                        p5Var.b.setAlpha(1.0f);
                        p5Var.b.draw(canvas);
                        p5Var.b.setAlpha(alpha);
                        p5Var.b.setColorFilter(null);
                    }
                    p5Var.y.c(f7 + AndroidUtilities.dp(9.0f), f10, 1.0f, -1, canvas);
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }
}
