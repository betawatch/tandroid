// default package

import android.graphics.Typeface;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class el6 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ el6(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.a) {
            case 0:
                String[] strArr = MediaController.W1;
                long j = ((jm6) obj).D;
                long j2 = ((jm6) obj2).D;
                if (j < j2) {
                    return 1;
                }
                return j > j2 ? -1 : 0;
            case 1:
                k27 k27Var = (k27) obj;
                k27 k27Var2 = (k27) obj2;
                String[] strArr2 = MediaController.W1;
                int e1 = k27Var.e1();
                int e12 = k27Var2.e1();
                long j3 = k27Var.k.grouped_id;
                long j4 = k27Var2.k.grouped_id;
                if (e1 >= 0 || e12 >= 0) {
                    if (j3 == 0 || j3 != j4) {
                        return Integer.compare(e1, e12);
                    }
                    compare = Integer.compare(e12, e1);
                } else {
                    if (j3 == 0 || j3 != j4) {
                        return Integer.compare(e12, e1);
                    }
                    compare = Integer.compare(e1, e12);
                }
                return -compare;
            case 2:
                double d = ((TLRPC.TL_topPeer) obj).rating;
                double d2 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d > d2) {
                    return -1;
                }
                return d < d2 ? 1 : 0;
            case 3:
                int i7 = ((TLRPC.MessageEntity) obj).offset;
                int i8 = ((TLRPC.MessageEntity) obj2).offset;
                if (i7 > i8) {
                    return 1;
                }
                return i7 < i8 ? -1 : 0;
            case 4:
                double d3 = ((TLRPC.TL_topPeer) obj).rating;
                double d4 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d3 > d4) {
                    return -1;
                }
                return d3 < d4 ? 1 : 0;
            case 5:
                double d5 = ((TLRPC.TL_topPeer) obj).rating;
                double d6 = ((TLRPC.TL_topPeer) obj2).rating;
                if (d5 > d6) {
                    return -1;
                }
                return d5 < d6 ? 1 : 0;
            case 6:
                int i9 = ((TLRPC.MessageEntity) obj).offset;
                int i10 = ((TLRPC.MessageEntity) obj2).offset;
                if (i9 > i10) {
                    return 1;
                }
                return i9 < i10 ? -1 : 0;
            case 7:
                return Integer.compare(((TLRPC.MessageEntity) obj).offset, ((TLRPC.MessageEntity) obj2).offset);
            case 8:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 9:
                int i11 = ((TLRPC.MessageEntity) obj).offset;
                int i12 = ((TLRPC.MessageEntity) obj2).offset;
                if (i11 > i12) {
                    return 1;
                }
                return i11 < i12 ? -1 : 0;
            case 10:
                return ((String) obj2).length() - ((String) obj).length();
            case 11:
                return ((c27) obj).a - ((c27) obj2).a;
            case 12:
                return gl.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 13:
                return ((k27) obj2).e1() - ((k27) obj).e1();
            case 14:
                k27 k27Var3 = (k27) obj;
                k27 k27Var4 = (k27) obj2;
                if (k27Var3.k.date != k27Var4.k.date || k27Var3.e1() < 0 || k27Var4.e1() < 0) {
                    i = k27Var4.k.date;
                    i2 = k27Var3.k.date;
                } else {
                    i = k27Var4.e1();
                    i2 = k27Var3.e1();
                }
                return i - i2;
            case 15:
                return ((k27) obj2).e1() - ((k27) obj).e1();
            case 16:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int T1 = na7.T1(update);
                int T12 = na7.T1(update2);
                if (T1 != T12) {
                    return gl.A(T1, T12);
                }
                if (T1 == 0) {
                    return gl.A(na7.R1(update), na7.R1(update2));
                }
                if (T1 == 1) {
                    return gl.A(update instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update).qts : 0, update2 instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update2).qts : 0);
                }
                if (T1 != 2) {
                    return 0;
                }
                long Q1 = na7.Q1(update);
                long Q12 = na7.Q1(update2);
                if (Q1 == Q12) {
                    return gl.A(na7.R1(update), na7.R1(update2));
                }
                Typeface typeface = gl.a;
                if (Q1 != Q12) {
                    return Q1 > Q12 ? 1 : -1;
                }
                return 0;
            case 17:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i13 = tL_savedReactionTag.count;
                int i14 = tL_savedReactionTag2.count;
                return i13 == i14 ? Long.compare(na7.N1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, na7.N1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE) : i14 - i13;
            case 18:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i15 = tL_savedReactionTag3.count;
                int i16 = tL_savedReactionTag4.count;
                return i15 == i16 ? Long.compare(na7.N1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, na7.N1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE) : i16 - i15;
            case 19:
                int i17 = ((t97) obj).f;
                int i18 = ((t97) obj2).f;
                if (i17 > i18) {
                    return 1;
                }
                return i17 < i18 ? -1 : 0;
            case 20:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                return gl.A(updates instanceof TLRPC.TL_updatesCombined ? updates.seq_start : updates.seq, updates2 instanceof TLRPC.TL_updatesCombined ? updates2.seq_start : updates2.seq);
            case 21:
                return gl.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 22:
                return gl.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 23:
                int i19 = ((t97) obj).f;
                int i20 = ((t97) obj2).f;
                if (i19 > i20) {
                    return 1;
                }
                return i19 < i20 ? -1 : 0;
            case 24:
                TLRPC.Message message = (TLRPC.Message) obj;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                if (k27.f3(message.id) || k27.f3(message2.id)) {
                    int i21 = message.date;
                    int i22 = message2.date;
                    if (i21 <= i22) {
                        if (i21 >= i22) {
                            if (!k27.f3(message.id) || k27.f3(message2.id)) {
                                if ((k27.f3(message.id) || !k27.f3(message2.id)) && (i3 = message.id) <= (i4 = message2.id)) {
                                    if (i3 >= i4) {
                                        return 0;
                                    }
                                }
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
                int i23 = message.id;
                if (i23 > 0 && (i6 = message2.id) > 0) {
                    if (i23 <= i6) {
                        if (i23 >= i6) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                if (i23 < 0 && (i5 = message2.id) < 0) {
                    if (i23 >= i5) {
                        if (i23 <= i5) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                int i24 = message.date;
                int i25 = message2.date;
                if (i24 <= i25) {
                    if (i24 >= i25) {
                        return 0;
                    }
                    return 1;
                }
                return -1;
            case 25:
                int i26 = ((t97) obj).f;
                int i27 = ((t97) obj2).f;
                if (i26 > i27) {
                    return 1;
                }
                return i26 < i27 ? -1 : 0;
            case 26:
                int i28 = ((xk3) obj).b;
                int i29 = ((xk3) obj2).b;
                if (i28 < i29) {
                    return 1;
                }
                return i28 > i29 ? -1 : 0;
            case 27:
                long j5 = y6c.h(((Integer) obj).intValue()).Z;
                long j6 = y6c.h(((Integer) obj2).intValue()).Z;
                if (j5 > j6) {
                    return 1;
                }
                return j5 < j6 ? -1 : 0;
            case 28:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            default:
                return ((Integer) obj2).intValue() - ((Integer) obj).intValue();
        }
    }

    public /* synthetic */ el6(na7 na7Var, byte b) {
        this.a = b;
    }
}
