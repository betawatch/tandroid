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
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x9 extends FrameLayout {
    public int E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final org.telegram.ui.ActionBar.h6 a;
    public final TextView b;
    public final org.telegram.ui.Components.o6 c;
    public final rh0 d;
    public org.telegram.ui.Components.q9 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final int s;
    public boolean w;
    public float x;
    public float y;

    public x9(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(0, context, h6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        setEnabled(z10);
        TextView textView = this.b;
        ImageView imageView = this.f;
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z10 ? 1.0f : 0.5f));
            if (o6Var.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(o6Var, "alpha", z10 ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z10 ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z10 ? 1.0f : 0.5f);
        if (o6Var.getVisibility() == 0) {
            o6Var.setAlpha(z10 ? 1.0f : 0.5f);
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
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (charSequence2 != null) {
            o6Var.c(charSequence2, z10, true);
            o6Var.setVisibility(0);
        } else {
            o6Var.setVisibility(4);
        }
        this.h = z11;
        setWillNotDraw(true ^ z11);
        requestLayout();
    }

    public final void d() {
        int i7 = hd.a0 ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i7 | 16);
        removeView(textView);
        int i10 = (hd.a0 ? 5 : 3) | 48;
        float f10 = this.s;
        addView(textView, c8.ma.d(-1, -1.0f, i10, f10, 0.0f, f10, 0.0f));
        int i11 = hd.a0 ? 3 : 5;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.setGravity(i11 | 16);
        removeView(o6Var);
        addView(o6Var, c8.ma.d(-2, -1.0f, (hd.a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, c8.ma.d(-2, -2.0f, (hd.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, c8.ma.d(-2, -2.0f, (hd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r || this.y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, this.a));
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
            if (hd.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.H);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.y);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? r0 : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
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
            addView(q9Var, c8.ma.d(24, 24.0f, (hd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.q9 q9Var = this.e;
        if (q9Var == null || q9Var.getImageReceiver() == null || !(this.e.getImageReceiver().t() instanceof org.telegram.ui.Components.p5)) {
            return;
        }
        ((org.telegram.ui.Components.p5) this.e.getImageReceiver().t()).n(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.b.getText());
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (o6Var == null || o6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) o6Var.getText());
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
        rh0 rh0Var = this.d;
        if (rh0Var.getVisibility() == 0) {
            rh0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.I) {
                i11 = o10.x(8.0f, rh0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.q9 q9Var = this.e;
        if (q9Var != null) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(q9Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.I) {
                i11 = o10.x(8.0f, this.e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (o6Var.getVisibility() == 0) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.I ? o10.x(8.0f, o6Var.getMeasuredWidth(), i11) : (measuredWidth - o6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = hd.a0;
                int i12 = this.s;
                if (z10) {
                    marginLayoutParams.leftMargin = o6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = o6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
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
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (o6Var.getVisibility() == 0) {
            o6Var.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
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
        rh0 rh0Var = this.d;
        if (i7 == 0) {
            rh0Var.setVisibility(8);
            boolean z10 = hd.a0;
            int i10 = this.s;
            if (z10) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10);
                return;
            }
        }
        rh0Var.setImageResource(i7);
        org.telegram.ui.ActionBar.t6.s(rh0Var, org.telegram.ui.ActionBar.m6.m6, this.a, PorterDuff.Mode.MULTIPLY);
        rh0Var.setBackground(null);
        rh0Var.setVisibility(0);
        if (hd.a0) {
            marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
        }
    }

    public void setTextColor(int i7) {
        TextView textView = this.b;
        org.telegram.ui.ActionBar.t6.q(textView);
        textView.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        org.telegram.ui.Components.o6 o6Var = this.c;
        org.telegram.ui.ActionBar.t6.q(o6Var);
        o6Var.setTextColor(i7);
    }

    public x9(Context context) {
        this(0, context, null);
    }

    public x9(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        boolean z10 = org.telegram.messenger.s2.a;
        this.I = false;
        this.a = h6Var;
        this.s = 21;
        TextView textView = new TextView(context);
        this.b = textView;
        o10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((hd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        float f10 = 21;
        addView(textView, c8.ma.d(-1, -1.0f, (hd.a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, !hd.a0);
        this.c = o6Var;
        o6Var.b(0.55f, 320L, nr.h);
        o6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        o6Var.setGravity((hd.a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.I6, h6Var);
        float f11 = 17;
        addView(o6Var, c8.ma.d(-2, -1.0f, (hd.a0 ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        rh0 rh0Var = new rh0(context);
        this.d = rh0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        rh0Var.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.m6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(rh0Var, i10, h6Var, mode);
        rh0Var.setVisibility(8);
        addView(rh0Var, c8.ma.d(-2, -2.0f, (hd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, mode);
        addView(imageView, c8.ma.d(-2, -2.0f, (hd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
