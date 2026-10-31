package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ af(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0386  */
    @Override // org.telegram.messenger.j20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        CharSequence charSequence;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        Object[] objArr;
        String str;
        String str2;
        boolean z13;
        int i12;
        Runnable m0Var;
        String str3 = "NULL_ERROR";
        int i13 = 23;
        int i14 = 3;
        int i15 = 6;
        int i16 = 1;
        r10 = true;
        boolean z14 = true;
        switch (this.a) {
            case 0:
                un unVar = (un) this.b;
                boolean[] zArr = (boolean[]) this.d;
                gf.e eVar = (gf.e) this.c;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                i2.h1 h1Var = (i2.h1) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr[0]) {
                    if (eVar != null) {
                        eVar.b();
                    }
                    userArr[0] = (walletuseraddress == null || walletuseraddress.user_id == 0) ? null : unVar.getMessagesController().Z1(Long.valueOf(walletuseraddress.user_id));
                    h1Var.run();
                    break;
                }
                break;
            case 1:
                un unVar2 = (un) this.b;
                gf.e eVar2 = (gf.e) this.c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                String str4 = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool = (Boolean) obj2;
                eVar2.b();
                if (!(tLObject instanceof TLRPC.User)) {
                    j10 = 0;
                    if (!(tLObject instanceof TLRPC.Chat)) {
                        z10 = false;
                        i16 = 0;
                        j11 = 0;
                        j12 = 0;
                        org.telegram.ui.Components.z60 I = org.telegram.ui.Components.z60.I(unVar2, q1Var);
                        org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(unVar2.getParentActivity(), unVar2.xa);
                        I.p = new se(nl0Var, r11);
                        i10 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
                        if (i10 == 0) {
                            z11 = z10;
                            i11 = i10;
                            z12 = false;
                            I.c(z10 ? R.drawable.msg_channel : R.drawable.msg_discussion, org.telegram.messenger.cd.L0(z10 ? 2131743587 : 2131745618, null), new mg.t0(unVar2, j11, 5), false);
                        } else {
                            z11 = z10;
                            i11 = i10;
                            z12 = false;
                        }
                        I.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131746693, null), new we(unVar2, nl0Var, str4, 3), z12);
                        int i17 = 13;
                        if (bool.booleanValue()) {
                            I.c(R.drawable.outline_gram_24, org.telegram.messenger.cd.L0(2131752653, null), new te(unVar2, str4, i17), z12);
                        }
                        I.k();
                        if (i11 == 0) {
                            charSequence = null;
                            I.n(tLObject, org.telegram.messenger.cd.L0(i16 != 0 ? 2131743572 : z11 ? 2131743586 : 2131743579, null), new mg.t0(unVar2, j11, 6));
                        } else {
                            charSequence = null;
                            I.p(13, org.telegram.messenger.i0.L(200.0f), org.telegram.messenger.cd.L0(2131748149, null));
                        }
                        nl0Var.e(I);
                        nl0Var.f(q1Var, characterStyle, charSequence, false);
                        unVar2.showDialog(nl0Var);
                        break;
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        long j13 = -chat.id;
                        z10 = org.telegram.messenger.w3.V(chat);
                        j11 = j13;
                        i16 = 0;
                    }
                } else {
                    j10 = 0;
                    j11 = ((TLRPC.User) tLObject).id;
                    z10 = false;
                }
                j12 = j10;
                org.telegram.ui.Components.z60 I2 = org.telegram.ui.Components.z60.I(unVar2, q1Var);
                org.telegram.ui.Components.nl0 nl0Var2 = new org.telegram.ui.Components.nl0(unVar2.getParentActivity(), unVar2.xa);
                I2.p = new se(nl0Var2, r11);
                i10 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
                if (i10 == 0) {
                }
                I2.c(R.drawable.msg_copy, org.telegram.messenger.cd.L0(2131746693, null), new we(unVar2, nl0Var2, str4, 3), z12);
                int i172 = 13;
                if (bool.booleanValue()) {
                }
                I2.k();
                if (i11 == 0) {
                }
                nl0Var2.e(I2);
                nl0Var2.f(q1Var, characterStyle, charSequence, false);
                unVar2.showDialog(nl0Var2);
            case 2:
                un unVar3 = (un) this.b;
                bj bjVar = (bj) this.d;
                int[] iArr = (int[]) this.c;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (unVar3.Vb == bjVar) {
                    iArr[0] = 0;
                    bjVar.c(false);
                    if (messages_messages != null) {
                        unVar3.getMessagesController().V3(messages_messages.users, false);
                        unVar3.getMessagesController().P3(messages_messages.chats, false);
                        int i18 = 0;
                        while (true) {
                            if (i18 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i18);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i18++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = jjVar.k) != null) {
                            message.rich_message = richMessage;
                            jjVar.w2 = null;
                            fn fnVar = unVar3.Kc;
                            if (fnVar != null && q1Var2 != null) {
                                fnVar.e(q1Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.d;
                org.telegram.messenger.qz qzVar = (org.telegram.messenger.qz) this.c;
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) this.e;
                org.telegram.ui.Wallet.k7 k7Var = (org.telegram.ui.Wallet.k7) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction A = org.telegram.ui.Wallet.k0.A(updates);
                if (tL_error == null && A != null) {
                    String str5 = A.msg_hash;
                    if (!TextUtils.isEmpty(str5) && org.telegram.ui.Wallet.k0.g0(str5) != null) {
                        objArr = true;
                        Object[] objArr2 = (!wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.id)) ? false : true;
                        if (objArr == false && objArr2 == false) {
                            z14 = false;
                        }
                        qzVar.k(jjVar2, updates, z14);
                        if (updates != null) {
                            Utilities.d.c(new t11(i13, k0Var, updates));
                        }
                        if (objArr != true) {
                            org.telegram.ui.Wallet.k0.H("transfer is sent, msg_hash=" + A.msg_hash + ", gasless=" + A.gasless);
                            k0Var.d(wallettransaction, A);
                            break;
                        } else {
                            k7Var.run();
                            if (tL_error != null && (str = tL_error.text) != null) {
                                str3 = str;
                            }
                            org.telegram.ui.Wallet.k0.j("sendTransfer: ".concat(str3));
                            break;
                        }
                    }
                }
                objArr = false;
                if (!wallettransaction.pending) {
                }
                if (objArr == false) {
                    z14 = false;
                }
                qzVar.k(jjVar2, updates, z14);
                if (updates != null) {
                }
                if (objArr != true) {
                }
                break;
            case 4:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.b;
                org.telegram.ui.Wallet.k7 k7Var2 = (org.telegram.ui.Wallet.k7) this.d;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.c;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction A2 = org.telegram.ui.Wallet.k0.A(updates2);
                if (updates2 != null) {
                    Utilities.d.c(new t11(i13, k0Var2, updates2));
                }
                if (A2 != null) {
                    String str6 = A2.msg_hash;
                    if (!TextUtils.isEmpty(str6) && org.telegram.ui.Wallet.k0.g0(str6) != null) {
                        org.telegram.ui.Wallet.k0.H("disable backup: transfer is sent, msg_hash=" + A2.msg_hash + ", gasless=" + A2.gasless);
                        org.telegram.ui.Wallet.e0 e0Var = new org.telegram.ui.Wallet.e0(k0Var2);
                        e0Var.a = A2.msg_hash;
                        e0Var.c = f0Var.c;
                        e0Var.b = h0Var;
                        if (A2.transaction != null) {
                            e0Var.a();
                        } else {
                            k0Var2.r.add(e0Var);
                        }
                        k0Var2.d(wallettransaction2, A2);
                        break;
                    }
                }
                k7Var2.run();
                if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                    str3 = str2;
                }
                org.telegram.ui.Wallet.k0.j("disable backup: sendTransfer: ".concat(str3));
                break;
            case 5:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.d;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.c;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    z13 = updates3.update instanceof TL_update.TL_updateSentWalletTransaction;
                    ArrayList<TLRPC.Update> arrayList = updates3.updates;
                    int size = arrayList.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLRPC.Update update = arrayList.get(i19);
                        i19++;
                        z13 |= update instanceof TL_update.TL_updateSentWalletTransaction;
                    }
                    Utilities.d.c(new t11(28, e2Var, updates3));
                } else {
                    z13 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    e2Var.b.E();
                }
                if ((tL_error3 == null && !z13) || (tL_error3 != null && ((i12 = tL_error3.code) < 0 || i12 >= 500))) {
                    q20Var.a(org.telegram.ui.Wallet.e2.z(tL_error3, "sendTransfer"));
                    break;
                } else {
                    e2Var.y(a2Var, h0Var2, tL_error3 == null ? Base64.encodeToString(sendtransfer.data_normal, 2) : null, tL_error3 == null ? -1 : 0, tL_error3 != null ? org.telegram.ui.Wallet.e2.z(tL_error3, "sendTransfer") : null, q20Var);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.d;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.c;
                String str7 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) obj;
                String str8 = (String) obj2;
                e2Var2.getClass();
                if (str8 == null && h0Var3 != null) {
                    org.telegram.ui.Wallet.h0 b10 = h0Var3.b();
                    f11 f11Var = new f11(12, b10, mVar);
                    TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                    tonconnectgetnexteventid.session_id = tonconnectsession.id;
                    e2Var2.f.sendRequestTyped(tonconnectgetnexteventid, new a3.b(i16), new org.telegram.ui.Wallet.e1(e2Var2, f11Var, b10, tonconnectsession, str7, bArr));
                    break;
                } else {
                    if (str8 == null) {
                        str8 = "Recovery phrase is unavailable";
                    }
                    mVar.a(str8);
                    break;
                }
            default:
                rh.e4 e4Var = (rh.e4) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                TextView textView = (TextView) this.c;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.e;
                Runnable[] runnableArr = (Runnable[]) this.f;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                if (!zArr2[0]) {
                    if (stargiftdepositpayload != null) {
                        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
                        if (org.telegram.ui.Wallet.k0.x(e4Var.a).v() >= stargiftdepositpayload.amount) {
                            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(e4Var.a);
                            qh.d dVar = new qh.d(textView, i15);
                            try {
                                boolean[] zArr3 = new boolean[1];
                                x10.m0(new org.telegram.ui.Wallet.k7(x10, zArr3, dVar, org.telegram.ui.Wallet.k0.h(stargiftdepositpayload), 5));
                                m0Var = new org.telegram.ui.Wallet.l(zArr3, i14);
                            } catch (Exception e) {
                                org.telegram.ui.Wallet.k0.k("emulateDepositNFT: invalid payload", e);
                                org.telegram.messenger.i0.g3(new t11(27, dVar, e));
                                m0Var = new org.telegram.ui.Components.voip.m0(18);
                            }
                            runnableArr[0] = m0Var;
                            break;
                        } else {
                            textView.setVisibility(8);
                            break;
                        }
                    } else {
                        textView.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ af(un unVar, aj ajVar, org.telegram.ui.Cells.q1 q1Var, String str, CharacterStyle characterStyle) {
        this.a = 1;
        this.b = unVar;
        this.c = ajVar;
        this.d = q1Var;
        this.e = str;
        this.f = characterStyle;
    }
}
