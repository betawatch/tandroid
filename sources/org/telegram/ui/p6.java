package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p6(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    private final void a() {
        org.telegram.ui.Components.e40.O((org.telegram.ui.Components.e40) this.b, (TLRPC.TL_error) this.d, (TLObject) this.e, (TLRPC.TL_channels_getParticipants) this.c);
    }

    private final void b() {
        org.telegram.ui.Components.g90.o((org.telegram.ui.Components.g90) this.b, (TLRPC.TL_error) this.d, (TLRPC.Updates) this.e, (TLRPC.TL_messages_importChatInvite) this.c);
    }

    private final void c() {
        org.telegram.ui.Components.w90 w90Var = (org.telegram.ui.Components.w90) this.b;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLObject tLObject = (TLObject) this.c;
        w90Var.y = false;
        w90Var.K = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            w90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    private final void d() {
        org.telegram.ui.Components.cb0 cb0Var = (org.telegram.ui.Components.cb0) this.b;
        boolean[] zArr = (boolean[]) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        zArr[0] = true;
        AndroidUtilities.cancelRunOnUIThread(cb0Var.U);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((TL_stories.StoryItem) arrayList.get(i10)).pinned = zArr2[i10];
        }
        cb0Var.getMessagesController().getStoriesController().n0(cb0Var.e, arrayList, false);
    }

    private final void f() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        di.d dVar = (di.d) this.d;
        org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.e;
        Runnable runnable = (Runnable) this.c;
        if (tL_error != null) {
            org.telegram.ui.Components.zc.X().f0(tL_error, false);
            return;
        }
        dVar.setLoading(false);
        e3Var.dismiss();
        org.telegram.ui.Components.zc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
        runnable.run();
    }

    private final void g() {
        org.telegram.ui.Components.so0 so0Var = (org.telegram.ui.Components.so0) this.b;
        yy yyVar = (yy) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) this.c;
        yyVar.showDialog(new b51(context, yyVar.getResourceProvider(), new org.telegram.ui.Components.f60(18, so0Var, yyVar)));
        m80Var.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.User user;
        TLRPC.TL_webPage tL_webPage;
        boolean z10;
        yr yrVar;
        String[] strArr;
        xr xrVar;
        ArrayList arrayList;
        int i10;
        int i11;
        long peerId;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        String str3;
        boolean z11;
        float f7;
        char c10;
        char c11;
        float f10;
        o1.k kVar;
        Dialog dialog;
        o1.k kVar2;
        FrameLayout frameLayout;
        Runnable runnable;
        int i12 = this.a;
        int i13 = 17;
        int i14 = 3;
        int i15 = -1;
        int i16 = 2;
        int i17 = 0;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                t6 t6Var = (t6) obj4;
                t6Var.getClass();
                ((v6) obj3).a(((float[]) obj2)[0]);
                if (((boolean[]) obj)[0]) {
                    t6Var.d.w0(true);
                    break;
                }
                break;
            case 1:
                t6 t6Var2 = (t6) obj4;
                long[] jArr = (long[]) obj3;
                s6 s6Var = (s6) obj2;
                if (!((boolean[]) obj)[0]) {
                    jArr[0] = System.currentTimeMillis();
                    t6Var2.d.showDialog(s6Var);
                    break;
                }
                break;
            case 2:
                l8.U((l8) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (Calendar) obj);
                break;
            case 3:
                va.U((va) obj4, (org.telegram.ui.ActionBar.a2) obj3, (TLRPC.TL_error) obj2, (TL_account.updateUsername) obj);
                break;
            case 4:
                fo foVar = (fo) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) obj;
                if (m2Var instanceof NotificationCenter.NotificationCenterDelegate) {
                    foVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) m2Var, NotificationCenter.closeChats);
                }
                foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) b5Var).c(b5Var.getFragmentStack().size() - 1, new fo(bundle));
                m2Var.finishFragment();
                break;
            case 5:
                fo foVar2 = (fo) obj4;
                TLObject tLObject = (TLObject) obj2;
                xa xaVar = (xa) obj;
                ((pf.c) obj3).b();
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    foVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    foVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = foVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        xaVar.run(user);
                        break;
                    }
                }
                user = null;
                xaVar.run(user);
            case 6:
                ImageView imageView = (ImageView) obj3;
                ImageView imageView2 = (ImageView) obj2;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj)[0]) {
                    imageView = imageView2;
                }
                org.telegram.ui.Components.ds dsVar = (org.telegram.ui.Components.ds) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e3(dsVar, 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(org.telegram.ui.Components.es.f);
                ofFloat.start();
                break;
            case 7:
                fo foVar3 = (fo) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                try {
                    tL_webPage = org.telegram.ui.Components.ra0.f(messageObject2);
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    FileLog.e(th);
                    tL_webPage = null;
                }
                AndroidUtilities.runOnUIThread(new i2.f1(foVar3, a2Var, zArr, th == null && tL_webPage != null, messageObject2, tL_webPage, 8));
                break;
            case 8:
                fo foVar4 = (fo) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        foVar4.l6 = messages_messages.count;
                        z10 = false;
                    } else {
                        z10 = false;
                        foVar4.l6 = 0;
                    }
                    messagesStorage.resetMentionsCount(foVar4.T5, foVar4.d(), foVar4.l6);
                    int i18 = foVar4.l6;
                    if (i18 == 0) {
                        foVar4.m6 = true;
                        foVar4.Ob(z10);
                        break;
                    } else {
                        foVar4.j1.c(2, i18, true);
                        foVar4.M9();
                        break;
                    }
                } else {
                    int i19 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) foVar4.o6[0].get(i19);
                    messagesStorage.markMessageAsMention(foVar4.T5, i19);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    foVar4.j(i19, 0, false, 0, true, 0);
                    break;
                }
                break;
            case 9:
                fo.I0((fo) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (q6) obj);
                break;
            case 10:
                aq.W((aq) obj4, (org.telegram.ui.ActionBar.a2[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.m2) obj);
                break;
            case 11:
                tq tqVar = (tq) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                tqVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    tqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 12:
                yr yrVar2 = (yr) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                dr drVar = (dr) obj;
                if (!(tLObject3 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject3 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    drVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yrVar2.getParentActivity());
                    String string = LocaleController.getString("AppName", R.string.AppName);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
                    a2Var2.R = string;
                    a2Var2.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new b1(drVar, 23));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    yrVar2.showDialog(a2Var2);
                    break;
                }
                break;
            case 13:
                xr xrVar2 = (xr) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                yr yrVar3 = xrVar2.y;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new bi.c3(xrVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 21));
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
                    String[] strArr3 = strArr2;
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i21 = 0;
                        while (i21 < size) {
                            TLObject tLObject4 = (TLObject) arrayList2.get(i21);
                            if (tLObject4 instanceof TLRPC.ChatParticipant) {
                                yrVar = yrVar3;
                                strArr = strArr3;
                                peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                            } else {
                                yrVar = yrVar3;
                                strArr = strArr3;
                                if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                                } else {
                                    xrVar = xrVar2;
                                    arrayList = arrayList2;
                                    i10 = size;
                                    i11 = i21;
                                    i21 = i11 + 1;
                                    size = i10;
                                    yrVar3 = yrVar;
                                    strArr3 = strArr;
                                    xrVar2 = xrVar;
                                    arrayList2 = arrayList;
                                }
                            }
                            if (peerId > 0) {
                                TLRPC.User user3 = yrVar.getMessagesController().getUser(Long.valueOf(peerId));
                                i10 = size;
                                i11 = i21;
                                if (user3.id == yrVar.getUserConfig().getClientUserId()) {
                                    xrVar = xrVar2;
                                    arrayList = arrayList2;
                                    i21 = i11 + 1;
                                    size = i10;
                                    yrVar3 = yrVar;
                                    strArr3 = strArr;
                                    xrVar2 = xrVar;
                                    arrayList2 = arrayList;
                                } else {
                                    lowerCase = UserObject.getUserName(user3).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user3);
                                    str = user3.first_name;
                                    str2 = user3.last_name;
                                }
                            } else {
                                i10 = size;
                                i11 = i21;
                                TLRPC.Chat chat = yrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str = chat.title;
                                str2 = null;
                            }
                            xrVar = xrVar2;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            arrayList = arrayList2;
                            int i22 = 0;
                            boolean z12 = false;
                            while (true) {
                                if (i22 < i20) {
                                    int i23 = i22;
                                    String str4 = strArr[i23];
                                    if (lowerCase.startsWith(str4) || org.telegram.messenger.yh.v(" ", str4, lowerCase) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.yh.v(" ", str4, translitString2)))) {
                                        str3 = lowerCase;
                                        z11 = true;
                                    } else if (publicUsername == null || !publicUsername.startsWith(str4)) {
                                        boolean z13 = z12;
                                        str3 = lowerCase;
                                        z11 = z13;
                                    } else {
                                        str3 = lowerCase;
                                        z11 = 2;
                                    }
                                    if (z11) {
                                        if (z11) {
                                            arrayList5.add(AndroidUtilities.generateSearchName(str, str2, str4));
                                        } else {
                                            arrayList5.add(AndroidUtilities.generateSearchName(t8.b.h("@", publicUsername), null, "@" + str4));
                                        }
                                        arrayList6.add(tLObject4);
                                    } else {
                                        String str5 = translitString2;
                                        i22 = i23 + 1;
                                        String str6 = str3;
                                        z12 = z11;
                                        lowerCase = str6;
                                        translitString2 = str5;
                                    }
                                }
                            }
                            i21 = i11 + 1;
                            size = i10;
                            yrVar3 = yrVar;
                            strArr3 = strArr;
                            xrVar2 = xrVar;
                            arrayList2 = arrayList;
                        }
                    }
                    yr yrVar4 = yrVar3;
                    String[] strArr4 = strArr3;
                    xr xrVar3 = xrVar2;
                    if (arrayList3 != null) {
                        for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                            TLRPC.User user4 = yrVar4.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i24)).user_id));
                            if (user4.id != yrVar4.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                if (lowerCase3.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                int i25 = 0;
                                boolean z14 = false;
                                while (true) {
                                    if (i25 < i20) {
                                        String str7 = strArr4[i25];
                                        if (lowerCase3.startsWith(str7) || org.telegram.messenger.yh.v(" ", str7, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str7) || org.telegram.messenger.yh.v(" ", str7, translitString3)))) {
                                            z14 = true;
                                        } else {
                                            String publicUsername2 = UserObject.getPublicUsername(user4);
                                            if (publicUsername2 != null && publicUsername2.startsWith(str7)) {
                                                z14 = 2;
                                            }
                                        }
                                        if (z14) {
                                            if (z14) {
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
                    AndroidUtilities.runOnUIThread(new bi.c3(xrVar3, arrayList4, hVar, arrayList5, arrayList6, 21));
                    break;
                }
                break;
            case 14:
                String str8 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.l((org.telegram.ui.Components.e0) obj4, (Context) obj2, str8, str8, (org.telegram.ui.ActionBar.c6) obj).show();
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                bi.y2 y2Var = (bi.y2) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
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
                    y2Var.run(lowerCase4);
                    org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr[0];
                    if (a2Var3 != null) {
                        a2Var3.dismiss();
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
                TextView textView = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i26 = 0;
                while (true) {
                    if (i26 < iArr.length) {
                        if (iArr2[0] == iArr[i26]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i26]);
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i26++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.arrows_select, 0);
                    brVar.spaceScaleX = 0.7f;
                    brVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    brVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(brVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.br brVar2 = new org.telegram.ui.Components.br(R.drawable.mini_switch_lock, 0);
                    brVar2.spaceScaleX = 0.7f;
                    brVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    brVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(brVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                break;
            case 17:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                final org.telegram.ui.Components.ew0 ew0Var = (org.telegram.ui.Components.ew0) obj3;
                int[] iArr3 = (int[]) obj2;
                org.telegram.ui.Components.vp0 vp0Var = (org.telegram.ui.Components.vp0) obj;
                int[] iArr4 = chatActivityEnterView.N2;
                if (chatActivityEnterView.q0 != null) {
                    Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout2.addView(ew0Var, w7.a6.e(40, 40, 3));
                    dialog2.setContentView(frameLayout2);
                    dialog2.getWindow().setLayout(-1, -1);
                    dialog2.getWindow().clearFlags(1024);
                    dialog2.getWindow().clearFlags(67108864);
                    dialog2.getWindow().clearFlags(TLObject.FLAG_27);
                    dialog2.getWindow().addFlags(TLObject.FLAG_31);
                    dialog2.getWindow().addFlags(512);
                    dialog2.getWindow().addFlags(131072);
                    dialog2.getWindow().getAttributes().windowAnimations = 0;
                    dialog2.getWindow().getDecorView().setSystemUiVisibility(1792);
                    dialog2.getWindow().setStatusBarColor(0);
                    dialog2.getWindow().setNavigationBarColor(0);
                    AndroidUtilities.setLightStatusBar(dialog2, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.s8, true) == -1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        AndroidUtilities.setLightNavigationBar(dialog2, AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, true)) >= 0.721f);
                    }
                    chatActivityEnterView.s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.s0;
                    chatActivityEnterView.p0.getLocationInWindow(iArr4);
                    final float f11 = iArr4[0];
                    final float f12 = iArr4[1];
                    float dp = AndroidUtilities.dp(5.0f);
                    float dp2 = iArr3[0] + chatActivityEnterView.s0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
                    float f13 = iArr3[1] + chatActivityEnterView.t0 + dp + 0.0f;
                    ew0Var.setTranslationX(dp2);
                    ew0Var.setTranslationY(f13);
                    float scaleX = (chatActivityEnterView.p0.getLayoutParams().width * (chatActivityEnterView.l5 ? chatActivityEnterView.p0.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
                    ew0Var.setPivotX(0.0f);
                    ew0Var.setPivotY(0.0f);
                    ew0Var.setScaleX(0.75f);
                    ew0Var.setScaleY(0.75f);
                    ew0Var.getViewTreeObserver().addOnDrawListener(new org.telegram.ui.Components.hf(ew0Var, vp0Var));
                    dialog2.show();
                    if (chatActivityEnterView.l5) {
                        f7 = 1.0f;
                    } else {
                        f7 = 1.0f;
                        chatActivityEnterView.p0.setScaleX(1.0f);
                        chatActivityEnterView.p0.setScaleY(1.0f);
                    }
                    chatActivityEnterView.p0.setAlpha(f7);
                    org.telegram.ui.Components.gf gfVar = chatActivityEnterView.q0;
                    boolean z15 = chatActivityEnterView.l5;
                    o1.c cVar = o1.h.o;
                    if (z15) {
                        c10 = 3;
                        c11 = 2;
                        kVar = null;
                        f10 = 0.5f;
                    } else {
                        c10 = 3;
                        o1.k kVar3 = new o1.k(chatActivityEnterView.p0, cVar);
                        c11 = 2;
                        f10 = 0.5f;
                        kVar3.u = org.telegram.ui.Cells.d0.k(0.5f, 750.0f, f7);
                        kVar = kVar3;
                    }
                    boolean z16 = chatActivityEnterView.l5;
                    o1.c cVar2 = o1.h.p;
                    if (z16) {
                        dialog = dialog2;
                        kVar2 = null;
                    } else {
                        dialog = dialog2;
                        o1.k kVar4 = new o1.k(chatActivityEnterView.p0, cVar2);
                        kVar4.u = org.telegram.ui.Cells.d0.k(f10, 750.0f, f7);
                        kVar2 = kVar4;
                    }
                    o1.k kVar5 = new o1.k(chatActivityEnterView.p0, o1.h.t);
                    kVar5.u = org.telegram.ui.Cells.d0.k(0.0f, 750.0f, f7);
                    final int i27 = 0;
                    final Dialog dialog3 = dialog;
                    kVar5.a(new o1.f() { // from class: org.telegram.ui.Components.xd
                        @Override // o1.f
                        public final void a(o1.h hVar2, boolean z17, float f14, float f15) {
                            int i28 = i27;
                            float f16 = f12;
                            float f17 = f11;
                            ew0 ew0Var2 = ew0Var;
                            Dialog dialog4 = dialog3;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i28) {
                                case 0:
                                    int i29 = ChatActivityEnterView.n5;
                                    if (dialog4.isShowing()) {
                                        ew0Var2.setTranslationX(f17);
                                        ew0Var2.setTranslationY(f16);
                                        xp0 xp0Var = chatActivityEnterView2.p0;
                                        xp0Var.getClass();
                                        xp0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog4, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i30 = ChatActivityEnterView.n5;
                                    if (dialog4.isShowing()) {
                                        ew0Var2.setTranslationX(f17);
                                        ew0Var2.setTranslationY(f16);
                                        xp0 xp0Var2 = chatActivityEnterView2.p0;
                                        xp0Var2.getClass();
                                        xp0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog4, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    o1.k kVar6 = new o1.k(ew0Var, o1.h.m);
                    kVar6.b = w7.s.a(dp2, f11 - AndroidUtilities.dp(6.0f), dp2);
                    kVar6.c = true;
                    kVar6.u = org.telegram.ui.Cells.d0.k(f11, 700.0f, 0.75f);
                    kVar6.h = f11 - AndroidUtilities.dp(6.0f);
                    o1.k kVar7 = new o1.k(ew0Var, o1.h.n);
                    kVar7.b = w7.s.a(f13, f13, AndroidUtilities.dp(6.0f) + f12);
                    kVar7.c = true;
                    kVar7.u = org.telegram.ui.Cells.d0.k(f12, 700.0f, 0.75f);
                    kVar7.g = AndroidUtilities.dp(6.0f) + f12;
                    kVar7.b(new org.telegram.ui.Components.lf(f12, ew0Var));
                    final int i28 = 1;
                    kVar7.a(new o1.f() { // from class: org.telegram.ui.Components.xd
                        @Override // o1.f
                        public final void a(o1.h hVar2, boolean z17, float f14, float f15) {
                            int i282 = i28;
                            float f16 = f12;
                            float f17 = f11;
                            ew0 ew0Var2 = ew0Var;
                            Dialog dialog4 = dialog3;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i282) {
                                case 0:
                                    int i29 = ChatActivityEnterView.n5;
                                    if (dialog4.isShowing()) {
                                        ew0Var2.setTranslationX(f17);
                                        ew0Var2.setTranslationY(f16);
                                        xp0 xp0Var = chatActivityEnterView2.p0;
                                        xp0Var.getClass();
                                        xp0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog4, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i30 = ChatActivityEnterView.n5;
                                    if (dialog4.isShowing()) {
                                        ew0Var2.setTranslationX(f17);
                                        ew0Var2.setTranslationY(f16);
                                        xp0 xp0Var2 = chatActivityEnterView2.p0;
                                        xp0Var2.getClass();
                                        xp0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new jf(chatActivityEnterView2, dialog4, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    o1.k kVar8 = new o1.k(ew0Var, cVar);
                    kVar8.u = org.telegram.ui.Cells.d0.k(scaleX, 1000.0f, 1.0f);
                    o1.k kVar9 = new o1.k(ew0Var, cVar2);
                    kVar9.u = org.telegram.ui.Cells.d0.k(scaleX, 1000.0f, 1.0f);
                    o1.k[] kVarArr = new o1.k[7];
                    kVarArr[0] = kVar;
                    kVarArr[1] = kVar2;
                    kVarArr[c11] = kVar5;
                    kVarArr[c10] = kVar6;
                    kVarArr[4] = kVar7;
                    kVarArr[5] = kVar8;
                    kVarArr[6] = kVar9;
                    gfVar.l(kVarArr);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                long j10 = ioVar.V;
                final org.telegram.ui.Components.t2 t2Var = new org.telegram.ui.Components.t2(11, ioVar, (View) obj2);
                org.telegram.ui.Components.ve veVar = new org.telegram.ui.Components.ve(i16);
                int i29 = org.telegram.ui.ActionBar.g6.j5;
                int b02 = c6Var != null ? c6Var.b0(i29) : org.telegram.ui.ActionBar.g6.x0(null, i29, false);
                int i30 = org.telegram.ui.ActionBar.g6.h5;
                int b03 = c6Var != null ? c6Var.b0(i30) : org.telegram.ui.ActionBar.g6.x0(null, i30, false);
                int i31 = org.telegram.ui.ActionBar.g6.Ji;
                if (c6Var != null) {
                    c6Var.b0(i31);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.g6.Ni;
                if (c6Var != null) {
                    c6Var.b0(i32);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.g6.E8;
                if (c6Var != null) {
                    c6Var.b0(i33);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i33, false);
                }
                int i34 = org.telegram.ui.ActionBar.g6.G8;
                if (c6Var != null) {
                    c6Var.b0(i34);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i34, false);
                }
                int i35 = org.telegram.ui.ActionBar.g6.i6;
                if (c6Var != null) {
                    c6Var.b0(i35);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, i35, false);
                }
                int i36 = org.telegram.ui.ActionBar.g6.Sh;
                int b04 = c6Var != null ? c6Var.b0(i36) : org.telegram.ui.ActionBar.g6.x0(null, i36, false);
                int i37 = org.telegram.ui.ActionBar.g6.Oh;
                int b05 = c6Var != null ? c6Var.b0(i37) : org.telegram.ui.ActionBar.g6.x0(null, i37, false);
                if (c6Var != null) {
                    c6Var.b0(org.telegram.ui.ActionBar.g6.Qh);
                } else {
                    org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.g5.a;
                if (context != null) {
                    int i38 = b05;
                    final int i39 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, c6Var);
                    z2Var.a();
                    final org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(context, c6Var);
                    ud0Var.setTextColor(b02);
                    ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    ud0Var.setItemCount(5);
                    final org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(context, c6Var);
                    f4Var.setWrapSelectorWheel(true);
                    f4Var.setAllItemsCount(24);
                    f4Var.setItemCount(5);
                    f4Var.setTextColor(b02);
                    f4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(context, c6Var);
                    g4Var.setWrapSelectorWheel(true);
                    g4Var.setAllItemsCount(60);
                    g4Var.setItemCount(5);
                    g4Var.setTextColor(b02);
                    g4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context, ud0Var, f4Var, g4Var, 2);
                    y3Var.setOrientation(1);
                    frameLayout3.addView(y3Var, w7.a6.d(-1.0f, -1));
                    frameLayout3.addView(new FrameLayout(context), w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 120.0f, -1, 87));
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    y3Var.addView(frameLayout4, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context);
                    textView2.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView2.setTextColor(b02);
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    frameLayout4.addView(textView2, w7.a6.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                    textView2.setOnTouchListener(new ci.d(10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    y3Var.addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q5, c6Var));
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    bi.f4 f4Var2 = new bi.f4(context, 16);
                    f4Var2.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    w7.c6.b(f4Var2, 0.02f, 1.2f);
                    linearLayout.addView(ud0Var, w7.a6.l(0.5f, 0, 270));
                    ud0Var.setMinValue(0);
                    ud0Var.setMaxValue(365);
                    ud0Var.setWrapSelectorWheel(false);
                    ud0Var.setFormatter(new is(24));
                    org.telegram.ui.Components.e2 e2Var = new org.telegram.ui.Components.e2(i39, ud0Var, f4Var, g4Var, textView3);
                    org.telegram.ui.Components.g4 g4Var2 = g4Var;
                    ud0Var.setOnValueChangedListener(e2Var);
                    f4Var.setMinValue(0);
                    f4Var.setMaxValue(23);
                    int i40 = b03;
                    linearLayout.addView(f4Var, w7.a6.l(0.2f, 0, 270));
                    f4Var.setFormatter(new is(25));
                    f4Var.setOnValueChangedListener(e2Var);
                    g4Var2.setMinValue(0);
                    g4Var2.setMaxValue(59);
                    g4Var2.setValue(0);
                    g4Var2.setFormatter(new is(26));
                    linearLayout.addView(g4Var2, w7.a6.l(0.3f, 0, 270));
                    g4Var2.setOnValueChangedListener(e2Var);
                    if (j10 <= 0 || j10 == 2147483646) {
                        frameLayout = frameLayout3;
                    } else {
                        long j11 = 1000 * j10;
                        frameLayout = frameLayout3;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j11);
                        if (timeInMillis >= 0) {
                            g4Var2 = g4Var2;
                            g4Var2.setValue(calendar.get(12));
                            f4Var.setValue(calendar.get(11));
                            ud0Var.setValue(timeInMillis);
                        } else {
                            g4Var2 = g4Var2;
                        }
                    }
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.g5.f(null, null, 0L, i39, 3, ud0Var, f4Var, g4Var2);
                    org.telegram.ui.Components.g5.d(textView3, ud0Var, f4Var, g4Var2);
                    f4Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    f4Var2.setGravity(17);
                    f4Var2.setTextColor(b04);
                    f4Var2.setTextSize(1, 14.0f);
                    f4Var2.setTypeface(AndroidUtilities.bold());
                    f4Var2.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, i38));
                    y3Var.addView(f4Var2, w7.a6.t(-1, 48, 83, 14, 15, 14, 16));
                    final org.telegram.ui.Components.g4 g4Var3 = g4Var2;
                    f4Var2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Runnable runnable2;
                            zArr2[0] = false;
                            long j12 = i39;
                            ud0 ud0Var2 = ud0Var;
                            f4 f4Var3 = f4Var;
                            g4 g4Var4 = g4Var3;
                            boolean f14 = g5.f(null, null, 0L, j12, 3, ud0Var2, f4Var3, g4Var4);
                            g5.d(textView3, ud0Var2, f4Var3, g4Var4);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, ud0Var2.getValue());
                            calendar2.set(11, f4Var3.getValue());
                            calendar2.set(12, g4Var4.getValue());
                            if (f14) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            t2Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = z2Var.a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    y3Var.addView(textView3, w7.a6.t(-1, -2, 83, 14, 0, 14, 16));
                    z2Var.b(frameLayout);
                    org.telegram.ui.ActionBar.e3 e3Var = z2Var.a;
                    e3Var.show();
                    e3Var.setOnDismissListener(new org.telegram.ui.Components.g2(0, veVar, zArr2));
                    e3Var.setBackgroundColor(i40);
                    e3Var.fixNavigationBar(i40);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.ry ryVar = (org.telegram.ui.Components.ry) obj4;
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = (org.telegram.ui.ActionBar.a2[]) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) obj;
                ryVar.getClass();
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr2[0] = null;
                if (tLObject5 instanceof TLRPC.TL_emojiURL) {
                    pf.d.s(ryVar.c.a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject5).url);
                    runnable = z2Var2.a.dismissRunnable;
                    runnable.run();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = pzVar.s;
                org.telegram.ui.Components.rz rzVar = pzVar.w;
                if (rzVar.M == pzVar.b) {
                    rzVar.L = 0;
                    if (tL_messages_getStickers.emoticon.equals(pzVar.a)) {
                        if (!(tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                            int size2 = arrayList7.size();
                            int size3 = tL_messages_stickers.stickers.size();
                            while (i17 < size3) {
                                TLRPC.Document document = tL_messages_stickers.stickers.get(i17);
                                if (pzVar.v.indexOfKey(document.id) < 0) {
                                    arrayList7.add(document);
                                }
                                i17++;
                            }
                            if (size2 != arrayList7.size()) {
                                pzVar.f.put(arrayList7, rzVar.N);
                                if (size2 == 0) {
                                    pzVar.h.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.o10 o10Var = (org.telegram.ui.Components.o10) obj4;
                TLObject tLObject7 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                o10Var.z0 = -1;
                org.telegram.ui.ActionBar.m2 m2Var2 = o10Var.n;
                l10.r0((TLRPC.TL_error) obj3, m2Var2, org.telegram.ui.Components.zc.a0(m2Var2));
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i15 = ((TL_update.TL_updateDialogFilter) update).id;
                            }
                        } else {
                            while (true) {
                                if (i17 < arrayList8.size()) {
                                    if (arrayList8.get(i17) instanceof TL_update.TL_updateDialogFilter) {
                                        i15 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i17)).id;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        }
                    }
                    if (o10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        m2Var2.getMessagesController().loadRemoteFilters(true, new fi.r4(o10Var, callback, i15, i14));
                        break;
                    } else {
                        if (o10Var.a0 != null) {
                            m2Var2.getMessagesController().checkChatlistFolderUpdate(o10Var.Y, true);
                        }
                        o10Var.A0 = true;
                        o10Var.dismiss();
                        callback.run(Integer.valueOf(i15));
                        break;
                    }
                } else {
                    o10Var.l0.a(false);
                    break;
                }
            case 22:
                ((yy) obj4).t4(((Integer) obj3).intValue());
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sk(28, (vc) obj2, (org.telegram.ui.ActionBar.m2) obj), 200L);
                break;
            case 23:
                a();
                break;
            case 24:
                b();
                break;
            case 25:
                c();
                break;
            case 26:
                d();
                break;
            case 27:
                f();
                break;
            case 28:
                g();
                break;
            default:
                yy yyVar = (yy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.c6 resourceProvider = yyVar.getResourceProvider();
                org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(i13, (org.telegram.ui.Components.so0) obj4, tL_sponsoredPeer);
                int i41 = i41.v;
                int currentAccount = yyVar.getCurrentAccount();
                Activity parentActivity = yyVar.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.ni(parentActivity, resourceProvider, bArr, yyVar, f60Var, currentAccount));
                }
                m80Var.u();
                break;
        }
    }

    public /* synthetic */ p6(Object obj, boolean[] zArr, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = zArr;
        this.d = obj2;
        this.e = obj3;
    }
}
