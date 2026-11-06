package org.telegram.messenger;

import android.graphics.Typeface;
import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class vj implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ vj(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        if (r0 > r1) goto L44;
     */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int f12;
        int f13;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int lambda$initCamera$0;
        int i15;
        int i16;
        switch (this.a) {
            case 0:
                return g0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 1:
                f12 = ((ij) obj2).f1();
                f13 = ((ij) obj).f1();
                break;
            case 2:
                ij ijVar = (ij) obj;
                ij ijVar2 = (ij) obj2;
                if (ijVar.k.date != ijVar2.k.date || ijVar.f1() < 0 || ijVar2.f1() < 0) {
                    i7 = ijVar2.k.date;
                    i10 = ijVar.k.date;
                } else {
                    i7 = ijVar2.f1();
                    i10 = ijVar.f1();
                }
                return i7 - i10;
            case 3:
                f12 = ((ij) obj2).f1();
                f13 = ((ij) obj).f1();
                break;
            case 4:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int Y1 = qp.Y1(update);
                int Y12 = qp.Y1(update2);
                if (Y1 != Y12) {
                    return g0.A(Y1, Y12);
                }
                if (Y1 == 0) {
                    return g0.A(qp.W1(update), qp.W1(update2));
                }
                if (Y1 == 1) {
                    return g0.A(update instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update).qts : 0, update2 instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update2).qts : 0);
                }
                if (Y1 != 2) {
                    return 0;
                }
                long V1 = qp.V1(update);
                long V12 = qp.V1(update2);
                if (V1 == V12) {
                    return g0.A(qp.W1(update), qp.W1(update2));
                }
                Typeface typeface = g0.a;
                if (V1 == V12) {
                    return 0;
                }
                return V1 > V12 ? 1 : -1;
            case 5:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i17 = tL_savedReactionTag.count;
                int i18 = tL_savedReactionTag2.count;
                return i17 == i18 ? Long.compare(qp.Q1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, qp.Q1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE) : i18 - i17;
            case 6:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i19 = tL_savedReactionTag3.count;
                int i20 = tL_savedReactionTag4.count;
                return i19 == i20 ? Long.compare(qp.Q1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, qp.Q1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE) : i20 - i19;
            case 7:
                int i21 = ((vo) obj).f;
                int i22 = ((vo) obj2).f;
                if (i21 > i22) {
                    return 1;
                }
                return i21 < i22 ? -1 : 0;
            case 8:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                return g0.A(updates instanceof TLRPC.TL_updatesCombined ? updates.seq_start : updates.seq, updates2 instanceof TLRPC.TL_updatesCombined ? updates2.seq_start : updates2.seq);
            case 9:
                int i23 = ((vo) obj).f;
                int i24 = ((vo) obj2).f;
                if (i23 > i24) {
                    return 1;
                }
                return i23 < i24 ? -1 : 0;
            case 10:
                TLRPC.Message message = (TLRPC.Message) obj;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                if (ij.g3(message.id) || ij.g3(message2.id)) {
                    int i25 = message.date;
                    int i26 = message2.date;
                    if (i25 <= i26) {
                        if (i25 >= i26) {
                            if (!ij.g3(message.id) || ij.g3(message2.id)) {
                                if ((ij.g3(message.id) || !ij.g3(message2.id)) && (i11 = message.id) <= (i12 = message2.id)) {
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
            case 11:
                int i30 = ((vo) obj).f;
                int i31 = ((vo) obj2).f;
                if (i30 > i31) {
                    return 1;
                }
                return i30 < i31 ? -1 : 0;
            case 12:
                int i32 = ((jg.d0) obj).b;
                int i33 = ((jg.d0) obj2).b;
                if (i32 < i33) {
                    return 1;
                }
                return i32 > i33 ? -1 : 0;
            case 13:
                return Long.compare(((hz) obj).b, ((hz) obj2).b);
            case 14:
                return ((bu) obj).d - ((bu) obj2).d;
            case 15:
                f12 = ((uv) obj2).c();
                f13 = ((uv) obj).c();
                break;
            case 16:
                return ((uv) obj).k - ((uv) obj2).k;
            case 17:
                f12 = ((uv) obj2).c();
                f13 = ((uv) obj).c();
                break;
            case 18:
                int i34 = ((cw) obj).b.out_seq_no;
                int i35 = ((cw) obj2).b.out_seq_no;
                if (i34 > i35) {
                    return 1;
                }
                return i34 < i35 ? -1 : 0;
            case 19:
                return g0.A(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
            case 20:
                hz hzVar = (hz) obj;
                hz hzVar2 = (hz) obj2;
                hz hzVar3 = iz.B1;
                long j3 = hzVar3 == hzVar ? -200000L : 0L;
                if (!hzVar.d) {
                    j3 += 100000;
                }
                long j10 = hzVar3 == hzVar2 ? -200000L : 0L;
                if (!hzVar2.d) {
                    j10 += 100000;
                }
                return Long.compare(hzVar.b + j3, hzVar2.b + j10);
            case 21:
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj2;
                boolean z9 = tL_forumTopic.hidden;
                if (z9 == tL_forumTopic2.hidden) {
                    boolean z10 = tL_forumTopic.pinned;
                    boolean z11 = tL_forumTopic2.pinned;
                    if (z10 == z11) {
                        if (z10 && z11) {
                            return tL_forumTopic.pinnedOrder - tL_forumTopic2.pinnedOrder;
                        }
                        TLRPC.Message message3 = tL_forumTopic2.topMessage;
                        int i36 = message3 != null ? message3.date : 0;
                        TLRPC.Message message4 = tL_forumTopic.topMessage;
                        return i36 - (message4 != null ? message4.date : 0);
                    }
                    if (z10) {
                        return -1;
                    }
                } else if (z9) {
                    return -1;
                }
                return 1;
            case 22:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 23:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 24:
                List list = org.telegram.ui.ActionBar.k4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 25:
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) obj2;
                if (j6Var.b == null && j6Var.d == null) {
                    return -1;
                }
                if (j6Var2.b == null && j6Var2.d == null) {
                    return 1;
                }
                return j6Var.a.compareTo(j6Var2.a);
            case 26:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj2;
                if (!org.telegram.ui.ActionBar.k6.l1(h6Var)) {
                    if (!org.telegram.ui.ActionBar.k6.l1(h6Var2)) {
                        ?? r02 = h6Var.z;
                        ?? r12 = h6Var2.z;
                        if (r02 == r12) {
                            if (r02 != 0) {
                                int i37 = h6Var.a;
                                int i38 = h6Var2.a;
                                if (i37 <= i38) {
                                    if (i37 >= i38) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i39 = h6Var.a;
                                int i40 = h6Var2.a;
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
            case 27:
                long j11 = ((org.telegram.ui.s6) obj2).c;
                long j12 = ((org.telegram.ui.s6) obj).c;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 28:
                return Long.compare(((org.telegram.ui.u6) obj2).g, ((org.telegram.ui.u6) obj).g);
            default:
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
        }
        return f12 - f13;
    }

    public /* synthetic */ vj(qp qpVar, int i7) {
        this.a = i7;
    }
}
