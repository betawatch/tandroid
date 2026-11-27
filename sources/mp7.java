// default package

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
