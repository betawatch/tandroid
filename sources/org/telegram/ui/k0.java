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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ic icVar;
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
                w40 w40Var = (w40) this.b;
                dh.g gVar = w40Var.p0;
                ri.f fVar = w40Var.q0;
                if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
                    w40Var.j0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (fVar != null && !fVar.r && fVar.k(measuredWidth2, measuredHeight)) {
                        gVar.b(fVar.i(measuredWidth2, measuredHeight), -3);
                        fVar.j();
                    }
                }
                super.dispatchDraw(canvas);
                org.telegram.messenger.g0.O(canvas, this, w40Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6), w40Var.m0, 1.0f);
                break;
            case 12:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                View view = launchActivity.E0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.x1 == null) {
                        launchActivity.x1 = new int[2];
                    }
                    launchActivity.E0.getLocationInWindow(launchActivity.x1);
                    int[] iArr = launchActivity.x1;
                    int i7 = iArr[0];
                    int i10 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.x1;
                    int i11 = i7 - iArr2[0];
                    int i12 = i10 - iArr2[1];
                    canvas.save();
                    canvas.translate(i11, i12);
                    launchActivity.E0.getBackground().draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 14:
                je0 je0Var = (je0) this.b;
                je0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.k6.a7;
                int themedColor = je0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.k6.d6;
                int themedColor2 = je0Var.getThemedColor(i14);
                mb1 mb1Var = je0Var.c;
                int f10 = i0.a.f(mb1Var != null ? mb1Var.r(0) : 1.0f, themedColor, themedColor2);
                int i15 = je0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.k6.n0(f10));
                }
                if (je0Var.N != 0) {
                    canvas.drawRect(getWidth() - je0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.k6.n0(f10));
                }
                super.dispatchDraw(canvas);
                je0Var.i0();
                ri.c cVar = je0Var.R;
                int themedColor3 = je0Var.getThemedColor(i13);
                int themedColor4 = je0Var.getThemedColor(i14);
                mb1 mb1Var2 = je0Var.c;
                cVar.a(i0.a.f(mb1Var2 != null ? mb1Var2.r(0) : 1.0f, themedColor3, themedColor4));
                View view2 = je0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 23:
                rz0 rz0Var = (rz0) this.b;
                if (rz0Var.s > 0.0f && rz0Var.n != null) {
                    rz0Var.r.reset();
                    float width = getWidth() / rz0Var.f.getWidth();
                    rz0Var.r.postScale(width, width);
                    rz0Var.h.setLocalMatrix(rz0Var.r);
                    rz0Var.n.setAlpha((int) (rz0Var.s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), rz0Var.n);
                }
                if (rz0Var.W && (q1Var = rz0Var.O) != null) {
                    q1Var.setVisibility(4);
                    rz0Var.W = false;
                }
                super.dispatchDraw(canvas);
                break;
            case 24:
                g01 g01Var = (g01) this.b;
                ImageReceiver imageReceiver2 = g01Var.b;
                Rect rect = g01Var.e;
                q11 q11Var = g01Var.P;
                a11 a11Var = g01Var.a;
                if (g01Var.n != null && g01Var.r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    g01Var.r.setAlpha((int) (g01Var.I * 255.0f));
                    canvas.drawBitmap(g01Var.n, 0.0f, 0.0f, g01Var.r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (a11Var != null) {
                    Drawable drawable = a11Var.E;
                    if (drawable == null) {
                        if (a11Var.s && (imageReceiver = a11Var.h) != null) {
                            imageReceiver.setAlpha(1.0f - g01Var.I);
                            a11Var.h.z0(rect);
                            icVar = null;
                            a11Var.h.h(canvas, null);
                            if (imageReceiver2 == null) {
                                imageReceiver2.setAlpha(g01Var.I);
                                imageReceiver2.z0(rect);
                                imageReceiver2.h(canvas, icVar);
                                break;
                            }
                        }
                    } else {
                        if (g01Var.y) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(g01Var.I, q11Var.n1, q11Var.f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(q11Var.k1);
                        }
                        drawable.setAlpha((int) ((1.0f - g01Var.I) * 255.0f));
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(rect);
                        float f11 = a11Var.N;
                        float max = (f11 != 0.0f || a11Var.S > 0.0f) ? (((1.0f - Math.max(a11Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        Rect rect2 = org.telegram.messenger.g0.Q;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - g01Var.I) * (1.0f - a11Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((a11Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (g01Var.I * org.telegram.messenger.g0.L(45.0f)) + g01Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = a11Var.P;
                        if (i16 == 0) {
                            rect2.offset(org.telegram.messenger.g0.L(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(org.telegram.messenger.g0.L(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-org.telegram.messenger.g0.L(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(org.telegram.messenger.g0.L(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - g01Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (q11Var.a0.getX() + q11Var.o0.getX() + g01Var.D), q11Var.a0.getY() + ((int) q11Var.o0.getY()) + g01Var.E);
                        q11Var.o0.draw(canvas);
                        canvas.restore();
                    }
                }
                icVar = null;
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
                ks ksVar = (ks) this.b;
                if (ksVar.n || ksVar.K) {
                    ksVar.n();
                    return true;
                }
                ksVar.m();
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
                ((rz0) this.b).dismiss();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                vd vdVar = (vd) this.b;
                if (motionEvent.getActionMasked() == 0) {
                    vdVar.x.X0.C0();
                    for (View view : vdVar.b.getViewPages()) {
                        if (view instanceof td) {
                            ((td) view).a.C0();
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
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.b;
                ArticleViewer$WindowView articleViewer$WindowView = g4Var.f0;
                if (articleViewer$WindowView == null || !(articleViewer$WindowView.e || articleViewer$WindowView.f)) {
                    return super.drawChild(canvas, view, j3);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) g4Var.u0[0].getTranslationX();
                k3[] k3VarArr = g4Var.u0;
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
                        k3[] k3VarArr2 = g4Var.u0;
                        if (view == k3VarArr2[0]) {
                            float max = Math.max(0.0f, Math.min((measuredWidth - translationX) / org.telegram.messenger.g0.L(20.0f), 1.0f));
                            Drawable drawable = g4Var.m0;
                            drawable.setBounds(translationX - drawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            g4Var.m0.setAlpha((int) (max * 255.0f));
                            g4Var.m0.draw(canvas);
                            return drawChild;
                        }
                        if (view != k3VarArr2[1]) {
                            return drawChild;
                        }
                        float min = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        g4Var.n0.setColor(((int) ((min >= 0.0f ? min : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i10, 0.0f, i7, getHeight(), g4Var.n0);
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
                u71 u71Var = (u71) this.b;
                kVar = ((org.telegram.ui.ActionBar.f2) u71Var).actionBar;
                if (view == kVar) {
                    q4Var = ((org.telegram.ui.ActionBar.f2) u71Var).parentLayout;
                    if (q4Var != null) {
                        q4Var2 = ((org.telegram.ui.ActionBar.f2) u71Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.f2) u71Var).actionBar;
                        if (kVar2.getVisibility() == 0) {
                            kVar3 = ((org.telegram.ui.ActionBar.f2) u71Var).actionBar;
                            i11 = kVar3.getMeasuredHeight();
                        } else {
                            i11 = 0;
                        }
                        ((ActionBarLayout) q4Var2).q(canvas, i11);
                    }
                }
                return drawChild3;
            case 27:
                v91 v91Var = (v91) this.b;
                if (view == v91Var.a1 && v91Var.isInPreviewMode()) {
                    ((ActionBarLayout) v91Var.getParentLayout()).p(canvas, (int) (v91Var.W * 255.0f), (int) (v91Var.a1.getY() + v91Var.a1.getMeasuredHeight()));
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
                org.telegram.messenger.g0.i3(((cf0) this.b).q0, 500L);
                break;
            case 24:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((g01) this.b).b;
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
                org.telegram.messenger.g0.r(((cf0) this.b).q0);
                break;
            case 24:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((g01) this.b).b;
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
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(((mm0) this.b).b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(((xm0) this.b).b.size(), "AccDescrSendPhotos", new Object[0]));
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
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
                int b10 = c8.j9.b((paddingTop - b5Var.d.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f), min2, min);
                b5Var.c.measure(View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b10, TLObject.FLAG_30));
                int y10 = org.telegram.messenger.camera.q.y(48.0f, (paddingTop - b10) - b5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b5Var.c.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b5Var.d.getLayoutParams();
                layoutParams.topMargin = org.telegram.messenger.g0.L(8.0f) + y10;
                layoutParams2.topMargin = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.C(8.0f, y10, b10);
                layoutParams2.leftMargin = org.telegram.messenger.g0.L(4.0f);
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(4.0f);
                super.onLayout(z9, i7, i10, i11, i12);
                break;
            case 9:
                super.onLayout(z9, i7, i10, i11, i12);
                w40 w40Var = (w40) this.b;
                w40Var.l0();
                w40Var.m0();
                org.telegram.ui.Components.r00 r00Var = w40Var.f;
                te.c cVar = w40Var.b;
                r00Var.setTranslationY(cVar.f);
                w40Var.n0();
                w40Var.e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar.f);
                break;
            case 10:
                super.onLayout(z9, i7, i10, i11, i12);
                p50 p50Var = (p50) this.b;
                TextView textView = p50Var.b;
                if (textView != null) {
                    int measuredWidth = ((p50Var.b.getMeasuredWidth() / 2) + textView.getLeft()) - (p50Var.c.getMeasuredWidth() / 2);
                    int top = (p50Var.e.getTop() + ((p50Var.b.getMeasuredHeight() - p50Var.c.getMeasuredHeight()) / 2)) - org.telegram.messenger.g0.L(16.0f);
                    TextView textView2 = p50Var.c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, p50Var.c.getMeasuredHeight() + top);
                    break;
                }
                break;
            case 13:
                super.onLayout(z9, i7, i10, i11, i12);
                ce0 ce0Var = (ce0) this.b;
                for (org.telegram.ui.Components.wt0 wt0Var : ce0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wt0Var.getLayoutParams();
                    int L2 = org.telegram.messenger.g0.L(16.0f) + getHeight();
                    if (!wt0Var.a() && ce0Var.c.getVisibility() == 0) {
                        L2 += org.telegram.messenger.g0.L(230.0f);
                    }
                    wt0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                break;
            case 14:
                super.onLayout(z9, i7, i10, i11, i12);
                je0 je0Var = (je0) this.b;
                je0Var.o0();
                je0Var.n0();
                je0Var.k0();
                break;
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                WindowInsets windowInsets = secretMediaViewer.e0;
                int systemWindowInsetLeft = windowInsets != null ? windowInsets.getSystemWindowInsetLeft() : 0;
                bi.x5 x5Var = secretMediaViewer.e;
                x5Var.layout(systemWindowInsetLeft, 0, x5Var.getMeasuredWidth() + systemWindowInsetLeft, secretMediaViewer.e.getMeasuredHeight());
                if (z9) {
                    if (secretMediaViewer.I0 == null) {
                        secretMediaViewer.w0 = 1.0f;
                        secretMediaViewer.u0 = 0.0f;
                        secretMediaViewer.v0 = 0.0f;
                    }
                    secretMediaViewer.o(secretMediaViewer.w0);
                    break;
                }
                break;
            case 23:
                super.onLayout(z9, i7, i10, i11, i12);
                ((rz0) this.b).d();
                break;
            case 24:
                super.onLayout(z9, i7, i10, i11, i12);
                g01 g01Var = (g01) this.b;
                Context context = g01Var.getContext();
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
                    Bitmap bitmap = g01Var.n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || g01Var.n.getHeight() != decorView.getMeasuredHeight()) {
                        g01Var.f();
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
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
                w40 w40Var = (w40) this.b;
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                if (org.telegram.messenger.g0.Q1() || size2 > size) {
                    w40Var.c0 = org.telegram.messenger.g0.L(144.0f);
                } else {
                    w40Var.c0 = org.telegram.messenger.g0.L(56.0f);
                }
                kVar = ((org.telegram.ui.ActionBar.f2) w40Var).actionBar;
                measureChildWithMargins(kVar, i7, 0, i10, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w40Var.s.getLayoutParams();
                kVar2 = ((org.telegram.ui.ActionBar.f2) w40Var).actionBar;
                marginLayoutParams.topMargin = org.telegram.messenger.g0.L(48.0f) + kVar2.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) w40Var.e.getLayoutParams();
                kVar3 = ((org.telegram.ui.ActionBar.f2) w40Var).actionBar;
                marginLayoutParams2.topMargin = kVar3.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) w40Var.f.getLayoutParams();
                kVar4 = ((org.telegram.ui.ActionBar.f2) w40Var).actionBar;
                marginLayoutParams3.topMargin = kVar4.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) w40Var.h.getLayoutParams();
                kVar5 = ((org.telegram.ui.ActionBar.f2) w40Var).actionBar;
                marginLayoutParams4.topMargin = kVar5.getMeasuredHeight();
                w40Var.h.getLayoutParams().height = w40Var.c0;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) w40Var.d.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.f2) w40Var).actionBar;
                marginLayoutParams5.height = org.telegram.messenger.g0.L(53.0f) + kVar6.getMeasuredHeight() + w40Var.c0;
                w40Var.o0();
                super.onMeasure(i7, i10);
                break;
            case 11:
                ((z50) this.b).x = org.telegram.messenger.g0.L((org.telegram.messenger.g0.Q1() || View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i7)) ? 144.0f : 78.0f);
                super.onMeasure(i7, i10);
                break;
            case 13:
                super.onMeasure(i7, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ce0 ce0Var = (ce0) this.b;
                for (org.telegram.ui.Components.wt0 wt0Var : ce0Var.b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) wt0Var.getLayoutParams();
                    int L = org.telegram.messenger.g0.L(16.0f) + (measuredHeight - marginLayoutParams6.topMargin);
                    if (!wt0Var.a() && ce0Var.c.getVisibility() == 0) {
                        L += org.telegram.messenger.g0.L(230.0f);
                    }
                    wt0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams6.rightMargin) - marginLayoutParams6.leftMargin, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
                }
                break;
            case 16:
                hm0 hm0Var = (hm0) this.b;
                FrameLayout frameLayout = hm0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) hm0Var.L.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
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
                WindowInsets windowInsets = secretMediaViewer.e0;
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
                WindowInsets windowInsets2 = secretMediaViewer.e0;
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
                u71 u71Var = (u71) this.b;
                kVar7 = ((org.telegram.ui.ActionBar.f2) u71Var).actionBar;
                measureChildWithMargins(kVar7, i7, 0, i10, 0);
                kVar8 = ((org.telegram.ui.ActionBar.f2) u71Var).actionBar;
                int measuredHeight2 = kVar8.getMeasuredHeight();
                kVar9 = ((org.telegram.ui.ActionBar.f2) u71Var).actionBar;
                if (kVar9.getVisibility() == 0) {
                    size6 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) u71Var.o0.getLayoutParams()).topMargin = measuredHeight2;
                u71Var.o0.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size6, TLObject.FLAG_30));
                measureChildWithMargins(u71Var.q0, i7, 0, i10, 0);
                break;
            case 28:
                super.onMeasure(i7, i10);
                ((ViewGroup.MarginLayoutParams) ((ya1) this.b).L.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.m;
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
                ks ksVar = (ks) this.b;
                ih.d.c(ksVar.s, ksVar.y);
                ksVar.t.d();
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
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        switch (this.a) {
            case 20:
                ((PopupNotificationActivity) getContext()).j(null);
                super.requestDisallowInterceptTouchEvent(z9);
                break;
            default:
                super.requestDisallowInterceptTouchEvent(z9);
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
                ((m31) this.b).p0();
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
                ((mb) this.b).X.invalidate();
                break;
            case 19:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr = PhotoViewer.Y8;
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
    public k0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = 29;
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, c8.ha.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.G6, 100), f6Var);
        textView.setTextSize(1, 13.0f);
        org.telegram.messenger.k5.m(textView, 17, null, 2131743857);
        linearLayout.addView(textView, c8.ha.t(-1, -2, 0, 16, 17, 17, 16));
        ug.p0 p0Var = new ug.p0(context, f6Var, false);
        this.b = p0Var;
        String M0 = org.telegram.messenger.hd.M0(2131743858, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.wp(0, context.getDrawable(R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) M0);
        p0Var.f.setText(spannableStringBuilder);
        linearLayout.addView(p0Var, c8.ha.t(-1, 48, 0, 16, 0, 16, 16));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(vy vyVar, Context context) {
        super(context);
        String M0;
        this.a = 7;
        this.b = vyVar;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(22.0f);
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        int i10 = 0;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(imageView, d02, N, null, null);
        addView(imageView, c8.ha.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        lVar.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(lVar, i11, null);
        lVar.setGravity(1);
        lVar.setText(vyVar.e1(lVar));
        org.telegram.messenger.vo voVar = vyVar.Q1;
        if (voVar != null && voVar.n) {
            i10 = 26;
        }
        lVar.s = i10;
        addView(lVar, c8.ha.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (vyVar.R1.isEmpty()) {
            M0 = org.telegram.messenger.hd.M0(2131750645, null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131750646, null);
        }
        textView.setText(M0);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        addView(textView, c8.ha.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new a(this, 22));
        addView(imageView2, c8.ha.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    private final void a(Configuration configuration) {
    }
}
