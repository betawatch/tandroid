package ci;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class ad extends View {
    public final Paint a;
    public final org.telegram.ui.Components.o6 b;
    public boolean c;

    public ad(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = true;
        paint.setColor(TLObject.FLAG_31);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        this.b = o6Var;
        o6Var.k(0.2f, 200L, rr.h);
        o6Var.t(AndroidUtilities.dp(13.0f));
        o6Var.r(-1);
        o6Var.u(AndroidUtilities.bold());
        o6Var.setCallback(this);
        o6Var.b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (TextUtils.equals(sb2, o6Var.g)) {
            return;
        }
        o6Var.b();
        o6Var.q(sb2, false, true);
    }

    public final void a(boolean z10) {
        if (this.c || !z10) {
            this.c = false;
            animate().cancel();
            if (z10) {
                ok.s(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), rr.h, 220L);
                return;
            }
            setTranslationY(AndroidUtilities.dp(6.0f));
            setScaleX(0.8f);
            setScaleY(0.8f);
            setAlpha(0.0f);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.o6 o6Var = this.b;
        float d = o6Var.d();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - d) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + d) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.a);
        o6Var.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        o6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || super.verifyDrawable(drawable);
    }
}
