package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ej;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class x7 extends FrameLayout {
    public org.telegram.ui.Components.l9 a;
    public TLRPC.Document b;
    public Object c;
    public long d;
    public boolean e;
    public float f;
    public boolean h;
    public ug.z0 n;
    public boolean r;
    public boolean s;
    public org.telegram.ui.ActionBar.f6 w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.l9 l9Var = this.a;
        if (view == l9Var && (((z9 = this.e) && this.f != 0.8f) || (!z9 && this.f != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (this.e) {
                float f10 = this.f;
                if (f10 != 0.8f) {
                    float f11 = f10 - (j10 / 400.0f);
                    this.f = f11;
                    if (f11 < 0.8f) {
                        this.f = 0.8f;
                    }
                    l9Var.setScaleX(this.f);
                    l9Var.setScaleY(this.f);
                    l9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (j10 / 400.0f) + this.f;
            this.f = f12;
            if (f12 > 1.0f) {
                this.f = 1.0f;
            }
            l9Var.setScaleX(this.f);
            l9Var.setScaleY(this.f);
            l9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.c;
    }

    public ej getSendAnimationData() {
        org.telegram.ui.Components.l9 l9Var = this.a;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        ej ejVar = new ej();
        l9Var.getLocationInWindow(new int[2]);
        ejVar.a = imageReceiver.r() + r3[0];
        ejVar.b = imageReceiver.s() + r3[1];
        ejVar.c = imageReceiver.M0;
        return ejVar;
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
        for (int i7 = 0; i7 < this.b.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = this.b.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                str = (str2 == null || str2.length() <= 0) ? null : documentAttribute.alt;
            }
        }
        if (str != null) {
            StringBuilder j3 = rf.b.j(str, " ");
            j3.append(hd.M0(2131753936, null));
            accessibilityNodeInfo.setText(j3.toString());
        } else {
            accessibilityNodeInfo.setText(hd.M0(2131753936, null));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), TLObject.FLAG_30));
    }

    public void setClearsInputField(boolean z9) {
        this.h = z9;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        org.telegram.ui.Components.l9 l9Var = this.a;
        if ((l9Var.getImageReceiver().e1 != 0) != z9) {
            l9Var.getImageReceiver().e1 = z9 ? 1 : 0;
            l9Var.invalidate();
        }
        super.setPressed(z9);
    }

    public void setScaled(boolean z9) {
        this.e = z9;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
