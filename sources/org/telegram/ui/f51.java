package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f51 extends k7.d6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ f51(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // k7.d6
    public final void a() {
        switch (this.a) {
            case 0:
                ((r61) this.b).t1 = false;
                break;
            default:
                ((qh.d1) this.b).Y2 = false;
                break;
        }
    }

    @Override // k7.d6
    public final void b() {
        switch (this.a) {
            case 0:
                ((r61) this.b).t1 = true;
                break;
            default:
                ((qh.d1) this.b).Y2 = true;
                break;
        }
    }
}
