package org.telegram.ui;

import j$.util.function.Function$-CC;
import java.util.function.Function;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ k8(int i9) {
        this.a = i9;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i9 = this.a;
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
        return ((lt) obj).a;
    }

    public /* synthetic */ Function compose(Function function) {
        int i9 = this.a;
        return Function$-CC.$default$compose(this, function);
    }
}
