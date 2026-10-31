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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                i0.g3(new cn((a7) obj4, tLObject, (TLRPC.TL_getFactCheck) obj3, (ArrayList) obj2, (HashMap) obj, 2));
                break;
            case 1:
                nd ndVar = (nd) obj4;
                md mdVar = (md) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        ndVar.b.remove(mdVar);
                        ndVar.a.l(mdVar.a);
                        ndVar.l(mdVar, 1);
                        ndVar.F.delete(iArr[0]);
                        i0.g3(new gd(ndVar, mdVar, 1));
                        break;
                    }
                } else {
                    if ((tL_messages_editMessage.flags & 8) != 0) {
                        mdVar.g = tL_messages_editMessage.media.proximity_notification_radius;
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z10 = false;
                    for (int i12 = 0; i12 < updates.updates.size(); i12++) {
                        TLRPC.Update update = updates.updates.get(i12);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            mdVar.h.k = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            mdVar.h.k = ((TL_update.TL_updateEditChannelMessage) update).message;
                        }
                        z10 = true;
                    }
                    if (z10) {
                        ndVar.l(mdVar, 0);
                    }
                    ndVar.getMessagesController().L3(updates, false);
                    break;
                }
                break;
            case 2:
                vp vpVar = (vp) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                vpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i13 = tL_messages_affectedHistory.offset;
                    if (i13 > 0) {
                        vpVar.k0(chat, user, chat2, i13);
                    }
                    vpVar.I3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
                    break;
                }
                break;
            case 3:
                vp vpVar2 = (vp) obj4;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj2;
                String str = (String) obj;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File file = new File(w0.h(), m6Var.b);
                if (wallPaper != null) {
                    try {
                        b8 fileLoader = vpVar2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        i0.E(file, b8.K(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                i0.g3(new ek(vpVar2, wallPaper, tL_wallPaperSettings, m6Var, file, str, 0));
                break;
            case 4:
                ow owVar = (ow) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.p;
                        int i14 = messages_dhconfig.g;
                        Pattern pattern = Utilities.a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i14)) {
                            i0.g3(new fn(2, context, x1Var));
                            break;
                        } else {
                            hs messagesStorage = owVar.getMessagesStorage();
                            byte[] bArr2 = messages_dhconfig.p;
                            messagesStorage.H();
                            messagesStorage.y = bArr2;
                            hs messagesStorage2 = owVar.getMessagesStorage();
                            int i15 = messages_dhconfig.g;
                            messagesStorage2.H();
                            messagesStorage2.D = i15;
                            hs messagesStorage3 = owVar.getMessagesStorage();
                            int i16 = messages_dhconfig.version;
                            messagesStorage3.H();
                            messagesStorage3.x = i16;
                            hs messagesStorage4 = owVar.getMessagesStorage();
                            hs messagesStorage5 = owVar.getMessagesStorage();
                            messagesStorage5.H();
                            int i17 = messagesStorage5.x;
                            hs messagesStorage6 = owVar.getMessagesStorage();
                            messagesStorage6.H();
                            int i18 = messagesStorage6.D;
                            hs messagesStorage7 = owVar.getMessagesStorage();
                            messagesStorage7.H();
                            messagesStorage4.a.c(new i2.a0(messagesStorage4, i17, i18, messagesStorage7.y, 7));
                        }
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i19 = 0; i19 < 256; i19++) {
                        bArr3[i19] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i19]);
                    }
                    owVar.getMessagesStorage().H();
                    BigInteger valueOf = BigInteger.valueOf(r1.D);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    hs messagesStorage8 = owVar.getMessagesStorage();
                    messagesStorage8.H();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage8.y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = owVar.getMessagesController().p1(user2);
                    tL_messages_requestEncryption.random_id = Utilities.b.nextInt();
                    owVar.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new ko(owVar, context, x1Var, bArr3, user2, 2), 2);
                    break;
                } else {
                    owVar.f.clear();
                    i0.g3(new lw(owVar, context, x1Var, i11));
                    break;
                }
            default:
                qz qzVar = (qz) obj4;
                jj jjVar = (jj) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                a0.h hVar = qzVar.x;
                if (tL_error == null) {
                    hVar.k(0L, jjVar.E1());
                    qzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    hVar.k(Long.valueOf(SystemClock.elapsedRealtime()), jjVar.E1());
                }
                i0.g3(new kg(qzVar, str2, runnable, 26));
                break;
        }
    }
}
