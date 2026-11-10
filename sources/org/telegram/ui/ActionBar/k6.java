package org.telegram.ui.ActionBar;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ k6(l6 l6Var, int i7) {
        this.a = i7;
        this.b = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        l6 l6Var = this.b;
        switch (i7) {
            case 0:
                l6Var.s();
                break;
            default:
                qs.e().k(qs.t4, l6Var, Boolean.TRUE, null, -1);
                break;
        }
    }
}
