package org.telegram.messenger.camera;

import ai.g3;
import ai.i6;
import ai.t0;
import ai.ud;
import ai.x8;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.SurfaceTexture;
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
import gi.g4;
import i2.d1;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
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
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.g2;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.s2;
import org.telegram.ui.Components.x3;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b1;
import org.telegram.ui.dq;
import org.telegram.ui.e3;
import org.telegram.ui.ey;
import org.telegram.ui.ir;
import org.telegram.ui.jr;
import org.telegram.ui.k8;
import org.telegram.ui.kp;
import org.telegram.ui.nq;
import org.telegram.ui.p00;
import org.telegram.ui.p6;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
import org.telegram.ui.sn;
import org.telegram.ui.tr;
import org.telegram.ui.u6;
import org.telegram.ui.ua;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        mz mzVar = (mz) this.c;
        TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
        TLObject tLObject = (TLObject) this.e;
        Runnable runnable = (Runnable) this.b;
        ArrayList arrayList = mzVar.s;
        oz ozVar = mzVar.w;
        if (ozVar.M != mzVar.b) {
            return;
        }
        ozVar.L = 0;
        if (tL_messages_getStickers.emoticon.equals(mzVar.a)) {
            if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                runnable.run();
                return;
            }
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            int size = arrayList.size();
            int size2 = tL_messages_stickers.stickers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                if (mzVar.v.indexOfKey(document.id) < 0) {
                    arrayList.add(document);
                }
            }
            if (size != arrayList.size()) {
                mzVar.f.put(arrayList, ozVar.N);
                if (size == 0) {
                    mzVar.h.add(arrayList);
                }
            }
        }
        runnable.run();
    }

    private final void b() {
        k10 k10Var = (k10) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        int i10 = -1;
        k10Var.z0 = -1;
        n2 n2Var = k10Var.n;
        p00.r0(tL_error, n2Var, xc.a0(n2Var));
        int i11 = 0;
        if (tLObject == null) {
            k10Var.l0.a(false);
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
        if (k10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            n2Var.getMessagesController().loadRemoteFilters(true, new g4(k10Var, callback, i10, 3));
            return;
        }
        if (k10Var.a0 != null) {
            n2Var.getMessagesController().checkChatlistFolderUpdate(k10Var.Y, true);
        }
        k10Var.A0 = true;
        k10Var.dismiss();
        callback.run(Integer.valueOf(i10));
    }

    private final void c() {
        ey eyVar = (ey) this.c;
        Integer num = (Integer) this.b;
        qy qyVar = (qy) this.d;
        n2 n2Var = (n2) this.e;
        eyVar.u4(num.intValue());
        AndroidUtilities.runOnUIThread(new yt(12, qyVar, n2Var), 200L);
    }

    private final void d() {
        a40.O((a40) this.c, (TLRPC.TL_error) this.b, (TLObject) this.d, (TLRPC.TL_channels_getParticipants) this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0ddc  */
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
        ir irVar;
        String[] strArr;
        jr jrVar;
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
        o1.k kVar;
        final zv0 zv0Var;
        float f10;
        o1.k kVar2;
        final float f11;
        FrameLayout frameLayout;
        Runnable runnable;
        String str5 = " ";
        int i12 = 6;
        switch (this.a) {
            case 0:
                CameraController.lambda$openRound$9((CameraSession) this.c, (Runnable) this.b, (SurfaceTexture) this.e, (Runnable) this.d);
                break;
            case 1:
                CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.e, (Runnable) this.d);
                break;
            case 2:
                ((VideoAds) this.c).lambda$show$14((Context) this.b, (TLRPC.TL_sponsoredMessage) this.d, (i80) this.e);
                break;
            case 3:
                ((Utilities.Callback) this.c).run(h6.R0((File) this.b, (String) this.d, (String[]) this.e));
                break;
            case 4:
                TLObject tLObject = (TLObject) this.c;
                f6 f6Var = (f6) this.b;
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
                                z11 = true;
                            } else {
                                g6Var.F = tL_theme2;
                                g6Var.G = false;
                                g6Var.g0 = null;
                                g6Var.h0 = null;
                                NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(g6Var.E);
                                TLRPC.TL_theme tL_theme3 = g6Var.F;
                                z11 = true;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z10 = z11;
                        }
                    } else {
                        if (g6.a(f6Var, themeSettings)) {
                            z12 = false;
                        } else {
                            File d = f6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            g6.i(f6Var, themeSettings);
                            g6 g6Var2 = h6.I;
                            if (g6Var2 == g6Var && g6Var2.Y == f6Var.a) {
                                h6.o1(false, false);
                                h6.J(ApplicationLoader.applicationContext, false);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i13 = NotificationCenter.needSetDayNightTheme;
                                g6 g6Var3 = h6.I;
                                z13 = true;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i13, g6Var3, Boolean.valueOf(h6.J == g6Var3), null, -1);
                            } else {
                                z13 = true;
                            }
                            c6.a(z13);
                            z12 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        f6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z12;
                    }
                    if (h6.A != 0) {
                        h6.B = (int) (System.currentTimeMillis() / 1000);
                        h6.t1(z10, false);
                        break;
                    }
                }
                z10 = false;
                if (h6.A != 0) {
                }
                break;
            case 5:
                s6 s6Var = (s6) this.c;
                u6 u6Var = (u6) this.b;
                float[] fArr = (float[]) this.d;
                boolean[] zArr = (boolean[]) this.e;
                s6Var.getClass();
                u6Var.a(fArr[0]);
                if (zArr[0]) {
                    s6Var.d.w0(true);
                    break;
                }
                break;
            case 6:
                s6 s6Var2 = (s6) this.c;
                boolean[] zArr2 = (boolean[]) this.b;
                long[] jArr = (long[]) this.d;
                r6 r6Var = (r6) this.e;
                if (!zArr2[0]) {
                    jArr[0] = System.currentTimeMillis();
                    s6Var2.d.showDialog(r6Var);
                    break;
                }
                break;
            case 7:
                k8.U((k8) this.c, (TLRPC.TL_error) this.b, (TLObject) this.d, (Calendar) this.e);
                break;
            case 8:
                ua.U((ua) this.c, (b2) this.b, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 9:
                sn snVar = (sn) this.c;
                n2 n2Var = (n2) this.b;
                MessageObject messageObject = (MessageObject) this.d;
                d5 d5Var = (d5) this.e;
                if (n2Var instanceof NotificationCenter.NotificationCenterDelegate) {
                    snVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) n2Var, NotificationCenter.closeChats);
                }
                snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) d5Var).c(d5Var.getFragmentStack().size() - 1, new sn(bundle));
                n2Var.finishFragment();
                break;
            case 10:
                sn snVar2 = (sn) this.c;
                pf.c cVar = (pf.c) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                g3 g3Var = (g3) this.e;
                cVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    snVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    snVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = snVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        g3Var.run(user);
                        break;
                    }
                }
                user = null;
                g3Var.run(user);
            case 11:
                long[] jArr2 = (long[]) this.c;
                boolean[] zArr3 = (boolean[]) this.b;
                ImageView imageView = (ImageView) this.d;
                ImageView imageView2 = (ImageView) this.e;
                jArr2[0] = SystemClock.elapsedRealtime();
                if (!zArr3[0]) {
                    imageView = imageView2;
                }
                as asVar = (as) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new e3(asVar, 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(bs.f);
                ofFloat.start();
                break;
            case 12:
                sn snVar3 = (sn) this.c;
                MessageObject messageObject2 = (MessageObject) this.b;
                b2 b2Var = (b2) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = la0.f(messageObject2);
                    th2 = null;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    th2 = th3;
                    tL_webPage = null;
                }
                AndroidUtilities.runOnUIThread(new d1(snVar3, b2Var, zArr4, th2 == null && tL_webPage != null, messageObject2, tL_webPage, 8));
                break;
            case 13:
                sn snVar4 = (sn) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error == null && !messages_messages.messages.isEmpty()) {
                    int i14 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) snVar4.o6[0].get(i14);
                    messagesStorage.markMessageAsMention(snVar4.T5, i14);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    snVar4.j(i14, 0, false, 0, true, 0);
                    break;
                } else {
                    if (messages_messages != null) {
                        snVar4.l6 = messages_messages.count;
                        z14 = false;
                    } else {
                        z14 = false;
                        snVar4.l6 = 0;
                    }
                    messagesStorage.resetMentionsCount(snVar4.T5, snVar4.d(), snVar4.l6);
                    int i15 = snVar4.l6;
                    if (i15 != 0) {
                        snVar4.j1.c(2, i15, true);
                        snVar4.M9();
                        break;
                    } else {
                        snVar4.m6 = true;
                        snVar4.Ob(z14);
                        break;
                    }
                }
                break;
            case 14:
                sn.I0((sn) this.c, (TLRPC.TL_messageMediaWebPage) this.b, (TLRPC.TL_webPageAttributeStory) this.d, (p6) this.e);
                break;
            case 15:
                kp.W((kp) this.c, (b2[]) this.b, (TLRPC.Chat) this.d, (n2) this.e);
                break;
            case 16:
                dq dqVar = (dq) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                dqVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    dqVar.p0(twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 17:
                jr jrVar2 = (jr) this.c;
                TLObject tLObject5 = (TLObject) this.b;
                TLRPC.User user2 = (TLRPC.User) this.d;
                nq nqVar = (nq) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject5 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    nqVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jrVar2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
                    alertDialog$Builder.a.T = LocaleController.formatString(R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new b1(nqVar, 23));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    jrVar2.showDialog(alertDialog$Builder.a);
                    break;
                }
                break;
            case 18:
                ir irVar2 = (ir) this.c;
                String str6 = (String) this.b;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                jr jrVar3 = irVar2.y;
                String lowerCase2 = str6.trim().toLowerCase();
                if (lowerCase2.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i16 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i16];
                    strArr2[0] = lowerCase2;
                    if (translitString != null) {
                        strArr2[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    jr jrVar4 = jrVar3;
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i17 = 0;
                        while (i17 < size) {
                            TLObject tLObject6 = (TLObject) arrayList.get(i17);
                            ArrayList arrayList6 = arrayList;
                            if (tLObject6 instanceof TLRPC.ChatParticipant) {
                                irVar = irVar2;
                                peerId = ((TLRPC.ChatParticipant) tLObject6).user_id;
                            } else {
                                irVar = irVar2;
                                if (tLObject6 instanceof TLRPC.ChannelParticipant) {
                                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject6).peer);
                                } else {
                                    strArr = strArr2;
                                    jrVar = jrVar4;
                                    i11 = size;
                                    i10 = i17;
                                    i17 = i10 + 1;
                                    arrayList = arrayList6;
                                    irVar2 = irVar;
                                    strArr2 = strArr;
                                    jrVar4 = jrVar;
                                    size = i11;
                                }
                            }
                            if (peerId > 0) {
                                strArr = strArr2;
                                TLRPC.User user3 = jrVar4.getMessagesController().getUser(Long.valueOf(peerId));
                                jrVar = jrVar4;
                                if (user3.id != jrVar.getUserConfig().getClientUserId()) {
                                    lowerCase = UserObject.getUserName(user3).toLowerCase();
                                    publicUsername = UserObject.getPublicUsername(user3);
                                    str2 = user3.first_name;
                                    str3 = user3.last_name;
                                }
                                i11 = size;
                                i10 = i17;
                                i17 = i10 + 1;
                                arrayList = arrayList6;
                                irVar2 = irVar;
                                strArr2 = strArr;
                                jrVar4 = jrVar;
                                size = i11;
                            } else {
                                strArr = strArr2;
                                jrVar = jrVar4;
                                TLRPC.Chat chat = jrVar.getMessagesController().getChat(Long.valueOf(-peerId));
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
                            i10 = i17;
                            int i18 = 0;
                            boolean z16 = false;
                            while (true) {
                                if (i18 < i16) {
                                    int i19 = i18;
                                    String str7 = strArr[i19];
                                    if (lowerCase.startsWith(str7) || wh.w(" ", str7, lowerCase) || (translitString2 != null && (translitString2.startsWith(str7) || wh.w(" ", str7, translitString2)))) {
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
                                            arrayList4.add(AndroidUtilities.generateSearchName(r.c.g("@", publicUsername), null, "@" + str7));
                                        }
                                        arrayList5.add(tLObject6);
                                    } else {
                                        String str8 = translitString2;
                                        i18 = i19 + 1;
                                        String str9 = str4;
                                        z16 = z15;
                                        lowerCase = str9;
                                        translitString2 = str8;
                                    }
                                }
                            }
                            i17 = i10 + 1;
                            arrayList = arrayList6;
                            irVar2 = irVar;
                            strArr2 = strArr;
                            jrVar4 = jrVar;
                            size = i11;
                        }
                    }
                    ir irVar3 = irVar2;
                    String[] strArr3 = strArr2;
                    jr jrVar5 = jrVar4;
                    if (arrayList2 != null) {
                        int i20 = 0;
                        while (i20 < arrayList2.size()) {
                            TLRPC.User user4 = jrVar5.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i20)).user_id));
                            if (user4.id != jrVar5.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                if (lowerCase3.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                boolean z18 = false;
                                int i21 = 0;
                                while (i21 < i16) {
                                    String str10 = strArr3[i21];
                                    if (lowerCase3.startsWith(str10) || wh.w(str5, str10, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str10) || wh.w(str5, str10, translitString3)))) {
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
                                        hVar.k(user4, user4.id);
                                        i20++;
                                        str5 = str;
                                    } else {
                                        i21++;
                                        str5 = str;
                                    }
                                }
                            }
                            str = str5;
                            i20++;
                            str5 = str;
                        }
                    }
                    AndroidUtilities.runOnUIThread(new t0(irVar3, arrayList3, hVar, arrayList4, arrayList5, 29));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new t0(irVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 29));
                    break;
                }
                break;
            case 19:
                e0 e0Var = (e0) this.c;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.b;
                Context context = (Context) this.d;
                d6 d6Var = (d6) this.e;
                String str11 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.l(e0Var, context, str11, str11, d6Var).show();
                break;
            case 20:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                x8 x8Var = (x8) this.b;
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
                    x8Var.run(lowerCase4);
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
            case 21:
                int[] iArr = (int[]) this.c;
                int[] iArr2 = (int[]) this.b;
                String[] strArr4 = (String[]) this.d;
                TextView textView = (TextView) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MessageScheduledRepeatOption));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i22 = 0;
                while (true) {
                    if (i22 < iArr.length) {
                        if (iArr2[0] == iArr[i22]) {
                            spannableStringBuilder.append((CharSequence) strArr4[i22]);
                            spannableStringBuilder.setSpan(new c61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i22++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    yq yqVar = new yq(R.drawable.arrows_select, 0);
                    yqVar.spaceScaleX = 0.7f;
                    yqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    yqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(yqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    yq yqVar2 = new yq(R.drawable.mini_switch_lock, 0);
                    yqVar2.spaceScaleX = 0.7f;
                    yqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    yqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(yqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                break;
            case 22:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                zv0 zv0Var2 = (zv0) this.b;
                int[] iArr3 = (int[]) this.d;
                qp0 qp0Var = (qp0) this.e;
                o1.c cVar2 = o1.h.p;
                o1.c cVar3 = o1.h.o;
                int[] iArr4 = chatActivityEnterView.N2;
                if (chatActivityEnterView.q0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout2.addView(zv0Var2, z5.e(40, 40, 3));
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
                    AndroidUtilities.setLightStatusBar(dialog, h6.x0(null, h6.s8, true) == -1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        AndroidUtilities.setLightNavigationBar(dialog, AndroidUtilities.computePerceivedBrightness(h6.x0(null, h6.a7, true)) >= 0.721f);
                    }
                    chatActivityEnterView.s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.s0;
                    chatActivityEnterView.p0.getLocationInWindow(iArr4);
                    final float f12 = iArr4[0];
                    float f13 = iArr4[1];
                    float dp = AndroidUtilities.dp(5.0f);
                    float dp2 = iArr3[0] + chatActivityEnterView.s0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
                    float f14 = iArr3[1] + chatActivityEnterView.t0 + dp + 0.0f;
                    zv0Var2.setTranslationX(dp2);
                    zv0Var2.setTranslationY(f14);
                    float scaleX = (chatActivityEnterView.p0.getLayoutParams().width * (chatActivityEnterView.l5 ? chatActivityEnterView.p0.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
                    zv0Var2.setPivotX(0.0f);
                    zv0Var2.setPivotY(0.0f);
                    zv0Var2.setScaleX(0.75f);
                    zv0Var2.setScaleY(0.75f);
                    zv0Var2.getViewTreeObserver().addOnDrawListener(new ff(zv0Var2, qp0Var));
                    dialog.show();
                    if (chatActivityEnterView.l5) {
                        f7 = 1.0f;
                    } else {
                        f7 = 1.0f;
                        chatActivityEnterView.p0.setScaleX(1.0f);
                        chatActivityEnterView.p0.setScaleY(1.0f);
                    }
                    chatActivityEnterView.p0.setAlpha(f7);
                    ef efVar = chatActivityEnterView.q0;
                    if (chatActivityEnterView.l5) {
                        zv0Var = zv0Var2;
                        f10 = 0.5f;
                        kVar = null;
                    } else {
                        kVar = new o1.k(chatActivityEnterView.p0, cVar3);
                        zv0Var = zv0Var2;
                        f10 = 0.5f;
                        kVar.u = org.telegram.ui.Cells.t0.l(0.5f, 750.0f, f7);
                    }
                    if (chatActivityEnterView.l5) {
                        f11 = f13;
                        kVar2 = null;
                    } else {
                        f11 = f13;
                        kVar2 = new o1.k(chatActivityEnterView.p0, cVar2);
                        kVar2.u = org.telegram.ui.Cells.t0.l(f10, 750.0f, f7);
                    }
                    o1.k kVar3 = new o1.k(chatActivityEnterView.p0, o1.h.t);
                    kVar3.u = org.telegram.ui.Cells.t0.l(0.0f, 750.0f, f7);
                    final int i23 = 0;
                    o1.f fVar = new o1.f() { // from class: org.telegram.ui.Components.vd
                        @Override // o1.f
                        public final void a(o1.h hVar2, boolean z19, float f15, float f16) {
                            int i24 = i23;
                            float f17 = f11;
                            float f18 = f12;
                            zv0 zv0Var3 = zv0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i24) {
                                case 0:
                                    int i25 = ChatActivityEnterView.n5;
                                    if (dialog2.isShowing()) {
                                        zv0Var3.setTranslationX(f18);
                                        zv0Var3.setTranslationY(f17);
                                        sp0 sp0Var = chatActivityEnterView2.p0;
                                        sp0Var.getClass();
                                        sp0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i26 = ChatActivityEnterView.n5;
                                    if (dialog2.isShowing()) {
                                        zv0Var3.setTranslationX(f18);
                                        zv0Var3.setTranslationY(f17);
                                        sp0 sp0Var2 = chatActivityEnterView2.p0;
                                        sp0Var2.getClass();
                                        sp0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    zv0 zv0Var3 = zv0Var;
                    float f15 = f11;
                    kVar3.a(fVar);
                    o1.k kVar4 = new o1.k(zv0Var3, o1.h.m);
                    kVar4.b = w7.r.a(dp2, f12 - AndroidUtilities.dp(6.0f), dp2);
                    kVar4.c = true;
                    kVar4.u = org.telegram.ui.Cells.t0.l(f12, 700.0f, 0.75f);
                    kVar4.h = f12 - AndroidUtilities.dp(6.0f);
                    o1.k kVar5 = new o1.k(zv0Var3, o1.h.n);
                    kVar5.b = w7.r.a(f14, f14, AndroidUtilities.dp(6.0f) + f15);
                    kVar5.c = true;
                    kVar5.u = org.telegram.ui.Cells.t0.l(f15, 700.0f, 0.75f);
                    kVar5.g = AndroidUtilities.dp(6.0f) + f15;
                    kVar5.b(new jf(f15, zv0Var3));
                    final int i24 = 1;
                    kVar5.a(new o1.f() { // from class: org.telegram.ui.Components.vd
                        @Override // o1.f
                        public final void a(o1.h hVar2, boolean z19, float f152, float f16) {
                            int i242 = i24;
                            float f17 = f11;
                            float f18 = f12;
                            zv0 zv0Var32 = zv0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i242) {
                                case 0:
                                    int i25 = ChatActivityEnterView.n5;
                                    if (dialog2.isShowing()) {
                                        zv0Var32.setTranslationX(f18);
                                        zv0Var32.setTranslationY(f17);
                                        sp0 sp0Var = chatActivityEnterView2.p0;
                                        sp0Var.getClass();
                                        sp0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i26 = ChatActivityEnterView.n5;
                                    if (dialog2.isShowing()) {
                                        zv0Var32.setTranslationX(f18);
                                        zv0Var32.setTranslationY(f17);
                                        sp0 sp0Var2 = chatActivityEnterView2.p0;
                                        sp0Var2.getClass();
                                        sp0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.l5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    o1.k kVar6 = new o1.k(zv0Var3, cVar3);
                    kVar6.u = org.telegram.ui.Cells.t0.l(scaleX, 1000.0f, 1.0f);
                    o1.k kVar7 = new o1.k(zv0Var3, cVar2);
                    kVar7.u = org.telegram.ui.Cells.t0.l(scaleX, 1000.0f, 1.0f);
                    efVar.l(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7);
                    break;
                }
                break;
            case 23:
                fo foVar = (fo) this.c;
                Context context2 = (Context) this.b;
                View view2 = (View) this.d;
                d6 d6Var2 = (d6) this.e;
                long j10 = foVar.V;
                final s2 s2Var = new s2(11, foVar, view2);
                rc rcVar = new rc(i12);
                int i25 = h6.j5;
                int r10 = d6Var2 != null ? d6Var2.r(i25) : h6.x0(null, i25, false);
                int i26 = h6.h5;
                int r11 = d6Var2 != null ? d6Var2.r(i26) : h6.x0(null, i26, false);
                int i27 = h6.Ji;
                if (d6Var2 != null) {
                    d6Var2.r(i27);
                } else {
                    h6.x0(null, i27, false);
                }
                int i28 = h6.Ni;
                if (d6Var2 != null) {
                    d6Var2.r(i28);
                } else {
                    h6.x0(null, i28, false);
                }
                int i29 = h6.E8;
                if (d6Var2 != null) {
                    d6Var2.r(i29);
                } else {
                    h6.x0(null, i29, false);
                }
                int i30 = h6.G8;
                if (d6Var2 != null) {
                    d6Var2.r(i30);
                } else {
                    h6.x0(null, i30, false);
                }
                int i31 = h6.i6;
                if (d6Var2 != null) {
                    d6Var2.r(i31);
                } else {
                    h6.x0(null, i31, false);
                }
                int i32 = h6.Sh;
                int r12 = d6Var2 != null ? d6Var2.r(i32) : h6.x0(null, i32, false);
                int i33 = h6.Oh;
                int r13 = d6Var2 != null ? d6Var2.r(i33) : h6.x0(null, i33, false);
                if (d6Var2 != null) {
                    d6Var2.r(h6.Qh);
                } else {
                    h6.x0(null, h6.Qh, false);
                }
                Pattern pattern = f5.a;
                if (context2 != null) {
                    final int i34 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final a3 a3Var = new a3(context2, d6Var2);
                    a3Var.a();
                    od0 od0Var = new od0(context2, d6Var2);
                    od0Var.setTextColor(r10);
                    od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    od0Var.setItemCount(5);
                    final e4 e4Var = new e4(context2, d6Var2);
                    e4Var.setWrapSelectorWheel(true);
                    e4Var.setAllItemsCount(24);
                    e4Var.setItemCount(5);
                    e4Var.setTextColor(r10);
                    e4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final f4 f4Var = new f4(context2, d6Var2);
                    f4Var.setWrapSelectorWheel(true);
                    f4Var.setAllItemsCount(60);
                    f4Var.setItemCount(5);
                    f4Var.setTextColor(r10);
                    f4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    x3 x3Var = new x3(context2, od0Var, e4Var, f4Var, 2);
                    od0 od0Var2 = od0Var;
                    x3Var.setOrientation(1);
                    frameLayout3.addView(x3Var, z5.d(-1.0f, -1));
                    frameLayout3.addView(new FrameLayout(context2), z5.a(100.0f, 0.0f, 0.0f, 0.0f, 120.0f, -1, 87));
                    FrameLayout frameLayout4 = new FrameLayout(context2);
                    x3Var.addView(frameLayout4, z5.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context2);
                    textView2.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView2.setTextColor(r10);
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    frameLayout4.addView(textView2, z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                    textView2.setOnTouchListener(new di.d(10));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    x3Var.addView(linearLayout, z5.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context2);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTextColor(h6.w0(h6.q5, d6Var2));
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    ud udVar = new ud(context2, 17);
                    udVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    b6.b(udVar, 0.02f, 1.2f);
                    linearLayout.addView(od0Var2, z5.l(0.5f, 0, 270));
                    od0Var2.setMinValue(0);
                    od0Var2.setMaxValue(365);
                    od0Var2.setWrapSelectorWheel(false);
                    od0Var2.setFormatter(new tr(24));
                    i6 i6Var = new i6(i34, od0Var, e4Var, f4Var, textView3);
                    od0Var2.setOnValueChangedListener(i6Var);
                    e4Var.setMinValue(0);
                    e4Var.setMaxValue(23);
                    int i35 = r11;
                    linearLayout.addView(e4Var, z5.l(0.2f, 0, 270));
                    e4Var.setFormatter(new tr(25));
                    e4Var.setOnValueChangedListener(i6Var);
                    f4Var.setMinValue(0);
                    f4Var.setMaxValue(59);
                    f4Var.setValue(0);
                    f4Var.setFormatter(new tr(26));
                    linearLayout.addView(f4Var, z5.l(0.3f, 0, 270));
                    f4Var.setOnValueChangedListener(i6Var);
                    if (j10 <= 0 || j10 == 2147483646) {
                        frameLayout = frameLayout3;
                    } else {
                        long j11 = j10 * 1000;
                        frameLayout = frameLayout3;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j11);
                        if (timeInMillis >= 0) {
                            f4Var.setValue(calendar.get(12));
                            e4Var.setValue(calendar.get(11));
                            od0Var2 = od0Var2;
                            od0Var2.setValue(timeInMillis);
                        } else {
                            od0Var2 = od0Var2;
                        }
                    }
                    final boolean[] zArr5 = {true};
                    f5.f(null, null, 0L, i34, 3, od0Var2, e4Var, f4Var);
                    f5.d(textView3, od0Var2, e4Var, f4Var);
                    udVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    udVar.setGravity(17);
                    udVar.setTextColor(r12);
                    udVar.setTextSize(1, 14.0f);
                    udVar.setTypeface(AndroidUtilities.bold());
                    udVar.setBackground(x5.e(new float[]{24.0f}, r13));
                    x3Var.addView(udVar, z5.t(-1, 48, 83, 14, 15, 14, 16));
                    final od0 od0Var3 = od0Var2;
                    udVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Runnable runnable2;
                            zArr5[0] = false;
                            long j12 = i34;
                            od0 od0Var4 = od0Var3;
                            e4 e4Var2 = e4Var;
                            f4 f4Var2 = f4Var;
                            boolean f16 = f5.f(null, null, 0L, j12, 3, od0Var4, e4Var2, f4Var2);
                            f5.d(textView3, od0Var4, e4Var2, f4Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, od0Var4.getValue());
                            calendar2.set(11, e4Var2.getValue());
                            calendar2.set(12, f4Var2.getValue());
                            if (f16) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            s2Var.C((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = a3Var.a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    x3Var.addView(textView3, z5.t(-1, -2, 83, 14, 0, 14, 16));
                    a3Var.b(frameLayout);
                    f3 f3Var = a3Var.a;
                    f3Var.show();
                    f3Var.setOnDismissListener(new g2(0, rcVar, zArr5));
                    f3Var.setBackgroundColor(i35);
                    f3Var.fixNavigationBar(i35);
                    break;
                }
                break;
            case 24:
                ny nyVar = (ny) this.c;
                b2[] b2VarArr2 = (b2[]) this.b;
                TLObject tLObject7 = (TLObject) this.d;
                a3 a3Var2 = (a3) this.e;
                nyVar.getClass();
                try {
                    b2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    pf.d.r(nyVar.c.a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    runnable = a3Var2.a.dismissRunnable;
                    runnable.run();
                    break;
                }
                break;
            case 25:
                a();
                break;
            case 26:
                b();
                break;
            case 27:
                c();
                break;
            case 28:
                d();
                break;
            default:
                a90.o((a90) this.c, (TLRPC.TL_error) this.b, (TLRPC.Updates) this.d, (TLRPC.TL_messages_importChatInvite) this.e);
                break;
        }
    }

    public /* synthetic */ i(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        this.a = 1;
        this.b = runnable;
        this.c = cameraSession;
        this.e = countDownLatch;
        this.d = runnable2;
    }

    public /* synthetic */ i(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.a = 0;
        this.c = cameraSession;
        this.b = runnable;
        this.e = surfaceTexture;
        this.d = runnable2;
    }

    public /* synthetic */ i(mz mzVar, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, Runnable runnable) {
        this.a = 25;
        this.c = mzVar;
        this.d = tL_messages_getStickers;
        this.e = tLObject;
        this.b = runnable;
    }
}
