package ai;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.en;
import org.telegram.ui.m71;
import org.telegram.ui.se;
import org.telegram.ui.sn;
import org.telegram.ui.te;
import org.telegram.ui.ti;
import org.telegram.ui.we;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        Boolean bool;
        boolean z13;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        String str;
        boolean z14;
        String str2;
        boolean z15;
        int i10;
        switch (this.a) {
            case 0:
                k7.S0((k7) this.c, (boolean[]) this.b, (TextView) this.d, (TL_stars.starGiftDepositPayload[]) this.e, (Runnable[]) this.f, (TL_stars.starGiftDepositPayload) obj);
                break;
            case 1:
                sn snVar = (sn) this.c;
                boolean[] zArr = (boolean[]) this.b;
                pf.c cVar = (pf.c) this.d;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                i2.d1 d1Var = (i2.d1) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr[0]) {
                    if (cVar != null) {
                        cVar.b();
                    }
                    userArr[0] = (walletuseraddress == null || walletuseraddress.user_id == 0) ? null : snVar.getMessagesController().getUser(Long.valueOf(walletuseraddress.user_id));
                    d1Var.run();
                    break;
                }
                break;
            case 2:
                sn snVar2 = (sn) this.c;
                pf.c cVar2 = (pf.c) this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                String str3 = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                cVar2.b();
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).id;
                    z11 = true;
                    z10 = false;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    long j11 = -chat.id;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = j11;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                }
                i80 I = i80.I(snVar2, u1Var);
                ym0 ym0Var = new ym0(snVar2.getParentActivity(), snVar2.ea);
                I.p = new se(ym0Var, 0);
                if (j10 != 0) {
                    z12 = z10;
                    bool = bool2;
                    z13 = false;
                    I.c(z10 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z10 ? R.string.ViewChannel : R.string.SendMessage), new org.telegram.ui.le(snVar2, j10, 3), false);
                } else {
                    z12 = z10;
                    bool = bool2;
                    z13 = false;
                }
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new we(snVar2, ym0Var, str3, 2), z13);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new te(snVar2, str3, 13), z13);
                }
                I.k();
                if (j10 != 0) {
                    I.n(tLObject, LocaleController.getString(z11 ? R.string.ViewProfile : z12 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile), new org.telegram.ui.le(snVar2, j10, 4));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                ym0Var.e(I);
                ym0Var.f(u1Var, characterStyle, null, false);
                snVar2.showDialog(ym0Var);
                break;
            case 3:
                sn snVar3 = (sn) this.c;
                ti tiVar = (ti) this.b;
                int[] iArr = (int[]) this.d;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (snVar3.Ab == tiVar) {
                    iArr[0] = 0;
                    tiVar.c(false);
                    if (messages_messages != null) {
                        snVar3.getMessagesController().putUsers(messages_messages.users, false);
                        snVar3.getMessagesController().putChats(messages_messages.chats, false);
                        int i11 = 0;
                        while (true) {
                            if (i11 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i11);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i11++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = messageObject.messageOwner) != null) {
                            message.rich_message = richMessage;
                            messageObject.richLayout = null;
                            en enVar = snVar3.pc;
                            if (enVar != null && u1Var2 != null) {
                                enVar.h(u1Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.c;
                org.telegram.ui.Wallet.z6 z6Var = (org.telegram.ui.Wallet.z6) this.b;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.d;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction z16 = org.telegram.ui.Wallet.m0.z(updates);
                if (updates != null) {
                    Utilities.stageQueue.postRunnable(new m71(23, m0Var, updates));
                }
                if (z16 != null) {
                    String str4 = z16.msg_hash;
                    if (!TextUtils.isEmpty(str4)) {
                        try {
                            org.telegram.ui.Wallet.m0.e0(str4);
                            org.telegram.ui.Wallet.m0.F("disable backup: transfer is sent, msg_hash=" + z16.msg_hash + ", gasless=" + z16.gasless);
                            org.telegram.ui.Wallet.g0 g0Var = new org.telegram.ui.Wallet.g0(m0Var);
                            g0Var.a = z16.msg_hash;
                            g0Var.c = h0Var.c;
                            g0Var.b = j0Var;
                            if (z16.transaction != null) {
                                g0Var.a();
                            } else {
                                m0Var.r.add(g0Var);
                            }
                            m0Var.c(wallettransaction, z16);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                z6Var.run();
                if (tL_error == null || (str = tL_error.text) == null) {
                    str = "NULL_ERROR";
                }
                org.telegram.ui.Wallet.m0.i("disable backup: sendTransfer: ".concat(str));
                break;
            case 5:
                org.telegram.ui.Wallet.m0 m0Var2 = (org.telegram.ui.Wallet.m0) this.c;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.b;
                SendMessagesHelper sendMessagesHelper = (SendMessagesHelper) this.d;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Wallet.z6 z6Var2 = (org.telegram.ui.Wallet.z6) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction z17 = org.telegram.ui.Wallet.m0.z(updates2);
                if (tL_error2 == null && z17 != null) {
                    String str5 = z17.msg_hash;
                    if (!TextUtils.isEmpty(str5)) {
                        try {
                            org.telegram.ui.Wallet.m0.e0(str5);
                            z14 = true;
                        } catch (IllegalArgumentException unused2) {
                        }
                        sendMessagesHelper.completeSendingGramTransfer(messageObject2, updates2, !z14 || (wallettransaction2.pending && !wallettransaction2.failed && !TextUtils.isEmpty(wallettransaction2.id)));
                        if (updates2 != null) {
                            Utilities.stageQueue.postRunnable(new m71(23, m0Var2, updates2));
                        }
                        if (!z14) {
                            org.telegram.ui.Wallet.m0.F("transfer is sent, msg_hash=" + z17.msg_hash + ", gasless=" + z17.gasless);
                            m0Var2.c(wallettransaction2, z17);
                            break;
                        } else {
                            z6Var2.run();
                            if (tL_error2 == null || (str2 = tL_error2.text) == null) {
                                str2 = "NULL_ERROR";
                            }
                            org.telegram.ui.Wallet.m0.i("sendTransfer: ".concat(str2));
                            break;
                        }
                    }
                }
                z14 = false;
                sendMessagesHelper.completeSendingGramTransfer(messageObject2, updates2, !z14 || (wallettransaction2.pending && !wallettransaction2.failed && !TextUtils.isEmpty(wallettransaction2.id)));
                if (updates2 != null) {
                }
                if (!z14) {
                }
                break;
            case 6:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    z15 = updates3.update instanceof TL_update.TL_updateSentWalletTransaction;
                    ArrayList<TLRPC.Update> arrayList = updates3.updates;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.Update update = arrayList.get(i12);
                        i12++;
                        z15 |= update instanceof TL_update.TL_updateSentWalletTransaction;
                    }
                    Utilities.stageQueue.postRunnable(new m71(28, f2Var, updates3));
                } else {
                    z15 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    f2Var.b.C();
                }
                if ((tL_error3 == null && !z15) || (tL_error3 != null && ((i10 = tL_error3.code) < 0 || i10 >= 500))) {
                    callback.run(org.telegram.ui.Wallet.f2.x(tL_error3, "sendTransfer"));
                    break;
                } else {
                    f2Var.w(b2Var, j0Var2, tL_error3 == null ? Base64.encodeToString(sendtransfer.data_normal, 2) : null, tL_error3 == null ? -1 : 0, tL_error3 != null ? org.telegram.ui.Wallet.f2.x(tL_error3, "sendTransfer") : null, callback);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.c;
                org.telegram.ui.Wallet.p pVar = (org.telegram.ui.Wallet.p) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str6 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.j0 j0Var3 = (org.telegram.ui.Wallet.j0) obj;
                String str7 = (String) obj2;
                f2Var2.getClass();
                if (str7 == null && j0Var3 != null) {
                    org.telegram.ui.Wallet.j0 b10 = j0Var3.b();
                    org.telegram.ui.Wallet.x xVar = new org.telegram.ui.Wallet.x(2, b10, pVar);
                    TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                    tonconnectgetnexteventid.session_id = tonconnectsession.id;
                    f2Var2.f.sendRequestTyped(tonconnectgetnexteventid, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.i1(f2Var2, xVar, b10, tonconnectsession, str6, bArr));
                    break;
                } else {
                    if (str7 == null) {
                        str7 = "Recovery phrase is unavailable";
                    }
                    pVar.run(str7);
                    break;
                }
        }
    }
}
