package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ io b;
    public final /* synthetic */ int c;

    public /* synthetic */ fn(io ioVar, int i10, int i11) {
        this.a = i11;
        this.b = ioVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.h0(this.c, (rh.e) obj);
                break;
            default:
                io ioVar = this.b;
                ioVar.getClass();
                ioVar.h0(this.c, new sh.e((String) obj));
                break;
        }
    }
}
