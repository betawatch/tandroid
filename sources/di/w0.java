package di;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ w0(int i7) {
        this.a = i7;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
        }
        return ((TLRPC.TL_topPeer) obj).rating;
    }
}
