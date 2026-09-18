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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Context context) {
        super(context);
        this.a = 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.a) {
            case 9:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                m6 m6Var = (m6) this.b;
                int d = ((measuredWidth - ((int) m6Var.c.d())) + ((int) m6Var.b.d())) / 2;
                if (!LocaleController.isRTL) {
                    m6Var.b.setBounds(0, 0, d, getHeight());
                    m6Var.b.draw(canvas);
                    m6Var.c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                    m6Var.c.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 6:
                g70 g70Var = (g70) this.b;
                ah.i iVar = g70Var.p0;
                fh.d dVar = g70Var.q0;
                if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
                    g70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar != null && !dVar.n && dVar.f(measuredWidth2, measuredHeight)) {
                        iVar.b(dVar.a(measuredWidth2, measuredHeight), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, g70Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6), g70Var.m0);
                break;
            case 8:
                n80 n80Var = (n80) this.b;
                ah.i iVar2 = n80Var.L;
                fh.d dVar2 = n80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && iVar2 != null) {
                    n80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n && dVar2.f(measuredWidth3, measuredHeight2)) {
                        iVar2.b(dVar2.a(measuredWidth3, measuredHeight2), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.x1 == null) {
                        launchActivity.x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.x1);
                    int[] iArr = launchActivity.x1;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.x1;
                    int i12 = i10 - iArr2[0];
                    int i13 = i11 - iArr2[1];
                    canvas.save();
                    canvas.translate(i12, i13);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 12:
                gh0 gh0Var = (gh0) this.b;
                gh0Var.getClass();
                int i14 = org.telegram.ui.ActionBar.j6.a7;
                int themedColor = gh0Var.getThemedColor(i14);
                int i15 = org.telegram.ui.ActionBar.j6.d6;
                int themedColor2 = gh0Var.getThemedColor(i15);
                zh1 zh1Var = gh0Var.c;
                int d10 = i0.a.d(zh1Var != null ? zh1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i16 = gh0Var.M;
                if (i16 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i16, getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                if (gh0Var.N != 0) {
                    canvas.drawRect(getWidth() - gh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                super.dispatchDraw(canvas);
                gh0Var.d0();
                fh.c cVar = gh0Var.R;
                int themedColor3 = gh0Var.getThemedColor(i14);
                int themedColor4 = gh0Var.getThemedColor(i15);
                zh1 zh1Var2 = gh0Var.c;
                cVar.a(i0.a.d(zh1Var2 != null ? zh1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = gh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 21:
                k51 k51Var = (k51) this.b;
                if (k51Var.s > 0.0f && k51Var.n != null) {
                    k51Var.r.reset();
                    float width = getWidth() / k51Var.f.getWidth();
                    k51Var.r.postScale(width, width);
                    k51Var.h.setLocalMatrix(k51Var.r);
                    k51Var.n.setAlpha((int) (k51Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), k51Var.n);
                }
                if (k51Var.W && (t1Var = k51Var.O) != null) {
                    t1Var.setVisibility(4);
                    k51Var.W = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 22:
                x51 x51Var = (x51) this.b;
                ImageReceiver imageReceiver2 = x51Var.b;
                Rect rect = x51Var.e;
                i71 i71Var = x51Var.P;
                r61 r61Var = x51Var.a;
                if (x51Var.n != null && x51Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    x51Var.r.setAlpha((int) (x51Var.I * 255.0f));
                    canvas.drawBitmap(x51Var.n, 0.0f, 0.0f, x51Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (r61Var != null) {
                    Drawable drawable = r61Var.E;
                    if (drawable != null) {
                        if (x51Var.x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(x51Var.I, i71Var.m1, i71Var.f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(i71Var.k1);
                        }
                        drawable.setAlpha((int) ((1.0f - x51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f7 = r61Var.N;
                        float max = (f7 != 0.0f || r61Var.S > 0.0f) ? (((1.0f - Math.max(r61Var.S * 0.8f, f7)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f10 = 1.0f - ((1.0f - x51Var.I) * (1.0f - r61Var.O));
                        canvas.save();
                        if (f10 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f10, 0.0f, 0.0f);
                            canvas.skew((1.0f - f10) * (1.0f - ((r61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (x51Var.I * AndroidUtilities.dp(45.0f)) + x51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i17 = r61Var.P;
                        if (i17 == 0) {
                            rect2.offset(AndroidUtilities.dp(f10 * 8.0f), 0);
                        } else if (i17 == 1) {
                            rect2.offset(AndroidUtilities.dp(f10 * 4.0f), 0);
                        } else if (i17 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f10 * (-4.0f)), 0);
                        } else if (i17 == 7) {
                            rect2.offset(AndroidUtilities.dp(f10 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - x51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (i71Var.a0.getX() + i71Var.o0.getX() + x51Var.y), i71Var.a0.getY() + ((int) i71Var.o0.getY()) + x51Var.E);
                        i71Var.o0.draw(canvas);
                        canvas.restore();
                    } else if (r61Var.s && (imageReceiver = r61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - x51Var.I);
                        r61Var.h.setImageCoords(rect);
                        r61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(x51Var.I);
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
                ut utVar = (ut) this.b;
                if (utVar.n || utVar.K) {
                    utVar.o();
                    return true;
                }
                utVar.n();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 21:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((k51) this.b).dismiss();
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j3);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) h4Var.u0[0].getTranslationX();
                l3[] l3VarArr = h4Var.u0;
                if (view == l3VarArr[1]) {
                    i10 = translationX;
                } else {
                    i10 = measuredWidth;
                    if (view == l3VarArr[0]) {
                        i11 = translationX;
                        int save = canvas.save();
                        canvas.clipRect(i11, 0, i10, getHeight());
                        boolean drawChild = super.drawChild(canvas, view, j3);
                        canvas.restoreToCount(save);
                        if (translationX != 0) {
                            return drawChild;
                        }
                        l3[] l3VarArr2 = h4Var.u0;
                        if (view == l3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                            Drawable drawable = h4Var.m0;
                            drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            h4Var.m0.setAlpha((int) (max * 255.0f));
                            h4Var.m0.draw(canvas);
                            return drawChild;
                        }
                        if (view != l3VarArr2[1]) {
                            return drawChild;
                        }
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        h4Var.n0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i11, 0.0f, i10, getHeight(), h4Var.n0);
                        return drawChild;
                    }
                }
                i11 = 0;
                int save2 = canvas.save();
                canvas.clipRect(i11, 0, i10, getHeight());
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restoreToCount(save2);
                if (translationX != 0) {
                }
                break;
            case 23:
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                xd1 xd1Var = (xd1) this.b;
                kVar = ((org.telegram.ui.ActionBar.o2) xd1Var).actionBar;
                if (view == kVar) {
                    e5Var = ((org.telegram.ui.ActionBar.o2) xd1Var).parentLayout;
                    if (e5Var != null) {
                        e5Var2 = ((org.telegram.ui.ActionBar.o2) xd1Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.o2) xd1Var).actionBar;
                        if (kVar2.getVisibility() == 0) {
                            kVar3 = ((org.telegram.ui.ActionBar.o2) xd1Var).actionBar;
                            i12 = kVar3.getMeasuredHeight();
                        } else {
                            i12 = 0;
                        }
                        ((ActionBarLayout) e5Var2).q(canvas, i12);
                    }
                }
                return drawChild3;
            case 24:
                fg1 fg1Var = (fg1) this.b;
                if (view == fg1Var.a1 && fg1Var.isInPreviewMode()) {
                    ((ActionBarLayout) fg1Var.getParentLayout()).p(canvas, (int) (fg1Var.W * 255.0f), (int) (fg1Var.a1.getY() + fg1Var.a1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 13:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((ai0) this.b).q0, 500L);
                break;
            case 22:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((x51) this.b).b;
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
            case 22:
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 13:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((ai0) this.b).q0);
                break;
            case 22:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((x51) this.b).b;
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
            case 15:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((lq0) this.b).b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((cr0) this.b).b.size(), new Object[0]));
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
            case 18:
                return ((PopupNotificationActivity) this.b).c() || ((PopupNotificationActivity) getContext()).j(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Activity activity;
        switch (this.a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                c5 c5Var = (c5) this.b;
                c5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
                int b10 = w7.p.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int y3 = org.telegram.messenger.wl.y(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                layoutParams.topMargin = AndroidUtilities.dp(8.0f) + y3;
                layoutParams2.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.w1.C(8.0f, y3, b10);
                layoutParams2.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                g70 g70Var = (g70) this.b;
                g70Var.g0();
                g70Var.h0();
                org.telegram.ui.Components.b20 b20Var = g70Var.f;
                le.e eVar = g70Var.b;
                b20Var.setTranslationY(eVar.e);
                g70Var.i0();
                g70Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                break;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                y70 y70Var = (y70) this.b;
                TextView textView = y70Var.b;
                if (textView != null) {
                    int measuredWidth = ((y70Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (y70Var.c.getMeasuredWidth() / 2);
                    int top = (y70Var.e.getTop() + ((y70Var.b.getMeasuredHeight() - y70Var.c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = y70Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, y70Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                n80 n80Var = (n80) this.b;
                n80Var.Z();
                n80Var.b0();
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                yg0 yg0Var = (yg0) this.b;
                for (org.telegram.ui.Components.vv0 vv0Var : yg0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!vv0Var.a() && yg0Var.c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    vv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                gh0 gh0Var = (gh0) this.b;
                gh0Var.i0();
                gh0Var.h0();
                break;
            case 20:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.g0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                ci.n6 n6Var = secretMediaViewer.e;
                n6Var.layout(systemWindowInsetLeft, 0, n6Var.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.y0 = 1.0f;
                        secretMediaViewer.w0 = 0.0f;
                        secretMediaViewer.x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.y0);
                    break;
                }
                break;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                ((k51) this.b).d();
                break;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                x51 x51Var = (x51) this.b;
                Context context = x51Var.getContext();
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
                    Bitmap bitmap = x51Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || x51Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        x51Var.f();
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                break;
            case 6:
                g70 g70Var = (g70) this.b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    g70Var.c0 = AndroidUtilities.dp(144.0f);
                } else {
                    g70Var.c0 = AndroidUtilities.dp(56.0f);
                }
                kVar = ((org.telegram.ui.ActionBar.o2) g70Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g70Var.s.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.o2) g70Var).actionBar;
                marginLayoutParams.topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) g70Var.e.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.o2) g70Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) g70Var.f.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.o2) g70Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) g70Var.h.getLayoutParams();
                kVar5 = ((org.telegram.ui.ActionBar.o2) g70Var).actionBar;
                marginLayoutParams4.topMargin = kVar5.getMeasuredHeight();
                g70Var.h.getLayoutParams().height = g70Var.c0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) g70Var.d.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.o2) g70Var).actionBar;
                marginLayoutParams5.height = AndroidUtilities.dp(53.0f) + kVar6.getMeasuredHeight() + g70Var.c0;
                g70Var.j0();
                super.onMeasure(i10, i11);
                break;
            case 8:
                n80 n80Var = (n80) this.b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size4 > size3) {
                    n80Var.x = AndroidUtilities.dp(144.0f);
                } else {
                    n80Var.x = AndroidUtilities.dp(56.0f);
                }
                kVar7 = ((org.telegram.ui.ActionBar.o2) n80Var).actionBar;
                measureChildWithMargins(kVar7, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) n80Var.r.getLayoutParams();
                kVar8 = ((org.telegram.ui.ActionBar.o2) n80Var).actionBar;
                marginLayoutParams6.topMargin = AndroidUtilities.dp(48.0f) + kVar8.getMeasuredHeight();
                n80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + n80Var.x;
                n80Var.a0();
                super.onMeasure(i10, i11);
                break;
            case 10:
                super.onMeasure(i10, i11);
                hd0 hd0Var = ((kd0) this.b).x;
                if (hd0Var != null) {
                    hd0Var.a();
                    break;
                }
                break;
            case 11:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                yg0 yg0Var = (yg0) this.b;
                for (org.telegram.ui.Components.vv0 vv0Var : yg0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) vv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams7.topMargin);
                    if (!vv0Var.a() && yg0Var.c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    vv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams7.rightMargin) - marginLayoutParams7.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
                }
                break;
            case 14:
                cq0 cq0Var = (cq0) this.b;
                FrameLayout frameLayout = cq0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) cq0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                break;
            case 19:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.b);
                break;
            case 20:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.g0;
                if (windowInsets != null) {
                    if (AndroidUtilities.incorrectDisplaySizeFix) {
                        int i12 = AndroidUtilities.displaySize.y;
                        if (size6 > i12) {
                            size6 = i12;
                        }
                        size6 += AndroidUtilities.statusBarHeight;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i13 = AndroidUtilities.displaySize.y;
                    if (size6 > i13) {
                        size6 = i13;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.g0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 23:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                xd1 xd1Var = (xd1) this.b;
                kVar9 = ((org.telegram.ui.ActionBar.o2) xd1Var).actionBar;
                measureChildWithMargins(kVar9, i10, 0, i11, 0);
                kVar10 = ((org.telegram.ui.ActionBar.o2) xd1Var).actionBar;
                int measuredHeight2 = kVar10.getMeasuredHeight();
                kVar11 = ((org.telegram.ui.ActionBar.o2) xd1Var).actionBar;
                if (kVar11.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) xd1Var.n0.getLayoutParams()).topMargin = measuredHeight2;
                xd1Var.n0.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8, TLObject.FLAG_30));
                measureChildWithMargins(xd1Var.p0, i10, 0, i11, 0);
                break;
            case 25:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((ih1) this.b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                ut utVar = (ut) this.b;
                gh.d.c(utVar.s, utVar.y);
                utVar.t.d();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 18:
                return ((PopupNotificationActivity) this.b).c() || ((PopupNotificationActivity) getContext()).j(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.a) {
            case 18:
                ((PopupNotificationActivity) getContext()).j(null);
                super.requestDisallowInterceptTouchEvent(z10);
                break;
            default:
                super.requestDisallowInterceptTouchEvent(z10);
                break;
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        switch (this.a) {
            case 19:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.b);
                break;
            default:
                super.setScaleX(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 4:
                super.setTranslationY(f7);
                ((wb) this.b).X.invalidate();
                break;
            case 17:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.F1();
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 3:
                m6 m6Var = (m6) this.b;
                return drawable == m6Var.c || drawable == m6Var.b || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
