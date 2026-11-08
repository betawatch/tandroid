package bi;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.an;
import org.telegram.ui.ge;
import org.telegram.ui.he;
import org.telegram.ui.hi;
import org.telegram.ui.ke;
import org.telegram.ui.lm;
import org.telegram.ui.o61;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        Runnable o61Var;
        long j3;
        boolean z9;
        long j10;
        long j11;
        int i7;
        int i10;
        boolean z10;
        boolean z11;
        CharSequence charSequence;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        Object[] objArr;
        String str;
        String str2;
        boolean z12;
        int i11;
        String str3 = "NULL_ERROR";
        int i12 = 2;
        int i13 = 5;
        int i14 = 6;
        int i15 = 1;
        r11 = true;
        boolean z13 = true;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.c;
                boolean[] zArr = (boolean[]) this.b;
                TextView textView = (TextView) this.d;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.e;
                Runnable[] runnableArr = (Runnable[]) this.f;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                if (!zArr[0]) {
                    if (stargiftdepositpayload != null) {
                        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
                        if (org.telegram.ui.Wallet.m0.x(k7Var.a).v() >= stargiftdepositpayload.amount) {
                            org.telegram.ui.Wallet.m0 x10 = org.telegram.ui.Wallet.m0.x(k7Var.a);
                            ai.e eVar = new ai.e(textView, 6);
                            try {
                                boolean[] zArr2 = new boolean[1];
                                x10.m0(new org.telegram.ui.Wallet.f7(x10, zArr2, eVar, org.telegram.ui.Wallet.m0.h(stargiftdepositpayload), 5));
                                o61Var = new org.telegram.ui.Wallet.l(zArr2, 3);
                            } catch (Exception e10) {
                                org.telegram.ui.Wallet.m0.k("emulateDepositNFT: invalid payload", e10);
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.n(4, eVar, e10));
                                o61Var = new o61(i12);
                            }
                            runnableArr[0] = o61Var;
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
                vf.b bVar = (vf.b) this.d;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                l4 l4Var = (l4) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr3[0]) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    userArr[0] = (walletuseraddress == null || walletuseraddress.user_id == 0) ? null : anVar.getMessagesController().a2(Long.valueOf(walletuseraddress.user_id));
                    l4Var.run();
                    break;
                }
                break;
            case 2:
                an anVar2 = (an) this.c;
                vf.b bVar2 = (vf.b) this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                String str4 = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool = (Boolean) obj2;
                bVar2.b();
                if (!(tLObject instanceof TLRPC.User)) {
                    j3 = 0;
                    if (!(tLObject instanceof TLRPC.Chat)) {
                        z9 = false;
                        i15 = 0;
                        j10 = 0;
                        j11 = 0;
                        k60 I = k60.I(anVar2, q1Var);
                        jk0 jk0Var = new jk0(anVar2.getParentActivity(), anVar2.xa);
                        I.p = new ge(jk0Var, r12);
                        i7 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        if (i7 == 0) {
                            int i16 = z9 ? R.drawable.msg_channel : R.drawable.msg_discussion;
                            int i17 = z9 ? 2131743564 : 2131745604;
                            i10 = i7;
                            z10 = z9;
                            z11 = false;
                            I.c(i16, org.telegram.messenger.id.M0(i17, null), new bg.j0(anVar2, j10, 5), false);
                        } else {
                            i10 = i7;
                            z10 = z9;
                            z11 = false;
                        }
                        I.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131746679, null), new ke(anVar2, jk0Var, str4, 3), z11);
                        int i18 = 13;
                        if (bool.booleanValue()) {
                            I.c(R.drawable.outline_gram_24, org.telegram.messenger.id.M0(2131752653, null), new he(anVar2, str4, i18), z11);
                        }
                        I.k();
                        if (i10 == 0) {
                            charSequence = null;
                            I.n(tLObject, org.telegram.messenger.id.M0(i15 != 0 ? 2131743549 : z10 ? 2131743563 : 2131743556, null), new bg.j0(anVar2, j10, 6));
                        } else {
                            charSequence = null;
                            I.p(13, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.id.M0(2131748134, null));
                        }
                        jk0Var.e(I);
                        jk0Var.f(q1Var, characterStyle, charSequence, false);
                        anVar2.showDialog(jk0Var);
                        break;
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        long j12 = -chat.id;
                        z9 = org.telegram.messenger.t3.V(chat);
                        j10 = j12;
                        i15 = 0;
                    }
                } else {
                    j3 = 0;
                    j10 = ((TLRPC.User) tLObject).id;
                    z9 = false;
                }
                j11 = j3;
                k60 I2 = k60.I(anVar2, q1Var);
                jk0 jk0Var2 = new jk0(anVar2.getParentActivity(), anVar2.xa);
                I2.p = new ge(jk0Var2, r12);
                i7 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                if (i7 == 0) {
                }
                I2.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131746679, null), new ke(anVar2, jk0Var2, str4, 3), z11);
                int i182 = 13;
                if (bool.booleanValue()) {
                }
                I2.k();
                if (i10 == 0) {
                }
                jk0Var2.e(I2);
                jk0Var2.f(q1Var, characterStyle, charSequence, false);
                anVar2.showDialog(jk0Var2);
            case 3:
                an anVar3 = (an) this.c;
                hi hiVar = (hi) this.b;
                int[] iArr = (int[]) this.d;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                ij ijVar = (ij) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (anVar3.ac == hiVar) {
                    iArr[0] = 0;
                    hiVar.c(false);
                    if (messages_messages != null) {
                        anVar3.getMessagesController().Y3(messages_messages.users, false);
                        anVar3.getMessagesController().S3(messages_messages.chats, false);
                        int i19 = 0;
                        while (true) {
                            if (i19 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i19);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i19++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = ijVar.k) != null) {
                            message.rich_message = richMessage;
                            ijVar.w2 = null;
                            lm lmVar = anVar3.Sc;
                            if (lmVar != null && q1Var2 != null) {
                                lmVar.e(q1Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.b;
                gz gzVar = (gz) this.d;
                ij ijVar2 = (ij) this.e;
                org.telegram.ui.Wallet.f7 f7Var = (org.telegram.ui.Wallet.f7) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction A = org.telegram.ui.Wallet.m0.A(updates);
                if (tL_error == null && A != null) {
                    String str5 = A.msg_hash;
                    if (!TextUtils.isEmpty(str5) && org.telegram.ui.Wallet.m0.g0(str5) != null) {
                        objArr = true;
                        Object[] objArr2 = (!wallettransaction.pending || wallettransaction.failed || TextUtils.isEmpty(wallettransaction.id)) ? false : true;
                        if (objArr == false && objArr2 == false) {
                            z13 = false;
                        }
                        gzVar.k(ijVar2, updates, z13);
                        if (updates != null) {
                            Utilities.d.c(new org.telegram.ui.Wallet.n(r12, m0Var, updates));
                        }
                        if (objArr != true) {
                            org.telegram.ui.Wallet.m0.H("transfer is sent, msg_hash=" + A.msg_hash + ", gasless=" + A.gasless);
                            m0Var.d(wallettransaction, A);
                            break;
                        } else {
                            f7Var.run();
                            if (tL_error != null && (str = tL_error.text) != null) {
                                str3 = str;
                            }
                            org.telegram.ui.Wallet.m0.j("sendTransfer: ".concat(str3));
                            break;
                        }
                    }
                }
                objArr = false;
                if (!wallettransaction.pending) {
                }
                if (objArr == false) {
                    z13 = false;
                }
                gzVar.k(ijVar2, updates, z13);
                if (updates != null) {
                }
                if (objArr != true) {
                }
                break;
            case 5:
                org.telegram.ui.Wallet.m0 m0Var2 = (org.telegram.ui.Wallet.m0) this.c;
                org.telegram.ui.Wallet.f7 f7Var2 = (org.telegram.ui.Wallet.f7) this.b;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.d;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.e;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction A2 = org.telegram.ui.Wallet.m0.A(updates2);
                if (updates2 != null) {
                    Utilities.d.c(new org.telegram.ui.Wallet.n(r12, m0Var2, updates2));
                }
                if (A2 != null) {
                    String str6 = A2.msg_hash;
                    if (!TextUtils.isEmpty(str6) && org.telegram.ui.Wallet.m0.g0(str6) != null) {
                        org.telegram.ui.Wallet.m0.H("disable backup: transfer is sent, msg_hash=" + A2.msg_hash + ", gasless=" + A2.gasless);
                        org.telegram.ui.Wallet.g0 g0Var = new org.telegram.ui.Wallet.g0(m0Var2);
                        g0Var.a = A2.msg_hash;
                        g0Var.c = h0Var.c;
                        g0Var.b = j0Var;
                        if (A2.transaction != null) {
                            g0Var.a();
                        } else {
                            m0Var2.r.add(g0Var);
                        }
                        m0Var2.d(wallettransaction2, A2);
                        break;
                    }
                }
                f7Var2.run();
                if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                    str3 = str2;
                }
                org.telegram.ui.Wallet.m0.j("disable backup: sendTransfer: ".concat(str3));
                break;
            case 6:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.c;
                c20 c20Var = (c20) this.b;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.d;
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    z12 = updates3.update instanceof TL_update.TL_updateSentWalletTransaction;
                    ArrayList<TLRPC.Update> arrayList = updates3.updates;
                    int size = arrayList.size();
                    int i20 = 0;
                    while (i20 < size) {
                        TLRPC.Update update = arrayList.get(i20);
                        i20++;
                        z12 |= update instanceof TL_update.TL_updateSentWalletTransaction;
                    }
                    Utilities.d.c(new org.telegram.ui.Wallet.n(i13, e2Var, updates3));
                } else {
                    z12 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    e2Var.b.E();
                }
                if ((tL_error3 == null && !z12) || (tL_error3 != null && ((i11 = tL_error3.code) < 0 || i11 >= 500))) {
                    c20Var.a(org.telegram.ui.Wallet.e2.z(tL_error3, "sendTransfer"));
                    break;
                } else {
                    e2Var.y(a2Var, j0Var2, tL_error3 == null ? Base64.encodeToString(sendtransfer.data_normal, 2) : null, tL_error3 == null ? -1 : 0, tL_error3 == null ? null : org.telegram.ui.Wallet.e2.z(tL_error3, "sendTransfer"), c20Var);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.c;
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str7 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.j0 j0Var3 = (org.telegram.ui.Wallet.j0) obj;
                String str8 = (String) obj2;
                e2Var2.getClass();
                if (str8 == null && j0Var3 != null) {
                    org.telegram.ui.Wallet.j0 b10 = j0Var3.b();
                    org.telegram.ui.Wallet.t tVar = new org.telegram.ui.Wallet.t(i14, b10, mVar);
                    TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                    tonconnectgetnexteventid.session_id = tonconnectsession.id;
                    e2Var2.f.sendRequestTyped(tonconnectgetnexteventid, new d3.b(i15), new org.telegram.ui.Wallet.e1(e2Var2, tVar, b10, tonconnectsession, str7, bArr));
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
