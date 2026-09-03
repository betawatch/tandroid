package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cz0;
import org.telegram.ui.v81;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y3 extends RadialProgressView {
    public final /* synthetic */ int H = 0;
    public final Paint I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(e4 e4Var, Context context) {
        super(context, null);
        this.J = e4Var;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                e4 e4Var = (e4) this.J;
                org.telegram.ui.Components.p9 p9Var = e4Var.b;
                if (p9Var.getImageReceiver().hasNotThumb() && p9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (p9Var.getAlpha() * p9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.I;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                e4Var.x.setProgressColor(i0.a.k(-1, (int) (p9Var.getAlpha() * p9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
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
                v81 v81Var = (v81) this.J;
                org.telegram.ui.Components.p9 p9Var2 = v81Var.C;
                if (p9Var2 != null && p9Var2.getImageReceiver().hasNotThumb()) {
                    int currentAlpha2 = (int) (v81Var.C.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint3 = this.I;
                    paint3.setAlpha(currentAlpha2);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(v81 v81Var, Context context) {
        super(context, null);
        this.J = v81Var;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.J = profileActivity;
        Paint paint = new Paint(1);
        this.I = paint;
        paint.setColor(1426063360);
    }
}
