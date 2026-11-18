package org.telegram.ui.Components;

import java.util.HashMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.x10 b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ f2(org.telegram.messenger.x10 x10Var, HashMap hashMap, int i7) {
        this.a = i7;
        this.b = x10Var;
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
