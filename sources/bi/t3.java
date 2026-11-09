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
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.cn;
import org.telegram.ui.ge;
import org.telegram.ui.he;
import org.telegram.ui.ji;
import org.telegram.ui.ke;
import org.telegram.ui.nm;
import org.telegram.ui.p61;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f3  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        Runnable p61Var;
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
        int i13 = 6;
        int i14 = 1;
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
                        if (org.telegram.ui.Wallet.l0.x(k7Var.a).v() >= stargiftdepositpayload.amount) {
                            org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(k7Var.a);
                            ai.e eVar = new ai.e(textView, 6);
                            try {
                                boolean[] zArr2 = new boolean[1];
                                x10.m0(new org.telegram.ui.Wallet.e7(x10, zArr2, eVar, org.telegram.ui.Wallet.l0.h(stargiftdepositpayload), 5));
                                p61Var = new org.telegram.ui.Wallet.l(zArr2, 3);
                            } catch (Exception e10) {
                                org.telegram.ui.Wallet.l0.k("emulateDepositNFT: invalid payload", e10);
                                org.telegram.messenger.g0.h3(new wb1(5, eVar, e10));
                                p61Var = new p61(i12);
                            }
                            runnableArr[0] = p61Var;
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
                cn cnVar = (cn) this.c;
                boolean[] zArr3 = (boolean[]) this.b;
                vf.b bVar = (vf.b) this.d;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                l4 l4Var = (l4) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr3[0]) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    userArr[0] = (walletuseraddress == null || walletuseraddress.user_id == 0) ? null : cnVar.getMessagesController().a2(Long.valueOf(walletuseraddress.user_id));
                    l4Var.run();
                    break;
                }
                break;
            case 2:
                cn cnVar2 = (cn) this.c;
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
                        i14 = 0;
                        j10 = 0;
                        j11 = 0;
                        l60 I = l60.I(cnVar2, q1Var);
                        kk0 kk0Var = new kk0(cnVar2.getParentActivity(), cnVar2.za);
                        I.p = new ge(kk0Var, r11 ? 1 : 0);
                        i7 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        if (i7 == 0) {
                            int i15 = z9 ? R.drawable.msg_channel : R.drawable.msg_discussion;
                            int i16 = z9 ? 2131743561 : 2131745601;
                            i10 = i7;
                            z10 = z9;
                            z11 = false;
                            I.c(i15, org.telegram.messenger.id.M0(i16, null), new bg.j0(cnVar2, j10, 5), false);
                        } else {
                            i10 = i7;
                            z10 = z9;
                            z11 = false;
                        }
                        I.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131746678, null), new ke(cnVar2, kk0Var, str4, 3), z11);
                        int i17 = 13;
                        if (bool.booleanValue()) {
                            I.c(R.drawable.outline_gram_24, org.telegram.messenger.id.M0(2131752653, null), new he(cnVar2, str4, i17), z11);
                        }
                        I.k();
                        if (i10 == 0) {
                            charSequence = null;
                            I.n(tLObject, org.telegram.messenger.id.M0(i14 != 0 ? 2131743546 : z10 ? 2131743560 : 2131743553, null), new bg.j0(cnVar2, j10, 6));
                        } else {
                            charSequence = null;
                            I.p(13, org.telegram.messenger.g0.L(200.0f), org.telegram.messenger.id.M0(2131748133, null));
                        }
                        kk0Var.e(I);
                        kk0Var.f(q1Var, characterStyle, charSequence, false);
                        cnVar2.showDialog(kk0Var);
                        break;
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        long j12 = -chat.id;
                        z9 = org.telegram.messenger.t3.V(chat);
                        j10 = j12;
                        i14 = 0;
                    }
                } else {
                    j3 = 0;
                    j10 = ((TLRPC.User) tLObject).id;
                    z9 = false;
                }
                j11 = j3;
                l60 I2 = l60.I(cnVar2, q1Var);
                kk0 kk0Var2 = new kk0(cnVar2.getParentActivity(), cnVar2.za);
                I2.p = new ge(kk0Var2, r11 ? 1 : 0);
                i7 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                if (i7 == 0) {
                }
                I2.c(R.drawable.msg_copy, org.telegram.messenger.id.M0(2131746678, null), new ke(cnVar2, kk0Var2, str4, 3), z11);
                int i172 = 13;
                if (bool.booleanValue()) {
                }
                I2.k();
                if (i10 == 0) {
                }
                kk0Var2.e(I2);
                kk0Var2.f(q1Var, characterStyle, charSequence, false);
                cnVar2.showDialog(kk0Var2);
            case 3:
                cn cnVar3 = (cn) this.c;
                ji jiVar = (ji) this.b;
                int[] iArr = (int[]) this.d;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                ij ijVar = (ij) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (cnVar3.cc == jiVar) {
                    iArr[0] = 0;
                    jiVar.c(false);
                    if (messages_messages != null) {
                        cnVar3.getMessagesController().Y3(messages_messages.users, false);
                        cnVar3.getMessagesController().S3(messages_messages.chats, false);
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
                        if (richMessage != null && (message = ijVar.k) != null) {
                            message.rich_message = richMessage;
                            ijVar.w2 = null;
                            nm nmVar = cnVar3.Uc;
                            if (nmVar != null && q1Var2 != null) {
                                nmVar.e(q1Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.b;
                gz gzVar = (gz) this.d;
                ij ijVar2 = (ij) this.e;
                org.telegram.ui.Wallet.e7 e7Var = (org.telegram.ui.Wallet.e7) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction A = org.telegram.ui.Wallet.l0.A(updates);
                if (tL_error == null && A != null) {
                    String str5 = A.msg_hash;
                    if (!TextUtils.isEmpty(str5) && org.telegram.ui.Wallet.l0.g0(str5) != null) {
                        objArr = true;
                        gzVar.k(ijVar2, updates, !objArr == true || (wallettransaction.pending && !wallettransaction.failed && !TextUtils.isEmpty(wallettransaction.id)) == true);
                        if (updates != null) {
                            Utilities.d.c(new wb1(i14, l0Var, updates));
                        }
                        if (objArr != true) {
                            org.telegram.ui.Wallet.l0.H("transfer is sent, msg_hash=" + A.msg_hash + ", gasless=" + A.gasless);
                            l0Var.d(wallettransaction, A);
                            break;
                        } else {
                            e7Var.run();
                            if (tL_error != null && (str = tL_error.text) != null) {
                                str3 = str;
                            }
                            org.telegram.ui.Wallet.l0.j("sendTransfer: ".concat(str3));
                            break;
                        }
                    }
                }
                objArr = false;
                gzVar.k(ijVar2, updates, !objArr == true || (wallettransaction.pending && !wallettransaction.failed && !TextUtils.isEmpty(wallettransaction.id)) == true);
                if (updates != null) {
                }
                if (objArr != true) {
                }
                break;
            case 5:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.c;
                org.telegram.ui.Wallet.e7 e7Var2 = (org.telegram.ui.Wallet.e7) this.b;
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) this.d;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.e;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction A2 = org.telegram.ui.Wallet.l0.A(updates2);
                if (updates2 != null) {
                    Utilities.d.c(new wb1(i14, l0Var2, updates2));
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
                e7Var2.run();
                if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                    str3 = str2;
                }
                org.telegram.ui.Wallet.l0.j("disable backup: sendTransfer: ".concat(str3));
                break;
            case 6:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.c;
                c20 c20Var = (c20) this.b;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.d;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    z12 = updates3.update instanceof TL_update.TL_updateSentWalletTransaction;
                    ArrayList<TLRPC.Update> arrayList = updates3.updates;
                    int size = arrayList.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLRPC.Update update = arrayList.get(i19);
                        i19++;
                        z12 |= update instanceof TL_update.TL_updateSentWalletTransaction;
                    }
                    Utilities.d.c(new wb1(i13, d2Var, updates3));
                } else {
                    z12 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    d2Var.b.E();
                }
                if ((tL_error3 == null && !z12) || (tL_error3 != null && ((i11 = tL_error3.code) < 0 || i11 >= 500))) {
                    c20Var.a(org.telegram.ui.Wallet.d2.z(tL_error3, "sendTransfer"));
                    break;
                } else {
                    d2Var.y(z1Var, i0Var2, tL_error3 == null ? Base64.encodeToString(sendtransfer.data_normal, 2) : null, tL_error3 == null ? -1 : 0, tL_error3 == null ? null : org.telegram.ui.Wallet.d2.z(tL_error3, "sendTransfer"), c20Var);
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
                    org.telegram.ui.Wallet.s sVar = new org.telegram.ui.Wallet.s(i13, b10, mVar);
                    TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                    tonconnectgetnexteventid.session_id = tonconnectsession.id;
                    d2Var2.f.sendRequestTyped(tonconnectgetnexteventid, new d3.b(i14), new org.telegram.ui.Wallet.d1(d2Var2, sVar, b10, tonconnectsession, str7, bArr));
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
