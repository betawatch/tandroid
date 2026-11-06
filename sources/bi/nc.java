package bi;

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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class nc extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 6:
                super(context);
                break;
            default:
                setOrientation(1);
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                this.b = l9Var;
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(35.0f));
                addView(l9Var, c8.ha.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, c8.ha.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, c8.ha.o(-1, -2));
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                Path path = (Path) this.c;
                if (((di.n0) this.d).a) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((ud) this.b) == null) {
                        this.b = new ud(1, qs.Z3);
                    }
                    ((ud) this.b).f(0, 0, getWidth(), getHeight());
                    ud udVar = (ud) this.b;
                    udVar.h = 30.0f;
                    udVar.d();
                    ((ud) this.b).b(canvas, -1, 0.85f);
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
                vp vpVar = (vp) this.d;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, vpVar.d0));
                int left = vpVar.E[0].getLeft() - org.telegram.messenger.g0.L(13.0f);
                float L = org.telegram.messenger.g0.L(91.0f);
                org.telegram.ui.ActionBar.f0 f0Var = vpVar.F;
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
    public nc(vp vpVar, Context context) {
        super(context);
        this.a = 5;
        this.d = vpVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(org.telegram.ui.Cells.c2 c2Var, Context context, int i7) {
        super(context);
        this.a = 4;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = c2Var.b;
        org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        if (i7 != 0) {
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i7);
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, false);
        this.c = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.r6.Z(j6Var, i10, f6Var);
        j6Var.setIncludeFontPadding(false);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, i10, f6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (org.telegram.messenger.hd.a0) {
            addView(view, c8.ha.t(16, 16, 16, 11, 0, 3, 0));
            addView(j6Var, c8.ha.t(-2, 16, 16, 0, 0, ((ImageView) this.b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.b;
            if (view2 != null) {
                addView(view2, c8.ha.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.b;
            if (view3 != null) {
                addView(view3, c8.ha.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(j6Var, c8.ha.t(-2, 16, 16, ((ImageView) this.b) == null ? 11 : 0, 0, 3, 0));
            addView(view, c8.ha.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 16, 16);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, f6Var);
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(di.n0 n0Var, Context context) {
        super(context);
        this.a = 1;
        this.d = n0Var;
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                gc gcVar = new gc(context, 70, 0, 1);
                frameLayout.addView(gcVar, c8.ha.c(-1.0f, -1));
                org.telegram.ui.Wallet.w6 w6Var = new org.telegram.ui.Wallet.w6(qs.A2, context, false);
                this.b = w6Var;
                w6Var.setStarParticlesView(gcVar);
                frameLayout.addView(w6Var, c8.ha.d(qs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                w6Var.setPaused(false);
                addView(frameLayout, c8.ha.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
                int i10 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
                textView.setGravity(17);
                addView(textView, c8.ha.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, i10, f6Var);
                textView2.setGravity(17);
                addView(textView2, c8.ha.t(-2, -2, 1, 0, 9, 0, 18));
                break;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new gc(context, 70, 0, 0), c8.ha.c(-1.0f, -1));
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                this.b = l9Var;
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                frameLayout2.addView(l9Var, c8.ha.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, c8.ha.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                com.google.android.recaptcha.internal.a.q(textView3, 1, 20.0f);
                int i11 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.V(textView3, i11, f6Var);
                textView3.setGravity(17);
                addView(textView3, c8.ha.t(-2, -2, 1, 0, 2, 0, 0));
                w70 w70Var = new w70(context, f6Var);
                this.d = w70Var;
                org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
                w70Var.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(w70Var, i11, f6Var);
                w70Var.setGravity(17);
                addView(w70Var, c8.ha.t(-2, -2, 1, 0, 9, 0, 18));
                break;
        }
    }
}
