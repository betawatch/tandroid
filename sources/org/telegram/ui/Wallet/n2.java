package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.fg1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements org.telegram.ui.ActionBar.b2, r0.n, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        y2 y2Var = (y2) this.b;
        y2Var.H = k1Var.a.f(647);
        y2Var.h.requestLayout();
        return r0.k1.b;
    }

    public void a(float f7, float f10, int i10) {
        switch (this.a) {
            case 2:
                ((w5) this.b).I.setShadowLayer(f7 * 2.0f, f10, -0.0f, i0.a.o(i10, Math.round(Color.alpha(i10) * 0.5f)));
                break;
            case 3:
                ((TextPaint) this.b).setShadowLayer(f7, 0.0f, f10, i10);
                break;
            default:
                ((org.telegram.ui.Components.r6) this.b).s(f7, f10, i10);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((s7) this.b).d0.f0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ActionBar.r2) this.b).presentFragment(new fg1(6, null));
                break;
            default:
                h8.a0((h8) this.b, e2Var, i10);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }
}
