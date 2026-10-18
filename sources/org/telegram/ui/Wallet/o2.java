package org.telegram.ui.Wallet;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.xf1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements org.telegram.ui.ActionBar.a2, r0.n, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        y2 y2Var = (y2) this.b;
        y2Var.H = k1Var.a.f(647);
        y2Var.h.requestLayout();
        return r0.k1.b;
    }

    public void a(float f7, float f10, float f11, int i10) {
        switch (this.a) {
            case 2:
                ((x5) this.b).M.setShadowLayer(f7, f11, -f10, i10);
                break;
            case 3:
                ((TextPaint) this.b).setShadowLayer(f7, f10, f11, i10);
                break;
            default:
                ((org.telegram.ui.Components.p6) this.b).s(f7, f10, f11, i10);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((y7) this.b).d0.h0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.b).presentFragment(new xf1(6, null));
                break;
            default:
                n8.Z((n8) this.b, b2Var, i10);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }
}
