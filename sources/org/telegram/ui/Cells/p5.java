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
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p5 extends org.telegram.ui.Components.p9 {
    public final Paint D;
    public long E;
    public Drawable F;
    public Drawable G;
    public final /* synthetic */ t5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(t5 t5Var, Context context) {
        super(context);
        this.H = t5Var;
        this.D = new Paint(1);
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        org.telegram.ui.Components.l5 l5Var = this.e;
        ImageReceiver imageReceiver = l5Var != null ? l5Var.k : this.a;
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
        t5 t5Var = this.H;
        if (t5Var.K) {
            Rect rect = t5.U;
            MediaController.PhotoEntry photoEntry2 = t5Var.D;
            if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                this.b.draw(canvas);
                if (t5Var.J == null) {
                    if (t5Var.I == null) {
                        jh.k kVar = new jh.k();
                        t5Var.I = kVar;
                        kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    t5Var.I.setBounds(0, 0, getWidth(), getHeight());
                    t5Var.I.draw(canvas);
                }
                invalidate();
            }
        }
        float f10 = t5Var.Q;
        if (f10 != 1.0f && t5Var.O != null) {
            int interpolation = (int) (pr.f.getInterpolation(1.0f - f10) * 255.0f);
            Paint paint = this.D;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(t5Var.O, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.E);
            Float f11 = t5Var.P;
            t5Var.Q = Math.min(1.0f, (min / (f11 == null ? 250.0f : f11.floatValue())) + t5Var.Q);
            this.E = System.currentTimeMillis();
            invalidate();
            if (t5Var.J != null) {
                t5Var.b.invalidate();
            }
        } else if (f10 == 1.0f && (bitmap = t5Var.O) != null) {
            bitmap.recycle();
            t5Var.O = null;
            t5Var.P = null;
            invalidate();
        }
        if (t5Var.s) {
            r5 r5Var = t5Var.R;
            if ((r5Var == null || !((fm) ((org.telegram.ui.Components.t) r5Var).b).s) && (photoEntry = t5Var.D) != null && photoEntry.isLivePhoto()) {
                if (t5Var.D.isUnalivePhoto()) {
                    if (this.G == null) {
                        this.G = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                    }
                    drawable = this.G;
                } else {
                    if (this.F == null) {
                        this.F = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                    }
                    drawable = this.F;
                }
                drawable.setBounds((int) (imageReceiver.getImageX() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageX() + AndroidUtilities.dp(30.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(26.0f)));
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        t5 t5Var = this.H;
        MediaController.PhotoEntry photoEntry = t5Var.D;
        t5Var.h(photoEntry != null && photoEntry.hasSpoiler);
    }
}
