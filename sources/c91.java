// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c91 extends View {
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final pb0 c;
    public final fk0 d;
    public final fk0 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public boolean w;
    public long x;

    public c91(Context context) {
        super(context);
        this.a = new ImageReceiver(this);
        this.b = new ImageReceiver(this);
        this.c = new pb0((wjb) null);
        fk0 fk0Var = new fk0(9);
        this.d = fk0Var;
        fk0 fk0Var2 = new fk0(12);
        this.e = fk0Var2;
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(TLObject.FLAG_31);
        paint.setColor(bkb.w0(null, bkb.gh, false));
        fk0Var.a = 48.0f;
        fk0Var.b = 58.999996f;
        fk0Var2.a = 51.0f;
        fk0Var2.b = 61.0f;
        fk0Var.b();
        fk0Var2.b();
    }

    public final void a(TLObject tLObject) {
        gl5 gl5Var;
        gl5 a;
        pb0 pb0Var = this.c;
        pb0Var.o(tLObject);
        this.a.U(tLObject, pb0Var, null);
        if (tLObject instanceof TLRPC.User) {
            a = gl5.l(y6c.t0, 1, (TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                gl5Var = null;
                this.b.d0(gl5Var, "50_50_b", new ColorDrawable(bkb.w0(null, bkb.jh, false)), null, tLObject, 0);
                invalidate();
            }
            a = gl5.a(1, (TLRPC.Chat) tLObject);
        }
        gl5Var = a;
        this.b.d0(gl5Var, "50_50_b", new ColorDrawable(bkb.w0(null, bkb.jh, false)), null, tLObject, 0);
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
        this.b.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        this.b.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        float f = width;
        float height = getHeight();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(0.0f, 0.0f, f, height);
        imageReceiver.h(canvas, null);
        canvas.drawRect(0.0f, 0.0f, f, height, this.h);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.x;
        long min = j == 0 ? 16L : Math.min(48L, uptimeMillis - j);
        this.x = uptimeMillis;
        float f2 = this.n;
        float f3 = min;
        this.n = (Math.min(1.0f, f3 / 120.0f) * (this.r - f2)) + f2;
        float f4 = this.s;
        this.s = (Math.min(1.0f, f3 / 200.0f) * ((this.w ? 1.0f : 0.0f) - f4)) + f4;
        float min2 = Math.min(width, r7) * 0.42f;
        float f5 = f / 2.0f;
        float min3 = (height / 2.0f) - (Math.min(width, r7) * 0.04f);
        if (this.s > 0.01f) {
            float f6 = this.n;
            fk0 fk0Var = this.e;
            fk0Var.e(f6, 1.0f);
            float f7 = this.n;
            fk0 fk0Var2 = this.d;
            fk0Var2.e(f7, 1.0f);
            float f8 = (((this.n * 0.8f) + 1.0f) * min2) / 100.0f;
            canvas.save();
            canvas.translate(f5, min3);
            canvas.scale(f8, f8);
            int i = (int) (this.s * 76.0f);
            Paint paint = this.f;
            paint.setAlpha(i);
            fk0Var.a(0.0f, 0.0f, canvas, paint);
            paint.setAlpha((int) (this.s * 110.0f));
            fk0Var2.a(0.0f, 0.0f, canvas, paint);
            canvas.restore();
        }
        float f9 = (this.n * 0.2f * this.s) + 1.0f;
        float f10 = min2 / 2.0f;
        ImageReceiver imageReceiver2 = this.a;
        imageReceiver2.q0((int) f10);
        imageReceiver2.i0(f5 - f10, min3 - f10, min2, min2);
        canvas.save();
        canvas.scale(f9, f9, f5, min3);
        imageReceiver2.h(canvas, null);
        canvas.restore();
        if (this.s > 0.01f || Math.abs(this.r - this.n) > 0.005f) {
            invalidate();
        } else {
            this.x = 0L;
        }
    }
}
