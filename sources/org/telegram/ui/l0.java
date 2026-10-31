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
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.a) {
            case 12:
                Typeface typeface = org.telegram.messenger.i0.a;
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    getChildAt(i10).dispatchApplyWindowInsets(windowInsets);
                }
                return windowInsets;
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01da  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jc jcVar;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f);
                m6 m6Var = (m6) this.b;
                int c10 = ((measuredWidth - ((int) m6Var.c.c())) + ((int) m6Var.b.c())) / 2;
                if (!org.telegram.messenger.cd.X) {
                    m6Var.b.setBounds(0, 0, c10, getHeight());
                    m6Var.b.draw(canvas);
                    m6Var.c.setBounds(org.telegram.messenger.i0.L(8.0f) + c10, 0, getWidth(), getHeight());
                    m6Var.c.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 9:
                v50 v50Var = (v50) this.b;
                tg.f fVar = v50Var.p0;
                hi.f fVar2 = v50Var.q0;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    v50Var.i0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (fVar2 != null && !fVar2.r && fVar2.d(measuredWidth2, measuredHeight)) {
                        fVar.b(fVar2.b(measuredWidth2, measuredHeight), -3);
                        fVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                org.telegram.messenger.i0.O(canvas, this, v50Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6), v50Var.m0, 1.0f);
                break;
            case 12:
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
            case 15:
                pf0 pf0Var = (pf0) this.b;
                pf0Var.getClass();
                int i14 = org.telegram.ui.ActionBar.t6.a7;
                int themedColor = pf0Var.getThemedColor(i14);
                int i15 = org.telegram.ui.ActionBar.t6.d6;
                int themedColor2 = pf0Var.getThemedColor(i15);
                id1 id1Var = pf0Var.c;
                int f7 = i0.b.f(id1Var != null ? id1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i16 = pf0Var.M;
                if (i16 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i16, getHeight(), org.telegram.ui.ActionBar.t6.n0(f7));
                }
                if (pf0Var.N != 0) {
                    canvas.drawRect(getWidth() - pf0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.t6.n0(f7));
                }
                super.dispatchDraw(canvas);
                pf0Var.h0();
                hi.c cVar = pf0Var.R;
                int themedColor3 = pf0Var.getThemedColor(i14);
                int themedColor4 = pf0Var.getThemedColor(i15);
                id1 id1Var2 = pf0Var.c;
                cVar.a(i0.b.f(id1Var2 != null ? id1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = pf0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 24:
                i11 i11Var = (i11) this.b;
                if (i11Var.s > 0.0f && i11Var.n != null) {
                    i11Var.r.reset();
                    float width = getWidth() / i11Var.f.getWidth();
                    i11Var.r.postScale(width, width);
                    i11Var.h.setLocalMatrix(i11Var.r);
                    i11Var.n.setAlpha((int) (i11Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), i11Var.n);
                }
                if (i11Var.W && (q1Var = i11Var.O) != null) {
                    q1Var.setVisibility(4);
                    i11Var.W = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 25:
                y11 y11Var = (y11) this.b;
                ImageReceiver imageReceiver2 = y11Var.b;
                Rect rect = y11Var.e;
                i31 i31Var = y11Var.P;
                s21 s21Var = y11Var.a;
                if (y11Var.n != null && y11Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    y11Var.r.setAlpha((int) (y11Var.I * 255.0f));
                    canvas.drawBitmap(y11Var.n, 0.0f, 0.0f, y11Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (s21Var != null) {
                    Drawable drawable = s21Var.E;
                    if (drawable == null) {
                        if (s21Var.s && (imageReceiver = s21Var.h) != null) {
                            imageReceiver.setAlpha(1.0f - y11Var.I);
                            s21Var.h.z0(rect);
                            jcVar = null;
                            s21Var.h.h(canvas, null);
                            if (imageReceiver2 == null) {
                                imageReceiver2.setAlpha(y11Var.I);
                                imageReceiver2.z0(rect);
                                imageReceiver2.h(canvas, jcVar);
                                break;
                            }
                        }
                    } else {
                        if (y11Var.y) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.b.f(y11Var.I, i31Var.n1, i31Var.f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(i31Var.k1);
                        }
                        drawable.setAlpha((int) ((1.0f - y11Var.I) * 255.0f));
                        RectF rectF = org.telegram.messenger.i0.P;
                        rectF.set(rect);
                        float f10 = s21Var.N;
                        float max = (f10 != 0.0f || s21Var.S > 0.0f) ? (((1.0f - Math.max(s21Var.S * 0.8f, f10)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = org.telegram.messenger.i0.Q;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f11 = 1.0f - ((1.0f - y11Var.I) * (1.0f - s21Var.O));
                        canvas.save();
                        if (f11 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f11, 0.0f, 0.0f);
                            canvas.skew((1.0f - f11) * (1.0f - ((s21Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (y11Var.I * org.telegram.messenger.i0.L(45.0f)) + y11Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i17 = s21Var.P;
                        if (i17 == 0) {
                            rect2.offset(org.telegram.messenger.i0.L(f11 * 8.0f), 0);
                        } else if (i17 == 1) {
                            rect2.offset(org.telegram.messenger.i0.L(f11 * 4.0f), 0);
                        } else if (i17 == 6) {
                            rect2.offset(-org.telegram.messenger.i0.L(f11 * (-4.0f)), 0);
                        } else if (i17 == 7) {
                            rect2.offset(org.telegram.messenger.i0.L(f11 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - y11Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (i31Var.a0.getX() + i31Var.o0.getX() + y11Var.D), i31Var.a0.getY() + ((int) i31Var.o0.getY()) + y11Var.E);
                        i31Var.o0.draw(canvas);
                        canvas.restore();
                    }
                }
                jcVar = null;
                if (imageReceiver2 == null) {
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
                lt ltVar = (lt) this.b;
                if (ltVar.n || ltVar.K) {
                    ltVar.n();
                    return true;
                }
                ltVar.m();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 24:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((i11) this.b).dismiss();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                he heVar = (he) this.b;
                if (motionEvent.getActionMasked() == 0) {
                    heVar.x.X0.C0();
                    for (View view : heVar.b.getViewPages()) {
                        if (view instanceof fe) {
                            ((fe) view).a.C0();
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.l lVar2;
        int i12;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j10);
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
                        boolean drawChild = super.drawChild(canvas, view, j10);
                        canvas.restoreToCount(save);
                        if (translationX != 0) {
                            return drawChild;
                        }
                        l3[] l3VarArr2 = h4Var.u0;
                        if (view == l3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / org.telegram.messenger.i0.L(20.0f), 1.0f));
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
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save2);
                if (translationX != 0) {
                }
                break;
            case 27:
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                m91 m91Var = (m91) this.b;
                lVar = ((org.telegram.ui.ActionBar.k2) m91Var).actionBar;
                if (view == lVar) {
                    z4Var = ((org.telegram.ui.ActionBar.k2) m91Var).parentLayout;
                    if (z4Var != null) {
                        z4Var2 = ((org.telegram.ui.ActionBar.k2) m91Var).parentLayout;
                        lVar2 = ((org.telegram.ui.ActionBar.k2) m91Var).actionBar;
                        if (lVar2.getVisibility() == 0) {
                            lVar3 = ((org.telegram.ui.ActionBar.k2) m91Var).actionBar;
                            i12 = lVar3.getMeasuredHeight();
                        } else {
                            i12 = 0;
                        }
                        ((ActionBarLayout) z4Var2).q(canvas, i12);
                    }
                }
                return drawChild3;
            case 28:
                pb1 pb1Var = (pb1) this.b;
                if (view == pb1Var.a1 && pb1Var.isInPreviewMode()) {
                    ((ActionBarLayout) pb1Var.getParentLayout()).p(canvas, (int) (pb1Var.W * 255.0f), (int) (pb1Var.a1.getY() + pb1Var.a1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 16:
                super.onAttachedToWindow();
                org.telegram.messenger.i0.h3(((kg0) this.b).q0, 500L);
                break;
            case 25:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((y11) this.b).b;
                if (imageReceiver != null) {
                    imageReceiver.P();
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
            case 25:
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 16:
                super.onDetachedFromWindow();
                org.telegram.messenger.i0.r(((kg0) this.b).q0);
                break;
            case 25:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((y11) this.b).b;
                if (imageReceiver != null) {
                    imageReceiver.R();
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
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(((yn0) this.b).b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 19:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(((lo0) this.b).b.size(), "AccDescrSendPhotos", new Object[0]));
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
            case 21:
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
                int min = Math.min(paddingLeft, paddingTop) - org.telegram.messenger.i0.L(24.0f);
                int min2 = Math.min(org.telegram.messenger.i0.L(60.0f), min);
                int L = (paddingTop - min2) - org.telegram.messenger.i0.L(48.0f);
                a5 a5Var = (a5) this.b;
                a5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
                int b10 = w7.u.b((paddingTop - a5Var.d.getMeasuredHeight()) - org.telegram.messenger.i0.L(48.0f), min2, min);
                a5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int y3 = org.telegram.messenger.z20.y(48.0f, (paddingTop - b10) - a5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) a5Var.d.getLayoutParams();
                layoutParams.topMargin = org.telegram.messenger.i0.L(8.0f) + y3;
                layoutParams2.topMargin = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.m5.C(8.0f, y3, b10);
                layoutParams2.leftMargin = org.telegram.messenger.i0.L(4.0f);
                layoutParams2.rightMargin = org.telegram.messenger.i0.L(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                v50 v50Var = (v50) this.b;
                v50Var.k0();
                v50Var.l0();
                org.telegram.ui.Components.h10 h10Var = v50Var.f;
                fe.f fVar = v50Var.b;
                h10Var.setTranslationY(fVar.f);
                v50Var.m0();
                v50Var.e.setTranslationY(org.telegram.messenger.i0.L(48.0f) + fVar.f);
                break;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                n60 n60Var = (n60) this.b;
                TextView textView = n60Var.b;
                if (textView != null) {
                    int measuredWidth = ((n60Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (n60Var.c.getMeasuredWidth() / 2);
                    int top = (n60Var.e.getTop() + ((n60Var.b.getMeasuredHeight() - n60Var.c.getMeasuredHeight()) / 2)) - org.telegram.messenger.i0.L(16.0f);
                    TextView textView2 = n60Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, n60Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                hf0 hf0Var = (hf0) this.b;
                for (org.telegram.ui.Components.zu0 zu0Var : hf0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zu0Var.getLayoutParams();
                    int L2 = org.telegram.messenger.i0.L(16.0f) + getHeight();
                    if (!zu0Var.a() && hf0Var.c.getVisibility() == 0) {
                        L2 += org.telegram.messenger.i0.L(230.0f);
                    }
                    zu0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                break;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                pf0 pf0Var = (pf0) this.b;
                pf0Var.n0();
                pf0Var.m0();
                pf0Var.j0();
                break;
            case 23:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.e0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                fg.i iVar = secretMediaViewer.e;
                iVar.layout(systemWindowInsetLeft, 0, iVar.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.I0 == null) {
                        secretMediaViewer.w0 = 1.0f;
                        secretMediaViewer.u0 = 0.0f;
                        secretMediaViewer.v0 = 0.0f;
                    }
                    secretMediaViewer.o(secretMediaViewer.w0);
                    break;
                }
                break;
            case 24:
                super.onLayout(z10, i10, i11, i12, i13);
                ((i11) this.b).d();
                break;
            case 25:
                super.onLayout(z10, i10, i11, i12, i13);
                y11 y11Var = (y11) this.b;
                Context context = y11Var.getContext();
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
                    Bitmap bitmap = y11Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || y11Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        y11Var.f();
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
        switch (this.a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(171.0f), TLObject.FLAG_30));
                break;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(156.0f), TLObject.FLAG_30));
                break;
            case 9:
                v50 v50Var = (v50) this.b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (org.telegram.messenger.i0.Q1() || size2 > size) {
                    v50Var.c0 = org.telegram.messenger.i0.L(144.0f);
                } else {
                    v50Var.c0 = org.telegram.messenger.i0.L(56.0f);
                }
                lVar = ((org.telegram.ui.ActionBar.k2) v50Var).actionBar;
                measureChildWithMargins(lVar, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v50Var.s.getLayoutParams();
                lVar2 = ((org.telegram.ui.ActionBar.k2) v50Var).actionBar;
                marginLayoutParams.topMargin = org.telegram.messenger.i0.L(48.0f) + lVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) v50Var.e.getLayoutParams();
                lVar3 = ((org.telegram.ui.ActionBar.k2) v50Var).actionBar;
                marginLayoutParams2.topMargin = lVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) v50Var.f.getLayoutParams();
                lVar4 = ((org.telegram.ui.ActionBar.k2) v50Var).actionBar;
                marginLayoutParams3.topMargin = lVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) v50Var.h.getLayoutParams();
                lVar5 = ((org.telegram.ui.ActionBar.k2) v50Var).actionBar;
                marginLayoutParams4.topMargin = lVar5.getMeasuredHeight();
                v50Var.h.getLayoutParams().height = v50Var.c0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) v50Var.d.getLayoutParams();
                lVar6 = ((org.telegram.ui.ActionBar.k2) v50Var).actionBar;
                marginLayoutParams5.height = org.telegram.messenger.i0.L(53.0f) + lVar6.getMeasuredHeight() + v50Var.c0;
                v50Var.n0();
                super.onMeasure(i10, i11);
                break;
            case 11:
                ((y60) this.b).x = org.telegram.messenger.i0.L((org.telegram.messenger.i0.Q1() || View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) ? 144.0f : 78.0f);
                super.onMeasure(i10, i11);
                break;
            case 13:
                super.onMeasure(i10, i11);
                ub0 ub0Var = ((yb0) this.b).w;
                if (ub0Var != null) {
                    ub0Var.a();
                    break;
                }
                break;
            case 14:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                hf0 hf0Var = (hf0) this.b;
                for (org.telegram.ui.Components.zu0 zu0Var : hf0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) zu0Var.getLayoutParams();
                    int L = org.telegram.messenger.i0.L(16.0f) + (measuredHeight - marginLayoutParams6.topMargin);
                    if (!zu0Var.a() && hf0Var.c.getVisibility() == 0) {
                        L += org.telegram.messenger.i0.L(230.0f);
                    }
                    zu0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams6.rightMargin) - marginLayoutParams6.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
                }
                break;
            case 17:
                tn0 tn0Var = (tn0) this.b;
                FrameLayout frameLayout = tn0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) tn0Var.L.getLayoutParams()).topMargin = org.telegram.messenger.i0.m;
                }
                super.onMeasure(i10, i11);
                break;
            case 22:
                super.onMeasure(i10, i11);
                ProfileActivity.c1((ProfileActivity) this.b);
                break;
            case 23:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.e0;
                if (windowInsets != null) {
                    if (org.telegram.messenger.i0.y) {
                        int i12 = org.telegram.messenger.i0.q.y;
                        if (size4 > i12) {
                            size4 = i12;
                        }
                        size4 += org.telegram.messenger.i0.m;
                    }
                    size4 -= windowInsets.getSystemWindowInsetBottom();
                    size3 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i13 = org.telegram.messenger.i0.q.y;
                    if (size4 > i13) {
                        size4 = i13;
                    }
                }
                setMeasuredDimension(size3, size4);
                WindowInsets windowInsets2 = secretMediaViewer.e0;
                if (windowInsets2 != null) {
                    size3 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                break;
            case 25:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            case 27:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                m91 m91Var = (m91) this.b;
                lVar7 = ((org.telegram.ui.ActionBar.k2) m91Var).actionBar;
                measureChildWithMargins(lVar7, i10, 0, i11, 0);
                lVar8 = ((org.telegram.ui.ActionBar.k2) m91Var).actionBar;
                int measuredHeight2 = lVar8.getMeasuredHeight();
                lVar9 = ((org.telegram.ui.ActionBar.k2) m91Var).actionBar;
                if (lVar9.getVisibility() == 0) {
                    size6 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) m91Var.o0.getLayoutParams()).topMargin = measuredHeight2;
                m91Var.o0.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30));
                measureChildWithMargins(m91Var.q0, i10, 0, i11, 0);
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
                lt ltVar = (lt) this.b;
                yg.d.c(ltVar.s, ltVar.y);
                ltVar.t.d();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 21:
                return ((PopupNotificationActivity) this.b).c() || ((PopupNotificationActivity) getContext()).j(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.a) {
            case 21:
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
            case 22:
                super.setScaleX(f7);
                ProfileActivity.c1((ProfileActivity) this.b);
                break;
            case 26:
                super.setScaleX(f7);
                ((e51) this.b).o0();
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
                ((sb) this.b).X.invalidate();
                break;
            case 20:
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
                m6 m6Var = (m6) this.b;
                return drawable == m6Var.c || drawable == m6Var.b || super.verifyDrawable(drawable);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(wz wzVar, Context context) {
        super(context);
        String L0;
        this.a = 7;
        this.b = wzVar;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.i0.L(22.0f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        int i11 = 0;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(imageView, d02, N, null, null);
        addView(imageView, w7.b6.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        nh.p pVar = new nh.p(context);
        pVar.setTypeface(org.telegram.messenger.i0.o());
        pVar.setTextSize(1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(pVar, i12, null);
        pVar.setGravity(1);
        pVar.setText(wzVar.e1(pVar));
        org.telegram.messenger.ap apVar = wzVar.Q1;
        if (apVar != null && apVar.n) {
            i11 = 26;
        }
        pVar.s = i11;
        addView(pVar, w7.b6.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (wzVar.R1.isEmpty()) {
            L0 = org.telegram.messenger.cd.L0(2131750645, null);
        } else {
            L0 = org.telegram.messenger.cd.L0(2131750646, null);
        }
        textView.setText(L0);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        addView(textView, w7.b6.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new a(this, 22));
        addView(imageView2, w7.b6.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    private final void a(Configuration configuration) {
    }
}
