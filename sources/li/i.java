package li;

import org.telegram.ui.Components.cx;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class i implements z4.e {
    public int a;
    public final /* synthetic */ cx b;
    public final /* synthetic */ p c;

    public i(p pVar, cx cxVar) {
        this.c = pVar;
        this.b = cxVar;
        this.a = cxVar.getScrollX();
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        int scrollX = this.b.getScrollX();
        this.c.h(scrollX - this.a, 0);
        this.a = scrollX;
    }

    @Override // z4.e
    public final void c(int i10) {
        this.c.e++;
    }

    @Override // z4.e
    public final void a(int i10) {
    }
}
