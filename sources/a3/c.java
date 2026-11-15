package a3;

import android.util.Pair;
import ch.p0;
import ch.q0;
import da.h0;
import da.v1;
import di.bc;
import fi.d4;
import fi.t0;
import h9.q1;
import hi.xa;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i7) {
        this.a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        switch (this.a) {
            case 0:
                i7 = ((e2.u) obj2).j;
                i10 = ((e2.u) obj).j;
                break;
            case 1:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 2:
                return Integer.compare(((j) ((List) obj).get(0)).f, ((j) ((List) obj2).get(0)).f);
            case 3:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i11 = 6;
                int i12 = 7;
                return h9.u.f(r.c((r) Collections.max(list, new c(i11)), (r) Collections.max(list2, new c(i11)))).a(list.size(), list2.size()).b((r) Collections.max(list, new c(i12)), (r) Collections.max(list2, new c(i12)), new c(i12)).e();
            case 4:
                return ((i) Collections.max((List) obj)).compareTo((i) Collections.max((List) obj2));
            case 5:
                return ((o) ((List) obj).get(0)).compareTo((o) ((List) obj2).get(0));
            case 6:
                return r.c((r) obj, (r) obj2);
            case 7:
                r rVar = (r) obj;
                r rVar2 = (r) obj2;
                boolean z10 = rVar.e;
                int i13 = rVar.s;
                q1 a10 = (z10 && rVar.n) ? s.l : s.l.a();
                boolean z11 = rVar.f.F;
                h9.w wVar = h9.w.a;
                if (z11) {
                    wVar = wVar.b(Integer.valueOf(i13), Integer.valueOf(rVar2.s), s.l.a());
                }
                h9.w b10 = wVar.c(rVar.P, rVar2.P).b(Integer.valueOf(rVar.w), Integer.valueOf(rVar2.w), a10);
                if (rVar.L && rVar.N) {
                    b10 = b10.a(rVar.O, rVar2.O);
                }
                return b10.c(rVar.M, rVar2.M).b(Integer.valueOf(i13), Integer.valueOf(rVar2.s), a10).e();
            case 8:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 9:
                return ((h0) ((v1) obj)).a.compareTo(((h0) ((v1) obj2)).a);
            case 10:
                return ((b3.s) obj).a - ((b3.s) obj2).a;
            case 11:
                return Float.compare(((b3.s) obj).c, ((b3.s) obj2).c);
            case 12:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 13:
                return (int) (q0.j((TLObject) obj) - q0.j((TLObject) obj2));
            case 14:
                return Integer.compare(((d4.d) obj2).b, ((d4.d) obj).b);
            case 15:
                i7 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 16:
                i7 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 17:
                return (int) (((bc) obj2).d - ((bc) obj).d);
            case 18:
                long j3 = ((ei.b) obj2).c;
                long j10 = ((ei.b) obj).c;
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 19:
                i7 = ((fi.p) obj2).b;
                i10 = ((fi.p) obj).b;
                break;
            case 20:
            case 22:
                i7 = ((t0) obj2).c;
                i10 = ((t0) obj).c;
                break;
            case 21:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 23:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 24:
                int i14 = ProfileStoriesView.t0;
                return (int) (((d4) obj2).i - ((d4) obj).i);
            case 25:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 26:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 27:
                String name = ((File) obj).getName();
                int i15 = ga.b.f;
                return name.substring(0, i15).compareTo(((File) obj2).getName().substring(0, i15));
            case 28:
                p0 p0Var = (p0) obj2;
                String str = ((p0) obj).f;
                int i16 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = p0Var.f;
                return i16 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            default:
                return (int) (((xa) obj2).e - ((xa) obj).e);
        }
        return i7 - i10;
    }
}
