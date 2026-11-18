package org.telegram.ui.Cells;

import android.view.ViewGroup;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ l2(ViewGroup viewGroup, int i7) {
        this.a = i7;
        this.b = viewGroup;
    }

    @Override // org.telegram.messenger.x10
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
