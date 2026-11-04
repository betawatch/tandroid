package ci;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.pe;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y4(Object obj, int i3) {
        this.a = i3;
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
                float[] fArr = ((b5) this.b).r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 1:
                ei.z6 z6Var = (ei.z6) this.b;
                int i3 = z6Var.a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long o10 = org.telegram.messenger.m5.o(peerStories.peer);
                long o11 = org.telegram.messenger.m5.o(peerStories2.peer);
                boolean M = z6Var.M(o10);
                boolean M2 = z6Var.M(o11);
                boolean L = z6Var.L(o10);
                boolean L2 = z6Var.L(o11);
                boolean H = z6Var.H(o10);
                boolean H2 = z6Var.H(o11);
                if (H != H2) {
                    return (H2 ? 1 : 0) - (H ? 1 : 0);
                }
                if (M != M2) {
                    return (M2 ? 1 : 0) - (M ? 1 : 0);
                }
                if (L != L2) {
                    return (L2 ? 1 : 0) - (L ? 1 : 0);
                }
                boolean A = l10.A(o10);
                boolean A2 = l10.A(o11);
                if (A != A2) {
                    return (A2 ? 1 : 0) - (A ? 1 : 0);
                }
                TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(o10));
                ?? r02 = a22 == null ? 0 : a22.premium;
                TLRPC.User a23 = hp.s1(i3).a2(Long.valueOf(o11));
                ?? r12 = a23 == null ? 0 : a23.premium;
                if (r02 == r12) {
                    return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) k2.p1.h(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) k2.p1.h(1, peerStories.stories)).date);
                }
                return r12 - r02;
            case 2:
                ArrayList arrayList = (ArrayList) this.b;
                pe peVar = (pe) obj;
                pe peVar2 = (pe) obj2;
                int i10 = peVar.a;
                if (i10 != 0 || peVar2.a == 0) {
                    if ((i10 != 0 && peVar2.a == 0) || (indexOf = arrayList.indexOf(peVar)) > (indexOf2 = arrayList.indexOf(peVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 3:
                mi.f6 f6Var = (mi.f6) this.b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = f6Var.b(pagetablecell);
                int b11 = f6Var.b(pagetablecell2);
                return b10 != b11 ? Integer.compare(b10, b11) : Integer.compare(f6Var.a(pagetablecell), f6Var.a(pagetablecell2));
            case 4:
                t2.v vVar = (t2.v) this.b;
                return vVar.a(obj2) - vVar.a(obj);
            case 5:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray.get(((vg.g) obj).e, ConnectionsManager.DEFAULT_DATACENTER_ID) - sparseIntArray.get(((vg.g) obj2).e, ConnectionsManager.DEFAULT_DATACENTER_ID);
            default:
                return ((Collator) this.b).compare((String) obj, (String) obj2);
        }
    }
}
