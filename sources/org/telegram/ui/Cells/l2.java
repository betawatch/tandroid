package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ l2(ViewGroup viewGroup, int i7) {
        this.a = i7;
        this.b = viewGroup;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((t2) this.b).m0(true);
                break;
            default:
                ((o4) this.b).c(true);
                break;
        }
    }
}
