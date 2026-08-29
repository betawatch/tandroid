package a4;

import android.util.SparseIntArray;
import j7.l1;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import jh.z3;
import lh.s6;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import th.x5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b;
                return a0Var.b(obj2) - a0Var.b(obj);
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray.get(((cg.k) obj).e, ConnectionsManager.DEFAULT_DATACENTER_ID) - sparseIntArray.get(((cg.k) obj2).e, ConnectionsManager.DEFAULT_DATACENTER_ID);
            case 2:
                return ((Collator) this.b).compare((String) obj, (String) obj2);
            case 3:
                float[] fArr = ((z3) this.b).r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 4:
                s6 s6Var = (s6) this.b;
                int i10 = s6Var.a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean K = s6Var.K(peerDialogId);
                boolean K2 = s6Var.K(peerDialogId2);
                boolean J = s6Var.J(peerDialogId);
                boolean J2 = s6Var.J(peerDialogId2);
                boolean F = s6Var.F(peerDialogId);
                boolean F2 = s6Var.F(peerDialogId2);
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
                    return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) l1.i(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) l1.i(1, peerStories.stories)).date);
                }
                return r12 - r02;
            case 5:
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
            default:
                x5 x5Var = (x5) this.b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = x5Var.b(pagetablecell);
                int b11 = x5Var.b(pagetablecell2);
                return b10 != b11 ? Integer.compare(b10, b11) : Integer.compare(x5Var.a(pagetablecell), x5Var.a(pagetablecell2));
        }
    }
}
