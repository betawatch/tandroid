package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class x71 implements ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ x71(int i10) {
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
                return xh.s0.P((TL_stars.starGiftAttributeBackdrop) obj);
            case 5:
                return xh.s0.P((TL_stars.starGiftAttributePattern) obj);
            default:
                return xh.s0.P((TL_stars.starGiftAttributeModel) obj);
        }
    }
}
