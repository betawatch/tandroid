// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lf5 extends FrameLayout {
    public final i94 a;
    public final if5 b;
    public final TextView c;
    public final p66 d;
    public final vnb e;
    public final m66 f;
    public final Paint[] h;
    public ValueAnimator n;

    public lf5(Context context, vnb vnbVar) {
        super(context);
        this.e = vnbVar;
        LinearLayout j = uh9.j(context, 1);
        i94 i94Var = new i94(context, 1, 0, (byte) 1);
        this.a = i94Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i = aob.Dk;
        canvas.drawColor(vm2.f(0.5f, aob.v0(i, vnbVar), aob.v0(aob.h5, vnbVar)));
        i94Var.setBackgroundBitmap(createBitmap);
        ys4 ys4Var = i94Var.b;
        ys4Var.z = i;
        ys4Var.A = aob.Ck;
        ys4Var.b();
        j.addView(i94Var, tre.r(jn7.p2, jn7.p2, 1));
        if5 if5Var = new if5(this, context);
        this.b = if5Var;
        this.h = new Paint[20];
        a(0.0f);
        dva dvaVar = if5Var.a;
        dvaVar.q = false;
        dvaVar.J = false;
        dvaVar.K = true;
        dvaVar.H = true;
        dvaVar.l = new p12(this, (byte) 3);
        dvaVar.c();
        i94Var.setStarParticlesView(if5Var);
        TextView textView = new TextView(context);
        this.c = textView;
        ik8.v(textView, 1, 22.0f);
        int i2 = aob.G6;
        yob.X(textView, i2, vnbVar);
        textView.setGravity(1);
        j.addView(textView, tre.t(-2, -2, 1, 24, -8, 24, 0));
        m66 m66Var = new m66(this);
        this.f = m66Var;
        p66 p66Var = new p66(context, m66Var, vnbVar);
        this.d = p66Var;
        p66Var.setTextSize(1, 15.0f);
        p66Var.setGravity(17);
        yob.X(p66Var, i2, vnbVar);
        p66Var.setMovementMethod(LinkMovementMethod.getInstance());
        yob.G(p66Var, aob.J6, vnbVar);
        p66Var.setImportantForAccessibility(2);
        j.addView(p66Var, tre.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(if5Var, tre.e(-1, jn7.J3, 48));
        addView(j);
        setWillNotDraw(false);
    }

    public final void a(float f) {
        int i = aob.Ck;
        vnb vnbVar = this.e;
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.Dk, vnbVar);
        int f2 = vm2.f(f, v0, -371690);
        int f3 = vm2.f(f, v02, -14281);
        int i2 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i2 >= paintArr.length) {
                return;
            }
            paintArr[i2] = new Paint(1);
            paintArr[i2].setColorFilter(new PorterDuffColorFilter(vm2.f(i2 / (paintArr.length - 1), f2, f3), PorterDuff.Mode.SRC_IN));
            i2++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m66 m66Var = this.f;
        if (m66Var != null) {
            canvas.save();
            p66 p66Var = this.d;
            canvas.translate(p66Var.getLeft(), p66Var.getTop());
            if (m66Var.g(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i94 i94Var = this.a;
        if5 if5Var = this.b;
        if5Var.setTranslationY(((i94Var.getMeasuredHeight() / 2.0f) + i94Var.getTop()) - (if5Var.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new jf5());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -hl.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i = aob.a7;
        vnb vnbVar = this.e;
        yob.h(i, vnbVar, this);
        this.c.setText(ob6.a0("BoostingBoostsViaGifts", null, 2131753555, new Object[0]));
        String a0 = ob6.a0(null, null, xc2.V(chat) ? 2131753503 : 2131753498, new Object[0]);
        p66 p66Var = this.d;
        p66Var.setText(a0);
        yob.X(p66Var, aob.r5, vnbVar);
    }

    public void setPaused(boolean z) {
        this.a.setPaused(z);
        this.b.setPaused(z);
    }

    public void setStars(final boolean z) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        i94 i94Var = this.a;
        final float f = i94Var.b.l;
        final float f2 = z ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        hl.r(i94Var.f0);
        i94Var.a();
        i94Var.l();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gf5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                lf5 lf5Var = lf5.this;
                float[] fArr2 = fArr;
                float f3 = f;
                float f4 = f2;
                boolean z2 = z;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f5 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                lf5Var.a.b.l = hl.R1(f3, f4, floatValue);
                ys4 ys4Var = lf5Var.a.b;
                ys4Var.f = (f5 * 360.0f * (z2 ? 1 : -1)) + ys4Var.f;
                lf5Var.a.b.b();
                lf5Var.a(lf5Var.a.b.l);
            }
        });
        this.n.addListener(new kf5(this, fArr, f, f2, z));
        this.n.setDuration(680L);
        this.n.setInterpolator(k43.h);
        this.n.start();
    }
}
