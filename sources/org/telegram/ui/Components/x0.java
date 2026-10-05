package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.qa1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
            default:
                if (((qa1) obj).b == null) {
                    return 0L;
                }
                return r3.messageOwner.date;
        }
    }
}
