package oh;

import android.util.Pair;
import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aq0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.qr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ k0(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$initCamera$0;
        int i10;
        int i11;
        int id2;
        int id3;
        switch (this.a) {
            case 0:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 1:
                int i12 = ProfileStoriesView.p0;
                return (int) (((i4) obj2).i - ((i4) obj).i);
            case 2:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 3:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 4:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 5:
                List list = org.telegram.ui.ActionBar.z4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 6:
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) obj2;
                if (j6Var.b == null && j6Var.d == null) {
                    return -1;
                }
                if (j6Var2.b == null && j6Var2.d == null) {
                    return 1;
                }
                return j6Var.a.compareTo(j6Var2.a);
            case 7:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj2;
                if (!org.telegram.ui.ActionBar.k6.g1(i6Var)) {
                    if (!org.telegram.ui.ActionBar.k6.g1(i6Var2)) {
                        ?? r02 = i6Var.z;
                        ?? r42 = i6Var2.z;
                        if (r02 == r42) {
                            if (r02 != 0) {
                                int i13 = i6Var.a;
                                int i14 = i6Var2.a;
                                if (i13 <= i14) {
                                    if (i13 >= i14) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i15 = i6Var.a;
                                int i16 = i6Var2.a;
                                if (i15 <= i16) {
                                    if (i15 >= i16) {
                                        return 0;
                                    }
                                }
                            }
                        } else if (r02 > r42) {
                        }
                    }
                    return 1;
                }
                return -1;
            case 8:
                long j10 = ((org.telegram.ui.u6) obj2).c;
                long j11 = ((org.telegram.ui.u6) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 9:
                return Long.compare(((org.telegram.ui.w6) obj2).g, ((org.telegram.ui.w6) obj).g);
            case 10:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) obj2;
                float f10 = r1Var.e;
                float f11 = r1Var2.e;
                if (f10 <= f11) {
                    if (f10 < f11 || (i10 = r1Var.d) > (i11 = r1Var2.d)) {
                        return 1;
                    }
                    if (i10 >= i11) {
                        return 0;
                    }
                }
                return -1;
            case 11:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 12:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 13:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 14:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 15:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j02 = qr.j0(tLObject);
                int j03 = qr.j0(tLObject2);
                if (j02 > j03) {
                    return 1;
                }
                if (j02 < j03) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) - MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 16:
                int j04 = qr.j0((TLObject) obj);
                int j05 = qr.j0((TLObject) obj2);
                if (j04 > j05) {
                    return 1;
                }
                return j04 < j05 ? -1 : 0;
            case 17:
                id2 = ((org.telegram.ui.Components.g9) obj2).b;
                id3 = ((org.telegram.ui.Components.g9) obj).b;
                break;
            case 18:
                id2 = ((org.telegram.ui.Components.g9) obj2).b;
                id3 = ((org.telegram.ui.Components.g9) obj).b;
                break;
            case 19:
                return Long.compare(((vc) obj).c, ((vc) obj2).c);
            case 20:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                return abs > abs2 ? 1 : 0;
            case 21:
                mc.a aVar = (mc.a) obj;
                mc.a aVar2 = (mc.a) obj2;
                int compare = Integer.compare(aVar.b, aVar2.b);
                return compare != 0 ? compare : Integer.compare(aVar2.d, aVar.d);
            case 22:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 23:
                float f12 = ((ug0) obj).a;
                float f13 = ((ug0) obj2).a;
                if (f12 > f13) {
                    return -1;
                }
                return f12 < f13 ? 1 : 0;
            case 24:
                return Float.compare(((ql0) obj).a, ((ql0) obj2).a);
            case 25:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 26:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 27:
                int i17 = ((aq0) obj).c;
                int i18 = ((aq0) obj2).c;
                if (i17 < i18) {
                    return 1;
                }
                return i17 > i18 ? -1 : 0;
            case 28:
                id2 = ((wt0) obj2).c;
                id3 = ((wt0) obj).c;
                break;
            default:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue() ? -1 : 0;
        }
        return id2 - id3;
    }
}
