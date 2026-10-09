package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f10;
import org.telegram.ui.g8;
import org.telegram.ui.l6;
import org.telegram.ui.n6;
import org.telegram.ui.nq;
import org.telegram.ui.nr;
import org.telegram.ui.o6;
import org.telegram.ui.pc;
import org.telegram.ui.q6;
import org.telegram.ui.ra;
import org.telegram.ui.sr;
import org.telegram.ui.ta;
import org.telegram.ui.tr;
import org.telegram.ui.ty;
import org.telegram.ui.up;
import org.telegram.ui.xq;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    private final void a() {
        tz tzVar = (tz) this.b;
        TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.c;
        TLObject tLObject = (TLObject) this.d;
        Runnable runnable = (Runnable) this.e;
        ArrayList arrayList = tzVar.s;
        vz vzVar = tzVar.w;
        if (vzVar.M != tzVar.b) {
            return;
        }
        vzVar.L = 0;
        if (tL_messages_getStickers.emoticon.equals(tzVar.a)) {
            if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                runnable.run();
                return;
            }
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            int size = arrayList.size();
            int size2 = tL_messages_stickers.stickers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                if (tzVar.v.indexOfKey(document.id) < 0) {
                    arrayList.add(document);
                }
            }
            if (size != arrayList.size()) {
                tzVar.f.put(arrayList, vzVar.N);
                if (size == 0) {
                    tzVar.h.add(arrayList);
                }
            }
        }
        runnable.run();
    }

    private final void b() {
        s10 s10Var = (s10) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.b;
        int i10 = -1;
        s10Var.z0 = -1;
        n2 n2Var = s10Var.n;
        f10.r0(tL_error, n2Var, ad.a0(n2Var));
        int i11 = 0;
        if (tLObject == null) {
            s10Var.l0.a(false);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            if (arrayList.isEmpty()) {
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateDialogFilter) {
                    i10 = ((TL_update.TL_updateDialogFilter) update).id;
                }
            } else {
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i11) instanceof TL_update.TL_updateDialogFilter) {
                        i10 = ((TL_update.TL_updateDialogFilter) arrayList.get(i11)).id;
                        break;
                    }
                    i11++;
                }
            }
        }
        if (s10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            n2Var.getMessagesController().loadRemoteFilters(true, new ei.q4(s10Var, callback, i10, 3));
            return;
        }
        if (s10Var.a0 != null) {
            n2Var.getMessagesController().checkChatlistFolderUpdate(s10Var.Y, true);
        }
        s10Var.A0 = true;
        s10Var.dismiss();
        callback.run(Integer.valueOf(i10));
    }

    private final void c() {
        i40.O((i40) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (TLRPC.TL_channels_getParticipants) this.e);
    }

    private final void e() {
        i90.p((i90) this.b, (TLRPC.TL_error) this.c, (TLRPC.Updates) this.d, (TLRPC.TL_messages_importChatInvite) this.e);
    }

    private final void f() {
        x90 x90Var = (x90) this.b;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        x90Var.y = false;
        x90Var.K = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            x90Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    private final void g() {
        db0 db0Var = (db0) this.b;
        boolean[] zArr = (boolean[]) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        zArr[0] = true;
        AndroidUtilities.cancelRunOnUIThread(db0Var.U);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((TL_stories.StoryItem) arrayList.get(i10)).pinned = zArr2[i10];
        }
        db0Var.getMessagesController().getStoriesController().n0(db0Var.e, arrayList, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0e21  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z13;
        TLRPC.User user;
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        boolean z14;
        String str;
        sr srVar;
        String[] strArr;
        tr trVar;
        long peerId;
        int i10;
        int i11;
        String lowerCase;
        String publicUsername;
        String str2;
        String str3;
        String str4;
        boolean z15;
        float f7;
        final iw0 iw0Var;
        float f10;
        o1.k kVar;
        o1.k kVar2;
        o1.k kVar3;
        FrameLayout frameLayout;
        Runnable runnable;
        String str5 = " ";
        int i12 = 17;
        int i13 = 1;
        switch (this.a) {
            case 0:
                ((Utilities.Callback) this.b).run(i6.R0((File) this.c, (String) this.d, (String[]) this.e));
                break;
            case 1:
                TLObject tLObject = (TLObject) this.b;
                g6 g6Var = (g6) this.c;
                h6 h6Var = (h6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                i6.A--;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (g6Var == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (g6Var != null) {
                                g6Var.r = tL_theme2;
                                z11 = true;
                            } else {
                                h6Var.F = tL_theme2;
                                h6Var.G = false;
                                h6Var.g0 = null;
                                h6Var.h0 = null;
                                NotificationCenter.getInstance(h6Var.E).addObserver(h6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(h6Var.E).addObserver(h6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(h6Var.E);
                                TLRPC.TL_theme tL_theme3 = h6Var.F;
                                z11 = true;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z10 = z11;
                        }
                    } else {
                        if (h6.a(g6Var, themeSettings)) {
                            z12 = false;
                        } else {
                            File d = g6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            h6.i(g6Var, themeSettings);
                            h6 h6Var2 = i6.I;
                            if (h6Var2 == h6Var && h6Var2.Y == g6Var.a) {
                                i6.o1(false, false);
                                i6.J(ApplicationLoader.applicationContext, false);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i14 = NotificationCenter.needSetDayNightTheme;
                                h6 h6Var3 = i6.I;
                                z13 = true;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i14, h6Var3, Boolean.valueOf(i6.J == h6Var3), null, -1);
                            } else {
                                z13 = true;
                            }
                            d6.a(z13);
                            z12 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        g6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z12;
                    }
                    if (i6.A != 0) {
                        i6.B = (int) (System.currentTimeMillis() / 1000);
                        i6.t1(z10, false);
                        break;
                    }
                }
                z10 = false;
                if (i6.A != 0) {
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
                g8.U((g8) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (Calendar) this.e);
                break;
            case 5:
                ra.U((ra) this.b, (b2) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 6:
                zn znVar = (zn) this.b;
                n2 n2Var = (n2) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                d5 d5Var = (d5) this.e;
                if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
                    znVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
                }
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) d5Var).c(d5Var.getFragmentStack().size() - 1, new zn(bundle));
                n2Var.finishFragment();
                break;
            case 7:
                zn znVar2 = (zn) this.b;
                of.e eVar = (of.e) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                ta taVar = (ta) this.e;
                eVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    znVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    znVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = znVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        taVar.run(user);
                        break;
                    }
                }
                user = null;
                taVar.run(user);
            case 8:
                long[] jArr2 = (long[]) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                gs gsVar = (gs) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.c3(gsVar, 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(hs.f);
                ofFloat.start();
                break;
            case 9:
                zn znVar3 = (zn) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                b2 b2Var = (b2) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = sa0.f(messageObject2);
                    th2 = null;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    th2 = th3;
                    tL_webPage = null;
                }
                AndroidUtilities.runOnUIThread(new i2.c1(znVar3, b2Var, zArr4, th2 == null && tL_webPage != null, messageObject2, tL_webPage, 8));
                break;
            case 10:
                zn znVar4 = (zn) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error == null && !messages_messages.messages.isEmpty()) {
                    int i15 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) znVar4.o6[0].get(i15);
                    messagesStorage.markMessageAsMention(znVar4.T5, i15);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    znVar4.F(i15, 0, 0, 0, false, true);
                    break;
                } else {
                    if (messages_messages != null) {
                        znVar4.l6 = messages_messages.count;
                        z14 = false;
                    } else {
                        z14 = false;
                        znVar4.l6 = 0;
                    }
                    messagesStorage.resetMentionsCount(znVar4.T5, znVar4.d(), znVar4.l6);
                    int i16 = znVar4.l6;
                    if (i16 != 0) {
                        znVar4.j1.c(2, i16, true);
                        znVar4.M9();
                        break;
                    } else {
                        znVar4.m6 = true;
                        znVar4.Ob(z14);
                        break;
                    }
                }
                break;
            case 11:
                zn.I0((zn) this.b, (TLRPC.TL_messageMediaWebPage) this.c, (TLRPC.TL_webPageAttributeStory) this.d, (l6) this.e);
                break;
            case 12:
                up.W((up) this.b, (b2[]) this.c, (TLRPC.Chat) this.d, (n2) this.e);
                break;
            case 13:
                nq nqVar = (nq) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                nqVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    nqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 14:
                tr trVar2 = (tr) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                xq xqVar = (xq) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    xqVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(trVar2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
                    alertDialog$Builder.a.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new org.telegram.ui.z0(xqVar, 23));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    trVar2.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 15:
                sr srVar2 = (sr) this.b;
                String str6 = (String) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.e;
                tr trVar3 = srVar2.y;
                String lowerCase2 = str6.trim().toLowerCase();
                if (lowerCase2.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i17 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i17];
                    strArr2[0] = lowerCase2;
                    if (translitString != null) {
                        strArr2[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    a0.i iVar = new a0.i();
                    tr trVar4 = trVar3;
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i18 = 0;
                        while (i18 < size) {
                            TLObject tLObject6 = (TLObject) arrayList.get(i18);
                            ArrayList arrayList6 = arrayList;
                            if (tLObject6 instanceof TLRPC.ChatParticipant) {
                                srVar = srVar2;
                                peerId = ((TLRPC.ChatParticipant) tLObject6).user_id;
                            } else {
                                srVar = srVar2;
                                if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject6).peer);
                                } else {
                                    strArr = strArr2;
                                    trVar = trVar4;
                                    i11 = size;
                                    i10 = i18;
                                    i18 = i10 + 1;
                                    arrayList = arrayList6;
                                    srVar2 = srVar;
                                    strArr2 = strArr;
                                    trVar4 = trVar;
                                    size = i11;
                                }
                            }
                            if (peerId > 0) {
                                strArr = strArr2;
                                TLRPC.User user3 = trVar4.getMessagesController().getUser(Long.valueOf(peerId));
                                trVar = trVar4;
                                if (user3.id != trVar.getUserConfig().getClientUserId()) {
                                    lowerCase = UserObject.getUserName(user3).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user3);
                                    str2 = user3.first_name;
                                    str3 = user3.last_name;
                                }
                                i11 = size;
                                i10 = i18;
                                i18 = i10 + 1;
                                arrayList = arrayList6;
                                srVar2 = srVar;
                                strArr2 = strArr;
                                trVar4 = trVar;
                                size = i11;
                            } else {
                                strArr = strArr2;
                                trVar = trVar4;
                                TLRPC.Chat chat = trVar.getMessagesController().getChat(Long.valueOf(-peerId));
                                lowerCase = chat.title.toLowerCase();
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str2 = chat.title;
                                str3 = null;
                            }
                            i11 = size;
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString2)) {
                                translitString2 = null;
                            }
                            i10 = i18;
                            int i19 = 0;
                            boolean z16 = false;
                            while (true) {
                                if (i19 < i17) {
                                    int i20 = i19;
                                    String str7 = strArr[i20];
                                    if (lowerCase.startsWith(str7) || bi.w(" ", str7, lowerCase) || (translitString2 != null && (translitString2.startsWith(str7) || bi.w(" ", str7, translitString2)))) {
                                        str4 = lowerCase;
                                        z15 = true;
                                    } else if (publicUsername == null || !publicUsername.startsWith(str7)) {
                                        boolean z17 = z16;
                                        str4 = lowerCase;
                                        z15 = z17;
                                    } else {
                                        str4 = lowerCase;
                                        z15 = 2;
                                    }
                                    if (z15) {
                                        if (z15) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(str2, str3, str7));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName(sc.v.i("@", publicUsername), null, "@" + str7));
                                        }
                                        arrayList5.add(tLObject6);
                                    } else {
                                        String str8 = translitString2;
                                        i19 = i20 + 1;
                                        String str9 = str4;
                                        z16 = z15;
                                        lowerCase = str9;
                                        translitString2 = str8;
                                    }
                                }
                            }
                            i18 = i10 + 1;
                            arrayList = arrayList6;
                            srVar2 = srVar;
                            strArr2 = strArr;
                            trVar4 = trVar;
                            size = i11;
                        }
                    }
                    sr srVar3 = srVar2;
                    String[] strArr3 = strArr2;
                    tr trVar5 = trVar4;
                    if (arrayList2 != null) {
                        int i21 = 0;
                        while (i21 < arrayList2.size()) {
                            TLRPC.User user4 = trVar5.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i21)).user_id));
                            if (user4.id != trVar5.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                if (lowerCase3.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                boolean z18 = false;
                                int i22 = 0;
                                while (i22 < i17) {
                                    String str10 = strArr3[i22];
                                    if (lowerCase3.startsWith(str10) || bi.w(str5, str10, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str10) || bi.w(str5, str10, translitString3)))) {
                                        str = str5;
                                        z18 = true;
                                    } else {
                                        str = str5;
                                        String publicUsername2 = UserObject.getPublicUsername(user4);
                                        if (publicUsername2 != null && publicUsername2.startsWith(str10)) {
                                            z18 = 2;
                                        }
                                    }
                                    if (z18) {
                                        if (z18) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str10));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str10));
                                        }
                                        arrayList3.add(user4);
                                        iVar.k(user4, user4.id);
                                        i21++;
                                        str5 = str;
                                    } else {
                                        i22++;
                                        str5 = str;
                                    }
                                }
                            }
                            str = str5;
                            i21++;
                            str5 = str;
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ai.n3(srVar3, arrayList3, iVar, arrayList4, arrayList5, 21));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ai.n3(srVar2, new ArrayList(), new a0.i(), new ArrayList(), new ArrayList(), 21));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                Context context = (Context) this.d;
                e6 e6Var = (e6) this.e;
                String str11 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.l(e0Var, context, str11, str11, e6Var).show();
                break;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                ai.j3 j3Var = (ai.j3) this.c;
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
                    j3Var.run(lowerCase4);
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
            case 18:
                int[] iArr = (int[]) this.b;
                int[] iArr2 = (int[]) this.c;
                String[] strArr4 = (String[]) this.e;
                TextView textView = (TextView) this.d;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i23 = 0;
                while (true) {
                    if (i23 < iArr.length) {
                        if (iArr2[0] == iArr[i23]) {
                            spannableStringBuilder.append((CharSequence) strArr4[i23]);
                            spannableStringBuilder.setSpan(new m61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i23++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    er erVar = new er(R.drawable.arrows_select, 0);
                    erVar.spaceScaleX = 0.7f;
                    erVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    erVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(erVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    er erVar2 = new er(R.drawable.mini_switch_lock, 0);
                    erVar2.spaceScaleX = 0.7f;
                    erVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    erVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(erVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                break;
            case 19:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                iw0 iw0Var2 = (iw0) this.c;
                int[] iArr3 = (int[]) this.d;
                zp0 zp0Var = (zp0) this.e;
                o1.c cVar = o1.h.p;
                o1.c cVar2 = o1.h.o;
                int[] iArr4 = chatActivityEnterView.N2;
                if (chatActivityEnterView.q0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout2.addView(iw0Var2, w7.x5.e(40, 40, 3));
                    dialog.setContentView(frameLayout2);
                    dialog.getWindow().setLayout(-1, -1);
                    dialog.getWindow().clearFlags(1024);
                    dialog.getWindow().clearFlags(67108864);
                    dialog.getWindow().clearFlags(TLObject.FLAG_27);
                    dialog.getWindow().addFlags(TLObject.FLAG_31);
                    dialog.getWindow().addFlags(512);
                    dialog.getWindow().addFlags(131072);
                    dialog.getWindow().getAttributes().windowAnimations = 0;
                    dialog.getWindow().getDecorView().setSystemUiVisibility(1792);
                    dialog.getWindow().setStatusBarColor(0);
                    dialog.getWindow().setNavigationBarColor(0);
                    AndroidUtilities.setLightStatusBar(dialog, i6.x0(null, i6.s8, true) == -1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        AndroidUtilities.setLightNavigationBar(dialog, AndroidUtilities.computePerceivedBrightness(i6.x0(null, i6.a7, true)) >= 0.721f);
                    }
                    chatActivityEnterView.s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.s0;
                    chatActivityEnterView.p0.getLocationInWindow(iArr4);
                    final float f11 = iArr4[0];
                    final float f12 = iArr4[1];
                    float dp = AndroidUtilities.dp(5.0f);
                    float dp2 = iArr3[0] + chatActivityEnterView.s0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
                    float f13 = iArr3[1] + chatActivityEnterView.t0 + dp + 0.0f;
                    iw0Var2.setTranslationX(dp2);
                    iw0Var2.setTranslationY(f13);
                    float scaleX = (chatActivityEnterView.p0.getLayoutParams().width * (chatActivityEnterView.l5 ? chatActivityEnterView.p0.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
                    iw0Var2.setPivotX(0.0f);
                    iw0Var2.setPivotY(0.0f);
                    iw0Var2.setScaleX(0.75f);
                    iw0Var2.setScaleY(0.75f);
                    iw0Var2.getViewTreeObserver().addOnDrawListener(new jf(iw0Var2, zp0Var));
                    dialog.show();
                    if (chatActivityEnterView.l5) {
                        f7 = 1.0f;
                    } else {
                        f7 = 1.0f;
                        chatActivityEnterView.p0.setScaleX(1.0f);
                        chatActivityEnterView.p0.setScaleY(1.0f);
                    }
                    chatActivityEnterView.p0.setAlpha(f7);
                    hf hfVar = chatActivityEnterView.q0;
                    if (chatActivityEnterView.l5) {
                        iw0Var = iw0Var2;
                        kVar = null;
                        f10 = 0.5f;
                    } else {
                        o1.k kVar4 = new o1.k(chatActivityEnterView.p0, cVar2);
                        iw0Var = iw0Var2;
                        f10 = 0.5f;
                        kVar4.u = org.telegram.ui.Cells.c1.j(0.5f, 750.0f, f7);
                        kVar = kVar4;
                    }
                    if (chatActivityEnterView.l5) {
                        kVar2 = kVar;
                        kVar3 = null;
                    } else {
                        kVar2 = kVar;
                        o1.k kVar5 = new o1.k(chatActivityEnterView.p0, cVar);
                        kVar5.u = org.telegram.ui.Cells.c1.j(f10, 750.0f, f7);
                        kVar3 = kVar5;
                    }
                    o1.k kVar6 = new o1.k(chatActivityEnterView.p0, o1.h.t);
                    kVar6.u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, f7);
                    final int i24 = 0;
                    final iw0 iw0Var3 = iw0Var;
                    kVar6.a(new o1.f() { // from class: org.telegram.ui.Components.zd
                        @Override // o1.f
                        public final void a(o1.h hVar, boolean z19, float f14, float f15) {
                            int i25 = i24;
                            float f16 = f12;
                            float f17 = f11;
                            iw0 iw0Var4 = iw0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i25) {
                                case 0:
                                    int i26 = ChatActivityEnterView.n5;
                                    if (dialog2.isShowing()) {
                                        iw0Var4.setTranslationX(f17);
                                        iw0Var4.setTranslationY(f16);
                                        bq0 bq0Var = chatActivityEnterView2.p0;
                                        bq0Var.getClass();
                                        bq0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new kf(chatActivityEnterView2, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i27 = ChatActivityEnterView.n5;
                                    if (dialog2.isShowing()) {
                                        iw0Var4.setTranslationX(f17);
                                        iw0Var4.setTranslationY(f16);
                                        bq0 bq0Var2 = chatActivityEnterView2.p0;
                                        bq0Var2.getClass();
                                        bq0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new kf(chatActivityEnterView2, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    o1.k kVar7 = new o1.k(iw0Var3, o1.h.m);
                    kVar7.b = w7.o.a(dp2, f11 - AndroidUtilities.dp(6.0f), dp2);
                    kVar7.c = true;
                    kVar7.u = org.telegram.ui.Cells.c1.j(f11, 700.0f, 0.75f);
                    kVar7.h = f11 - AndroidUtilities.dp(6.0f);
                    o1.k kVar8 = new o1.k(iw0Var3, o1.h.n);
                    kVar8.b = w7.o.a(f13, f13, AndroidUtilities.dp(6.0f) + f12);
                    kVar8.c = true;
                    kVar8.u = org.telegram.ui.Cells.c1.j(f12, 700.0f, 0.75f);
                    kVar8.g = AndroidUtilities.dp(6.0f) + f12;
                    kVar8.b(new mf(f12, iw0Var3));
                    final int i25 = 1;
                    kVar8.a(new o1.f() { // from class: org.telegram.ui.Components.zd
                        @Override // o1.f
                        public final void a(o1.h hVar, boolean z19, float f14, float f15) {
                            int i252 = i25;
                            float f16 = f12;
                            float f17 = f11;
                            iw0 iw0Var4 = iw0Var3;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i252) {
                                case 0:
                                    int i26 = ChatActivityEnterView.n5;
                                    if (dialog2.isShowing()) {
                                        iw0Var4.setTranslationX(f17);
                                        iw0Var4.setTranslationY(f16);
                                        bq0 bq0Var = chatActivityEnterView2.p0;
                                        bq0Var.getClass();
                                        bq0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new kf(chatActivityEnterView2, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i27 = ChatActivityEnterView.n5;
                                    if (dialog2.isShowing()) {
                                        iw0Var4.setTranslationX(f17);
                                        iw0Var4.setTranslationY(f16);
                                        bq0 bq0Var2 = chatActivityEnterView2.p0;
                                        bq0Var2.getClass();
                                        bq0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new kf(chatActivityEnterView2, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    o1.k kVar9 = new o1.k(iw0Var3, cVar2);
                    kVar9.u = org.telegram.ui.Cells.c1.j(scaleX, 1000.0f, 1.0f);
                    o1.k kVar10 = new o1.k(iw0Var3, cVar);
                    kVar10.u = org.telegram.ui.Cells.c1.j(scaleX, 1000.0f, 1.0f);
                    hfVar.l(kVar2, kVar3, kVar6, kVar7, kVar8, kVar9, kVar10);
                    break;
                }
                break;
            case 20:
                lo loVar = (lo) this.b;
                Context context2 = (Context) this.c;
                View view2 = (View) this.d;
                e6 e6Var2 = (e6) this.e;
                long j3 = loVar.V;
                final org.telegram.ui.Components.y2 y2Var = new org.telegram.ui.Components.y2(8, loVar, view2);
                vh vhVar = new vh(i13);
                int i26 = i6.j5;
                int c02 = e6Var2 != null ? e6Var2.c0(i26) : i6.x0(null, i26, false);
                int i27 = i6.h5;
                int c03 = e6Var2 != null ? e6Var2.c0(i27) : i6.x0(null, i27, false);
                int i28 = i6.Ji;
                if (e6Var2 != null) {
                    e6Var2.c0(i28);
                } else {
                    i6.x0(null, i28, false);
                }
                int i29 = i6.Ni;
                if (e6Var2 != null) {
                    e6Var2.c0(i29);
                } else {
                    i6.x0(null, i29, false);
                }
                int i30 = i6.E8;
                if (e6Var2 != null) {
                    e6Var2.c0(i30);
                } else {
                    i6.x0(null, i30, false);
                }
                int i31 = i6.G8;
                if (e6Var2 != null) {
                    e6Var2.c0(i31);
                } else {
                    i6.x0(null, i31, false);
                }
                int i32 = i6.i6;
                if (e6Var2 != null) {
                    e6Var2.c0(i32);
                } else {
                    i6.x0(null, i32, false);
                }
                int i33 = i6.Sh;
                int c04 = e6Var2 != null ? e6Var2.c0(i33) : i6.x0(null, i33, false);
                int i34 = i6.Oh;
                int c05 = e6Var2 != null ? e6Var2.c0(i34) : i6.x0(null, i34, false);
                if (e6Var2 != null) {
                    e6Var2.c0(i6.Qh);
                } else {
                    i6.x0(null, i6.Qh, false);
                }
                Pattern pattern = org.telegram.ui.Components.g5.a;
                if (context2 != null) {
                    final int i35 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final a3 a3Var = new a3(context2, e6Var2);
                    a3Var.a();
                    final ud0 ud0Var = new ud0(context2, e6Var2);
                    ud0Var.setTextColor(c02);
                    ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    ud0Var.setItemCount(5);
                    final org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(context2, e6Var2);
                    f4Var.setWrapSelectorWheel(true);
                    f4Var.setAllItemsCount(24);
                    f4Var.setItemCount(5);
                    f4Var.setTextColor(c02);
                    f4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(context2, e6Var2);
                    g4Var.setWrapSelectorWheel(true);
                    g4Var.setAllItemsCount(60);
                    g4Var.setItemCount(5);
                    g4Var.setTextColor(c02);
                    g4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context2, ud0Var, f4Var, g4Var, 2);
                    y3Var.setOrientation(1);
                    frameLayout3.addView(y3Var, w7.x5.d(-1.0f, -1));
                    frameLayout3.addView(new FrameLayout(context2), w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 120.0f, -1, 87));
                    FrameLayout frameLayout4 = new FrameLayout(context2);
                    y3Var.addView(frameLayout4, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context2);
                    textView2.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView2.setTextColor(c02);
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    frameLayout4.addView(textView2, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                    textView2.setOnTouchListener(new bi.d(10));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    y3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context2);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTextColor(i6.w0(i6.q5, e6Var2));
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    ai.q4 q4Var = new ai.q4(context2, 16);
                    q4Var.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    w7.z5.b(q4Var, 0.02f, 1.2f);
                    linearLayout.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
                    ud0Var.setMinValue(0);
                    ud0Var.setMaxValue(365);
                    ud0Var.setWrapSelectorWheel(false);
                    ud0Var.setFormatter(new nr(29));
                    org.telegram.ui.Components.e2 e2Var = new org.telegram.ui.Components.e2(i35, ud0Var, f4Var, g4Var, textView3);
                    ud0Var.setOnValueChangedListener(e2Var);
                    f4Var.setMinValue(0);
                    f4Var.setMaxValue(23);
                    int i36 = c03;
                    linearLayout.addView(f4Var, w7.x5.l(0.2f, 0, 270));
                    f4Var.setFormatter(new org.telegram.ui.Components.f2(0));
                    f4Var.setOnValueChangedListener(e2Var);
                    g4Var.setMinValue(0);
                    g4Var.setMaxValue(59);
                    g4Var.setValue(0);
                    g4Var.setFormatter(new org.telegram.ui.Components.f2(1));
                    linearLayout.addView(g4Var, w7.x5.l(0.3f, 0, 270));
                    g4Var.setOnValueChangedListener(e2Var);
                    if (j3 <= 0 || j3 == 2147483646) {
                        frameLayout = frameLayout3;
                    } else {
                        long j10 = j3 * 1000;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        frameLayout = frameLayout3;
                        int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j10);
                        if (timeInMillis >= 0) {
                            g4Var.setValue(calendar.get(12));
                            f4Var.setValue(calendar.get(11));
                            ud0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr5 = {true};
                    org.telegram.ui.Components.g5.f(null, null, 0L, i35, 3, ud0Var, f4Var, g4Var);
                    org.telegram.ui.Components.g5.d(textView3, ud0Var, f4Var, g4Var);
                    q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    q4Var.setGravity(17);
                    q4Var.setTextColor(c04);
                    q4Var.setTextSize(1, 14.0f);
                    q4Var.setTypeface(AndroidUtilities.bold());
                    q4Var.setBackground(y5.e(new float[]{24.0f}, c05));
                    y3Var.addView(q4Var, w7.x5.t(-1, 48, 83, 14, 15, 14, 16));
                    q4Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.g2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Runnable runnable2;
                            zArr5[0] = false;
                            long j11 = i35;
                            ud0 ud0Var2 = ud0Var;
                            f4 f4Var2 = f4Var;
                            g4 g4Var2 = g4Var;
                            boolean f14 = g5.f(null, null, 0L, j11, 3, ud0Var2, f4Var2, g4Var2);
                            g5.d(textView3, ud0Var2, f4Var2, g4Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, ud0Var2.getValue());
                            calendar2.set(11, f4Var2.getValue());
                            calendar2.set(12, g4Var2.getValue());
                            if (f14) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            y2Var.J((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = a3Var.a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    y3Var.addView(textView3, w7.x5.t(-1, -2, 83, 14, 0, 14, 16));
                    a3Var.b(frameLayout);
                    f3 f3Var = a3Var.a;
                    f3Var.show();
                    f3Var.setOnDismissListener(new org.telegram.ui.Components.h2(0, vhVar, zArr5));
                    f3Var.setBackgroundColor(i36);
                    f3Var.fixNavigationBar(i36);
                    break;
                }
                break;
            case 21:
                vy vyVar = (vy) this.b;
                b2[] b2VarArr2 = (b2[]) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                a3 a3Var2 = (a3) this.e;
                vyVar.getClass();
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    of.f.s(vyVar.c.a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    runnable = a3Var2.a.dismissRunnable;
                    runnable.run();
                    break;
                }
                break;
            case 22:
                a();
                break;
            case 23:
                b();
                break;
            case 24:
                ty tyVar = (ty) this.b;
                Integer num = (Integer) this.c;
                pc pcVar = (pc) this.d;
                n2 n2Var2 = (n2) this.e;
                tyVar.t4(num.intValue());
                AndroidUtilities.runOnUIThread(new zr(i12, pcVar, n2Var2), 200L);
                break;
            case 25:
                c();
                break;
            case 26:
                e();
                break;
            case 27:
                f();
                break;
            case 28:
                g();
                break;
            default:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                ci.d dVar = (ci.d) this.c;
                f3 f3Var2 = (f3) this.d;
                Runnable runnable2 = (Runnable) this.e;
                if (tL_error3 == null) {
                    dVar.setLoading(false);
                    f3Var2.dismiss();
                    ad.X().Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumLastSeenSet)).j();
                    runnable2.run();
                    break;
                } else {
                    ad.X().f0(tL_error3, false);
                    break;
                }
        }
    }

    public /* synthetic */ n5(sr srVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 15;
        this.b = srVar;
        this.d = str;
        this.c = arrayList;
        this.e = arrayList2;
    }

    public /* synthetic */ n5(s10 s10Var, TLRPC.TL_error tL_error, TLObject tLObject, Utilities.Callback callback) {
        this.a = 23;
        this.c = s10Var;
        this.d = tL_error;
        this.e = tLObject;
        this.b = callback;
    }

    public /* synthetic */ n5(int[] iArr, int[] iArr2, String[] strArr, TextView textView) {
        this.a = 18;
        this.b = iArr;
        this.c = iArr2;
        this.e = strArr;
        this.d = textView;
    }
}
