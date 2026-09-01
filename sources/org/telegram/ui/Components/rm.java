package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ int c;

    public /* synthetic */ rm(sn snVar, int i10, int i11) {
        this.a = i11;
        this.b = snVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (eh.h) obj);
                break;
            default:
                sn snVar = this.b;
                snVar.getClass();
                snVar.e0(this.c, new fh.e((String) obj));
                break;
        }
    }
}
