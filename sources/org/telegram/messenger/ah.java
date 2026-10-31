package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ f1 e;

    public /* synthetic */ ah(f1 f1Var, int i10, String str, String str2, int i11) {
        this.a = i11;
        this.e = f1Var;
        this.b = i10;
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
        vp vpVar;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.e;
                String str3 = this.d;
                if (tLObject == null) {
                    i0.g3(new jh(uiVar, str3, 1));
                    break;
                } else {
                    TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
                    if (this.b != -1 && !tL_emojiKeywordsDifference.lang_code.equals(this.c)) {
                        uiVar.getMessagesStorage().a.c(new jh(uiVar, str3, 0));
                        break;
                    } else {
                        uiVar.getMessagesStorage().a.c(new kg((f1) uiVar, (TLObject) tL_emojiKeywordsDifference, str3, 3));
                        i0.g3(new eg(uiVar, 9));
                        break;
                    }
                }
                break;
            default:
                vp vpVar2 = (vp) this.e;
                int i10 = vpVar2.w2;
                int i11 = this.b;
                if (i11 == i10) {
                    if (tLObject instanceof TLRPC.TL_help_promoDataEmpty) {
                        vpVar2.t2 = ((TLRPC.TL_help_promoDataEmpty) tLObject).expires;
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
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= tL_help_promoData.chats.size()) {
                                            vpVar = vpVar2;
                                            break;
                                        } else {
                                            TLRPC.Chat chat = tL_help_promoData.chats.get(i12);
                                            vpVar = vpVar2;
                                            if (chat.id != tL_help_promoData.peer.chat_id) {
                                                i12++;
                                                vpVar2 = vpVar;
                                            } else if (chat.kicked || chat.restricted) {
                                                z11 = true;
                                            }
                                        }
                                    }
                                    vpVar2 = vpVar;
                                } else {
                                    j10 = -peer.channel_id;
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < tL_help_promoData.chats.size()) {
                                            TLRPC.Chat chat2 = tL_help_promoData.chats.get(i13);
                                            if (chat2.id != tL_help_promoData.peer.channel_id) {
                                                i13++;
                                            } else if (chat2.kicked || chat2.restricted) {
                                                vpVar2 = vpVar2;
                                                z11 = true;
                                            }
                                        }
                                    }
                                    vpVar2 = vpVar2;
                                }
                                vpVar2.z2 = j10;
                                if (!tL_help_promoData.proxy) {
                                    vpVar2.A2 = 0;
                                } else if (TextUtils.isEmpty(tL_help_promoData.psa_type)) {
                                    vpVar2.A2 = 2;
                                } else {
                                    vpVar2.A2 = 1;
                                    vpVar2.C2 = tL_help_promoData.psa_type;
                                }
                                vpVar2.D2 = sc.e.A(this.c, this.d);
                                vpVar2.B2 = tL_help_promoData.psa_message;
                                vpVar2.t2 = tL_help_promoData.expires;
                                SharedPreferences.Editor edit = vp.d1().edit();
                                edit.putLong("proxy_dialog", vpVar2.z2);
                                edit.putString("proxyDialogAddress", vpVar2.D2);
                                edit.putInt("promo_dialog_type", vpVar2.A2);
                                str = vpVar2.B2;
                                if (str == null) {
                                    edit.putString("promo_psa_message", str);
                                } else {
                                    edit.remove("promo_psa_message");
                                }
                                str2 = vpVar2.C2;
                                if (str2 == null) {
                                    edit.putString("promo_psa_type", str2);
                                } else {
                                    edit.remove("promo_psa_type");
                                }
                                edit.putInt("nextPromoInfoCheckTime", vpVar2.t2);
                                edit.commit();
                                if (!z11) {
                                    i0.g3(new rk(vpVar2, j10, tL_help_promoData, i11, 4));
                                }
                                z10 = z11;
                            }
                        }
                        z11 = false;
                        vpVar2.z2 = j10;
                        if (!tL_help_promoData.proxy) {
                        }
                        vpVar2.D2 = sc.e.A(this.c, this.d);
                        vpVar2.B2 = tL_help_promoData.psa_message;
                        vpVar2.t2 = tL_help_promoData.expires;
                        SharedPreferences.Editor edit2 = vp.d1().edit();
                        edit2.putLong("proxy_dialog", vpVar2.z2);
                        edit2.putString("proxyDialogAddress", vpVar2.D2);
                        edit2.putInt("promo_dialog_type", vpVar2.A2);
                        str = vpVar2.B2;
                        if (str == null) {
                        }
                        str2 = vpVar2.C2;
                        if (str2 == null) {
                        }
                        edit2.putInt("nextPromoInfoCheckTime", vpVar2.t2);
                        edit2.commit();
                        if (!z11) {
                        }
                        z10 = z11;
                    } else {
                        vpVar2.t2 = vpVar2.getConnectionsManager().getCurrentTime() + 3600;
                        z10 = true;
                    }
                    if (z10) {
                        vpVar2.z2 = 0L;
                        vp.d1().edit().putLong("proxy_dialog", vpVar2.z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", vpVar2.t2).commit();
                        vpVar2.v2 = 0;
                        vpVar2.u2 = false;
                        i0.g3(new eo(vpVar2, 8));
                        break;
                    }
                }
                break;
        }
    }
}
