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
import org.telegram.ui.gc1;
import org.telegram.ui.jj0;
import org.telegram.ui.sm0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class zx implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ qz b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ jj d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    public /* synthetic */ zx(qz qzVar, String str, List list, boolean z10, jj jjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.un unVar, TwoStepVerificationActivity twoStepVerificationActivity, TLObject[] tLObjectArr, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, boolean z11) {
        this.b = qzVar;
        this.e = str;
        this.l = list;
        this.g = z10;
        this.d = jjVar;
        this.c = keyboardButtonProto;
        this.f = unVar;
        this.h = twoStepVerificationActivity;
        this.i = tLObjectArr;
        this.j = inputCheckPasswordSRP;
        this.k = z11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i10;
        boolean z10;
        int i11 = this.a;
        Object obj = this.j;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.l;
        switch (i11) {
            case 0:
                i0.g3(new iy(this.b, tLObject, (TLRPC.TL_messages_addPollAnswer) obj5, (TLObject) obj4, this.d, this.e, (cz) obj3, this.g, (cz) obj2, this.i, (HashMap) obj, this.k));
                break;
            case 1:
                final TLObject tLObject2 = (TLObject) obj4;
                final cz czVar = (cz) obj3;
                final cz czVar2 = (cz) obj2;
                final HashMap hashMap = (HashMap) obj;
                TLRPC.Message message = (TLRPC.Message) obj5;
                final qz qzVar = this.b;
                final jj jjVar = this.d;
                final String str = this.e;
                final boolean z11 = this.g;
                final Object obj6 = this.i;
                final boolean z12 = this.k;
                if (tL_error != null && ((((z10 = tLObject2 instanceof TLRPC.TL_messages_sendMedia)) || (tLObject2 instanceof TL_ephemeral.TL_sendMessage) || (tLObject2 instanceof TLRPC.TL_messages_editMessage) || (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) && w8.r(tL_error.text))) {
                    String str2 = tL_error.text;
                    if (str2 == null || !w8.r(str2)) {
                        i10 = 1;
                    } else {
                        i10 = 1;
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
                                qzVar.O(tLObject2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12);
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
                                qzVar.O(tLObject2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12);
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
                                qzVar.O(tLObject2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12);
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
                                qzVar.O(tLObject2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12);
                            }
                        }
                    }
                    if (obj6 == null) {
                        if (czVar2 != null) {
                            i0.g3(new rn(qzVar, message, z12, tLObject2, czVar2, 4));
                            break;
                        }
                    } else {
                        w8 fileRefController = qzVar.getFileRefController();
                        Boolean valueOf = Boolean.valueOf(z11);
                        Boolean valueOf2 = Boolean.valueOf(z12);
                        Object[] objArr = new Object[7];
                        objArr[0] = tLObject2;
                        objArr[i10] = jjVar;
                        objArr[2] = str;
                        objArr[3] = czVar;
                        objArr[4] = valueOf;
                        objArr[5] = czVar2;
                        objArr[6] = valueOf2;
                        fileRefController.u(objArr, obj6);
                        break;
                    }
                } else {
                    i10 = 1;
                }
                if (tL_error != null && (tLObject2 instanceof TLRPC.TL_messages_sendMedia)) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                    if (tL_messages_sendMedia.media instanceof TLRPC.TL_inputMediaStakeDice) {
                        if ("GAME_HASH_INVALID".equalsIgnoreCase(tL_error.text)) {
                            qzVar.getConnectionsManager().sendRequestTyped(new TLRPC.TL_messages_getEmojiGameInfo(), new a3.b(i10), new j20() { // from class: org.telegram.messenger.ky
                                @Override // org.telegram.messenger.j20
                                public final void a(Object obj7, Object obj8) {
                                    TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj7;
                                    qz qzVar2 = qz.this;
                                    qzVar2.getClass();
                                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                                        String str3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).game_hash;
                                        TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                                        TLRPC.InputMedia inputMedia5 = tL_messages_sendMedia2.media;
                                        if (inputMedia5 instanceof TLRPC.TL_inputMediaStakeDice) {
                                            ((TLRPC.TL_inputMediaStakeDice) inputMedia5).game_hash = str3;
                                        }
                                        qzVar2.O(tL_messages_sendMedia2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12);
                                    }
                                }
                            });
                            break;
                        } else if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                            TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice = (TLRPC.TL_inputMediaStakeDice) tL_messages_sendMedia.media;
                            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                            if (T != null) {
                                i0.g3(new iy(qzVar, T, tL_inputMediaStakeDice, tLObject2, jjVar, str, czVar, z11, czVar2, obj6, hashMap, z12));
                                break;
                            } else {
                                z12 = z12;
                            }
                        }
                    }
                }
                if (!(tLObject2 instanceof TLRPC.TL_messages_addPollAnswer)) {
                    if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage)) {
                        i0.g3(new ly(qzVar, z12, tL_error, message, tLObject, jjVar, hashMap, str, tLObject2));
                        break;
                    } else {
                        i0.g3(new ly(qzVar, tL_error, message, tLObject, jjVar, str, hashMap, z12, tLObject2));
                        break;
                    }
                } else {
                    i0.g3(new gy(qzVar, tL_error, message, tLObject, jjVar, str, hashMap, z12, tLObject2));
                    break;
                }
                break;
            default:
                final List list = (List) obj5;
                final TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) obj4;
                final org.telegram.ui.un unVar = (org.telegram.ui.un) obj3;
                final TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj2;
                final TLObject[] tLObjectArr = (TLObject[]) this.i;
                final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = (TLRPC.InputCheckPasswordSRP) obj;
                final qz qzVar2 = this.b;
                final String str3 = this.e;
                final boolean z13 = this.g;
                final jj jjVar2 = this.d;
                final boolean z14 = this.k;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.bz
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12;
                        jj jjVar3;
                        boolean z15;
                        String str4;
                        org.telegram.ui.Components.hg hgVar;
                        final qz qzVar3 = qz.this;
                        String str5 = str3;
                        List list2 = list;
                        boolean z16 = z13;
                        TLObject tLObject3 = tLObject;
                        final jj jjVar4 = jjVar2;
                        final TL_keyboard.KeyboardButtonProto keyboardButtonProto2 = keyboardButtonProto;
                        final org.telegram.ui.un unVar2 = unVar;
                        final TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        TLObject[] tLObjectArr2 = tLObjectArr;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = inputCheckPasswordSRP;
                        final boolean z17 = z14;
                        qzVar3.r.remove(str5);
                        list2.remove(str5);
                        if (z16 && tLObject3 == null) {
                            qzVar3.n0(false, jjVar4, keyboardButtonProto2, null, null, unVar2);
                            return;
                        }
                        if (tLObject3 == null) {
                            if (tL_error2 == null || unVar2.getParentActivity() == null) {
                                return;
                            }
                            if ("PASSWORD_HASH_INVALID".equals(tL_error2.text)) {
                                if (inputCheckPasswordSRP2 == null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar2.getParentActivity());
                                    alertDialog$Builder.a.R = cd.L0(2131753019, null);
                                    alertDialog$Builder.a.T = i0.W2(cd.a0("BotOwnershipTransferReadyAlertText", null, 2131753016, new Object[0]));
                                    alertDialog$Builder.k(cd.L0(2131753017, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.messenger.lx
                                        @Override // org.telegram.ui.ActionBar.u1
                                        public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i13) {
                                            final TwoStepVerificationActivity twoStepVerificationActivity3 = new TwoStepVerificationActivity();
                                            final jj jjVar5 = jjVar4;
                                            final qz qzVar4 = qz.this;
                                            final TL_keyboard.KeyboardButtonProto keyboardButtonProto3 = keyboardButtonProto2;
                                            final org.telegram.ui.un unVar3 = unVar2;
                                            final boolean z18 = z17;
                                            gc1 gc1Var = new gc1() { // from class: org.telegram.messenger.tx
                                                @Override // org.telegram.ui.gc1
                                                public final void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                                                    qzVar4.n0(z18, jjVar5, keyboardButtonProto3, tL_inputCheckPasswordSRP, twoStepVerificationActivity3, unVar3);
                                                }
                                            };
                                            twoStepVerificationActivity3.Z = 0;
                                            twoStepVerificationActivity3.b0 = gc1Var;
                                            unVar3.presentFragment(twoStepVerificationActivity3);
                                        }
                                    });
                                    alertDialog$Builder.h(cd.L0(2131752589, null), null);
                                    unVar2.showDialog(alertDialog$Builder.a);
                                    return;
                                }
                                return;
                            }
                            if (!"PASSWORD_MISSING".equals(tL_error2.text) && !tL_error2.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error2.text.startsWith("SESSION_TOO_FRESH_")) {
                                if ("SRP_ID_INVALID".equals(tL_error2.text)) {
                                    ConnectionsManager.getInstance(qzVar3.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.messenger.mx
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error3) {
                                            i0.g3(new yg(qzVar3, tL_error3, tLObject4, twoStepVerificationActivity2, z17, jjVar4, keyboardButtonProto2, unVar2));
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
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(unVar2.getParentActivity());
                            alertDialog$Builder2.a.R = cd.L0(2131751298, null);
                            LinearLayout linearLayout = new LinearLayout(unVar2.getParentActivity());
                            linearLayout.setPadding(i0.L(24.0f), i0.L(2.0f), i0.L(24.0f), 0);
                            linearLayout.setOrientation(1);
                            alertDialog$Builder2.o(linearLayout);
                            TextView textView = new TextView(unVar2.getParentActivity());
                            int i13 = org.telegram.ui.ActionBar.t6.j5;
                            org.telegram.ui.ActionBar.a7.V(textView, i13, null);
                            textView.setTextSize(1, 16.0f);
                            textView.setGravity((cd.X ? 5 : 3) | 48);
                            m5.q("BotOwnershipTransferAlertText", null, 2131753018, new Object[0], textView);
                            linearLayout.addView(textView, w7.b6.o(-1, -2));
                            LinearLayout linearLayout2 = new LinearLayout(unVar2.getParentActivity());
                            linearLayout2.setOrientation(0);
                            linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView = new ImageView(unVar2.getParentActivity());
                            imageView.setImageResource(R.drawable.list_circle);
                            imageView.setPadding(cd.X ? i0.L(11.0f) : 0, i0.L(9.0f), cd.X ? 0 : i0.L(11.0f), 0);
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            org.telegram.ui.ActionBar.a7.t(imageView, i13, null, mode);
                            TextView textView2 = new TextView(unVar2.getParentActivity());
                            org.telegram.ui.ActionBar.a7.V(textView2, i13, null);
                            textView2.setTextSize(1, 16.0f);
                            textView2.setGravity((cd.X ? 5 : 3) | 48);
                            textView2.setText(i0.W2(cd.L0(2131751301, null)));
                            if (cd.X) {
                                linearLayout2.addView(textView2, w7.b6.o(-1, -2));
                                linearLayout2.addView(imageView, w7.b6.r(-2, -2, 5));
                            } else {
                                linearLayout2.addView(imageView, w7.b6.o(-2, -2));
                                linearLayout2.addView(textView2, w7.b6.o(-1, -2));
                            }
                            LinearLayout linearLayout3 = new LinearLayout(unVar2.getParentActivity());
                            linearLayout3.setOrientation(0);
                            linearLayout.addView(linearLayout3, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                            ImageView imageView2 = new ImageView(unVar2.getParentActivity());
                            imageView2.setImageResource(R.drawable.list_circle);
                            imageView2.setPadding(cd.X ? i0.L(11.0f) : 0, i0.L(9.0f), cd.X ? 0 : i0.L(11.0f), 0);
                            org.telegram.ui.ActionBar.a7.t(imageView2, i13, null, mode);
                            TextView textView3 = new TextView(unVar2.getParentActivity());
                            org.telegram.ui.ActionBar.a7.V(textView3, i13, null);
                            textView3.setTextSize(1, 16.0f);
                            textView3.setGravity((cd.X ? 5 : 3) | 48);
                            textView3.setText(i0.W2(cd.L0(2131751300, null)));
                            if (cd.X) {
                                linearLayout3.addView(textView3, w7.b6.o(-1, -2));
                                i12 = 5;
                                linearLayout3.addView(imageView2, w7.b6.r(-2, -2, 5));
                            } else {
                                i12 = 5;
                                linearLayout3.addView(imageView2, w7.b6.o(-2, -2));
                                linearLayout3.addView(textView3, w7.b6.o(-1, -2));
                            }
                            if ("PASSWORD_MISSING".equals(tL_error2.text)) {
                                alertDialog$Builder2.k(cd.L0(2131751292, null), new s1(unVar2, 15));
                                alertDialog$Builder2.h(cd.L0(2131752589, null), null);
                            } else {
                                TextView textView4 = new TextView(unVar2.getParentActivity());
                                org.telegram.ui.ActionBar.a7.V(textView4, i13, null);
                                textView4.setTextSize(1, 16.0f);
                                m5.l(textView4, (cd.X ? i12 : 3) | 48, null, 2131751299);
                                linearLayout.addView(textView4, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                alertDialog$Builder2.h(cd.L0(2131747847, null), null);
                            }
                            unVar2.showDialog(alertDialog$Builder2.a);
                            return;
                        }
                        if (twoStepVerificationActivity2 != null) {
                            twoStepVerificationActivity2.s0();
                            twoStepVerificationActivity2.finishFragment();
                        }
                        long Z0 = jjVar4.Z0();
                        long j10 = jjVar4.k.via_bot_id;
                        if (j10 != 0) {
                            Z0 = j10;
                        }
                        if (Z0 > 0) {
                            TLRPC.User Z1 = qzVar3.getMessagesController().Z1(Long.valueOf(Z0));
                            str4 = Z1 != null ? i5.m(0, Z1.first_name, Z1.last_name) : null;
                            jjVar3 = jjVar4;
                            z15 = z16;
                        } else {
                            jjVar3 = jjVar4;
                            z15 = z16;
                            TLRPC.Chat L0 = qzVar3.getMessagesController().L0(Long.valueOf(-Z0));
                            str4 = L0 != null ? L0.title : null;
                        }
                        if (str4 == null) {
                            str4 = "bot";
                        }
                        TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) sf.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
                        if (tL_inlineButtonTypeUrlAuth != null) {
                            if (tLObject3 instanceof TLRPC.TL_urlAuthResultRequest) {
                                jj0.b(false, qzVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultRequest) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else if (tLObject3 instanceof TLRPC.TL_urlAuthResultAccepted) {
                                jj0.b(false, qzVar3.currentAccount, (TLRPC.TL_messages_requestUrlAuth) tLObjectArr2[0], (TLRPC.TL_urlAuthResultAccepted) tLObject3, tL_inlineButtonTypeUrlAuth.url, null, null, false, null);
                                return;
                            } else {
                                if (tLObject3 instanceof TLRPC.TL_urlAuthResultDefault) {
                                    org.telegram.ui.Components.s4.p0(unVar2, tL_inlineButtonTypeUrlAuth.url, false, true);
                                    return;
                                }
                                return;
                            }
                        }
                        if (sf.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                            if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                                rh.e6.y(qzVar3.currentAccount, false).X(jjVar3, ((TLRPC.TL_payments_getPaymentForm) tLObjectArr2[0]).invoice, (TLRPC.TL_payments_paymentFormStars) tLObject3, new kx(qzVar3, str5, list2, 0), new ag.z0(4));
                                return;
                            }
                            jj jjVar5 = jjVar3;
                            if (tLObject3 instanceof TLRPC.PaymentForm) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject3;
                                qzVar3.getMessagesController().V3(paymentForm.users, false);
                                unVar2.presentFragment(new sm0(paymentForm, jjVar5, null, unVar2));
                                return;
                            } else if (!(tLObject3 instanceof TLRPC.TL_payments_paymentReceiptStars)) {
                                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                                    unVar2.presentFragment(new sm0((TLRPC.PaymentReceipt) tLObject3));
                                    return;
                                }
                                return;
                            } else {
                                Context context = LaunchActivity.I1;
                                if (context == null) {
                                    context = w0.b;
                                }
                                rh.h8.l1(context, qzVar3.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject3, null);
                                return;
                            }
                        }
                        jj jjVar6 = jjVar3;
                        TLRPC.TL_messages_botCallbackAnswer tL_messages_botCallbackAnswer = (TLRPC.TL_messages_botCallbackAnswer) tLObject3;
                        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) sf.c.a(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeCallback.class);
                        if (!z15 && tL_messages_botCallbackAnswer.cache_time != 0 && (tL_inlineButtonTypeCallback == null || !tL_inlineButtonTypeCallback.requires_password)) {
                            qzVar3.getMessagesStorage().v1(str5, tL_messages_botCallbackAnswer);
                        }
                        String str6 = tL_messages_botCallbackAnswer.message;
                        if (str6 == null) {
                            if (tL_messages_botCallbackAnswer.url == null || unVar2.getParentActivity() == null) {
                                return;
                            }
                            TLRPC.User Z12 = qzVar3.getMessagesController().Z1(Long.valueOf(Z0));
                            boolean z18 = Z12 != null && Z12.verified;
                            if (!sf.c.c(keyboardButtonProto2, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                                org.telegram.ui.Components.s4.p0(unVar2, tL_messages_botCallbackAnswer.url, false, false);
                                return;
                            }
                            TLRPC.MessageMedia messageMedia = jjVar6.k.media;
                            TLRPC.TL_game tL_game = messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game : null;
                            if (tL_game == null) {
                                return;
                            }
                            unVar2.fc(tL_game, jjVar6, tL_messages_botCallbackAnswer.url, !z18 && m5.w("askgame_", Z0, vp.r1(qzVar3.currentAccount).e7, true), Z0);
                            return;
                        }
                        if (tL_messages_botCallbackAnswer.alert) {
                            if (unVar2.getParentActivity() == null) {
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(unVar2.getParentActivity());
                            alertDialog$Builder3.a.R = str4;
                            alertDialog$Builder3.k(cd.L0(2131747847, null), null);
                            String str7 = tL_messages_botCallbackAnswer.message;
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder3.a;
                            x1Var.T = str7;
                            unVar2.showDialog(x1Var);
                            return;
                        }
                        if (unVar2.b3 == null && unVar2.a1 != null && unVar2.getParentActivity() != null) {
                            FrameLayout frameLayout = new FrameLayout(unVar2.getParentActivity());
                            unVar2.b3 = frameLayout;
                            unVar2.a1.addView(frameLayout, w7.b6.o(-1, 48));
                            unVar2.a1.h(11, unVar2.b3);
                            unVar2.a1.g(unVar2.b3);
                            TextView textView5 = new TextView(unVar2.getParentActivity());
                            unVar2.d3 = textView5;
                            textView5.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.a7.V(unVar2.d3, org.telegram.ui.ActionBar.t6.Te, unVar2.getResourceProvider());
                            unVar2.d3.setTypeface(i0.o());
                            unVar2.d3.setSingleLine(true);
                            TextView textView6 = unVar2.d3;
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            textView6.setEllipsize(truncateAt);
                            unVar2.d3.setMaxLines(1);
                            unVar2.b3.addView(unVar2.d3, w7.b6.d(-2, -2.0f, 51, 8.0f, 5.0f, 8.0f, 0.0f));
                            TextView textView7 = new TextView(unVar2.getParentActivity());
                            unVar2.e3 = textView7;
                            textView7.setTextSize(1, 14.0f);
                            org.telegram.ui.ActionBar.a7.V(unVar2.e3, org.telegram.ui.ActionBar.t6.Ue, unVar2.getResourceProvider());
                            unVar2.e3.setSingleLine(true);
                            unVar2.e3.setEllipsize(truncateAt);
                            unVar2.e3.setMaxLines(1);
                            unVar2.b3.addView(unVar2.e3, w7.b6.d(-2, -2.0f, 51, 8.0f, 23.0f, 8.0f, 0.0f));
                        }
                        FrameLayout frameLayout2 = unVar2.b3;
                        if (frameLayout2 == null || (hgVar = unVar2.a1) == null) {
                            return;
                        }
                        hgVar.i(frameLayout2, true, true);
                        unVar2.d3.setText(str4);
                        unVar2.e3.setText(k6.m(str6.replace('\n', ' '), unVar2.e3.getPaint().getFontMetricsInt(), false, null, 0));
                        org.telegram.ui.ci ciVar = unVar2.c3;
                        if (ciVar != null) {
                            i0.r(ciVar);
                        }
                        org.telegram.ui.ci ciVar2 = new org.telegram.ui.ci(unVar2, 0);
                        unVar2.c3 = ciVar2;
                        i0.h3(ciVar2, 3000L);
                    }
                });
                break;
        }
    }

    public /* synthetic */ zx(qz qzVar, TLObject tLObject, jj jjVar, String str, cz czVar, boolean z10, cz czVar2, Object obj, HashMap hashMap, boolean z11, TLRPC.Message message) {
        this.b = qzVar;
        this.c = tLObject;
        this.d = jjVar;
        this.e = str;
        this.f = czVar;
        this.g = z10;
        this.h = czVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z11;
        this.l = message;
    }

    public /* synthetic */ zx(qz qzVar, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject, jj jjVar, String str, cz czVar, boolean z10, cz czVar2, Object obj, HashMap hashMap, boolean z11) {
        this.b = qzVar;
        this.l = tL_messages_addPollAnswer;
        this.c = tLObject;
        this.d = jjVar;
        this.e = str;
        this.f = czVar;
        this.g = z10;
        this.h = czVar2;
        this.i = obj;
        this.j = hashMap;
        this.k = z11;
    }
}
