package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cz0;
import org.telegram.ui.w81;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x3 extends RadialProgressView {
    public final /* synthetic */ int H = 0;
    public final Paint I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(d4 d4Var, Context context) {
        super(context, null);
        this.J = d4Var;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                d4 d4Var = (d4) this.J;
                org.telegram.ui.Components.p9 p9Var = d4Var.b;
                if (p9Var.getImageReceiver().hasNotThumb() && p9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (p9Var.getAlpha() * p9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.I;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                d4Var.x.setProgressColor(i0.a.k(-1, (int) (p9Var.getAlpha() * p9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.J;
                cz0 cz0Var = profileActivity.b0;
                if (cz0Var != null && cz0Var.getImageReceiver().hasNotThumb()) {
                    int currentAlpha = (int) (profileActivity.b0.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint2 = this.I;
                    paint2.setAlpha(currentAlpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                break;
            default:
                w81 w81Var = (w81) this.J;
                org.telegram.ui.Components.p9 p9Var2 = w81Var.C;
                if (p9Var2 != null && p9Var2.getImageReceiver().hasNotThumb()) {
                    int currentAlpha2 = (int) (w81Var.C.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint3 = this.I;
                    paint3.setAlpha(currentAlpha2);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(w81 w81Var, Context context) {
        super(context, null);
        this.J = w81Var;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.J = profileActivity;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }
}
