package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ e7(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j8.u(this.b, (MessageObject) obj);
                break;
            default:
                j8.x(this.b);
                break;
        }
    }
}
