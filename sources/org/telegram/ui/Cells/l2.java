package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ l2(ViewGroup viewGroup, int i3) {
        this.a = i3;
        this.b = viewGroup;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((t2) this.b).k0(true);
                break;
            default:
                ((o4) this.b).c(true);
                break;
        }
    }
}
