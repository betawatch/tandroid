package oi;

import org.telegram.ui.Components.wv;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class i implements c5.g {
    public int a;
    public final /* synthetic */ wv b;
    public final /* synthetic */ q c;

    public i(q qVar, wv wvVar) {
        this.c = qVar;
        this.b = wvVar;
        this.a = wvVar.getScrollX();
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
