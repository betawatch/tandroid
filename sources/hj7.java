// default package

import android.content.Context;
import android.graphics.RectF;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hj7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hj7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 27;
        byte b3 = 2;
        byte b4 = 1;
        byte b5 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gl.d3(new pc7(obj2, (Object) tLObject, obj, (byte) 3));
                break;
            case 1:
                ((ax7) obj2).a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                break;
            case 2:
                gl.d3(new pc7(obj2, (Object) tL_error, obj, (byte) 12));
                break;
            case 3:
                p pVar = (p) obj2;
                TLObject tLObject2 = (TLObject) obj;
                pVar.getClass();
                if (!(tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
                    gl.d3(new xy7(pVar, tL_error, tLObject2, b4));
                    break;
                } else {
                    gl.d3(new bj7(pVar, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, b2));
                    break;
                }
            case 4:
                p pVar2 = (p) obj2;
                TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = (TLRPC.TL_payments_sendPaymentForm) obj;
                if (tLObject == null) {
                    z02 z02Var = pVar2.f1;
                    if (z02Var == null || !((Boolean) z02Var.a(tL_error)).booleanValue()) {
                        gl.d3(new pc7((Object) pVar2, (Object) tL_error, (Object) tL_payments_sendPaymentForm, (byte) 14));
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                        gl.d3(new bj7(pVar2, (TLRPC.TL_payments_paymentVerificationNeeded) tLObject, (byte) 29));
                        break;
                    }
                } else {
                    p8c p8cVar = pVar2.d1;
                    if (p8cVar == null) {
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
                        pVar2.getMessagesController().Q3(updates, false);
                        gl.d3(new bj7(pVar2, messageArr, (byte) 28));
                        break;
                    } else {
                        p8cVar.a((TLRPC.TL_payments_paymentResult) tLObject);
                        break;
                    }
                }
                break;
            case 5:
                gl.d3(new jw6((p) obj2, tLObject, tL_error, (TL_account.getTmpPassword) obj, (byte) 15));
                break;
            case 6:
                s28 s28Var = (s28) obj2;
                y5b y5bVar = (y5b) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(s28Var.x.s2).Q3((TLRPC.Updates) tLObject, false);
                }
                gl.d3(new p28(y5bVar, b5));
                break;
            case 7:
                gl.d3(new pc7(obj2, obj, (Object) tLObject, (byte) 26));
                break;
            case 8:
                uf8 uf8Var = (uf8) obj2;
                uf8Var.getClass();
                gl.d3(new jw6(uf8Var, tL_error, tLObject, (TL_stars.updatePaidMessagesPrice) obj, (byte) 22));
                break;
            case 9:
                gl.d3(new jw6((PrivacyControlActivity) obj2, tL_error, tLObject, (boolean[]) obj, (byte) 24));
                break;
            case 10:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.getClass();
                gl.d3(new h18(privacySettingsActivity, (ahb) obj, b2));
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                gl.d3(new jw6(profileActivity, tL_error, tLObject, (String) obj, (byte) 28));
                break;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity2.getClass();
                gl.d3(new jw6(profileActivity2, tLObject, tL_error, (int[]) obj, (byte) 27));
                break;
            case 13:
                RectF rectF3 = ProfileActivity.Z6;
                gl.d3(new bm8(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 0));
                break;
            case 14:
                gl.d3(new bm8(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 2));
                break;
            case 15:
                gl.d3(new gm8((lca) obj2, tL_error, (d) obj, b3));
                break;
            case 16:
                gl.d3(new gm8((q99) obj2, tLObject, (TL_stars.getResaleStarGifts) obj, (byte) 10));
                break;
            case 17:
                gl.d3(new gm8((on9) obj2, tLObject, (String) obj, (byte) 19));
                break;
            case 18:
                gl.d3(new gm8((on9) obj2, tLObject, (TLRPC.ChatFull) obj, (byte) 20));
                break;
            case 19:
                gl.d3(new bm8(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 11));
                break;
            case 20:
                z3a z3aVar = (z3a) obj2;
                kp1 kp1Var = (kp1) obj;
                if (tLObject == null) {
                    z3aVar.getClass();
                    break;
                } else {
                    z3aVar.getMessagesController().Q3((TLRPC.Updates) tLObject, false);
                    if (kp1Var != null) {
                        gl.d3(kp1Var);
                        break;
                    }
                }
                break;
            case 21:
                gl.d3(new q3a(obj2, (Object) tL_error, obj, b4));
                break;
            case 22:
                gl.d3(new q3a(obj2, (Object) tL_error, obj, b3));
                break;
            case 23:
                gl.d3(new bm8(obj2, (Object) tLObject, tL_error, obj, (byte) 20));
                break;
            case 24:
                gl.d3(new t7a((d8a) obj2, (TLRPC.TL_attachMenuBot) obj, b5));
                break;
            case 25:
                d8a d8aVar = (d8a) obj2;
                d8aVar.getClass();
                gl.d3(new bm8((gk7) d8aVar, tL_error, tLObject, obj, (byte) 21));
                break;
            case 26:
                gl.d3(new t7a((taa) obj2, tLObject, (Context) obj));
                break;
            case 27:
                vqa vqaVar = (vqa) obj2;
                hd hdVar = (hd) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    na7.q1(vqaVar.a).a4(tL_payments_uniqueStarGift.users, false);
                    na7.q1(vqaVar.a).U3(tL_payments_uniqueStarGift.chats, false);
                    if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        gl.d3(new t7a((Object) vqaVar, (Object) tL_payments_uniqueStarGift, (byte) 22));
                        break;
                    }
                }
                gl.d3(new t7a((Object) hdVar, (Object) tL_error, (byte) 23));
                break;
            case 28:
                gl.d3(new bm8(obj2, (Object) tLObject, obj, (Object) tL_error, (byte) 26));
                break;
            default:
                vqa vqaVar2 = (vqa) obj2;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    na7.q1(vqaVar2.a).a4(updates2.users, false);
                    na7.q1(vqaVar2.a).U3(updates2.chats, false);
                }
                gl.d3(new bm8((gk7) vqaVar2, tL_error, tLObject, (Object) inputSavedStarGift, (byte) 28));
                break;
        }
    }
}
