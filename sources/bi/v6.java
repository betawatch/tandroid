package bi;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.messenger.we;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class v6 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        switch (this.a) {
            case 0:
                w6 w6Var = (w6) this.b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = w6Var.b(pagetablecell);
                int b11 = w6Var.b(pagetablecell2);
                return b10 != b11 ? Integer.compare(b10, b11) : Integer.compare(w6Var.a(pagetablecell), w6Var.a(pagetablecell2));
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray.get(((kg.j) obj).e, ConnectionsManager.DEFAULT_DATACENTER_ID) - sparseIntArray.get(((kg.j) obj2).e, ConnectionsManager.DEFAULT_DATACENTER_ID);
            case 2:
                return ((Collator) this.b).compare((String) obj, (String) obj2);
            case 3:
                r2.v vVar = (r2.v) this.b;
                return vVar.d(obj2) - vVar.d(obj);
            case 4:
                float[] fArr = ((rh.u2) this.b).r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 5:
                th.e5 e5Var = (th.e5) this.b;
                int i10 = e5Var.a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long o10 = org.telegram.messenger.o5.o(peerStories.peer);
                long o11 = org.telegram.messenger.o5.o(peerStories2.peer);
                boolean M = e5Var.M(o10);
                boolean M2 = e5Var.M(o11);
                boolean L = e5Var.L(o10);
                boolean L2 = e5Var.L(o11);
                boolean H = e5Var.H(o10);
                boolean H2 = e5Var.H(o11);
                if (H != H2) {
                    return (H2 ? 1 : 0) - (H ? 1 : 0);
                }
                if (M != M2) {
                    return (M2 ? 1 : 0) - (M ? 1 : 0);
                }
                if (L != L2) {
                    return (L2 ? 1 : 0) - (L ? 1 : 0);
                }
                boolean A = h20.A(o10);
                boolean A2 = h20.A(o11);
                if (A != A2) {
                    return (A2 ? 1 : 0) - (A ? 1 : 0);
                }
                TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(o10));
                ?? r02 = Z1 == null ? 0 : Z1.premium;
                TLRPC.User Z12 = vp.r1(i10).Z1(Long.valueOf(o11));
                ?? r12 = Z12 == null ? 0 : Z12.premium;
                if (r02 != r12) {
                    return r12 - r02;
                }
                return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) i0.a.g(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) i0.a.g(1, peerStories.stories)).date);
            default:
                ArrayList arrayList = (ArrayList) this.b;
                we weVar = (we) obj;
                we weVar2 = (we) obj2;
                int i11 = weVar.a;
                if (i11 != 0 || weVar2.a == 0) {
                    if ((i11 != 0 && weVar2.a == 0) || (indexOf = arrayList.indexOf(weVar)) > (indexOf2 = arrayList.indexOf(weVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
        }
    }
}
