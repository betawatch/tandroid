package a3;

import android.util.Pair;
import bi.vd;
import ch.o0;
import ch.p0;
import da.h0;
import da.v1;
import di.l4;
import di.t0;
import fi.ab;
import h9.r1;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                boolean z9 = rVar.e;
                int i13 = rVar.s;
                r1 a10 = (z9 && rVar.n) ? s.l : s.l.a();
                boolean z10 = rVar.f.F;
                h9.w wVar = h9.w.a;
                if (z10) {
                    wVar = wVar.b(Integer.valueOf(i13), Integer.valueOf(rVar2.s), s.l.a());
                }
                h9.w b10 = wVar.c(rVar.O, rVar2.O).b(Integer.valueOf(rVar.w), Integer.valueOf(rVar2.w), a10);
                if (rVar.K && rVar.M) {
                    b10 = b10.a(rVar.N, rVar2.N);
                }
                return b10.c(rVar.L, rVar2.L).b(Integer.valueOf(i13), Integer.valueOf(rVar2.s), a10).e();
            case 8:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 9:
                return ((h0) ((v1) obj)).a.compareTo(((h0) ((v1) obj2)).a);
            case 10:
                return ((b3.s) obj).a - ((b3.s) obj2).a;
            case 11:
                return Float.compare(((b3.s) obj).c, ((b3.s) obj2).c);
            case 12:
                i7 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 13:
                i7 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 14:
                return (int) (((vd) obj2).d - ((vd) obj).d);
            case 15:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 16:
                return (int) (p0.j((TLObject) obj) - p0.j((TLObject) obj2));
            case 17:
                long j3 = ((ci.b) obj2).c;
                long j10 = ((ci.b) obj).c;
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 18:
                return Integer.compare(((d4.d) obj2).b, ((d4.d) obj).b);
            case 19:
                i7 = ((di.p) obj2).b;
                i10 = ((di.p) obj).b;
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
                int i14 = ProfileStoriesView.s0;
                return (int) (((l4) obj2).i - ((l4) obj).i);
            case 25:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 26:
                o0 o0Var = (o0) obj2;
                String str = ((o0) obj).f;
                int i15 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = o0Var.f;
                return i15 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            case 27:
                return (int) (((ab) obj2).e - ((ab) obj).e);
            case 28:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                String name = ((File) obj).getName();
                int i16 = ga.b.f;
                return name.substring(0, i16).compareTo(((File) obj2).getName().substring(0, i16));
        }
        return i7 - i10;
    }
}
