package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tg implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ c1 e;

    public /* synthetic */ tg(c1 c1Var, int i3, String str, String str2, int i10) {
        this.a = i10;
        this.e = c1Var;
        this.b = i3;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0079, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        long j10;
        boolean z11;
        hp hpVar;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                li liVar = (li) this.e;
                String str3 = this.d;
                if (tLObject == null) {
                    g0.h3(new ch(liVar, str3, 1));
                    break;
                } else {
                    TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
                    if (this.b != -1 && !tL_emojiKeywordsDifference.lang_code.equals(this.c)) {
                        liVar.getMessagesStorage().a.c(new ch(liVar, str3, 0));
                        break;
                    } else {
                        liVar.getMessagesStorage().a.c(new dg((Object) liVar, (Object) tL_emojiKeywordsDifference, str3, 3));
                        g0.h3(new xf(liVar, 9));
                        break;
                    }
                }
                break;
            default:
                hp hpVar2 = (hp) this.e;
                int i3 = hpVar2.x2;
                int i10 = this.b;
                if (i10 == i3) {
                    if (tLObject instanceof TLRPC.TL_help_promoDataEmpty) {
                        hpVar2.u2 = ((TLRPC.TL_help_promoDataEmpty) tLObject).expires;
                        z10 = true;
                    } else if (tLObject instanceof TLRPC.TL_help_promoData) {
                        TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) tLObject;
                        TLRPC.Peer peer = tL_help_promoData.peer;
                        if (peer == null) {
                            j10 = 0;
                        } else {
                            j10 = peer.user_id;
                            if (j10 == 0) {
                                long j11 = peer.chat_id;
                                if (j11 != 0) {
                                    j10 = -j11;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= tL_help_promoData.chats.size()) {
                                            hpVar = hpVar2;
                                            break;
                                        } else {
                                            TLRPC.Chat chat = tL_help_promoData.chats.get(i11);
                                            hpVar = hpVar2;
                                            if (chat.id != tL_help_promoData.peer.chat_id) {
                                                i11++;
                                                hpVar2 = hpVar;
                                            } else if (chat.kicked || chat.restricted) {
                                                z11 = true;
                                            }
                                        }
                                    }
                                    hpVar2 = hpVar;
                                } else {
                                    j10 = -peer.channel_id;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < tL_help_promoData.chats.size()) {
                                            TLRPC.Chat chat2 = tL_help_promoData.chats.get(i12);
                                            if (chat2.id != tL_help_promoData.peer.channel_id) {
                                                i12++;
                                            } else if (chat2.kicked || chat2.restricted) {
                                                hpVar2 = hpVar2;
                                                z11 = true;
                                            }
                                        }
                                    }
                                    hpVar2 = hpVar2;
                                }
                                hpVar2.A2 = j10;
                                if (!tL_help_promoData.proxy) {
                                    hpVar2.B2 = 0;
                                } else if (TextUtils.isEmpty(tL_help_promoData.psa_type)) {
                                    hpVar2.B2 = 2;
                                } else {
                                    hpVar2.B2 = 1;
                                    hpVar2.D2 = tL_help_promoData.psa_type;
                                }
                                hpVar2.E2 = t4.c.q(this.c, this.d);
                                hpVar2.C2 = tL_help_promoData.psa_message;
                                hpVar2.u2 = tL_help_promoData.expires;
                                SharedPreferences.Editor edit = hp.e1().edit();
                                edit.putLong("proxy_dialog", hpVar2.A2);
                                edit.putString("proxyDialogAddress", hpVar2.E2);
                                edit.putInt("promo_dialog_type", hpVar2.B2);
                                str = hpVar2.C2;
                                if (str == null) {
                                    edit.putString("promo_psa_message", str);
                                } else {
                                    edit.remove("promo_psa_message");
                                }
                                str2 = hpVar2.D2;
                                if (str2 == null) {
                                    edit.putString("promo_psa_type", str2);
                                } else {
                                    edit.remove("promo_psa_type");
                                }
                                edit.putInt("nextPromoInfoCheckTime", hpVar2.u2);
                                edit.commit();
                                if (!z11) {
                                    g0.h3(new yj(hpVar2, j10, tL_help_promoData, i10, 4));
                                }
                                z10 = z11;
                            }
                        }
                        z11 = false;
                        hpVar2.A2 = j10;
                        if (!tL_help_promoData.proxy) {
                        }
                        hpVar2.E2 = t4.c.q(this.c, this.d);
                        hpVar2.C2 = tL_help_promoData.psa_message;
                        hpVar2.u2 = tL_help_promoData.expires;
                        SharedPreferences.Editor edit2 = hp.e1().edit();
                        edit2.putLong("proxy_dialog", hpVar2.A2);
                        edit2.putString("proxyDialogAddress", hpVar2.E2);
                        edit2.putInt("promo_dialog_type", hpVar2.B2);
                        str = hpVar2.C2;
                        if (str == null) {
                        }
                        str2 = hpVar2.D2;
                        if (str2 == null) {
                        }
                        edit2.putInt("nextPromoInfoCheckTime", hpVar2.u2);
                        edit2.commit();
                        if (!z11) {
                        }
                        z10 = z11;
                    } else {
                        hpVar2.u2 = hpVar2.getConnectionsManager().getCurrentTime() + 3600;
                        z10 = true;
                    }
                    if (z10) {
                        hpVar2.A2 = 0L;
                        hp.e1().edit().putLong("proxy_dialog", hpVar2.A2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", hpVar2.u2).commit();
                        hpVar2.w2 = 0;
                        hpVar2.v2 = false;
                        g0.h3(new in(hpVar2, 8));
                        break;
                    }
                }
                break;
        }
    }
}
