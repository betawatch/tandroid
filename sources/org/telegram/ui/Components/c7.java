package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ c7(h8 h8Var, int i10) {
        this.a = i10;
        this.b = h8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                h8.u(this.b, (MessageObject) obj);
                break;
            default:
                h8.x(this.b);
                break;
        }
    }
}
