package e5;

import android.graphics.RectF;
import android.util.Pair;
import eg.i2;
import f5.o;
import f5.p;
import g5.s0;
import j3.n0;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k9.d0;
import k9.h1;
import lh.xa;
import mg.r0;
import nh.u0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import s8.h0;
import s8.n;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                return Integer.compare(((f) obj).a.b, ((f) obj2).a.b);
            case 1:
                return Long.compare(((d) obj).b, ((d) obj2).b);
            case 2:
                return (int) ((((i2) obj).a * 100.0f) - (((i2) obj2).a * 100.0f));
            case 3:
                i10 = ((n0) obj2).n;
                i11 = ((n0) obj).n;
                break;
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 5:
                h0 h0Var = p.k;
                return 0;
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i12 = 9;
                int i13 = 10;
                return n.f(o.c((o) Collections.max(list, new e(i12)), (o) Collections.max(list2, new e(i12)))).a(list.size(), list2.size()).b((o) Collections.max(list, new e(i13)), (o) Collections.max(list2, new e(i13)), new e(i13)).e();
            case 7:
                return ((f5.e) Collections.max((List) obj)).compareTo((f5.e) Collections.max((List) obj2));
            case 8:
                return ((f5.l) ((List) obj).get(0)).compareTo((f5.l) ((List) obj2).get(0));
            case 9:
                return o.c((o) obj, (o) obj2);
            case 10:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                boolean z4 = oVar.e;
                int i14 = oVar.r;
                h0 a2 = (z4 && oVar.n) ? p.k : p.k.a();
                return s8.p.a.b(Integer.valueOf(i14), Integer.valueOf(oVar2.r), oVar.f.J ? p.k.a() : p.l).b(Integer.valueOf(oVar.s), Integer.valueOf(oVar2.s), a2).b(Integer.valueOf(i14), Integer.valueOf(oVar2.r), a2).e();
            case 11:
                return ((s0) obj).a - ((s0) obj2).a;
            case 12:
                return Float.compare(((s0) obj).c, ((s0) obj2).c);
            case 13:
                return ((String) obj).compareTo((String) obj2);
            case 14:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 15:
                return ((d0) ((h1) obj)).a.compareTo(((d0) ((h1) obj2)).a);
            case 16:
                RectF rectF = (RectF) obj;
                RectF rectF2 = (RectF) obj2;
                if (Math.abs(rectF.top - rectF2.top) > 1.0E-4f) {
                    if (rectF.top < rectF2.top) {
                        return -1;
                    }
                } else {
                    if (Math.abs(rectF.left - rectF2.left) <= 1.0E-4f) {
                        return 0;
                    }
                    if (rectF.left < rectF2.left) {
                        return -1;
                    }
                }
                return 1;
            case 17:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 18:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 19:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 20:
                return (int) (((xa) obj2).d - ((xa) obj).d);
            case 21:
                return (int) (r0.k((TLObject) obj) - r0.k((TLObject) obj2));
            case 22:
                long j10 = ((mh.a) obj2).c;
                long j11 = ((mh.a) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 23:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 24:
                String name = ((File) obj).getName();
                int i15 = n9.a.f;
                return name.substring(0, i15).compareTo(((File) obj2).getName().substring(0, i15));
            case 25:
                i10 = ((nh.p) obj2).b;
                i11 = ((nh.p) obj).b;
                break;
            case 26:
            case 28:
                i10 = ((u0) obj2).c;
                i11 = ((u0) obj).c;
                break;
            case 27:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            default:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
        }
        return i10 - i11;
    }
}
