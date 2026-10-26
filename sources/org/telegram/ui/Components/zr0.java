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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.id1;
import org.telegram.ui.od1;
import org.telegram.ui.pd1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zr0(int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 15;
        this.b = i10;
        this.d = tL_error;
        this.e = r2Var;
        this.c = tL_payments_assignPlayMarketTransaction;
    }

    private final void a() {
        aa.b0 b0Var = (aa.b0) this.d;
        m5.i iVar = (m5.i) this.e;
        int i10 = this.b;
        Runnable runnable = (Runnable) this.c;
        u5.c cVar = (u5.c) b0Var.d;
        try {
            try {
                t5.d dVar = (t5.d) b0Var.f;
                Objects.requireNonNull(dVar);
                ((t5.g) cVar).f(new org.telegram.ui.Components.voip.j1(dVar, 7));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) b0Var.a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((t5.g) cVar).f(new i2.z(b0Var, iVar, i10, 19));
                } else {
                    b0Var.e(iVar, i10);
                }
                runnable.run();
            } catch (u5.a unused) {
                ((s4.d) b0Var.b).s(iVar, i10 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.ui.ft] */
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
        u8.b bVar = null;
        ArrayList arrayList3 = null;
        switch (this.a) {
            case 0:
                aw0.k((aw0) this.d, this.b, (TL_stories.StoryItem) this.e, (String) this.c);
                return;
            case 1:
                wu0 wu0Var = (wu0) this.d;
                int i11 = this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                String str = (String) this.c;
                aw0 aw0Var = wu0Var.v;
                if (wu0Var.h != 0) {
                    if (i11 == wu0Var.n) {
                        int h = wu0Var.h();
                        wu0Var.f = arrayList4;
                        wu0Var.s--;
                        int h10 = wu0Var.h();
                        if (wu0Var.s == 0 || h10 != 0) {
                            aw0Var.v1(false);
                        }
                        int i12 = 0;
                        while (true) {
                            tu0[] tu0VarArr = aw0Var.m0;
                            if (i12 < tu0VarArr.length) {
                                tu0 tu0Var = tu0VarArr[i12];
                                if (tu0Var.E == wu0Var.r) {
                                    if (wu0Var.s == 0 && h10 == 0) {
                                        tu0Var.v.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str));
                                        tu0VarArr[i12].v.f.setVisibility(8);
                                        tu0VarArr[i12].v.e(false, true);
                                    } else if (h == 0) {
                                        aw0Var.C(tu0Var.h, 0, null);
                                    }
                                }
                                i12++;
                            } else {
                                wu0Var.l();
                            }
                        }
                    }
                    wu0Var.h = 0;
                    return;
                }
                return;
            case 2:
                tz0 tz0Var = (tz0) this.d;
                String[] strArr = (String[]) this.e;
                String str2 = (String) this.c;
                int i13 = this.b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int i14 = tz0Var.a;
                MediaDataController.getInstance(i14).getEmojiSuggestions(strArr, str2, true, new bi.e6(tz0Var, i13, str2, hashSet, arrayList5, 2), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i14).isPremium());
                return;
            case 3:
                tz0 tz0Var2 = (tz0) this.d;
                int i15 = this.b;
                String str3 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.e;
                if (i15 == tz0Var2.K) {
                    tz0Var2.J = str3;
                    tz0Var2.I = 2;
                    arrayList6.remove(arrayList6.size() - 1);
                    if (arrayList6.isEmpty()) {
                        tz0Var2.x = true;
                        tz0Var2.f();
                        return;
                    }
                    tz0Var2.x = false;
                    tz0Var2.v = false;
                    tz0Var2.c();
                    bh.r rVar = tz0Var2.d;
                    if (rVar != null) {
                        rVar.setVisibility(0);
                        tz0Var2.d.invalidate();
                    }
                    tz0Var2.w = arrayList6;
                    qz0 qz0Var = tz0Var2.f;
                    if (qz0Var != null) {
                        qz0Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                u21 u21Var = (u21) this.d;
                int i16 = this.b;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.c;
                ThemeEditorView.EditorAlert editorAlert = u21Var.r;
                m21 m21Var = editorAlert.c;
                if (i16 != u21Var.d) {
                    return;
                }
                u21 u21Var2 = editorAlert.r;
                if (m21Var.getAdapter() != u21Var2) {
                    editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                    m21Var.setAdapter(u21Var2);
                    u21Var2.l();
                }
                boolean z10 = !u21Var.e.isEmpty() && arrayList7.isEmpty();
                r6 = u21Var.e.isEmpty() && arrayList7.isEmpty();
                if (z10) {
                    editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                }
                u21Var.e = arrayList7;
                u21Var.f = arrayList8;
                u21Var.l();
                if (!r6 && !z10 && (i10 = editorAlert.F) > 0) {
                    editorAlert.h.h1(0, -i10);
                    editorAlert.F = -1000;
                }
                editorAlert.e.c();
                return;
            case 5:
                d31 d31Var = (d31) this.d;
                xp xpVar = (xp) this.e;
                int i17 = this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable drawable = xpVar.b;
                if (drawable instanceof uc0) {
                    uc0 uc0Var = (uc0) drawable;
                    uc0Var.s(d31.e(bitmap), i17);
                    uc0Var.t(d31Var.L);
                    d31Var.invalidate();
                    return;
                }
                return;
            case 6:
                ?? r82 = (org.telegram.ui.ft) this.d;
                mm0 mm0Var = (mm0) this.e;
                int i18 = this.b;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.c;
                if (r82.j == null) {
                    return;
                }
                mm0Var.setOnItemClickListener((zl0) null);
                mm0Var.requestDisallowInterceptTouchEvent(true);
                r82.j = null;
                r82.u(AndroidUtilities.findActivity(mm0Var.getContext()));
                r82.i = false;
                View view = r82.h;
                if (view instanceof org.telegram.ui.Cells.i8) {
                    org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
                    TLRPC.Document sticker = i8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = i8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(i8Var.getSticker(), null, Integer.valueOf(r82.r));
                    org.telegram.ui.dt dtVar = r82.l;
                    r82.r(sticker, stickerPath, findAnimatedEmojiEmoticon, dtVar != null ? dtVar.F(false) : null, null, i18, i8Var.y, i8Var.getParentObject(), r82.c0, 0);
                    i8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.g8) {
                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
                    TLRPC.Document sticker2 = g8Var.getSticker();
                    org.telegram.ui.dt dtVar2 = r82.l;
                    r82.r(sticker2, null, null, dtVar2 != null ? dtVar2.F(false) : null, null, i18, false, g8Var.getParentObject(), u6Var, 0);
                    g8Var.setScaled(true);
                    r82.i = g8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    TLRPC.Document document2 = d2Var.getDocument();
                    org.telegram.ui.dt dtVar3 = r82.l;
                    r82.r(document2, null, null, dtVar3 != null ? dtVar3.F(true) : null, d2Var.getBotInlineResult(), i18, false, d2Var.getBotInlineResult() != null ? d2Var.getInlineBot() : d2Var.getParentObject(), u6Var, 0);
                    if (i18 != 1 || r82.m) {
                        d2Var.setScaled(true);
                    }
                } else if (view instanceof rv) {
                    TLRPC.Document document3 = ((rv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r82.r(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r82.r)), null, null, i18, false, null, u6Var, 0);
                    }
                } else if (view instanceof bz) {
                    c6 span = ((bz) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = t5.f(r82.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r82.r(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r82.r)), null, null, i18, false, null, u6Var, 0);
                    }
                } else {
                    if (!(view instanceof sz0)) {
                        return;
                    }
                    Drawable drawable2 = ((sz0) view).b;
                    TLRPC.Document document5 = drawable2 instanceof t5 ? ((t5) drawable2).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r82.r(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r82.r)), null, null, i18, false, null, u6Var, 0);
                    }
                }
                try {
                    r82.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                org.telegram.ui.dt dtVar4 = r82.l;
                if (dtVar4 != null) {
                    dtVar4.t();
                    return;
                }
                return;
            case 7:
                String str4 = (String) this.c;
                int i19 = this.b;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.d;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) this.e;
                AndroidUtilities.addToClipboard(str4);
                if (i19 == 1) {
                    org.telegram.messenger.vh.m(R.string.PhoneCopied, new wc(k3Var.getContainer(), u6Var2));
                    return;
                } else {
                    new wc(k3Var.getContainer(), u6Var2).k(false).j();
                    return;
                }
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                int i20 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.c;
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.O).checkCanOpenChat(bundle, cyVar)) {
                    launchActivity.v0(new org.telegram.ui.un(bundle), true, false);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.lb0 lb0Var = (org.telegram.ui.lb0) this.d;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                int i21 = this.b;
                String str5 = (String) this.c;
                lb0Var.c();
                if (i21 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i21 != 0) {
                        if (i21 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i21 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i21, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.G = true;
                        notificationsCustomSettingsActivity.m0(false);
                        lb0Var.u(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str5)) {
                            lb0Var.x("showRow");
                        }
                        if ("new".equalsIgnoreCase(str5)) {
                            lb0Var.x("newRow");
                        }
                        if ("important".equalsIgnoreCase(str5)) {
                            lb0Var.x("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str5)) {
                            lb0Var.x("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str5)) {
                            lb0Var.x("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str5)) {
                            lb0Var.x("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str5)) {
                            lb0Var.x("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str5)) {
                            lb0Var.x("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str5)) {
                            lb0Var.x("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str5)) {
                            lb0Var.x("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str5)) {
                            lb0Var.x("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str5)) {
                            lb0Var.x("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str5)) {
                            lb0Var.x("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str5)) {
                            return;
                        }
                        lb0Var.x("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i21, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.G = true;
                notificationsCustomSettingsActivity2.m0(false);
                lb0Var.u(notificationsCustomSettingsActivity2, false);
                if ("show".equalsIgnoreCase(str5)) {
                }
                if ("new".equalsIgnoreCase(str5)) {
                }
                if ("important".equalsIgnoreCase(str5)) {
                }
                if ("messages".equalsIgnoreCase(str5)) {
                }
                if ("stories".equalsIgnoreCase(str5)) {
                }
                if ("preview".equalsIgnoreCase(str5)) {
                }
                if ("show-sender".equalsIgnoreCase(str5)) {
                }
                if ("sound".equalsIgnoreCase(str5)) {
                }
                if ("add-exception".equalsIgnoreCase(str5)) {
                }
                if ("delete-exceptions".equalsIgnoreCase(str5)) {
                }
                if ("light-color".equalsIgnoreCase(str5)) {
                }
                if ("vibrate".equalsIgnoreCase(str5)) {
                }
                if ("popup".equalsIgnoreCase(str5)) {
                }
                if ("priority".equalsIgnoreCase(str5)) {
                }
            case 10:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.d;
                View view2 = (View) this.e;
                String str6 = (String) this.c;
                int i22 = this.b;
                ArrayList arrayList9 = notificationsCustomSettingsActivity3.I;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.ga)) {
                    notificationsCustomSettingsActivity3.m0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str6, 0), iArr.length - 1, 0)]);
                if (i22 >= 0 && i22 < arrayList9.size()) {
                    ((org.telegram.ui.ik0) arrayList9.get(i22)).f = string;
                }
                ((org.telegram.ui.Cells.ga) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 11:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.e;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                int i23 = this.b;
                org.telegram.ui.dl0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (a1Var != null) {
                    boolean z11 = org.telegram.ui.web.a1.Q0;
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
                ConnectionsManager.getInstance(i23).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 12:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.d;
                TL_account.Passkey passkey = (TL_account.Passkey) this.e;
                String str7 = (String) this.c;
                int i24 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ag.k0(passkeysActivity, passkey, str7, i24, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.e;
                int i25 = this.b;
                String str8 = (String) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    try {
                        bf.c cVar = new bf.c(ApplicationLoader.applicationContext);
                        cVar.c(0);
                        cVar.b(0);
                        cVar.b = false;
                        bVar = cVar.a();
                        if (bVar.c.k()) {
                            k6.c cVar2 = new k6.c(28);
                            Bitmap bitmap2 = bitmapHolder.bitmap;
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            cVar2.d = bitmap2;
                            a3.l lVar = (a3.l) cVar2.b;
                            lVar.a = width;
                            lVar.b = height;
                            lVar.c = i25;
                            if (bVar.e1(cVar2).size() == 0) {
                                r6 = false;
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.d80(photoViewer, str8, r6, 7));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.oe0(photoViewer, bitmapHolder, str8, 20));
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
            case 14:
                org.telegram.ui.ts0 ts0Var = (org.telegram.ui.ts0) this.d;
                FrameLayout frameLayout = (FrameLayout) this.e;
                a0.h hVar = (a0.h) this.c;
                wc.v(ts0Var.c1.y, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 15:
                g5.e0(this.b, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.r2) this.e, (TLRPC.TL_payments_assignPlayMarketTransaction) this.c, new Object[0]);
                return;
            case 16:
                id1 id1Var = (id1) this.d;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.e;
                int i26 = this.b;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.c;
                id1Var.getClass();
                int i27 = 0;
                while (i27 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i27).id == i26) {
                        tL_messageMediaToDo.todo.list.remove(i27);
                        i27--;
                    }
                    i27++;
                }
                int i28 = 0;
                while (i28 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i28).id == i26) {
                        tL_messageMediaToDo.completions.remove(i28);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i28--;
                    }
                    i28++;
                }
                id1Var.G.messageOwner.media = tL_messageMediaToDo;
                unVar.getSendMessagesHelper().editMessage(id1Var.G, null, null, null, null, null, null, false, false, null);
                unVar.jd(false);
                id1Var.c(false);
                return;
            case 17:
                od1 od1Var = (od1) this.d;
                int i29 = this.b;
                ArrayList arrayList10 = (ArrayList) this.e;
                ArrayList arrayList11 = (ArrayList) this.c;
                pd1 pd1Var = od1Var.h;
                ArrayList arrayList12 = od1Var.d;
                ArrayList arrayList13 = od1Var.c;
                if (i29 != od1Var.f) {
                    return;
                }
                arrayList13.clear();
                arrayList12.clear();
                if (arrayList10 != null) {
                    arrayList13.addAll(arrayList10);
                    arrayList12.addAll(arrayList11);
                }
                od1Var.l();
                if (arrayList13.isEmpty()) {
                    pd1Var.r.setVisibility(0);
                    return;
                } else {
                    pd1Var.r.setVisibility(8);
                    return;
                }
            case 18:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.d;
                uc.u uVar = (uc.u) this.e;
                int i30 = this.b;
                String str9 = (String) this.c;
                if (z0Var.c(uVar, i30)) {
                    z0Var.f(str9);
                    return;
                }
                z0Var.d("ignoring stale socket callback; attempt=" + i30 + ", " + str9);
                return;
            case 19:
                org.telegram.ui.Wallet.y0 y0Var = (org.telegram.ui.Wallet.y0) this.d;
                uc.u uVar2 = (uc.u) this.e;
                int i31 = this.b;
                JSONObject jSONObject2 = (JSONObject) this.c;
                org.telegram.ui.Wallet.z0 z0Var2 = y0Var.c;
                if (z0Var2.c(uVar2, i31)) {
                    org.telegram.ui.Wallet.l0 l0Var = z0Var2.c;
                    String str10 = z0Var2.b;
                    cy0 cy0Var = z0Var2.p;
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
                            AndroidUtilities.cancelRunOnUIThread(cy0Var);
                            AndroidUtilities.runOnUIThread(cy0Var, 15000L);
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
                    if (!"account_state_change".equals(optString2) || org.telegram.ui.Wallet.l0.a(str10, jSONObject2.optString("account"))) {
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
                        if (str10 == null || (optJSONArray = jSONObject2.optJSONArray("transactions")) == null) {
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i32 = 0; i32 < optJSONArray.length(); i32++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i32);
                            if (optJSONObject2 != null && org.telegram.ui.Wallet.l0.a(str10, optJSONObject2.optString("account"))) {
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
            case 20:
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) this.d;
                int i33 = this.b;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.e;
                di.x7 x7Var = (di.x7) this.c;
                SendMessagesHelper.getInstance(a1Var2.M).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(a1Var2.M).getCurrentUser(), a1Var2.U.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("status", "sent");
                    org.telegram.ui.web.a1.w(i33, x0Var, x7Var, "phone_requested", jSONObject4);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 21:
                rg.k1 k1Var = (rg.k1) this.d;
                rg.f1 f1Var = (rg.f1) this.e;
                int i34 = this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = k1Var.c;
                boolean z12 = f1Var != null;
                k1Var.d = z12;
                if (!z12 || i34 < 0 || i34 >= arrayList15.size()) {
                    k1Var.i = arrayList14;
                } else {
                    k1Var.a++;
                    ((rg.j1) arrayList15.get(i34)).c++;
                    k1Var.g.edit().putInt(ic.a.i(i34, "score"), ((rg.j1) arrayList15.get(i34)).c).putInt("scoreall", k1Var.a).apply();
                    k1Var.i = null;
                }
                k1Var.e.run(f1Var);
                return;
            case 22:
                a();
                return;
            case 23:
                sg.p2 p2Var = (sg.p2) this.d;
                p2Var.m((Bitmap) this.e, this.b, p2Var.T, p2Var.U, (org.telegram.ui.dr0) this.c);
                return;
            default:
                tg.j0.R((tg.j0) this.d, (ArrayList) this.e, this.b, (TLRPC.TL_messages_inactiveChats) this.c);
                return;
        }
    }

    public /* synthetic */ zr0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ zr0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = obj3;
    }

    public /* synthetic */ zr0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = i10;
    }

    public /* synthetic */ zr0(String str, int i10, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = 7;
        this.c = str;
        this.b = i10;
        this.d = k3Var;
        this.e = u6Var;
    }

    public /* synthetic */ zr0(tz0 tz0Var, int i10, String str, ArrayList arrayList) {
        this.a = 3;
        this.d = tz0Var;
        this.b = i10;
        this.c = str;
        this.e = arrayList;
    }
}
