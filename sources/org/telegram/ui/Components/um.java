package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
