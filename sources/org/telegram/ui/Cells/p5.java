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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.yl;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p5 extends org.telegram.ui.Components.o9 {
    public final Paint C;
    public long D;
    public Drawable E;
    public Drawable F;
    public final /* synthetic */ t5 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(t5 t5Var, Context context) {
        super(context);
        this.G = t5Var;
        this.C = new Paint(1);
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        org.telegram.ui.Components.k5 k5Var = this.e;
        ImageReceiver imageReceiver = k5Var != null ? k5Var.k : this.a;
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
        t5 t5Var = this.G;
        if (t5Var.J) {
            Rect rect = t5.T;
            MediaController.PhotoEntry photoEntry2 = t5Var.C;
            if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                this.b.draw(canvas);
                if (t5Var.I == null) {
                    if (t5Var.H == null) {
                        dh.l lVar = new dh.l();
                        t5Var.H = lVar;
                        lVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    t5Var.H.setBounds(0, 0, getWidth(), getHeight());
                    t5Var.H.draw(canvas);
                }
                invalidate();
            }
        }
        float f10 = t5Var.P;
        if (f10 != 1.0f && t5Var.N != null) {
            int interpolation = (int) (gr.f.getInterpolation(1.0f - f10) * 255.0f);
            Paint paint = this.C;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(t5Var.N, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.D);
            Float f11 = t5Var.O;
            t5Var.P = Math.min(1.0f, (min / (f11 == null ? 250.0f : f11.floatValue())) + t5Var.P);
            this.D = System.currentTimeMillis();
            invalidate();
            if (t5Var.I != null) {
                t5Var.b.invalidate();
            }
        } else if (f10 == 1.0f && (bitmap = t5Var.N) != null) {
            bitmap.recycle();
            t5Var.N = null;
            t5Var.O = null;
            invalidate();
        }
        if (t5Var.s) {
            r5 r5Var = t5Var.Q;
            if ((r5Var == null || !((yl) ((org.telegram.ui.Components.s) r5Var).b).s) && (photoEntry = t5Var.C) != null && photoEntry.isLivePhoto()) {
                if (t5Var.C.isUnalivePhoto()) {
                    if (this.F == null) {
                        this.F = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                    }
                    drawable = this.F;
                } else {
                    if (this.E == null) {
                        this.E = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                    }
                    drawable = this.E;
                }
                drawable.setBounds((int) (imageReceiver.getImageX() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(8.0f)), (int) (imageReceiver.getImageX() + AndroidUtilities.dp(30.0f)), (int) (imageReceiver.getImageY() + AndroidUtilities.dp(26.0f)));
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        t5 t5Var = this.G;
        MediaController.PhotoEntry photoEntry = t5Var.C;
        t5Var.h(photoEntry != null && photoEntry.hasSpoiler);
    }
}
