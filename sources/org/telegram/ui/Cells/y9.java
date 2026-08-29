package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y9 extends FrameLayout {
    public boolean A;
    public int B;
    public Paint C;
    public boolean D;
    public final org.telegram.ui.ActionBar.c6 a;
    public final TextView b;
    public final org.telegram.ui.Components.o6 c;
    public final aj0 d;
    public org.telegram.ui.Components.t9 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final int s;
    public boolean v;
    public float w;
    public float x;
    public int y;

    public y9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, 0, c6Var);
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
        int i10 = LocaleController.isRTL ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i10 | 16);
        removeView(textView);
        int i11 = (LocaleController.isRTL ? 5 : 3) | 48;
        float f9 = this.s;
        addView(textView, i7.f6.d(-1, -1.0f, i11, f9, 0.0f, f9, 0.0f));
        int i12 = LocaleController.isRTL ? 3 : 5;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.setGravity(i12 | 16);
        removeView(o6Var);
        addView(o6Var, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f9, 0.0f, f9, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f9, 0.0f, f9, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r || this.x != 0.0f) {
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.O5, this.a));
            }
            if (this.v) {
                float f9 = this.w + 0.016f;
                this.w = f9;
                if (f9 > 1.0f) {
                    this.w = 1.0f;
                    this.v = false;
                }
            } else {
                float f10 = this.w - 0.016f;
                this.w = f10;
                if (f10 < 0.0f) {
                    this.w = 0.0f;
                    this.v = true;
                }
            }
            int i10 = this.B;
            if (i10 > 0) {
                this.B = i10 - 15;
            } else {
                boolean z10 = this.r;
                if (z10) {
                    float f11 = this.x;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.10666667f;
                        this.x = f12;
                        if (f12 > 1.0f) {
                            this.x = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f13 = this.x;
                    if (f13 != 0.0f) {
                        float f14 = f13 - 0.10666667f;
                        this.x = f14;
                        if (f14 < 0.0f) {
                            this.x = 0.0f;
                        }
                    }
                }
            }
            this.C.setAlpha((int) (((this.w * 0.4f) + 0.6f) * this.x * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            int measuredWidth = getMeasuredWidth();
            float f15 = this.s;
            rectF.set((measuredWidth - AndroidUtilities.dp(f15)) - AndroidUtilities.dp(this.y), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(f15), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.C);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.x);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? r0 : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public org.telegram.ui.Components.t9 getValueBackupImageView() {
        if (this.e == null) {
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getContext());
            this.e = t9Var;
            float f9 = this.s - 4;
            addView(t9Var, i7.f6.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, f9, 0.0f, f9, 0.0f));
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
        org.telegram.ui.Components.t9 t9Var = this.e;
        if (t9Var == null || t9Var.getImageReceiver() == null || !(this.e.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.p5)) {
            return;
        }
        ((org.telegram.ui.Components.p5) this.e.getImageReceiver().getDrawable()).o(this);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.A || getParent() == null) {
            return;
        }
        this.B = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i12 = this.D ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        aj0 aj0Var = this.d;
        if (aj0Var.getVisibility() == 0) {
            aj0Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.D) {
                i12 = org.telegram.ui.b.u(8.0f, aj0Var.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.t9 t9Var = this.e;
        if (t9Var != null) {
            t9Var.measure(View.MeasureSpec.makeMeasureSpec(t9Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.D) {
                i12 = org.telegram.ui.b.u(8.0f, this.e.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (o6Var.getVisibility() == 0) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.D ? org.telegram.ui.b.u(8.0f, o6Var.getMeasuredWidth(), i12) : (measuredWidth - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = LocaleController.isRTL;
                int i13 = this.s;
                if (z10) {
                    marginLayoutParams.leftMargin = o6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                } else {
                    marginLayoutParams.rightMargin = o6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                }
            }
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setBetterLayout(boolean z10) {
        this.D = z10;
    }

    public void setCanDisable(boolean z10) {
        this.n = z10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        float f9 = 1.0f;
        this.b.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (o6Var.getVisibility() == 0) {
            o6Var.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.n) {
                f9 = 0.5f;
            }
            imageView.setAlpha(f9);
        }
    }

    public void setIcon(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        aj0 aj0Var = this.d;
        if (i10 == 0) {
            aj0Var.setVisibility(8);
            boolean z10 = LocaleController.isRTL;
            int i11 = this.s;
            if (z10) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(i11);
                return;
            } else {
                marginLayoutParams.leftMargin = AndroidUtilities.dp(i11);
                return;
            }
        }
        aj0Var.setImageResource(i10);
        aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.m6, this.a), PorterDuff.Mode.MULTIPLY));
        aj0Var.setBackground(null);
        aj0Var.setVisibility(0);
        if (LocaleController.isRTL) {
            marginLayoutParams.rightMargin = AndroidUtilities.dp(58.0f);
        } else {
            marginLayoutParams.leftMargin = AndroidUtilities.dp(58.0f);
        }
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.c.setTextColor(i10);
    }

    public y9(Context context) {
        this(context, 0, null);
    }

    public y9(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = BuildVars.DEBUG_PRIVATE_VERSION;
        this.a = c6Var;
        this.s = 21;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        float f9 = 21;
        addView(textView, i7.f6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f9, 0.0f, f9, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, !LocaleController.isRTL);
        this.c = o6Var;
        o6Var.b(0.55f, 320L, jr.h);
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        o6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I6, c6Var));
        float f10 = 17;
        addView(o6Var, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        aj0 aj0Var = new aj0(context);
        this.d = aj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        aj0Var.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.g6.m6;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        aj0Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
        aj0Var.setVisibility(8);
        addView(aj0Var, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), mode));
        addView(imageView, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f9, 0.0f, f9, 0.0f));
    }
}
