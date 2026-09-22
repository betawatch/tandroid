package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ int c;

    public /* synthetic */ rm(un unVar, int i10, int i11) {
        this.a = i11;
        this.b = unVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (qh.e) obj);
                break;
            default:
                un unVar = this.b;
                unVar.getClass();
                unVar.e0(this.c, new rh.e((String) obj));
                break;
        }
    }
}
