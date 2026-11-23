package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.w10 b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ f2(org.telegram.messenger.w10 w10Var, HashMap hashMap, int i7) {
        this.a = i7;
        this.b = w10Var;
        this.c = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
