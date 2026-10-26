package oi;

import org.telegram.ui.Components.fx;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
