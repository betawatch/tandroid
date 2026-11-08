package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lc;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements org.telegram.ui.ActionBar.r1, r0.m, lc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        o3 o3Var = (o3) this.b;
        o3Var.H = k1Var.a.f(647);
        o3Var.h.requestLayout();
        return r0.k1.b;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.a) {
            case 2:
                ((g6) this.b).I.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
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
        ((a8) this.b).d0.f0();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ActionBar.f2) this.b).presentFragment(new za1(6, null));
                break;
            default:
                n8.e0((n8) this.b, u1Var, i7);
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
