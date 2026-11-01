package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.nc;
import org.telegram.ui.rc1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements org.telegram.ui.ActionBar.u1, r0.m, nc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        p3 p3Var = (p3) this.b;
        p3Var.H = j1Var.a.f(647);
        p3Var.h.requestLayout();
        return r0.j1.b;
    }

    public void a(float f7, float f10, int i10) {
        switch (this.a) {
            case 2:
                ((l6) this.b).I.setShadowLayer(f7 * 2.0f, f10, -0.0f, i0.b.o(i10, Math.round(Color.alpha(i10) * 0.5f)));
                break;
            case 3:
                ((TextPaint) this.b).setShadowLayer(f7, 0.0f, f10, i10);
                break;
            default:
                ((org.telegram.ui.Components.e6) this.b).s(f7, f10, i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ActionBar.k2) this.b).presentFragment(new rc1(6, null));
                break;
            default:
                t8.e0((t8) this.b, x1Var, i10);
                break;
        }
    }

    @Override // org.telegram.messenger.nc
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((g8) this.b).d0.f0();
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void s(int i10, Drawable drawable) {
    }
}
