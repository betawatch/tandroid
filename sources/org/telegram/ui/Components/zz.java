package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zz extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(b00 b00Var, Activity activity) {
        super(activity);
        this.e = b00Var;
        this.c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((k70) this.e).A = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(er.g);
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, 0.0f, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new sz(this, 3));
        animatorSet.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        Drawable drawable;
        Drawable drawable2;
        boolean z10;
        Boolean bool;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.c;
                b00 b00Var = (b00) this.e;
                int i22 = b00Var.h;
                i10 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop;
                int dp = (i22 - i10) - AndroidUtilities.dp(8.0f);
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int i23 = dp + AndroidUtilities.statusBarHeight;
                if (this.b) {
                    i18 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop;
                    int i24 = i18 + i23;
                    int i25 = AndroidUtilities.statusBarHeight;
                    int i26 = i25 * 2;
                    if (i24 < i26) {
                        i21 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop;
                        i23 -= Math.min(i25, (i26 - i23) - i21);
                        f10 = 1.0f - Math.min(1.0f, (r3 * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f10 = 1.0f;
                    }
                    i19 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop;
                    int i27 = i19 + i23;
                    int i28 = AndroidUtilities.statusBarHeight;
                    if (i27 < i28) {
                        i20 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop;
                        i11 = Math.min(i28, (i28 - i23) - i20);
                        drawable = ((org.telegram.ui.ActionBar.e3) b00Var).shadowDrawable;
                        drawable.setBounds(0, i23, getMeasuredWidth(), getMeasuredHeight());
                        drawable2 = ((org.telegram.ui.ActionBar.e3) b00Var).shadowDrawable;
                        drawable2.draw(canvas);
                        if (f10 != 1.0f) {
                            org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
                            i14 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft;
                            i15 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop;
                            int measuredWidth = getMeasuredWidth();
                            i16 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft;
                            float f11 = measuredWidth - i16;
                            i17 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop;
                            rectF.set(i14, i15 + i23, f11, AndroidUtilities.dp(24.0f) + i17 + i23);
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.g6.t0);
                        }
                        if (i11 > 0) {
                            org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
                            i12 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft;
                            float f12 = i12;
                            float f13 = AndroidUtilities.statusBarHeight - i11;
                            int measuredWidth2 = getMeasuredWidth();
                            i13 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft;
                            canvas.drawRect(f12, f13, measuredWidth2 - i13, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.t0);
                        }
                        z10 = i11 <= AndroidUtilities.statusBarHeight / 2;
                        bool = (Boolean) this.d;
                        if (bool != null || bool.booleanValue() != z10) {
                            boolean z11 = AndroidUtilities.computePerceivedBrightness(b00Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5)) <= 0.721f;
                            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(b00Var.getThemedColor(org.telegram.ui.ActionBar.g6.s8), 855638016)) > 0.721f;
                            this.d = Boolean.valueOf(z10);
                            if (!z10) {
                                z11 = z12;
                            }
                            AndroidUtilities.setLightStatusBar(b00Var.getWindow(), z11);
                            break;
                        }
                    }
                } else {
                    f10 = 1.0f;
                }
                i11 = 0;
                drawable = ((org.telegram.ui.ActionBar.e3) b00Var).shadowDrawable;
                drawable.setBounds(0, i23, getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.e3) b00Var).shadowDrawable;
                drawable2.draw(canvas);
                if (f10 != 1.0f) {
                }
                if (i11 > 0) {
                }
                if (i11 <= AndroidUtilities.statusBarHeight / 2) {
                }
                bool = (Boolean) this.d;
                if (bool != null) {
                }
                if (AndroidUtilities.computePerceivedBrightness(b00Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5)) <= 0.721f) {
                }
                if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(b00Var.getThemedColor(org.telegram.ui.ActionBar.g6.s8), 855638016)) > 0.721f) {
                }
                this.d = Boolean.valueOf(z10);
                if (!z10) {
                }
                AndroidUtilities.setLightStatusBar(b00Var.getWindow(), z11);
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                b00 b00Var = (b00) this.e;
                if (motionEvent.getAction() != 0 || b00Var.h == 0 || motionEvent.getY() >= b00Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                b00Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                b00.G((b00) this.e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                b00 b00Var = (b00) this.e;
                hh.f1 f1Var = b00Var.b;
                b00Var.n = true;
                i12 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft;
                int i15 = AndroidUtilities.statusBarHeight;
                i13 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingLeft;
                setPadding(i12, i15, i13, 0);
                b00Var.n = false;
                int h = (b00Var.c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f);
                i14 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop;
                int i16 = i14 + h + AndroidUtilities.statusBarHeight;
                int i17 = size / 5;
                int i18 = ((double) i16) < ((double) i17) * 3.2d ? 0 : i17 * 2;
                if (i18 != 0 && i16 < size) {
                    i18 -= size - i16;
                }
                if (i18 == 0) {
                    i18 = ((org.telegram.ui.ActionBar.e3) b00Var).backgroundPaddingTop;
                }
                if (f1Var.getPaddingTop() != i18) {
                    b00Var.n = true;
                    f1Var.setPadding(AndroidUtilities.dp(10.0f), i18, AndroidUtilities.dp(10.0f), 0);
                    b00Var.n = false;
                }
                this.b = i16 >= size;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i16, size), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.b ? 80.0f : 50.0f), TLObject.FLAG_30));
                break;
            default:
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
                }
                this.b = true;
                h5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                h5Var.setVisibility(0);
                h5Var.getLayoutParams().width = getMeasuredWidth();
                this.b = false;
                ((org.telegram.ui.y70) this.e).f();
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return !((b00) this.e).isDismissed() && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 0:
                if (!((b00) this.e).n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 1:
            default:
                super.requestLayout();
                break;
            case 2:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(k70 k70Var, Context context, boolean z10) {
        super(context);
        this.e = k70Var;
        this.d = new TextView[2];
        this.b = !z10;
        setBackground(null);
        View view = new View(context);
        this.c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        }
        addView(view, h7.z5.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], h7.z5.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(org.telegram.ui.y70 y70Var, Context context) {
        super(context);
        this.e = y70Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        addView(h5Var, h7.z5.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        b9 b9Var = new b9(context, false);
        this.d = b9Var;
        b9Var.a.a = true;
        b9Var.setStyle(11);
        b9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(b9Var, h7.z5.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 0, 4));
    }
}
