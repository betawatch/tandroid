package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c81;
import org.telegram.ui.vy0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class y3 extends RadialProgressView {
    public final /* synthetic */ int N = 0;
    public final Paint O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(d4 d4Var, Context context) {
        super(context, null);
        this.P = d4Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.N) {
            case 0:
                d4 d4Var = (d4) this.P;
                org.telegram.ui.Components.w9 w9Var = d4Var.b;
                if (w9Var.getImageReceiver().hasNotThumb() && w9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (w9Var.getAlpha() * w9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.O;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                d4Var.x.setProgressColor(i0.a.o(-1, (int) (w9Var.getAlpha() * w9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.P;
                vy0 vy0Var = profileActivity.f0;
                if (vy0Var != null && vy0Var.getImageReceiver().hasNotThumb()) {
                    int currentAlpha = (int) (profileActivity.f0.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint2 = this.O;
                    paint2.setAlpha(currentAlpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                break;
            default:
                c81 c81Var = (c81) this.P;
                org.telegram.ui.Components.w9 w9Var2 = c81Var.F;
                if (w9Var2 != null && w9Var2.getImageReceiver().hasNotThumb()) {
                    int currentAlpha2 = (int) (c81Var.F.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint3 = this.O;
                    paint3.setAlpha(currentAlpha2);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(c81 c81Var, Context context) {
        super(context, null);
        this.P = c81Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.P = profileActivity;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }
}
