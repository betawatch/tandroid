package ci;

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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.vp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gb extends LinearLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 6:
                super(context);
                break;
            default:
                setOrientation(1);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                this.b = k9Var;
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(35.0f));
                addView(k9Var, mf.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, mf.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, mf.o(-1, -2));
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                Path path = (Path) this.c;
                if (((ei.p0) this.d).a) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((lc) this.b) == null) {
                        this.b = new lc(1, hs.Z3);
                    }
                    ((lc) this.b).f(0, 0, getWidth(), getHeight());
                    lc lcVar = (lc) this.b;
                    lcVar.h = 30.0f;
                    lcVar.d();
                    ((lc) this.b).b(canvas, -1, 0.85f);
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
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, vpVar.e0));
                int left = vpVar.F[0].getLeft() - org.telegram.messenger.g0.L(13.0f);
                float L = org.telegram.messenger.g0.L(91.0f);
                org.telegram.ui.ActionBar.e0 e0Var = vpVar.G;
                if (e0Var.getVisibility() == 0) {
                    f10 = e0Var.getAlpha() * org.telegram.messenger.g0.L(25.0f);
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
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 4:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(vp vpVar, Context context) {
        super(context);
        this.a = 5;
        this.d = vpVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(org.telegram.ui.Cells.c2 c2Var, Context context, int i3) {
        super(context);
        this.a = 4;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = c2Var.b;
        org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        if (i3 != 0) {
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i3);
        }
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, false);
        this.c = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var, i10, e6Var);
        h6Var.setIncludeFontPadding(false);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (bd.a0) {
            addView(view, mf.t(16, 16, 16, 11, 0, 3, 0));
            addView(h6Var, mf.t(-2, 16, 16, 0, 0, ((ImageView) this.b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.b;
            if (view2 != null) {
                addView(view2, mf.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.b;
            if (view3 != null) {
                addView(view3, mf.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(h6Var, mf.t(-2, 16, 16, ((ImageView) this.b) == null ? 11 : 0, 0, 3, 0));
            addView(view, mf.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 16, 16);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, e6Var);
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(ei.p0 p0Var, Context context) {
        super(context);
        this.a = 1;
        this.d = p0Var;
        this.c = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                bb bbVar = new bb(context, 70, 0, 1);
                frameLayout.addView(bbVar, mf.c(-1.0f, -1));
                org.telegram.ui.Wallet.u6 u6Var = new org.telegram.ui.Wallet.u6(hs.A2, context, false);
                this.b = u6Var;
                u6Var.setStarParticlesView(bbVar);
                frameLayout.addView(u6Var, mf.d(hs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                u6Var.setPaused(false);
                addView(frameLayout, mf.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                k2.p1.t(textView, 1, 20.0f);
                int i10 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
                textView.setGravity(17);
                addView(textView, mf.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
                textView2.setGravity(17);
                addView(textView2, mf.t(-2, -2, 1, 0, 9, 0, 18));
                break;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new bb(context, 70, 0, 0), mf.c(-1.0f, -1));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                this.b = k9Var;
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                frameLayout2.addView(k9Var, mf.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, mf.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                k2.p1.t(textView3, 1, 20.0f);
                int i11 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.V(textView3, i11, e6Var);
                textView3.setGravity(17);
                addView(textView3, mf.t(-2, -2, 1, 0, 2, 0, 0));
                s70 s70Var = new s70(context, e6Var);
                this.d = s70Var;
                org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
                s70Var.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(s70Var, i11, e6Var);
                s70Var.setGravity(17);
                addView(s70Var, mf.t(-2, -2, 1, 0, 9, 0, 18));
                break;
        }
    }
}
