package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class zl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ zl(wp wpVar, long j10, int i10, long j11, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = wpVar;
        this.c = j10;
        this.e = i10;
        this.d = j11;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ArrayList arrayList = this.f;
        wp wpVar = this.b;
        switch (i10) {
            case 0:
                long j10 = this.c;
                long j11 = this.d;
                int i11 = this.e;
                if (j10 != 0) {
                    int B = wpVar.getMessagesController().r7.B(i11, j11, j10, true);
                    if (B >= 0) {
                        wpVar.getMessagesStorage().h2(B, j11, j10, true);
                        wpVar.getNotificationCenter().k(at.Z4, Long.valueOf(j11), Long.valueOf(j10), Integer.valueOf(B), arrayList);
                        break;
                    }
                } else {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) wpVar.Q.f(j11);
                    if (dialog != null) {
                        int i12 = dialog.unread_poll_votes_count + i11;
                        dialog.unread_poll_votes_count = i12;
                        if (i12 < 0) {
                            dialog.unread_poll_votes_count = 0;
                        }
                        wpVar.getMessagesStorage().h2(dialog.unread_poll_votes_count, j11, 0L, false);
                        wpVar.getNotificationCenter().k(at.Z4, Long.valueOf(j11), Long.valueOf(j10), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                        break;
                    } else {
                        wpVar.getMessagesStorage().Q1(j11, i11, true, false);
                        break;
                    }
                }
                break;
            case 1:
                long j12 = this.c;
                long j13 = this.d;
                int i13 = this.e;
                if (j12 != 0) {
                    int C = wpVar.getMessagesController().r7.C(i13, j13, j12, true);
                    if (C >= 0) {
                        wpVar.getMessagesStorage().i2(C, j13, j12, true);
                        if (wpVar.s2(j13) || wpVar.x2(j13) || j13 > 0) {
                            wpVar.getNotificationCenter().k(at.Y4, Long.valueOf(j13), Long.valueOf(j12), Integer.valueOf(C), arrayList);
                            break;
                        }
                    }
                } else {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) wpVar.Q.f(j13);
                    if (dialog2 != null) {
                        int i14 = dialog2.unread_reactions_count + i13;
                        dialog2.unread_reactions_count = i14;
                        if (i14 < 0) {
                            dialog2.unread_reactions_count = 0;
                        }
                        wpVar.getMessagesStorage().i2(dialog2.unread_reactions_count, j13, 0L, false);
                        if (wpVar.s2(j13) || wpVar.x2(j13) || j13 > 0) {
                            wpVar.getNotificationCenter().k(at.Y4, Long.valueOf(j13), Long.valueOf(j12), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                            break;
                        }
                    } else {
                        wpVar.getMessagesStorage().Q1(j13, i13, true, true);
                        break;
                    }
                }
                break;
            case 2:
                y00 y00Var = wpVar.getMessagesController().r7;
                int i15 = this.e;
                long j14 = this.c;
                long j15 = this.d;
                y00Var.C(i15, j14, j15, false);
                wpVar.getMessagesStorage().i2(i15, j14, j15, false);
                wpVar.getNotificationCenter().k(at.Y4, Long.valueOf(j14), Long.valueOf(j15), Integer.valueOf(i15), arrayList);
                break;
            case 3:
                y00 y00Var2 = wpVar.getMessagesController().r7;
                int i16 = this.e;
                long j16 = this.c;
                long j17 = this.d;
                y00Var2.C(i16, j16, j17, false);
                wpVar.getMessagesStorage().i2(i16, j16, j17, false);
                wpVar.getNotificationCenter().k(at.Y4, Long.valueOf(j16), Long.valueOf(j17), Integer.valueOf(i16), arrayList);
                break;
            case 4:
                y00 y00Var3 = wpVar.getMessagesController().r7;
                int i17 = this.e;
                long j18 = this.c;
                long j19 = this.d;
                y00Var3.B(i17, j18, j19, false);
                wpVar.getMessagesStorage().h2(i17, j18, j19, false);
                wpVar.getNotificationCenter().k(at.Z4, Long.valueOf(j18), Long.valueOf(j19), Integer.valueOf(i17), arrayList);
                break;
            case 5:
                a0.h hVar = wpVar.Q;
                long j20 = this.c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(j20);
                int i18 = this.e;
                if (dialog3 != null) {
                    dialog3.unread_reactions_count = i18;
                    is messagesStorage = wpVar.getMessagesStorage();
                    long j21 = this.d;
                    messagesStorage.i2(i18, j20, j21, false);
                    wpVar.getNotificationCenter().k(at.Y4, Long.valueOf(j20), Long.valueOf(j21), Integer.valueOf(i18), arrayList);
                    break;
                } else {
                    wpVar.getMessagesStorage().Q1(j20, i18, false, true);
                    break;
                }
            default:
                a0.h hVar2 = wpVar.Q;
                long j22 = this.c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar2.f(j22);
                int i19 = this.e;
                if (dialog4 != null) {
                    dialog4.unread_poll_votes_count = i19;
                    is messagesStorage2 = wpVar.getMessagesStorage();
                    long j23 = this.d;
                    messagesStorage2.h2(i19, j22, j23, false);
                    wpVar.getNotificationCenter().k(at.Z4, Long.valueOf(j22), Long.valueOf(j23), Integer.valueOf(i19), arrayList);
                    break;
                } else {
                    wpVar.getMessagesStorage().Q1(j22, i19, false, false);
                    break;
                }
        }
    }

    public /* synthetic */ zl(wp wpVar, long j10, long j11, int i10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = wpVar;
        this.c = j10;
        this.d = j11;
        this.e = i10;
        this.f = arrayList;
    }
}
