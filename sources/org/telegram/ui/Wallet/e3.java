package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lc;
import org.telegram.ui.ya1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements org.telegram.ui.ActionBar.r1, r0.m, lc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        p3 p3Var = (p3) this.b;
        p3Var.H = k1Var.a.f(647);
        p3Var.h.requestLayout();
        return r0.k1.b;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.a) {
            case 2:
                ((h6) this.b).I.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                break;
            case 3:
                ((TextPaint) this.b).setShadowLayer(f10, 0.0f, f11, i7);
                break;
            default:
                ((org.telegram.ui.Components.i6) this.b).s(f10, f11, i7);
                break;
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ((b8) this.b).d0.f0();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ActionBar.f2) this.b).presentFragment(new ya1(6, null));
                break;
            default:
                o8.e0((o8) this.b, u1Var, i7);
                break;
        }
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }
}
