package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.Cells.u7 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ tr0(org.telegram.ui.Cells.u7 u7Var, float f7, float f10) {
        this.a = u7Var;
        this.b = f7;
        this.c = f10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.n(this.b, this.c);
    }
}
