package oi;

import org.telegram.ui.Components.vv;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class i implements c5.g {
    public int a;
    public final /* synthetic */ vv b;
    public final /* synthetic */ q c;

    public i(q qVar, vv vvVar) {
        this.c = qVar;
        this.b = vvVar;
        this.a = vvVar.getScrollX();
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.b.getScrollX();
        this.c.h(scrollX - this.a, 0);
        this.a = scrollX;
    }

    @Override // c5.g
    public final void c(int i7) {
        this.c.g++;
    }

    @Override // c5.g
    public final void a(int i7) {
    }
}
