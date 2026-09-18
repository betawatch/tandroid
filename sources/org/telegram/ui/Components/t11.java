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
import org.telegram.ui.me1;
import org.telegram.ui.te1;
import org.telegram.ui.ue1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t11(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [org.telegram.ui.ut] */
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
        int i11 = 17;
        t8.c cVar = null;
        ArrayList arrayList3 = null;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                v11 v11Var = (v11) this.c;
                lp lpVar = (lp) this.d;
                int i12 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = lpVar.b;
                if (drawable instanceof cc0) {
                    cc0 cc0Var = (cc0) drawable;
                    cc0Var.t(v11.e(bitmap), i12);
                    cc0Var.u(v11Var.L);
                    v11Var.invalidate();
                    return;
                }
                return;
            case 1:
                ?? r72 = (org.telegram.ui.ut) this.c;
                ml0 ml0Var = (ml0) this.d;
                int i13 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                if (r72.j == null) {
                    return;
                }
                ml0Var.setOnItemClickListener((al0) null);
                ml0Var.requestDisallowInterceptTouchEvent(true);
                r72.j = null;
                r72.w(AndroidUtilities.findActivity(ml0Var.getContext()));
                r72.i = false;
                View view = r72.h;
                if (view instanceof org.telegram.ui.Cells.f8) {
                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
                    TLRPC.Document sticker = f8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = f8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f8Var.getSticker(), null, Integer.valueOf(r72.r));
                    org.telegram.ui.st stVar = r72.l;
                    r72.t(sticker, stickerPath, findAnimatedEmojiEmoticon, stVar != null ? stVar.F(false) : null, null, i13, f8Var.y, f8Var.getParentObject(), r72.c0, 0);
                    f8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                    TLRPC.Document sticker2 = d8Var.getSticker();
                    org.telegram.ui.st stVar2 = r72.l;
                    r72.t(sticker2, null, null, stVar2 != null ? stVar2.F(false) : null, null, i13, false, d8Var.getParentObject(), f6Var, 0);
                    d8Var.setScaled(true);
                    r72.i = d8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    TLRPC.Document document2 = e2Var.getDocument();
                    org.telegram.ui.st stVar3 = r72.l;
                    r72.t(document2, null, null, stVar3 != null ? stVar3.F(true) : null, e2Var.getBotInlineResult(), i13, false, e2Var.getBotInlineResult() != null ? e2Var.getInlineBot() : e2Var.getParentObject(), f6Var, 0);
                    if (i13 != 1 || r72.m) {
                        e2Var.setScaled(true);
                    }
                } else if (view instanceof jv) {
                    TLRPC.Document document3 = ((jv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r72.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r72.r)), null, null, i13, false, null, f6Var, 0);
                    }
                } else if (view instanceof ty) {
                    x5 span = ((ty) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = o5.f(r72.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r72.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r72.r)), null, null, i13, false, null, f6Var, 0);
                    }
                } else {
                    if (!(view instanceof ny0)) {
                        return;
                    }
                    Drawable drawable2 = ((ny0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof o5 ? ((o5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r72.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r72.r)), null, null, i13, false, null, f6Var, 0);
                    }
                }
                try {
                    r72.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.st stVar4 = r72.l;
                if (stVar4 != null) {
                    stVar4.t();
                    return;
                }
                return;
            case 2:
                String str = (String) this.c;
                int i14 = this.b;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.d;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.e;
                AndroidUtilities.addToClipboard(str);
                if (i14 == 1) {
                    org.telegram.messenger.wl.o(R.string.PhoneCopied, new vc(g3Var.getContainer(), f6Var2));
                    return;
                } else {
                    new vc(g3Var.getContainer(), f6Var2).k(false).j();
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
                    launchActivity.q0(new org.telegram.ui.bo(bundle), true, false);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.hc0 hc0Var = (org.telegram.ui.hc0) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i16 = this.b;
                String str2 = (String) this.e;
                hc0Var.a();
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
                        hc0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            hc0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            hc0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            hc0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            hc0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            hc0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            hc0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            hc0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            hc0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            hc0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            hc0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            hc0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            hc0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            hc0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        hc0Var.o("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i16, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.l0(false);
                hc0Var.n(notificationsCustomSettingsActivity2, false);
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
                if (!(view2 instanceof org.telegram.ui.Cells.ea)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i17 >= 0 && i17 < arrayList4.size()) {
                    ((org.telegram.ui.pk0) arrayList4.get(i17)).f = string;
                }
                ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i18 = this.b;
                org.telegram.ui.kl0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (d1Var != null) {
                    boolean z11 = org.telegram.ui.web.d1.P0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    d1Var.z("oauth_result_failed", jSONObject);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.fa(passkeysActivity, passkey, str4, i19, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                int i20 = this.b;
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
                            lVar.c = i20;
                            if (cVar.Z0(iVar).size() == 0) {
                                z10 = false;
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.dm0(photoViewer, str5, z10, i10));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.rf0(photoViewer, bitmapHolder, str5, i11));
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
                        r4.U0();
                    }
                    throw th2;
                }
            case 9:
                org.telegram.ui.it0 it0Var = (org.telegram.ui.it0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.i iVar2 = (a0.i) this.e;
                vc.v(it0Var.d1.y, null, frameLayout, iVar2.m(), iVar2.m() == 1 ? ((TLRPC.Dialog) iVar2.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 10:
                c5.f0(this.b, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 11:
                me1 me1Var = (me1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i21 = this.b;
                org.telegram.ui.bo boVar = (org.telegram.ui.bo) this.e;
                me1Var.getClass();
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
                me1Var.G.messageOwner.media = tL_messageMediaToDo;
                boVar.getSendMessagesHelper().editMessage(me1Var.G, null, null, null, null, null, null, false, false, null);
                boVar.Wc(false);
                me1Var.c(false);
                return;
            case 12:
                te1 te1Var = (te1) this.c;
                int i24 = this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                ue1 ue1Var = te1Var.h;
                ArrayList arrayList7 = te1Var.d;
                ArrayList arrayList8 = te1Var.c;
                if (i24 != te1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                te1Var.l();
                if (arrayList8.isEmpty()) {
                    ue1Var.r.setVisibility(0);
                    return;
                } else {
                    ue1Var.r.setVisibility(8);
                    return;
                }
            case 13:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) this.c;
                int i25 = this.b;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                ai.da daVar = (ai.da) this.e;
                SendMessagesHelper.getInstance(d1Var2.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(d1Var2.M).getCurrentUser(), d1Var2.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", "sent");
                    org.telegram.ui.web.d1.x(i25, z0Var, daVar, "phone_requested", jSONObject2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 14:
                pg.k1 k1Var = (pg.k1) this.c;
                pg.f1 f1Var = (pg.f1) this.d;
                int i26 = this.b;
                ArrayList arrayList9 = (ArrayList) this.e;
                ArrayList arrayList10 = k1Var.c;
                boolean z12 = f1Var != null;
                k1Var.d = z12;
                if (!z12 || i26 < 0 || i26 >= arrayList10.size()) {
                    k1Var.i = arrayList9;
                } else {
                    k1Var.a++;
                    ((pg.j1) arrayList10.get(i26)).c++;
                    k1Var.g.edit().putInt(hg.k0.i(i26, "score"), ((pg.j1) arrayList10.get(i26)).c).putInt("scoreall", k1Var.a).apply();
                    k1Var.i = null;
                }
                k1Var.e.run(f1Var);
                return;
            case 15:
                qg.p2 p2Var = (qg.p2) this.c;
                p2Var.m((Bitmap) this.e, this.b, p2Var.T, p2Var.U, (org.telegram.ui.qr0) this.d);
                return;
            case 16:
                da.b bVar2 = (da.b) this.c;
                l5.i iVar3 = (l5.i) this.d;
                int i27 = this.b;
                Runnable runnable = (Runnable) this.e;
                t5.c cVar2 = (t5.c) bVar2.f;
                try {
                    try {
                        s5.d dVar = (s5.d) bVar2.c;
                        Objects.requireNonNull(dVar);
                        ((s5.g) cVar2).f(new r5.d(dVar, 0));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) bVar2.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((s5.g) cVar2).f(new gg.d2(bVar2, iVar3, i27, i11));
                        } else {
                            bVar2.e(iVar3, i27);
                        }
                    } catch (Throwable th3) {
                        runnable.run();
                        throw th3;
                    }
                } catch (t5.a unused3) {
                    ((lf.i) bVar2.d).V(iVar3, i27 + 1, false);
                }
                runnable.run();
                return;
            case 17:
                rg.j0.R((rg.j0) this.c, (ArrayList) this.d, this.b, (TLRPC.TL_messages_inactiveChats) this.e);
                return;
            default:
                int i28 = this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.e;
                yh.a4 a4Var = new yh.a4(context, i28, UserConfig.getInstance(i28).getClientUserId(), f6Var3, null);
                a4Var.j2(savedStarGift, null);
                a4Var.show();
                return;
        }
    }

    public /* synthetic */ t11(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ t11(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ t11(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ t11(qg.p2 p2Var, Bitmap bitmap, int i10, org.telegram.ui.qr0 qr0Var) {
        this.a = 15;
        this.c = p2Var;
        this.e = bitmap;
        this.b = i10;
        this.d = qr0Var;
    }
}
