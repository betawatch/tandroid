package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.pa1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                if (((pa1) obj).b == null) {
                    return 0L;
                }
                return r3.messageOwner.date;
        }
    }
}
