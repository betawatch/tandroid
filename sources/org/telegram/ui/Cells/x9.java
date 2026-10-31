package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x9 extends FrameLayout {
    public int D;
    public boolean E;
    public int F;
    public Paint G;
    public boolean H;
    public final org.telegram.ui.ActionBar.p6 a;
    public final TextView b;
    public final org.telegram.ui.Components.f6 c;
    public final ei0 d;
    public org.telegram.ui.Components.g9 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final int s;
    public boolean w;
    public float x;
    public float y;

    public x9(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(0, context, p6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        setEnabled(z10);
        TextView textView = this.b;
        ImageView imageView = this.f;
        org.telegram.ui.Components.f6 f6Var = this.c;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z10 ? 1.0f : 0.5f));
            if (f6Var.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(f6Var, "alpha", z10 ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z10 ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z10 ? 1.0f : 0.5f);
        if (f6Var.getVisibility() == 0) {
            f6Var.setAlpha(z10 ? 1.0f : 0.5f);
        }
        if (imageView.getVisibility() == 0) {
            imageView.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.b.setText(charSequence);
        this.c.setVisibility(4);
        this.f.setVisibility(4);
        this.h = z10;
        setWillNotDraw(!z10);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.b.setText(charSequence);
        this.f.setVisibility(4);
        org.telegram.ui.Components.f6 f6Var = this.c;
        if (charSequence2 != null) {
            f6Var.c(charSequence2, z10, true);
            f6Var.setVisibility(0);
        } else {
            f6Var.setVisibility(4);
        }
        this.h = z11;
        setWillNotDraw(true ^ z11);
        requestLayout();
    }

    public final void d() {
        int i10 = cd.X ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i10 | 16);
        removeView(textView);
        int i11 = (cd.X ? 5 : 3) | 48;
        float f7 = this.s;
        addView(textView, w7.b6.d(-1, -1.0f, i11, f7, 0.0f, f7, 0.0f));
        int i12 = cd.X ? 3 : 5;
        org.telegram.ui.Components.f6 f6Var = this.c;
        f6Var.setGravity(i12 | 16);
        removeView(f6Var);
        addView(f6Var, w7.b6.d(-2, -1.0f, (cd.X ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, w7.b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, w7.b6.d(-2, -2.0f, (cd.X ? 3 : 5) | 16, f7, 0.0f, f7, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r || this.y != 0.0f) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.O5, this.a));
            }
            if (this.w) {
                float f7 = this.x + 0.016f;
                this.x = f7;
                if (f7 > 1.0f) {
                    this.x = 1.0f;
                    this.w = false;
                }
            } else {
                float f10 = this.x - 0.016f;
                this.x = f10;
                if (f10 < 0.0f) {
                    this.x = 0.0f;
                    this.w = true;
                }
            }
            int i10 = this.F;
            if (i10 > 0) {
                this.F = i10 - 15;
            } else {
                boolean z10 = this.r;
                if (z10) {
                    float f11 = this.y;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.10666667f;
                        this.y = f12;
                        if (f12 > 1.0f) {
                            this.y = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f13 = this.y;
                    if (f13 != 0.0f) {
                        float f14 = f13 - 0.10666667f;
                        this.y = f14;
                        if (f14 < 0.0f) {
                            this.y = 0.0f;
                        }
                    }
                }
            }
            this.G.setAlpha((int) (((this.x * 0.4f) + 0.6f) * this.y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.i0.P;
            int measuredWidth = getMeasuredWidth();
            float f15 = this.s;
            rectF.set((measuredWidth - org.telegram.messenger.i0.L(f15)) - org.telegram.messenger.i0.L(this.D), measuredHeight - org.telegram.messenger.i0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(3.0f) + measuredHeight);
            if (cd.X) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), this.G);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.y);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? r0 : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public org.telegram.ui.Components.g9 getValueBackupImageView() {
        if (this.e == null) {
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
            this.e = g9Var;
            float f7 = this.s - 4;
            addView(g9Var, w7.b6.d(24, 24.0f, (cd.X ? 3 : 5) | 16, f7, 0.0f, f7, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public org.telegram.ui.Components.f6 getValueTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.g9 g9Var = this.e;
        if (g9Var == null || g9Var.getImageReceiver() == null || !(this.e.getImageReceiver().t() instanceof org.telegram.ui.Components.f5)) {
            return;
        }
        ((org.telegram.ui.Components.f5) this.e.getImageReceiver().t()).n(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.b.getText());
        org.telegram.ui.Components.f6 f6Var = this.c;
        if (f6Var == null || f6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) f6Var.getText());
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.E || getParent() == null) {
            return;
        }
        this.F = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.i0.L(34.0f);
        int i12 = this.H ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        ei0 ei0Var = this.d;
        if (ei0Var.getVisibility() == 0) {
            ei0Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.H) {
                i12 = z20.w(8.0f, ei0Var.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.g9 g9Var = this.e;
        if (g9Var != null) {
            g9Var.measure(View.MeasureSpec.makeMeasureSpec(g9Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.H) {
                i12 = z20.w(8.0f, this.e.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.f6 f6Var = this.c;
        if (f6Var.getVisibility() == 0) {
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.H ? z20.w(8.0f, f6Var.getMeasuredWidth(), i12) : (measuredWidth - f6Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = cd.X;
                int i13 = this.s;
                if (z10) {
                    marginLayoutParams.leftMargin = f6Var.getMeasuredWidth() + org.telegram.messenger.i0.L(i13 + 4);
                } else {
                    marginLayoutParams.rightMargin = f6Var.getMeasuredWidth() + org.telegram.messenger.i0.L(i13 + 4);
                }
            }
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setBetterLayout(boolean z10) {
        this.H = z10;
    }

    public void setCanDisable(boolean z10) {
        this.n = z10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        float f7 = 1.0f;
        this.b.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
        org.telegram.ui.Components.f6 f6Var = this.c;
        if (f6Var.getVisibility() == 0) {
            f6Var.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.n) {
                f7 = 0.5f;
            }
            imageView.setAlpha(f7);
        }
    }

    public void setIcon(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        ei0 ei0Var = this.d;
        if (i10 == 0) {
            ei0Var.setVisibility(8);
            boolean z10 = cd.X;
            int i11 = this.s;
            if (z10) {
                marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(i11);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(i11);
                return;
            }
        }
        ei0Var.setImageResource(i10);
        org.telegram.ui.ActionBar.a7.t(ei0Var, org.telegram.ui.ActionBar.t6.m6, this.a, PorterDuff.Mode.MULTIPLY);
        ei0Var.setBackground(null);
        ei0Var.setVisibility(0);
        if (cd.X) {
            marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
        }
    }

    public void setTextColor(int i10) {
        TextView textView = this.b;
        org.telegram.ui.ActionBar.a7.r(textView);
        textView.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        org.telegram.ui.Components.f6 f6Var = this.c;
        org.telegram.ui.ActionBar.a7.r(f6Var);
        f6Var.setTextColor(i10);
    }

    public x9(Context context) {
        this(0, context, null);
    }

    public x9(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        boolean z10 = org.telegram.messenger.v2.a;
        this.H = false;
        this.a = p6Var;
        this.s = 21;
        TextView textView = new TextView(context);
        this.b = textView;
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((cd.X ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        float f7 = 21;
        addView(textView, w7.b6.d(-1, -1.0f, (cd.X ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, !cd.X);
        this.c = f6Var;
        f6Var.b(0.55f, 320L, gr.h);
        f6Var.setTextSize(org.telegram.messenger.i0.L(16.0f));
        f6Var.setGravity((cd.X ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.I6, p6Var);
        float f10 = 17;
        addView(f6Var, w7.b6.d(-2, -1.0f, (cd.X ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        ei0 ei0Var = new ei0(context);
        this.d = ei0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ei0Var.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.t6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(ei0Var, i11, p6Var, mode);
        ei0Var.setVisibility(8);
        addView(ei0Var, w7.b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, mode);
        addView(imageView, w7.b6.d(-2, -2.0f, (cd.X ? 3 : 5) | 16, f7, 0.0f, f7, 0.0f));
    }
}
