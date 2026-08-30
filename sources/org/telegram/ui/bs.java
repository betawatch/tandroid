package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class bs extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.iv0 F;
    public static final org.telegram.ui.Components.iv0 G;
    public static final org.telegram.ui.Components.iv0 H;
    public static final org.telegram.ui.Components.iv0 I;
    public Canvas B;
    public ValueAnimator C;
    public ValueAnimator D;
    public boolean E;
    public float b;
    public float c;
    public float d;
    public float e;
    public o1.j f;
    public o1.j h;
    public o1.j n;
    public o1.j r;
    public boolean s;
    public float v;
    public float w;
    public boolean x;
    public Bitmap y;

    static {
        org.telegram.ui.Components.iv0 iv0Var = new org.telegram.ui.Components.iv0(new m.j0(25), new m.j0(26));
        iv0Var.c = 100.0f;
        F = iv0Var;
        org.telegram.ui.Components.iv0 iv0Var2 = new org.telegram.ui.Components.iv0(new m.j0(27), new m.j0(28));
        iv0Var2.c = 100.0f;
        G = iv0Var2;
        org.telegram.ui.Components.iv0 iv0Var3 = new org.telegram.ui.Components.iv0(new m.j0(29), new zr(0));
        iv0Var3.c = 100.0f;
        H = iv0Var3;
        org.telegram.ui.Components.iv0 iv0Var4 = new org.telegram.ui.Components.iv0(new zr(1), new zr(2));
        iv0Var4.c = 100.0f;
        I = iv0Var4;
    }

    public static void k(o1.j jVar, float f10) {
        o1.k kVar = jVar.u;
        if (kVar == null || f10 != ((float) kVar.i)) {
            jVar.c();
            o1.k kVar2 = new o1.k(f10);
            kVar2.b(400.0f);
            kVar2.a(1.0f);
            kVar2.i = f10;
            jVar.u = kVar2;
            jVar.f();
        }
    }

    public float getErrorProgress() {
        return this.c;
    }

    public float getFocusedProgress() {
        return this.b;
    }

    public float getSuccessProgress() {
        return this.d;
    }

    public float getSuccessScaleProgress() {
        return this.e;
    }

    public final void i(float f10) {
        k(this.h, f10 * 100.0f);
    }

    public final void j(float f10) {
        k(this.f, f10 * 100.0f);
    }

    public final void l(float f10) {
        k(this.n, f10 * 100.0f);
        o1.j jVar = this.r;
        jVar.c();
        if (f10 == 0.0f) {
            this.e = 1.0f;
            return;
        }
        o1.k n10 = yh.n(1.0f, 500.0f, 0.75f);
        n10.i = 100.0f;
        jVar.u = n10;
        jVar.b = 100.0f;
        jVar.c = true;
        jVar.a = 4000.0f;
        jVar.f();
    }

    public final void m() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0 || getLayout() == null) {
            return;
        }
        Bitmap bitmap = this.y;
        if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.y.getWidth() != getMeasuredWidth()) {
            Bitmap bitmap2 = this.y;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.y = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.B = new Canvas(this.y);
        }
        this.y.eraseColor(0);
        StaticLayout staticLayout = new StaticLayout(getTransformationMethod().getTransformation(getText(), this), getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(r4, 0, r4.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.B.save();
        this.B.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(this.B);
        this.B.restore();
        this.w = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 8));
        this.D.setDuration(220L);
        this.D.start();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.xt, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.c();
        this.h.c();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i10, Rect rect) {
        super.onFocusChanged(z4, i10, rect);
        if (isFocused()) {
            return;
        }
        hideActionMode();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClipDescription primaryClipDescription;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.E = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            yr yrVar = getParent() instanceof yr ? (yr) getParent() : null;
            if (motionEvent.getAction() == 1 && this.E) {
                if (!isFocused() || yrVar == null) {
                    requestFocus();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) f0.f.f(getContext(), ClipboardManager.class);
                    if (clipboardManager == null || clipboardManager.getPrimaryClipDescription() == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                        return false;
                    }
                    primaryClipDescription.hasMimeType("text/plain");
                    ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    try {
                        i10 = Integer.parseInt((itemAt == null || itemAt.getText() == null) ? "" : itemAt.getText().toString());
                    } catch (Exception unused) {
                        i10 = -1;
                    }
                    if (i10 > 0) {
                        startActionMode(new as(this));
                    }
                }
                setSelection(0);
                if (this.s) {
                    AndroidUtilities.showKeyboard(this);
                }
            }
            this.E = false;
        }
        return this.E;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i10, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z4) {
        this.s = z4;
        setShowSoftInputOnFocus(z4);
    }
}
