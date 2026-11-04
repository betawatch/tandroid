package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements org.telegram.ui.ActionBar.p1, r0.m, ec {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        n3 n3Var = (n3) this.b;
        n3Var.I = k1Var.a.f(647);
        n3Var.h.requestLayout();
        return r0.k1.b;
    }

    public void a(float f10, float f11, int i3) {
        switch (this.a) {
            case 2:
                ((f6) this.b).J.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i3, Math.round(Color.alpha(i3) * 0.5f)));
                break;
            case 3:
                ((TextPaint) this.b).setShadowLayer(f10, 0.0f, f11, i3);
                break;
            default:
                ((org.telegram.ui.Components.g6) this.b).s(f10, f11, i3);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ActionBar.d2) this.b).presentFragment(new ra1(6, null));
                break;
            default:
                n8.e0((n8) this.b, s1Var, i3);
                break;
        }
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((a8) this.b).d0.f0();
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
