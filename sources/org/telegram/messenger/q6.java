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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                g0.g3(new gn((x6) obj4, tLObject, (TLRPC.TL_getFactCheck) obj3, (ArrayList) obj2, (HashMap) obj, 2));
                break;
            case 1:
                rd rdVar = (rd) obj4;
                qd qdVar = (qd) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        rdVar.b.remove(qdVar);
                        rdVar.a.l(qdVar.a);
                        rdVar.l(qdVar, 1);
                        rdVar.G.delete(iArr[0]);
                        g0.g3(new kd(rdVar, qdVar, 1));
                        break;
                    }
                } else {
                    if ((tL_messages_editMessage.flags & 8) != 0) {
                        qdVar.g = tL_messages_editMessage.media.proximity_notification_radius;
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z10 = false;
                    for (int i11 = 0; i11 < updates.updates.size(); i11++) {
                        TLRPC.Update update = updates.updates.get(i11);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            qdVar.h.k = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            qdVar.h.k = ((TL_update.TL_updateEditChannelMessage) update).message;
                        }
                        z10 = true;
                    }
                    if (z10) {
                        rdVar.l(qdVar, 0);
                    }
                    rdVar.getMessagesController().V3(updates, false);
                    break;
                }
                break;
            case 2:
                np npVar = (np) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                npVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i12 = tL_messages_affectedHistory.offset;
                    if (i12 > 0) {
                        npVar.k0(chat, user, chat2, i12);
                    }
                    npVar.S3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
                    break;
                }
                break;
            case 3:
                np npVar2 = (np) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj2;
                String str = (String) obj;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File file = new File(t0.h(), d6Var.b);
                if (wallPaper != null) {
                    try {
                        w7 fileLoader = npVar2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        g0.E(file, w7.J(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                g0.g3(new uj(npVar2, wallPaper, tL_wallPaperSettings, d6Var, file, str, 0));
                break;
            case 4:
                yv yvVar = (yv) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.p;
                        int i13 = messages_dhconfig.g;
                        Pattern pattern = Utilities.a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i13)) {
                            g0.g3(new wm(2, context, t1Var));
                            break;
                        } else {
                            ur messagesStorage = yvVar.getMessagesStorage();
                            byte[] bArr2 = messages_dhconfig.p;
                            messagesStorage.H();
                            messagesStorage.y = bArr2;
                            ur messagesStorage2 = yvVar.getMessagesStorage();
                            int i14 = messages_dhconfig.g;
                            messagesStorage2.H();
                            messagesStorage2.E = i14;
                            ur messagesStorage3 = yvVar.getMessagesStorage();
                            int i15 = messages_dhconfig.version;
                            messagesStorage3.H();
                            messagesStorage3.x = i15;
                            ur messagesStorage4 = yvVar.getMessagesStorage();
                            ur messagesStorage5 = yvVar.getMessagesStorage();
                            messagesStorage5.H();
                            int i16 = messagesStorage5.x;
                            ur messagesStorage6 = yvVar.getMessagesStorage();
                            messagesStorage6.H();
                            int i17 = messagesStorage6.E;
                            ur messagesStorage7 = yvVar.getMessagesStorage();
                            messagesStorage7.H();
                            messagesStorage4.a.c(new l2.x(messagesStorage4, i16, i17, messagesStorage7.y, 7));
                        }
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i18 = 0; i18 < 256; i18++) {
                        bArr3[i18] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i18]);
                    }
                    yvVar.getMessagesStorage().H();
                    BigInteger valueOf = BigInteger.valueOf(r1.E);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    ur messagesStorage8 = yvVar.getMessagesStorage();
                    messagesStorage8.H();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage8.y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = yvVar.getMessagesController().s1(user2);
                    tL_messages_requestEncryption.random_id = Utilities.b.nextInt();
                    yvVar.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new zn(yvVar, context, t1Var, bArr3, user2, 2), 2);
                    break;
                } else {
                    yvVar.f.clear();
                    g0.g3(new vv(yvVar, context, t1Var, i10));
                    break;
                }
            default:
                az azVar = (az) obj4;
                gj gjVar = (gj) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                a0.h hVar = azVar.x;
                if (tL_error == null) {
                    hVar.k(0L, gjVar.D1());
                    azVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    hVar.k(Long.valueOf(SystemClock.elapsedRealtime()), gjVar.D1());
                }
                g0.g3(new lg(azVar, str2, runnable, 26));
                break;
        }
    }
}
