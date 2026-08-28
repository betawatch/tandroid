package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b8 extends FrameLayout {
    public org.telegram.ui.Components.o9 a;
    public TLRPC.Document b;
    public Object c;
    public long d;
    public boolean e;
    public float f;
    public boolean h;
    public zf.b1 n;
    public boolean r;
    public boolean s;
    public org.telegram.ui.ActionBar.b6 v;

    static {
        new AccelerateInterpolator(0.5f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.o9 o9Var = this.a;
        if (view == o9Var && (((z10 = this.e) && this.f != 0.8f) || (!z10 && this.f != 1.0f))) {
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
                    o9Var.setScaleX(this.f);
                    o9Var.setScaleY(this.f);
                    o9Var.invalidate();
                    invalidate();
                }
            }
            float f12 = (j11 / 400.0f) + this.f;
            this.f = f12;
            if (f12 > 1.0f) {
                this.f = 1.0f;
            }
            o9Var.setScaleX(this.f);
            o9Var.setScaleY(this.f);
            o9Var.invalidate();
            invalidate();
        }
        return drawChild;
    }

    public Object getParentObject() {
        return this.c;
    }

    public MessageObject.SendAnimationData getSendAnimationData() {
        org.telegram.ui.Components.o9 o9Var = this.a;
        ImageReceiver imageReceiver = o9Var.getImageReceiver();
        if (!imageReceiver.hasNotThumb()) {
            return null;
        }
        MessageObject.SendAnimationData sendAnimationData = new MessageObject.SendAnimationData();
        o9Var.getLocationInWindow(new int[2]);
        sendAnimationData.x = imageReceiver.getCenterX() + r3[0];
        sendAnimationData.y = imageReceiver.getCenterY() + r3[1];
        sendAnimationData.width = imageReceiver.getImageWidth();
        sendAnimationData.height = imageReceiver.getImageHeight();
        return sendAnimationData;
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
        for (int i9 = 0; i9 < this.b.attributes.size(); i9++) {
            TLRPC.DocumentAttribute documentAttribute = this.b.attributes.get(i9);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                str = (str2 == null || str2.length() <= 0) ? null : documentAttribute.alt;
            }
        }
        if (str != null) {
            StringBuilder e10 = ta.b.e(str, " ");
            e10.append(LocaleController.getString(R.string.AttachSticker));
            accessibilityNodeInfo.setText(e10.toString());
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachSticker));
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + AndroidUtilities.dp(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f), TLObject.FLAG_30));
    }

    public void setClearsInputField(boolean z10) {
        this.h = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        org.telegram.ui.Components.o9 o9Var = this.a;
        if (o9Var.getImageReceiver().getPressed() != z10) {
            o9Var.getImageReceiver().setPressed(z10 ? 1 : 0);
            o9Var.invalidate();
        }
        super.setPressed(z10);
    }

    public void setScaled(boolean z10) {
        this.e = z10;
        this.d = System.currentTimeMillis();
        invalidate();
    }
}
