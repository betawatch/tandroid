package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn0 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;
    public final /* synthetic */ r1.g c;

    public /* synthetic */ fn0(on0 on0Var, r1.g gVar, int i7) {
        this.a = i7;
        this.b = on0Var;
        this.c = gVar;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    gVar.d();
                    break;
                }
                break;
            default:
                on0 on0Var = this.b;
                if (!z10) {
                    on0Var.z.remove(this.c);
                    gVar.d();
                    break;
                } else {
                    on0Var.getClass();
                    break;
                }
        }
    }
}
