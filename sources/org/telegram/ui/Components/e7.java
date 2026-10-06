package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
