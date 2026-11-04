package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class kl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ kl(hp hpVar, long j10, int i3, long j11, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = hpVar;
        this.c = j10;
        this.e = i3;
        this.d = j11;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ArrayList arrayList = this.f;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                long j10 = this.c;
                long j11 = this.d;
                int i10 = this.e;
                if (j10 != 0) {
                    int B = hpVar.getMessagesController().q7.B(i10, j11, j10, true);
                    if (B >= 0) {
                        hpVar.getMessagesStorage().h2(B, j11, j10, true);
                        hpVar.getNotificationCenter().k(hs.Z4, Long.valueOf(j11), Long.valueOf(j10), Integer.valueOf(B), arrayList);
                        break;
                    }
                } else {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) hpVar.R.f(j11);
                    if (dialog != null) {
                        int i11 = dialog.unread_poll_votes_count + i10;
                        dialog.unread_poll_votes_count = i11;
                        if (i11 < 0) {
                            dialog.unread_poll_votes_count = 0;
                        }
                        hpVar.getMessagesStorage().h2(dialog.unread_poll_votes_count, j11, 0L, false);
                        hpVar.getNotificationCenter().k(hs.Z4, Long.valueOf(j11), Long.valueOf(j10), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                        break;
                    } else {
                        hpVar.getMessagesStorage().Q1(j11, i10, true, false);
                        break;
                    }
                }
                break;
            case 1:
                long j12 = this.c;
                long j13 = this.d;
                int i12 = this.e;
                if (j12 != 0) {
                    int C = hpVar.getMessagesController().q7.C(i12, j13, j12, true);
                    if (C >= 0) {
                        hpVar.getMessagesStorage().i2(C, j13, j12, true);
                        if (hpVar.t2(j13) || hpVar.y2(j13) || j13 > 0) {
                            hpVar.getNotificationCenter().k(hs.Y4, Long.valueOf(j13), Long.valueOf(j12), Integer.valueOf(C), arrayList);
                            break;
                        }
                    }
                } else {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hpVar.R.f(j13);
                    if (dialog2 != null) {
                        int i13 = dialog2.unread_reactions_count + i12;
                        dialog2.unread_reactions_count = i13;
                        if (i13 < 0) {
                            dialog2.unread_reactions_count = 0;
                        }
                        hpVar.getMessagesStorage().i2(dialog2.unread_reactions_count, j13, 0L, false);
                        if (hpVar.t2(j13) || hpVar.y2(j13) || j13 > 0) {
                            hpVar.getNotificationCenter().k(hs.Y4, Long.valueOf(j13), Long.valueOf(j12), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                            break;
                        }
                    } else {
                        hpVar.getMessagesStorage().Q1(j13, i12, true, true);
                        break;
                    }
                }
                break;
            case 2:
                a0.h hVar = hpVar.R;
                long j14 = this.c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(j14);
                int i14 = this.e;
                if (dialog3 != null) {
                    dialog3.unread_poll_votes_count = i14;
                    qr messagesStorage = hpVar.getMessagesStorage();
                    long j15 = this.d;
                    messagesStorage.h2(i14, j14, j15, false);
                    hpVar.getNotificationCenter().k(hs.Z4, Long.valueOf(j14), Long.valueOf(j15), Integer.valueOf(i14), arrayList);
                    break;
                } else {
                    hpVar.getMessagesStorage().Q1(j14, i14, false, false);
                    break;
                }
            case 3:
                a0.h hVar2 = hpVar.R;
                long j16 = this.c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar2.f(j16);
                int i15 = this.e;
                if (dialog4 != null) {
                    dialog4.unread_reactions_count = i15;
                    qr messagesStorage2 = hpVar.getMessagesStorage();
                    long j17 = this.d;
                    messagesStorage2.i2(i15, j16, j17, false);
                    hpVar.getNotificationCenter().k(hs.Y4, Long.valueOf(j16), Long.valueOf(j17), Integer.valueOf(i15), arrayList);
                    break;
                } else {
                    hpVar.getMessagesStorage().Q1(j16, i15, false, true);
                    break;
                }
            case 4:
                c00 c00Var = hpVar.getMessagesController().q7;
                int i16 = this.e;
                long j18 = this.c;
                long j19 = this.d;
                c00Var.B(i16, j18, j19, false);
                hpVar.getMessagesStorage().h2(i16, j18, j19, false);
                hpVar.getNotificationCenter().k(hs.Z4, Long.valueOf(j18), Long.valueOf(j19), Integer.valueOf(i16), arrayList);
                break;
            case 5:
                c00 c00Var2 = hpVar.getMessagesController().q7;
                int i17 = this.e;
                long j20 = this.c;
                long j21 = this.d;
                c00Var2.C(i17, j20, j21, false);
                hpVar.getMessagesStorage().i2(i17, j20, j21, false);
                hpVar.getNotificationCenter().k(hs.Y4, Long.valueOf(j20), Long.valueOf(j21), Integer.valueOf(i17), arrayList);
                break;
            default:
                c00 c00Var3 = hpVar.getMessagesController().q7;
                int i18 = this.e;
                long j22 = this.c;
                long j23 = this.d;
                c00Var3.C(i18, j22, j23, false);
                hpVar.getMessagesStorage().i2(i18, j22, j23, false);
                hpVar.getNotificationCenter().k(hs.Y4, Long.valueOf(j22), Long.valueOf(j23), Integer.valueOf(i18), arrayList);
                break;
        }
    }

    public /* synthetic */ kl(hp hpVar, long j10, long j11, int i3, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = hpVar;
        this.c = j10;
        this.d = j11;
        this.e = i3;
        this.f = arrayList;
    }
}
