// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class b77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ b77(na7 na7Var, long j, int i, long j2, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
        this.e = i;
        this.d = j2;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.f;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                long j = this.c;
                long j2 = this.d;
                int i = this.e;
                if (j != 0) {
                    int B = na7Var.getMessagesController().g4.B(i, j2, j, true);
                    if (B >= 0) {
                        na7Var.getMessagesStorage().e2(B, j2, j, true);
                        na7Var.getNotificationCenter().k(kk7.b5, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(B), arrayList);
                        break;
                    }
                } else {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) na7Var.R.f(j2);
                    if (dialog != null) {
                        int i2 = dialog.unread_poll_votes_count + i;
                        dialog.unread_poll_votes_count = i2;
                        if (i2 < 0) {
                            dialog.unread_poll_votes_count = 0;
                        }
                        na7Var.getMessagesStorage().e2(dialog.unread_poll_votes_count, j2, 0L, false);
                        na7Var.getNotificationCenter().k(kk7.b5, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                        break;
                    } else {
                        na7Var.getMessagesStorage().N1(j2, i, true, false);
                        break;
                    }
                }
                break;
            case 1:
                long j3 = this.c;
                long j4 = this.d;
                int i3 = this.e;
                if (j3 != 0) {
                    int C = na7Var.getMessagesController().g4.C(i3, j4, j3, true);
                    if (C >= 0) {
                        na7Var.getMessagesStorage().f2(C, j4, j3, true);
                        if (na7Var.r2(j4) || na7Var.x2(j4) || j4 > 0) {
                            na7Var.getNotificationCenter().k(kk7.a5, Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(C), arrayList);
                            break;
                        }
                    }
                } else {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) na7Var.R.f(j4);
                    if (dialog2 != null) {
                        int i4 = dialog2.unread_reactions_count + i3;
                        dialog2.unread_reactions_count = i4;
                        if (i4 < 0) {
                            dialog2.unread_reactions_count = 0;
                        }
                        na7Var.getMessagesStorage().f2(dialog2.unread_reactions_count, j4, 0L, false);
                        if (na7Var.r2(j4) || na7Var.x2(j4) || j4 > 0) {
                            na7Var.getNotificationCenter().k(kk7.a5, Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                            break;
                        }
                    } else {
                        na7Var.getMessagesStorage().N1(j4, i3, true, true);
                        break;
                    }
                }
                break;
            case 2:
                vf6 vf6Var = na7Var.R;
                long j5 = this.c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) vf6Var.f(j5);
                int i5 = this.e;
                if (dialog3 != null) {
                    dialog3.unread_reactions_count = i5;
                    ad7 messagesStorage = na7Var.getMessagesStorage();
                    long j6 = this.d;
                    messagesStorage.f2(i5, j5, j6, false);
                    na7Var.getNotificationCenter().k(kk7.a5, Long.valueOf(j5), Long.valueOf(j6), Integer.valueOf(i5), arrayList);
                    break;
                } else {
                    na7Var.getMessagesStorage().N1(j5, i5, false, true);
                    break;
                }
            case 3:
                pub pubVar = na7Var.getMessagesController().g4;
                int i6 = this.e;
                long j7 = this.c;
                long j8 = this.d;
                pubVar.C(i6, j7, j8, false);
                na7Var.getMessagesStorage().f2(i6, j7, j8, false);
                na7Var.getNotificationCenter().k(kk7.a5, Long.valueOf(j7), Long.valueOf(j8), Integer.valueOf(i6), arrayList);
                break;
            case 4:
                vf6 vf6Var2 = na7Var.R;
                long j9 = this.c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) vf6Var2.f(j9);
                int i7 = this.e;
                if (dialog4 != null) {
                    dialog4.unread_poll_votes_count = i7;
                    ad7 messagesStorage2 = na7Var.getMessagesStorage();
                    long j10 = this.d;
                    messagesStorage2.e2(i7, j9, j10, false);
                    na7Var.getNotificationCenter().k(kk7.b5, Long.valueOf(j9), Long.valueOf(j10), Integer.valueOf(i7), arrayList);
                    break;
                } else {
                    na7Var.getMessagesStorage().N1(j9, i7, false, false);
                    break;
                }
            case 5:
                pub pubVar2 = na7Var.getMessagesController().g4;
                int i8 = this.e;
                long j11 = this.c;
                long j12 = this.d;
                pubVar2.C(i8, j11, j12, false);
                na7Var.getMessagesStorage().f2(i8, j11, j12, false);
                na7Var.getNotificationCenter().k(kk7.a5, Long.valueOf(j11), Long.valueOf(j12), Integer.valueOf(i8), arrayList);
                break;
            default:
                pub pubVar3 = na7Var.getMessagesController().g4;
                int i9 = this.e;
                long j13 = this.c;
                long j14 = this.d;
                pubVar3.B(i9, j13, j14, false);
                na7Var.getMessagesStorage().e2(i9, j13, j14, false);
                na7Var.getNotificationCenter().k(kk7.b5, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i9), arrayList);
                break;
        }
    }

    public /* synthetic */ b77(na7 na7Var, long j, long j2, int i, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = arrayList;
    }
}
