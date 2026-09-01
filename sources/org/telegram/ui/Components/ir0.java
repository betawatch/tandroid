package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.Cells.r7 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ ir0(org.telegram.ui.Cells.r7 r7Var, float f10, float f11) {
        this.a = r7Var;
        this.b = f10;
        this.c = f11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.n(this.b, this.c);
    }
}
