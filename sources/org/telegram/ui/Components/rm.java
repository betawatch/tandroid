package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ int c;

    public /* synthetic */ rm(tn tnVar, int i10, int i11) {
        this.a = i11;
        this.b = tnVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (rh.e) obj);
                break;
            default:
                tn tnVar = this.b;
                tnVar.getClass();
                tnVar.e0(this.c, new sh.e((String) obj));
                break;
        }
    }
}
