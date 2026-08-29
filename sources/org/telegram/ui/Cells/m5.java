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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m5 extends FrameLayout {
    public final /* synthetic */ r5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(r5 r5Var, Context context) {
        super(context);
        this.a = r5Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        r5 r5Var = this.a;
        n5 n5Var = r5Var.a;
        if (r5Var.I == null || view != n5Var) {
            return super.drawChild(canvas, view, j10);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (r5Var.J) {
            Rect rect = r5.T;
            MediaController.PhotoEntry photoEntry = r5Var.C;
            if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                r5Var.I.c(canvas, r5Var.b, n5Var.getMeasuredWidth(), n5Var.getMeasuredHeight(), 1.0f, false);
                MediaController.PhotoEntry photoEntry2 = r5Var.C;
                if (photoEntry2 != null && photoEntry2.starsAmount > 0 && n5Var.y != null) {
                    Path path = n5Var.A;
                    if (path == null) {
                        n5Var.A = new Path();
                    } else {
                        path.rewind();
                    }
                    int i11 = n5Var.c;
                    if (i11 == -1 || (i10 = n5Var.d) == -1) {
                        measuredWidth = n5Var.getMeasuredWidth();
                        measuredHeight = n5Var.getMeasuredHeight();
                    } else {
                        measuredWidth = i11;
                        measuredHeight = i10;
                    }
                    float dp = n5Var.y.c + AndroidUtilities.dp(18.0f);
                    float dp2 = AndroidUtilities.dp(28.0f);
                    float f9 = (measuredWidth - dp) / 2.0f;
                    float f10 = measuredHeight / 2.0f;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = dp2 / 2.0f;
                    rectF.set(f9, f10 - f11, dp + f9, f10 + f11);
                    n5Var.A.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(n5Var.A);
                    ImageReceiver imageReceiver = n5Var.b;
                    if (imageReceiver != null && n5Var.s) {
                        imageReceiver.setColorFilter(n5Var.B);
                        float alpha = n5Var.b.getAlpha();
                        n5Var.b.setAlpha(1.0f);
                        n5Var.b.draw(canvas);
                        n5Var.b.setAlpha(alpha);
                        n5Var.b.setColorFilter(null);
                    }
                    n5Var.y.c(f9 + AndroidUtilities.dp(9.0f), f10, 1.0f, -1, canvas);
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }
}
