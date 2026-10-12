package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class n20 implements org.telegram.ui.Components.fp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg.g b;

    public /* synthetic */ n20(tg.g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // org.telegram.ui.Components.fp0
    public final void X(float f7, boolean z10) {
        switch (this.a) {
            case 0:
                tg.o oVar = this.b.c;
                if (oVar != null) {
                    oVar.B = f7 * 2.0f;
                    break;
                }
                break;
            case 1:
                tg.o oVar2 = this.b.c;
                if (oVar2 != null) {
                    oVar2.C = f7 * 2.0f;
                    break;
                }
                break;
            case 2:
                tg.o oVar3 = this.b.c;
                if (oVar3 != null) {
                    oVar3.D = f7;
                    break;
                }
                break;
            default:
                tg.o oVar4 = this.b.c;
                if (oVar4 != null) {
                    oVar4.G = f7 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fp0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.fp0
    public final /* synthetic */ int k0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.fp0
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
