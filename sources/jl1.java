// default package

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.a;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jl1 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jl1(mu1 mu1Var, op1 op1Var, gb2 gb2Var, String str, CharacterStyle characterStyle) {
        this.a = (byte) 1;
        this.b = mu1Var;
        this.c = op1Var;
        this.d = gb2Var;
        this.e = str;
        this.f = characterStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0160  */
    @Override // i8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        boolean z;
        long j;
        int i;
        boolean z2;
        SpannableString spannableString;
        int i2;
        int i3;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        String str;
        boolean z3;
        String str2;
        boolean z4;
        String z5;
        String str3;
        String str4 = "NULL_ERROR";
        byte b = 18;
        byte b2 = 2;
        boolean z6 = true;
        byte b3 = 0;
        switch (this.a) {
            case 0:
                mu1 mu1Var = (mu1) this.b;
                boolean[] zArr = (boolean[]) this.d;
                op1 op1Var = (op1) this.c;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                z2a z2aVar = (z2a) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr[0]) {
                    if (op1Var != null) {
                        op1Var.c(false);
                    }
                    userArr[0] = (walletuseraddress == null || walletuseraddress.user_id == 0) ? null : mu1Var.getMessagesController().V1(Long.valueOf(walletuseraddress.user_id));
                    z2aVar.run();
                    break;
                }
                break;
            case 1:
                mu1 mu1Var2 = (mu1) this.b;
                op1 op1Var2 = (op1) this.c;
                gb2 gb2Var = (gb2) this.d;
                String str5 = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool = (Boolean) obj2;
                op1Var2.c(false);
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                    z = false;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    j = -chat.id;
                    z = hc2.V(chat);
                    z6 = false;
                } else {
                    z = false;
                    z6 = false;
                    j = 0;
                }
                cs5 J = cs5.J(mu1Var2, gb2Var);
                tq9 tq9Var = new tq9(mu1Var2.getParentActivity(), mu1Var2.Ba);
                J.p = new zk1(tq9Var, b3);
                int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i4 != 0) {
                    if (z) {
                        i2 = R.drawable.msg_channel;
                        i3 = 2131743319;
                    } else {
                        i2 = R.drawable.msg_discussion;
                        i3 = 2131745409;
                    }
                    i = i4;
                    z2 = false;
                    J.b(i2, k96.M0(i3, null), new xn0(mu1Var2, j, (byte) 5), false);
                } else {
                    i = i4;
                    z2 = false;
                }
                J.b(R.drawable.msg_copy, k96.M0(2131746485, null), new el1(mu1Var2, tq9Var, str5, (byte) 3), z2);
                byte b4 = 13;
                if (bool.booleanValue()) {
                    J.b(R.drawable.outline_gram_24, k96.M0(2131752641, null), new al1(mu1Var2, str5, b4), z2);
                }
                J.j();
                if (i != 0) {
                    spannableString = null;
                    J.m(tLObject, k96.M0(z6 ? 2131743304 : z ? 2131743318 : 2131743311, null), new xn0(mu1Var2, j, (byte) 6));
                } else {
                    spannableString = null;
                    J.o(13, gl.L(200.0f), k96.M0(2131747941, null));
                }
                tq9Var.e(J);
                tq9Var.f(gb2Var, characterStyle, spannableString, false);
                mu1Var2.showDialog(tq9Var);
                break;
            case 2:
                mu1 mu1Var3 = (mu1) this.b;
                pp1 pp1Var = (pp1) this.d;
                int[] iArr = (int[]) this.c;
                gb2 gb2Var2 = (gb2) this.e;
                k27 k27Var = (k27) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (mu1Var3.ec == pp1Var) {
                    iArr[0] = 0;
                    pp1Var.c(false);
                    if (messages_messages != null) {
                        mu1Var3.getMessagesController().b4(messages_messages.users, false);
                        mu1Var3.getMessagesController().V3(messages_messages.chats, false);
                        int i5 = 0;
                        while (true) {
                            if (i5 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i5);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i5++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = k27Var.k) != null) {
                            message.rich_message = richMessage;
                            k27Var.y2 = null;
                            wt1 wt1Var = mu1Var3.Xc;
                            if (wt1Var != null && gb2Var2 != null) {
                                wt1Var.f(gb2Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                c cVar = (c) this.b;
                hn1 hn1Var = (hn1) this.d;
                v05 v05Var = (v05) this.c;
                y05 y05Var = (y05) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction F = c.F(updates);
                if (updates != null) {
                    Utilities.d.c(new vc4(cVar, updates, b));
                }
                if (F != null) {
                    String str6 = F.msg_hash;
                    if (!TextUtils.isEmpty(str6) && c.r0(str6) != null) {
                        c.O("disable backup: transfer is sent, msg_hash=" + F.msg_hash + ", gasless=" + F.gasless);
                        a aVar = new a(cVar);
                        aVar.a = F.msg_hash;
                        aVar.c = v05Var.c;
                        aVar.b = y05Var;
                        if (F.transaction != null) {
                            aVar.a();
                        } else {
                            cVar.s.add(aVar);
                        }
                        cVar.d(wallettransaction, F);
                        break;
                    }
                }
                hn1Var.run();
                if (tL_error != null && (str = tL_error.text) != null) {
                    str4 = str;
                }
                c.m("disable backup: sendTransfer: ".concat(str4));
                break;
            case 4:
                c cVar2 = (c) this.b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                z3a z3aVar = (z3a) this.c;
                k27 k27Var2 = (k27) this.e;
                hn1 hn1Var2 = (hn1) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction F2 = c.F(updates2);
                if (tL_error2 == null && F2 != null) {
                    String str7 = F2.msg_hash;
                    if (!TextUtils.isEmpty(str7) && c.r0(str7) != null) {
                        z3 = true;
                        boolean z7 = (!wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.id)) ? false : true;
                        if (!z3 && !z7) {
                            z6 = false;
                        }
                        z3aVar.k(k27Var2, updates2, z6);
                        if (updates2 != null) {
                            Utilities.d.c(new vc4(cVar2, updates2, b));
                        }
                        if (!z3) {
                            c.O("transfer is sent, msg_hash=" + F2.msg_hash + ", gasless=" + F2.gasless);
                            Runnable runnable = (Runnable) cVar2.r.remove(wallettransaction2);
                            if (runnable != null) {
                                runnable.run();
                            }
                            cVar2.d(wallettransaction2, F2);
                            break;
                        } else {
                            hn1Var2.run();
                            if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                str4 = str2;
                            }
                            c.m("sendTransfer: ".concat(str4));
                            break;
                        }
                    }
                }
                z3 = false;
                if (!wallettransaction2.pending) {
                }
                if (!z3) {
                    z6 = false;
                }
                z3aVar.k(k27Var2, updates2, z6);
                if (updates2 != null) {
                }
                if (!z3) {
                }
                break;
            case 5:
                w25 w25Var = (w25) this.b;
                ht htVar = (ht) this.d;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                String str8 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                y05 y05Var2 = (y05) obj;
                String str9 = (String) obj2;
                w25Var.getClass();
                if (str9 == null) {
                    if (y05Var2 != null) {
                        y05 b5 = y05Var2.b();
                        x15 x15Var = new x15(b5, htVar, b2);
                        TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                        tonconnectgetnexteventid.session_id = tonconnectsession.id;
                        w25Var.f.sendRequestTyped(tonconnectgetnexteventid, new hc(b3), new v15(w25Var, x15Var, b5, tonconnectsession, str8, bArr));
                        break;
                    } else {
                        str9 = "Recovery phrase is unavailable";
                    }
                }
                htVar.a(str9);
                break;
            default:
                w25 w25Var2 = (w25) this.b;
                p8c p8cVar = (p8c) this.d;
                s25 s25Var = (s25) this.c;
                y05 y05Var3 = (y05) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    z4 = updates3.update instanceof TL_update.TL_updateSentWalletTransaction;
                    ArrayList<TLRPC.Update> arrayList = updates3.updates;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        TLRPC.Update update = arrayList.get(i6);
                        i6++;
                        z4 |= update instanceof TL_update.TL_updateSentWalletTransaction;
                    }
                    Utilities.d.c(new vc4(w25Var2, updates3, (byte) 21));
                } else {
                    z4 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    w25Var2.b.J();
                }
                if (tL_error3 == null) {
                    if (z4) {
                        b3 = -1;
                        str3 = Base64.encodeToString(sendtransfer.data_normal, 2);
                        z5 = null;
                        w25Var2.y(s25Var, y05Var3, str3, b3, z5, p8cVar);
                        break;
                    }
                    p8cVar.a(w25.z(tL_error3, "sendTransfer"));
                    break;
                } else {
                    int i7 = tL_error3.code;
                    if (i7 >= 0 && i7 < 500) {
                        z5 = w25.z(tL_error3, "sendTransfer");
                        str3 = null;
                        w25Var2.y(s25Var, y05Var3, str3, b3, z5, p8cVar);
                    }
                    p8cVar.a(w25.z(tL_error3, "sendTransfer"));
                }
                break;
        }
    }

    public /* synthetic */ jl1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
