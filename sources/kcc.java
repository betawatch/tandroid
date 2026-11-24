// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class kcc extends View {
    public final Paint a;
    public final gn b;
    public boolean c;

    public kcc(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = true;
        paint.setColor(TLObject.FLAG_31);
        gn gnVar = new gn(false, true, true);
        this.b = gnVar;
        gnVar.n(0.2f, 200L, s33.h);
        gnVar.w(gl.L(13.0f));
        gnVar.u(-1);
        gnVar.x(gl.o());
        gnVar.setCallback(this);
        gnVar.b = 1;
        StringBuilder sb = new StringBuilder(8);
        sb.append("00:00:00");
        if (TextUtils.equals(sb, gnVar.i)) {
            return;
        }
        gnVar.a();
        gnVar.t(sb, false, true);
    }

    public final void a(boolean z) {
        if (this.c || !z) {
            this.c = false;
            animate().cancel();
            if (z) {
                ug8.t(animate().translationY(gl.L(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), s33.h, 220L);
                return;
            }
            setTranslationY(gl.L(6.0f));
            setScaleX(0.8f);
            setScaleY(0.8f);
            setAlpha(0.0f);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gn gnVar = this.b;
        float c = gnVar.c();
        RectF rectF = gl.P;
        rectF.set(((getWidth() - c) / 2.0f) - gl.L(6.0f), gl.L(2.0f), ((getWidth() + c) / 2.0f) + gl.L(6.0f), gl.L(23.0f));
        canvas.drawRoundRect(rectF, gl.L(5.0f), gl.L(5.0f), this.a);
        gnVar.setBounds((int) rectF.left, ((int) rectF.top) - gl.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        gnVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(25.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || super.verifyDrawable(drawable);
    }
}
