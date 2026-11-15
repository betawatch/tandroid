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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class dr extends EditTextBoldCursor {
    public static final org.telegram.ui.Components.mt0 d2;
    public static final org.telegram.ui.Components.mt0 e2;
    public static final org.telegram.ui.Components.mt0 f2;
    public static final org.telegram.ui.Components.mt0 g2;
    public float M1;
    public float N1;
    public float O1;
    public float P1;
    public r1.g Q1;
    public r1.g R1;
    public r1.g S1;
    public r1.g T1;
    public boolean U1;
    public float V1;
    public float W1;
    public boolean X1;
    public Bitmap Y1;
    public Canvas Z1;
    public ValueAnimator a2;
    public ValueAnimator b2;
    public boolean c2;

    static {
        org.telegram.ui.Components.mt0 mt0Var = new org.telegram.ui.Components.mt0(new org.telegram.messenger.fd(29), new br(0));
        mt0Var.c = 100.0f;
        d2 = mt0Var;
        org.telegram.ui.Components.mt0 mt0Var2 = new org.telegram.ui.Components.mt0(new br(1), new br(2));
        mt0Var2.c = 100.0f;
        e2 = mt0Var2;
        org.telegram.ui.Components.mt0 mt0Var3 = new org.telegram.ui.Components.mt0(new br(3), new br(4));
        mt0Var3.c = 100.0f;
        f2 = mt0Var3;
        org.telegram.ui.Components.mt0 mt0Var4 = new org.telegram.ui.Components.mt0(new br(5), new br(6));
        mt0Var4.c = 100.0f;
        g2 = mt0Var4;
    }

    public static void C(r1.g gVar, float f10) {
        r1.h hVar = gVar.m;
        if (hVar == null || f10 != ((float) hVar.i)) {
            gVar.d();
            r1.h hVar2 = new r1.h(f10);
            hVar2.b(400.0f);
            hVar2.a(1.0f);
            hVar2.i = f10;
            gVar.m = hVar2;
            gVar.h();
        }
    }

    public final void A(float f10) {
        C(this.R1, f10 * 100.0f);
    }

    public final void B(float f10) {
        C(this.Q1, f10 * 100.0f);
    }

    public final void D(float f10) {
        C(this.S1, f10 * 100.0f);
        r1.g gVar = this.T1;
        gVar.d();
        if (f10 == 0.0f) {
            this.P1 = 1.0f;
            return;
        }
        r1.h n10 = org.telegram.ui.Cells.y0.n(1.0f, 500.0f, 0.75f);
        n10.i = 100.0f;
        gVar.m = n10;
        gVar.b = 100.0f;
        gVar.c = true;
        gVar.a = 4000.0f;
        gVar.h();
    }

    public final void E() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0 || getLayout() == null) {
            return;
        }
        Bitmap bitmap = this.Y1;
        if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.Y1.getWidth() != getMeasuredWidth()) {
            Bitmap bitmap2 = this.Y1;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.Y1 = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.Z1 = new Canvas(this.Y1);
        }
        this.Y1.eraseColor(0);
        StaticLayout staticLayout = new StaticLayout(getTransformationMethod().getTransformation(getText(), this), getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(r4, 0, r4.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.Z1.save();
        this.Z1.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(this.Z1);
        this.Z1.restore();
        this.W1 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b2 = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 7));
        this.b2.setDuration(220L);
        this.b2.start();
    }

    public float getErrorProgress() {
        return this.N1;
    }

    public float getFocusedProgress() {
        return this.M1;
    }

    public float getSuccessProgress() {
        return this.O1;
    }

    public float getSuccessScaleProgress() {
        return this.P1;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q1.d();
        this.R1.d();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i7, Rect rect) {
        super.onFocusChanged(z10, i7, rect);
        if (isFocused()) {
            return;
        }
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClipDescription primaryClipDescription;
        int i7;
        if (motionEvent.getAction() == 0) {
            this.c2 = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ar arVar = getParent() instanceof ar ? (ar) getParent() : null;
            if (motionEvent.getAction() == 1 && this.c2) {
                if (!isFocused() || arVar == null) {
                    requestFocus();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService(ClipboardManager.class);
                    if (clipboardManager == null || clipboardManager.getPrimaryClipDescription() == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                        return false;
                    }
                    primaryClipDescription.hasMimeType("text/plain");
                    ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    try {
                        i7 = Integer.parseInt((itemAt == null || itemAt.getText() == null) ? "" : itemAt.getText().toString());
                    } catch (Exception unused) {
                        i7 = -1;
                    }
                    if (i7 > 0) {
                        startActionMode(new cr(this));
                    }
                }
                setSelection(0);
                if (this.U1) {
                    org.telegram.messenger.g0.J3(this);
                }
            }
            this.c2 = false;
        }
        return this.c2;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i7, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z10) {
        this.U1 = z10;
        setShowSoftInputOnFocus(z10);
    }
}
