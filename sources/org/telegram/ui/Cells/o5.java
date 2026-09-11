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
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class o5 extends org.telegram.ui.Components.x9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final /* synthetic */ s5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(s5 s5Var, Context context) {
        super(context);
        this.K = s5Var;
        this.G = new Paint(1);
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        MediaController.PhotoEntry photoEntry;
        Drawable drawable;
        org.telegram.ui.Components.q5 q5Var = this.e;
        ImageReceiver imageReceiver = q5Var != null ? q5Var.k : this.a;
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
        s5 s5Var = this.K;
        if (s5Var.N) {
            Rect rect = s5.a0;
            MediaController.PhotoEntry photoEntry2 = s5Var.G;
            if (photoEntry2 == null || !photoEntry2.isAttachSpoilerRevealed) {
                this.b.draw(canvas);
                if (s5Var.M == null) {
                    if (s5Var.L == null) {
                        wh.h hVar = new wh.h();
                        s5Var.L = hVar;
                        hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    }
                    s5Var.L.setBounds(0, 0, getWidth(), getHeight());
                    s5Var.L.draw(canvas);
                }
                invalidate();
            }
        }
        float f7 = s5Var.T;
        if (f7 != 1.0f && s5Var.R != null) {
            int interpolation = (int) (pr.f.getInterpolation(1.0f - f7) * 255.0f);
            Paint paint = this.G;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(s5Var.R, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.H);
            Float f10 = s5Var.S;
            s5Var.T = Math.min(1.0f, (min / (f10 == null ? 250.0f : f10.floatValue())) + s5Var.T);
            this.H = System.currentTimeMillis();
            invalidate();
            if (s5Var.M != null) {
                s5Var.b.invalidate();
            }
        } else if (f7 == 1.0f && (bitmap = s5Var.R) != null) {
            bitmap.recycle();
            s5Var.R = null;
            s5Var.S = null;
            invalidate();
        }
        if (s5Var.s) {
            q5 q5Var2 = s5Var.U;
            if ((q5Var2 == null || !((hm) ((org.telegram.ui.Components.t) q5Var2).b).s) && (photoEntry = s5Var.G) != null && photoEntry.isLivePhoto()) {
                if (s5Var.G.isUnalivePhoto()) {
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
        s5 s5Var = this.K;
        MediaController.PhotoEntry photoEntry = s5Var.G;
        s5Var.h(photoEntry != null && photoEntry.hasSpoiler);
    }
}
