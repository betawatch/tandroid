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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ea extends FrameLayout {
    public boolean E;
    public int F;
    public Paint G;
    public boolean H;
    public final org.telegram.ui.ActionBar.d6 a;
    public final TextView b;
    public final org.telegram.ui.Components.p6 c;
    public final lj0 d;
    public org.telegram.ui.Components.w9 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final int s;
    public boolean v;
    public float w;
    public float x;
    public int y;

    public ea(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, 0, d6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        setEnabled(z10);
        TextView textView = this.b;
        ImageView imageView = this.f;
        org.telegram.ui.Components.p6 p6Var = this.c;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z10 ? 1.0f : 0.5f));
            if (p6Var.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(p6Var, "alpha", z10 ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z10 ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z10 ? 1.0f : 0.5f);
        if (p6Var.getVisibility() == 0) {
            p6Var.setAlpha(z10 ? 1.0f : 0.5f);
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
        org.telegram.ui.Components.p6 p6Var = this.c;
        if (charSequence2 != null) {
            p6Var.c(charSequence2, z10, true);
            p6Var.setVisibility(0);
        } else {
            p6Var.setVisibility(4);
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
        float f7 = this.s;
        addView(textView, w7.y5.d(-1, -1.0f, i11, f7, 0.0f, f7, 0.0f));
        int i12 = LocaleController.isRTL ? 3 : 5;
        org.telegram.ui.Components.p6 p6Var = this.c;
        p6Var.setGravity(i12 | 16);
        removeView(p6Var);
        addView(p6Var, w7.y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f7, 0.0f, f7, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r || this.x != 0.0f) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.O5, this.a));
            }
            if (this.v) {
                float f7 = this.w + 0.016f;
                this.w = f7;
                if (f7 > 1.0f) {
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
            int i10 = this.F;
            if (i10 > 0) {
                this.F = i10 - 15;
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
            this.G.setAlpha((int) (((this.w * 0.4f) + 0.6f) * this.x * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            int measuredWidth = getMeasuredWidth();
            float f15 = this.s;
            rectF.set((measuredWidth - AndroidUtilities.dp(f15)) - AndroidUtilities.dp(this.y), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(f15), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.G);
            invalidate();
        }
        this.c.setAlpha(1.0f - this.x);
        super.dispatchDraw(canvas);
        if (this.h) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? r0 : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.k0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public org.telegram.ui.Components.w9 getValueBackupImageView() {
        if (this.e == null) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getContext());
            this.e = w9Var;
            float f7 = this.s - 4;
            addView(w9Var, w7.y5.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, f7, 0.0f, f7, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f;
    }

    public org.telegram.ui.Components.p6 getValueTextView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.w9 w9Var = this.e;
        if (w9Var == null || w9Var.getImageReceiver() == null || !(this.e.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.q5)) {
            return;
        }
        ((org.telegram.ui.Components.q5) this.e.getImageReceiver().getDrawable()).o(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.b.getText());
        org.telegram.ui.Components.p6 p6Var = this.c;
        if (p6Var == null || p6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) p6Var.getText());
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i12 = this.H ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        lj0 lj0Var = this.d;
        if (lj0Var.getVisibility() == 0) {
            lj0Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.H) {
                i12 = ok.y(8.0f, lj0Var.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.w9 w9Var = this.e;
        if (w9Var != null) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(w9Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.H) {
                i12 = ok.y(8.0f, this.e.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.p6 p6Var = this.c;
        if (p6Var.getVisibility() == 0) {
            p6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.H ? ok.y(8.0f, p6Var.getMeasuredWidth(), i12) : (measuredWidth - p6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = LocaleController.isRTL;
                int i13 = this.s;
                if (z10) {
                    marginLayoutParams.leftMargin = p6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                } else {
                    marginLayoutParams.rightMargin = p6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
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
        org.telegram.ui.Components.p6 p6Var = this.c;
        if (p6Var.getVisibility() == 0) {
            p6Var.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
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
        lj0 lj0Var = this.d;
        if (i10 == 0) {
            lj0Var.setVisibility(8);
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
        lj0Var.setImageResource(i10);
        lj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.m6, this.a), PorterDuff.Mode.MULTIPLY));
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

    public ea(Context context) {
        this(context, 0, null);
    }

    public ea(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.H = BuildVars.DEBUG_PRIVATE_VERSION;
        this.a = d6Var;
        this.s = 21;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        float f7 = 21;
        addView(textView, w7.y5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, !LocaleController.isRTL);
        this.c = p6Var;
        p6Var.b(0.55f, 320L, rr.h);
        p6Var.setTextSize(AndroidUtilities.dp(16.0f));
        p6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        p6Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I6, d6Var));
        float f10 = 17;
        addView(p6Var, w7.y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        lj0 lj0Var = new lj0(context);
        this.d = lj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        lj0Var.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.h6.m6;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        lj0Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
        lj0Var.setVisibility(8);
        addView(lj0Var, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), mode));
        addView(imageView, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f7, 0.0f, f7, 0.0f));
    }
}
