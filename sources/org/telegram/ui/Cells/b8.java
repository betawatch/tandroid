package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b8 extends FrameLayout {
    public org.telegram.ui.Components.g9 a;
    public TLRPC.Document b;
    public Object c;
    public long d;
    public boolean e;
    public float f;
    public boolean h;
    public kg.l1 n;
    public boolean r;
    public boolean s;
    public org.telegram.ui.ActionBar.p6 w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.g9 g9Var = this.a;
        if (view == g9Var && (((z10 = this.e) && this.f != 0.8f) || (!z10 && this.f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.e) {
                float f7 = this.f;
                if (f7 != 0.8f) {
                    float f10 = f7 - (j11 / 400.0f);
                    this.f = f10;
                    if (f10 < 0.8f) {
                        this.f = 0.8f;
                    }
                    g9Var.setScaleX(this.f);
                    g9Var.setScaleY(this.f);
                    g9Var.invalidate();
                    invalidate();
                }
            }
            float f11 = (j11 / 400.0f) + this.f;
            this.f = f11;
            if (f11 > 1.0f) {
                this.f = 1.0f;
            }
            g9Var.setScaleX(this.f);
            g9Var.setScaleY(this.f);
            g9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.c;
    }

    public fj getSendAnimationData() {
        org.telegram.ui.Components.g9 g9Var = this.a;
        ImageReceiver imageReceiver = g9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        fj fjVar = new fj();
        g9Var.getLocationInWindow(new int[2]);
        fjVar.a = imageReceiver.r() + r3[0];
        fjVar.b = imageReceiver.s() + r3[1];
        fjVar.c = imageReceiver.M0;
        return fjVar;
    }

    public TLRPC.Document getSticker() {
        return this.b;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.b == null) {
            return;
        }
        String str = null;
        for (int i10 = 0; i10 < this.b.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = this.b.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                str = (str2 == null || str2.length() <= 0) ? null : documentAttribute.alt;
            }
        }
        if (str != null) {
            StringBuilder i11 = sc.e.i(str, " ");
            i11.append(cd.L0(2131753936, null));
            accessibilityNodeInfo.setText(i11.toString());
        } else {
            accessibilityNodeInfo.setText(cd.L0(2131753936, null));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + org.telegram.messenger.i0.L(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(78.0f), TLObject.FLAG_30));
    }

    public void setClearsInputField(boolean z10) {
        this.h = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        org.telegram.ui.Components.g9 g9Var = this.a;
        if ((g9Var.getImageReceiver().e1 != 0) != z10) {
            g9Var.getImageReceiver().e1 = z10 ? 1 : 0;
            g9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
