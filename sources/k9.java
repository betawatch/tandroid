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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k9 extends FrameLayout {
    public final gn a;
    public final Paint b;
    public final hx2 c;
    public final Drawable d;
    public final int e;
    public int f;

    public k9(Activity activity, int i) {
        super(activity);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new hx2(new l0(this, (byte) 4));
        this.e = i;
        this.d = activity.getResources().getDrawable(R.drawable.filled_gift_sell_24).mutate();
        gn gnVar = new gn(false, false, false);
        this.a = gnVar;
        gnVar.N = gl.q.x;
        gnVar.setCallback(this);
        gnVar.x(gl.o());
        gnVar.w(gl.L(14.0f));
        gnVar.u(-1);
        gnVar.b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, gl.L(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
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
        gn gnVar = this.a;
        if (j == 0) {
            gnVar.t(k96.M0(2131750320, null), true, true);
        } else {
            int i = (int) j;
            gnVar.t(j > 3600 ? gl.g0(i, false, false) : gl.h0(i, false), isAttachedToWindow(), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - gl.L(14.0f);
        gn gnVar = this.a;
        int c = measuredWidth - ((int) gnVar.c());
        int L = c - gl.L(30.0f);
        canvas.save();
        canvas.translate(L, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - L, getHeight(), gl.L(14.0f), gl.L(14.0f), this.b);
        canvas.restore();
        gnVar.setBounds(c, 0, getMeasuredWidth() - gl.L(8.0f), getMeasuredHeight() - gl.L(1.0f));
        gnVar.draw(canvas);
        int L2 = gl.L(-22.0f) + c;
        int L3 = gl.L(5.0f);
        int L4 = gl.L(-4.0f) + c;
        int L5 = gl.L(23.0f);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(172.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
