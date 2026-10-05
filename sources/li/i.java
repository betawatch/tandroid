package li;

import org.telegram.ui.Components.cx;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
