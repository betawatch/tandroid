package org.telegram.ui.Components;

import java.util.function.ToLongFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ya1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ y0(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((MessageObject) obj).getFromChatId();
            default:
                if (((ya1) obj).b == null) {
                    return 0L;
                }
                return r3.messageOwner.date;
        }
    }
}
