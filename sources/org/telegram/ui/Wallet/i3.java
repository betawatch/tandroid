package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements org.telegram.ui.ActionBar.q1, r0.m, jc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.a) {
            case 2:
                ((y6) this.b).J.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                break;
            case 3:
                ((TextPaint) this.b).setShadowLayer(f10, 0.0f, f11, i7);
                break;
            default:
                ((org.telegram.ui.Components.m6) this.b).s(f10, f11, i7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ActionBar.g2) this.b).presentFragment(new za1(6, null));
                break;
            default:
                e9.e0((e9) this.b);
                break;
        }
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        x3 x3Var = (x3) this.b;
        x3Var.I = l1Var.a.f(647);
        x3Var.h.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.jc
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((r8) this.b).d0.f0();
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void r(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void J(int i7, Drawable drawable) {
    }
}
