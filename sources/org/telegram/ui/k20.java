package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k20 implements org.telegram.ui.Components.no0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg.a b;

    public /* synthetic */ k20(rg.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.no0
    public final void W(float f7, boolean z10) {
        switch (this.a) {
            case 0:
                rg.g gVar = this.b.c;
                if (gVar != null) {
                    gVar.v = f7 * 2.0f;
                    break;
                }
                break;
            case 1:
                rg.g gVar2 = this.b.c;
                if (gVar2 != null) {
                    gVar2.w = f7 * 2.0f;
                    break;
                }
                break;
            case 2:
                rg.g gVar3 = this.b.c;
                if (gVar3 != null) {
                    gVar3.x = f7;
                    break;
                }
                break;
            default:
                rg.g gVar4 = this.b.c;
                if (gVar4 != null) {
                    gVar4.A = f7 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.no0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.no0
    public final /* synthetic */ int k0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.no0
    public final void y() {
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
