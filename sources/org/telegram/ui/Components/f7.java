package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ f7(k8 k8Var, int i10) {
        this.a = i10;
        this.b = k8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                k8.u(this.b, (MessageObject) obj);
                break;
            default:
                k8.x(this.b);
                break;
        }
    }
}
