package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j20 implements org.telegram.ui.Components.eo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg.a b;

    public /* synthetic */ j20(tg.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void X(float f7, boolean z10) {
        switch (this.a) {
            case 0:
                tg.f fVar = this.b.c;
                if (fVar != null) {
                    fVar.v = f7 * 2.0f;
                    break;
                }
                break;
            case 1:
                tg.f fVar2 = this.b.c;
                if (fVar2 != null) {
                    fVar2.w = f7 * 2.0f;
                    break;
                }
                break;
            case 2:
                tg.f fVar3 = this.b.c;
                if (fVar3 != null) {
                    fVar3.x = f7;
                    break;
                }
                break;
            default:
                tg.f fVar4 = this.b.c;
                if (fVar4 != null) {
                    fVar4.A = f7 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.eo0
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
