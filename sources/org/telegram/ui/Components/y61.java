package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y61 implements ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ y61(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
            case 0:
                return ((a71) obj).a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return rh.t0.e1((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return rh.t0.e1((TL_stars.starGiftAttributePattern) obj);
            default:
                return rh.t0.e1((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
