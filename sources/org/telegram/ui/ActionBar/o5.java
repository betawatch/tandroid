package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bo;
import org.telegram.ui.gs;
import org.telegram.ui.h10;
import org.telegram.ui.j8;
import org.telegram.ui.n6;
import org.telegram.ui.p6;
import org.telegram.ui.pf;
import org.telegram.ui.pq;
import org.telegram.ui.q6;
import org.telegram.ui.s6;
import org.telegram.ui.sa;
import org.telegram.ui.tr;
import org.telegram.ui.u41;
import org.telegram.ui.ua;
import org.telegram.ui.ur;
import org.telegram.ui.wp;
import org.telegram.ui.wy;
import org.telegram.ui.zq;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0d6a  */
    /* JADX WARN: Type inference failed for: r13v14, types: [org.telegram.ui.ActionBar.b3] */
    /* JADX WARN: Type inference failed for: r16v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, org.telegram.ui.Components.u3] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.ui.ActionBar.o2] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v76, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r5v48, types: [android.widget.TextView] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z12;
        TLRPC.User user;
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        boolean z13;
        String str;
        tr trVar;
        String[] strArr;
        ur urVar;
        long peerId;
        int i10;
        int i11;
        String lowerCase;
        String publicUsername;
        String str2;
        String str3;
        String str4;
        ?? r42;
        int i12;
        Runnable runnable;
        String str5 = " ";
        int i13 = 5;
        int i14 = 4;
        int i15 = -1;
        int i16 = 3;
        int i17 = 1;
        int i18 = 0;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.b;
                h6 h6Var = (h6) this.c;
                i6 i6Var = (i6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                j6.A--;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (h6Var == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (h6Var != null) {
                                h6Var.r = tL_theme2;
                            } else {
                                i6Var.F = tL_theme2;
                                i6Var.G = false;
                                i6Var.g0 = null;
                                i6Var.h0 = null;
                                NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(i6Var.E);
                                TLRPC.TL_theme tL_theme3 = i6Var.F;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z10 = true;
                        }
                    } else {
                        if (i6.a(h6Var, themeSettings)) {
                            z11 = false;
                        } else {
                            File d = h6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            i6.i(h6Var, themeSettings);
                            i6 i6Var2 = j6.I;
                            if (i6Var2 == i6Var && i6Var2.Y == h6Var.a) {
                                j6.n1(false, false);
                                j6.J(ApplicationLoader.applicationContext, false);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i19 = NotificationCenter.needSetDayNightTheme;
                                i6 i6Var3 = j6.I;
                                z12 = true;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i19, i6Var3, Boolean.valueOf(j6.J == i6Var3), null, -1);
                            } else {
                                z12 = true;
                            }
                            e6.a(z12);
                            z11 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        h6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z11;
                    }
                    if (j6.A != 0) {
                        j6.B = (int) (System.currentTimeMillis() / 1000);
                        j6.s1(z10, false);
                        break;
                    }
                }
                z10 = false;
                if (j6.A != 0) {
                }
                break;
            case 1:
                q6 q6Var = (q6) this.b;
                s6 s6Var = (s6) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                q6Var.getClass();
                s6Var.a(fArr[0]);
                if (zArr[0]) {
                    q6Var.d.y0(true);
                    break;
                }
                break;
            case 2:
                q6 q6Var2 = (q6) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                p6 p6Var = (p6) this.e;
                if (!zArr2[0]) {
                    jArr[0] = System.currentTimeMillis();
                    q6Var2.d.showDialog(p6Var);
                    break;
                }
                break;
            case 3:
                j8.U((j8) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (Calendar) this.e);
                break;
            case 4:
                sa.U((sa) this.b, (c2) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 5:
                bo boVar = (bo) this.b;
                ?? r22 = (o2) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                e5 e5Var = (e5) this.e;
                if (r22 instanceof NotificationCenter.NotificationCenterDelegate) {
                    boVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r22, NotificationCenter.closeChats);
                }
                boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) e5Var).c(e5Var.getFragmentStack().size() - 1, new bo(bundle));
                r22.finishFragment();
                break;
            case 6:
                bo boVar2 = (bo) this.c;
                nf.e eVar = (nf.e) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                ua uaVar = (ua) this.e;
                eVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    boVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    boVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = boVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        uaVar.run(user);
                        break;
                    }
                }
                user = null;
                uaVar.run(user);
            case 7:
                long[] jArr2 = (long[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                pr prVar = (pr) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.b3(prVar, i14));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(qr.f);
                ofFloat.start();
                break;
            case 8:
                bo boVar3 = (bo) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                c2 c2Var = (c2) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = q90.f(messageObject2);
                    th2 = null;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    th2 = th3;
                    tL_webPage = null;
                }
                AndroidUtilities.runOnUIThread(new i2.b1(boVar3, c2Var, zArr4, th2 == null && tL_webPage != null, messageObject2, tL_webPage, 7));
                break;
            case 9:
                bo boVar4 = (bo) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        boVar4.l6 = messages_messages.count;
                        z13 = false;
                    } else {
                        z13 = false;
                        boVar4.l6 = 0;
                    }
                    messagesStorage.resetMentionsCount(boVar4.T5, boVar4.d(), boVar4.l6);
                    int i20 = boVar4.l6;
                    if (i20 == 0) {
                        boVar4.m6 = true;
                        boVar4.Kb(z13);
                        break;
                    } else {
                        boVar4.j1.c(2, i20, true);
                        boVar4.H9();
                        break;
                    }
                } else {
                    int i21 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) boVar4.o6[0].get(i21);
                    messagesStorage.markMessageAsMention(boVar4.T5, i21);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    boVar4.F(i21, 0, 0, 0, false, true);
                    break;
                }
            case 10:
                bo.n0((bo) this.b, (TLRPC.TL_messageMediaWebPage) this.c, (TLRPC.TL_webPageAttributeStory) this.d, (n6) this.e);
                break;
            case 11:
                wp.W((wp) this.b, (c2[]) this.c, (TLRPC.Chat) this.d, (o2) this.e);
                break;
            case 12:
                pq pqVar = (pq) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                pqVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    pqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 13:
                ur urVar2 = (ur) this.c;
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                zq zqVar = (zq) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    zqVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(urVar2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
                    alertDialog$Builder.a.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new org.telegram.ui.y0(zqVar, 24));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    urVar2.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 14:
                tr trVar2 = (tr) this.b;
                String str6 = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ur urVar3 = trVar2.y;
                String lowerCase2 = str6.trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ai.m3(trVar2, new ArrayList(), new a0.i(), new ArrayList(), new ArrayList(), 21));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i22 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i22];
                    strArr2[0] = lowerCase2;
                    if (translitString != null) {
                        strArr2[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    a0.i iVar = new a0.i();
                    ur urVar4 = urVar3;
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i23 = 0;
                        while (i23 < size) {
                            TLObject tLObject6 = (TLObject) arrayList.get(i23);
                            ArrayList arrayList6 = arrayList;
                            if (tLObject6 instanceof TLRPC.ChatParticipant) {
                                trVar = trVar2;
                                peerId = ((TLRPC.ChatParticipant) tLObject6).user_id;
                            } else {
                                trVar = trVar2;
                                if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject6).peer);
                                } else {
                                    strArr = strArr2;
                                    urVar = urVar4;
                                    i11 = i23;
                                    i10 = size;
                                    i23 = i11 + 1;
                                    arrayList = arrayList6;
                                    trVar2 = trVar;
                                    strArr2 = strArr;
                                    urVar4 = urVar;
                                    size = i10;
                                }
                            }
                            if (peerId > 0) {
                                strArr = strArr2;
                                TLRPC.User user3 = urVar4.getMessagesController().getUser(Long.valueOf(peerId));
                                urVar = urVar4;
                                if (user3.id != urVar.getUserConfig().getClientUserId()) {
                                    lowerCase = UserObject.getUserName(user3).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user3);
                                    str2 = user3.first_name;
                                    str3 = user3.last_name;
                                }
                                i11 = i23;
                                i10 = size;
                                i23 = i11 + 1;
                                arrayList = arrayList6;
                                trVar2 = trVar;
                                strArr2 = strArr;
                                urVar4 = urVar;
                                size = i10;
                            } else {
                                strArr = strArr2;
                                urVar = urVar4;
                                TLRPC.Chat chat = urVar.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str2 = chat.title;
                                str3 = null;
                            }
                            i11 = i23;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            i10 = size;
                            int i24 = 0;
                            boolean z14 = false;
                            while (true) {
                                if (i24 < i22) {
                                    int i25 = i24;
                                    String str7 = strArr[i25];
                                    if (lowerCase.startsWith(str7) || org.telegram.messenger.w1.w(" ", str7, lowerCase) || (translitString2 != null && (translitString2.startsWith(str7) || org.telegram.messenger.w1.w(" ", str7, translitString2)))) {
                                        str4 = lowerCase;
                                        r42 = 1;
                                    } else if (publicUsername == null || !publicUsername.startsWith(str7)) {
                                        boolean z15 = z14;
                                        str4 = lowerCase;
                                        r42 = z15;
                                    } else {
                                        str4 = lowerCase;
                                        r42 = 2;
                                    }
                                    if (r42 != 0) {
                                        if (r42 == 1) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(str2, str3, str7));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName(org.telegram.ui.Cells.p6.i("@", publicUsername), null, "@" + str7));
                                        }
                                        arrayList5.add(tLObject6);
                                    } else {
                                        String str8 = translitString2;
                                        i24 = i25 + 1;
                                        String str9 = str4;
                                        z14 = r42;
                                        lowerCase = str9;
                                        translitString2 = str8;
                                    }
                                }
                            }
                            i23 = i11 + 1;
                            arrayList = arrayList6;
                            trVar2 = trVar;
                            strArr2 = strArr;
                            urVar4 = urVar;
                            size = i10;
                        }
                    }
                    tr trVar3 = trVar2;
                    String[] strArr3 = strArr2;
                    ur urVar5 = urVar4;
                    if (arrayList2 != null) {
                        int i26 = 0;
                        while (i26 < arrayList2.size()) {
                            TLRPC.User user4 = urVar5.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i26)).user_id));
                            if (user4.id != urVar5.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                if (lowerCase3.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                char c10 = 0;
                                int i27 = 0;
                                while (i27 < i22) {
                                    String str10 = strArr3[i27];
                                    if (lowerCase3.startsWith(str10) || org.telegram.messenger.w1.w(str5, str10, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str10) || org.telegram.messenger.w1.w(str5, str10, translitString3)))) {
                                        str = str5;
                                        c10 = 1;
                                    } else {
                                        str = str5;
                                        String publicUsername2 = UserObject.getPublicUsername(user4);
                                        if (publicUsername2 != null && publicUsername2.startsWith(str10)) {
                                            c10 = 2;
                                        }
                                    }
                                    if (c10 != 0) {
                                        if (c10 == 1) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str10));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str10));
                                        }
                                        arrayList3.add(user4);
                                        iVar.k(user4, user4.id);
                                        i26++;
                                        str5 = str;
                                    } else {
                                        i27++;
                                        str5 = str;
                                    }
                                }
                            }
                            str = str5;
                            i26++;
                            str5 = str;
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ai.m3(trVar3, arrayList3, iVar, arrayList4, arrayList5, 21));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                Context context = (Context) this.d;
                f6 f6Var = (f6) this.e;
                String str11 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.l(e0Var, context, str11, str11, f6Var).show();
                break;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                ai.i3 i3Var = (ai.i3) this.c;
                c2[] c2VarArr = (c2[]) this.d;
                View view = (View) this.e;
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
                    i3Var.run(lowerCase4);
                    c2 c2Var2 = c2VarArr[0];
                    if (c2Var2 != null) {
                        c2Var2.dismiss();
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
            case 17:
                int[] iArr = (int[]) this.b;
                int[] iArr2 = (int[]) this.c;
                String[] strArr4 = (String[]) this.d;
                ?? r52 = (TextView) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i28 = 0;
                while (true) {
                    if (i28 < iArr.length) {
                        if (iArr2[0] == iArr[i28]) {
                            spannableStringBuilder.append((CharSequence) strArr4[i28]);
                            spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i28++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    oq oqVar = new oq(R.drawable.arrows_select, 0);
                    oqVar.spaceScaleX = 0.7f;
                    oqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    oqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    oq oqVar2 = new oq(R.drawable.mini_switch_lock, 0);
                    oqVar2.spaceScaleX = 0.7f;
                    oqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    oqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(oqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                r52.setText(spannableStringBuilder);
                break;
            case 18:
                ChatActivityEnterView.f((ChatActivityEnterView) this.b, (gv0) this.c, (int[]) this.d, (vo0) this.e);
                break;
            case 19:
                un unVar = (un) this.b;
                Context context2 = (Context) this.c;
                View view2 = (View) this.d;
                f6 f6Var2 = (f6) this.e;
                long j3 = unVar.V;
                final mf mfVar = new mf(6, unVar, view2);
                sh shVar = new sh(i17);
                int i29 = j6.j5;
                int g02 = f6Var2 != null ? f6Var2.g0(i29) : j6.w0(null, i29, false);
                int i30 = j6.h5;
                int g03 = f6Var2 != null ? f6Var2.g0(i30) : j6.w0(null, i30, false);
                int i31 = j6.Ji;
                if (f6Var2 != null) {
                    f6Var2.g0(i31);
                } else {
                    j6.w0(null, i31, false);
                }
                int i32 = j6.Ni;
                if (f6Var2 != null) {
                    f6Var2.g0(i32);
                } else {
                    j6.w0(null, i32, false);
                }
                int i33 = j6.E8;
                if (f6Var2 != null) {
                    f6Var2.g0(i33);
                } else {
                    j6.w0(null, i33, false);
                }
                int i34 = j6.G8;
                if (f6Var2 != null) {
                    f6Var2.g0(i34);
                } else {
                    j6.w0(null, i34, false);
                }
                int i35 = j6.i6;
                if (f6Var2 != null) {
                    f6Var2.g0(i35);
                } else {
                    j6.w0(null, i35, false);
                }
                int i36 = j6.Sh;
                int g04 = f6Var2 != null ? f6Var2.g0(i36) : j6.w0(null, i36, false);
                int i37 = j6.Oh;
                int g05 = f6Var2 != null ? f6Var2.g0(i37) : j6.w0(null, i37, false);
                if (f6Var2 != null) {
                    f6Var2.g0(j6.Qh);
                } else {
                    j6.w0(null, j6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.c5.a;
                if (context2 != null) {
                    final int i38 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final ?? b3Var = new b3(context2, f6Var2);
                    b3Var.a();
                    final uc0 uc0Var = new uc0(context2, f6Var2);
                    uc0Var.setTextColor(g02);
                    uc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    uc0Var.setItemCount(5);
                    final org.telegram.ui.Components.b4 b4Var = new org.telegram.ui.Components.b4(context2, f6Var2);
                    b4Var.setWrapSelectorWheel(true);
                    b4Var.setAllItemsCount(24);
                    b4Var.setItemCount(5);
                    b4Var.setTextColor(g02);
                    b4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final org.telegram.ui.Components.c4 c4Var = new org.telegram.ui.Components.c4(context2, f6Var2);
                    c4Var.setWrapSelectorWheel(true);
                    c4Var.setAllItemsCount(60);
                    c4Var.setItemCount(5);
                    c4Var.setTextColor(g02);
                    c4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ?? frameLayout = new FrameLayout(context2);
                    ?? u3Var = new org.telegram.ui.Components.u3(context2, uc0Var, b4Var, c4Var, 2);
                    u3Var.setOrientation(1);
                    frameLayout.addView(u3Var, w7.x5.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context2), w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    u3Var.addView(frameLayout2, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context2);
                    textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView.setTextColor(g02);
                    textView.setTextSize(1, 20.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new bi.d(10));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    u3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setTextColor(j6.v0(j6.q5, f6Var2));
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    ai.p4 p4Var = new ai.p4(context2, 16);
                    p4Var.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    w7.z5.b(p4Var, 0.02f, 1.2f);
                    linearLayout.addView(uc0Var, w7.x5.l(0.5f, 0, 270));
                    uc0Var.setMinValue(0);
                    uc0Var.setMaxValue(365);
                    uc0Var.setWrapSelectorWheel(false);
                    uc0Var.setFormatter(new gs(22));
                    org.telegram.ui.Components.d2 d2Var = new org.telegram.ui.Components.d2(i38, uc0Var, b4Var, c4Var, textView2);
                    uc0Var.setOnValueChangedListener(d2Var);
                    b4Var.setMinValue(0);
                    b4Var.setMaxValue(23);
                    int i39 = g03;
                    linearLayout.addView(b4Var, w7.x5.l(0.2f, 0, 270));
                    b4Var.setFormatter(new gs(23));
                    b4Var.setOnValueChangedListener(d2Var);
                    c4Var.setMinValue(0);
                    c4Var.setMaxValue(59);
                    c4Var.setValue(0);
                    c4Var.setFormatter(new gs(24));
                    linearLayout.addView(c4Var, w7.x5.l(0.3f, 0, 270));
                    c4Var.setOnValueChangedListener(d2Var);
                    if (j3 <= 0 || j3 == 2147483646) {
                        i12 = g04;
                    } else {
                        long j10 = j3 * 1000;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        i12 = g04;
                        int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j10);
                        if (timeInMillis >= 0) {
                            c4Var.setValue(calendar.get(12));
                            b4Var.setValue(calendar.get(11));
                            uc0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr5 = {true};
                    org.telegram.ui.Components.c5.g(null, null, 0L, i38, 3, uc0Var, b4Var, c4Var);
                    org.telegram.ui.Components.c5.e(textView2, uc0Var, b4Var, c4Var);
                    p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    p4Var.setGravity(17);
                    p4Var.setTextColor(i12);
                    p4Var.setTextSize(1, 14.0f);
                    p4Var.setTypeface(AndroidUtilities.bold());
                    p4Var.setBackground(z5.e(new float[]{24.0f}, g05));
                    u3Var.addView(p4Var, w7.x5.t(-1, 48, 83, 14, 15, 14, 16));
                    p4Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.e2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Runnable runnable2;
                            zArr5[0] = false;
                            long j11 = i38;
                            uc0 uc0Var2 = uc0Var;
                            b4 b4Var2 = b4Var;
                            c4 c4Var2 = c4Var;
                            boolean g10 = c5.g(null, null, 0L, j11, 3, uc0Var2, b4Var2, c4Var2);
                            c5.e(textView2, uc0Var2, b4Var2, c4Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, uc0Var2.getValue());
                            calendar2.set(11, b4Var2.getValue());
                            calendar2.set(12, c4Var2.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            mfVar.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = b3Var.a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    u3Var.addView(textView2, w7.x5.t(-1, -2, 83, 14, 0, 14, 16));
                    b3Var.b(frameLayout);
                    g3 g3Var = b3Var.a;
                    g3Var.show();
                    g3Var.setOnDismissListener(new org.telegram.ui.Components.f2(0, shVar, zArr5));
                    g3Var.setBackgroundColor(i39);
                    g3Var.fixNavigationBar(i39);
                    break;
                }
                break;
            case 20:
                fy fyVar = (fy) this.c;
                c2[] c2VarArr2 = (c2[]) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                b3 b3Var2 = (b3) this.e;
                fyVar.getClass();
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    nf.f.s(fyVar.c.a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    runnable = b3Var2.a.dismissRunnable;
                    runnable.run();
                    break;
                }
                break;
            case 21:
                dz dzVar = (dz) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject8 = (TLObject) this.b;
                Runnable runnable2 = (Runnable) this.e;
                ArrayList arrayList7 = dzVar.s;
                fz fzVar = dzVar.w;
                if (fzVar.M == dzVar.b) {
                    fzVar.L = 0;
                    if (tL_messages_getStickers.emoticon.equals(dzVar.a)) {
                        if (!(tLObject8 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject8;
                            int size2 = arrayList7.size();
                            int size3 = tL_messages_stickers.stickers.size();
                            while (i18 < size3) {
                                TLRPC.Document document2 = tL_messages_stickers.stickers.get(i18);
                                if (dzVar.v.indexOfKey(document2.id) < 0) {
                                    arrayList7.add(document2);
                                }
                                i18++;
                            }
                            if (size2 != arrayList7.size()) {
                                dzVar.f.put(arrayList7, fzVar.N);
                                if (size2 == 0) {
                                    dzVar.h.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
            case 22:
                c10 c10Var = (c10) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                c10Var.z0 = -1;
                o2 o2Var = c10Var.n;
                h10.r0(tL_error3, o2Var, vc.a0(o2Var));
                if (tLObject9 != null) {
                    if (tLObject9 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject9;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i15 = ((TL_update.TL_updateDialogFilter) update).id;
                            }
                        } else {
                            while (true) {
                                if (i18 < arrayList8.size()) {
                                    if (arrayList8.get(i18) instanceof TL_update.TL_updateDialogFilter) {
                                        i15 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i18)).id;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                        }
                    }
                    if (c10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        o2Var.getMessagesController().loadRemoteFilters(true, new ei.r4(c10Var, callback, i15, i16));
                        break;
                    } else {
                        if (c10Var.a0 != null) {
                            o2Var.getMessagesController().checkChatlistFolderUpdate(c10Var.Y, true);
                        }
                        c10Var.A0 = true;
                        c10Var.dismiss();
                        callback.run(Integer.valueOf(i15));
                        break;
                    }
                } else {
                    c10Var.l0.a(false);
                    break;
                }
            case 23:
                wy wyVar = (wy) this.b;
                Integer num = (Integer) this.c;
                pf pfVar = (pf) this.d;
                o2 o2Var2 = (o2) this.e;
                wyVar.w4(num.intValue());
                AndroidUtilities.runOnUIThread(new ny(i13, pfVar, o2Var2), 200L);
                break;
            case 24:
                r30.N((r30) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (TLRPC.TL_channels_getParticipants) this.e);
                break;
            case 25:
                g80.n((g80) this.b, (TLRPC.TL_error) this.c, (TLRPC.Updates) this.d, (TLRPC.TL_messages_importChatInvite) this.e);
                break;
            case 26:
                v80 v80Var = (v80) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                TLObject tLObject10 = (TLObject) this.b;
                v80Var.y = false;
                v80Var.K = tL_chatInviteExported.link;
                if (tL_error4 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject10;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i18 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i18++;
                    }
                    v80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 27:
                ba0 ba0Var = (ba0) this.b;
                boolean[] zArr6 = (boolean[]) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                boolean[] zArr7 = (boolean[]) this.e;
                zArr6[0] = true;
                AndroidUtilities.cancelRunOnUIThread(ba0Var.U);
                for (int i40 = 0; i40 < arrayList9.size(); i40++) {
                    ((TL_stories.StoryItem) arrayList9.get(i40)).pinned = zArr7[i40];
                }
                ba0Var.getMessagesController().getStoriesController().n0(ba0Var.e, arrayList9, false);
                break;
            case 28:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                ci.d dVar = (ci.d) this.c;
                g3 g3Var2 = (g3) this.d;
                Runnable runnable3 = (Runnable) this.e;
                if (tL_error5 != null) {
                    vc.X().d0(tL_error5, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    g3Var2.dismiss();
                    vc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                    runnable3.run();
                    break;
                }
            default:
                sn0 sn0Var = (sn0) this.b;
                wy wyVar2 = (wy) this.c;
                Context context3 = (Context) this.d;
                n70 n70Var = (n70) this.e;
                wyVar2.showDialog(new u41(context3, wyVar2.getResourceProvider(), new ny(25, sn0Var, wyVar2)));
                n70Var.u();
                break;
        }
    }

    public /* synthetic */ o5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = tLObject;
        this.e = obj3;
    }

    public /* synthetic */ o5(o2 o2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.a = i10;
        this.c = o2Var;
        this.b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public /* synthetic */ o5(v80 v80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = 26;
        this.c = v80Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.b = tLObject;
    }
}
