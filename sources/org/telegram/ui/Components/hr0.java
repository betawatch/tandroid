package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.Cells.r7 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ hr0(org.telegram.ui.Cells.r7 r7Var, float f10, float f11) {
        this.a = r7Var;
        this.b = f10;
        this.c = f11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.n(this.b, this.c);
    }
}
