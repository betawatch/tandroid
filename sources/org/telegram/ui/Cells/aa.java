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
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class aa extends FrameLayout {
    public boolean B;
    public int C;
    public Paint D;
    public boolean E;
    public final org.telegram.ui.ActionBar.g6 a;
    public final TextView b;
    public final org.telegram.ui.Components.k6 c;
    public final lj0 d;
    public org.telegram.ui.Components.p9 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final int s;
    public boolean v;
    public float w;
    public float x;
    public int y;

    public aa(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, 0, g6Var);
    }

    public final void a(ArrayList arrayList, boolean z4) {
        setEnabled(z4);
        TextView textView = this.b;
        ImageView imageView = this.f;
        org.telegram.ui.Components.k6 k6Var = this.c;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z4 ? 1.0f : 0.5f));
            if (k6Var.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(k6Var, "alpha", z4 ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z4 ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z4 ? 1.0f : 0.5f);
        if (k6Var.getVisibility() == 0) {
            k6Var.setAlpha(z4 ? 1.0f : 0.5f);
        }
        if (imageView.getVisibility() == 0) {
            imageView.setAlpha(z4 ? 1.0f : 0.5f);
        }
    }

    public final void b(CharSequence charSequence, boolean z4) {
        this.b.setText(charSequence);
        this.c.setVisibility(4);
        this.f.setVisibility(4);
        this.h = z4;
        setWillNotDraw(!z4);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z4, boolean z10) {
        this.b.setText(charSequence);
        this.f.setVisibility(4);
        org.telegram.ui.Components.k6 k6Var = this.c;
        if (charSequence2 != null) {
            k6Var.c(charSequence2, z4, true);
            k6Var.setVisibility(0);
        } else {
            k6Var.setVisibility(4);
        }
        this.h = z10;
        setWillNotDraw(true ^ z10);
        requestLayout();
    }

    public final void d() {
        int i10 = LocaleController.isRTL ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i10 | 16);
        removeView(textView);
        int i11 = (LocaleController.isRTL ? 5 : 3) | 48;
        float f10 = this.s;
        addView(textView, k7.c6.d(-1, -1.0f, i11, f10, 0.0f, f10, 0.0f));
        int i12 = LocaleController.isRTL ? 3 : 5;
        org.telegram.ui.Components.k6 k6Var = this.c;
        k6Var.setGravity(i12 | 16);
        removeView(k6Var);
        addView(k6Var, k7.c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r || this.x != 0.0f) {
            if (this.D == null) {
                Paint paint = new Paint(1);
                this.D = paint;
                paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.O5, this.a));
            }
            if (this.v) {
                float f10 = this.w + 0.016f;
                this.w = f10;
                if (f10 > 1.0f) {
                    this.w = 1.0f;
                    this.v = false;
                }
            } else {
                float f11 = this.w - 0.016f;
                this.w = f11;
                if (f11 < 0.0f) {
                    this.w = 0.0f;
                    this.v = true;
                }
            }
            int i10 = this.C;
            if (i10 > 0) {
                this.C = i10 - 15;
            } else {
                boolean z4 = this.r;
                if (z4) {
                    float f12 = this.x;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.x = f13;
                        if (f13 > 1.0f) {
                            this.x = 1.0f;
                        }
                    }
                }
                if (!z4) {
                    float f14 = this.x;
                    if (f14 != 0.0f) {
                        float f15 = f14 - 0.10666667f;
                        this.x = f15;
                        if (f15 < 0.0f) {
                            this.x = 0.0f;
                        }
                    }
                }
            }
            this.D.setAlpha((int) (((this.w * 0.4f) + 0.6f) * this.x * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            int measuredWidth = getMeasuredWidth();
            float f16 = this.s;
            rectF.set((measuredWidth - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(this.y), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(f16), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.D);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.x);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? r0 : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public org.telegram.ui.Components.p9 getValueBackupImageView() {
        if (this.e == null) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
            this.e = p9Var;
            float f10 = this.s - 4;
            addView(p9Var, k7.c6.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public org.telegram.ui.Components.k6 getValueTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.p9 p9Var = this.e;
        if (p9Var == null || p9Var.getImageReceiver() == null || !(this.e.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.l5)) {
            return;
        }
        ((org.telegram.ui.Components.l5) this.e.getImageReceiver().getDrawable()).o(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.b.getText());
        org.telegram.ui.Components.k6 k6Var = this.c;
        if (k6Var == null || k6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) k6Var.getText());
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (!this.B || getParent() == null) {
            return;
        }
        this.C = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i12 = this.E ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        lj0 lj0Var = this.d;
        if (lj0Var.getVisibility() == 0) {
            lj0Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.E) {
                i12 = org.telegram.ui.b.t(8.0f, lj0Var.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.p9 p9Var = this.e;
        if (p9Var != null) {
            p9Var.measure(View.MeasureSpec.makeMeasureSpec(p9Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.E) {
                i12 = org.telegram.ui.b.t(8.0f, this.e.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.k6 k6Var = this.c;
        if (k6Var.getVisibility() == 0) {
            k6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.E ? org.telegram.ui.b.t(8.0f, k6Var.getMeasuredWidth(), i12) : (measuredWidth - k6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z4 = LocaleController.isRTL;
                int i13 = this.s;
                if (z4) {
                    marginLayoutParams.leftMargin = k6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                } else {
                    marginLayoutParams.rightMargin = k6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                }
            }
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setBetterLayout(boolean z4) {
        this.E = z4;
    }

    public void setCanDisable(boolean z4) {
        this.n = z4;
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        float f10 = 1.0f;
        this.b.setAlpha((z4 || !this.n) ? 1.0f : 0.5f);
        org.telegram.ui.Components.k6 k6Var = this.c;
        if (k6Var.getVisibility() == 0) {
            k6Var.setAlpha((z4 || !this.n) ? 1.0f : 0.5f);
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            if (!z4 && this.n) {
                f10 = 0.5f;
            }
            imageView.setAlpha(f10);
        }
    }

    public void setIcon(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        lj0 lj0Var = this.d;
        if (i10 == 0) {
            lj0Var.setVisibility(8);
            boolean z4 = LocaleController.isRTL;
            int i11 = this.s;
            if (z4) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(i11);
                return;
            } else {
                marginLayoutParams.leftMargin = AndroidUtilities.dp(i11);
                return;
            }
        }
        lj0Var.setImageResource(i10);
        lj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.m6, this.a), PorterDuff.Mode.MULTIPLY));
        lj0Var.setBackground(null);
        lj0Var.setVisibility(0);
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

    public aa(Context context) {
        this(context, 0, null);
    }

    public aa(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = BuildVars.DEBUG_PRIVATE_VERSION;
        this.a = g6Var;
        this.s = 21;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        float f10 = 21;
        addView(textView, k7.c6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, !LocaleController.isRTL);
        this.c = k6Var;
        k6Var.b(0.55f, 320L, pr.h);
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        k6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.I6, g6Var));
        float f11 = 17;
        addView(k6Var, k7.c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        lj0 lj0Var = new lj0(context);
        this.d = lj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        lj0Var.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.k6.m6;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        lj0Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
        lj0Var.setVisibility(8);
        addView(lj0Var, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), mode));
        addView(imageView, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
