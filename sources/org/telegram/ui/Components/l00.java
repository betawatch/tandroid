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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l00 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l00(n00 n00Var, Activity activity) {
        super(activity);
        this.e = n00Var;
        this.c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((w70) this.e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(pr.g);
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, 0.0f, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new j6(this, 28));
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
        float f7;
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
                n00 n00Var = (n00) this.e;
                int i22 = n00Var.h;
                i10 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingTop;
                int dp = (i22 - i10) - AndroidUtilities.dp(8.0f);
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int i23 = dp + AndroidUtilities.statusBarHeight;
                if (this.b) {
                    i18 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingTop;
                    int i24 = i18 + i23;
                    int i25 = AndroidUtilities.statusBarHeight;
                    int i26 = i25 * 2;
                    if (i24 < i26) {
                        i21 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingTop;
                        i23 -= Math.min(i25, (i26 - i23) - i21);
                        f7 = 1.0f - Math.min(1.0f, (r3 * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f7 = 1.0f;
                    }
                    i19 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingTop;
                    int i27 = i19 + i23;
                    int i28 = AndroidUtilities.statusBarHeight;
                    if (i27 < i28) {
                        i20 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingTop;
                        i11 = Math.min(i28, (i28 - i23) - i20);
                        drawable = ((org.telegram.ui.ActionBar.f3) n00Var).shadowDrawable;
                        drawable.setBounds(0, i23, getMeasuredWidth(), getMeasuredHeight());
                        drawable2 = ((org.telegram.ui.ActionBar.f3) n00Var).shadowDrawable;
                        drawable2.draw(canvas);
                        if (f7 != 1.0f) {
                            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                            i14 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingLeft;
                            i15 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingTop;
                            int measuredWidth = getMeasuredWidth();
                            i16 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingLeft;
                            float f10 = measuredWidth - i16;
                            i17 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingTop;
                            rectF.set(i14, i15 + i23, f10, AndroidUtilities.dp(24.0f) + i17 + i23);
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.t0);
                        }
                        if (i11 > 0) {
                            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                            i12 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingLeft;
                            float f11 = i12;
                            float f12 = AndroidUtilities.statusBarHeight - i11;
                            int measuredWidth2 = getMeasuredWidth();
                            i13 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingLeft;
                            canvas.drawRect(f11, f12, measuredWidth2 - i13, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.j6.t0);
                        }
                        z10 = i11 <= AndroidUtilities.statusBarHeight / 2;
                        bool = (Boolean) this.d;
                        if (bool != null || bool.booleanValue() != z10) {
                            boolean z11 = AndroidUtilities.computePerceivedBrightness(n00Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) <= 0.721f;
                            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(n00Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f;
                            this.d = Boolean.valueOf(z10);
                            if (!z10) {
                                z11 = z12;
                            }
                            AndroidUtilities.setLightStatusBar(n00Var.getWindow(), z11);
                            break;
                        }
                    }
                } else {
                    f7 = 1.0f;
                }
                i11 = 0;
                drawable = ((org.telegram.ui.ActionBar.f3) n00Var).shadowDrawable;
                drawable.setBounds(0, i23, getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) n00Var).shadowDrawable;
                drawable2.draw(canvas);
                if (f7 != 1.0f) {
                }
                if (i11 > 0) {
                }
                if (i11 <= AndroidUtilities.statusBarHeight / 2) {
                }
                bool = (Boolean) this.d;
                if (bool != null) {
                }
                if (AndroidUtilities.computePerceivedBrightness(n00Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) <= 0.721f) {
                }
                if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(n00Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f) {
                }
                this.d = Boolean.valueOf(z10);
                if (!z10) {
                }
                AndroidUtilities.setLightStatusBar(n00Var.getWindow(), z11);
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
                n00 n00Var = (n00) this.e;
                if (motionEvent.getAction() != 0 || n00Var.h == 0 || motionEvent.getY() >= n00Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                n00Var.dismiss();
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
                n00.G((n00) this.e);
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
                n00 n00Var = (n00) this.e;
                bi.o0 o0Var = n00Var.b;
                n00Var.n = true;
                i12 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingLeft;
                int i15 = AndroidUtilities.statusBarHeight;
                i13 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingLeft;
                setPadding(i12, i15, i13, 0);
                n00Var.n = false;
                int h = (n00Var.c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f);
                i14 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingTop;
                int i16 = i14 + h + AndroidUtilities.statusBarHeight;
                int i17 = size / 5;
                int i18 = ((double) i16) < ((double) i17) * 3.2d ? 0 : i17 * 2;
                if (i18 != 0 && i16 < size) {
                    i18 -= size - i16;
                }
                if (i18 == 0) {
                    i18 = ((org.telegram.ui.ActionBar.f3) n00Var).backgroundPaddingTop;
                }
                if (o0Var.getPaddingTop() != i18) {
                    n00Var.n = true;
                    o0Var.setPadding(AndroidUtilities.dp(10.0f), i18, AndroidUtilities.dp(10.0f), 0);
                    n00Var.n = false;
                }
                this.b = i16 >= size;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i16, size), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.b ? 80.0f : 50.0f), TLObject.FLAG_30));
                break;
            default:
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
                }
                this.b = true;
                j5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                j5Var.setVisibility(0);
                j5Var.getLayoutParams().width = getMeasuredWidth();
                this.b = false;
                ((org.telegram.ui.p80) this.e).f();
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return !((n00) this.e).isDismissed() && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 0:
                if (!((n00) this.e).n) {
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
    public l00(w70 w70Var, Context context, boolean z10) {
        super(context);
        this.e = w70Var;
        this.d = new TextView[2];
        this.b = !z10;
        setBackground(null);
        View view = new View(context);
        this.c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
        }
        addView(view, w7.x5.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.x5.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l00(org.telegram.ui.p80 p80Var, Context context) {
        super(context);
        this.e = p80Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        addView(j5Var, w7.x5.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        l9 l9Var = new l9(context, false);
        this.d = l9Var;
        l9Var.a.a = true;
        l9Var.setStyle(11);
        l9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(l9Var, w7.x5.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 0, 4));
    }
}
