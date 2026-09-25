package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
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
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.vw;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b10;
import org.telegram.ui.h8;
import org.telegram.ui.kq;
import org.telegram.ui.l6;
import org.telegram.ui.n6;
import org.telegram.ui.o6;
import org.telegram.ui.oc;
import org.telegram.ui.or;
import org.telegram.ui.pr;
import org.telegram.ui.q6;
import org.telegram.ui.qa;
import org.telegram.ui.qy;
import org.telegram.ui.rp;
import org.telegram.ui.sa;
import org.telegram.ui.uq;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0d46  */
    /* JADX WARN: Type inference failed for: r14v20, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r18v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, org.telegram.ui.Components.w3] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r2v27, types: [org.telegram.ui.ActionBar.m2] */
    /* JADX WARN: Type inference failed for: r5v47, types: [android.widget.TextView] */
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
        ArrayList arrayList;
        long peerId;
        int i10;
        String[] strArr;
        or orVar;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        String str3;
        ?? r12;
        th thVar;
        ViewGroup viewGroup;
        ai.p4 p4Var;
        Runnable runnable;
        int i11 = 10;
        int i12 = -1;
        int i13 = 3;
        int i14 = 1;
        int i15 = 0;
        switch (this.a) {
            case 0:
                ((Utilities.Callback) this.b).run(h6.Q0((File) this.c, (String) this.d, (String[]) this.e));
                break;
            case 1:
                TLObject tLObject = (TLObject) this.b;
                f6 f6Var = (f6) this.c;
                g6 g6Var = (g6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                h6.A--;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (f6Var == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (f6Var != null) {
                                f6Var.r = tL_theme2;
                                z10 = true;
                            } else {
                                g6Var.F = tL_theme2;
                                g6Var.G = false;
                                g6Var.g0 = null;
                                g6Var.h0 = null;
                                NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(g6Var.E);
                                TLRPC.TL_theme tL_theme3 = g6Var.F;
                                z10 = true;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (g6.a(f6Var, themeSettings)) {
                            z11 = false;
                        } else {
                            File d = f6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            g6.i(f6Var, themeSettings);
                            g6 g6Var2 = h6.I;
                            if (g6Var2 == g6Var && g6Var2.Y == f6Var.a) {
                                h6.n1(false, false);
                                h6.J(ApplicationLoader.applicationContext, false);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i16 = NotificationCenter.needSetDayNightTheme;
                                g6 g6Var3 = h6.I;
                                z12 = true;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i16, g6Var3, Boolean.valueOf(h6.J == g6Var3), null, -1);
                            } else {
                                z12 = true;
                            }
                            c6.a(z12);
                            z11 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        f6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z11;
                    }
                    if (h6.A != 0) {
                        h6.B = (int) (System.currentTimeMillis() / 1000);
                        h6.s1(z10, false);
                        break;
                    }
                }
                z10 = false;
                if (h6.A != 0) {
                }
                break;
            case 2:
                o6 o6Var = (o6) this.b;
                q6 q6Var = (q6) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                o6Var.getClass();
                q6Var.a(fArr[0]);
                if (zArr[0]) {
                    o6Var.d.w0(true);
                    break;
                }
                break;
            case 3:
                o6 o6Var2 = (o6) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                n6 n6Var = (n6) this.e;
                if (!zArr2[0]) {
                    jArr[0] = System.currentTimeMillis();
                    o6Var2.d.showDialog(n6Var);
                    break;
                }
                break;
            case 4:
                h8.U((h8) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (Calendar) this.e);
                break;
            case 5:
                qa.U((qa) this.b, (a2) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 6:
                wn wnVar = (wn) this.b;
                ?? r22 = (m2) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                b5 b5Var = (b5) this.e;
                if (r22 instanceof NotificationCenter.NotificationCenterDelegate) {
                    wnVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r22, NotificationCenter.closeChats);
                }
                wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) b5Var).c(b5Var.getFragmentStack().size() - 1, new wn(bundle));
                r22.finishFragment();
                break;
            case 7:
                wn wnVar2 = (wn) this.b;
                nf.e eVar = (nf.e) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                sa saVar = (sa) this.e;
                eVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    wnVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    wnVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = wnVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        saVar.run(user);
                        break;
                    }
                }
                user = null;
                saVar.run(user);
            case 8:
                long[] jArr2 = (long[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                qr qrVar = (qr) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.c3(qrVar, 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(rr.f);
                ofFloat.start();
                break;
            case 9:
                wn wnVar3 = (wn) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                a2 a2Var = (a2) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = ba0.f(messageObject2);
                    th2 = null;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    th2 = th3;
                    tL_webPage = null;
                }
                AndroidUtilities.runOnUIThread(new i2.c1(wnVar3, a2Var, zArr4, th2 == null && tL_webPage != null, messageObject2, tL_webPage, 7));
                break;
            case 10:
                wn wnVar4 = (wn) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        wnVar4.l6 = messages_messages.count;
                        z13 = false;
                    } else {
                        z13 = false;
                        wnVar4.l6 = 0;
                    }
                    messagesStorage.resetMentionsCount(wnVar4.T5, wnVar4.d(), wnVar4.l6);
                    int i17 = wnVar4.l6;
                    if (i17 == 0) {
                        wnVar4.m6 = true;
                        wnVar4.Kb(z13);
                        break;
                    } else {
                        wnVar4.j1.c(2, i17, true);
                        wnVar4.H9();
                        break;
                    }
                } else {
                    int i18 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) wnVar4.o6[0].get(i18);
                    messagesStorage.markMessageAsMention(wnVar4.T5, i18);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    wnVar4.F(i18, 0, 0, 0, false, true);
                    break;
                }
                break;
            case 11:
                wn.E0((wn) this.b, (TLRPC.TL_messageMediaWebPage) this.c, (TLRPC.TL_webPageAttributeStory) this.d, (l6) this.e);
                break;
            case 12:
                rp.W((rp) this.b, (a2[]) this.c, (TLRPC.Chat) this.d, (m2) this.e);
                break;
            case 13:
                kq kqVar = (kq) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                kqVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    kqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 14:
                pr prVar = (pr) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                uq uqVar = (uq) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    uqVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(prVar.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
                    alertDialog$Builder.a.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new org.telegram.ui.z0(uqVar, 23));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    prVar.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 15:
                or orVar2 = (or) this.b;
                String str4 = (String) this.d;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.e;
                pr prVar2 = orVar2.y;
                String lowerCase2 = str4.trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ai.m3(orVar2, new ArrayList(), new a0.i(), new ArrayList(), new ArrayList(), 21));
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
                    pr prVar3 = prVar2;
                    ArrayList arrayList4 = new ArrayList();
                    a0.i iVar = new a0.i();
                    ArrayList arrayList5 = new ArrayList();
                    String[] strArr3 = strArr2;
                    ArrayList arrayList6 = new ArrayList();
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i20 = 0;
                        while (i20 < size) {
                            TLObject tLObject6 = (TLObject) arrayList2.get(i20);
                            pr prVar4 = prVar3;
                            if (tLObject6 instanceof TLRPC.ChatParticipant) {
                                peerId = ((TLRPC.ChatParticipant) tLObject6).user_id;
                            } else if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject6).peer);
                            } else {
                                arrayList = arrayList2;
                                orVar = orVar2;
                                strArr = strArr3;
                                i10 = i20;
                                i20 = i10 + 1;
                                prVar3 = prVar4;
                                arrayList2 = arrayList;
                                orVar2 = orVar;
                                strArr3 = strArr;
                            }
                            if (peerId > 0) {
                                arrayList = arrayList2;
                                TLRPC.User user3 = prVar4.getMessagesController().getUser(Long.valueOf(peerId));
                                if (user3.id != prVar4.getUserConfig().getClientUserId()) {
                                    String lowerCase3 = UserObject.getUserName(user3).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user3);
                                    String str5 = user3.first_name;
                                    or orVar3 = orVar2;
                                    str2 = user3.last_name;
                                    str = str5;
                                    lowerCase = lowerCase3;
                                    orVar = orVar3;
                                }
                                orVar = orVar2;
                                strArr = strArr3;
                                i10 = i20;
                                i20 = i10 + 1;
                                prVar3 = prVar4;
                                arrayList2 = arrayList;
                                orVar2 = orVar;
                                strArr3 = strArr;
                            } else {
                                arrayList = arrayList2;
                                TLRPC.Chat chat = prVar4.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str = chat.title;
                                orVar = orVar2;
                                str2 = null;
                            }
                            strArr = strArr3;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            i10 = i20;
                            int i21 = 0;
                            boolean z14 = false;
                            while (true) {
                                if (i21 < i19) {
                                    int i22 = i21;
                                    String str6 = strArr[i22];
                                    if (lowerCase.startsWith(str6) || org.telegram.messenger.f0.w(" ", str6, lowerCase) || (translitString2 != null && (translitString2.startsWith(str6) || org.telegram.messenger.f0.w(" ", str6, translitString2)))) {
                                        str3 = lowerCase;
                                        r12 = 1;
                                    } else if (publicUsername == null || !publicUsername.startsWith(str6)) {
                                        boolean z15 = z14;
                                        str3 = lowerCase;
                                        r12 = z15;
                                    } else {
                                        str3 = lowerCase;
                                        r12 = 2;
                                    }
                                    if (r12 != 0) {
                                        if (r12 == 1) {
                                            arrayList5.add(AndroidUtilities.generateSearchName(str, str2, str6));
                                        } else {
                                            arrayList5.add(AndroidUtilities.generateSearchName(v7.j.g("@", publicUsername), null, "@" + str6));
                                        }
                                        arrayList6.add(tLObject6);
                                    } else {
                                        String str7 = translitString2;
                                        i21 = i22 + 1;
                                        String str8 = str3;
                                        z14 = r12;
                                        lowerCase = str8;
                                        translitString2 = str7;
                                    }
                                }
                            }
                            i20 = i10 + 1;
                            prVar3 = prVar4;
                            arrayList2 = arrayList;
                            orVar2 = orVar;
                            strArr3 = strArr;
                        }
                    }
                    pr prVar5 = prVar3;
                    or orVar4 = orVar2;
                    String[] strArr4 = strArr3;
                    if (arrayList3 != null) {
                        for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                            TLRPC.User user4 = prVar5.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i23)).user_id));
                            if (user4.id != prVar5.getUserConfig().getClientUserId()) {
                                String lowerCase4 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase4);
                                if (lowerCase4.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                int i24 = 0;
                                char c10 = 0;
                                while (true) {
                                    if (i24 < i19) {
                                        String str9 = strArr4[i24];
                                        if (lowerCase4.startsWith(str9) || org.telegram.messenger.f0.w(" ", str9, lowerCase4) || (translitString3 != null && (translitString3.startsWith(str9) || org.telegram.messenger.f0.w(" ", str9, translitString3)))) {
                                            c10 = 1;
                                        } else {
                                            String publicUsername2 = UserObject.getPublicUsername(user4);
                                            if (publicUsername2 != null && publicUsername2.startsWith(str9)) {
                                                c10 = 2;
                                            }
                                        }
                                        if (c10 != 0) {
                                            if (c10 == 1) {
                                                arrayList5.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str9));
                                            } else {
                                                arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str9));
                                            }
                                            arrayList4.add(user4);
                                            iVar.k(user4, user4.id);
                                        } else {
                                            i24++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ai.m3(orVar4, arrayList4, iVar, arrayList5, arrayList6, 21));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                Context context = (Context) this.d;
                d6 d6Var = (d6) this.e;
                String str10 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.l(e0Var, context, str10, str10, d6Var).show();
                break;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                ai.i3 i3Var = (ai.i3) this.c;
                a2[] a2VarArr = (a2[]) this.d;
                View view = (View) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase5 = parse.getHost().toLowerCase();
                    if (lowerCase5.startsWith("www.")) {
                        lowerCase5 = lowerCase5.substring(4);
                    }
                    i3Var.run(lowerCase5);
                    a2 a2Var2 = a2VarArr[0];
                    if (a2Var2 != null) {
                        a2Var2.dismiss();
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
            case 18:
                int[] iArr = (int[]) this.b;
                int[] iArr2 = (int[]) this.c;
                String[] strArr5 = (String[]) this.e;
                ?? r52 = (TextView) this.d;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i25 = 0;
                while (true) {
                    if (i25 < iArr.length) {
                        if (iArr2[0] == iArr[i25]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i25]);
                            spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i25++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    pq pqVar = new pq(R.drawable.arrows_select, 0);
                    pqVar.spaceScaleX = 0.7f;
                    pqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    pqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(pqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    pq pqVar2 = new pq(R.drawable.mini_switch_lock, 0);
                    pqVar2.spaceScaleX = 0.7f;
                    pqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    pqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(pqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                r52.setText(spannableStringBuilder);
                break;
            case 19:
                ChatActivityEnterView.f((ChatActivityEnterView) this.b, (qv0) this.c, (int[]) this.d, (hp0) this.e);
                break;
            case 20:
                vn vnVar = (vn) this.b;
                Context context2 = (Context) this.c;
                View view2 = (View) this.d;
                d6 d6Var2 = (d6) this.e;
                long j3 = vnVar.V;
                final org.telegram.ui.Components.w2 w2Var = new org.telegram.ui.Components.w2(8, vnVar, view2);
                th thVar2 = new th(i14);
                int i26 = h6.j5;
                int g02 = d6Var2 != null ? d6Var2.g0(i26) : h6.w0(null, i26, false);
                int i27 = h6.h5;
                int g03 = d6Var2 != null ? d6Var2.g0(i27) : h6.w0(null, i27, false);
                int i28 = h6.Ji;
                if (d6Var2 != null) {
                    d6Var2.g0(i28);
                } else {
                    h6.w0(null, i28, false);
                }
                int i29 = h6.Ni;
                if (d6Var2 != null) {
                    d6Var2.g0(i29);
                } else {
                    h6.w0(null, i29, false);
                }
                int i30 = h6.E8;
                if (d6Var2 != null) {
                    d6Var2.g0(i30);
                } else {
                    h6.w0(null, i30, false);
                }
                int i31 = h6.G8;
                if (d6Var2 != null) {
                    d6Var2.g0(i31);
                } else {
                    h6.w0(null, i31, false);
                }
                int i32 = h6.i6;
                if (d6Var2 != null) {
                    d6Var2.g0(i32);
                } else {
                    h6.w0(null, i32, false);
                }
                int i33 = h6.Sh;
                int g04 = d6Var2 != null ? d6Var2.g0(i33) : h6.w0(null, i33, false);
                int i34 = h6.Oh;
                int g05 = d6Var2 != null ? d6Var2.g0(i34) : h6.w0(null, i34, false);
                if (d6Var2 != null) {
                    d6Var2.g0(h6.Qh);
                } else {
                    h6.w0(null, h6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.e5.a;
                if (context2 != null) {
                    int i35 = g05;
                    final int i36 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final z2 z2Var = new z2(context2, d6Var2);
                    z2Var.a();
                    final ed0 ed0Var = new ed0(context2, d6Var2);
                    ed0Var.setTextColor(g02);
                    ed0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    ed0Var.setItemCount(5);
                    final org.telegram.ui.Components.d4 d4Var = new org.telegram.ui.Components.d4(context2, d6Var2);
                    d4Var.setWrapSelectorWheel(true);
                    d4Var.setAllItemsCount(24);
                    d4Var.setItemCount(5);
                    d4Var.setTextColor(g02);
                    d4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(context2, d6Var2);
                    e4Var.setWrapSelectorWheel(true);
                    e4Var.setAllItemsCount(60);
                    e4Var.setItemCount(5);
                    e4Var.setTextColor(g02);
                    e4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ?? frameLayout = new FrameLayout(context2);
                    ?? w3Var = new org.telegram.ui.Components.w3(context2, ed0Var, d4Var, e4Var, 2);
                    w3Var.setOrientation(1);
                    frameLayout.addView(w3Var, w7.y5.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context2), w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    w3Var.addView(frameLayout2, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context2);
                    textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView.setTextColor(g02);
                    textView.setTextSize(1, 20.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new bi.d(10));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    w3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setTextColor(h6.v0(h6.q5, d6Var2));
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    ai.p4 p4Var2 = new ai.p4(context2, 16);
                    p4Var2.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    w7.a6.b(p4Var2, 0.02f, 1.2f);
                    linearLayout.addView(ed0Var, w7.y5.l(0.5f, 0, 270));
                    ed0Var.setMinValue(0);
                    ed0Var.setMaxValue(365);
                    ed0Var.setWrapSelectorWheel(false);
                    ed0Var.setFormatter(new org.telegram.ui.Components.x1(7));
                    org.telegram.ui.Components.e2 e2Var = new org.telegram.ui.Components.e2(i36, ed0Var, d4Var, e4Var, textView2);
                    ed0Var.setOnValueChangedListener(e2Var);
                    d4Var.setMinValue(0);
                    d4Var.setMaxValue(23);
                    int i37 = g03;
                    linearLayout.addView(d4Var, w7.y5.l(0.2f, 0, 270));
                    d4Var.setFormatter(new org.telegram.ui.Components.x1(8));
                    d4Var.setOnValueChangedListener(e2Var);
                    e4Var.setMinValue(0);
                    e4Var.setMaxValue(59);
                    e4Var.setValue(0);
                    e4Var.setFormatter(new org.telegram.ui.Components.x1(9));
                    linearLayout.addView(e4Var, w7.y5.l(0.3f, 0, 270));
                    e4Var.setOnValueChangedListener(e2Var);
                    if (j3 <= 0 || j3 == 2147483646) {
                        thVar = thVar2;
                        viewGroup = frameLayout;
                        p4Var = p4Var2;
                    } else {
                        thVar = thVar2;
                        long j10 = j3 * 1000;
                        viewGroup = frameLayout;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        p4Var = p4Var2;
                        int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j10);
                        if (timeInMillis >= 0) {
                            e4Var.setValue(calendar.get(12));
                            d4Var.setValue(calendar.get(11));
                            ed0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr5 = {true};
                    org.telegram.ui.Components.e5.g(null, null, 0L, i36, 3, ed0Var, d4Var, e4Var);
                    org.telegram.ui.Components.e5.e(textView2, ed0Var, d4Var, e4Var);
                    p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    p4Var.setGravity(17);
                    p4Var.setTextColor(g04);
                    p4Var.setTextSize(1, 14.0f);
                    p4Var.setTypeface(AndroidUtilities.bold());
                    p4Var.setBackground(w5.e(new float[]{24.0f}, i35));
                    w3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 14, 15, 14, 16));
                    p4Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Runnable runnable2;
                            zArr5[0] = false;
                            long j11 = i36;
                            ed0 ed0Var2 = ed0Var;
                            d4 d4Var2 = d4Var;
                            e4 e4Var2 = e4Var;
                            boolean g10 = e5.g(null, null, 0L, j11, 3, ed0Var2, d4Var2, e4Var2);
                            e5.e(textView2, ed0Var2, d4Var2, e4Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, ed0Var2.getValue());
                            calendar2.set(11, d4Var2.getValue());
                            calendar2.set(12, e4Var2.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            w2Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = z2Var.a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    w3Var.addView(textView2, w7.y5.t(-1, -2, 83, 14, 0, 14, 16));
                    z2Var.b(viewGroup);
                    e3 e3Var = z2Var.a;
                    e3Var.show();
                    e3Var.setOnDismissListener(new org.telegram.ui.Components.g2(0, thVar, zArr5));
                    e3Var.setBackgroundColor(i37);
                    e3Var.fixNavigationBar(i37);
                    break;
                }
                break;
            case 21:
                hy hyVar = (hy) this.b;
                a2[] a2VarArr2 = (a2[]) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                z2 z2Var2 = (z2) this.e;
                hyVar.getClass();
                try {
                    a2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    nf.f.s(hyVar.c.a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    runnable = z2Var2.a.dismissRunnable;
                    runnable.run();
                    break;
                }
                break;
            case 22:
                ez ezVar = (ez) this.b;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                Runnable runnable2 = (Runnable) this.e;
                ArrayList arrayList7 = ezVar.s;
                gz gzVar = ezVar.w;
                if (gzVar.M == ezVar.b) {
                    gzVar.L = 0;
                    if (tL_messages_getStickers.emoticon.equals(ezVar.a)) {
                        if (!(tLObject8 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject8;
                            int size2 = arrayList7.size();
                            int size3 = tL_messages_stickers.stickers.size();
                            while (i15 < size3) {
                                TLRPC.Document document2 = tL_messages_stickers.stickers.get(i15);
                                if (ezVar.v.indexOfKey(document2.id) < 0) {
                                    arrayList7.add(document2);
                                }
                                i15++;
                            }
                            if (size2 != arrayList7.size()) {
                                ezVar.f.put(arrayList7, gzVar.N);
                                if (size2 == 0) {
                                    ezVar.h.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
            case 23:
                d10 d10Var = (d10) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                d10Var.z0 = -1;
                m2 m2Var = d10Var.n;
                b10.r0(tL_error3, m2Var, xc.a0(m2Var));
                if (tLObject9 != null) {
                    if (tLObject9 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject9;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i12 = ((TL_update.TL_updateDialogFilter) update).id;
                            }
                        } else {
                            while (true) {
                                if (i15 < arrayList8.size()) {
                                    if (arrayList8.get(i15) instanceof TL_update.TL_updateDialogFilter) {
                                        i12 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i15)).id;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                    }
                    if (d10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        m2Var.getMessagesController().loadRemoteFilters(true, new ei.r4(d10Var, callback, i12, i13));
                        break;
                    } else {
                        if (d10Var.a0 != null) {
                            m2Var.getMessagesController().checkChatlistFolderUpdate(d10Var.Y, true);
                        }
                        d10Var.A0 = true;
                        d10Var.dismiss();
                        callback.run(Integer.valueOf(i12));
                        break;
                    }
                } else {
                    d10Var.l0.a(false);
                    break;
                }
            case 24:
                qy qyVar = (qy) this.b;
                Integer num = (Integer) this.c;
                oc ocVar = (oc) this.d;
                m2 m2Var2 = (m2) this.e;
                qyVar.w4(num.intValue());
                AndroidUtilities.runOnUIThread(new vw(i11, ocVar, m2Var2), 200L);
                break;
            case 25:
                s30.N((s30) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (TLRPC.TL_channels_getParticipants) this.e);
                break;
            case 26:
                r80.n((r80) this.b, (TLRPC.TL_error) this.c, (TLRPC.Updates) this.d, (TLRPC.TL_messages_importChatInvite) this.e);
                break;
            case 27:
                g90 g90Var = (g90) this.b;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLObject tLObject10 = (TLObject) this.e;
                g90Var.y = false;
                g90Var.K = tL_chatInviteExported.link;
                if (tL_error4 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject10;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i15 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i15++;
                    }
                    g90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 28:
                na0 na0Var = (na0) this.b;
                boolean[] zArr6 = (boolean[]) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                boolean[] zArr7 = (boolean[]) this.e;
                zArr6[0] = true;
                AndroidUtilities.cancelRunOnUIThread(na0Var.U);
                for (int i38 = 0; i38 < arrayList9.size(); i38++) {
                    ((TL_stories.StoryItem) arrayList9.get(i38)).pinned = zArr7[i38];
                }
                na0Var.getMessagesController().getStoriesController().n0(na0Var.e, arrayList9, false);
                break;
            default:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                ci.d dVar = (ci.d) this.c;
                e3 e3Var2 = (e3) this.d;
                Runnable runnable3 = (Runnable) this.e;
                if (tL_error5 != null) {
                    xc.X().d0(tL_error5, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    e3Var2.dismiss();
                    xc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                    runnable3.run();
                    break;
                }
        }
    }

    public /* synthetic */ l5(or orVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 15;
        this.b = orVar;
        this.d = str;
        this.c = arrayList;
        this.e = arrayList2;
    }

    public /* synthetic */ l5(d10 d10Var, TLRPC.TL_error tL_error, TLObject tLObject, Utilities.Callback callback) {
        this.a = 23;
        this.c = d10Var;
        this.d = tL_error;
        this.e = tLObject;
        this.b = callback;
    }

    public /* synthetic */ l5(int[] iArr, int[] iArr2, String[] strArr, TextView textView) {
        this.a = 18;
        this.b = iArr;
        this.c = iArr2;
        this.e = strArr;
        this.d = textView;
    }
}
