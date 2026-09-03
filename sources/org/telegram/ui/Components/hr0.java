package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.Cells.q7 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ hr0(org.telegram.ui.Cells.q7 q7Var, float f10, float f11) {
        this.a = q7Var;
        this.b = f10;
        this.c = f11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.n(this.b, this.c);
    }
}
