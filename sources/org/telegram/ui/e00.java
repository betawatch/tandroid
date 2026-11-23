package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public ValueAnimator E;
    public boolean F;
    public final org.telegram.ui.Components.c6 G;
    public final Paint H;
    public final /* synthetic */ FiltersSetupActivity I;
    public final org.telegram.ui.ActionBar.n5 a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final org.telegram.ui.Components.k20 n;
    public boolean r;
    public final org.telegram.ui.Components.n80 s;
    public boolean w;
    public float x;
    public org.telegram.messenger.ro y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.i6 i6Var;
        this.I = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.r = false;
        this.G = new org.telegram.ui.Components.c6(this, 0L, 420L, org.telegram.ui.Components.kr.h);
        this.H = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i7 = org.telegram.ui.ActionBar.n6.Li;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, null, mode);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131750693, null));
        imageView.setClickable(true);
        addView(imageView, c8.na.d(48, 48.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        addView(view, c8.na.d(20, 20.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.a = n5Var;
        n5Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTextSize(16);
        n5Var.setMaxLines(1);
        n5Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        org.telegram.ui.ActionBar.u6.x(this, drawable, i7, null, mode);
        n5Var.i(drawable);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        i6Var = ((org.telegram.ui.ActionBar.g2) filtersSetupActivity).resourceProvider;
        n5Var.setEmojiColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        boolean z10 = org.telegram.messenger.gd.a0;
        addView(n5Var, c8.na.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 80.0f : 64.0f, 10.0f, z10 ? 64.0f : 80.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.z6, null);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = org.telegram.messenger.gd.a0;
        addView(textView, c8.na.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 80.0f : 64.0f, 35.0f, z11 ? 64.0f : 80.0f, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.n80 n80Var = new org.telegram.ui.Components.n80();
        this.s = n80Var;
        n80Var.D = true;
        n80Var.t = 2.0f;
        int i11 = org.telegram.ui.ActionBar.n6.i6;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i11, false);
        n80Var.g(org.telegram.ui.ActionBar.n6.r1(0.4f, x02), org.telegram.ui.ActionBar.n6.r1(1.0f, x02), org.telegram.ui.ActionBar.n6.r1(0.9f, x02), org.telegram.ui.ActionBar.n6.r1(1.7f, x02));
        int L = org.telegram.messenger.g0.L(1.0f);
        n80Var.x.setStrokeWidth(L);
        n80Var.k(40.0f);
        org.telegram.ui.Components.k20 k20Var = new org.telegram.ui.Components.k20(this, context, L, 1);
        this.n = k20Var;
        n80Var.setCallback(k20Var);
        k20Var.setFocusable(false);
        k20Var.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(x02, 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        k20Var.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(k20Var, h02, null, M, null);
        org.telegram.ui.ActionBar.u6.s(k20Var, i7, null, mode);
        k20Var.setContentDescription(org.telegram.messenger.gd.N0(2131750692, null));
        k20Var.setVisibility(8);
        k20Var.setImageResource(R.drawable.msg_link_folder);
        org.telegram.ui.ActionBar.u6.s(k20Var, i7, null, mode);
        boolean z12 = org.telegram.messenger.gd.a0;
        addView(k20Var, c8.na.d(40, 40.0f, (z12 ? 3 : 5) | 16, z12 ? 52.0f : 6.0f, 0.0f, z12 ? 6.0f : 52.0f, 0.0f));
        k20Var.setOnClickListener(new a(this, 25));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        imageView2.setBackground(h03);
        org.telegram.ui.ActionBar.u6.j(imageView2, h03, null, M2, null);
        org.telegram.ui.ActionBar.u6.s(imageView2, i7, null, mode);
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        addView(imageView2, c8.na.d(40, 40.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public org.telegram.messenger.ro getCurrentFilter() {
        return this.y;
    }

    public float getDraggingProgress() {
        return this.G.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d = this.G.d(this.F);
        if (d > 0.0f) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false);
            Paint paint = this.H;
            paint.setColor(x02);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f) * d, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.r1(d, 301989888));
            float L = org.telegram.messenger.g0.L(8.0f) * d;
            float L2 = org.telegram.messenger.g0.L(12.0f) * d;
            canvas.drawRoundRect(L, 0.0f, getWidth() - L, getHeight(), L2, L2, paint);
        }
        if (this.w && d < 1.0f) {
            int alpha = org.telegram.ui.ActionBar.n6.k0.getAlpha();
            org.telegram.ui.ActionBar.n6.k0.setAlpha((int) ((1.0f - d) * alpha));
            canvas.drawLine(org.telegram.messenger.gd.a0 ? 0.0f : org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(62.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
            org.telegram.ui.ActionBar.n6.k0.setAlpha(alpha);
        }
        org.telegram.messenger.ro roVar = this.y;
        if (roVar != null) {
            boolean z10 = roVar.p;
            if (z10) {
                float f10 = this.x;
                if (f10 != 1.0f) {
                    this.x = f10 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f11 = this.x;
                if (f11 != 0.0f) {
                    this.x = f11 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float i7 = Utilities.i(this.x, 1.0f, 0.0f);
        this.x = i7;
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.setRightDrawableScale(i7);
        n5Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    public void setDragging(boolean z10) {
        if (this.F == z10) {
            return;
        }
        this.F = z10;
        invalidate();
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.c.setOnTouchListener(onTouchListener);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var;
        try {
            org.telegram.ui.ActionBar.n5 n5Var = this.a;
            if (n5Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Fi;
                i6Var = ((org.telegram.ui.ActionBar.g2) this.I).resourceProvider;
                n5Var.setEmojiColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
