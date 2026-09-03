package mh;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ y0(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
        }
        return ((TLRPC.TL_topPeer) obj).rating;
    }
}
