package ci;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.di;
import org.telegram.ui.e51;
import org.telegram.ui.ee;
import org.telegram.ui.fe;
import org.telegram.ui.hb1;
import org.telegram.ui.hm;
import org.telegram.ui.ie;
import org.telegram.ui.ma1;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f4  */
    @Override // org.telegram.messenger.n10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        Runnable hb1Var;
        long j10;
        boolean z10;
        long j11;
        long j12;
        int i3;
        boolean z11;
        int i10;
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
        int i12 = 9;
        int i13 = 5;
        int i14 = 1;
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.c;
                boolean[] zArr = (boolean[]) this.b;
                TextView textView = (TextView) this.d;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.e;
                Runnable[] runnableArr = (Runnable[]) this.f;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                if (!zArr[0]) {
                    if (stargiftdepositpayload != null) {
                        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
                        if (org.telegram.ui.Wallet.k0.x(l6Var.a).v() >= stargiftdepositpayload.amount) {
                            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(l6Var.a);
                            ai.c cVar = new ai.c(textView, 16);
                            try {
                                boolean[] zArr2 = new boolean[1];
                                x10.m0(new org.telegram.ui.Wallet.e7(x10, zArr2, cVar, org.telegram.ui.Wallet.k0.h(stargiftdepositpayload), 5));
                                hb1Var = new org.telegram.ui.Wallet.l(zArr2, 3);
                            } catch (Exception e10) {
                                org.telegram.ui.Wallet.k0.k("emulateDepositNFT: invalid payload", e10);
                                org.telegram.messenger.g0.h3(new ma1(i12, cVar, e10));
                                hb1Var = new hb1(i14);
                            }
                            runnableArr[0] = hb1Var;
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
                wm wmVar = (wm) this.c;
                boolean[] zArr3 = (boolean[]) this.b;
                sf.b bVar = (sf.b) this.d;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                v3 v3Var = (v3) this.f;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (!zArr3[0]) {
                    if (bVar != null) {
                        bVar.b();
                    }
                    userArr[0] = (walletuseraddress == null || walletuseraddress.user_id == 0) ? null : wmVar.getMessagesController().a2(Long.valueOf(walletuseraddress.user_id));
                    v3Var.run();
                    break;
                }
                break;
            case 2:
                wm wmVar2 = (wm) this.c;
                sf.b bVar2 = (sf.b) this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                String str4 = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool = (Boolean) obj2;
                bVar2.b();
                if (!(tLObject instanceof TLRPC.User)) {
                    j10 = 0;
                    if (!(tLObject instanceof TLRPC.Chat)) {
                        z10 = false;
                        i14 = 0;
                        j11 = 0;
                        j12 = 0;
                        f60 I = f60.I(wmVar2, q1Var);
                        nk0 nk0Var = new nk0(wmVar2.getParentActivity(), wmVar2.ya);
                        I.p = new ee(nk0Var, r10 ? 1 : 0);
                        i3 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
                        if (i3 == 0) {
                            z11 = z10;
                            i10 = i3;
                            z12 = false;
                            I.c(z10 ? R.drawable.msg_channel : R.drawable.msg_discussion, bd.M0(z10 ? 2131743571 : 2131745611, null), new cg.i0(wmVar2, j11, 5), false);
                        } else {
                            z11 = z10;
                            i10 = i3;
                            z12 = false;
                        }
                        I.c(R.drawable.msg_copy, bd.M0(2131746686, null), new ie(wmVar2, nk0Var, str4, 3), z12);
                        int i15 = 13;
                        if (bool.booleanValue()) {
                            I.c(R.drawable.outline_gram_24, bd.M0(2131752653, null), new fe(wmVar2, str4, i15), z12);
                        }
                        I.k();
                        if (i10 == 0) {
                            charSequence = null;
                            I.n(tLObject, bd.M0(i14 != 0 ? 2131743556 : z11 ? 2131743570 : 2131743563, null), new cg.i0(wmVar2, j11, 6));
                        } else {
                            charSequence = null;
                            I.p(13, org.telegram.messenger.g0.L(200.0f), bd.M0(2131748141, null));
                        }
                        nk0Var.e(I);
                        nk0Var.f(q1Var, characterStyle, charSequence, false);
                        wmVar2.showDialog(nk0Var);
                        break;
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        long j13 = -chat.id;
                        z10 = org.telegram.messenger.t3.V(chat);
                        j11 = j13;
                        i14 = 0;
                    }
                } else {
                    j10 = 0;
                    j11 = ((TLRPC.User) tLObject).id;
                    z10 = false;
                }
                j12 = j10;
                f60 I2 = f60.I(wmVar2, q1Var);
                nk0 nk0Var2 = new nk0(wmVar2.getParentActivity(), wmVar2.ya);
                I2.p = new ee(nk0Var2, r10 ? 1 : 0);
                i3 = (j11 > j12 ? 1 : (j11 == j12 ? 0 : -1));
                if (i3 == 0) {
                }
                I2.c(R.drawable.msg_copy, bd.M0(2131746686, null), new ie(wmVar2, nk0Var2, str4, 3), z12);
                int i152 = 13;
                if (bool.booleanValue()) {
                }
                I2.k();
                if (i10 == 0) {
                }
                nk0Var2.e(I2);
                nk0Var2.f(q1Var, characterStyle, charSequence, false);
                wmVar2.showDialog(nk0Var2);
            case 3:
                wm wmVar3 = (wm) this.c;
                di diVar = (di) this.b;
                int[] iArr = (int[]) this.d;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.e;
                zi ziVar = (zi) this.f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (wmVar3.bc == diVar) {
                    iArr[0] = 0;
                    diVar.c(false);
                    if (messages_messages != null) {
                        wmVar3.getMessagesController().Y3(messages_messages.users, false);
                        wmVar3.getMessagesController().S3(messages_messages.chats, false);
                        int i16 = 0;
                        while (true) {
                            if (i16 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i16);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i16++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = ziVar.k) != null) {
                            message.rich_message = richMessage;
                            ziVar.w2 = null;
                            hm hmVar = wmVar3.Tc;
                            if (hmVar != null && q1Var2 != null) {
                                hmVar.f(q1Var2, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.b;
                yy yyVar = (yy) this.d;
                zi ziVar2 = (zi) this.e;
                org.telegram.ui.Wallet.e7 e7Var = (org.telegram.ui.Wallet.e7) this.f;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction A = org.telegram.ui.Wallet.k0.A(updates);
                if (tL_error == null && A != null) {
                    String str5 = A.msg_hash;
                    if (!TextUtils.isEmpty(str5) && org.telegram.ui.Wallet.k0.g0(str5) != null) {
                        objArr = true;
                        yyVar.k(ziVar2, updates, !objArr == true || (wallettransaction.pending && !wallettransaction.failed && !TextUtils.isEmpty(wallettransaction.id)) == true);
                        if (updates != null) {
                            Utilities.d.c(new ma1(i13, k0Var, updates));
                        }
                        if (objArr != true) {
                            org.telegram.ui.Wallet.k0.H("transfer is sent, msg_hash=" + A.msg_hash + ", gasless=" + A.gasless);
                            k0Var.d(wallettransaction, A);
                            break;
                        } else {
                            e7Var.run();
                            if (tL_error != null && (str = tL_error.text) != null) {
                                str3 = str;
                            }
                            org.telegram.ui.Wallet.k0.j("sendTransfer: ".concat(str3));
                            break;
                        }
                    }
                }
                objArr = false;
                yyVar.k(ziVar2, updates, !objArr == true || (wallettransaction.pending && !wallettransaction.failed && !TextUtils.isEmpty(wallettransaction.id)) == true);
                if (updates != null) {
                }
                if (objArr != true) {
                }
                break;
            case 5:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.c;
                org.telegram.ui.Wallet.e7 e7Var2 = (org.telegram.ui.Wallet.e7) this.b;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.d;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) this.f;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_update.TL_updateSentWalletTransaction A2 = org.telegram.ui.Wallet.k0.A(updates2);
                if (updates2 != null) {
                    Utilities.d.c(new ma1(i13, k0Var2, updates2));
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
                e7Var2.run();
                if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                    str3 = str2;
                }
                org.telegram.ui.Wallet.k0.j("disable backup: sendTransfer: ".concat(str3));
                break;
            case 6:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.c;
                u10 u10Var = (u10) this.b;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.d;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.e;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.f;
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates3 != null) {
                    z13 = updates3.update instanceof TL_update.TL_updateSentWalletTransaction;
                    ArrayList<TLRPC.Update> arrayList = updates3.updates;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLRPC.Update update = arrayList.get(i17);
                        i17++;
                        z13 |= update instanceof TL_update.TL_updateSentWalletTransaction;
                    }
                    Utilities.d.c(new ma1(10, c2Var, updates3));
                } else {
                    z13 = false;
                }
                if (tL_error3 != null && "WALLET_KEY_MISMATCH".equals(tL_error3.text)) {
                    c2Var.b.E();
                }
                if ((tL_error3 == null && !z13) || (tL_error3 != null && ((i11 = tL_error3.code) < 0 || i11 >= 500))) {
                    u10Var.a(org.telegram.ui.Wallet.c2.z(tL_error3, "sendTransfer"));
                    break;
                } else {
                    c2Var.y(y1Var, h0Var2, tL_error3 == null ? Base64.encodeToString(sendtransfer.data_normal, 2) : null, tL_error3 == null ? -1 : 0, tL_error3 != null ? org.telegram.ui.Wallet.c2.z(tL_error3, "sendTransfer") : null, u10Var);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.c2 c2Var2 = (org.telegram.ui.Wallet.c2) this.c;
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.b;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str7 = (String) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) obj;
                String str8 = (String) obj2;
                c2Var2.getClass();
                if (str8 == null && h0Var3 != null) {
                    org.telegram.ui.Wallet.h0 b10 = h0Var3.b();
                    e51 e51Var = new e51(i12, b10, mVar);
                    TL_wallet.tonConnectGetNextEventId tonconnectgetnexteventid = new TL_wallet.tonConnectGetNextEventId();
                    tonconnectgetnexteventid.session_id = tonconnectsession.id;
                    c2Var2.f.sendRequestTyped(tonconnectgetnexteventid, new c3.b(i14), new org.telegram.ui.Wallet.c1(c2Var2, e51Var, b10, tonconnectsession, str7, bArr));
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
