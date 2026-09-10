package a4;

import android.view.MenuItem;
import bi.he;
import fg.b2;
import fg.g0;
import gg.j2;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.n9;
import org.telegram.ui.r6;
import org.telegram.ui.t6;
import org.telegram.ui.wr;
import s4.c1;
import yg.p0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        int lambda$initCamera$0;
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                return Integer.compare(((f) obj2).b, ((f) obj).b);
            case 1:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 2:
                String name = ((File) obj).getName();
                int i12 = ba.b.f;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
            case 3:
                p0 p0Var = (p0) obj2;
                String str = ((p0) obj).f;
                int i13 = 0;
                int i14 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = p0Var.f;
                if (str2 != null && str2.equals("❤")) {
                    i13 = -1;
                }
                return i14 - i13;
            case 4:
                return (int) (((he) obj2).e - ((he) obj).e);
            case 5:
                int i15 = ((g0) obj).b;
                int i16 = ((g0) obj2).b;
                if (i15 < i16) {
                    return 1;
                }
                return i15 > i16 ? -1 : 0;
            case 6:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 7:
                int i17 = ((b2) obj).b;
                int i18 = ((b2) obj2).b;
                if (i17 < i18) {
                    return 1;
                }
                return i17 > i18 ? -1 : 0;
            case 8:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 9:
                return ((j2) obj).c - ((j2) obj2).c;
            case 10:
                return Integer.compare(((i4.d) obj).a.b, ((i4.d) obj2).a.b);
            case 11:
                return Long.compare(((i4.c) obj).b, ((i4.c) obj2).b);
            case 12:
                top = ((c1) obj2).a.getTop();
                top2 = ((c1) obj).a.getTop();
                break;
            case 13:
                m2.b bVar = (m2.b) obj;
                m2.b bVar2 = (m2.b) obj2;
                int compare = Integer.compare(bVar.c, bVar2.c);
                return compare != 0 ? compare : bVar.b.compareTo(bVar2.b);
            case 14:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i19 = 0; i19 < bArr.length; i19++) {
                    byte b10 = bArr[i19];
                    byte b11 = bArr2[i19];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 15:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 16:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 17:
                List list = z4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 18:
                i6 i6Var = (i6) obj;
                i6 i6Var2 = (i6) obj2;
                if (i6Var.b == null && i6Var.d == null) {
                    return -1;
                }
                if (i6Var2.b == null && i6Var2.d == null) {
                    return 1;
                }
                return i6Var.a.compareTo(i6Var2.a);
            case 19:
                h6 h6Var = (h6) obj;
                h6 h6Var2 = (h6) obj2;
                if (!j6.g1(h6Var)) {
                    if (!j6.g1(h6Var2)) {
                        ?? r02 = h6Var.z;
                        ?? r12 = h6Var2.z;
                        if (r02 == r12) {
                            if (r02 != 0) {
                                int i20 = h6Var.a;
                                int i21 = h6Var2.a;
                                if (i20 <= i21) {
                                    if (i20 >= i21) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i22 = h6Var.a;
                                int i23 = h6Var2.a;
                                if (i22 <= i23) {
                                    if (i22 < i23) {
                                    }
                                }
                            }
                        } else if (r02 > r12) {
                        }
                    }
                    return 1;
                }
                return -1;
            case 20:
                long j3 = ((r6) obj2).c;
                long j10 = ((r6) obj).c;
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 21:
                return Long.compare(((t6) obj2).g, ((t6) obj).g);
            case 22:
                r1 r1Var = (r1) obj;
                r1 r1Var2 = (r1) obj2;
                float f7 = r1Var.e;
                float f10 = r1Var2.e;
                if (f7 <= f10) {
                    if (f7 < f10 || (i10 = r1Var.d) > (i11 = r1Var2.d)) {
                        return 1;
                    }
                    if (i10 >= i11) {
                        return 0;
                    }
                }
                return -1;
            case 23:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 24:
                top = ((MessageObject) obj2).getId();
                top2 = ((MessageObject) obj).getId();
                break;
            case 25:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 26:
                top = ((MessageObject) obj2).getId();
                top2 = ((MessageObject) obj).getId();
                break;
            case 27:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j02 = wr.j0(tLObject);
                int j03 = wr.j0(tLObject2);
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
            case 28:
                int j04 = wr.j0((TLObject) obj);
                int j05 = wr.j0((TLObject) obj2);
                if (j04 > j05) {
                    return 1;
                }
                return j04 < j05 ? -1 : 0;
            default:
                top = ((n9) obj2).b;
                top2 = ((n9) obj).b;
                break;
        }
        return top - top2;
    }
}
