package e5;

import android.graphics.RectF;
import f5.o;
import f5.p;
import fg.h2;
import g5.s0;
import j3.n0;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k9.d0;
import k9.h1;
import mh.xa;
import ng.r0;
import oh.u0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import s8.h0;
import s8.n;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                return Integer.compare(((g) obj).a.b, ((g) obj2).a.b);
            case 1:
                return Long.compare(((e) obj).b, ((e) obj2).b);
            case 2:
                i10 = ((n0) obj2).n;
                i11 = ((n0) obj).n;
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
                h0 h0Var = p.k;
                return 0;
            case 5:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i12 = 8;
                int i13 = 9;
                return n.f(o.c((o) Collections.max(list, new f(i12)), (o) Collections.max(list2, new f(i12)))).a(list.size(), list2.size()).b((o) Collections.max(list, new f(i13)), (o) Collections.max(list2, new f(i13)), new f(i13)).e();
            case 6:
                return ((f5.e) Collections.max((List) obj)).compareTo((f5.e) Collections.max((List) obj2));
            case 7:
                return ((f5.l) ((List) obj).get(0)).compareTo((f5.l) ((List) obj2).get(0));
            case 8:
                return o.c((o) obj, (o) obj2);
            case 9:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                boolean z4 = oVar.e;
                int i14 = oVar.r;
                h0 a2 = (z4 && oVar.n) ? p.k : p.k.a();
                return s8.p.a.b(Integer.valueOf(i14), Integer.valueOf(oVar2.r), oVar.f.J ? p.k.a() : p.l).b(Integer.valueOf(oVar.s), Integer.valueOf(oVar2.s), a2).b(Integer.valueOf(i14), Integer.valueOf(oVar2.r), a2).e();
            case 10:
                return (int) ((((h2) obj).a * 100.0f) - (((h2) obj2).a * 100.0f));
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
                if (Math.abs(rectF.top - rectF2.top) <= 1.0E-4f) {
                    if (Math.abs(rectF.left - rectF2.left) <= 1.0E-4f) {
                        return 0;
                    }
                    if (rectF.left < rectF2.left) {
                        return -1;
                    }
                } else if (rectF.top < rectF2.top) {
                    return -1;
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
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 22:
                String name = ((File) obj).getName();
                int i15 = n9.a.f;
                return name.substring(0, i15).compareTo(((File) obj2).getName().substring(0, i15));
            case 23:
                return (int) (r0.k((TLObject) obj) - r0.k((TLObject) obj2));
            case 24:
                long j10 = ((nh.a) obj2).c;
                long j11 = ((nh.a) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 25:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i16 = 0; i16 < bArr.length; i16++) {
                    byte b10 = bArr[i16];
                    byte b11 = bArr2[i16];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 26:
                i10 = ((oh.o) obj2).b;
                i11 = ((oh.o) obj).b;
                break;
            case 27:
            default:
                i10 = ((u0) obj2).c;
                i11 = ((u0) obj).c;
                break;
            case 28:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
        }
        return i10 - i11;
    }
}
