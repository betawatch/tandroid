package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.g0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p80;
import rh.o7;
import rh.s8;
import sc.e;
import th.c0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                super(context);
                break;
            default:
                setOrientation(1);
                g9 g9Var = new g9(context);
                this.b = g9Var;
                g9Var.setRoundRadius(i0.L(35.0f));
                addView(g9Var, b6.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(i0.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, b6.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(i0.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, b6.o(-1, -2));
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 5:
                Path path = (Path) this.c;
                if (((c0) this.d).a) {
                    path.rewind();
                    RectF rectF = i0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, i0.L(13.0f), i0.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((s8) this.b) == null) {
                        this.b = new s8(1, zs.Z3);
                    }
                    ((s8) this.b).f(0, 0, getWidth(), getHeight());
                    s8 s8Var = (s8) this.b;
                    s8Var.h = 30.0f;
                    s8Var.d();
                    ((s8) this.b).b(canvas, -1, 0.85f);
                    invalidate();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        float f7;
        switch (this.a) {
            case 3:
                RectF rectF = (RectF) this.b;
                Paint paint = (Paint) this.c;
                cq cqVar = (cq) this.d;
                paint.setColor(t6.w0(t6.i5, cqVar.d0));
                int left = cqVar.E[0].getLeft() - i0.L(13.0f);
                float L = i0.L(91.0f);
                g0 g0Var = cqVar.F;
                if (g0Var.getVisibility() == 0) {
                    f7 = g0Var.getAlpha() * i0.L(25.0f);
                } else {
                    f7 = 0.0f;
                }
                rectF.set(left, i0.L(5.0f), left + ((int) (L + f7)), i0.L(37.0f));
                canvas.drawRoundRect(rectF, i0.L(16.0f), i0.L(16.0f), paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i0.L(32.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(cq cqVar, Context context) {
        super(context);
        this.a = 3;
        this.d = cqVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c2 c2Var, Context context, int i10) {
        super(context);
        this.a = 2;
        int i11 = t6.G6;
        p6 p6Var = c2Var.b;
        t6.w0(i11, p6Var);
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            a7.t(imageView, i11, p6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i10);
        }
        f6 f6Var = new f6(context, false, true, false);
        this.c = f6Var;
        f6Var.setTextSize(i0.L(13.0f));
        a7.Z(f6Var, i11, p6Var);
        f6Var.setIncludeFontPadding(false);
        f6Var.setTypeface(i0.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        a7.y(this, mutate, i11, p6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (cd.X) {
            addView(view, b6.t(16, 16, 16, 11, 0, 3, 0));
            addView(f6Var, b6.t(-2, 16, 16, 0, 0, ((ImageView) this.b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.b;
            if (view2 != null) {
                addView(view2, b6.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.b;
            if (view3 != null) {
                addView(view3, b6.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(f6Var, b6.t(-2, 16, 16, ((ImageView) this.b) == null ? 11 : 0, 0, 3, 0));
            addView(view, b6.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i12 = t6.i6;
        Drawable a02 = t6.a0(t6.w0(i12, p6Var), 16, 16);
        w6 N = a7.N(i12);
        setBackground(a02);
        a7.k(this, a02, null, N, p6Var);
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c0 c0Var, Context context) {
        super(context);
        this.a = 5;
        this.d = c0Var;
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, Context context, p6 p6Var) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 6:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                o7 o7Var = new o7(context, 70, 0, 1);
                frameLayout.addView(o7Var, b6.c(-1.0f, -1));
                org.telegram.ui.Wallet.a7 a7Var = new org.telegram.ui.Wallet.a7(zs.A2, context, false);
                this.b = a7Var;
                a7Var.setStarParticlesView(o7Var);
                frameLayout.addView(a7Var, b6.d(zs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                a7Var.setPaused(false);
                addView(frameLayout, b6.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                e.t(textView, 1, 20.0f);
                int i11 = t6.j5;
                a7.V(textView, i11, p6Var);
                textView.setGravity(17);
                addView(textView, b6.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                a7.V(textView2, i11, p6Var);
                textView2.setGravity(17);
                addView(textView2, b6.t(-2, -2, 1, 0, 9, 0, 18));
                break;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new o7(context, 70, 0, 0), b6.c(-1.0f, -1));
                g9 g9Var = new g9(context);
                this.b = g9Var;
                g9Var.setRoundRadius(i0.L(50.0f));
                frameLayout2.addView(g9Var, b6.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, b6.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                e.t(textView3, 1, 20.0f);
                int i12 = t6.j5;
                a7.V(textView3, i12, p6Var);
                textView3.setGravity(17);
                addView(textView3, b6.t(-2, -2, 1, 0, 2, 0, 0));
                p80 p80Var = new p80(context, p6Var);
                this.d = p80Var;
                a7.H(p80Var, t6.Uc, p6Var);
                p80Var.setTextSize(1, 14.0f);
                a7.V(p80Var, i12, p6Var);
                p80Var.setGravity(17);
                addView(p80Var, b6.t(-2, -2, 1, 0, 9, 0, 18));
                break;
        }
    }
}
