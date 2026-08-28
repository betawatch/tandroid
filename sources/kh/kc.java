package kh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class kc extends View {
    public final Paint a;
    public final org.telegram.ui.Components.i6 b;
    public boolean c;

    public kc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = true;
        paint.setColor(TLObject.FLAG_31);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.b = i6Var;
        i6Var.k(0.2f, 200L, gr.h);
        i6Var.t(AndroidUtilities.dp(13.0f));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.bold());
        i6Var.setCallback(this);
        i6Var.b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (TextUtils.equals(sb2, i6Var.g)) {
            return;
        }
        i6Var.b();
        i6Var.q(sb2, false, true);
    }

    public final void a(boolean z10) {
        if (this.c || !z10) {
            this.c = false;
            animate().cancel();
            if (z10) {
                ll.r(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), gr.h, 220L);
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
        org.telegram.ui.Components.i6 i6Var = this.b;
        float d = i6Var.d();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - d) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + d) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.a);
        i6Var.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        i6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || super.verifyDrawable(drawable);
    }
}
