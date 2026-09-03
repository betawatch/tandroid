package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ z6(c8 c8Var, int i10) {
        this.a = i10;
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
