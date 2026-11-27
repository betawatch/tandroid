// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class l9 extends FrameLayout {
    public final hn a;
    public final Paint b;
    public final by2 c;
    public final Drawable d;
    public final int e;
    public int f;

    public l9(Activity activity, int i) {
        super(activity);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new by2(new m0(this, (byte) 4));
        this.e = i;
        this.d = activity.getResources().getDrawable(R.drawable.filled_gift_sell_24).mutate();
        hn hnVar = new hn(false, false, false);
        this.a = hnVar;
        hnVar.N = hl.q.x;
        hnVar.setCallback(this);
        hnVar.x(hl.o());
        hnVar.w(hl.L(14.0f));
        hnVar.u(-1);
        hnVar.b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, hl.L(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i) {
        this.f = i;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i - ConnectionsManager.getInstance(this.e).getCurrentTime());
            this.c.a(max);
            b(max);
        }
    }

    public final void b(long j) {
        hn hnVar = this.a;
        if (j == 0) {
            hnVar.t(ob6.M0(2131750297, null), true, true);
        } else {
            int i = (int) j;
            hnVar.t(j > 3600 ? hl.g0(i, false, false) : hl.h0(i, false), isAttachedToWindow(), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - hl.L(14.0f);
        hn hnVar = this.a;
        int c = measuredWidth - ((int) hnVar.c());
        int L = c - hl.L(30.0f);
        canvas.save();
        canvas.translate(L, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - L, getHeight(), hl.L(14.0f), hl.L(14.0f), this.b);
        canvas.restore();
        hnVar.setBounds(c, 0, getMeasuredWidth() - hl.L(8.0f), getMeasuredHeight() - hl.L(1.0f));
        hnVar.draw(canvas);
        int L2 = hl.L(-22.0f) + c;
        int L3 = hl.L(5.0f);
        int L4 = hl.L(-4.0f) + c;
        int L5 = hl.L(23.0f);
        Drawable drawable = this.d;
        drawable.setBounds(L2, L3, L4, L5);
        drawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(172.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
