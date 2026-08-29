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
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n5 extends org.telegram.ui.Components.t9 {
    public final Paint C;
    public long D;
    public Drawable E;
    public Drawable F;
    public final /* synthetic */ r5 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(r5 r5Var, Context context) {
        super(context);
        this.G = r5Var;
        this.C = new Paint(1);
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
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
        r5 r5Var = this.G;
        if (r5Var.J) {
            Rect rect = r5.T;
            MediaController.PhotoEntry photoEntry2 = r5Var.C;
            if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                this.b.draw(canvas);
                if (r5Var.I == null) {
                    if (r5Var.H == null) {
                        gh.k kVar = new gh.k();
                        r5Var.H = kVar;
                        kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    r5Var.H.setBounds(0, 0, getWidth(), getHeight());
                    r5Var.H.draw(canvas);
                }
                invalidate();
            }
        }
        float f9 = r5Var.P;
        if (f9 != 1.0f && r5Var.N != null) {
            int interpolation = (int) (jr.f.getInterpolation(1.0f - f9) * 255.0f);
            Paint paint = this.C;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(r5Var.N, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.D);
            Float f10 = r5Var.O;
            r5Var.P = Math.min(1.0f, (min / (f10 == null ? 250.0f : f10.floatValue())) + r5Var.P);
            this.D = System.currentTimeMillis();
            invalidate();
            if (r5Var.I != null) {
                r5Var.b.invalidate();
            }
        } else if (f9 == 1.0f && (bitmap = r5Var.N) != null) {
            bitmap.recycle();
            r5Var.N = null;
            r5Var.O = null;
            invalidate();
        }
        if (r5Var.s) {
            p5 p5Var2 = r5Var.Q;
            if ((p5Var2 == null || !((cm) ((org.telegram.ui.Components.u) p5Var2).b).s) && (photoEntry = r5Var.C) != null && photoEntry.isLivePhoto()) {
                if (r5Var.C.isUnalivePhoto()) {
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        r5 r5Var = this.G;
        MediaController.PhotoEntry photoEntry = r5Var.C;
        r5Var.h(photoEntry != null && photoEntry.hasSpoiler);
    }
}
