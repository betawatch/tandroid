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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class n5 extends FrameLayout {
    public final /* synthetic */ s5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(s5 s5Var, Context context) {
        super(context);
        this.a = s5Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        float measuredWidth;
        float measuredHeight;
        int i10;
        s5 s5Var = this.a;
        o5 o5Var = s5Var.a;
        if (s5Var.M == null || view != o5Var) {
            return super.drawChild(canvas, view, j3);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (s5Var.N) {
            Rect rect = s5.a0;
            MediaController.PhotoEntry photoEntry = s5Var.G;
            if (photoEntry == null || !photoEntry.isAttachSpoilerRevealed) {
                s5Var.M.c(canvas, s5Var.b, o5Var.getMeasuredWidth(), o5Var.getMeasuredHeight(), 1.0f, false);
                MediaController.PhotoEntry photoEntry2 = s5Var.G;
                if (photoEntry2 != null && photoEntry2.starsAmount > 0 && o5Var.y != null) {
                    Path path = o5Var.E;
                    if (path == null) {
                        o5Var.E = new Path();
                    } else {
                        path.rewind();
                    }
                    int i11 = o5Var.c;
                    if (i11 == -1 || (i10 = o5Var.d) == -1) {
                        measuredWidth = o5Var.getMeasuredWidth();
                        measuredHeight = o5Var.getMeasuredHeight();
                    } else {
                        measuredWidth = i11;
                        measuredHeight = i10;
                    }
                    float dp = o5Var.y.c + AndroidUtilities.dp(18.0f);
                    float dp2 = AndroidUtilities.dp(28.0f);
                    float f7 = (measuredWidth - dp) / 2.0f;
                    float f10 = measuredHeight / 2.0f;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = dp2 / 2.0f;
                    rectF.set(f7, f10 - f11, dp + f7, f10 + f11);
                    o5Var.E.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(o5Var.E);
                    ImageReceiver imageReceiver = o5Var.b;
                    if (imageReceiver != null && o5Var.s) {
                        imageReceiver.setColorFilter(o5Var.F);
                        float alpha = o5Var.b.getAlpha();
                        o5Var.b.setAlpha(1.0f);
                        o5Var.b.draw(canvas);
                        o5Var.b.setAlpha(alpha);
                        o5Var.b.setColorFilter(null);
                    }
                    o5Var.y.c(f7 + AndroidUtilities.dp(9.0f), f10, 1.0f, -1, canvas);
                    canvas.restore();
                }
            }
        }
        return drawChild;
    }
}
