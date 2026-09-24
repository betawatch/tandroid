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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
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
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.telegram.ui.nt] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        t8.c cVar = null;
        ArrayList arrayList3 = null;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                h21 h21Var = (h21) this.c;
                mp mpVar = (mp) this.d;
                int i10 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = mpVar.b;
                if (drawable instanceof mc0) {
                    mc0 mc0Var = (mc0) drawable;
                    mc0Var.t(h21.e(bitmap), i10);
                    mc0Var.u(h21Var.L);
                    h21Var.invalidate();
                    return;
                }
                return;
            case 1:
                ?? r52 = (org.telegram.ui.nt) this.c;
                wl0 wl0Var = (wl0) this.d;
                int i11 = this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                if (r52.j == null) {
                    return;
                }
                wl0Var.setOnItemClickListener((kl0) null);
                wl0Var.requestDisallowInterceptTouchEvent(true);
                r52.j = null;
                r52.w(AndroidUtilities.findActivity(wl0Var.getContext()));
                r52.i = false;
                View view = r52.h;
                if (view instanceof org.telegram.ui.Cells.f8) {
                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
                    TLRPC.Document sticker = f8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = f8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f8Var.getSticker(), null, Integer.valueOf(r52.r));
                    org.telegram.ui.lt ltVar = r52.l;
                    r52.t(sticker, stickerPath, findAnimatedEmojiEmoticon, ltVar != null ? ltVar.G(false) : null, null, i11, f8Var.y, f8Var.getParentObject(), r52.c0, 0);
                    f8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                    TLRPC.Document sticker2 = d8Var.getSticker();
                    org.telegram.ui.lt ltVar2 = r52.l;
                    r52.t(sticker2, null, null, ltVar2 != null ? ltVar2.G(false) : null, null, i11, false, d8Var.getParentObject(), d6Var, 0);
                    d8Var.setScaled(true);
                    r52.i = d8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    TLRPC.Document document2 = f2Var.getDocument();
                    org.telegram.ui.lt ltVar3 = r52.l;
                    r52.t(document2, null, null, ltVar3 != null ? ltVar3.G(true) : null, f2Var.getBotInlineResult(), i11, false, f2Var.getBotInlineResult() != null ? f2Var.getInlineBot() : f2Var.getParentObject(), d6Var, 0);
                    if (i11 != 1 || r52.m) {
                        f2Var.setScaled(true);
                    }
                } else if (view instanceof lv) {
                    TLRPC.Document document3 = ((lv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r52.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r52.r)), null, null, i11, false, null, d6Var, 0);
                    }
                } else if (view instanceof uy) {
                    z5 span = ((uy) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = q5.f(r52.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r52.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r52.r)), null, null, i11, false, null, d6Var, 0);
                    }
                } else {
                    if (!(view instanceof wy0)) {
                        return;
                    }
                    Drawable drawable2 = ((wy0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof q5 ? ((q5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r52.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r52.r)), null, null, i11, false, null, d6Var, 0);
                    }
                }
                try {
                    r52.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.lt ltVar4 = r52.l;
                if (ltVar4 != null) {
                    ltVar4.u();
                    return;
                }
                return;
            case 2:
                String str = (String) this.c;
                int i12 = this.b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.e;
                AndroidUtilities.addToClipboard(str);
                if (i12 == 1) {
                    org.telegram.messenger.ok.o(R.string.PhoneCopied, new yc(e3Var.getContainer(), d6Var2));
                    return;
                } else {
                    new yc(e3Var.getContainer(), d6Var2).k(false).j();
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i13 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.e;
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, qyVar)) {
                    launchActivity.q0(new org.telegram.ui.wn(bundle), true, false);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.zb0 zb0Var = (org.telegram.ui.zb0) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i14 = this.b;
                String str2 = (String) this.e;
                zb0Var.a();
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
                        notificationsCustomSettingsActivity.G = true;
                        notificationsCustomSettingsActivity.l0(false);
                        zb0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            zb0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            zb0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            zb0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            zb0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            zb0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            zb0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            zb0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            zb0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            zb0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            zb0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            zb0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            zb0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            zb0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        zb0Var.o("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                ArrayList arrayList4 = arrayList;
                arrayList2 = null;
                arrayList3 = arrayList4;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i14, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.l0(false);
                zb0Var.n(notificationsCustomSettingsActivity2, false);
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
                ArrayList arrayList5 = notificationsCustomSettingsActivity3.I;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.ea)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i15 >= 0 && i15 < arrayList5.size()) {
                    ((org.telegram.ui.hk0) arrayList5.get(i15)).f = string;
                }
                ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i16 = this.b;
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
                ConnectionsManager.getInstance(i16).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 7:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str4 = (String) this.e;
                int i17 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.da(passkeysActivity, passkey, str4, i17, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                int i18 = this.b;
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
                            la.h hVar = new la.h(23);
                            Bitmap bitmap2 = bitmapHolder.bitmap;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            hVar.d = bitmap2;
                            a3.l lVar = (a3.l) hVar.b;
                            lVar.a = width;
                            lVar.b = height;
                            lVar.c = i18;
                            if (cVar.Z0(hVar).size() == 0) {
                                z10 = false;
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.da0(photoViewer, str5, z10, 5));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.jf0(photoViewer, bitmapHolder, str5, 17));
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
                        r2.U0();
                    }
                    throw th2;
                }
            case 9:
                org.telegram.ui.ys0 ys0Var = (org.telegram.ui.ys0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.i iVar = (a0.i) this.e;
                yc.v(ys0Var.d1.y, null, frameLayout, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 10:
                e5.f0(this.b, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.m2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 11:
                de1 de1Var = (de1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i19 = this.b;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.e;
                de1Var.getClass();
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
                de1Var.G.messageOwner.media = tL_messageMediaToDo;
                wnVar.getSendMessagesHelper().editMessage(de1Var.G, null, null, null, null, null, null, false, false, null);
                wnVar.Wc(false);
                de1Var.c(false);
                return;
            case 12:
                ke1 ke1Var = (ke1) this.c;
                int i22 = this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                le1 le1Var = ke1Var.h;
                ArrayList arrayList8 = ke1Var.d;
                ArrayList arrayList9 = ke1Var.c;
                if (i22 != ke1Var.f) {
                    return;
                }
                arrayList9.clear();
                arrayList8.clear();
                if (arrayList6 != null) {
                    arrayList9.addAll(arrayList6);
                    arrayList8.addAll(arrayList7);
                }
                ke1Var.l();
                if (arrayList9.isEmpty()) {
                    le1Var.r.setVisibility(0);
                    return;
                } else {
                    le1Var.r.setVisibility(8);
                    return;
                }
            case 13:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) this.c;
                int i23 = this.b;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
                ai.da daVar = (ai.da) this.e;
                SendMessagesHelper.getInstance(b1Var2.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(b1Var2.M).getCurrentUser(), b1Var2.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", "sent");
                    org.telegram.ui.web.b1.x(i23, y0Var, daVar, "phone_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 14:
                pg.n1 n1Var = (pg.n1) this.c;
                pg.i1 i1Var = (pg.i1) this.d;
                int i24 = this.b;
                ArrayList arrayList10 = (ArrayList) this.e;
                ArrayList arrayList11 = n1Var.c;
                boolean z12 = i1Var != null;
                n1Var.d = z12;
                if (!z12 || i24 < 0 || i24 >= arrayList11.size()) {
                    n1Var.i = arrayList10;
                } else {
                    n1Var.a++;
                    ((pg.m1) arrayList11.get(i24)).c++;
                    n1Var.g.edit().putInt(hg.c.h(i24, "score"), ((pg.m1) arrayList11.get(i24)).c).putInt("scoreall", n1Var.a).apply();
                    n1Var.i = null;
                }
                n1Var.e.run(i1Var);
                return;
            case 15:
                qg.n2 n2Var = (qg.n2) this.c;
                n2Var.m((Bitmap) this.e, this.b, n2Var.T, n2Var.U, (org.telegram.ui.gr0) this.d);
                return;
            case 16:
                da.b bVar2 = (da.b) this.c;
                l5.i iVar2 = (l5.i) this.d;
                int i25 = this.b;
                Runnable runnable = (Runnable) this.e;
                t5.c cVar2 = (t5.c) bVar2.f;
                try {
                    try {
                        s5.d dVar = (s5.d) bVar2.c;
                        Objects.requireNonNull(dVar);
                        ((s5.h) cVar2).f(new r5.d(dVar, 0));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) bVar2.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((s5.h) cVar2).f(new gg.d2(bVar2, iVar2, i25, 18));
                        } else {
                            bVar2.e(iVar2, i25);
                        }
                    } catch (Throwable th3) {
                        runnable.run();
                        throw th3;
                    }
                } catch (t5.a unused3) {
                    ((la.h) bVar2.d).V(iVar2, i25 + 1, false);
                }
                runnable.run();
                return;
            case 17:
                rg.j0.R((rg.j0) this.c, (ArrayList) this.d, this.b, (TLRPC.TL_messages_inactiveChats) this.e);
                return;
            default:
                int i26 = this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.e;
                yh.x3 x3Var = new yh.x3(context, i26, UserConfig.getInstance(i26).getClientUserId(), d6Var3, null);
                x3Var.j2(savedStarGift, null);
                x3Var.show();
                return;
        }
    }

    public /* synthetic */ f21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ f21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ f21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ f21(qg.n2 n2Var, Bitmap bitmap, int i10, org.telegram.ui.gr0 gr0Var) {
        this.a = 15;
        this.c = n2Var;
        this.e = bitmap;
        this.b = i10;
        this.d = gr0Var;
    }
}
