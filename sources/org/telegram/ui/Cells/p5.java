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
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p5 extends org.telegram.ui.Components.w9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final /* synthetic */ t5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(t5 t5Var, Context context) {
        super(context);
        this.K = t5Var;
        this.G = new Paint(1);
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        org.telegram.ui.Components.p5 p5Var = this.e;
        ImageReceiver imageReceiver = p5Var != null ? p5Var.k : this.a;
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
        t5 t5Var = this.K;
        if (t5Var.N) {
            Rect rect = t5.a0;
            MediaController.PhotoEntry photoEntry2 = t5Var.G;
            if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                this.b.draw(canvas);
                if (t5Var.M == null) {
                    if (t5Var.L == null) {
                        uh.h hVar = new uh.h();
                        t5Var.L = hVar;
                        hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    t5Var.L.setBounds(0, 0, getWidth(), getHeight());
                    t5Var.L.draw(canvas);
                }
                invalidate();
            }
        }
        float f7 = t5Var.T;
        if (f7 != 1.0f && t5Var.R != null) {
            int interpolation = (int) (wr.f.getInterpolation(1.0f - f7) * 255.0f);
            Paint paint = this.G;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(t5Var.R, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.H);
            Float f10 = t5Var.S;
            t5Var.T = Math.min(1.0f, (min / (f10 == null ? 250.0f : f10.floatValue())) + t5Var.T);
            this.H = System.currentTimeMillis();
            invalidate();
            if (t5Var.M != null) {
                t5Var.b.invalidate();
            }
        } else if (f7 == 1.0f && (bitmap = t5Var.R) != null) {
            bitmap.recycle();
            t5Var.R = null;
            t5Var.S = null;
            invalidate();
        }
        if (t5Var.s) {
            r5 r5Var = t5Var.U;
            if ((r5Var == null || !((nm) ((org.telegram.ui.Components.t) r5Var).b).s) && (photoEntry = t5Var.G) != null && photoEntry.isLivePhoto()) {
                if (t5Var.G.isUnalivePhoto()) {
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
        t5 t5Var = this.K;
        MediaController.PhotoEntry photoEntry = t5Var.G;
        t5Var.h(photoEntry != null && photoEntry.hasSpoiler);
    }
}
