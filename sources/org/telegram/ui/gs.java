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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class gs extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.iv0 I;
    public static final org.telegram.ui.Components.iv0 J;
    public static final org.telegram.ui.Components.iv0 K;
    public static final org.telegram.ui.Components.iv0 L;
    public Canvas E;
    public ValueAnimator F;
    public ValueAnimator G;
    public boolean H;
    public float b;
    public float c;
    public float d;
    public float e;
    public o1.k f;
    public o1.k h;
    public o1.k n;
    public o1.k r;
    public boolean s;
    public float v;
    public float w;
    public boolean x;
    public Bitmap y;

    static {
        org.telegram.ui.Components.iv0 iv0Var = new org.telegram.ui.Components.iv0(new m4.u0(23), new m4.u0(24));
        iv0Var.c = 100.0f;
        I = iv0Var;
        org.telegram.ui.Components.iv0 iv0Var2 = new org.telegram.ui.Components.iv0(new m4.u0(25), new m4.u0(26));
        iv0Var2.c = 100.0f;
        J = iv0Var2;
        org.telegram.ui.Components.iv0 iv0Var3 = new org.telegram.ui.Components.iv0(new m4.u0(27), new m4.u0(28));
        iv0Var3.c = 100.0f;
        K = iv0Var3;
        org.telegram.ui.Components.iv0 iv0Var4 = new org.telegram.ui.Components.iv0(new m4.u0(29), new es(0));
        iv0Var4.c = 100.0f;
        L = iv0Var4;
    }

    public static void k(o1.k kVar, float f7) {
        o1.l lVar = kVar.u;
        if (lVar == null || f7 != ((float) lVar.i)) {
            kVar.c();
            o1.l lVar2 = new o1.l(f7);
            lVar2.b(400.0f);
            lVar2.a(1.0f);
            lVar2.i = f7;
            kVar.u = lVar2;
            kVar.f();
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

    public final void i(float f7) {
        k(this.h, f7 * 100.0f);
    }

    public final void j(float f7) {
        k(this.f, f7 * 100.0f);
    }

    public final void l(float f7) {
        k(this.n, f7 * 100.0f);
        o1.k kVar = this.r;
        kVar.c();
        if (f7 == 0.0f) {
            this.e = 1.0f;
            return;
        }
        o1.l l4 = org.telegram.ui.Cells.q3.l(1.0f, 500.0f, 0.75f);
        l4.i = 100.0f;
        kVar.u = l4;
        kVar.b = 100.0f;
        kVar.c = true;
        kVar.a = 4000.0f;
        kVar.f();
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
            this.E = new Canvas(this.y);
        }
        this.y.eraseColor(0);
        StaticLayout staticLayout = new StaticLayout(getTransformationMethod().getTransformation(getText(), this), getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(r4, 0, r4.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.E.save();
        this.E.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(this.E);
        this.E.restore();
        this.w = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 8));
        this.G.setDuration(220L);
        this.G.start();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.du, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.c();
        this.h.c();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
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
            this.H = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ds dsVar = getParent() instanceof ds ? (ds) getParent() : null;
            if (motionEvent.getAction() == 1 && this.H) {
                if (!isFocused() || dsVar == null) {
                    requestFocus();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) f0.e.f(getContext(), ClipboardManager.class);
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
                        startActionMode(new fs(this));
                    }
                }
                setSelection(0);
                if (this.s) {
                    AndroidUtilities.showKeyboard(this);
                }
            }
            this.H = false;
        }
        return this.H;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i10, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.s = z10;
        setShowSoftInputOnFocus(z10);
    }
}
