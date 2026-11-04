package org.telegram.messenger;

import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tq implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ tq(int i3) {
        this.a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0306 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0300 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c8 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i3;
        int i10;
        int i11;
        int i12;
        int c2;
        int c10;
        int lambda$initCamera$0;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                TLRPC.Message message = (TLRPC.Message) obj;
                TLRPC.Message message2 = (TLRPC.Message) obj2;
                if (zi.g3(message.id) || zi.g3(message2.id)) {
                    int i15 = message.date;
                    int i16 = message2.date;
                    if (i15 <= i16) {
                        if (i15 >= i16) {
                            if (!zi.g3(message.id) || zi.g3(message2.id)) {
                                if ((zi.g3(message.id) || !zi.g3(message2.id)) && (i3 = message.id) <= (i10 = message2.id)) {
                                    if (i3 >= i10) {
                                        return 0;
                                    }
                                }
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
                int i17 = message.id;
                if (i17 > 0 && (i12 = message2.id) > 0) {
                    if (i17 <= i12) {
                        if (i17 < i12) {
                        }
                    }
                    return -1;
                }
                if (i17 < 0 && (i11 = message2.id) < 0) {
                    if (i17 >= i11) {
                        if (i17 > i11) {
                        }
                    }
                    return -1;
                }
                int i18 = message.date;
                int i19 = message2.date;
                if (i18 <= i19) {
                    if (i18 < i19) {
                        return 1;
                    }
                }
                return -1;
            case 1:
                int i20 = ((mo) obj).f;
                int i21 = ((mo) obj2).f;
                if (i20 > i21) {
                    return 1;
                }
                return i20 < i21 ? -1 : 0;
            case 2:
                int i22 = ((kg.a0) obj).b;
                int i23 = ((kg.a0) obj2).b;
                if (i22 < i23) {
                    return 1;
                }
                return i22 > i23 ? -1 : 0;
            case 3:
                return Long.compare(((zy) obj).b, ((zy) obj2).b);
            case 4:
                return ((tt) obj).d - ((tt) obj2).d;
            case 5:
                c2 = ((mv) obj2).c();
                c10 = ((mv) obj).c();
                break;
            case 6:
                return ((mv) obj).k - ((mv) obj2).k;
            case 7:
                c2 = ((mv) obj2).c();
                c10 = ((mv) obj).c();
                break;
            case 8:
                int i24 = ((uv) obj).b.out_seq_no;
                int i25 = ((uv) obj2).b.out_seq_no;
                if (i24 > i25) {
                    return 1;
                }
                return i24 < i25 ? -1 : 0;
            case 9:
                return g0.A(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
            case 10:
                zy zyVar = (zy) obj;
                zy zyVar2 = (zy) obj2;
                zy zyVar3 = az.B1;
                long j10 = zyVar3 == zyVar ? -200000L : 0L;
                if (!zyVar.d) {
                    j10 += 100000;
                }
                long j11 = zyVar3 == zyVar2 ? -200000L : 0L;
                if (!zyVar2.d) {
                    j11 += 100000;
                }
                return Long.compare(zyVar.b + j10, zyVar2.b + j11);
            case 11:
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) obj2;
                boolean z10 = tL_forumTopic.hidden;
                if (z10 != tL_forumTopic2.hidden) {
                    return z10 ? -1 : 1;
                }
                boolean z11 = tL_forumTopic.pinned;
                boolean z12 = tL_forumTopic2.pinned;
                if (z11 == z12) {
                    if (z11 && z12) {
                        return tL_forumTopic.pinnedOrder - tL_forumTopic2.pinnedOrder;
                    }
                    TLRPC.Message message3 = tL_forumTopic2.topMessage;
                    int i26 = message3 != null ? message3.date : 0;
                    TLRPC.Message message4 = tL_forumTopic.topMessage;
                    return i26 - (message4 != null ? message4.date : 0);
                }
                if (z11) {
                }
            case 12:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
            case 13:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 14:
                List list = org.telegram.ui.ActionBar.k4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 15:
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) obj2;
                if (j6Var.b == null && j6Var.d == null) {
                    return -1;
                }
                if (j6Var2.b == null && j6Var2.d == null) {
                    return 1;
                }
                return j6Var.a.compareTo(j6Var2.a);
            case 16:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj2;
                if (!org.telegram.ui.ActionBar.k6.l1(g6Var)) {
                    if (!org.telegram.ui.ActionBar.k6.l1(g6Var2)) {
                        ?? r02 = g6Var.z;
                        ?? r12 = g6Var2.z;
                        if (r02 == r12) {
                            if (r02 != 0) {
                                int i27 = g6Var.a;
                                int i28 = g6Var2.a;
                                if (i27 <= i28) {
                                    if (i27 >= i28) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i29 = g6Var.a;
                                int i30 = g6Var2.a;
                                if (i29 <= i30) {
                                    if (i29 < i30) {
                                    }
                                }
                            }
                        } else if (r02 > r12) {
                        }
                    }
                    return 1;
                }
                return -1;
            case 17:
                long j12 = ((org.telegram.ui.t6) obj2).c;
                long j13 = ((org.telegram.ui.t6) obj).c;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 18:
                return Long.compare(((org.telegram.ui.v6) obj2).g, ((org.telegram.ui.v6) obj).g);
            case 19:
                org.telegram.ui.Cells.p1 p1Var = (org.telegram.ui.Cells.p1) obj;
                org.telegram.ui.Cells.p1 p1Var2 = (org.telegram.ui.Cells.p1) obj2;
                float f10 = p1Var.e;
                float f11 = p1Var2.e;
                if (f10 <= f11) {
                    if (f10 < f11 || (i13 = p1Var.d) > (i14 = p1Var2.d)) {
                        return 1;
                    }
                    if (i13 >= i14) {
                        return 0;
                    }
                }
                return -1;
            case 20:
                return ((zi) obj).f1() - ((zi) obj2).f1();
            case 21:
                c2 = ((zi) obj2).f1();
                c10 = ((zi) obj).f1();
                break;
            case 22:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 23:
                c2 = ((zi) obj2).f1();
                c10 = ((zi) obj).f1();
                break;
            case 24:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int o02 = org.telegram.ui.nq.o0(tLObject);
                int o03 = org.telegram.ui.nq.o0(tLObject2);
                if (o02 > o03) {
                    return 1;
                }
                if (o02 < o03) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (zi.C1(((TLRPC.ChannelParticipant) tLObject).peer) - zi.C1(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 25:
                int o04 = org.telegram.ui.nq.o0((TLObject) obj);
                int o05 = org.telegram.ui.nq.o0((TLObject) obj2);
                if (o04 > o05) {
                    return 1;
                }
                return o04 < o05 ? -1 : 0;
            case 26:
                c2 = ((org.telegram.ui.Components.a9) obj2).b;
                c10 = ((org.telegram.ui.Components.a9) obj).b;
                break;
            case 27:
                c2 = ((org.telegram.ui.Components.a9) obj2).b;
                c10 = ((org.telegram.ui.Components.a9) obj).b;
                break;
            case 28:
                return Long.compare(((org.telegram.ui.Components.kc) obj).c, ((org.telegram.ui.Components.kc) obj2).c);
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                return abs > abs2 ? 1 : 0;
        }
        return c2 - c10;
    }
}
