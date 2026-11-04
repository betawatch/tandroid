package org.telegram.messenger;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ca1;
import org.telegram.ui.dl0;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hx implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ yy b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ zi d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    public /* synthetic */ hx(yy yyVar, String str, List list, boolean z10, zi ziVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.wm wmVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.b = yyVar;
        this.e = str;
        this.l = list;
        this.g = z10;
        this.d = ziVar;
        this.c = keyboardButtonProto;
        this.f = wmVar;
        this.h = twoStepVerificationActivity;
        this.i = tLObjectArr;
        this.j = inputCheckPasswordSRP;
        this.k = z11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i3;
        boolean z10;
        int i10 = this.a;
        Object obj = this.j;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.l;
        switch (i10) {
            case 0:
                g0.h3(new px(this.b, tLObject, (TLRPC.TL_messages_addPollAnswer) obj5, (TLObject) obj4, this.d, this.e, (ky) obj3, this.g, (ky) obj2, this.i, (HashMap) obj, this.k));
                break;
            case 1:
                final TLObject tLObject2 = (TLObject) obj4;
                final ky kyVar = (ky) obj3;
                final ky kyVar2 = (ky) obj2;
                final HashMap hashMap = (HashMap) obj;
                TLRPC.Message message = (TLRPC.Message) obj5;
                final yy yyVar = this.b;
                final zi ziVar = this.d;
                final String str = this.e;
                final boolean z11 = this.g;
                final Object obj6 = this.i;
                final boolean z12 = this.k;
                if (tL_error != null && ((((z10 = tLObject2 instanceof TLRPC.TL_messages_sendMedia)) || (tLObject2 instanceof TL_ephemeral.TL_sendMessage) || (tLObject2 instanceof TLRPC.TL_messages_editMessage) || (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) && r8.r(tL_error.text))) {
                    String str2 = tL_error.text;
                    if (str2 == null || !r8.r(str2)) {
                        i3 = 1;
                    } else {
                        i3 = 1;
                        if (str2.endsWith("COVER_EXPIRED")) {
                            if (z10) {
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
                                yyVar.O(tLObject2, ziVar, str, kyVar, z11, kyVar2, obj6, hashMap, z12);
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
                                yyVar.O(tLObject2, ziVar, str, kyVar, z11, kyVar2, obj6, hashMap, z12);
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
                                yyVar.O(tLObject2, ziVar, str, kyVar, z11, kyVar2, obj6, hashMap, z12);
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
                                yyVar.O(tLObject2, ziVar, str, kyVar, z11, kyVar2, obj6, hashMap, z12);
                            }
                        }
                    }
                    if (obj6 == null) {
                        if (kyVar2 != null) {
                            g0.h3(new bn(yyVar, message, z12, tLObject2, kyVar2, 4));
                            break;
                        }
                    } else {
                        r8 fileRefController = yyVar.getFileRefController();
                        Boolean valueOf = Boolean.valueOf(z11);
                        Boolean valueOf2 = Boolean.valueOf(z12);
                        Object[] objArr = new Object[7];
                        objArr[0] = tLObject2;
                        objArr[i3] = ziVar;
                        objArr[2] = str;
                        objArr[3] = kyVar;
                        objArr[4] = valueOf;
                        objArr[5] = kyVar2;
                        objArr[6] = valueOf2;
                        fileRefController.u(objArr, obj6);
                        break;
                    }
                } else {
                    i3 = 1;
                }
                if (tL_error != null && (tLObject2 instanceof TLRPC.TL_messages_sendMedia)) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                    if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                        if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                            yyVar.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new c3.b(i3), new n10() { // from class: org.telegram.messenger.rx
                                @Override // org.telegram.messenger.n10
                                public final void a(Object obj7, Object obj8) {
                                    TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj7;
                                    yy yyVar2 = yy.this;
                                    yyVar2.getClass();
                                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                                        String str3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
                                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                                        TLRPC.InputMedia inputMedia5 = tL_messages_sendMedia2.media;
                                        if (inputMedia5 instanceof TLRPC.TL_inputMediaStakeDice) {
                                            ((TLRPC.TL_inputMediaStakeDice) inputMedia5).game_hash = str3;
                                        }
                                        yyVar2.O(tL_messages_sendMedia2, ziVar, str, kyVar, z11, kyVar2, obj6, hashMap, z12);
                                    }
                                }
                            });
                            break;
                        } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                            if (T != null) {
                                g0.h3(new px(yyVar, T, tL_inputMediaStakeDice, tLObject2, ziVar, str, kyVar, z11, kyVar2, obj6, hashMap, z12));
                                break;
                            } else {
                                z12 = z12;
                            }
                        }
                    }
                }
                if (!(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) {
                    if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage)) {
                        g0.h3(new sx(yyVar, z12, tL_error, message, tLObject, ziVar, hashMap, str, tLObject2));
                        break;
                    } else {
                        g0.h3(new sx(yyVar, tL_error, message, tLObject, ziVar, str, hashMap, z12, tLObject2));
                        break;
                    }
                } else {
                    g0.h3(new nx(yyVar, tL_error, message, tLObject, ziVar, str, hashMap, z12, tLObject2));
                    break;
                }
                break;
            default:
                final List list = (List) obj5;
                final TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) obj4;
                final org.telegram.ui.wm wmVar = (org.telegram.ui.wm) obj3;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                final TLObject[] tLObjectArr = (TLObject[]) this.i;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj;
                final yy yyVar2 = this.b;
                final String str3 = this.e;
                final boolean z13 = this.g;
                final zi ziVar2 = this.d;
                final boolean z14 = this.k;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.jy
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        zi ziVar3;
                        boolean z15;
                        String str4;
                        org.telegram.ui.Components.jg jgVar;
                        final yy yyVar3 = yy.this;
                        String str5 = str3;
                        List list2 = list;
                        boolean z16 = z13;
                        TLObject tLObject3 = tLObject;
                        final zi ziVar4 = ziVar2;
                        final TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                        final org.telegram.ui.wm wmVar2 = wmVar;
                        final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        TLObject[] tLObjectArr2 = tLObjectArr;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                        final boolean z17 = z14;
                        yyVar3.r.remove(str5);
                        list2.remove(str5);
                        if (z16 && tLObject3 == null) {
                            yyVar3.n0(false, ziVar4, keyboardButtonProto2, null, null, wmVar2);
                            return;
                        }
                        if (tLObject3 == null) {
                            if (tL_error2 == null || wmVar2.getParentActivity() == null) {
                                return;
                            }
                            if ("PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                if (inputCheckPasswordSRP2 == null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wmVar2.getParentActivity());
                                    alertDialog$Builder.a.S = bd.M0(2131753019, null);
                                    alertDialog$Builder.a.U = g0.X2(bd.a0("BotOwnershipTransferReadyAlertText", null, 2131753016, new Object[0]));
                                    alertDialog$Builder.k(bd.M0(2131753017, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.messenger.sw
                                        @Override // org.telegram.ui.ActionBar.p1
                                        public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i12) {
                                            final TwoStepVerificationActivity twoStepVerificationActivity3 = new TwoStepVerificationActivity();
                                            final zi ziVar5 = ziVar4;
                                            final yy yyVar4 = yy.this;
                                            final TL_keyboard.KeyboardButtonProto keyboardButtonProto3 = keyboardButtonProto2;
                                            final org.telegram.ui.wm wmVar3 = wmVar2;
                                            final boolean z18 = z17;
                                            ca1 ca1Var = new ca1() { // from class: org.telegram.messenger.ax
                                                @Override // org.telegram.ui.ca1
                                                public final void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                                                    yyVar4.n0(z18, ziVar5, keyboardButtonProto3, tL_inputCheckPasswordSRP, twoStepVerificationActivity3, wmVar3);
                                                }
                                            };
                                            twoStepVerificationActivity3.a0 = 0;
                                            twoStepVerificationActivity3.c0 = ca1Var;
                                            wmVar3.presentFragment(twoStepVerificationActivity3);
                                        }
                                    });
                                    alertDialog$Builder.h(bd.M0(2131752589, null), null);
                                    wmVar2.showDialog(alertDialog$Builder.a);
                                    return;
                                }
                                return;
                            }
                            if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                                if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(yyVar3.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.messenger.tw
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error3) {
                                            g0.h3(new rg(yyVar3, tL_error3, tLObject4, twoStepVerificationActivity2, z17, ziVar4, keyboardButtonProto2, wmVar2));
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
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wmVar2.getParentActivity());
                            alertDialog$Builder2.a.S = bd.M0(2131751298, null);
                            LinearLayout linearLayout = new LinearLayout(wmVar2.getParentActivity());
                            linearLayout.setPadding(g0.L(24.0f), g0.L(2.0f), g0.L(24.0f), 0);
                            linearLayout.setOrientation(1);
                            alertDialog$Builder2.o(linearLayout);
                            TextView textView = new TextView(wmVar2.getParentActivity());
                            int i12 = org.telegram.ui.ActionBar.k6.j5;
                            org.telegram.ui.ActionBar.r6.V(textView, i12, null);
                            textView.setTextSize(1, 16.0f);
                            textView.setGravity((bd.a0 ? 5 : 3) | 48);
                            k5.r("BotOwnershipTransferAlertText", null, 2131753018, new Object[0], textView);
                            linearLayout.addView(textView, b8.mf.o(-1, -2));
                            LinearLayout linearLayout2 = new LinearLayout(wmVar2.getParentActivity());
                            linearLayout2.setOrientation(0);
                            linearLayout.addView(linearLayout2, b8.mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView = new ImageView(wmVar2.getParentActivity());
                            imageView.setImageResource(R.drawable.list_circle);
                            imageView.setPadding(bd.a0 ? g0.L(11.0f) : 0, g0.L(9.0f), bd.a0 ? 0 : g0.L(11.0f), 0);
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.r6.t(imageView, i12, null, mode);
                            TextView textView2 = new TextView(wmVar2.getParentActivity());
                            org.telegram.ui.ActionBar.r6.V(textView2, i12, null);
                            textView2.setTextSize(1, 16.0f);
                            textView2.setGravity((bd.a0 ? 5 : 3) | 48);
                            textView2.setText(g0.X2(bd.M0(2131751301, null)));
                            if (bd.a0) {
                                linearLayout2.addView(textView2, b8.mf.o(-1, -2));
                                linearLayout2.addView(imageView, b8.mf.r(-2, -2, 5));
                            } else {
                                linearLayout2.addView(imageView, b8.mf.o(-2, -2));
                                linearLayout2.addView(textView2, b8.mf.o(-1, -2));
                            }
                            LinearLayout linearLayout3 = new LinearLayout(wmVar2.getParentActivity());
                            linearLayout3.setOrientation(0);
                            linearLayout.addView(linearLayout3, b8.mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView2 = new ImageView(wmVar2.getParentActivity());
                            imageView2.setImageResource(R.drawable.list_circle);
                            imageView2.setPadding(bd.a0 ? g0.L(11.0f) : 0, g0.L(9.0f), bd.a0 ? 0 : g0.L(11.0f), 0);
                            org.telegram.ui.ActionBar.r6.t(imageView2, i12, null, mode);
                            TextView textView3 = new TextView(wmVar2.getParentActivity());
                            org.telegram.ui.ActionBar.r6.V(textView3, i12, null);
                            textView3.setTextSize(1, 16.0f);
                            textView3.setGravity((bd.a0 ? 5 : 3) | 48);
                            textView3.setText(g0.X2(bd.M0(2131751300, null)));
                            if (bd.a0) {
                                linearLayout3.addView(textView3, b8.mf.o(-1, -2));
                                i11 = 5;
                                linearLayout3.addView(imageView2, b8.mf.r(-2, -2, 5));
                            } else {
                                i11 = 5;
                                linearLayout3.addView(imageView2, b8.mf.o(-2, -2));
                                linearLayout3.addView(textView3, b8.mf.o(-1, -2));
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                alertDialog$Builder2.k(bd.M0(2131751292, null), new p1(wmVar2, 15));
                                alertDialog$Builder2.h(bd.M0(2131752589, null), null);
                            } else {
                                TextView textView4 = new TextView(wmVar2.getParentActivity());
                                org.telegram.ui.ActionBar.r6.V(textView4, i12, null);
                                textView4.setTextSize(1, 16.0f);
                                k5.m(textView4, (bd.a0 ? i11 : 3) | 48, null, 2131751299);
                                linearLayout.addView(textView4, b8.mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                alertDialog$Builder2.h(bd.M0(2131747839, null), null);
                            }
                            wmVar2.showDialog(alertDialog$Builder2.a);
                            return;
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                            twoStepVerificationActivity2.finishFragment();
                        }
                        long Z0 = ziVar4.Z0();
                        long j10 = ziVar4.k.via_bot_id;
                        if (j10 != 0) {
                            Z0 = j10;
                        }
                        if (Z0 > 0) {
                            TLRPC.User a22 = yyVar3.getMessagesController().a2(Long.valueOf(Z0));
                            str4 = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : null;
                            ziVar3 = ziVar4;
                            z15 = z16;
                        } else {
                            ziVar3 = ziVar4;
                            z15 = z16;
                            TLRPC.Chat M0 = yyVar3.getMessagesController().M0(Long.valueOf(-Z0));
                            str4 = M0 != null ? M0.title : null;
                        }
                        if (str4 == null) {
                            str4 = "bot";
                        }
                        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) dg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                        if (tL_inlineButtonTypeUrlAuth != null) {
                            if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                                yh0.b(false, yyVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultRequest) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                                yh0.b(false, yyVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultAccepted) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else {
                                if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                                    org.telegram.ui.Components.t4.p0(wmVar2, tL_inlineButtonTypeUrlAuth.url, false, true);
                                    return;
                                }
                                return;
                            }
                        }
                        if (dg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                            if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                                ci.e9.y(yyVar3.currentAccount, false).X(ziVar3, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr2[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, new rw(yyVar3, str5, list2, 0), new ei.e(5));
                                return;
                            }
                            zi ziVar5 = ziVar3;
                            if (tLObject3 instanceof TLRPC.PaymentForm) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                                yyVar3.getMessagesController().Y3(paymentForm.users, false);
                                wmVar2.presentFragment(new dl0(paymentForm, ziVar5, null, wmVar2));
                                return;
                            } else if (!(tLObject3 instanceof TLRPC.TL_payments_paymentReceiptStars)) {
                                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                                    wmVar2.presentFragment(new dl0((TLRPC.PaymentReceipt) tLObject3));
                                    return;
                                }
                                return;
                            } else {
                                Context context = LaunchActivity.K1;
                                if (context == null) {
                                    context = t0.b;
                                }
                                ci.wb.m1(context, yyVar3.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject3, null);
                                return;
                            }
                        }
                        zi ziVar6 = ziVar3;
                        TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject3;
                        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) dg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                        if (!z15 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                            yyVar3.getMessagesStorage().v1(str5, tL_messages_botCallbackAnswer);
                        }
                        String str6 = tL_messages_botCallbackAnswer.message;
                        if (str6 == null) {
                            if (tL_messages_botCallbackAnswer.url == null || wmVar2.getParentActivity() == null) {
                                return;
                            }
                            TLRPC.User a23 = yyVar3.getMessagesController().a2(Long.valueOf(Z0));
                            boolean z18 = a23 != null && a23.verified;
                            if (!dg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                org.telegram.ui.Components.t4.p0(wmVar2, tL_messages_botCallbackAnswer.url, false, false);
                                return;
                            }
                            TLRPC.MessageMedia messageMedia = ziVar6.k.media;
                            TLRPC.TL_game tL_game = messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game : null;
                            if (tL_game == null) {
                                return;
                            }
                            wmVar2.pc(tL_game, ziVar6, tL_messages_botCallbackAnswer.url, !z18 && k5.w("askgame_", Z0, hp.s1(yyVar3.currentAccount).d7, true), Z0);
                            return;
                        }
                        if (tL_messages_botCallbackAnswer.alert) {
                            if (wmVar2.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(wmVar2.getParentActivity());
                            alertDialog$Builder3.a.S = str4;
                            alertDialog$Builder3.k(bd.M0(2131747839, null), null);
                            String str7 = tL_messages_botCallbackAnswer.message;
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder3.a;
                            s1Var.U = str7;
                            wmVar2.showDialog(s1Var);
                            return;
                        }
                        if (wmVar2.c3 == null && wmVar2.b1 != null && wmVar2.getParentActivity() != null) {
                            FrameLayout frameLayout = new FrameLayout(wmVar2.getParentActivity());
                            wmVar2.c3 = frameLayout;
                            wmVar2.b1.addView(frameLayout, b8.mf.o(-1, 48));
                            wmVar2.b1.h(11, wmVar2.c3);
                            wmVar2.b1.g(wmVar2.c3);
                            TextView textView5 = new TextView(wmVar2.getParentActivity());
                            wmVar2.e3 = textView5;
                            textView5.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.r6.V(wmVar2.e3, org.telegram.ui.ActionBar.k6.Te, wmVar2.getResourceProvider());
                            wmVar2.e3.setTypeface(g0.o());
                            wmVar2.e3.setSingleLine(true);
                            TextView textView6 = wmVar2.e3;
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView6.setEllipsize(truncateAt);
                            wmVar2.e3.setMaxLines(1);
                            wmVar2.c3.addView(wmVar2.e3, b8.mf.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                            TextView textView7 = new TextView(wmVar2.getParentActivity());
                            wmVar2.f3 = textView7;
                            textView7.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.r6.V(wmVar2.f3, org.telegram.ui.ActionBar.k6.Ue, wmVar2.getResourceProvider());
                            wmVar2.f3.setSingleLine(true);
                            wmVar2.f3.setEllipsize(truncateAt);
                            wmVar2.f3.setMaxLines(1);
                            wmVar2.c3.addView(wmVar2.f3, b8.mf.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                        }
                        FrameLayout frameLayout2 = wmVar2.c3;
                        if (frameLayout2 == null || (jgVar = wmVar2.b1) == null) {
                            return;
                        }
                        jgVar.i(frameLayout2, true, true);
                        wmVar2.e3.setText(str4);
                        wmVar2.f3.setText(i6.m(str6.replace('\n', ' '), wmVar2.f3.getPaint().getFontMetricsInt(), false, null, 0));
                        org.telegram.ui.tj tjVar = wmVar2.d3;
                        if (tjVar != null) {
                            g0.r(tjVar);
                        }
                        org.telegram.ui.tj tjVar2 = new org.telegram.ui.tj(wmVar2, 1);
                        wmVar2.d3 = tjVar2;
                        g0.i3(tjVar2, 3000L);
                    }
                });
                break;
        }
    }

    public /* synthetic */ hx(yy yyVar, TLObject tLObject, zi ziVar, String str, ky kyVar, boolean z10, ky kyVar2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.b = yyVar;
        this.c = tLObject;
        this.d = ziVar;
        this.e = str;
        this.f = kyVar;
        this.g = z10;
        this.h = kyVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z11;
        this.l = message;
    }

    public /* synthetic */ hx(yy yyVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, zi ziVar, String str, ky kyVar, boolean z10, ky kyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = yyVar;
        this.l = tL_messages_addPollAnswer;
        this.c = tLObject;
        this.d = ziVar;
        this.e = str;
        this.f = kyVar;
        this.g = z10;
        this.h = kyVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z11;
    }
}
