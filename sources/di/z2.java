package di;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.ah0;
import org.telegram.ui.an;
import org.telegram.ui.de;
import org.telegram.ui.ee;
import org.telegram.ui.fy0;
import org.telegram.ui.hi;
import org.telegram.ui.ie;
import org.telegram.ui.lm;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f0  */
    @Override // org.telegram.messenger.s10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        Runnable ah0Var;
        long j3;
        boolean z10;
        long j10;
        long j11;
        int i7;
        int i10;
        boolean z11;
        boolean z12;
        CharSequence charSequence;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        Object[] objArr;
        String str;
        String str2;
        boolean z13;
        int i11;
        String str3 = "NULL_ERROR";
        int i12 = 27;
        int i13 = 1;
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.c;
                boolean[] zArr = (boolean[]) this.b;
                TextView textView = (TextView) this.d;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.e;
                Runnable[] runnableArr = (Runnable[]) this.f;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                if (!zArr[0]) {
                    if (stargiftdepositpayload != null) {
                        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
                        if (org.telegram.ui.Wallet.l0.x(c6Var.a).v() >= stargiftdepositpayload.amount) {
                            org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(c6Var.a);
                            bi.b bVar = new bi.b(textView, 17);
                            try {
                                boolean[] zArr2 = new boolean[1];
                                x10.m0(new org.telegram.ui.Wallet.g7(x10, zArr2, bVar, org.telegram.ui.Wallet.l0.h(stargiftdepositpayload), 5));
                                ah0Var = new org.telegram.ui.Wallet.l(zArr2, 3);
                            } catch (Exception e10) {
                                org.telegram.ui.Wallet.l0.k("emulateDepositNFT: invalid payload", e10);
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.r(i13, bVar, e10));
                                ah0Var = new ah0(6);
                            }
                            runnableArr[0] = ah0Var;
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
            case 1:
                an anVar = (an) this.c;
                boolean[] zArr3 = (boolean[]) this.b;
                vf.b bVar2 = (vf.b) this.d;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                m3 m3Var = (m3) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr3[0]) {
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    userArr[0] = (walletuseraddress == null || walletuseraddress.user_id == 0) ? null : anVar.getMessagesController().a2(Long.valueOf(walletuseraddress.user_id));
                    m3Var.run();
                    break;
                }
                break;
            case 2:
                an anVar2 = (an) this.c;
                vf.b bVar3 = (vf.b) this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                String str4 = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool = (Boolean) obj2;
                bVar3.b();
                if (!(tLObject instanceof TLRPC.User)) {
                    j3 = 0;
                    if (!(tLObject instanceof TLRPC.Chat)) {
                        z10 = false;
                        i13 = 0;
                        j10 = 0;
                        j11 = 0;
                        m60 I = m60.I(anVar2, q1Var);
                        ok0 ok0Var = new ok0(anVar2.getParentActivity(), anVar2.Aa);
                        I.p = new de(ok0Var, r10 ? 1 : 0);
                        i7 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        if (i7 == 0) {
                            int i14 = z10 ? R.drawable.msg_channel : R.drawable.msg_discussion;
                            int i15 = z10 ? 2131743561 : 2131745601;
                            i10 = i7;
                            z11 = z10;
                            z12 = false;
                            I.c(i14, hd.M0(i15, null), new bg.j0(anVar2, j10, 5), false);
                        } else {
                            i10 = i7;
                            z11 = z10;
                            z12 = false;
                        }
                        I.c(R.drawable.msg_copy, hd.M0(2131746678, null), new ie(anVar2, ok0Var, str4, 3), z12);
                        int i16 = 13;
                        if (bool.booleanValue()) {
                            I.c(R.drawable.outline_gram_24, hd.M0(2131752653, null), new ee(anVar2, str4, i16), z12);
                        }
                        I.k();
                        if (i10 == 0) {
                            charSequence = null;
                            I.n(tLObject, hd.M0(i13 != 0 ? 2131743546 : z11 ? 2131743560 : 2131743553, null), new bg.j0(anVar2, j10, 6));
                        } else {
                            charSequence = null;
                            I.p(13, org.telegram.messenger.g0.L(200.0f), hd.M0(2131748133, null));
                        }
                        ok0Var.e(I);
                        ok0Var.f(q1Var, characterStyle, charSequence, false);
                        anVar2.showDialog(ok0Var);
                        break;
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        long j12 = -chat.id;
                        z10 = org.telegram.messenger.t3.V(chat);
                        j10 = j12;
                        i13 = 0;
                    }
                } else {
                    j3 = 0;
                    j10 = ((TLRPC.User) tLObject).id;
                    z10 = false;
                }
                j11 = j3;
                m60 I2 = m60.I(anVar2, q1Var);
                ok0 ok0Var2 = new ok0(anVar2.getParentActivity(), anVar2.Aa);
                I2.p = new de(ok0Var2, r10 ? 1 : 0);
                i7 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                if (i7 == 0) {
                }
                I2.c(R.drawable.msg_copy, hd.M0(2131746678, null), new ie(anVar2, ok0Var2, str4, 3), z12);
                int i162 = 13;
                if (bool.booleanValue()) {
                }
                I2.k();
                if (i10 == 0) {
                }
                ok0Var2.e(I2);
                ok0Var2.f(q1Var, characterStyle, charSequence, false);
                anVar2.showDialog(ok0Var2);
            case 3:
                an anVar3 = (an) this.c;
                hi hiVar = (hi) this.b;
                int[] iArr = (int[]) this.d;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                gj gjVar = (gj) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (anVar3.dc == hiVar) {
                    iArr[0] = 0;
                    hiVar.c(false);
                    if (messages_messages != null) {
                        anVar3.getMessagesController().Y3(messages_messages.users, false);
                        anVar3.getMessagesController().S3(messages_messages.chats, false);
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
                        if (richMessage != null && (message = gjVar.k) != null) {
                            message.rich_message = richMessage;
                            gjVar.y2 = null;
                            lm lmVar = anVar3.Vc;
                            if (lmVar != null && q1Var2 != null) {
                                lmVar.e(q1Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.b;
                ez ezVar = (ez) this.d;
                gj gjVar2 = (gj) this.e;
                org.telegram.ui.Wallet.g7 g7Var = (org.telegram.ui.Wallet.g7) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction A = org.telegram.ui.Wallet.l0.A(updates);
                if (tL_error == null && A != null) {
                    String str5 = A.msg_hash;
                    if (!TextUtils.isEmpty(str5) && org.telegram.ui.Wallet.l0.g0(str5) != null) {
                        objArr = true;
                        ezVar.k(gjVar2, updates, !objArr == true || (wallettransaction.pending && !wallettransaction.failed && !TextUtils.isEmpty(wallettransaction.id)) == true);
                        if (updates != null) {
                            Utilities.d.c(new fy0(i12, l0Var, updates));
                        }
                        if (objArr != true) {
                            org.telegram.ui.Wallet.l0.H("transfer is sent, msg_hash=" + A.msg_hash + ", gasless=" + A.gasless);
                            l0Var.d(wallettransaction, A);
                            break;
                        } else {
                            g7Var.run();
                            if (tL_error != null && (str = tL_error.text) != null) {
                                str3 = str;
                            }
                            org.telegram.ui.Wallet.l0.j("sendTransfer: ".concat(str3));
                            break;
                        }
                    }
                }
                objArr = false;
                ezVar.k(gjVar2, updates, !objArr == true || (wallettransaction.pending && !wallettransaction.failed && !TextUtils.isEmpty(wallettransaction.id)) == true);
                if (updates != null) {
                }
                if (objArr != true) {
                }
                break;
            case 5:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.c;
                org.telegram.ui.Wallet.g7 g7Var2 = (org.telegram.ui.Wallet.g7) this.b;
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) this.d;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.e;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction A2 = org.telegram.ui.Wallet.l0.A(updates2);
                if (updates2 != null) {
                    Utilities.d.c(new fy0(i12, l0Var2, updates2));
                }
                if (A2 != null) {
                    String str6 = A2.msg_hash;
                    if (!TextUtils.isEmpty(str6) && org.telegram.ui.Wallet.l0.g0(str6) != null) {
                        org.telegram.ui.Wallet.l0.H("disable backup: transfer is sent, msg_hash=" + A2.msg_hash + ", gasless=" + A2.gasless);
                        org.telegram.ui.Wallet.f0 f0Var = new org.telegram.ui.Wallet.f0(l0Var2);
                        f0Var.a = A2.msg_hash;
                        f0Var.c = g0Var.c;
                        f0Var.b = i0Var;
                        if (A2.transaction != null) {
                            f0Var.a();
                        } else {
                            l0Var2.r.add(f0Var);
                        }
                        l0Var2.d(wallettransaction2, A2);
                        break;
                    }
                }
                g7Var2.run();
                if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                    str3 = str2;
                }
                org.telegram.ui.Wallet.l0.j("disable backup: sendTransfer: ".concat(str3));
                break;
            case 6:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.c;
                z10 z10Var = (z10) this.b;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.d;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i18 = 2;
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
                    Utilities.d.c(new org.telegram.ui.Wallet.r(i18, d2Var, updates3));
                } else {
                    z13 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    d2Var.b.E();
                }
                if ((tL_error3 == null && !z13) || (tL_error3 != null && ((i11 = tL_error3.code) < 0 || i11 >= 500))) {
                    z10Var.a(org.telegram.ui.Wallet.d2.z(tL_error3, "sendTransfer"));
                    break;
                } else {
                    d2Var.y(z1Var, i0Var2, tL_error3 == null ? Base64.encodeToString(sendtransfer.data_normal, 2) : null, tL_error3 == null ? -1 : 0, tL_error3 != null ? org.telegram.ui.Wallet.d2.z(tL_error3, "sendTransfer") : null, z10Var);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.c;
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str7 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) obj;
                String str8 = (String) obj2;
                d2Var2.getClass();
                if (str8 == null && i0Var3 != null) {
                    org.telegram.ui.Wallet.i0 b10 = i0Var3.b();
                    x21 x21Var = new x21(11, b10, mVar);
                    TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                    tonconnectgetnexteventid.session_id = tonconnectsession.id;
                    d2Var2.f.sendRequestTyped(tonconnectgetnexteventid, new d3.b(i13), new org.telegram.ui.Wallet.d1(d2Var2, x21Var, b10, tonconnectsession, str7, bArr));
                    break;
                } else {
                    if (str8 == null) {
                        str8 = "Recovery phrase is unavailable";
                    }
                    mVar.a(str8);
                    break;
                }
        }
    }
}
