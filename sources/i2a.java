// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i2a implements RequestDelegate {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ k27 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    public /* synthetic */ i2a(z3a z3aVar, String str, List list, boolean z, k27 k27Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, mu1 mu1Var, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, boolean z2) {
        this.b = z3aVar;
        this.e = str;
        this.l = list;
        this.g = z;
        this.d = k27Var;
        this.c = keyboardButtonProto;
        this.f = mu1Var;
        this.h = twoStepVerificationActivity;
        this.i = tLObjectArr;
        this.j = tL_inputCheckPasswordSRP;
        this.k = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0236  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        boolean z;
        TLRPC.TL_messages_sendMedia tL_messages_sendMedia;
        boolean z2;
        byte b = this.a;
        Object obj = this.j;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.l;
        switch (b) {
            case 0:
                gl.d3(new q2a(this.b, tLObject, (TLRPC.TL_messages_addPollAnswer) obj5, (TLObject) obj4, this.d, this.e, (k3a) obj3, this.g, (k3a) obj2, this.i, (HashMap) obj, this.k));
                break;
            case 1:
                final TLObject tLObject2 = (TLObject) obj4;
                final k3a k3aVar = (k3a) obj3;
                final k3a k3aVar2 = (k3a) obj2;
                final HashMap hashMap = (HashMap) obj;
                TLRPC.Message message = (TLRPC.Message) obj5;
                final z3a z3aVar = this.b;
                final k27 k27Var = this.d;
                final String str = this.e;
                final boolean z3 = this.g;
                final Object obj6 = this.i;
                boolean z4 = this.k;
                if (tL_error != null && ((((z2 = tLObject2 instanceof TLRPC.TL_messages_sendMedia)) || (tLObject2 instanceof TL_ephemeral.TL_sendMessage) || (tLObject2 instanceof TLRPC.TL_messages_editMessage) || (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) && ab4.r(tL_error.text))) {
                    String str2 = tL_error.text;
                    if (str2 == null || !ab4.r(str2) || !str2.endsWith("COVER_EXPIRED")) {
                        z = z4;
                        if (obj6 == null) {
                            if (k3aVar2 != null) {
                                gl.d3(new z77((Object) z3aVar, (Object) message, z, (Object) tLObject2, (Object) k3aVar2, (byte) 19));
                                break;
                            }
                            if (tL_error != null && (tLObject2 instanceof TLRPC.TL_messages_sendMedia)) {
                                tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                                if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                                    if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                                        final boolean z5 = z;
                                        z3aVar.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new hc((byte) 0), new i8c() { // from class: s2a
                                            @Override // i8c
                                            public final void a(Object obj7, Object obj8) {
                                                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj7;
                                                if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                                                    String str3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
                                                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                                                    TLRPC.InputMedia inputMedia = tL_messages_sendMedia2.media;
                                                    if (inputMedia instanceof TLRPC.TL_inputMediaStakeDice) {
                                                        ((TLRPC.TL_inputMediaStakeDice) inputMedia).game_hash = str3;
                                                    }
                                                    z3a.this.N(tL_messages_sendMedia2, k27Var, str, k3aVar, z3, k3aVar2, obj6, hashMap, z5);
                                                }
                                            }
                                        });
                                        break;
                                    } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                                        d S = LaunchActivity.S();
                                        if (S != null) {
                                            gl.d3(new q2a(z3aVar, S, tL_inputMediaStakeDice, tLObject2, k27Var, str, k3aVar, z3, k3aVar2, obj6, hashMap, z));
                                            break;
                                        } else {
                                            tLObject2 = tLObject2;
                                        }
                                    }
                                }
                            }
                            if (!(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) {
                                if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage)) {
                                    gl.d3(new t2a(z3aVar, z, tL_error, message, tLObject, k27Var, hashMap, str, tLObject2));
                                    break;
                                } else {
                                    gl.d3(new t2a(z3aVar, tL_error, message, tLObject, k27Var, str, hashMap, z, tLObject2));
                                    break;
                                }
                            } else {
                                gl.d3(new o2a(z3aVar, tL_error, message, tLObject, k27Var, str, hashMap, z, tLObject2));
                                break;
                            }
                        } else {
                            z3aVar.getFileRefController().u(new Object[]{tLObject2, k27Var, str, k3aVar, Boolean.valueOf(z3), k3aVar2, Boolean.valueOf(z)}, obj6);
                            break;
                        }
                    } else {
                        if (z2) {
                            TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                            if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = (TLRPC.TL_inputMediaUploadedDocument) inputMedia;
                                tL_inputMediaUploadedDocument.video_cover = null;
                                tL_inputMediaUploadedDocument.flags &= -65;
                            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = (TLRPC.TL_inputMediaDocument) inputMedia;
                                tL_inputMediaDocument.video_cover = null;
                                tL_inputMediaDocument.flags &= -9;
                            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal = (TLRPC.TL_inputMediaDocumentExternal) inputMedia;
                                tL_inputMediaDocumentExternal.video_cover = null;
                                tL_inputMediaDocumentExternal.flags &= -5;
                            }
                            z3aVar.N(tLObject2, k27Var, str, k3aVar, z3, k3aVar2, obj6, hashMap, z4);
                            break;
                        } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                            TLRPC.InputMedia inputMedia2 = ((TL_ephemeral.TL_sendMessage) tLObject2).media;
                            if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia2;
                                tL_inputMediaUploadedDocument2.video_cover = null;
                                tL_inputMediaUploadedDocument2.flags &= -65;
                            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                                TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = (TLRPC.TL_inputMediaDocument) inputMedia2;
                                tL_inputMediaDocument2.video_cover = null;
                                tL_inputMediaDocument2.flags &= -9;
                            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal2 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia2;
                                tL_inputMediaDocumentExternal2.video_cover = null;
                                tL_inputMediaDocumentExternal2.flags &= -5;
                            }
                            z3aVar.N(tLObject2, k27Var, str, k3aVar, z3, k3aVar2, obj6, hashMap, z4);
                        } else if (tLObject2 instanceof TLRPC.TL_messages_editMessage) {
                            TLRPC.InputMedia inputMedia3 = ((TLRPC.TL_messages_editMessage) tLObject2).media;
                            if (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument3 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia3;
                                tL_inputMediaUploadedDocument3.video_cover = null;
                                tL_inputMediaUploadedDocument3.flags &= -65;
                            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                                TLRPC.TL_inputMediaDocument tL_inputMediaDocument3 = (TLRPC.TL_inputMediaDocument) inputMedia3;
                                tL_inputMediaDocument3.video_cover = null;
                                tL_inputMediaDocument3.flags &= -9;
                            } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal3 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia3;
                                tL_inputMediaDocumentExternal3.video_cover = null;
                                tL_inputMediaDocumentExternal3.flags &= -5;
                            }
                            z3aVar.N(tLObject2, k27Var, str, k3aVar, z3, k3aVar2, obj6, hashMap, z4);
                        } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                            TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media;
                            if (inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument4 = (TLRPC.TL_inputMediaUploadedDocument) inputMedia4;
                                tL_inputMediaUploadedDocument4.video_cover = null;
                                tL_inputMediaUploadedDocument4.flags &= -65;
                            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                                TLRPC.TL_inputMediaDocument tL_inputMediaDocument4 = (TLRPC.TL_inputMediaDocument) inputMedia4;
                                tL_inputMediaDocument4.video_cover = null;
                                tL_inputMediaDocument4.flags &= -9;
                            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocumentExternal) {
                                TLRPC.TL_inputMediaDocumentExternal tL_inputMediaDocumentExternal4 = (TLRPC.TL_inputMediaDocumentExternal) inputMedia4;
                                tL_inputMediaDocumentExternal4.video_cover = null;
                                tL_inputMediaDocumentExternal4.flags &= -5;
                            }
                            z3aVar.N(tLObject2, k27Var, str, k3aVar, z3, k3aVar2, obj6, hashMap, z4);
                        }
                        if (tL_error != null) {
                            tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                            if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                            }
                        }
                        if (!(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) {
                        }
                    }
                }
                z = z4;
                if (tL_error != null) {
                }
                if (!(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) {
                }
                break;
            default:
                final List list = (List) obj5;
                final TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) obj4;
                final mu1 mu1Var = (mu1) obj3;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                final TLObject[] tLObjectArr = (TLObject[]) this.i;
                final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj;
                final z3a z3aVar2 = this.b;
                final String str3 = this.e;
                final boolean z6 = this.g;
                final k27 k27Var2 = this.d;
                final boolean z7 = this.k;
                gl.d3(new Runnable() { // from class: j3a
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str4;
                        ez1 ez1Var;
                        final z3a z3aVar3 = z3a.this;
                        String str5 = str3;
                        List list2 = list;
                        boolean z8 = z6;
                        TLObject tLObject3 = tLObject;
                        final k27 k27Var3 = k27Var2;
                        final TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                        final mu1 mu1Var2 = mu1Var;
                        final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        TLObject[] tLObjectArr2 = tLObjectArr;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP2 = tL_inputCheckPasswordSRP;
                        final boolean z9 = z7;
                        z3aVar3.r.remove(str5);
                        list2.remove(str5);
                        if (z8 && tLObject3 == null) {
                            z3aVar3.m0(false, k27Var3, keyboardButtonProto2, null, null, mu1Var2);
                            return;
                        }
                        if (tLObject3 == null) {
                            if (tL_error2 == null || mu1Var2.getParentActivity() == null) {
                                return;
                            }
                            if ("PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                if (tL_inputCheckPasswordSRP2 == null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mu1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = k96.M0(2131753007, null);
                                    alertDialog$Builder.a.U = gl.T2(k96.a0("BotOwnershipTransferReadyAlertText", null, 2131753004, new Object[0]));
                                    alertDialog$Builder.j(k96.M0(2131753005, null), new pf(z3aVar3, z9, k27Var3, keyboardButtonProto2, mu1Var2));
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    mu1Var2.showDialog(alertDialog$Builder.a);
                                    return;
                                }
                                return;
                            }
                            if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                                if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(z3aVar3.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: y1a
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error3) {
                                            gl.d3(new oo6(z3aVar3, tL_error3, tLObject4, twoStepVerificationActivity2, z9, k27Var3, keyboardButtonProto2, mu1Var2));
                                        }
                                    }, 8);
                                    return;
                                } else {
                                    if (twoStepVerificationActivity2 != null) {
                                        twoStepVerificationActivity2.s0();
                                        twoStepVerificationActivity2.finishFragment();
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (twoStepVerificationActivity2 != null) {
                                twoStepVerificationActivity2.s0();
                            }
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mu1Var2.getParentActivity());
                            alertDialog$Builder2.a.S = k96.M0(2131751285, null);
                            LinearLayout linearLayout = new LinearLayout(mu1Var2.getParentActivity());
                            linearLayout.setPadding(gl.L(24.0f), gl.L(2.0f), gl.L(24.0f), 0);
                            linearLayout.setOrientation(1);
                            alertDialog$Builder2.n(linearLayout);
                            TextView textView = new TextView(mu1Var2.getParentActivity());
                            int i = bkb.i5;
                            zkb.X(textView, i, null);
                            textView.setTextSize(1, 16.0f);
                            textView.setGravity((k96.a0 ? 5 : 3) | 48);
                            de9.r("BotOwnershipTransferAlertText", null, 2131753006, new Object[0], textView);
                            linearLayout.addView(textView, nme.o(-1, -2));
                            LinearLayout linearLayout2 = new LinearLayout(mu1Var2.getParentActivity());
                            linearLayout2.setOrientation(0);
                            linearLayout.addView(linearLayout2, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView = new ImageView(mu1Var2.getParentActivity());
                            imageView.setImageResource(R.drawable.list_circle);
                            imageView.setPadding(k96.a0 ? gl.L(11.0f) : 0, gl.L(9.0f), k96.a0 ? 0 : gl.L(11.0f), 0);
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            zkb.s(imageView, i, null, mode);
                            TextView textView2 = new TextView(mu1Var2.getParentActivity());
                            zkb.X(textView2, i, null);
                            textView2.setTextSize(1, 16.0f);
                            textView2.setGravity((k96.a0 ? 5 : 3) | 48);
                            textView2.setText(gl.T2(k96.M0(2131751288, null)));
                            if (k96.a0) {
                                linearLayout2.addView(textView2, nme.o(-1, -2));
                                linearLayout2.addView(imageView, nme.r(-2, -2, 5));
                            } else {
                                linearLayout2.addView(imageView, nme.o(-2, -2));
                                linearLayout2.addView(textView2, nme.o(-1, -2));
                            }
                            LinearLayout linearLayout3 = new LinearLayout(mu1Var2.getParentActivity());
                            linearLayout3.setOrientation(0);
                            linearLayout.addView(linearLayout3, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView2 = new ImageView(mu1Var2.getParentActivity());
                            imageView2.setImageResource(R.drawable.list_circle);
                            imageView2.setPadding(k96.a0 ? gl.L(11.0f) : 0, gl.L(9.0f), k96.a0 ? 0 : gl.L(11.0f), 0);
                            zkb.s(imageView2, i, null, mode);
                            TextView textView3 = new TextView(mu1Var2.getParentActivity());
                            zkb.X(textView3, i, null);
                            textView3.setTextSize(1, 16.0f);
                            textView3.setGravity((k96.a0 ? 5 : 3) | 48);
                            textView3.setText(gl.T2(k96.M0(2131751287, null)));
                            if (k96.a0) {
                                linearLayout3.addView(textView3, nme.o(-1, -2));
                                linearLayout3.addView(imageView2, nme.r(-2, -2, 5));
                            } else {
                                linearLayout3.addView(imageView2, nme.o(-2, -2));
                                linearLayout3.addView(textView3, nme.o(-1, -2));
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                alertDialog$Builder2.j(k96.M0(2131751279, null), new eo1(mu1Var2, (byte) 5));
                                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                            } else {
                                TextView textView4 = new TextView(mu1Var2.getParentActivity());
                                zkb.X(textView4, i, null);
                                textView4.setTextSize(1, 16.0f);
                                de9.q(textView4, (k96.a0 ? 5 : 3) | 48, null, 2131751286);
                                linearLayout.addView(textView4, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                alertDialog$Builder2.g(k96.M0(2131747638, null), null);
                            }
                            mu1Var2.showDialog(alertDialog$Builder2.a);
                            return;
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.s0();
                            twoStepVerificationActivity2.finishFragment();
                        }
                        long Z0 = k27Var3.Z0();
                        long j = k27Var3.k.via_bot_id;
                        if (j != 0) {
                            Z0 = j;
                        }
                        if (Z0 > 0) {
                            TLRPC.User V1 = z3aVar3.getMessagesController().V1(Long.valueOf(Z0));
                            if (V1 != null) {
                                str4 = qu2.m(0, V1.first_name, V1.last_name);
                            }
                            str4 = null;
                        } else {
                            TLRPC.Chat K0 = z3aVar3.getMessagesController().K0(Long.valueOf(-Z0));
                            if (K0 != null) {
                                str4 = K0.title;
                            }
                            str4 = null;
                        }
                        if (str4 == null) {
                            str4 = "bot";
                        }
                        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) jdb.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                        if (tL_inlineButtonTypeUrlAuth != null) {
                            if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                                un7.b(false, z3aVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultRequest) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                                un7.b(false, z3aVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultAccepted) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else {
                                if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                                    ij.n0(mu1Var2, tL_inlineButtonTypeUrlAuth.url, false, true);
                                    return;
                                }
                                return;
                            }
                        }
                        if (jdb.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                            if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                                gta.v(z3aVar3.currentAccount, false).W(k27Var3, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr2[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, new x1a(z3aVar3, str5, list2, (byte) 0), new bm0((byte) 27));
                                return;
                            }
                            if (tLObject3 instanceof TLRPC.PaymentForm) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                                z3aVar3.getMessagesController().a4(paymentForm.users, false);
                                mu1Var2.presentFragment(new p(paymentForm, k27Var3, null, mu1Var2));
                                return;
                            } else if (!(tLObject3 instanceof TLRPC.TL_payments_paymentReceiptStars)) {
                                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                                    mu1Var2.presentFragment(new p((TLRPC.PaymentReceipt) tLObject3));
                                    return;
                                }
                                return;
                            } else {
                                Context context = LaunchActivity.H1;
                                if (context == null) {
                                    context = a.b;
                                }
                                jva.m1(context, z3aVar3.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject3, null);
                                return;
                            }
                        }
                        TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject3;
                        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) jdb.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                        if (!z8 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                            z3aVar3.getMessagesStorage().s1(str5, tL_messages_botCallbackAnswer);
                        }
                        String str6 = tL_messages_botCallbackAnswer.message;
                        if (str6 == null) {
                            if (tL_messages_botCallbackAnswer.url == null || mu1Var2.getParentActivity() == null) {
                                return;
                            }
                            TLRPC.User V12 = z3aVar3.getMessagesController().V1(Long.valueOf(Z0));
                            boolean z10 = V12 != null && V12.verified;
                            if (!jdb.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                ij.n0(mu1Var2, tL_messages_botCallbackAnswer.url, false, false);
                                return;
                            }
                            TLRPC.MessageMedia messageMedia = k27Var3.k.media;
                            TLRPC.TL_game tL_game = messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game : null;
                            if (tL_game != null) {
                                mu1Var2.ac(tL_game, k27Var3, tL_messages_botCallbackAnswer.url, !z10 && ls6.v("askgame_", Z0, na7.q1(z3aVar3.currentAccount).W3, true), Z0);
                                return;
                            }
                            return;
                        }
                        if (tL_messages_botCallbackAnswer.alert) {
                            if (mu1Var2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(mu1Var2.getParentActivity());
                                alertDialog$Builder3.a.S = str4;
                                alertDialog$Builder3.j(k96.M0(2131747638, null), null);
                                String str7 = tL_messages_botCallbackAnswer.message;
                                hd hdVar = alertDialog$Builder3.a;
                                hdVar.U = str7;
                                mu1Var2.showDialog(hdVar);
                                return;
                            }
                            return;
                        }
                        if (mu1Var2.c3 == null && mu1Var2.b1 != null && mu1Var2.getParentActivity() != null) {
                            FrameLayout frameLayout = new FrameLayout(mu1Var2.getParentActivity());
                            mu1Var2.c3 = frameLayout;
                            mu1Var2.b1.addView(frameLayout, nme.o(-1, 48));
                            mu1Var2.b1.i(11, mu1Var2.c3);
                            mu1Var2.b1.h(mu1Var2.c3);
                            TextView textView5 = new TextView(mu1Var2.getParentActivity());
                            mu1Var2.e3 = textView5;
                            textView5.setTextSize(1, 14.0f);
                            zkb.X(mu1Var2.e3, bkb.Ve, mu1Var2.getResourceProvider());
                            mu1Var2.e3.setTypeface(gl.o());
                            mu1Var2.e3.setSingleLine(true);
                            TextView textView6 = mu1Var2.e3;
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView6.setEllipsize(truncateAt);
                            mu1Var2.e3.setMaxLines(1);
                            mu1Var2.c3.addView(mu1Var2.e3, nme.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                            TextView textView7 = new TextView(mu1Var2.getParentActivity());
                            mu1Var2.f3 = textView7;
                            textView7.setTextSize(1, 14.0f);
                            zkb.X(mu1Var2.f3, bkb.We, mu1Var2.getResourceProvider());
                            mu1Var2.f3.setSingleLine(true);
                            mu1Var2.f3.setEllipsize(truncateAt);
                            mu1Var2.f3.setMaxLines(1);
                            mu1Var2.c3.addView(mu1Var2.f3, nme.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                        }
                        FrameLayout frameLayout2 = mu1Var2.c3;
                        if (frameLayout2 == null || (ez1Var = mu1Var2.b1) == null) {
                            return;
                        }
                        ez1Var.j(frameLayout2, true, true);
                        mu1Var2.e3.setText(str4);
                        mu1Var2.f3.setText(vu3.m(str6.replace('\n', ' '), mu1Var2.f3.getPaint().getFontMetricsInt(), false, null, 0));
                        ir1 ir1Var = mu1Var2.d3;
                        if (ir1Var != null) {
                            gl.r(ir1Var);
                        }
                        ir1 ir1Var2 = new ir1(mu1Var2, (byte) 1);
                        mu1Var2.d3 = ir1Var2;
                        gl.e3(ir1Var2, 3000L);
                    }
                });
                break;
        }
    }

    public /* synthetic */ i2a(z3a z3aVar, TLObject tLObject, k27 k27Var, String str, k3a k3aVar, boolean z, k3a k3aVar2, Object obj, HashMap hashMap, boolean z2, TLRPC.Message message) {
        this.b = z3aVar;
        this.c = tLObject;
        this.d = k27Var;
        this.e = str;
        this.f = k3aVar;
        this.g = z;
        this.h = k3aVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z2;
        this.l = message;
    }

    public /* synthetic */ i2a(z3a z3aVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, k27 k27Var, String str, k3a k3aVar, boolean z, k3a k3aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = z3aVar;
        this.l = tL_messages_addPollAnswer;
        this.c = tLObject;
        this.d = k27Var;
        this.e = str;
        this.f = k3aVar;
        this.g = z;
        this.h = k3aVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z2;
    }
}
