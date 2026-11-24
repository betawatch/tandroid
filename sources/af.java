// default package

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class af implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ af(int i, ww1 ww1Var, d dVar, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = (byte) 7;
        this.b = i;
        this.c = ww1Var;
        this.e = dVar;
        this.d = tL_payments_assignPlayMarketTransaction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0129, code lost:
    
        r1 = false;
     */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        long j;
        boolean z;
        long j2;
        long j3;
        String str2;
        String str3;
        boolean z2;
        byte b = this.a;
        byte b2 = 10;
        int i = this.b;
        boolean z3 = false;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                he heVar = (he) obj2;
                d dVar = (d) obj;
                if (tL_error != null) {
                    gm.c3(new td(heVar, (byte) 2));
                    break;
                } else {
                    gm.c3(new i77((Object) sharedPreferences, tLObject, (Object) heVar, this.b, (Object) dVar, (byte) 2));
                    break;
                }
            case 1:
                gm.c3(new jg(obj3, obj2, (Object) tL_error, (Object) tLObject, this.b, obj, (byte) 1));
                break;
            case 2:
                gm.c3(new jg((KeyEvent.Callback) obj3, (Object) tLObject, this.b, obj2, obj, (TLObject) tL_error, (byte) 3));
                break;
            case 3:
                gm.c3(new i77(obj3, (Object) tLObject, obj2, this.b, obj, (byte) 11));
                break;
            case 4:
                String str4 = LaunchActivity.C1;
                gm.d3(new i77(obj3, (Object) tLObject, obj, this.b, obj2, (byte) 16), 2L);
                break;
            case 5:
                hs6 hs6Var = (hs6) obj3;
                String str5 = (String) obj2;
                String str6 = (String) obj;
                if (tLObject == null) {
                    gm.c3(new wq6(hs6Var, str6, (byte) 1));
                    break;
                } else {
                    TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
                    if (i != -1 && !tL_emojiKeywordsDifference.lang_code.equals(str5)) {
                        hs6Var.getMessagesStorage().a.c(new wq6(hs6Var, str6, (byte) 0));
                        break;
                    } else {
                        hs6Var.getMessagesStorage().a.c(new fp6((Object) hs6Var, (Object) tL_emojiKeywordsDifference, (Object) str6, (byte) 4));
                        gm.c3(new vp6(hs6Var, b2));
                        break;
                    }
                }
                break;
            case 6:
                oc7 oc7Var = (oc7) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                int i2 = oc7Var.p2;
                int i3 = this.b;
                if (i3 == i2) {
                    String str9 = "proxy_dialog";
                    if (tLObject instanceof TLRPC.TL_help_promoDataEmpty) {
                        oc7Var.m2 = ((TLRPC.TL_help_promoDataEmpty) tLObject).expires;
                        gm.c3(new g87(oc7Var, (byte) 20));
                        z = true;
                        str = "proxy_dialog";
                        j = 0;
                    } else if (tLObject instanceof TLRPC.TL_help_promoData) {
                        TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) tLObject;
                        TLRPC.Peer peer = tL_help_promoData.peer;
                        if (peer == null) {
                            str2 = "proxy_dialog";
                            str3 = str8;
                            j3 = 0;
                            j2 = 0;
                        } else {
                            j2 = 0;
                            j3 = peer.user_id;
                            if (j3 != 0) {
                                str2 = "proxy_dialog";
                            } else {
                                long j4 = peer.chat_id;
                                if (j4 != 0) {
                                    j3 = -j4;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= tL_help_promoData.chats.size()) {
                                            str2 = str9;
                                            break;
                                        } else {
                                            TLRPC.Chat chat = tL_help_promoData.chats.get(i4);
                                            str2 = str9;
                                            if (chat.id != tL_help_promoData.peer.chat_id) {
                                                i4++;
                                                str9 = str2;
                                            } else if (chat.kicked || chat.restricted) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                    z3 = z2;
                                } else {
                                    str2 = "proxy_dialog";
                                    j3 = -peer.channel_id;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < tL_help_promoData.chats.size()) {
                                            TLRPC.Chat chat2 = tL_help_promoData.chats.get(i5);
                                            str3 = str8;
                                            if (chat2.id != tL_help_promoData.peer.channel_id) {
                                                i5++;
                                                str8 = str3;
                                            } else if (chat2.kicked || chat2.restricted) {
                                                z3 = true;
                                            }
                                        } else {
                                            str3 = str8;
                                        }
                                    }
                                    z3 = false;
                                }
                            }
                            str3 = str8;
                        }
                        oc7Var.s2 = j3;
                        if (tL_help_promoData.proxy) {
                            oc7Var.t2 = 0;
                        } else if (TextUtils.isEmpty(tL_help_promoData.psa_type)) {
                            oc7Var.t2 = 2;
                        } else {
                            oc7Var.t2 = 1;
                            oc7Var.v2 = tL_help_promoData.psa_type;
                        }
                        oc7Var.w2 = td4.p(str7, str3);
                        oc7Var.u2 = tL_help_promoData.psa_message;
                        oc7Var.m2 = tL_help_promoData.expires;
                        SharedPreferences.Editor edit = oc7.d1().edit();
                        str = str2;
                        edit.putLong(str, oc7Var.s2);
                        edit.putString("proxyDialogAddress", oc7Var.w2);
                        edit.putInt("promo_dialog_type", oc7Var.t2);
                        String str10 = oc7Var.u2;
                        if (str10 != null) {
                            edit.putString("promo_psa_message", str10);
                        } else {
                            edit.remove("promo_psa_message");
                        }
                        String str11 = oc7Var.v2;
                        if (str11 != null) {
                            edit.putString("promo_psa_type", str11);
                        } else {
                            edit.remove("promo_psa_type");
                        }
                        edit.putInt("nextPromoInfoCheckTime", oc7Var.m2);
                        edit.commit();
                        gm.c3(new q87(oc7Var, tL_help_promoData, (byte) 8));
                        if (z3) {
                            j = j2;
                        } else {
                            j = j2;
                            gm.c3(new o77((Object) oc7Var, j3, (Object) tL_help_promoData, i3, (byte) 9));
                        }
                        z = z3;
                    } else {
                        str = "proxy_dialog";
                        j = 0;
                        oc7Var.m2 = oc7Var.getConnectionsManager().getCurrentTime() + 3600;
                        z = true;
                    }
                    if (z) {
                        oc7Var.s2 = j;
                        oc7.d1().edit().putLong(str, oc7Var.s2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", oc7Var.m2).commit();
                        oc7Var.o2 = 0;
                        oc7Var.n2 = false;
                        gm.c3(new ba7(oc7Var, (byte) 17));
                        break;
                    }
                }
                break;
            case 7:
                ww1 ww1Var = (ww1) obj3;
                d dVar2 = (d) obj;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj2;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        gm.c3(new v36(i, tL_error, dVar2, tL_payments_assignPlayMarketTransaction));
                        break;
                    }
                } else {
                    oc7.r1(i).T3((TLRPC.Updates) tLObject, false);
                    gm.c3(ww1Var);
                    break;
                }
                break;
            case 8:
                gm.c3(new i77((Object) tLObject, obj3, obj2, this.b, obj, (byte) 24));
                break;
            case 9:
                nha nhaVar = (nha) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                gm.c3(new wi0((he[]) obj2, b2));
                int i6 = this.b;
                if (tL_error != null) {
                    gm.c3(new tda((Object) nhaVar, i6, (Object) tL_error, (Object) tL_messages_editMessage, (byte) 1));
                    break;
                } else {
                    oc7.r1(i6).T3((TLRPC.Updates) tLObject, false);
                    break;
                }
            default:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ev0 ev0Var = (ev0) obj;
                if (tL_error != null && ad4.r(tL_error.text) && obj3 != null) {
                    ad4.n(i).u(new Object[]{tL_messages_getAttachedStickers, ev0Var}, obj3);
                    break;
                } else {
                    ev0Var.run(tLObject, tL_error);
                    break;
                }
        }
    }

    public /* synthetic */ af(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ af(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ af(LaunchActivity launchActivity, Uri uri, int i, he heVar) {
        this.a = (byte) 4;
        this.c = launchActivity;
        this.e = uri;
        this.b = i;
        this.d = heVar;
    }
}
