package a4;

import ag.h3;
import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import kg.y1;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b1;
import org.telegram.messenger.bj;
import org.telegram.messenger.ef;
import org.telegram.messenger.f0;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.k7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import s4.c1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        int i10;
        int i11;
        int compare;
        switch (this.a) {
            case 0:
                return Integer.compare(((e) obj2).b, ((e) obj).b);
            case 1:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 2:
                return ((h3) obj).c - ((h3) obj2).c;
            case 3:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 4:
                String name = ((File) obj).getName();
                int i12 = ca.b.f;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
            case 5:
                top = ((c1) obj2).a.getTop();
                top2 = ((c1) obj).a.getTop();
                break;
            case 6:
                return Integer.compare(((i4.d) obj).a.b, ((i4.d) obj2).a.b);
            case 7:
                return Long.compare(((i4.c) obj).b, ((i4.c) obj2).b);
            case 8:
                top = Integer.bitCount(((Integer) obj2).intValue());
                top2 = Integer.bitCount(((Integer) obj).intValue());
                break;
            case 9:
                return (int) ((((y1) obj).a * 100.0f) - (((y1) obj2).a * 100.0f));
            case 10:
                m2.b bVar = (m2.b) obj;
                m2.b bVar2 = (m2.b) obj2;
                int compare2 = Integer.compare(bVar.c, bVar2.c);
                return compare2 != 0 ? compare2 : bVar.b.compareTo(bVar2.b);
            case 11:
                return ((String) obj).compareTo((String) obj2);
            case 12:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i13 = 0; i13 < bArr.length; i13++) {
                    byte b10 = bArr[i13];
                    byte b11 = bArr2[i13];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 13:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                int i14 = f0Var.b;
                int i15 = f0Var2.b;
                if (i14 < i15) {
                    return -1;
                }
                if (i14 <= i15 && (i10 = f0Var.c) >= (i11 = f0Var2.c)) {
                    return i10 > i11 ? -1 : 0;
                }
                return 1;
            case 14:
                long j10 = ((b1) obj2).e;
                long j11 = ((b1) obj).e;
                if (j10 > j11) {
                    return -1;
                }
                return j10 < j11 ? 1 : 0;
            case 15:
                return i0.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 16:
                long j12 = ((TLRPC.TL_contact) obj).user_id;
                long j13 = ((TLRPC.TL_contact) obj2).user_id;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 17:
                HashMap hashMap = k6.h;
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
            case 18:
                long j14 = ((k7) obj).a;
                long j15 = ((k7) obj2).a;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 19:
                jj jjVar = (jj) obj;
                jj jjVar2 = (jj) obj2;
                String[] strArr = MediaController.U1;
                int f12 = jjVar.f1();
                int f13 = jjVar2.f1();
                long j16 = jjVar.k.grouped_id;
                long j17 = jjVar2.k.grouped_id;
                if (f12 >= 0 || f13 >= 0) {
                    if (j16 == 0 || j16 != j17) {
                        return Integer.compare(f12, f13);
                    }
                    compare = Integer.compare(f13, f12);
                } else {
                    if (j16 == 0 || j16 != j17) {
                        return Integer.compare(f13, f12);
                    }
                    compare = Integer.compare(f12, f13);
                }
                return -compare;
            case 20:
                String[] strArr2 = MediaController.U1;
                long j18 = ((ef) obj).D;
                long j19 = ((ef) obj2).D;
                if (j18 < j19) {
                    return 1;
                }
                return j18 > j19 ? -1 : 0;
            case 21:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d10 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d10) {
                    return -1;
                }
                return d < d10 ? 1 : 0;
            case 22:
                int i16 = ((TLRPC.MessageEntity) obj).offset;
                int i17 = ((TLRPC.MessageEntity) obj2).offset;
                if (i16 > i17) {
                    return 1;
                }
                return i16 < i17 ? -1 : 0;
            case 23:
                double d11 = ((TLRPC.TL_topPeer) obj).rating;
                double d12 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d11 > d12) {
                    return -1;
                }
                return d11 < d12 ? 1 : 0;
            case 24:
                double d13 = ((TLRPC.TL_topPeer) obj).rating;
                double d14 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d13 > d14) {
                    return -1;
                }
                return d13 < d14 ? 1 : 0;
            case 25:
                int i18 = ((TLRPC.MessageEntity) obj).offset;
                int i19 = ((TLRPC.MessageEntity) obj2).offset;
                if (i18 > i19) {
                    return 1;
                }
                return i18 < i19 ? -1 : 0;
            case 26:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 27:
                int i20 = ((TLRPC.MessageEntity) obj).offset;
                int i21 = ((TLRPC.MessageEntity) obj2).offset;
                if (i20 > i21) {
                    return 1;
                }
                return i20 < i21 ? -1 : 0;
            case 28:
                top = ((String) obj2).length();
                top2 = ((String) obj).length();
                break;
            default:
                return ((bj) obj).a - ((bj) obj2).a;
        }
        return top - top2;
    }
}
