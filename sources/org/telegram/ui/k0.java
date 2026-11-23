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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.a) {
            case 12:
                Typeface typeface = org.telegram.messenger.g0.a;
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    getChildAt(i7).dispatchApplyWindowInsets(windowInsets);
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
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.hc hcVar;
        ImageReceiver imageReceiver;
        switch (this.a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
                l6 l6Var = (l6) this.b;
                int c10 = ((measuredWidth - ((int) l6Var.c.c())) + ((int) l6Var.b.c())) / 2;
                if (!org.telegram.messenger.hd.a0) {
                    l6Var.b.setBounds(0, 0, c10, getHeight());
                    l6Var.b.draw(canvas);
                    l6Var.c.setBounds(org.telegram.messenger.g0.L(8.0f) + c10, 0, getWidth(), getHeight());
                    l6Var.c.draw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
            case 9:
                z40 z40Var = (z40) this.b;
                dh.g gVar = z40Var.q0;
                ui.f fVar = z40Var.r0;
                if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
                    z40Var.j0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (fVar != null && !fVar.r && fVar.j(measuredWidth2, measuredHeight)) {
                        gVar.b(fVar.h(measuredWidth2, measuredHeight), -3);
                        fVar.i();
                    }
                }
                super.dispatchDraw(canvas);
                org.telegram.messenger.g0.O(canvas, this, z40Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6), z40Var.n0, 1.0f);
                break;
            case 12:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                View view = launchActivity.F0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.y1 == null) {
                        launchActivity.y1 = new int[2];
                    }
                    launchActivity.F0.getLocationInWindow(launchActivity.y1);
                    int[] iArr = launchActivity.y1;
                    int i7 = iArr[0];
                    int i10 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.y1;
                    int i11 = i7 - iArr2[0];
                    int i12 = i10 - iArr2[1];
                    canvas.save();
                    canvas.translate(i11, i12);
                    launchActivity.F0.getBackground().draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 14:
                me0 me0Var = (me0) this.b;
                me0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.m6.a7;
                int themedColor = me0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.m6.d6;
                int themedColor2 = me0Var.getThemedColor(i14);
                pb1 pb1Var = me0Var.c;
                int f10 = i0.a.f(pb1Var != null ? pb1Var.m(0) : 1.0f, themedColor, themedColor2);
                int i15 = me0Var.N;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.m6.n0(f10));
                }
                if (me0Var.O != 0) {
                    canvas.drawRect(getWidth() - me0Var.O, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.m6.n0(f10));
                }
                super.dispatchDraw(canvas);
                me0Var.i0();
                ui.c cVar = me0Var.S;
                int themedColor3 = me0Var.getThemedColor(i13);
                int themedColor4 = me0Var.getThemedColor(i14);
                pb1 pb1Var2 = me0Var.c;
                cVar.a(i0.a.f(pb1Var2 != null ? pb1Var2.m(0) : 1.0f, themedColor3, themedColor4));
                je0 je0Var = me0Var.I;
                if (je0Var != null) {
                    je0Var.invalidate();
                    break;
                }
                break;
            case 23:
                uz0 uz0Var = (uz0) this.b;
                if (uz0Var.s > 0.0f && uz0Var.n != null) {
                    uz0Var.r.reset();
                    float width = getWidth() / uz0Var.f.getWidth();
                    uz0Var.r.postScale(width, width);
                    uz0Var.h.setLocalMatrix(uz0Var.r);
                    uz0Var.n.setAlpha((int) (uz0Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), uz0Var.n);
                }
                if (uz0Var.X && (r1Var = uz0Var.P) != null) {
                    r1Var.setVisibility(4);
                    uz0Var.X = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 24:
                i01 i01Var = (i01) this.b;
                ImageReceiver imageReceiver2 = i01Var.b;
                Rect rect = i01Var.e;
                s11 s11Var = i01Var.Q;
                c11 c11Var = i01Var.a;
                if (i01Var.n != null && i01Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    i01Var.r.setAlpha((int) (i01Var.J * 255.0f));
                    canvas.drawBitmap(i01Var.n, 0.0f, 0.0f, i01Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (c11Var != null) {
                    Drawable drawable = c11Var.F;
                    if (drawable == null) {
                        if (c11Var.s && (imageReceiver = c11Var.h) != null) {
                            imageReceiver.setAlpha(1.0f - i01Var.J);
                            c11Var.h.z0(rect);
                            hcVar = null;
                            c11Var.h.h(canvas, null);
                            if (imageReceiver2 == null) {
                                imageReceiver2.setAlpha(i01Var.J);
                                imageReceiver2.z0(rect);
                                imageReceiver2.h(canvas, hcVar);
                                break;
                            }
                        }
                    } else {
                        if (i01Var.y) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(i01Var.J, s11Var.o1, s11Var.g1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(s11Var.l1);
                        }
                        drawable.setAlpha((int) ((1.0f - i01Var.J) * 255.0f));
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(rect);
                        float f11 = c11Var.O;
                        float max = (f11 != 0.0f || c11Var.T > 0.0f) ? (((1.0f - Math.max(c11Var.T * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - i01Var.J) * (1.0f - c11Var.P));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((c11Var.Q * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (i01Var.J * org.telegram.messenger.g0.L(45.0f)) + i01Var.G);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = c11Var.Q;
                        if (i16 == 0) {
                            rect2.offset(org.telegram.messenger.g0.L(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(org.telegram.messenger.g0.L(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-org.telegram.messenger.g0.L(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(org.telegram.messenger.g0.L(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - i01Var.J) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (s11Var.b0.getX() + s11Var.p0.getX() + i01Var.E), s11Var.b0.getY() + ((int) s11Var.p0.getY()) + i01Var.F);
                        s11Var.p0.draw(canvas);
                        canvas.restore();
                    }
                }
                hcVar = null;
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
                ns nsVar = (ns) this.b;
                if (nsVar.n || nsVar.K) {
                    nsVar.n();
                    return true;
                }
                nsVar.m();
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
                ((uz0) this.b).dismiss();
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = g4Var.g0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j3);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) g4Var.v0[0].getTranslationX();
                k3[] k3VarArr = g4Var.v0;
                if (view == k3VarArr[1]) {
                    i7 = translationX;
                } else {
                    i7 = measuredWidth;
                    if (view == k3VarArr[0]) {
                        i10 = translationX;
                        int save = canvas.save();
                        canvas.clipRect(i10, 0, i7, getHeight());
                        boolean drawChild = super.drawChild(canvas, view, j3);
                        canvas.restoreToCount(save);
                        if (translationX != 0) {
                            return drawChild;
                        }
                        k3[] k3VarArr2 = g4Var.v0;
                        if (view == k3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / org.telegram.messenger.g0.L(20.0f), 1.0f));
                            Drawable drawable = g4Var.n0;
                            drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            g4Var.n0.setAlpha((int) (max * 255.0f));
                            g4Var.n0.draw(canvas);
                            return drawChild;
                        }
                        if (view != k3VarArr2[1]) {
                            return drawChild;
                        }
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        g4Var.o0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i10, 0.0f, i7, getHeight(), g4Var.o0);
                        return drawChild;
                    }
                }
                i10 = 0;
                int save2 = canvas.save();
                canvas.clipRect(i10, 0, i7, getHeight());
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restoreToCount(save2);
                if (translationX != 0) {
                }
                break;
            case 26:
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                x71 x71Var = (x71) this.b;
                kVar = ((org.telegram.ui.ActionBar.g2) x71Var).actionBar;
                if (view == kVar) {
                    r4Var = ((org.telegram.ui.ActionBar.g2) x71Var).parentLayout;
                    if (r4Var != null) {
                        r4Var2 = ((org.telegram.ui.ActionBar.g2) x71Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.g2) x71Var).actionBar;
                        if (kVar2.getVisibility() == 0) {
                            kVar3 = ((org.telegram.ui.ActionBar.g2) x71Var).actionBar;
                            i11 = kVar3.getMeasuredHeight();
                        } else {
                            i11 = 0;
                        }
                        ((ActionBarLayout) r4Var2).q(canvas, i11);
                    }
                }
                return drawChild3;
            case 27:
                y91 y91Var = (y91) this.b;
                if (view == y91Var.b1 && y91Var.isInPreviewMode()) {
                    ((ActionBarLayout) y91Var.getParentLayout()).p(canvas, (int) (y91Var.X * 255.0f), (int) (y91Var.b1.getY() + y91Var.b1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 15:
                super.onAttachedToWindow();
                org.telegram.messenger.g0.h3(((ff0) this.b).r0, 500L);
                break;
            case 24:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((i01) this.b).b;
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
                org.telegram.messenger.g0.r(((ff0) this.b).r0);
                break;
            case 24:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((i01) this.b).b;
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
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(((qm0) this.b).b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(((cn0) this.b).b.size(), "AccDescrSendPhotos", new Object[0]));
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        Activity activity;
        switch (this.a) {
            case 2:
                int paddingLeft = ((i11 - i7) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - org.telegram.messenger.g0.L(24.0f);
                int min2 = Math.min(org.telegram.messenger.g0.L(60.0f), min);
                int L = (paddingTop - min2) - org.telegram.messenger.g0.L(48.0f);
                b5 b5Var = (b5) this.b;
                b5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
                int b10 = c8.l9.b((paddingTop - b5Var.d.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f), min2, min);
                b5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int z11 = org.telegram.messenger.o10.z(48.0f, (paddingTop - b10) - b5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b5Var.d.getLayoutParams();
                layoutParams.topMargin = org.telegram.messenger.g0.L(8.0f) + z11;
                layoutParams2.topMargin = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.f3.C(8.0f, z11, b10);
                layoutParams2.leftMargin = org.telegram.messenger.g0.L(4.0f);
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(4.0f);
                super.onLayout(z10, i7, i10, i11, i12);
                break;
            case 9:
                super.onLayout(z10, i7, i10, i11, i12);
                z40 z40Var = (z40) this.b;
                z40Var.l0();
                z40Var.m0();
                org.telegram.ui.Components.e10 e10Var = z40Var.f;
                te.c cVar = z40Var.b;
                e10Var.setTranslationY(cVar.f);
                z40Var.n0();
                z40Var.e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar.f);
                break;
            case 10:
                super.onLayout(z10, i7, i10, i11, i12);
                q50 q50Var = (q50) this.b;
                TextView textView = q50Var.b;
                if (textView != null) {
                    int measuredWidth = ((q50Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (q50Var.c.getMeasuredWidth() / 2);
                    int top = (q50Var.e.getTop() + ((q50Var.b.getMeasuredHeight() - q50Var.c.getMeasuredHeight()) / 2)) - org.telegram.messenger.g0.L(16.0f);
                    TextView textView2 = q50Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, q50Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 13:
                super.onLayout(z10, i7, i10, i11, i12);
                de0 de0Var = (de0) this.b;
                for (org.telegram.ui.Components.iu0 iu0Var : de0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iu0Var.getLayoutParams();
                    int L2 = org.telegram.messenger.g0.L(16.0f) + getHeight();
                    if (!iu0Var.a() && de0Var.c.getVisibility() == 0) {
                        L2 += org.telegram.messenger.g0.L(230.0f);
                    }
                    iu0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                break;
            case 14:
                super.onLayout(z10, i7, i10, i11, i12);
                me0 me0Var = (me0) this.b;
                me0Var.o0();
                me0Var.n0();
                me0Var.k0();
                break;
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.f0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                ai.l0 l0Var = secretMediaViewer.e;
                l0Var.layout(systemWindowInsetLeft, 0, l0Var.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
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
                super.onLayout(z10, i7, i10, i11, i12);
                ((uz0) this.b).d();
                break;
            case 24:
                super.onLayout(z10, i7, i10, i11, i12);
                i01 i01Var = (i01) this.b;
                Context context = i01Var.getContext();
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
                    Bitmap bitmap = i01Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || i01Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        i01Var.f();
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
                break;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(171.0f), TLObject.FLAG_30));
                break;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(156.0f), TLObject.FLAG_30));
                break;
            case 9:
                z40 z40Var = (z40) this.b;
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                if (org.telegram.messenger.g0.Q1() || size2 > size) {
                    z40Var.d0 = org.telegram.messenger.g0.L(144.0f);
                } else {
                    z40Var.d0 = org.telegram.messenger.g0.L(56.0f);
                }
                kVar = ((org.telegram.ui.ActionBar.g2) z40Var).actionBar;
                measureChildWithMargins(kVar, i7, 0, i10, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) z40Var.s.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.g2) z40Var).actionBar;
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) z40Var.e.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.g2) z40Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) z40Var.f.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.g2) z40Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) z40Var.h.getLayoutParams();
                kVar5 = ((org.telegram.ui.ActionBar.g2) z40Var).actionBar;
                marginLayoutParams4.topMargin = kVar5.getMeasuredHeight();
                z40Var.h.getLayoutParams().height = z40Var.d0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) z40Var.d.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.g2) z40Var).actionBar;
                marginLayoutParams5.height = org.telegram.messenger.g0.L(53.0f) + kVar6.getMeasuredHeight() + z40Var.d0;
                z40Var.o0();
                super.onMeasure(i7, i10);
                break;
            case 11:
                ((a60) this.b).x = org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i7)) ? 144.0f : 78.0f);
                super.onMeasure(i7, i10);
                break;
            case 13:
                super.onMeasure(i7, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                de0 de0Var = (de0) this.b;
                for (org.telegram.ui.Components.iu0 iu0Var : de0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) iu0Var.getLayoutParams();
                    int L = org.telegram.messenger.g0.L(16.0f) + (measuredHeight - marginLayoutParams6.topMargin);
                    if (!iu0Var.a() && de0Var.c.getVisibility() == 0) {
                        L += org.telegram.messenger.g0.L(230.0f);
                    }
                    iu0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams6.rightMargin) - marginLayoutParams6.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
                }
                break;
            case 16:
                lm0 lm0Var = (lm0) this.b;
                FrameLayout frameLayout = lm0Var.M;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) lm0Var.M.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
                }
                super.onMeasure(i7, i10);
                break;
            case 21:
                super.onMeasure(i7, i10);
                ProfileActivity.d1((ProfileActivity) this.b);
                break;
            case 22:
                int size3 = View.MeasureSpec.getSize(i7);
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
                break;
            case 26:
                int size5 = View.MeasureSpec.getSize(i7);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                x71 x71Var = (x71) this.b;
                kVar7 = ((org.telegram.ui.ActionBar.g2) x71Var).actionBar;
                measureChildWithMargins(kVar7, i7, 0, i10, 0);
                kVar8 = ((org.telegram.ui.ActionBar.g2) x71Var).actionBar;
                int measuredHeight2 = kVar8.getMeasuredHeight();
                kVar9 = ((org.telegram.ui.ActionBar.g2) x71Var).actionBar;
                if (kVar9.getVisibility() == 0) {
                    size6 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) x71Var.p0.getLayoutParams()).topMargin = measuredHeight2;
                x71Var.p0.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30));
                measureChildWithMargins(x71Var.r0, i7, 0, i10, 0);
                break;
            case 28:
                super.onMeasure(i7, i10);
                ((ViewGroup.MarginLayoutParams) ((bb1) this.b).M.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.m;
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 6:
                super.onSizeChanged(i7, i10, i11, i12);
                ns nsVar = (ns) this.b;
                ih.d.c(nsVar.s, nsVar.y);
                nsVar.t.d();
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
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
                ((o31) this.b).p0();
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
                ((lb) this.b).Y.invalidate();
                break;
            case 19:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.D1();
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
                l6 l6Var = (l6) this.b;
                return drawable == l6Var.c || drawable == l6Var.b || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = 29;
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, c8.ma.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.V(textView, org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.G6, 100), h6Var);
        textView.setTextSize(1, 13.0f);
        org.telegram.messenger.f3.k(textView, 17, null, 2131743611);
        linearLayout.addView(textView, c8.ma.t(-1, -2, 0, 16, 17, 17, 16));
        ug.r0 r0Var = new ug.r0(context, h6Var, false);
        this.b = r0Var;
        String N0 = org.telegram.messenger.hd.N0(2131743612, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.nq(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) N0);
        r0Var.f.setText(spannableStringBuilder);
        linearLayout.addView(r0Var, c8.ma.t(-1, 48, 0, 16, 0, 16, 16));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(zy zyVar, Context context) {
        super(context);
        String N0;
        this.a = 7;
        this.b = zyVar;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(22.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        int i10 = 0;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(imageView, d02, M, null, null);
        addView(imageView, c8.ma.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        lVar.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(lVar, i11, null);
        lVar.setGravity(1);
        lVar.setText(zyVar.f1(lVar));
        org.telegram.messenger.so soVar = zyVar.U1;
        if (soVar != null && soVar.n) {
            i10 = 26;
        }
        lVar.s = i10;
        addView(lVar, c8.ma.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (zyVar.V1.isEmpty()) {
            N0 = org.telegram.messenger.hd.N0(2131750627, null);
        } else {
            N0 = org.telegram.messenger.hd.N0(2131750628, null);
        }
        textView.setText(N0);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        addView(textView, c8.ma.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new a(this, 22));
        addView(imageView2, c8.ma.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    private final void a(Configuration configuration) {
    }
}
