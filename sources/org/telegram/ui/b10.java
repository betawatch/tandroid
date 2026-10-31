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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b10 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public ValueAnimator D;
    public boolean E;
    public final org.telegram.ui.Components.t5 F;
    public final Paint G;
    public final /* synthetic */ FiltersSetupActivity H;
    public final org.telegram.ui.ActionBar.u5 a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final org.telegram.ui.Components.q20 n;
    public boolean r;
    public final org.telegram.ui.Components.t80 s;
    public boolean w;
    public float x;
    public org.telegram.messenger.ap y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b10(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var;
        this.H = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.r = false;
        this.F = new org.telegram.ui.Components.t5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
        this.G = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i10 = org.telegram.ui.ActionBar.t6.Ii;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, null, mode);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131750708, null));
        imageView.setClickable(true);
        addView(imageView, w7.b6.d(48, 48.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        addView(view, w7.b6.d(20, 20.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.a = u5Var;
        u5Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTextSize(16);
        u5Var.setMaxLines(1);
        u5Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        org.telegram.ui.ActionBar.a7.y(this, drawable, i10, null, mode);
        u5Var.i(drawable);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        p6Var = ((org.telegram.ui.ActionBar.k2) filtersSetupActivity).resourceProvider;
        u5Var.setEmojiColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        boolean z10 = org.telegram.messenger.cd.X;
        addView(u5Var, w7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 80.0f : 64.0f, 10.0f, z10 ? 64.0f : 80.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.z6, null);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = org.telegram.messenger.cd.X;
        addView(textView, w7.b6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 80.0f : 64.0f, 35.0f, z11 ? 64.0f : 80.0f, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.t80 t80Var = new org.telegram.ui.Components.t80();
        this.s = t80Var;
        t80Var.D = true;
        t80Var.t = 2.0f;
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i12, false);
        t80Var.g(org.telegram.ui.ActionBar.t6.r1(0.4f, x02), org.telegram.ui.ActionBar.t6.r1(1.0f, x02), org.telegram.ui.ActionBar.t6.r1(0.9f, x02), org.telegram.ui.ActionBar.t6.r1(1.7f, x02));
        int L = org.telegram.messenger.i0.L(1.0f);
        t80Var.x.setStrokeWidth(L);
        t80Var.k(40.0f);
        org.telegram.ui.Components.q20 q20Var = new org.telegram.ui.Components.q20(this, context, L, 1);
        this.n = q20Var;
        t80Var.setCallback(q20Var);
        q20Var.setFocusable(false);
        q20Var.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(x02, 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        q20Var.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(q20Var, h02, null, N, null);
        org.telegram.ui.ActionBar.a7.t(q20Var, i10, null, mode);
        q20Var.setContentDescription(org.telegram.messenger.cd.L0(2131750707, null));
        q20Var.setVisibility(8);
        q20Var.setImageResource(R.drawable.msg_link_folder);
        org.telegram.ui.ActionBar.a7.t(q20Var, i10, null, mode);
        boolean z12 = org.telegram.messenger.cd.X;
        addView(q20Var, w7.b6.d(40, 40.0f, (z12 ? 3 : 5) | 16, z12 ? 52.0f : 6.0f, 0.0f, z12 ? 6.0f : 52.0f, 0.0f));
        q20Var.setOnClickListener(new a(this, 25));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
        imageView2.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(imageView2, h03, null, N2, null);
        org.telegram.ui.ActionBar.a7.t(imageView2, i10, null, mode);
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        addView(imageView2, w7.b6.d(40, 40.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public org.telegram.messenger.ap getCurrentFilter() {
        return this.y;
    }

    public float getDraggingProgress() {
        return this.F.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d = this.F.d(this.E);
        if (d > 0.0f) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
            Paint paint = this.G;
            paint.setColor(x02);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(org.telegram.messenger.i0.L(12.0f) * d, 0.0f, org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.r1(d, 301989888));
            float L = org.telegram.messenger.i0.L(8.0f) * d;
            float L2 = org.telegram.messenger.i0.L(12.0f) * d;
            canvas.drawRoundRect(L, 0.0f, getWidth() - L, getHeight(), L2, L2, paint);
        }
        if (this.w && d < 1.0f) {
            int alpha = org.telegram.ui.ActionBar.t6.k0.getAlpha();
            org.telegram.ui.ActionBar.t6.k0.setAlpha((int) ((1.0f - d) * alpha));
            canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(62.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            org.telegram.ui.ActionBar.t6.k0.setAlpha(alpha);
        }
        org.telegram.messenger.ap apVar = this.y;
        if (apVar != null) {
            boolean z10 = apVar.p;
            if (z10) {
                float f7 = this.x;
                if (f7 != 1.0f) {
                    this.x = f7 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f10 = this.x;
                if (f10 != 0.0f) {
                    this.x = f10 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float i10 = Utilities.i(this.x, 1.0f, 0.0f);
        this.x = i10;
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.setRightDrawableScale(i10);
        u5Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
    }

    public void setDragging(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        invalidate();
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.c.setOnTouchListener(onTouchListener);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var;
        try {
            org.telegram.ui.ActionBar.u5 u5Var = this.a;
            if (u5Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.Ci;
                p6Var = ((org.telegram.ui.ActionBar.k2) this.H).resourceProvider;
                u5Var.setEmojiColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
