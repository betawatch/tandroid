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
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ph0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x9 extends FrameLayout {
    public int E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final org.telegram.ui.ActionBar.i6 a;
    public final TextView b;
    public final org.telegram.ui.Components.n6 c;
    public final ph0 d;
    public org.telegram.ui.Components.q9 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final int s;
    public boolean w;
    public float x;
    public float y;

    public x9(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(0, context, i6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        setEnabled(z10);
        TextView textView = this.b;
        ImageView imageView = this.f;
        org.telegram.ui.Components.n6 n6Var = this.c;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z10 ? 1.0f : 0.5f));
            if (n6Var.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(n6Var, "alpha", z10 ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z10 ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z10 ? 1.0f : 0.5f);
        if (n6Var.getVisibility() == 0) {
            n6Var.setAlpha(z10 ? 1.0f : 0.5f);
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
        org.telegram.ui.Components.n6 n6Var = this.c;
        if (charSequence2 != null) {
            n6Var.c(charSequence2, z10, true);
            n6Var.setVisibility(0);
        } else {
            n6Var.setVisibility(4);
        }
        this.h = z11;
        setWillNotDraw(true ^ z11);
        requestLayout();
    }

    public final void d() {
        int i7 = gd.a0 ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i7 | 16);
        removeView(textView);
        int i10 = (gd.a0 ? 5 : 3) | 48;
        float f10 = this.s;
        addView(textView, c8.ma.d(-1, -1.0f, i10, f10, 0.0f, f10, 0.0f));
        int i11 = gd.a0 ? 3 : 5;
        org.telegram.ui.Components.n6 n6Var = this.c;
        n6Var.setGravity(i11 | 16);
        removeView(n6Var);
        addView(n6Var, c8.ma.d(-2, -1.0f, (gd.a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, c8.ma.d(-2, -2.0f, (gd.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, c8.ma.d(-2, -2.0f, (gd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r || this.y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.O5, this.a));
            }
            if (this.w) {
                float f10 = this.x + 0.016f;
                this.x = f10;
                if (f10 > 1.0f) {
                    this.x = 1.0f;
                    this.w = false;
                }
            } else {
                float f11 = this.x - 0.016f;
                this.x = f11;
                if (f11 < 0.0f) {
                    this.x = 0.0f;
                    this.w = true;
                }
            }
            int i7 = this.G;
            if (i7 > 0) {
                this.G = i7 - 15;
            } else {
                boolean z10 = this.r;
                if (z10) {
                    float f12 = this.y;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.y = f13;
                        if (f13 > 1.0f) {
                            this.y = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f14 = this.y;
                    if (f14 != 0.0f) {
                        float f15 = f14 - 0.10666667f;
                        this.y = f15;
                        if (f15 < 0.0f) {
                            this.y = 0.0f;
                        }
                    }
                }
            }
            this.H.setAlpha((int) (((this.x * 0.4f) + 0.6f) * this.y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            int measuredWidth = getMeasuredWidth();
            float f16 = this.s;
            rectF.set((measuredWidth - org.telegram.messenger.g0.L(f16)) - org.telegram.messenger.g0.L(this.E), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (gd.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.H);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.y);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? r0 : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public org.telegram.ui.Components.q9 getValueBackupImageView() {
        if (this.e == null) {
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getContext());
            this.e = q9Var;
            float f10 = this.s - 4;
            addView(q9Var, c8.ma.d(24, 24.0f, (gd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public org.telegram.ui.Components.n6 getValueTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.q9 q9Var = this.e;
        if (q9Var == null || q9Var.getImageReceiver() == null || !(this.e.getImageReceiver().t() instanceof org.telegram.ui.Components.o5)) {
            return;
        }
        ((org.telegram.ui.Components.o5) this.e.getImageReceiver().t()).n(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.b.getText());
        org.telegram.ui.Components.n6 n6Var = this.c;
        if (n6Var == null || n6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) n6Var.getText());
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (!this.F || getParent() == null) {
            return;
        }
        this.G = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int i11 = this.I ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        ph0 ph0Var = this.d;
        if (ph0Var.getVisibility() == 0) {
            ph0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.I) {
                i11 = n10.x(8.0f, ph0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.q9 q9Var = this.e;
        if (q9Var != null) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(q9Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.I) {
                i11 = n10.x(8.0f, this.e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.n6 n6Var = this.c;
        if (n6Var.getVisibility() == 0) {
            n6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.I ? n10.x(8.0f, n6Var.getMeasuredWidth(), i11) : (measuredWidth - n6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = gd.a0;
                int i12 = this.s;
                if (z10) {
                    marginLayoutParams.leftMargin = n6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = n6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                }
            }
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setBetterLayout(boolean z10) {
        this.I = z10;
    }

    public void setCanDisable(boolean z10) {
        this.n = z10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        float f10 = 1.0f;
        this.b.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
        org.telegram.ui.Components.n6 n6Var = this.c;
        if (n6Var.getVisibility() == 0) {
            n6Var.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.n) {
                f10 = 0.5f;
            }
            imageView.setAlpha(f10);
        }
    }

    public void setIcon(int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        ph0 ph0Var = this.d;
        if (i7 == 0) {
            ph0Var.setVisibility(8);
            boolean z10 = gd.a0;
            int i10 = this.s;
            if (z10) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10);
                return;
            }
        }
        ph0Var.setImageResource(i7);
        org.telegram.ui.ActionBar.u6.s(ph0Var, org.telegram.ui.ActionBar.n6.m6, this.a, PorterDuff.Mode.MULTIPLY);
        ph0Var.setBackground(null);
        ph0Var.setVisibility(0);
        if (gd.a0) {
            marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
        }
    }

    public void setTextColor(int i7) {
        TextView textView = this.b;
        org.telegram.ui.ActionBar.u6.q(textView);
        textView.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        org.telegram.ui.Components.n6 n6Var = this.c;
        org.telegram.ui.ActionBar.u6.q(n6Var);
        n6Var.setTextColor(i7);
    }

    public x9(Context context) {
        this(0, context, null);
    }

    public x9(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        boolean z10 = org.telegram.messenger.s2.a;
        this.I = false;
        this.a = i6Var;
        this.s = 21;
        TextView textView = new TextView(context);
        this.b = textView;
        n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((gd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        float f10 = 21;
        addView(textView, c8.ma.d(-1, -1.0f, (gd.a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, !gd.a0);
        this.c = n6Var;
        n6Var.b(0.55f, 320L, lr.h);
        n6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        n6Var.setGravity((gd.a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.I6, i6Var);
        float f11 = 17;
        addView(n6Var, c8.ma.d(-2, -1.0f, (gd.a0 ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        ph0 ph0Var = new ph0(context);
        this.d = ph0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ph0Var.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.n6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(ph0Var, i10, i6Var, mode);
        ph0Var.setVisibility(8);
        addView(ph0Var, c8.ma.d(-2, -2.0f, (gd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, mode);
        addView(imageView, c8.ma.d(-2, -2.0f, (gd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
