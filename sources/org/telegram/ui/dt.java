package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dt(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.b = i10;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [org.telegram.ui.qt] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document document;
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONObject jSONObject;
        h8.c cVar = null;
        ArrayList arrayList3 = null;
        boolean z4 = true;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ?? r92 = (qt) this.d;
                org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) this.e;
                int i10 = this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                if (r92.j == null) {
                    return;
                }
                sl0Var.setOnItemClickListener((org.telegram.ui.Components.il0) null);
                sl0Var.requestDisallowInterceptTouchEvent(true);
                r92.j = null;
                r92.w(AndroidUtilities.findActivity(sl0Var.getContext()));
                r92.i = false;
                View view = r92.h;
                if (view instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                    TLRPC.Document sticker = d8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = d8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(d8Var.getSticker(), null, Integer.valueOf(r92.r));
                    ot otVar = r92.l;
                    r92.t(sticker, stickerPath, findAnimatedEmojiEmoticon, otVar != null ? otVar.F(false) : null, null, i10, d8Var.y, d8Var.getParentObject(), r92.c0, 0);
                    d8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.b8) {
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
                    TLRPC.Document sticker2 = b8Var.getSticker();
                    ot otVar2 = r92.l;
                    r92.t(sticker2, null, null, otVar2 != null ? otVar2.F(false) : null, null, i10, false, b8Var.getParentObject(), g6Var, 0);
                    b8Var.setScaled(true);
                    r92.i = b8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    TLRPC.Document document2 = e2Var.getDocument();
                    ot otVar3 = r92.l;
                    r92.t(document2, null, null, otVar3 != null ? otVar3.F(true) : null, e2Var.getBotInlineResult(), i10, false, e2Var.getBotInlineResult() != null ? e2Var.getInlineBot() : e2Var.getParentObject(), g6Var, 0);
                    if (i10 != 1 || r92.m) {
                        e2Var.setScaled(true);
                    }
                } else if (view instanceof org.telegram.ui.Components.fv) {
                    TLRPC.Document document3 = ((org.telegram.ui.Components.fv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r92.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r92.r)), null, null, i10, false, null, g6Var, 0);
                    }
                } else if (view instanceof org.telegram.ui.Components.uy) {
                    org.telegram.ui.Components.u5 span = ((org.telegram.ui.Components.uy) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = org.telegram.ui.Components.l5.f(r92.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r92.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r92.r)), null, null, i10, false, null, g6Var, 0);
                    }
                } else {
                    if (!(view instanceof org.telegram.ui.Components.py0)) {
                        return;
                    }
                    Drawable drawable = ((org.telegram.ui.Components.py0) view).b;
                    TLRPC.Document document5 = drawable instanceof org.telegram.ui.Components.l5 ? ((org.telegram.ui.Components.l5) drawable).e : null;
                    if (document5 == null) {
                        return;
                    } else {
                        r92.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r92.r)), null, null, i10, false, null, g6Var, 0);
                    }
                }
                try {
                    r92.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                ot otVar4 = r92.l;
                if (otVar4 != null) {
                    otVar4.s();
                    return;
                }
                return;
            case 1:
                String str = (String) this.d;
                int i11 = this.b;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.e;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.c;
                AndroidUtilities.addToClipboard(str);
                if (i11 == 1) {
                    b.m(R.string.PhoneCopied, new org.telegram.ui.Components.qc(h3Var.getContainer(), g6Var2));
                    return;
                } else {
                    new org.telegram.ui.Components.qc(h3Var.getContainer(), g6Var2).k(false).j();
                    return;
                }
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                int i12 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                py pyVar = (py) this.c;
                Pattern pattern = LaunchActivity.y1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.L).checkCanOpenChat(bundle, pyVar)) {
                    launchActivity.q0(new xn(bundle), true, false);
                    return;
                }
                return;
            case 3:
                xb0 xb0Var = (xb0) this.d;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                int i13 = this.b;
                String str2 = (String) this.c;
                xb0Var.a();
                if (i13 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else {
                    if (i13 != 0) {
                        if (i13 == 4) {
                            notificationsSettingsActivity.getClass();
                            arrayList2 = null;
                        } else if (i13 == 3) {
                            arrayList3 = notificationsSettingsActivity.h;
                            arrayList2 = notificationsSettingsActivity.n;
                        } else {
                            arrayList = notificationsSettingsActivity.f;
                        }
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(i13, arrayList3, arrayList2, false);
                        notificationsCustomSettingsActivity.D = true;
                        notificationsCustomSettingsActivity.l0(false);
                        xb0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            xb0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            xb0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            xb0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            xb0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            xb0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            xb0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            xb0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            xb0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            xb0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            xb0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            xb0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            xb0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            xb0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        xb0Var.o("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i13, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.D = true;
                notificationsCustomSettingsActivity2.l0(false);
                xb0Var.n(notificationsCustomSettingsActivity2, false);
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
            case 4:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = (NotificationsCustomSettingsActivity) this.d;
                View view2 = (View) this.e;
                String str3 = (String) this.c;
                int i14 = this.b;
                ArrayList arrayList4 = notificationsCustomSettingsActivity3.F;
                int[] iArr = notificationsCustomSettingsActivity3.y;
                if (!(view2 instanceof org.telegram.ui.Cells.aa)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i14 >= 0 && i14 < arrayList4.size()) {
                    ((fk0) arrayList4.get(i14)).f = string;
                }
                ((org.telegram.ui.Cells.aa) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.e;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                int i15 = this.b;
                zk0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (a1Var != null) {
                    boolean z11 = org.telegram.ui.web.a1.J0;
                    try {
                        jSONObject = new JSONObject();
                    } catch (Exception unused2) {
                        jSONObject = null;
                    }
                    a1Var.v("oauth_result_failed", jSONObject);
                }
                if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                    return;
                }
                TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                ConnectionsManager.getInstance(i15).sendRequest(tL_messages_declineUrlAuth, null);
                return;
            case 6:
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.d;
                TL_account.Passkey passkey = (TL_account.Passkey) this.e;
                String str4 = (String) this.c;
                int i16 = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.PasskeyDeleteTitle);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.PasskeyDeleteText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hg.a0(passkeysActivity, passkey, str4, i16, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                ImageReceiver.BitmapHolder bitmapHolder = (ImageReceiver.BitmapHolder) this.e;
                int i17 = this.b;
                String str5 = (String) this.c;
                Drawable[] drawableArr = PhotoViewer.Q8;
                try {
                    try {
                        h8.b bVar = new h8.b(ApplicationLoader.applicationContext);
                        bVar.c(0);
                        bVar.b(0);
                        bVar.c = false;
                        cVar = bVar.a();
                        if (cVar.c.k()) {
                            androidx.biometric.e eVar = new androidx.biometric.e(15);
                            Bitmap bitmap = bitmapHolder.bitmap;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            eVar.d = bitmap;
                            e8.a aVar = (e8.a) eVar.b;
                            aVar.a = width;
                            aVar.b = height;
                            aVar.c = i17;
                            if (cVar.L(eVar).size() == 0) {
                                z4 = false;
                            }
                            AndroidUtilities.runOnUIThread(new cr0((Object) photoViewer, (Object) str5, z4, (int) (z10 ? 1 : 0)));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new if0(photoViewer, bitmapHolder, str5, 17));
                        }
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            r6.J();
                        }
                        throw th2;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                    if (0 == 0) {
                        return;
                    }
                }
                cVar.J();
                return;
            case 8:
                rs0 rs0Var = (rs0) this.d;
                FrameLayout frameLayout = (FrameLayout) this.e;
                a0.h hVar = (a0.h) this.c;
                org.telegram.ui.Components.qc.v(rs0Var.a1.y, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 9:
                org.telegram.ui.Components.z4.f0(this.b, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.p2) this.e, (TLRPC.TL_payments_assignPlayMarketTransaction) this.c, new Object[0]);
                return;
            case 10:
                zd1 zd1Var = (zd1) this.d;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.e;
                int i18 = this.b;
                xn xnVar = (xn) this.c;
                zd1Var.getClass();
                int i19 = 0;
                while (i19 < tL_messageMediaToDo.todo.list.size()) {
                    if (tL_messageMediaToDo.todo.list.get(i19).id == i18) {
                        tL_messageMediaToDo.todo.list.remove(i19);
                        i19--;
                    }
                    i19++;
                }
                int i20 = 0;
                while (i20 < tL_messageMediaToDo.completions.size()) {
                    if (tL_messageMediaToDo.completions.get(i20).id == i18) {
                        tL_messageMediaToDo.completions.remove(i20);
                        if (tL_messageMediaToDo.completions.isEmpty()) {
                            tL_messageMediaToDo.flags &= -2;
                        }
                        i20--;
                    }
                    i20++;
                }
                zd1Var.D.messageOwner.media = tL_messageMediaToDo;
                xnVar.getSendMessagesHelper().editMessage(zd1Var.D, null, null, null, null, null, null, false, false, null);
                xnVar.Wc(false);
                zd1Var.c(false);
                return;
            case 11:
                ge1 ge1Var = (ge1) this.d;
                int i21 = this.b;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.c;
                he1 he1Var = ge1Var.h;
                ArrayList arrayList7 = ge1Var.d;
                ArrayList arrayList8 = ge1Var.c;
                if (i21 != ge1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                ge1Var.l();
                if (arrayList8.isEmpty()) {
                    he1Var.r.setVisibility(0);
                    return;
                } else {
                    he1Var.r.setVisibility(8);
                    return;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n71(MessagesStorage.getInstance(this.b).getUsers((ArrayList) this.d), (HashMap) this.e, (Utilities.Callback) this.c, 21));
                return;
            case 13:
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.e;
                int i22 = this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                if (userFull == null) {
                    sVar.run(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    sh.w3.b(i22, user, userFull, sVar);
                    return;
                }
            case 14:
                uf.z zVar = (uf.z) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                int i23 = this.b;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.c;
                ArrayList arrayList10 = zVar.H;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - zVar.k0 < 300) {
                    return;
                }
                zVar.k0 = elapsedRealtime;
                int size = arrayList10.size();
                int size2 = arrayList9.size();
                int i24 = (arrayList9.isEmpty() && arrayList10.isEmpty()) ? 0 : size2 + size;
                int min = Math.min(3, size2) + size;
                int h = zVar.h();
                boolean z12 = zVar.D0;
                boolean z13 = h > ((z12 ? min : i24) + i23) + 1;
                f2.l lVar = zVar.f0;
                if (lVar != null) {
                    lVar.c = z13 ? 45L : 200L;
                    lVar.d = z13 ? 80L : 200L;
                    lVar.l = z13 ? 270L : 0L;
                }
                zVar.D0 = !z12;
                u3Var.setRightTextMargin(16);
                String string2 = LocaleController.getString(zVar.D0 ? R.string.ShowMore : R.string.ShowLess);
                boolean z14 = zVar.D0;
                org.telegram.ui.Cells.t3 t3Var = u3Var.b;
                t3Var.c(string2, true, z14);
                t3Var.setVisibility(0);
                zVar.l0 = null;
                View view3 = (View) u3Var.getParent();
                if (view3 instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view3;
                    int i25 = !zVar.D0 ? i23 + min + 1 : i24 + i23 + 1;
                    int i26 = 0;
                    while (true) {
                        if (i26 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i26);
                            if (RecyclerView.R(childAt) == i25) {
                                zVar.l0 = childAt;
                            } else {
                                i26++;
                            }
                        }
                    }
                }
                int i27 = i23 + min;
                int i28 = i27 + 1;
                int max = Math.max(0, size2 - 3);
                if (zVar.D0) {
                    zVar.t(i28, max);
                    if (z13) {
                        AndroidUtilities.runOnUIThread(new qh.d8(zVar, i27, 2), 350L);
                    } else {
                        zVar.m(i27);
                    }
                } else {
                    zVar.m(i27);
                    zVar.s(i28, max);
                }
                qh.l6 l6Var = zVar.m0;
                if (l6Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(l6Var);
                }
                if (!z13) {
                    zVar.j0 = false;
                    return;
                }
                zVar.j0 = true;
                qh.l6 l6Var2 = new qh.l6(24, zVar, view3);
                zVar.m0 = l6Var2;
                AndroidUtilities.runOnUIThread(l6Var2, 400L);
                return;
            case 15:
                uf.z zVar2 = (uf.z) this.d;
                int i29 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str6 = (String) this.c;
                int i30 = zVar2.p0;
                if (i29 == zVar2.a0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    zVar2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    zVar2.w = messages_messages.next_rate;
                    zVar2.y = str6;
                    MessagesController.getInstance(i30).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i30).putChats(messages_messages.chats, false);
                    for (int i31 = 0; i31 < messages_messages.messages.size(); i31++) {
                        zVar2.x.add(new MessageObject(i30, messages_messages.messages.get(i31), false, true));
                    }
                    ay ayVar = zVar2.R;
                    if (ayVar != null) {
                        ayVar.d(zVar2.A0 > 0, true);
                    }
                    zVar2.l();
                    return;
                }
                return;
            default:
                vf.p1 p1Var = (vf.p1) this.d;
                ArrayList arrayList11 = p1Var.b;
                TLRPC.Message message = (TLRPC.Message) this.e;
                String str7 = (String) this.c;
                int i32 = this.b;
                int i33 = p1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    vf.o1 c3 = p1Var.c(message.quick_reply_shortcut_id);
                    if (c3 == null) {
                        vf.o1 o1Var = new vf.o1();
                        o1Var.a = message.quick_reply_shortcut_id;
                        o1Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i33, message, false, true);
                        o1Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str7 != null) {
                            o1Var.b = str7;
                            p1Var.a(str7);
                        }
                        o1Var.e.applyQuickReply(str7, i32);
                        o1Var.f = 1;
                        arrayList11.add(o1Var);
                        for (int i34 = 0; i34 < arrayList11.size(); i34++) {
                            ((vf.o1) arrayList11.get(i34)).c = i34;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i33);
                        messagesStorage.getStorageQueue().postRunnable(new vf.k0(2, messagesStorage, o1Var));
                        NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i35 = c3.d;
                        int i36 = message.id;
                        if (i35 == i36) {
                            c3.d = i36;
                            MessageObject messageObject2 = new MessageObject(i33, message, false, true);
                            c3.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            p1Var.l();
                            NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c3.f++;
                            p1Var.l();
                            NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str7 == null && i32 == 0) {
                    ArrayList<TLRPC.Message> arrayList12 = new ArrayList<>();
                    arrayList12.add(message);
                    MessagesStorage.getInstance(i33).putMessages(arrayList12, true, true, false, DownloadController.getInstance(i33).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i33).getClientUserId();
                    ArrayList<MessageObject> arrayList13 = new ArrayList<>();
                    arrayList13.add(new MessageObject(i33, message, true, true));
                    MessagesController.getInstance(i33).updateInterfaceWithMessages(clientUserId, arrayList13, 5);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ dt(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ dt(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = obj3;
    }

    public /* synthetic */ dt(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = i10;
    }
}
