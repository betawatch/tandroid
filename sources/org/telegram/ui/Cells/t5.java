package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.tm;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t5 extends org.telegram.ui.Components.y9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final /* synthetic */ x5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(x5 x5Var, Context context) {
        super(context);
        this.K = x5Var;
        this.G = new Paint(1);
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        org.telegram.ui.Components.t5 t5Var = this.e;
        ImageReceiver imageReceiver = t5Var != null ? t5Var.k : this.a;
        if (imageReceiver == null) {
            return;
        }
        if (this.c == -1 || this.d == -1) {
            imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
            this.b.setImageCoords(0.0f, 0.0f, getWidth(), getHeight());
        } else {
            float width = (getWidth() - this.c) / 2;
            int height = getHeight();
            imageReceiver.setImageCoords(width, (height - r5) / 2, this.c, this.d);
            ImageReceiver imageReceiver2 = this.b;
            float width2 = (getWidth() - this.c) / 2;
            int height2 = getHeight();
            imageReceiver2.setImageCoords(width2, (height2 - r6) / 2, this.c, this.d);
        }
        imageReceiver.draw(canvas);
        x5 x5Var = this.K;
        if (x5Var.N) {
            Rect rect = x5.a0;
            MediaController.PhotoEntry photoEntry2 = x5Var.G;
            if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                this.b.draw(canvas);
                if (x5Var.M == null) {
                    if (x5Var.L == null) {
                        xh.g gVar = new xh.g();
                        x5Var.L = gVar;
                        gVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    x5Var.L.setBounds(0, 0, getWidth(), getHeight());
                    x5Var.L.draw(canvas);
                }
                invalidate();
            }
        }
        float f7 = x5Var.T;
        if (f7 != 1.0f && x5Var.R != null) {
            int interpolation = (int) (ds.f.getInterpolation(1.0f - f7) * 255.0f);
            Paint paint = this.G;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(x5Var.R, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.H);
            Float f10 = x5Var.S;
            x5Var.T = org.telegram.ui.d3.d(min, f10 == null ? 250.0f : f10.floatValue(), x5Var.T, 1.0f);
            this.H = System.currentTimeMillis();
            invalidate();
            if (x5Var.M != null) {
                x5Var.b.invalidate();
            }
        } else if (f7 == 1.0f && (bitmap = x5Var.R) != null) {
            bitmap.recycle();
            x5Var.R = null;
            x5Var.S = null;
            invalidate();
        }
        if (x5Var.s) {
            v5 v5Var = x5Var.U;
            if ((v5Var == null || !((tm) ((org.telegram.ui.Components.s) v5Var).b).s) && (photoEntry = x5Var.G) != null && photoEntry.isLivePhoto()) {
                if (x5Var.G.isUnalivePhoto()) {
                    if (this.J == null) {
                        this.J = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                    }
                    drawable = this.J;
                } else {
                    if (this.I == null) {
                        this.I = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                    }
                    drawable = this.I;
                }
                drawable.setBounds((int) (imageReceiver.getImageX() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageX() + AndroidUtilities.dp(30.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(26.0f)));
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        x5 x5Var = this.K;
        MediaController.PhotoEntry photoEntry = x5Var.G;
        x5Var.h(photoEntry != null && photoEntry.hasSpoiler);
    }
}
