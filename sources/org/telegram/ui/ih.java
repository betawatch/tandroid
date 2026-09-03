package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ih(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r13v7, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r18v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, org.telegram.ui.Components.s3] */
    /* JADX WARN: Type inference failed for: r4v15, types: [org.telegram.ui.ActionBar.c3] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        pr prVar;
        String[] strArr;
        long peerId;
        ArrayList arrayList;
        int i10;
        qr qrVar;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        String str3;
        ?? r92;
        int i11;
        int i12 = this.a;
        int i13 = -1;
        int i14 = 3;
        int i15 = 11;
        int i16 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                xn xnVar = (xn) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        xnVar.i6 = messages_messages.count;
                        z4 = false;
                    } else {
                        z4 = false;
                        xnVar.i6 = 0;
                    }
                    messagesStorage.resetMentionsCount(xnVar.Q5, xnVar.b(), xnVar.i6);
                    int i17 = xnVar.i6;
                    if (i17 == 0) {
                        xnVar.j6 = true;
                        xnVar.Kb(z4);
                        break;
                    } else {
                        xnVar.g1.c(2, i17, true);
                        xnVar.H9();
                        break;
                    }
                } else {
                    int i18 = messages_messages.messages.get(0).id;
                    MessageObject messageObject = (MessageObject) xnVar.l6[0].get(i18);
                    messagesStorage.markMessageAsMention(xnVar.Q5, i18);
                    if (messageObject != null) {
                        TLRPC.Message message = messageObject.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    xnVar.j(i18, 0, false, 0, true, 0);
                    break;
                }
                break;
            case 1:
                xn.n0((xn) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (p6) obj);
                break;
            case 2:
                rp.W((rp) obj4, (org.telegram.ui.ActionBar.d2[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.p2) obj);
                break;
            case 3:
                kq kqVar = (kq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                kqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    kqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 4:
                qr qrVar2 = (qr) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                uq uqVar = (uq) obj;
                if (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    uqVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qrVar2.getParentActivity());
                    String string = LocaleController.getString("AppName", R.string.AppName);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new a1(uqVar, 23));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    qrVar2.showDialog(d2Var);
                    break;
                }
                break;
            case 5:
                pr prVar2 = (pr) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                qr qrVar3 = prVar2.y;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new hg.j0(prVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 27));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i19 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i19];
                    strArr2[0] = lowerCase2;
                    if (translitString != null) {
                        strArr2[1] = translitString;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    ArrayList arrayList5 = new ArrayList();
                    String[] strArr3 = strArr2;
                    ArrayList arrayList6 = new ArrayList();
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i20 = 0;
                        while (i20 < size) {
                            TLObject tLObject3 = (TLObject) arrayList2.get(i20);
                            if (tLObject3 instanceof TLRPC.ChatParticipant) {
                                prVar = prVar2;
                                strArr = strArr3;
                                peerId = ((TLRPC.ChatParticipant) tLObject3).user_id;
                            } else {
                                prVar = prVar2;
                                strArr = strArr3;
                                if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject3).peer);
                                }
                                qrVar = qrVar3;
                                i10 = size;
                                arrayList = arrayList2;
                                i20++;
                                prVar2 = prVar;
                                strArr3 = strArr;
                                qrVar3 = qrVar;
                                size = i10;
                                arrayList2 = arrayList;
                            }
                            if (peerId > 0) {
                                TLRPC.User user2 = qrVar3.getMessagesController().getUser(Long.valueOf(peerId));
                                if (user2.id != qrVar3.getUserConfig().getClientUserId()) {
                                    lowerCase = UserObject.getUserName(user2).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user2);
                                    qrVar = qrVar3;
                                    str = user2.first_name;
                                    str2 = user2.last_name;
                                }
                                qrVar = qrVar3;
                                i10 = size;
                                arrayList = arrayList2;
                                i20++;
                                prVar2 = prVar;
                                strArr3 = strArr;
                                qrVar3 = qrVar;
                                size = i10;
                                arrayList2 = arrayList;
                            } else {
                                qrVar = qrVar3;
                                TLRPC.Chat chat = qrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str = chat.title;
                                str2 = null;
                            }
                            i10 = size;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            arrayList = arrayList2;
                            int i21 = 0;
                            boolean z10 = false;
                            while (true) {
                                if (i21 < i19) {
                                    int i22 = i21;
                                    String str4 = strArr[i22];
                                    if (lowerCase.startsWith(str4) || org.telegram.messenger.y3.w(" ", str4, lowerCase) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.y3.w(" ", str4, translitString2)))) {
                                        str3 = lowerCase;
                                        r92 = 1;
                                    } else if (publicUsername == null || !publicUsername.startsWith(str4)) {
                                        boolean z11 = z10;
                                        str3 = lowerCase;
                                        r92 = z11;
                                    } else {
                                        str3 = lowerCase;
                                        r92 = 2;
                                    }
                                    if (r92 != 0) {
                                        if (r92 == 1) {
                                            arrayList5.add(AndroidUtilities.generateSearchName(str, str2, str4));
                                        } else {
                                            arrayList5.add(AndroidUtilities.generateSearchName(yh.k("@", publicUsername), null, "@" + str4));
                                        }
                                        arrayList6.add(tLObject3);
                                    } else {
                                        String str5 = translitString2;
                                        i21 = i22 + 1;
                                        String str6 = str3;
                                        z10 = r92;
                                        lowerCase = str6;
                                        translitString2 = str5;
                                    }
                                }
                            }
                            i20++;
                            prVar2 = prVar;
                            strArr3 = strArr;
                            qrVar3 = qrVar;
                            size = i10;
                            arrayList2 = arrayList;
                        }
                    }
                    qr qrVar4 = qrVar3;
                    pr prVar3 = prVar2;
                    String[] strArr4 = strArr3;
                    if (arrayList3 != null) {
                        for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                            TLRPC.User user3 = qrVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i23)).user_id));
                            if (user3.id != qrVar4.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user3).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                if (lowerCase3.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                int i24 = 0;
                                char c3 = 0;
                                while (true) {
                                    if (i24 < i19) {
                                        String str7 = strArr4[i24];
                                        if (lowerCase3.startsWith(str7) || org.telegram.messenger.y3.w(" ", str7, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str7) || org.telegram.messenger.y3.w(" ", str7, translitString3)))) {
                                            c3 = 1;
                                        } else {
                                            String publicUsername2 = UserObject.getPublicUsername(user3);
                                            if (publicUsername2 != null && publicUsername2.startsWith(str7)) {
                                                c3 = 2;
                                            }
                                        }
                                        if (c3 != 0) {
                                            if (c3 == 1) {
                                                arrayList5.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str7));
                                            } else {
                                                arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user3), null, "@" + str7));
                                            }
                                            arrayList4.add(user3);
                                            hVar.k(user3, user3.id);
                                        } else {
                                            i24++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new hg.j0(prVar3, arrayList4, hVar, arrayList5, arrayList6, 27));
                    break;
                }
                break;
            case 6:
                String str8 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.m((org.telegram.ui.Components.f0) obj4, (Context) obj2, str8, str8, (org.telegram.ui.ActionBar.g6) obj).show();
                break;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                mh.m6 m6Var = (mh.m6) obj3;
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj2;
                View view = (View) obj;
                String trim = editTextBoldCursor.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase4 = parse.getHost().toLowerCase();
                    if (lowerCase4.startsWith("www.")) {
                        lowerCase4 = lowerCase4.substring(4);
                    }
                    m6Var.run(lowerCase4);
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                    if (d2Var2 != null) {
                        d2Var2.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        break;
                    }
                } else {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    break;
                }
                break;
            case 8:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr5 = (String[]) obj2;
                ?? r13 = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i25 = 0;
                while (true) {
                    if (i25 < iArr.length) {
                        if (iArr2[0] == iArr[i25]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i25]);
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i25++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.arrows_select, 0);
                    oqVar.spaceScaleX = 0.7f;
                    oqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    oqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.oq oqVar2 = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                    oqVar2.spaceScaleX = 0.7f;
                    oqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    oqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(oqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                r13.setText(spannableStringBuilder);
                break;
            case 9:
                ChatActivityEnterView.f((ChatActivityEnterView) obj4, (org.telegram.ui.Components.fv0) obj3, (int[]) obj2, (org.telegram.ui.Components.yo0) obj);
                break;
            case 10:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                long j10 = rnVar.S;
                final org.telegram.ui.Components.o1 o1Var = new org.telegram.ui.Components.o1(15, rnVar, (View) obj2);
                org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(6);
                int i26 = org.telegram.ui.ActionBar.k6.j5;
                int e02 = g6Var != null ? g6Var.e0(i26) : org.telegram.ui.ActionBar.k6.w0(null, i26, false);
                int i27 = org.telegram.ui.ActionBar.k6.h5;
                int e03 = g6Var != null ? g6Var.e0(i27) : org.telegram.ui.ActionBar.k6.w0(null, i27, false);
                int i28 = org.telegram.ui.ActionBar.k6.Ji;
                if (g6Var != null) {
                    g6Var.e0(i28);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, i28, false);
                }
                int i29 = org.telegram.ui.ActionBar.k6.Ni;
                if (g6Var != null) {
                    g6Var.e0(i29);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.k6.E8;
                if (g6Var != null) {
                    g6Var.e0(i30);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.k6.G8;
                if (g6Var != null) {
                    g6Var.e0(i31);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.k6.i6;
                if (g6Var != null) {
                    g6Var.e0(i32);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.k6.Sh;
                int e04 = g6Var != null ? g6Var.e0(i33) : org.telegram.ui.ActionBar.k6.w0(null, i33, false);
                int i34 = org.telegram.ui.ActionBar.k6.Oh;
                int e05 = g6Var != null ? g6Var.e0(i34) : org.telegram.ui.ActionBar.k6.w0(null, i34, false);
                if (g6Var != null) {
                    g6Var.e0(org.telegram.ui.ActionBar.k6.Qh);
                } else {
                    org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.z4.a;
                if (context != null) {
                    int i35 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final ?? c3Var = new org.telegram.ui.ActionBar.c3(context, g6Var);
                    c3Var.a();
                    final org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(context, g6Var);
                    yc0Var.setTextColor(e02);
                    yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    yc0Var.setItemCount(5);
                    final org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context, g6Var);
                    y3Var.setWrapSelectorWheel(true);
                    y3Var.setAllItemsCount(24);
                    y3Var.setItemCount(5);
                    y3Var.setTextColor(e02);
                    y3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final org.telegram.ui.Components.z3 z3Var = new org.telegram.ui.Components.z3(context, g6Var);
                    z3Var.setWrapSelectorWheel(true);
                    z3Var.setAllItemsCount(60);
                    z3Var.setItemCount(5);
                    z3Var.setTextColor(e02);
                    z3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ?? frameLayout = new FrameLayout(context);
                    ?? s3Var = new org.telegram.ui.Components.s3(context, yc0Var, y3Var, z3Var, 2);
                    s3Var.setOrientation(1);
                    frameLayout.addView(s3Var, k7.c6.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context), k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    s3Var.addView(frameLayout2, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context);
                    textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView.setTextColor(e02);
                    textView.setTextSize(1, 20.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    s3Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.q5, g6Var));
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    hg.q qVar = new hg.q(context, 15);
                    qVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    k7.e6.b(qVar, 0.02f, 1.2f);
                    linearLayout.addView(yc0Var, k7.c6.l(0.5f, 0, 270));
                    yc0Var.setMinValue(0);
                    yc0Var.setMaxValue(365);
                    yc0Var.setWrapSelectorWheel(false);
                    yc0Var.setFormatter(new as(23));
                    eg.j3 j3Var = new eg.j3(i35, yc0Var, y3Var, z3Var, textView2);
                    yc0Var.setOnValueChangedListener(j3Var);
                    y3Var.setMinValue(0);
                    y3Var.setMaxValue(23);
                    int i36 = e03;
                    linearLayout.addView(y3Var, k7.c6.l(0.2f, 0, 270));
                    y3Var.setFormatter(new as(24));
                    y3Var.setOnValueChangedListener(j3Var);
                    z3Var.setMinValue(0);
                    z3Var.setMaxValue(59);
                    z3Var.setValue(0);
                    z3Var.setFormatter(new as(25));
                    linearLayout.addView(z3Var, k7.c6.l(0.3f, 0, 270));
                    z3Var.setOnValueChangedListener(j3Var);
                    if (j10 <= 0 || j10 == 2147483646) {
                        i11 = i35;
                    } else {
                        long j11 = 1000 * j10;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        i11 = i35;
                        int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j11);
                        if (timeInMillis >= 0) {
                            z3Var.setValue(calendar.get(12));
                            y3Var.setValue(calendar.get(11));
                            yc0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr = {true};
                    org.telegram.ui.Components.z4.g(null, null, 0L, i11, 3, yc0Var, y3Var, z3Var);
                    org.telegram.ui.Components.z4.e(textView2, yc0Var, y3Var, z3Var);
                    qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    qVar.setGravity(17);
                    qVar.setTextColor(e04);
                    qVar.setTextSize(1, 14.0f);
                    qVar.setTypeface(AndroidUtilities.bold());
                    qVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{24.0f}, e05));
                    s3Var.addView(qVar, k7.c6.t(-1, 48, 83, 14, 15, 14, 16));
                    final int i37 = i11;
                    qVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.e2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            zArr[0] = false;
                            long j12 = i37;
                            yc0 yc0Var2 = yc0Var;
                            y3 y3Var2 = y3Var;
                            z3 z3Var2 = z3Var;
                            boolean g10 = z4.g(null, null, 0L, j12, 3, yc0Var2, y3Var2, z3Var2);
                            z4.e(textView2, yc0Var2, y3Var2, z3Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, yc0Var2.getValue());
                            calendar2.set(11, y3Var2.getValue());
                            calendar2.set(12, z3Var2.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            o1Var.I((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            c3Var.a.dismissRunnable.run();
                        }
                    });
                    s3Var.addView(textView2, k7.c6.t(-1, -2, 83, 14, 0, 14, 16));
                    c3Var.b(frameLayout);
                    org.telegram.ui.ActionBar.h3 h3Var = c3Var.a;
                    h3Var.show();
                    h3Var.setOnDismissListener(new org.telegram.ui.Components.f2(0, jcVar, zArr));
                    h3Var.setBackgroundColor(i36);
                    h3Var.fixNavigationBar(i36);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.hy hyVar = (org.telegram.ui.Components.hy) obj4;
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = (org.telegram.ui.ActionBar.d2[]) obj2;
                TLObject tLObject4 = (TLObject) obj3;
                org.telegram.ui.ActionBar.c3 c3Var2 = (org.telegram.ui.ActionBar.c3) obj;
                hyVar.getClass();
                try {
                    d2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                d2VarArr2[0] = null;
                if (tLObject4 instanceof TLRPC.TL_emojiURL) {
                    af.g.s(hyVar.c.a.C.getContext(), ((TLRPC.TL_emojiURL) tLObject4).url);
                    c3Var2.a.dismissRunnable.run();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.fz fzVar = (org.telegram.ui.Components.fz) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj2;
                TLObject tLObject5 = (TLObject) obj3;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList7 = fzVar.s;
                org.telegram.ui.Components.hz hzVar = fzVar.w;
                if (hzVar.J == fzVar.b) {
                    hzVar.I = 0;
                    if (tL_messages_getStickers.emoticon.equals(fzVar.a)) {
                        if (!(tLObject5 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject5;
                            int size2 = arrayList7.size();
                            int size3 = tL_messages_stickers.stickers.size();
                            while (i16 < size3) {
                                TLRPC.Document document = tL_messages_stickers.stickers.get(i16);
                                if (fzVar.v.indexOfKey(document.id) < 0) {
                                    arrayList7.add(document);
                                }
                                i16++;
                            }
                            if (size2 != arrayList7.size()) {
                                fzVar.f.put(arrayList7, hzVar.K);
                                if (size2 == 0) {
                                    fzVar.h.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                d10Var.w0 = -1;
                org.telegram.ui.ActionBar.p2 p2Var = d10Var.n;
                b10.r0((TLRPC.TL_error) obj2, p2Var, org.telegram.ui.Components.qc.a0(p2Var));
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i13 = ((TL_update.TL_updateDialogFilter) update).id;
                            }
                        } else {
                            while (true) {
                                if (i16 < arrayList8.size()) {
                                    if (arrayList8.get(i16) instanceof TL_update.TL_updateDialogFilter) {
                                        i13 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i16)).id;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                        }
                    }
                    if (d10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        p2Var.getMessagesController().loadRemoteFilters(true, new eg.h3(d10Var, callback, i13, i14));
                        break;
                    } else {
                        if (d10Var.X != null) {
                            p2Var.getMessagesController().checkChatlistFolderUpdate(d10Var.V, true);
                        }
                        d10Var.x0 = true;
                        d10Var.dismiss();
                        callback.run(Integer.valueOf(i13));
                        break;
                    }
                } else {
                    d10Var.i0.a(false);
                    break;
                }
            case 14:
                ((py) obj4).w4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.eo(21, (org.telegram.ui.Components.xk) obj2, (org.telegram.ui.ActionBar.p2) obj), 200L);
                break;
            case 15:
                org.telegram.ui.Components.v30.N((org.telegram.ui.Components.v30) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_channels_getParticipants) obj);
                break;
            case 16:
                org.telegram.ui.Components.j80.n((org.telegram.ui.Components.j80) obj4, (TLRPC.TL_error) obj2, (TLRPC.Updates) obj3, (TLRPC.TL_messages_importChatInvite) obj);
                break;
            case 17:
                org.telegram.ui.Components.y80 y80Var = (org.telegram.ui.Components.y80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject7 = (TLObject) obj3;
                y80Var.y = false;
                y80Var.H = tL_chatInviteExported.link;
                if (tL_error2 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject7;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i16 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i16++;
                    }
                    y80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.fa0 fa0Var = (org.telegram.ui.Components.fa0) obj4;
                ArrayList arrayList9 = (ArrayList) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(fa0Var.R);
                for (int i38 = 0; i38 < arrayList9.size(); i38++) {
                    ((TL_stories.StoryItem) arrayList9.get(i38)).pinned = zArr2[i38];
                }
                fa0Var.getMessagesController().getStoriesController().n0(fa0Var.e, arrayList9, false);
                break;
            case 19:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                qh.d dVar = (qh.d) obj4;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj3;
                Runnable runnable2 = (Runnable) obj;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.qc.X().d0(tL_error3, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    h3Var2.dismiss();
                    org.telegram.ui.Components.qc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                    runnable2.run();
                    break;
                }
            case 20:
                py pyVar = (py) obj3;
                pyVar.showDialog(new g41((Context) obj2, pyVar.getResourceProvider(), new org.telegram.ui.Components.b90(i15, (org.telegram.ui.Components.wn0) obj4, pyVar)));
                ((org.telegram.ui.Components.q70) obj).u();
                break;
            case 21:
                py pyVar2 = (py) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.q70 q70Var = (org.telegram.ui.Components.q70) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.g6 resourceProvider = pyVar2.getResourceProvider();
                org.telegram.ui.Components.b90 b90Var = new org.telegram.ui.Components.b90(10, (org.telegram.ui.Components.wn0) obj4, tL_sponsoredPeer);
                int i39 = q31.v;
                int currentAccount = pyVar2.getCurrentAccount();
                Activity parentActivity = pyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.li(parentActivity, resourceProvider, bArr, pyVar2, b90Var, currentAccount));
                }
                q70Var.u();
                break;
            case 22:
                org.telegram.ui.Components.lq0.m((org.telegram.ui.Components.lq0) obj4, (AtomicReference) obj3, (org.telegram.ui.Components.sp0) obj2, (TLRPC.Dialog) obj);
                break;
            case 23:
                org.telegram.ui.Components.xx0.E((org.telegram.ui.Components.xx0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (MediaDataController) obj);
                break;
            case 24:
                org.telegram.ui.Components.xx0.o((cs0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_messages_getAttachedStickers) obj);
                break;
            case 25:
                org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                try {
                    ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(j01Var.d).performLogout(0);
                    break;
                } else if (tL_error4 == null || tL_error4.code != -1000) {
                    String string2 = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error4 != null) {
                        StringBuilder f10 = w.c.f(string2, "\n");
                        f10.append(tL_error4.text);
                        string2 = f10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(j01Var.getContext());
                    String string3 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder2.a;
                    d2Var3.O = string3;
                    d2Var3.Q = string2;
                    l.d.C(R.string.OK, alertDialog$Builder2, null);
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) obj4;
                ((org.telegram.ui.Components.q70) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-w21Var.c, ((TLRPC.TL_forumTopic) obj).id, !r13.pinned, w21Var.h);
                break;
            case 27:
                org.telegram.ui.Components.v31.n((org.telegram.ui.Components.v31) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_textWithEntities) obj);
                break;
            case 28:
                d60 d60Var = (d60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = d60Var.d;
                ChatObject.Call call = new ChatObject.Call();
                d60Var.X0 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = d60Var.X0;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                call2.chatId = chat2 == null ? 0L : chat2.id;
                groupCall.schedule_date = d60Var.h2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = d60Var.X0;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                call3.createNoVideoParticipant();
                org.telegram.ui.Components.u20 u20Var = d60Var.m2;
                ChatObject.Call call4 = d60Var.X0;
                u20Var.c = call4;
                d60Var.X1.setGroupCall(call4);
                d60Var.l2.c = d60Var.X0;
                d60Var.Z.C0(accountInstance.getCurrentAccount(), d60Var.X0.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = d60Var.X0;
                messagesController.putGroupCall(call5.chatId, call5);
                break;
            default:
                d60.w((d60) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ ih(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = tLObject;
        this.e = obj3;
    }

    public /* synthetic */ ih(TLRPC.TL_error tL_error, qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, Runnable runnable) {
        this.a = 19;
        this.d = tL_error;
        this.b = dVar;
        this.c = h3Var;
        this.e = runnable;
    }

    public /* synthetic */ ih(org.telegram.ui.Components.y80 y80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = 17;
        this.b = y80Var;
        this.e = tL_chatInviteExported;
        this.d = tL_error;
        this.c = tLObject;
    }

    public /* synthetic */ ih(org.telegram.ui.Components.j01 j01Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 25;
        this.b = j01Var;
        this.e = d2Var;
        this.c = tLObject;
        this.d = tL_error;
    }
}
