package a3;

import android.util.Pair;
import ci.mc;
import dh.n0;
import dh.o0;
import ei.l4;
import ei.v0;
import gi.ab;
import java.io.File;
import java.util.Comparator;
import kg.d0;
import kg.t1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;
import u4.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i3) {
        this.a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i3;
        int i10;
        switch (this.a) {
            case 0:
                return ((v) obj).a - ((v) obj2).a;
            case 1:
                return Float.compare(((v) obj).c, ((v) obj2).c);
            case 2:
                return Integer.compare(((c4.d) obj2).b, ((c4.d) obj).b);
            case 3:
                i3 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 4:
                i3 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 5:
                return (int) (((mc) obj2).d - ((mc) obj).d);
            case 6:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 7:
                return (int) (o0.j((TLObject) obj) - o0.j((TLObject) obj2));
            case 8:
                long j10 = ((di.b) obj2).c;
                long j11 = ((di.b) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 9:
                i3 = ((ei.q) obj2).b;
                i10 = ((ei.q) obj).b;
                break;
            case 10:
            case 12:
                i3 = ((v0) obj2).c;
                i10 = ((v0) obj).c;
                break;
            case 11:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 13:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 14:
                int i11 = ProfileStoriesView.t0;
                return (int) (((l4) obj2).i - ((l4) obj).i);
            case 15:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 16:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 17:
                String name = ((File) obj).getName();
                int i12 = fa.d.f;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
            case 18:
                n0 n0Var = (n0) obj2;
                String str = ((n0) obj).f;
                int i13 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = n0Var.f;
                return i13 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            case 19:
                return (int) (((ab) obj2).e - ((ab) obj).e);
            case 20:
                return Integer.compare(((k4.d) obj).a.b, ((k4.d) obj2).a.b);
            case 21:
                return Long.compare(((k4.c) obj).b, ((k4.c) obj2).b);
            case 22:
                int i14 = ((d0) obj).b;
                int i15 = ((d0) obj2).b;
                if (i14 < i15) {
                    return 1;
                }
                return i14 > i15 ? -1 : 0;
            case 23:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 24:
                int i16 = ((t1) obj).b;
                int i17 = ((t1) obj2).b;
                if (i16 < i17) {
                    return 1;
                }
                return i16 > i17 ? -1 : 0;
            case 25:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 26:
                return ((lg.t1) obj).c - ((lg.t1) obj2).c;
            case 27:
                i3 = Integer.bitCount(((Integer) obj2).intValue());
                i10 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 28:
                o2.b bVar = (o2.b) obj;
                o2.b bVar2 = (o2.b) obj2;
                int compare = Integer.compare(bVar.c, bVar2.c);
                return compare != 0 ? compare : bVar.b.compareTo(bVar2.b);
            default:
                i3 = ((d1) obj2).a.getTop();
                i10 = ((d1) obj).a.getTop();
                break;
        }
        return i3 - i10;
    }
}
