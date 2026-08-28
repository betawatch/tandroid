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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wz extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(yz yzVar, Activity activity) {
        super(activity);
        this.e = yzVar;
        this.c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((g70) this.e).A = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(gr.g);
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, 0.0f, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new r60(this, 1));
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
        int i9;
        float f10;
        int i10;
        Drawable drawable;
        Drawable drawable2;
        boolean z10;
        Boolean bool;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.c;
                yz yzVar = (yz) this.e;
                int i21 = yzVar.h;
                i9 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingTop;
                int dp = (i21 - i9) - AndroidUtilities.dp(8.0f);
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int i22 = dp + AndroidUtilities.statusBarHeight;
                if (this.b) {
                    i17 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingTop;
                    int i23 = i17 + i22;
                    int i24 = AndroidUtilities.statusBarHeight;
                    int i25 = i24 * 2;
                    if (i23 < i25) {
                        i20 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingTop;
                        i22 -= Math.min(i24, (i25 - i22) - i20);
                        f10 = 1.0f - Math.min(1.0f, (r3 * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f10 = 1.0f;
                    }
                    i18 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingTop;
                    int i26 = i18 + i22;
                    int i27 = AndroidUtilities.statusBarHeight;
                    if (i26 < i27) {
                        i19 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingTop;
                        i10 = Math.min(i27, (i27 - i22) - i19);
                        drawable = ((org.telegram.ui.ActionBar.f3) yzVar).shadowDrawable;
                        drawable.setBounds(0, i22, getMeasuredWidth(), getMeasuredHeight());
                        drawable2 = ((org.telegram.ui.ActionBar.f3) yzVar).shadowDrawable;
                        drawable2.draw(canvas);
                        if (f10 != 1.0f) {
                            org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
                            i13 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingLeft;
                            i14 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingTop;
                            int measuredWidth = getMeasuredWidth();
                            i15 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingLeft;
                            float f11 = measuredWidth - i15;
                            i16 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingTop;
                            rectF.set(i13, i14 + i22, f11, AndroidUtilities.dp(24.0f) + i16 + i22);
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.t0);
                        }
                        if (i10 > 0) {
                            org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
                            i11 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingLeft;
                            float f12 = i11;
                            float f13 = AndroidUtilities.statusBarHeight - i10;
                            int measuredWidth2 = getMeasuredWidth();
                            i12 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingLeft;
                            canvas.drawRect(f12, f13, measuredWidth2 - i12, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.f6.t0);
                        }
                        z10 = i10 <= AndroidUtilities.statusBarHeight / 2;
                        bool = (Boolean) this.d;
                        if (bool != null || bool.booleanValue() != z10) {
                            boolean z11 = AndroidUtilities.computePerceivedBrightness(yzVar.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) <= 0.721f;
                            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(yzVar.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f;
                            this.d = Boolean.valueOf(z10);
                            if (!z10) {
                                z11 = z12;
                            }
                            AndroidUtilities.setLightStatusBar(yzVar.getWindow(), z11);
                            break;
                        }
                    }
                } else {
                    f10 = 1.0f;
                }
                i10 = 0;
                drawable = ((org.telegram.ui.ActionBar.f3) yzVar).shadowDrawable;
                drawable.setBounds(0, i22, getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) yzVar).shadowDrawable;
                drawable2.draw(canvas);
                if (f10 != 1.0f) {
                }
                if (i10 > 0) {
                }
                if (i10 <= AndroidUtilities.statusBarHeight / 2) {
                }
                bool = (Boolean) this.d;
                if (bool != null) {
                }
                if (AndroidUtilities.computePerceivedBrightness(yzVar.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) <= 0.721f) {
                }
                if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(yzVar.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f) {
                }
                this.d = Boolean.valueOf(z10);
                if (!z10) {
                }
                AndroidUtilities.setLightStatusBar(yzVar.getWindow(), z11);
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
                yz yzVar = (yz) this.e;
                if (motionEvent.getAction() != 0 || yzVar.h == 0 || motionEvent.getY() >= yzVar.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                yzVar.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                yz.F((yz) this.e);
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                yz yzVar = (yz) this.e;
                gh.f1 f1Var = yzVar.b;
                yzVar.n = true;
                i11 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingLeft;
                int i14 = AndroidUtilities.statusBarHeight;
                i12 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingLeft;
                setPadding(i11, i14, i12, 0);
                yzVar.n = false;
                int h = (yzVar.c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f);
                i13 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingTop;
                int i15 = i13 + h + AndroidUtilities.statusBarHeight;
                int i16 = size / 5;
                int i17 = ((double) i15) < ((double) i16) * 3.2d ? 0 : i16 * 2;
                if (i17 != 0 && i15 < size) {
                    i17 -= size - i15;
                }
                if (i17 == 0) {
                    i17 = ((org.telegram.ui.ActionBar.f3) yzVar).backgroundPaddingTop;
                }
                if (f1Var.getPaddingTop() != i17) {
                    yzVar.n = true;
                    f1Var.setPadding(AndroidUtilities.dp(10.0f), i17, AndroidUtilities.dp(10.0f), 0);
                    yzVar.n = false;
                }
                this.b = i15 >= size;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.min(i15, size), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.b ? 80.0f : 50.0f), TLObject.FLAG_30));
                break;
            default:
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i9 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
                }
                this.b = true;
                h5Var.setVisibility(8);
                super.onMeasure(i9, i10);
                h5Var.setVisibility(0);
                h5Var.getLayoutParams().width = getMeasuredWidth();
                this.b = false;
                ((org.telegram.ui.u70) this.e).f();
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return !((yz) this.e).isDismissed() && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 0:
                if (!((yz) this.e).n) {
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
    public wz(g70 g70Var, Context context, boolean z10) {
        super(context);
        this.e = g70Var;
        this.d = new TextView[2];
        this.b = !z10;
        setBackground(null);
        View view = new View(context);
        this.c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
        }
        addView(view, g7.e6.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i9 = 0; i9 < 2; i9++) {
            ((TextView[]) this.d)[i9] = new TextView(context);
            ((TextView[]) this.d)[i9].setFocusable(false);
            ((TextView[]) this.d)[i9].setLines(1);
            ((TextView[]) this.d)[i9].setSingleLine(true);
            ((TextView[]) this.d)[i9].setGravity(1);
            ((TextView[]) this.d)[i9].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i9].setGravity(17);
            if (this.b) {
                ((TextView[]) this.d)[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                ((TextView[]) this.d)[i9].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false));
            }
            ((TextView[]) this.d)[i9].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i9].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i9].setPadding(0, 0, 0, this.b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i9], g7.e6.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i9 == 1) {
                ((TextView[]) this.d)[i9].setAlpha(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(org.telegram.ui.u70 u70Var, Context context) {
        super(context);
        this.e = u70Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
        addView(h5Var, g7.e6.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        c9 c9Var = new c9(context, false);
        this.d = c9Var;
        c9Var.a.a = true;
        c9Var.setStyle(11);
        c9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(c9Var, g7.e6.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 0, 4));
    }
}
