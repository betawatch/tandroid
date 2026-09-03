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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Context context) {
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
        org.telegram.ui.Components.k81 k81Var;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                o6 o6Var = (o6) this.b;
                int d = ((measuredWidth - ((int) o6Var.c.d())) + ((int) o6Var.b.d())) / 2;
                if (!LocaleController.isRTL) {
                    o6Var.b.setBounds(0, 0, d, getHeight());
                    o6Var.b.draw(canvas);
                    o6Var.c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                    o6Var.c.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 6:
                super.dispatchDraw(canvas);
                yu yuVar = (yu) this.b;
                if (yuVar.getParentLayout() != null && (k81Var = yuVar.b) != null) {
                    float measuredHeight = k81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.k6.k0);
                    break;
                }
                break;
            case 7:
                z60 z60Var = (z60) this.b;
                og.e eVar = z60Var.m0;
                tg.d dVar = z60Var.n0;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    z60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.n && dVar.f(measuredWidth2, measuredHeight2)) {
                        eVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, z60Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6), z60Var.j0);
                break;
            case 9:
                d80 d80Var = (d80) this.b;
                og.e eVar2 = d80Var.I;
                tg.d dVar2 = d80Var.J;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    d80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        eVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                View view = launchActivity.D0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.u1 == null) {
                        launchActivity.u1 = new int[2];
                    }
                    launchActivity.D0.getLocationInWindow(launchActivity.u1);
                    int[] iArr = launchActivity.u1;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.u1;
                    int i12 = i10 - iArr2[0];
                    int i13 = i11 - iArr2[1];
                    canvas.save();
                    canvas.translate(i12, i13);
                    launchActivity.D0.getBackground().draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 13:
                wg0 wg0Var = (wg0) this.b;
                wg0Var.getClass();
                int i14 = org.telegram.ui.ActionBar.k6.a7;
                int themedColor = wg0Var.getThemedColor(i14);
                int i15 = org.telegram.ui.ActionBar.k6.d6;
                int themedColor2 = wg0Var.getThemedColor(i15);
                oh1 oh1Var = wg0Var.c;
                int d10 = i0.a.d(oh1Var != null ? oh1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i16 = wg0Var.J;
                if (i16 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i16, getHeight(), org.telegram.ui.ActionBar.k6.l0(d10));
                }
                if (wg0Var.K != 0) {
                    canvas.drawRect(getWidth() - wg0Var.K, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.k6.l0(d10));
                }
                super.dispatchDraw(canvas);
                wg0Var.d0();
                tg.c cVar = wg0Var.P;
                int themedColor3 = wg0Var.getThemedColor(i14);
                int themedColor4 = wg0Var.getThemedColor(i15);
                oh1 oh1Var2 = wg0Var.c;
                cVar.a(i0.a.d(oh1Var2 != null ? oh1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = wg0Var.E;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 22:
                w41 w41Var = (w41) this.b;
                if (w41Var.s > 0.0f && w41Var.n != null) {
                    w41Var.r.reset();
                    float width = getWidth() / w41Var.f.getWidth();
                    w41Var.r.postScale(width, width);
                    w41Var.h.setLocalMatrix(w41Var.r);
                    w41Var.n.setAlpha((int) (w41Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), w41Var.n);
                }
                if (w41Var.T && (t1Var = w41Var.L) != null) {
                    t1Var.setVisibility(4);
                    w41Var.T = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 23:
                l51 l51Var = (l51) this.b;
                ImageReceiver imageReceiver2 = l51Var.b;
                Rect rect = l51Var.e;
                w61 w61Var = l51Var.M;
                f61 f61Var = l51Var.a;
                if (l51Var.n != null && l51Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    l51Var.r.setAlpha((int) (l51Var.F * 255.0f));
                    canvas.drawBitmap(l51Var.n, 0.0f, 0.0f, l51Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (f61Var != null) {
                    Drawable drawable = f61Var.B;
                    if (drawable != null) {
                        if (l51Var.x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(l51Var.F, w61Var.j1, w61Var.c1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(w61Var.h1);
                        }
                        drawable.setAlpha((int) ((1.0f - l51Var.F) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f10 = f61Var.K;
                        float max = (f10 != 0.0f || f61Var.P > 0.0f) ? (((1.0f - Math.max(f61Var.P * 0.8f, f10)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f11 = 1.0f - ((1.0f - l51Var.F) * (1.0f - f61Var.L));
                        canvas.save();
                        if (f11 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f11, 0.0f, 0.0f);
                            canvas.skew((1.0f - f11) * (1.0f - ((f61Var.M * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (l51Var.F * AndroidUtilities.dp(45.0f)) + l51Var.C);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i17 = f61Var.M;
                        if (i17 == 0) {
                            rect2.offset(AndroidUtilities.dp(f11 * 8.0f), 0);
                        } else if (i17 == 1) {
                            rect2.offset(AndroidUtilities.dp(f11 * 4.0f), 0);
                        } else if (i17 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f11 * (-4.0f)), 0);
                        } else if (i17 == 7) {
                            rect2.offset(AndroidUtilities.dp(f11 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - l51Var.F) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (w61Var.U.getX() + w61Var.l0.getX() + l51Var.y), w61Var.U.getY() + ((int) w61Var.l0.getY()) + l51Var.B);
                        w61Var.l0.draw(canvas);
                        canvas.restore();
                    } else if (f61Var.s && (imageReceiver = f61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - l51Var.F);
                        f61Var.h.setImageCoords(rect);
                        f61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(l51Var.F);
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
                qt qtVar = (qt) this.b;
                if (qtVar.n || qtVar.K) {
                    qtVar.o();
                    return true;
                }
                qtVar.n();
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
                ((w41) this.b).dismiss();
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
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = l4Var.c0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j10);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) l4Var.r0[0].getTranslationX();
                p3[] p3VarArr = l4Var.r0;
                if (view == p3VarArr[1]) {
                    i10 = translationX;
                } else {
                    i10 = measuredWidth;
                    if (view == p3VarArr[0]) {
                        i11 = translationX;
                        int save = canvas.save();
                        canvas.clipRect(i11, 0, i10, getHeight());
                        boolean drawChild = super.drawChild(canvas, view, j10);
                        canvas.restoreToCount(save);
                        if (translationX != 0) {
                            return drawChild;
                        }
                        p3[] p3VarArr2 = l4Var.r0;
                        if (view == p3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                            Drawable drawable = l4Var.j0;
                            drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            l4Var.j0.setAlpha((int) (max * 255.0f));
                            l4Var.j0.draw(canvas);
                            return drawChild;
                        }
                        if (view != p3VarArr2[1]) {
                            return drawChild;
                        }
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        l4Var.k0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i11, 0.0f, i10, getHeight(), l4Var.k0);
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
            case 24:
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                jd1 jd1Var = (jd1) this.b;
                kVar = ((org.telegram.ui.ActionBar.p2) jd1Var).actionBar;
                if (view == kVar) {
                    f5Var = ((org.telegram.ui.ActionBar.p2) jd1Var).parentLayout;
                    if (f5Var != null) {
                        f5Var2 = ((org.telegram.ui.ActionBar.p2) jd1Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.p2) jd1Var).actionBar;
                        if (kVar2.getVisibility() == 0) {
                            kVar3 = ((org.telegram.ui.ActionBar.p2) jd1Var).actionBar;
                            i12 = kVar3.getMeasuredHeight();
                        } else {
                            i12 = 0;
                        }
                        ((ActionBarLayout) f5Var2).q(canvas, i12);
                    }
                }
                return drawChild3;
            case 25:
                sf1 sf1Var = (sf1) this.b;
                if (view == sf1Var.X0 && sf1Var.isInPreviewMode()) {
                    ((ActionBarLayout) sf1Var.getParentLayout()).p(canvas, (int) (sf1Var.T * 255.0f), (int) (sf1Var.X0.getY() + sf1Var.X0.getMeasuredHeight()));
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
                AndroidUtilities.runOnUIThread(((qh0) this.b).n0, 500L);
                break;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((l51) this.b).b;
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
                AndroidUtilities.cancelRunOnUIThread(((qh0) this.b).n0);
                break;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((l51) this.b).b;
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((wp0) this.b).b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((mq0) this.b).b.size(), new Object[0]));
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
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        Activity activity;
        switch (this.a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                e5 e5Var = (e5) this.b;
                e5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
                int b10 = k7.o.b((paddingTop - e5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                e5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int x10 = b.x(48.0f, (paddingTop - b10) - e5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e5Var.d.getLayoutParams();
                layoutParams.topMargin = AndroidUtilities.dp(8.0f) + x10;
                layoutParams2.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y3.C(8.0f, x10, b10);
                layoutParams2.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z4, i10, i11, i12, i13);
                break;
            case 7:
                super.onLayout(z4, i10, i11, i12, i13);
                z60 z60Var = (z60) this.b;
                z60Var.g0();
                z60Var.h0();
                org.telegram.ui.Components.d20 d20Var = z60Var.f;
                xd.c cVar = z60Var.b;
                d20Var.setTranslationY(cVar.e);
                z60Var.i0();
                z60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar.e);
                break;
            case 8:
                super.onLayout(z4, i10, i11, i12, i13);
                p70 p70Var = (p70) this.b;
                TextView textView = p70Var.b;
                if (textView != null) {
                    int measuredWidth = ((p70Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (p70Var.c.getMeasuredWidth() / 2);
                    int top = (p70Var.e.getTop() + ((p70Var.b.getMeasuredHeight() - p70Var.c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = p70Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, p70Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                d80 d80Var = (d80) this.b;
                d80Var.Z();
                d80Var.b0();
                break;
            case 12:
                super.onLayout(z4, i10, i11, i12, i13);
                og0 og0Var = (og0) this.b;
                for (org.telegram.ui.Components.vv0 vv0Var : og0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!vv0Var.a() && og0Var.c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    vv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                break;
            case 13:
                super.onLayout(z4, i10, i11, i12, i13);
                wg0 wg0Var = (wg0) this.b;
                wg0Var.i0();
                wg0Var.h0();
                break;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.d0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                ag.l lVar = secretMediaViewer.e;
                lVar.layout(systemWindowInsetLeft, 0, lVar.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
                if (z4) {
                    if (secretMediaViewer.H0 == null) {
                        secretMediaViewer.v0 = 1.0f;
                        secretMediaViewer.t0 = 0.0f;
                        secretMediaViewer.u0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.v0);
                    break;
                }
                break;
            case 22:
                super.onLayout(z4, i10, i11, i12, i13);
                ((w41) this.b).d();
                break;
            case 23:
                super.onLayout(z4, i10, i11, i12, i13);
                l51 l51Var = (l51) this.b;
                Context context = l51Var.getContext();
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
                    Bitmap bitmap = l51Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || l51Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        l51Var.f();
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
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
                    z60Var.Z = AndroidUtilities.dp(144.0f);
                } else {
                    z60Var.Z = AndroidUtilities.dp(56.0f);
                }
                kVar = ((org.telegram.ui.ActionBar.p2) z60Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) z60Var.s.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.p2) z60Var).actionBar;
                marginLayoutParams.topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) z60Var.e.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.p2) z60Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) z60Var.f.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.p2) z60Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) z60Var.h.getLayoutParams();
                kVar5 = ((org.telegram.ui.ActionBar.p2) z60Var).actionBar;
                marginLayoutParams4.topMargin = kVar5.getMeasuredHeight();
                z60Var.h.getLayoutParams().height = z60Var.Z;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) z60Var.d.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.p2) z60Var).actionBar;
                marginLayoutParams5.height = AndroidUtilities.dp(53.0f) + kVar6.getMeasuredHeight() + z60Var.Z;
                z60Var.j0();
                super.onMeasure(i10, i11);
                break;
            case 9:
                d80 d80Var = (d80) this.b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size4 > size3) {
                    d80Var.x = AndroidUtilities.dp(144.0f);
                } else {
                    d80Var.x = AndroidUtilities.dp(56.0f);
                }
                kVar7 = ((org.telegram.ui.ActionBar.p2) d80Var).actionBar;
                measureChildWithMargins(kVar7, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) d80Var.r.getLayoutParams();
                kVar8 = ((org.telegram.ui.ActionBar.p2) d80Var).actionBar;
                marginLayoutParams6.topMargin = AndroidUtilities.dp(48.0f) + kVar8.getMeasuredHeight();
                d80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + d80Var.x;
                d80Var.a0();
                super.onMeasure(i10, i11);
                break;
            case 11:
                super.onMeasure(i10, i11);
                yc0 yc0Var = ((bd0) this.b).x;
                if (yc0Var != null) {
                    yc0Var.a();
                    break;
                }
                break;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                og0 og0Var = (og0) this.b;
                for (org.telegram.ui.Components.vv0 vv0Var : og0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) vv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams7.topMargin);
                    if (!vv0Var.a() && og0Var.c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    vv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams7.rightMargin) - marginLayoutParams7.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
                }
                break;
            case 15:
                np0 np0Var = (np0) this.b;
                FrameLayout frameLayout = np0Var.I;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) np0Var.I.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
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
                WindowInsets windowInsets = secretMediaViewer.d0;
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
                WindowInsets windowInsets2 = secretMediaViewer.d0;
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
                jd1 jd1Var = (jd1) this.b;
                kVar9 = ((org.telegram.ui.ActionBar.p2) jd1Var).actionBar;
                measureChildWithMargins(kVar9, i10, 0, i11, 0);
                kVar10 = ((org.telegram.ui.ActionBar.p2) jd1Var).actionBar;
                int measuredHeight2 = kVar10.getMeasuredHeight();
                kVar11 = ((org.telegram.ui.ActionBar.p2) jd1Var).actionBar;
                if (kVar11.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) jd1Var.k0.getLayoutParams()).topMargin = measuredHeight2;
                jd1Var.k0.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8, TLObject.FLAG_30));
                measureChildWithMargins(jd1Var.m0, i10, 0, i11, 0);
                break;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((vg1) this.b).I.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
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
                qt qtVar = (qt) this.b;
                ug.c.c(qtVar.s, qtVar.y);
                qtVar.t.d();
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
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        switch (this.a) {
            case 19:
                ((PopupNotificationActivity) getContext()).j(null);
                super.requestDisallowInterceptTouchEvent(z4);
                break;
            default:
                super.requestDisallowInterceptTouchEvent(z4);
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
                ((sb) this.b).Y.invalidate();
                break;
            case 18:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.Q8;
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
                o6 o6Var = (o6) this.b;
                return drawable == o6Var.c || drawable == o6Var.b || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
