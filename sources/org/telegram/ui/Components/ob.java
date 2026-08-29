package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob implements o1.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ ob(q0.a aVar, rb rbVar, int i10) {
        this.a = i10;
        this.c = aVar;
        this.b = rbVar;
    }

    @Override // o1.h
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.a) {
            case 0:
                ((cb) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((hl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
