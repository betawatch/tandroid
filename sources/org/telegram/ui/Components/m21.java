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
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.af1;
import org.telegram.ui.se1;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class m21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m21(int i10, Object obj, Object obj2, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3, types: [org.telegram.ui.xt] */
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
        t8.c cVar = null;
        ArrayList arrayList3 = null;
        switch (this.a) {
            case 0:
                n21 n21Var = (n21) this.c;
                int i11 = this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                ThemeEditorView.EditorAlert editorAlert = n21Var.r;
                e21 e21Var = editorAlert.c;
                if (i11 != n21Var.d) {
                    return;
                }
                n21 n21Var2 = editorAlert.r;
                if (e21Var.getAdapter() != n21Var2) {
                    editorAlert.F = ThemeEditorView.EditorAlert.K(editorAlert);
                    e21Var.setAdapter(n21Var2);
                    n21Var2.l();
                }
                boolean z10 = !n21Var.e.isEmpty() && arrayList4.isEmpty();
                r4 = n21Var.e.isEmpty() && arrayList4.isEmpty();
                if (z10) {
                    editorAlert.F = ThemeEditorView.EditorAlert.K(editorAlert);
                }
                n21Var.e = arrayList4;
                n21Var.f = arrayList5;
                n21Var.l();
                if (!r4 && !z10 && (i10 = editorAlert.F) > 0) {
                    editorAlert.h.h1(0, -i10);
                    editorAlert.F = -1000;
                }
                editorAlert.e.c();
                return;
            case 1:
                v21 v21Var = (v21) this.c;
                yp ypVar = (yp) this.d;
                int i12 = this.b;
                Bitmap bitmap = (Bitmap) this.e;
                Drawable drawable = ypVar.b;
                if (drawable instanceof cd0) {
                    cd0 cd0Var = (cd0) drawable;
                    cd0Var.t(v21.e(bitmap), i12);
                    cd0Var.u(v21Var.L);
                    v21Var.invalidate();
                    return;
                }
                return;
            case 2:
                ?? r62 = (org.telegram.ui.xt) this.c;
                mm0 mm0Var = (mm0) this.d;
                int i13 = this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                if (r62.j == null) {
                    return;
                }
                mm0Var.setOnItemClickListener((am0) null);
                mm0Var.requestDisallowInterceptTouchEvent(true);
                r62.j = null;
                r62.w(AndroidUtilities.findActivity(mm0Var.getContext()));
                r62.i = false;
                View view = r62.h;
                if (view instanceof org.telegram.ui.Cells.f8) {
                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
                    TLRPC.Document sticker = f8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = f8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f8Var.getSticker(), null, Integer.valueOf(r62.r));
                    org.telegram.ui.vt vtVar = r62.l;
                    r62.t(sticker, stickerPath, findAnimatedEmojiEmoticon, vtVar != null ? vtVar.G(false) : null, null, i13, f8Var.y, f8Var.getParentObject(), r62.c0, 0);
                    f8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                    TLRPC.Document sticker2 = d8Var.getSticker();
                    org.telegram.ui.vt vtVar2 = r62.l;
                    r62.t(sticker2, null, null, vtVar2 != null ? vtVar2.G(false) : null, null, i13, false, d8Var.getParentObject(), c6Var, 0);
                    d8Var.setScaled(true);
                    r62.i = d8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    TLRPC.Document document2 = f2Var.getDocument();
                    org.telegram.ui.vt vtVar3 = r62.l;
                    r62.t(document2, null, null, vtVar3 != null ? vtVar3.G(true) : null, f2Var.getBotInlineResult(), i13, false, f2Var.getBotInlineResult() != null ? f2Var.getInlineBot() : f2Var.getParentObject(), c6Var, 0);
                    if (i13 != 1 || r62.m) {
                        f2Var.setScaled(true);
                    }
                } else if (view instanceof vv) {
                    TLRPC.Document document3 = ((vv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r62.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r62.r)), null, null, i13, false, null, c6Var, 0);
                    }
                } else if (view instanceof ez) {
                    b6 span = ((ez) view).getSpan();
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
                        r62.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r62.r)), null, null, i13, false, null, c6Var, 0);
                    }
                } else {
                    if (!(view instanceof jz0)) {
                        return;
                    }
                    Drawable drawable2 = ((jz0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof s5 ? ((s5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r62.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r62.r)), null, null, i13, false, null, c6Var, 0);
                    }
                }
                try {
                    r62.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.vt vtVar4 = r62.l;
                if (vtVar4 != null) {
                    vtVar4.t();
                    return;
                }
                return;
            case 3:
                String str = (String) this.c;
                int i14 = this.b;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.e;
                AndroidUtilities.addToClipboard(str);
                if (i14 == 1) {
                    org.telegram.messenger.yh.o(R.string.PhoneCopied, new zc(e3Var.getContainer(), c6Var2));
                    return;
                } else {
                    new zc(e3Var.getContainer(), c6Var2).k(false).j();
                    return;
                }
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                int i15 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) this.e;
                Pattern pattern = LaunchActivity.B1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, yyVar)) {
                    launchActivity.q0(new org.telegram.ui.fo(bundle), true, false);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.jc0 jc0Var = (org.telegram.ui.jc0) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                int i16 = this.b;
                String str2 = (String) this.e;
                jc0Var.c();
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
                        jc0Var.u(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            jc0Var.x("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            jc0Var.x("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            jc0Var.x("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            jc0Var.x("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            jc0Var.x("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            jc0Var.x("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            jc0Var.x("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            jc0Var.x("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            jc0Var.x("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            jc0Var.x("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            jc0Var.x("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            jc0Var.x("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            jc0Var.x("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        jc0Var.x("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i16, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.l0(false);
                jc0Var.u(notificationsCustomSettingsActivity2, false);
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
            case 6:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.c;
                View view2 = (View) this.d;
                String str3 = (String) this.e;
                int i17 = this.b;
                ArrayList arrayList6 = notificationsCustomSettingsActivity3.I;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.ca)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i17 >= 0 && i17 < arrayList6.size()) {
                    ((org.telegram.ui.tk0) arrayList6.get(i17)).f = string;
                }
                ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 7:
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                int i18 = this.b;
                org.telegram.ui.rl0.a = null;
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
                ConnectionsManager.getInstance(i18).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 8:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.c;
                TL_account.Passkey passkey = (TL_account.Passkey) this.d;
                String str4 = (String) this.e;
                int i19 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ia(passkeysActivity, passkey, str4, i19, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.d;
                int i20 = this.b;
                String str5 = (String) this.e;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    try {
                        af.d dVar = new af.d(ApplicationLoader.applicationContext);
                        dVar.c(0);
                        dVar.b(0);
                        dVar.b = false;
                        cVar = dVar.a();
                        if (cVar.c.k()) {
                            li.k kVar = new li.k(23);
                            Bitmap bitmap2 = bitmapHolder.bitmap;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            kVar.d = bitmap2;
                            a3.l lVar = (a3.l) kVar.b;
                            lVar.a = width;
                            lVar.b = height;
                            lVar.c = i20;
                            if (cVar.e1(kVar).size() == 0) {
                                r4 = false;
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.ma0(photoViewer, str5, r4, 6));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.uf0(photoViewer, bitmapHolder, str5, 17));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (0 == 0) {
                            return;
                        }
                    }
                    cVar.X0();
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        r3.X0();
                    }
                    throw th2;
                }
            case 10:
                org.telegram.ui.nt0 nt0Var = (org.telegram.ui.nt0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                a0.h hVar = (a0.h) this.e;
                zc.v(nt0Var.d1.y, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 11:
                g5.e0(this.b, (TLRPC.TL_error) this.c, (org.telegram.ui.ActionBar.m2) this.d, (TLRPC.TL_payments_assignPlayMarketTransaction) this.e, new Object[0]);
                return;
            case 12:
                se1 se1Var = (se1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                int i21 = this.b;
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) this.e;
                se1Var.getClass();
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
                se1Var.G.messageOwner.media = tL_messageMediaToDo;
                foVar.getSendMessagesHelper().editMessage(se1Var.G, null, null, null, null, null, null, false, false, null);
                foVar.ad(false);
                se1Var.c(false);
                return;
            case 13:
                ze1 ze1Var = (ze1) this.c;
                int i24 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                af1 af1Var = ze1Var.h;
                ArrayList arrayList9 = ze1Var.d;
                ArrayList arrayList10 = ze1Var.c;
                if (i24 != ze1Var.f) {
                    return;
                }
                arrayList10.clear();
                arrayList9.clear();
                if (arrayList7 != null) {
                    arrayList10.addAll(arrayList7);
                    arrayList9.addAll(arrayList8);
                }
                ze1Var.l();
                if (arrayList10.isEmpty()) {
                    af1Var.r.setVisibility(0);
                    return;
                } else {
                    af1Var.r.setVisibility(8);
                    return;
                }
            case 14:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) this.c;
                tc.u uVar = (tc.u) this.d;
                int i25 = this.b;
                String str6 = (String) this.e;
                if (y0Var.c(uVar, i25)) {
                    y0Var.f(str6);
                    return;
                }
                y0Var.d("ignoring stale socket callback; attempt=" + i25 + ", " + str6);
                return;
            case 15:
                org.telegram.ui.Wallet.x0 x0Var = (org.telegram.ui.Wallet.x0) this.c;
                tc.u uVar2 = (tc.u) this.d;
                int i26 = this.b;
                JSONObject jSONObject2 = (JSONObject) this.e;
                org.telegram.ui.Wallet.y0 y0Var2 = x0Var.c;
                if (y0Var2.c(uVar2, i26)) {
                    org.telegram.ui.Wallet.j0 j0Var = y0Var2.c;
                    String str7 = y0Var2.b;
                    org.telegram.ui.Cells.t6 t6Var = y0Var2.p;
                    String optString = jSONObject2.optString("status");
                    if ((jSONObject2.has("error") && !jSONObject2.isNull("error")) || "error".equals(optString)) {
                        y0Var2.d("subscription error; id=" + jSONObject2.optString("id") + ", code=" + jSONObject2.optString("code") + ", status=" + optString + ", error=" + jSONObject2.opt("error") + ", message=" + jSONObject2.optString("message"));
                        y0Var2.f("subscription rejected");
                        return;
                    }
                    if ("subscribed".equals(optString)) {
                        y0Var2.d("subscription acknowledgement: " + jSONObject2);
                        if (TextUtils.equals(y0Var2.f, jSONObject2.optString("id"))) {
                            y0Var2.e = true;
                            y0Var2.j = 0;
                            y0Var2.l = SystemClock.elapsedRealtime();
                            AndroidUtilities.cancelRunOnUIThread(y0Var2.o);
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var, 15000L);
                            y0Var2.d("subscription acknowledged; requested transactions and account state");
                            return;
                        }
                        return;
                    }
                    if ("pong".equals(optString) && "heartbeat".equals(jSONObject2.optString("id"))) {
                        y0Var2.d("received pong");
                        y0Var2.l = SystemClock.elapsedRealtime();
                        return;
                    }
                    if (!y0Var2.e) {
                        y0Var2.d("ignoring message before subscription; type=" + jSONObject2.optString(TeXSymbolParser.TYPE_ATTR) + ", status=" + optString);
                        return;
                    }
                    String optString2 = jSONObject2.optString(TeXSymbolParser.TYPE_ATTR);
                    if (!"account_state_change".equals(optString2) || org.telegram.ui.Wallet.j0.b(str7, jSONObject2.optString("account"))) {
                        if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                            y0Var2.d("ignoring message; type=" + optString2 + ", status=" + optString);
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
                        y0Var2.d(v.toString());
                        if (!"transactions".equals(optString2)) {
                            j0Var.J(jSONObject2);
                            return;
                        }
                        if (str7 == null || (optJSONArray = jSONObject2.optJSONArray("transactions")) == null) {
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i27 = 0; i27 < optJSONArray.length(); i27++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i27);
                            if (optJSONObject2 != null && org.telegram.ui.Wallet.j0.b(str7, optJSONObject2.optString("account"))) {
                                jSONArray.put(optJSONObject2);
                            }
                        }
                        if (jSONArray.length() == 0) {
                            return;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.toString());
                            jSONObject3.put("transactions", jSONArray);
                            j0Var.J(jSONObject3);
                            return;
                        } catch (JSONException unused3) {
                            y0Var2.d("could not filter streaming transactions");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 16:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) this.c;
                int i28 = this.b;
                org.telegram.ui.web.y0 y0Var3 = (org.telegram.ui.web.y0) this.d;
                bi.n9 n9Var = (bi.n9) this.e;
                SendMessagesHelper.getInstance(b1Var2.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(b1Var2.M).getCurrentUser(), b1Var2.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.b1.w(i28, y0Var3, n9Var, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 17:
                qg.k1 k1Var = (qg.k1) this.c;
                qg.f1 f1Var = (qg.f1) this.e;
                int i29 = this.b;
                ArrayList arrayList11 = (ArrayList) this.d;
                ArrayList arrayList12 = k1Var.c;
                boolean z12 = f1Var != null;
                k1Var.d = z12;
                if (!z12 || i29 < 0 || i29 >= arrayList12.size()) {
                    k1Var.i = arrayList11;
                } else {
                    k1Var.a++;
                    ((qg.j1) arrayList12.get(i29)).c++;
                    k1Var.g.edit().putInt(i2.d.i(i29, "score"), ((qg.j1) arrayList12.get(i29)).c).putInt("scoreall", k1Var.a).apply();
                    k1Var.i = null;
                }
                k1Var.e.run(f1Var);
                return;
            case 18:
                ea.b bVar = (ea.b) this.c;
                l5.i iVar = (l5.i) this.d;
                int i30 = this.b;
                Runnable runnable = (Runnable) this.e;
                t5.c cVar2 = (t5.c) bVar.f;
                try {
                    try {
                        s5.d dVar2 = (s5.d) bVar.c;
                        Objects.requireNonNull(dVar2);
                        ((s5.g) cVar2).f(new ji.m5(dVar2, 24));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) bVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((s5.g) cVar2).f(new hg.b2(bVar, iVar, i30, 18));
                        } else {
                            bVar.e(iVar, i30);
                        }
                    } catch (t5.a unused4) {
                        ((li.k) bVar.d).U(iVar, i30 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th3) {
                    runnable.run();
                    throw th3;
                }
            case 19:
                rg.p2 p2Var = (rg.p2) this.c;
                p2Var.m((Bitmap) this.d, this.b, p2Var.T, p2Var.U, (org.telegram.ui.ur0) this.e);
                return;
            case 20:
                sg.j0.S((sg.j0) this.c, (ArrayList) this.d, this.b, (TLRPC.TL_messages_inactiveChats) this.e);
                return;
            default:
                int i31 = this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.e;
                zh.r3 r3Var = new zh.r3(context, i31, UserConfig.getInstance(i31).getClientUserId(), c6Var3, null);
                r3Var.l2(savedStarGift, null);
                r3Var.show();
                return;
        }
    }

    public /* synthetic */ m21(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ m21(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ m21(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ m21(qg.k1 k1Var, qg.f1 f1Var, int i10, ArrayList arrayList) {
        this.a = 17;
        this.c = k1Var;
        this.e = f1Var;
        this.b = i10;
        this.d = arrayList;
    }
}
