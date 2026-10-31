package og;

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
import kg.f2;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.messenger.w3;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p80;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s extends FrameLayout {
    public final kg.h a;
    public final p b;
    public final TextView c;
    public final p80 d;
    public final p6 e;
    public final ji.a f;
    public final Paint[] h;
    public ValueAnimator n;

    public s(Context context, p6 p6Var) {
        super(context);
        this.e = p6Var;
        LinearLayout f7 = m5.f(context, 1);
        kg.h hVar = new kg.h(context, 1, 0, 2);
        this.a = hVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = t6.Ak;
        canvas.drawColor(i0.b.f(0.5f, t6.w0(i10, p6Var), t6.w0(t6.h5, p6Var)));
        hVar.setBackgroundBitmap(createBitmap);
        lg.h hVar2 = hVar.b;
        hVar2.z = i10;
        hVar2.A = t6.zk;
        hVar2.b();
        f7.addView(hVar, b6.r(zs.q2, zs.q2, 1));
        p pVar = new p(this, context);
        this.b = pVar;
        this.h = new Paint[20];
        a(0.0f);
        f2 f2Var = pVar.a;
        f2Var.q = false;
        f2Var.K = false;
        f2Var.L = true;
        f2Var.H = true;
        f2Var.l = new jg.v(this, 1);
        f2Var.c();
        hVar.setStarParticlesView(pVar);
        TextView textView = new TextView(context);
        this.c = textView;
        z20.n(textView, 1, 22.0f);
        int i11 = t6.G6;
        a7.V(textView, i11, p6Var);
        textView.setGravity(1);
        f7.addView(textView, b6.t(-2, -2, 1, 24, -8, 24, 0));
        ji.a aVar = new ji.a(this);
        this.f = aVar;
        p80 p80Var = new p80(context, aVar, p6Var);
        this.d = p80Var;
        p80Var.setTextSize(1, 15.0f);
        p80Var.setGravity(17);
        a7.V(p80Var, i11, p6Var);
        p80Var.setMovementMethod(LinkMovementMethod.getInstance());
        a7.H(p80Var, t6.J6, p6Var);
        p80Var.setImportantForAccessibility(2);
        f7.addView(p80Var, b6.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(pVar, b6.e(-1, zs.J3, 48));
        addView(f7);
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        int i10 = t6.zk;
        p6 p6Var = this.e;
        int w02 = t6.w0(i10, p6Var);
        int w03 = t6.w0(t6.Ak, p6Var);
        int f10 = i0.b.f(f7, w02, -371690);
        int f11 = i0.b.f(f7, w03, -14281);
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i11 >= paintArr.length) {
                return;
            }
            paintArr[i11] = new Paint(1);
            paintArr[i11].setColorFilter(new PorterDuffColorFilter(i0.b.f(i11 / (paintArr.length - 1), f10, f11), PorterDuff.Mode.SRC_IN));
            i11++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ji.a aVar = this.f;
        if (aVar != null) {
            canvas.save();
            p80 p80Var = this.d;
            canvas.translate(p80Var.getLeft(), p80Var.getTop());
            if (aVar.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        kg.h hVar = this.a;
        p pVar = this.b;
        pVar.setTranslationY(((hVar.getMeasuredHeight() / 2.0f) + hVar.getTop()) - (pVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new q());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -i0.L(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = t6.a7;
        p6 p6Var = this.e;
        a7.i(i10, this, p6Var);
        this.c.setText(cd.a0("BoostingBoostsViaGifts", null, 2131753562, new Object[0]));
        String a02 = cd.a0(null, null, w3.V(chat) ? 2131753510 : 2131753505, new Object[0]);
        p80 p80Var = this.d;
        p80Var.setText(a02);
        a7.V(p80Var, t6.r5, p6Var);
    }

    public void setPaused(boolean z10) {
        this.a.setPaused(z10);
        this.b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kg.h hVar = this.a;
        final float f7 = hVar.b.l;
        final float f10 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        i0.r(hVar.e0);
        hVar.d();
        hVar.l();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: og.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                s sVar = s.this;
                float[] fArr2 = fArr;
                float f11 = f7;
                float f12 = f10;
                boolean z11 = z10;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f13 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                sVar.a.b.l = i0.T1(f11, f12, floatValue);
                lg.h hVar2 = sVar.a.b;
                hVar2.f = (f13 * 360.0f * (z11 ? 1 : -1)) + hVar2.f;
                sVar.a.b.b();
                sVar.a(sVar.a.b.l);
            }
        });
        this.n.addListener(new r(this, fArr, f7, f10, z10));
        this.n.setDuration(680L);
        this.n.setInterpolator(gr.h);
        this.n.start();
    }
}
