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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class f03 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ f03(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long[] jArr;
        long[] jArr2;
        eu7 eu7Var;
        eu7 a;
        int i;
        int i2;
        switch (this.a) {
            case 0:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 1:
                String name = ((File) obj).getName();
                byte b = g03.f;
                return name.substring(0, b).compareTo(((File) obj2).getName().substring(0, b));
            case 2:
                kq3 kq3Var = (kq3) obj;
                kq3 kq3Var2 = (kq3) obj2;
                int x = lq3.x(8);
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    int[] iArr = kq3Var.a;
                    jArr = kq3Var.b;
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
                    int[] iArr2 = kq3Var2.a;
                    jArr2 = kq3Var2.b;
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
                long j = (z ? jArr[1] : 0L) + (z2 ? jArr[x] : 0L) + (kq3Var.e ? 1L : 0L);
                long j2 = (z3 ? jArr2[1] : 0L) + (z4 ? jArr2[x] : 0L) + (kq3Var2.e ? 1L : 0L);
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            case 3:
                return Long.compare(((w83) obj2).c, ((w83) obj).c);
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
                return Integer.compare(((dd3) ((List) obj).get(0)).f, ((dd3) ((List) obj2).get(0)).f);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                byte b2 = 9;
                byte b3 = 10;
                return np2.f(kd3.c((kd3) Collections.max(list, new f03(b2)), (kd3) Collections.max(list2, new f03(b2)))).a(list.size(), list2.size()).b((kd3) Collections.max(list, new f03(b3)), (kd3) Collections.max(list2, new f03(b3)), new f03(b3)).e();
            case 7:
                return ((cd3) Collections.max((List) obj)).compareTo((cd3) Collections.max((List) obj2));
            case 8:
                return ((hd3) ((List) obj).get(0)).compareTo((hd3) ((List) obj2).get(0));
            case 9:
                return kd3.c((kd3) obj, (kd3) obj2);
            case 10:
                kd3 kd3Var = (kd3) obj;
                kd3 kd3Var2 = (kd3) obj2;
                boolean z5 = kd3Var.e;
                int i7 = kd3Var.s;
                if (z5 && kd3Var.n) {
                    a = ld3.l;
                    eu7Var = a;
                } else {
                    eu7 eu7Var2 = ld3.l;
                    eu7Var = eu7Var2;
                    a = eu7Var2.a();
                }
                boolean z6 = kd3Var.f.F;
                pp2 pp2Var = pp2.a;
                if (z6) {
                    pp2Var = pp2Var.b(Integer.valueOf(i7), Integer.valueOf(kd3Var2.s), eu7Var.a());
                }
                pp2 b4 = pp2Var.c(kd3Var.P, kd3Var2.P).b(Integer.valueOf(kd3Var.w), Integer.valueOf(kd3Var2.w), a);
                if (kd3Var.L && kd3Var.N) {
                    b4 = b4.a(kd3Var.O, kd3Var2.O);
                }
                return b4.c(kd3Var.M, kd3Var2.M).b(Integer.valueOf(i7), Integer.valueOf(kd3Var2.s), a).e();
            case 11:
                i = ((og3) obj2).b;
                i2 = ((og3) obj).b;
                break;
            case 12:
                long j3 = yac.h(((Integer) obj).intValue()).Z;
                long j4 = yac.h(((Integer) obj2).intValue()).Z;
                if (j3 > j4) {
                    return 1;
                }
                return j3 >= j4 ? 0 : -1;
            case 13:
                int i8 = ((sl3) obj).b;
                int i9 = ((sl3) obj2).b;
                if (i8 < i9) {
                    return 1;
                }
                return i8 <= i9 ? 0 : -1;
            case 14:
                HashMap hashMap = pv3.h;
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
                w49 w49Var = (w49) obj2;
                String str = ((w49) obj).f;
                int i10 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = w49Var.f;
                return i10 - ((str2 == null || !str2.equals("❤")) ? 0 : -1);
            case 16:
                return Float.compare(((float[]) obj)[0], ((float[]) obj2)[0]);
            case 17:
                long j5 = ((fb4) obj).a;
                long j6 = ((fb4) obj2).a;
                if (j5 > j6) {
                    return 1;
                }
                return j5 >= j6 ? 0 : -1;
            case 18:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 19:
                List list3 = lm4.r;
                return (list3.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list3.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 20:
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
            case 21:
                return Integer.compare(((b35) obj2).b, ((b35) obj).b);
            case 22:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 23:
                return ((xg5) obj).a.compareTo(((xg5) obj2).a);
            case 24:
                int i12 = ((iv2) obj).l;
                int i13 = ((iv2) obj2).l;
                if (i12 <= i13) {
                    return i12 < i13 ? 1 : 0;
                }
                return -1;
            case 25:
            case 27:
                i = ((n96) obj2).c;
                i2 = ((n96) obj).c;
                break;
            case 26:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 28:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            default:
                long j7 = yac.h(((Integer) obj).intValue()).Z;
                long j8 = yac.h(((Integer) obj2).intValue()).Z;
                if (j7 > j8) {
                    return 1;
                }
                return j7 >= j8 ? 0 : -1;
        }
        return i - i2;
    }

    public /* synthetic */ f03(o96 o96Var, byte b) {
        this.a = b;
    }
}
