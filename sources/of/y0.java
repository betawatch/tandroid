package of;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y0 implements Comparator {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;

    public y0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(e1 e1Var) {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i9 >= Math.min(20, arrayList2.size())) {
                        return -1;
                    }
                    if (((TLRPC.Document) arrayList2.get(i9)).id == e1Var.a.id) {
                        return (arrayList2.size() - i9) + MediaController.VIDEO_BITRATE_480;
                    }
                    i9++;
                }
            } else {
                if (((TLRPC.Document) arrayList.get(i10)).id == e1Var.a.id) {
                    return i10 + 2000000;
                }
                i10++;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e1 e1Var = (e1) obj;
        e1 e1Var2 = (e1) obj2;
        boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(e1Var.a, true);
        if (isAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(e1Var2.a, true)) {
            int a2 = a(e1Var);
            int a3 = a(e1Var2);
            if (a2 > a3) {
                return -1;
            }
            if (a2 >= a3) {
                return 0;
            }
        } else if (isAnimatedStickerDocument) {
            return -1;
        }
        return 1;
    }
}
