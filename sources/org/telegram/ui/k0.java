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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Context context) {
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
        org.telegram.ui.Cells.s1 s1Var;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                p6 p6Var = (p6) this.b;
                int c10 = ((measuredWidth - ((int) p6Var.c.c())) + ((int) p6Var.b.c())) / 2;
                if (!LocaleController.isRTL) {
                    p6Var.b.setBounds(0, 0, c10, getHeight());
                    p6Var.b.draw(canvas);
                    p6Var.c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                    p6Var.c.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 7:
                t60 t60Var = (t60) this.b;
                ch.f fVar = t60Var.p0;
                hh.d dVar = t60Var.q0;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    t60Var.f0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar != null && !dVar.r && dVar.c(measuredWidth2, measuredHeight)) {
                        fVar.b(dVar.a(measuredWidth2, measuredHeight), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, t60Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6), t60Var.m0);
                break;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.z1 == null) {
                        launchActivity.z1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.z1);
                    int[] iArr = launchActivity.z1;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.z1;
                    int i12 = i10 - iArr2[0];
                    int i13 = i11 - iArr2[1];
                    canvas.save();
                    canvas.translate(i12, i13);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 13:
                rg0 rg0Var = (rg0) this.b;
                rg0Var.getClass();
                int i14 = org.telegram.ui.ActionBar.y6.a7;
                int themedColor = rg0Var.getThemedColor(i14);
                int i15 = org.telegram.ui.ActionBar.y6.d6;
                int themedColor2 = rg0Var.getThemedColor(i15);
                vg1 vg1Var = rg0Var.c;
                int f7 = i0.a.f(vg1Var != null ? vg1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i16 = rg0Var.L;
                if (i16 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i16, getHeight(), org.telegram.ui.ActionBar.y6.m0(f7));
                }
                if (rg0Var.M != 0) {
                    canvas.drawRect(getWidth() - rg0Var.M, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.y6.m0(f7));
                }
                super.dispatchDraw(canvas);
                rg0Var.b0();
                hh.c cVar = rg0Var.Q;
                int themedColor3 = rg0Var.getThemedColor(i14);
                int themedColor4 = rg0Var.getThemedColor(i15);
                vg1 vg1Var2 = rg0Var.c;
                cVar.a(i0.a.f(vg1Var2 != null ? vg1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = rg0Var.G;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 23:
                f41 f41Var = (f41) this.b;
                if (f41Var.s > 0.0f && f41Var.n != null) {
                    f41Var.r.reset();
                    float width = getWidth() / f41Var.f.getWidth();
                    f41Var.r.postScale(width, width);
                    f41Var.h.setLocalMatrix(f41Var.r);
                    f41Var.n.setAlpha((int) (f41Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), f41Var.n);
                }
                if (f41Var.W && (s1Var = f41Var.O) != null) {
                    s1Var.setVisibility(4);
                    f41Var.W = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 24:
                u41 u41Var = (u41) this.b;
                ImageReceiver imageReceiver2 = u41Var.b;
                Rect rect = u41Var.e;
                f61 f61Var = u41Var.P;
                o51 o51Var = u41Var.a;
                if (u41Var.n != null && u41Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    u41Var.r.setAlpha((int) (u41Var.I * 255.0f));
                    canvas.drawBitmap(u41Var.n, 0.0f, 0.0f, u41Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (o51Var != null) {
                    Drawable drawable = o51Var.E;
                    if (drawable != null) {
                        if (u41Var.x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(u41Var.I, f61Var.n1, f61Var.f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(f61Var.k1);
                        }
                        drawable.setAlpha((int) ((1.0f - u41Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f10 = o51Var.N;
                        float max = (f10 != 0.0f || o51Var.S > 0.0f) ? (((1.0f - Math.max(o51Var.S * 0.8f, f10)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f11 = 1.0f - ((1.0f - u41Var.I) * (1.0f - o51Var.O));
                        canvas.save();
                        if (f11 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f11, 0.0f, 0.0f);
                            canvas.skew((1.0f - f11) * (1.0f - ((o51Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (u41Var.I * AndroidUtilities.dp(45.0f)) + u41Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i17 = o51Var.P;
                        if (i17 == 0) {
                            rect2.offset(AndroidUtilities.dp(f11 * 8.0f), 0);
                        } else if (i17 == 1) {
                            rect2.offset(AndroidUtilities.dp(f11 * 4.0f), 0);
                        } else if (i17 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f11 * (-4.0f)), 0);
                        } else if (i17 == 7) {
                            rect2.offset(AndroidUtilities.dp(f11 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - u41Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (f61Var.a0.getX() + f61Var.o0.getX() + u41Var.y), f61Var.a0.getY() + ((int) f61Var.o0.getY()) + u41Var.E);
                        f61Var.o0.draw(canvas);
                        canvas.restore();
                    } else if (o51Var.s && (imageReceiver = o51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - u41Var.I);
                        o51Var.h.setImageCoords(rect);
                        o51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(u41Var.I);
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
            case 6:
                if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                ht htVar = (ht) this.b;
                if (htVar.n || htVar.K) {
                    htVar.m();
                    return true;
                }
                htVar.l();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 23:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((f41) this.b).dismiss();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                ge geVar = (ge) this.b;
                if (motionEvent.getActionMasked() == 0) {
                    geVar.w.X0.C0();
                    for (View view : geVar.b.getViewPages()) {
                        if (view instanceof ee) {
                            ((ee) view).a.C0();
                        }
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = j4Var.f0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j10);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) j4Var.u0[0].getTranslationX();
                m3[] m3VarArr = j4Var.u0;
                if (view == m3VarArr[1]) {
                    i10 = translationX;
                } else {
                    i10 = measuredWidth;
                    if (view == m3VarArr[0]) {
                        i11 = translationX;
                        int save = canvas.save();
                        canvas.clipRect(i11, 0, i10, getHeight());
                        boolean drawChild = super.drawChild(canvas, view, j10);
                        canvas.restoreToCount(save);
                        if (translationX != 0) {
                            return drawChild;
                        }
                        m3[] m3VarArr2 = j4Var.u0;
                        if (view == m3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                            Drawable drawable = j4Var.m0;
                            drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            j4Var.m0.setAlpha((int) (max * 255.0f));
                            j4Var.m0.draw(canvas);
                            return drawChild;
                        }
                        if (view != m3VarArr2[1]) {
                            return drawChild;
                        }
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        j4Var.n0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i11, 0.0f, i10, getHeight(), j4Var.n0);
                        return drawChild;
                    }
                }
                i11 = 0;
                int save2 = canvas.save();
                canvas.clipRect(i11, 0, i10, getHeight());
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save2);
                if (translationX != 0) {
                }
                break;
            case 26:
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                vc1 vc1Var = (vc1) this.b;
                kVar = ((org.telegram.ui.ActionBar.r2) vc1Var).actionBar;
                if (view == kVar) {
                    j5Var = ((org.telegram.ui.ActionBar.r2) vc1Var).parentLayout;
                    if (j5Var != null) {
                        j5Var2 = ((org.telegram.ui.ActionBar.r2) vc1Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.r2) vc1Var).actionBar;
                        if (kVar2.getVisibility() == 0) {
                            kVar3 = ((org.telegram.ui.ActionBar.r2) vc1Var).actionBar;
                            i12 = kVar3.getMeasuredHeight();
                        } else {
                            i12 = 0;
                        }
                        ((ActionBarLayout) j5Var2).q(canvas, i12);
                    }
                }
                return drawChild3;
            case 27:
                cf1 cf1Var = (cf1) this.b;
                if (view == cf1Var.a1 && cf1Var.isInPreviewMode()) {
                    ((ActionBarLayout) cf1Var.getParentLayout()).p(canvas, (int) (cf1Var.W * 255.0f), (int) (cf1Var.a1.getY() + cf1Var.a1.getMeasuredHeight()));
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
                AndroidUtilities.runOnUIThread(((lh0) this.b).q0, 500L);
                break;
            case 24:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((u41) this.b).b;
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
            case 24:
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
                AndroidUtilities.cancelRunOnUIThread(((lh0) this.b).q0);
                break;
            case 24:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((u41) this.b).b;
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
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((cq0) this.b).b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((tq0) this.b).b.size(), new Object[0]));
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
            case 20:
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
                f5 f5Var = (f5) this.b;
                f5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
                int b10 = a8.ee.b((paddingTop - f5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                f5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int B = org.telegram.messenger.wh.B(48.0f, (paddingTop - b10) - f5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f5Var.d.getLayoutParams();
                layoutParams.topMargin = AndroidUtilities.dp(8.0f) + B;
                layoutParams2.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.t.D(8.0f, B, b10);
                layoutParams2.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                t60 t60Var = (t60) this.b;
                t60Var.h0();
                t60Var.i0();
                org.telegram.ui.Components.m20 m20Var = t60Var.f;
                oe.e eVar = t60Var.b;
                m20Var.setTranslationY(eVar.f);
                t60Var.j0();
                t60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.f);
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                k70 k70Var = (k70) this.b;
                TextView textView = k70Var.b;
                if (textView != null) {
                    int measuredWidth = ((k70Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (k70Var.c.getMeasuredWidth() / 2);
                    int top = (k70Var.e.getTop() + ((k70Var.b.getMeasuredHeight() - k70Var.c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = k70Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, k70Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ig0 ig0Var = (ig0) this.b;
                for (org.telegram.ui.Components.bx0 bx0Var : ig0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bx0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!bx0Var.a() && ig0Var.c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    bx0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                rg0 rg0Var = (rg0) this.b;
                rg0Var.f0();
                rg0Var.e0();
                break;
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.g0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                bh.p pVar = secretMediaViewer.e;
                pVar.layout(systemWindowInsetLeft, 0, pVar.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
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
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                ((f41) this.b).d();
                break;
            case 24:
                super.onLayout(z10, i10, i11, i12, i13);
                u41 u41Var = (u41) this.b;
                Context context = u41Var.getContext();
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
                    Bitmap bitmap = u41Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || u41Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        u41Var.f();
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
        switch (this.a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                break;
            case 7:
                t60 t60Var = (t60) this.b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    t60Var.c0 = AndroidUtilities.dp(144.0f);
                } else {
                    t60Var.c0 = AndroidUtilities.dp(56.0f);
                }
                kVar = ((org.telegram.ui.ActionBar.r2) t60Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) t60Var.s.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.r2) t60Var).actionBar;
                marginLayoutParams.topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) t60Var.e.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.r2) t60Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) t60Var.f.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.r2) t60Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) t60Var.h.getLayoutParams();
                kVar5 = ((org.telegram.ui.ActionBar.r2) t60Var).actionBar;
                marginLayoutParams4.topMargin = kVar5.getMeasuredHeight();
                t60Var.h.getLayoutParams().height = t60Var.c0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) t60Var.d.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.r2) t60Var).actionBar;
                marginLayoutParams5.height = AndroidUtilities.dp(53.0f) + kVar6.getMeasuredHeight() + t60Var.c0;
                t60Var.k0();
                super.onMeasure(i10, i11);
                break;
            case 9:
                ((y70) this.b).w = AndroidUtilities.dp((AndroidUtilities.isTablet() || View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) ? 144.0f : 78.0f);
                super.onMeasure(i10, i11);
                break;
            case 11:
                super.onMeasure(i10, i11);
                oc0 oc0Var = ((rc0) this.b).x;
                if (oc0Var != null) {
                    oc0Var.a();
                    break;
                }
                break;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ig0 ig0Var = (ig0) this.b;
                for (org.telegram.ui.Components.bx0 bx0Var : ig0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) bx0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams6.topMargin);
                    if (!bx0Var.a() && ig0Var.c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    bx0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams6.rightMargin) - marginLayoutParams6.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
                }
                break;
            case 15:
                int paddingLeft = getPaddingLeft();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar7 = ((org.telegram.ui.ActionBar.r2) ((zj0) this.b)).actionBar;
                setPadding(paddingLeft, currentActionBarHeight + (kVar7.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), getPaddingRight(), 0);
                super.onMeasure(i10, i11);
                break;
            case 16:
                tp0 tp0Var = (tp0) this.b;
                FrameLayout frameLayout = tp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) tp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                break;
            case 21:
                super.onMeasure(i10, i11);
                ProfileActivity.Y0((ProfileActivity) this.b);
                break;
            case 22:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.g0;
                if (windowInsets != null) {
                    if (AndroidUtilities.incorrectDisplaySizeFix) {
                        int i12 = AndroidUtilities.displaySize.y;
                        if (size4 > i12) {
                            size4 = i12;
                        }
                        size4 += AndroidUtilities.statusBarHeight;
                    }
                    size4 -= windowInsets.getSystemWindowInsetBottom();
                    size3 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i13 = AndroidUtilities.displaySize.y;
                    if (size4 > i13) {
                        size4 = i13;
                    }
                }
                setMeasuredDimension(size3, size4);
                WindowInsets windowInsets2 = secretMediaViewer.g0;
                if (windowInsets2 != null) {
                    size3 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 26:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                vc1 vc1Var = (vc1) this.b;
                kVar8 = ((org.telegram.ui.ActionBar.r2) vc1Var).actionBar;
                measureChildWithMargins(kVar8, i10, 0, i11, 0);
                kVar9 = ((org.telegram.ui.ActionBar.r2) vc1Var).actionBar;
                int measuredHeight2 = kVar9.getMeasuredHeight();
                kVar10 = ((org.telegram.ui.ActionBar.r2) vc1Var).actionBar;
                if (kVar10.getVisibility() == 0) {
                    size6 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) vc1Var.o0.getLayoutParams()).topMargin = measuredHeight2;
                vc1Var.o0.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30));
                measureChildWithMargins(vc1Var.q0, i10, 0, i11, 0);
                break;
            case 28:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((fg1) this.b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 6:
                super.onSizeChanged(i10, i11, i12, i13);
                ht htVar = (ht) this.b;
                ih.d.c(htVar.s, htVar.y);
                htVar.t.d();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 20:
                return ((PopupNotificationActivity) this.b).c() || ((PopupNotificationActivity) getContext()).j(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.a) {
            case 20:
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
            case 21:
                super.setScaleX(f7);
                ProfileActivity.Y0((ProfileActivity) this.b);
                break;
            case 25:
                super.setScaleX(f7);
                ((f81) this.b).o0();
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
            case 19:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.I1();
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
                p6 p6Var = (p6) this.b;
                return drawable == p6Var.c || drawable == p6Var.b || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
