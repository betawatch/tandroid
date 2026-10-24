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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
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
import org.telegram.ui.ed1;
import org.telegram.ui.ld1;
import org.telegram.ui.md1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fz0(int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 13;
        this.c = i10;
        this.b = tL_error;
        this.e = o2Var;
        this.d = tL_payments_assignPlayMarketTransaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8, types: [org.telegram.ui.ht] */
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
        int i11 = 3;
        t8.b bVar = null;
        ArrayList arrayList3 = null;
        switch (this.a) {
            case 0:
                lz0 lz0Var = (lz0) this.b;
                String[] strArr = (String[]) this.e;
                String str = (String) this.d;
                int i12 = this.c;
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                int i13 = lz0Var.a;
                MediaDataController.getInstance(i13).getEmojiSuggestions(strArr, str, true, new ai.j6(lz0Var, i12, str, hashSet, arrayList4, 2), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i13).isPremium());
                return;
            case 1:
                lz0 lz0Var2 = (lz0) this.b;
                int i14 = this.c;
                String str2 = (String) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                if (i14 == lz0Var2.K) {
                    lz0Var2.J = str2;
                    lz0Var2.I = 2;
                    arrayList5.remove(arrayList5.size() - 1);
                    if (arrayList5.isEmpty()) {
                        lz0Var2.x = true;
                        lz0Var2.f();
                        return;
                    }
                    lz0Var2.x = false;
                    lz0Var2.v = false;
                    lz0Var2.c();
                    ah.x xVar = lz0Var2.d;
                    if (xVar != null) {
                        xVar.setVisibility(0);
                        lz0Var2.d.invalidate();
                    }
                    lz0Var2.w = arrayList5;
                    iz0 iz0Var = lz0Var2.f;
                    if (iz0Var != null) {
                        iz0Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                m21 m21Var = (m21) this.b;
                int i15 = this.c;
                ArrayList arrayList6 = (ArrayList) this.e;
                ArrayList arrayList7 = (ArrayList) this.d;
                ThemeEditorView.EditorAlert editorAlert = m21Var.r;
                e21 e21Var = editorAlert.c;
                if (i15 != m21Var.d) {
                    return;
                }
                m21 m21Var2 = editorAlert.r;
                if (e21Var.getAdapter() != m21Var2) {
                    editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                    e21Var.setAdapter(m21Var2);
                    m21Var2.l();
                }
                boolean z10 = !m21Var.e.isEmpty() && arrayList6.isEmpty();
                r6 = m21Var.e.isEmpty() && arrayList6.isEmpty();
                if (z10) {
                    editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                }
                m21Var.e = arrayList6;
                m21Var.f = arrayList7;
                m21Var.l();
                if (!r6 && !z10 && (i10 = editorAlert.F) > 0) {
                    editorAlert.h.h1(0, -i10);
                    editorAlert.F = -1000;
                }
                editorAlert.e.c();
                return;
            case 3:
                v21 v21Var = (v21) this.b;
                vp vpVar = (vp) this.e;
                int i16 = this.c;
                Bitmap bitmap = (Bitmap) this.d;
                Drawable drawable = vpVar.b;
                if (drawable instanceof yc0) {
                    yc0 yc0Var = (yc0) drawable;
                    yc0Var.s(v21.e(bitmap), i16);
                    yc0Var.t(v21Var.L);
                    v21Var.invalidate();
                    return;
                }
                return;
            case 4:
                ?? r82 = (org.telegram.ui.ht) this.b;
                mm0 mm0Var = (mm0) this.e;
                int i17 = this.c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                if (r82.j == null) {
                    return;
                }
                mm0Var.setOnItemClickListener((am0) null);
                mm0Var.requestDisallowInterceptTouchEvent(true);
                r82.j = null;
                r82.u(AndroidUtilities.findActivity(mm0Var.getContext()));
                r82.i = false;
                View view = r82.h;
                if (view instanceof org.telegram.ui.Cells.e8) {
                    org.telegram.ui.Cells.e8 e8Var = (org.telegram.ui.Cells.e8) view;
                    TLRPC.Document sticker = e8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = e8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(e8Var.getSticker(), null, Integer.valueOf(r82.r));
                    org.telegram.ui.ft ftVar = r82.l;
                    r82.r(sticker, stickerPath, findAnimatedEmojiEmoticon, ftVar != null ? ftVar.G(false) : null, null, i17, e8Var.y, e8Var.getParentObject(), r82.c0, 0);
                    e8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) view;
                    TLRPC.Document sticker2 = c8Var.getSticker();
                    org.telegram.ui.ft ftVar2 = r82.l;
                    r82.r(sticker2, null, null, ftVar2 != null ? ftVar2.G(false) : null, null, i17, false, c8Var.getParentObject(), g6Var, 0);
                    c8Var.setScaled(true);
                    r82.i = c8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    TLRPC.Document document2 = e2Var.getDocument();
                    org.telegram.ui.ft ftVar3 = r82.l;
                    r82.r(document2, null, null, ftVar3 != null ? ftVar3.G(true) : null, e2Var.getBotInlineResult(), i17, false, e2Var.getBotInlineResult() != null ? e2Var.getInlineBot() : e2Var.getParentObject(), g6Var, 0);
                    if (i17 != 1 || r82.m) {
                        e2Var.setScaled(true);
                    }
                } else if (view instanceof rv) {
                    TLRPC.Document document3 = ((rv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r82.r(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r82.r)), null, null, i17, false, null, g6Var, 0);
                    }
                } else if (view instanceof cz) {
                    a6 span = ((cz) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = r5.f(r82.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r82.r(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r82.r)), null, null, i17, false, null, g6Var, 0);
                    }
                } else {
                    if (!(view instanceof kz0)) {
                        return;
                    }
                    Drawable drawable2 = ((kz0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof r5 ? ((r5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r82.r(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r82.r)), null, null, i17, false, null, g6Var, 0);
                    }
                }
                try {
                    r82.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.ft ftVar4 = r82.l;
                if (ftVar4 != null) {
                    ftVar4.s();
                    return;
                }
                return;
            case 5:
                String str3 = (String) this.d;
                int i18 = this.c;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.b;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.e;
                AndroidUtilities.addToClipboard(str3);
                if (i18 == 1) {
                    org.telegram.messenger.sl.p(R.string.PhoneCopied, new xc(h3Var.getContainer(), g6Var2));
                    return;
                } else {
                    new xc(h3Var.getContainer(), g6Var2).k(false).j();
                    return;
                }
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                int i19 = this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.d;
                Pattern pattern = LaunchActivity.E1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, eyVar)) {
                    launchActivity.v0(new org.telegram.ui.sn(bundle), true, false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) this.b;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                int i20 = this.c;
                String str4 = (String) this.d;
                ob0Var.c();
                if (i20 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i20 != 0) {
                        if (i20 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i20 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i20, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.G = true;
                        notificationsCustomSettingsActivity.l0(false);
                        ob0Var.u(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str4)) {
                            ob0Var.x("showRow");
                        }
                        if ("new".equalsIgnoreCase(str4)) {
                            ob0Var.x("newRow");
                        }
                        if ("important".equalsIgnoreCase(str4)) {
                            ob0Var.x("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str4)) {
                            ob0Var.x("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str4)) {
                            ob0Var.x("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str4)) {
                            ob0Var.x("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str4)) {
                            ob0Var.x("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str4)) {
                            ob0Var.x("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str4)) {
                            ob0Var.x("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str4)) {
                            ob0Var.x("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str4)) {
                            ob0Var.x("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str4)) {
                            ob0Var.x("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str4)) {
                            ob0Var.x("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str4)) {
                            return;
                        }
                        ob0Var.x("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i20, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.l0(false);
                ob0Var.u(notificationsCustomSettingsActivity2, false);
                if ("show".equalsIgnoreCase(str4)) {
                }
                if ("new".equalsIgnoreCase(str4)) {
                }
                if ("important".equalsIgnoreCase(str4)) {
                }
                if ("messages".equalsIgnoreCase(str4)) {
                }
                if ("stories".equalsIgnoreCase(str4)) {
                }
                if ("preview".equalsIgnoreCase(str4)) {
                }
                if ("show-sender".equalsIgnoreCase(str4)) {
                }
                if ("sound".equalsIgnoreCase(str4)) {
                }
                if ("add-exception".equalsIgnoreCase(str4)) {
                }
                if ("delete-exceptions".equalsIgnoreCase(str4)) {
                }
                if ("light-color".equalsIgnoreCase(str4)) {
                }
                if ("vibrate".equalsIgnoreCase(str4)) {
                }
                if ("popup".equalsIgnoreCase(str4)) {
                }
                if ("priority".equalsIgnoreCase(str4)) {
                }
            case 8:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.b;
                View view2 = (View) this.e;
                String str5 = (String) this.d;
                int i21 = this.c;
                ArrayList arrayList8 = notificationsCustomSettingsActivity3.I;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.ca)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str5, 0), iArr.length - 1, 0)]);
                if (i21 >= 0 && i21 < arrayList8.size()) {
                    ((org.telegram.ui.ck0) arrayList8.get(i21)).f = string;
                }
                ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.e;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
                int i22 = this.c;
                org.telegram.ui.xk0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (b1Var != null) {
                    boolean z11 = org.telegram.ui.web.b1.Q0;
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
                ConnectionsManager.getInstance(i22).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 10:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.b;
                TL_account.Passkey passkey = (TL_account.Passkey) this.e;
                String str6 = (String) this.d;
                int i23 = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.fa(passkeysActivity, passkey, str6, i23, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.e;
                int i24 = this.c;
                String str7 = (String) this.d;
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
                            lVar.c = i24;
                            if (bVar.e1(g3Var).size() == 0) {
                                r6 = false;
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.v90(photoViewer, str7, r6, 6));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.re0(photoViewer, bitmapHolder, str7, 19));
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
                        r5.X0();
                    }
                    throw th2;
                }
            case 12:
                org.telegram.ui.ps0 ps0Var = (org.telegram.ui.ps0) this.b;
                FrameLayout frameLayout = (FrameLayout) this.e;
                a0.h hVar = (a0.h) this.d;
                xc.v(ps0Var.g1.y, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.c, -115203550, -1, 1500, false, null).j();
                return;
            case 13:
                f5.f0(this.c, (TLRPC.TL_error) this.b, (org.telegram.ui.ActionBar.o2) this.e, (TLRPC.TL_payments_assignPlayMarketTransaction) this.d, new Object[0]);
                return;
            case 14:
                ed1 ed1Var = (ed1) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.e;
                int i25 = this.c;
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.d;
                ed1Var.getClass();
                int i26 = 0;
                while (i26 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i26).id == i25) {
                        tL_messageMediaToDo.todo.list.remove(i26);
                        i26--;
                    }
                    i26++;
                }
                int i27 = 0;
                while (i27 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i27).id == i25) {
                        tL_messageMediaToDo.completions.remove(i27);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i27--;
                    }
                    i27++;
                }
                ed1Var.G.messageOwner.media = tL_messageMediaToDo;
                snVar.getSendMessagesHelper().editMessage(ed1Var.G, null, null, null, null, null, null, false, false, null);
                snVar.dd(false);
                ed1Var.c(false);
                return;
            case 15:
                ld1 ld1Var = (ld1) this.b;
                int i28 = this.c;
                ArrayList arrayList9 = (ArrayList) this.e;
                ArrayList arrayList10 = (ArrayList) this.d;
                md1 md1Var = ld1Var.h;
                ArrayList arrayList11 = ld1Var.d;
                ArrayList arrayList12 = ld1Var.c;
                if (i28 != ld1Var.f) {
                    return;
                }
                arrayList12.clear();
                arrayList11.clear();
                if (arrayList9 != null) {
                    arrayList12.addAll(arrayList9);
                    arrayList11.addAll(arrayList10);
                }
                ld1Var.l();
                if (arrayList12.isEmpty()) {
                    md1Var.r.setVisibility(0);
                    return;
                } else {
                    md1Var.r.setVisibility(8);
                    return;
                }
            case 16:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.b;
                tc.u uVar = (tc.u) this.e;
                int i29 = this.c;
                String str8 = (String) this.d;
                if (z0Var.c(uVar, i29)) {
                    z0Var.f(str8);
                    return;
                }
                z0Var.d("ignoring stale socket callback; attempt=" + i29 + ", " + str8);
                return;
            case 17:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) this.b;
                tc.u uVar2 = (tc.u) this.e;
                int i30 = this.c;
                JSONObject jSONObject2 = (JSONObject) this.d;
                org.telegram.ui.Wallet.z0 z0Var2 = y0Var.c;
                if (z0Var2.c(uVar2, i30)) {
                    org.telegram.ui.Wallet.l0 l0Var = z0Var2.c;
                    String str9 = z0Var2.b;
                    org.telegram.ui.Cells.u5 u5Var = z0Var2.p;
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
                            AndroidUtilities.cancelRunOnUIThread(u5Var);
                            AndroidUtilities.runOnUIThread(u5Var, 15000L);
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
                    if (!"account_state_change".equals(optString2) || org.telegram.ui.Wallet.l0.a(str9, jSONObject2.optString("account"))) {
                        if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                            z0Var2.d("ignoring message; type=" + optString2 + ", status=" + optString);
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
                        z0Var2.d(v.toString());
                        if (!"transactions".equals(optString2)) {
                            l0Var.K(jSONObject2);
                            return;
                        }
                        if (str9 == null || (optJSONArray = jSONObject2.optJSONArray("transactions")) == null) {
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i31 = 0; i31 < optJSONArray.length(); i31++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i31);
                            if (optJSONObject2 != null && org.telegram.ui.Wallet.l0.a(str9, optJSONObject2.optString("account"))) {
                                jSONArray.put(optJSONObject2);
                            }
                        }
                        if (jSONArray.length() == 0) {
                            return;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.toString());
                            jSONObject3.put("transactions", jSONArray);
                            l0Var.K(jSONObject3);
                            return;
                        } catch (JSONException unused3) {
                            z0Var2.d("could not filter streaming transactions");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) this.b;
                int i32 = this.c;
                org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) this.e;
                ci.y7 y7Var = (ci.y7) this.d;
                SendMessagesHelper.getInstance(b1Var2.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(b1Var2.M).getCurrentUser(), b1Var2.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.b1.w(i32, y0Var2, y7Var, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 19:
                qg.m1 m1Var = (qg.m1) this.b;
                qg.h1 h1Var = (qg.h1) this.e;
                int i33 = this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                ArrayList arrayList14 = m1Var.c;
                boolean z12 = h1Var != null;
                m1Var.d = z12;
                if (!z12 || i33 < 0 || i33 >= arrayList14.size()) {
                    m1Var.i = arrayList13;
                } else {
                    m1Var.a++;
                    ((qg.l1) arrayList14.get(i33)).c++;
                    m1Var.g.edit().putInt(i2.o1.k(i33, "score"), ((qg.l1) arrayList14.get(i33)).c).putInt("scoreall", m1Var.a).apply();
                    m1Var.i = null;
                }
                m1Var.e.run(h1Var);
                return;
            case 20:
                ea.b bVar2 = (ea.b) this.b;
                l5.i iVar = (l5.i) this.e;
                int i34 = this.c;
                Runnable runnable = (Runnable) this.d;
                t5.c cVar = (t5.c) bVar2.f;
                try {
                    try {
                        s5.d dVar2 = (s5.d) bVar2.c;
                        Objects.requireNonNull(dVar2);
                        ((s5.g) cVar).f(new qg.g0(dVar2, i11));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) bVar2.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((s5.g) cVar).f(new hg.b2(bVar2, iVar, i34, 18));
                        } else {
                            bVar2.e(iVar, i34);
                        }
                    } catch (Throwable th3) {
                        runnable.run();
                        throw th3;
                    }
                } catch (t5.a unused4) {
                    ((m.g3) bVar2.d).U(iVar, i34 + 1, false);
                }
                runnable.run();
                return;
            case 21:
                rg.o2 o2Var = (rg.o2) this.b;
                o2Var.m((Bitmap) this.e, this.c, o2Var.T, o2Var.U, (org.telegram.ui.zq0) this.d);
                return;
            case 22:
                sg.j0.R((sg.j0) this.b, (ArrayList) this.e, this.c, (TLRPC.TL_messages_inactiveChats) this.d);
                return;
            case 23:
                ((zh.c1) this.b).d1(this.c, (String) this.d, (String) this.e);
                return;
            default:
                zh.c1 c1Var = (zh.c1) this.b;
                Bitmap bitmap3 = (Bitmap) this.e;
                int[] iArr2 = (int[]) this.d;
                int i35 = this.c;
                c1Var.W4 = false;
                if (c1Var.X4 == null) {
                    c1Var.X4 = bitmap3;
                    c1Var.Y4 = iArr2;
                    c1Var.Z4 = i35;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ fz0(View view, int i10, String str, Serializable serializable, int i11) {
        this.a = i11;
        this.b = view;
        this.c = i10;
        this.d = str;
        this.e = serializable;
    }

    public /* synthetic */ fz0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = i10;
        this.e = obj2;
        this.d = obj3;
    }

    public /* synthetic */ fz0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.b = obj;
        this.e = obj2;
        this.c = i10;
        this.d = obj3;
    }

    public /* synthetic */ fz0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.b = obj;
        this.e = obj2;
        this.d = obj3;
        this.c = i10;
    }

    public /* synthetic */ fz0(String str, int i10, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = 5;
        this.d = str;
        this.c = i10;
        this.b = h3Var;
        this.e = g6Var;
    }
}
