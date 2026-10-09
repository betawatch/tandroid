package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class in implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo b;
    public final /* synthetic */ int c;

    public /* synthetic */ in(lo loVar, int i10, int i11) {
        this.a = i11;
        this.b = loVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.h0(this.c, (qh.e) obj);
                break;
            default:
                lo loVar = this.b;
                loVar.getClass();
                loVar.h0(this.c, new rh.e((String) obj));
                break;
        }
    }
}
