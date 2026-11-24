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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fm8 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fm8(Object obj, Object obj2, he heVar, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = heVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        k47 k47Var = null;
        r1 = null;
        r1 = null;
        nl1 nl1Var = null;
        k47Var = null;
        byte b = 1;
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                he heVar = (he) this.c;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.d;
                privacySettingsActivity.getClass();
                gm.c3(new jy6(privacySettingsActivity, heVar, tLObject, setaccountttl, (byte) 25));
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.e7;
                gm.c3(new hz7((Object) profileActivity, tLObject, (Object) userFull, (Object) tL_birthday, tL_error, (byte) 12));
                break;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                jp8 jp8Var = (jp8) this.d;
                RectF rectF2 = ProfileActivity.e7;
                gm.c3(new hz7((Object) profileActivity2, tLObject, (Object) tL_username, (Object) jp8Var, tL_error, (byte) 10));
                break;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.e7;
                gm.c3(new hz7((Object) profileActivity3, tLObject, (Object) str, (Object) user, tL_error, (byte) 11));
                break;
            case 4:
                gm.c3(new no8(this.b, (Object) tLObject, this.c, this.d, (byte) 1));
                break;
            case 5:
                gm.c3(new hz7(this.b, tLObject, this.c, this.d, tL_error, (byte) 15));
                break;
            case 6:
                gm.c3(new hz7(this.b, (Object) tL_error, (Object) tLObject, this.c, this.d, (byte) 18));
                break;
            case 7:
                gm.c3(new hz7((j3a) this.b, tLObject, (TLRPC.TL_inputStorePaymentGiftPremium) this.c, tL_error, (TLRPC.TL_payments_canPurchaseStore) this.d));
                break;
            case 8:
                gm.c3(new z3a((a6a) this.b, (String) this.c, (List) this.d, b));
                break;
            case 9:
                gm.c3(new no8(this.b, (Object) tLObject, this.c, this.d, (byte) 14));
                break;
            case 10:
                a6a a6aVar = (a6a) this.b;
                d dVar = (d) this.c;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
                if (tL_error != null) {
                    gm.c3(new v3a(a6aVar, tL_error, dVar, tL_messages_editMessage, (byte) 0));
                    break;
                } else {
                    a6aVar.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                he heVar2 = (he) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                sessionsActivity.getClass();
                gm.c3(new no8(sessionsActivity, heVar2, tL_error, (TLObject) tL_authorization, (byte) 19));
                break;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.b;
                he heVar3 = (he) this.c;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.d;
                sessionsActivity2.getClass();
                gm.c3(new no8(sessionsActivity2, heVar3, tL_error, (TLObject) tL_webAuthorization, (byte) 18));
                break;
            case 13:
                gm.c3(new no8((Object) tLObject, this.b, this.c, this.d, (byte) 22));
                break;
            case 14:
                wsa wsaVar = (wsa) this.b;
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) this.d;
                he heVar4 = (he) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    oc7.r1(wsaVar.a).d4(messages_messages.users, false);
                    oc7.r1(wsaVar.a).X3(messages_messages.chats, false);
                    int i = 0;
                    while (true) {
                        if (i < messages_messages.messages.size()) {
                            TLRPC.Message message = messages_messages.messages.get(i);
                            if (message == null || (message instanceof TLRPC.TL_messageEmpty) || message.id != tL_messageActionStarGift.upgrade_msg_id) {
                                i++;
                            } else {
                                k47Var = new k47(wsaVar.a, message, false, false);
                                k47Var.K5();
                            }
                        }
                    }
                }
                if (k47Var == null) {
                    gm.c3(new td(heVar4, (byte) 6));
                    break;
                } else {
                    gm.c3(new hw9((Object) wsaVar, (Object) heVar4, (Object) k47Var, (byte) 20));
                    break;
                }
                break;
            case 15:
                wsa wsaVar2 = (wsa) this.b;
                k11 k11Var = (k11) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        if (!tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                            gm.c3(new hw9((Object) wsaVar2, (Object) k11Var, (Object) tL_error, (byte) 17));
                            break;
                        } else {
                            gm.c3(new hq6((Object) wsaVar2, (Object) k11Var, Long.parseLong(tL_error.text.substring(26)), (byte) 26));
                            break;
                        }
                    }
                } else {
                    oc7.r1(wsaVar2.a).T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new hw9((Object) wsaVar2, (Object) k11Var, (Object) tL_starGiftUnique, (byte) 16));
                    break;
                }
                break;
            case 16:
                gm.c3(new no8(this.b, (Object) tLObject, this.c, this.d, (byte) 25));
                break;
            case 17:
                gm.c3(new hz7(this.b, (Object) tL_error, this.c, (Object) tLObject, this.d, (byte) 27));
                break;
            case 18:
                gm.c3(new vua((jva) this.b, tL_error, (lf2) this.c, tLObject, (TLRPC.TL_inputInvoiceStars) this.d, (byte) 0));
                break;
            case 19:
                gm.c3(new hz7(this.b, (Object) tL_error, this.c, (Object) tLObject, this.d, (byte) 24));
                break;
            case 20:
                iza izaVar = (iza) this.b;
                String str2 = (String) this.c;
                wza wzaVar = (wza) this.d;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        jza jzaVar = izaVar.r;
                        nl1Var = xza.f0(jSONObject, jzaVar.i, jzaVar == izaVar.x.x);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(izaVar.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                gm.c3(new hza((Object) izaVar, (Object) nl1Var, (Object) str2, (Object) wzaVar, (byte) 0));
                break;
            case 21:
                gm.c3(new vua((x2b) this.b, (String) this.c, tL_error, tLObject, (TextView) this.d));
                break;
            case 22:
                gm.c3(new vua((v7b) this.b, (he) this.c, tLObject, (TL_phone.getGroupCallStreamRtmpUrl) this.d, tL_error));
                break;
            case 23:
                gm.c3(new vua((ycb) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error));
                break;
            case 24:
                gm.c3(new hza((Object) tLObject, this.b, this.c, this.d, (byte) 10));
                break;
            case 25:
                gm.c3(new hza(this.b, (Object) tLObject, this.d, this.c, (byte) 12));
                break;
            case 26:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    gm.c3(new x4c(twoStepVerificationActivity, tL_error, b));
                    break;
                } else {
                    Utilities.e.c(new hza((Object) twoStepVerificationActivity, (Object) bArr, (Object) tLObject, (Object) bArr2, (byte) 17));
                    break;
                }
            case 27:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$48((TL_phone.PhoneCall) this.c, (TL_phone.exportGroupCallInvite) this.d, tLObject, tL_error);
                break;
            case 28:
                VoIPService.lambda$startConferenceGroupCall$52((ArrayList) this.b, (ArrayList) this.c, (ljc) this.d, tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$startConferenceGroupCall$44((ArrayList) this.b, (ArrayList) this.c, (ljc) this.d, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ fm8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
