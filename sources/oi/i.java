package oi;

import org.telegram.ui.Components.vv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
