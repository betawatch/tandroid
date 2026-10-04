package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class h81 implements ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ h81(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
            case 0:
                return ((j81) obj).a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return yh.s0.N((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return yh.s0.N((TL_stars.starGiftAttributePattern) obj);
            default:
                return yh.s0.N((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
