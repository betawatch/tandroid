package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [org.telegram.ui.rt] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        JSONArray optJSONArray;
        t8.c cVar = null;
        ArrayList arrayList3 = null;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                z21 z21Var = (z21) this.c;
                bq bqVar = (bq) this.d;
                int i10 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = bqVar.b;
                if (drawable instanceof cd0) {
                    cd0 cd0Var = (cd0) drawable;
                    cd0Var.t(z21.e(bitmap), i10);
                    cd0Var.u(z21Var.L);
                    z21Var.invalidate();
                    return;
                }
                return;
            case 1:
                ?? r62 = (org.telegram.ui.rt) this.c;
                qm0 qm0Var = (qm0) this.d;
                int i11 = this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                if (r62.j == null) {
                    return;
                }
                qm0Var.setOnItemClickListener((em0) null);
                qm0Var.requestDisallowInterceptTouchEvent(true);
                r62.j = null;
                r62.w(AndroidUtilities.findActivity(qm0Var.getContext()));
                r62.i = false;
                View view = r62.h;
                if (view instanceof org.telegram.ui.Cells.f8) {
                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
                    TLRPC.Document sticker = f8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = f8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f8Var.getSticker(), null, Integer.valueOf(r62.r));
                    org.telegram.ui.pt ptVar = r62.l;
                    r62.t(sticker, stickerPath, findAnimatedEmojiEmoticon, ptVar != null ? ptVar.G(false) : null, null, i11, f8Var.y, f8Var.getParentObject(), r62.c0, 0);
                    f8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                    TLRPC.Document sticker2 = d8Var.getSticker();
                    org.telegram.ui.pt ptVar2 = r62.l;
                    r62.t(sticker2, null, null, ptVar2 != null ? ptVar2.G(false) : null, null, i11, false, d8Var.getParentObject(), e6Var, 0);
                    d8Var.setScaled(true);
                    r62.i = d8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    TLRPC.Document document2 = f2Var.getDocument();
                    org.telegram.ui.pt ptVar3 = r62.l;
                    r62.t(document2, null, null, ptVar3 != null ? ptVar3.G(true) : null, f2Var.getBotInlineResult(), i11, false, f2Var.getBotInlineResult() != null ? f2Var.getInlineBot() : f2Var.getParentObject(), e6Var, 0);
                    if (i11 != 1 || r62.m) {
                        f2Var.setScaled(true);
                    }
                } else if (view instanceof zv) {
                    TLRPC.Document document3 = ((zv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r62.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r62.r)), null, null, i11, false, null, e6Var, 0);
                    }
                } else if (view instanceof iz) {
                    b6 span = ((iz) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = s5.f(r62.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r62.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r62.r)), null, null, i11, false, null, e6Var, 0);
                    }
                } else {
                    if (!(view instanceof nz0)) {
                        return;
                    }
                    Drawable drawable2 = ((nz0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof s5 ? ((s5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r62.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r62.r)), null, null, i11, false, null, e6Var, 0);
                    }
                }
                try {
                    r62.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.pt ptVar4 = r62.l;
                if (ptVar4 != null) {
                    ptVar4.u();
                    return;
                }
                return;
            case 2:
                String str = (String) this.c;
                int i12 = this.b;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.e;
                AndroidUtilities.addToClipboard(str);
                if (i12 == 1) {
                    org.telegram.messenger.bi.p(R.string.PhoneCopied, new ad(f3Var.getContainer(), e6Var2));
                    return;
                } else {
                    new ad(f3Var.getContainer(), e6Var2).k(false).j();
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i13 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.e;
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, tyVar)) {
                    launchActivity.q0(new org.telegram.ui.zn(bundle), true, false);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ec0 ec0Var = (org.telegram.ui.ec0) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i14 = this.b;
                String str2 = (String) this.e;
                ec0Var.c();
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
                        ec0Var.u(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            ec0Var.x("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            ec0Var.x("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            ec0Var.x("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            ec0Var.x("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            ec0Var.x("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            ec0Var.x("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            ec0Var.x("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            ec0Var.x("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            ec0Var.x("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            ec0Var.x("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            ec0Var.x("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            ec0Var.x("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            ec0Var.x("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        ec0Var.x("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i14, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.l0(false);
                ec0Var.u(notificationsCustomSettingsActivity2, false);
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
                ArrayList arrayList4 = notificationsCustomSettingsActivity3.I;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.ca)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i15 >= 0 && i15 < arrayList4.size()) {
                    ((org.telegram.ui.ok0) arrayList4.get(i15)).f = string;
                }
                ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i16 = this.b;
                org.telegram.ui.ml0.a = null;
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
                    b1Var.y("oauth_result_failed", jSONObject);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ea(passkeysActivity, passkey, str4, i17, 6));
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
                            la.h hVar = new la.h(24);
                            Bitmap bitmap2 = bitmapHolder.bitmap;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            hVar.d = bitmap2;
                            a3.l lVar = (a3.l) hVar.b;
                            lVar.a = width;
                            lVar.b = height;
                            lVar.c = i18;
                            if (cVar.b1(hVar).size() == 0) {
                                z10 = false;
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.ha0(photoViewer, str5, z10, 5));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.of0(photoViewer, bitmapHolder, str5, 17));
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                org.telegram.ui.gt0 gt0Var = (org.telegram.ui.gt0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.i iVar = (a0.i) this.e;
                ad.v(gt0Var.d1.y, null, frameLayout, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 10:
                g5.e0(this.b, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 11:
                me1 me1Var = (me1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i19 = this.b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.e;
                me1Var.getClass();
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
                me1Var.G.messageOwner.media = tL_messageMediaToDo;
                znVar.getSendMessagesHelper().editMessage(me1Var.G, null, null, null, null, null, null, false, false, null);
                znVar.ad(false);
                me1Var.c(false);
                return;
            case 12:
                te1 te1Var = (te1) this.c;
                int i22 = this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                ue1 ue1Var = te1Var.h;
                ArrayList arrayList7 = te1Var.d;
                ArrayList arrayList8 = te1Var.c;
                if (i22 != te1Var.f) {
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
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.c;
                sc.u uVar = (sc.u) this.d;
                int i23 = this.b;
                String str6 = (String) this.e;
                if (z0Var.c(uVar, i23)) {
                    z0Var.f(str6);
                    return;
                }
                z0Var.d("ignoring stale socket callback; attempt=" + i23 + ", " + str6);
                return;
            case 14:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) this.c;
                sc.u uVar2 = (sc.u) this.d;
                int i24 = this.b;
                JSONObject jSONObject2 = (JSONObject) this.e;
                org.telegram.ui.Wallet.z0 z0Var2 = y0Var.c;
                if (z0Var2.c(uVar2, i24)) {
                    org.telegram.ui.Wallet.k0 k0Var = z0Var2.c;
                    String str7 = z0Var2.b;
                    org.telegram.ui.Cells.t6 t6Var = z0Var2.p;
                    String optString = jSONObject2.optString("status");
                    if ((jSONObject2.has("error") && !jSONObject2.isNull("error")) || "error".equals(optString)) {
                        z0Var2.d("subscription error; id=" + jSONObject2.optString("id") + ", code=" + jSONObject2.optString("code") + ", status=" + optString + ", error=" + jSONObject2.opt("error") + ", message=" + jSONObject2.optString("message"));
                        z0Var2.f("subscription rejected");
                        return;
                    }
                    if ("subscribed".equals(optString)) {
                        z0Var2.d("subscription acknowledgement: " + jSONObject2);
                        if (TextUtils.equals(z0Var2.f, jSONObject2.optString("id"))) {
                            z0Var2.e = true;
                            z0Var2.j = 0;
                            z0Var2.l = SystemClock.elapsedRealtime();
                            AndroidUtilities.cancelRunOnUIThread(z0Var2.o);
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var, 15000L);
                            z0Var2.d("subscription acknowledged; requested transactions and account state");
                            return;
                        }
                        return;
                    }
                    if ("pong".equals(optString) && "heartbeat".equals(jSONObject2.optString("id"))) {
                        z0Var2.d("received pong");
                        z0Var2.l = SystemClock.elapsedRealtime();
                        return;
                    }
                    if (!z0Var2.e) {
                        z0Var2.d("ignoring message before subscription; type=" + jSONObject2.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                        return;
                    }
                    String optString2 = jSONObject2.optString(TeXSymbolParser.TYPE_ATTR);
                    if (!"account_state_change".equals(optString2) || org.telegram.ui.Wallet.k0.b(str7, jSONObject2.optString("account"))) {
                        if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                            z0Var2.d("ignoring message; type=" + optString2 + ", status=" + optString);
                            return;
                        }
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("transactions");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("state");
                        StringBuilder w10 = a1.g.w("event type=", optString2, ", finality=");
                        w10.append(jSONObject2.optString("finality"));
                        w10.append(", trace=");
                        w10.append(jSONObject2.optString("trace_external_hash_norm"));
                        w10.append(optJSONArray2 == null ? "" : ", transactions=" + optJSONArray2.length());
                        w10.append(optJSONObject != null ? ", balance=" + optJSONObject.optString("balance") : "");
                        z0Var2.d(w10.toString());
                        if (!"transactions".equals(optString2)) {
                            k0Var.J(jSONObject2);
                            return;
                        }
                        if (str7 == null || (optJSONArray = jSONObject2.optJSONArray("transactions")) == null) {
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i25 = 0; i25 < optJSONArray.length(); i25++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i25);
                            if (optJSONObject2 != null && org.telegram.ui.Wallet.k0.b(str7, optJSONObject2.optString("account"))) {
                                jSONArray.put(optJSONObject2);
                            }
                        }
                        if (jSONArray.length() == 0) {
                            return;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.toString());
                            jSONObject3.put("transactions", jSONArray);
                            k0Var.J(jSONObject3);
                            return;
                        } catch (JSONException unused3) {
                            z0Var2.d("could not filter streaming transactions");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) this.c;
                int i26 = this.b;
                org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) this.d;
                ai.ea eaVar = (ai.ea) this.e;
                SendMessagesHelper.getInstance(b1Var2.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(b1Var2.M).getCurrentUser(), b1Var2.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.b1.w(i26, y0Var2, eaVar, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 16:
                pg.m1 m1Var = (pg.m1) this.c;
                pg.h1 h1Var = (pg.h1) this.d;
                int i27 = this.b;
                ArrayList arrayList9 = (ArrayList) this.e;
                ArrayList arrayList10 = m1Var.c;
                boolean z12 = h1Var != null;
                m1Var.d = z12;
                if (!z12 || i27 < 0 || i27 >= arrayList10.size()) {
                    m1Var.i = arrayList9;
                } else {
                    m1Var.a++;
                    ((pg.l1) arrayList10.get(i27)).c++;
                    m1Var.g.edit().putInt(hg.c.h(i27, "score"), ((pg.l1) arrayList10.get(i27)).c).putInt("scoreall", m1Var.a).apply();
                    m1Var.i = null;
                }
                m1Var.e.run(h1Var);
                return;
            case 17:
                qg.o2 o2Var = (qg.o2) this.c;
                o2Var.m((Bitmap) this.e, this.b, o2Var.T, o2Var.U, (org.telegram.ui.or0) this.d);
                return;
            case 18:
                da.c cVar2 = (da.c) this.c;
                l5.i iVar2 = (l5.i) this.d;
                int i28 = this.b;
                Runnable runnable = (Runnable) this.e;
                t5.c cVar3 = (t5.c) cVar2.f;
                try {
                    try {
                        s5.d dVar = (s5.d) cVar2.c;
                        Objects.requireNonNull(dVar);
                        ((s5.g) cVar3).f(new r5.d(dVar, 0));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) cVar2.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((s5.g) cVar3).f(new gg.c2(cVar2, iVar2, i28, 18));
                        } else {
                            cVar2.e(iVar2, i28);
                        }
                    } catch (Throwable th3) {
                        runnable.run();
                        throw th3;
                    }
                } catch (t5.a unused4) {
                    ((la.h) cVar2.d).W(iVar2, i28 + 1, false);
                }
                runnable.run();
                return;
            case 19:
                rg.j0.S((rg.j0) this.c, (ArrayList) this.d, this.b, (TLRPC.TL_messages_inactiveChats) this.e);
                return;
            default:
                int i29 = this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.e;
                yh.s3 s3Var = new yh.s3(context, i29, UserConfig.getInstance(i29).getClientUserId(), e6Var3, null);
                s3Var.l2(savedStarGift, null);
                s3Var.show();
                return;
        }
    }

    public /* synthetic */ x21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ x21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ x21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ x21(qg.o2 o2Var, Bitmap bitmap, int i10, org.telegram.ui.or0 or0Var) {
        this.a = 17;
        this.c = o2Var;
        this.e = bitmap;
        this.b = i10;
        this.d = or0Var;
    }
}
