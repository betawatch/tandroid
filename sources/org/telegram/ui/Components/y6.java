package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ y6(b8 b8Var, int i10) {
        this.a = i10;
        this.b = b8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                b8.v(this.b, (MessageObject) obj);
                break;
            default:
                b8.y(this.b);
                break;
        }
    }
}
