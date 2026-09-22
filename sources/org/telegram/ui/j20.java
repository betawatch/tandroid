package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class j20 implements org.telegram.ui.Components.to0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg.a b;

    public /* synthetic */ j20(sg.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.to0
    public final void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.to0
    public final void X(float f7, boolean z10) {
        switch (this.a) {
            case 0:
                sg.f fVar = this.b.c;
                if (fVar != null) {
                    fVar.v = f7 * 2.0f;
                    break;
                }
                break;
            case 1:
                sg.f fVar2 = this.b.c;
                if (fVar2 != null) {
                    fVar2.w = f7 * 2.0f;
                    break;
                }
                break;
            case 2:
                sg.f fVar3 = this.b.c;
                if (fVar3 != null) {
                    fVar3.x = f7;
                    break;
                }
                break;
            default:
                sg.f fVar4 = this.b.c;
                if (fVar4 != null) {
                    fVar4.A = f7 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.to0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.to0
    public final /* synthetic */ int l0() {
        switch (this.a) {
        }
        return 0;
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
