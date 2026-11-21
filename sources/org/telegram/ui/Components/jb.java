package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
