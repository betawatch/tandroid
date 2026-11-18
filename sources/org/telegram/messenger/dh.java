package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class dh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ c1 e;

    public /* synthetic */ dh(c1 c1Var, int i7, String str, String str2, int i10) {
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
        boolean z10;
        long j3;
        boolean z11;
        mp mpVar;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                ri riVar = (ri) this.e;
                String str3 = this.d;
                if (tLObject == null) {
                    g0.g3(new hh(riVar, str3, 1));
                    break;
                } else {
                    TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
                    if (this.b != -1 && !tL_emojiKeywordsDifference.lang_code.equals(this.c)) {
                        riVar.getMessagesStorage().a.c(new hh(riVar, str3, 0));
                        break;
                    } else {
                        riVar.getMessagesStorage().a.c(new kg((Object) riVar, (Object) tL_emojiKeywordsDifference, str3, 3));
                        g0.g3(new eg(riVar, 10));
                        break;
                    }
                }
            default:
                mp mpVar2 = (mp) this.e;
                int i7 = mpVar2.z2;
                int i10 = this.b;
                if (i10 == i7) {
                    if (tLObject instanceof TLRPC.TL_help_promoDataEmpty) {
                        mpVar2.w2 = ((TLRPC.TL_help_promoDataEmpty) tLObject).expires;
                        z10 = true;
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
                                            mpVar = mpVar2;
                                            break;
                                        } else {
                                            TLRPC.Chat chat = tL_help_promoData.chats.get(i11);
                                            mpVar = mpVar2;
                                            if (chat.id != tL_help_promoData.peer.chat_id) {
                                                i11++;
                                                mpVar2 = mpVar;
                                            } else if (chat.kicked || chat.restricted) {
                                                z11 = true;
                                            }
                                        }
                                    }
                                    mpVar2 = mpVar;
                                } else {
                                    j3 = -peer.channel_id;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < tL_help_promoData.chats.size()) {
                                            TLRPC.Chat chat2 = tL_help_promoData.chats.get(i12);
                                            if (chat2.id != tL_help_promoData.peer.channel_id) {
                                                i12++;
                                            } else if (chat2.kicked || chat2.restricted) {
                                                mpVar2 = mpVar2;
                                                z11 = true;
                                            }
                                        }
                                    }
                                    mpVar2 = mpVar2;
                                }
                                mpVar2.C2 = j3;
                                if (!tL_help_promoData.proxy) {
                                    mpVar2.D2 = 0;
                                } else if (TextUtils.isEmpty(tL_help_promoData.psa_type)) {
                                    mpVar2.D2 = 2;
                                } else {
                                    mpVar2.D2 = 1;
                                    mpVar2.F2 = tL_help_promoData.psa_type;
                                }
                                mpVar2.G2 = p5.c.v(this.c, this.d);
                                mpVar2.E2 = tL_help_promoData.psa_message;
                                mpVar2.w2 = tL_help_promoData.expires;
                                SharedPreferences.Editor edit = mp.g1().edit();
                                edit.putLong("proxy_dialog", mpVar2.C2);
                                edit.putString("proxyDialogAddress", mpVar2.G2);
                                edit.putInt("promo_dialog_type", mpVar2.D2);
                                str = mpVar2.E2;
                                if (str == null) {
                                    edit.putString("promo_psa_message", str);
                                } else {
                                    edit.remove("promo_psa_message");
                                }
                                str2 = mpVar2.F2;
                                if (str2 == null) {
                                    edit.putString("promo_psa_type", str2);
                                } else {
                                    edit.remove("promo_psa_type");
                                }
                                edit.putInt("nextPromoInfoCheckTime", mpVar2.w2);
                                edit.commit();
                                if (!z11) {
                                    g0.g3(new ek(mpVar2, j3, tL_help_promoData, i10, 4));
                                }
                                z10 = z11;
                            }
                        }
                        z11 = false;
                        mpVar2.C2 = j3;
                        if (!tL_help_promoData.proxy) {
                        }
                        mpVar2.G2 = p5.c.v(this.c, this.d);
                        mpVar2.E2 = tL_help_promoData.psa_message;
                        mpVar2.w2 = tL_help_promoData.expires;
                        SharedPreferences.Editor edit2 = mp.g1().edit();
                        edit2.putLong("proxy_dialog", mpVar2.C2);
                        edit2.putString("proxyDialogAddress", mpVar2.G2);
                        edit2.putInt("promo_dialog_type", mpVar2.D2);
                        str = mpVar2.E2;
                        if (str == null) {
                        }
                        str2 = mpVar2.F2;
                        if (str2 == null) {
                        }
                        edit2.putInt("nextPromoInfoCheckTime", mpVar2.w2);
                        edit2.commit();
                        if (!z11) {
                        }
                        z10 = z11;
                    } else {
                        mpVar2.w2 = mpVar2.getConnectionsManager().getCurrentTime() + 3600;
                        z10 = true;
                    }
                    if (z10) {
                        mpVar2.C2 = 0L;
                        mp.g1().edit().putLong("proxy_dialog", mpVar2.C2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", mpVar2.w2).commit();
                        mpVar2.y2 = 0;
                        mpVar2.x2 = false;
                        g0.g3(new qn(mpVar2, 7));
                        break;
                    }
                }
                break;
        }
    }
}
