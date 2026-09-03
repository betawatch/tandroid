package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g20 implements org.telegram.ui.Components.io0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg.a b;

    public /* synthetic */ g20(fg.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.io0
    public final void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.io0
    public final void Y(float f10, boolean z4) {
        switch (this.a) {
            case 0:
                fg.j jVar = this.b.c;
                if (jVar != null) {
                    jVar.v = f10 * 2.0f;
                    break;
                }
                break;
            case 1:
                fg.j jVar2 = this.b.c;
                if (jVar2 != null) {
                    jVar2.w = f10 * 2.0f;
                    break;
                }
                break;
            case 2:
                fg.j jVar3 = this.b.c;
                if (jVar3 != null) {
                    jVar3.x = f10;
                    break;
                }
                break;
            default:
                fg.j jVar4 = this.b.c;
                if (jVar4 != null) {
                    jVar4.A = f10 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.io0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.io0
    public final /* synthetic */ int j0() {
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
