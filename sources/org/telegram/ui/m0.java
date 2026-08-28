package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Context context) {
        super(context);
        this.a = 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.m71 m71Var;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                j6 j6Var = (j6) this.b;
                int d = ((measuredWidth - ((int) j6Var.c.d())) + ((int) j6Var.b.d())) / 2;
                if (!LocaleController.isRTL) {
                    j6Var.b.setBounds(0, 0, d, getHeight());
                    j6Var.b.draw(canvas);
                    j6Var.c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                    j6Var.c.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 6:
                super.dispatchDraw(canvas);
                ou ouVar = (ou) this.b;
                if (ouVar.getParentLayout() != null && (m71Var = ouVar.b) != null) {
                    float measuredHeight = m71Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.f6.k0);
                    break;
                }
                break;
            case 7:
                k60 k60Var = (k60) this.b;
                ig.e eVar = k60Var.l0;
                ng.d dVar = k60Var.m0;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    k60Var.d0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.n && dVar.e(measuredWidth2, measuredHeight2)) {
                        eVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, k60Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6), k60Var.i0);
                break;
            case 9:
                q70 q70Var = (q70) this.b;
                ig.e eVar2 = q70Var.H;
                ng.d dVar2 = q70Var.I;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    q70Var.X();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n && dVar2.e(measuredWidth3, measuredHeight3)) {
                        eVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                View view = launchActivity.C0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.t1 == null) {
                        launchActivity.t1 = new int[2];
                    }
                    launchActivity.C0.getLocationInWindow(launchActivity.t1);
                    int[] iArr = launchActivity.t1;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.t1;
                    int i11 = i9 - iArr2[0];
                    int i12 = i10 - iArr2[1];
                    canvas.save();
                    canvas.translate(i11, i12);
                    launchActivity.C0.getBackground().draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 13:
                ng0 ng0Var = (ng0) this.b;
                ng0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.f6.a7;
                int themedColor = ng0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.f6.d6;
                int themedColor2 = ng0Var.getThemedColor(i14);
                sg1 sg1Var = ng0Var.c;
                int d9 = i0.a.d(sg1Var != null ? sg1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i15 = ng0Var.I;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.f6.l0(d9));
                }
                if (ng0Var.J != 0) {
                    canvas.drawRect(getWidth() - ng0Var.J, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.f6.l0(d9));
                }
                super.dispatchDraw(canvas);
                ng0Var.c0();
                ng.c cVar = ng0Var.O;
                int themedColor3 = ng0Var.getThemedColor(i13);
                int themedColor4 = ng0Var.getThemedColor(i14);
                sg1 sg1Var2 = ng0Var.c;
                cVar.a(i0.a.d(sg1Var2 != null ? sg1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = ng0Var.D;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 22:
                d41 d41Var = (d41) this.b;
                if (d41Var.s > 0.0f && d41Var.n != null) {
                    d41Var.r.reset();
                    float width = getWidth() / d41Var.f.getWidth();
                    d41Var.r.postScale(width, width);
                    d41Var.h.setLocalMatrix(d41Var.r);
                    d41Var.n.setAlpha((int) (d41Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), d41Var.n);
                }
                if (d41Var.S && (t1Var = d41Var.K) != null) {
                    t1Var.setVisibility(4);
                    d41Var.S = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 23:
                q41 q41Var = (q41) this.b;
                ImageReceiver imageReceiver2 = q41Var.b;
                Rect rect = q41Var.e;
                b61 b61Var = q41Var.L;
                k51 k51Var = q41Var.a;
                if (q41Var.n != null && q41Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    q41Var.r.setAlpha((int) (q41Var.E * 255.0f));
                    canvas.drawBitmap(q41Var.n, 0.0f, 0.0f, q41Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (k51Var != null) {
                    Drawable drawable = k51Var.A;
                    if (drawable != null) {
                        if (q41Var.x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(q41Var.E, b61Var.i1, b61Var.b1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(b61Var.g1);
                        }
                        drawable.setAlpha((int) ((1.0f - q41Var.E) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f10 = k51Var.J;
                        float max = (f10 != 0.0f || k51Var.O > 0.0f) ? (((1.0f - Math.max(k51Var.O * 0.8f, f10)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f11 = 1.0f - ((1.0f - q41Var.E) * (1.0f - k51Var.K));
                        canvas.save();
                        if (f11 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f11, 0.0f, 0.0f);
                            canvas.skew((1.0f - f11) * (1.0f - ((k51Var.L * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (q41Var.E * AndroidUtilities.dp(45.0f)) + q41Var.B);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = k51Var.L;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f11 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f11 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f11 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f11 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - q41Var.E) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (b61Var.T.getX() + b61Var.k0.getX() + q41Var.y), b61Var.T.getY() + ((int) b61Var.k0.getY()) + q41Var.A);
                        b61Var.k0.draw(canvas);
                        canvas.restore();
                    } else if (k51Var.s && (imageReceiver = k51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - q41Var.E);
                        k51Var.h.setImageCoords(rect);
                        k51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(q41Var.E);
                    imageReceiver2.setImageCoords(rect);
                    imageReceiver2.draw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 5:
                if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                ht htVar = (ht) this.b;
                if (htVar.n || htVar.K) {
                    htVar.o();
                    return true;
                }
                htVar.n();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 22:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((d41) this.b).dismiss();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int i9;
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = l4Var.b0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j10);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) l4Var.q0[0].getTranslationX();
                p3[] p3VarArr = l4Var.q0;
                if (view == p3VarArr[1]) {
                    i9 = translationX;
                } else {
                    i9 = measuredWidth;
                    if (view == p3VarArr[0]) {
                        i10 = translationX;
                        int save = canvas.save();
                        canvas.clipRect(i10, 0, i9, getHeight());
                        boolean drawChild = super.drawChild(canvas, view, j10);
                        canvas.restoreToCount(save);
                        if (translationX != 0) {
                            return drawChild;
                        }
                        p3[] p3VarArr2 = l4Var.q0;
                        if (view == p3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                            Drawable drawable = l4Var.i0;
                            drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            l4Var.i0.setAlpha((int) (max * 255.0f));
                            l4Var.i0.draw(canvas);
                            return drawChild;
                        }
                        if (view != p3VarArr2[1]) {
                            return drawChild;
                        }
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        l4Var.j0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i10, 0.0f, i9, getHeight(), l4Var.j0);
                        return drawChild;
                    }
                }
                i10 = 0;
                int save2 = canvas.save();
                canvas.clipRect(i10, 0, i9, getHeight());
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save2);
                if (translationX != 0) {
                }
                break;
            case 24:
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                oc1 oc1Var = (oc1) this.b;
                kVar = ((org.telegram.ui.ActionBar.o2) oc1Var).actionBar;
                if (view == kVar) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) oc1Var).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.o2) oc1Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.o2) oc1Var).actionBar;
                        if (kVar2.getVisibility() == 0) {
                            kVar3 = ((org.telegram.ui.ActionBar.o2) oc1Var).actionBar;
                            i11 = kVar3.getMeasuredHeight();
                        } else {
                            i11 = 0;
                        }
                        ((ActionBarLayout) b5Var2).q(canvas, i11);
                    }
                }
                return drawChild3;
            case 25:
                we1 we1Var = (we1) this.b;
                if (view == we1Var.W0 && we1Var.isInPreviewMode()) {
                    ((ActionBarLayout) we1Var.getParentLayout()).p(canvas, (int) (we1Var.S * 255.0f), (int) (we1Var.W0.getY() + we1Var.W0.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((hh0) this.b).m0, 500L);
                break;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((q41) this.b).b;
                if (imageReceiver != null) {
                    imageReceiver.onAttachedToWindow();
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 23:
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((hh0) this.b).m0);
                break;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((q41) this.b).b;
                if (imageReceiver != null) {
                    imageReceiver.onDetachedFromWindow();
                    break;
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.b).f);
                accessibilityNodeInfo.setCheckable(true);
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                break;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((ip0) this.b).b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((zp0) this.b).b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
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
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                return ((PopupNotificationActivity) this.b).c() || ((PopupNotificationActivity) getContext()).j(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        Activity activity;
        switch (this.a) {
            case 2:
                int paddingLeft = ((i11 - i9) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                b5 b5Var = (b5) this.b;
                b5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
                int b10 = g7.n.b((paddingTop - b5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                b5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int y10 = org.telegram.messenger.ll.y(48.0f, (paddingTop - b10) - b5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b5Var.d.getLayoutParams();
                layoutParams.topMargin = AndroidUtilities.dp(8.0f) + y10;
                layoutParams2.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.l0.C(8.0f, y10, b10);
                layoutParams2.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i9, i10, i11, i12);
                break;
            case 7:
                super.onLayout(z10, i9, i10, i11, i12);
                k60 k60Var = (k60) this.b;
                k60Var.f0();
                k60Var.g0();
                org.telegram.ui.Components.m10 m10Var = k60Var.f;
                td.c cVar = k60Var.b;
                m10Var.setTranslationY(cVar.e);
                k60Var.h0();
                k60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar.e);
                break;
            case 8:
                super.onLayout(z10, i9, i10, i11, i12);
                b70 b70Var = (b70) this.b;
                TextView textView = b70Var.b;
                if (textView != null) {
                    int measuredWidth = ((b70Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (b70Var.c.getMeasuredWidth() / 2);
                    int top = (b70Var.e.getTop() + ((b70Var.b.getMeasuredHeight() - b70Var.c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = b70Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, b70Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 9:
                super.onLayout(z10, i9, i10, i11, i12);
                q70 q70Var = (q70) this.b;
                q70Var.Y();
                q70Var.a0();
                break;
            case 12:
                super.onLayout(z10, i9, i10, i11, i12);
                fg0 fg0Var = (fg0) this.b;
                for (org.telegram.ui.Components.cv0 cv0Var : fg0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!cv0Var.a() && fg0Var.c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    cv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                break;
            case 13:
                super.onLayout(z10, i9, i10, i11, i12);
                ng0 ng0Var = (ng0) this.b;
                ng0Var.h0();
                ng0Var.g0();
                break;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.c0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                fh.v vVar = secretMediaViewer.e;
                vVar.layout(systemWindowInsetLeft, 0, vVar.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.G0 == null) {
                        secretMediaViewer.u0 = 1.0f;
                        secretMediaViewer.s0 = 0.0f;
                        secretMediaViewer.t0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.u0);
                    break;
                }
                break;
            case 22:
                super.onLayout(z10, i9, i10, i11, i12);
                ((d41) this.b).d();
                break;
            case 23:
                super.onLayout(z10, i9, i10, i11, i12);
                q41 q41Var = (q41) this.b;
                Context context = q41Var.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    View decorView = activity.getWindow().getDecorView();
                    Bitmap bitmap = q41Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || q41Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        q41Var.f();
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.ActionBar.k kVar11;
        switch (this.a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
                break;
            case 6:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            case 7:
                k60 k60Var = (k60) this.b;
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    k60Var.Y = AndroidUtilities.dp(144.0f);
                } else {
                    k60Var.Y = AndroidUtilities.dp(56.0f);
                }
                kVar = ((org.telegram.ui.ActionBar.o2) k60Var).actionBar;
                measureChildWithMargins(kVar, i9, 0, i10, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k60Var.s.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.o2) k60Var).actionBar;
                marginLayoutParams.topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) k60Var.e.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.o2) k60Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) k60Var.f.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.o2) k60Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) k60Var.h.getLayoutParams();
                kVar5 = ((org.telegram.ui.ActionBar.o2) k60Var).actionBar;
                marginLayoutParams4.topMargin = kVar5.getMeasuredHeight();
                k60Var.h.getLayoutParams().height = k60Var.Y;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) k60Var.d.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.o2) k60Var).actionBar;
                marginLayoutParams5.height = AndroidUtilities.dp(53.0f) + kVar6.getMeasuredHeight() + k60Var.Y;
                k60Var.i0();
                super.onMeasure(i9, i10);
                break;
            case 9:
                q70 q70Var = (q70) this.b;
                int size3 = View.MeasureSpec.getSize(i9);
                int size4 = View.MeasureSpec.getSize(i10);
                if (AndroidUtilities.isTablet() || size4 > size3) {
                    q70Var.x = AndroidUtilities.dp(144.0f);
                } else {
                    q70Var.x = AndroidUtilities.dp(56.0f);
                }
                kVar7 = ((org.telegram.ui.ActionBar.o2) q70Var).actionBar;
                measureChildWithMargins(kVar7, i9, 0, i10, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) q70Var.r.getLayoutParams();
                kVar8 = ((org.telegram.ui.ActionBar.o2) q70Var).actionBar;
                marginLayoutParams6.topMargin = AndroidUtilities.dp(48.0f) + kVar8.getMeasuredHeight();
                q70Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + q70Var.x;
                q70Var.Z();
                super.onMeasure(i9, i10);
                break;
            case 11:
                super.onMeasure(i9, i10);
                mc0 mc0Var = ((pc0) this.b).x;
                if (mc0Var != null) {
                    mc0Var.a();
                    break;
                }
                break;
            case 12:
                super.onMeasure(i9, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                fg0 fg0Var = (fg0) this.b;
                for (org.telegram.ui.Components.cv0 cv0Var : fg0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) cv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams7.topMargin);
                    if (!cv0Var.a() && fg0Var.c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    cv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams7.rightMargin) - marginLayoutParams7.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
                }
                break;
            case 15:
                zo0 zo0Var = (zo0) this.b;
                FrameLayout frameLayout = zo0Var.C;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) zo0Var.C.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i9, i10);
                break;
            case 20:
                super.onMeasure(i9, i10);
                ProfileActivity.V0((ProfileActivity) this.b);
                break;
            case 21:
                int size5 = View.MeasureSpec.getSize(i9);
                int size6 = View.MeasureSpec.getSize(i10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.c0;
                if (windowInsets != null) {
                    if (AndroidUtilities.incorrectDisplaySizeFix) {
                        int i11 = AndroidUtilities.displaySize.y;
                        if (size6 > i11) {
                            size6 = i11;
                        }
                        size6 += AndroidUtilities.statusBarHeight;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i12 = AndroidUtilities.displaySize.y;
                    if (size6 > i12) {
                        size6 = i12;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.c0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30));
                break;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            case 24:
                int size7 = View.MeasureSpec.getSize(i9);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size7, size8);
                oc1 oc1Var = (oc1) this.b;
                kVar9 = ((org.telegram.ui.ActionBar.o2) oc1Var).actionBar;
                measureChildWithMargins(kVar9, i9, 0, i10, 0);
                kVar10 = ((org.telegram.ui.ActionBar.o2) oc1Var).actionBar;
                int measuredHeight2 = kVar10.getMeasuredHeight();
                kVar11 = ((org.telegram.ui.ActionBar.o2) oc1Var).actionBar;
                if (kVar11.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) oc1Var.j0.getLayoutParams()).topMargin = measuredHeight2;
                oc1Var.j0.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8, TLObject.FLAG_30));
                measureChildWithMargins(oc1Var.l0, i9, 0, i10, 0);
                break;
            case 26:
                super.onMeasure(i9, i10);
                ((ViewGroup.MarginLayoutParams) ((ag1) this.b).H.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 5:
                super.onSizeChanged(i9, i10, i11, i12);
                ht htVar = (ht) this.b;
                og.d.c(htVar.s, htVar.y);
                htVar.t.d();
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 19:
                return ((PopupNotificationActivity) this.b).c() || ((PopupNotificationActivity) getContext()).j(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.a) {
            case 19:
                ((PopupNotificationActivity) getContext()).j(null);
                super.requestDisallowInterceptTouchEvent(z10);
                break;
            default:
                super.requestDisallowInterceptTouchEvent(z10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        switch (this.a) {
            case 20:
                super.setScaleX(f10);
                ProfileActivity.V0((ProfileActivity) this.b);
                break;
            default:
                super.setScaleX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 4:
                super.setTranslationY(f10);
                ((pb) this.b).X.invalidate();
                break;
            case 18:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.F1();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 3:
                j6 j6Var = (j6) this.b;
                return drawable == j6Var.c || drawable == j6Var.b || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
