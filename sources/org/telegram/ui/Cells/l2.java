package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
