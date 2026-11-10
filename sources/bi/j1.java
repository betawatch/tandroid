package bi;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ j1(int i7) {
        this.a = i7;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
        }
        return ((TLRPC.TL_topPeer) obj).rating;
    }
}
