package a4;

import ah.j1;
import ah.k1;
import android.util.Pair;
import android.view.MenuItem;
import bi.f1;
import bi.r5;
import bi.u;
import di.uc;
import hg.h0;
import hg.z1;
import ig.a2;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.x4;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s6;
import s4.c1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int lambda$initCamera$0;
        switch (this.a) {
            case 0:
                return Integer.compare(((f) obj2).b, ((f) obj).b);
            case 1:
                return (int) (k1.k((TLObject) obj) - k1.k((TLObject) obj2));
            case 2:
                long j3 = ((ai.b) obj2).c;
                long j10 = ((ai.b) obj).c;
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 3:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 4:
                String name = ((File) obj).getName();
                int i12 = ba.b.f;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
            case 5:
                i10 = ((u) obj2).b;
                i11 = ((u) obj).b;
                break;
            case 6:
            case 8:
                i10 = ((f1) obj2).c;
                i11 = ((f1) obj).c;
                break;
            case 7:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 9:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 10:
                int i13 = ProfileStoriesView.s0;
                return (int) (((r5) obj2).i - ((r5) obj).i);
            case 11:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 12:
                j1 j1Var = (j1) obj2;
                String str = ((j1) obj).f;
                int i14 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = j1Var.f;
                return i14 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            case 13:
                return (int) (((uc) obj2).e - ((uc) obj).e);
            case 14:
                int i15 = ((h0) obj).b;
                int i16 = ((h0) obj2).b;
                if (i15 < i16) {
                    return 1;
                }
                return i15 > i16 ? -1 : 0;
            case 15:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 16:
                int i17 = ((z1) obj).b;
                int i18 = ((z1) obj2).b;
                if (i17 < i18) {
                    return 1;
                }
                return i17 > i18 ? -1 : 0;
            case 17:
                return Integer.compare(((i4.d) obj).a.b, ((i4.d) obj2).a.b);
            case 18:
                return Long.compare(((i4.c) obj).b, ((i4.c) obj2).b);
            case 19:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 20:
                return ((a2) obj).c - ((a2) obj2).c;
            case 21:
                i10 = ((c1) obj2).a.getTop();
                i11 = ((c1) obj).a.getTop();
                break;
            case 22:
                m2.b bVar = (m2.b) obj;
                m2.b bVar2 = (m2.b) obj2;
                int compare = Integer.compare(bVar.c, bVar2.c);
                return compare != 0 ? compare : bVar.b.compareTo(bVar2.b);
            case 23:
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
            case 24:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 25:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 26:
                List list = x4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 27:
                i6 i6Var = (i6) obj;
                i6 i6Var2 = (i6) obj2;
                if (i6Var.b == null && i6Var.d == null) {
                    return -1;
                }
                if (i6Var2.b == null && i6Var2.d == null) {
                    return 1;
                }
                return i6Var.a.compareTo(i6Var2.a);
            case 28:
                h6 h6Var = (h6) obj;
                h6 h6Var2 = (h6) obj2;
                if (j6.g1(h6Var)) {
                    return -1;
                }
                if (!j6.g1(h6Var2)) {
                    ?? r02 = h6Var.z;
                    ?? r42 = h6Var2.z;
                    if (r02 == r42) {
                        if (r02 != 0) {
                            int i20 = h6Var.a;
                            int i21 = h6Var2.a;
                            if (i20 <= i21) {
                                return i20 < i21 ? -1 : 0;
                            }
                        } else {
                            int i22 = h6Var.a;
                            int i23 = h6Var2.a;
                            if (i22 > i23) {
                                return -1;
                            }
                            if (i22 < i23) {
                            }
                        }
                    } else if (r02 > r42) {
                        return -1;
                    }
                }
                return 1;
            default:
                long j11 = ((s6) obj2).c;
                long j12 = ((s6) obj).c;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
        }
        return i10 - i11;
    }
}
