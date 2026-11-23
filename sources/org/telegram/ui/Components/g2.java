package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.y10 b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ g2(org.telegram.messenger.y10 y10Var, HashMap hashMap, int i7) {
        this.a = i7;
        this.b = y10Var;
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
