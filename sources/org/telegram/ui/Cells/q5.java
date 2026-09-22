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
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q5 extends org.telegram.ui.Components.v9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final /* synthetic */ u5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(u5 u5Var, Context context) {
        super(context);
        this.K = u5Var;
        this.G = new Paint(1);
    }

    @Override // org.telegram.ui.Components.v9, android.view.View
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
        u5 u5Var = this.K;
        if (u5Var.N) {
            Rect rect = u5.a0;
            MediaController.PhotoEntry photoEntry2 = u5Var.G;
            if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                this.b.draw(canvas);
                if (u5Var.M == null) {
                    if (u5Var.L == null) {
                        vh.g gVar = new vh.g();
                        u5Var.L = gVar;
                        gVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    u5Var.L.setBounds(0, 0, getWidth(), getHeight());
                    u5Var.L.draw(canvas);
                }
                invalidate();
            }
        }
        float f7 = u5Var.T;
        if (f7 != 1.0f && u5Var.R != null) {
            int interpolation = (int) (qr.f.getInterpolation(1.0f - f7) * 255.0f);
            Paint paint = this.G;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(u5Var.R, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.H);
            Float f10 = u5Var.S;
            u5Var.T = Math.min(1.0f, (min / (f10 == null ? 250.0f : f10.floatValue())) + u5Var.T);
            this.H = System.currentTimeMillis();
            invalidate();
            if (u5Var.M != null) {
                u5Var.b.invalidate();
            }
        } else if (f7 == 1.0f && (bitmap = u5Var.R) != null) {
            bitmap.recycle();
            u5Var.R = null;
            u5Var.S = null;
            invalidate();
        }
        if (u5Var.s) {
            s5 s5Var = u5Var.U;
            if ((s5Var == null || !((hm) ((org.telegram.ui.Components.s) s5Var).b).s) && (photoEntry = u5Var.G) != null && photoEntry.isLivePhoto()) {
                if (u5Var.G.isUnalivePhoto()) {
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
        u5 u5Var = this.K;
        MediaController.PhotoEntry photoEntry = u5Var.G;
        u5Var.h(photoEntry != null && photoEntry.hasSpoiler);
    }
}
