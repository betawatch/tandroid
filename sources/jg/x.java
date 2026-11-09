package jg;

import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.aj;
import org.telegram.messenger.g7;
import org.telegram.messenger.gf;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i7) {
        this.a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        int i7;
        int i10;
        int compare;
        switch (this.a) {
            case 0:
                int i11 = ((g0) obj).b;
                int i12 = ((g0) obj2).b;
                if (i11 < i12) {
                    return 1;
                }
                return i11 > i12 ? -1 : 0;
            case 1:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 2:
                int i13 = ((x1) obj).b;
                int i14 = ((x1) obj2).b;
                if (i13 < i14) {
                    return 1;
                }
                return i13 > i14 ? -1 : 0;
            case 3:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 4:
                return ((kg.s1) obj).c - ((kg.s1) obj2).c;
            case 5:
                return Integer.compare(((l4.d) obj).a.b, ((l4.d) obj2).a.b);
            case 6:
                return Long.compare(((l4.c) obj).b, ((l4.c) obj2).b);
            case 7:
                top = ((v4.d1) obj2).a.getTop();
                top2 = ((v4.d1) obj).a.getTop();
                break;
            case 8:
                top = Integer.bitCount(((Integer) obj2).intValue());
                top2 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 9:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i15 = 0; i15 < bArr.length; i15++) {
                    byte b10 = bArr[i15];
                    byte b11 = bArr2[i15];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 10:
                p2.b bVar = (p2.b) obj;
                p2.b bVar2 = (p2.b) obj2;
                int compare2 = Integer.compare(bVar.c, bVar2.c);
                return compare2 != 0 ? compare2 : bVar.b.compareTo(bVar2.b);
            case 11:
                org.telegram.messenger.d0 d0Var = (org.telegram.messenger.d0) obj;
                org.telegram.messenger.d0 d0Var2 = (org.telegram.messenger.d0) obj2;
                int i16 = d0Var.b;
                int i17 = d0Var2.b;
                if (i16 < i17) {
                    return -1;
                }
                if (i16 <= i17 && (i7 = d0Var.c) >= (i10 = d0Var2.c)) {
                    return i7 > i10 ? -1 : 0;
                }
                return 1;
            case 12:
                long j3 = ((org.telegram.messenger.y0) obj2).e;
                long j10 = ((org.telegram.messenger.y0) obj).e;
                if (j3 > j10) {
                    return -1;
                }
                return j3 < j10 ? 1 : 0;
            case 13:
                return org.telegram.messenger.g0.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 14:
                long j11 = ((TLRPC.TL_contact) obj).user_id;
                long j12 = ((TLRPC.TL_contact) obj2).user_id;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 15:
                HashMap hashMap = i6.h;
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
            case 16:
                long j13 = ((g7) obj).a;
                long j14 = ((g7) obj2).a;
                if (j13 > j14) {
                    return 1;
                }
                return j13 < j14 ? -1 : 0;
            case 17:
                ij ijVar = (ij) obj;
                ij ijVar2 = (ij) obj2;
                String[] strArr = MediaController.V1;
                int e12 = ijVar.e1();
                int e13 = ijVar2.e1();
                long j15 = ijVar.k.grouped_id;
                long j16 = ijVar2.k.grouped_id;
                if (e12 >= 0 || e13 >= 0) {
                    if (j15 == 0 || j15 != j16) {
                        return Integer.compare(e12, e13);
                    }
                    compare = Integer.compare(e13, e12);
                } else {
                    if (j15 == 0 || j15 != j16) {
                        return Integer.compare(e13, e12);
                    }
                    compare = Integer.compare(e12, e13);
                }
                return -compare;
            case 18:
                String[] strArr2 = MediaController.V1;
                long j17 = ((gf) obj).D;
                long j18 = ((gf) obj2).D;
                if (j17 < j18) {
                    return 1;
                }
                return j17 > j18 ? -1 : 0;
            case 19:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d2 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d2) {
                    return -1;
                }
                return d < d2 ? 1 : 0;
            case 20:
                int i18 = ((TLRPC.MessageEntity) obj).offset;
                int i19 = ((TLRPC.MessageEntity) obj2).offset;
                if (i18 > i19) {
                    return 1;
                }
                return i18 < i19 ? -1 : 0;
            case 21:
                double d10 = ((TLRPC.TL_topPeer) obj).rating;
                double d11 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d10 > d11) {
                    return -1;
                }
                return d10 < d11 ? 1 : 0;
            case 22:
                double d12 = ((TLRPC.TL_topPeer) obj).rating;
                double d13 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d12 > d13) {
                    return -1;
                }
                return d12 < d13 ? 1 : 0;
            case 23:
                int i20 = ((TLRPC.MessageEntity) obj).offset;
                int i21 = ((TLRPC.MessageEntity) obj2).offset;
                if (i20 > i21) {
                    return 1;
                }
                return i20 < i21 ? -1 : 0;
            case 24:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 25:
                int i22 = ((TLRPC.MessageEntity) obj).offset;
                int i23 = ((TLRPC.MessageEntity) obj2).offset;
                if (i22 > i23) {
                    return 1;
                }
                return i22 < i23 ? -1 : 0;
            case 26:
                top = ((String) obj2).length();
                top2 = ((String) obj).length();
                break;
            case 27:
                return ((aj) obj).a - ((aj) obj2).a;
            case 28:
                return org.telegram.messenger.g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            default:
                return org.telegram.messenger.g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
        }
        return top - top2;
    }
}
