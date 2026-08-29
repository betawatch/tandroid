package lh;

import android.util.Pair;
import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import nh.lb;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ e4(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$initCamera$0;
        int i10;
        int i11;
        int id2;
        int id3;
        int i12 = 0;
        switch (this.a) {
            case 0:
                int i13 = ProfileStoriesView.o0;
                return (int) (((g4) obj2).i - ((g4) obj).i);
            case 1:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 2:
                kg.q0 q0Var = (kg.q0) obj2;
                String str = ((kg.q0) obj).f;
                int i14 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = q0Var.f;
                if (str2 != null && str2.equals("❤")) {
                    i12 = -1;
                }
                return i14 - i12;
            case 3:
                return (int) (((lb) obj2).e - ((lb) obj).e);
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i15 = 0; i15 < bArr.length; i15++) {
                    byte b10 = bArr[i15];
                    byte b11 = bArr2[i15];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 5:
                p4.b bVar = (p4.b) obj;
                p4.b bVar2 = (p4.b) obj2;
                int compare = Integer.compare(bVar.c, bVar2.c);
                return compare != 0 ? compare : bVar.b.compareTo(bVar2.b);
            case 6:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 7:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 8:
                List list = org.telegram.ui.ActionBar.v4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 9:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                if (f6Var.b == null && f6Var.d == null) {
                    return -1;
                }
                if (f6Var2.b == null && f6Var2.d == null) {
                    return 1;
                }
                return f6Var.a.compareTo(f6Var2.a);
            case 10:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                if (!org.telegram.ui.ActionBar.g6.g1(e6Var)) {
                    if (!org.telegram.ui.ActionBar.g6.g1(e6Var2)) {
                        ?? r02 = e6Var.z;
                        ?? r42 = e6Var2.z;
                        if (r02 == r42) {
                            if (r02 != 0) {
                                int i16 = e6Var.a;
                                int i17 = e6Var2.a;
                                if (i16 <= i17) {
                                    if (i16 >= i17) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i18 = e6Var.a;
                                int i19 = e6Var2.a;
                                if (i18 <= i19) {
                                    if (i18 >= i19) {
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
            case 11:
                long j10 = ((org.telegram.ui.q6) obj2).c;
                long j11 = ((org.telegram.ui.q6) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 12:
                return Long.compare(((org.telegram.ui.s6) obj2).g, ((org.telegram.ui.s6) obj).g);
            case 13:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) obj2;
                float f9 = q1Var.e;
                float f10 = q1Var2.e;
                if (f9 <= f10) {
                    if (f9 < f10 || (i10 = q1Var.d) > (i11 = q1Var2.d)) {
                        return 1;
                    }
                    if (i10 >= i11) {
                        return 0;
                    }
                }
                return -1;
            case 14:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 15:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 16:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 17:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 18:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j02 = jr.j0(tLObject);
                int j03 = jr.j0(tLObject2);
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
            case 19:
                int j04 = jr.j0((TLObject) obj);
                int j05 = jr.j0((TLObject) obj2);
                if (j04 > j05) {
                    return 1;
                }
                return j04 < j05 ? -1 : 0;
            case 20:
                id2 = ((org.telegram.ui.Components.k9) obj2).b;
                id3 = ((org.telegram.ui.Components.k9) obj).b;
                break;
            case 21:
                id2 = ((org.telegram.ui.Components.k9) obj2).b;
                id3 = ((org.telegram.ui.Components.k9) obj).b;
                break;
            case 22:
                return Long.compare(((yc) obj).c, ((yc) obj2).c);
            case 23:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                return abs > abs2 ? 1 : 0;
            case 24:
                kc.a aVar = (kc.a) obj;
                kc.a aVar2 = (kc.a) obj2;
                int compare2 = Integer.compare(aVar.b, aVar2.b);
                return compare2 != 0 ? compare2 : Integer.compare(aVar2.d, aVar.d);
            case 25:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 26:
                float f11 = ((ig0) obj).a;
                float f12 = ((ig0) obj2).a;
                if (f11 > f12) {
                    return -1;
                }
                return f11 < f12 ? 1 : 0;
            case 27:
                return Float.compare(((gl0) obj).a, ((gl0) obj2).a);
            case 28:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            default:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
        }
        return id2 - id3;
    }
}
