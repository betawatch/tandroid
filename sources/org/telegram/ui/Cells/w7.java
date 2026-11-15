package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public org.telegram.ui.Components.i9 a;
    public TLRPC.Document b;
    public Object c;
    public long d;
    public boolean e;
    public float f;
    public boolean h;
    public ug.a1 n;
    public boolean r;
    public boolean s;
    public org.telegram.ui.ActionBar.e6 w;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.i9 i9Var = this.a;
        if (view == i9Var && (((z10 = this.e) && this.f != 0.8f) || (!z10 && this.f != 1.0f))) {
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
                    i9Var.setScaleX(this.f);
                    i9Var.setScaleY(this.f);
                    i9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (j10 / 400.0f) + this.f;
            this.f = f12;
            if (f12 > 1.0f) {
                this.f = 1.0f;
            }
            i9Var.setScaleX(this.f);
            i9Var.setScaleY(this.f);
            i9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.c;
    }

    public cj getSendAnimationData() {
        org.telegram.ui.Components.i9 i9Var = this.a;
        ImageReceiver imageReceiver = i9Var.getImageReceiver();
        if (!imageReceiver.L()) {
            return null;
        }
        cj cjVar = new cj();
        i9Var.getLocationInWindow(new int[2]);
        cjVar.a = imageReceiver.r() + r3[0];
        cjVar.b = imageReceiver.s() + r3[1];
        cjVar.c = imageReceiver.N0;
        return cjVar;
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
            StringBuilder m10 = r.b.m(str, " ");
            m10.append(hd.M0(2131753936, null));
            accessibilityNodeInfo.setText(m10.toString());
        } else {
            accessibilityNodeInfo.setText(hd.M0(2131753936, null));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + org.telegram.messenger.g0.L(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), TLObject.FLAG_30));
    }

    public void setClearsInputField(boolean z10) {
        this.h = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        org.telegram.ui.Components.i9 i9Var = this.a;
        if ((i9Var.getImageReceiver().f1 != 0) != z10) {
            i9Var.getImageReceiver().f1 = z10 ? 1 : 0;
            i9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
