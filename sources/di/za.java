package di;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mq;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class za extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 6:
                super(context);
                break;
            default:
                setOrientation(1);
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                this.b = q9Var;
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(35.0f));
                addView(q9Var, c8.ma.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, c8.ma.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, c8.ma.o(-1, -2));
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                Path path = (Path) this.c;
                if (((fi.m0) this.d).a) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((ec) this.b) == null) {
                        this.b = new ec(1, ls.Z3);
                    }
                    ((ec) this.b).f(0, 0, getWidth(), getHeight());
                    ec ecVar = (ec) this.b;
                    ecVar.h = 30.0f;
                    ecVar.d();
                    ((ec) this.b).b(canvas, -1, 0.85f);
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
        float f10;
        switch (this.a) {
            case 5:
                RectF rectF = (RectF) this.b;
                Paint paint = (Paint) this.c;
                mq mqVar = (mq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i5, mqVar.e0));
                int left = mqVar.F[0].getLeft() - org.telegram.messenger.g0.L(13.0f);
                float L = org.telegram.messenger.g0.L(91.0f);
                org.telegram.ui.ActionBar.f0 f0Var = mqVar.G;
                if (f0Var.getVisibility() == 0) {
                    f10 = f0Var.getAlpha() * org.telegram.messenger.g0.L(25.0f);
                } else {
                    f10 = 0.0f;
                }
                rectF.set(left, org.telegram.messenger.g0.L(5.0f), left + ((int) (L + f10)), org.telegram.messenger.g0.L(37.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(mq mqVar, Context context) {
        super(context);
        this.a = 5;
        this.d = mqVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(org.telegram.ui.Cells.d2 d2Var, Context context, int i7) {
        super(context);
        this.a = 4;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = d2Var.b;
        org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        if (i7 != 0) {
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i7);
        }
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, false);
        this.c = o6Var;
        o6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.t6.Y(o6Var, i10, h6Var);
        o6Var.setIncludeFontPadding(false);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, i10, h6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (hd.a0) {
            addView(view, c8.ma.t(16, 16, 16, 11, 0, 3, 0));
            addView(o6Var, c8.ma.t(-2, 16, 16, 0, 0, ((ImageView) this.b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.b;
            if (view2 != null) {
                addView(view2, c8.ma.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.b;
            if (view3 != null) {
                addView(view3, c8.ma.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(o6Var, c8.ma.t(-2, 16, 16, ((ImageView) this.b) == null ? 11 : 0, 0, 3, 0));
            addView(view, c8.ma.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i11 = org.telegram.ui.ActionBar.m6.i6;
        Drawable a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 16, 16);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(this, a02, null, M, h6Var);
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(fi.m0 m0Var, Context context) {
        super(context);
        this.a = 1;
        this.d = m0Var;
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                ua uaVar = new ua(context, 70, 0, 1);
                frameLayout.addView(uaVar, c8.ma.c(-1.0f, -1));
                org.telegram.ui.Wallet.m7 m7Var = new org.telegram.ui.Wallet.m7(ls.A2, context, false);
                this.b = m7Var;
                m7Var.setStarParticlesView(uaVar);
                frameLayout.addView(m7Var, c8.ma.d(ls.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                m7Var.setPaused(false);
                addView(frameLayout, c8.ma.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                i5.c.x(textView, 1, 20.0f);
                int i10 = org.telegram.ui.ActionBar.m6.j5;
                org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
                textView.setGravity(17);
                addView(textView, c8.ma.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView2, i10, h6Var);
                textView2.setGravity(17);
                addView(textView2, c8.ma.t(-2, -2, 1, 0, 9, 0, 18));
                break;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new ua(context, 70, 0, 0), c8.ma.c(-1.0f, -1));
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                this.b = q9Var;
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                frameLayout2.addView(q9Var, c8.ma.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, c8.ma.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                i5.c.x(textView3, 1, 20.0f);
                int i11 = org.telegram.ui.ActionBar.m6.j5;
                org.telegram.ui.ActionBar.t6.U(textView3, i11, h6Var);
                textView3.setGravity(17);
                addView(textView3, c8.ma.t(-2, -2, 1, 0, 2, 0, 0));
                m80 m80Var = new m80(context, h6Var);
                this.d = m80Var;
                org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
                m80Var.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(m80Var, i11, h6Var);
                m80Var.setGravity(17);
                addView(m80Var, c8.ma.t(-2, -2, 1, 0, 9, 0, 18));
                break;
        }
    }
}
