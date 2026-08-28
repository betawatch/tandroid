package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ai1;
import org.telegram.ui.dd1;
import org.telegram.ui.jd1;
import org.telegram.ui.kd1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y01(int i9, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 10;
        this.b = i9;
        this.c = tL_error;
        this.d = o2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [org.telegram.ui.ht] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        int i9 = 2;
        d8.c cVar = null;
        ArrayList arrayList3 = null;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                a11 a11Var = (a11) this.c;
                bp bpVar = (bp) this.d;
                int i10 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = bpVar.b;
                if (drawable instanceof jb0) {
                    jb0 jb0Var = (jb0) drawable;
                    jb0Var.t(a11.e(bitmap), i10);
                    jb0Var.u(a11Var.H);
                    a11Var.invalidate();
                    return;
                }
                return;
            case 1:
                ?? r62 = (org.telegram.ui.ht) this.c;
                wk0 wk0Var = (wk0) this.d;
                int i11 = this.b;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.e;
                if (r62.j == null) {
                    return;
                }
                wk0Var.setOnItemClickListener((mk0) null);
                wk0Var.requestDisallowInterceptTouchEvent(true);
                r62.j = null;
                r62.w(AndroidUtilities.findActivity(wk0Var.getContext()));
                r62.i = false;
                View view = r62.h;
                if (view instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                    TLRPC.Document sticker = d8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = d8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(d8Var.getSticker(), null, Integer.valueOf(r62.r));
                    org.telegram.ui.ft ftVar = r62.l;
                    r62.t(sticker, stickerPath, findAnimatedEmojiEmoticon, ftVar != null ? ftVar.G(false) : null, null, i11, d8Var.y, d8Var.getParentObject(), r62.c0, 0);
                    d8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.b8) {
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
                    TLRPC.Document sticker2 = b8Var.getSticker();
                    org.telegram.ui.ft ftVar2 = r62.l;
                    r62.t(sticker2, null, null, ftVar2 != null ? ftVar2.G(false) : null, null, i11, false, b8Var.getParentObject(), b6Var, 0);
                    b8Var.setScaled(true);
                    r62.i = b8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    TLRPC.Document document2 = e2Var.getDocument();
                    org.telegram.ui.ft ftVar3 = r62.l;
                    r62.t(document2, null, null, ftVar3 != null ? ftVar3.G(true) : null, e2Var.getBotInlineResult(), i11, false, e2Var.getBotInlineResult() != null ? e2Var.getInlineBot() : e2Var.getParentObject(), b6Var, 0);
                    if (i11 != 1 || r62.m) {
                        e2Var.setScaled(true);
                    }
                } else if (view instanceof uu) {
                    TLRPC.Document document3 = ((uu) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r62.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r62.r)), null, null, i11, false, null, b6Var, 0);
                    }
                } else if (view instanceof fy) {
                    t5 span = ((fy) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = k5.f(r62.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r62.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r62.r)), null, null, i11, false, null, b6Var, 0);
                    }
                } else {
                    if (!(view instanceof tx0)) {
                        return;
                    }
                    Drawable drawable2 = ((tx0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof k5 ? ((k5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r62.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r62.r)), null, null, i11, false, null, b6Var, 0);
                    }
                }
                try {
                    r62.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.ft ftVar4 = r62.l;
                if (ftVar4 != null) {
                    ftVar4.t();
                    return;
                }
                return;
            case 2:
                String str = (String) this.c;
                int i12 = this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) this.e;
                AndroidUtilities.addToClipboard(str);
                if (i12 == 1) {
                    org.telegram.messenger.ll.o(R.string.PhoneCopied, new oc(f3Var.getContainer(), b6Var2));
                    return;
                } else {
                    new oc(f3Var.getContainer(), b6Var2).k(false).j();
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i13 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.e;
                Pattern pattern = LaunchActivity.x1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.K).checkCanOpenChat(bundle, dyVar)) {
                    launchActivity.q0(new org.telegram.ui.qn(bundle), true, false);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.kb0 kb0Var = (org.telegram.ui.kb0) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i14 = this.b;
                String str2 = (String) this.e;
                kb0Var.a();
                if (i14 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i14 != 0) {
                        if (i14 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i14 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i14, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.C = true;
                        notificationsCustomSettingsActivity.k0(false);
                        kb0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            kb0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            kb0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            kb0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            kb0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            kb0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            kb0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            kb0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            kb0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            kb0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            kb0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            kb0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            kb0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            kb0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        kb0Var.o("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i14, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.C = true;
                notificationsCustomSettingsActivity2.k0(false);
                kb0Var.n(notificationsCustomSettingsActivity2, false);
                if ("show".equalsIgnoreCase(str2)) {
                }
                if ("new".equalsIgnoreCase(str2)) {
                }
                if ("important".equalsIgnoreCase(str2)) {
                }
                if ("messages".equalsIgnoreCase(str2)) {
                }
                if ("stories".equalsIgnoreCase(str2)) {
                }
                if ("preview".equalsIgnoreCase(str2)) {
                }
                if ("show-sender".equalsIgnoreCase(str2)) {
                }
                if ("sound".equalsIgnoreCase(str2)) {
                }
                if ("add-exception".equalsIgnoreCase(str2)) {
                }
                if ("delete-exceptions".equalsIgnoreCase(str2)) {
                }
                if ("light-color".equalsIgnoreCase(str2)) {
                }
                if ("vibrate".equalsIgnoreCase(str2)) {
                }
                if ("popup".equalsIgnoreCase(str2)) {
                }
                if ("priority".equalsIgnoreCase(str2)) {
                }
            case 5:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.c;
                View view2 = (View) this.d;
                String str3 = (String) this.e;
                int i15 = this.b;
                ArrayList arrayList4 = notificationsCustomSettingsActivity3.E;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.ba)) {
                    notificationsCustomSettingsActivity3.k0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i15 >= 0 && i15 < arrayList4.size()) {
                    ((org.telegram.ui.yj0) arrayList4.get(i15)).f = string;
                }
                ((org.telegram.ui.Cells.ba) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i16 = this.b;
                org.telegram.ui.tk0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (y0Var != null) {
                    boolean z11 = org.telegram.ui.web.y0.I0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    y0Var.v("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i16).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 7:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str4 = (String) this.e;
                int i17 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bg.d0(passkeysActivity, passkey, str4, i17, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                int i18 = this.b;
                String str5 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.P8;
                try {
                    try {
                        d8.b bVar = new d8.b(ApplicationLoader.applicationContext);
                        bVar.c(0);
                        bVar.b(0);
                        bVar.c = false;
                        cVar = bVar.a();
                        if (cVar.c.k()) {
                            a5.m mVar = new a5.m(1);
                            Bitmap bitmap2 = bitmapHolder.bitmap;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            mVar.d = bitmap2;
                            a8.b bVar2 = (a8.b) mVar.b;
                            bVar2.a = width;
                            bVar2.b = height;
                            bVar2.c = i18;
                            if (cVar.Q(mVar).size() == 0) {
                                z10 = false;
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.np0(photoViewer, str5, z10, i9));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.ye0(photoViewer, bitmapHolder, str5, 17));
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (0 == 0) {
                            return;
                        }
                    }
                    cVar.N();
                    return;
                } catch (Throwable th) {
                    if (0 != 0) {
                        r3.N();
                    }
                    throw th;
                }
            case 9:
                org.telegram.ui.ds0 ds0Var = (org.telegram.ui.ds0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.h hVar = (a0.h) this.e;
                oc.v(ds0Var.Z0.y, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 10:
                y4.f0(this.b, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 11:
                dd1 dd1Var = (dd1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i19 = this.b;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.e;
                dd1Var.getClass();
                int i20 = 0;
                while (i20 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i20).id == i19) {
                        tL_messageMediaToDo.todo.list.remove(i20);
                        i20--;
                    }
                    i20++;
                }
                int i21 = 0;
                while (i21 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i21).id == i19) {
                        tL_messageMediaToDo.completions.remove(i21);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i21--;
                    }
                    i21++;
                }
                dd1Var.C.messageOwner.media = tL_messageMediaToDo;
                qnVar.getSendMessagesHelper().editMessage(dd1Var.C, null, null, null, null, null, null, false, false, null);
                qnVar.Wc(false);
                dd1Var.c(false);
                return;
            case 12:
                jd1 jd1Var = (jd1) this.c;
                int i22 = this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                kd1 kd1Var = jd1Var.h;
                ArrayList arrayList7 = jd1Var.d;
                ArrayList arrayList8 = jd1Var.c;
                if (i22 != jd1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                jd1Var.l();
                if (arrayList8.isEmpty()) {
                    kd1Var.r.setVisibility(0);
                    return;
                } else {
                    kd1Var.r.setVisibility(8);
                    return;
                }
            case 13:
                pf.r1 r1Var = (pf.r1) this.c;
                ArrayList arrayList9 = r1Var.b;
                TLRPC.Message message = (TLRPC.Message) this.d;
                String str6 = (String) this.e;
                int i23 = this.b;
                int i24 = r1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    pf.q1 c10 = r1Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        pf.q1 q1Var = new pf.q1();
                        q1Var.a = message.quick_reply_shortcut_id;
                        q1Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i24, message, false, true);
                        q1Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str6 != null) {
                            q1Var.b = str6;
                            r1Var.a(str6);
                        }
                        q1Var.e.applyQuickReply(str6, i23);
                        q1Var.f = 1;
                        arrayList9.add(q1Var);
                        for (int i25 = 0; i25 < arrayList9.size(); i25++) {
                            ((pf.q1) arrayList9.get(i25)).c = i25;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i24);
                        messagesStorage.getStorageQueue().postRunnable(new ai1(16, messagesStorage, q1Var));
                        NotificationCenter.getInstance(i24).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i26 = c10.d;
                        int i27 = message.id;
                        if (i26 == i27) {
                            c10.d = i27;
                            MessageObject messageObject2 = new MessageObject(i24, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            r1Var.l();
                            NotificationCenter.getInstance(i24).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            r1Var.l();
                            NotificationCenter.getInstance(i24).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str6 == null && i23 == 0) {
                    ArrayList<TLRPC.Message> arrayList10 = new ArrayList<>();
                    arrayList10.add(message);
                    MessagesStorage.getInstance(i24).putMessages(arrayList10, true, true, false, DownloadController.getInstance(i24).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i24).getClientUserId();
                    ArrayList<MessageObject> arrayList11 = new ArrayList<>();
                    arrayList11.add(new MessageObject(i24, message, true, true));
                    MessagesController.getInstance(i24).updateInterfaceWithMessages(clientUserId, arrayList11, 5);
                    return;
                }
                return;
            case 14:
                xf.k1 k1Var = (xf.k1) this.c;
                xf.f1 f1Var = (xf.f1) this.d;
                int i28 = this.b;
                ArrayList arrayList12 = (ArrayList) this.e;
                ArrayList arrayList13 = k1Var.c;
                boolean z12 = f1Var != null;
                k1Var.d = z12;
                if (!z12 || i28 < 0 || i28 >= arrayList13.size()) {
                    k1Var.i = arrayList12;
                } else {
                    k1Var.a++;
                    ((xf.j1) arrayList13.get(i28)).c++;
                    k1Var.g.edit().putInt(j3.r0.l(i28, "score"), ((xf.j1) arrayList13.get(i28)).c).putInt("scoreall", k1Var.a).apply();
                    k1Var.i = null;
                }
                k1Var.e.run(f1Var);
                return;
            case 15:
                yf.m2 m2Var = (yf.m2) this.c;
                m2Var.m((Bitmap) this.e, this.b, m2Var.P, m2Var.Q, (org.telegram.ui.mq0) this.d);
                return;
            default:
                zf.j0.Q((zf.j0) this.c, (ArrayList) this.d, this.b, (TLRPC.TL_messages_inactiveChats) this.e);
                return;
        }
    }

    public /* synthetic */ y01(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ y01(Object obj, Object obj2, int i9, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i9;
        this.e = obj3;
    }

    public /* synthetic */ y01(Object obj, Object obj2, Object obj3, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i9;
    }

    public /* synthetic */ y01(yf.m2 m2Var, Bitmap bitmap, int i9, org.telegram.ui.mq0 mq0Var) {
        this.a = 15;
        this.c = m2Var;
        this.e = bitmap;
        this.b = i9;
        this.d = mq0Var;
    }
}
