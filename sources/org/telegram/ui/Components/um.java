package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
