package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class om implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn b;
    public final /* synthetic */ int c;

    public /* synthetic */ om(pn pnVar, int i10, int i11) {
        this.a = i11;
        this.b = pnVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (dh.h) obj);
                break;
            default:
                pn pnVar = this.b;
                pnVar.getClass();
                pnVar.e0(this.c, new eh.e((String) obj));
                break;
        }
    }
}
