package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fd1;
import org.telegram.ui.gd1;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bz0(int i10, int i11, KeyEvent.Callback callback, Object obj, Object obj2) {
        this.a = i11;
        this.d = callback;
        this.b = i10;
        this.e = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [org.telegram.ui.et] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        JSONArray optJSONArray;
        int i11 = 18;
        int i12 = 3;
        t8.b bVar = null;
        ArrayList arrayList3 = null;
        switch (this.a) {
            case 0:
                hz0 hz0Var = (hz0) this.d;
                int i13 = this.b;
                String str = (String) this.e;
                ArrayList arrayList4 = (ArrayList) this.c;
                if (i13 == hz0Var.I) {
                    hz0Var.H = str;
                    hz0Var.G = 2;
                    arrayList4.remove(arrayList4.size() - 1);
                    if (arrayList4.isEmpty()) {
                        hz0Var.x = true;
                        hz0Var.f();
                        return;
                    }
                    hz0Var.x = false;
                    hz0Var.v = false;
                    hz0Var.c();
                    ah.x xVar = hz0Var.d;
                    if (xVar != null) {
                        xVar.setVisibility(0);
                        hz0Var.d.invalidate();
                    }
                    hz0Var.w = arrayList4;
                    ez0 ez0Var = hz0Var.f;
                    if (ez0Var != null) {
                        ez0Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i21 i21Var = (i21) this.d;
                int i14 = this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = (ArrayList) this.e;
                ThemeEditorView.EditorAlert editorAlert = i21Var.r;
                a21 a21Var = editorAlert.c;
                if (i14 != i21Var.d) {
                    return;
                }
                i21 i21Var2 = editorAlert.r;
                if (a21Var.getAdapter() != i21Var2) {
                    editorAlert.F = ThemeEditorView.EditorAlert.K(editorAlert);
                    a21Var.setAdapter(i21Var2);
                    i21Var2.l();
                }
                boolean z10 = !i21Var.e.isEmpty() && arrayList5.isEmpty();
                r7 = i21Var.e.isEmpty() && arrayList5.isEmpty();
                if (z10) {
                    editorAlert.F = ThemeEditorView.EditorAlert.K(editorAlert);
                }
                i21Var.e = arrayList5;
                i21Var.f = arrayList6;
                i21Var.l();
                if (!r7 && !z10 && (i10 = editorAlert.F) > 0) {
                    editorAlert.h.h1(0, -i10);
                    editorAlert.F = -1000;
                }
                editorAlert.e.c();
                return;
            case 2:
                q21 q21Var = (q21) this.d;
                vp vpVar = (vp) this.e;
                int i15 = this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable drawable = vpVar.b;
                if (drawable instanceof wc0) {
                    wc0 wc0Var = (wc0) drawable;
                    wc0Var.s(q21.e(bitmap), i15);
                    wc0Var.t(q21Var.L);
                    q21Var.invalidate();
                    return;
                }
                return;
            case 3:
                ?? r92 = (org.telegram.ui.et) this.d;
                im0 im0Var = (im0) this.e;
                int i16 = this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                if (r92.j == null) {
                    return;
                }
                im0Var.setOnItemClickListener((wl0) null);
                im0Var.requestDisallowInterceptTouchEvent(true);
                r92.j = null;
                r92.w(AndroidUtilities.findActivity(im0Var.getContext()));
                r92.i = false;
                View view = r92.h;
                if (view instanceof org.telegram.ui.Cells.e8) {
                    org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
                    TLRPC.Document sticker = e8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = e8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(e8Var.getSticker(), null, Integer.valueOf(r92.r));
                    org.telegram.ui.ct ctVar = r92.l;
                    r92.t(sticker, stickerPath, findAnimatedEmojiEmoticon, ctVar != null ? ctVar.G(false) : null, null, i16, e8Var.y, e8Var.getParentObject(), r92.c0, 0);
                    e8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) view;
                    TLRPC.Document sticker2 = c8Var.getSticker();
                    org.telegram.ui.ct ctVar2 = r92.l;
                    r92.t(sticker2, null, null, ctVar2 != null ? ctVar2.G(false) : null, null, i16, false, c8Var.getParentObject(), d6Var, 0);
                    c8Var.setScaled(true);
                    r92.i = c8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    TLRPC.Document document2 = f2Var.getDocument();
                    org.telegram.ui.ct ctVar3 = r92.l;
                    r92.t(document2, null, null, ctVar3 != null ? ctVar3.G(true) : null, f2Var.getBotInlineResult(), i16, false, f2Var.getBotInlineResult() != null ? f2Var.getInlineBot() : f2Var.getParentObject(), d6Var, 0);
                    if (i16 != 1 || r92.m) {
                        f2Var.setScaled(true);
                    }
                } else if (view instanceof rv) {
                    TLRPC.Document document3 = ((rv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r92.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r92.r)), null, null, i16, false, null, d6Var, 0);
                    }
                } else if (view instanceof cz) {
                    a6 span = ((cz) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = r5.f(r92.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r92.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r92.r)), null, null, i16, false, null, d6Var, 0);
                    }
                } else {
                    if (!(view instanceof gz0)) {
                        return;
                    }
                    Drawable drawable2 = ((gz0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof r5 ? ((r5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r92.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r92.r)), null, null, i16, false, null, d6Var, 0);
                    }
                }
                try {
                    r92.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.ct ctVar4 = r92.l;
                if (ctVar4 != null) {
                    ctVar4.s();
                    return;
                }
                return;
            case 4:
                String str2 = (String) this.e;
                int i17 = this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.c;
                AndroidUtilities.addToClipboard(str2);
                if (i17 == 1) {
                    org.telegram.messenger.kk.p(R.string.PhoneCopied, new xc(f3Var.getContainer(), d6Var2));
                    return;
                } else {
                    new xc(f3Var.getContainer(), d6Var2).k(false).j();
                    return;
                }
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                int i18 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.c;
                Pattern pattern = LaunchActivity.C1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, cyVar)) {
                    launchActivity.u0(new org.telegram.ui.qn(bundle), true, false);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ib0 ib0Var = (org.telegram.ui.ib0) this.d;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.c;
                int i19 = this.b;
                String str3 = (String) this.e;
                ib0Var.c();
                if (i19 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i19 != 0) {
                        if (i19 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i19 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i19, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.G = true;
                        notificationsCustomSettingsActivity.l0(false);
                        ib0Var.u(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str3)) {
                            ib0Var.x("showRow");
                        }
                        if ("new".equalsIgnoreCase(str3)) {
                            ib0Var.x("newRow");
                        }
                        if ("important".equalsIgnoreCase(str3)) {
                            ib0Var.x("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str3)) {
                            ib0Var.x("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str3)) {
                            ib0Var.x("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str3)) {
                            ib0Var.x("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str3)) {
                            ib0Var.x("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str3)) {
                            ib0Var.x("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str3)) {
                            ib0Var.x("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str3)) {
                            ib0Var.x("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str3)) {
                            ib0Var.x("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str3)) {
                            ib0Var.x("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str3)) {
                            ib0Var.x("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str3)) {
                            return;
                        }
                        ib0Var.x("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i19, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.l0(false);
                ib0Var.u(notificationsCustomSettingsActivity2, false);
                if ("show".equalsIgnoreCase(str3)) {
                }
                if ("new".equalsIgnoreCase(str3)) {
                }
                if ("important".equalsIgnoreCase(str3)) {
                }
                if ("messages".equalsIgnoreCase(str3)) {
                }
                if ("stories".equalsIgnoreCase(str3)) {
                }
                if ("preview".equalsIgnoreCase(str3)) {
                }
                if ("show-sender".equalsIgnoreCase(str3)) {
                }
                if ("sound".equalsIgnoreCase(str3)) {
                }
                if ("add-exception".equalsIgnoreCase(str3)) {
                }
                if ("delete-exceptions".equalsIgnoreCase(str3)) {
                }
                if ("light-color".equalsIgnoreCase(str3)) {
                }
                if ("vibrate".equalsIgnoreCase(str3)) {
                }
                if ("popup".equalsIgnoreCase(str3)) {
                }
                if ("priority".equalsIgnoreCase(str3)) {
                }
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.d;
                View view2 = (View) this.c;
                String str4 = (String) this.e;
                int i20 = this.b;
                ArrayList arrayList7 = notificationsCustomSettingsActivity3.I;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.ba)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str4, 0), iArr.length - 1, 0)]);
                if (i20 >= 0 && i20 < arrayList7.size()) {
                    ((org.telegram.ui.xj0) arrayList7.get(i20)).f = string;
                }
                ((org.telegram.ui.Cells.ba) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 8:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.e;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                int i21 = this.b;
                org.telegram.ui.uk0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (a1Var != null) {
                    boolean z11 = org.telegram.ui.web.a1.P0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    a1Var.y("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i21).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 9:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.d;
                TL_account.Passkey passkey = (TL_account.Passkey) this.c;
                String str5 = (String) this.e;
                int i22 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.fa(passkeysActivity, passkey, str5, i22, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.c;
                int i23 = this.b;
                String str6 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    try {
                        af.d dVar = new af.d(ApplicationLoader.applicationContext);
                        dVar.c(0);
                        dVar.b(0);
                        dVar.b = false;
                        bVar = dVar.a();
                        if (bVar.c.k()) {
                            m.g3 g3Var = new m.g3(22);
                            Bitmap bitmap2 = bitmapHolder.bitmap;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            g3Var.d = bitmap2;
                            a3.l lVar = (a3.l) g3Var.b;
                            lVar.a = width;
                            lVar.b = height;
                            lVar.c = i23;
                            if (bVar.e1(g3Var).size() == 0) {
                                r7 = false;
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.x70(photoViewer, str6, r7, 7));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.ve0(photoViewer, bitmapHolder, str6, i11));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (0 == 0) {
                            return;
                        }
                    }
                    bVar.X0();
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        r6.X0();
                    }
                    throw th2;
                }
            case 11:
                org.telegram.ui.ms0 ms0Var = (org.telegram.ui.ms0) this.d;
                FrameLayout frameLayout = (FrameLayout) this.e;
                a0.h hVar = (a0.h) this.c;
                xc.v(ms0Var.e1.y, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 12:
                f5.e0(this.b, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.n2) this.e, (TLRPC.TL_payments_assignPlayMarketTransaction) this.c, new Object[0]);
                return;
            case 13:
                yc1 yc1Var = (yc1) this.d;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.e;
                int i24 = this.b;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.c;
                yc1Var.getClass();
                int i25 = 0;
                while (i25 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i25).id == i24) {
                        tL_messageMediaToDo.todo.list.remove(i25);
                        i25--;
                    }
                    i25++;
                }
                int i26 = 0;
                while (i26 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i26).id == i24) {
                        tL_messageMediaToDo.completions.remove(i26);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i26--;
                    }
                    i26++;
                }
                yc1Var.G.messageOwner.media = tL_messageMediaToDo;
                qnVar.getSendMessagesHelper().editMessage(yc1Var.G, null, null, null, null, null, null, false, false, null);
                qnVar.ad(false);
                yc1Var.c(false);
                return;
            case 14:
                fd1 fd1Var = (fd1) this.d;
                int i27 = this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.e;
                gd1 gd1Var = fd1Var.h;
                ArrayList arrayList10 = fd1Var.d;
                ArrayList arrayList11 = fd1Var.c;
                if (i27 != fd1Var.f) {
                    return;
                }
                arrayList11.clear();
                arrayList10.clear();
                if (arrayList8 != null) {
                    arrayList11.addAll(arrayList8);
                    arrayList10.addAll(arrayList9);
                }
                fd1Var.l();
                if (arrayList11.isEmpty()) {
                    gd1Var.r.setVisibility(0);
                    return;
                } else {
                    gd1Var.r.setVisibility(8);
                    return;
                }
            case 15:
                org.telegram.ui.Wallet.a1 a1Var2 = (org.telegram.ui.Wallet.a1) this.d;
                tc.u uVar = (tc.u) this.c;
                int i28 = this.b;
                String str7 = (String) this.e;
                if (a1Var2.c(uVar, i28)) {
                    a1Var2.f(str7);
                    return;
                }
                a1Var2.d("ignoring stale socket callback; attempt=" + i28 + ", " + str7);
                return;
            case 16:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.d;
                tc.u uVar2 = (tc.u) this.e;
                int i29 = this.b;
                JSONObject jSONObject2 = (JSONObject) this.c;
                org.telegram.ui.Wallet.a1 a1Var3 = z0Var.c;
                if (a1Var3.c(uVar2, i29)) {
                    org.telegram.ui.Wallet.m0 m0Var = a1Var3.c;
                    String str8 = a1Var3.b;
                    org.telegram.ui.Cells.k7 k7Var = a1Var3.p;
                    String optString = jSONObject2.optString("status");
                    if ((jSONObject2.has("error") && !jSONObject2.isNull("error")) || "error".equals(optString)) {
                        a1Var3.d("subscription error; id=" + jSONObject2.optString("id") + ", code=" + jSONObject2.optString("code") + ", status=" + optString + ", error=" + jSONObject2.opt("error") + ", message=" + jSONObject2.optString("message"));
                        a1Var3.f("subscription rejected");
                        return;
                    }
                    if ("subscribed".equals(optString)) {
                        a1Var3.d("subscription acknowledgement: " + jSONObject2);
                        if (TextUtils.equals(a1Var3.f, jSONObject2.optString("id"))) {
                            a1Var3.e = true;
                            a1Var3.j = 0;
                            a1Var3.l = SystemClock.elapsedRealtime();
                            AndroidUtilities.cancelRunOnUIThread(a1Var3.o);
                            AndroidUtilities.cancelRunOnUIThread(k7Var);
                            AndroidUtilities.runOnUIThread(k7Var, 15000L);
                            a1Var3.d("subscription acknowledged; requested transactions and account state");
                            return;
                        }
                        return;
                    }
                    if ("pong".equals(optString) && "heartbeat".equals(jSONObject2.optString("id"))) {
                        a1Var3.d("received pong");
                        a1Var3.l = SystemClock.elapsedRealtime();
                        return;
                    }
                    if (!a1Var3.e) {
                        a1Var3.d("ignoring message before subscription; type=" + jSONObject2.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                        return;
                    }
                    String optString2 = jSONObject2.optString(TeXSymbolParser.TYPE_ATTR);
                    if (!"account_state_change".equals(optString2) || org.telegram.ui.Wallet.m0.a(str8, jSONObject2.optString("account"))) {
                        if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                            a1Var3.d("ignoring message; type=" + optString2 + ", status=" + optString);
                            return;
                        }
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("transactions");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("state");
                        StringBuilder v = a1.g.v("event type=", optString2, ", finality=");
                        v.append(jSONObject2.optString("finality"));
                        v.append(", trace=");
                        v.append(jSONObject2.optString("trace_external_hash_norm"));
                        v.append(optJSONArray2 == null ? "" : ", transactions=" + optJSONArray2.length());
                        v.append(optJSONObject != null ? ", balance=" + optJSONObject.optString("balance") : "");
                        a1Var3.d(v.toString());
                        if (!"transactions".equals(optString2)) {
                            m0Var.K(jSONObject2);
                            return;
                        }
                        if (str8 == null || (optJSONArray = jSONObject2.optJSONArray("transactions")) == null) {
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i30 = 0; i30 < optJSONArray.length(); i30++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i30);
                            if (optJSONObject2 != null && org.telegram.ui.Wallet.m0.a(str8, optJSONObject2.optString("account"))) {
                                jSONArray.put(optJSONObject2);
                            }
                        }
                        if (jSONArray.length() == 0) {
                            return;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.toString());
                            jSONObject3.put("transactions", jSONArray);
                            m0Var.K(jSONObject3);
                            return;
                        } catch (JSONException unused3) {
                            a1Var3.d("could not filter streaming transactions");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 17:
                org.telegram.ui.web.a1 a1Var4 = (org.telegram.ui.web.a1) this.d;
                int i31 = this.b;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.e;
                ci.z7 z7Var = (ci.z7) this.c;
                SendMessagesHelper.getInstance(a1Var4.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(a1Var4.M).getCurrentUser(), a1Var4.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.a1.w(i31, x0Var, z7Var, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 18:
                qg.n1 n1Var = (qg.n1) this.d;
                qg.i1 i1Var = (qg.i1) this.e;
                int i32 = this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = n1Var.c;
                boolean z12 = i1Var != null;
                n1Var.d = z12;
                if (!z12 || i32 < 0 || i32 >= arrayList13.size()) {
                    n1Var.i = arrayList12;
                } else {
                    n1Var.a++;
                    ((qg.m1) arrayList13.get(i32)).c++;
                    n1Var.g.edit().putInt(i2.e.j(i32, "score"), ((qg.m1) arrayList13.get(i32)).c).putInt("scoreall", n1Var.a).apply();
                    n1Var.i = null;
                }
                n1Var.e.run(i1Var);
                return;
            case 19:
                ea.b bVar2 = (ea.b) this.d;
                l5.i iVar = (l5.i) this.e;
                int i33 = this.b;
                Runnable runnable = (Runnable) this.c;
                t5.c cVar = (t5.c) bVar2.f;
                try {
                    try {
                        s5.d dVar2 = (s5.d) bVar2.c;
                        Objects.requireNonNull(dVar2);
                        ((s5.g) cVar).f(new qg.h0(dVar2, i12));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) bVar2.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((s5.g) cVar).f(new hg.b2(bVar2, iVar, i33, i11));
                        } else {
                            bVar2.e(iVar, i33);
                        }
                    } catch (Throwable th3) {
                        runnable.run();
                        throw th3;
                    }
                } catch (t5.a unused4) {
                    ((m.g3) bVar2.d).U(iVar, i33 + 1, false);
                }
                runnable.run();
                return;
            case 20:
                rg.n2 n2Var = (rg.n2) this.d;
                n2Var.m((Bitmap) this.e, this.b, n2Var.T, n2Var.U, (org.telegram.ui.wq0) this.c);
                return;
            case 21:
                sg.k0.S((sg.k0) this.d, (ArrayList) this.c, this.b, (TLRPC.TL_messages_inactiveChats) this.e);
                return;
            case 22:
                ((zh.c1) this.d).d1(this.b, (String) this.e, (String) this.c);
                return;
            default:
                zh.c1 c1Var = (zh.c1) this.d;
                Bitmap bitmap3 = (Bitmap) this.e;
                int[] iArr2 = (int[]) this.c;
                int i34 = this.b;
                c1Var.W4 = false;
                if (c1Var.X4 == null) {
                    c1Var.X4 = bitmap3;
                    c1Var.Y4 = iArr2;
                    c1Var.Z4 = i34;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ bz0(int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 12;
        this.b = i10;
        this.d = tL_error;
        this.e = n2Var;
        this.c = tL_payments_assignPlayMarketTransaction;
    }

    public /* synthetic */ bz0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = obj3;
    }

    public /* synthetic */ bz0(Object obj, Object obj2, int i10, Object obj3, int i11, boolean z10) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ bz0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = i10;
    }

    public /* synthetic */ bz0(String str, int i10, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = 4;
        this.e = str;
        this.b = i10;
        this.d = f3Var;
        this.c = d6Var;
    }

    public /* synthetic */ bz0(org.telegram.ui.ActionBar.n2 n2Var, Object obj, String str, int i10, int i11) {
        this.a = i11;
        this.d = n2Var;
        this.c = obj;
        this.e = str;
        this.b = i10;
    }

    public /* synthetic */ bz0(hm0 hm0Var, int i10, ArrayList arrayList, ArrayList arrayList2, int i11) {
        this.a = i11;
        this.d = hm0Var;
        this.b = i10;
        this.c = arrayList;
        this.e = arrayList2;
    }
}
