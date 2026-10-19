package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.Cells.s7 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ cs0(org.telegram.ui.Cells.s7 s7Var, float f7, float f10) {
        this.a = s7Var;
        this.b = f7;
        this.c = f10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.n(this.b, this.c);
    }
}
