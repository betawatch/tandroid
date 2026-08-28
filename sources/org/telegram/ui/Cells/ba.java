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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ba extends FrameLayout {
    public boolean A;
    public int B;
    public Paint C;
    public boolean D;
    public final org.telegram.ui.ActionBar.b6 a;
    public final TextView b;
    public final org.telegram.ui.Components.j6 c;
    public final pi0 d;
    public org.telegram.ui.Components.o9 e;
    public final ImageView f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final int s;
    public boolean v;
    public float w;
    public float x;
    public int y;

    public ba(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, 0, b6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        setEnabled(z10);
        TextView textView = this.b;
        ImageView imageView = this.f;
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z10 ? 1.0f : 0.5f));
            if (j6Var.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(j6Var, "alpha", z10 ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z10 ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z10 ? 1.0f : 0.5f);
        if (j6Var.getVisibility() == 0) {
            j6Var.setAlpha(z10 ? 1.0f : 0.5f);
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
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (charSequence2 != null) {
            j6Var.c(charSequence2, z10, true);
            j6Var.setVisibility(0);
        } else {
            j6Var.setVisibility(4);
        }
        this.h = z11;
        setWillNotDraw(true ^ z11);
        requestLayout();
    }

    public final void d() {
        int i9 = LocaleController.isRTL ? 5 : 3;
        TextView textView = this.b;
        textView.setGravity(i9 | 16);
        removeView(textView);
        int i10 = (LocaleController.isRTL ? 5 : 3) | 48;
        float f10 = this.s;
        addView(textView, g7.e6.d(-1, -1.0f, i10, f10, 0.0f, f10, 0.0f));
        int i11 = LocaleController.isRTL ? 3 : 5;
        org.telegram.ui.Components.j6 j6Var = this.c;
        j6Var.setGravity(i11 | 16);
        removeView(j6Var);
        addView(j6Var, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f;
        removeView(view2);
        addView(view2, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r || this.x != 0.0f) {
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.O5, this.a));
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
            int i9 = this.B;
            if (i9 > 0) {
                this.B = i9 - 15;
            } else {
                boolean z10 = this.r;
                if (z10) {
                    float f12 = this.x;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.x = f13;
                        if (f13 > 1.0f) {
                            this.x = 1.0f;
                        }
                    }
                }
                if (!z10) {
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
            this.C.setAlpha((int) (((this.w * 0.4f) + 0.6f) * this.x * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            int measuredWidth = getMeasuredWidth();
            float f16 = this.s;
            rectF.set((measuredWidth - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(this.y), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(f16), AndroidUtilities.dp(3.0f) + measuredHeight);
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(this.d.getVisibility() == 0 ? 58.0f : 20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? r0 : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    public TextView getTextView() {
        return this.b;
    }

    public org.telegram.ui.Components.o9 getValueBackupImageView() {
        if (this.e == null) {
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getContext());
            this.e = o9Var;
            float f10 = this.s - 4;
            addView(o9Var, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
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
        org.telegram.ui.Components.o9 o9Var = this.e;
        if (o9Var == null || o9Var.getImageReceiver() == null || !(this.e.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.k5)) {
            return;
        }
        ((org.telegram.ui.Components.k5) this.e.getImageReceiver().getDrawable()).o(this);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (!this.A || getParent() == null) {
            return;
        }
        this.B = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i11 = this.D ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
        pi0 pi0Var = this.d;
        if (pi0Var.getVisibility() == 0) {
            pi0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_31));
            if (this.D) {
                i11 = ll.w(8.0f, pi0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.o9 o9Var = this.e;
        if (o9Var != null) {
            o9Var.measure(View.MeasureSpec.makeMeasureSpec(o9Var.getLayoutParams().height, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, TLObject.FLAG_30));
            if (this.D) {
                i11 = ll.w(8.0f, this.e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (j6Var.getVisibility() == 0) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            measuredWidth = this.D ? ll.w(8.0f, j6Var.getMeasuredWidth(), i11) : (measuredWidth - j6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = LocaleController.isRTL;
                int i12 = this.s;
                if (z10) {
                    marginLayoutParams.leftMargin = j6Var.getMeasuredWidth() + AndroidUtilities.dp(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = j6Var.getMeasuredWidth() + AndroidUtilities.dp(i12 + 4);
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
        float f10 = 1.0f;
        this.b.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (j6Var.getVisibility() == 0) {
            j6Var.setAlpha((z10 || !this.n) ? 1.0f : 0.5f);
        }
        ImageView imageView = this.f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.n) {
                f10 = 0.5f;
            }
            imageView.setAlpha(f10);
        }
    }

    public void setIcon(int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        pi0 pi0Var = this.d;
        if (i9 == 0) {
            pi0Var.setVisibility(8);
            boolean z10 = LocaleController.isRTL;
            int i10 = this.s;
            if (z10) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = AndroidUtilities.dp(i10);
                return;
            }
        }
        pi0Var.setImageResource(i9);
        pi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.m6, this.a), PorterDuff.Mode.MULTIPLY));
        pi0Var.setBackground(null);
        pi0Var.setVisibility(0);
        if (LocaleController.isRTL) {
            marginLayoutParams.rightMargin = AndroidUtilities.dp(58.0f);
        } else {
            marginLayoutParams.leftMargin = AndroidUtilities.dp(58.0f);
        }
    }

    public void setTextColor(int i9) {
        this.b.setTextColor(i9);
    }

    public void setTextValueColor(int i9) {
        this.c.setTextColor(i9);
    }

    public ba(Context context) {
        this(context, 0, null);
    }

    public ba(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.D = BuildVars.DEBUG_PRIVATE_VERSION;
        this.a = b6Var;
        this.s = 21;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        float f10 = 21;
        addView(textView, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, !LocaleController.isRTL);
        this.c = j6Var;
        j6Var.b(0.55f, 320L, gr.h);
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        j6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I6, b6Var));
        float f11 = 17;
        addView(j6Var, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        pi0 pi0Var = new pi0(context);
        this.d = pi0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        pi0Var.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.f6.m6;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        pi0Var.setColorFilter(new PorterDuffColorFilter(v02, mode));
        pi0Var.setVisibility(8);
        addView(pi0Var, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), mode));
        addView(imageView, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
