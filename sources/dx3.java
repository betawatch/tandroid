// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dx3 extends yo {
    public final /* synthetic */ qx3 c;

    public dx3(qx3 qx3Var) {
        this.c = qx3Var;
    }

    @Override // yo
    public final int i(int i) {
        TLRPC.StickerSet stickerSet;
        qx3 qx3Var = this.c;
        r35 r35Var = qx3Var.x1;
        bx3 bx3Var = qx3Var.o1;
        hw hwVar = qx3Var.q1;
        if (hwVar.getAdapter() == null || hwVar.getAdapter().d(i) != 1) {
            return r35Var.J;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = bx3Var.c;
            if (i2 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i2].size();
            if (bx3Var.c.length > 1) {
                size = Math.min(r35Var.J << 1, size);
            }
            i3 += size + 2;
            if (i < i3) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = bx3Var.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i2 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) bx3Var.b.get(i2);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
