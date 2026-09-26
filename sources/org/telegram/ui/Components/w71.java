package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w71 implements ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ w71(int i10) {
        this.a = i10;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
            case 0:
                return ((z71) obj).a;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 4:
                return yh.s0.P((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return yh.s0.P((TL_stars.starGiftAttributePattern) obj);
            default:
                return yh.s0.P((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
