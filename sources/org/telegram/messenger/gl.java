package org.telegram.messenger;

import android.graphics.Typeface;
import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class gl implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ gl(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        if (r0 > r1) goto L46;
     */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        int e12;
        int e13;
        int i11;
        int i12;
        int i13;
        int i14;
        int lambda$initCamera$0;
        int i15;
        int i16;
        switch (this.a) {
            case 0:
                gj gjVar = (gj) obj;
                gj gjVar2 = (gj) obj2;
                if (gjVar.k.date != gjVar2.k.date || gjVar.e1() < 0 || gjVar2.e1() < 0) {
                    i7 = gjVar2.k.date;
                    i10 = gjVar.k.date;
                } else {
                    i7 = gjVar2.e1();
                    i10 = gjVar.e1();
                }
                return i7 - i10;
            case 1:
                e12 = ((gj) obj2).e1();
                e13 = ((gj) obj).e1();
                break;
            case 2:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int Y1 = np.Y1(update);
                int Y12 = np.Y1(update2);
                if (Y1 != Y12) {
                    return g0.A(Y1, Y12);
                }
                if (Y1 == 0) {
                    return g0.A(np.W1(update), np.W1(update2));
                }
                if (Y1 == 1) {
                    return g0.A(update instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update).qts : 0, update2 instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update2).qts : 0);
                }
                if (Y1 != 2) {
                    return 0;
                }
                long V1 = np.V1(update);
                long V12 = np.V1(update2);
                if (V1 == V12) {
                    return g0.A(np.W1(update), np.W1(update2));
                }
                Typeface typeface = g0.a;
                if (V1 == V12) {
                    return 0;
                }
                return V1 > V12 ? 1 : -1;
            case 3:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i17 = tL_savedReactionTag.count;
                int i18 = tL_savedReactionTag2.count;
                return i17 == i18 ? Long.compare(np.Q1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, np.Q1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE) : i18 - i17;
            case 4:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i19 = tL_savedReactionTag3.count;
                int i20 = tL_savedReactionTag4.count;
                return i19 == i20 ? Long.compare(np.Q1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, np.Q1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE) : i20 - i19;
            case 5:
                int i21 = ((so) obj).f;
                int i22 = ((so) obj2).f;
                if (i21 > i22) {
                    return 1;
                }
                return i21 < i22 ? -1 : 0;
            case 6:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                return g0.A(updates instanceof TLRPC.TL_updatesCombined ? updates.seq_start : updates.seq, updates2 instanceof TLRPC.TL_updatesCombined ? updates2.seq_start : updates2.seq);
            case 7:
                return g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 8:
                int i23 = ((so) obj).f;
                int i24 = ((so) obj2).f;
                if (i23 > i24) {
                    return 1;
                }
                return i23 < i24 ? -1 : 0;
            case 9:
                TLRPC.Message message = (TLRPC.Message) obj;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                if (gj.f3(message.id) || gj.f3(message2.id)) {
                    int i25 = message.date;
                    int i26 = message2.date;
                    if (i25 <= i26) {
                        if (i25 >= i26) {
                            if (!gj.f3(message.id) || gj.f3(message2.id)) {
                                if ((gj.f3(message.id) || !gj.f3(message2.id)) && (i11 = message.id) <= (i12 = message2.id)) {
                                    if (i11 >= i12) {
                                        return 0;
                                    }
                                }
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
                int i27 = message.id;
                if (i27 > 0 && (i14 = message2.id) > 0) {
                    if (i27 <= i14) {
                        if (i27 >= i14) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                if (i27 < 0 && (i13 = message2.id) < 0) {
                    if (i27 >= i13) {
                        if (i27 <= i13) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                int i28 = message.date;
                int i29 = message2.date;
                if (i28 <= i29) {
                    if (i28 >= i29) {
                        return 0;
                    }
                    return 1;
                }
                return -1;
            case 10:
                int i30 = ((so) obj).f;
                int i31 = ((so) obj2).f;
                if (i30 > i31) {
                    return 1;
                }
                return i30 < i31 ? -1 : 0;
            case 11:
                int i32 = ((jg.d0) obj).b;
                int i33 = ((jg.d0) obj2).b;
                if (i32 < i33) {
                    return 1;
                }
                return i32 > i33 ? -1 : 0;
            case 12:
                return Long.compare(((fz) obj).b, ((fz) obj2).b);
            case 13:
                return ((yt) obj).d - ((yt) obj2).d;
            case 14:
                e12 = ((sv) obj2).c();
                e13 = ((sv) obj).c();
                break;
            case 15:
                return ((sv) obj).k - ((sv) obj2).k;
            case 16:
                e12 = ((sv) obj2).c();
                e13 = ((sv) obj).c();
                break;
            case 17:
                int i34 = ((aw) obj).b.out_seq_no;
                int i35 = ((aw) obj2).b.out_seq_no;
                if (i34 > i35) {
                    return 1;
                }
                return i34 < i35 ? -1 : 0;
            case 18:
                return g0.A(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
            case 19:
                fz fzVar = (fz) obj;
                fz fzVar2 = (fz) obj2;
                fz fzVar3 = gz.B1;
                long j3 = fzVar3 == fzVar ? -200000L : 0L;
                if (!fzVar.d) {
                    j3 += 100000;
                }
                long j10 = fzVar3 == fzVar2 ? -200000L : 0L;
                if (!fzVar2.d) {
                    j10 += 100000;
                }
                return Long.compare(fzVar.b + j3, fzVar2.b + j10);
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
                        int i36 = message3 != null ? message3.date : 0;
                        TLRPC.Message message4 = tL_forumTopic.topMessage;
                        return i36 - (message4 != null ? message4.date : 0);
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
                List list = org.telegram.ui.ActionBar.i4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 24:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj2;
                if (i6Var.b == null && i6Var.d == null) {
                    return -1;
                }
                if (i6Var2.b == null && i6Var2.d == null) {
                    return 1;
                }
                return i6Var.a.compareTo(i6Var2.a);
            case 25:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj2;
                if (!org.telegram.ui.ActionBar.j6.l1(g6Var)) {
                    if (!org.telegram.ui.ActionBar.j6.l1(g6Var2)) {
                        ?? r02 = g6Var.z;
                        ?? r12 = g6Var2.z;
                        if (r02 == r12) {
                            if (r02 != 0) {
                                int i37 = g6Var.a;
                                int i38 = g6Var2.a;
                                if (i37 <= i38) {
                                    if (i37 >= i38) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i39 = g6Var.a;
                                int i40 = g6Var2.a;
                                if (i39 <= i40) {
                                    if (i39 >= i40) {
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
                long j11 = ((org.telegram.ui.s6) obj2).c;
                long j12 = ((org.telegram.ui.s6) obj).c;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 27:
                return Long.compare(((org.telegram.ui.u6) obj2).g, ((org.telegram.ui.u6) obj).g);
            case 28:
                org.telegram.ui.Cells.p1 p1Var = (org.telegram.ui.Cells.p1) obj;
                org.telegram.ui.Cells.p1 p1Var2 = (org.telegram.ui.Cells.p1) obj2;
                float f10 = p1Var.e;
                float f11 = p1Var2.e;
                if (f10 <= f11) {
                    if (f10 < f11 || (i15 = p1Var.d) > (i16 = p1Var2.d)) {
                        return 1;
                    }
                    if (i15 >= i16) {
                        return 0;
                    }
                }
                return -1;
            default:
                return ((gj) obj).e1() - ((gj) obj2).e1();
        }
        return e12 - e13;
    }

    public /* synthetic */ gl(np npVar, int i7) {
        this.a = i7;
    }
}
