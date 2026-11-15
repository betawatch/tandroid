package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kc;
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements org.telegram.ui.ActionBar.q1, r0.m, kc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((b8) this.b).d0.f0();
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        o3 o3Var = (o3) this.b;
        o3Var.I = k1Var.a.f(647);
        o3Var.h.requestLayout();
        return r0.k1.b;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.a) {
            case 2:
                ((h6) this.b).J.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                break;
            case 3:
                ((TextPaint) this.b).setShadowLayer(f10, 0.0f, f11, i7);
                break;
            default:
                ((org.telegram.ui.Components.g6) this.b).s(f10, f11, i7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.ActionBar.e2) this.b).presentFragment(new xa1(6, null));
                break;
            default:
                p8.e0((p8) this.b, t1Var, i7);
                break;
        }
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }
}
