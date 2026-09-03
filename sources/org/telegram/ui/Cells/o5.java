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
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o5 extends org.telegram.ui.Components.p9 {
    public final Paint D;
    public long E;
    public Drawable F;
    public Drawable G;
    public final /* synthetic */ s5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(s5 s5Var, Context context) {
        super(context);
        this.H = s5Var;
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
        s5 s5Var = this.H;
        if (s5Var.K) {
            Rect rect = s5.U;
            MediaController.PhotoEntry photoEntry2 = s5Var.D;
            if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                this.b.draw(canvas);
                if (s5Var.J == null) {
                    if (s5Var.I == null) {
                        ih.k kVar = new ih.k();
                        s5Var.I = kVar;
                        kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    s5Var.I.setBounds(0, 0, getWidth(), getHeight());
                    s5Var.I.draw(canvas);
                }
                invalidate();
            }
        }
        float f10 = s5Var.Q;
        if (f10 != 1.0f && s5Var.O != null) {
            int interpolation = (int) (mr.f.getInterpolation(1.0f - f10) * 255.0f);
            Paint paint = this.D;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(s5Var.O, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.E);
            Float f11 = s5Var.P;
            s5Var.Q = Math.min(1.0f, (min / (f11 == null ? 250.0f : f11.floatValue())) + s5Var.Q);
            this.E = System.currentTimeMillis();
            invalidate();
            if (s5Var.J != null) {
                s5Var.b.invalidate();
            }
        } else if (f10 == 1.0f && (bitmap = s5Var.O) != null) {
            bitmap.recycle();
            s5Var.O = null;
            s5Var.P = null;
            invalidate();
        }
        if (s5Var.s) {
            q5 q5Var = s5Var.R;
            if ((q5Var == null || !((dm) ((org.telegram.ui.Components.t) q5Var).b).s) && (photoEntry = s5Var.D) != null && photoEntry.isLivePhoto()) {
                if (s5Var.D.isUnalivePhoto()) {
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
        s5 s5Var = this.H;
        MediaController.PhotoEntry photoEntry = s5Var.D;
        s5Var.h(photoEntry != null && photoEntry.hasSpoiler);
    }
}
