package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.Cells.t7 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ fr0(org.telegram.ui.Cells.t7 t7Var, float f7, float f10) {
        this.a = t7Var;
        this.b = f7;
        this.c = f10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.n(this.b, this.c);
    }
}
