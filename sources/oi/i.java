package oi;

import org.telegram.ui.Components.fx;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i implements a5.i {
    public int a;
    public final /* synthetic */ fx b;
    public final /* synthetic */ q c;

    public i(q qVar, fx fxVar) {
        this.c = qVar;
        this.b = fxVar;
        this.a = fxVar.getScrollX();
    }

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
        int scrollX = this.b.getScrollX();
        this.c.h(scrollX - this.a, 0);
        this.a = scrollX;
    }

    @Override // a5.i
    public final void c(int i10) {
        this.c.e++;
    }

    @Override // a5.i
    public final void a(int i10) {
    }
}
