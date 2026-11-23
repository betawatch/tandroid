package jg;

import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ff;
import org.telegram.messenger.g7;
import org.telegram.messenger.gj;
import org.telegram.messenger.j6;
import org.telegram.messenger.yi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i7) {
        this.a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int bitCount;
        int bitCount2;
        int i7;
        int i10;
        int compare;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
                int i13 = ((g0) obj).b;
                int i14 = ((g0) obj2).b;
                if (i13 < i14) {
                    return 1;
                }
                return i13 > i14 ? -1 : 0;
            case 1:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 2:
                int i15 = ((x1) obj).b;
                int i16 = ((x1) obj2).b;
                if (i15 < i16) {
                    return 1;
                }
                return i15 > i16 ? -1 : 0;
            case 3:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 4:
                return ((kg.u1) obj).c - ((kg.u1) obj2).c;
            case 5:
                return Integer.compare(((l4.d) obj).a.b, ((l4.d) obj2).a.b);
            case 6:
                return Long.compare(((l4.c) obj).b, ((l4.c) obj2).b);
            case 7:
                bitCount = Integer.bitCount(((Integer) obj2).intValue());
                bitCount2 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 8:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i17 = 0; i17 < bArr.length; i17++) {
                    byte b10 = bArr[i17];
                    byte b11 = bArr2[i17];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 9:
                p2.b bVar = (p2.b) obj;
                p2.b bVar2 = (p2.b) obj2;
                int compare2 = Integer.compare(bVar.c, bVar2.c);
                return compare2 != 0 ? compare2 : bVar.b.compareTo(bVar2.b);
            case 10:
                org.telegram.messenger.d0 d0Var = (org.telegram.messenger.d0) obj;
                org.telegram.messenger.d0 d0Var2 = (org.telegram.messenger.d0) obj2;
                int i18 = d0Var.b;
                int i19 = d0Var2.b;
                if (i18 < i19) {
                    return -1;
                }
                if (i18 <= i19 && (i7 = d0Var.c) >= (i10 = d0Var2.c)) {
                    return i7 > i10 ? -1 : 0;
                }
                return 1;
            case 11:
                long j3 = ((org.telegram.messenger.y0) obj2).e;
                long j10 = ((org.telegram.messenger.y0) obj).e;
                if (j3 > j10) {
                    return -1;
                }
                return j3 < j10 ? 1 : 0;
            case 12:
                return org.telegram.messenger.g0.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 13:
                long j11 = ((TLRPC.TL_contact) obj).user_id;
                long j12 = ((TLRPC.TL_contact) obj2).user_id;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 14:
                HashMap hashMap = j6.h;
                Integer num = (Integer) hashMap.get((String) obj);
                Integer num2 = (Integer) hashMap.get((String) obj2);
                if (num == null) {
                    num = r0;
                }
                r0 = num2 != null ? num2 : 0;
                if (num.intValue() > r0.intValue()) {
                    return -1;
                }
                return num.intValue() < r0.intValue() ? 1 : 0;
            case 15:
                long j13 = ((g7) obj).a;
                long j14 = ((g7) obj2).a;
                if (j13 > j14) {
                    return 1;
                }
                return j13 < j14 ? -1 : 0;
            case 16:
                String[] strArr = MediaController.W1;
                long j15 = ((ff) obj).D;
                long j16 = ((ff) obj2).D;
                if (j15 < j16) {
                    return 1;
                }
                return j15 > j16 ? -1 : 0;
            case 17:
                gj gjVar = (gj) obj;
                gj gjVar2 = (gj) obj2;
                String[] strArr2 = MediaController.W1;
                int e12 = gjVar.e1();
                int e13 = gjVar2.e1();
                long j17 = gjVar.k.grouped_id;
                long j18 = gjVar2.k.grouped_id;
                if (e12 >= 0 || e13 >= 0) {
                    if (j17 == 0 || j17 != j18) {
                        return Integer.compare(e12, e13);
                    }
                    compare = Integer.compare(e13, e12);
                } else {
                    if (j17 == 0 || j17 != j18) {
                        return Integer.compare(e13, e12);
                    }
                    compare = Integer.compare(e12, e13);
                }
                return -compare;
            case 18:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d2 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d2) {
                    return -1;
                }
                return d < d2 ? 1 : 0;
            case 19:
                int i20 = ((TLRPC.MessageEntity) obj).offset;
                int i21 = ((TLRPC.MessageEntity) obj2).offset;
                if (i20 > i21) {
                    return 1;
                }
                return i20 < i21 ? -1 : 0;
            case 20:
                double d10 = ((TLRPC.TL_topPeer) obj).rating;
                double d11 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d10 > d11) {
                    return -1;
                }
                return d10 < d11 ? 1 : 0;
            case 21:
                double d12 = ((TLRPC.TL_topPeer) obj).rating;
                double d13 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d12 > d13) {
                    return -1;
                }
                return d12 < d13 ? 1 : 0;
            case 22:
                int i22 = ((TLRPC.MessageEntity) obj).offset;
                int i23 = ((TLRPC.MessageEntity) obj2).offset;
                if (i22 > i23) {
                    return 1;
                }
                return i22 < i23 ? -1 : 0;
            case 23:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 24:
                int i24 = ((TLRPC.MessageEntity) obj).offset;
                int i25 = ((TLRPC.MessageEntity) obj2).offset;
                if (i24 > i25) {
                    return 1;
                }
                return i24 < i25 ? -1 : 0;
            case 25:
                bitCount = ((String) obj2).length();
                bitCount2 = ((String) obj).length();
                break;
            case 26:
                return ((yi) obj).a - ((yi) obj2).a;
            case 27:
                return org.telegram.messenger.g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 28:
                bitCount = ((gj) obj2).e1();
                bitCount2 = ((gj) obj).e1();
                break;
            default:
                gj gjVar3 = (gj) obj;
                gj gjVar4 = (gj) obj2;
                if (gjVar3.k.date != gjVar4.k.date || gjVar3.e1() < 0 || gjVar4.e1() < 0) {
                    i11 = gjVar4.k.date;
                    i12 = gjVar3.k.date;
                } else {
                    i11 = gjVar4.e1();
                    i12 = gjVar3.e1();
                }
                return i11 - i12;
        }
        return bitCount - bitCount2;
    }
}
