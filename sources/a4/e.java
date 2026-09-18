package a4;

import ai.a0;
import ai.i6;
import ai.n1;
import android.util.Pair;
import android.view.MenuItem;
import ci.tc;
import gg.a2;
import gg.h0;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.x4;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s6;
import org.telegram.ui.u6;
import s4.c1;
import zg.o0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int lambda$initCamera$0;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                return Integer.compare(((f) obj2).b, ((f) obj).b);
            case 1:
                i10 = ((a0) obj2).b;
                i11 = ((a0) obj).b;
                break;
            case 2:
            case 4:
                i10 = ((n1) obj2).c;
                i11 = ((n1) obj).c;
                break;
            case 3:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 5:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 6:
                int i14 = ProfileStoriesView.s0;
                return (int) (((i6) obj2).i - ((i6) obj).i);
            case 7:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 8:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 9:
                String name = ((File) obj).getName();
                int i15 = ba.b.f;
                return name.substring(0, i15).compareTo(((File) obj2).getName().substring(0, i15));
            case 10:
                o0 o0Var = (o0) obj2;
                String str = ((o0) obj).f;
                int i16 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = o0Var.f;
                return i16 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            case 11:
                return (int) (((tc) obj2).e - ((tc) obj).e);
            case 12:
                int i17 = ((h0) obj).b;
                int i18 = ((h0) obj2).b;
                if (i17 < i18) {
                    return 1;
                }
                return i17 > i18 ? -1 : 0;
            case 13:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 14:
                int i19 = ((a2) obj).b;
                int i20 = ((a2) obj2).b;
                if (i19 < i20) {
                    return 1;
                }
                return i19 > i20 ? -1 : 0;
            case 15:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 16:
                return ((hg.a2) obj).c - ((hg.a2) obj2).c;
            case 17:
                return Integer.compare(((i4.d) obj).a.b, ((i4.d) obj2).a.b);
            case 18:
                return Long.compare(((i4.c) obj).b, ((i4.c) obj2).b);
            case 19:
                i10 = ((c1) obj2).a.getTop();
                i11 = ((c1) obj).a.getTop();
                break;
            case 20:
                m2.b bVar = (m2.b) obj;
                m2.b bVar2 = (m2.b) obj2;
                int compare = Integer.compare(bVar.c, bVar2.c);
                return compare != 0 ? compare : bVar.b.compareTo(bVar2.b);
            case 21:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i21 = 0; i21 < bArr.length; i21++) {
                    byte b10 = bArr[i21];
                    byte b11 = bArr2[i21];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 22:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 23:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 24:
                List list = x4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 25:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj2;
                if (i6Var.b == null && i6Var.d == null) {
                    return -1;
                }
                if (i6Var2.b == null && i6Var2.d == null) {
                    return 1;
                }
                return i6Var.a.compareTo(i6Var2.a);
            case 26:
                g6 g6Var = (g6) obj;
                g6 g6Var2 = (g6) obj2;
                if (j6.g1(g6Var)) {
                    return -1;
                }
                if (!j6.g1(g6Var2)) {
                    ?? r02 = g6Var.z;
                    ?? r42 = g6Var2.z;
                    if (r02 == r42) {
                        if (r02 != 0) {
                            int i22 = g6Var.a;
                            int i23 = g6Var2.a;
                            if (i22 <= i23) {
                                return i22 < i23 ? -1 : 0;
                            }
                        } else {
                            int i24 = g6Var.a;
                            int i25 = g6Var2.a;
                            if (i24 > i25) {
                                return -1;
                            }
                            if (i24 < i25) {
                            }
                        }
                    } else if (r02 > r42) {
                        return -1;
                    }
                }
                return 1;
            case 27:
                long j3 = ((s6) obj2).c;
                long j10 = ((s6) obj).c;
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 28:
                return Long.compare(((u6) obj2).g, ((u6) obj).g);
            default:
                s1 s1Var = (s1) obj;
                s1 s1Var2 = (s1) obj2;
                float f7 = s1Var.e;
                float f10 = s1Var2.e;
                if (f7 > f10) {
                    return -1;
                }
                if (f7 >= f10 && (i12 = s1Var.d) <= (i13 = s1Var2.d)) {
                    return i12 < i13 ? -1 : 0;
                }
                return 1;
        }
        return i10 - i11;
    }
}
