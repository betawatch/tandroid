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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ct(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.b = i10;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [org.telegram.ui.pt] */
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
                ?? r82 = (pt) this.d;
                org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) this.e;
                int i10 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                if (r82.j == null) {
                    return;
                }
                sl0Var.setOnItemClickListener((org.telegram.ui.Components.il0) null);
                sl0Var.requestDisallowInterceptTouchEvent(true);
                r82.j = null;
                r82.w(AndroidUtilities.findActivity(sl0Var.getContext()));
                r82.i = false;
                View view = r82.h;
                if (view instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
                    TLRPC.Document sticker = d8Var.getSticker();
                    SendMessagesHelper.ImportingSticker stickerPath = d8Var.getStickerPath();
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(d8Var.getSticker(), null, Integer.valueOf(r82.r));
                    nt ntVar = r82.l;
                    r82.t(sticker, stickerPath, findAnimatedEmojiEmoticon, ntVar != null ? ntVar.G(false) : null, null, i10, d8Var.y, d8Var.getParentObject(), r82.c0, 0);
                    d8Var.setScaled(true);
                } else if (view instanceof org.telegram.ui.Cells.b8) {
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
                    TLRPC.Document sticker2 = b8Var.getSticker();
                    nt ntVar2 = r82.l;
                    r82.t(sticker2, null, null, ntVar2 != null ? ntVar2.G(false) : null, null, i10, false, b8Var.getParentObject(), f6Var, 0);
                    b8Var.setScaled(true);
                    r82.i = b8Var.h;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    TLRPC.Document document2 = e2Var.getDocument();
                    nt ntVar3 = r82.l;
                    r82.t(document2, null, null, ntVar3 != null ? ntVar3.G(true) : null, e2Var.getBotInlineResult(), i10, false, e2Var.getBotInlineResult() != null ? e2Var.getInlineBot() : e2Var.getParentObject(), f6Var, 0);
                    if (i10 != 1 || r82.m) {
                        e2Var.setScaled(true);
                    }
                } else if (view instanceof org.telegram.ui.Components.dv) {
                    TLRPC.Document document3 = ((org.telegram.ui.Components.dv) view).getDocument();
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
                nt ntVar4 = r82.l;
                if (ntVar4 != null) {
                    ntVar4.t();
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
                oy oyVar = (oy) this.c;
                Pattern pattern = LaunchActivity.y1;
                launchActivity.getClass();
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                bundle.putLong("chat_id", chat.id);
                if (MessagesController.getInstance(launchActivity.L).checkCanOpenChat(bundle, oyVar)) {
                    launchActivity.q0(new xn(bundle), true, false);
                    return;
                }
                return;
            case 3:
                wb0 wb0Var = (wb0) this.d;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                int i13 = this.b;
                String str2 = (String) this.c;
                wb0Var.a();
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
                        wb0Var.n(notificationsCustomSettingsActivity, false);
                        if ("show".equalsIgnoreCase(str2)) {
                            wb0Var.o("showRow");
                        }
                        if ("new".equalsIgnoreCase(str2)) {
                            wb0Var.o("newRow");
                        }
                        if ("important".equalsIgnoreCase(str2)) {
                            wb0Var.o("importantRow");
                        }
                        if ("messages".equalsIgnoreCase(str2)) {
                            wb0Var.o("messagesRow");
                        }
                        if ("stories".equalsIgnoreCase(str2)) {
                            wb0Var.o("storiesRow");
                        }
                        if ("preview".equalsIgnoreCase(str2)) {
                            wb0Var.o("previewRow");
                        }
                        if ("show-sender".equalsIgnoreCase(str2)) {
                            wb0Var.o("showSenderRow");
                        }
                        if ("sound".equalsIgnoreCase(str2)) {
                            wb0Var.o("soundRow");
                        }
                        if ("add-exception".equalsIgnoreCase(str2)) {
                            wb0Var.o("addExceptionRow");
                        }
                        if ("delete-exceptions".equalsIgnoreCase(str2)) {
                            wb0Var.o("deleteExceptionsRow");
                        }
                        if ("light-color".equalsIgnoreCase(str2)) {
                            wb0Var.o("lightColorRow");
                        }
                        if ("vibrate".equalsIgnoreCase(str2)) {
                            wb0Var.o("vibrateRow");
                        }
                        if ("popup".equalsIgnoreCase(str2)) {
                            wb0Var.o("popupRow");
                        }
                        if ("priority".equalsIgnoreCase(str2)) {
                            return;
                        }
                        wb0Var.o("priorityRow");
                        return;
                    }
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList3 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(i13, arrayList3, arrayList2, false);
                notificationsCustomSettingsActivity2.D = true;
                notificationsCustomSettingsActivity2.l0(false);
                wb0Var.n(notificationsCustomSettingsActivity2, false);
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
                    ((dk0) arrayList4.get(i14)).f = string;
                }
                ((org.telegram.ui.Cells.aa) view2).c(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.d;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.e;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.c;
                int i15 = this.b;
                xk0.a = null;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                if (a1Var != null) {
                    boolean z12 = org.telegram.ui.web.a1.J0;
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
                            AndroidUtilities.runOnUIThread(new vq0((Object) photoViewer, (Object) str5, z4, (int) (z11 ? 1 : 0)));
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("face detection is not operational");
                            }
                            AndroidUtilities.runOnUIThread(new hf0(photoViewer, bitmapHolder, str5, 17));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        if (0 == 0) {
                            return;
                        }
                    }
                    cVar.J();
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        r5.J();
                    }
                    throw th2;
                }
            case 8:
                ks0 ks0Var = (ks0) this.d;
                FrameLayout frameLayout = (FrameLayout) this.e;
                a0.h hVar = (a0.h) this.c;
                org.telegram.ui.Components.qc.v(ks0Var.a1.y, null, frameLayout, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, this.b, -115203550, -1, 1500, false, null).j();
                return;
            case 9:
                org.telegram.ui.Components.z4.f0(this.b, (TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.p2) this.e, (TLRPC.TL_payments_assignPlayMarketTransaction) this.c, new Object[0]);
                return;
            case 10:
                rd1 rd1Var = (rd1) this.d;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.e;
                int i18 = this.b;
                xn xnVar = (xn) this.c;
                rd1Var.getClass();
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
                rd1Var.D.messageOwner.media = tL_messageMediaToDo;
                xnVar.getSendMessagesHelper().editMessage(rd1Var.D, null, null, null, null, null, null, false, false, null);
                xnVar.Wc(false);
                rd1Var.c(false);
                return;
            case 11:
                xd1 xd1Var = (xd1) this.d;
                int i21 = this.b;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.c;
                yd1 yd1Var = xd1Var.h;
                ArrayList arrayList7 = xd1Var.d;
                ArrayList arrayList8 = xd1Var.c;
                if (i21 != xd1Var.f) {
                    return;
                }
                arrayList8.clear();
                arrayList7.clear();
                if (arrayList5 != null) {
                    arrayList8.addAll(arrayList5);
                    arrayList7.addAll(arrayList6);
                }
                xd1Var.l();
                if (arrayList8.isEmpty()) {
                    yd1Var.r.setVisibility(0);
                    return;
                } else {
                    yd1Var.r.setVisibility(8);
                    return;
                }
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71(MessagesStorage.getInstance(this.b).getUsers((ArrayList) this.d), (HashMap) this.e, (Utilities.Callback) this.c, 21));
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
                    rh.x3.b(i22, user, userFull, sVar);
                    return;
                }
            case 14:
                tf.z zVar = (tf.z) this.d;
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
                boolean z13 = zVar.D0;
                boolean z14 = h > ((z13 ? min : i24) + i23) + 1;
                f2.l lVar = zVar.f0;
                if (lVar != null) {
                    lVar.c = z14 ? 45L : 200L;
                    lVar.d = z14 ? 80L : 200L;
                    lVar.l = z14 ? 270L : 0L;
                }
                zVar.D0 = !z13;
                u3Var.setRightTextMargin(16);
                String string2 = LocaleController.getString(zVar.D0 ? R.string.ShowMore : R.string.ShowLess);
                boolean z15 = zVar.D0;
                org.telegram.ui.Cells.t3 t3Var = u3Var.b;
                t3Var.c(string2, true, z15);
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
                    if (z14) {
                        AndroidUtilities.runOnUIThread(new ph.j8(zVar, i27, z10 ? 1 : 0), 350L);
                    } else {
                        zVar.m(i27);
                    }
                } else {
                    zVar.m(i27);
                    zVar.s(i28, max);
                }
                ph.f6 f6Var3 = zVar.m0;
                if (f6Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f6Var3);
                }
                if (!z14) {
                    zVar.j0 = false;
                    return;
                }
                zVar.j0 = true;
                ph.f6 f6Var4 = new ph.f6(22, zVar, view3);
                zVar.m0 = f6Var4;
                AndroidUtilities.runOnUIThread(f6Var4, 400L);
                return;
            case 15:
                tf.z zVar2 = (tf.z) this.d;
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
                    zx zxVar = zVar2.R;
                    if (zxVar != null) {
                        zxVar.d(zVar2.A0 > 0, true);
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
                int i32 = this.b;
                int i33 = p1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    uf.o1 c3 = p1Var.c(message.quick_reply_shortcut_id);
                    if (c3 == null) {
                        uf.o1 o1Var = new uf.o1();
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
                            ((uf.o1) arrayList11.get(i34)).c = i34;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i33);
                        messagesStorage.getStorageQueue().postRunnable(new uf.v0(1, messagesStorage, o1Var));
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

    public /* synthetic */ ct(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ct(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = obj3;
    }

    public /* synthetic */ ct(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = i10;
    }
}
