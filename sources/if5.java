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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class if5 extends FrameLayout {
    public final w94 a;
    public final ff5 b;
    public final TextView c;
    public final l66 d;
    public final ylb e;
    public final i66 f;
    public final Paint[] h;
    public ValueAnimator n;

    public if5(Context context, ylb ylbVar) {
        super(context);
        this.e = ylbVar;
        LinearLayout i = hg9.i(context, 1);
        w94 w94Var = new w94(context, 1, 0, (byte) 1);
        this.a = w94Var;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = cmb.Ck;
        canvas.drawColor(on2.f(0.5f, cmb.v0(i2, ylbVar), cmb.v0(cmb.g5, ylbVar)));
        w94Var.setBackgroundBitmap(createBitmap);
        vs4 vs4Var = w94Var.b;
        vs4Var.z = i2;
        vs4Var.A = cmb.Bk;
        vs4Var.b();
        i.addView(w94Var, qoe.r(nm7.p2, nm7.p2, 1));
        ff5 ff5Var = new ff5(this, context);
        this.b = ff5Var;
        this.h = new Paint[20];
        a(0.0f);
        cta ctaVar = ff5Var.a;
        ctaVar.q = false;
        ctaVar.J = false;
        ctaVar.K = true;
        ctaVar.H = true;
        ctaVar.l = new k22(this, (byte) 3);
        ctaVar.c();
        w94Var.setStarParticlesView(ff5Var);
        TextView textView = new TextView(context);
        this.c = textView;
        wi8.v(textView, 1, 22.0f);
        int i3 = cmb.F6;
        anb.X(textView, i3, ylbVar);
        textView.setGravity(1);
        i.addView(textView, qoe.t(-2, -2, 1, 24, -8, 24, 0));
        i66 i66Var = new i66(this);
        this.f = i66Var;
        l66 l66Var = new l66(context, i66Var, ylbVar);
        this.d = l66Var;
        l66Var.setTextSize(1, 15.0f);
        l66Var.setGravity(17);
        anb.X(l66Var, i3, ylbVar);
        l66Var.setMovementMethod(LinkMovementMethod.getInstance());
        anb.G(l66Var, cmb.I6, ylbVar);
        l66Var.setImportantForAccessibility(2);
        i.addView(l66Var, qoe.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(ff5Var, qoe.e(-1, nm7.J3, 48));
        addView(i);
        setWillNotDraw(false);
    }

    public final void a(float f) {
        int i = cmb.Bk;
        ylb ylbVar = this.e;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.Ck, ylbVar);
        int f2 = on2.f(f, v0, -371690);
        int f3 = on2.f(f, v02, -14281);
        int i2 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i2 >= paintArr.length) {
                return;
            }
            paintArr[i2] = new Paint(1);
            paintArr[i2].setColorFilter(new PorterDuffColorFilter(on2.f(i2 / (paintArr.length - 1), f2, f3), PorterDuff.Mode.SRC_IN));
            i2++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i66 i66Var = this.f;
        if (i66Var != null) {
            canvas.save();
            l66 l66Var = this.d;
            canvas.translate(l66Var.getLeft(), l66Var.getTop());
            if (i66Var.g(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        w94 w94Var = this.a;
        ff5 ff5Var = this.b;
        ff5Var.setTranslationY(((w94Var.getMeasuredHeight() / 2.0f) + w94Var.getTop()) - (ff5Var.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new gf5());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -gm.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i = cmb.Z6;
        ylb ylbVar = this.e;
        anb.h(i, ylbVar, this);
        this.c.setText(jb6.a0("BoostingBoostsViaGifts", null, 2131753527, new Object[0]));
        String a0 = jb6.a0(null, null, sd2.V(chat) ? 2131753475 : 2131753470, new Object[0]);
        l66 l66Var = this.d;
        l66Var.setText(a0);
        anb.X(l66Var, cmb.q5, ylbVar);
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
        w94 w94Var = this.a;
        final float f = w94Var.b.l;
        final float f2 = z ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        gm.r(w94Var.f0);
        w94Var.a();
        w94Var.l();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: df5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                if5 if5Var = if5.this;
                float[] fArr2 = fArr;
                float f3 = f;
                float f4 = f2;
                boolean z2 = z;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f5 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                if5Var.a.b.l = gm.R1(f3, f4, floatValue);
                vs4 vs4Var = if5Var.a.b;
                vs4Var.f = (f5 * 360.0f * (z2 ? 1 : -1)) + vs4Var.f;
                if5Var.a.b.b();
                if5Var.a(if5Var.a.b.l);
            }
        });
        this.n.addListener(new hf5(this, fArr, f, f2, z));
        this.n.setDuration(680L);
        this.n.setInterpolator(d53.h);
        this.n.start();
    }
}
