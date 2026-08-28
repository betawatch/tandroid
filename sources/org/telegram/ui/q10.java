package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q10 implements org.telegram.ui.Components.on0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag.a b;

    public /* synthetic */ q10(ag.a aVar, int i9) {
        this.a = i9;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.on0
    public final void Q(float f10, boolean z10) {
        switch (this.a) {
            case 0:
                ag.k kVar = this.b.c;
                if (kVar != null) {
                    kVar.v = f10 * 2.0f;
                    break;
                }
                break;
            case 1:
                ag.k kVar2 = this.b.c;
                if (kVar2 != null) {
                    kVar2.w = f10 * 2.0f;
                    break;
                }
                break;
            case 2:
                ag.k kVar3 = this.b.c;
                if (kVar3 != null) {
                    kVar3.x = f10;
                    break;
                }
                break;
            default:
                ag.k kVar4 = this.b.c;
                if (kVar4 != null) {
                    kVar4.A = f10 * 2.0f;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.on0
    public final /* synthetic */ int c0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.on0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.on0
    public final void n() {
        int i9 = this.a;
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
