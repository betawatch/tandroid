package org.telegram.messenger;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q6(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                g0.h3(new mn((x6) obj4, tLObject, (TLRPC.TL_getFactCheck) obj3, (ArrayList) obj2, (HashMap) obj, 2));
                break;
            case 1:
                sd sdVar = (sd) obj4;
                rd rdVar = (rd) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        sdVar.b.remove(rdVar);
                        sdVar.a.l(rdVar.a);
                        sdVar.l(rdVar, 1);
                        sdVar.F.delete(iArr[0]);
                        g0.h3(new ld(sdVar, rdVar, 1));
                        break;
                    }
                } else {
                    if ((tL_messages_editMessage.flags & 8) != 0) {
                        rdVar.g = tL_messages_editMessage.media.proximity_notification_radius;
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z9 = false;
                    for (int i11 = 0; i11 < updates.updates.size(); i11++) {
                        TLRPC.Update update = updates.updates.get(i11);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            rdVar.h.k = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            rdVar.h.k = ((TL_update.TL_updateEditChannelMessage) update).message;
                        }
                        z9 = true;
                    }
                    if (z9) {
                        sdVar.l(rdVar, 0);
                    }
                    sdVar.getMessagesController().O3(updates, false);
                    break;
                }
                break;
            case 2:
                qp qpVar = (qp) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                qpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i12 = tL_messages_affectedHistory.offset;
                    if (i12 > 0) {
                        qpVar.k0(chat, user, chat2, i12);
                    }
                    qpVar.L3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
                    break;
                }
                break;
            case 3:
                qp qpVar2 = (qp) obj4;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj2;
                String str = (String) obj;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File file = new File(t0.h(), c6Var.b);
                if (wallPaper != null) {
                    try {
                        w7 fileLoader = qpVar2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        g0.E(file, w7.J(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                g0.h3(new yj(qpVar2, wallPaper, tL_wallPaperSettings, c6Var, file, str, 0));
                break;
            case 4:
                dw dwVar = (dw) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.p;
                        int i13 = messages_dhconfig.g;
                        Pattern pattern = Utilities.a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i13)) {
                            g0.h3(new fn(2, context, u1Var));
                            break;
                        } else {
                            yr messagesStorage = dwVar.getMessagesStorage();
                            byte[] bArr2 = messages_dhconfig.p;
                            messagesStorage.H();
                            messagesStorage.y = bArr2;
                            yr messagesStorage2 = dwVar.getMessagesStorage();
                            int i14 = messages_dhconfig.g;
                            messagesStorage2.H();
                            messagesStorage2.D = i14;
                            yr messagesStorage3 = dwVar.getMessagesStorage();
                            int i15 = messages_dhconfig.version;
                            messagesStorage3.H();
                            messagesStorage3.x = i15;
                            yr messagesStorage4 = dwVar.getMessagesStorage();
                            yr messagesStorage5 = dwVar.getMessagesStorage();
                            messagesStorage5.H();
                            int i16 = messagesStorage5.x;
                            yr messagesStorage6 = dwVar.getMessagesStorage();
                            messagesStorage6.H();
                            int i17 = messagesStorage6.D;
                            yr messagesStorage7 = dwVar.getMessagesStorage();
                            messagesStorage7.H();
                            messagesStorage4.a.c(new l2.a0(messagesStorage4, i16, i17, messagesStorage7.y, 7));
                        }
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i18 = 0; i18 < 256; i18++) {
                        bArr3[i18] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i18]);
                    }
                    dwVar.getMessagesStorage().H();
                    BigInteger valueOf = BigInteger.valueOf(r1.D);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    yr messagesStorage8 = dwVar.getMessagesStorage();
                    messagesStorage8.H();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage8.y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = dwVar.getMessagesController().q1(user2);
                    tL_messages_requestEncryption.random_id = Utilities.b.nextInt();
                    dwVar.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new eo(dwVar, context, u1Var, bArr3, user2, 2), 2);
                    break;
                } else {
                    dwVar.f.clear();
                    g0.h3(new aw(dwVar, context, u1Var, i10));
                    break;
                }
            default:
                gz gzVar = (gz) obj4;
                ij ijVar = (ij) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                a0.h hVar = gzVar.x;
                if (tL_error == null) {
                    hVar.k(0L, ijVar.E1());
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    hVar.k(Long.valueOf(SystemClock.elapsedRealtime()), ijVar.E1());
                }
                g0.h3(new lg(gzVar, str2, runnable, 26));
                break;
        }
    }
}
