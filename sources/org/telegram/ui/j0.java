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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.h81 h81Var;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                l6 l6Var = (l6) this.b;
                int d = ((measuredWidth - ((int) l6Var.c.d())) + ((int) l6Var.b.d())) / 2;
                if (!LocaleController.isRTL) {
                    l6Var.b.setBounds(0, 0, d, getHeight());
                    l6Var.b.draw(canvas);
                    l6Var.c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                    l6Var.c.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 6:
                super.dispatchDraw(canvas);
                zu zuVar = (zu) this.b;
                if (zuVar.getParentLayout() != null && (h81Var = zuVar.b) != null) {
                    float measuredHeight = h81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.i6.k0);
                    break;
                }
                break;
            case 7:
                e70 e70Var = (e70) this.b;
                ah.h hVar = e70Var.p0;
                fh.d dVar = e70Var.q0;
                if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
                    e70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.n && dVar.f(measuredWidth2, measuredHeight2)) {
                        hVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, e70Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6), e70Var.m0);
                break;
            case 9:
                l80 l80Var = (l80) this.b;
                ah.h hVar2 = l80Var.L;
                fh.d dVar2 = l80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && hVar2 != null) {
                    l80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        hVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
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
                eh0 eh0Var = (eh0) this.b;
                eh0Var.getClass();
                int i14 = org.telegram.ui.ActionBar.i6.a7;
                int themedColor = eh0Var.getThemedColor(i14);
                int i15 = org.telegram.ui.ActionBar.i6.d6;
                int themedColor2 = eh0Var.getThemedColor(i15);
                ai1 ai1Var = eh0Var.c;
                int d10 = i0.a.d(ai1Var != null ? ai1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i16 = eh0Var.M;
                if (i16 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i16, getHeight(), org.telegram.ui.ActionBar.i6.l0(d10));
                }
                if (eh0Var.N != 0) {
                    canvas.drawRect(getWidth() - eh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.i6.l0(d10));
                }
                super.dispatchDraw(canvas);
                eh0Var.d0();
                fh.c cVar = eh0Var.R;
                int themedColor3 = eh0Var.getThemedColor(i14);
                int themedColor4 = eh0Var.getThemedColor(i15);
                ai1 ai1Var2 = eh0Var.c;
                cVar.a(i0.a.d(ai1Var2 != null ? ai1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = eh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 22:
                i51 i51Var = (i51) this.b;
                if (i51Var.s > 0.0f && i51Var.n != null) {
                    i51Var.r.reset();
                    float width = getWidth() / i51Var.f.getWidth();
                    i51Var.r.postScale(width, width);
                    i51Var.h.setLocalMatrix(i51Var.r);
                    i51Var.n.setAlpha((int) (i51Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), i51Var.n);
                }
                if (i51Var.W && (t1Var = i51Var.O) != null) {
                    t1Var.setVisibility(4);
                    i51Var.W = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 23:
                w51 w51Var = (w51) this.b;
                ImageReceiver imageReceiver2 = w51Var.b;
                Rect rect = w51Var.e;
                h71 h71Var = w51Var.P;
                q61 q61Var = w51Var.a;
                if (w51Var.n != null && w51Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    w51Var.r.setAlpha((int) (w51Var.I * 255.0f));
                    canvas.drawBitmap(w51Var.n, 0.0f, 0.0f, w51Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (q61Var != null) {
                    Drawable drawable = q61Var.E;
                    if (drawable != null) {
                        if (w51Var.x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(w51Var.I, h71Var.m1, h71Var.f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(h71Var.k1);
                        }
                        drawable.setAlpha((int) ((1.0f - w51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f7 = q61Var.N;
                        float max = (f7 != 0.0f || q61Var.S > 0.0f) ? (((1.0f - Math.max(q61Var.S * 0.8f, f7)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f10 = 1.0f - ((1.0f - w51Var.I) * (1.0f - q61Var.O));
                        canvas.save();
                        if (f10 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f10, 0.0f, 0.0f);
                            canvas.skew((1.0f - f10) * (1.0f - ((q61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (w51Var.I * AndroidUtilities.dp(45.0f)) + w51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i17 = q61Var.P;
                        if (i17 == 0) {
                            rect2.offset(AndroidUtilities.dp(f10 * 8.0f), 0);
                        } else if (i17 == 1) {
                            rect2.offset(AndroidUtilities.dp(f10 * 4.0f), 0);
                        } else if (i17 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f10 * (-4.0f)), 0);
                        } else if (i17 == 7) {
                            rect2.offset(AndroidUtilities.dp(f10 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - w51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (h71Var.a0.getX() + h71Var.o0.getX() + w51Var.y), h71Var.a0.getY() + ((int) h71Var.o0.getY()) + w51Var.E);
                        h71Var.o0.draw(canvas);
                        canvas.restore();
                    } else if (q61Var.s && (imageReceiver = q61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - w51Var.I);
                        q61Var.h.setImageCoords(rect);
                        q61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(w51Var.I);
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
                st stVar = (st) this.b;
                if (stVar.n || stVar.K) {
                    stVar.o();
                    return true;
                }
                stVar.n();
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
                ((i51) this.b).dismiss();
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
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
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
            case 24:
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                wd1 wd1Var = (wd1) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) wd1Var).actionBar;
                if (view == kVar) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) wd1Var).parentLayout;
                    if (d5Var != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) wd1Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.n2) wd1Var).actionBar;
                        if (kVar2.getVisibility() == 0) {
                            kVar3 = ((org.telegram.ui.ActionBar.n2) wd1Var).actionBar;
                            i12 = kVar3.getMeasuredHeight();
                        } else {
                            i12 = 0;
                        }
                        ((ActionBarLayout) d5Var2).q(canvas, i12);
                    }
                }
                return drawChild3;
            case 25:
                eg1 eg1Var = (eg1) this.b;
                if (view == eg1Var.a1 && eg1Var.isInPreviewMode()) {
                    ((ActionBarLayout) eg1Var.getParentLayout()).p(canvas, (int) (eg1Var.W * 255.0f), (int) (eg1Var.a1.getY() + eg1Var.a1.getMeasuredHeight()));
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
                AndroidUtilities.runOnUIThread(((yh0) this.b).q0, 500L);
                break;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((w51) this.b).b;
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
                AndroidUtilities.cancelRunOnUIThread(((yh0) this.b).q0);
                break;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((w51) this.b).b;
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((jq0) this.b).b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((ar0) this.b).b.size(), new Object[0]));
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
                int b10 = w7.p.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int y3 = org.telegram.messenger.vl.y(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                layoutParams.topMargin = AndroidUtilities.dp(8.0f) + y3;
                layoutParams2.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y0.C(8.0f, y3, b10);
                layoutParams2.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                e70 e70Var = (e70) this.b;
                e70Var.g0();
                e70Var.h0();
                org.telegram.ui.Components.b20 b20Var = e70Var.f;
                le.e eVar = e70Var.b;
                b20Var.setTranslationY(eVar.e);
                e70Var.i0();
                e70Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                w70 w70Var = (w70) this.b;
                TextView textView = w70Var.b;
                if (textView != null) {
                    int measuredWidth = ((w70Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (w70Var.c.getMeasuredWidth() / 2);
                    int top = (w70Var.e.getTop() + ((w70Var.b.getMeasuredHeight() - w70Var.c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = w70Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, w70Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                l80 l80Var = (l80) this.b;
                l80Var.Z();
                l80Var.b0();
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                wg0 wg0Var = (wg0) this.b;
                for (org.telegram.ui.Components.uv0 uv0Var : wg0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) uv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!uv0Var.a() && wg0Var.c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    uv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                eh0 eh0Var = (eh0) this.b;
                eh0Var.i0();
                eh0Var.h0();
                break;
            case 21:
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
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((i51) this.b).d();
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                w51 w51Var = (w51) this.b;
                Context context = w51Var.getContext();
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
                    Bitmap bitmap = w51Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || w51Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        w51Var.f();
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
                e70 e70Var = (e70) this.b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    e70Var.c0 = AndroidUtilities.dp(144.0f);
                } else {
                    e70Var.c0 = AndroidUtilities.dp(56.0f);
                }
                kVar = ((org.telegram.ui.ActionBar.n2) e70Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e70Var.s.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.n2) e70Var).actionBar;
                marginLayoutParams.topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e70Var.e.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.n2) e70Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) e70Var.f.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.n2) e70Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) e70Var.h.getLayoutParams();
                kVar5 = ((org.telegram.ui.ActionBar.n2) e70Var).actionBar;
                marginLayoutParams4.topMargin = kVar5.getMeasuredHeight();
                e70Var.h.getLayoutParams().height = e70Var.c0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) e70Var.d.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.n2) e70Var).actionBar;
                marginLayoutParams5.height = AndroidUtilities.dp(53.0f) + kVar6.getMeasuredHeight() + e70Var.c0;
                e70Var.j0();
                super.onMeasure(i10, i11);
                break;
            case 9:
                l80 l80Var = (l80) this.b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size4 > size3) {
                    l80Var.x = AndroidUtilities.dp(144.0f);
                } else {
                    l80Var.x = AndroidUtilities.dp(56.0f);
                }
                kVar7 = ((org.telegram.ui.ActionBar.n2) l80Var).actionBar;
                measureChildWithMargins(kVar7, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) l80Var.r.getLayoutParams();
                kVar8 = ((org.telegram.ui.ActionBar.n2) l80Var).actionBar;
                marginLayoutParams6.topMargin = AndroidUtilities.dp(48.0f) + kVar8.getMeasuredHeight();
                l80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + l80Var.x;
                l80Var.a0();
                super.onMeasure(i10, i11);
                break;
            case 11:
                super.onMeasure(i10, i11);
                fd0 fd0Var = ((id0) this.b).x;
                if (fd0Var != null) {
                    fd0Var.a();
                    break;
                }
                break;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                wg0 wg0Var = (wg0) this.b;
                for (org.telegram.ui.Components.uv0 uv0Var : wg0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) uv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams7.topMargin);
                    if (!uv0Var.a() && wg0Var.c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    uv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams7.rightMargin) - marginLayoutParams7.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
                }
                break;
            case 15:
                aq0 aq0Var = (aq0) this.b;
                FrameLayout frameLayout = aq0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) aq0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
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
                wd1 wd1Var = (wd1) this.b;
                kVar9 = ((org.telegram.ui.ActionBar.n2) wd1Var).actionBar;
                measureChildWithMargins(kVar9, i10, 0, i11, 0);
                kVar10 = ((org.telegram.ui.ActionBar.n2) wd1Var).actionBar;
                int measuredHeight2 = kVar10.getMeasuredHeight();
                kVar11 = ((org.telegram.ui.ActionBar.n2) wd1Var).actionBar;
                if (kVar11.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) wd1Var.n0.getLayoutParams()).topMargin = measuredHeight2;
                wd1Var.n0.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8, TLObject.FLAG_30));
                measureChildWithMargins(wd1Var.p0, i10, 0, i11, 0);
                break;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((hh1) this.b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
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
                st stVar = (st) this.b;
                gh.d.c(stVar.s, stVar.y);
                stVar.t.d();
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
                l6 l6Var = (l6) this.b;
                return drawable == l6Var.c || drawable == l6Var.b || super.verifyDrawable(drawable);
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
