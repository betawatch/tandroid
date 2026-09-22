package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
