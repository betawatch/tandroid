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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                g0.g3(new fn((x6) obj4, tLObject, (TLRPC.TL_getFactCheck) obj3, (ArrayList) obj2, (HashMap) obj, 2));
                break;
            case 1:
                qd qdVar = (qd) obj4;
                pd pdVar = (pd) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        qdVar.b.remove(pdVar);
                        qdVar.a.l(pdVar.a);
                        qdVar.l(pdVar, 1);
                        qdVar.G.delete(iArr[0]);
                        g0.g3(new jd(qdVar, pdVar, 1));
                        break;
                    }
                } else {
                    if ((tL_messages_editMessage.flags & 8) != 0) {
                        pdVar.g = tL_messages_editMessage.media.proximity_notification_radius;
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z10 = false;
                    for (int i11 = 0; i11 < updates.updates.size(); i11++) {
                        TLRPC.Update update = updates.updates.get(i11);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            pdVar.h.k = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            pdVar.h.k = ((TL_update.TL_updateEditChannelMessage) update).message;
                        }
                        z10 = true;
                    }
                    if (z10) {
                        qdVar.l(pdVar, 0);
                    }
                    qdVar.getMessagesController().V3(updates, false);
                    break;
                }
                break;
            case 2:
                mp mpVar = (mp) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                mpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i12 = tL_messages_affectedHistory.offset;
                    if (i12 > 0) {
                        mpVar.k0(chat, user, chat2, i12);
                    }
                    mpVar.S3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
                    break;
                }
                break;
            case 3:
                mp mpVar2 = (mp) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj2;
                String str = (String) obj;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File file = new File(t0.h(), d6Var.b);
                if (wallPaper != null) {
                    try {
                        w7 fileLoader = mpVar2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        g0.E(file, w7.J(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                g0.g3(new tj(mpVar2, wallPaper, tL_wallPaperSettings, d6Var, file, str, 0));
                break;
            case 4:
                xv xvVar = (xv) obj4;
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
                            g0.g3(new vm(2, context, t1Var));
                            break;
                        } else {
                            tr messagesStorage = xvVar.getMessagesStorage();
                            byte[] bArr2 = messages_dhconfig.p;
                            messagesStorage.H();
                            messagesStorage.y = bArr2;
                            tr messagesStorage2 = xvVar.getMessagesStorage();
                            int i14 = messages_dhconfig.g;
                            messagesStorage2.H();
                            messagesStorage2.E = i14;
                            tr messagesStorage3 = xvVar.getMessagesStorage();
                            int i15 = messages_dhconfig.version;
                            messagesStorage3.H();
                            messagesStorage3.x = i15;
                            tr messagesStorage4 = xvVar.getMessagesStorage();
                            tr messagesStorage5 = xvVar.getMessagesStorage();
                            messagesStorage5.H();
                            int i16 = messagesStorage5.x;
                            tr messagesStorage6 = xvVar.getMessagesStorage();
                            messagesStorage6.H();
                            int i17 = messagesStorage6.E;
                            tr messagesStorage7 = xvVar.getMessagesStorage();
                            messagesStorage7.H();
                            messagesStorage4.a.c(new l2.x(messagesStorage4, i16, i17, messagesStorage7.y, 7));
                        }
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i18 = 0; i18 < 256; i18++) {
                        bArr3[i18] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i18]);
                    }
                    xvVar.getMessagesStorage().H();
                    BigInteger valueOf = BigInteger.valueOf(r1.E);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    tr messagesStorage8 = xvVar.getMessagesStorage();
                    messagesStorage8.H();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage8.y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = xvVar.getMessagesController().s1(user2);
                    tL_messages_requestEncryption.random_id = Utilities.b.nextInt();
                    xvVar.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new yn(xvVar, context, t1Var, bArr3, user2, 2), 2);
                    break;
                } else {
                    xvVar.f.clear();
                    g0.g3(new uv(xvVar, context, t1Var, i10));
                    break;
                }
            default:
                zy zyVar = (zy) obj4;
                fj fjVar = (fj) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                a0.h hVar = zyVar.x;
                if (tL_error == null) {
                    hVar.k(0L, fjVar.D1());
                    zyVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    hVar.k(Long.valueOf(SystemClock.elapsedRealtime()), fjVar.D1());
                }
                g0.g3(new kg(zyVar, str2, runnable, 26));
                break;
        }
    }
}
