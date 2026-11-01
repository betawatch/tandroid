package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z61 implements ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ z61(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
            case 0:
                return ((b71) obj).a;
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
