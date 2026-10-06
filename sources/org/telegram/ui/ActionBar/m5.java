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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yw;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.k8;
import org.telegram.ui.m41;
import org.telegram.ui.mq;
import org.telegram.ui.o6;
import org.telegram.ui.q6;
import org.telegram.ui.qc;
import org.telegram.ui.qr;
import org.telegram.ui.r6;
import org.telegram.ui.rr;
import org.telegram.ui.sa;
import org.telegram.ui.t6;
import org.telegram.ui.tp;
import org.telegram.ui.ua;
import org.telegram.ui.uy;
import org.telegram.ui.wq;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
    /* JADX WARN: Removed duplicated region for block: B:414:0x0d71  */
    /* JADX WARN: Type inference failed for: r12v16, types: [org.telegram.ui.ActionBar.a3] */
    /* JADX WARN: Type inference failed for: r15v27, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r15v28, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, org.telegram.ui.Components.w3] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.ui.ActionBar.n2] */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r5v32, types: [android.widget.TextView] */
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
        qr qrVar;
        String[] strArr;
        rr rrVar;
        long peerId;
        int i10;
        int i11;
        String lowerCase;
        String publicUsername;
        String str2;
        String str3;
        String str4;
        ?? r42;
        Runnable runnable;
        String str5 = " ";
        int i12 = 4;
        int i13 = -1;
        int i14 = 9;
        int i15 = 3;
        int i16 = 1;
        int i17 = 0;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.b;
                f6 f6Var = (f6) this.c;
                h6 h6Var = (h6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                i6.A--;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (f6Var == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (f6Var != null) {
                                f6Var.r = tL_theme2;
                            } else {
                                h6Var.F = tL_theme2;
                                h6Var.G = false;
                                h6Var.g0 = null;
                                h6Var.h0 = null;
                                NotificationCenter.getInstance(h6Var.E).addObserver(h6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(h6Var.E).addObserver(h6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(h6Var.E);
                                TLRPC.TL_theme tL_theme3 = h6Var.F;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z10 = true;
                        }
                    } else {
                        if (h6.a(f6Var, themeSettings)) {
                            z11 = false;
                        } else {
                            File d = f6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            h6.i(f6Var, themeSettings);
                            h6 h6Var2 = i6.I;
                            if (h6Var2 == h6Var && h6Var2.Y == f6Var.a) {
                                i6.n1(false, false);
                                i6.J(ApplicationLoader.applicationContext, false);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i18 = NotificationCenter.needSetDayNightTheme;
                                h6 h6Var3 = i6.I;
                                z12 = true;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i18, h6Var3, Boolean.valueOf(i6.J == h6Var3), null, -1);
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
                    if (i6.A != 0) {
                        i6.B = (int) (System.currentTimeMillis() / 1000);
                        i6.s1(z10, false);
                        break;
                    }
                }
                z10 = false;
                if (i6.A != 0) {
                }
                break;
            case 1:
                r6 r6Var = (r6) this.b;
                t6 t6Var = (t6) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                r6Var.getClass();
                t6Var.a(fArr[0]);
                if (zArr[0]) {
                    r6Var.d.v0(true);
                    break;
                }
                break;
            case 2:
                r6 r6Var2 = (r6) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                q6 q6Var = (q6) this.e;
                if (!zArr2[0]) {
                    jArr[0] = System.currentTimeMillis();
                    r6Var2.d.showDialog(q6Var);
                    break;
                }
                break;
            case 3:
                k8.S((k8) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (Calendar) this.e);
                break;
            case 4:
                sa.S((sa) this.b, (b2) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 5:
                yn ynVar = (yn) this.b;
                ?? r22 = (n2) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                c5 c5Var = (c5) this.e;
                if (r22 instanceof NotificationCenter.NotificationCenterDelegate) {
                    ynVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r22, NotificationCenter.closeChats);
                }
                ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) c5Var).c(c5Var.getFragmentStack().size() - 1, new yn(bundle));
                r22.finishFragment();
                break;
            case 6:
                yn ynVar2 = (yn) this.c;
                nf.e eVar = (nf.e) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                ua uaVar = (ua) this.e;
                eVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    ynVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    ynVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = ynVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
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
                sr srVar = (sr) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.c3(srVar, i12));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(tr.f);
                ofFloat.start();
                break;
            case 8:
                yn ynVar3 = (yn) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                b2 b2Var = (b2) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = ea0.f(messageObject2);
                    th2 = null;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    th2 = th3;
                    tL_webPage = null;
                }
                AndroidUtilities.runOnUIThread(new i2.c1(ynVar3, b2Var, zArr4, th2 == null && tL_webPage != null, messageObject2, tL_webPage, 7));
                break;
            case 9:
                yn ynVar4 = (yn) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        ynVar4.j6 = messages_messages.count;
                        z13 = false;
                    } else {
                        z13 = false;
                        ynVar4.j6 = 0;
                    }
                    messagesStorage.resetMentionsCount(ynVar4.R5, ynVar4.d(), ynVar4.j6);
                    int i19 = ynVar4.j6;
                    if (i19 == 0) {
                        ynVar4.k6 = true;
                        ynVar4.Jb(z13);
                        break;
                    } else {
                        ynVar4.h1.c(2, i19, true);
                        ynVar4.G9();
                        break;
                    }
                } else {
                    int i20 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) ynVar4.m6[0].get(i20);
                    messagesStorage.markMessageAsMention(ynVar4.R5, i20);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    ynVar4.D(i20, 0, 0, 0, false, true);
                    break;
                }
            case 10:
                yn.p0((yn) this.b, (TLRPC.TL_messageMediaWebPage) this.c, (TLRPC.TL_webPageAttributeStory) this.d, (o6) this.e);
                break;
            case 11:
                tp.U((tp) this.b, (b2[]) this.c, (TLRPC.Chat) this.d, (n2) this.e);
                break;
            case 12:
                mq mqVar = (mq) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                mqVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    mqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 13:
                rr rrVar2 = (rr) this.c;
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                wq wqVar = (wq) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    wqVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rrVar2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
                    alertDialog$Builder.a.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new org.telegram.ui.z0(wqVar, 25));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    rrVar2.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 14:
                qr qrVar2 = (qr) this.b;
                String str6 = (String) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                rr rrVar3 = qrVar2.y;
                String lowerCase2 = str6.trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ai.m3(qrVar2, new ArrayList(), new a0.i(), new ArrayList(), new ArrayList(), 21));
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
                    ArrayList arrayList3 = new ArrayList();
                    a0.i iVar = new a0.i();
                    rr rrVar4 = rrVar3;
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i22 = 0;
                        while (i22 < size) {
                            TLObject tLObject6 = (TLObject) arrayList.get(i22);
                            ArrayList arrayList6 = arrayList;
                            if (tLObject6 instanceof TLRPC.ChatParticipant) {
                                qrVar = qrVar2;
                                peerId = ((TLRPC.ChatParticipant) tLObject6).user_id;
                            } else {
                                qrVar = qrVar2;
                                if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject6).peer);
                                } else {
                                    strArr = strArr2;
                                    rrVar = rrVar4;
                                    i11 = i22;
                                    i10 = size;
                                    i22 = i11 + 1;
                                    arrayList = arrayList6;
                                    qrVar2 = qrVar;
                                    strArr2 = strArr;
                                    rrVar4 = rrVar;
                                    size = i10;
                                }
                            }
                            if (peerId > 0) {
                                strArr = strArr2;
                                TLRPC.User user3 = rrVar4.getMessagesController().getUser(Long.valueOf(peerId));
                                rrVar = rrVar4;
                                if (user3.id != rrVar.getUserConfig().getClientUserId()) {
                                    lowerCase = UserObject.getUserName(user3).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user3);
                                    str2 = user3.first_name;
                                    str3 = user3.last_name;
                                }
                                i11 = i22;
                                i10 = size;
                                i22 = i11 + 1;
                                arrayList = arrayList6;
                                qrVar2 = qrVar;
                                strArr2 = strArr;
                                rrVar4 = rrVar;
                                size = i10;
                            } else {
                                strArr = strArr2;
                                rrVar = rrVar4;
                                TLRPC.Chat chat = rrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str2 = chat.title;
                                str3 = null;
                            }
                            i11 = i22;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            i10 = size;
                            int i23 = 0;
                            boolean z14 = false;
                            while (true) {
                                if (i23 < i21) {
                                    int i24 = i23;
                                    String str7 = strArr[i24];
                                    if (lowerCase.startsWith(str7) || bi.u(" ", str7, lowerCase) || (translitString2 != null && (translitString2.startsWith(str7) || bi.u(" ", str7, translitString2)))) {
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
                                            arrayList4.add(AndroidUtilities.generateSearchName(sa.e.i("@", publicUsername), null, "@" + str7));
                                        }
                                        arrayList5.add(tLObject6);
                                    } else {
                                        String str8 = translitString2;
                                        i23 = i24 + 1;
                                        String str9 = str4;
                                        z14 = r42;
                                        lowerCase = str9;
                                        translitString2 = str8;
                                    }
                                }
                            }
                            i22 = i11 + 1;
                            arrayList = arrayList6;
                            qrVar2 = qrVar;
                            strArr2 = strArr;
                            rrVar4 = rrVar;
                            size = i10;
                        }
                    }
                    qr qrVar3 = qrVar2;
                    String[] strArr3 = strArr2;
                    rr rrVar5 = rrVar4;
                    if (arrayList2 != null) {
                        int i25 = 0;
                        while (i25 < arrayList2.size()) {
                            TLRPC.User user4 = rrVar5.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i25)).user_id));
                            if (user4.id != rrVar5.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                if (lowerCase3.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                int i26 = 0;
                                char c10 = 0;
                                while (i26 < i21) {
                                    String str10 = strArr3[i26];
                                    if (lowerCase3.startsWith(str10) || bi.u(str5, str10, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str10) || bi.u(str5, str10, translitString3)))) {
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
                                        i25++;
                                        str5 = str;
                                    } else {
                                        i26++;
                                        str5 = str;
                                    }
                                }
                            }
                            str = str5;
                            i25++;
                            str5 = str;
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ai.m3(qrVar3, arrayList3, iVar, arrayList4, arrayList5, 21));
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
                String[] strArr4 = (String[]) this.d;
                ?? r52 = (TextView) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i27 = 0;
                while (true) {
                    if (i27 < iArr.length) {
                        if (iArr2[0] == iArr[i27]) {
                            spannableStringBuilder.append((CharSequence) strArr4[i27]);
                            spannableStringBuilder.setSpan(new e61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i27++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    rq rqVar = new rq(R.drawable.arrows_select, 0);
                    rqVar.spaceScaleX = 0.7f;
                    rqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    rqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(rqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    rq rqVar2 = new rq(R.drawable.mini_switch_lock, 0);
                    rqVar2.spaceScaleX = 0.7f;
                    rqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    rqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(rqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                r52.setText(spannableStringBuilder);
                break;
            case 18:
                ChatActivityEnterView.f((ChatActivityEnterView) this.b, (cw0) this.c, (int[]) this.d, (op0) this.e);
                break;
            case 19:
                xn xnVar = (xn) this.b;
                Context context2 = (Context) this.c;
                View view2 = (View) this.d;
                d6 d6Var2 = (d6) this.e;
                long j3 = xnVar.V;
                final org.telegram.ui.Components.w2 w2Var = new org.telegram.ui.Components.w2(i14, xnVar, view2);
                uh uhVar = new uh(i16);
                int i28 = i6.j5;
                int j02 = d6Var2 != null ? d6Var2.j0(i28) : i6.w0(null, i28, false);
                int i29 = i6.h5;
                int j03 = d6Var2 != null ? d6Var2.j0(i29) : i6.w0(null, i29, false);
                int i30 = i6.Ji;
                if (d6Var2 != null) {
                    d6Var2.j0(i30);
                } else {
                    i6.w0(null, i30, false);
                }
                int i31 = i6.Ni;
                if (d6Var2 != null) {
                    d6Var2.j0(i31);
                } else {
                    i6.w0(null, i31, false);
                }
                int i32 = i6.E8;
                if (d6Var2 != null) {
                    d6Var2.j0(i32);
                } else {
                    i6.w0(null, i32, false);
                }
                int i33 = i6.G8;
                if (d6Var2 != null) {
                    d6Var2.j0(i33);
                } else {
                    i6.w0(null, i33, false);
                }
                int i34 = i6.i6;
                if (d6Var2 != null) {
                    d6Var2.j0(i34);
                } else {
                    i6.w0(null, i34, false);
                }
                int i35 = i6.Sh;
                int j04 = d6Var2 != null ? d6Var2.j0(i35) : i6.w0(null, i35, false);
                int i36 = i6.Oh;
                int j05 = d6Var2 != null ? d6Var2.j0(i36) : i6.w0(null, i36, false);
                if (d6Var2 != null) {
                    d6Var2.j0(i6.Qh);
                } else {
                    i6.w0(null, i6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.e5.a;
                if (context2 != null) {
                    int i37 = j03;
                    final int i38 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final ?? a3Var = new a3(context2, d6Var2);
                    a3Var.a();
                    final gd0 gd0Var = new gd0(context2, d6Var2);
                    gd0Var.setTextColor(j02);
                    gd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    gd0Var.setItemCount(5);
                    final org.telegram.ui.Components.d4 d4Var = new org.telegram.ui.Components.d4(context2, d6Var2);
                    d4Var.setWrapSelectorWheel(true);
                    d4Var.setAllItemsCount(24);
                    d4Var.setItemCount(5);
                    d4Var.setTextColor(j02);
                    d4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(context2, d6Var2);
                    e4Var.setWrapSelectorWheel(true);
                    e4Var.setAllItemsCount(60);
                    e4Var.setItemCount(5);
                    e4Var.setTextColor(j02);
                    e4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    ?? frameLayout = new FrameLayout(context2);
                    ?? w3Var = new org.telegram.ui.Components.w3(context2, gd0Var, d4Var, e4Var, 2);
                    w3Var.setOrientation(1);
                    frameLayout.addView(w3Var, w7.z5.c(-1.0f, -1));
                    frameLayout.addView(new FrameLayout(context2), w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    w3Var.addView(frameLayout2, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context2);
                    textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView.setTextColor(j02);
                    textView.setTextSize(1, 20.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    frameLayout2.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new bi.d(10));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    w3Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setTextColor(i6.v0(i6.q5, d6Var2));
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    ai.p4 p4Var = new ai.p4(context2, 16);
                    p4Var.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    w7.b6.b(p4Var, 0.02f, 1.2f);
                    linearLayout.addView(gd0Var, w7.z5.l(0.5f, 0, 270));
                    gd0Var.setMinValue(0);
                    gd0Var.setMaxValue(365);
                    gd0Var.setWrapSelectorWheel(false);
                    gd0Var.setFormatter(new org.telegram.ui.Components.w1(9));
                    org.telegram.ui.Components.e2 e2Var = new org.telegram.ui.Components.e2(i38, gd0Var, d4Var, e4Var, textView2);
                    gd0Var.setOnValueChangedListener(e2Var);
                    d4Var.setMinValue(0);
                    d4Var.setMaxValue(23);
                    linearLayout.addView(d4Var, w7.z5.l(0.2f, 0, 270));
                    d4Var.setFormatter(new org.telegram.ui.Components.w1(10));
                    d4Var.setOnValueChangedListener(e2Var);
                    e4Var.setMinValue(0);
                    e4Var.setMaxValue(59);
                    e4Var.setValue(0);
                    e4Var.setFormatter(new org.telegram.ui.Components.w1(11));
                    linearLayout.addView(e4Var, w7.z5.l(0.3f, 0, 270));
                    e4Var.setOnValueChangedListener(e2Var);
                    if (j3 > 0 && j3 != 2147483646) {
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
                            d4Var.setValue(calendar.get(11));
                            gd0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr5 = {true};
                    org.telegram.ui.Components.e5.g(null, null, 0L, i38, 3, gd0Var, d4Var, e4Var);
                    org.telegram.ui.Components.e5.e(textView2, gd0Var, d4Var, e4Var);
                    p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    p4Var.setGravity(17);
                    p4Var.setTextColor(j04);
                    p4Var.setTextSize(1, 14.0f);
                    p4Var.setTypeface(AndroidUtilities.bold());
                    p4Var.setBackground(x5.e(new float[]{24.0f}, j05));
                    w3Var.addView(p4Var, w7.z5.t(-1, 48, 83, 14, 15, 14, 16));
                    p4Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Runnable runnable2;
                            zArr5[0] = false;
                            long j11 = i38;
                            gd0 gd0Var2 = gd0Var;
                            d4 d4Var2 = d4Var;
                            e4 e4Var2 = e4Var;
                            boolean g10 = e5.g(null, null, 0L, j11, 3, gd0Var2, d4Var2, e4Var2);
                            e5.e(textView2, gd0Var2, d4Var2, e4Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, gd0Var2.getValue());
                            calendar2.set(11, d4Var2.getValue());
                            calendar2.set(12, e4Var2.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            w2Var.K((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = a3Var.a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    w3Var.addView(textView2, w7.z5.t(-1, -2, 83, 14, 0, 14, 16));
                    a3Var.b(frameLayout);
                    f3 f3Var = a3Var.a;
                    f3Var.show();
                    f3Var.setOnDismissListener(new org.telegram.ui.Components.g2(0, uhVar, zArr5));
                    f3Var.setBackgroundColor(i37);
                    f3Var.fixNavigationBar(i37);
                    break;
                }
                break;
            case 20:
                jy jyVar = (jy) this.c;
                b2[] b2VarArr2 = (b2[]) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                a3 a3Var2 = (a3) this.e;
                jyVar.getClass();
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    nf.f.s(jyVar.c.a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    runnable = a3Var2.a.dismissRunnable;
                    runnable.run();
                    break;
                }
                break;
            case 21:
                gz gzVar = (gz) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject8 = (TLObject) this.b;
                Runnable runnable2 = (Runnable) this.e;
                ArrayList arrayList7 = gzVar.s;
                iz izVar = gzVar.w;
                if (izVar.M == gzVar.b) {
                    izVar.L = 0;
                    if (tL_messages_getStickers.emoticon.equals(gzVar.a)) {
                        if (!(tLObject8 instanceof TLRPC.TL_messages_stickers)) {
                            runnable2.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject8;
                            int size2 = arrayList7.size();
                            int size3 = tL_messages_stickers.stickers.size();
                            while (i17 < size3) {
                                TLRPC.Document document2 = tL_messages_stickers.stickers.get(i17);
                                if (gzVar.v.indexOfKey(document2.id) < 0) {
                                    arrayList7.add(document2);
                                }
                                i17++;
                            }
                            if (size2 != arrayList7.size()) {
                                gzVar.f.put(arrayList7, izVar.N);
                                if (size2 == 0) {
                                    gzVar.h.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
            case 22:
                f10 f10Var = (f10) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                f10Var.z0 = -1;
                n2 n2Var = f10Var.n;
                org.telegram.ui.f10.r0(tL_error3, n2Var, yc.a0(n2Var));
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
                    if (f10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        n2Var.getMessagesController().loadRemoteFilters(true, new ei.s4(f10Var, callback, i13, i15));
                        break;
                    } else {
                        if (f10Var.a0 != null) {
                            n2Var.getMessagesController().checkChatlistFolderUpdate(f10Var.Y, true);
                        }
                        f10Var.A0 = true;
                        f10Var.dismiss();
                        callback.run(Integer.valueOf(i13));
                        break;
                    }
                } else {
                    f10Var.l0.a(false);
                    break;
                }
            case 23:
                uy uyVar = (uy) this.b;
                Integer num = (Integer) this.c;
                qc qcVar = (qc) this.d;
                n2 n2Var2 = (n2) this.e;
                uyVar.F4(num.intValue());
                AndroidUtilities.runOnUIThread(new yw(i14, qcVar, n2Var2), 200L);
                break;
            case 24:
                v30.L((v30) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (TLRPC.TL_channels_getParticipants) this.e);
                break;
            case 25:
                u80.n((u80) this.b, (TLRPC.TL_error) this.c, (TLRPC.Updates) this.d, (TLRPC.TL_messages_importChatInvite) this.e);
                break;
            case 26:
                j90 j90Var = (j90) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                TLObject tLObject10 = (TLObject) this.b;
                j90Var.y = false;
                j90Var.K = tL_chatInviteExported.link;
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
                    j90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 27:
                pa0 pa0Var = (pa0) this.b;
                boolean[] zArr6 = (boolean[]) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                boolean[] zArr7 = (boolean[]) this.e;
                zArr6[0] = true;
                AndroidUtilities.cancelRunOnUIThread(pa0Var.U);
                for (int i39 = 0; i39 < arrayList9.size(); i39++) {
                    ((TL_stories.StoryItem) arrayList9.get(i39)).pinned = zArr7[i39];
                }
                pa0Var.getMessagesController().getStoriesController().n0(pa0Var.e, arrayList9, false);
                break;
            case 28:
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                ci.d dVar = (ci.d) this.c;
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
                jo0 jo0Var = (jo0) this.b;
                uy uyVar2 = (uy) this.c;
                Context context3 = (Context) this.d;
                b80 b80Var = (b80) this.e;
                uyVar2.showDialog(new m41(context3, uyVar2.getResourceProvider(), new yw(29, jo0Var, uyVar2)));
                b80Var.u();
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

    public /* synthetic */ m5(j90 j90Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = 26;
        this.c = j90Var;
        this.d = tL_chatInviteExported;
        this.e = tL_error;
        this.b = tLObject;
    }
}
