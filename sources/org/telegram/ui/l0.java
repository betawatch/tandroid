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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        org.telegram.ui.Components.k91 k91Var;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                o6 o6Var = (o6) this.b;
                int c10 = ((measuredWidth - ((int) o6Var.c.c())) + ((int) o6Var.b.c())) / 2;
                if (!LocaleController.isRTL) {
                    o6Var.b.setBounds(0, 0, c10, getHeight());
                    o6Var.b.draw(canvas);
                    o6Var.c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                    o6Var.c.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 6:
                super.dispatchDraw(canvas);
                ou ouVar = (ou) this.b;
                if (ouVar.getParentLayout() != null && (k91Var = ouVar.b) != null) {
                    float measuredHeight = k91Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.k6.k0);
                    break;
                }
                break;
            case 7:
                p60 p60Var = (p60) this.b;
                bh.f fVar = p60Var.p0;
                gh.d dVar = p60Var.q0;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    p60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.n && dVar.g(measuredWidth2, measuredHeight2)) {
                        fVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, p60Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6), p60Var.m0);
                break;
            case 9:
                x70 x70Var = (x70) this.b;
                bh.f fVar2 = x70Var.L;
                gh.d dVar2 = x70Var.M;
                if (Build.VERSION.SDK_INT >= 31 && fVar2 != null) {
                    x70Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n && dVar2.g(measuredWidth3, measuredHeight3)) {
                        fVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
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
                    if (launchActivity.A1 == null) {
                        launchActivity.A1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.A1);
                    int[] iArr = launchActivity.A1;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.A1;
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
                int i14 = org.telegram.ui.ActionBar.k6.a7;
                int themedColor = rg0Var.getThemedColor(i14);
                int i15 = org.telegram.ui.ActionBar.k6.d6;
                int themedColor2 = rg0Var.getThemedColor(i15);
                tg1 tg1Var = rg0Var.c;
                int f7 = i0.a.f(tg1Var != null ? tg1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i16 = rg0Var.M;
                if (i16 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i16, getHeight(), org.telegram.ui.ActionBar.k6.m0(f7));
                }
                if (rg0Var.N != 0) {
                    canvas.drawRect(getWidth() - rg0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.k6.m0(f7));
                }
                super.dispatchDraw(canvas);
                rg0Var.d0();
                gh.c cVar = rg0Var.R;
                int themedColor3 = rg0Var.getThemedColor(i14);
                int themedColor4 = rg0Var.getThemedColor(i15);
                tg1 tg1Var2 = rg0Var.c;
                cVar.a(i0.a.f(tg1Var2 != null ? tg1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = rg0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 22:
                b41 b41Var = (b41) this.b;
                if (b41Var.s > 0.0f && b41Var.n != null) {
                    b41Var.r.reset();
                    float width = getWidth() / b41Var.f.getWidth();
                    b41Var.r.postScale(width, width);
                    b41Var.h.setLocalMatrix(b41Var.r);
                    b41Var.n.setAlpha((int) (b41Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), b41Var.n);
                }
                if (b41Var.W && (t1Var = b41Var.O) != null) {
                    t1Var.setVisibility(4);
                    b41Var.W = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 23:
                q41 q41Var = (q41) this.b;
                ImageReceiver imageReceiver2 = q41Var.b;
                Rect rect = q41Var.e;
                b61 b61Var = q41Var.P;
                k51 k51Var = q41Var.a;
                if (q41Var.n != null && q41Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    q41Var.r.setAlpha((int) (q41Var.I * 255.0f));
                    canvas.drawBitmap(q41Var.n, 0.0f, 0.0f, q41Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (k51Var != null) {
                    Drawable drawable = k51Var.E;
                    if (drawable != null) {
                        if (q41Var.x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(q41Var.I, b61Var.n1, b61Var.f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(b61Var.k1);
                        }
                        drawable.setAlpha((int) ((1.0f - q41Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f10 = k51Var.N;
                        float max = (f10 != 0.0f || k51Var.S > 0.0f) ? (((1.0f - Math.max(k51Var.S * 0.8f, f10)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f11 = 1.0f - ((1.0f - q41Var.I) * (1.0f - k51Var.O));
                        canvas.save();
                        if (f11 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f11, 0.0f, 0.0f);
                            canvas.skew((1.0f - f11) * (1.0f - ((k51Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (q41Var.I * AndroidUtilities.dp(45.0f)) + q41Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i17 = k51Var.P;
                        if (i17 == 0) {
                            rect2.offset(AndroidUtilities.dp(f11 * 8.0f), 0);
                        } else if (i17 == 1) {
                            rect2.offset(AndroidUtilities.dp(f11 * 4.0f), 0);
                        } else if (i17 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f11 * (-4.0f)), 0);
                        } else if (i17 == 7) {
                            rect2.offset(AndroidUtilities.dp(f11 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - q41Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (b61Var.a0.getX() + b61Var.o0.getX() + q41Var.y), b61Var.a0.getY() + ((int) b61Var.o0.getY()) + q41Var.E);
                        b61Var.o0.draw(canvas);
                        canvas.restore();
                    } else if (k51Var.s && (imageReceiver = k51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - q41Var.I);
                        k51Var.h.setImageCoords(rect);
                        k51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(q41Var.I);
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
            case 22:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((b41) this.b).dismiss();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
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
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = k4Var.f0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j10);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) k4Var.u0[0].getTranslationX();
                n3[] n3VarArr = k4Var.u0;
                if (view == n3VarArr[1]) {
                    i10 = translationX;
                } else {
                    i10 = measuredWidth;
                    if (view == n3VarArr[0]) {
                        i11 = translationX;
                        int save = canvas.save();
                        canvas.clipRect(i11, 0, i10, getHeight());
                        boolean drawChild = super.drawChild(canvas, view, j10);
                        canvas.restoreToCount(save);
                        if (translationX != 0) {
                            return drawChild;
                        }
                        n3[] n3VarArr2 = k4Var.u0;
                        if (view == n3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                            Drawable drawable = k4Var.m0;
                            drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            k4Var.m0.setAlpha((int) (max * 255.0f));
                            k4Var.m0.draw(canvas);
                            return drawChild;
                        }
                        if (view != n3VarArr2[1]) {
                            return drawChild;
                        }
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        k4Var.n0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i11, 0.0f, i10, getHeight(), k4Var.n0);
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
                qc1 qc1Var = (qc1) this.b;
                kVar = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                if (view == kVar) {
                    h5Var = ((org.telegram.ui.ActionBar.o2) qc1Var).parentLayout;
                    if (h5Var != null) {
                        h5Var2 = ((org.telegram.ui.ActionBar.o2) qc1Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                        if (kVar2.getVisibility() == 0) {
                            kVar3 = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                            i12 = kVar3.getMeasuredHeight();
                        } else {
                            i12 = 0;
                        }
                        ((ActionBarLayout) h5Var2).q(canvas, i12);
                    }
                }
                return drawChild3;
            case 25:
                ye1 ye1Var = (ye1) this.b;
                if (view == ye1Var.a1 && ye1Var.isInPreviewMode()) {
                    ((ActionBarLayout) ye1Var.getParentLayout()).p(canvas, (int) (ye1Var.W * 255.0f), (int) (ye1Var.a1.getY() + ye1Var.a1.getMeasuredHeight()));
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
                AndroidUtilities.runOnUIThread(((mh0) this.b).q0, 500L);
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
                AndroidUtilities.cancelRunOnUIThread(((mh0) this.b).q0);
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((vp0) this.b).b.size(), new Object[0]));
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Activity activity;
        switch (this.a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                g5 g5Var = (g5) this.b;
                g5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
                int b10 = w7.r.b((paddingTop - g5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                g5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int A = org.telegram.messenger.sl.A(48.0f, (paddingTop - b10) - g5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g5Var.d.getLayoutParams();
                layoutParams.topMargin = AndroidUtilities.dp(8.0f) + A;
                layoutParams2.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.v0.C(8.0f, A, b10);
                layoutParams2.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                p60 p60Var = (p60) this.b;
                p60Var.g0();
                p60Var.h0();
                org.telegram.ui.Components.k20 k20Var = p60Var.f;
                ne.e eVar = p60Var.b;
                k20Var.setTranslationY(eVar.e);
                p60Var.i0();
                p60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                g70 g70Var = (g70) this.b;
                TextView textView = g70Var.b;
                if (textView != null) {
                    int measuredWidth = ((g70Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (g70Var.c.getMeasuredWidth() / 2);
                    int top = (g70Var.e.getTop() + ((g70Var.b.getMeasuredHeight() - g70Var.c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = g70Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, g70Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                x70 x70Var = (x70) this.b;
                x70Var.Z();
                x70Var.b0();
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ig0 ig0Var = (ig0) this.b;
                for (org.telegram.ui.Components.tw0 tw0Var : ig0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!tw0Var.a() && ig0Var.c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    tw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                rg0 rg0Var = (rg0) this.b;
                rg0Var.i0();
                rg0Var.h0();
                break;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.g0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                ah.v vVar = secretMediaViewer.e;
                vVar.layout(systemWindowInsetLeft, 0, vVar.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
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
                ((b41) this.b).d();
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
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
                p60 p60Var = (p60) this.b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    p60Var.c0 = AndroidUtilities.dp(144.0f);
                } else {
                    p60Var.c0 = AndroidUtilities.dp(56.0f);
                }
                kVar = ((org.telegram.ui.ActionBar.o2) p60Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p60Var.s.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.o2) p60Var).actionBar;
                marginLayoutParams.topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) p60Var.e.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.o2) p60Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) p60Var.f.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.o2) p60Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) p60Var.h.getLayoutParams();
                kVar5 = ((org.telegram.ui.ActionBar.o2) p60Var).actionBar;
                marginLayoutParams4.topMargin = kVar5.getMeasuredHeight();
                p60Var.h.getLayoutParams().height = p60Var.c0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) p60Var.d.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.o2) p60Var).actionBar;
                marginLayoutParams5.height = AndroidUtilities.dp(53.0f) + kVar6.getMeasuredHeight() + p60Var.c0;
                p60Var.j0();
                super.onMeasure(i10, i11);
                break;
            case 9:
                x70 x70Var = (x70) this.b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size4 > size3) {
                    x70Var.x = AndroidUtilities.dp(144.0f);
                } else {
                    x70Var.x = AndroidUtilities.dp(56.0f);
                }
                kVar7 = ((org.telegram.ui.ActionBar.o2) x70Var).actionBar;
                measureChildWithMargins(kVar7, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) x70Var.r.getLayoutParams();
                kVar8 = ((org.telegram.ui.ActionBar.o2) x70Var).actionBar;
                marginLayoutParams6.topMargin = AndroidUtilities.dp(48.0f) + kVar8.getMeasuredHeight();
                x70Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + x70Var.x;
                x70Var.a0();
                super.onMeasure(i10, i11);
                break;
            case 11:
                super.onMeasure(i10, i11);
                pc0 pc0Var = ((sc0) this.b).x;
                if (pc0Var != null) {
                    pc0Var.a();
                    break;
                }
                break;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ig0 ig0Var = (ig0) this.b;
                for (org.telegram.ui.Components.tw0 tw0Var : ig0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) tw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams7.topMargin);
                    if (!tw0Var.a() && ig0Var.c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    tw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams7.rightMargin) - marginLayoutParams7.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
                }
                break;
            case 15:
                lp0 lp0Var = (lp0) this.b;
                FrameLayout frameLayout = lp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) lp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
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
                qc1 qc1Var = (qc1) this.b;
                kVar9 = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                measureChildWithMargins(kVar9, i10, 0, i11, 0);
                kVar10 = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                int measuredHeight2 = kVar10.getMeasuredHeight();
                kVar11 = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                if (kVar11.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) qc1Var.o0.getLayoutParams()).topMargin = measuredHeight2;
                qc1Var.o0.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8, TLObject.FLAG_30));
                measureChildWithMargins(qc1Var.q0, i10, 0, i11, 0);
                break;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((bg1) this.b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
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
                ht htVar = (ht) this.b;
                hh.d.c(htVar.s, htVar.y);
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
                ((vb) this.b).X.invalidate();
                break;
            case 18:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.H1();
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
