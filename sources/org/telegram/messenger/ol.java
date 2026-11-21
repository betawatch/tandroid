package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class ol implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ ol(mp mpVar, long j3, int i7, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = mpVar;
        this.c = j3;
        this.e = i7;
        this.d = j10;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ArrayList arrayList = this.f;
        mp mpVar = this.b;
        switch (i7) {
            case 0:
                long j3 = this.c;
                long j10 = this.d;
                int i10 = this.e;
                if (j3 != 0) {
                    int B = mpVar.getMessagesController().t7.B(i10, j10, j3, true);
                    if (B >= 0) {
                        mpVar.getMessagesStorage().h2(B, j10, j3, true);
                        mpVar.getNotificationCenter().k(ks.c5, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(B), arrayList);
                        break;
                    }
                } else {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) mpVar.R.f(j10);
                    if (dialog != null) {
                        int i11 = dialog.unread_poll_votes_count + i10;
                        dialog.unread_poll_votes_count = i11;
                        if (i11 < 0) {
                            dialog.unread_poll_votes_count = 0;
                        }
                        mpVar.getMessagesStorage().h2(dialog.unread_poll_votes_count, j10, 0L, false);
                        mpVar.getNotificationCenter().k(ks.c5, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                        break;
                    } else {
                        mpVar.getMessagesStorage().Q1(j10, i10, true, false);
                        break;
                    }
                }
                break;
            case 1:
                long j11 = this.c;
                long j12 = this.d;
                int i12 = this.e;
                if (j11 != 0) {
                    int C = mpVar.getMessagesController().t7.C(i12, j12, j11, true);
                    if (C >= 0) {
                        mpVar.getMessagesStorage().i2(C, j12, j11, true);
                        if (mpVar.y2(j12) || mpVar.E2(j12) || j12 > 0) {
                            mpVar.getNotificationCenter().k(ks.b5, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(C), arrayList);
                            break;
                        }
                    }
                } else {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) mpVar.R.f(j12);
                    if (dialog2 != null) {
                        int i13 = dialog2.unread_reactions_count + i12;
                        dialog2.unread_reactions_count = i13;
                        if (i13 < 0) {
                            dialog2.unread_reactions_count = 0;
                        }
                        mpVar.getMessagesStorage().i2(dialog2.unread_reactions_count, j12, 0L, false);
                        if (mpVar.y2(j12) || mpVar.E2(j12) || j12 > 0) {
                            mpVar.getNotificationCenter().k(ks.b5, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                            break;
                        }
                    } else {
                        mpVar.getMessagesStorage().Q1(j12, i12, true, true);
                        break;
                    }
                }
                break;
            case 2:
                a0.h hVar = mpVar.R;
                long j13 = this.c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(j13);
                int i14 = this.e;
                if (dialog3 != null) {
                    dialog3.unread_reactions_count = i14;
                    tr messagesStorage = mpVar.getMessagesStorage();
                    long j14 = this.d;
                    messagesStorage.i2(i14, j13, j14, false);
                    mpVar.getNotificationCenter().k(ks.b5, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i14), arrayList);
                    break;
                } else {
                    mpVar.getMessagesStorage().Q1(j13, i14, false, true);
                    break;
                }
            case 3:
                e00 e00Var = mpVar.getMessagesController().t7;
                int i15 = this.e;
                long j15 = this.c;
                long j16 = this.d;
                e00Var.C(i15, j15, j16, false);
                mpVar.getMessagesStorage().i2(i15, j15, j16, false);
                mpVar.getNotificationCenter().k(ks.b5, Long.valueOf(j15), Long.valueOf(j16), Integer.valueOf(i15), arrayList);
                break;
            case 4:
                a0.h hVar2 = mpVar.R;
                long j17 = this.c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar2.f(j17);
                int i16 = this.e;
                if (dialog4 != null) {
                    dialog4.unread_poll_votes_count = i16;
                    tr messagesStorage2 = mpVar.getMessagesStorage();
                    long j18 = this.d;
                    messagesStorage2.h2(i16, j17, j18, false);
                    mpVar.getNotificationCenter().k(ks.c5, Long.valueOf(j17), Long.valueOf(j18), Integer.valueOf(i16), arrayList);
                    break;
                } else {
                    mpVar.getMessagesStorage().Q1(j17, i16, false, false);
                    break;
                }
            case 5:
                e00 e00Var2 = mpVar.getMessagesController().t7;
                int i17 = this.e;
                long j19 = this.c;
                long j20 = this.d;
                e00Var2.B(i17, j19, j20, false);
                mpVar.getMessagesStorage().h2(i17, j19, j20, false);
                mpVar.getNotificationCenter().k(ks.c5, Long.valueOf(j19), Long.valueOf(j20), Integer.valueOf(i17), arrayList);
                break;
            default:
                e00 e00Var3 = mpVar.getMessagesController().t7;
                int i18 = this.e;
                long j21 = this.c;
                long j22 = this.d;
                e00Var3.C(i18, j21, j22, false);
                mpVar.getMessagesStorage().i2(i18, j21, j22, false);
                mpVar.getNotificationCenter().k(ks.b5, Long.valueOf(j21), Long.valueOf(j22), Integer.valueOf(i18), arrayList);
                break;
        }
    }

    public /* synthetic */ ol(mp mpVar, long j3, long j10, int i7, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = mpVar;
        this.c = j3;
        this.d = j10;
        this.e = i7;
        this.f = arrayList;
    }
}
