// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ft8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cga b;

    public /* synthetic */ ft8(cga cgaVar, byte b) {
        this.a = b;
        this.b = cgaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cga cgaVar = this.b;
        switch (b) {
            case 0:
                zwa zwaVar = cgaVar.e;
                zwaVar.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i = zwaVar.a;
                reorderstargiftcollections.peer = uc7.s1(i).j1(zwaVar.b);
                ArrayList arrayList = zwaVar.e;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i).sendRequest(reorderstargiftcollections, null);
                zwaVar.j();
                break;
            case 1:
                cgaVar.setReorderingCollections(true);
                break;
            case 2:
                cgaVar.a();
                break;
            default:
                cgaVar.p();
                break;
        }
    }
}
