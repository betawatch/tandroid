package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;

    public /* synthetic */ g7(m7 m7Var, int i7) {
        this.a = i7;
        this.b = m7Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                m7 m7Var = this.b;
                m7Var.c.setScaleX(f10);
                m7Var.c.setScaleY(f10);
                break;
            default:
                this.b.Q = f11;
                break;
        }
    }
}
