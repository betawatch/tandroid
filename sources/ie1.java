// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class ie1 extends FrameLayout implements tjb {
    public final lm E;
    public float F;
    public ValueAnimator G;
    public boolean H;
    public boolean I;
    public final lm J;
    public boolean a;
    public final wjb b;
    public final jia c;
    public final ImageView d;
    public final ih2 e;
    public final hn f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username w;
    public boolean x;
    public long y;

    public ie1(Context context, wjb wjbVar) {
        super(context);
        this.a = false;
        this.E = new lm(300L, this, s33.f);
        this.J = new lm(400L, this, s33.h);
        this.b = wjbVar;
        zkb.h(bkb.c6, wjbVar, this);
        jia jiaVar = new jia(getContext());
        this.c = jiaVar;
        jiaVar.setTextSize(16);
        zkb.W(jiaVar, bkb.F6, wjbVar);
        jiaVar.setEllipsizeByGradient(true);
        addView(jiaVar, nme.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        ih2 ih2Var = new ih2(gl.L(7.0f), gl.L(1.35f), bkb.v0(bkb.m6, wjbVar));
        this.e = ih2Var;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(ih2Var);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        ih2Var.setBounds(0, 0, gl.L(14.0f), gl.L(14.0f));
        addView(imageView, nme.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        hn hnVar = new hn(getContext(), false, true, true);
        this.f = hnVar;
        hnVar.setTextColor(bkb.v0(bkb.y6, wjbVar));
        hnVar.b(0.4f, 120L, s33.g);
        hnVar.setTextSize(gl.L(13.0f));
        addView(hnVar, nme.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        me1.I.setColor(bkb.v0(bkb.Ei, wjbVar));
        me1.J.setColor(bkb.v0(bkb.U8, wjbVar));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z, boolean z2, long j) {
        this.w = tL_username;
        this.x = z;
        this.y = j;
        invalidate();
        if (this.w == null) {
            this.H = false;
            this.I = false;
            return;
        }
        this.H = tL_username.active;
        byte b = 1;
        this.I = j == 0 && tL_username.editable;
        b(tL_username.username);
        boolean z3 = this.a;
        boolean z4 = this.I;
        hn hnVar = this.f;
        if (z3) {
            hnVar.c(k96.M0(z4 ? 2131743407 : this.H ? 2131743408 : 2131743406, null), z2, !this.H);
        } else {
            hnVar.c(k96.M0(z4 ? 2131743411 : this.H ? 2131743412 : 2131743410, null), z2, !this.H);
        }
        boolean z5 = this.H || this.I;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z5 ? 1.0f : 0.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new he1(this, b));
            this.G.setDuration(120L);
            this.G.setInterpolator(s33.g);
            this.G.start();
            return;
        }
        this.F = z5 ? 1.0f : 0.0f;
        int i = bkb.y6;
        wjb wjbVar = this.b;
        int f = bm2.f(this.F, bkb.v0(i, wjbVar), bkb.v0(bkb.m6, wjbVar));
        this.e.b(f);
        hnVar.setTextColor(f);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.U8));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.m6));
    }

    public final void b(String str) {
        if (this.I) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        jia jiaVar = this.c;
        if (!isEmpty) {
            jiaVar.l("@" + str, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(k96.M0(2131743409, null));
            spannableString.setSpan(new cm4(bkb.G6, this.b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            jiaVar.l(spannableStringBuilder, false);
        }
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        float e = this.J.e(false, this.H ? 1.0f : 0.0f);
        Drawable[] drawableArr = this.h;
        if (e < 1.0f) {
            f2 = 0.0f;
            canvas.drawCircle(gl.L(35.0f), gl.L(29.0f), gl.L(16.0f), me1.J);
            drawableArr[1].setAlpha((int) ((1.0f - e) * 255.0f));
            f = 255.0f;
            drawableArr[1].setBounds(oo1.A(2, gl.L(35.0f), drawableArr[1]), oo1.y(2, gl.L(29.0f), drawableArr[1]), oo1.w(2, gl.L(35.0f), drawableArr[1]), oo1.i(2, gl.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f = 255.0f;
            f2 = 0.0f;
        }
        if (e > f2) {
            Paint paint = me1.I;
            int i = (int) (e * f);
            paint.setAlpha(i);
            canvas.drawCircle(gl.L(35.0f), gl.L(29.0f), gl.L(16.0f) * e, paint);
            drawableArr[0].setAlpha(i);
            drawableArr[0].setBounds(oo1.A(2, gl.L(35.0f), drawableArr[0]), oo1.y(2, gl.L(29.0f), drawableArr[0]), oo1.w(2, gl.L(35.0f), drawableArr[0]), oo1.i(2, gl.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        float e2 = this.E.e(false, this.x ? 1.0f : f2);
        if (e2 > f2) {
            int alpha = bkb.j0.getAlpha();
            bkb.j0.setAlpha((int) (alpha * e2));
            canvas.drawRect(gl.L(70.0f), getHeight() - 1, getWidth(), getHeight(), bkb.j0);
            bkb.j0.setAlpha(alpha);
        }
        Paint paint2 = me1.K;
        paint2.setColor(bkb.w0(null, bkb.Ki, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e));
        RectF rectF = gl.P;
        rectF.set(getWidth() - gl.L(37.0f), gl.L(25.0f), getWidth() - gl.L(21.0f), gl.L(27.0f));
        canvas.drawRoundRect(rectF, gl.L(0.3f), gl.L(0.3f), paint2);
        rectF.set(getWidth() - gl.L(37.0f), gl.L(31.0f), getWidth() - gl.L(21.0f), gl.L(33.0f));
        canvas.drawRoundRect(rectF, gl.L(0.3f), gl.L(0.3f), paint2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(58.0f), TLObject.FLAG_30));
    }

    public void setLoading(boolean z) {
        if (this.r != z) {
            this.r = z;
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            byte b = 0;
            this.d.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z ? 1.0f : 0.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new he1(this, b));
            this.s.addListener(new y7((byte) 12, this, z));
            this.s.setInterpolator(s33.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }

    @Override // tjb
    public final void updateColors() {
        ih2 ih2Var;
        hn hnVar;
        wjb wjbVar = this.b;
        try {
            me1.I.setColor(bkb.v0(bkb.Ei, wjbVar));
            me1.J.setColor(bkb.v0(bkb.U8, wjbVar));
            ValueAnimator valueAnimator = this.G;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (ih2Var = this.e) != null && (hnVar = this.f) != null) {
                int f = bm2.f(this.F, bkb.v0(bkb.y6, wjbVar), bkb.v0(bkb.m6, wjbVar));
                ih2Var.b(f);
                hnVar.setTextColor(f);
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
