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
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zu;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ar;
import org.telegram.ui.co;
import org.telegram.ui.f10;
import org.telegram.ui.h8;
import org.telegram.ui.m6;
import org.telegram.ui.nf;
import org.telegram.ui.o6;
import org.telegram.ui.p6;
import org.telegram.ui.qa;
import org.telegram.ui.qq;
import org.telegram.ui.r6;
import org.telegram.ui.ta;
import org.telegram.ui.u41;
import org.telegram.ui.ur;
import org.telegram.ui.uy;
import org.telegram.ui.vr;
import org.telegram.ui.xp;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0d6c  */
    /* JADX WARN: Type inference failed for: r14v20, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r18v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, org.telegram.ui.Components.w3] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r2v24, types: [org.telegram.ui.ActionBar.n2] */
    /* JADX WARN: Type inference failed for: r5v47, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v32, types: [org.telegram.ui.ActionBar.a3] */
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
        ur urVar;
        String lowerCase;
        String publicUsername;
        String str;
        String str2;
        String str3;
        ?? r12;
        ViewGroup viewGroup;
        int i11;
        Runnable runnable;
        int i12 = 11;
        int i13 = -1;
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
        int i17 = 0;
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
                                z10 = true;
                            } else {
                                i6Var.F = tL_theme2;
                                i6Var.G = false;
                                i6Var.g0 = null;
                                i6Var.h0 = null;
                                NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(i6Var.E);
                                TLRPC.TL_theme tL_theme3 = i6Var.F;
                                z10 = true;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
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
                                int i18 = NotificationCenter.needSetDayNightTheme;
                                i6 i6Var3 = j6.I;
                                z12 = true;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i18, i6Var3, Boolean.valueOf(j6.J == i6Var3), null, -1);
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
                p6 p6Var = (p6) this.b;
                r6 r6Var = (r6) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                p6Var.getClass();
                r6Var.a(fArr[0]);
                if (zArr[0]) {
                    p6Var.d.w0(true);
                    break;
                }
                break;
            case 2:
                p6 p6Var2 = (p6) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                o6 o6Var = (o6) this.e;
                if (!zArr2[0]) {
                    jArr[0] = System.currentTimeMillis();
                    p6Var2.d.showDialog(o6Var);
                    break;
                }
                break;
            case 3:
                h8.U((h8) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (Calendar) this.e);
                break;
            case 4:
                qa.U((qa) this.b, (b2) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 5:
                co coVar = (co) this.b;
                ?? r22 = (n2) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                d5 d5Var = (d5) this.e;
                if (r22 instanceof NotificationCenter.NotificationCenterDelegate) {
                    coVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r22, NotificationCenter.closeChats);
                }
                coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) d5Var).c(d5Var.getFragmentStack().size() - 1, new co(bundle));
                r22.finishFragment();
                break;
            case 6:
                co coVar2 = (co) this.c;
                of.e eVar = (of.e) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                ta taVar = (ta) this.e;
                eVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    coVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    coVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = coVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        taVar.run(user);
                        break;
                    }
                }
                user = null;
                taVar.run(user);
            case 7:
                long[] jArr2 = (long[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                or orVar = (or) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.c3(orVar, 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(pr.f);
                ofFloat.start();
                break;
            case 8:
                co coVar3 = (co) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                b2 b2Var = (b2) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = r90.f(messageObject2);
                    th2 = null;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    th2 = th3;
                    tL_webPage = null;
                }
                AndroidUtilities.runOnUIThread(new i2.b1(coVar3, b2Var, zArr4, th2 == null && tL_webPage != null, messageObject2, tL_webPage, 7));
                break;
            case 9:
                co coVar4 = (co) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        coVar4.l6 = messages_messages.count;
                        z13 = false;
                    } else {
                        z13 = false;
                        coVar4.l6 = 0;
                    }
                    messagesStorage.resetMentionsCount(coVar4.T5, coVar4.d(), coVar4.l6);
                    int i19 = coVar4.l6;
                    if (i19 == 0) {
                        coVar4.m6 = true;
                        coVar4.Kb(z13);
                        break;
                    } else {
                        coVar4.j1.c(2, i19, true);
                        coVar4.H9();
                        break;
                    }
                } else {
                    int i20 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) coVar4.o6[0].get(i20);
                    messagesStorage.markMessageAsMention(coVar4.T5, i20);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    coVar4.F(i20, 0, 0, 0, false, true);
                    break;
                }
            case 10:
                co.n0((co) this.b, (TLRPC.TL_messageMediaWebPage) this.c, (TLRPC.TL_webPageAttributeStory) this.d, (m6) this.e);
                break;
            case 11:
                xp.W((xp) this.b, (b2[]) this.c, (TLRPC.Chat) this.d, (n2) this.e);
                break;
            case 12:
                qq qqVar = (qq) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                qqVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    qqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 13:
                vr vrVar = (vr) this.c;
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                ar arVar = (ar) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    arVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vrVar.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
                    alertDialog$Builder.a.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new org.telegram.ui.z0(arVar, 23));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    vrVar.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 14:
                ur urVar2 = (ur) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                vr vrVar2 = urVar2.y;
                String lowerCase2 = str4.trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new bi.z2(urVar2, new ArrayList(), new a0.i(), new ArrayList(), new ArrayList(), 21));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i21 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i21];
                    strArr2[0] = lowerCase2;
                    if (translitString != null) {
                        strArr2[1] = translitString;
                    }
                    vr vrVar3 = vrVar2;
                    ArrayList arrayList4 = new ArrayList();
                    a0.i iVar = new a0.i();
                    ArrayList arrayList5 = new ArrayList();
                    String[] strArr3 = strArr2;
                    ArrayList arrayList6 = new ArrayList();
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i22 = 0;
                        while (i22 < size) {
                            TLObject tLObject6 = (TLObject) arrayList2.get(i22);
                            vr vrVar4 = vrVar3;
                            if (tLObject6 instanceof TLRPC.ChatParticipant) {
                                peerId = ((TLRPC.ChatParticipant) tLObject6).user_id;
                            } else if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject6).peer);
                            } else {
                                arrayList = arrayList2;
                                urVar = urVar2;
                                strArr = strArr3;
                                i10 = i22;
                                i22 = i10 + 1;
                                vrVar3 = vrVar4;
                                arrayList2 = arrayList;
                                urVar2 = urVar;
                                strArr3 = strArr;
                            }
                            if (peerId > 0) {
                                arrayList = arrayList2;
                                TLRPC.User user3 = vrVar4.getMessagesController().getUser(Long.valueOf(peerId));
                                if (user3.id != vrVar4.getUserConfig().getClientUserId()) {
                                    String lowerCase3 = UserObject.getUserName(user3).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user3);
                                    String str5 = user3.first_name;
                                    ur urVar3 = urVar2;
                                    str2 = user3.last_name;
                                    str = str5;
                                    lowerCase = lowerCase3;
                                    urVar = urVar3;
                                }
                                urVar = urVar2;
                                strArr = strArr3;
                                i10 = i22;
                                i22 = i10 + 1;
                                vrVar3 = vrVar4;
                                arrayList2 = arrayList;
                                urVar2 = urVar;
                                strArr3 = strArr;
                            } else {
                                arrayList = arrayList2;
                                TLRPC.Chat chat = vrVar4.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str = chat.title;
                                urVar = urVar2;
                                str2 = null;
                            }
                            strArr = strArr3;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            i10 = i22;
                            int i23 = 0;
                            boolean z14 = false;
                            while (true) {
                                if (i23 < i21) {
                                    int i24 = i23;
                                    String str6 = strArr[i24];
                                    if (lowerCase.startsWith(str6) || org.telegram.messenger.w1.w(" ", str6, lowerCase) || (translitString2 != null && (translitString2.startsWith(str6) || org.telegram.messenger.w1.w(" ", str6, translitString2)))) {
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
                                            arrayList5.add(AndroidUtilities.generateSearchName(org.telegram.ui.Cells.p6.i("@", publicUsername), null, "@" + str6));
                                        }
                                        arrayList6.add(tLObject6);
                                    } else {
                                        String str7 = translitString2;
                                        i23 = i24 + 1;
                                        String str8 = str3;
                                        z14 = r12;
                                        lowerCase = str8;
                                        translitString2 = str7;
                                    }
                                }
                            }
                            i22 = i10 + 1;
                            vrVar3 = vrVar4;
                            arrayList2 = arrayList;
                            urVar2 = urVar;
                            strArr3 = strArr;
                        }
                    }
                    vr vrVar5 = vrVar3;
                    ur urVar4 = urVar2;
                    String[] strArr4 = strArr3;
                    if (arrayList3 != null) {
                        for (int i25 = 0; i25 < arrayList3.size(); i25++) {
                            TLRPC.User user4 = vrVar5.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i25)).user_id));
                            if (user4.id != vrVar5.getUserConfig().getClientUserId()) {
                                String lowerCase4 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase4);
                                if (lowerCase4.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                int i26 = 0;
                                char c10 = 0;
                                while (true) {
                                    if (i26 < i21) {
                                        String str9 = strArr4[i26];
                                        if (lowerCase4.startsWith(str9) || org.telegram.messenger.w1.w(" ", str9, lowerCase4) || (translitString3 != null && (translitString3.startsWith(str9) || org.telegram.messenger.w1.w(" ", str9, translitString3)))) {
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
                                            i26++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new bi.z2(urVar4, arrayList4, iVar, arrayList5, arrayList6, 21));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                Context context = (Context) this.d;
                f6 f6Var = (f6) this.e;
                String str10 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.m(f0Var, context, str10, str10, f6Var).show();
                break;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                bi.v2 v2Var = (bi.v2) this.c;
                b2[] b2VarArr = (b2[]) this.d;
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
                    v2Var.run(lowerCase5);
                    b2 b2Var2 = b2VarArr[0];
                    if (b2Var2 != null) {
                        b2Var2.dismiss();
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
                String[] strArr5 = (String[]) this.d;
                ?? r52 = (TextView) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i27 = 0;
                while (true) {
                    if (i27 < iArr.length) {
                        if (iArr2[0] == iArr[i27]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i27]);
                            spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i27++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    nq nqVar = new nq(R.drawable.arrows_select, 0);
                    nqVar.spaceScaleX = 0.7f;
                    nqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    nqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    nq nqVar2 = new nq(R.drawable.mini_switch_lock, 0);
                    nqVar2.spaceScaleX = 0.7f;
                    nqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    nqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(nqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                r52.setText(spannableStringBuilder);
                break;
            case 18:
                ChatActivityEnterView.f((ChatActivityEnterView) this.b, (ev0) this.c, (int[]) this.d, (uo0) this.e);
                break;
            case 19:
                tn tnVar = (tn) this.b;
                Context context2 = (Context) this.c;
                View view2 = (View) this.d;
                f6 f6Var2 = (f6) this.e;
                long j3 = tnVar.V;
                final org.telegram.ui.Components.b3 b3Var = new org.telegram.ui.Components.b3(7, tnVar, view2);
                ue ueVar = new ue(i15);
                int i28 = j6.j5;
                int h02 = f6Var2 != null ? f6Var2.h0(i28) : j6.w0(null, i28, false);
                int i29 = j6.h5;
                int h03 = f6Var2 != null ? f6Var2.h0(i29) : j6.w0(null, i29, false);
                int i30 = j6.Ji;
                if (f6Var2 != null) {
                    f6Var2.h0(i30);
                } else {
                    j6.w0(null, i30, false);
                }
                int i31 = j6.Ni;
                if (f6Var2 != null) {
                    f6Var2.h0(i31);
                } else {
                    j6.w0(null, i31, false);
                }
                int i32 = j6.E8;
                if (f6Var2 != null) {
                    f6Var2.h0(i32);
                } else {
                    j6.w0(null, i32, false);
                }
                int i33 = j6.G8;
                if (f6Var2 != null) {
                    f6Var2.h0(i33);
                } else {
                    j6.w0(null, i33, false);
                }
                int i34 = j6.i6;
                if (f6Var2 != null) {
                    f6Var2.h0(i34);
                } else {
                    j6.w0(null, i34, false);
                }
                int i35 = j6.Sh;
                int h04 = f6Var2 != null ? f6Var2.h0(i35) : j6.w0(null, i35, false);
                int i36 = j6.Oh;
                int h05 = f6Var2 != null ? f6Var2.h0(i36) : j6.w0(null, i36, false);
                if (f6Var2 != null) {
                    f6Var2.h0(j6.Qh);
                } else {
                    j6.w0(null, j6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.e5.a;
                if (context2 != null) {
                    int i37 = h03;
                    final int i38 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final ?? a3Var = new a3(context2, f6Var2);
                    a3Var.a();
                    final vc0 vc0Var = new vc0(context2, f6Var2);
                    vc0Var.setTextColor(h02);
                    vc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    vc0Var.setItemCount(5);
                    final org.telegram.ui.Components.d4 d4Var = new org.telegram.ui.Components.d4(context2, f6Var2);
                    d4Var.setWrapSelectorWheel(true);
                    d4Var.setAllItemsCount(24);
                    d4Var.setItemCount(5);
                    d4Var.setTextColor(h02);
                    d4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(context2, f6Var2);
                    e4Var.setWrapSelectorWheel(true);
                    e4Var.setAllItemsCount(60);
                    e4Var.setItemCount(5);
                    e4Var.setTextColor(h02);
                    e4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ?? frameLayout = new FrameLayout(context2);
                    ?? w3Var = new org.telegram.ui.Components.w3(context2, vc0Var, d4Var, e4Var, 2);
                    w3Var.setOrientation(1);
                    frameLayout.addView(w3Var, w7.x5.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context2), w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    w3Var.addView(frameLayout2, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context2);
                    textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView.setTextColor(h02);
                    textView.setTextSize(1, 20.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new ci.d(10));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    w3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setTextColor(j6.v0(j6.q5, f6Var2));
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    bi.c4 c4Var = new bi.c4(context2, 16);
                    c4Var.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    w7.z5.b(c4Var, 0.02f, 1.2f);
                    linearLayout.addView(vc0Var, w7.x5.l(0.5f, 0, 270));
                    vc0Var.setMinValue(0);
                    vc0Var.setMaxValue(365);
                    vc0Var.setWrapSelectorWheel(false);
                    vc0Var.setFormatter(new org.telegram.ui.Components.f(19));
                    org.telegram.ui.Components.e2 e2Var = new org.telegram.ui.Components.e2(i38, vc0Var, d4Var, e4Var, textView2);
                    vc0Var.setOnValueChangedListener(e2Var);
                    d4Var.setMinValue(0);
                    d4Var.setMaxValue(23);
                    linearLayout.addView(d4Var, w7.x5.l(0.2f, 0, 270));
                    d4Var.setFormatter(new org.telegram.ui.Components.f(20));
                    d4Var.setOnValueChangedListener(e2Var);
                    e4Var.setMinValue(0);
                    e4Var.setMaxValue(59);
                    e4Var.setValue(0);
                    e4Var.setFormatter(new org.telegram.ui.Components.f(21));
                    linearLayout.addView(e4Var, w7.x5.l(0.3f, 0, 270));
                    e4Var.setOnValueChangedListener(e2Var);
                    if (j3 <= 0 || j3 == 2147483646) {
                        viewGroup = w3Var;
                        i11 = h04;
                    } else {
                        long j10 = j3 * 1000;
                        viewGroup = w3Var;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        i11 = h04;
                        int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j10);
                        if (timeInMillis >= 0) {
                            e4Var.setValue(calendar.get(12));
                            d4Var.setValue(calendar.get(11));
                            vc0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr5 = {true};
                    org.telegram.ui.Components.e5.g(null, null, 0L, i38, 3, vc0Var, d4Var, e4Var);
                    org.telegram.ui.Components.e5.e(textView2, vc0Var, d4Var, e4Var);
                    c4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    c4Var.setGravity(17);
                    c4Var.setTextColor(i11);
                    c4Var.setTextSize(1, 14.0f);
                    c4Var.setTypeface(AndroidUtilities.bold());
                    c4Var.setBackground(y5.e(new float[]{24.0f}, h05));
                    viewGroup.addView(c4Var, w7.x5.t(-1, 48, 83, 14, 15, 14, 16));
                    c4Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Runnable runnable2;
                            zArr5[0] = false;
                            long j11 = i38;
                            vc0 vc0Var2 = vc0Var;
                            d4 d4Var2 = d4Var;
                            e4 e4Var2 = e4Var;
                            boolean g10 = e5.g(null, null, 0L, j11, 3, vc0Var2, d4Var2, e4Var2);
                            e5.e(textView2, vc0Var2, d4Var2, e4Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, vc0Var2.getValue());
                            calendar2.set(11, d4Var2.getValue());
                            calendar2.set(12, e4Var2.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            b3Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = a3Var.a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    viewGroup.addView(textView2, w7.x5.t(-1, -2, 83, 14, 0, 14, 16));
                    a3Var.b(frameLayout);
                    f3 f3Var = a3Var.a;
                    f3Var.show();
                    f3Var.setOnDismissListener(new org.telegram.ui.Components.g2(0, ueVar, zArr5));
                    f3Var.setBackgroundColor(i37);
                    f3Var.fixNavigationBar(i37);
                    break;
                }
                break;
            case 20:
                gy gyVar = (gy) this.c;
                b2[] b2VarArr2 = (b2[]) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                a3 a3Var2 = (a3) this.e;
                gyVar.getClass();
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    of.f.s(gyVar.c.a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    runnable = a3Var2.a.dismissRunnable;
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
                            while (i17 < size3) {
                                TLRPC.Document document2 = tL_messages_stickers.stickers.get(i17);
                                if (dzVar.v.indexOfKey(document2.id) < 0) {
                                    arrayList7.add(document2);
                                }
                                i17++;
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
                n2 n2Var = c10Var.n;
                f10.r0(tL_error3, n2Var, yc.a0(n2Var));
                if (tLObject9 != null) {
                    if (tLObject9 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject9;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i13 = ((TL_update.TL_updateDialogFilter) update).id;
                            }
                        } else {
                            while (true) {
                                if (i17 < arrayList8.size()) {
                                    if (arrayList8.get(i17) instanceof TL_update.TL_updateDialogFilter) {
                                        i13 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i17)).id;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        }
                    }
                    if (c10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        n2Var.getMessagesController().loadRemoteFilters(true, new fi.s4(c10Var, callback, i13, i14));
                        break;
                    } else {
                        if (c10Var.a0 != null) {
                            n2Var.getMessagesController().checkChatlistFolderUpdate(c10Var.Y, true);
                        }
                        c10Var.A0 = true;
                        c10Var.dismiss();
                        callback.run(Integer.valueOf(i13));
                        break;
                    }
                } else {
                    c10Var.l0.a(false);
                    break;
                }
            case 23:
                uy uyVar = (uy) this.b;
                Integer num = (Integer) this.c;
                nf nfVar = (nf) this.d;
                n2 n2Var2 = (n2) this.e;
                uyVar.w4(num.intValue());
                AndroidUtilities.runOnUIThread(new zu(i12, nfVar, n2Var2), 200L);
                break;
            case 24:
                r30.N((r30) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (TLRPC.TL_channels_getParticipants) this.e);
                break;
            case 25:
                g80.n((g80) this.b, (TLRPC.TL_error) this.c, (TLRPC.Updates) this.d, (TLRPC.TL_messages_importChatInvite) this.e);
                break;
            case 26:
                w80 w80Var = (w80) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                TLObject tLObject10 = (TLObject) this.b;
                w80Var.y = false;
                w80Var.K = tL_chatInviteExported.link;
                if (tL_error4 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject10;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    while (i17 < tL_messages_chatInviteImporters.users.size()) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                        i17++;
                    }
                    w80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 27:
                ca0 ca0Var = (ca0) this.b;
                boolean[] zArr6 = (boolean[]) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                boolean[] zArr7 = (boolean[]) this.e;
                zArr6[0] = true;
                AndroidUtilities.cancelRunOnUIThread(ca0Var.U);
                for (int i39 = 0; i39 < arrayList9.size(); i39++) {
                    ((TL_stories.StoryItem) arrayList9.get(i39)).pinned = zArr7[i39];
                }
                ca0Var.getMessagesController().getStoriesController().n0(ca0Var.e, arrayList9, false);
                break;
            case 28:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                di.d dVar = (di.d) this.c;
                f3 f3Var2 = (f3) this.d;
                Runnable runnable3 = (Runnable) this.e;
                if (tL_error5 != null) {
                    yc.X().d0(tL_error5, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    f3Var2.dismiss();
                    yc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                    runnable3.run();
                    break;
                }
            default:
                rn0 rn0Var = (rn0) this.b;
                uy uyVar2 = (uy) this.c;
                Context context3 = (Context) this.d;
                n70 n70Var = (n70) this.e;
                uyVar2.showDialog(new u41(context3, uyVar2.getResourceProvider(), new jn0(i16, rn0Var, uyVar2)));
                n70Var.u();
                break;
        }
    }

    public /* synthetic */ n5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = tLObject;
        this.e = obj3;
    }

    public /* synthetic */ n5(n2 n2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.a = i10;
        this.c = n2Var;
        this.b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public /* synthetic */ n5(w80 w80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = 26;
        this.c = w80Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.b = tLObject;
    }
}
