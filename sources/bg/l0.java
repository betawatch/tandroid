package bg;

import android.util.SparseIntArray;
import gh.b4;
import ih.v6;
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
import qh.w5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
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
                return ((Collator) this.b).compare((String) obj, (String) obj2);
            case 1:
                float[] fArr = ((b4) this.b).r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 2:
                v6 v6Var = (v6) this.b;
                int i9 = v6Var.a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean K = v6Var.K(peerDialogId);
                boolean K2 = v6Var.K(peerDialogId2);
                boolean J = v6Var.J(peerDialogId);
                boolean J2 = v6Var.J(peerDialogId2);
                boolean F = v6Var.F(peerDialogId);
                boolean F2 = v6Var.F(peerDialogId2);
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
                TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId));
                ?? r02 = user == null ? 0 : user.premium;
                TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId2));
                ?? r12 = user2 == null ? 0 : user2.premium;
                if (r02 == r12) {
                    return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) j3.r0.j(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) j3.r0.j(1, peerStories.stories)).date);
                }
                return r12 - r02;
            case 3:
                ArrayList arrayList = (ArrayList) this.b;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                int i10 = albumEntry.bucketId;
                if (i10 != 0 || albumEntry2.bucketId == 0) {
                    if ((i10 != 0 && albumEntry2.bucketId == 0) || (indexOf = arrayList.indexOf(albumEntry)) > (indexOf2 = arrayList.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 4:
                w5 w5Var = (w5) this.b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = w5Var.b(pagetablecell);
                int b11 = w5Var.b(pagetablecell2);
                return b10 != b11 ? Integer.compare(b10, b11) : Integer.compare(w5Var.a(pagetablecell), w5Var.a(pagetablecell2));
            case 5:
                y3.v vVar = (y3.v) this.b;
                return vVar.b(obj2) - vVar.b(obj);
            default:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray.get(((zf.h) obj).e, ConnectionsManager.DEFAULT_DATACENTER_ID) - sparseIntArray.get(((zf.h) obj2).e, ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}
