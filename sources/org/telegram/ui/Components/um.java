package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ int c;

    public /* synthetic */ um(xn xnVar, int i10, int i11) {
        this.a = i11;
        this.b = xnVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (qh.e) obj);
                break;
            default:
                xn xnVar = this.b;
                xnVar.getClass();
                xnVar.e0(this.c, new rh.e((String) obj));
                break;
        }
    }
}
