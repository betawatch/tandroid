package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k51 extends k7.c6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ k51(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // k7.c6
    public final void a() {
        switch (this.a) {
            case 0:
                ((x61) this.b).t1 = false;
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
                ((x61) this.b).t1 = true;
                break;
            default:
                ((ph.d1) this.b).Y2 = true;
                break;
        }
    }
}
