package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.xf1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        z2 z2Var = (z2) this.b;
        z2Var.H = k1Var.a.f(647);
        z2Var.h.requestLayout();
        return r0.k1.b;
    }

    public void a(float f7, float f10, float f11, int i10) {
        switch (this.a) {
            case 2:
                ((x5) this.b).J.setShadowLayer(f7 * 2.0f, f11, -f10, i0.a.o(i10, Math.round(Color.alpha(i10) * 0.5f)));
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
        ((s7) this.b).d0.f0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.b).presentFragment(new xf1(6, null));
                break;
            default:
                h8.Z((h8) this.b, b2Var, i10);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }
}
