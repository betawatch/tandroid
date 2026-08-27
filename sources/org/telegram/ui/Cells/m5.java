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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ul;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m5 extends org.telegram.ui.Components.n9 {
    public final Paint C;
    public long D;
    public Drawable E;
    public Drawable F;
    public final /* synthetic */ q5 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(q5 q5Var, Context context) {
        super(context);
        this.G = q5Var;
        this.C = new Paint(1);
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
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
        q5 q5Var = this.G;
        if (q5Var.J) {
            Rect rect = q5.T;
            MediaController.PhotoEntry photoEntry2 = q5Var.C;
            if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                this.b.draw(canvas);
                if (q5Var.I == null) {
                    if (q5Var.H == null) {
                        eh.k kVar = new eh.k();
                        q5Var.H = kVar;
                        kVar.h(i0.b.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    q5Var.H.setBounds(0, 0, getWidth(), getHeight());
                    q5Var.H.draw(canvas);
                }
                invalidate();
            }
        }
        float f10 = q5Var.P;
        if (f10 != 1.0f && q5Var.N != null) {
            int interpolation = (int) (er.f.getInterpolation(1.0f - f10) * 255.0f);
            Paint paint = this.C;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(q5Var.N, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.D);
            Float f11 = q5Var.O;
            q5Var.P = Math.min(1.0f, (min / (f11 == null ? 250.0f : f11.floatValue())) + q5Var.P);
            this.D = System.currentTimeMillis();
            invalidate();
            if (q5Var.I != null) {
                q5Var.b.invalidate();
            }
        } else if (f10 == 1.0f && (bitmap = q5Var.N) != null) {
            bitmap.recycle();
            q5Var.N = null;
            q5Var.O = null;
            invalidate();
        }
        if (q5Var.s) {
            o5 o5Var = q5Var.Q;
            if ((o5Var == null || !((ul) ((org.telegram.ui.Components.s) o5Var).b).s) && (photoEntry = q5Var.C) != null && photoEntry.isLivePhoto()) {
                if (q5Var.C.isUnalivePhoto()) {
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
        q5 q5Var = this.G;
        MediaController.PhotoEntry photoEntry = q5Var.C;
        q5Var.h(photoEntry != null && photoEntry.hasSpoiler);
    }
}
