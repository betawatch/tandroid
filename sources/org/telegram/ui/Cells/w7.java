package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public org.telegram.ui.Components.k9 a;
    public TLRPC.Document b;
    public Object c;
    public long d;
    public boolean e;
    public float f;
    public boolean h;
    public vg.y0 n;
    public boolean r;
    public boolean s;
    public org.telegram.ui.ActionBar.e6 w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.k9 k9Var = this.a;
        if (view == k9Var && (((z10 = this.e) && this.f != 0.8f) || (!z10 && this.f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.e) {
                float f10 = this.f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (j11 / 400.0f);
                    this.f = f11;
                    if (f11 < 0.8f) {
                        this.f = 0.8f;
                    }
                    k9Var.setScaleX(this.f);
                    k9Var.setScaleY(this.f);
                    k9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (j11 / 400.0f) + this.f;
            this.f = f12;
            if (f12 > 1.0f) {
                this.f = 1.0f;
            }
            k9Var.setScaleX(this.f);
            k9Var.setScaleY(this.f);
            k9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.c;
    }

    public vi getSendAnimationData() {
        org.telegram.ui.Components.k9 k9Var = this.a;
        ImageReceiver imageReceiver = k9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        vi viVar = new vi();
        k9Var.getLocationInWindow(new int[2]);
        viVar.a = imageReceiver.r() + r3[0];
        viVar.b = imageReceiver.s() + r3[1];
        viVar.c = imageReceiver.N0;
        return viVar;
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
        for (int i3 = 0; i3 < this.b.attributes.size(); i3++) {
            TLRPC.DocumentAttribute documentAttribute = this.b.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                str = (str2 == null || str2.length() <= 0) ? null : documentAttribute.alt;
            }
        }
        if (str != null) {
            StringBuilder h = t4.c.h(str, " ");
            h.append(bd.M0(2131753936, null));
            accessibilityNodeInfo.setText(h.toString());
        } else {
            accessibilityNodeInfo.setText(bd.M0(2131753936, null));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), TLObject.FLAG_30));
    }

    public void setClearsInputField(boolean z10) {
        this.h = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        org.telegram.ui.Components.k9 k9Var = this.a;
        if ((k9Var.getImageReceiver().f1 != 0) != z10) {
            k9Var.getImageReceiver().f1 = z10 ? 1 : 0;
            k9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
