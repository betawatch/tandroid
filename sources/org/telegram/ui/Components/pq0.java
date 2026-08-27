package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.Cells.o7 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ pq0(org.telegram.ui.Cells.o7 o7Var, float f10, float f11) {
        this.a = o7Var;
        this.b = f10;
        this.c = f11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.n(this.b, this.c);
    }
}
