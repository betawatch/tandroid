package a4;

import ah.i1;
import ah.j1;
import android.util.Pair;
import android.view.MenuItem;
import bi.f1;
import bi.t5;
import bi.u;
import di.pc;
import hg.g0;
import hg.y1;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.v4;
import org.telegram.ui.Stories.ProfileStoriesView;
import s4.b1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int lambda$initCamera$0;
        switch (this.a) {
            case 0:
                return Integer.compare(((e) obj2).b, ((e) obj).b);
            case 1:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 2:
                return (int) (j1.k((TLObject) obj) - j1.k((TLObject) obj2));
            case 3:
                long j10 = ((ai.b) obj2).c;
                long j11 = ((ai.b) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 4:
                i10 = ((u) obj2).b;
                i11 = ((u) obj).b;
                break;
            case 5:
            case 7:
                i10 = ((f1) obj2).c;
                i11 = ((f1) obj).c;
                break;
            case 6:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 8:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 9:
                int i12 = ProfileStoriesView.s0;
                return (int) (((t5) obj2).i - ((t5) obj).i);
            case 10:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 11:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 12:
                String name = ((File) obj).getName();
                int i13 = ca.b.f;
                return name.substring(0, i13).compareTo(((File) obj2).getName().substring(0, i13));
            case 13:
                i1 i1Var = (i1) obj2;
                String str = ((i1) obj).f;
                int i14 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = i1Var.f;
                return i14 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            case 14:
                return (int) (((pc) obj2).e - ((pc) obj).e);
            case 15:
                int i15 = ((g0) obj).b;
                int i16 = ((g0) obj2).b;
                if (i15 < i16) {
                    return 1;
                }
                return i15 > i16 ? -1 : 0;
            case 16:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 17:
                int i17 = ((y1) obj).b;
                int i18 = ((y1) obj2).b;
                if (i17 < i18) {
                    return 1;
                }
                return i17 > i18 ? -1 : 0;
            case 18:
                return Integer.compare(((i4.d) obj).a.b, ((i4.d) obj2).a.b);
            case 19:
                return Long.compare(((i4.c) obj).b, ((i4.c) obj2).b);
            case 20:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 21:
                return ((a2) obj).c - ((a2) obj2).c;
            case 22:
                i10 = Integer.bitCount(((Integer) obj2).intValue());
                i11 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 23:
                i10 = ((b1) obj2).a.getTop();
                i11 = ((b1) obj).a.getTop();
                break;
            case 24:
                m2.b bVar = (m2.b) obj;
                m2.b bVar2 = (m2.b) obj2;
                int compare = Integer.compare(bVar.c, bVar2.c);
                return compare != 0 ? compare : bVar.b.compareTo(bVar2.b);
            case 25:
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
            case 26:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 27:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 28:
                List list = v4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            default:
                f6 f6Var = (f6) obj;
                f6 f6Var2 = (f6) obj2;
                if (f6Var.b == null && f6Var.d == null) {
                    return -1;
                }
                if (f6Var2.b == null && f6Var2.d == null) {
                    return 1;
                }
                return f6Var.a.compareTo(f6Var2.a);
        }
        return i10 - i11;
    }
}
