package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.c20 b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ y1(org.telegram.messenger.c20 c20Var, HashMap hashMap, int i7) {
        this.a = i7;
        this.b = c20Var;
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
