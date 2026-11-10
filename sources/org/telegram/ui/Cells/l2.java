package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ l2(ViewGroup viewGroup, int i7) {
        this.a = i7;
        this.b = viewGroup;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((t2) this.b).l0(true);
                break;
            default:
                ((o4) this.b).c(true);
                break;
        }
    }
}
