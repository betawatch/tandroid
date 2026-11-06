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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class w9 extends FrameLayout {
    public int D;
    public boolean E;
    public int F;
    public Paint G;
    public boolean H;
    public final org.telegram.ui.ActionBar.f6 a;
    public final TextView b;
    public final org.telegram.ui.Components.j6 c;
    public final ch0 d;
    public org.telegram.ui.Components.l9 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final int s;
    public boolean w;
    public float x;
    public float y;

    public w9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(0, context, f6Var);
    }

    public final void a(ArrayList arrayList, boolean z9) {
        setEnabled(z9);
        TextView textView = this.b;
        ImageView imageView = this.f;
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z9 ? 1.0f : 0.5f));
            if (j6Var.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(j6Var, "alpha", z9 ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z9 ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z9 ? 1.0f : 0.5f);
        if (j6Var.getVisibility() == 0) {
            j6Var.setAlpha(z9 ? 1.0f : 0.5f);
        }
        if (imageView.getVisibility() == 0) {
            imageView.setAlpha(z9 ? 1.0f : 0.5f);
        }
    }

    public final void b(CharSequence charSequence, boolean z9) {
        this.b.setText(charSequence);
        this.c.setVisibility(4);
        this.f.setVisibility(4);
        this.h = z9;
        setWillNotDraw(!z9);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z9, boolean z10) {
        this.b.setText(charSequence);
        this.f.setVisibility(4);
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (charSequence2 != null) {
            j6Var.c(charSequence2, z9, true);
            j6Var.setVisibility(0);
        } else {
            j6Var.setVisibility(4);
        }
        this.h = z10;
        setWillNotDraw(true ^ z10);
        requestLayout();
    }

    public final void d() {
        int i7 = hd.a0 ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i7 | 16);
        removeView(textView);
        int i10 = (hd.a0 ? 5 : 3) | 48;
        float f10 = this.s;
        addView(textView, c8.ha.d(-1, -1.0f, i10, f10, 0.0f, f10, 0.0f));
        int i11 = hd.a0 ? 3 : 5;
        org.telegram.ui.Components.j6 j6Var = this.c;
        j6Var.setGravity(i11 | 16);
        removeView(j6Var);
        addView(j6Var, c8.ha.d(-2, -1.0f, (hd.a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, c8.ha.d(-2, -2.0f, (hd.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, c8.ha.d(-2, -2.0f, (hd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r || this.y != 0.0f) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, this.a));
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
            int i7 = this.F;
            if (i7 > 0) {
                this.F = i7 - 15;
            } else {
                boolean z9 = this.r;
                if (z9) {
                    float f12 = this.y;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.y = f13;
                        if (f13 > 1.0f) {
                            this.y = 1.0f;
                        }
                    }
                }
                if (!z9) {
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
            this.G.setAlpha((int) (((this.x * 0.4f) + 0.6f) * this.y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            int measuredWidth = getMeasuredWidth();
            float f16 = this.s;
            rectF.set((measuredWidth - org.telegram.messenger.g0.L(f16)) - org.telegram.messenger.g0.L(this.D), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (hd.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.G);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.y);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? r0 : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public org.telegram.ui.Components.l9 getValueBackupImageView() {
        if (this.e == null) {
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
            this.e = l9Var;
            float f10 = this.s - 4;
            addView(l9Var, c8.ha.d(24, 24.0f, (hd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public org.telegram.ui.Components.j6 getValueTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.l9 l9Var = this.e;
        if (l9Var == null || l9Var.getImageReceiver() == null || !(this.e.getImageReceiver().t() instanceof org.telegram.ui.Components.i5)) {
            return;
        }
        ((org.telegram.ui.Components.i5) this.e.getImageReceiver().t()).n(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.b.getText());
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (j6Var == null || j6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) j6Var.getText());
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (!this.E || getParent() == null) {
            return;
        }
        this.F = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int i11 = this.H ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        ch0 ch0Var = this.d;
        if (ch0Var.getVisibility() == 0) {
            ch0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.H) {
                i11 = org.telegram.messenger.camera.q.w(8.0f, ch0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.l9 l9Var = this.e;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(l9Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.H) {
                i11 = org.telegram.messenger.camera.q.w(8.0f, this.e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (j6Var.getVisibility() == 0) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.H ? org.telegram.messenger.camera.q.w(8.0f, j6Var.getMeasuredWidth(), i11) : (measuredWidth - j6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z9 = hd.a0;
                int i12 = this.s;
                if (z9) {
                    marginLayoutParams.leftMargin = j6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = j6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                }
            }
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setBetterLayout(boolean z9) {
        this.H = z9;
    }

    public void setCanDisable(boolean z9) {
        this.n = z9;
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        float f10 = 1.0f;
        this.b.setAlpha((z9 || !this.n) ? 1.0f : 0.5f);
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (j6Var.getVisibility() == 0) {
            j6Var.setAlpha((z9 || !this.n) ? 1.0f : 0.5f);
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            if (!z9 && this.n) {
                f10 = 0.5f;
            }
            imageView.setAlpha(f10);
        }
    }

    public void setIcon(int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        ch0 ch0Var = this.d;
        if (i7 == 0) {
            ch0Var.setVisibility(8);
            boolean z9 = hd.a0;
            int i10 = this.s;
            if (z9) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10);
                return;
            }
        }
        ch0Var.setImageResource(i7);
        org.telegram.ui.ActionBar.r6.t(ch0Var, org.telegram.ui.ActionBar.k6.m6, this.a, PorterDuff.Mode.MULTIPLY);
        ch0Var.setBackground(null);
        ch0Var.setVisibility(0);
        if (hd.a0) {
            marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
        }
    }

    public void setTextColor(int i7) {
        TextView textView = this.b;
        org.telegram.ui.ActionBar.r6.r(textView);
        textView.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        org.telegram.ui.Components.j6 j6Var = this.c;
        org.telegram.ui.ActionBar.r6.r(j6Var);
        j6Var.setTextColor(i7);
    }

    public w9(Context context) {
        this(0, context, null);
    }

    public w9(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z9 = org.telegram.messenger.r2.a;
        this.H = false;
        this.a = f6Var;
        this.s = 21;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((hd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        float f10 = 21;
        addView(textView, c8.ha.d(-1, -1.0f, (hd.a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, !hd.a0);
        this.c = j6Var;
        j6Var.b(0.55f, 320L, xq.h);
        j6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        j6Var.setGravity((hd.a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.I6, f6Var);
        float f11 = 17;
        addView(j6Var, c8.ha.d(-2, -1.0f, (hd.a0 ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        ch0 ch0Var = new ch0(context);
        this.d = ch0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ch0Var.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.k6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(ch0Var, i10, f6Var, mode);
        ch0Var.setVisibility(8);
        addView(ch0Var, c8.ha.d(-2, -2.0f, (hd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, mode);
        addView(imageView, c8.ha.d(-2, -2.0f, (hd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
