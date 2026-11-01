package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gf0(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                hf0 hf0Var = (hf0) this.c;
                if (!z10) {
                    jf0 jf0Var = hf0Var.d;
                    jf0Var.M.m.i = (jf0Var.H / 2.0f) + this.b >= ((float) org.telegram.messenger.i0.q.x) / 2.0f ? (r0 - r3) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
                    break;
                }
                break;
            case 1:
                vh.o8 o8Var = (vh.o8) this.c;
                if (!z10) {
                    o8Var.M0.setTranslationY(this.b);
                    o8Var.M0.K = false;
                    o8Var.o2 = null;
                    o8Var.p2 = null;
                    break;
                }
                break;
            default:
                xh.i3 i3Var = (xh.i3) this.c;
                i3Var.w = null;
                float f11 = this.b;
                if (!z10) {
                    i3Var.f = f11;
                    i3Var.c();
                    break;
                } else {
                    i3Var.h = f11;
                    break;
                }
        }
    }
}
