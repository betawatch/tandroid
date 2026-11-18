package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.ui.bb1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements org.telegram.ui.ActionBar.r1, r0.m, jc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        w3 w3Var = (w3) this.b;
        w3Var.I = l1Var.a.f(647);
        w3Var.h.requestLayout();
        return r0.l1.b;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.a) {
            case 2:
                ((x6) this.b).J.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                break;
            case 3:
                ((TextPaint) this.b).setShadowLayer(f10, 0.0f, f11, i7);
                break;
            default:
                ((org.telegram.ui.Components.m6) this.b).s(f10, f11, i7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ActionBar.h2) this.b).presentFragment(new bb1(6, null));
                break;
            default:
                d9.e0((d9) this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((q8) this.b).d0.f0();
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
