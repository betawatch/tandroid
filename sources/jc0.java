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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jc0 extends View {
    public hc0 a;
    public final ln b;
    public boolean c;
    public boolean d;
    public final j15 e;
    public Drawable f;
    public Drawable h;
    public boolean n;
    public Paint r;
    public Paint s;
    public boolean w;
    public final /* synthetic */ mc0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(mc0 mc0Var, Context context) {
        super(context);
        this.x = mc0Var;
        ln lnVar = new ln(400L, gm.H);
        this.b = lnVar;
        this.e = new j15();
        lnVar.a = this;
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
        ln lnVar = this.b;
        lnVar.e(false, f);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        hc0 hc0Var = this.a;
        if (hc0Var != null) {
            int i = hc0Var.c;
            int i2 = hc0Var.d;
            int i3 = hc0Var.e;
            int i4 = hc0Var.f;
            j15 j15Var = this.e;
            j15Var.d(i, i2, i3, i4);
            j15Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            paint = j15Var.c;
        } else {
            if (this.s == null) {
                Paint paint2 = new Paint(1);
                this.s = paint2;
                paint2.setColor(cmb.w0(null, cmb.yf, false));
            }
            paint = this.s;
        }
        if (lnVar.c == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, gm.L(15.0f), paint);
        } else {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.L(2.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, gm.N(13.5f), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, td4.A(1.0f, lnVar.c, gm.L(5.0f), gm.L(10.0f)), paint);
        }
        if (this.w) {
            if (this.h != null) {
            }
            this.h = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
            boolean z = this.d && this.a == null;
            this.n = z;
            this.h.setColorFilter(new PorterDuffColorFilter(z ? cmb.w0(null, cmb.Af, false) : -1, PorterDuff.Mode.SRC_IN));
            this.h.setBounds((int) (measuredWidth - (r1.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.h.getIntrinsicHeight() / 2.0f) + measuredHeight));
            float R1 = gm.R1(1.05f, 0.92f, lnVar.c);
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
                    drawable.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.Af, false), PorterDuff.Mode.MULTIPLY));
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
            this.r.setAlpha(Math.round(Utilities.i(lnVar.c, 1.0f, 0.0f) * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, gm.L(1.5f), this.r);
            canvas.drawCircle(measuredWidth - (gm.L(5.0f) * lnVar.c), measuredHeight, gm.L(1.5f), this.r);
            canvas.drawCircle((gm.L(5.0f) * lnVar.c) + measuredWidth, measuredHeight, gm.L(1.5f), this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.x.Q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
    }
}
