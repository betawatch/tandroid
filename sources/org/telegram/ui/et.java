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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class et implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ et(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.b = i10;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [org.telegram.ui.rt] */
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
        boolean z10 = true;
        boolean z11 = false;
        switch (this.a) {
            case 0:
                ?? r82 = (rt) this.d;
                org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) this.e;
                int i10 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                if (r82.j == null) {
                    return;
                }
                rl0Var.setOnItemClickListener((org.telegram.ui.Components.hl0) null);
                rl0Var.requestDisallowInterceptTouchEvent(true);
                r82.j = null;
                r82.w(AndroidUtilities.findActivity(rl0Var.getContext()));
                r82.i = false;
                View view = r82.h;
                if (view instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) view;
                    TLRPC.Document sticker = c8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = c8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(c8Var.getSticker(), null, Integer.valueOf(r82.r));
                    pt ptVar = r82.l;
                    r82.t(sticker, stickerPath, findAnimatedEmojiEmoticon, ptVar != null ? ptVar.G(false) : null, null, i10, c8Var.y, c8Var.getParentObject(), r82.c0, 0);
                    c8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.a8) {
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) view;
                    TLRPC.Document sticker2 = a8Var.getSticker();
                    pt ptVar2 = r82.l;
                    r82.t(sticker2, null, null, ptVar2 != null ? ptVar2.G(false) : null, null, i10, false, a8Var.getParentObject(), f6Var, 0);
                    a8Var.setScaled(true);
                    r82.i = a8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    TLRPC.Document document2 = d2Var.getDocument();
                    pt ptVar3 = r82.l;
                    r82.t(document2, null, null, ptVar3 != null ? ptVar3.G(true) : null, d2Var.getBotInlineResult(), i10, false, d2Var.getBotInlineResult() != null ? d2Var.getInlineBot() : d2Var.getParentObject(), f6Var, 0);
                    if (i10 != 1 || r82.m) {
                        d2Var.setScaled(true);
                    }
                } else if (view instanceof org.telegram.ui.Components.cv) {
                    TLRPC.Document document3 = ((org.telegram.ui.Components.cv) view).getDocument();
                    if (document3 == null) {
                        return;
                    } else {
                        r82.t(document3, null, MessageObject.findAnimatedEmojiEmoticon(document3, null, Integer.valueOf(r82.r)), null, null, i10, false, null, f6Var, 0);
                    }
                } else if (view instanceof org.telegram.ui.Components.sy) {
                    org.telegram.ui.Components.u5 span = ((org.telegram.ui.Components.sy) view).getSpan();
                    if (span != null) {
                        TLRPC.Document document4 = span.document;
                        if (document4 == null) {
                            document4 = org.telegram.ui.Components.l5.f(r82.r, span.getDocumentId());
                        }
                        document = document4;
                    } else {
                        document = null;
                    }
                    if (document == null) {
                        return;
                    } else {
                        r82.t(document, null, MessageObject.findAnimatedEmojiEmoticon(document, null, Integer.valueOf(r82.r)), null, null, i10, false, null, f6Var, 0);
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
                        r82.t(document5, null, MessageObject.findAnimatedEmojiEmoticon(document5, null, Integer.valueOf(r82.r)), null, null, i10, false, null, f6Var, 0);
                    }
                }
                try {
                    r82.h.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                pt ptVar4 = r82.l;
                if (ptVar4 != null) {
                    ptVar4.t();
                    return;
                }
                return;
            case 1:
                String str = (String) this.d;
                int i11 = this.b;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.e;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.c;
                AndroidUtilities.addToClipboard(str);
                if (i11 == 1) {
                    b.m(R.string.PhoneCopied, new org.telegram.ui.Components.qc(g3Var.getContainer(), f6Var2));
                    return;
                } else {
                    new org.telegram.ui.Components.qc(g3Var.getContainer(), f6Var2).k(false).j();
                    return;
                }
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                int i12 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                qy qyVar = (qy) this.c;
                Pattern pattern = LaunchActivity.y1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.L).checkCanOpenChat(bundle, qyVar)) {
                    launchActivity.q0(new zn(bundle), true, false);
                    return;
                }
                return;
            case 3:
                yb0 yb0Var = (yb0) this.d;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                int i13 = this.b;
                String str2 = (String) this.c;
                yb0Var.a();
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
                        yb0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            yb0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            yb0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            yb0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            yb0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            yb0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            yb0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            yb0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            yb0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            yb0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            yb0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            yb0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            yb0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            yb0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        yb0Var.o("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i13, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.D = true;
                notificationsCustomSettingsActivity2.l0(false);
                yb0Var.n(notificationsCustomSettingsActivity2, false);
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
                if (!(view2 instanceof org.telegram.ui.Cells.z9)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    return;
                }
                String string = LocaleController.getString(iArr[Utilities.clamp(notificationsCustomSettingsActivity3.getNotificationsSettings().getInt(str3, 0), iArr.length - 1, 0)]);
                if (i14 >= 0 && i14 < arrayList4.size()) {
                    ((fk0) arrayList4.get(i14)).f = string;
                }
                ((org.telegram.ui.Cells.z9) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.e;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                int i15 = this.b;
                zk0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (c1Var != null) {
                    boolean z12 = org.telegram.ui.web.c1.M0;
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gg.a0(passkeysActivity, passkey, str4, i16, 8));
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
                            af.d dVar = new af.d(15);
                            Bitmap bitmap = bitmapHolder.bitmap;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            dVar.d = bitmap;
                            e8.a aVar = (e8.a) dVar.b;
                            aVar.a = width;
                            aVar.b = height;
                            aVar.c = i17;
                            if (cVar.L(dVar).size() == 0) {
                                z4 = false;
                            }
                            AndroidUtilities.runOnUIThread(new cr0((Object) photoViewer, (Object) str5, z4, (int) (z11 ? 1 : 0)));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new jf0(photoViewer, bitmapHolder, str5, 17));
                        }
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            r5.J();
                        }
                        throw th2;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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
                yd1 yd1Var = (yd1) this.d;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.e;
                int i18 = this.b;
                zn znVar = (zn) this.c;
                yd1Var.getClass();
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
                yd1Var.D.messageOwner.media = tL_messageMediaToDo;
                znVar.getSendMessagesHelper().editMessage(yd1Var.D, null, null, null, null, null, null, false, false, null);
                znVar.Wc(false);
                yd1Var.c(false);
                return;
            case 11:
                fe1 fe1Var = (fe1) this.d;
                int i21 = this.b;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.c;
                ge1 ge1Var = fe1Var.h;
                ArrayList arrayList7 = fe1Var.d;
                ArrayList arrayList8 = fe1Var.c;
                if (i21 != fe1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                fe1Var.l();
                if (arrayList8.isEmpty()) {
                    ge1Var.r.setVisibility(0);
                    return;
                } else {
                    ge1Var.r.setVisibility(8);
                    return;
                }
            case 12:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) this.d;
                int i22 = this.b;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.e;
                nh.j7 j7Var = (nh.j7) this.c;
                SendMessagesHelper.getInstance(c1Var2.J).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(c1Var2.J).getCurrentUser(), c1Var2.R.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", "sent");
                    org.telegram.ui.web.c1.x(i22, y0Var, j7Var, "phone_requested", jSONObject2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71(MessagesStorage.getInstance(this.b).getUsers((ArrayList) this.d), (HashMap) this.e, (Utilities.Callback) this.c, 20));
                return;
            case 14:
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.e;
                int i23 = this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                if (userFull == null) {
                    rVar.run(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    rh.w3.b(i23, user, userFull, rVar);
                    return;
                }
            case 15:
                tf.z zVar = (tf.z) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                int i24 = this.b;
                org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) this.c;
                ArrayList arrayList10 = zVar.H;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - zVar.k0 < 300) {
                    return;
                }
                zVar.k0 = elapsedRealtime;
                int size = arrayList10.size();
                int size2 = arrayList9.size();
                int i25 = (arrayList9.isEmpty() && arrayList10.isEmpty()) ? 0 : size2 + size;
                int min = Math.min(3, size2) + size;
                int h = zVar.h();
                boolean z13 = zVar.D0;
                boolean z14 = h > ((z13 ? min : i25) + i24) + 1;
                f2.l lVar = zVar.f0;
                if (lVar != null) {
                    lVar.c = z14 ? 45L : 200L;
                    lVar.d = z14 ? 80L : 200L;
                    lVar.l = z14 ? 270L : 0L;
                }
                zVar.D0 = !z13;
                t3Var.setRightTextMargin(16);
                String string2 = LocaleController.getString(zVar.D0 ? R.string.ShowMore : R.string.ShowLess);
                boolean z15 = zVar.D0;
                org.telegram.ui.Cells.s3 s3Var = t3Var.b;
                s3Var.c(string2, true, z15);
                s3Var.setVisibility(0);
                zVar.l0 = null;
                View view3 = (View) t3Var.getParent();
                if (view3 instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view3;
                    int i26 = !zVar.D0 ? i24 + min + 1 : i25 + i24 + 1;
                    int i27 = 0;
                    while (true) {
                        if (i27 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i27);
                            if (RecyclerView.R(childAt) == i26) {
                                zVar.l0 = childAt;
                            } else {
                                i27++;
                            }
                        }
                    }
                }
                int i28 = i24 + min;
                int i29 = i28 + 1;
                int max = Math.max(0, size2 - 3);
                if (zVar.D0) {
                    zVar.t(i29, max);
                    if (z14) {
                        AndroidUtilities.runOnUIThread(new ph.i8(zVar, i28, z10 ? 1 : 0), 350L);
                    } else {
                        zVar.m(i28);
                    }
                } else {
                    zVar.m(i28);
                    zVar.s(i29, max);
                }
                ph.e6 e6Var = zVar.m0;
                if (e6Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(e6Var);
                }
                if (!z14) {
                    zVar.j0 = false;
                    return;
                }
                zVar.j0 = true;
                ph.e6 e6Var2 = new ph.e6(24, zVar, view3);
                zVar.m0 = e6Var2;
                AndroidUtilities.runOnUIThread(e6Var2, 400L);
                return;
            case 16:
                tf.z zVar2 = (tf.z) this.d;
                int i30 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str6 = (String) this.c;
                int i31 = zVar2.p0;
                if (i30 == zVar2.a0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    zVar2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    zVar2.w = messages_messages.next_rate;
                    zVar2.y = str6;
                    MessagesController.getInstance(i31).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i31).putChats(messages_messages.chats, false);
                    for (int i32 = 0; i32 < messages_messages.messages.size(); i32++) {
                        zVar2.x.add(new MessageObject(i31, messages_messages.messages.get(i32), false, true));
                    }
                    cy cyVar = zVar2.R;
                    if (cyVar != null) {
                        cyVar.d(zVar2.A0 > 0, true);
                    }
                    zVar2.l();
                    return;
                }
                return;
            default:
                uf.p1 p1Var = (uf.p1) this.d;
                ArrayList arrayList11 = p1Var.b;
                TLRPC.Message message = (TLRPC.Message) this.e;
                String str7 = (String) this.c;
                int i33 = this.b;
                int i34 = p1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    uf.o1 c3 = p1Var.c(message.quick_reply_shortcut_id);
                    if (c3 == null) {
                        uf.o1 o1Var = new uf.o1();
                        o1Var.a = message.quick_reply_shortcut_id;
                        o1Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i34, message, false, true);
                        o1Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str7 != null) {
                            o1Var.b = str7;
                            p1Var.a(str7);
                        }
                        o1Var.e.applyQuickReply(str7, i33);
                        o1Var.f = 1;
                        arrayList11.add(o1Var);
                        for (int i35 = 0; i35 < arrayList11.size(); i35++) {
                            ((uf.o1) arrayList11.get(i35)).c = i35;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i34);
                        messagesStorage.getStorageQueue().postRunnable(new uf.d0(3, messagesStorage, o1Var));
                        NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i36 = c3.d;
                        int i37 = message.id;
                        if (i36 == i37) {
                            c3.d = i37;
                            MessageObject messageObject2 = new MessageObject(i34, message, false, true);
                            c3.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            p1Var.l();
                            NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c3.f++;
                            p1Var.l();
                            NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str7 == null && i33 == 0) {
                    ArrayList<TLRPC.Message> arrayList12 = new ArrayList<>();
                    arrayList12.add(message);
                    MessagesStorage.getInstance(i34).putMessages(arrayList12, true, true, false, DownloadController.getInstance(i34).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i34).getClientUserId();
                    ArrayList<MessageObject> arrayList13 = new ArrayList<>();
                    arrayList13.add(new MessageObject(i34, message, true, true));
                    MessagesController.getInstance(i34).updateInterfaceWithMessages(clientUserId, arrayList13, 5);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ et(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ et(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = obj3;
    }

    public /* synthetic */ et(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = i10;
    }
}
