package o0;

import android.graphics.Typeface;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d0;
import org.telegram.messenger.g0;
import org.telegram.messenger.g7;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.mo;
import org.telegram.messenger.ri;
import org.telegram.messenger.y0;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i3) {
        this.a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i3;
        int i10;
        int compare;
        int length;
        int length2;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
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
            case 1:
                d0 d0Var = (d0) obj;
                d0 d0Var2 = (d0) obj2;
                int i14 = d0Var.b;
                int i15 = d0Var2.b;
                if (i14 < i15) {
                    return -1;
                }
                if (i14 <= i15 && (i3 = d0Var.c) >= (i10 = d0Var2.c)) {
                    return i3 > i10 ? -1 : 0;
                }
                return 1;
            case 2:
                long j10 = ((y0) obj2).e;
                long j11 = ((y0) obj).e;
                if (j10 > j11) {
                    return -1;
                }
                return j10 < j11 ? 1 : 0;
            case 3:
                return g0.A(((TL_update.TL_updateGroupCallParticipants) obj).version, ((TL_update.TL_updateGroupCallParticipants) obj2).version);
            case 4:
                long j12 = ((TLRPC.TL_contact) obj).user_id;
                long j13 = ((TLRPC.TL_contact) obj2).user_id;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 5:
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
            case 6:
                long j14 = ((g7) obj).a;
                long j15 = ((g7) obj2).a;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 7:
                zi ziVar = (zi) obj;
                zi ziVar2 = (zi) obj2;
                String[] strArr = MediaController.W1;
                int f12 = ziVar.f1();
                int f13 = ziVar2.f1();
                long j16 = ziVar.k.grouped_id;
                long j17 = ziVar2.k.grouped_id;
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
            case 8:
                String[] strArr2 = MediaController.W1;
                long j18 = ((ye) obj).D;
                long j19 = ((ye) obj2).D;
                if (j18 < j19) {
                    return 1;
                }
                return j18 > j19 ? -1 : 0;
            case 9:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d10 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d10) {
                    return -1;
                }
                return d < d10 ? 1 : 0;
            case 10:
                int i16 = ((TLRPC.MessageEntity) obj).offset;
                int i17 = ((TLRPC.MessageEntity) obj2).offset;
                if (i16 > i17) {
                    return 1;
                }
                return i16 < i17 ? -1 : 0;
            case 11:
                double d11 = ((TLRPC.TL_topPeer) obj).rating;
                double d12 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d11 > d12) {
                    return -1;
                }
                return d11 < d12 ? 1 : 0;
            case 12:
                double d13 = ((TLRPC.TL_topPeer) obj).rating;
                double d14 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d13 > d14) {
                    return -1;
                }
                return d13 < d14 ? 1 : 0;
            case 13:
                int i18 = ((TLRPC.MessageEntity) obj).offset;
                int i19 = ((TLRPC.MessageEntity) obj2).offset;
                if (i18 > i19) {
                    return 1;
                }
                return i18 < i19 ? -1 : 0;
            case 14:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 15:
                int i20 = ((TLRPC.MessageEntity) obj).offset;
                int i21 = ((TLRPC.MessageEntity) obj2).offset;
                if (i20 > i21) {
                    return 1;
                }
                return i20 < i21 ? -1 : 0;
            case 16:
                length = ((String) obj2).length();
                length2 = ((String) obj).length();
                break;
            case 17:
                return ((ri) obj).a - ((ri) obj2).a;
            case 18:
                return g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 19:
                return g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 20:
                return g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 21:
                length = ((zi) obj2).f1();
                length2 = ((zi) obj).f1();
                break;
            case 22:
                zi ziVar3 = (zi) obj;
                zi ziVar4 = (zi) obj2;
                if (ziVar3.k.date != ziVar4.k.date || ziVar3.f1() < 0 || ziVar4.f1() < 0) {
                    i11 = ziVar4.k.date;
                    i12 = ziVar3.k.date;
                } else {
                    i11 = ziVar4.f1();
                    i12 = ziVar3.f1();
                }
                return i11 - i12;
            case 23:
                length = ((zi) obj2).f1();
                length2 = ((zi) obj).f1();
                break;
            case 24:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int Y1 = hp.Y1(update);
                int Y12 = hp.Y1(update2);
                if (Y1 != Y12) {
                    return g0.A(Y1, Y12);
                }
                if (Y1 == 0) {
                    return g0.A(hp.W1(update), hp.W1(update2));
                }
                if (Y1 == 1) {
                    return g0.A(update instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update).qts : 0, update2 instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update2).qts : 0);
                }
                if (Y1 == 2) {
                    long V1 = hp.V1(update);
                    long V12 = hp.V1(update2);
                    if (V1 == V12) {
                        return g0.A(hp.W1(update), hp.W1(update2));
                    }
                    Typeface typeface = g0.a;
                    if (V1 != V12) {
                        return V1 > V12 ? 1 : -1;
                    }
                }
                return 0;
            case 25:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i22 = tL_savedReactionTag.count;
                int i23 = tL_savedReactionTag2.count;
                return i22 == i23 ? Long.compare(hp.Q1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, hp.Q1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE) : i23 - i22;
            case 26:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i24 = tL_savedReactionTag3.count;
                int i25 = tL_savedReactionTag4.count;
                return i24 == i25 ? Long.compare(hp.Q1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, hp.Q1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE) : i25 - i24;
            case 27:
                int i26 = ((mo) obj).f;
                int i27 = ((mo) obj2).f;
                if (i26 > i27) {
                    return 1;
                }
                return i26 < i27 ? -1 : 0;
            case 28:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                return g0.A(updates instanceof TLRPC.TL_updatesCombined ? updates.seq_start : updates.seq, updates2 instanceof TLRPC.TL_updatesCombined ? updates2.seq_start : updates2.seq);
            default:
                int i28 = ((mo) obj).f;
                int i29 = ((mo) obj2).f;
                if (i28 > i29) {
                    return 1;
                }
                return i28 < i29 ? -1 : 0;
        }
        return length - length2;
    }

    public /* synthetic */ a(hp hpVar, int i3) {
        this.a = i3;
    }
}
