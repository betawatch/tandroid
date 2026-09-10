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
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pe1;
import org.telegram.ui.we1;
import org.telegram.ui.xe1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class g21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [org.telegram.ui.tt] */
    /* JADX WARN: Type inference failed for: r25v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        int i10;
        int i11 = 17;
        t8.c cVar = null;
        ArrayList arrayList3 = null;
        switch (this.a) {
            case 0:
                i21 i21Var = (i21) this.c;
                rp rpVar = (rp) this.d;
                int i12 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = rpVar.b;
                if (drawable instanceof lc0) {
                    lc0 lc0Var = (lc0) drawable;
                    lc0Var.t(i21.e(bitmap), i12);
                    lc0Var.u(i21Var.L);
                    i21Var.invalidate();
                    return;
                }
                return;
            case 1:
                ?? r02 = (org.telegram.ui.tt) this.c;
                vl0 vl0Var = (vl0) this.d;
                int i13 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                if (r02.j == null) {
                    return;
                }
                vl0Var.setOnItemClickListener((jl0) null);
                vl0Var.requestDisallowInterceptTouchEvent(true);
                r02.j = null;
                r02.w(AndroidUtilities.findActivity(vl0Var.getContext()));
                r02.i = false;
                View view = r02.h;
                if (view instanceof org.telegram.ui.Cells.g8) {
                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
                    TLRPC.Document sticker = g8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = g8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(g8Var.getSticker(), null, Integer.valueOf(r02.r));
                    org.telegram.ui.rt rtVar = r02.l;
                    r02.t(sticker, stickerPath, findAnimatedEmojiEmoticon, rtVar != null ? rtVar.E(false) : null, null, i13, g8Var.y, g8Var.getParentObject(), r02.c0, 0);
                    g8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.e8) {
                    org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
                    TLRPC.Document sticker2 = e8Var.getSticker();
                    org.telegram.ui.rt rtVar2 = r02.l;
                    r02.t(sticker2, null, null, rtVar2 != null ? rtVar2.E(false) : null, null, i13, false, e8Var.getParentObject(), f6Var, 0);
                    e8Var.setScaled(true);
                    r02.i = e8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    TLRPC.Document document2 = e2Var.getDocument();
                    org.telegram.ui.rt rtVar3 = r02.l;
                    r02.t(document2, null, null, rtVar3 != null ? rtVar3.E(true) : null, e2Var.getBotInlineResult(), i13, false, e2Var.getBotInlineResult() != null ? e2Var.getInlineBot() : e2Var.getParentObject(), f6Var, 0);
                    if (i13 != 1 || r02.m) {
                        e2Var.setScaled(true);
                    }
                } else if (view instanceof nv) {
                    TLRPC.Document document3 = ((nv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r02.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r02.r)), null, null, i13, false, null, f6Var, 0);
                    }
                } else if (view instanceof az) {
                    y5 span = ((az) view).getSpan();
                    if (span != null) {
                        document = span.document;
                        if (document == null) {
                            document = p5.f(r02.r, span.getDocumentId());
                        }
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r02.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r02.r)), null, null, i13, false, null, f6Var, 0);
                    }
                } else {
                    if (!(view instanceof yy0)) {
                        return;
                    }
                    Drawable drawable2 = ((yy0) view).b;
                    TLRPC.Document document4 = drawable2 instanceof p5 ? ((p5) drawable2).e : null;
                    if (document4 == null) {
                        return;
                    } else {
                        r02.t(document4, null, MessageObject.findAnimatedEmojiEmoticon(document4, null, Integer.valueOf(r02.r)), null, null, i13, false, null, f6Var, 0);
                    }
                }
                try {
                    r02.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.rt rtVar4 = r02.l;
                if (rtVar4 != null) {
                    rtVar4.s();
                    return;
                }
                return;
            case 2:
                String str = (String) this.c;
                int i14 = this.b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.d;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.e;
                AndroidUtilities.addToClipboard(str);
                if (i14 == 1) {
                    org.telegram.messenger.em.o(R.string.PhoneCopied, new wc(h3Var.getContainer(), f6Var2));
                    return;
                } else {
                    new wc(h3Var.getContainer(), f6Var2).k(false).j();
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i15 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.e;
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, wyVar)) {
                    launchActivity.q0(new org.telegram.ui.eo(bundle), true, false);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.fc0 fc0Var = (org.telegram.ui.fc0) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i16 = this.b;
                String str2 = (String) this.e;
                fc0Var.a();
                if (i16 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i16 != 0) {
                        if (i16 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i16 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i16, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.G = true;
                        notificationsCustomSettingsActivity.l0(false);
                        fc0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            fc0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            fc0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            fc0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            fc0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            fc0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            fc0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            fc0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            fc0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            fc0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            fc0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            fc0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            fc0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            fc0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        fc0Var.o("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i16, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.l0(false);
                fc0Var.n(notificationsCustomSettingsActivity2, false);
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
                int i17 = this.b;
                ArrayList arrayList4 = notificationsCustomSettingsActivity3.I;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.ga)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i17 >= 0 && i17 < arrayList4.size()) {
                    ((org.telegram.ui.pk0) arrayList4.get(i17)).f = string;
                }
                ((org.telegram.ui.Cells.ga) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i18 = this.b;
                org.telegram.ui.kl0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (c1Var != null) {
                    boolean z10 = org.telegram.ui.web.c1.P0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    c1Var.y("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i18).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 7:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str4 = (String) this.e;
                int i19 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ea(passkeysActivity, passkey, str4, i19, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                int i20 = this.b;
                String str5 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.T8;
                try {
                    try {
                        t8.b bVar = new t8.b(ApplicationLoader.applicationContext);
                        bVar.c(0);
                        bVar.b(0);
                        bVar.c = false;
                        cVar = bVar.a();
                        if (cVar.c.k()) {
                            m.e3 e3Var = new m.e3(20);
                            Bitmap bitmap2 = bitmapHolder.bitmap;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            e3Var.d = bitmap2;
                            a3.l lVar = (a3.l) e3Var.b;
                            lVar.a = width;
                            lVar.b = height;
                            lVar.c = i20;
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.cm0(photoViewer, str5, cVar.Z0(e3Var).size() != 0, 4));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.pf0(photoViewer, bitmapHolder, str5, i11));
                        }
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            r8.U0();
                        }
                        throw th2;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    if (0 == 0) {
                        return;
                    }
                }
                cVar.U0();
                return;
            case 9:
                org.telegram.ui.ft0 ft0Var = (org.telegram.ui.ft0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.i iVar = (a0.i) this.e;
                wc.v(ft0Var.d1.y, null, frameLayout, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 10:
                d5.f0(this.b, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.p2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 11:
                pe1 pe1Var = (pe1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i21 = this.b;
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.e;
                pe1Var.getClass();
                int i22 = 0;
                while (i22 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i22).id == i21) {
                        tL_messageMediaToDo.todo.list.remove(i22);
                        i22--;
                    }
                    i22++;
                }
                int i23 = 0;
                while (i23 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i23).id == i21) {
                        tL_messageMediaToDo.completions.remove(i23);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i23--;
                    }
                    i23++;
                }
                pe1Var.G.messageOwner.media = tL_messageMediaToDo;
                eoVar.getSendMessagesHelper().editMessage(pe1Var.G, null, null, null, null, null, null, false, false, null);
                eoVar.Wc(false);
                pe1Var.c(false);
                return;
            case 12:
                we1 we1Var = (we1) this.c;
                int i24 = this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                xe1 xe1Var = we1Var.h;
                ArrayList arrayList7 = we1Var.d;
                ArrayList arrayList8 = we1Var.c;
                if (i24 != we1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                we1Var.l();
                if (arrayList8.isEmpty()) {
                    xe1Var.r.setVisibility(0);
                    return;
                } else {
                    xe1Var.r.setVisibility(8);
                    return;
                }
            case 13:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) this.c;
                int i25 = this.b;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.e;
                SendMessagesHelper.getInstance(c1Var2.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(c1Var2.M).getCurrentUser(), c1Var2.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", "sent");
                    org.telegram.ui.web.c1.x(i25, y0Var, a1Var, "phone_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 14:
                pg.n2 n2Var = (pg.n2) this.c;
                n2Var.m((Bitmap) this.e, this.b, n2Var.T, n2Var.U, (org.telegram.ui.or0) this.d);
                return;
            case 15:
                qg.k0.R((qg.k0) this.c, (ArrayList) this.d, this.b, (TLRPC.TL_messages_inactiveChats) this.e);
                return;
            case 16:
                da.b bVar2 = (da.b) this.c;
                l5.i iVar2 = (l5.i) this.d;
                int i26 = this.b;
                Runnable runnable = (Runnable) this.e;
                t5.c cVar2 = (t5.c) bVar2.f;
                try {
                    try {
                        s5.d dVar = (s5.d) bVar2.c;
                        Objects.requireNonNull(dVar);
                        ((s5.g) cVar2).f(new org.telegram.tgnet.j(dVar, 20));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) bVar2.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((s5.g) cVar2).f(new fg.e2(bVar2, iVar2, i26, i11));
                        } else {
                            bVar2.e(iVar2, i26);
                        }
                    } catch (t5.a unused3) {
                        ((m.e3) bVar2.d).U(iVar2, i26 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th3) {
                    runnable.run();
                    throw th3;
                }
            case 17:
                int i27 = this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.e;
                xh.x3 x3Var = new xh.x3(context, i27, UserConfig.getInstance(i27).getClientUserId(), f6Var3, null);
                x3Var.j2(savedStarGift, null);
                x3Var.show();
                return;
            default:
                zh.a5 a5Var = (zh.a5) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) this.e;
                int i28 = this.b;
                AbstractSet abstractSet = a5Var.k;
                int i29 = a5Var.f;
                AbstractSet abstractSet2 = a5Var.l;
                a5Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i30 = a5Var.e;
                sb2.append(i30);
                sb2.append("{");
                long j3 = a5Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(zh.i5.a(arrayList9));
                hc.b.v("}", sb2);
                ArrayList arrayList10 = a5Var.g;
                arrayList10.clear();
                arrayList10.addAll(tL_stories_stories.pinned_to_top);
                int i31 = a5Var.c;
                MessagesController.getInstance(i31).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i31).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i31).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                a5Var.u = false;
                a5Var.s = tL_stories_stories.count;
                for (int i32 = 0; i32 < arrayList9.size(); i32++) {
                    a5Var.t((MessageObject) arrayList9.get(i32), false);
                }
                boolean z11 = abstractSet2.size() >= a5Var.s;
                a5Var.r = z11;
                if (z11) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            a5Var.u(intValue, false);
                        }
                    }
                } else if (i29 <= 0) {
                    if (i28 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList11 = new ArrayList(abstractSet2);
                            for (int i33 = 0; i33 < arrayList11.size(); i33++) {
                                Integer num2 = (Integer) arrayList11.get(i33);
                                int intValue2 = num2.intValue();
                                if (!arrayList10.contains(num2)) {
                                    i10 = intValue2;
                                    i28 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i28 = i10;
                    }
                    int n10 = a5Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i28 && intValue3 <= n10) {
                            it2.remove();
                            a5Var.u(intValue3, false);
                        }
                    }
                }
                a5Var.d(true);
                if (a5Var.r) {
                    if (zh.a5.B == null) {
                        zh.a5.B = new HashMap();
                    }
                    zh.a5.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i31), Integer.valueOf(i30), Long.valueOf(j3), Integer.valueOf(i29))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    a5Var.w();
                }
                a5Var.x();
                return;
        }
    }

    public /* synthetic */ g21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ g21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ g21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ g21(pg.n2 n2Var, Bitmap bitmap, int i10, org.telegram.ui.or0 or0Var) {
        this.a = 14;
        this.c = n2Var;
        this.e = bitmap;
        this.b = i10;
        this.d = or0Var;
    }
}
