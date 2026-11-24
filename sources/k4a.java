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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class k4a implements RequestDelegate {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ k47 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    public /* synthetic */ k4a(a6a a6aVar, String str, List list, boolean z, k47 k47Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yv1 yv1Var, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, boolean z2) {
        this.b = a6aVar;
        this.e = str;
        this.l = list;
        this.g = z;
        this.d = k47Var;
        this.c = keyboardButtonProto;
        this.f = yv1Var;
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
                gm.c3(new s4a(this.b, tLObject, (TLRPC.TL_messages_addPollAnswer) obj5, (TLObject) obj4, this.d, this.e, (m5a) obj3, this.g, (m5a) obj2, this.i, (HashMap) obj, this.k));
                break;
            case 1:
                final TLObject tLObject2 = (TLObject) obj4;
                final m5a m5aVar = (m5a) obj3;
                final m5a m5aVar2 = (m5a) obj2;
                final HashMap hashMap = (HashMap) obj;
                TLRPC.Message message = (TLRPC.Message) obj5;
                final a6a a6aVar = this.b;
                final k47 k47Var = this.d;
                final String str = this.e;
                final boolean z3 = this.g;
                final Object obj6 = this.i;
                boolean z4 = this.k;
                if (tL_error != null && ((((z2 = tLObject2 instanceof TLRPC.TL_messages_sendMedia)) || (tLObject2 instanceof TL_ephemeral.TL_sendMessage) || (tLObject2 instanceof TLRPC.TL_messages_editMessage) || (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) && ad4.r(tL_error.text))) {
                    String str2 = tL_error.text;
                    if (str2 == null || !ad4.r(str2) || !str2.endsWith("COVER_EXPIRED")) {
                        z = z4;
                        if (obj6 == null) {
                            if (m5aVar2 != null) {
                                gm.c3(new aa7((Object) a6aVar, (Object) message, z, (Object) tLObject2, (Object) m5aVar2, (byte) 19));
                                break;
                            }
                            if (tL_error != null && (tLObject2 instanceof TLRPC.TL_messages_sendMedia)) {
                                tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                                if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                                    if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                                        final boolean z5 = z;
                                        a6aVar.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new kc((byte) 0), new jac() { // from class: u4a
                                            @Override // jac
                                            public final void a(Object obj7, Object obj8) {
                                                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj7;
                                                if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                                                    String str3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
                                                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                                                    TLRPC.InputMedia inputMedia = tL_messages_sendMedia2.media;
                                                    if (inputMedia instanceof TLRPC.TL_inputMediaStakeDice) {
                                                        ((TLRPC.TL_inputMediaStakeDice) inputMedia).game_hash = str3;
                                                    }
                                                    a6a.this.N(tL_messages_sendMedia2, k47Var, str, m5aVar, z3, m5aVar2, obj6, hashMap, z5);
                                                }
                                            }
                                        });
                                        break;
                                    } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                                        TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                                        d S = LaunchActivity.S();
                                        if (S != null) {
                                            gm.c3(new s4a(a6aVar, S, tL_inputMediaStakeDice, tLObject2, k47Var, str, m5aVar, z3, m5aVar2, obj6, hashMap, z));
                                            break;
                                        } else {
                                            tLObject2 = tLObject2;
                                        }
                                    }
                                }
                            }
                            if (!(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) {
                                if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage)) {
                                    gm.c3(new v4a(a6aVar, z, tL_error, message, tLObject, k47Var, hashMap, str, tLObject2));
                                    break;
                                } else {
                                    gm.c3(new v4a(a6aVar, tL_error, message, tLObject, k47Var, str, hashMap, z, tLObject2));
                                    break;
                                }
                            } else {
                                gm.c3(new q4a(a6aVar, tL_error, message, tLObject, k47Var, str, hashMap, z, tLObject2));
                                break;
                            }
                        } else {
                            a6aVar.getFileRefController().u(new Object[]{tLObject2, k47Var, str, m5aVar, Boolean.valueOf(z3), m5aVar2, Boolean.valueOf(z)}, obj6);
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
                            a6aVar.N(tLObject2, k47Var, str, m5aVar, z3, m5aVar2, obj6, hashMap, z4);
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
                            a6aVar.N(tLObject2, k47Var, str, m5aVar, z3, m5aVar2, obj6, hashMap, z4);
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
                            a6aVar.N(tLObject2, k47Var, str, m5aVar, z3, m5aVar2, obj6, hashMap, z4);
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
                            a6aVar.N(tLObject2, k47Var, str, m5aVar, z3, m5aVar2, obj6, hashMap, z4);
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
                final yv1 yv1Var = (yv1) obj3;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                final TLObject[] tLObjectArr = (TLObject[]) this.i;
                final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP = (TLRPC.TL_inputCheckPasswordSRP) obj;
                final a6a a6aVar2 = this.b;
                final String str3 = this.e;
                final boolean z6 = this.g;
                final k47 k47Var2 = this.d;
                final boolean z7 = this.k;
                gm.c3(new Runnable() { // from class: l5a
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str4;
                        r02 r02Var;
                        final a6a a6aVar3 = a6a.this;
                        String str5 = str3;
                        List list2 = list;
                        boolean z8 = z6;
                        TLObject tLObject3 = tLObject;
                        final k47 k47Var3 = k47Var2;
                        final TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                        final yv1 yv1Var2 = yv1Var;
                        final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        TLObject[] tLObjectArr2 = tLObjectArr;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP2 = tL_inputCheckPasswordSRP;
                        final boolean z9 = z7;
                        a6aVar3.r.remove(str5);
                        list2.remove(str5);
                        if (z8 && tLObject3 == null) {
                            a6aVar3.m0(false, k47Var3, keyboardButtonProto2, null, null, yv1Var2);
                            return;
                        }
                        if (tLObject3 == null) {
                            if (tL_error2 == null || yv1Var2.getParentActivity() == null) {
                                return;
                            }
                            if ("PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                if (tL_inputCheckPasswordSRP2 == null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yv1Var2.getParentActivity());
                                    alertDialog$Builder.a.S = jb6.M0(2131752975, null);
                                    alertDialog$Builder.a.U = gm.S2(jb6.a0("BotOwnershipTransferReadyAlertText", null, 2131752972, new Object[0]));
                                    alertDialog$Builder.j(jb6.M0(2131752973, null), new og(a6aVar3, z9, k47Var3, keyboardButtonProto2, yv1Var2));
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    yv1Var2.showDialog(alertDialog$Builder.a);
                                    return;
                                }
                                return;
                            }
                            if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                                if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(a6aVar3.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: a4a
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error3) {
                                            gm.c3(new oq6(a6aVar3, tL_error3, tLObject4, twoStepVerificationActivity2, z9, k47Var3, keyboardButtonProto2, yv1Var2));
                                        }
                                    }, 8);
                                    return;
                                } else {
                                    if (twoStepVerificationActivity2 != null) {
                                        twoStepVerificationActivity2.t0();
                                        twoStepVerificationActivity2.finishFragment();
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (twoStepVerificationActivity2 != null) {
                                twoStepVerificationActivity2.t0();
                            }
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yv1Var2.getParentActivity());
                            alertDialog$Builder2.a.S = jb6.M0(2131751234, null);
                            LinearLayout linearLayout = new LinearLayout(yv1Var2.getParentActivity());
                            linearLayout.setPadding(gm.L(24.0f), gm.L(2.0f), gm.L(24.0f), 0);
                            linearLayout.setOrientation(1);
                            alertDialog$Builder2.n(linearLayout);
                            TextView textView = new TextView(yv1Var2.getParentActivity());
                            int i = cmb.i5;
                            anb.X(textView, i, null);
                            textView.setTextSize(1, 16.0f);
                            textView.setGravity((jb6.a0 ? 5 : 3) | 48);
                            hg9.q("BotOwnershipTransferAlertText", null, 2131752974, new Object[0], textView);
                            linearLayout.addView(textView, qoe.o(-1, -2));
                            LinearLayout linearLayout2 = new LinearLayout(yv1Var2.getParentActivity());
                            linearLayout2.setOrientation(0);
                            linearLayout.addView(linearLayout2, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView = new ImageView(yv1Var2.getParentActivity());
                            imageView.setImageResource(R.drawable.list_circle);
                            imageView.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            anb.s(imageView, i, null, mode);
                            TextView textView2 = new TextView(yv1Var2.getParentActivity());
                            anb.X(textView2, i, null);
                            textView2.setTextSize(1, 16.0f);
                            textView2.setGravity((jb6.a0 ? 5 : 3) | 48);
                            textView2.setText(gm.S2(jb6.M0(2131751237, null)));
                            if (jb6.a0) {
                                linearLayout2.addView(textView2, qoe.o(-1, -2));
                                linearLayout2.addView(imageView, qoe.r(-2, -2, 5));
                            } else {
                                linearLayout2.addView(imageView, qoe.o(-2, -2));
                                linearLayout2.addView(textView2, qoe.o(-1, -2));
                            }
                            LinearLayout linearLayout3 = new LinearLayout(yv1Var2.getParentActivity());
                            linearLayout3.setOrientation(0);
                            linearLayout.addView(linearLayout3, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView2 = new ImageView(yv1Var2.getParentActivity());
                            imageView2.setImageResource(R.drawable.list_circle);
                            imageView2.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
                            anb.s(imageView2, i, null, mode);
                            TextView textView3 = new TextView(yv1Var2.getParentActivity());
                            anb.X(textView3, i, null);
                            textView3.setTextSize(1, 16.0f);
                            textView3.setGravity((jb6.a0 ? 5 : 3) | 48);
                            textView3.setText(gm.S2(jb6.M0(2131751236, null)));
                            if (jb6.a0) {
                                linearLayout3.addView(textView3, qoe.o(-1, -2));
                                linearLayout3.addView(imageView2, qoe.r(-2, -2, 5));
                            } else {
                                linearLayout3.addView(imageView2, qoe.o(-2, -2));
                                linearLayout3.addView(textView3, qoe.o(-1, -2));
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                alertDialog$Builder2.j(jb6.M0(2131751228, null), new rp1(yv1Var2, (byte) 5));
                                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                            } else {
                                TextView textView4 = new TextView(yv1Var2.getParentActivity());
                                anb.X(textView4, i, null);
                                textView4.setTextSize(1, 16.0f);
                                hg9.p(textView4, (jb6.a0 ? 5 : 3) | 48, null, 2131751235);
                                linearLayout.addView(textView4, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                alertDialog$Builder2.g(jb6.M0(2131747564, null), null);
                            }
                            yv1Var2.showDialog(alertDialog$Builder2.a);
                            return;
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                            twoStepVerificationActivity2.finishFragment();
                        }
                        long Z0 = k47Var3.Z0();
                        long j = k47Var3.k.via_bot_id;
                        if (j != 0) {
                            Z0 = j;
                        }
                        if (Z0 > 0) {
                            TLRPC.User W1 = a6aVar3.getMessagesController().W1(Long.valueOf(Z0));
                            if (W1 != null) {
                                str4 = bw2.m(0, W1.first_name, W1.last_name);
                            }
                            str4 = null;
                        } else {
                            TLRPC.Chat L0 = a6aVar3.getMessagesController().L0(Long.valueOf(-Z0));
                            if (L0 != null) {
                                str4 = L0.title;
                            }
                            str4 = null;
                        }
                        if (str4 == null) {
                            str4 = "bot";
                        }
                        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) kfb.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                        if (tL_inlineButtonTypeUrlAuth != null) {
                            if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                                xp7.b(false, a6aVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultRequest) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                                xp7.b(false, a6aVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultAccepted) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else {
                                if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                                    ik.n0(yv1Var2, tL_inlineButtonTypeUrlAuth.url, false, true);
                                    return;
                                }
                                return;
                            }
                        }
                        if (kfb.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                            if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                                jva.v(a6aVar3.currentAccount, false).W(k47Var3, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr2[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, new z3a(a6aVar3, str5, list2, (byte) 0), new bn0((byte) 27));
                                return;
                            }
                            if (tLObject3 instanceof TLRPC.PaymentForm) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                                a6aVar3.getMessagesController().d4(paymentForm.users, false);
                                yv1Var2.presentFragment(new p(paymentForm, k47Var3, null, yv1Var2));
                                return;
                            } else if (!(tLObject3 instanceof TLRPC.TL_payments_paymentReceiptStars)) {
                                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                                    yv1Var2.presentFragment(new p((TLRPC.PaymentReceipt) tLObject3));
                                    return;
                                }
                                return;
                            } else {
                                Context context = LaunchActivity.H1;
                                if (context == null) {
                                    context = a.b;
                                }
                                nxa.n1(context, a6aVar3.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject3, null);
                                return;
                            }
                        }
                        TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject3;
                        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) kfb.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                        if (!z8 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                            a6aVar3.getMessagesStorage().s1(str5, tL_messages_botCallbackAnswer);
                        }
                        String str6 = tL_messages_botCallbackAnswer.message;
                        if (str6 == null) {
                            if (tL_messages_botCallbackAnswer.url == null || yv1Var2.getParentActivity() == null) {
                                return;
                            }
                            TLRPC.User W12 = a6aVar3.getMessagesController().W1(Long.valueOf(Z0));
                            boolean z10 = W12 != null && W12.verified;
                            if (!kfb.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                ik.n0(yv1Var2, tL_messages_botCallbackAnswer.url, false, false);
                                return;
                            }
                            TLRPC.MessageMedia messageMedia = k47Var3.k.media;
                            TLRPC.TL_game tL_game = messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game : null;
                            if (tL_game != null) {
                                yv1Var2.oc(tL_game, k47Var3, tL_messages_botCallbackAnswer.url, !z10 && kt6.w("askgame_", Z0, oc7.r1(a6aVar3.currentAccount).W3, true), Z0);
                                return;
                            }
                            return;
                        }
                        if (tL_messages_botCallbackAnswer.alert) {
                            if (yv1Var2.getParentActivity() != null) {
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(yv1Var2.getParentActivity());
                                alertDialog$Builder3.a.S = str4;
                                alertDialog$Builder3.j(jb6.M0(2131747564, null), null);
                                String str7 = tL_messages_botCallbackAnswer.message;
                                he heVar = alertDialog$Builder3.a;
                                heVar.U = str7;
                                yv1Var2.showDialog(heVar);
                                return;
                            }
                            return;
                        }
                        if (yv1Var2.c3 == null && yv1Var2.b1 != null && yv1Var2.getParentActivity() != null) {
                            FrameLayout frameLayout = new FrameLayout(yv1Var2.getParentActivity());
                            yv1Var2.c3 = frameLayout;
                            yv1Var2.b1.addView(frameLayout, qoe.o(-1, 48));
                            yv1Var2.b1.i(11, yv1Var2.c3);
                            yv1Var2.b1.h(yv1Var2.c3);
                            TextView textView5 = new TextView(yv1Var2.getParentActivity());
                            yv1Var2.e3 = textView5;
                            textView5.setTextSize(1, 14.0f);
                            anb.X(yv1Var2.e3, cmb.Ve, yv1Var2.getResourceProvider());
                            yv1Var2.e3.setTypeface(gm.o());
                            yv1Var2.e3.setSingleLine(true);
                            TextView textView6 = yv1Var2.e3;
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView6.setEllipsize(truncateAt);
                            yv1Var2.e3.setMaxLines(1);
                            yv1Var2.c3.addView(yv1Var2.e3, qoe.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                            TextView textView7 = new TextView(yv1Var2.getParentActivity());
                            yv1Var2.f3 = textView7;
                            textView7.setTextSize(1, 14.0f);
                            anb.X(yv1Var2.f3, cmb.We, yv1Var2.getResourceProvider());
                            yv1Var2.f3.setSingleLine(true);
                            yv1Var2.f3.setEllipsize(truncateAt);
                            yv1Var2.f3.setMaxLines(1);
                            yv1Var2.c3.addView(yv1Var2.f3, qoe.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                        }
                        FrameLayout frameLayout2 = yv1Var2.c3;
                        if (frameLayout2 == null || (r02Var = yv1Var2.b1) == null) {
                            return;
                        }
                        r02Var.j(frameLayout2, true, true);
                        yv1Var2.e3.setText(str4);
                        yv1Var2.f3.setText(gw3.m(str6.replace('\n', ' '), yv1Var2.f3.getPaint().getFontMetricsInt(), false, null, 0));
                        us1 us1Var = yv1Var2.d3;
                        if (us1Var != null) {
                            gm.r(us1Var);
                        }
                        us1 us1Var2 = new us1(yv1Var2, (byte) 1);
                        yv1Var2.d3 = us1Var2;
                        gm.d3(us1Var2, 3000L);
                    }
                });
                break;
        }
    }

    public /* synthetic */ k4a(a6a a6aVar, TLObject tLObject, k47 k47Var, String str, m5a m5aVar, boolean z, m5a m5aVar2, Object obj, HashMap hashMap, boolean z2, TLRPC.Message message) {
        this.b = a6aVar;
        this.c = tLObject;
        this.d = k47Var;
        this.e = str;
        this.f = m5aVar;
        this.g = z;
        this.h = m5aVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z2;
        this.l = message;
    }

    public /* synthetic */ k4a(a6a a6aVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, k47 k47Var, String str, m5a m5aVar, boolean z, m5a m5aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = a6aVar;
        this.l = tL_messages_addPollAnswer;
        this.c = tLObject;
        this.d = k47Var;
        this.e = str;
        this.f = m5aVar;
        this.g = z;
        this.h = m5aVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z2;
    }
}
