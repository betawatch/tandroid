package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ d7(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                i8.u(this.b, (MessageObject) obj);
                break;
            default:
                i8.x(this.b);
                break;
        }
    }
}
