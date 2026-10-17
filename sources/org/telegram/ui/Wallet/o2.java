package org.telegram.ui.Wallet;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.xf1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        x2 x2Var = (x2) this.b;
        x2Var.F = k1Var.a.f(647);
        x2Var.f.requestLayout();
        return r0.k1.b;
    }

    public void a(float f7, float f10, float f11, int i10) {
        switch (this.a) {
            case 2:
                ((v5) this.b).M.setShadowLayer(f7, f11, -f10, i10);
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
        ((v7) this.b).d0.h0();
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
                k8.Z((k8) this.b, b2Var, i10);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }
}
