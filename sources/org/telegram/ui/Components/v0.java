package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ v0(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            case 1:
                if (((org.telegram.ui.v91) obj).b == null) {
                    return 0L;
                }
                return r3.messageOwner.date;
            case 2:
                return ((org.telegram.ui.Wallet.s7) obj).I;
            default:
                return ((org.telegram.ui.Wallet.s7) obj).J;
        }
    }
}
