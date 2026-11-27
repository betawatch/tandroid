// default package

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class lh implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lh(int i, yv1 yv1Var, e eVar, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = (byte) 7;
        this.b = i;
        this.c = yv1Var;
        this.e = eVar;
        this.d = tL_payments_assignPlayMarketTransaction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
    
        if (r2.restricted == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015d, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0156, code lost:
    
        if (r2.restricted == false) goto L63;
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
        byte b = this.a;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                id idVar = (id) obj2;
                e eVar = (e) obj;
                if (tL_error != null) {
                    hl.c3(new uc(idVar, (byte) 2));
                    break;
                } else {
                    hl.c3(new l77((Object) sharedPreferences, tLObject, (Object) idVar, this.b, (Object) eVar, (byte) 2));
                    break;
                }
            case 1:
                hl.c3(new te(obj3, obj2, (Object) tL_error, (Object) tLObject, this.b, obj, (byte) 1));
                break;
            case 2:
                hl.c3(new te((KeyEvent.Callback) obj3, (Object) tLObject, this.b, obj2, obj, (TLObject) tL_error, (byte) 3));
                break;
            case 3:
                hl.c3(new l77(obj3, (Object) tLObject, obj2, this.b, obj, (byte) 11));
                break;
            case 4:
                String str4 = LaunchActivity.C1;
                hl.d3(new l77(obj3, (Object) tLObject, obj, this.b, obj2, (byte) 16), 2L);
                break;
            case 5:
                ls6 ls6Var = (ls6) obj3;
                String str5 = (String) obj2;
                String str6 = (String) obj;
                if (tLObject == null) {
                    hl.c3(new aq6(ls6Var, str6, (byte) 2));
                    break;
                } else {
                    TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) tLObject;
                    if (i != -1 && !tL_emojiKeywordsDifference.lang_code.equals(str5)) {
                        ls6Var.getMessagesStorage().a.c(new aq6(ls6Var, str6, (byte) 1));
                        break;
                    } else {
                        ls6Var.getMessagesStorage().a.c(new yg6(ls6Var, tL_emojiKeywordsDifference, str6, (byte) 8));
                        hl.c3(new ip6(ls6Var, (byte) 10));
                        break;
                    }
                }
            case 6:
                uc7 uc7Var = (uc7) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                int i2 = uc7Var.p2;
                int i3 = this.b;
                if (i3 == i2) {
                    String str9 = "proxy_dialog";
                    if (tLObject instanceof TLRPC.TL_help_promoDataEmpty) {
                        uc7Var.m2 = ((TLRPC.TL_help_promoDataEmpty) tLObject).expires;
                        hl.c3(new l87(uc7Var, (byte) 20));
                        z = true;
                        str = "proxy_dialog";
                        j = 0;
                    } else if (tLObject instanceof TLRPC.TL_help_promoData) {
                        TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) tLObject;
                        TLRPC.Peer peer = tL_help_promoData.peer;
                        if (peer == null) {
                            str2 = "proxy_dialog";
                            z = false;
                            str3 = str8;
                            j3 = 0;
                            j2 = 0;
                        } else {
                            j2 = 0;
                            j3 = peer.user_id;
                            if (j3 != 0) {
                                str2 = "proxy_dialog";
                                z = false;
                                str3 = str8;
                            } else {
                                long j4 = peer.chat_id;
                                if (j4 != 0) {
                                    j3 = -j4;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= tL_help_promoData.chats.size()) {
                                            str2 = str9;
                                            str3 = str8;
                                            break;
                                        } else {
                                            TLRPC.Chat chat = tL_help_promoData.chats.get(i4);
                                            str3 = str8;
                                            str2 = str9;
                                            if (chat.id != tL_help_promoData.peer.chat_id) {
                                                i4++;
                                                str9 = str2;
                                                str8 = str3;
                                            } else if (!chat.kicked) {
                                                break;
                                            }
                                        }
                                    }
                                    z = true;
                                } else {
                                    str2 = "proxy_dialog";
                                    str3 = str8;
                                    j3 = -peer.channel_id;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= tL_help_promoData.chats.size()) {
                                            break;
                                        } else {
                                            TLRPC.Chat chat2 = tL_help_promoData.chats.get(i5);
                                            if (chat2.id != tL_help_promoData.peer.channel_id) {
                                                i5++;
                                            } else if (!chat2.kicked) {
                                                break;
                                            }
                                        }
                                    }
                                    z = true;
                                }
                            }
                        }
                        uc7Var.s2 = j3;
                        if (tL_help_promoData.proxy) {
                            uc7Var.t2 = 0;
                        } else if (TextUtils.isEmpty(tL_help_promoData.psa_type)) {
                            uc7Var.t2 = 2;
                        } else {
                            uc7Var.t2 = 1;
                            uc7Var.v2 = tL_help_promoData.psa_type;
                        }
                        uc7Var.w2 = qd4.o(str7, str3);
                        uc7Var.u2 = tL_help_promoData.psa_message;
                        uc7Var.m2 = tL_help_promoData.expires;
                        SharedPreferences.Editor edit = uc7.e1().edit();
                        str = str2;
                        edit.putLong(str, uc7Var.s2);
                        edit.putString("proxyDialogAddress", uc7Var.w2);
                        edit.putInt("promo_dialog_type", uc7Var.t2);
                        String str10 = uc7Var.u2;
                        if (str10 != null) {
                            edit.putString("promo_psa_message", str10);
                        } else {
                            edit.remove("promo_psa_message");
                        }
                        String str11 = uc7Var.v2;
                        if (str11 != null) {
                            edit.putString("promo_psa_type", str11);
                        } else {
                            edit.remove("promo_psa_type");
                        }
                        edit.putInt("nextPromoInfoCheckTime", uc7Var.m2);
                        edit.commit();
                        hl.c3(new t87(uc7Var, tL_help_promoData, (byte) 2));
                        if (z) {
                            j = j2;
                        } else {
                            j = j2;
                            hl.c3(new r77((Object) uc7Var, j3, (Object) tL_help_promoData, i3, (byte) 9));
                        }
                    } else {
                        str = "proxy_dialog";
                        j = 0;
                        uc7Var.m2 = uc7Var.getConnectionsManager().getCurrentTime() + 3600;
                        z = true;
                    }
                    if (z) {
                        uc7Var.s2 = j;
                        uc7.e1().edit().putLong(str, uc7Var.s2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", uc7Var.m2).commit();
                        uc7Var.o2 = 0;
                        uc7Var.n2 = false;
                        hl.c3(new pa7(uc7Var, (byte) 16));
                        break;
                    }
                }
                break;
            case 7:
                yv1 yv1Var = (yv1) obj3;
                e eVar2 = (e) obj;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj2;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        hl.c3(new y36(i, tL_error, eVar2, tL_payments_assignPlayMarketTransaction));
                        break;
                    }
                } else {
                    uc7.s1(i).Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(yv1Var);
                    break;
                }
                break;
            case 8:
                hl.c3(new l77((Object) tLObject, obj3, obj2, this.b, obj, (byte) 24));
                break;
            case 9:
                eja ejaVar = (eja) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                hl.c3(new xh0((id[]) obj2, (byte) 9));
                int i6 = this.b;
                if (tL_error != null) {
                    hl.c3(new efa((Object) ejaVar, i6, (Object) tL_error, (Object) tL_messages_editMessage, (byte) 0));
                    break;
                } else {
                    uc7.s1(i6).Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
            default:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                eu0 eu0Var = (eu0) obj;
                if (tL_error != null && xc4.r(tL_error.text) && obj3 != null) {
                    xc4.n(i).u(new Object[]{tL_messages_getAttachedStickers, eu0Var}, obj3);
                    break;
                } else {
                    eu0Var.run(tLObject, tL_error);
                    break;
                }
        }
    }

    public /* synthetic */ lh(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ lh(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ lh(LaunchActivity launchActivity, Uri uri, int i, id idVar) {
        this.a = (byte) 4;
        this.c = launchActivity;
        this.e = uri;
        this.b = i;
        this.d = idVar;
    }
}
