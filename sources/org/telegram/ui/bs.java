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
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class bs extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.ou0 X1;
    public static final org.telegram.ui.Components.ou0 Y1;
    public static final org.telegram.ui.Components.ou0 Z1;
    public static final org.telegram.ui.Components.ou0 a2;
    public float G1;
    public float H1;
    public float I1;
    public float J1;
    public o1.j K1;
    public o1.j L1;
    public o1.j M1;
    public o1.j N1;
    public boolean O1;
    public float P1;
    public float Q1;
    public boolean R1;
    public Bitmap S1;
    public Canvas T1;
    public ValueAnimator U1;
    public ValueAnimator V1;
    public boolean W1;

    static {
        org.telegram.ui.Components.ou0 ou0Var = new org.telegram.ui.Components.ou0(new org.telegram.ui.Cells.m5(9), new org.telegram.ui.Cells.m5(10));
        ou0Var.c = 100.0f;
        X1 = ou0Var;
        org.telegram.ui.Components.ou0 ou0Var2 = new org.telegram.ui.Components.ou0(new org.telegram.ui.Cells.m5(11), new org.telegram.ui.Cells.m5(12));
        ou0Var2.c = 100.0f;
        Y1 = ou0Var2;
        org.telegram.ui.Components.ou0 ou0Var3 = new org.telegram.ui.Components.ou0(new org.telegram.ui.Cells.m5(13), new org.telegram.ui.Cells.m5(14));
        ou0Var3.c = 100.0f;
        Z1 = ou0Var3;
        org.telegram.ui.Components.ou0 ou0Var4 = new org.telegram.ui.Components.ou0(new org.telegram.ui.Cells.m5(15), new org.telegram.ui.Cells.m5(16));
        ou0Var4.c = 100.0f;
        a2 = ou0Var4;
    }

    public static void B(o1.j jVar, float f7) {
        o1.k kVar = jVar.m;
        if (kVar == null || f7 != ((float) kVar.i)) {
            jVar.d();
            o1.k kVar2 = new o1.k(f7);
            kVar2.b(400.0f);
            kVar2.a(1.0f);
            kVar2.i = f7;
            jVar.m = kVar2;
            jVar.h();
        }
    }

    public final void A(float f7) {
        B(this.K1, f7 * 100.0f);
    }

    public final void C(float f7) {
        B(this.M1, f7 * 100.0f);
        o1.j jVar = this.N1;
        jVar.d();
        if (f7 == 0.0f) {
            this.J1 = 1.0f;
            return;
        }
        o1.k p5 = org.telegram.ui.Cells.f1.p(1.0f, 500.0f, 0.75f);
        p5.i = 100.0f;
        jVar.m = p5;
        jVar.b = 100.0f;
        jVar.c = true;
        jVar.a = 4000.0f;
        jVar.h();
    }

    public final void D() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0 || getLayout() == null) {
            return;
        }
        Bitmap bitmap = this.S1;
        if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.S1.getWidth() != getMeasuredWidth()) {
            Bitmap bitmap2 = this.S1;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.S1 = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.T1 = new Canvas(this.S1);
        }
        this.S1.eraseColor(0);
        StaticLayout staticLayout = new StaticLayout(getTransformationMethod().getTransformation(getText(), this), getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(r4, 0, r4.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.T1.save();
        this.T1.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(this.T1);
        this.T1.restore();
        this.Q1 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.V1 = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 7));
        this.V1.setDuration(220L);
        this.V1.start();
    }

    public float getErrorProgress() {
        return this.H1;
    }

    public float getFocusedProgress() {
        return this.G1;
    }

    public float getSuccessProgress() {
        return this.I1;
    }

    public float getSuccessScaleProgress() {
        return this.J1;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K1.d();
        this.L1.d();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (isFocused()) {
            return;
        }
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClipDescription primaryClipDescription;
        int i10;
        if (motionEvent.getAction() == 0) {
            this.W1 = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            zr zrVar = getParent() instanceof zr ? (zr) getParent() : null;
            if (motionEvent.getAction() == 1 && this.W1) {
                if (!isFocused() || zrVar == null) {
                    requestFocus();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService(ClipboardManager.class);
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
                if (this.O1) {
                    org.telegram.messenger.i0.J3(this);
                }
            }
            this.W1 = false;
        }
        return this.W1;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i10, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.O1 = z10;
        setShowSoftInputOnFocus(z10);
    }

    public final void z(float f7) {
        B(this.L1, f7 * 100.0f);
    }
}
