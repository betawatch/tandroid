package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o91;
import org.telegram.ui.uz0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z3 extends RadialProgressView {
    public final /* synthetic */ int K = 0;
    public final Paint L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(e4 e4Var, Context context) {
        super(context, null);
        this.M = e4Var;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.K) {
            case 0:
                e4 e4Var = (e4) this.M;
                org.telegram.ui.Components.z9 z9Var = e4Var.b;
                if (z9Var.getImageReceiver().hasNotThumb() && z9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (z9Var.getAlpha() * z9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.L;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                e4Var.x.setProgressColor(i0.a.k(-1, (int) (z9Var.getAlpha() * z9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.M;
                uz0 uz0Var = profileActivity.e0;
                if (uz0Var != null && uz0Var.getImageReceiver().hasNotThumb()) {
                    int currentAlpha = (int) (profileActivity.e0.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint2 = this.L;
                    paint2.setAlpha(currentAlpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                break;
            default:
                o91 o91Var = (o91) this.M;
                org.telegram.ui.Components.z9 z9Var2 = o91Var.F;
                if (z9Var2 != null && z9Var2.getImageReceiver().hasNotThumb()) {
                    int currentAlpha2 = (int) (o91Var.F.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint3 = this.L;
                    paint3.setAlpha(currentAlpha2);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(o91 o91Var, Context context) {
        super(context, null);
        this.M = o91Var;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.M = profileActivity;
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(1426063360);
    }
}
