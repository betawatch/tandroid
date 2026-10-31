package org.telegram.messenger;

import android.graphics.Typeface;
import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class bk implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ bk(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r0 > r1) goto L30;
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
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int lambda$initCamera$0;
        switch (this.a) {
            case 0:
                return i0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 1:
                f12 = ((jj) obj2).f1();
                f13 = ((jj) obj).f1();
                break;
            case 2:
                jj jjVar = (jj) obj;
                jj jjVar2 = (jj) obj2;
                if (jjVar.k.date != jjVar2.k.date || jjVar.f1() < 0 || jjVar2.f1() < 0) {
                    i10 = jjVar2.k.date;
                    i11 = jjVar.k.date;
                } else {
                    i10 = jjVar2.f1();
                    i11 = jjVar.f1();
                }
                return i10 - i11;
            case 3:
                f12 = ((jj) obj2).f1();
                f13 = ((jj) obj).f1();
                break;
            case 4:
                TLRPC.Update update = (TLRPC.Update) obj;
                TLRPC.Update update2 = (TLRPC.Update) obj2;
                int X1 = vp.X1(update);
                int X12 = vp.X1(update2);
                if (X1 != X12) {
                    return i0.A(X1, X12);
                }
                if (X1 == 0) {
                    return i0.A(vp.V1(update), vp.V1(update2));
                }
                if (X1 == 1) {
                    return i0.A(update instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update).qts : 0, update2 instanceof TL_update.TL_updateNewEncryptedMessage ? ((TL_update.TL_updateNewEncryptedMessage) update2).qts : 0);
                }
                if (X1 != 2) {
                    return 0;
                }
                long U1 = vp.U1(update);
                long U12 = vp.U1(update2);
                if (U1 == U12) {
                    return i0.A(vp.V1(update), vp.V1(update2));
                }
                Typeface typeface = i0.a;
                if (U1 == U12) {
                    return 0;
                }
                return U1 > U12 ? 1 : -1;
            case 5:
                TLRPC.TL_savedReactionTag tL_savedReactionTag = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag2 = (TLRPC.TL_savedReactionTag) obj2;
                int i16 = tL_savedReactionTag.count;
                int i17 = tL_savedReactionTag2.count;
                return i16 == i17 ? Long.compare(vp.P1(tL_savedReactionTag2.reaction) ^ Long.MIN_VALUE, vp.P1(tL_savedReactionTag.reaction) ^ Long.MIN_VALUE) : i17 - i16;
            case 6:
                TLRPC.TL_savedReactionTag tL_savedReactionTag3 = (TLRPC.TL_savedReactionTag) obj;
                TLRPC.TL_savedReactionTag tL_savedReactionTag4 = (TLRPC.TL_savedReactionTag) obj2;
                int i18 = tL_savedReactionTag3.count;
                int i19 = tL_savedReactionTag4.count;
                return i18 == i19 ? Long.compare(vp.P1(tL_savedReactionTag4.reaction) ^ Long.MIN_VALUE, vp.P1(tL_savedReactionTag3.reaction) ^ Long.MIN_VALUE) : i19 - i18;
            case 7:
                int i20 = ((ap) obj).f;
                int i21 = ((ap) obj2).f;
                if (i20 > i21) {
                    return 1;
                }
                return i20 < i21 ? -1 : 0;
            case 8:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj2;
                return i0.A(updates instanceof TLRPC.TL_updatesCombined ? updates.seq_start : updates.seq, updates2 instanceof TLRPC.TL_updatesCombined ? updates2.seq_start : updates2.seq);
            case 9:
                return i0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 10:
                return i0.A(((TLRPC.Updates) obj).pts, ((TLRPC.Updates) obj2).pts);
            case 11:
                int i22 = ((ap) obj).f;
                int i23 = ((ap) obj2).f;
                if (i22 > i23) {
                    return 1;
                }
                return i22 < i23 ? -1 : 0;
            case 12:
                TLRPC.Message message = (TLRPC.Message) obj;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                if (jj.f3(message.id) || jj.f3(message2.id)) {
                    int i24 = message.date;
                    int i25 = message2.date;
                    if (i24 <= i25) {
                        if (i24 >= i25) {
                            if (!jj.f3(message.id) || jj.f3(message2.id)) {
                                if ((jj.f3(message.id) || !jj.f3(message2.id)) && (i12 = message.id) <= (i13 = message2.id)) {
                                    if (i12 >= i13) {
                                        return 0;
                                    }
                                }
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
                int i26 = message.id;
                if (i26 > 0 && (i15 = message2.id) > 0) {
                    if (i26 <= i15) {
                        if (i26 >= i15) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                if (i26 < 0 && (i14 = message2.id) < 0) {
                    if (i26 >= i14) {
                        if (i26 <= i14) {
                            return 0;
                        }
                        return 1;
                    }
                    return -1;
                }
                int i27 = message.date;
                int i28 = message2.date;
                if (i27 <= i28) {
                    if (i27 >= i28) {
                        return 0;
                    }
                    return 1;
                }
                return -1;
            case 13:
                int i29 = ((ap) obj).f;
                int i30 = ((ap) obj2).f;
                if (i29 > i30) {
                    return 1;
                }
                return i29 < i30 ? -1 : 0;
            case 14:
                int i31 = ((zf.v) obj).b;
                int i32 = ((zf.v) obj2).b;
                if (i31 < i32) {
                    return 1;
                }
                return i31 > i32 ? -1 : 0;
            case 15:
                return Long.compare(((sz) obj).b, ((sz) obj2).b);
            case 16:
                return ((mu) obj).d - ((mu) obj2).d;
            case 17:
                f12 = ((fw) obj2).c();
                f13 = ((fw) obj).c();
                break;
            case 18:
                return ((fw) obj).k - ((fw) obj2).k;
            case 19:
                f12 = ((fw) obj2).c();
                f13 = ((fw) obj).c();
                break;
            case 20:
                int i33 = ((nw) obj).b.out_seq_no;
                int i34 = ((nw) obj2).b.out_seq_no;
                if (i33 > i34) {
                    return 1;
                }
                return i33 < i34 ? -1 : 0;
            case 21:
                return i0.A(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
            case 22:
                sz szVar = (sz) obj;
                sz szVar2 = (sz) obj2;
                sz szVar3 = tz.B1;
                long j10 = szVar3 == szVar ? -200000L : 0L;
                if (!szVar.d) {
                    j10 += 100000;
                }
                long j11 = szVar3 == szVar2 ? -200000L : 0L;
                if (!szVar2.d) {
                    j11 += 100000;
                }
                return Long.compare(szVar.b + j10, szVar2.b + j11);
            case 23:
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
                        int i35 = message3 != null ? message3.date : 0;
                        TLRPC.Message message4 = tL_forumTopic.topMessage;
                        return i35 - (message4 != null ? message4.date : 0);
                    }
                    if (z11) {
                        return -1;
                    }
                } else if (z10) {
                    return -1;
                }
                return 1;
            case 24:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 25:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 26:
                List list = org.telegram.ui.ActionBar.s4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 27:
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) obj;
                org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) obj2;
                if (s6Var.b == null && s6Var.d == null) {
                    return -1;
                }
                if (s6Var2.b == null && s6Var2.d == null) {
                    return 1;
                }
                return s6Var.a.compareTo(s6Var2.a);
            case 28:
                org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) obj;
                org.telegram.ui.ActionBar.r6 r6Var2 = (org.telegram.ui.ActionBar.r6) obj2;
                if (!org.telegram.ui.ActionBar.t6.l1(r6Var)) {
                    if (!org.telegram.ui.ActionBar.t6.l1(r6Var2)) {
                        ?? r02 = r6Var.z;
                        ?? r12 = r6Var2.z;
                        if (r02 == r12) {
                            if (r02 != 0) {
                                int i36 = r6Var.a;
                                int i37 = r6Var2.a;
                                if (i36 <= i37) {
                                    if (i36 >= i37) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i38 = r6Var.a;
                                int i39 = r6Var2.a;
                                if (i38 <= i39) {
                                    if (i38 >= i39) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                long j12 = ((org.telegram.ui.s6) obj2).c;
                long j13 = ((org.telegram.ui.s6) obj).c;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
        }
        return f12 - f13;
    }

    public /* synthetic */ bk(vp vpVar, int i10) {
        this.a = i10;
    }
}
