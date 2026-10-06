package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class hs0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hs0(ns0 ns0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = ns0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.b.b.e0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.yc.F(this.b.b.e0, this.c).j();
                break;
        }
    }
}
