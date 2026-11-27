// default package

import android.util.Pair;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class fna implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ fna(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x016d, code lost:
    
        if (r5 > r3) goto L83;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Float.compare(((gna) obj).c, ((gna) obj2).c);
            case 1:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
            case 2:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
            case 3:
                return (int) (((zza) obj2).d - ((zza) obj).d);
            case 4:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 5:
                ynb ynbVar = (ynb) obj;
                ynb ynbVar2 = (ynb) obj2;
                if (!aob.j1(ynbVar)) {
                    if (!aob.j1(ynbVar2)) {
                        ?? r5 = ynbVar.z;
                        ?? r3 = ynbVar2.z;
                        if (r5 == r3) {
                            int i = ynbVar.a;
                            int i2 = ynbVar2.a;
                            if (r5 != 0) {
                                if (i <= i2) {
                                    if (i >= i2) {
                                        return 0;
                                    }
                                }
                            } else if (i <= i2) {
                                if (i >= i2) {
                                    return 0;
                                }
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            case 6:
                znb znbVar = (znb) obj;
                znb znbVar2 = (znb) obj2;
                if (znbVar.b == null && znbVar.d == null) {
                    return -1;
                }
                if (znbVar2.b == null && znbVar2.d == null) {
                    return 1;
                }
                return znbVar.a.compareTo(znbVar2.a);
            case 7:
                return Integer.compare(((znb) obj).W, ((znb) obj2).W);
            case 8:
                return String.valueOf(d0f.c(((Integer) obj).intValue())).compareTo(String.valueOf(d0f.c(((Integer) obj2).intValue())));
            case 9:
                return (int) (((fsb) obj2).e - ((fsb) obj).e);
            case 10:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 11:
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj2;
                boolean z = tL_forumTopic.hidden;
                if (z == tL_forumTopic2.hidden) {
                    boolean z2 = tL_forumTopic.pinned;
                    boolean z3 = tL_forumTopic2.pinned;
                    if (z2 == z3) {
                        if (z2 && z3) {
                            return tL_forumTopic.pinnedOrder - tL_forumTopic2.pinnedOrder;
                        }
                        TLRPC.Message message = tL_forumTopic2.topMessage;
                        int i3 = message != null ? message.date : 0;
                        TLRPC.Message message2 = tL_forumTopic.topMessage;
                        return i3 - (message2 != null ? message2.date : 0);
                    }
                    if (z2) {
                        return -1;
                    }
                } else if (z) {
                    return -1;
                }
                return 1;
            case 12:
                long j = yac.h(((Integer) obj).intValue()).Z;
                long j2 = yac.h(((Integer) obj2).intValue()).Z;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            case 13:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 14:
                long j3 = yac.h(((Integer) obj).intValue()).Z;
                long j4 = yac.h(((Integer) obj2).intValue()).Z;
                if (j3 > j4) {
                    return 1;
                }
                return j3 < j4 ? -1 : 0;
            case 15:
                return Integer.compare(((nzc) obj).a.b, ((nzc) obj2).a.b);
            case 16:
                return Long.compare(((mzc) obj).b, ((mzc) obj2).b);
            default:
                return Long.compare(((h0d) obj2).A, ((h0d) obj).A);
        }
    }
}
