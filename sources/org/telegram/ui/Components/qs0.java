package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qs0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.Cells.w7 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ qs0(org.telegram.ui.Cells.w7 w7Var, float f7, float f10) {
        this.a = w7Var;
        this.b = f7;
        this.c = f10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.n(this.b, this.c);
    }
}
