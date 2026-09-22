package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.wa1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                if (((wa1) obj).b == null) {
                    return 0L;
                }
                return r3.messageOwner.date;
        }
    }
}
