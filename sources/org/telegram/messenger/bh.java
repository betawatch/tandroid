package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class bh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ c1 e;

    public /* synthetic */ bh(c1 c1Var, int i7, String str, String str2, int i10) {
        this.a = i10;
        this.e = c1Var;
        this.b = i7;
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
        boolean z9;
        long j3;
        boolean z10;
        qp qpVar;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.e;
                String str3 = this.d;
                if (tLObject == null) {
                    g0.h3(new lh(uiVar, str3, 1));
                    break;
                } else {
                    TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
                    if (this.b != -1 && !tL_emojiKeywordsDifference.lang_code.equals(this.c)) {
                        uiVar.getMessagesStorage().a.c(new lh(uiVar, str3, 0));
                        break;
                    } else {
                        uiVar.getMessagesStorage().a.c(new lg((Object) uiVar, (Object) tL_emojiKeywordsDifference, str3, 3));
                        g0.h3(new fg(uiVar, 9));
                        break;
                    }
                }
                break;
            default:
                qp qpVar2 = (qp) this.e;
                int i7 = qpVar2.w2;
                int i10 = this.b;
                if (i10 == i7) {
                    if (tLObject instanceof TLRPC.TL_help_promoDataEmpty) {
                        qpVar2.t2 = ((TLRPC.TL_help_promoDataEmpty) tLObject).expires;
                        z9 = true;
                    } else if (tLObject instanceof TLRPC.TL_help_promoData) {
                        TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) tLObject;
                        TLRPC.Peer peer = tL_help_promoData.peer;
                        if (peer == null) {
                            j3 = 0;
                        } else {
                            j3 = peer.user_id;
                            if (j3 == 0) {
                                long j10 = peer.chat_id;
                                if (j10 != 0) {
                                    j3 = -j10;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= tL_help_promoData.chats.size()) {
                                            qpVar = qpVar2;
                                            break;
                                        } else {
                                            TLRPC.Chat chat = tL_help_promoData.chats.get(i11);
                                            qpVar = qpVar2;
                                            if (chat.id != tL_help_promoData.peer.chat_id) {
                                                i11++;
                                                qpVar2 = qpVar;
                                            } else if (chat.kicked || chat.restricted) {
                                                z10 = true;
                                            }
                                        }
                                    }
                                    qpVar2 = qpVar;
                                } else {
                                    j3 = -peer.channel_id;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < tL_help_promoData.chats.size()) {
                                            TLRPC.Chat chat2 = tL_help_promoData.chats.get(i12);
                                            if (chat2.id != tL_help_promoData.peer.channel_id) {
                                                i12++;
                                            } else if (chat2.kicked || chat2.restricted) {
                                                qpVar2 = qpVar2;
                                                z10 = true;
                                            }
                                        }
                                    }
                                    qpVar2 = qpVar2;
                                }
                                qpVar2.z2 = j3;
                                if (!tL_help_promoData.proxy) {
                                    qpVar2.A2 = 0;
                                } else if (TextUtils.isEmpty(tL_help_promoData.psa_type)) {
                                    qpVar2.A2 = 2;
                                } else {
                                    qpVar2.A2 = 1;
                                    qpVar2.C2 = tL_help_promoData.psa_type;
                                }
                                qpVar2.D2 = rf.b.q(this.c, this.d);
                                qpVar2.B2 = tL_help_promoData.psa_message;
                                qpVar2.t2 = tL_help_promoData.expires;
                                SharedPreferences.Editor edit = qp.e1().edit();
                                edit.putLong("proxy_dialog", qpVar2.z2);
                                edit.putString("proxyDialogAddress", qpVar2.D2);
                                edit.putInt("promo_dialog_type", qpVar2.A2);
                                str = qpVar2.B2;
                                if (str == null) {
                                    edit.putString("promo_psa_message", str);
                                } else {
                                    edit.remove("promo_psa_message");
                                }
                                str2 = qpVar2.C2;
                                if (str2 == null) {
                                    edit.putString("promo_psa_type", str2);
                                } else {
                                    edit.remove("promo_psa_type");
                                }
                                edit.putInt("nextPromoInfoCheckTime", qpVar2.t2);
                                edit.commit();
                                if (!z10) {
                                    g0.h3(new ik(qpVar2, j3, tL_help_promoData, i10, 4));
                                }
                                z9 = z10;
                            }
                        }
                        z10 = false;
                        qpVar2.z2 = j3;
                        if (!tL_help_promoData.proxy) {
                        }
                        qpVar2.D2 = rf.b.q(this.c, this.d);
                        qpVar2.B2 = tL_help_promoData.psa_message;
                        qpVar2.t2 = tL_help_promoData.expires;
                        SharedPreferences.Editor edit2 = qp.e1().edit();
                        edit2.putLong("proxy_dialog", qpVar2.z2);
                        edit2.putString("proxyDialogAddress", qpVar2.D2);
                        edit2.putInt("promo_dialog_type", qpVar2.A2);
                        str = qpVar2.B2;
                        if (str == null) {
                        }
                        str2 = qpVar2.C2;
                        if (str2 == null) {
                        }
                        edit2.putInt("nextPromoInfoCheckTime", qpVar2.t2);
                        edit2.commit();
                        if (!z10) {
                        }
                        z9 = z10;
                    } else {
                        qpVar2.t2 = qpVar2.getConnectionsManager().getCurrentTime() + 3600;
                        z9 = true;
                    }
                    if (z9) {
                        qpVar2.z2 = 0L;
                        qp.e1().edit().putLong("proxy_dialog", qpVar2.z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", qpVar2.t2).commit();
                        qpVar2.v2 = 0;
                        qpVar2.u2 = false;
                        g0.h3(new sn(qpVar2, 8));
                        break;
                    }
                }
                break;
        }
    }
}
