package org.telegram.messenger.camera;

import ai.f3;
import ai.p4;
import ai.t0;
import ai.wd;
import ai.y8;
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
import org.telegram.messenger.v0;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d4;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.e2;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.g2;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.p2;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.w3;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yt;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a1;
import org.telegram.ui.d3;
import org.telegram.ui.dq;
import org.telegram.ui.ey;
import org.telegram.ui.ir;
import org.telegram.ui.jr;
import org.telegram.ui.k8;
import org.telegram.ui.kp;
import org.telegram.ui.nq;
import org.telegram.ui.p6;
import org.telegram.ui.q00;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
import org.telegram.ui.sa;
import org.telegram.ui.sn;
import org.telegram.ui.tr;
import org.telegram.ui.u6;
import si.o0;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        o2 o2Var = k10Var.n;
        q00.r0(tL_error, o2Var, xc.a0(o2Var));
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
            o2Var.getMessagesController().loadRemoteFilters(true, new g4(k10Var, callback, i10, 4));
            return;
        }
        if (k10Var.a0 != null) {
            o2Var.getMessagesController().checkChatlistFolderUpdate(k10Var.Y, true);
        }
        k10Var.A0 = true;
        k10Var.dismiss();
        callback.run(Integer.valueOf(i10));
    }

    private final void c() {
        ey eyVar = (ey) this.c;
        Integer num = (Integer) this.b;
        qy qyVar = (qy) this.d;
        o2 o2Var = (o2) this.e;
        eyVar.u4(num.intValue());
        AndroidUtilities.runOnUIThread(new yt(12, qyVar, o2Var), 200L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0db4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.User user;
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        boolean z13;
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
        boolean z14;
        float f7;
        final float f10;
        float f11;
        o1.k kVar;
        o1.k kVar2;
        o1.k kVar3;
        rc rcVar;
        w3 w3Var;
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
                ((VideoAds) this.c).lambda$show$14((Context) this.b, (TLRPC.TL_sponsoredMessage) this.d, (j80) this.e);
                break;
            case 3:
                ((g4) this.c).run(k6.S0((File) this.b, (String) this.d, (String[]) this.e));
                break;
            case 4:
                TLObject tLObject = (TLObject) this.c;
                i6 i6Var = (i6) this.b;
                j6 j6Var = (j6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                k6.A--;
                if (tLObject instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (i6Var == null || themeSettings == null) {
                        TLRPC.Document document = tL_theme2.document;
                        if (document != null && document.id != tL_theme.document.id) {
                            if (i6Var != null) {
                                i6Var.r = tL_theme2;
                                z11 = true;
                            } else {
                                j6Var.F = tL_theme2;
                                j6Var.G = false;
                                j6Var.g0 = null;
                                j6Var.h0 = null;
                                NotificationCenter.getInstance(j6Var.E).addObserver(j6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(j6Var.E).addObserver(j6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(j6Var.E);
                                TLRPC.TL_theme tL_theme3 = j6Var.F;
                                z11 = true;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                            z10 = z11;
                        }
                    } else {
                        if (j6.a(i6Var, themeSettings)) {
                            z12 = false;
                        } else {
                            File d = i6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            j6.i(i6Var, themeSettings);
                            j6 j6Var2 = k6.I;
                            if (j6Var2 == j6Var && j6Var2.Y == i6Var.a) {
                                k6.q1(false, false);
                                k6.J(ApplicationLoader.applicationContext, false);
                                j6 j6Var3 = k6.I;
                                k6.H1(j6Var3, k6.J == j6Var3, -1, null);
                            }
                            f6.a(true);
                            z12 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        i6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z10 = z12;
                    }
                    if (k6.A != 0) {
                        k6.B = (int) (System.currentTimeMillis() / 1000);
                        k6.v1(z10, false);
                        break;
                    }
                }
                z10 = false;
                if (k6.A != 0) {
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
                    s6Var.d.x0(true);
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
                sa.U((sa) this.c, (c2) this.b, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                break;
            case 9:
                sn snVar = (sn) this.c;
                o2 o2Var = (o2) this.b;
                MessageObject messageObject = (MessageObject) this.d;
                h5 h5Var = (h5) this.e;
                if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
                    snVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
                }
                snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) h5Var).c(h5Var.getFragmentStack().size() - 1, new sn(bundle));
                o2Var.finishFragment();
                break;
            case 10:
                sn snVar2 = (sn) this.c;
                pf.c cVar = (pf.c) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                f3 f3Var = (f3) this.e;
                cVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    snVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    snVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = snVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        f3Var.run(user);
                        break;
                    }
                }
                user = null;
                f3Var.run(user);
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
                ofFloat.addUpdateListener(new d3(asVar, 5));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(bs.f);
                ofFloat.start();
                break;
            case 12:
                sn snVar3 = (sn) this.c;
                MessageObject messageObject2 = (MessageObject) this.b;
                c2 c2Var = (c2) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                try {
                    tL_webPage = ma0.f(messageObject2);
                    th2 = null;
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    th2 = th3;
                    tL_webPage = null;
                }
                AndroidUtilities.runOnUIThread(new p4(snVar3, c2Var, zArr4, th2 == null && tL_webPage != null, messageObject2, tL_webPage));
                break;
            case 13:
                sn snVar4 = (sn) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                if (tL_error == null && !messages_messages.messages.isEmpty()) {
                    int i13 = messages_messages.messages.get(0).id;
                    MessageObject messageObject3 = (MessageObject) snVar4.A6[0].get(i13);
                    messagesStorage.markMessageAsMention(snVar4.f6, i13);
                    if (messageObject3 != null) {
                        TLRPC.Message message = messageObject3.messageOwner;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    snVar4.j(i13, 0, false, 0, true, 0);
                    break;
                } else {
                    if (messages_messages != null) {
                        snVar4.x6 = messages_messages.count;
                        z13 = false;
                    } else {
                        z13 = false;
                        snVar4.x6 = 0;
                    }
                    messagesStorage.resetMentionsCount(snVar4.f6, snVar4.d(), snVar4.x6);
                    int i14 = snVar4.x6;
                    if (i14 != 0) {
                        snVar4.v1.c(2, i14, true);
                        snVar4.M9();
                        break;
                    } else {
                        snVar4.y6 = true;
                        snVar4.Qb(z13);
                        break;
                    }
                }
                break;
            case 14:
                sn.M0((sn) this.c, (TLRPC.TL_messageMediaWebPage) this.b, (TLRPC.TL_webPageAttributeStory) this.d, (p6) this.e);
                break;
            case 15:
                kp.W((kp) this.c, (c2[]) this.b, (TLRPC.Chat) this.d, (o2) this.e);
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
                    alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new a1(nqVar, 23));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    jrVar2.showDialog(alertDialog$Builder.a);
                    break;
                }
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
                    int i15 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i15];
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
                        int i16 = 0;
                        while (i16 < size) {
                            TLObject tLObject6 = (TLObject) arrayList.get(i16);
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
                                    i10 = i16;
                                    i16 = i10 + 1;
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
                                i10 = i16;
                                i16 = i10 + 1;
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
                            i10 = i16;
                            int i17 = 0;
                            boolean z15 = false;
                            while (true) {
                                if (i17 < i15) {
                                    int i18 = i17;
                                    String str7 = strArr[i18];
                                    if (lowerCase.startsWith(str7) || v0.w(" ", str7, lowerCase) || (translitString2 != null && (translitString2.startsWith(str7) || v0.w(" ", str7, translitString2)))) {
                                        str4 = lowerCase;
                                        z14 = true;
                                    } else if (publicUsername == null || !publicUsername.startsWith(str7)) {
                                        boolean z16 = z15;
                                        str4 = lowerCase;
                                        z14 = z16;
                                    } else {
                                        str4 = lowerCase;
                                        z14 = 2;
                                    }
                                    if (z14) {
                                        if (z14) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(str2, str3, str7));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName(o0.h("@", publicUsername), null, "@" + str7));
                                        }
                                        arrayList5.add(tLObject6);
                                    } else {
                                        String str8 = translitString2;
                                        i17 = i18 + 1;
                                        String str9 = str4;
                                        z15 = z14;
                                        lowerCase = str9;
                                        translitString2 = str8;
                                    }
                                }
                            }
                            i16 = i10 + 1;
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
                        int i19 = 0;
                        while (i19 < arrayList2.size()) {
                            TLRPC.User user4 = jrVar5.getMessagesController().getUser(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i19)).user_id));
                            if (user4.id != jrVar5.getUserConfig().getClientUserId()) {
                                String lowerCase3 = UserObject.getUserName(user4).toLowerCase();
                                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                                if (lowerCase3.equals(translitString3)) {
                                    translitString3 = null;
                                }
                                int i20 = 0;
                                boolean z17 = false;
                                while (i20 < i15) {
                                    String str10 = strArr3[i20];
                                    if (lowerCase3.startsWith(str10) || v0.w(str5, str10, lowerCase3) || (translitString3 != null && (translitString3.startsWith(str10) || v0.w(str5, str10, translitString3)))) {
                                        str = str5;
                                        z17 = true;
                                    } else {
                                        str = str5;
                                        String publicUsername2 = UserObject.getPublicUsername(user4);
                                        if (publicUsername2 != null && publicUsername2.startsWith(str10)) {
                                            z17 = 2;
                                        }
                                    }
                                    if (z17) {
                                        if (z17) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str10));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str10));
                                        }
                                        arrayList3.add(user4);
                                        hVar.k(user4, user4.id);
                                        i19++;
                                        str5 = str;
                                    } else {
                                        i20++;
                                        str5 = str;
                                    }
                                }
                            }
                            str = str5;
                            i19++;
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
                g6 g6Var = (g6) this.e;
                String str11 = "https://t.me/addstyle/" + tL_aiComposeTone.slug;
                new org.telegram.ui.Components.l(e0Var, context, str11, str11, g6Var).show();
                break;
            case 20:
                e5 e5Var = (e5) this.c;
                y8 y8Var = (y8) this.b;
                c2[] c2VarArr = (c2[]) this.d;
                View view = (View) this.e;
                String trim = e5Var.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase4 = parse.getHost().toLowerCase();
                    if (lowerCase4.startsWith("www.")) {
                        lowerCase4 = lowerCase4.substring(4);
                    }
                    y8Var.run(lowerCase4);
                    c2 c2Var2 = c2VarArr[0];
                    if (c2Var2 != null) {
                        c2Var2.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        break;
                    }
                } else {
                    AndroidUtilities.shakeView(e5Var);
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
                int i21 = 0;
                while (true) {
                    if (i21 < iArr.length) {
                        if (iArr2[0] == iArr[i21]) {
                            spannableStringBuilder.append((CharSequence) strArr4[i21]);
                            spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i21++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    xq xqVar = new xq(R.drawable.arrows_select, 0);
                    xqVar.spaceScaleX = 0.7f;
                    xqVar.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    xqVar.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(xqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    xq xqVar2 = new xq(R.drawable.mini_switch_lock, 0);
                    xqVar2.spaceScaleX = 0.7f;
                    xqVar2.translate(AndroidUtilities.dp(-1.33f), AndroidUtilities.dp(0.0f));
                    xqVar2.setAlpha(0.75f);
                    spannableStringBuilder.setSpan(xqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                break;
            case 22:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                final ew0 ew0Var = (ew0) this.b;
                int[] iArr3 = (int[]) this.d;
                vp0 vp0Var = (vp0) this.e;
                o1.c cVar2 = o1.h.p;
                o1.c cVar3 = o1.h.o;
                int[] iArr4 = chatActivityEnterView.N2;
                if (chatActivityEnterView.q0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout.addView(ew0Var, z5.e(40, 40, 3));
                    dialog.setContentView(frameLayout);
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
                    AndroidUtilities.setLightStatusBar(dialog, k6.x0(null, k6.s8, true) == -1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        AndroidUtilities.setLightNavigationBar(dialog, AndroidUtilities.computePerceivedBrightness(k6.x0(null, k6.a7, true)) >= 0.721f);
                    }
                    chatActivityEnterView.s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.s0;
                    chatActivityEnterView.p0.getLocationInWindow(iArr4);
                    final float f12 = iArr4[0];
                    float f13 = iArr4[1];
                    float dp = AndroidUtilities.dp(5.0f);
                    float dp2 = iArr3[0] + chatActivityEnterView.s0 + dp + AndroidUtilities.dp(4.0f) + 0.0f;
                    float f14 = iArr3[1] + chatActivityEnterView.t0 + dp + 0.0f;
                    ew0Var.setTranslationX(dp2);
                    ew0Var.setTranslationY(f14);
                    float scaleX = (chatActivityEnterView.p0.getLayoutParams().width * (chatActivityEnterView.p5 ? chatActivityEnterView.p0.getScaleX() : 1.0f)) / AndroidUtilities.dp(40.0f);
                    ew0Var.setPivotX(0.0f);
                    ew0Var.setPivotY(0.0f);
                    ew0Var.setScaleX(0.75f);
                    ew0Var.setScaleY(0.75f);
                    ew0Var.getViewTreeObserver().addOnDrawListener(new ff(ew0Var, vp0Var));
                    dialog.show();
                    if (chatActivityEnterView.p5) {
                        f7 = 1.0f;
                    } else {
                        f7 = 1.0f;
                        chatActivityEnterView.p0.setScaleX(1.0f);
                        chatActivityEnterView.p0.setScaleY(1.0f);
                    }
                    chatActivityEnterView.p0.setAlpha(f7);
                    ef efVar = chatActivityEnterView.q0;
                    if (chatActivityEnterView.p5) {
                        f10 = f13;
                        kVar = null;
                        f11 = 0.5f;
                    } else {
                        o1.k kVar4 = new o1.k(chatActivityEnterView.p0, cVar3);
                        f10 = f13;
                        f11 = 0.5f;
                        kVar4.u = b1.m(0.5f, 750.0f, f7);
                        kVar = kVar4;
                    }
                    if (chatActivityEnterView.p5) {
                        kVar2 = kVar;
                        kVar3 = null;
                    } else {
                        kVar2 = kVar;
                        o1.k kVar5 = new o1.k(chatActivityEnterView.p0, cVar2);
                        kVar5.u = b1.m(f11, 750.0f, f7);
                        kVar3 = kVar5;
                    }
                    o1.k kVar6 = new o1.k(chatActivityEnterView.p0, o1.h.t);
                    kVar6.u = b1.m(0.0f, 750.0f, f7);
                    final int i22 = 0;
                    final float f15 = f10;
                    kVar6.a(new o1.f() { // from class: org.telegram.ui.Components.vd
                        @Override // o1.f
                        public final void a(o1.h hVar2, boolean z18, float f16, float f17) {
                            int i23 = i22;
                            float f18 = f10;
                            float f19 = f12;
                            ew0 ew0Var2 = ew0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i23) {
                                case 0:
                                    int i24 = ChatActivityEnterView.r5;
                                    if (dialog2.isShowing()) {
                                        ew0Var2.setTranslationX(f19);
                                        ew0Var2.setTranslationY(f18);
                                        xp0 xp0Var = chatActivityEnterView2.p0;
                                        xp0Var.getClass();
                                        xp0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i25 = ChatActivityEnterView.r5;
                                    if (dialog2.isShowing()) {
                                        ew0Var2.setTranslationX(f19);
                                        ew0Var2.setTranslationY(f18);
                                        xp0 xp0Var2 = chatActivityEnterView2.p0;
                                        xp0Var2.getClass();
                                        xp0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
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
                    o1.k kVar7 = new o1.k(ew0Var, o1.h.m);
                    kVar7.b = w7.r.a(dp2, f12 - AndroidUtilities.dp(6.0f), dp2);
                    kVar7.c = true;
                    kVar7.u = b1.m(f12, 700.0f, 0.75f);
                    kVar7.h = f12 - AndroidUtilities.dp(6.0f);
                    o1.k kVar8 = new o1.k(ew0Var, o1.h.n);
                    kVar8.b = w7.r.a(f14, f14, AndroidUtilities.dp(6.0f) + f15);
                    kVar8.c = true;
                    kVar8.u = b1.m(f15, 700.0f, 0.75f);
                    kVar8.g = AndroidUtilities.dp(6.0f) + f15;
                    kVar8.b(new jf(f15, ew0Var));
                    final int i23 = 1;
                    kVar8.a(new o1.f() { // from class: org.telegram.ui.Components.vd
                        @Override // o1.f
                        public final void a(o1.h hVar2, boolean z18, float f16, float f17) {
                            int i232 = i23;
                            float f18 = f15;
                            float f19 = f12;
                            ew0 ew0Var2 = ew0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i232) {
                                case 0:
                                    int i24 = ChatActivityEnterView.r5;
                                    if (dialog2.isShowing()) {
                                        ew0Var2.setTranslationX(f19);
                                        ew0Var2.setTranslationY(f18);
                                        xp0 xp0Var = chatActivityEnterView2.p0;
                                        xp0Var.getClass();
                                        xp0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new gf(chatActivityEnterView2, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i25 = ChatActivityEnterView.r5;
                                    if (dialog2.isShowing()) {
                                        ew0Var2.setTranslationX(f19);
                                        ew0Var2.setTranslationY(f18);
                                        xp0 xp0Var2 = chatActivityEnterView2.p0;
                                        xp0Var2.getClass();
                                        xp0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
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
                    o1.k kVar9 = new o1.k(ew0Var, cVar3);
                    kVar9.u = b1.m(scaleX, 1000.0f, 1.0f);
                    o1.k kVar10 = new o1.k(ew0Var, cVar2);
                    kVar10.u = b1.m(scaleX, 1000.0f, 1.0f);
                    efVar.l(kVar2, kVar3, kVar6, kVar7, kVar8, kVar9, kVar10);
                    break;
                }
                break;
            case 23:
                fo foVar = (fo) this.c;
                Context context2 = (Context) this.b;
                View view2 = (View) this.d;
                g6 g6Var2 = (g6) this.e;
                long j10 = foVar.V;
                final p2 p2Var = new p2(13, foVar, view2);
                rc rcVar2 = new rc(i12);
                int i24 = k6.j5;
                int e = g6Var2 != null ? g6Var2.e(i24) : k6.x0(null, i24, false);
                int i25 = k6.h5;
                int e7 = g6Var2 != null ? g6Var2.e(i25) : k6.x0(null, i25, false);
                int i26 = k6.Ji;
                if (g6Var2 != null) {
                    g6Var2.e(i26);
                } else {
                    k6.x0(null, i26, false);
                }
                int i27 = k6.Ni;
                if (g6Var2 != null) {
                    g6Var2.e(i27);
                } else {
                    k6.x0(null, i27, false);
                }
                int i28 = k6.E8;
                if (g6Var2 != null) {
                    g6Var2.e(i28);
                } else {
                    k6.x0(null, i28, false);
                }
                int i29 = k6.G8;
                if (g6Var2 != null) {
                    g6Var2.e(i29);
                } else {
                    k6.x0(null, i29, false);
                }
                int i30 = k6.i6;
                if (g6Var2 != null) {
                    g6Var2.e(i30);
                } else {
                    k6.x0(null, i30, false);
                }
                int i31 = k6.Sh;
                int e10 = g6Var2 != null ? g6Var2.e(i31) : k6.x0(null, i31, false);
                int i32 = k6.Oh;
                int e11 = g6Var2 != null ? g6Var2.e(i32) : k6.x0(null, i32, false);
                if (g6Var2 != null) {
                    g6Var2.e(k6.Qh);
                } else {
                    k6.x0(null, k6.Qh, false);
                }
                Pattern pattern = f5.a;
                if (context2 != null) {
                    int i33 = e11;
                    final int i34 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
                    final b3 b3Var = new b3(context2, g6Var2);
                    b3Var.a();
                    final qd0 qd0Var = new qd0(context2, g6Var2);
                    qd0Var.setTextColor(e);
                    qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                    qd0Var.setItemCount(5);
                    final d4 d4Var = new d4(context2, g6Var2);
                    d4Var.setWrapSelectorWheel(true);
                    d4Var.setAllItemsCount(24);
                    d4Var.setItemCount(5);
                    d4Var.setTextColor(e);
                    d4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                    final e4 e4Var = new e4(context2, g6Var2);
                    e4Var.setWrapSelectorWheel(true);
                    e4Var.setAllItemsCount(60);
                    e4Var.setItemCount(5);
                    e4Var.setTextColor(e);
                    e4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context2);
                    w3 w3Var2 = new w3(context2, qd0Var, d4Var, e4Var, 2);
                    w3Var2.setOrientation(1);
                    frameLayout2.addView(w3Var2, z5.c(-1.0f, -1));
                    frameLayout2.addView(new FrameLayout(context2), z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    w3Var2.addView(frameLayout3, z5.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context2);
                    textView2.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
                    textView2.setTextColor(e);
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    frameLayout3.addView(textView2, z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new di.d(10));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    w3Var2.addView(linearLayout, z5.p(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context2);
                    textView3.setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.r6.W(textView3, k6.q5, g6Var2);
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    wd wdVar = new wd(context2, 16);
                    wdVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
                    b6.b(wdVar, 0.02f, 1.2f);
                    linearLayout.addView(qd0Var, z5.l(0.5f, 0, 270));
                    qd0Var.setMinValue(0);
                    qd0Var.setMaxValue(365);
                    qd0Var.setWrapSelectorWheel(false);
                    qd0Var.setFormatter(new tr(28));
                    ai.j6 j6Var4 = new ai.j6(i34, qd0Var, d4Var, e4Var, textView3);
                    qd0Var.setOnValueChangedListener(j6Var4);
                    d4Var.setMinValue(0);
                    d4Var.setMaxValue(23);
                    int i35 = e7;
                    linearLayout.addView(d4Var, z5.l(0.2f, 0, 270));
                    d4Var.setFormatter(new tr(29));
                    d4Var.setOnValueChangedListener(j6Var4);
                    e4Var.setMinValue(0);
                    e4Var.setMaxValue(59);
                    e4Var.setValue(0);
                    e4Var.setFormatter(new e2(0));
                    linearLayout.addView(e4Var, z5.l(0.3f, 0, 270));
                    e4Var.setOnValueChangedListener(j6Var4);
                    if (j10 <= 0 || j10 == 2147483646) {
                        rcVar = rcVar2;
                        w3Var = w3Var2;
                    } else {
                        rcVar = rcVar2;
                        long j11 = j10 * 1000;
                        w3Var = w3Var2;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j11);
                        if (timeInMillis >= 0) {
                            e4Var.setValue(calendar.get(12));
                            d4Var.setValue(calendar.get(11));
                            qd0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr5 = {true};
                    f5.g(null, null, 0L, i34, 3, qd0Var, d4Var, e4Var);
                    f5.e(textView3, qd0Var, d4Var, e4Var);
                    wdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    wdVar.setGravity(17);
                    wdVar.setTextColor(e10);
                    wdVar.setTextSize(1, 14.0f);
                    wdVar.setTypeface(AndroidUtilities.bold());
                    wdVar.setBackground(a6.e(new float[]{24.0f}, i33));
                    w3 w3Var3 = w3Var;
                    w3Var3.addView(wdVar, z5.t(-1, 48, 83, 14, 15, 14, 16));
                    wdVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.f2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Runnable runnable2;
                            zArr5[0] = false;
                            long j12 = i34;
                            qd0 qd0Var2 = qd0Var;
                            d4 d4Var2 = d4Var;
                            e4 e4Var2 = e4Var;
                            boolean g10 = f5.g(null, null, 0L, j12, 3, qd0Var2, d4Var2, e4Var2);
                            f5.e(textView3, qd0Var2, d4Var2, e4Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, qd0Var2.getValue());
                            calendar2.set(11, d4Var2.getValue());
                            calendar2.set(12, e4Var2.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            p2Var.C((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            runnable2 = b3Var.a.dismissRunnable;
                            runnable2.run();
                        }
                    });
                    w3Var3.addView(textView3, z5.t(-1, -2, 83, 14, 0, 14, 16));
                    b3Var.b(frameLayout2);
                    h3 h3Var = b3Var.a;
                    h3Var.show();
                    h3Var.setOnDismissListener(new g2(0, rcVar, zArr5));
                    h3Var.setBackgroundColor(i35);
                    h3Var.fixNavigationBar(i35);
                    break;
                }
                break;
            case 24:
                ny nyVar = (ny) this.c;
                c2[] c2VarArr2 = (c2[]) this.b;
                TLObject tLObject7 = (TLObject) this.d;
                b3 b3Var2 = (b3) this.e;
                nyVar.getClass();
                try {
                    c2VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr2[0] = null;
                if (tLObject7 instanceof TLRPC.TL_emojiURL) {
                    pf.d.r(nyVar.c.a.F.getContext(), ((TLRPC.TL_emojiURL) tLObject7).url);
                    runnable = b3Var2.a.dismissRunnable;
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
                a40.N((a40) this.c, (TLRPC.TL_error) this.b, (TLObject) this.d, (TLRPC.TL_channels_getParticipants) this.e);
                break;
            default:
                b90.n((b90) this.c, (TLRPC.TL_error) this.b, (TLRPC.Updates) this.d, (TLRPC.TL_messages_importChatInvite) this.e);
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
