package org.telegram.ui;

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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ne(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016a  */
    @Override // org.telegram.messenger.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        boolean z10;
        long j3;
        int i7;
        boolean z11;
        boolean z12;
        CharSequence charSequence;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        String str;
        Object[] objArr;
        String str2;
        boolean z13;
        int i10;
        String str3 = "NULL_ERROR";
        int i11 = 25;
        int i12 = 1;
        r8 = true;
        boolean z14 = true;
        switch (this.a) {
            case 0:
                bn bnVar = (bn) this.b;
                boolean[] zArr = (boolean[]) this.d;
                vf.b bVar = (vf.b) this.c;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                di.o3 o3Var = (di.o3) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr[0]) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    userArr[0] = (walletuseraddress == null || walletuseraddress.user_id == 0) ? null : bnVar.getMessagesController().c2(Long.valueOf(walletuseraddress.user_id));
                    o3Var.run();
                    break;
                }
                break;
            case 1:
                bn bnVar2 = (bn) this.b;
                vf.b bVar2 = (vf.b) this.c;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.d;
                String str4 = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool = (Boolean) obj2;
                bVar2.b();
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                    z10 = false;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    j3 = -chat.id;
                    z10 = org.telegram.messenger.v3.V(chat);
                    i12 = 0;
                } else {
                    z10 = false;
                    i12 = 0;
                    j3 = 0;
                }
                org.telegram.ui.Components.a70 J = org.telegram.ui.Components.a70.J(bnVar2, r1Var);
                org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(bnVar2.getParentActivity(), bnVar2.Ba);
                J.p = new fe(yk0Var, r9);
                int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i13 != 0) {
                    int i14 = z10 ? R.drawable.msg_channel : R.drawable.msg_discussion;
                    int i15 = z10 ? 2131743318 : 2131745405;
                    i7 = i13;
                    z11 = z10;
                    z12 = false;
                    J.c(i14, org.telegram.messenger.gd.N0(i15, null), new bg.k0(bnVar2, j3, 5), false);
                } else {
                    i7 = i13;
                    z11 = z10;
                    z12 = false;
                }
                J.c(R.drawable.msg_copy, org.telegram.messenger.gd.N0(2131746482, null), new je(bnVar2, yk0Var, str4, 3), z12);
                int i16 = 13;
                if (bool.booleanValue()) {
                    J.c(R.drawable.outline_gram_24, org.telegram.messenger.gd.N0(2131752641, null), new ge(bnVar2, str4, i16), z12);
                }
                J.k();
                if (i7 != 0) {
                    charSequence = null;
                    J.n(tLObject, org.telegram.messenger.gd.N0(i12 != 0 ? 2131743303 : z11 ? 2131743317 : 2131743310, null), new bg.k0(bnVar2, j3, 6));
                } else {
                    charSequence = null;
                    J.p(13, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.gd.N0(2131747940, null));
                }
                yk0Var.e(J);
                yk0Var.f(r1Var, characterStyle, charSequence, false);
                bnVar2.showDialog(yk0Var);
                break;
            case 2:
                bn bnVar3 = (bn) this.b;
                hi hiVar = (hi) this.d;
                int[] iArr = (int[]) this.c;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) this.e;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (bnVar3.ec == hiVar) {
                    iArr[0] = 0;
                    hiVar.c(false);
                    if (messages_messages != null) {
                        bnVar3.getMessagesController().f4(messages_messages.users, false);
                        bnVar3.getMessagesController().Z3(messages_messages.chats, false);
                        int i17 = 0;
                        while (true) {
                            if (i17 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i17);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i17++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = fjVar.k) != null) {
                            message.rich_message = richMessage;
                            fjVar.y2 = null;
                            mm mmVar = bnVar3.Wc;
                            if (mmVar != null && r1Var2 != null) {
                                mmVar.f(r1Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.b;
                org.telegram.ui.Wallet.v7 v7Var = (org.telegram.ui.Wallet.v7) this.d;
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.c;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.e;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction G = org.telegram.ui.Wallet.u0.G(updates);
                if (updates != null) {
                    Utilities.d.c(new mz0(i11, u0Var, updates));
                }
                if (G != null) {
                    String str5 = G.msg_hash;
                    if (!TextUtils.isEmpty(str5) && org.telegram.ui.Wallet.u0.r0(str5) != null) {
                        org.telegram.ui.Wallet.u0.P("disable backup: transfer is sent, msg_hash=" + G.msg_hash + ", gasless=" + G.gasless);
                        org.telegram.ui.Wallet.n0 n0Var = new org.telegram.ui.Wallet.n0(u0Var);
                        n0Var.a = G.msg_hash;
                        n0Var.c = o0Var.c;
                        n0Var.b = r0Var;
                        if (G.transaction != null) {
                            n0Var.a();
                        } else {
                            u0Var.s.add(n0Var);
                        }
                        u0Var.e(wallettransaction, G);
                        break;
                    }
                }
                v7Var.run();
                if (tL_error != null && (str = tL_error.text) != null) {
                    str3 = str;
                }
                org.telegram.ui.Wallet.u0.n("disable backup: sendTransfer: ".concat(str3));
                break;
            case 4:
                org.telegram.ui.Wallet.u0 u0Var2 = (org.telegram.ui.Wallet.u0) this.b;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.d;
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) this.c;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.e;
                org.telegram.ui.Wallet.v7 v7Var2 = (org.telegram.ui.Wallet.v7) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction G2 = org.telegram.ui.Wallet.u0.G(updates2);
                if (tL_error2 == null && G2 != null) {
                    String str6 = G2.msg_hash;
                    if (!TextUtils.isEmpty(str6) && org.telegram.ui.Wallet.u0.r0(str6) != null) {
                        objArr = true;
                        Object[] objArr2 = (!wallettransaction2.pending || wallettransaction2.failed || TextUtils.isEmpty(wallettransaction2.id)) ? false : true;
                        if (objArr == false && objArr2 == false) {
                            z14 = false;
                        }
                        zyVar.k(fjVar2, updates2, z14);
                        if (updates2 != null) {
                            Utilities.d.c(new mz0(i11, u0Var2, updates2));
                        }
                        if (objArr != true) {
                            org.telegram.ui.Wallet.u0.P("transfer is sent, msg_hash=" + G2.msg_hash + ", gasless=" + G2.gasless);
                            Runnable runnable = (Runnable) u0Var2.r.remove(wallettransaction2);
                            if (runnable != null) {
                                runnable.run();
                            }
                            u0Var2.e(wallettransaction2, G2);
                            break;
                        } else {
                            v7Var2.run();
                            if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                str3 = str2;
                            }
                            org.telegram.ui.Wallet.u0.n("sendTransfer: ".concat(str3));
                            break;
                        }
                    }
                }
                objArr = false;
                if (!wallettransaction2.pending) {
                }
                if (objArr == false) {
                    z14 = false;
                }
                zyVar.k(fjVar2, updates2, z14);
                if (updates2 != null) {
                }
                if (objArr != true) {
                }
                break;
            case 5:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.b;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) this.d;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                String str7 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) obj;
                String str8 = (String) obj2;
                l2Var.getClass();
                if (str8 == null && r0Var2 != null) {
                    org.telegram.ui.Wallet.r0 b10 = r0Var2.b();
                    p51 p51Var = new p51(10, b10, oVar);
                    TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                    tonconnectgetnexteventid.session_id = tonconnectsession.id;
                    l2Var.f.sendRequestTyped(tonconnectgetnexteventid, new d3.b(i12), new di.s1(l2Var, p51Var, b10, tonconnectsession, str7, bArr, 4));
                    break;
                } else {
                    if (str8 == null) {
                        str8 = "Recovery phrase is unavailable";
                    }
                    oVar.a(str8);
                    break;
                }
            default:
                org.telegram.ui.Wallet.l2 l2Var2 = (org.telegram.ui.Wallet.l2) this.b;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.d;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.c;
                org.telegram.ui.Wallet.r0 r0Var3 = (org.telegram.ui.Wallet.r0) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    z13 = updates3.update instanceof TL_update.TL_updateSentWalletTransaction;
                    ArrayList<TLRPC.Update> arrayList = updates3.updates;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (i18 < size) {
                        TLRPC.Update update = arrayList.get(i18);
                        i18++;
                        z13 |= update instanceof TL_update.TL_updateSentWalletTransaction;
                    }
                    Utilities.d.c(new mz0(28, l2Var2, updates3));
                } else {
                    z13 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    l2Var2.b.K();
                }
                if ((tL_error3 == null && !z13) || (tL_error3 != null && ((i10 = tL_error3.code) < 0 || i10 >= 500))) {
                    x10Var.a(org.telegram.ui.Wallet.l2.z(tL_error3, "sendTransfer"));
                    break;
                } else {
                    l2Var2.y(h2Var, r0Var3, tL_error3 == null ? Base64.encodeToString(sendtransfer.data_normal, 2) : null, tL_error3 == null ? -1 : 0, tL_error3 != null ? org.telegram.ui.Wallet.l2.z(tL_error3, "sendTransfer") : null, x10Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ne(bn bnVar, gi giVar, org.telegram.ui.Cells.r1 r1Var, String str, CharacterStyle characterStyle) {
        this.a = 1;
        this.b = bnVar;
        this.c = giVar;
        this.d = r1Var;
        this.e = str;
        this.f = characterStyle;
    }
}
