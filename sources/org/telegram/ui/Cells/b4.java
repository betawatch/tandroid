package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cv0;
import org.telegram.ui.o31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b4 extends RadialProgressView {
    public final /* synthetic */ int N = 0;
    public final Paint O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(f4 f4Var, Context context) {
        super(context, null);
        this.P = f4Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.N) {
            case 0:
                f4 f4Var = (f4) this.P;
                org.telegram.ui.Components.k9 k9Var = f4Var.b;
                if (k9Var.getImageReceiver().L() && k9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (k9Var.getAlpha() * k9Var.getImageReceiver().h1 * 85.0f);
                    Paint paint = this.O;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                f4Var.y.setProgressColor(i0.a.o(-1, (int) (k9Var.getAlpha() * k9Var.getImageReceiver().h1 * 255.0f)));
                super.onDraw(canvas);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.P;
                cv0 cv0Var = profileActivity.e0;
                if (cv0Var != null && cv0Var.getImageReceiver().L()) {
                    int i7 = (int) (profileActivity.e0.getImageReceiver().h1 * 85.0f);
                    Paint paint2 = this.O;
                    paint2.setAlpha(i7);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                break;
            default:
                o31 o31Var = (o31) this.P;
                org.telegram.ui.Components.k9 k9Var2 = o31Var.G;
                if (k9Var2 != null && k9Var2.getImageReceiver().L()) {
                    int i10 = (int) (o31Var.G.getImageReceiver().h1 * 85.0f);
                    Paint paint3 = this.O;
                    paint3.setAlpha(i10);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(o31 o31Var, Context context) {
        super(context, null);
        this.P = o31Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.P = profileActivity;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }
}
