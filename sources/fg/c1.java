package fg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c1 implements Comparator {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;

    public c1(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(k1 k1Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i11 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i10 >= Math.min(20, arrayList2.size())) {
                        return -1;
                    }
                    if (((TLRPC.Document) arrayList2.get(i10)).id == k1Var.a.id) {
                        return (arrayList2.size() - i10) + MediaController.VIDEO_BITRATE_480;
                    }
                    i10++;
                }
            } else {
                if (((TLRPC.Document) arrayList.get(i11)).id == k1Var.a.id) {
                    return i11 + 2000000;
                }
                i11++;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        k1 k1Var = (k1) obj;
        k1 k1Var2 = (k1) obj2;
        boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(k1Var.a, true);
        if (isAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(k1Var2.a, true)) {
            int a2 = a(k1Var);
            int a10 = a(k1Var2);
            if (a2 > a10) {
                return -1;
            }
            if (a2 >= a10) {
                return 0;
            }
        } else if (isAnimatedStickerDocument) {
            return -1;
        }
        return 1;
    }
}
