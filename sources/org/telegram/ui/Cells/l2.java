package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ l2(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((v2) this.b).k0(true);
                break;
            default:
                ((q4) this.b).c(true);
                break;
        }
    }
}
