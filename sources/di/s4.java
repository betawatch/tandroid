package di;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.ve;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        switch (this.a) {
            case 0:
                float[] fArr = ((v4) this.b).r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 1:
                fi.p6 p6Var = (fi.p6) this.b;
                int i7 = p6Var.a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long o4 = org.telegram.messenger.n5.o(peerStories.peer);
                long o10 = org.telegram.messenger.n5.o(peerStories2.peer);
                boolean M = p6Var.M(o4);
                boolean M2 = p6Var.M(o10);
                boolean L = p6Var.L(o4);
                boolean L2 = p6Var.L(o10);
                boolean H = p6Var.H(o4);
                boolean H2 = p6Var.H(o10);
                if (H != H2) {
                    return (H2 ? 1 : 0) - (H ? 1 : 0);
                }
                if (M != M2) {
                    return (M2 ? 1 : 0) - (M ? 1 : 0);
                }
                if (L != L2) {
                    return (L2 ? 1 : 0) - (L ? 1 : 0);
                }
                boolean B = p10.B(o4);
                boolean B2 = p10.B(o10);
                if (B != B2) {
                    return (B2 ? 1 : 0) - (B ? 1 : 0);
                }
                TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(o4));
                ?? r02 = c22 == null ? 0 : c22.premium;
                TLRPC.User c23 = np.u1(i7).c2(Long.valueOf(o10));
                ?? r12 = c23 == null ? 0 : c23.premium;
                if (r02 == r12) {
                    return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) i5.c.h(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) i5.c.h(1, peerStories.stories)).date);
                }
                return r12 - r02;
            case 2:
                ArrayList arrayList = (ArrayList) this.b;
                ve veVar = (ve) obj;
                ve veVar2 = (ve) obj2;
                int i10 = veVar.a;
                if (i10 != 0 || veVar2.a == 0) {
                    if ((i10 != 0 && veVar2.a == 0) || (indexOf = arrayList.indexOf(veVar)) > (indexOf2 = arrayList.indexOf(veVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 3:
                oi.e6 e6Var = (oi.e6) this.b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = e6Var.b(pagetablecell);
                int b11 = e6Var.b(pagetablecell2);
                return b10 != b11 ? Integer.compare(b10, b11) : Integer.compare(e6Var.a(pagetablecell), e6Var.a(pagetablecell2));
            case 4:
                u2.v vVar = (u2.v) this.b;
                return vVar.c(obj2) - vVar.c(obj);
            case 5:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray.get(((ug.g) obj).e, ConnectionsManager.DEFAULT_DATACENTER_ID) - sparseIntArray.get(((ug.g) obj2).e, ConnectionsManager.DEFAULT_DATACENTER_ID);
            case 6:
                return ((Collator) this.b).compare((String) obj, (String) obj2);
            default:
                int[] iArr = (int[]) this.b;
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int i11 = iArr[num.intValue()];
                int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i13 = i11 < 0 ? Integer.MAX_VALUE : iArr[num.intValue()];
                if (iArr[num2.intValue()] >= 0) {
                    i12 = iArr[num2.intValue()];
                }
                return i13 != i12 ? Integer.compare(i13, i12) : Integer.compare(num.intValue(), num2.intValue());
        }
    }
}
