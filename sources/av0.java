// default package

import android.app.Activity;
import android.os.SystemClock;
import android.util.LongSparseArray;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class av0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ av0(mh6 mh6Var, String str, String str2, String str3) {
        this.a = (byte) 8;
        this.b = mh6Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = null;
        byte b2 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                gm.c3(new da7(obj4, (Object) tLObject, obj3, obj2, obj, (byte) 6));
                break;
            case 1:
                qw0 qw0Var = (qw0) obj4;
                qw0Var.getClass();
                gm.c3(new e77((jm7) qw0Var, (Object) tLObject, obj3, (String) obj2, (TLObject) tL_error, obj, (byte) 3));
                break;
            case 2:
                qg1 qg1Var = (qg1) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                he heVar = (he) obj;
                vg1 vg1Var = qg1Var.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i = 0; i < tL_messages_exportedChatInvite.users.size(); i++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i);
                        if (vg1Var.A0 == null) {
                            vg1Var.A0 = new HashMap();
                        }
                        vg1Var.A0.put(Long.valueOf(user.id), user);
                    }
                }
                gm.c3(new da7((Object) qg1Var, (Object) tL_chatInviteExported, (Object) tL_messages_exportedChatInvite, (Object) zArr, (Object) heVar, (byte) 14));
                break;
            case 3:
                gm.c3(new xo1((ib2) obj4, (he[]) obj3, (TLRPC.Chat) obj2, (uc5) obj, (byte) 8));
                break;
            case 4:
                gm.c3(new da7(obj4, tL_error, obj3, obj2, obj, (byte) 22));
                break;
            case 5:
                gm.c3(new da7(obj4, (Object) tLObject, obj3, obj2, obj, (byte) 27));
                break;
            case 6:
                gm.c3(new e77(obj4, obj3, (Object) tLObject, obj2, obj, (Object) tL_error, (byte) 9));
                break;
            case 7:
                dd6 dd6Var = (dd6) obj4;
                cd6 cd6Var = (cd6) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                if (tL_error != null) {
                    if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                        dd6Var.b.remove(cd6Var);
                        dd6Var.a.l(cd6Var.a);
                        dd6Var.l(cd6Var, 1);
                        dd6Var.G.delete(iArr[0]);
                        gm.c3(new wc6(dd6Var, cd6Var, (byte) 1));
                        break;
                    }
                } else {
                    if ((tL_messages_editMessage.flags & 8) != 0) {
                        cd6Var.g = tL_messages_editMessage.media.proximity_notification_radius;
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 < updates.updates.size()) {
                        TLRPC.Update update = updates.updates.get(i2);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            cd6Var.h.k = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            cd6Var.h.k = ((TL_update.TL_updateEditChannelMessage) update).message;
                        } else {
                            i2++;
                            z = z;
                        }
                        z = true;
                        i2++;
                        z = z;
                    }
                    if (z) {
                        dd6Var.l(cd6Var, 0);
                    }
                    dd6Var.getMessagesController().T3(updates, false);
                    break;
                }
                break;
            case 8:
                mh6 mh6Var = (mh6) obj4;
                mh6Var.getClass();
                gm.c3(new v15(mh6Var, tL_error, (String) obj2, (String) obj, (String) obj3));
                break;
            case 9:
                gm.c3(new e77((d17) obj4, (String) obj2, tL_error, tLObject, (oc7) obj3, (cf7) obj));
                break;
            case 10:
                oc7 oc7Var = (oc7) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i3 = tL_messages_affectedHistory.offset;
                    if (i3 > 0) {
                        oc7Var.g0(chat, user2, chat2, i3);
                    }
                    oc7Var.Q3(tL_messages_affectedHistory.pts, tL_messages_affectedHistory.pts_count, chat.id);
                    break;
                }
                break;
            case 11:
                oc7 oc7Var2 = (oc7) obj4;
                xlb xlbVar = (xlb) obj3;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) obj;
                String str = (String) obj2;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                File e = usc.e(xlbVar.b);
                if (wallPaper != null) {
                    try {
                        bc4 fileLoader = oc7Var2.getFileLoader();
                        TLRPC.Document document = wallPaper.document;
                        fileLoader.getClass();
                        gm.E(e, bc4.J(document, null, true, true));
                    } catch (Exception unused) {
                    }
                }
                gm.c3(new e77((Object) oc7Var2, (Object) wallPaper, (Object) tL_wallPaperSettings, (Object) xlbVar, (Object) e, (Object) str, (byte) 0));
                break;
            case 12:
                gm.c3(new e77((xz7) obj4, tL_error, (String) obj2, (ez7) obj3, tLObject, (TL_account.sendVerifyPhoneCode) obj));
                break;
            case 13:
                gm.c3(new hz7(obj4, (Object) tL_error, obj3, obj2, obj, (byte) 0));
                break;
            case 14:
                gm.c3(new hz7((a58) obj4, (b7b) obj3, tL_error, (TL_stories.StoryItem) obj2, (y7b) obj));
                break;
            case 15:
                gm.c3(new hz7(obj4, (Object) tL_error, obj3, obj2, obj, (byte) 7));
                break;
            case 16:
                gm.c3(new e77(obj4, (Object) tLObject, obj3, (Object) tL_error, obj, obj2, (byte) 21));
                break;
            case 17:
                dw9 dw9Var = (dw9) obj4;
                Activity activity = (Activity) obj3;
                he heVar2 = (he) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                if (tL_error == null) {
                    TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
                    if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                        byte[] bArr = messages_dhconfig.p;
                        int i4 = messages_dhconfig.g;
                        Pattern pattern = Utilities.a;
                        if (!ConnectionsManager.native_isGoodPrime(bArr, i4)) {
                            gm.c3(new ya7(activity, heVar2, (byte) 1));
                            break;
                        } else {
                            cf7 messagesStorage = dw9Var.getMessagesStorage();
                            byte[] bArr2 = messages_dhconfig.p;
                            messagesStorage.G();
                            messagesStorage.y = bArr2;
                            cf7 messagesStorage2 = dw9Var.getMessagesStorage();
                            int i5 = messages_dhconfig.g;
                            messagesStorage2.G();
                            messagesStorage2.E = i5;
                            cf7 messagesStorage3 = dw9Var.getMessagesStorage();
                            int i6 = messages_dhconfig.version;
                            messagesStorage3.G();
                            messagesStorage3.x = i6;
                            cf7 messagesStorage4 = dw9Var.getMessagesStorage();
                            cf7 messagesStorage5 = dw9Var.getMessagesStorage();
                            messagesStorage5.G();
                            int i7 = messagesStorage5.x;
                            cf7 messagesStorage6 = dw9Var.getMessagesStorage();
                            messagesStorage6.G();
                            int i8 = messagesStorage6.E;
                            cf7 messagesStorage7 = dw9Var.getMessagesStorage();
                            messagesStorage7.G();
                            messagesStorage4.a.c(new zq1(messagesStorage4, i7, i8, messagesStorage7.y, (byte) 10));
                        }
                    }
                    byte[] bArr3 = new byte[256];
                    for (int i9 = 0; i9 < 256; i9++) {
                        bArr3[i9] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i9]);
                    }
                    dw9Var.getMessagesStorage().G();
                    BigInteger valueOf = BigInteger.valueOf(r0.E);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    cf7 messagesStorage8 = dw9Var.getMessagesStorage();
                    messagesStorage8.G();
                    byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, messagesStorage8.y)).toByteArray();
                    if (byteArray.length > 256) {
                        byte[] bArr4 = new byte[256];
                        System.arraycopy(byteArray, 1, bArr4, 0, 256);
                        byteArray = bArr4;
                    }
                    TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
                    tL_messages_requestEncryption.g_a = byteArray;
                    tL_messages_requestEncryption.user_id = dw9Var.getMessagesController().p1(user3);
                    tL_messages_requestEncryption.random_id = Utilities.b.nextInt();
                    dw9Var.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new fo0((Object) dw9Var, (Object) activity, (Object) heVar2, (Object) bArr3, (Object) user3, (byte) 13), 2);
                    break;
                } else {
                    dw9Var.f.clear();
                    gm.c3(new aw9(dw9Var, activity, heVar2, false ? 1 : 0));
                    break;
                }
            case 18:
                a6a a6aVar = (a6a) obj4;
                k47 k47Var = (k47) obj3;
                String str2 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                vh6 vh6Var = a6aVar.x;
                if (tL_error == null) {
                    vh6Var.k(0L, k47Var.D1());
                    a6aVar.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    vh6Var.k(Long.valueOf(SystemClock.elapsedRealtime()), k47Var.D1());
                }
                gm.c3(new hw9(a6aVar, str2, runnable, b2));
                break;
            case 19:
                gm.c3(new fqa((wsa) obj4, tLObject, (yw4[]) obj3, (Long) obj2, (hw9) obj, tL_error, (byte) 1));
                break;
            case 20:
                wsa wsaVar = (wsa) obj4;
                wsaVar.getClass();
                gm.c3(new fqa(wsaVar, tLObject, (CharSequence) obj3, (TL_stars.TL_starGiftUnique) obj2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj, tL_error, (byte) 0));
                break;
            case 21:
                gm.c3(new fqa((jva) obj4, tLObject, (k47) obj3, (TLRPC.TL_inputInvoiceMessage) obj2, (fo1) obj, tL_error, (byte) 4));
                break;
            case 22:
                gm.c3(new hz7(obj4, obj3, (Object) tLObject, obj2, obj, (byte) 29));
                break;
            case 23:
                yua yuaVar = (yua) obj4;
                yuaVar.getClass();
                gm.c3(new fqa(yuaVar, tLObject, (TL_stars.TL_starGiftCollection) obj3, (ava) obj2, (qac) obj, tL_error, (byte) 6));
                break;
            case 24:
                q98 q98Var = (q98) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ara araVar = (ara) obj;
                if (tL_error != null && ad4.r(tL_error.text) && obj3 != null) {
                    ad4.n(q98Var.a).u(new Object[]{tL_messages_getAttachedStickers, araVar}, obj3);
                    break;
                } else {
                    araVar.run(tLObject, tL_error);
                    break;
                }
            case 25:
                gm.c3(new vua((d3b) obj4, (TLRPC.TL_messages_getStickers) obj3, tLObject, (ArrayList) obj2, (LongSparseArray) obj));
                break;
            default:
                g6b g6bVar = (g6b) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                go9 go9Var = (go9) obj;
                if (tL_error != null && ad4.r(tL_error.text) && storyItem != null) {
                    ad4.n(g6bVar.a).u(new Object[]{tL_messages_getAttachedStickers2, go9Var}, storyItem);
                    break;
                } else {
                    go9Var.run(tLObject, tL_error);
                    break;
                }
        }
    }

    public /* synthetic */ av0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ av0(Object obj, Object obj2, Object obj3, String str, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.d = obj3;
        this.c = str;
    }

    public /* synthetic */ av0(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = str;
        this.e = obj2;
        this.d = obj3;
    }
}
