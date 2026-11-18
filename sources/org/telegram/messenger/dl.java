package org.telegram.messenger;

import android.graphics.Typeface;
import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class dl implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ dl(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        if (r0 > r1) goto L46;
     */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int e12;
        int e13;
        int i7;
        int i10;
        int i11;
        int i12;
        int lambda$initCamera$0;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                e12 = ((fj) obj2).e1();
                e13 = ((fj) obj).e1();
                break;
            case 1:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int a22 = mp.a2(update);
                int a23 = mp.a2(update2);
                if (a22 != a23) {
                    return g0.A(a22, a23);
                }
                if (a22 == 0) {
                    return g0.A(mp.Y1(update), mp.Y1(update2));
                }
                if (a22 == 1) {
                    return g0.A(update instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update).qts : 0, update2 instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update2).qts : 0);
                }
                if (a22 != 2) {
                    return 0;
                }
                long X1 = mp.X1(update);
                long X12 = mp.X1(update2);
                if (X1 == X12) {
                    return g0.A(mp.Y1(update), mp.Y1(update2));
                }
                Typeface typeface = g0.a;
                if (X1 == X12) {
                    return 0;
                }
                return X1 > X12 ? 1 : -1;
            case 2:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i15 = tL_savedReactionTag.count;
                int i16 = tL_savedReactionTag2.count;
                return i15 == i16 ? Long.compare(mp.S1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, mp.S1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE) : i16 - i15;
            case 3:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i17 = tL_savedReactionTag3.count;
                int i18 = tL_savedReactionTag4.count;
                return i17 == i18 ? Long.compare(mp.S1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, mp.S1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE) : i18 - i17;
            case 4:
                int i19 = ((ro) obj).f;
                int i20 = ((ro) obj2).f;
                if (i19 > i20) {
                    return 1;
                }
                return i19 < i20 ? -1 : 0;
            case 5:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                return g0.A(updates instanceof TLRPC.TL_updatesCombined ? updates.seq_start : updates.seq, updates2 instanceof TLRPC.TL_updatesCombined ? updates2.seq_start : updates2.seq);
            case 6:
                return g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 7:
                return g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 8:
                int i21 = ((ro) obj).f;
                int i22 = ((ro) obj2).f;
                if (i21 > i22) {
                    return 1;
                }
                return i21 < i22 ? -1 : 0;
            case 9:
                TLRPC.Message message = (TLRPC.Message) obj;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                if (fj.f3(message.id) || fj.f3(message2.id)) {
                    int i23 = message.date;
                    int i24 = message2.date;
                    if (i23 <= i24) {
                        if (i23 >= i24) {
                            if (!fj.f3(message.id) || fj.f3(message2.id)) {
                                if ((fj.f3(message.id) || !fj.f3(message2.id)) && (i7 = message.id) <= (i10 = message2.id)) {
                                    if (i7 >= i10) {
                                        return 0;
                                    }
                                }
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
                int i25 = message.id;
                if (i25 > 0 && (i12 = message2.id) > 0) {
                    if (i25 <= i12) {
                        if (i25 >= i12) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                if (i25 < 0 && (i11 = message2.id) < 0) {
                    if (i25 >= i11) {
                        if (i25 <= i11) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                int i26 = message.date;
                int i27 = message2.date;
                if (i26 <= i27) {
                    if (i26 >= i27) {
                        return 0;
                    }
                    return 1;
                }
                return -1;
            case 10:
                int i28 = ((ro) obj).f;
                int i29 = ((ro) obj2).f;
                if (i28 > i29) {
                    return 1;
                }
                return i28 < i29 ? -1 : 0;
            case 11:
                int i30 = ((jg.d0) obj).b;
                int i31 = ((jg.d0) obj2).b;
                if (i30 < i31) {
                    return 1;
                }
                return i30 > i31 ? -1 : 0;
            case 12:
                return Long.compare(((az) obj).b, ((az) obj2).b);
            case 13:
                return ((vt) obj).d - ((vt) obj2).d;
            case 14:
                e12 = ((ov) obj2).c();
                e13 = ((ov) obj).c();
                break;
            case 15:
                return ((ov) obj).k - ((ov) obj2).k;
            case 16:
                e12 = ((ov) obj2).c();
                e13 = ((ov) obj).c();
                break;
            case 17:
                int i32 = ((wv) obj).b.out_seq_no;
                int i33 = ((wv) obj2).b.out_seq_no;
                if (i32 > i33) {
                    return 1;
                }
                return i32 < i33 ? -1 : 0;
            case 18:
                return g0.A(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
            case 19:
                az azVar = (az) obj;
                az azVar2 = (az) obj2;
                az azVar3 = bz.B1;
                long j3 = azVar3 == azVar ? -200000L : 0L;
                if (!azVar.d) {
                    j3 += 100000;
                }
                long j10 = azVar3 == azVar2 ? -200000L : 0L;
                if (!azVar2.d) {
                    j10 += 100000;
                }
                return Long.compare(azVar.b + j3, azVar2.b + j10);
            case 20:
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj2;
                boolean z10 = tL_forumTopic.hidden;
                if (z10 == tL_forumTopic2.hidden) {
                    boolean z11 = tL_forumTopic.pinned;
                    boolean z12 = tL_forumTopic2.pinned;
                    if (z11 == z12) {
                        if (z11 && z12) {
                            return tL_forumTopic.pinnedOrder - tL_forumTopic2.pinnedOrder;
                        }
                        TLRPC.Message message3 = tL_forumTopic2.topMessage;
                        int i34 = message3 != null ? message3.date : 0;
                        TLRPC.Message message4 = tL_forumTopic.topMessage;
                        return i34 - (message4 != null ? message4.date : 0);
                    }
                    if (z11) {
                        return -1;
                    }
                } else if (z10) {
                    return -1;
                }
                return 1;
            case 21:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 22:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 23:
                List list = org.telegram.ui.ActionBar.m4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 24:
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) obj;
                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) obj2;
                if (m6Var.b == null && m6Var.d == null) {
                    return -1;
                }
                if (m6Var2.b == null && m6Var2.d == null) {
                    return 1;
                }
                return m6Var.a.compareTo(m6Var2.a);
            case 25:
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) obj;
                org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) obj2;
                if (!org.telegram.ui.ActionBar.n6.l1(k6Var)) {
                    if (!org.telegram.ui.ActionBar.n6.l1(k6Var2)) {
                        ?? r02 = k6Var.z;
                        ?? r12 = k6Var2.z;
                        if (r02 == r12) {
                            if (r02 != 0) {
                                int i35 = k6Var.a;
                                int i36 = k6Var2.a;
                                if (i35 <= i36) {
                                    if (i35 >= i36) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i37 = k6Var.a;
                                int i38 = k6Var2.a;
                                if (i37 <= i38) {
                                    if (i37 >= i38) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            case 26:
                long j11 = ((org.telegram.ui.r6) obj2).c;
                long j12 = ((org.telegram.ui.r6) obj).c;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 27:
                return Long.compare(((org.telegram.ui.t6) obj2).g, ((org.telegram.ui.t6) obj).g);
            case 28:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) obj2;
                float f10 = q1Var.e;
                float f11 = q1Var2.e;
                if (f10 <= f11) {
                    if (f10 < f11 || (i13 = q1Var.d) > (i14 = q1Var2.d)) {
                        return 1;
                    }
                    if (i13 >= i14) {
                        return 0;
                    }
                }
                return -1;
            default:
                return ((fj) obj).e1() - ((fj) obj2).e1();
        }
        return e12 - e13;
    }

    public /* synthetic */ dl(mp mpVar, int i7) {
        this.a = i7;
    }
}
