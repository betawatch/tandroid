package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                s9 s9Var = (s9) this.b;
                r1.g gVar2 = s9Var.D;
                if (gVar2 != null) {
                    gVar2.d();
                    s9Var.D = null;
                    break;
                }
                break;
            case 1:
                gl0 gl0Var = (gl0) this.b;
                if (gVar == gl0Var.c) {
                    gl0Var.c = null;
                    break;
                }
                break;
            default:
                ((lq0) this.b).E();
                break;
        }
    }
}
