package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ sb(q0.a aVar, ub ubVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = ubVar;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((gb) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((xl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
