package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.de1;
import org.telegram.ui.ke1;
import org.telegram.ui.le1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class r11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r11(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [org.telegram.ui.pt] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        int i10 = 4;
        t8.c cVar = null;
        ArrayList arrayList3 = null;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                t11 t11Var = (t11) this.c;
                mp mpVar = (mp) this.d;
                int i11 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = mpVar.b;
                if (drawable instanceof bc0) {
                    bc0 bc0Var = (bc0) drawable;
                    bc0Var.t(t11.e(bitmap), i11);
                    bc0Var.u(t11Var.L);
                    t11Var.invalidate();
                    return;
                }
                return;
            case 1:
                ?? r62 = (org.telegram.ui.pt) this.c;
                ml0 ml0Var = (ml0) this.d;
                int i12 = this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                if (r62.j == null) {
                    return;
                }
                ml0Var.setOnItemClickListener((al0) null);
                ml0Var.requestDisallowInterceptTouchEvent(true);
                r62.j = null;
                r62.w(AndroidUtilities.findActivity(ml0Var.getContext()));
                r62.i = false;
                View view = r62.h;
                if (view instanceof org.telegram.ui.Cells.g8) {
                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
                    TLRPC.Document sticker = g8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = g8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(g8Var.getSticker(), null, Integer.valueOf(r62.r));
                    org.telegram.ui.nt ntVar = r62.l;
                    r62.t(sticker, stickerPath, findAnimatedEmojiEmoticon, ntVar != null ? ntVar.G(false) : null, null, i12, g8Var.y, g8Var.getParentObject(), r62.c0, 0);
                    g8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.e8) {
                    org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
                    TLRPC.Document sticker2 = e8Var.getSticker();
                    org.telegram.ui.nt ntVar2 = r62.l;
                    r62.t(sticker2, null, null, ntVar2 != null ? ntVar2.G(false) : null, null, i12, false, e8Var.getParentObject(), d6Var, 0);
                    e8Var.setScaled(true);
                    r62.i = e8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    TLRPC.Document document2 = e2Var.getDocument();
                    org.telegram.ui.nt ntVar3 = r62.l;
                    r62.t(document2, null, null, ntVar3 != null ? ntVar3.G(true) : null, e2Var.getBotInlineResult(), i12, false, e2Var.getBotInlineResult() != null ? e2Var.getInlineBot() : e2Var.getParentObject(), d6Var, 0);
                    if (i12 != 1 || r62.m) {
                        e2Var.setScaled(true);
                    }
                } else if (view instanceof kv) {
                    TLRPC.Document document3 = ((kv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r62.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r62.r)), null, null, i12, false, null, d6Var, 0);
                    }
                } else if (view instanceof uy) {
                    z5 span = ((uy) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = q5.f(r62.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r62.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r62.r)), null, null, i12, false, null, d6Var, 0);
                    }
                } else {
                    if (!(view instanceof ly0)) {
                        return;
                    }
                    Drawable drawable2 = ((ly0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof q5 ? ((q5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r62.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r62.r)), null, null, i12, false, null, d6Var, 0);
                    }
                }
                try {
                    r62.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.nt ntVar4 = r62.l;
                if (ntVar4 != null) {
                    ntVar4.u();
                    return;
                }
                return;
            case 2:
                String str = (String) this.c;
                int i13 = this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.e;
                AndroidUtilities.addToClipboard(str);
                if (i13 == 1) {
                    org.telegram.messenger.ul.p(R.string.PhoneCopied, new xc(f3Var.getContainer(), d6Var2));
                    return;
                } else {
                    new xc(f3Var.getContainer(), d6Var2).k(false).j();
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i14 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.e;
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, ryVar)) {
                    launchActivity.q0(new org.telegram.ui.xn(bundle), true, false);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ac0 ac0Var = (org.telegram.ui.ac0) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i15 = this.b;
                String str2 = (String) this.e;
                ac0Var.a();
                if (i15 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i15 != 0) {
                        if (i15 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i15 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i15, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.G = true;
                        notificationsCustomSettingsActivity.l0(false);
                        ac0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            ac0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            ac0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            ac0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            ac0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            ac0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            ac0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            ac0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            ac0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            ac0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            ac0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            ac0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            ac0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            ac0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        ac0Var.o("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i15, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.l0(false);
                ac0Var.n(notificationsCustomSettingsActivity2, false);
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
                int i16 = this.b;
                ArrayList arrayList4 = notificationsCustomSettingsActivity3.I;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.fa)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i16 >= 0 && i16 < arrayList4.size()) {
                    ((org.telegram.ui.hk0) arrayList4.get(i16)).f = string;
                }
                ((org.telegram.ui.Cells.fa) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i17 = this.b;
                org.telegram.ui.cl0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (b1Var != null) {
                    boolean z11 = org.telegram.ui.web.b1.P0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    b1Var.z("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i17).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 7:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str4 = (String) this.e;
                int i18 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.da(passkeysActivity, passkey, str4, i18, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                int i19 = this.b;
                String str5 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    try {
                        t8.b bVar = new t8.b(ApplicationLoader.applicationContext);
                        bVar.c(0);
                        bVar.b(0);
                        bVar.c = false;
                        cVar = bVar.a();
                        if (cVar.c.k()) {
                            lf.i iVar = new lf.i(22);
                            Bitmap bitmap2 = bitmapHolder.bitmap;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            iVar.d = bitmap2;
                            a3.l lVar = (a3.l) iVar.b;
                            lVar.a = width;
                            lVar.b = height;
                            lVar.c = i19;
                            if (cVar.Z0(iVar).size() == 0) {
                                z10 = false;
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.vl0(photoViewer, str5, z10, i10));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.kf0(photoViewer, bitmapHolder, str5, 17));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (0 == 0) {
                            return;
                        }
                    }
                    cVar.U0();
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        r3.U0();
                    }
                    throw th2;
                }
            case 9:
                org.telegram.ui.zs0 zs0Var = (org.telegram.ui.zs0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.i iVar2 = (a0.i) this.e;
                xc.v(zs0Var.d1.y, null, frameLayout, iVar2.m(), iVar2.m() == 1 ? ((TLRPC.Dialog) iVar2.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 10:
                e5.f0(this.b, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 11:
                de1 de1Var = (de1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i20 = this.b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.e;
                de1Var.getClass();
                int i21 = 0;
                while (i21 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i21).id == i20) {
                        tL_messageMediaToDo.todo.list.remove(i21);
                        i21--;
                    }
                    i21++;
                }
                int i22 = 0;
                while (i22 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i22).id == i20) {
                        tL_messageMediaToDo.completions.remove(i22);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i22--;
                    }
                    i22++;
                }
                de1Var.G.messageOwner.media = tL_messageMediaToDo;
                xnVar.getSendMessagesHelper().editMessage(de1Var.G, null, null, null, null, null, null, false, false, null);
                xnVar.Wc(false);
                de1Var.c(false);
                return;
            case 12:
                ke1 ke1Var = (ke1) this.c;
                int i23 = this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                le1 le1Var = ke1Var.h;
                ArrayList arrayList7 = ke1Var.d;
                ArrayList arrayList8 = ke1Var.c;
                if (i23 != ke1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                ke1Var.l();
                if (arrayList8.isEmpty()) {
                    le1Var.r.setVisibility(0);
                    return;
                } else {
                    le1Var.r.setVisibility(8);
                    return;
                }
            case 13:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) this.c;
                int i24 = this.b;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
                ai.da daVar = (ai.da) this.e;
                SendMessagesHelper.getInstance(b1Var2.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(b1Var2.M).getCurrentUser(), b1Var2.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", "sent");
                    org.telegram.ui.web.b1.x(i24, y0Var, daVar, "phone_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 14:
                pg.l1 l1Var = (pg.l1) this.c;
                pg.g1 g1Var = (pg.g1) this.d;
                int i25 = this.b;
                ArrayList arrayList9 = (ArrayList) this.e;
                ArrayList arrayList10 = l1Var.c;
                boolean z12 = g1Var != null;
                l1Var.d = z12;
                if (!z12 || i25 < 0 || i25 >= arrayList10.size()) {
                    l1Var.i = arrayList9;
                } else {
                    l1Var.a++;
                    ((pg.k1) arrayList10.get(i25)).c++;
                    l1Var.g.edit().putInt(hg.c.i(i25, "score"), ((pg.k1) arrayList10.get(i25)).c).putInt("scoreall", l1Var.a).apply();
                    l1Var.i = null;
                }
                l1Var.e.run(g1Var);
                return;
            case 15:
                qg.p2 p2Var = (qg.p2) this.c;
                p2Var.m((Bitmap) this.e, this.b, p2Var.T, p2Var.U, (org.telegram.ui.ir0) this.d);
                return;
            case 16:
                da.b bVar2 = (da.b) this.c;
                l5.i iVar3 = (l5.i) this.d;
                int i26 = this.b;
                Runnable runnable = (Runnable) this.e;
                t5.c cVar2 = (t5.c) bVar2.f;
                try {
                    try {
                        s5.d dVar = (s5.d) bVar2.c;
                        Objects.requireNonNull(dVar);
                        ((s5.g) cVar2).f(new r5.d(dVar, 0));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) bVar2.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((s5.g) cVar2).f(new gg.d2(bVar2, iVar3, i26, 18));
                        } else {
                            bVar2.e(iVar3, i26);
                        }
                    } catch (Throwable th3) {
                        runnable.run();
                        throw th3;
                    }
                } catch (t5.a unused3) {
                    ((lf.i) bVar2.d).V(iVar3, i26 + 1, false);
                }
                runnable.run();
                return;
            case 17:
                rg.j0.R((rg.j0) this.c, (ArrayList) this.d, this.b, (TLRPC.TL_messages_inactiveChats) this.e);
                return;
            default:
                int i27 = this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.e;
                yh.y3 y3Var = new yh.y3(context, i27, UserConfig.getInstance(i27).getClientUserId(), d6Var3, null);
                y3Var.j2(savedStarGift, null);
                y3Var.show();
                return;
        }
    }

    public /* synthetic */ r11(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ r11(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ r11(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ r11(qg.p2 p2Var, Bitmap bitmap, int i10, org.telegram.ui.ir0 ir0Var) {
        this.a = 15;
        this.c = p2Var;
        this.e = bitmap;
        this.b = i10;
        this.d = ir0Var;
    }
}
