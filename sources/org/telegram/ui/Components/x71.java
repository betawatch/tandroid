package org.telegram.ui.Components;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                return ((a81) obj).a;
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
