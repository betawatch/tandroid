package a5;

import android.graphics.RectF;
import android.util.Pair;
import b5.n;
import b5.q;
import b5.r;
import com.google.android.exoplayer2.upstream.v0;
import g9.d0;
import g9.h1;
import gh.cb;
import h3.t0;
import hg.s0;
import ih.k4;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o8.k0;
import o8.t;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i9) {
        this.a = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i9;
        int i10;
        switch (this.a) {
            case 0:
                return Integer.compare(((f) obj).a.b, ((f) obj2).a.b);
            case 1:
                return Long.compare(((d) obj).b, ((d) obj2).b);
            case 2:
                i9 = ((t0) obj2).n;
                i10 = ((t0) obj).n;
                break;
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 4:
                k0 k0Var = r.k;
                return 0;
            case 5:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i11 = 8;
                int i12 = 9;
                return o8.r.f(q.c((q) Collections.max(list, new e(i11)), (q) Collections.max(list2, new e(i11)))).a(list.size(), list2.size()).b((q) Collections.max(list, new e(i12)), (q) Collections.max(list2, new e(i12)), new e(i12)).e();
            case 6:
                return ((b5.g) Collections.max((List) obj)).compareTo((b5.g) Collections.max((List) obj2));
            case 7:
                return ((n) ((List) obj).get(0)).compareTo((n) ((List) obj2).get(0));
            case 8:
                return q.c((q) obj, (q) obj2);
            case 9:
                q qVar = (q) obj;
                q qVar2 = (q) obj2;
                boolean z10 = qVar.e;
                int i13 = qVar.r;
                k0 a2 = (z10 && qVar.n) ? r.k : r.k.a();
                return t.a.b(Integer.valueOf(i13), Integer.valueOf(qVar2.r), qVar.f.I ? r.k.a() : r.l).b(Integer.valueOf(qVar.s), Integer.valueOf(qVar2.s), a2).b(Integer.valueOf(i13), Integer.valueOf(qVar2.r), a2).e();
            case 10:
                return ((String) obj).compareTo((String) obj2);
            case 11:
                return ((v0) obj).a - ((v0) obj2).a;
            case 12:
                return Float.compare(((v0) obj).c, ((v0) obj2).c);
            case 13:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 14:
                return ((d0) ((h1) obj)).a.compareTo(((d0) ((h1) obj2)).a);
            case 15:
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
            case 16:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 17:
                i9 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 18:
                i9 = ((TL_stars.SavedStarGift) obj2).date;
                i10 = ((TL_stars.SavedStarGift) obj).date;
                break;
            case 19:
                return (int) (((cb) obj2).d - ((cb) obj).d);
            case 20:
                return (int) (s0.k((TLObject) obj) - s0.k((TLObject) obj2));
            case 21:
                long j10 = ((hh.a) obj2).c;
                long j11 = ((hh.a) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 22:
                i9 = ((ih.q) obj2).b;
                i10 = ((ih.q) obj).b;
                break;
            case 23:
            case 25:
                i9 = ((ih.v0) obj2).c;
                i10 = ((ih.v0) obj).c;
                break;
            case 24:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 26:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 27:
                int i14 = ProfileStoriesView.o0;
                return (int) (((k4) obj2).i - ((k4) obj).i);
            case 28:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            default:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
        return i9 - i10;
    }
}
