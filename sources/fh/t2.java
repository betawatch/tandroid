package fh;

import gh.l7;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vq0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vq0 b;

    public /* synthetic */ t2(vq0 vq0Var, int i9) {
        this.a = i9;
        this.b = vq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                this.b.setReorderingCollections(true);
                break;
            default:
                l7 l7Var = this.b.e;
                l7Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i9 = l7Var.a;
                reorderstargiftcollections.peer = MessagesController.getInstance(i9).getInputPeer(l7Var.b);
                ArrayList arrayList = l7Var.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i9).sendRequest(reorderstargiftcollections, null);
                l7Var.j();
                break;
        }
    }
}
