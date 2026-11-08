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
import org.telegram.ui.bi0;
import org.telegram.ui.hl0;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ox implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ gz b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ij d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ox(gz gzVar, String str, List list, boolean z9, ij ijVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.an anVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z10) {
        this.b = gzVar;
        this.e = str;
        this.l = list;
        this.g = z9;
        this.d = ijVar;
        this.c = keyboardButtonProto;
        this.f = anVar;
        this.h = twoStepVerificationActivity;
        this.i = tLObjectArr;
        this.j = inputCheckPasswordSRP;
        this.k = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i7;
        boolean z9;
        int i10 = this.a;
        Object obj = this.j;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.l;
        switch (i10) {
            case 0:
                g0.h3(new wx(this.b, tLObject, (TLRPC.TL_messages_addPollAnswer) obj5, (TLObject) obj4, this.d, this.e, (sy) obj3, this.g, (sy) obj2, this.i, (HashMap) obj, this.k));
                break;
            case 1:
                final TLObject tLObject2 = (TLObject) obj4;
                final sy syVar = (sy) obj3;
                final sy syVar2 = (sy) obj2;
                final HashMap hashMap = (HashMap) obj;
                TLRPC.Message message = (TLRPC.Message) obj5;
                final gz gzVar = this.b;
                final ij ijVar = this.d;
                final String str = this.e;
                final boolean z10 = this.g;
                final Object obj6 = this.i;
                final boolean z11 = this.k;
                if (tL_error != null && ((((z9 = tLObject2 instanceof TLRPC.TL_messages_sendMedia)) || (tLObject2 instanceof TL_ephemeral.TL_sendMessage) || (tLObject2 instanceof TLRPC.TL_messages_editMessage) || (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) && r8.r(tL_error.text))) {
                    String str2 = tL_error.text;
                    if (str2 == null || !r8.r(str2)) {
                        i7 = 1;
                    } else {
                        i7 = 1;
                        if (str2.endsWith("COVER_EXPIRED")) {
                            if (z9) {
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
                                gzVar.O(tLObject2, ijVar, str, syVar, z10, syVar2, obj6, hashMap, z11);
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
                                gzVar.O(tLObject2, ijVar, str, syVar, z10, syVar2, obj6, hashMap, z11);
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
                                gzVar.O(tLObject2, ijVar, str, syVar, z10, syVar2, obj6, hashMap, z11);
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
                                gzVar.O(tLObject2, ijVar, str, syVar, z10, syVar2, obj6, hashMap, z11);
                            }
                        }
                    }
                    if (obj6 == null) {
                        if (syVar2 != null) {
                            g0.h3(new ln(gzVar, message, z11, tLObject2, syVar2, 4));
                            break;
                        }
                    } else {
                        r8 fileRefController = gzVar.getFileRefController();
                        Boolean valueOf = Boolean.valueOf(z10);
                        Boolean valueOf2 = Boolean.valueOf(z11);
                        Object[] objArr = new Object[7];
                        objArr[0] = tLObject2;
                        objArr[i7] = ijVar;
                        objArr[2] = str;
                        objArr[3] = syVar;
                        objArr[4] = valueOf;
                        objArr[5] = syVar2;
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
                            gzVar.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new d3.b(i7), new v10() { // from class: org.telegram.messenger.yx
                                @Override // org.telegram.messenger.v10
                                public final void a(Object obj7, Object obj8) {
                                    TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj7;
                                    gz gzVar2 = gz.this;
                                    gzVar2.getClass();
                                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                                        String str3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
                                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                                        TLRPC.InputMedia inputMedia5 = tL_messages_sendMedia2.media;
                                        if (inputMedia5 instanceof TLRPC.TL_inputMediaStakeDice) {
                                            ((TLRPC.TL_inputMediaStakeDice) inputMedia5).game_hash = str3;
                                        }
                                        gzVar2.O(tL_messages_sendMedia2, ijVar, str, syVar, z10, syVar2, obj6, hashMap, z11);
                                    }
                                }
                            });
                            break;
                        } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                            if (T != null) {
                                g0.h3(new wx(gzVar, T, tL_inputMediaStakeDice, tLObject2, ijVar, str, syVar, z10, syVar2, obj6, hashMap, z11));
                                break;
                            } else {
                                z11 = z11;
                            }
                        }
                    }
                }
                if (!(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) {
                    if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage)) {
                        g0.h3(new zx(gzVar, z11, tL_error, message, tLObject, ijVar, hashMap, str, tLObject2));
                        break;
                    } else {
                        g0.h3(new zx(gzVar, tL_error, message, tLObject, ijVar, str, hashMap, z11, tLObject2));
                        break;
                    }
                } else {
                    g0.h3(new ux(gzVar, tL_error, message, tLObject, ijVar, str, hashMap, z11, tLObject2));
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
                final gz gzVar2 = this.b;
                final String str3 = this.e;
                final boolean z12 = this.g;
                final ij ijVar2 = this.d;
                final boolean z13 = this.k;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.ry
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        ij ijVar3;
                        boolean z14;
                        String str4;
                        org.telegram.ui.Components.lg lgVar;
                        final gz gzVar3 = gz.this;
                        String str5 = str3;
                        List list2 = list;
                        boolean z15 = z12;
                        TLObject tLObject3 = tLObject;
                        final ij ijVar4 = ijVar2;
                        final TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                        final org.telegram.ui.an anVar2 = anVar;
                        final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        TLObject[] tLObjectArr2 = tLObjectArr;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                        final boolean z16 = z13;
                        gzVar3.r.remove(str5);
                        list2.remove(str5);
                        if (z15 && tLObject3 == null) {
                            gzVar3.n0(false, ijVar4, keyboardButtonProto2, null, null, anVar2);
                            return;
                        }
                        if (tLObject3 == null) {
                            if (tL_error2 == null || anVar2.getParentActivity() == null) {
                                return;
                            }
                            if ("PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                if (inputCheckPasswordSRP2 == null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(anVar2.getParentActivity());
                                    alertDialog$Builder.a.R = id.M0(2131753019, null);
                                    alertDialog$Builder.a.T = g0.X2(id.a0("BotOwnershipTransferReadyAlertText", null, 2131753016, new Object[0]));
                                    alertDialog$Builder.k(id.M0(2131753017, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.messenger.yw
                                        @Override // org.telegram.ui.ActionBar.r1
                                        public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i12) {
                                            final TwoStepVerificationActivity twoStepVerificationActivity3 = new TwoStepVerificationActivity();
                                            final ij ijVar5 = ijVar4;
                                            final gz gzVar4 = gz.this;
                                            final TL_keyboard.KeyboardButtonProto keyboardButtonProto3 = keyboardButtonProto2;
                                            final org.telegram.ui.an anVar3 = anVar2;
                                            final boolean z17 = z16;
                                            ma1 ma1Var = new ma1() { // from class: org.telegram.messenger.hx
                                                @Override // org.telegram.ui.ma1
                                                public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                                                    gzVar4.n0(z17, ijVar5, keyboardButtonProto3, tL_inputCheckPasswordSRP, twoStepVerificationActivity3, anVar3);
                                                }
                                            };
                                            twoStepVerificationActivity3.Z = 0;
                                            twoStepVerificationActivity3.b0 = ma1Var;
                                            anVar3.presentFragment(twoStepVerificationActivity3);
                                        }
                                    });
                                    alertDialog$Builder.h(id.M0(2131752589, null), null);
                                    anVar2.showDialog(alertDialog$Builder.a);
                                    return;
                                }
                                return;
                            }
                            if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                                if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(gzVar3.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.messenger.zw
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error3) {
                                            g0.h3(new zg(gzVar3, tL_error3, tLObject4, twoStepVerificationActivity2, z16, ijVar4, keyboardButtonProto2, anVar2));
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
                            alertDialog$Builder2.a.R = id.M0(2131751298, null);
                            LinearLayout linearLayout = new LinearLayout(anVar2.getParentActivity());
                            linearLayout.setPadding(g0.L(24.0f), g0.L(2.0f), g0.L(24.0f), 0);
                            linearLayout.setOrientation(1);
                            alertDialog$Builder2.o(linearLayout);
                            TextView textView = new TextView(anVar2.getParentActivity());
                            int i12 = org.telegram.ui.ActionBar.k6.j5;
                            org.telegram.ui.ActionBar.r6.V(textView, i12, null);
                            textView.setTextSize(1, 16.0f);
                            textView.setGravity((id.a0 ? 5 : 3) | 48);
                            k5.r("BotOwnershipTransferAlertText", null, 2131753018, new Object[0], textView);
                            linearLayout.addView(textView, c8.ha.o(-1, -2));
                            LinearLayout linearLayout2 = new LinearLayout(anVar2.getParentActivity());
                            linearLayout2.setOrientation(0);
                            linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView = new ImageView(anVar2.getParentActivity());
                            imageView.setImageResource(R.drawable.list_circle);
                            imageView.setPadding(id.a0 ? g0.L(11.0f) : 0, g0.L(9.0f), id.a0 ? 0 : g0.L(11.0f), 0);
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.r6.t(imageView, i12, null, mode);
                            TextView textView2 = new TextView(anVar2.getParentActivity());
                            org.telegram.ui.ActionBar.r6.V(textView2, i12, null);
                            textView2.setTextSize(1, 16.0f);
                            textView2.setGravity((id.a0 ? 5 : 3) | 48);
                            textView2.setText(g0.X2(id.M0(2131751301, null)));
                            if (id.a0) {
                                linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                                linearLayout2.addView(imageView, c8.ha.r(-2, -2, 5));
                            } else {
                                linearLayout2.addView(imageView, c8.ha.o(-2, -2));
                                linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                            }
                            LinearLayout linearLayout3 = new LinearLayout(anVar2.getParentActivity());
                            linearLayout3.setOrientation(0);
                            linearLayout.addView(linearLayout3, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView2 = new ImageView(anVar2.getParentActivity());
                            imageView2.setImageResource(R.drawable.list_circle);
                            imageView2.setPadding(id.a0 ? g0.L(11.0f) : 0, g0.L(9.0f), id.a0 ? 0 : g0.L(11.0f), 0);
                            org.telegram.ui.ActionBar.r6.t(imageView2, i12, null, mode);
                            TextView textView3 = new TextView(anVar2.getParentActivity());
                            org.telegram.ui.ActionBar.r6.V(textView3, i12, null);
                            textView3.setTextSize(1, 16.0f);
                            textView3.setGravity((id.a0 ? 5 : 3) | 48);
                            textView3.setText(g0.X2(id.M0(2131751300, null)));
                            if (id.a0) {
                                linearLayout3.addView(textView3, c8.ha.o(-1, -2));
                                i11 = 5;
                                linearLayout3.addView(imageView2, c8.ha.r(-2, -2, 5));
                            } else {
                                i11 = 5;
                                linearLayout3.addView(imageView2, c8.ha.o(-2, -2));
                                linearLayout3.addView(textView3, c8.ha.o(-1, -2));
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                alertDialog$Builder2.k(id.M0(2131751292, null), new j1(anVar2, 16));
                                alertDialog$Builder2.h(id.M0(2131752589, null), null);
                            } else {
                                TextView textView4 = new TextView(anVar2.getParentActivity());
                                org.telegram.ui.ActionBar.r6.V(textView4, i12, null);
                                textView4.setTextSize(1, 16.0f);
                                k5.m(textView4, (id.a0 ? i11 : 3) | 48, null, 2131751299);
                                linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                alertDialog$Builder2.h(id.M0(2131747832, null), null);
                            }
                            anVar2.showDialog(alertDialog$Builder2.a);
                            return;
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.t0();
                            twoStepVerificationActivity2.finishFragment();
                        }
                        long Z0 = ijVar4.Z0();
                        long j3 = ijVar4.k.via_bot_id;
                        if (j3 != 0) {
                            Z0 = j3;
                        }
                        if (Z0 > 0) {
                            TLRPC.User a22 = gzVar3.getMessagesController().a2(Long.valueOf(Z0));
                            str4 = a22 != null ? g5.m(0, a22.first_name, a22.last_name) : null;
                            ijVar3 = ijVar4;
                            z14 = z15;
                        } else {
                            ijVar3 = ijVar4;
                            z14 = z15;
                            TLRPC.Chat M0 = gzVar3.getMessagesController().M0(Long.valueOf(-Z0));
                            str4 = M0 != null ? M0.title : null;
                        }
                        if (str4 == null) {
                            str4 = "bot";
                        }
                        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) cg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                        if (tL_inlineButtonTypeUrlAuth != null) {
                            if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                                bi0.b(false, gzVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultRequest) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                                bi0.b(false, gzVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultAccepted) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else {
                                if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                                    org.telegram.ui.Components.v4.n0(anVar2, tL_inlineButtonTypeUrlAuth.url, false, true);
                                    return;
                                }
                                return;
                            }
                        }
                        if (cg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                            if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                                bi.ea.y(gzVar3.currentAccount, false).X(ijVar3, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr2[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, new xw(gzVar3, str5, list2, 0), new di.e(5));
                                return;
                            }
                            ij ijVar5 = ijVar3;
                            if (tLObject3 instanceof TLRPC.PaymentForm) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                                gzVar3.getMessagesController().Y3(paymentForm.users, false);
                                anVar2.presentFragment(new hl0(paymentForm, ijVar5, null, anVar2));
                                return;
                            } else if (!(tLObject3 instanceof TLRPC.TL_payments_paymentReceiptStars)) {
                                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                                    anVar2.presentFragment(new hl0((TLRPC.PaymentReceipt) tLObject3));
                                    return;
                                }
                                return;
                            } else {
                                Context context = LaunchActivity.G1;
                                if (context == null) {
                                    context = t0.b;
                                }
                                bi.dd.m1(context, gzVar3.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject3, null);
                                return;
                            }
                        }
                        ij ijVar6 = ijVar3;
                        TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject3;
                        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) cg.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                        if (!z14 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                            gzVar3.getMessagesStorage().v1(str5, tL_messages_botCallbackAnswer);
                        }
                        String str6 = tL_messages_botCallbackAnswer.message;
                        if (str6 == null) {
                            if (tL_messages_botCallbackAnswer.url == null || anVar2.getParentActivity() == null) {
                                return;
                            }
                            TLRPC.User a23 = gzVar3.getMessagesController().a2(Long.valueOf(Z0));
                            boolean z17 = a23 != null && a23.verified;
                            if (!cg.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                org.telegram.ui.Components.v4.n0(anVar2, tL_messages_botCallbackAnswer.url, false, false);
                                return;
                            }
                            TLRPC.MessageMedia messageMedia = ijVar6.k.media;
                            TLRPC.TL_game tL_game = messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game : null;
                            if (tL_game == null) {
                                return;
                            }
                            anVar2.pc(tL_game, ijVar6, tL_messages_botCallbackAnswer.url, !z17 && k5.w("askgame_", Z0, qp.s1(gzVar3.currentAccount).d7, true), Z0);
                            return;
                        }
                        if (tL_messages_botCallbackAnswer.alert) {
                            if (anVar2.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(anVar2.getParentActivity());
                            alertDialog$Builder3.a.R = str4;
                            alertDialog$Builder3.k(id.M0(2131747832, null), null);
                            String str7 = tL_messages_botCallbackAnswer.message;
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder3.a;
                            u1Var.T = str7;
                            anVar2.showDialog(u1Var);
                            return;
                        }
                        if (anVar2.b3 == null && anVar2.a1 != null && anVar2.getParentActivity() != null) {
                            FrameLayout frameLayout = new FrameLayout(anVar2.getParentActivity());
                            anVar2.b3 = frameLayout;
                            anVar2.a1.addView(frameLayout, c8.ha.o(-1, 48));
                            anVar2.a1.h(11, anVar2.b3);
                            anVar2.a1.g(anVar2.b3);
                            TextView textView5 = new TextView(anVar2.getParentActivity());
                            anVar2.d3 = textView5;
                            textView5.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.r6.V(anVar2.d3, org.telegram.ui.ActionBar.k6.Te, anVar2.getResourceProvider());
                            anVar2.d3.setTypeface(g0.o());
                            anVar2.d3.setSingleLine(true);
                            TextView textView6 = anVar2.d3;
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView6.setEllipsize(truncateAt);
                            anVar2.d3.setMaxLines(1);
                            anVar2.b3.addView(anVar2.d3, c8.ha.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                            TextView textView7 = new TextView(anVar2.getParentActivity());
                            anVar2.e3 = textView7;
                            textView7.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.r6.V(anVar2.e3, org.telegram.ui.ActionBar.k6.Ue, anVar2.getResourceProvider());
                            anVar2.e3.setSingleLine(true);
                            anVar2.e3.setEllipsize(truncateAt);
                            anVar2.e3.setMaxLines(1);
                            anVar2.b3.addView(anVar2.e3, c8.ha.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                        }
                        FrameLayout frameLayout2 = anVar2.b3;
                        if (frameLayout2 == null || (lgVar = anVar2.a1) == null) {
                            return;
                        }
                        lgVar.i(frameLayout2, true, true);
                        anVar2.d3.setText(str4);
                        anVar2.e3.setText(i6.m(str6.replace('\n', ' '), anVar2.e3.getPaint().getFontMetricsInt(), false, null, 0));
                        org.telegram.ui.xj xjVar = anVar2.c3;
                        if (xjVar != null) {
                            g0.r(xjVar);
                        }
                        org.telegram.ui.xj xjVar2 = new org.telegram.ui.xj(anVar2, 1);
                        anVar2.c3 = xjVar2;
                        g0.i3(xjVar2, 3000L);
                    }
                });
                break;
        }
    }

    public /* synthetic */ ox(gz gzVar, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10, TLRPC.Message message) {
        this.b = gzVar;
        this.c = tLObject;
        this.d = ijVar;
        this.e = str;
        this.f = syVar;
        this.g = z9;
        this.h = syVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z10;
        this.l = message;
    }

    public /* synthetic */ ox(gz gzVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10) {
        this.b = gzVar;
        this.l = tL_messages_addPollAnswer;
        this.c = tLObject;
        this.d = ijVar;
        this.e = str;
        this.f = syVar;
        this.g = z9;
        this.h = syVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z10;
    }
}
