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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class l7 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
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
                u8 u8Var = (u8) this.b;
                int i10 = u8Var.a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean K = u8Var.K(peerDialogId);
                boolean K2 = u8Var.K(peerDialogId2);
                boolean J = u8Var.J(peerDialogId);
                boolean J2 = u8Var.J(peerDialogId2);
                boolean F = u8Var.F(peerDialogId);
                boolean F2 = u8Var.F(peerDialogId2);
                if (F != F2) {
                    return (F2 ? 1 : 0) - (F ? 1 : 0);
                }
                if (K != K2) {
                    return (K2 ? 1 : 0) - (K ? 1 : 0);
                }
                if (J != J2) {
                    return (J2 ? 1 : 0) - (J ? 1 : 0);
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
                    return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) i2.g.h(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) i2.g.h(1, peerStories.stories)).date);
                }
                return r12 - r02;
            case 1:
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
            case 2:
                ji.k6 k6Var = (ji.k6) this.b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = k6Var.b(pagetablecell);
                int b11 = k6Var.b(pagetablecell2);
                return b10 != b11 ? Integer.compare(b10, b11) : Integer.compare(k6Var.a(pagetablecell), k6Var.a(pagetablecell2));
            case 3:
                r2.v vVar = (r2.v) this.b;
                return vVar.b(obj2) - vVar.b(obj);
            case 4:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray.get(((sg.h) obj).e, ConnectionsManager.DEFAULT_DATACENTER_ID) - sparseIntArray.get(((sg.h) obj2).e, ConnectionsManager.DEFAULT_DATACENTER_ID);
            case 5:
                return ((Collator) this.b).compare((String) obj, (String) obj2);
            default:
                float[] fArr = ((zh.q2) this.b).r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
        }
    }
}
