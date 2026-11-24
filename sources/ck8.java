// default package

import android.graphics.RectF;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ck8 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ck8(Object obj, Object obj2, hd hdVar, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = hdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        k27 k27Var = null;
        r1 = null;
        r1 = null;
        fk1 fk1Var = null;
        k27Var = null;
        char c = 1;
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                hd hdVar = (hd) this.c;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.d;
                privacySettingsActivity.getClass();
                gl.c3(new jw6(privacySettingsActivity, hdVar, tLObject, setaccountttl, (byte) 25));
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.Z6;
                gl.c3(new ex7((Object) profileActivity, tLObject, (Object) userFull, (Object) tL_birthday, tL_error, (byte) 12));
                break;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                in8 in8Var = (in8) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                gl.c3(new ex7((Object) profileActivity2, tLObject, (Object) tL_username, (Object) in8Var, tL_error, (byte) 10));
                break;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.Z6;
                gl.c3(new ex7((Object) profileActivity3, tLObject, (Object) str, (Object) user, tL_error, (byte) 11));
                break;
            case 4:
                gl.c3(new bm8(this.b, (Object) tLObject, this.c, this.d, (byte) 1));
                break;
            case 5:
                gl.c3(new ex7(this.b, tLObject, this.c, this.d, tL_error, (byte) 15));
                break;
            case 6:
                gl.c3(new ex7(this.b, (Object) tL_error, (Object) tLObject, this.c, this.d, (byte) 18));
                break;
            case 7:
                gl.c3(new ex7((h1a) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d));
                break;
            case 8:
                gl.c3(new x1a((z3a) this.b, (String) this.c, (List) this.d, c == true ? 1 : 0));
                break;
            case 9:
                gl.c3(new bm8(this.b, (Object) tLObject, this.c, this.d, (byte) 14));
                break;
            case 10:
                z3a z3aVar = (z3a) this.b;
                d dVar = (d) this.c;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
                if (tL_error != null) {
                    gl.c3(new t1a(z3aVar, tL_error, dVar, tL_messages_editMessage, (byte) 0));
                    break;
                } else {
                    z3aVar.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                hd hdVar2 = (hd) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                sessionsActivity.getClass();
                gl.c3(new bm8((Object) sessionsActivity, (Object) hdVar2, tL_error, (Object) tL_authorization, (byte) 19));
                break;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.b;
                hd hdVar3 = (hd) this.c;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.d;
                sessionsActivity2.getClass();
                gl.c3(new bm8((Object) sessionsActivity2, (Object) hdVar3, tL_error, (Object) tL_webAuthorization, (byte) 18));
                break;
            case 13:
                gl.c3(new bm8(tLObject, (boolean[]) this.b, (pt0) this.c, (TLRPC.UserFull) this.d));
                break;
            case 14:
                vqa vqaVar = (vqa) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.d;
                hd hdVar4 = (hd) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    na7.q1(vqaVar.a).b4(messages_messages.users, false);
                    na7.q1(vqaVar.a).V3(messages_messages.chats, false);
                    int i = 0;
                    while (true) {
                        if (i < messages_messages.messages.size()) {
                            TLRPC.Message message = messages_messages.messages.get(i);
                            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || message.id != tL_messageActionStarGift.upgrade_msg_id) {
                                i++;
                            } else {
                                k27Var = new k27(vqaVar.a, message, false, false);
                                k27Var.K5();
                            }
                        }
                    }
                }
                if (k27Var == null) {
                    gl.c3(new tc(hdVar4, (byte) 6));
                    break;
                } else {
                    gl.c3(new q3a((Object) vqaVar, (Object) hdVar4, (Object) k27Var, (byte) 17));
                    break;
                }
                break;
            case 15:
                vqa vqaVar2 = (vqa) this.b;
                c01 c01Var = (c01) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                            gl.c3(new q3a((Object) vqaVar2, (Object) c01Var, (Object) tL_error, (byte) 14));
                            break;
                        } else {
                            gl.c3(new go6((Object) vqaVar2, (Object) c01Var, Long.parseLong(tL_error.text.substring(26)), (byte) 26));
                            break;
                        }
                    }
                } else {
                    na7.q1(vqaVar2.a).R3((TLRPC.Updates) tLObject, false);
                    gl.c3(new q3a((Object) vqaVar2, (Object) c01Var, (Object) tL_starGiftUnique, (byte) 13));
                    break;
                }
                break;
            case 16:
                gl.c3(new bm8(this.b, (Object) tLObject, this.c, this.d, (byte) 25));
                break;
            case 17:
                gl.c3(new ex7(this.b, (Object) tL_error, this.c, (Object) tLObject, this.d, (byte) 27));
                break;
            case 18:
                gl.c3(new tsa((gta) this.b, tL_error, (ae2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 0));
                break;
            case 19:
                gl.c3(new ex7(this.b, (Object) tL_error, this.c, (Object) tLObject, this.d, (byte) 24));
                break;
            case 20:
                fxa fxaVar = (fxa) this.b;
                String str2 = (String) this.c;
                txa txaVar = (txa) this.d;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        gxa gxaVar = fxaVar.r;
                        fk1Var = uxa.e0(jSONObject, gxaVar.i, gxaVar == fxaVar.x.x);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(fxaVar.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                gl.c3(new exa((Object) fxaVar, (Object) fk1Var, (Object) str2, (Object) txaVar, (byte) 0));
                break;
            case 21:
                gl.c3(new tsa((u0b) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d));
                break;
            case 22:
                gl.c3(new tsa((t5b) this.b, (hd) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error));
                break;
            case 23:
                gl.c3(new tsa((xab) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error));
                break;
            case 24:
                gl.c3(new exa((Object) tLObject, this.b, this.c, this.d, (byte) 10));
                break;
            case 25:
                gl.c3(new exa(this.b, (Object) tLObject, this.d, this.c, (byte) 12));
                break;
            case 26:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    gl.c3(new a5b((Object) twoStepVerificationActivity, (Object) tL_error, (byte) 29));
                    break;
                } else {
                    Utilities.e.c(new exa((Object) twoStepVerificationActivity, (Object) bArr, (Object) tLObject, (Object) bArr2, (byte) 17));
                    break;
                }
            case 27:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$48((TL_phone.PhoneCall) this.c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                break;
            case 28:
                VoIPService.lambda$startConferenceGroupCall$52((ArrayList) this.b, (ArrayList) this.c, (khc) this.d, tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$44((ArrayList) this.b, (ArrayList) this.c, (khc) this.d, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ ck8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
