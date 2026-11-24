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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k9 extends FrameLayout {
    public final ho a;
    public final Paint b;
    public final ry2 c;
    public final Drawable d;
    public final int e;
    public int f;

    public k9(Activity activity, int i) {
        super(activity);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new ry2(new l0(this, (byte) 4));
        this.e = i;
        this.d = activity.getResources().getDrawable(R.drawable.filled_gift_sell_24).mutate();
        ho hoVar = new ho(false, false, false);
        this.a = hoVar;
        hoVar.N = gm.q.x;
        hoVar.setCallback(this);
        hoVar.x(gm.o());
        hoVar.w(gm.L(14.0f));
        hoVar.u(-1);
        hoVar.b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, gm.L(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
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
        ho hoVar = this.a;
        if (j == 0) {
            hoVar.t(jb6.M0(2131750269, null), true, true);
        } else {
            int i = (int) j;
            hoVar.t(j > 3600 ? gm.g0(i, false, false) : gm.h0(i, false), isAttachedToWindow(), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - gm.L(14.0f);
        ho hoVar = this.a;
        int c = measuredWidth - ((int) hoVar.c());
        int L = c - gm.L(30.0f);
        canvas.save();
        canvas.translate(L, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - L, getHeight(), gm.L(14.0f), gm.L(14.0f), this.b);
        canvas.restore();
        hoVar.setBounds(c, 0, getMeasuredWidth() - gm.L(8.0f), getMeasuredHeight() - gm.L(1.0f));
        hoVar.draw(canvas);
        int L2 = gm.L(-22.0f) + c;
        int L3 = gm.L(5.0f);
        int L4 = gm.L(-4.0f) + c;
        int L5 = gm.L(23.0f);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(172.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(28.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
