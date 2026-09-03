package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ka1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                if (((ka1) obj).b == null) {
                    return 0L;
                }
                return r3.messageOwner.date;
        }
    }
}
