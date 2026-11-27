// default package

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mp7 implements ToDoubleFunction {
    public final /* synthetic */ byte a;

    public /* synthetic */ mp7(byte b) {
        this.a = b;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
            case 0:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return gra.a1((TL_stars.starGiftAttributeBackdrop) obj);
            case 4:
                return gra.a1((TL_stars.starGiftAttributePattern) obj);
            case 5:
                return gra.a1((TL_stars.starGiftAttributeModel) obj);
            default:
                return ((bgc) obj).a;
        }
    }
}
