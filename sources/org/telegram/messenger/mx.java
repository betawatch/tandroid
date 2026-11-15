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
import org.telegram.ui.di0;
import org.telegram.ui.jl0;
import org.telegram.ui.ka1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class mx implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ ez b;
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

    public /* synthetic */ mx(ez ezVar, String str, List list, boolean z10, gj gjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.an anVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.b = ezVar;
        this.e = str;
        this.l = list;
        this.g = z10;
        this.d = gjVar;
        this.c = keyboardButtonProto;
        this.f = anVar;
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
                g0.h3(new ux(this.b, tLObject, (TLRPC.TL_messages_addPollAnswer) obj5, (TLObject) obj4, this.d, this.e, (qy) obj3, this.g, (qy) obj2, this.i, (HashMap) obj, this.k));
                break;
            case 1:
                final TLObject tLObject2 = (TLObject) obj4;
                final qy qyVar = (qy) obj3;
                final qy qyVar2 = (qy) obj2;
                final HashMap hashMap = (HashMap) obj;
                TLRPC.Message message = (TLRPC.Message) obj5;
                final ez ezVar = this.b;
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
                                ezVar.O(tLObject2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12);
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
                                ezVar.O(tLObject2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12);
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
                                ezVar.O(tLObject2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12);
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
                                ezVar.O(tLObject2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12);
                            }
                        }
                    }
                    if (obj6 == null) {
                        if (qyVar2 != null) {
                            g0.h3(new in(ezVar, message, z12, tLObject2, qyVar2, 4));
                            break;
                        }
                    } else {
                        r8 fileRefController = ezVar.getFileRefController();
                        Boolean valueOf = Boolean.valueOf(z11);
                        Boolean valueOf2 = Boolean.valueOf(z12);
                        Object[] objArr = new Object[7];
                        objArr[0] = tLObject2;
                        objArr[i7] = gjVar;
                        objArr[2] = str;
                        objArr[3] = qyVar;
                        objArr[4] = valueOf;
                        objArr[5] = qyVar2;
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
                            ezVar.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new d3.b(i7), new s10() { // from class: org.telegram.messenger.wx
                                @Override // org.telegram.messenger.s10
                                public final void a(Object obj7, Object obj8) {
                                    TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj7;
                                    ez ezVar2 = ez.this;
                                    ezVar2.getClass();
                                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                                        String str3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
                                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                                        TLRPC.InputMedia inputMedia5 = tL_messages_sendMedia2.media;
                                        if (inputMedia5 instanceof TLRPC.TL_inputMediaStakeDice) {
                                            ((TLRPC.TL_inputMediaStakeDice) inputMedia5).game_hash = str3;
                                        }
                                        ezVar2.O(tL_messages_sendMedia2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12);
                                    }
                                }
                            });
                            break;
                        } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                            if (T != null) {
                                g0.h3(new ux(ezVar, T, tL_inputMediaStakeDice, tLObject2, gjVar, str, qyVar, z11, qyVar2, obj6, hashMap, z12));
                                break;
                            } else {
                                z12 = z12;
                            }
                        }
                    }
                }
                if (!(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) {
                    if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage)) {
                        g0.h3(new xx(ezVar, z12, tL_error, message, tLObject, gjVar, hashMap, str, tLObject2));
                        break;
                    } else {
                        g0.h3(new xx(ezVar, tL_error, message, tLObject, gjVar, str, hashMap, z12, tLObject2));
                        break;
                    }
                } else {
                    g0.h3(new sx(ezVar, tL_error, message, tLObject, gjVar, str, hashMap, z12, tLObject2));
                    break;
                }
                break;
            default:
                final List list = (List) obj5;
                final TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) obj4;
                final org.telegram.ui.an anVar = (org.telegram.ui.an) obj3;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                final TLObject[] tLObjectArr = (TLObject[]) this.i;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj;
                final ez ezVar2 = this.b;
                final String str3 = this.e;
                final boolean z13 = this.g;
                final gj gjVar2 = this.d;
                final boolean z14 = this.k;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.py
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        gj gjVar3;
                        boolean z15;
                        String str4;
                        org.telegram.ui.Components.rg rgVar;
                        final ez ezVar3 = ez.this;
                        String str5 = str3;
                        List list2 = list;
                        boolean z16 = z13;
                        TLObject tLObject3 = tLObject;
                        final gj gjVar4 = gjVar2;
                        final TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                        final org.telegram.ui.an anVar2 = anVar;
                        final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        TLObject[] tLObjectArr2 = tLObjectArr;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                        final boolean z17 = z14;
                        ezVar3.r.remove(str5);
                        list2.remove(str5);
                        if (z16 && tLObject3 == null) {
                            ezVar3.n0(false, gjVar4, keyboardButtonProto2, null, null, anVar2);
                            return;
                        }
                        if (tLObject3 == null) {
                            if (tL_error2 == null || anVar2.getParentActivity() == null) {
                                return;
                            }
                            if ("PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                if (inputCheckPasswordSRP2 == null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(anVar2.getParentActivity());
                                    alertDialog$Builder.a.S = hd.M0(2131753019, null);
                                    alertDialog$Builder.a.U = g0.X2(hd.a0("BotOwnershipTransferReadyAlertText", null, 2131753016, new Object[0]));
                                    alertDialog$Builder.k(hd.M0(2131753017, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.messenger.ww
                                        @Override // org.telegram.ui.ActionBar.q1
                                        public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i12) {
                                            final TwoStepVerificationActivity twoStepVerificationActivity3 = new TwoStepVerificationActivity();
                                            final gj gjVar5 = gjVar4;
                                            final ez ezVar4 = ez.this;
                                            final TL_keyboard.KeyboardButtonProto keyboardButtonProto3 = keyboardButtonProto2;
                                            final org.telegram.ui.an anVar3 = anVar2;
                                            final boolean z18 = z17;
                                            ka1 ka1Var = new ka1() { // from class: org.telegram.messenger.fx
                                                @Override // org.telegram.ui.ka1
                                                public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                                                    ezVar4.n0(z18, gjVar5, keyboardButtonProto3, tL_inputCheckPasswordSRP, twoStepVerificationActivity3, anVar3);
                                                }
                                            };
                                            twoStepVerificationActivity3.a0 = 0;
                                            twoStepVerificationActivity3.c0 = ka1Var;
                                            anVar3.presentFragment(twoStepVerificationActivity3);
                                        }
                                    });
                                    alertDialog$Builder.h(hd.M0(2131752589, null), null);
                                    anVar2.showDialog(alertDialog$Builder.a);
                                    return;
                                }
                                return;
                            }
                            if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                                if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(ezVar3.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.messenger.xw
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error3) {
                                            g0.h3(new yg(ezVar3, tL_error3, tLObject4, twoStepVerificationActivity2, z17, gjVar4, keyboardButtonProto2, anVar2));
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
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(anVar2.getParentActivity());
                            alertDialog$Builder2.a.S = hd.M0(2131751297, null);
                            LinearLayout linearLayout = new LinearLayout(anVar2.getParentActivity());
                            linearLayout.setPadding(g0.L(24.0f), g0.L(2.0f), g0.L(24.0f), 0);
                            linearLayout.setOrientation(1);
                            alertDialog$Builder2.o(linearLayout);
                            TextView textView = new TextView(anVar2.getParentActivity());
                            int i12 = org.telegram.ui.ActionBar.j6.j5;
                            org.telegram.ui.ActionBar.q6.U(textView, i12, null);
                            textView.setTextSize(1, 16.0f);
                            textView.setGravity((hd.a0 ? 5 : 3) | 48);
                            k5.q("BotOwnershipTransferAlertText", null, 2131753018, new Object[0], textView);
                            linearLayout.addView(textView, c8.ja.o(-1, -2));
                            LinearLayout linearLayout2 = new LinearLayout(anVar2.getParentActivity());
                            linearLayout2.setOrientation(0);
                            linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView = new ImageView(anVar2.getParentActivity());
                            imageView.setImageResource(R.drawable.list_circle);
                            imageView.setPadding(hd.a0 ? g0.L(11.0f) : 0, g0.L(9.0f), hd.a0 ? 0 : g0.L(11.0f), 0);
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.q6.s(imageView, i12, null, mode);
                            TextView textView2 = new TextView(anVar2.getParentActivity());
                            org.telegram.ui.ActionBar.q6.U(textView2, i12, null);
                            textView2.setTextSize(1, 16.0f);
                            textView2.setGravity((hd.a0 ? 5 : 3) | 48);
                            textView2.setText(g0.X2(hd.M0(2131751300, null)));
                            if (hd.a0) {
                                linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                                linearLayout2.addView(imageView, c8.ja.r(-2, -2, 5));
                            } else {
                                linearLayout2.addView(imageView, c8.ja.o(-2, -2));
                                linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                            }
                            LinearLayout linearLayout3 = new LinearLayout(anVar2.getParentActivity());
                            linearLayout3.setOrientation(0);
                            linearLayout.addView(linearLayout3, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView2 = new ImageView(anVar2.getParentActivity());
                            imageView2.setImageResource(R.drawable.list_circle);
                            imageView2.setPadding(hd.a0 ? g0.L(11.0f) : 0, g0.L(9.0f), hd.a0 ? 0 : g0.L(11.0f), 0);
                            org.telegram.ui.ActionBar.q6.s(imageView2, i12, null, mode);
                            TextView textView3 = new TextView(anVar2.getParentActivity());
                            org.telegram.ui.ActionBar.q6.U(textView3, i12, null);
                            textView3.setTextSize(1, 16.0f);
                            textView3.setGravity((hd.a0 ? 5 : 3) | 48);
                            textView3.setText(g0.X2(hd.M0(2131751299, null)));
                            if (hd.a0) {
                                linearLayout3.addView(textView3, c8.ja.o(-1, -2));
                                i11 = 5;
                                linearLayout3.addView(imageView2, c8.ja.r(-2, -2, 5));
                            } else {
                                i11 = 5;
                                linearLayout3.addView(imageView2, c8.ja.o(-2, -2));
                                linearLayout3.addView(textView3, c8.ja.o(-1, -2));
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                alertDialog$Builder2.k(hd.M0(2131751291, null), new j1(anVar2, 16));
                                alertDialog$Builder2.h(hd.M0(2131752589, null), null);
                            } else {
                                TextView textView4 = new TextView(anVar2.getParentActivity());
                                org.telegram.ui.ActionBar.q6.U(textView4, i12, null);
                                textView4.setTextSize(1, 16.0f);
                                k5.l(textView4, (hd.a0 ? i11 : 3) | 48, null, 2131751298);
                                linearLayout.addView(textView4, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                alertDialog$Builder2.h(hd.M0(2131747831, null), null);
                            }
                            anVar2.showDialog(alertDialog$Builder2.a);
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
                            TLRPC.User a22 = ezVar3.getMessagesController().a2(Long.valueOf(Z0));
                            str4 = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : null;
                            gjVar3 = gjVar4;
                            z15 = z16;
                        } else {
                            gjVar3 = gjVar4;
                            z15 = z16;
                            TLRPC.Chat M0 = ezVar3.getMessagesController().M0(Long.valueOf(-Z0));
                            str4 = M0 != null ? M0.title : null;
                        }
                        if (str4 == null) {
                            str4 = "bot";
                        }
                        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) cg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                        if (tL_inlineButtonTypeUrlAuth != null) {
                            if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                                di0.b(false, ezVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultRequest) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                                di0.b(false, ezVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultAccepted) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else {
                                if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                                    org.telegram.ui.Components.t4.n0(anVar2, tL_inlineButtonTypeUrlAuth.url, false, true);
                                    return;
                                }
                                return;
                            }
                        }
                        if (cg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                            if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                                di.v8.y(ezVar3.currentAccount, false).X(gjVar3, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr2[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, new vw(ezVar3, str5, list2, 0), new fi.e(5));
                                return;
                            }
                            gj gjVar5 = gjVar3;
                            if (tLObject3 instanceof TLRPC.PaymentForm) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                                ezVar3.getMessagesController().Y3(paymentForm.users, false);
                                anVar2.presentFragment(new jl0(paymentForm, gjVar5, null, anVar2));
                                return;
                            } else if (!(tLObject3 instanceof TLRPC.TL_payments_paymentReceiptStars)) {
                                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                                    anVar2.presentFragment(new jl0((TLRPC.PaymentReceipt) tLObject3));
                                    return;
                                }
                                return;
                            } else {
                                Context context = LaunchActivity.H1;
                                if (context == null) {
                                    context = t0.b;
                                }
                                di.mb.m1(context, ezVar3.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject3, null);
                                return;
                            }
                        }
                        gj gjVar6 = gjVar3;
                        TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject3;
                        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) cg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                        if (!z15 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                            ezVar3.getMessagesStorage().v1(str5, tL_messages_botCallbackAnswer);
                        }
                        String str6 = tL_messages_botCallbackAnswer.message;
                        if (str6 == null) {
                            if (tL_messages_botCallbackAnswer.url == null || anVar2.getParentActivity() == null) {
                                return;
                            }
                            TLRPC.User a23 = ezVar3.getMessagesController().a2(Long.valueOf(Z0));
                            boolean z18 = a23 != null && a23.verified;
                            if (!cg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                org.telegram.ui.Components.t4.n0(anVar2, tL_messages_botCallbackAnswer.url, false, false);
                                return;
                            }
                            TLRPC.MessageMedia messageMedia = gjVar6.k.media;
                            TLRPC.TL_game tL_game = messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game : null;
                            if (tL_game == null) {
                                return;
                            }
                            anVar2.tc(tL_game, gjVar6, tL_messages_botCallbackAnswer.url, !z18 && k5.w("askgame_", Z0, np.s1(ezVar3.currentAccount).e7, true), Z0);
                            return;
                        }
                        if (tL_messages_botCallbackAnswer.alert) {
                            if (anVar2.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(anVar2.getParentActivity());
                            alertDialog$Builder3.a.S = str4;
                            alertDialog$Builder3.k(hd.M0(2131747831, null), null);
                            String str7 = tL_messages_botCallbackAnswer.message;
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder3.a;
                            t1Var.U = str7;
                            anVar2.showDialog(t1Var);
                            return;
                        }
                        if (anVar2.c3 == null && anVar2.b1 != null && anVar2.getParentActivity() != null) {
                            FrameLayout frameLayout = new FrameLayout(anVar2.getParentActivity());
                            anVar2.c3 = frameLayout;
                            anVar2.b1.addView(frameLayout, c8.ja.o(-1, 48));
                            anVar2.b1.h(11, anVar2.c3);
                            anVar2.b1.g(anVar2.c3);
                            TextView textView5 = new TextView(anVar2.getParentActivity());
                            anVar2.e3 = textView5;
                            textView5.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.q6.U(anVar2.e3, org.telegram.ui.ActionBar.j6.We, anVar2.getResourceProvider());
                            anVar2.e3.setTypeface(g0.o());
                            anVar2.e3.setSingleLine(true);
                            TextView textView6 = anVar2.e3;
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView6.setEllipsize(truncateAt);
                            anVar2.e3.setMaxLines(1);
                            anVar2.c3.addView(anVar2.e3, c8.ja.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                            TextView textView7 = new TextView(anVar2.getParentActivity());
                            anVar2.f3 = textView7;
                            textView7.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.q6.U(anVar2.f3, org.telegram.ui.ActionBar.j6.Xe, anVar2.getResourceProvider());
                            anVar2.f3.setSingleLine(true);
                            anVar2.f3.setEllipsize(truncateAt);
                            anVar2.f3.setMaxLines(1);
                            anVar2.c3.addView(anVar2.f3, c8.ja.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                        }
                        FrameLayout frameLayout2 = anVar2.c3;
                        if (frameLayout2 == null || (rgVar = anVar2.b1) == null) {
                            return;
                        }
                        rgVar.i(frameLayout2, true, true);
                        anVar2.e3.setText(str4);
                        anVar2.f3.setText(j6.m(str6.replace('\n', ' '), anVar2.f3.getPaint().getFontMetricsInt(), false, null, 0));
                        org.telegram.ui.xj xjVar = anVar2.d3;
                        if (xjVar != null) {
                            g0.r(xjVar);
                        }
                        org.telegram.ui.xj xjVar2 = new org.telegram.ui.xj(anVar2, 1);
                        anVar2.d3 = xjVar2;
                        g0.i3(xjVar2, 3000L);
                    }
                });
                break;
        }
    }

    public /* synthetic */ mx(ez ezVar, TLObject tLObject, gj gjVar, String str, qy qyVar, boolean z10, qy qyVar2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.b = ezVar;
        this.c = tLObject;
        this.d = gjVar;
        this.e = str;
        this.f = qyVar;
        this.g = z10;
        this.h = qyVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z11;
        this.l = message;
    }

    public /* synthetic */ mx(ez ezVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, gj gjVar, String str, qy qyVar, boolean z10, qy qyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = ezVar;
        this.l = tL_messages_addPollAnswer;
        this.c = tLObject;
        this.d = gjVar;
        this.e = str;
        this.f = qyVar;
        this.g = z10;
        this.h = qyVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z11;
    }
}
