package bi;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        switch (this.a) {
            case 0:
                float[] fArr = ((s5) this.b).r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 1:
                di.h7 h7Var = (di.h7) this.b;
                int i10 = h7Var.a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean M = h7Var.M(peerDialogId);
                boolean M2 = h7Var.M(peerDialogId2);
                boolean L = h7Var.L(peerDialogId);
                boolean L2 = h7Var.L(peerDialogId2);
                boolean H = h7Var.H(peerDialogId);
                boolean H2 = h7Var.H(peerDialogId2);
                if (H != H2) {
                    return (H2 ? 1 : 0) - (H ? 1 : 0);
                }
                if (M != M2) {
                    return (M2 ? 1 : 0) - (M ? 1 : 0);
                }
                if (L != L2) {
                    return (L2 ? 1 : 0) - (L ? 1 : 0);
                }
                boolean isService = UserObject.isService(peerDialogId);
                boolean isService2 = UserObject.isService(peerDialogId2);
                if (isService != isService2) {
                    return (isService2 ? 1 : 0) - (isService ? 1 : 0);
                }
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                ?? r02 = user == null ? 0 : user.premium;
                TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId2));
                ?? r12 = user2 == null ? 0 : user2.premium;
                if (r02 == r12) {
                    return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) ic.a.g(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) ic.a.g(1, peerStories.stories)).date);
                }
                return r12 - r02;
            case 2:
                ArrayList arrayList = (ArrayList) this.b;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                int i11 = albumEntry.bucketId;
                if (i11 != 0 || albumEntry2.bucketId == 0) {
                    if ((i11 != 0 && albumEntry2.bucketId == 0) || (indexOf = arrayList.indexOf(albumEntry)) > (indexOf2 = arrayList.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 3:
                li.h6 h6Var = (li.h6) this.b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = h6Var.b(pagetablecell);
                int b11 = h6Var.b(pagetablecell2);
                return b10 != b11 ? Integer.compare(b10, b11) : Integer.compare(h6Var.a(pagetablecell), h6Var.a(pagetablecell2));
            case 4:
                r2.v vVar = (r2.v) this.b;
                return vVar.c(obj2) - vVar.c(obj);
            case 5:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray.get(((tg.h) obj).e, ConnectionsManager.DEFAULT_DATACENTER_ID) - sparseIntArray.get(((tg.h) obj2).e, ConnectionsManager.DEFAULT_DATACENTER_ID);
            default:
                return ((Collator) this.b).compare((String) obj, (String) obj2);
        }
    }
}
