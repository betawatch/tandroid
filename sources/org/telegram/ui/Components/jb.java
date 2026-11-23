package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;
    public final /* synthetic */ q0.a c;

    public /* synthetic */ jb(q0.a aVar, lb lbVar, int i7) {
        this.a = i7;
        this.c = aVar;
        this.b = lbVar;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((xa) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
            default:
                ((rl) this.c).accept(Float.valueOf(this.b.getTranslationY()));
                break;
        }
    }
}
