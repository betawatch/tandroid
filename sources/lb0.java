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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lb0 extends View {
    public jb0 a;
    public final mm b;
    public boolean c;
    public boolean d;
    public final o15 e;
    public Drawable f;
    public Drawable h;
    public boolean n;
    public Paint r;
    public Paint s;
    public boolean w;
    public final /* synthetic */ ob0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb0(ob0 ob0Var, Context context) {
        super(context);
        this.x = ob0Var;
        mm mmVar = new mm(400L, hl.H);
        this.b = mmVar;
        this.e = new o15();
        mmVar.a = this;
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
        mm mmVar = this.b;
        mmVar.e(false, f);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        jb0 jb0Var = this.a;
        if (jb0Var != null) {
            int i = jb0Var.c;
            int i2 = jb0Var.d;
            int i3 = jb0Var.e;
            int i4 = jb0Var.f;
            o15 o15Var = this.e;
            o15Var.d(i, i2, i3, i4);
            o15Var.b(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            paint = o15Var.c;
        } else {
            if (this.s == null) {
                Paint paint2 = new Paint(1);
                this.s = paint2;
                paint2.setColor(aob.w0(null, aob.zf, false));
            }
            paint = this.s;
        }
        if (mmVar.c == 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, hl.L(15.0f), paint);
        } else {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.L(2.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, hl.N(13.5f), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, qd4.A(1.0f, mmVar.c, hl.L(5.0f), hl.L(10.0f)), paint);
        }
        if (this.w) {
            if (this.h != null) {
            }
            this.h = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
            boolean z = this.d && this.a == null;
            this.n = z;
            this.h.setColorFilter(new PorterDuffColorFilter(z ? aob.w0(null, aob.Bf, false) : -1, PorterDuff.Mode.SRC_IN));
            this.h.setBounds((int) (measuredWidth - (r1.getIntrinsicWidth() / 2.0f)), (int) (measuredHeight - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + measuredWidth), (int) ((this.h.getIntrinsicHeight() / 2.0f) + measuredHeight));
            float R1 = hl.R1(1.05f, 0.92f, mmVar.c);
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
                    drawable.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.Bf, false), PorterDuff.Mode.MULTIPLY));
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
            this.r.setAlpha(Math.round(Utilities.i(mmVar.c, 1.0f, 0.0f) * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, hl.L(1.5f), this.r);
            canvas.drawCircle(measuredWidth - (hl.L(5.0f) * mmVar.c), measuredHeight, hl.L(1.5f), this.r);
            canvas.drawCircle((hl.L(5.0f) * mmVar.c) + measuredWidth, measuredHeight, hl.L(1.5f), this.r);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.x.Q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
    }
}
