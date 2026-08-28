package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k6(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r10v5, types: [org.telegram.ui.ActionBar.o2] */
    /* JADX WARN: Type inference failed for: r15v19, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r18v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, org.telegram.ui.Components.r3] */
    /* JADX WARN: Type inference failed for: r1v52, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.User user;
        TLRPC.TL_webPage tL_webPage;
        boolean z10;
        String[] strArr;
        ArrayList arrayList;
        jr jrVar;
        ir irVar;
        int i9;
        long peerId;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        String str3;
        ?? r02;
        ViewGroup viewGroup;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 4;
        int i14 = -1;
        int i15 = 6;
        int i16 = 17;
        int i17 = 0;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                o6 o6Var = (o6) obj4;
                o6Var.getClass();
                ((q6) obj3).a(((float[]) obj2)[0]);
                if (((boolean[]) obj)[0]) {
                    o6Var.d.v0(true);
                    break;
                }
                break;
            case 1:
                o6 o6Var2 = (o6) obj4;
                long[] jArr = (long[]) obj3;
                n6 n6Var = (n6) obj2;
                if (!((boolean[]) obj)[0]) {
                    jArr[0] = System.currentTimeMillis();
                    o6Var2.d.showDialog(n6Var);
                    break;
                }
                break;
            case 2:
                g8.T((g8) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (Calendar) obj);
                break;
            case 3:
                ma.T((ma) obj4, (org.telegram.ui.ActionBar.c2) obj3, (TLRPC.TL_error) obj2, (TL_account.updateUsername) obj);
                break;
            case 4:
                qn qnVar = (qn) obj4;
                ?? r10 = (org.telegram.ui.ActionBar.o2) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) obj;
                if (r10 instanceof NotificationCenter.NotificationCenterDelegate) {
                    qnVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r10, NotificationCenter.closeChats);
                }
                qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) b5Var).c(b5Var.getFragmentStack().size() - 1, new qn(bundle));
                r10.finishFragment();
                break;
            case 5:
                qn qnVar2 = (qn) obj4;
                TLObject tLObject = (TLObject) obj2;
                gh.i2 i2Var = (gh.i2) obj;
                ((ve.d) obj3).b();
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    qnVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    qnVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = qnVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        i2Var.run(user);
                        break;
                    }
                }
                user = null;
                i2Var.run(user);
            case 6:
                ImageView imageView = (ImageView) obj3;
                ImageView imageView2 = (ImageView) obj2;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj)[0]) {
                    imageView = imageView2;
                }
                org.telegram.ui.Components.fr frVar = (org.telegram.ui.Components.fr) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new f3(frVar, 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
                ofFloat.start();
                break;
            case 7:
                qn qnVar3 = (qn) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                boolean[] zArr = (boolean[]) obj;
                try {
                    tL_webPage = org.telegram.ui.Components.z80.f(messageObject2);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                    FileLog.e(th);
                    tL_webPage = null;
                }
                AndroidUtilities.runOnUIThread(new h3.p1(qnVar3, c2Var, zArr, th == null && tL_webPage != null, messageObject2, tL_webPage, 8));
                break;
            case 8:
                qn qnVar4 = (qn) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        qnVar4.h6 = messages_messages.count;
                        z10 = false;
                    } else {
                        z10 = false;
                        qnVar4.h6 = 0;
                    }
                    messagesStorage.resetMentionsCount(qnVar4.P5, qnVar4.b(), qnVar4.h6);
                    int i18 = qnVar4.h6;
                    if (i18 == 0) {
                        qnVar4.i6 = true;
                        qnVar4.Kb(z10);
                        break;
                    } else {
                        qnVar4.f1.c(2, i18, true);
                        qnVar4.H9();
                        break;
                    }
                } else {
                    int i19 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) qnVar4.k6[0].get(i19);
                    messagesStorage.markMessageAsMention(qnVar4.P5, i19);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    qnVar4.j(i19, 0, false, 0, true, 0);
                    break;
                }
                break;
            case 9:
                qn.m0((qn) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (l6) obj);
                break;
            case 10:
                hp.V((hp) obj4, (org.telegram.ui.ActionBar.c2[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.o2) obj);
                break;
            case 11:
                bq bqVar = (bq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                bqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.l0(password);
                    bqVar.o0(twoStepVerificationActivity.k0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 12:
                jr jrVar2 = (jr) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                lq lqVar = (lq) obj;
                if (!(tLObject3 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject3 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    lqVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jrVar2.getParentActivity());
                    String string = LocaleController.getString("AppName", R.string.AppName);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
                    c2Var2.N = string;
                    c2Var2.P = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new b1(lqVar, 23));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    jrVar2.showDialog(c2Var2);
                    break;
                }
                break;
            case 13:
                ir irVar2 = (ir) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                jr jrVar3 = irVar2.y;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new hr(irVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList()));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i20 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i20];
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
                        int i21 = 0;
                        while (i21 < size) {
                            TLObject tLObject4 = (TLObject) arrayList2.get(i21);
                            if (tLObject4 instanceof TLRPC.ChatParticipant) {
                                strArr = strArr3;
                                arrayList = arrayList2;
                                peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                            } else {
                                strArr = strArr3;
                                arrayList = arrayList2;
                                if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                                } else {
                                    jrVar = jrVar3;
                                    irVar = irVar2;
                                    i9 = size;
                                    i21++;
                                    arrayList2 = arrayList;
                                    strArr3 = strArr;
                                    size = i9;
                                    jrVar3 = jrVar;
                                    irVar2 = irVar;
                                }
                            }
                            if (peerId > 0) {
                                TLRPC.User user3 = jrVar3.getMessagesController().getUser(Long.valueOf(peerId));
                                i9 = size;
                                if (user3.id == jrVar3.getUserConfig().getClientUserId()) {
                                    jrVar = jrVar3;
                                    irVar = irVar2;
                                    i21++;
                                    arrayList2 = arrayList;
                                    strArr3 = strArr;
                                    size = i9;
                                    jrVar3 = jrVar;
                                    irVar2 = irVar;
                                } else {
                                    lowerCase = UserObject.getUserName(user3).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user3);
                                    str = user3.first_name;
                                    str2 = user3.last_name;
                                }
                            } else {
                                i9 = size;
                                TLRPC.Chat chat = jrVar3.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str = chat.title;
                                str2 = null;
                            }
                            jrVar = jrVar3;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            irVar = irVar2;
                            int i22 = 0;
                            boolean z11 = false;
                            while (true) {
                                if (i22 < i20) {
                                    int i23 = i22;
                                    String str4 = strArr[i23];
                                    if (lowerCase.startsWith(str4) || org.telegram.messenger.l0.w(" ", str4, lowerCase) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.l0.w(" ", str4, translitString2)))) {
                                        str3 = translitString2;
                                        r02 = 1;
                                    } else if (publicUsername == null || !publicUsername.startsWith(str4)) {
                                        boolean z12 = z11;
                                        str3 = translitString2;
                                        r02 = z12;
                                    } else {
                                        str3 = translitString2;
                                        r02 = 2;
                                    }
                                    if (r02 != 0) {
                                        if (r02 == 1) {
                                            arrayList5.add(AndroidUtilities.generateSearchName(str, str2, str4));
                                        } else {
                                            arrayList5.add(AndroidUtilities.generateSearchName(ta.b.d("@", publicUsername), null, "@" + str4));
                                        }
                                        arrayList6.add(tLObject4);
                                    } else {
                                        String str5 = lowerCase;
                                        i22 = i23 + 1;
                                        String str6 = str3;
                                        z11 = r02;
                                        translitString2 = str6;
                                        lowerCase = str5;
                                    }
                                }
                            }
                            i21++;
                            arrayList2 = arrayList;
                            strArr3 = strArr;
                            size = i9;
                            jrVar3 = jrVar;
                            irVar2 = irVar;
                        }
                    }
                    jr jrVar4 = jrVar3;
                    ir irVar3 = irVar2;
                    String[] strArr4 = strArr3;
                    if (arrayList3 != null) {
                        for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                            TLRPC.User user4 = jrVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i24)).user_id));
                            if (user4.id != jrVar4.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                if (lowerCase3.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                char c10 = 0;
                                int i25 = 0;
                                while (true) {
                                    if (i25 < i20) {
                                        String str7 = strArr4[i25];
                                        if (lowerCase3.startsWith(str7) || org.telegram.messenger.l0.w(" ", str7, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str7) || org.telegram.messenger.l0.w(" ", str7, translitString3)))) {
                                            c10 = 1;
                                        } else {
                                            String publicUsername2 = UserObject.getPublicUsername(user4);
                                            if (publicUsername2 != null && publicUsername2.startsWith(str7)) {
                                                c10 = 2;
                                            }
                                        }
                                        if (c10 != 0) {
                                            if (c10 == 1) {
                                                arrayList5.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str7));
                                            } else {
                                                arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str7));
                                            }
                                            arrayList4.add(user4);
                                            hVar.k(user4, user4.id);
                                        } else {
                                            i25++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new hr(irVar3, arrayList4, hVar, arrayList5, arrayList6));
                    break;
                }
                break;
            case 14:
                String str8 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.l((org.telegram.ui.Components.e0) obj4, (Context) obj2, str8, str8, (org.telegram.ui.ActionBar.b6) obj).show();
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                gh.p6 p6Var = (gh.p6) obj3;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj2;
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
                    p6Var.run(lowerCase4);
                    org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr[0];
                    if (c2Var3 != null) {
                        c2Var3.dismiss();
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
            case 16:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr5 = (String[]) obj2;
                ?? r15 = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i26 = 0;
                while (true) {
                    if (i26 < iArr.length) {
                        if (iArr2[0] == iArr[i26]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i26]);
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i26++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.arrows_select, 0);
                    eqVar.spaceScaleX = 0.7f;
                    eqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    eqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(R.drawable.mini_switch_lock, 0);
                    eqVar2.spaceScaleX = 0.7f;
                    eqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    eqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(eqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                r15.setText(spannableStringBuilder);
                break;
            case 17:
                ChatActivityEnterView.f((ChatActivityEnterView) obj4, (org.telegram.ui.Components.mu0) obj3, (int[]) obj2, (org.telegram.ui.Components.do0) obj);
                break;
            case 18:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj;
                long j10 = jnVar.R;
                final org.telegram.ui.Components.g1 g1Var = new org.telegram.ui.Components.g1(16, jnVar, (View) obj2);
                org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(i15);
                int i27 = org.telegram.ui.ActionBar.f6.j5;
                int p02 = b6Var != null ? b6Var.p0(i27) : org.telegram.ui.ActionBar.f6.w0(null, i27, false);
                int i28 = org.telegram.ui.ActionBar.f6.h5;
                int p03 = b6Var != null ? b6Var.p0(i28) : org.telegram.ui.ActionBar.f6.w0(null, i28, false);
                int i29 = org.telegram.ui.ActionBar.f6.Ji;
                if (b6Var != null) {
                    b6Var.p0(i29);
                } else {
                    org.telegram.ui.ActionBar.f6.w0(null, i29, false);
                }
                int i30 = org.telegram.ui.ActionBar.f6.Ni;
                if (b6Var != null) {
                    b6Var.p0(i30);
                } else {
                    org.telegram.ui.ActionBar.f6.w0(null, i30, false);
                }
                int i31 = org.telegram.ui.ActionBar.f6.E8;
                if (b6Var != null) {
                    b6Var.p0(i31);
                } else {
                    org.telegram.ui.ActionBar.f6.w0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.f6.G8;
                if (b6Var != null) {
                    b6Var.p0(i32);
                } else {
                    org.telegram.ui.ActionBar.f6.w0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.f6.i6;
                if (b6Var != null) {
                    b6Var.p0(i33);
                } else {
                    org.telegram.ui.ActionBar.f6.w0(null, i33, false);
                }
                int i34 = org.telegram.ui.ActionBar.f6.Sh;
                int p04 = b6Var != null ? b6Var.p0(i34) : org.telegram.ui.ActionBar.f6.w0(null, i34, false);
                int i35 = org.telegram.ui.ActionBar.f6.Oh;
                int p05 = b6Var != null ? b6Var.p0(i35) : org.telegram.ui.ActionBar.f6.w0(null, i35, false);
                if (b6Var != null) {
                    b6Var.p0(org.telegram.ui.ActionBar.f6.Qh);
                } else {
                    org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.y4.a;
                if (context != null) {
                    final int i36 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, b6Var);
                    a3Var.a();
                    final org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(context, b6Var);
                    bc0Var.setTextColor(p02);
                    bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    bc0Var.setItemCount(5);
                    final org.telegram.ui.Components.x3 x3Var = new org.telegram.ui.Components.x3(context, b6Var);
                    x3Var.setWrapSelectorWheel(true);
                    x3Var.setAllItemsCount(24);
                    x3Var.setItemCount(5);
                    x3Var.setTextColor(p02);
                    x3Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context, b6Var);
                    y3Var.setWrapSelectorWheel(true);
                    y3Var.setAllItemsCount(60);
                    y3Var.setItemCount(5);
                    y3Var.setTextColor(p02);
                    y3Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ?? frameLayout = new FrameLayout(context);
                    ?? r3Var = new org.telegram.ui.Components.r3(context, bc0Var, x3Var, y3Var, 2);
                    r3Var.setOrientation(1);
                    frameLayout.addView(r3Var, g7.e6.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context), g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    r3Var.addView(frameLayout2, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context);
                    textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView.setTextColor(p02);
                    textView.setTextSize(1, 20.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new jh.d(10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    r3Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q5, b6Var));
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    bg.t tVar = new bg.t(context, 17);
                    tVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    g7.g6.b(tVar, 0.02f, 1.2f);
                    linearLayout.addView(bc0Var, g7.e6.l(0.5f, 0, 270));
                    bc0Var.setMinValue(0);
                    bc0Var.setMaxValue(365);
                    bc0Var.setWrapSelectorWheel(false);
                    bc0Var.setFormatter(new tr(24));
                    fh.z2 z2Var = new fh.z2(i36, bc0Var, x3Var, y3Var, textView2);
                    bc0Var.setOnValueChangedListener(z2Var);
                    x3Var.setMinValue(0);
                    x3Var.setMaxValue(23);
                    int i37 = p03;
                    linearLayout.addView(x3Var, g7.e6.l(0.2f, 0, 270));
                    x3Var.setFormatter(new tr(25));
                    x3Var.setOnValueChangedListener(z2Var);
                    y3Var.setMinValue(0);
                    y3Var.setMaxValue(59);
                    y3Var.setValue(0);
                    y3Var.setFormatter(new tr(26));
                    linearLayout.addView(y3Var, g7.e6.l(0.3f, 0, 270));
                    y3Var.setOnValueChangedListener(z2Var);
                    if (j10 <= 0 || j10 == 2147483646) {
                        viewGroup = frameLayout;
                        i10 = p04;
                        i11 = p05;
                    } else {
                        viewGroup = frameLayout;
                        long j11 = j10 * 1000;
                        i10 = p04;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        i11 = p05;
                        int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j11);
                        if (timeInMillis >= 0) {
                            y3Var.setValue(calendar.get(12));
                            x3Var.setValue(calendar.get(11));
                            bc0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.y4.g(null, null, 0L, i36, 3, bc0Var, x3Var, y3Var);
                    org.telegram.ui.Components.y4.e(textView2, bc0Var, x3Var, y3Var);
                    tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    tVar.setGravity(17);
                    tVar.setTextColor(i10);
                    tVar.setTextSize(1, 14.0f);
                    tVar.setTypeface(AndroidUtilities.bold());
                    tVar.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{24.0f}, i11));
                    r3Var.addView(tVar, g7.e6.t(-1, 48, 83, 14, 15, 14, 16));
                    tVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            zArr2[0] = false;
                            long j12 = i36;
                            bc0 bc0Var2 = bc0Var;
                            x3 x3Var2 = x3Var;
                            y3 y3Var2 = y3Var;
                            boolean g10 = y4.g(null, null, 0L, j12, 3, bc0Var2, x3Var2, y3Var2);
                            y4.e(textView2, bc0Var2, x3Var2, y3Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, bc0Var2.getValue());
                            calendar2.set(11, x3Var2.getValue());
                            calendar2.set(12, y3Var2.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            g1Var.B((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            a3Var.a.dismissRunnable.run();
                        }
                    });
                    r3Var.addView(textView2, g7.e6.t(-1, -2, 83, 14, 0, 14, 16));
                    a3Var.b(viewGroup);
                    org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
                    f3Var.show();
                    f3Var.setOnDismissListener(new org.telegram.ui.Components.d2(0, hcVar, zArr2));
                    f3Var.setBackgroundColor(i37);
                    f3Var.fixNavigationBar(i37);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.rx rxVar = (org.telegram.ui.Components.rx) obj4;
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = (org.telegram.ui.ActionBar.c2[]) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) obj;
                rxVar.getClass();
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr2[0] = null;
                if (tLObject5 instanceof TLRPC.TL_emojiURL) {
                    ve.e.s(rxVar.c.a.B.getContext(), ((TLRPC.TL_emojiURL) tLObject5).url);
                    a3Var2.a.dismissRunnable.run();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.py pyVar = (org.telegram.ui.Components.py) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList7 = pyVar.s;
                org.telegram.ui.Components.ry ryVar = pyVar.w;
                if (ryVar.I == pyVar.b) {
                    ryVar.H = 0;
                    if (tL_messages_getStickers.emoticon.equals(pyVar.a)) {
                        if (!(tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                            int size2 = arrayList7.size();
                            int size3 = tL_messages_stickers.stickers.size();
                            while (i17 < size3) {
                                TLRPC.Document document = tL_messages_stickers.stickers.get(i17);
                                if (pyVar.v.indexOfKey(document.id) < 0) {
                                    arrayList7.add(document);
                                }
                                i17++;
                            }
                            if (size2 != arrayList7.size()) {
                                pyVar.f.put(arrayList7, ryVar.J);
                                if (size2 == 0) {
                                    pyVar.h.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.n00 n00Var = (org.telegram.ui.Components.n00) obj4;
                TLObject tLObject7 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                n00Var.v0 = -1;
                org.telegram.ui.ActionBar.o2 o2Var = n00Var.n;
                n00.q0((TLRPC.TL_error) obj3, o2Var, org.telegram.ui.Components.oc.a0(o2Var));
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i14 = ((TL_update.TL_updateDialogFilter) update).id;
                            }
                        } else {
                            while (true) {
                                if (i17 < arrayList8.size()) {
                                    if (arrayList8.get(i17) instanceof TL_update.TL_updateDialogFilter) {
                                        i14 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i17)).id;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        }
                    }
                    if (n00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        o2Var.getMessagesController().loadRemoteFilters(true, new fh.v2(n00Var, callback, i14, i13));
                        break;
                    } else {
                        if (n00Var.W != null) {
                            o2Var.getMessagesController().checkChatlistFolderUpdate(n00Var.U, true);
                        }
                        n00Var.w0 = true;
                        n00Var.dismiss();
                        callback.run(Integer.valueOf(i14));
                        break;
                    }
                } else {
                    n00Var.h0.a(false);
                    break;
                }
            case 22:
                ((dy) obj4).w4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zq(i16, (df) obj2, (org.telegram.ui.ActionBar.o2) obj), 200L);
                break;
            case 23:
                org.telegram.ui.Components.b30.M((org.telegram.ui.Components.b30) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_channels_getParticipants) obj);
                break;
            case 24:
                org.telegram.ui.Components.p70.n((org.telegram.ui.Components.p70) obj4, (TLRPC.TL_error) obj3, (TLRPC.Updates) obj2, (TLRPC.TL_messages_importChatInvite) obj);
                break;
            case 25:
                org.telegram.ui.Components.e80 e80Var = (org.telegram.ui.Components.e80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject8 = (TLObject) obj;
                e80Var.y = false;
                e80Var.G = tL_chatInviteExported.link;
                if (tL_error2 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject8;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i17 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i17++;
                    }
                    e80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.k90 k90Var = (org.telegram.ui.Components.k90) obj4;
                ArrayList arrayList9 = (ArrayList) obj3;
                boolean[] zArr3 = (boolean[]) obj2;
                ((boolean[]) obj)[0] = true;
                AndroidUtilities.cancelRunOnUIThread(k90Var.Q);
                for (int i38 = 0; i38 < arrayList9.size(); i38++) {
                    ((TL_stories.StoryItem) arrayList9.get(i38)).pinned = zArr3[i38];
                }
                k90Var.getMessagesController().getStoriesController().n0(k90Var.e, arrayList9, false);
                break;
            case 27:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                kh.d dVar = (kh.d) obj3;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (tL_error3 != null) {
                    org.telegram.ui.Components.oc.X().d0(tL_error3, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    f3Var2.dismiss();
                    org.telegram.ui.Components.oc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                    runnable2.run();
                    break;
                }
            case 28:
                dy dyVar = (dy) obj3;
                dyVar.showDialog(new n31((Context) obj2, dyVar.getResourceProvider(), new org.telegram.ui.Components.jg0(7, (org.telegram.ui.Components.an0) obj4, dyVar)));
                ((org.telegram.ui.Components.x60) obj).u();
                break;
            default:
                dy dyVar2 = (dy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.x60 x60Var = (org.telegram.ui.Components.x60) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.b6 resourceProvider = dyVar2.getResourceProvider();
                org.telegram.ui.Components.jg0 jg0Var = new org.telegram.ui.Components.jg0(i15, (org.telegram.ui.Components.an0) obj4, tL_sponsoredPeer);
                int i39 = y21.v;
                int currentAccount = dyVar2.getCurrentAccount();
                Activity parentActivity = dyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.zh(parentActivity, resourceProvider, bArr, dyVar2, jg0Var, currentAccount));
                }
                x60Var.u();
                break;
        }
    }

    public /* synthetic */ k6(Object obj, boolean[] zArr, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = zArr;
        this.d = obj2;
        this.e = obj3;
    }
}
