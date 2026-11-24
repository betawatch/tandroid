// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jb0 extends View {
    public hb0 a;
    public final lm b;
    public boolean c;
    public boolean d;
    public final kz4 e;
    public Drawable f;
    public Drawable h;
    public boolean n;
    public Paint r;
    public Paint s;
    public boolean w;
    public final /* synthetic */ mb0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(mb0 mb0Var, Context context) {
        super(context);
        this.x = mb0Var;
        lm lmVar = new lm(400L, gl.H);
        this.b = lmVar;
        this.e = new kz4();
        lmVar.a = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
    
        if (r14.n != (r14.d && r14.a == null)) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        float f = this.c ? 1.0f : 0.0f;
        lm lmVar = this.b;
        lmVar.e(false, f);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        hb0 hb0Var = this.a;
        if (hb0Var != null) {
            int i = hb0Var.c;
            int i2 = hb0Var.d;
            int i3 = hb0Var.e;
            int i4 = hb0Var.f;
            kz4 kz4Var = this.e;
            kz4Var.d(i, i2, i3, i4);
            kz4Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            paint = kz4Var.c;
        } else {
            if (this.s == null) {
                Paint paint2 = new Paint(1);
                this.s = paint2;
                paint2.setColor(bkb.w0(null, bkb.yf, false));
            }
            paint = this.s;
        }
        if (lmVar.c == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, gl.L(15.0f), paint);
        } else {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gl.L(2.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, gl.N(13.5f), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, tb4.A(1.0f, lmVar.c, gl.L(5.0f), gl.L(10.0f)), paint);
        }
        if (this.w) {
            if (this.h != null) {
            }
            this.h = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
            boolean z = this.d && this.a == null;
            this.n = z;
            this.h.setColorFilter(new PorterDuffColorFilter(z ? bkb.w0(null, bkb.Af, false) : -1, PorterDuff.Mode.SRC_IN));
            this.h.setBounds((int) (measuredWidth - (r1.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.h.getIntrinsicHeight() / 2.0f) + measuredHeight));
            float R1 = gl.R1(1.05f, 0.92f, lmVar.c);
            canvas.save();
            canvas.scale(R1, R1, measuredWidth, measuredHeight);
            this.h.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.d) {
            if (this.a == null) {
                if (this.f == null) {
                    Drawable drawable = getContext().getDrawable(R.drawable.msg_filled_plus);
                    this.f = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.Af, false), PorterDuff.Mode.MULTIPLY));
                }
                this.f.setBounds((int) (measuredWidth - (r1.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.f.getIntrinsicHeight() / 2.0f)), (int) ((this.f.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.f.getIntrinsicHeight() / 2.0f) + measuredHeight));
                this.f.draw(canvas);
                return;
            }
            if (this.r == null) {
                Paint paint3 = new Paint(1);
                this.r = paint3;
                paint3.setColor(-1);
            }
            this.r.setAlpha(Math.round(Utilities.i(lmVar.c, 1.0f, 0.0f) * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, gl.L(1.5f), this.r);
            canvas.drawCircle(measuredWidth - (gl.L(5.0f) * lmVar.c), measuredHeight, gl.L(1.5f), this.r);
            canvas.drawCircle((gl.L(5.0f) * lmVar.c) + measuredWidth, measuredHeight, gl.L(1.5f), this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.x.Q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
    }
}
