package bi;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.we;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s5 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        switch (this.a) {
            case 0:
                float[] fArr = ((w5) this.b).r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 1:
                di.z6 z6Var = (di.z6) this.b;
                int i7 = z6Var.a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long o4 = org.telegram.messenger.m5.o(peerStories.peer);
                long o10 = org.telegram.messenger.m5.o(peerStories2.peer);
                boolean M = z6Var.M(o4);
                boolean M2 = z6Var.M(o10);
                boolean L = z6Var.L(o4);
                boolean L2 = z6Var.L(o10);
                boolean H = z6Var.H(o4);
                boolean H2 = z6Var.H(o10);
                if (H != H2) {
                    return (H2 ? 1 : 0) - (H ? 1 : 0);
                }
                if (M != M2) {
                    return (M2 ? 1 : 0) - (M ? 1 : 0);
                }
                if (L != L2) {
                    return (L2 ? 1 : 0) - (L ? 1 : 0);
                }
                boolean A = t10.A(o4);
                boolean A2 = t10.A(o10);
                if (A != A2) {
                    return (A2 ? 1 : 0) - (A ? 1 : 0);
                }
                TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(o4));
                ?? r02 = a22 == null ? 0 : a22.premium;
                TLRPC.User a23 = qp.s1(i7).a2(Long.valueOf(o10));
                ?? r12 = a23 == null ? 0 : a23.premium;
                if (r02 == r12) {
                    return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) jg.g.i(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) jg.g.i(1, peerStories.stories)).date);
                }
                return r12 - r02;
            case 2:
                ArrayList arrayList = (ArrayList) this.b;
                we weVar = (we) obj;
                we weVar2 = (we) obj2;
                int i10 = weVar.a;
                if (i10 != 0 || weVar2.a == 0) {
                    if ((i10 != 0 && weVar2.a == 0) || (indexOf = arrayList.indexOf(weVar)) > (indexOf2 = arrayList.indexOf(weVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 3:
                li.e6 e6Var = (li.e6) this.b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = e6Var.b(pagetablecell);
                int b11 = e6Var.b(pagetablecell2);
                return b10 != b11 ? Integer.compare(b10, b11) : Integer.compare(e6Var.a(pagetablecell), e6Var.a(pagetablecell2));
            case 4:
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
            case 5:
                float[] fArr2 = (float[]) this.b;
                Integer num3 = (Integer) obj2;
                float f10 = fArr2[((Integer) obj).intValue()];
                float log = f10 > 0.0f ? (float) Math.log(f10) : 0.0f;
                float f11 = fArr2[num3.intValue()];
                return Float.compare(log, f11 > 0.0f ? (float) Math.log(f11) : 0.0f);
            case 6:
                u2.v vVar = (u2.v) this.b;
                return vVar.d(obj2) - vVar.d(obj);
            case 7:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                return sparseIntArray.get(((ug.g) obj).e, ConnectionsManager.DEFAULT_DATACENTER_ID) - sparseIntArray.get(((ug.g) obj2).e, ConnectionsManager.DEFAULT_DATACENTER_ID);
            default:
                return ((Collator) this.b).compare((String) obj, (String) obj2);
        }
    }
}
