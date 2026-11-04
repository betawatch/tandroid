package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db implements q1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ db(q0.a aVar, fb fbVar, int i3) {
        this.a = i3;
        this.c = aVar;
        this.b = fbVar;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((ra) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((zk) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
