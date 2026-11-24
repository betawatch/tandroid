// default package

import android.util.Pair;
import android.view.MenuItem;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class mz2 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ mz2(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long[] jArr;
        long[] jArr2;
        yq7 yq7Var;
        yq7 a;
        int i;
        int i2;
        switch (this.a) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 1:
                String name = ((File) obj).getName();
                byte b = nz2.f;
                return name.substring(0, b).compareTo(((File) obj2).getName().substring(0, b));
            case 2:
                tp3 tp3Var = (tp3) obj;
                tp3 tp3Var2 = (tp3) obj2;
                int x = up3.x(8);
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    int[] iArr = tp3Var.a;
                    jArr = tp3Var.b;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        z = z;
                        if ((i4 & 4) != 0) {
                            z = true;
                        }
                        z2 = z2;
                        if ((i4 & 8) != 0) {
                            z2 = true;
                        }
                        if (!z || !z2) {
                            i3++;
                            z = z;
                            z2 = z2;
                        }
                    }
                }
                int i5 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    int[] iArr2 = tp3Var2.a;
                    jArr2 = tp3Var2.b;
                    if (i5 < iArr2.length) {
                        int i6 = iArr2[i5];
                        z3 = z3;
                        if ((i6 & 4) != 0) {
                            z3 = true;
                        }
                        z4 = z4;
                        if ((i6 & 8) != 0) {
                            z4 = true;
                        }
                        if (!z3 || !z4) {
                            i5++;
                            z3 = z3;
                            z4 = z4;
                        }
                    }
                }
                long j = (z ? jArr[1] : 0L) + (z2 ? jArr[x] : 0L) + (tp3Var.e ? 1L : 0L);
                long j2 = (z3 ? jArr2[1] : 0L) + (z4 ? jArr2[x] : 0L) + (tp3Var2.e ? 1L : 0L);
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            case 3:
                return Long.compare(((d83) obj2).c, ((d83) obj).c);
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
                return Integer.compare(((kc3) ((List) obj).get(0)).f, ((kc3) ((List) obj2).get(0)).f);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                byte b2 = 9;
                byte b3 = 10;
                return uo2.f(rc3.c((rc3) Collections.max(list, new mz2(b2)), (rc3) Collections.max(list2, new mz2(b2)))).a(list.size(), list2.size()).b((rc3) Collections.max(list, new mz2(b3)), (rc3) Collections.max(list2, new mz2(b3)), new mz2(b3)).e();
            case 7:
                return ((jc3) Collections.max((List) obj)).compareTo((jc3) Collections.max((List) obj2));
            case 8:
                return ((oc3) ((List) obj).get(0)).compareTo((oc3) ((List) obj2).get(0));
            case 9:
                return rc3.c((rc3) obj, (rc3) obj2);
            case 10:
                rc3 rc3Var = (rc3) obj;
                rc3 rc3Var2 = (rc3) obj2;
                boolean z5 = rc3Var.e;
                int i7 = rc3Var.s;
                if (z5 && rc3Var.n) {
                    a = sc3.l;
                    yq7Var = a;
                } else {
                    yq7 yq7Var2 = sc3.l;
                    yq7Var = yq7Var2;
                    a = yq7Var2.a();
                }
                boolean z6 = rc3Var.f.F;
                wo2 wo2Var = wo2.a;
                if (z6) {
                    wo2Var = wo2Var.b(Integer.valueOf(i7), Integer.valueOf(rc3Var2.s), yq7Var.a());
                }
                wo2 b4 = wo2Var.c(rc3Var.P, rc3Var2.P).b(Integer.valueOf(rc3Var.w), Integer.valueOf(rc3Var2.w), a);
                if (rc3Var.L && rc3Var.N) {
                    b4 = b4.a(rc3Var.O, rc3Var2.O);
                }
                return b4.c(rc3Var.M, rc3Var2.M).b(Integer.valueOf(i7), Integer.valueOf(rc3Var2.s), a).e();
            case 11:
                i = ((uf3) obj2).b;
                i2 = ((uf3) obj).b;
                break;
            case 12:
                long j3 = y6c.h(((Integer) obj).intValue()).Z;
                long j4 = y6c.h(((Integer) obj2).intValue()).Z;
                if (j3 > j4) {
                    return 1;
                }
                return j3 >= j4 ? 0 : -1;
            case 13:
                int i8 = ((al3) obj).b;
                int i9 = ((al3) obj2).b;
                if (i8 < i9) {
                    return 1;
                }
                return i8 <= i9 ? 0 : -1;
            case 14:
                HashMap hashMap = vu3.h;
                Integer num3 = (Integer) hashMap.get((String) obj);
                Integer num4 = (Integer) hashMap.get((String) obj2);
                if (num3 == null) {
                    num3 = r5;
                }
                r5 = num4 != null ? num4 : 0;
                if (num3.intValue() <= r5.intValue()) {
                    return num3.intValue() < r5.intValue() ? 1 : 0;
                }
                return -1;
            case 15:
                h19 h19Var = (h19) obj2;
                String str = ((h19) obj).f;
                int i10 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = h19Var.f;
                return i10 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            case 16:
                long j5 = ((j94) obj).a;
                long j6 = ((j94) obj2).a;
                if (j5 > j6) {
                    return 1;
                }
                return j5 >= j6 ? 0 : -1;
            case 17:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 18:
                List list3 = gk4.r;
                return (list3.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list3.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 19:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b5 = bArr[i11];
                    byte b6 = bArr2[i11];
                    if (b5 != b6) {
                        return b5 - b6;
                    }
                }
                return 0;
            case 20:
                return Integer.compare(((x05) obj2).b, ((x05) obj).b);
            case 21:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 22:
                return ((ve5) obj).a.compareTo(((ve5) obj2).a);
            case 23:
                int i12 = ((nu2) obj).l;
                int i13 = ((nu2) obj2).l;
                if (i12 <= i13) {
                    return i12 < i13 ? 1 : 0;
                }
                return -1;
            case 24:
            case 26:
                i = ((j76) obj2).c;
                i2 = ((j76) obj).c;
                break;
            case 25:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 27:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 28:
                long j7 = y6c.h(((Integer) obj).intValue()).Z;
                long j8 = y6c.h(((Integer) obj2).intValue()).Z;
                if (j7 > j8) {
                    return 1;
                }
                return j7 >= j8 ? 0 : -1;
            default:
                fg5 fg5Var = (fg5) obj;
                fg5 fg5Var2 = (fg5) obj2;
                int compare = Integer.compare(fg5Var.b, fg5Var2.b);
                return compare == 0 ? Integer.compare(fg5Var2.d, fg5Var.d) : compare;
        }
        return i - i2;
    }

    public /* synthetic */ mz2(k76 k76Var, byte b) {
        this.a = b;
    }
}
