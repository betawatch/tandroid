package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ x0(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            case 1:
                if (((org.telegram.ui.o91) obj).b == null) {
                    return 0L;
                }
                return r3.messageOwner.date;
            case 2:
                return ((org.telegram.ui.Wallet.y7) obj).I;
            default:
                return ((org.telegram.ui.Wallet.y7) obj).J;
        }
    }
}
