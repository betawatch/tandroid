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
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i3, Context context, Object obj) {
        super(context);
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.a) {
            case 12:
                Typeface typeface = org.telegram.messenger.g0.a;
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    getChildAt(i3).dispatchApplyWindowInsets(windowInsets);
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
        org.telegram.messenger.bc bcVar;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
                n6 n6Var = (n6) this.b;
                int c2 = ((measuredWidth - ((int) n6Var.c.c())) + ((int) n6Var.b.c())) / 2;
                if (!org.telegram.messenger.bd.a0) {
                    n6Var.b.setBounds(0, 0, c2, getHeight());
                    n6Var.b.draw(canvas);
                    n6Var.c.setBounds(org.telegram.messenger.g0.L(8.0f) + c2, 0, getWidth(), getHeight());
                    n6Var.c.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 9:
                r40 r40Var = (r40) this.b;
                eh.g gVar = r40Var.q0;
                si.f fVar = r40Var.r0;
                if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
                    r40Var.j0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (fVar != null && !fVar.r && fVar.j(measuredWidth2, measuredHeight)) {
                        gVar.b(fVar.h(measuredWidth2, measuredHeight), -3);
                        fVar.i();
                    }
                }
                super.dispatchDraw(canvas);
                org.telegram.messenger.g0.O(canvas, this, r40Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6), r40Var.n0, 1.0f);
                break;
            case 12:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                View view = launchActivity.H0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.A1 == null) {
                        launchActivity.A1 = new int[2];
                    }
                    launchActivity.H0.getLocationInWindow(launchActivity.A1);
                    int[] iArr = launchActivity.A1;
                    int i3 = iArr[0];
                    int i10 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.A1;
                    int i11 = i3 - iArr2[0];
                    int i12 = i10 - iArr2[1];
                    canvas.save();
                    canvas.translate(i11, i12);
                    launchActivity.H0.getBackground().draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 14:
                ee0 ee0Var = (ee0) this.b;
                ee0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.k6.a7;
                int themedColor = ee0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.k6.d6;
                int themedColor2 = ee0Var.getThemedColor(i14);
                fb1 fb1Var = ee0Var.c;
                int f10 = i0.a.f(fb1Var != null ? fb1Var.p(0) : 1.0f, themedColor, themedColor2);
                int i15 = ee0Var.N;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.k6.n0(f10));
                }
                if (ee0Var.O != 0) {
                    canvas.drawRect(getWidth() - ee0Var.O, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.k6.n0(f10));
                }
                super.dispatchDraw(canvas);
                ee0Var.i0();
                si.c cVar = ee0Var.S;
                int themedColor3 = ee0Var.getThemedColor(i13);
                int themedColor4 = ee0Var.getThemedColor(i14);
                fb1 fb1Var2 = ee0Var.c;
                cVar.a(i0.a.f(fb1Var2 != null ? fb1Var2.p(0) : 1.0f, themedColor3, themedColor4));
                View view2 = ee0Var.I;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 23:
                iz0 iz0Var = (iz0) this.b;
                if (iz0Var.s > 0.0f && iz0Var.n != null) {
                    iz0Var.r.reset();
                    float width = getWidth() / iz0Var.f.getWidth();
                    iz0Var.r.postScale(width, width);
                    iz0Var.h.setLocalMatrix(iz0Var.r);
                    iz0Var.n.setAlpha((int) (iz0Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), iz0Var.n);
                }
                if (iz0Var.X && (q1Var = iz0Var.P) != null) {
                    q1Var.setVisibility(4);
                    iz0Var.X = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 24:
                wz0 wz0Var = (wz0) this.b;
                ImageReceiver imageReceiver2 = wz0Var.b;
                Rect rect = wz0Var.e;
                g11 g11Var = wz0Var.Q;
                q01 q01Var = wz0Var.a;
                if (wz0Var.n != null && wz0Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    wz0Var.r.setAlpha((int) (wz0Var.J * 255.0f));
                    canvas.drawBitmap(wz0Var.n, 0.0f, 0.0f, wz0Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (q01Var != null) {
                    Drawable drawable = q01Var.F;
                    if (drawable == null) {
                        if (q01Var.s && (imageReceiver = q01Var.h) != null) {
                            imageReceiver.setAlpha(1.0f - wz0Var.J);
                            q01Var.h.z0(rect);
                            bcVar = null;
                            q01Var.h.h(canvas, null);
                            if (imageReceiver2 == null) {
                                imageReceiver2.setAlpha(wz0Var.J);
                                imageReceiver2.z0(rect);
                                imageReceiver2.h(canvas, bcVar);
                                break;
                            }
                        }
                    } else {
                        if (wz0Var.y) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(wz0Var.J, g11Var.o1, g11Var.g1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(g11Var.l1);
                        }
                        drawable.setAlpha((int) ((1.0f - wz0Var.J) * 255.0f));
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(rect);
                        float f11 = q01Var.O;
                        float max = (f11 != 0.0f || q01Var.T > 0.0f) ? (((1.0f - Math.max(q01Var.T * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - wz0Var.J) * (1.0f - q01Var.P));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((q01Var.Q * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (wz0Var.J * org.telegram.messenger.g0.L(45.0f)) + wz0Var.G);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = q01Var.Q;
                        if (i16 == 0) {
                            rect2.offset(org.telegram.messenger.g0.L(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(org.telegram.messenger.g0.L(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-org.telegram.messenger.g0.L(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(org.telegram.messenger.g0.L(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - wz0Var.J) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (g11Var.b0.getX() + g11Var.p0.getX() + wz0Var.E), g11Var.b0.getY() + ((int) g11Var.p0.getY()) + wz0Var.F);
                        g11Var.p0.draw(canvas);
                        canvas.restore();
                    }
                }
                bcVar = null;
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
                is isVar = (is) this.b;
                if (isVar.n || isVar.K) {
                    isVar.n();
                    return true;
                }
                isVar.m();
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
                ((iz0) this.b).dismiss();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                td tdVar = (td) this.b;
                if (motionEvent.getActionMasked() == 0) {
                    tdVar.x.Y0.C0();
                    for (View view : tdVar.b.getViewPages()) {
                        if (view instanceof rd) {
                            ((rd) view).a.C0();
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
        int i3;
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = i4Var.g0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j10);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) i4Var.v0[0].getTranslationX();
                l3[] l3VarArr = i4Var.v0;
                if (view == l3VarArr[1]) {
                    i3 = translationX;
                } else {
                    i3 = measuredWidth;
                    if (view == l3VarArr[0]) {
                        i10 = translationX;
                        int save = canvas.save();
                        canvas.clipRect(i10, 0, i3, getHeight());
                        boolean drawChild = super.drawChild(canvas, view, j10);
                        canvas.restoreToCount(save);
                        if (translationX != 0) {
                            return drawChild;
                        }
                        l3[] l3VarArr2 = i4Var.v0;
                        if (view == l3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / org.telegram.messenger.g0.L(20.0f), 1.0f));
                            Drawable drawable = i4Var.n0;
                            drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            i4Var.n0.setAlpha((int) (max * 255.0f));
                            i4Var.n0.draw(canvas);
                            return drawChild;
                        }
                        if (view != l3VarArr2[1]) {
                            return drawChild;
                        }
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        i4Var.o0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i10, 0.0f, i3, getHeight(), i4Var.o0);
                        return drawChild;
                    }
                }
                i10 = 0;
                int save2 = canvas.save();
                canvas.clipRect(i10, 0, i3, getHeight());
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restoreToCount(save2);
                if (translationX != 0) {
                }
                break;
            case 26:
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                l71 l71Var = (l71) this.b;
                kVar = ((org.telegram.ui.ActionBar.d2) l71Var).actionBar;
                if (view == kVar) {
                    q4Var = ((org.telegram.ui.ActionBar.d2) l71Var).parentLayout;
                    if (q4Var != null) {
                        q4Var2 = ((org.telegram.ui.ActionBar.d2) l71Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.d2) l71Var).actionBar;
                        if (kVar2.getVisibility() == 0) {
                            kVar3 = ((org.telegram.ui.ActionBar.d2) l71Var).actionBar;
                            i11 = kVar3.getMeasuredHeight();
                        } else {
                            i11 = 0;
                        }
                        ((ActionBarLayout) q4Var2).q(canvas, i11);
                    }
                }
                return drawChild3;
            case 27:
                m91 m91Var = (m91) this.b;
                if (view == m91Var.b1 && m91Var.isInPreviewMode()) {
                    ((ActionBarLayout) m91Var.getParentLayout()).p(canvas, (int) (m91Var.X * 255.0f), (int) (m91Var.b1.getY() + m91Var.b1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 15:
                super.onAttachedToWindow();
                org.telegram.messenger.g0.i3(((xe0) this.b).r0, 500L);
                break;
            case 24:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((wz0) this.b).b;
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
            case 15:
                super.onDetachedFromWindow();
                org.telegram.messenger.g0.r(((xe0) this.b).r0);
                break;
            case 24:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((wz0) this.b).b;
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
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(((hm0) this.b).b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(((sm0) this.b).b.size(), "AccDescrSendPhotos", new Object[0]));
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
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        Activity activity;
        switch (this.a) {
            case 2:
                int paddingLeft = ((i11 - i3) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - org.telegram.messenger.g0.L(24.0f);
                int min2 = Math.min(org.telegram.messenger.g0.L(60.0f), min);
                int L = (paddingTop - min2) - org.telegram.messenger.g0.L(48.0f);
                d5 d5Var = (d5) this.b;
                d5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
                int b10 = b8.be.b((paddingTop - d5Var.d.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f), min2, min);
                d5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int y9 = org.telegram.messenger.camera.q.y(48.0f, (paddingTop - b10) - d5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) d5Var.d.getLayoutParams();
                layoutParams.topMargin = org.telegram.messenger.g0.L(8.0f) + y9;
                layoutParams2.topMargin = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.C(8.0f, y9, b10);
                layoutParams2.leftMargin = org.telegram.messenger.g0.L(4.0f);
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(4.0f);
                super.onLayout(z10, i3, i10, i11, i12);
                break;
            case 9:
                super.onLayout(z10, i3, i10, i11, i12);
                r40 r40Var = (r40) this.b;
                r40Var.l0();
                r40Var.m0();
                org.telegram.ui.Components.n00 n00Var = r40Var.f;
                qe.c cVar = r40Var.b;
                n00Var.setTranslationY(cVar.f);
                r40Var.n0();
                r40Var.e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar.f);
                break;
            case 10:
                super.onLayout(z10, i3, i10, i11, i12);
                j50 j50Var = (j50) this.b;
                TextView textView = j50Var.b;
                if (textView != null) {
                    int measuredWidth = ((j50Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (j50Var.c.getMeasuredWidth() / 2);
                    int top = (j50Var.e.getTop() + ((j50Var.b.getMeasuredHeight() - j50Var.c.getMeasuredHeight()) / 2)) - org.telegram.messenger.g0.L(16.0f);
                    TextView textView2 = j50Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, j50Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 13:
                super.onLayout(z10, i3, i10, i11, i12);
                xd0 xd0Var = (xd0) this.b;
                for (org.telegram.ui.Components.vt0 vt0Var : xd0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vt0Var.getLayoutParams();
                    int L2 = org.telegram.messenger.g0.L(16.0f) + getHeight();
                    if (!vt0Var.a() && xd0Var.c.getVisibility() == 0) {
                        L2 += org.telegram.messenger.g0.L(230.0f);
                    }
                    vt0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                break;
            case 14:
                super.onLayout(z10, i3, i10, i11, i12);
                ee0 ee0Var = (ee0) this.b;
                ee0Var.o0();
                ee0Var.n0();
                ee0Var.k0();
                break;
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.f0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                ai.c0 c0Var = secretMediaViewer.e;
                c0Var.layout(systemWindowInsetLeft, 0, c0Var.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.J0 == null) {
                        secretMediaViewer.x0 = 1.0f;
                        secretMediaViewer.v0 = 0.0f;
                        secretMediaViewer.w0 = 0.0f;
                    }
                    secretMediaViewer.o(secretMediaViewer.x0);
                    break;
                }
                break;
            case 23:
                super.onLayout(z10, i3, i10, i11, i12);
                ((iz0) this.b).d();
                break;
            case 24:
                super.onLayout(z10, i3, i10, i11, i12);
                wz0 wz0Var = (wz0) this.b;
                Context context = wz0Var.getContext();
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
                    Bitmap bitmap = wz0Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || wz0Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        wz0Var.f();
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        switch (this.a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(171.0f), TLObject.FLAG_30));
                break;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(156.0f), TLObject.FLAG_30));
                break;
            case 9:
                r40 r40Var = (r40) this.b;
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                if (org.telegram.messenger.g0.Q1() || size2 > size) {
                    r40Var.d0 = org.telegram.messenger.g0.L(144.0f);
                } else {
                    r40Var.d0 = org.telegram.messenger.g0.L(56.0f);
                }
                kVar = ((org.telegram.ui.ActionBar.d2) r40Var).actionBar;
                measureChildWithMargins(kVar, i3, 0, i10, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r40Var.s.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.d2) r40Var).actionBar;
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r40Var.e.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.d2) r40Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) r40Var.f.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.d2) r40Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) r40Var.h.getLayoutParams();
                kVar5 = ((org.telegram.ui.ActionBar.d2) r40Var).actionBar;
                marginLayoutParams4.topMargin = kVar5.getMeasuredHeight();
                r40Var.h.getLayoutParams().height = r40Var.d0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) r40Var.d.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.d2) r40Var).actionBar;
                marginLayoutParams5.height = org.telegram.messenger.g0.L(53.0f) + kVar6.getMeasuredHeight() + r40Var.d0;
                r40Var.o0();
                super.onMeasure(i3, i10);
                break;
            case 11:
                ((t50) this.b).x = org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i3)) ? 144.0f : 78.0f);
                super.onMeasure(i3, i10);
                break;
            case 13:
                super.onMeasure(i3, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                xd0 xd0Var = (xd0) this.b;
                for (org.telegram.ui.Components.vt0 vt0Var : xd0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) vt0Var.getLayoutParams();
                    int L = org.telegram.messenger.g0.L(16.0f) + (measuredHeight - marginLayoutParams6.topMargin);
                    if (!vt0Var.a() && xd0Var.c.getVisibility() == 0) {
                        L += org.telegram.messenger.g0.L(230.0f);
                    }
                    vt0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams6.rightMargin) - marginLayoutParams6.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
                }
                break;
            case 16:
                cm0 cm0Var = (cm0) this.b;
                FrameLayout frameLayout = cm0Var.M;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) cm0Var.M.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
                }
                super.onMeasure(i3, i10);
                break;
            case 21:
                super.onMeasure(i3, i10);
                ProfileActivity.d1((ProfileActivity) this.b);
                break;
            case 22:
                int size3 = View.MeasureSpec.getSize(i3);
                int size4 = View.MeasureSpec.getSize(i10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.f0;
                if (windowInsets != null) {
                    if (org.telegram.messenger.g0.y) {
                        int i11 = org.telegram.messenger.g0.q.y;
                        if (size4 > i11) {
                            size4 = i11;
                        }
                        size4 += org.telegram.messenger.g0.m;
                    }
                    size4 -= windowInsets.getSystemWindowInsetBottom();
                    size3 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i12 = org.telegram.messenger.g0.q.y;
                    if (size4 > i12) {
                        size4 = i12;
                    }
                }
                setMeasuredDimension(size3, size4);
                WindowInsets windowInsets2 = secretMediaViewer.f0;
                if (windowInsets2 != null) {
                    size3 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            case 26:
                int size5 = View.MeasureSpec.getSize(i3);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                l71 l71Var = (l71) this.b;
                kVar7 = ((org.telegram.ui.ActionBar.d2) l71Var).actionBar;
                measureChildWithMargins(kVar7, i3, 0, i10, 0);
                kVar8 = ((org.telegram.ui.ActionBar.d2) l71Var).actionBar;
                int measuredHeight2 = kVar8.getMeasuredHeight();
                kVar9 = ((org.telegram.ui.ActionBar.d2) l71Var).actionBar;
                if (kVar9.getVisibility() == 0) {
                    size6 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) l71Var.p0.getLayoutParams()).topMargin = measuredHeight2;
                l71Var.p0.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30));
                measureChildWithMargins(l71Var.r0, i3, 0, i10, 0);
                break;
            case 28:
                super.onMeasure(i3, i10);
                ((ViewGroup.MarginLayoutParams) ((ra1) this.b).M.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.m;
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 6:
                super.onSizeChanged(i3, i10, i11, i12);
                is isVar = (is) this.b;
                jh.d.c(isVar.s, isVar.y);
                isVar.t.d();
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
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
    public void setScaleX(float f10) {
        switch (this.a) {
            case 21:
                super.setScaleX(f10);
                ProfileActivity.d1((ProfileActivity) this.b);
                break;
            case 25:
                super.setScaleX(f10);
                ((c31) this.b).p0();
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
                ((kb) this.b).Y.invalidate();
                break;
            case 19:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.I1();
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
                n6 n6Var = (n6) this.b;
                return drawable == n6Var.c || drawable == n6Var.b || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Context context, int i3) {
        super(context);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = 29;
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, b8.mf.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.G6, 100), e6Var);
        textView.setTextSize(1, 13.0f);
        org.telegram.messenger.k5.m(textView, 17, null, 2131743866);
        linearLayout.addView(textView, b8.mf.t(-1, -2, 0, 16, 17, 17, 16));
        vg.o0 o0Var = new vg.o0(context, e6Var, false);
        this.b = o0Var;
        String M0 = org.telegram.messenger.bd.M0(2131743867, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.wp(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) M0);
        o0Var.f.setText(spannableStringBuilder);
        linearLayout.addView(o0Var, b8.mf.t(-1, 48, 0, 16, 0, 16, 16));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(sy syVar, Context context) {
        super(context);
        String M0;
        this.a = 7;
        this.b = syVar;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(22.0f);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        int i10 = 0;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(imageView, d02, N, null, null);
        addView(imageView, b8.mf.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        yh.l lVar = new yh.l(context);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        lVar.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(lVar, i11, null);
        lVar.setGravity(1);
        lVar.setText(syVar.e1(lVar));
        org.telegram.messenger.mo moVar = syVar.R1;
        if (moVar != null && moVar.n) {
            i10 = 26;
        }
        lVar.s = i10;
        addView(lVar, b8.mf.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (syVar.S1.isEmpty()) {
            M0 = org.telegram.messenger.bd.M0(2131750645, null);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131750646, null);
        }
        textView.setText(M0);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        addView(textView, b8.mf.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new a(this, 22));
        addView(imageView2, b8.mf.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    private final void a(Configuration configuration) {
    }
}
