// default package

import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jz0 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r11v39, types: [int] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v61 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a;
        int a2;
        byte b = this.a;
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ((xz0) obj3).H;
                return Integer.compare(((uz0) arrayList.get(((Integer) obj).intValue())).b, ((uz0) arrayList.get(((Integer) obj2).intValue())).b);
            case 1:
                sz1 sz1Var = (sz1) obj3;
                return Integer.compare(sz1Var.d((m47) obj), sz1Var.d((m47) obj2));
            case 2:
                ArrayList arrayList2 = ((b04) obj3).H0.e1;
                int indexOf = arrayList2.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = arrayList2.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return 0;
                }
                return indexOf - indexOf2;
            case 3:
                SparseIntArray sparseIntArray = (SparseIntArray) obj3;
                return sparseIntArray.get(((k94) obj).e, ConnectionsManager.DEFAULT_DATACENTER_ID) - sparseIntArray.get(((k94) obj2).e, ConnectionsManager.DEFAULT_DATACENTER_ID);
            case 4:
                vm6 vm6Var = (vm6) obj3;
                a = vm6Var.a(obj2);
                a2 = vm6Var.a(obj);
                break;
            case 5:
                int[] iArr = (int[]) obj3;
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int i2 = iArr[num.intValue()] < 0 ? Integer.MAX_VALUE : iArr[num.intValue()];
                if (iArr[num2.intValue()] >= 0) {
                    i = iArr[num2.intValue()];
                }
                return i2 != i ? Integer.compare(i2, i) : Integer.compare(num.intValue(), num2.intValue());
            case 6:
                float[] fArr = ((pta) obj3).r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 7:
                StickersActivity stickersActivity = (StickersActivity) obj3;
                int indexOf3 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
            case 8:
                c6b c6bVar = (c6b) obj3;
                int i3 = c6bVar.a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long n = wf3.n(peerStories.peer);
                long n2 = wf3.n(peerStories2.peer);
                boolean L = c6bVar.L(n);
                boolean L2 = c6bVar.L(n2);
                boolean K = c6bVar.K(n);
                boolean K2 = c6bVar.K(n2);
                boolean G = c6bVar.G(n);
                boolean G2 = c6bVar.G(n2);
                if (G != G2) {
                    return (G2 ? 1 : 0) - (G ? 1 : 0);
                }
                if (L != L2) {
                    return (L2 ? 1 : 0) - (L ? 1 : 0);
                }
                if (K != K2) {
                    return (K2 ? 1 : 0) - (K ? 1 : 0);
                }
                boolean C = lbc.C(n);
                boolean C2 = lbc.C(n2);
                if (C != C2) {
                    return (C2 ? 1 : 0) - (C ? 1 : 0);
                }
                TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(n));
                ?? r11 = X1 == null ? 0 : X1.premium;
                TLRPC.User X12 = uc7.s1(i3).X1(Long.valueOf(n2));
                ?? r0 = X12 == null ? 0 : X12.premium;
                if (r11 == r0) {
                    return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) c00.g(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) c00.g(1, peerStories.stories)).date);
                }
                return r0 - r11;
            case 9:
                ajb ajbVar = (ajb) obj3;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b2 = ajbVar.b(pagetablecell);
                int b3 = ajbVar.b(pagetablecell2);
                return b2 != b3 ? Integer.compare(b2, b3) : Integer.compare(ajbVar.a(pagetablecell), ajbVar.a(pagetablecell2));
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj3;
                a = spannableStringBuilder.getSpanStart((fmb) obj2);
                a2 = spannableStringBuilder.getSpanStart((fmb) obj);
                break;
        }
        return a - a2;
    }
}
