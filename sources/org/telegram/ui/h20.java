package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h20 implements org.telegram.ui.Components.jp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg.g b;

    public /* synthetic */ h20(sg.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // org.telegram.ui.Components.jp0
    public final void X(float f7, boolean z10) {
        switch (this.a) {
            case 0:
                sg.o oVar = this.b.c;
                if (oVar != null) {
                    oVar.B = f7 * 2.0f;
                    break;
                }
                break;
            case 1:
                sg.o oVar2 = this.b.c;
                if (oVar2 != null) {
                    oVar2.C = f7 * 2.0f;
                    break;
                }
                break;
            case 2:
                sg.o oVar3 = this.b.c;
                if (oVar3 != null) {
                    oVar3.D = f7;
                    break;
                }
                break;
            default:
                sg.o oVar4 = this.b.c;
                if (oVar4 != null) {
                    oVar4.G = f7 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jp0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.jp0
    public final /* synthetic */ int i0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.jp0
    public final void z() {
        int i10 = this.a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
