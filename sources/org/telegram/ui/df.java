package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
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
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ df(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0160  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        long j3;
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
                zn znVar = (zn) this.b;
                boolean[] zArr = (boolean[]) this.d;
                of.e eVar = (of.e) this.c;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                i2.c1 c1Var = (i2.c1) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr[0]) {
                    if (eVar != null) {
                        eVar.b();
                    }
                    userArr[0] = (walletuseraddress == null || walletuseraddress.user_id == 0) ? null : znVar.getMessagesController().getUser(Long.valueOf(walletuseraddress.user_id));
                    c1Var.run();
                    break;
                }
                break;
            case 1:
                zn znVar2 = (zn) this.b;
                of.e eVar2 = (of.e) this.c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                String str3 = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                eVar2.b();
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                    z11 = true;
                    z10 = false;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    long j10 = -chat.id;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = j10;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j3 = 0;
                }
                org.telegram.ui.Components.p80 I = org.telegram.ui.Components.p80.I(znVar2, u1Var);
                org.telegram.ui.Components.gn0 gn0Var = new org.telegram.ui.Components.gn0(znVar2.getParentActivity(), znVar2.ea);
                I.p = new se(gn0Var, 0);
                if (j3 != 0) {
                    z12 = z10;
                    bool = bool2;
                    z13 = false;
                    I.c(z10 ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(z10 ? R.string.ViewChannel : R.string.SendMessage), new le(znVar2, j3, 3), false);
                } else {
                    z12 = z10;
                    bool = bool2;
                    z13 = false;
                }
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new ye(znVar2, gn0Var, str3, 2), z13);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new ue(znVar2, str3, 13), z13);
                }
                I.k();
                if (j3 != 0) {
                    I.n(tLObject, LocaleController.getString(z11 ? R.string.ViewProfile : z12 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile), new le(znVar2, j3, 4));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                gn0Var.e(I);
                gn0Var.f(u1Var, characterStyle, null, false);
                znVar2.showDialog(gn0Var);
                break;
            case 2:
                zn znVar3 = (zn) this.b;
                aj ajVar = (aj) this.d;
                int[] iArr = (int[]) this.c;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (znVar3.Ab == ajVar) {
                    iArr[0] = 0;
                    ajVar.c(false);
                    if (messages_messages != null) {
                        znVar3.getMessagesController().putUsers(messages_messages.users, false);
                        znVar3.getMessagesController().putChats(messages_messages.chats, false);
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
                            ln lnVar = znVar3.pc;
                            if (lnVar != null && u1Var2 != null) {
                                lnVar.h(u1Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) this.d;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.c;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction y3 = org.telegram.ui.Wallet.k0.y(updates);
                if (updates != null) {
                    Utilities.stageQueue.postRunnable(new ii1(1, k0Var, updates));
                }
                if (y3 != null) {
                    String str4 = y3.msg_hash;
                    if (!TextUtils.isEmpty(str4)) {
                        try {
                            org.telegram.ui.Wallet.k0.c0(str4);
                            org.telegram.ui.Wallet.k0.E("disable backup: transfer is sent, msg_hash=" + y3.msg_hash + ", gasless=" + y3.gasless);
                            org.telegram.ui.Wallet.e0 e0Var = new org.telegram.ui.Wallet.e0(k0Var);
                            e0Var.a = y3.msg_hash;
                            e0Var.c = f0Var.c;
                            e0Var.b = h0Var;
                            if (y3.transaction != null) {
                                e0Var.a();
                            } else {
                                k0Var.q.add(e0Var);
                            }
                            k0Var.d(wallettransaction, y3);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                m6Var.run();
                if (tL_error == null || (str = tL_error.text) == null) {
                    str = "NULL_ERROR";
                }
                org.telegram.ui.Wallet.k0.i("disable backup: sendTransfer: ".concat(str));
                break;
            case 4:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                SendMessagesHelper sendMessagesHelper = (SendMessagesHelper) this.c;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Wallet.m6 m6Var2 = (org.telegram.ui.Wallet.m6) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction y10 = org.telegram.ui.Wallet.k0.y(updates2);
                if (tL_error2 == null && y10 != null) {
                    String str5 = y10.msg_hash;
                    if (!TextUtils.isEmpty(str5)) {
                        try {
                            org.telegram.ui.Wallet.k0.c0(str5);
                            z14 = true;
                        } catch (IllegalArgumentException unused2) {
                        }
                        sendMessagesHelper.completeSendingGramTransfer(messageObject2, updates2, !z14 || (wallettransaction2.pending && !wallettransaction2.failed && !TextUtils.isEmpty(wallettransaction2.id)));
                        if (updates2 != null) {
                            Utilities.stageQueue.postRunnable(new ii1(1, k0Var2, updates2));
                        }
                        if (!z14) {
                            org.telegram.ui.Wallet.k0.E("transfer is sent, msg_hash=" + y10.msg_hash + ", gasless=" + y10.gasless);
                            k0Var2.d(wallettransaction2, y10);
                            break;
                        } else {
                            m6Var2.run();
                            if (tL_error2 == null || (str2 = tL_error2.text) == null) {
                                str2 = "NULL_ERROR";
                            }
                            org.telegram.ui.Wallet.k0.i("sendTransfer: ".concat(str2));
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
            case 5:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.c;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.e;
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
                    Utilities.stageQueue.postRunnable(new ii1(5, d2Var, updates3));
                } else {
                    z15 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    d2Var.b.B();
                }
                if ((tL_error3 == null && !z15) || (tL_error3 != null && ((i10 = tL_error3.code) < 0 || i10 >= 500))) {
                    callback.run(org.telegram.ui.Wallet.d2.x(tL_error3, "sendTransfer"));
                    break;
                } else {
                    d2Var.w(z1Var, h0Var2, tL_error3 == null ? Base64.encodeToString(sendtransfer.data_normal, 2) : null, tL_error3 == null ? -1 : 0, tL_error3 != null ? org.telegram.ui.Wallet.d2.x(tL_error3, "sendTransfer") : null, callback);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.b;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) this.d;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                String str6 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) obj;
                String str7 = (String) obj2;
                d2Var2.getClass();
                if (str7 == null && h0Var3 != null) {
                    org.telegram.ui.Wallet.h0 b10 = h0Var3.b();
                    ft ftVar = new ft(25, b10, oVar);
                    TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                    tonconnectgetnexteventid.session_id = tonconnectsession.id;
                    d2Var2.f.sendRequestTyped(tonconnectgetnexteventid, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.g1(d2Var2, ftVar, b10, tonconnectsession, str6, bArr));
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

    public /* synthetic */ df(zn znVar, zi ziVar, org.telegram.ui.Cells.u1 u1Var, String str, CharacterStyle characterStyle) {
        this.a = 1;
        this.b = znVar;
        this.c = ziVar;
        this.d = u1Var;
        this.e = str;
        this.f = characterStyle;
    }
}
