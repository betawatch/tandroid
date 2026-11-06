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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a00 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public ValueAnimator D;
    public boolean E;
    public final org.telegram.ui.Components.w5 F;
    public final Paint G;
    public final /* synthetic */ FiltersSetupActivity H;
    public final org.telegram.ui.ActionBar.k5 a;
    public final TextView b;
    public final ImageView c;
    public int d;
    public int e;
    public final View f;
    public final ImageView h;
    public final org.telegram.ui.Components.z10 n;
    public boolean r;
    public final org.telegram.ui.Components.a80 s;
    public boolean w;
    public float x;
    public org.telegram.messenger.vo y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.H = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.r = false;
        this.F = new org.telegram.ui.Components.w5(this, 0L, 420L, org.telegram.ui.Components.xq.h);
        this.G = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i7 = org.telegram.ui.ActionBar.k6.Ii;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i7, null, mode);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131750708, null));
        imageView.setClickable(true);
        addView(imageView, c8.ha.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f = view;
        addView(view, c8.ha.d(20, 20.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var;
        k5Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTextSize(16);
        k5Var.setMaxLines(1);
        k5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        org.telegram.ui.ActionBar.r6.y(this, drawable, i7, null, mode);
        k5Var.i(drawable);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        f6Var = ((org.telegram.ui.ActionBar.f2) filtersSetupActivity).resourceProvider;
        k5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        boolean z9 = org.telegram.messenger.hd.a0;
        addView(k5Var, c8.ha.d(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 80.0f : 64.0f, 10.0f, z9 ? 64.0f : 80.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.z6, null);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = org.telegram.messenger.hd.a0;
        addView(textView, c8.ha.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 80.0f : 64.0f, 35.0f, z10 ? 64.0f : 80.0f, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.a80 a80Var = new org.telegram.ui.Components.a80();
        this.s = a80Var;
        a80Var.D = true;
        a80Var.t = 2.0f;
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        a80Var.g(org.telegram.ui.ActionBar.k6.r1(0.4f, x02), org.telegram.ui.ActionBar.k6.r1(1.0f, x02), org.telegram.ui.ActionBar.k6.r1(0.9f, x02), org.telegram.ui.ActionBar.k6.r1(1.7f, x02));
        int L = org.telegram.messenger.g0.L(1.0f);
        a80Var.x.setStrokeWidth(L);
        a80Var.k(40.0f);
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(this, context, L, 1);
        this.n = z10Var;
        a80Var.setCallback(z10Var);
        z10Var.setFocusable(false);
        z10Var.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(x02, 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        z10Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(z10Var, h02, null, N, null);
        org.telegram.ui.ActionBar.r6.t(z10Var, i7, null, mode);
        z10Var.setContentDescription(org.telegram.messenger.hd.M0(2131750707, null));
        z10Var.setVisibility(8);
        z10Var.setImageResource(R.drawable.msg_link_folder);
        org.telegram.ui.ActionBar.r6.t(z10Var, i7, null, mode);
        boolean z11 = org.telegram.messenger.hd.a0;
        addView(z10Var, c8.ha.d(40, 40.0f, (z11 ? 3 : 5) | 16, z11 ? 52.0f : 6.0f, 0.0f, z11 ? 6.0f : 52.0f, 0.0f));
        z10Var.setOnClickListener(new a(this, 25));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        imageView2.setBackground(h03);
        org.telegram.ui.ActionBar.r6.k(imageView2, h03, null, N2, null);
        org.telegram.ui.ActionBar.r6.t(imageView2, i7, null, mode);
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        addView(imageView2, c8.ha.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public org.telegram.messenger.vo getCurrentFilter() {
        return this.y;
    }

    public float getDraggingProgress() {
        return this.F.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d = this.F.d(this.E);
        if (d > 0.0f) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
            Paint paint = this.G;
            paint.setColor(x02);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f) * d, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.r1(d, 301989888));
            float L = org.telegram.messenger.g0.L(8.0f) * d;
            float L2 = org.telegram.messenger.g0.L(12.0f) * d;
            canvas.drawRoundRect(L, 0.0f, getWidth() - L, getHeight(), L2, L2, paint);
        }
        if (this.w && d < 1.0f) {
            int alpha = org.telegram.ui.ActionBar.k6.k0.getAlpha();
            org.telegram.ui.ActionBar.k6.k0.setAlpha((int) ((1.0f - d) * alpha));
            canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(62.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            org.telegram.ui.ActionBar.k6.k0.setAlpha(alpha);
        }
        org.telegram.messenger.vo voVar = this.y;
        if (voVar != null) {
            boolean z9 = voVar.p;
            if (z9) {
                float f10 = this.x;
                if (f10 != 1.0f) {
                    this.x = f10 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z9) {
                float f11 = this.x;
                if (f11 != 0.0f) {
                    this.x = f11 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float i7 = Utilities.i(this.x, 1.0f, 0.0f);
        this.x = i7;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.setRightDrawableScale(i7);
        k5Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    public void setDragging(boolean z9) {
        if (this.E == z9) {
            return;
        }
        this.E = z9;
        invalidate();
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.c.setOnTouchListener(onTouchListener);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var;
        try {
            org.telegram.ui.ActionBar.k5 k5Var = this.a;
            if (k5Var != null) {
                int i7 = org.telegram.ui.ActionBar.k6.Ci;
                f6Var = ((org.telegram.ui.ActionBar.f2) this.H).resourceProvider;
                k5Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
