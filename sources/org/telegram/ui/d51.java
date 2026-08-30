package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d51 extends k7.c6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ d51(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // k7.c6
    public final void a() {
        switch (this.a) {
            case 0:
                ((q61) this.b).t1 = false;
                break;
            default:
                ((ph.d1) this.b).Y2 = false;
                break;
        }
    }

    @Override // k7.c6
    public final void b() {
        switch (this.a) {
            case 0:
                ((q61) this.b).t1 = true;
                break;
            default:
                ((ph.d1) this.b).Y2 = true;
                break;
        }
    }
}
