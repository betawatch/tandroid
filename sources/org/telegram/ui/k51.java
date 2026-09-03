package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k51 extends k7.d6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ k51(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // k7.d6
    public final void a() {
        switch (this.a) {
            case 0:
                ((w61) this.b).t1 = false;
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
                ((w61) this.b).t1 = true;
                break;
            default:
                ((qh.d1) this.b).Y2 = true;
                break;
        }
    }
}
