// default package

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mm7 implements ToDoubleFunction {
    public final /* synthetic */ byte a;

    public /* synthetic */ mm7(byte b) {
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
                return kna.Z0((TL_stars.starGiftAttributeBackdrop) obj);
            case 4:
                return kna.Z0((TL_stars.starGiftAttributePattern) obj);
            case 5:
                return kna.Z0((TL_stars.starGiftAttributeModel) obj);
            default:
                return ((dcc) obj).a;
        }
    }
}
