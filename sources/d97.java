// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class d97 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ d97(oc7 oc7Var, long j, int i, long j2, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = j;
        this.e = i;
        this.d = j2;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.f;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                long j = this.c;
                long j2 = this.d;
                int i = this.e;
                if (j != 0) {
                    int B = oc7Var.getMessagesController().g4.B(i, j2, j, true);
                    if (B >= 0) {
                        oc7Var.getMessagesStorage().e2(B, j2, j, true);
                        oc7Var.getNotificationCenter().k(nm7.d5, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(B), arrayList);
                        break;
                    }
                } else {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) oc7Var.R.f(j2);
                    if (dialog != null) {
                        int i2 = dialog.unread_poll_votes_count + i;
                        dialog.unread_poll_votes_count = i2;
                        if (i2 < 0) {
                            dialog.unread_poll_votes_count = 0;
                        }
                        oc7Var.getMessagesStorage().e2(dialog.unread_poll_votes_count, j2, 0L, false);
                        oc7Var.getNotificationCenter().k(nm7.d5, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                        break;
                    } else {
                        oc7Var.getMessagesStorage().N1(j2, i, true, false);
                        break;
                    }
                }
                break;
            case 1:
                long j3 = this.c;
                long j4 = this.d;
                int i3 = this.e;
                if (j3 != 0) {
                    int C = oc7Var.getMessagesController().g4.C(i3, j4, j3, true);
                    if (C >= 0) {
                        oc7Var.getMessagesStorage().f2(C, j4, j3, true);
                        if (oc7Var.s2(j4) || oc7Var.y2(j4) || j4 > 0) {
                            oc7Var.getNotificationCenter().k(nm7.c5, Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(C), arrayList);
                            break;
                        }
                    }
                } else {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) oc7Var.R.f(j4);
                    if (dialog2 != null) {
                        int i4 = dialog2.unread_reactions_count + i3;
                        dialog2.unread_reactions_count = i4;
                        if (i4 < 0) {
                            dialog2.unread_reactions_count = 0;
                        }
                        oc7Var.getMessagesStorage().f2(dialog2.unread_reactions_count, j4, 0L, false);
                        if (oc7Var.s2(j4) || oc7Var.y2(j4) || j4 > 0) {
                            oc7Var.getNotificationCenter().k(nm7.c5, Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                            break;
                        }
                    } else {
                        oc7Var.getMessagesStorage().N1(j4, i3, true, true);
                        break;
                    }
                }
                break;
            case 2:
                vh6 vh6Var = oc7Var.R;
                long j5 = this.c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) vh6Var.f(j5);
                int i5 = this.e;
                if (dialog3 != null) {
                    dialog3.unread_poll_votes_count = i5;
                    cf7 messagesStorage = oc7Var.getMessagesStorage();
                    long j6 = this.d;
                    messagesStorage.e2(i5, j5, j6, false);
                    oc7Var.getNotificationCenter().k(nm7.d5, Long.valueOf(j5), Long.valueOf(j6), Integer.valueOf(i5), arrayList);
                    break;
                } else {
                    oc7Var.getMessagesStorage().N1(j5, i5, false, false);
                    break;
                }
            case 3:
                qwb qwbVar = oc7Var.getMessagesController().g4;
                int i6 = this.e;
                long j7 = this.c;
                long j8 = this.d;
                qwbVar.C(i6, j7, j8, false);
                oc7Var.getMessagesStorage().f2(i6, j7, j8, false);
                oc7Var.getNotificationCenter().k(nm7.c5, Long.valueOf(j7), Long.valueOf(j8), Integer.valueOf(i6), arrayList);
                break;
            case 4:
                qwb qwbVar2 = oc7Var.getMessagesController().g4;
                int i7 = this.e;
                long j9 = this.c;
                long j10 = this.d;
                qwbVar2.C(i7, j9, j10, false);
                oc7Var.getMessagesStorage().f2(i7, j9, j10, false);
                oc7Var.getNotificationCenter().k(nm7.c5, Long.valueOf(j9), Long.valueOf(j10), Integer.valueOf(i7), arrayList);
                break;
            case 5:
                vh6 vh6Var2 = oc7Var.R;
                long j11 = this.c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) vh6Var2.f(j11);
                int i8 = this.e;
                if (dialog4 != null) {
                    dialog4.unread_reactions_count = i8;
                    cf7 messagesStorage2 = oc7Var.getMessagesStorage();
                    long j12 = this.d;
                    messagesStorage2.f2(i8, j11, j12, false);
                    oc7Var.getNotificationCenter().k(nm7.c5, Long.valueOf(j11), Long.valueOf(j12), Integer.valueOf(i8), arrayList);
                    break;
                } else {
                    oc7Var.getMessagesStorage().N1(j11, i8, false, true);
                    break;
                }
            default:
                qwb qwbVar3 = oc7Var.getMessagesController().g4;
                int i9 = this.e;
                long j13 = this.c;
                long j14 = this.d;
                qwbVar3.B(i9, j13, j14, false);
                oc7Var.getMessagesStorage().e2(i9, j13, j14, false);
                oc7Var.getNotificationCenter().k(nm7.d5, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i9), arrayList);
                break;
        }
    }

    public /* synthetic */ d97(oc7 oc7Var, long j, long j2, int i, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = arrayList;
    }
}
