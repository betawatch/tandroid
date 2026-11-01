package ei;

import org.telegram.ui.Components.iw;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class j implements z4.e {
    public int a;
    public final /* synthetic */ iw b;
    public final /* synthetic */ r c;

    public j(r rVar, iw iwVar) {
        this.c = rVar;
        this.b = iwVar;
        this.a = iwVar.getScrollX();
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        int scrollX = this.b.getScrollX();
        this.c.h(scrollX - this.a, 0);
        this.a = scrollX;
    }

    @Override // z4.e
    public final void c(int i10) {
        this.c.g++;
    }

    @Override // z4.e
    public final void a(int i10) {
    }
}
