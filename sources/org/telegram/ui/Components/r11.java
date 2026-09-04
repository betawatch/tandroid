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
import org.telegram.ui.le1;
import org.telegram.ui.se1;
import org.telegram.ui.te1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
    /* JADX WARN: Removed duplicated region for block: B:156:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [org.telegram.ui.st] */
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
                t11 t11Var = (t11) this.c;
                kp kpVar = (kp) this.d;
                int i12 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = kpVar.b;
                if (drawable instanceof dc0) {
                    dc0 dc0Var = (dc0) drawable;
                    dc0Var.t(t11.e(bitmap), i12);
                    dc0Var.u(t11Var.L);
                    t11Var.invalidate();
                    return;
                }
                return;
            case 1:
                ?? r82 = (org.telegram.ui.st) this.c;
                ll0 ll0Var = (ll0) this.d;
                int i13 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                if (r82.j == null) {
                    return;
                }
                ll0Var.setOnItemClickListener((zk0) null);
                ll0Var.requestDisallowInterceptTouchEvent(true);
                r82.j = null;
                r82.w(AndroidUtilities.findActivity(ll0Var.getContext()));
                r82.i = false;
                View view = r82.h;
                if (view instanceof org.telegram.ui.Cells.f8) {
                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
                    TLRPC.Document sticker = f8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = f8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f8Var.getSticker(), null, Integer.valueOf(r82.r));
                    org.telegram.ui.qt qtVar = r82.l;
                    r82.t(sticker, stickerPath, findAnimatedEmojiEmoticon, qtVar != null ? qtVar.F(false) : null, null, i13, f8Var.y, f8Var.getParentObject(), r82.c0, 0);
                    f8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                    TLRPC.Document sticker2 = d8Var.getSticker();
                    org.telegram.ui.qt qtVar2 = r82.l;
                    r82.t(sticker2, null, null, qtVar2 != null ? qtVar2.F(false) : null, null, i13, false, d8Var.getParentObject(), f6Var, 0);
                    d8Var.setScaled(true);
                    r82.i = d8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    TLRPC.Document document2 = e2Var.getDocument();
                    org.telegram.ui.qt qtVar3 = r82.l;
                    r82.t(document2, null, null, qtVar3 != null ? qtVar3.F(true) : null, e2Var.getBotInlineResult(), i13, false, e2Var.getBotInlineResult() != null ? e2Var.getInlineBot() : e2Var.getParentObject(), f6Var, 0);
                    if (i13 != 1 || r82.m) {
                        e2Var.setScaled(true);
                    }
                } else if (view instanceof iv) {
                    TLRPC.Document document3 = ((iv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r82.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r82.r)), null, null, i13, false, null, f6Var, 0);
                    }
                } else if (view instanceof ty) {
                    z5 span = ((ty) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = q5.f(r82.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r82.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r82.r)), null, null, i13, false, null, f6Var, 0);
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
                        r82.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r82.r)), null, null, i13, false, null, f6Var, 0);
                    }
                }
                try {
                    r82.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.qt qtVar4 = r82.l;
                if (qtVar4 != null) {
                    qtVar4.s();
                    return;
                }
                return;
            case 2:
                String str = (String) this.c;
                int i14 = this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.e;
                AndroidUtilities.addToClipboard(str);
                if (i14 == 1) {
                    org.telegram.messenger.wl.o(R.string.PhoneCopied, new yc(f3Var.getContainer(), f6Var2));
                    return;
                } else {
                    new yc(f3Var.getContainer(), f6Var2).k(false).j();
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i15 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.e;
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, uyVar)) {
                    launchActivity.q0(new org.telegram.ui.co(bundle), true, false);
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
                if (!(view2 instanceof org.telegram.ui.Cells.ea)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i17 >= 0 && i17 < arrayList4.size()) {
                    ((org.telegram.ui.qk0) arrayList4.get(i17)).f = string;
                }
                ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i18 = this.b;
                org.telegram.ui.ll0.a = null;
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.da(passkeysActivity, passkey, str4, i19, 6));
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
                            m2.t tVar = new m2.t(20);
                            Bitmap bitmap2 = bitmapHolder.bitmap;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            tVar.d = bitmap2;
                            a3.k kVar = (a3.k) tVar.b;
                            kVar.a = width;
                            kVar.b = height;
                            kVar.c = i20;
                            if (cVar.Z0(tVar).size() == 0) {
                                z10 = false;
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.dm0(photoViewer, str5, z10, i10));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.pf0(photoViewer, bitmapHolder, str5, i11));
                        }
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            r5.U0();
                        }
                        throw th2;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                yc.v(ft0Var.d1.y, null, frameLayout, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 10:
                e5.f0(this.b, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 11:
                le1 le1Var = (le1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i21 = this.b;
                org.telegram.ui.co coVar = (org.telegram.ui.co) this.e;
                le1Var.getClass();
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
                le1Var.G.messageOwner.media = tL_messageMediaToDo;
                coVar.getSendMessagesHelper().editMessage(le1Var.G, null, null, null, null, null, null, false, false, null);
                coVar.Wc(false);
                le1Var.c(false);
                return;
            case 12:
                se1 se1Var = (se1) this.c;
                int i24 = this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                te1 te1Var = se1Var.h;
                ArrayList arrayList7 = se1Var.d;
                ArrayList arrayList8 = se1Var.c;
                if (i24 != se1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                se1Var.l();
                if (arrayList8.isEmpty()) {
                    te1Var.r.setVisibility(0);
                    return;
                } else {
                    te1Var.r.setVisibility(8);
                    return;
                }
            case 13:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) this.c;
                int i25 = this.b;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                bi.k9 k9Var = (bi.k9) this.e;
                SendMessagesHelper.getInstance(d1Var2.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(d1Var2.M).getCurrentUser(), d1Var2.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", "sent");
                    org.telegram.ui.web.d1.x(i25, z0Var, k9Var, "phone_requested", jSONObject2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 14:
                qg.k1 k1Var = (qg.k1) this.c;
                qg.f1 f1Var = (qg.f1) this.d;
                int i26 = this.b;
                ArrayList arrayList9 = (ArrayList) this.e;
                ArrayList arrayList10 = k1Var.c;
                boolean z12 = f1Var != null;
                k1Var.d = z12;
                if (!z12 || i26 < 0 || i26 >= arrayList10.size()) {
                    k1Var.i = arrayList9;
                } else {
                    k1Var.a++;
                    ((qg.j1) arrayList10.get(i26)).c++;
                    k1Var.g.edit().putInt(i2.g.i(i26, "score"), ((qg.j1) arrayList10.get(i26)).c).putInt("scoreall", k1Var.a).apply();
                    k1Var.i = null;
                }
                k1Var.e.run(f1Var);
                return;
            case 15:
                da.b bVar2 = (da.b) this.c;
                l5.i iVar2 = (l5.i) this.d;
                int i27 = this.b;
                Runnable runnable = (Runnable) this.e;
                t5.c cVar2 = (t5.c) bVar2.f;
                try {
                    try {
                        s5.d dVar = (s5.d) bVar2.c;
                        Objects.requireNonNull(dVar);
                        ((s5.g) cVar2).f(new ji.k5(dVar, 20));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) bVar2.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((s5.g) cVar2).f(new hg.c2(bVar2, iVar2, i27, i11));
                        } else {
                            bVar2.e(iVar2, i27);
                        }
                    } catch (t5.a unused3) {
                        ((m2.t) bVar2.d).O(iVar2, i27 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th3) {
                    runnable.run();
                    throw th3;
                }
            case 16:
                rg.o2 o2Var = (rg.o2) this.c;
                o2Var.m((Bitmap) this.e, this.b, o2Var.T, o2Var.U, (org.telegram.ui.or0) this.d);
                return;
            case 17:
                sg.k0.R((sg.k0) this.c, (ArrayList) this.d, this.b, (TLRPC.TL_messages_inactiveChats) this.e);
                return;
            default:
                int i28 = this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.e;
                zh.w3 w3Var = new zh.w3(context, i28, UserConfig.getInstance(i28).getClientUserId(), f6Var3, null);
                w3Var.j2(savedStarGift, null);
                w3Var.show();
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

    public /* synthetic */ r11(rg.o2 o2Var, Bitmap bitmap, int i10, org.telegram.ui.or0 or0Var) {
        this.a = 16;
        this.c = o2Var;
        this.e = bitmap;
        this.b = i10;
        this.d = or0Var;
    }
}
