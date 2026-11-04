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
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v9 extends FrameLayout {
    public int E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final org.telegram.ui.ActionBar.e6 a;
    public final TextView b;
    public final org.telegram.ui.Components.h6 c;
    public final fh0 d;
    public org.telegram.ui.Components.k9 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final int s;
    public boolean w;
    public float x;
    public float y;

    public v9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(0, context, e6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        setEnabled(z10);
        TextView textView = this.b;
        ImageView imageView = this.f;
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z10 ? 1.0f : 0.5f));
            if (h6Var.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(h6Var, "alpha", z10 ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z10 ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z10 ? 1.0f : 0.5f);
        if (h6Var.getVisibility() == 0) {
            h6Var.setAlpha(z10 ? 1.0f : 0.5f);
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
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (charSequence2 != null) {
            h6Var.c(charSequence2, z10, true);
            h6Var.setVisibility(0);
        } else {
            h6Var.setVisibility(4);
        }
        this.h = z11;
        setWillNotDraw(true ^ z11);
        requestLayout();
    }

    public final void d() {
        int i3 = bd.a0 ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i3 | 16);
        removeView(textView);
        int i10 = (bd.a0 ? 5 : 3) | 48;
        float f10 = this.s;
        addView(textView, mf.d(-1, -1.0f, i10, f10, 0.0f, f10, 0.0f));
        int i11 = bd.a0 ? 3 : 5;
        org.telegram.ui.Components.h6 h6Var = this.c;
        h6Var.setGravity(i11 | 16);
        removeView(h6Var);
        addView(h6Var, mf.d(-2, -1.0f, (bd.a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, mf.d(-2, -2.0f, (bd.a0 ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, mf.d(-2, -2.0f, (bd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r || this.y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
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
            int i3 = this.G;
            if (i3 > 0) {
                this.G = i3 - 15;
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
            if (bd.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.H);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.y);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? r0 : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public org.telegram.ui.Components.k9 getValueBackupImageView() {
        if (this.e == null) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
            this.e = k9Var;
            float f10 = this.s - 4;
            addView(k9Var, mf.d(24, 24.0f, (bd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public org.telegram.ui.Components.h6 getValueTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.k9 k9Var = this.e;
        if (k9Var == null || k9Var.getImageReceiver() == null || !(this.e.getImageReceiver().t() instanceof org.telegram.ui.Components.g5)) {
            return;
        }
        ((org.telegram.ui.Components.g5) this.e.getImageReceiver().t()).n(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.b.getText());
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (h6Var == null || h6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) h6Var.getText());
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (!this.F || getParent() == null) {
            return;
        }
        this.G = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int i11 = this.I ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        fh0 fh0Var = this.d;
        if (fh0Var.getVisibility() == 0) {
            fh0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.I) {
                i11 = org.telegram.messenger.camera.q.w(8.0f, fh0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.k9 k9Var = this.e;
        if (k9Var != null) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(k9Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.I) {
                i11 = org.telegram.messenger.camera.q.w(8.0f, this.e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (h6Var.getVisibility() == 0) {
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.I ? org.telegram.messenger.camera.q.w(8.0f, h6Var.getMeasuredWidth(), i11) : (measuredWidth - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = bd.a0;
                int i12 = this.s;
                if (z10) {
                    marginLayoutParams.leftMargin = h6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = h6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
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
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (h6Var.getVisibility() == 0) {
            h6Var.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.n) {
                f10 = 0.5f;
            }
            imageView.setAlpha(f10);
        }
    }

    public void setIcon(int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        fh0 fh0Var = this.d;
        if (i3 == 0) {
            fh0Var.setVisibility(8);
            boolean z10 = bd.a0;
            int i10 = this.s;
            if (z10) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10);
                return;
            }
        }
        fh0Var.setImageResource(i3);
        org.telegram.ui.ActionBar.r6.t(fh0Var, org.telegram.ui.ActionBar.k6.m6, this.a, PorterDuff.Mode.MULTIPLY);
        fh0Var.setBackground(null);
        fh0Var.setVisibility(0);
        if (bd.a0) {
            marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
        }
    }

    public void setTextColor(int i3) {
        TextView textView = this.b;
        org.telegram.ui.ActionBar.r6.r(textView);
        textView.setTextColor(i3);
    }

    public void setTextValueColor(int i3) {
        org.telegram.ui.Components.h6 h6Var = this.c;
        org.telegram.ui.ActionBar.r6.r(h6Var);
        h6Var.setTextColor(i3);
    }

    public v9(Context context) {
        this(0, context, null);
    }

    public v9(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10 = org.telegram.messenger.r2.a;
        this.I = false;
        this.a = e6Var;
        this.s = 21;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((bd.a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        float f10 = 21;
        addView(textView, mf.d(-1, -1.0f, (bd.a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, !bd.a0);
        this.c = h6Var;
        h6Var.b(0.55f, 320L, xq.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        h6Var.setGravity((bd.a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.I6, e6Var);
        float f11 = 17;
        addView(h6Var, mf.d(-2, -1.0f, (bd.a0 ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        fh0 fh0Var = new fh0(context);
        this.d = fh0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fh0Var.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.k6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(fh0Var, i10, e6Var, mode);
        fh0Var.setVisibility(8);
        addView(fh0Var, mf.d(-2, -2.0f, (bd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, mode);
        addView(imageView, mf.d(-2, -2.0f, (bd.a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
