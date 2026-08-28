package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ y6(c8 c8Var, int i9) {
        this.a = i9;
        this.b = c8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                c8.u(this.b, (MessageObject) obj);
                break;
            default:
                c8.x(this.b);
                break;
        }
    }
}
