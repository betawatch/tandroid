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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Context context) {
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
        org.telegram.ui.Components.y71 y71Var;
        org.telegram.ui.Cells.s1 s1Var;
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
                pu puVar = (pu) this.b;
                if (puVar.getParentLayout() != null && (y71Var = puVar.b) != null) {
                    float measuredHeight = y71Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.g6.k0);
                    break;
                }
                break;
            case 7:
                m60 m60Var = (m60) this.b;
                lg.e eVar = m60Var.l0;
                qg.d dVar = m60Var.m0;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    m60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.n && dVar.e(measuredWidth2, measuredHeight2)) {
                        eVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, m60Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6), m60Var.i0);
                break;
            case 9:
                s70 s70Var = (s70) this.b;
                lg.e eVar2 = s70Var.H;
                qg.d dVar2 = s70Var.I;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    s70Var.Y();
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
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.t1;
                    int i12 = i10 - iArr2[0];
                    int i13 = i11 - iArr2[1];
                    canvas.save();
                    canvas.translate(i12, i13);
                    launchActivity.C0.getBackground().draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 13:
                ng0 ng0Var = (ng0) this.b;
                ng0Var.getClass();
                int i14 = org.telegram.ui.ActionBar.g6.a7;
                int themedColor = ng0Var.getThemedColor(i14);
                int i15 = org.telegram.ui.ActionBar.g6.d6;
                int themedColor2 = ng0Var.getThemedColor(i15);
                ug1 ug1Var = ng0Var.c;
                int d10 = i0.a.d(ug1Var != null ? ug1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i16 = ng0Var.I;
                if (i16 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i16, getHeight(), org.telegram.ui.ActionBar.g6.l0(d10));
                }
                if (ng0Var.J != 0) {
                    canvas.drawRect(getWidth() - ng0Var.J, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.g6.l0(d10));
                }
                super.dispatchDraw(canvas);
                ng0Var.d0();
                qg.c cVar = ng0Var.O;
                int themedColor3 = ng0Var.getThemedColor(i14);
                int themedColor4 = ng0Var.getThemedColor(i15);
                ug1 ug1Var2 = ng0Var.c;
                cVar.a(i0.a.d(ug1Var2 != null ? ug1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = ng0Var.D;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 22:
                f41 f41Var = (f41) this.b;
                if (f41Var.s > 0.0f && f41Var.n != null) {
                    f41Var.r.reset();
                    float width = getWidth() / f41Var.f.getWidth();
                    f41Var.r.postScale(width, width);
                    f41Var.h.setLocalMatrix(f41Var.r);
                    f41Var.n.setAlpha((int) (f41Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), f41Var.n);
                }
                if (f41Var.S && (s1Var = f41Var.K) != null) {
                    s1Var.setVisibility(4);
                    f41Var.S = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 23:
                s41 s41Var = (s41) this.b;
                ImageReceiver imageReceiver2 = s41Var.b;
                Rect rect = s41Var.e;
                d61 d61Var = s41Var.L;
                m51 m51Var = s41Var.a;
                if (s41Var.n != null && s41Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    s41Var.r.setAlpha((int) (s41Var.E * 255.0f));
                    canvas.drawBitmap(s41Var.n, 0.0f, 0.0f, s41Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (m51Var != null) {
                    Drawable drawable = m51Var.A;
                    if (drawable != null) {
                        if (s41Var.x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(s41Var.E, d61Var.i1, d61Var.b1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(d61Var.g1);
                        }
                        drawable.setAlpha((int) ((1.0f - s41Var.E) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f9 = m51Var.J;
                        float max = (f9 != 0.0f || m51Var.O > 0.0f) ? (((1.0f - Math.max(m51Var.O * 0.8f, f9)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f10 = 1.0f - ((1.0f - s41Var.E) * (1.0f - m51Var.K));
                        canvas.save();
                        if (f10 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f10, 0.0f, 0.0f);
                            canvas.skew((1.0f - f10) * (1.0f - ((m51Var.L * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (s41Var.E * AndroidUtilities.dp(45.0f)) + s41Var.B);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i17 = m51Var.L;
                        if (i17 == 0) {
                            rect2.offset(AndroidUtilities.dp(f10 * 8.0f), 0);
                        } else if (i17 == 1) {
                            rect2.offset(AndroidUtilities.dp(f10 * 4.0f), 0);
                        } else if (i17 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f10 * (-4.0f)), 0);
                        } else if (i17 == 7) {
                            rect2.offset(AndroidUtilities.dp(f10 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - s41Var.E) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (d61Var.T.getX() + d61Var.k0.getX() + s41Var.y), d61Var.T.getY() + ((int) d61Var.k0.getY()) + s41Var.A);
                        d61Var.k0.draw(canvas);
                        canvas.restore();
                    } else if (m51Var.s && (imageReceiver = m51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - s41Var.E);
                        m51Var.h.setImageCoords(rect);
                        m51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(s41Var.E);
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
                ((f41) this.b).dismiss();
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.l lVar2;
        int i12;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.a) {
            case 0:
                m4 m4Var = (m4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = m4Var.b0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j10);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) m4Var.q0[0].getTranslationX();
                q3[] q3VarArr = m4Var.q0;
                if (view == q3VarArr[1]) {
                    i10 = translationX;
                } else {
                    i10 = measuredWidth;
                    if (view == q3VarArr[0]) {
                        i11 = translationX;
                        int save = canvas.save();
                        canvas.clipRect(i11, 0, i10, getHeight());
                        boolean drawChild = super.drawChild(canvas, view, j10);
                        canvas.restoreToCount(save);
                        if (translationX != 0) {
                            return drawChild;
                        }
                        q3[] q3VarArr2 = m4Var.q0;
                        if (view == q3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                            Drawable drawable = m4Var.i0;
                            drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            m4Var.i0.setAlpha((int) (max * 255.0f));
                            m4Var.i0.draw(canvas);
                            return drawChild;
                        }
                        if (view != q3VarArr2[1]) {
                            return drawChild;
                        }
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        m4Var.j0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i11, 0.0f, i10, getHeight(), m4Var.j0);
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
                lVar = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                if (view == lVar) {
                    b5Var = ((org.telegram.ui.ActionBar.o2) qc1Var).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.o2) qc1Var).parentLayout;
                        lVar2 = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                        if (lVar2.getVisibility() == 0) {
                            lVar3 = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                            i12 = lVar3.getMeasuredHeight();
                        } else {
                            i12 = 0;
                        }
                        ((ActionBarLayout) b5Var2).q(canvas, i12);
                    }
                }
                return drawChild3;
            case 25:
                ze1 ze1Var = (ze1) this.b;
                if (view == ze1Var.W0 && ze1Var.isInPreviewMode()) {
                    ((ActionBarLayout) ze1Var.getParentLayout()).p(canvas, (int) (ze1Var.S * 255.0f), (int) (ze1Var.W0.getY() + ze1Var.W0.getMeasuredHeight()));
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
                ImageReceiver imageReceiver = ((s41) this.b).b;
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
                ImageReceiver imageReceiver = ((s41) this.b).b;
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
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((hp0) this.b).b.size(), new Object[0]));
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
                int b10 = i7.w.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int x4 = b.x(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                layoutParams.topMargin = AndroidUtilities.dp(8.0f) + x4;
                layoutParams2.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.x3.C(8.0f, x4, b10);
                layoutParams2.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                m60 m60Var = (m60) this.b;
                m60Var.g0();
                m60Var.h0();
                org.telegram.ui.Components.x10 x10Var = m60Var.f;
                vd.c cVar = m60Var.b;
                x10Var.setTranslationY(cVar.e);
                m60Var.i0();
                m60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar.e);
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                e70 e70Var = (e70) this.b;
                TextView textView = e70Var.b;
                if (textView != null) {
                    int measuredWidth = ((e70Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (e70Var.c.getMeasuredWidth() / 2);
                    int top = (e70Var.e.getTop() + ((e70Var.b.getMeasuredHeight() - e70Var.c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = e70Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, e70Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                s70 s70Var = (s70) this.b;
                s70Var.Z();
                s70Var.b0();
                break;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                fg0 fg0Var = (fg0) this.b;
                for (org.telegram.ui.Components.mv0 mv0Var : fg0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!mv0Var.a() && fg0Var.c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    mv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ng0 ng0Var = (ng0) this.b;
                ng0Var.i0();
                ng0Var.h0();
                break;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.c0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                bg.d1 d1Var = secretMediaViewer.e;
                d1Var.layout(systemWindowInsetLeft, 0, d1Var.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
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
                super.onLayout(z10, i10, i11, i12, i13);
                ((f41) this.b).d();
                break;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                s41 s41Var = (s41) this.b;
                Context context = s41Var.getContext();
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
                    Bitmap bitmap = s41Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || s41Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        s41Var.f();
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        org.telegram.ui.ActionBar.l lVar8;
        org.telegram.ui.ActionBar.l lVar9;
        org.telegram.ui.ActionBar.l lVar10;
        org.telegram.ui.ActionBar.l lVar11;
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
                m60 m60Var = (m60) this.b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size2 > size) {
                    m60Var.Y = AndroidUtilities.dp(144.0f);
                } else {
                    m60Var.Y = AndroidUtilities.dp(56.0f);
                }
                lVar = ((org.telegram.ui.ActionBar.o2) m60Var).actionBar;
                measureChildWithMargins(lVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m60Var.s.getLayoutParams();
                lVar2 = ((org.telegram.ui.ActionBar.o2) m60Var).actionBar;
                marginLayoutParams.topMargin = AndroidUtilities.dp(48.0f) + lVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) m60Var.e.getLayoutParams();
                lVar3 = ((org.telegram.ui.ActionBar.o2) m60Var).actionBar;
                marginLayoutParams2.topMargin = lVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) m60Var.f.getLayoutParams();
                lVar4 = ((org.telegram.ui.ActionBar.o2) m60Var).actionBar;
                marginLayoutParams3.topMargin = lVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) m60Var.h.getLayoutParams();
                lVar5 = ((org.telegram.ui.ActionBar.o2) m60Var).actionBar;
                marginLayoutParams4.topMargin = lVar5.getMeasuredHeight();
                m60Var.h.getLayoutParams().height = m60Var.Y;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) m60Var.d.getLayoutParams();
                lVar6 = ((org.telegram.ui.ActionBar.o2) m60Var).actionBar;
                marginLayoutParams5.height = AndroidUtilities.dp(53.0f) + lVar6.getMeasuredHeight() + m60Var.Y;
                m60Var.j0();
                super.onMeasure(i10, i11);
                break;
            case 9:
                s70 s70Var = (s70) this.b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (AndroidUtilities.isTablet() || size4 > size3) {
                    s70Var.x = AndroidUtilities.dp(144.0f);
                } else {
                    s70Var.x = AndroidUtilities.dp(56.0f);
                }
                lVar7 = ((org.telegram.ui.ActionBar.o2) s70Var).actionBar;
                measureChildWithMargins(lVar7, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) s70Var.r.getLayoutParams();
                lVar8 = ((org.telegram.ui.ActionBar.o2) s70Var).actionBar;
                marginLayoutParams6.topMargin = AndroidUtilities.dp(48.0f) + lVar8.getMeasuredHeight();
                s70Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + s70Var.x;
                s70Var.a0();
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
                fg0 fg0Var = (fg0) this.b;
                for (org.telegram.ui.Components.mv0 mv0Var : fg0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) mv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams7.topMargin);
                    if (!mv0Var.a() && fg0Var.c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    mv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams7.rightMargin) - marginLayoutParams7.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
                }
                break;
            case 15:
                yo0 yo0Var = (yo0) this.b;
                FrameLayout frameLayout = yo0Var.C;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) yo0Var.C.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
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
                WindowInsets windowInsets = secretMediaViewer.c0;
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
                WindowInsets windowInsets2 = secretMediaViewer.c0;
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
                lVar9 = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                measureChildWithMargins(lVar9, i10, 0, i11, 0);
                lVar10 = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                int measuredHeight2 = lVar10.getMeasuredHeight();
                lVar11 = ((org.telegram.ui.ActionBar.o2) qc1Var).actionBar;
                if (lVar11.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) qc1Var.j0.getLayoutParams()).topMargin = measuredHeight2;
                qc1Var.j0.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size8, TLObject.FLAG_30));
                measureChildWithMargins(qc1Var.l0, i10, 0, i11, 0);
                break;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((cg1) this.b).H.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
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
                rg.c.c(htVar.s, htVar.y);
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
    public void setScaleX(float f9) {
        switch (this.a) {
            case 20:
                super.setScaleX(f9);
                ProfileActivity.V0((ProfileActivity) this.b);
                break;
            default:
                super.setScaleX(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        switch (this.a) {
            case 4:
                super.setTranslationY(f9);
                ((ob) this.b).X.invalidate();
                break;
            case 18:
                super.setTranslationY(f9);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.F1();
                break;
            default:
                super.setTranslationY(f9);
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
    public /* synthetic */ n0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
