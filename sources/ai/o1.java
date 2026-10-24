package ai;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ o1(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
        }
        return ((TLRPC.TL_topPeer) obj).rating;
    }
}
