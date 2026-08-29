package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b81;
import org.telegram.ui.ly0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w3 extends RadialProgressView {
    public final /* synthetic */ int G = 0;
    public final Paint H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(c4 c4Var, Context context) {
        super(context, null);
        this.I = c4Var;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                c4 c4Var = (c4) this.I;
                org.telegram.ui.Components.t9 t9Var = c4Var.b;
                if (t9Var.getImageReceiver().hasNotThumb() && t9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (t9Var.getAlpha() * t9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.H;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                c4Var.x.setProgressColor(i0.a.k(-1, (int) (t9Var.getAlpha() * t9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.I;
                ly0 ly0Var = profileActivity.a0;
                if (ly0Var != null && ly0Var.getImageReceiver().hasNotThumb()) {
                    int currentAlpha = (int) (profileActivity.a0.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint2 = this.H;
                    paint2.setAlpha(currentAlpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                break;
            default:
                b81 b81Var = (b81) this.I;
                org.telegram.ui.Components.t9 t9Var2 = b81Var.B;
                if (t9Var2 != null && t9Var2.getImageReceiver().hasNotThumb()) {
                    int currentAlpha2 = (int) (b81Var.B.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint3 = this.H;
                    paint3.setAlpha(currentAlpha2);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(b81 b81Var, Context context) {
        super(context, null);
        this.I = b81Var;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.I = profileActivity;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }
}
