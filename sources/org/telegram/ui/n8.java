package org.telegram.ui;

import j$.util.function.Function$-CC;
import java.util.function.Function;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ n8(int i10) {
        this.a = i10;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i10 = this.a;
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 3:
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj;
                if (channelParticipant != null) {
                    break;
                }
                break;
        }
        return ((tt) obj).a;
    }

    public /* synthetic */ Function compose(Function function) {
        int i10 = this.a;
        return Function$-CC.$default$compose(this, function);
    }
}
