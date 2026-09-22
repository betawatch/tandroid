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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class p5 extends FrameLayout {
    public final /* synthetic */ u5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(u5 u5Var, Context context) {
        super(context);
        this.a = u5Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        u5 u5Var = this.a;
        q5 q5Var = u5Var.a;
        if (u5Var.M == null || view != q5Var) {
            return super.drawChild(canvas, view, j3);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (u5Var.N) {
            Rect rect = u5.a0;
            MediaController.PhotoEntry photoEntry = u5Var.G;
            if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                u5Var.M.c(canvas, u5Var.b, q5Var.getMeasuredWidth(), q5Var.getMeasuredHeight(), 1.0f, false);
                MediaController.PhotoEntry photoEntry2 = u5Var.G;
                if (photoEntry2 != null && photoEntry2.starsAmount > 0 && q5Var.y != null) {
                    Path path = q5Var.E;
                    if (path == null) {
                        q5Var.E = new Path();
                    } else {
                        path.rewind();
                    }
                    int i11 = q5Var.c;
                    if (i11 == -1 || (i10 = q5Var.d) == -1) {
                        measuredWidth = q5Var.getMeasuredWidth();
                        measuredHeight = q5Var.getMeasuredHeight();
                    } else {
                        measuredWidth = i11;
                        measuredHeight = i10;
                    }
                    float dp = q5Var.y.c + AndroidUtilities.dp(18.0f);
                    float dp2 = AndroidUtilities.dp(28.0f);
                    float f7 = (measuredWidth - dp) / 2.0f;
                    float f10 = measuredHeight / 2.0f;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = dp2 / 2.0f;
                    rectF.set(f7, f10 - f11, dp + f7, f10 + f11);
                    q5Var.E.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(q5Var.E);
                    ImageReceiver imageReceiver = q5Var.b;
                    if (imageReceiver != null && q5Var.s) {
                        imageReceiver.setColorFilter(q5Var.F);
                        float alpha = q5Var.b.getAlpha();
                        q5Var.b.setAlpha(1.0f);
                        q5Var.b.draw(canvas);
                        q5Var.b.setAlpha(alpha);
                        q5Var.b.setColorFilter(null);
                    }
                    q5Var.y.c(f7 + AndroidUtilities.dp(9.0f), f10, 1.0f, -1, canvas);
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }
}
