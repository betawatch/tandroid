package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ d7(g8 g8Var, int i10) {
        this.a = i10;
        this.b = g8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                g8.u(this.b, (MessageObject) obj);
                break;
            default:
                g8.x(this.b);
                break;
        }
    }
}
