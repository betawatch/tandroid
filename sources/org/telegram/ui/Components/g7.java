package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ g7(l8 l8Var, int i10) {
        this.a = i10;
        this.b = l8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l8.w(this.b, (MessageObject) obj);
                break;
            default:
                l8.z(this.b);
                break;
        }
    }
}
