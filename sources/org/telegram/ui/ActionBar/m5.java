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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c10;
import org.telegram.ui.h8;
import org.telegram.ui.k41;
import org.telegram.ui.lq;
import org.telegram.ui.m6;
import org.telegram.ui.o6;
import org.telegram.ui.oc;
import org.telegram.ui.p6;
import org.telegram.ui.pr;
import org.telegram.ui.qa;
import org.telegram.ui.r6;
import org.telegram.ui.ry;
import org.telegram.ui.sa;
import org.telegram.ui.sp;
import org.telegram.ui.vq;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0d6d  */
    /* JADX WARN: Type inference failed for: r13v14, types: [org.telegram.ui.ActionBar.a3] */
    /* JADX WARN: Type inference failed for: r16v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, org.telegram.ui.Components.w3] */
    /* JADX WARN: Type inference failed for: r2v24, types: [org.telegram.ui.ActionBar.n2] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v58, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v61, types: [android.view.ViewGroup, android.widget.FrameLayout] */
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
        int i10;
        String str;
        int i11;
        String[] strArr;
        long peerId;
        int i12;
        pr prVar;
        ArrayList arrayList;
        String lowerCase;
        String publicUsername;
        String str2;
        String str3;
        String str4;
        ?? r52;
        org.telegram.ui.Components.d4 d4Var;
        Runnable runnable;
        String str5 = " ";
        int i13 = -1;
        int i14 = 3;
        int i15 = 5;
        int i16 = 1;
        int i17 = 0;
        switch (this.a) {
            case 0:
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
                            } else {
                                g6Var.F = tL_theme2;
                                g6Var.G = false;
                                g6Var.g0 = null;
                                g6Var.h0 = null;
                                NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(g6Var.E);
                                TLRPC.TL_theme tL_theme3 = g6Var.F;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z10 = true;
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
                                int i18 = NotificationCenter.needSetDayNightTheme;
                                g6 g6Var3 = h6.I;
                                z12 = true;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i18, g6Var3, Boolean.valueOf(h6.J == g6Var3), null, -1);
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
                xn xnVar = (xn) this.b;
                ?? r22 = (n2) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                c5 c5Var = (c5) this.e;
                if (r22 instanceof NotificationCenter.NotificationCenterDelegate) {
                    xnVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r22, NotificationCenter.closeChats);
                }
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) c5Var).c(c5Var.getFragmentStack().size() - 1, new xn(bundle));
                r22.finishFragment();
                break;
            case 6:
                xn xnVar2 = (xn) this.c;
                nf.e eVar = (nf.e) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                sa saVar = (sa) this.e;
                eVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    xnVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    xnVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = xnVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        saVar.run(user);
                        break;
                    }
                }
                user = null;
                saVar.run(user);
            case 7:
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
            case 8:
                xn xnVar3 = (xn) this.b;
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
                AndroidUtilities.runOnUIThread(new i2.c1(xnVar3, b2Var, zArr4, th2 == null && tL_webPage != null, messageObject2, tL_webPage, 7));
                break;
            case 9:
                xn xnVar4 = (xn) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        xnVar4.l6 = messages_messages.count;
                        z13 = false;
                    } else {
                        z13 = false;
                        xnVar4.l6 = 0;
                    }
                    messagesStorage.resetMentionsCount(xnVar4.T5, xnVar4.d(), xnVar4.l6);
                    int i19 = xnVar4.l6;
                    if (i19 == 0) {
                        xnVar4.m6 = true;
                        xnVar4.Kb(z13);
                        break;
                    } else {
                        xnVar4.j1.c(2, i19, true);
                        xnVar4.H9();
                        break;
                    }
                } else {
                    int i20 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) xnVar4.o6[0].get(i20);
                    messagesStorage.markMessageAsMention(xnVar4.T5, i20);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    xnVar4.F(i20, 0, 0, 0, false, true);
                    break;
                }
            case 10:
                xn.o0((xn) this.b, (TLRPC.TL_messageMediaWebPage) this.c, (TLRPC.TL_webPageAttributeStory) this.d, (m6) this.e);
                break;
            case 11:
                sp.W((sp) this.b, (b2[]) this.c, (TLRPC.Chat) this.d, (n2) this.e);
                break;
            case 12:
                lq lqVar = (lq) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                lqVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    lqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.qr qrVar2 = (org.telegram.ui.qr) this.c;
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                vq vqVar = (vq) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    vqVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qrVar2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
                    alertDialog$Builder.a.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new org.telegram.ui.z0(vqVar, 23));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    qrVar2.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 14:
                pr prVar2 = (pr) this.b;
                String str6 = (String) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                org.telegram.ui.qr qrVar3 = prVar2.y;
                String lowerCase2 = str6.trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ai.m3(prVar2, new ArrayList(), new a0.i(), new ArrayList(), new ArrayList(), 21));
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
                    org.telegram.ui.qr qrVar4 = qrVar3;
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
                            org.telegram.ui.qr qrVar5 = qrVar4;
                            if (tLObject6 instanceof TLRPC.ChatParticipant) {
                                i11 = i22;
                                strArr = strArr3;
                                peerId = ((TLRPC.ChatParticipant) tLObject6).user_id;
                            } else {
                                i11 = i22;
                                strArr = strArr3;
                                if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject6).peer);
                                }
                                arrayList = arrayList2;
                                prVar = prVar2;
                                i12 = size;
                                i22 = i11 + 1;
                                qrVar4 = qrVar5;
                                strArr3 = strArr;
                                arrayList2 = arrayList;
                                prVar2 = prVar;
                                size = i12;
                            }
                            if (peerId > 0) {
                                TLRPC.User user3 = qrVar5.getMessagesController().getUser(Long.valueOf(peerId));
                                if (user3.id != qrVar5.getUserConfig().getClientUserId()) {
                                    lowerCase = UserObject.getUserName(user3).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user3);
                                    arrayList = arrayList2;
                                    str2 = user3.first_name;
                                    str3 = user3.last_name;
                                }
                                arrayList = arrayList2;
                                prVar = prVar2;
                                i12 = size;
                                i22 = i11 + 1;
                                qrVar4 = qrVar5;
                                strArr3 = strArr;
                                arrayList2 = arrayList;
                                prVar2 = prVar;
                                size = i12;
                            } else {
                                arrayList = arrayList2;
                                TLRPC.Chat chat = qrVar5.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str2 = chat.title;
                                str3 = null;
                            }
                            prVar = prVar2;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            i12 = size;
                            int i23 = 0;
                            boolean z14 = false;
                            while (true) {
                                if (i23 < i21) {
                                    int i24 = i23;
                                    String str7 = strArr[i24];
                                    if (lowerCase.startsWith(str7) || org.telegram.messenger.z0.w(" ", str7, lowerCase) || (translitString2 != null && (translitString2.startsWith(str7) || org.telegram.messenger.z0.w(" ", str7, translitString2)))) {
                                        str4 = translitString2;
                                        r52 = 1;
                                    } else if (publicUsername == null || !publicUsername.startsWith(str7)) {
                                        boolean z15 = z14;
                                        str4 = translitString2;
                                        r52 = z15;
                                    } else {
                                        str4 = translitString2;
                                        r52 = 2;
                                    }
                                    if (r52 != 0) {
                                        if (r52 == 1) {
                                            arrayList5.add(AndroidUtilities.generateSearchName(str2, str3, str7));
                                        } else {
                                            arrayList5.add(AndroidUtilities.generateSearchName(org.telegram.ui.Cells.q3.i("@", publicUsername), null, "@" + str7));
                                        }
                                        arrayList6.add(tLObject6);
                                    } else {
                                        String str8 = lowerCase;
                                        i23 = i24 + 1;
                                        String str9 = str4;
                                        z14 = r52;
                                        translitString2 = str9;
                                        lowerCase = str8;
                                    }
                                }
                            }
                            i22 = i11 + 1;
                            qrVar4 = qrVar5;
                            strArr3 = strArr;
                            arrayList2 = arrayList;
                            prVar2 = prVar;
                            size = i12;
                        }
                    }
                    org.telegram.ui.qr qrVar6 = qrVar4;
                    pr prVar3 = prVar2;
                    String[] strArr4 = strArr3;
                    if (arrayList3 != null) {
                        int i25 = 0;
                        while (i25 < arrayList3.size()) {
                            TLRPC.User user4 = qrVar6.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i25)).user_id));
                            if (user4.id != qrVar6.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                if (lowerCase3.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                char c10 = 0;
                                int i26 = 0;
                                while (i26 < i21) {
                                    String str10 = strArr4[i26];
                                    if (lowerCase3.startsWith(str10) || org.telegram.messenger.z0.w(str5, str10, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str10) || org.telegram.messenger.z0.w(str5, str10, translitString3)))) {
                                        i10 = i25;
                                        c10 = 1;
                                    } else {
                                        i10 = i25;
                                        String publicUsername2 = UserObject.getPublicUsername(user4);
                                        if (publicUsername2 != null && publicUsername2.startsWith(str10)) {
                                            c10 = 2;
                                        }
                                    }
                                    if (c10 != 0) {
                                        str = str5;
                                        if (c10 == 1) {
                                            arrayList5.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str10));
                                        } else {
                                            arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str10));
                                        }
                                        arrayList4.add(user4);
                                        iVar.k(user4, user4.id);
                                        str5 = str;
                                        i25 = i10 + 1;
                                    } else {
                                        i26++;
                                        i25 = i10;
                                    }
                                }
                            }
                            i10 = i25;
                            str = str5;
                            str5 = str;
                            i25 = i10 + 1;
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ai.m3(prVar3, arrayList4, iVar, arrayList5, arrayList6, 21));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                Context context = (Context) this.d;
                d6 d6Var = (d6) this.e;
                String str11 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.l(e0Var, context, str11, str11, d6Var).show();
                break;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                ai.i3 i3Var = (ai.i3) this.c;
                b2[] b2VarArr = (b2[]) this.d;
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
                ?? r53 = (TextView) this.e;
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
                r53.setText(spannableStringBuilder);
                break;
            case 18:
                ChatActivityEnterView.f((ChatActivityEnterView) this.b, (fv0) this.c, (int[]) this.d, (uo0) this.e);
                break;
            case 19:
                vn vnVar = (vn) this.b;
                Context context2 = (Context) this.c;
                View view2 = (View) this.d;
                d6 d6Var2 = (d6) this.e;
                long j3 = vnVar.V;
                final org.telegram.ui.Components.b3 b3Var = new org.telegram.ui.Components.b3(7, vnVar, view2);
                th thVar = new th(i16);
                int i28 = h6.j5;
                int g02 = d6Var2 != null ? d6Var2.g0(i28) : h6.w0(null, i28, false);
                int i29 = h6.h5;
                int g03 = d6Var2 != null ? d6Var2.g0(i29) : h6.w0(null, i29, false);
                int i30 = h6.Ji;
                if (d6Var2 != null) {
                    d6Var2.g0(i30);
                } else {
                    h6.w0(null, i30, false);
                }
                int i31 = h6.Ni;
                if (d6Var2 != null) {
                    d6Var2.g0(i31);
                } else {
                    h6.w0(null, i31, false);
                }
                int i32 = h6.E8;
                if (d6Var2 != null) {
                    d6Var2.g0(i32);
                } else {
                    h6.w0(null, i32, false);
                }
                int i33 = h6.G8;
                if (d6Var2 != null) {
                    d6Var2.g0(i33);
                } else {
                    h6.w0(null, i33, false);
                }
                int i34 = h6.i6;
                if (d6Var2 != null) {
                    d6Var2.g0(i34);
                } else {
                    h6.w0(null, i34, false);
                }
                int i35 = h6.Sh;
                int g04 = d6Var2 != null ? d6Var2.g0(i35) : h6.w0(null, i35, false);
                int i36 = h6.Oh;
                int g05 = d6Var2 != null ? d6Var2.g0(i36) : h6.w0(null, i36, false);
                if (d6Var2 != null) {
                    d6Var2.g0(h6.Qh);
                } else {
                    h6.w0(null, h6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.e5.a;
                if (context2 != null) {
                    final int i37 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final ?? a3Var = new a3(context2, d6Var2);
                    a3Var.a();
                    final tc0 tc0Var = new tc0(context2, d6Var2);
                    tc0Var.setTextColor(g02);
                    tc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    tc0Var.setItemCount(5);
                    org.telegram.ui.Components.d4 d4Var2 = new org.telegram.ui.Components.d4(context2, d6Var2);
                    d4Var2.setWrapSelectorWheel(true);
                    d4Var2.setAllItemsCount(24);
                    d4Var2.setItemCount(5);
                    d4Var2.setTextColor(g02);
                    d4Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(context2, d6Var2);
                    e4Var.setWrapSelectorWheel(true);
                    e4Var.setAllItemsCount(60);
                    e4Var.setItemCount(5);
                    e4Var.setTextColor(g02);
                    e4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ?? frameLayout = new FrameLayout(context2);
                    ?? w3Var = new org.telegram.ui.Components.w3(context2, tc0Var, d4Var2, e4Var, 2);
                    w3Var.setOrientation(1);
                    frameLayout.addView(w3Var, w7.x5.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context2), w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    w3Var.addView(frameLayout2, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
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
                    w3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setTextColor(h6.v0(h6.q5, d6Var2));
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    ai.p4 p4Var = new ai.p4(context2, 16);
                    p4Var.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    w7.z5.b(p4Var, 0.02f, 1.2f);
                    linearLayout.addView(tc0Var, w7.x5.l(0.5f, 0, 270));
                    tc0Var.setMinValue(0);
                    tc0Var.setMaxValue(365);
                    tc0Var.setWrapSelectorWheel(false);
                    tc0Var.setFormatter(new org.telegram.ui.Components.x1(5));
                    org.telegram.ui.Components.e2 e2Var = new org.telegram.ui.Components.e2(i37, tc0Var, d4Var2, e4Var, textView2);
                    tc0Var.setOnValueChangedListener(e2Var);
                    d4Var2.setMinValue(0);
                    d4Var2.setMaxValue(23);
                    int i38 = g03;
                    linearLayout.addView(d4Var2, w7.x5.l(0.2f, 0, 270));
                    d4Var2.setFormatter(new org.telegram.ui.Components.x1(6));
                    d4Var2.setOnValueChangedListener(e2Var);
                    e4Var.setMinValue(0);
                    e4Var.setMaxValue(59);
                    e4Var.setValue(0);
                    e4Var.setFormatter(new org.telegram.ui.Components.x1(7));
                    linearLayout.addView(e4Var, w7.x5.l(0.3f, 0, 270));
                    e4Var.setOnValueChangedListener(e2Var);
                    if (j3 <= 0 || j3 == 2147483646) {
                        d4Var = d4Var2;
                    } else {
                        long j10 = j3 * 1000;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j10);
                        if (timeInMillis >= 0) {
                            e4Var.setValue(calendar.get(12));
                            d4Var = d4Var2;
                            d4Var.setValue(calendar.get(11));
                            tc0Var.setValue(timeInMillis);
                        } else {
                            d4Var = d4Var2;
                        }
                    }
                    final boolean[] zArr5 = {true};
                    org.telegram.ui.Components.e5.g(null, null, 0L, i37, 3, tc0Var, d4Var, e4Var);
                    org.telegram.ui.Components.e5.e(textView2, tc0Var, d4Var, e4Var);
                    p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    p4Var.setGravity(17);
                    p4Var.setTextColor(g04);
                    p4Var.setTextSize(1, 14.0f);
                    p4Var.setTypeface(AndroidUtilities.bold());
                    p4Var.setBackground(x5.e(new float[]{24.0f}, g05));
                    w3Var.addView(p4Var, w7.x5.t(-1, 48, 83, 14, 15, 14, 16));
                    final org.telegram.ui.Components.d4 d4Var3 = d4Var;
                    p4Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Runnable runnable2;
                            zArr5[0] = false;
                            long j11 = i37;
                            tc0 tc0Var2 = tc0Var;
                            d4 d4Var4 = d4Var3;
                            e4 e4Var2 = e4Var;
                            boolean g10 = e5.g(null, null, 0L, j11, 3, tc0Var2, d4Var4, e4Var2);
                            e5.e(textView2, tc0Var2, d4Var4, e4Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, tc0Var2.getValue());
                            calendar2.set(11, d4Var4.getValue());
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
                    w3Var.addView(textView2, w7.x5.t(-1, -2, 83, 14, 0, 14, 16));
                    a3Var.b(frameLayout);
                    f3 f3Var = a3Var.a;
                    f3Var.show();
                    f3Var.setOnDismissListener(new org.telegram.ui.Components.g2(0, thVar, zArr5));
                    f3Var.setBackgroundColor(i38);
                    f3Var.fixNavigationBar(i38);
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
                    nf.f.s(gyVar.c.a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    runnable = a3Var2.a.dismissRunnable;
                    runnable.run();
                    break;
                }
                break;
            case 21:
                ez ezVar = (ez) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject8 = (TLObject) this.b;
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
                            while (i17 < size3) {
                                TLRPC.Document document2 = tL_messages_stickers.stickers.get(i17);
                                if (ezVar.v.indexOfKey(document2.id) < 0) {
                                    arrayList7.add(document2);
                                }
                                i17++;
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
            case 22:
                d10 d10Var = (d10) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                d10Var.z0 = -1;
                n2 n2Var = d10Var.n;
                c10.r0(tL_error3, n2Var, xc.a0(n2Var));
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
                    if (d10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        n2Var.getMessagesController().loadRemoteFilters(true, new ei.r4(d10Var, callback, i13, i14));
                        break;
                    } else {
                        if (d10Var.a0 != null) {
                            n2Var.getMessagesController().checkChatlistFolderUpdate(d10Var.Y, true);
                        }
                        d10Var.A0 = true;
                        d10Var.dismiss();
                        callback.run(Integer.valueOf(i13));
                        break;
                    }
                } else {
                    d10Var.l0.a(false);
                    break;
                }
            case 23:
                ry ryVar = (ry) this.b;
                Integer num = (Integer) this.c;
                oc ocVar = (oc) this.d;
                n2 n2Var2 = (n2) this.e;
                ryVar.w4(num.intValue());
                AndroidUtilities.runOnUIThread(new oy(i15, ocVar, n2Var2), 200L);
                break;
            case 24:
                s30.N((s30) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (TLRPC.TL_channels_getParticipants) this.e);
                break;
            case 25:
                h80.n((h80) this.b, (TLRPC.TL_error) this.c, (TLRPC.Updates) this.d, (TLRPC.TL_messages_importChatInvite) this.e);
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
                ci.d dVar = (ci.d) this.c;
                f3 f3Var2 = (f3) this.d;
                Runnable runnable3 = (Runnable) this.e;
                if (tL_error5 != null) {
                    xc.X().d0(tL_error5, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    f3Var2.dismiss();
                    xc.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                    runnable3.run();
                    break;
                }
            default:
                rn0 rn0Var = (rn0) this.b;
                ry ryVar2 = (ry) this.c;
                Context context3 = (Context) this.d;
                o70 o70Var = (o70) this.e;
                ryVar2.showDialog(new k41(context3, ryVar2.getResourceProvider(), new oy(25, rn0Var, ryVar2)));
                o70Var.u();
                break;
        }
    }

    public /* synthetic */ m5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = tLObject;
        this.e = obj3;
    }

    public /* synthetic */ m5(n2 n2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.a = i10;
        this.c = n2Var;
        this.b = tLObject;
        this.d = tLObject2;
        this.e = obj;
    }

    public /* synthetic */ m5(w80 w80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = 26;
        this.c = w80Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.b = tLObject;
    }
}
