package c5;

import android.graphics.RectF;
import android.util.Pair;
import cg.j2;
import com.google.android.exoplayer2.upstream.v0;
import d5.o;
import d5.p;
import i9.d0;
import i9.h1;
import j3.t0;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jh.wa;
import kg.r0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import q8.k0;
import q8.r;
import q8.t;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                return (int) ((((j2) obj).a * 100.0f) - (((j2) obj2).a * 100.0f));
            case 3:
                return ((v0) obj).a - ((v0) obj2).a;
            case 4:
                return Float.compare(((v0) obj).c, ((v0) obj2).c);
            case 5:
                i10 = ((t0) obj2).n;
                i11 = ((t0) obj).n;
                break;
            case 6:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 7:
                k0 k0Var = p.k;
                return 0;
            case 8:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i12 = 11;
                int i13 = 12;
                return r.f(o.c((o) Collections.max(list, new e(i12)), (o) Collections.max(list2, new e(i12)))).a(list.size(), list2.size()).b((o) Collections.max(list, new e(i13)), (o) Collections.max(list2, new e(i13)), new e(i13)).e();
            case 9:
                return ((d5.e) Collections.max((List) obj)).compareTo((d5.e) Collections.max((List) obj2));
            case 10:
                return ((d5.l) ((List) obj).get(0)).compareTo((d5.l) ((List) obj2).get(0));
            case 11:
                return o.c((o) obj, (o) obj2);
            case 12:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                boolean z10 = oVar.e;
                int i14 = oVar.r;
                k0 a2 = (z10 && oVar.n) ? p.k : p.k.a();
                return t.a.b(Integer.valueOf(i14), Integer.valueOf(oVar2.r), oVar.f.I ? p.k.a() : p.l).b(Integer.valueOf(oVar.s), Integer.valueOf(oVar2.s), a2).b(Integer.valueOf(i14), Integer.valueOf(oVar2.r), a2).e();
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
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 18:
                i10 = ((TL_stars.SavedStarGift) obj2).date;
                i11 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 19:
                return (int) (((wa) obj2).d - ((wa) obj).d);
            case 20:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 21:
                return (int) (r0.k((TLObject) obj) - r0.k((TLObject) obj2));
            case 22:
                long j10 = ((kh.a) obj2).c;
                long j11 = ((kh.a) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 23:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 24:
                String name = ((File) obj).getName();
                int i15 = l9.a.f;
                return name.substring(0, i15).compareTo(((File) obj2).getName().substring(0, i15));
            case 25:
                i10 = ((lh.o) obj2).b;
                i11 = ((lh.o) obj).b;
                break;
            case 26:
            case 28:
                i10 = ((lh.t0) obj2).c;
                i11 = ((lh.t0) obj).c;
                break;
            case 27:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            default:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
        }
        return i10 - i11;
    }
}
