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
import org.telegram.ui.gi0;
import org.telegram.ui.ml0;
import org.telegram.ui.oa1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ix implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ az b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ gj d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ix(az azVar, String str, List list, boolean z10, gj gjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.bn bnVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.b = azVar;
        this.e = str;
        this.l = list;
        this.g = z10;
        this.d = gjVar;
        this.c = keyboardButtonProto;
        this.f = bnVar;
        this.h = twoStepVerificationActivity;
        this.i = tLObjectArr;
        this.j = inputCheckPasswordSRP;
        this.k = z11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i7;
        boolean z10;
        int i10 = this.a;
        Object obj = this.j;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.l;
        switch (i10) {
            case 0:
                g0.g3(new qx(this.b, tLObject, (TLRPC.TL_messages_addPollAnswer) obj5, (TLObject) obj4, this.d, this.e, (my) obj3, this.g, (my) obj2, this.i, (HashMap) obj, this.k));
                break;
            case 1:
                final TLObject tLObject2 = (TLObject) obj4;
                final my myVar = (my) obj3;
                final my myVar2 = (my) obj2;
                final HashMap hashMap = (HashMap) obj;
                TLRPC.Message message = (TLRPC.Message) obj5;
                final az azVar = this.b;
                final gj gjVar = this.d;
                final String str = this.e;
                final boolean z11 = this.g;
                final Object obj6 = this.i;
                final boolean z12 = this.k;
                if (tL_error != null && ((((z10 = tLObject2 instanceof TLRPC.TL_messages_sendMedia)) || (tLObject2 instanceof TL_ephemeral.TL_sendMessage) || (tLObject2 instanceof TLRPC.TL_messages_editMessage) || (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) && r8.r(tL_error.text))) {
                    String str2 = tL_error.text;
                    if (str2 == null || !r8.r(str2)) {
                        i7 = 1;
                    } else {
                        i7 = 1;
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
                                azVar.O(tLObject2, gjVar, str, myVar, z11, myVar2, obj6, hashMap, z12);
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
                                azVar.O(tLObject2, gjVar, str, myVar, z11, myVar2, obj6, hashMap, z12);
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
                                azVar.O(tLObject2, gjVar, str, myVar, z11, myVar2, obj6, hashMap, z12);
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
                                azVar.O(tLObject2, gjVar, str, myVar, z11, myVar2, obj6, hashMap, z12);
                            }
                        }
                    }
                    if (obj6 == null) {
                        if (myVar2 != null) {
                            g0.g3(new jn(azVar, message, z12, tLObject2, myVar2, 4));
                            break;
                        }
                    } else {
                        r8 fileRefController = azVar.getFileRefController();
                        Boolean valueOf = Boolean.valueOf(z11);
                        Boolean valueOf2 = Boolean.valueOf(z12);
                        Object[] objArr = new Object[7];
                        objArr[0] = tLObject2;
                        objArr[i7] = gjVar;
                        objArr[2] = str;
                        objArr[3] = myVar;
                        objArr[4] = valueOf;
                        objArr[5] = myVar2;
                        objArr[6] = valueOf2;
                        fileRefController.u(objArr, obj6);
                        break;
                    }
                } else {
                    i7 = 1;
                }
                if (tL_error != null && (tLObject2 instanceof TLRPC.TL_messages_sendMedia)) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                    if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                        if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                            azVar.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new d3.b(i7), new r10() { // from class: org.telegram.messenger.sx
                                @Override // org.telegram.messenger.r10
                                public final void a(Object obj7, Object obj8) {
                                    TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj7;
                                    az azVar2 = az.this;
                                    azVar2.getClass();
                                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                                        String str3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
                                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                                        TLRPC.InputMedia inputMedia5 = tL_messages_sendMedia2.media;
                                        if (inputMedia5 instanceof TLRPC.TL_inputMediaStakeDice) {
                                            ((TLRPC.TL_inputMediaStakeDice) inputMedia5).game_hash = str3;
                                        }
                                        azVar2.O(tL_messages_sendMedia2, gjVar, str, myVar, z11, myVar2, obj6, hashMap, z12);
                                    }
                                }
                            });
                            break;
                        } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                            if (T != null) {
                                g0.g3(new qx(azVar, T, tL_inputMediaStakeDice, tLObject2, gjVar, str, myVar, z11, myVar2, obj6, hashMap, z12));
                                break;
                            } else {
                                z12 = z12;
                            }
                        }
                    }
                }
                if (!(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) {
                    if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage)) {
                        g0.g3(new tx(azVar, z12, tL_error, message, tLObject, gjVar, hashMap, str, tLObject2));
                        break;
                    } else {
                        g0.g3(new tx(azVar, tL_error, message, tLObject, gjVar, str, hashMap, z12, tLObject2));
                        break;
                    }
                } else {
                    g0.g3(new ox(azVar, tL_error, message, tLObject, gjVar, str, hashMap, z12, tLObject2));
                    break;
                }
                break;
            default:
                final List list = (List) obj5;
                final TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) obj4;
                final org.telegram.ui.bn bnVar = (org.telegram.ui.bn) obj3;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                final TLObject[] tLObjectArr = (TLObject[]) this.i;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj;
                final az azVar2 = this.b;
                final String str3 = this.e;
                final boolean z13 = this.g;
                final gj gjVar2 = this.d;
                final boolean z14 = this.k;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.ly
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        gj gjVar3;
                        boolean z15;
                        String str4;
                        org.telegram.ui.Components.ch chVar;
                        final az azVar3 = az.this;
                        String str5 = str3;
                        List list2 = list;
                        boolean z16 = z13;
                        TLObject tLObject3 = tLObject;
                        final gj gjVar4 = gjVar2;
                        final TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                        final org.telegram.ui.bn bnVar2 = bnVar;
                        final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        TLObject[] tLObjectArr2 = tLObjectArr;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                        final boolean z17 = z14;
                        azVar3.r.remove(str5);
                        list2.remove(str5);
                        if (z16 && tLObject3 == null) {
                            azVar3.n0(false, gjVar4, keyboardButtonProto2, null, null, bnVar2);
                            return;
                        }
                        if (tLObject3 == null) {
                            if (tL_error2 == null || bnVar2.getParentActivity() == null) {
                                return;
                            }
                            if ("PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                if (inputCheckPasswordSRP2 == null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bnVar2.getParentActivity());
                                    alertDialog$Builder.a.S = hd.N0(2131753007, null);
                                    alertDialog$Builder.a.U = g0.W2(hd.a0("BotOwnershipTransferReadyAlertText", null, 2131753004, new Object[0]));
                                    alertDialog$Builder.k(hd.N0(2131753005, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.messenger.sw
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i12) {
                                            final TwoStepVerificationActivity twoStepVerificationActivity3 = new TwoStepVerificationActivity();
                                            final gj gjVar5 = gjVar4;
                                            final az azVar4 = az.this;
                                            final TL_keyboard.KeyboardButtonProto keyboardButtonProto3 = keyboardButtonProto2;
                                            final org.telegram.ui.bn bnVar3 = bnVar2;
                                            final boolean z18 = z17;
                                            oa1 oa1Var = new oa1() { // from class: org.telegram.messenger.bx
                                                @Override // org.telegram.ui.oa1
                                                public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                                                    azVar4.n0(z18, gjVar5, keyboardButtonProto3, tL_inputCheckPasswordSRP, twoStepVerificationActivity3, bnVar3);
                                                }
                                            };
                                            twoStepVerificationActivity3.a0 = 0;
                                            twoStepVerificationActivity3.c0 = oa1Var;
                                            bnVar3.presentFragment(twoStepVerificationActivity3);
                                        }
                                    });
                                    alertDialog$Builder.h(hd.N0(2131752577, null), null);
                                    bnVar2.showDialog(alertDialog$Builder.a);
                                    return;
                                }
                                return;
                            }
                            if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                                if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(azVar3.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.messenger.tw
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error3) {
                                            g0.g3(new bh(azVar3, tL_error3, tLObject4, twoStepVerificationActivity2, z17, gjVar4, keyboardButtonProto2, bnVar2));
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
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bnVar2.getParentActivity());
                            alertDialog$Builder2.a.S = hd.N0(2131751285, null);
                            LinearLayout linearLayout = new LinearLayout(bnVar2.getParentActivity());
                            linearLayout.setPadding(g0.L(24.0f), g0.L(2.0f), g0.L(24.0f), 0);
                            linearLayout.setOrientation(1);
                            alertDialog$Builder2.o(linearLayout);
                            TextView textView = new TextView(bnVar2.getParentActivity());
                            int i12 = org.telegram.ui.ActionBar.m6.j5;
                            org.telegram.ui.ActionBar.t6.U(textView, i12, null);
                            textView.setTextSize(1, 16.0f);
                            textView.setGravity((hd.a0 ? 5 : 3) | 48);
                            f3.q("BotOwnershipTransferAlertText", null, 2131753006, new Object[0], textView);
                            linearLayout.addView(textView, c8.ma.o(-1, -2));
                            LinearLayout linearLayout2 = new LinearLayout(bnVar2.getParentActivity());
                            linearLayout2.setOrientation(0);
                            linearLayout.addView(linearLayout2, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView = new ImageView(bnVar2.getParentActivity());
                            imageView.setImageResource(R.drawable.list_circle);
                            imageView.setPadding(hd.a0 ? g0.L(11.0f) : 0, g0.L(9.0f), hd.a0 ? 0 : g0.L(11.0f), 0);
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.t6.s(imageView, i12, null, mode);
                            TextView textView2 = new TextView(bnVar2.getParentActivity());
                            org.telegram.ui.ActionBar.t6.U(textView2, i12, null);
                            textView2.setTextSize(1, 16.0f);
                            textView2.setGravity((hd.a0 ? 5 : 3) | 48);
                            textView2.setText(g0.W2(hd.N0(2131751288, null)));
                            if (hd.a0) {
                                linearLayout2.addView(textView2, c8.ma.o(-1, -2));
                                linearLayout2.addView(imageView, c8.ma.r(-2, -2, 5));
                            } else {
                                linearLayout2.addView(imageView, c8.ma.o(-2, -2));
                                linearLayout2.addView(textView2, c8.ma.o(-1, -2));
                            }
                            LinearLayout linearLayout3 = new LinearLayout(bnVar2.getParentActivity());
                            linearLayout3.setOrientation(0);
                            linearLayout.addView(linearLayout3, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView2 = new ImageView(bnVar2.getParentActivity());
                            imageView2.setImageResource(R.drawable.list_circle);
                            imageView2.setPadding(hd.a0 ? g0.L(11.0f) : 0, g0.L(9.0f), hd.a0 ? 0 : g0.L(11.0f), 0);
                            org.telegram.ui.ActionBar.t6.s(imageView2, i12, null, mode);
                            TextView textView3 = new TextView(bnVar2.getParentActivity());
                            org.telegram.ui.ActionBar.t6.U(textView3, i12, null);
                            textView3.setTextSize(1, 16.0f);
                            textView3.setGravity((hd.a0 ? 5 : 3) | 48);
                            textView3.setText(g0.W2(hd.N0(2131751287, null)));
                            if (hd.a0) {
                                linearLayout3.addView(textView3, c8.ma.o(-1, -2));
                                i11 = 5;
                                linearLayout3.addView(imageView2, c8.ma.r(-2, -2, 5));
                            } else {
                                i11 = 5;
                                linearLayout3.addView(imageView2, c8.ma.o(-2, -2));
                                linearLayout3.addView(textView3, c8.ma.o(-1, -2));
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                alertDialog$Builder2.k(hd.N0(2131751279, null), new j1(bnVar2, 17));
                                alertDialog$Builder2.h(hd.N0(2131752577, null), null);
                            } else {
                                TextView textView4 = new TextView(bnVar2.getParentActivity());
                                org.telegram.ui.ActionBar.t6.U(textView4, i12, null);
                                textView4.setTextSize(1, 16.0f);
                                f3.k(textView4, (hd.a0 ? i11 : 3) | 48, null, 2131751286);
                                linearLayout.addView(textView4, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                alertDialog$Builder2.h(hd.N0(2131747637, null), null);
                            }
                            bnVar2.showDialog(alertDialog$Builder2.a);
                            return;
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                            twoStepVerificationActivity2.finishFragment();
                        }
                        long Z0 = gjVar4.Z0();
                        long j3 = gjVar4.k.via_bot_id;
                        if (j3 != 0) {
                            Z0 = j3;
                        }
                        if (Z0 > 0) {
                            TLRPC.User c22 = azVar3.getMessagesController().c2(Long.valueOf(Z0));
                            str4 = c22 != null ? i5.m(0, c22.first_name, c22.last_name) : null;
                            gjVar3 = gjVar4;
                            z15 = z16;
                        } else {
                            gjVar3 = gjVar4;
                            z15 = z16;
                            TLRPC.Chat O0 = azVar3.getMessagesController().O0(Long.valueOf(-Z0));
                            str4 = O0 != null ? O0.title : null;
                        }
                        if (str4 == null) {
                            str4 = "bot";
                        }
                        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) cg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                        if (tL_inlineButtonTypeUrlAuth != null) {
                            if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                                gi0.b(false, azVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultRequest) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                                gi0.b(false, azVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultAccepted) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else {
                                if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                                    org.telegram.ui.Components.c5.n0(bnVar2, tL_inlineButtonTypeUrlAuth.url, false, true);
                                    return;
                                }
                                return;
                            }
                        }
                        if (cg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                            if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                                di.y8.y(azVar3.currentAccount, false).W(gjVar3, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr2[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, new rw(azVar3, str5, list2, 0), new fi.e(5));
                                return;
                            }
                            gj gjVar5 = gjVar3;
                            if (tLObject3 instanceof TLRPC.PaymentForm) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                                azVar3.getMessagesController().f4(paymentForm.users, false);
                                bnVar2.presentFragment(new ml0(paymentForm, gjVar5, null, bnVar2));
                                return;
                            } else if (!(tLObject3 instanceof TLRPC.TL_payments_paymentReceiptStars)) {
                                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                                    bnVar2.presentFragment(new ml0((TLRPC.PaymentReceipt) tLObject3));
                                    return;
                                }
                                return;
                            } else {
                                Context context = LaunchActivity.H1;
                                if (context == null) {
                                    context = t0.b;
                                }
                                di.pb.n1(context, azVar3.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject3, null);
                                return;
                            }
                        }
                        gj gjVar6 = gjVar3;
                        TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject3;
                        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) cg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                        if (!z15 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                            azVar3.getMessagesStorage().v1(str5, tL_messages_botCallbackAnswer);
                        }
                        String str6 = tL_messages_botCallbackAnswer.message;
                        if (str6 == null) {
                            if (tL_messages_botCallbackAnswer.url == null || bnVar2.getParentActivity() == null) {
                                return;
                            }
                            TLRPC.User c23 = azVar3.getMessagesController().c2(Long.valueOf(Z0));
                            boolean z18 = c23 != null && c23.verified;
                            if (!cg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                org.telegram.ui.Components.c5.n0(bnVar2, tL_messages_botCallbackAnswer.url, false, false);
                                return;
                            }
                            TLRPC.MessageMedia messageMedia = gjVar6.k.media;
                            TLRPC.TL_game tL_game = messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game : null;
                            if (tL_game == null) {
                                return;
                            }
                            bnVar2.tc(tL_game, gjVar6, tL_messages_botCallbackAnswer.url, !z18 && f3.w("askgame_", Z0, np.u1(azVar3.currentAccount).g7, true), Z0);
                            return;
                        }
                        if (tL_messages_botCallbackAnswer.alert) {
                            if (bnVar2.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bnVar2.getParentActivity());
                            alertDialog$Builder3.a.S = str4;
                            alertDialog$Builder3.k(hd.N0(2131747637, null), null);
                            String str7 = tL_messages_botCallbackAnswer.message;
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder3.a;
                            t1Var.U = str7;
                            bnVar2.showDialog(t1Var);
                            return;
                        }
                        if (bnVar2.c3 == null && bnVar2.b1 != null && bnVar2.getParentActivity() != null) {
                            FrameLayout frameLayout = new FrameLayout(bnVar2.getParentActivity());
                            bnVar2.c3 = frameLayout;
                            bnVar2.b1.addView(frameLayout, c8.ma.o(-1, 48));
                            bnVar2.b1.i(11, bnVar2.c3);
                            bnVar2.b1.h(bnVar2.c3);
                            TextView textView5 = new TextView(bnVar2.getParentActivity());
                            bnVar2.e3 = textView5;
                            textView5.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.t6.U(bnVar2.e3, org.telegram.ui.ActionBar.m6.We, bnVar2.getResourceProvider());
                            bnVar2.e3.setTypeface(g0.o());
                            bnVar2.e3.setSingleLine(true);
                            TextView textView6 = bnVar2.e3;
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView6.setEllipsize(truncateAt);
                            bnVar2.e3.setMaxLines(1);
                            bnVar2.c3.addView(bnVar2.e3, c8.ma.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                            TextView textView7 = new TextView(bnVar2.getParentActivity());
                            bnVar2.f3 = textView7;
                            textView7.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.t6.U(bnVar2.f3, org.telegram.ui.ActionBar.m6.Xe, bnVar2.getResourceProvider());
                            bnVar2.f3.setSingleLine(true);
                            bnVar2.f3.setEllipsize(truncateAt);
                            bnVar2.f3.setMaxLines(1);
                            bnVar2.c3.addView(bnVar2.f3, c8.ma.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                        }
                        FrameLayout frameLayout2 = bnVar2.c3;
                        if (frameLayout2 == null || (chVar = bnVar2.b1) == null) {
                            return;
                        }
                        chVar.j(frameLayout2, true, true);
                        bnVar2.e3.setText(str4);
                        bnVar2.f3.setText(j6.m(str6.replace('\n', ' '), bnVar2.f3.getPaint().getFontMetricsInt(), false, null, 0));
                        org.telegram.ui.yj yjVar = bnVar2.d3;
                        if (yjVar != null) {
                            g0.r(yjVar);
                        }
                        org.telegram.ui.yj yjVar2 = new org.telegram.ui.yj(bnVar2, 1);
                        bnVar2.d3 = yjVar2;
                        g0.h3(yjVar2, 3000L);
                    }
                });
                break;
        }
    }

    public /* synthetic */ ix(az azVar, TLObject tLObject, gj gjVar, String str, my myVar, boolean z10, my myVar2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.b = azVar;
        this.c = tLObject;
        this.d = gjVar;
        this.e = str;
        this.f = myVar;
        this.g = z10;
        this.h = myVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z11;
        this.l = message;
    }

    public /* synthetic */ ix(az azVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, gj gjVar, String str, my myVar, boolean z10, my myVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = azVar;
        this.l = tL_messages_addPollAnswer;
        this.c = tLObject;
        this.d = gjVar;
        this.e = str;
        this.f = myVar;
        this.g = z10;
        this.h = myVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z11;
    }
}
