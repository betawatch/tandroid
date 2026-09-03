package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f20 implements org.telegram.ui.Components.jo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg.a b;

    public /* synthetic */ f20(gg.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void A() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void X(float f10, boolean z4) {
        switch (this.a) {
            case 0:
                gg.j jVar = this.b.c;
                if (jVar != null) {
                    jVar.v = f10 * 2.0f;
                    break;
                }
                break;
            case 1:
                gg.j jVar2 = this.b.c;
                if (jVar2 != null) {
                    jVar2.w = f10 * 2.0f;
                    break;
                }
                break;
            case 2:
                gg.j jVar3 = this.b.c;
                if (jVar3 != null) {
                    jVar3.x = f10;
                    break;
                }
                break;
            default:
                gg.j jVar4 = this.b.c;
                if (jVar4 != null) {
                    jVar4.A = f10 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ int m0() {
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
