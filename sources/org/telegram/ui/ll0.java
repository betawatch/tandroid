package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ km0 b;

    public /* synthetic */ ll0(km0 km0Var, int i7) {
        this.a = i7;
        this.b = km0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                fi.g1 g1Var = this.b.I;
                if (g1Var != null) {
                    g1Var.E(num.intValue());
                    break;
                }
                break;
            default:
                km0 km0Var = this.b;
                km0Var.r = false;
                km0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    km0Var.C0();
                    km0Var.finishFragment();
                    km0Var.I0();
                    break;
                }
                break;
        }
    }
}
