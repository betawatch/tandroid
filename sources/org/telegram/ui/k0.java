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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        org.telegram.ui.Components.v81 v81Var;
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                k6 k6Var = (k6) this.b;
                int d = ((measuredWidth - ((int) k6Var.c.d())) + ((int) k6Var.b.d())) / 2;
                if (!LocaleController.isRTL) {
                    k6Var.b.setBounds(0, 0, d, getHeight());
                    k6Var.b.draw(canvas);
                    k6Var.c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                    k6Var.c.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 6:
                super.dispatchDraw(canvas);
                vu vuVar = (vu) this.b;
                if (vuVar.getParentLayout() != null && (v81Var = vuVar.b) != null) {
                    float measuredHeight = v81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.h6.k0);
                    break;
                }
                break;
            case 7:
                z60 z60Var = (z60) this.b;
                ah.h hVar = z60Var.p0;
                fh.d dVar = z60Var.q0;
                if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
                    z60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.n && dVar.g(measuredWidth2, measuredHeight2)) {
                        hVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, z60Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6), z60Var.m0);
                break;
            case 9:
                g80 g80Var = (g80) this.b;
                ah.h hVar2 = g80Var.L;
                fh.d dVar2 = g80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && hVar2 != null) {
                    g80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n && dVar2.g(measuredWidth3, measuredHeight3)) {
                        hVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
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
            case 13:
                yg0 yg0Var = (yg0) this.b;
                yg0Var.getClass();
                int i14 = org.telegram.ui.ActionBar.h6.a7;
                int themedColor = yg0Var.getThemedColor(i14);
                int i15 = org.telegram.ui.ActionBar.h6.d6;
                int themedColor2 = yg0Var.getThemedColor(i15);
                sh1 sh1Var = yg0Var.c;
                int d10 = i0.a.d(sh1Var != null ? sh1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i16 = yg0Var.M;
                if (i16 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i16, getHeight(), org.telegram.ui.ActionBar.h6.l0(d10));
                }
                if (yg0Var.N != 0) {
                    canvas.drawRect(getWidth() - yg0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.h6.l0(d10));
                }
                super.dispatchDraw(canvas);
                yg0Var.d0();
                fh.c cVar = yg0Var.R;
                int themedColor3 = yg0Var.getThemedColor(i14);
                int themedColor4 = yg0Var.getThemedColor(i15);
                sh1 sh1Var2 = yg0Var.c;
                cVar.a(i0.a.d(sh1Var2 != null ? sh1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = yg0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 22:
                b51 b51Var = (b51) this.b;
                if (b51Var.s > 0.0f && b51Var.n != null) {
                    b51Var.r.reset();
                    float width = getWidth() / b51Var.f.getWidth();
                    b51Var.r.postScale(width, width);
                    b51Var.h.setLocalMatrix(b51Var.r);
                    b51Var.n.setAlpha((int) (b51Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), b51Var.n);
                }
                if (b51Var.W && (u1Var = b51Var.O) != null) {
                    u1Var.setVisibility(4);
                    b51Var.W = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 23:
                p51 p51Var = (p51) this.b;
                ImageReceiver imageReceiver2 = p51Var.b;
                Rect rect = p51Var.e;
                a71 a71Var = p51Var.P;
                j61 j61Var = p51Var.a;
                if (p51Var.n != null && p51Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    p51Var.r.setAlpha((int) (p51Var.I * 255.0f));
                    canvas.drawBitmap(p51Var.n, 0.0f, 0.0f, p51Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (j61Var != null) {
                    Drawable drawable = j61Var.E;
                    if (drawable != null) {
                        if (p51Var.x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(p51Var.I, a71Var.m1, a71Var.f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(a71Var.k1);
                        }
                        drawable.setAlpha((int) ((1.0f - p51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f7 = j61Var.N;
                        float max = (f7 != 0.0f || j61Var.S > 0.0f) ? (((1.0f - Math.max(j61Var.S * 0.8f, f7)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f10 = 1.0f - ((1.0f - p51Var.I) * (1.0f - j61Var.O));
                        canvas.save();
                        if (f10 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f10, 0.0f, 0.0f);
                            canvas.skew((1.0f - f10) * (1.0f - ((j61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (p51Var.I * AndroidUtilities.dp(45.0f)) + p51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i17 = j61Var.P;
                        if (i17 == 0) {
                            rect2.offset(AndroidUtilities.dp(f10 * 8.0f), 0);
                        } else if (i17 == 1) {
                            rect2.offset(AndroidUtilities.dp(f10 * 4.0f), 0);
                        } else if (i17 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f10 * (-4.0f)), 0);
                        } else if (i17 == 7) {
                            rect2.offset(AndroidUtilities.dp(f10 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - p51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (a71Var.a0.getX() + a71Var.o0.getX() + p51Var.y), a71Var.a0.getY() + ((int) a71Var.o0.getY()) + p51Var.E);
                        a71Var.o0.draw(canvas);
                        canvas.restore();
                    } else if (j61Var.s && (imageReceiver = j61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - p51Var.I);
                        j61Var.h.setImageCoords(rect);
                        j61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(p51Var.I);
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
                nt ntVar = (nt) this.b;
                if (ntVar.n || ntVar.K) {
                    ntVar.o();
                    return true;
                }
                ntVar.n();
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
                ((b51) this.b).dismiss();
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
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = i4Var.f0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j3);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) i4Var.u0[0].getTranslationX();
                m3[] m3VarArr = i4Var.u0;
                if (view == m3VarArr[1]) {
                    i10 = translationX;
                } else {
                    i10 = measuredWidth;
                    if (view == m3VarArr[0]) {
                        i11 = translationX;
                        int save = canvas.save();
                        canvas.clipRect(i11, 0, i10, getHeight());
                        boolean drawChild = super.drawChild(canvas, view, j3);
                        canvas.restoreToCount(save);
                        if (translationX != 0) {
                            return drawChild;
                        }
                        m3[] m3VarArr2 = i4Var.u0;
                        if (view == m3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                            Drawable drawable = i4Var.m0;
                            drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            i4Var.m0.setAlpha((int) (max * 255.0f));
                            i4Var.m0.draw(canvas);
                            return drawChild;
                        }
                        if (view != m3VarArr2[1]) {
                            return drawChild;
                        }
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        i4Var.n0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i11, 0.0f, i10, getHeight(), i4Var.n0);
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
            case 24:
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                od1 od1Var = (od1) this.b;
                kVar = ((org.telegram.ui.ActionBar.m2) od1Var).actionBar;
                if (view == kVar) {
                    b5Var = ((org.telegram.ui.ActionBar.m2) od1Var).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.m2) od1Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.m2) od1Var).actionBar;
                        if (kVar2.getVisibility() == 0) {
                            kVar3 = ((org.telegram.ui.ActionBar.m2) od1Var).actionBar;
                            i12 = kVar3.getMeasuredHeight();
                        } else {
                            i12 = 0;
                        }
                        ((ActionBarLayout) b5Var2).q(canvas, i12);
                    }
                }
                return drawChild3;
            case 25:
                wf1 wf1Var = (wf1) this.b;
                if (view == wf1Var.a1 && wf1Var.isInPreviewMode()) {
                    ((ActionBarLayout) wf1Var.getParentLayout()).p(canvas, (int) (wf1Var.W * 255.0f), (int) (wf1Var.a1.getY() + wf1Var.a1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((sh0) this.b).q0, 500L);
                break;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((p51) this.b).b;
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
                AndroidUtilities.cancelRunOnUIThread(((sh0) this.b).q0);
                break;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((p51) this.b).b;
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((cq0) this.b).b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 17:
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
            case 19:
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
                int b10 = w7.q.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int A = org.telegram.messenger.ok.A(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                layoutParams.topMargin = AndroidUtilities.dp(8.0f) + A;
                layoutParams2.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.f0.C(8.0f, A, b10);
                layoutParams2.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                z60 z60Var = (z60) this.b;
                z60Var.g0();
                z60Var.h0();
                org.telegram.ui.Components.c20 c20Var = z60Var.f;
                le.f fVar = z60Var.b;
                c20Var.setTranslationY(fVar.e);
                z60Var.i0();
                z60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + fVar.e);
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                r70 r70Var = (r70) this.b;
                TextView textView = r70Var.b;
                if (textView != null) {
                    int measuredWidth = ((r70Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (r70Var.c.getMeasuredWidth() / 2);
                    int top = (r70Var.e.getTop() + ((r70Var.b.getMeasuredHeight() - r70Var.c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = r70Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, r70Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                g80 g80Var = (g80) this.b;
                g80Var.Z();
                g80Var.b0();
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                qg0 qg0Var = (qg0) this.b;
                for (org.telegram.ui.Components.fw0 fw0Var : qg0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!fw0Var.a() && qg0Var.c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    fw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                yg0 yg0Var = (yg0) this.b;
                yg0Var.i0();
                yg0Var.h0();
                break;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.g0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                ci.m6 m6Var = secretMediaViewer.e;
                m6Var.layout(systemWindowInsetLeft, 0, m6Var.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
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
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((b51) this.b).d();
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                p51 p51Var = (p51) this.b;
                Context context = p51Var.getContext();
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
                    Bitmap bitmap = p51Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || p51Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        p51Var.f();
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
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 7:
                z60 z60Var = (z60) this.b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    z60Var.c0 = AndroidUtilities.dp(144.0f);
                } else {
                    z60Var.c0 = AndroidUtilities.dp(56.0f);
                }
                kVar = ((org.telegram.ui.ActionBar.m2) z60Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) z60Var.s.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.m2) z60Var).actionBar;
                marginLayoutParams.topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) z60Var.e.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.m2) z60Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) z60Var.f.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.m2) z60Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) z60Var.h.getLayoutParams();
                kVar5 = ((org.telegram.ui.ActionBar.m2) z60Var).actionBar;
                marginLayoutParams4.topMargin = kVar5.getMeasuredHeight();
                z60Var.h.getLayoutParams().height = z60Var.c0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) z60Var.d.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.m2) z60Var).actionBar;
                marginLayoutParams5.height = AndroidUtilities.dp(53.0f) + kVar6.getMeasuredHeight() + z60Var.c0;
                z60Var.j0();
                super.onMeasure(i10, i11);
                break;
            case 9:
                g80 g80Var = (g80) this.b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size4 > size3) {
                    g80Var.x = AndroidUtilities.dp(144.0f);
                } else {
                    g80Var.x = AndroidUtilities.dp(56.0f);
                }
                kVar7 = ((org.telegram.ui.ActionBar.m2) g80Var).actionBar;
                measureChildWithMargins(kVar7, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) g80Var.r.getLayoutParams();
                kVar8 = ((org.telegram.ui.ActionBar.m2) g80Var).actionBar;
                marginLayoutParams6.topMargin = AndroidUtilities.dp(48.0f) + kVar8.getMeasuredHeight();
                g80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + g80Var.x;
                g80Var.a0();
                super.onMeasure(i10, i11);
                break;
            case 11:
                super.onMeasure(i10, i11);
                zc0 zc0Var = ((cd0) this.b).x;
                if (zc0Var != null) {
                    zc0Var.a();
                    break;
                }
                break;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                qg0 qg0Var = (qg0) this.b;
                for (org.telegram.ui.Components.fw0 fw0Var : qg0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) fw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams7.topMargin);
                    if (!fw0Var.a() && qg0Var.c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    fw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams7.rightMargin) - marginLayoutParams7.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
                }
                break;
            case 15:
                tp0 tp0Var = (tp0) this.b;
                FrameLayout frameLayout = tp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) tp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                break;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.b);
                break;
            case 21:
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
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 24:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                od1 od1Var = (od1) this.b;
                kVar9 = ((org.telegram.ui.ActionBar.m2) od1Var).actionBar;
                measureChildWithMargins(kVar9, i10, 0, i11, 0);
                kVar10 = ((org.telegram.ui.ActionBar.m2) od1Var).actionBar;
                int measuredHeight2 = kVar10.getMeasuredHeight();
                kVar11 = ((org.telegram.ui.ActionBar.m2) od1Var).actionBar;
                if (kVar11.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) od1Var.n0.getLayoutParams()).topMargin = measuredHeight2;
                od1Var.n0.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8, TLObject.FLAG_30));
                measureChildWithMargins(od1Var.p0, i10, 0, i11, 0);
                break;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((zg1) this.b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
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
                nt ntVar = (nt) this.b;
                gh.d.c(ntVar.s, ntVar.y);
                ntVar.t.d();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
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
    public void setScaleX(float f7) {
        switch (this.a) {
            case 20:
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
                ((ub) this.b).X.invalidate();
                break;
            case 18:
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
                k6 k6Var = (k6) this.b;
                return drawable == k6Var.c || drawable == k6Var.b || super.verifyDrawable(drawable);
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
