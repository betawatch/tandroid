// default package

import android.content.Context;
import android.graphics.RectF;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jl7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jl7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 1;
        byte b3 = 29;
        byte b4 = 28;
        byte b5 = 5;
        byte b6 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gm.c3(new ud7(obj2, (Object) tLObject, obj, (byte) 6));
                break;
            case 1:
                ((dz7) obj2).a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 2:
                gm.c3(new ud7(obj2, (Object) tL_error, obj, (byte) 15));
                break;
            case 3:
                p pVar = (p) obj2;
                TLObject tLObject2 = (TLObject) obj;
                pVar.getClass();
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    gm.c3(new z08(pVar, tL_error, tLObject2, b2));
                    break;
                } else {
                    gm.c3(new bl7(pVar, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, b4));
                    break;
                }
            case 4:
                p pVar2 = (p) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    k22 k22Var = pVar2.f1;
                    if (k22Var == null || !((Boolean) k22Var.a(tL_error)).booleanValue()) {
                        gm.c3(new ud7((Object) pVar2, (Object) tL_error, (Object) tL_payments_sendPaymentForm, (byte) 17));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        gm.c3(new a18(pVar2, (TLRPC.TL_payments_paymentVerificationNeeded) tLObject, b6));
                        break;
                    }
                } else {
                    qac qacVar = pVar2.d1;
                    if (qacVar == null) {
                        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                        TLRPC.Message[] messageArr = new TLRPC.Message[1];
                        int size = updates.updates.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                TLRPC.Update update = updates.updates.get(i);
                                if (update instanceof TL_update.TL_updateNewMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                                } else {
                                    i++;
                                }
                            }
                        }
                        pVar2.getMessagesController().T3(updates, false);
                        gm.c3(new bl7(pVar2, messageArr, b3));
                        break;
                    } else {
                        qacVar.a((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 5:
                gm.c3(new jy6((p) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, (byte) 15));
                break;
            case 6:
                v48 v48Var = (v48) obj2;
                a8b a8bVar = (a8b) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    oc7.r1(v48Var.x.s2).T3((TLRPC.Updates) tLObject, false);
                }
                gm.c3(new s48(a8bVar, b6));
                break;
            case 7:
                gm.c3(new ud7((ih8) obj2, (hh8) obj, tLObject, b3));
                break;
            case 8:
                wh8 wh8Var = (wh8) obj2;
                wh8Var.getClass();
                gm.c3(new jy6(wh8Var, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, (byte) 22));
                break;
            case 9:
                gm.c3(new jy6((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, (byte) 24));
                break;
            case 10:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.getClass();
                gm.c3(new a18(privacySettingsActivity, (bjb) obj, b4));
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                RectF rectF = ProfileActivity.e7;
                profileActivity.getClass();
                gm.c3(new jy6(profileActivity, tL_error, tLObject, (String) obj, (byte) 29));
                break;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                RectF rectF2 = ProfileActivity.e7;
                profileActivity2.getClass();
                gm.c3(new jy6(profileActivity2, tLObject, tL_error, (int[]) obj, (byte) 26));
                break;
            case 13:
                RectF rectF3 = ProfileActivity.e7;
                gm.c3(new jy6((ProfileActivity) obj2, tLObject, (TLRPC.TL_username) obj, tL_error, (byte) 27));
                break;
            case 14:
                gm.c3(new no8(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 2));
                break;
            case 15:
                gm.c3(new ak8(obj2, (Object) tL_error, obj, b5));
                break;
            case 16:
                gm.c3(new ak8(obj2, tLObject, obj, (byte) 13));
                break;
            case 17:
                gm.c3(new ak8(obj2, tLObject, obj, (byte) 22));
                break;
            case 18:
                gm.c3(new ak8(obj2, tLObject, obj, (byte) 23));
                break;
            case 19:
                gm.c3(new no8(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 11));
                break;
            case 20:
                a6a a6aVar = (a6a) obj2;
                xq1 xq1Var = (xq1) obj;
                if (tLObject == null) {
                    a6aVar.getClass();
                    break;
                } else {
                    a6aVar.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    if (xq1Var != null) {
                        gm.c3(xq1Var);
                        break;
                    }
                }
                break;
            case 21:
                gm.c3(new hw9(obj2, (Object) tL_error, obj, (byte) 4));
                break;
            case 22:
                gm.c3(new hw9((e9a) obj2, tL_error, (TLRPC.TL_authorization) obj, b5));
                break;
            case 23:
                gm.c3(new no8(obj2, (Object) tLObject, (Object) tL_error, obj, (byte) 20));
                break;
            case 24:
                gm.c3(new e6a(obj2, obj, (byte) 2));
                break;
            case 25:
                daa daaVar = (daa) obj2;
                daaVar.getClass();
                gm.c3(new no8((Object) daaVar, (Object) tL_error, (Object) tLObject, obj, (byte) 21));
                break;
            case 26:
                gm.c3(new e6a((tca) obj2, tLObject, (Context) obj));
                break;
            case 27:
                wsa wsaVar = (wsa) obj2;
                he heVar = (he) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    oc7.r1(wsaVar.a).d4(tL_payments_uniqueStarGift.users, false);
                    oc7.r1(wsaVar.a).X3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        gm.c3(new e6a((Object) wsaVar, (Object) tL_payments_uniqueStarGift, (byte) 24));
                        break;
                    }
                }
                gm.c3(new e6a((Object) heVar, (Object) tL_error, (byte) 25));
                break;
            case 28:
                gm.c3(new no8(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 26));
                break;
            default:
                wsa wsaVar2 = (wsa) obj2;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    oc7.r1(wsaVar2.a).d4(updates2.users, false);
                    oc7.r1(wsaVar2.a).X3(updates2.chats, false);
                }
                gm.c3(new no8((Object) wsaVar2, (Object) tL_error, (Object) tLObject, (Object) inputSavedStarGift, (byte) 28));
                break;
        }
    }
}
