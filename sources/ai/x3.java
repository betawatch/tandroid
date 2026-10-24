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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.dn;
import org.telegram.ui.o71;
import org.telegram.ui.qe;
import org.telegram.ui.re;
import org.telegram.ui.ri;
import org.telegram.ui.sn;
import org.telegram.ui.ue;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
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
                l7.w0((l7) this.c, (boolean[]) this.b, (TextView) this.d, (TL_stars.starGiftDepositPayload[]) this.e, (Runnable[]) this.f, (TL_stars.starGiftDepositPayload) obj);
                break;
            case 1:
                sn snVar = (sn) this.c;
                boolean[] zArr = (boolean[]) this.b;
                pf.c cVar = (pf.c) this.d;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                p4 p4Var = (p4) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr[0]) {
                    if (cVar != null) {
                        cVar.b();
                    }
                    userArr[0] = (walletuseraddress == null || walletuseraddress.user_id == 0) ? null : snVar.getMessagesController().getUser(Long.valueOf(walletuseraddress.user_id));
                    p4Var.run();
                    break;
                }
                break;
            case 2:
                sn snVar2 = (sn) this.c;
                pf.c cVar2 = (pf.c) this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
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
                j80 I = j80.I(snVar2, t1Var);
                cn0 cn0Var = new cn0(snVar2.getParentActivity(), snVar2.qa);
                I.p = new qe(cn0Var, 0);
                if (j10 != 0) {
                    z12 = z10;
                    bool = bool2;
                    z13 = false;
                    I.c(z10 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z10 ? R.string.ViewChannel : R.string.SendMessage), new org.telegram.ui.je(snVar2, j10, 4), false);
                } else {
                    z12 = z10;
                    bool = bool2;
                    z13 = false;
                }
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new ue(snVar2, cn0Var, str3, 3), z13);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new re(snVar2, str3, 13), z13);
                }
                I.k();
                if (j10 != 0) {
                    I.n(tLObject, LocaleController.getString(z11 ? R.string.ViewProfile : z12 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile), new org.telegram.ui.je(snVar2, j10, 5));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                cn0Var.e(I);
                cn0Var.f(t1Var, characterStyle, null, false);
                snVar2.showDialog(cn0Var);
                break;
            case 3:
                sn snVar3 = (sn) this.c;
                ri riVar = (ri) this.b;
                int[] iArr = (int[]) this.d;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (snVar3.Nb == riVar) {
                    iArr[0] = 0;
                    riVar.c(false);
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
                            dn dnVar = snVar3.Cc;
                            if (dnVar != null && t1Var2 != null) {
                                dnVar.h(t1Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.c;
                org.telegram.ui.Wallet.w6 w6Var = (org.telegram.ui.Wallet.w6) this.b;
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) this.d;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction z16 = org.telegram.ui.Wallet.l0.z(updates);
                if (updates != null) {
                    Utilities.stageQueue.postRunnable(new o71(23, l0Var, updates));
                }
                if (z16 != null) {
                    String str4 = z16.msg_hash;
                    if (!TextUtils.isEmpty(str4)) {
                        try {
                            org.telegram.ui.Wallet.l0.e0(str4);
                            org.telegram.ui.Wallet.l0.F("disable backup: transfer is sent, msg_hash=" + z16.msg_hash + ", gasless=" + z16.gasless);
                            org.telegram.ui.Wallet.f0 f0Var = new org.telegram.ui.Wallet.f0(l0Var);
                            f0Var.a = z16.msg_hash;
                            f0Var.c = g0Var.c;
                            f0Var.b = i0Var;
                            if (z16.transaction != null) {
                                f0Var.a();
                            } else {
                                l0Var.r.add(f0Var);
                            }
                            l0Var.c(wallettransaction, z16);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                w6Var.run();
                if (tL_error == null || (str = tL_error.text) == null) {
                    str = "NULL_ERROR";
                }
                org.telegram.ui.Wallet.l0.i("disable backup: sendTransfer: ".concat(str));
                break;
            case 5:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.c;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.b;
                SendMessagesHelper sendMessagesHelper = (SendMessagesHelper) this.d;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Wallet.w6 w6Var2 = (org.telegram.ui.Wallet.w6) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction z17 = org.telegram.ui.Wallet.l0.z(updates2);
                if (tL_error2 == null && z17 != null) {
                    String str5 = z17.msg_hash;
                    if (!TextUtils.isEmpty(str5)) {
                        try {
                            org.telegram.ui.Wallet.l0.e0(str5);
                            z14 = true;
                        } catch (IllegalArgumentException unused2) {
                        }
                        sendMessagesHelper.completeSendingGramTransfer(messageObject2, updates2, !z14 || (wallettransaction2.pending && !wallettransaction2.failed && !TextUtils.isEmpty(wallettransaction2.id)));
                        if (updates2 != null) {
                            Utilities.stageQueue.postRunnable(new o71(23, l0Var2, updates2));
                        }
                        if (!z14) {
                            org.telegram.ui.Wallet.l0.F("transfer is sent, msg_hash=" + z17.msg_hash + ", gasless=" + z17.gasless);
                            l0Var2.c(wallettransaction2, z17);
                            break;
                        } else {
                            w6Var2.run();
                            if (tL_error2 == null || (str2 = tL_error2.text) == null) {
                                str2 = "NULL_ERROR";
                            }
                            org.telegram.ui.Wallet.l0.i("sendTransfer: ".concat(str2));
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
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.d;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.e;
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
                    Utilities.stageQueue.postRunnable(new o71(28, e2Var, updates3));
                } else {
                    z15 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    e2Var.b.C();
                }
                if ((tL_error3 == null && !z15) || (tL_error3 != null && ((i10 = tL_error3.code) < 0 || i10 >= 500))) {
                    callback.run(org.telegram.ui.Wallet.e2.x(tL_error3, "sendTransfer"));
                    break;
                } else {
                    e2Var.w(a2Var, i0Var2, tL_error3 == null ? Base64.encodeToString(sendtransfer.data_normal, 2) : null, tL_error3 == null ? -1 : 0, tL_error3 != null ? org.telegram.ui.Wallet.e2.x(tL_error3, "sendTransfer") : null, callback);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.c;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str6 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) obj;
                String str7 = (String) obj2;
                e2Var2.getClass();
                if (str7 == null && i0Var3 != null) {
                    org.telegram.ui.Wallet.i0 b10 = i0Var3.b();
                    org.telegram.ui.Wallet.w wVar = new org.telegram.ui.Wallet.w(2, b10, oVar);
                    TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                    tonconnectgetnexteventid.session_id = tonconnectsession.id;
                    e2Var2.f.sendRequestTyped(tonconnectgetnexteventid, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.h1(e2Var2, wVar, b10, tonconnectsession, str6, bArr));
                    break;
                } else {
                    if (str7 == null) {
                        str7 = "Recovery phrase is unavailable";
                    }
                    oVar.run(str7);
                    break;
                }
        }
    }
}
