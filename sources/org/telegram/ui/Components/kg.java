package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.webkit.WebResourceRequest;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kg(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    private final void a() {
        dz0 dz0Var = (dz0) this.b;
        String str = (String) this.d;
        SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.c;
        if (dz0Var.isDismissed()) {
            return;
        }
        dz0Var.Z.remove(str);
        if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
            importingSticker.validated = true;
            int indexOf = dz0Var.Y.indexOf(importingSticker);
            if (indexOf >= 0) {
                s4.e1 K = dz0Var.c.K(indexOf);
                if (K != null) {
                    ((org.telegram.ui.Cells.i8) K.a).setSticker(importingSticker);
                }
            } else {
                dz0Var.d.l();
            }
        } else {
            dz0Var.w0(importingSticker);
        }
        if (dz0Var.Z.isEmpty()) {
            dz0Var.D0();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:347|348|349)|344|345) */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0860, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0861, code lost:
    
        r16 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029a A[LOOP:5: B:127:0x0228->B:143:0x029a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0898  */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r2v13 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        String str;
        TLRPC.User user;
        Bitmap bitmap;
        int i10;
        int i11;
        int i12;
        JSONObject optJSONObject;
        String optString;
        et0 et0Var;
        long peerId;
        org.telegram.ui.ActionBar.r2 r2Var;
        ?? r02;
        int i13;
        boolean z10;
        String str2;
        int i14 = this.a;
        int i15 = 4;
        String str3 = null;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i14) {
            case 0:
                ng ngVar = (ng) obj3;
                File file = (File) obj;
                try {
                    InputStream openInputStream = ngVar.getContext().getContentResolver().openInputStream((Uri) obj2);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, -1, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(photoEntry);
                            AndroidUtilities.runOnUIThread(new kg(ngVar, arrayList, file, 1));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 1:
                ((ng) obj3).n((File) obj, (ArrayList) obj2);
                return;
            case 2:
                final ti tiVar = (ti) obj3;
                final gh ghVar = (gh) obj;
                final boolean z11 = tiVar.C0.getCurrentItemTop() <= ((li) obj2).getButtonsHideOffset();
                float alpha = tiVar.a1.getAlpha();
                float f7 = z11 ? 1.0f : 0.0f;
                o1.j jVar = new o1.j(new ac.a(0.0f));
                jVar.b(new nh(tiVar, alpha, f7, z11));
                jVar.a(new o1.f() { // from class: org.telegram.ui.Components.oh
                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f10, float f11) {
                        ti.t(ti.this, z11, ghVar);
                    }
                });
                o1.k kVar = new o1.k(500.0f);
                jVar.u = kVar;
                kVar.a(1.0f);
                jVar.u.b(1000.0f);
                jVar.h();
                tiVar.w1 = jVar;
                return;
            case 3:
                ti.n((ti) obj3, (AnimationNotificationsLocker) obj2, (org.telegram.ui.ActionBar.d3) obj);
                return;
            case 4:
                TLObject tLObject = (TLObject) obj2;
                org.telegram.ui.ActionBar.x6 x6Var = (org.telegram.ui.ActionBar.x6) obj;
                HashMap hashMap = ((xp) obj3).s;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    x6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, x6Var);
                FileLoader.getInstance(x6Var.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 5:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) obj3;
                i9Var.setText((CharSequence) obj2);
                org.telegram.ui.ActionBar.f7.V(i9Var.getTextView(), org.telegram.ui.ActionBar.y6.B6, (org.telegram.ui.ActionBar.u6) obj);
                return;
            case 6:
                bt btVar = (bt) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                at atVar = (at) obj;
                ArrayList arrayList2 = new ArrayList();
                ArrayList<Long> arrayList3 = new ArrayList<>();
                long j10 = 0;
                try {
                    int i16 = 0;
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    String str4 = null;
                    while (queryFinalized.next()) {
                        try {
                            try {
                                arrayList3.add(Long.valueOf(queryFinalized.longValue(i16)));
                                j10 = Math.max(j10, queryFinalized.longValue(1));
                                str4 = queryFinalized.stringValue(2);
                                i16 = 0;
                            } catch (Exception e) {
                                e = e;
                                sQLiteCursor = queryFinalized;
                                str = str4;
                                try {
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    AndroidUtilities.runOnUIThread(new bi.a0(btVar, arrayList2, j10, str, atVar, 12));
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> users = messagesStorage.getUsers(arrayList3);
                    if (users != null) {
                        int size = arrayList3.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Long l4 = arrayList3.get(i17);
                            i17++;
                            long longValue = l4.longValue();
                            int size2 = users.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size2) {
                                    TLRPC.User user2 = users.get(i18);
                                    i18++;
                                    TLRPC.User user3 = user2;
                                    if (user3 != null) {
                                        str = str4;
                                        try {
                                            if (user3.id == longValue) {
                                                user = user3;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            sQLiteCursor = queryFinalized;
                                            FileLog.e(e);
                                            if (sQLiteCursor != null) {
                                            }
                                            AndroidUtilities.runOnUIThread(new bi.a0(btVar, arrayList2, j10, str, atVar, 12));
                                            return;
                                        }
                                    } else {
                                        str = str4;
                                    }
                                    str4 = str;
                                } else {
                                    str = str4;
                                    user = null;
                                }
                            }
                            if (user != null) {
                                arrayList2.add(user);
                            }
                            str4 = str;
                        }
                    }
                    str = str4;
                    queryFinalized.dispose();
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                    str = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new bi.a0(btVar, arrayList2, j10, str, atVar, 12));
                return;
            case 7:
                e00 e00Var = (e00) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                i00 i00Var = e00Var.J;
                int[] iArr = i00Var.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!i00Var.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i00Var.g(!e00Var.T ? 1 : 0), 0);
                GLES20.glClear(0);
                int i19 = e00Var.U;
                if (i19 == 0 || (i10 = e00Var.V) == 0) {
                    bitmap = null;
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i19 * i10 * 4);
                    GLES20.glReadPixels(0, 0, e00Var.U, e00Var.V, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(e00Var.U, e00Var.V, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 8:
                n10 n10Var = (n10) obj3;
                n10Var.z0 = -1;
                qc M = wc.b0((org.telegram.ui.ActionBar.r2) obj2).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, n10Var.c0), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                n10Var.A0 = true;
                n10Var.dismiss();
                n10Var.n.getMessagesController().invalidateChatlistFolderUpdate(n10Var.Y);
                return;
            case 9:
                n10 n10Var2 = (n10) obj3;
                n10Var2.z0 = n10Var2.n.getConnectionsManager().sendRequest((TLObject) obj2, new org.telegram.ui.z7(16, n10Var2, (Pair) obj));
                return;
            case 10:
                o70 o70Var = (o70) obj3;
                o70Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((org.telegram.ui.ActionBar.r2) obj).presentFragment(new ProfileActivity(bundle, null));
                o70Var.l0 = true;
                return;
            case 11:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                o70 o70Var2 = ((i70) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = o70Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (o70Var2.j0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = o70Var2.d;
                    if (chatFull2 != null) {
                        int i20 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i20;
                        if (i20 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = ((org.telegram.ui.ActionBar.k3) o70Var2).currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(o70Var2.g0, chatFull2.invitesCount);
                    }
                    org.telegram.ui.jb jbVar = o70Var2.j0;
                    if (jbVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = o70Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.wb wbVar = jbVar.a;
                        ArrayList arrayList4 = wbVar.o0;
                        int size3 = arrayList4.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
                        i11 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
                        if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.n0, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f, wbVar.T, true).contentType < 0) {
                            return;
                        }
                        wbVar.S0();
                        int size4 = arrayList4.size() - size3;
                        if (size4 > 0) {
                            wbVar.C0.N = true;
                            org.telegram.ui.sb sbVar = wbVar.E;
                            sbVar.s(sbVar.h, size4);
                            org.telegram.ui.wb.L0(wbVar);
                        }
                        wbVar.y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                z70.O((z70) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 13:
                v70 v70Var = (v70) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                v70Var.h = null;
                v70Var.c = arrayList5;
                v70Var.d = (ArrayList) obj;
                ig.a2 a2Var = v70Var.e;
                a2Var.f(arrayList5, null);
                z70 z70Var = v70Var.n;
                z70Var.J(v70Var.f - 1);
                v70Var.l();
                if (a2Var.e() || v70Var.h() > 2) {
                    return;
                }
                z70Var.s.e(false, true);
                return;
            case 14:
                aa0 aa0Var = (aa0) obj3;
                ba0 ba0Var = (ba0) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                z90 z90Var = aa0Var.h;
                if (z90Var == null || aa0Var.e != ba0Var) {
                    return;
                }
                z90Var.a(clickableSpan);
                aa0Var.e = null;
                aa0Var.b.d(true);
                return;
            case 15:
                sc0 sc0Var = (sc0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.u6 u6Var = sc0Var.c;
                TextView textView = sc0Var.f;
                TextView textView2 = sc0Var.e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        sc0Var.E = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new wc(lb.a(sc0Var.getContext()), u6Var).g0(tL_error2, false);
                    }
                } else if (tLObject3 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject3).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = sc0Var.d.animate().alpha(1.0f);
                ds dsVar = ds.h;
                org.telegram.messenger.wh.q(alpha2, dsVar, 320L);
                sc0Var.h.animate().alpha(0.0f).setInterpolator(dsVar).setDuration(320L).start();
                if (!sc0Var.E) {
                    sc0Var.setBackground(null);
                    sc0Var.setOnClickListener(null);
                    return;
                }
                int i21 = org.telegram.ui.ActionBar.y6.i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i21, u6Var), 6, 0);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i21);
                sc0Var.setBackground(Z);
                org.telegram.ui.ActionBar.f7.k(sc0Var, Z, null, N, u6Var);
                sc0Var.setOnClickListener(new x80(sc0Var, 1));
                return;
            case 16:
                ue0.o((ue0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 17:
                String str5 = (String) obj2;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                org.telegram.ui.xt0 xt0Var = (org.telegram.ui.xt0) ((jg0) obj3).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str5).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + xt0Var.w).put("platform", "DESKTOP"))).put("videoId", xt0Var.w).toString().getBytes("UTF-8"));
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    byte[] bArr2 = new byte[10240];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read2 = inputStream.read(bArr2);
                        if (read2 == -1) {
                            byteArrayOutputStream.close();
                            inputStream.close();
                            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (optString = optJSONObject.optString("spec")) == null) {
                                return;
                            }
                            if (xt0Var.H == 0) {
                                xt0Var.s = optString;
                                return;
                            } else {
                                ng0.a(xt0Var, optString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr2, 0, read2);
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                break;
            case 18:
                oh0.n((oh0) obj3, (nh0) obj2, (TLObject) obj);
                return;
            case 19:
                do0 do0Var = (do0) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList<MessageObject> arrayList7 = (ArrayList) obj;
                int i22 = do0Var.d;
                for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                    DownloadController.getInstance(i22).onDownloadComplete((MessageObject) arrayList6.get(i23));
                }
                if (!arrayList7.isEmpty()) {
                    DownloadController.getInstance(i22).deleteRecentFiles(arrayList7);
                }
                do0Var.O = false;
                do0Var.d(true);
                return;
            case 20:
                xo0 xo0Var = (xo0) obj3;
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj2;
                l80 l80Var = (l80) obj;
                if (UserConfig.getInstance(xo0Var.K0.J0).isPremium()) {
                    eyVar.getMessagesController().disableAds(true);
                    xo0Var.S();
                    wc.b0(eyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new tg.y0((org.telegram.ui.ActionBar.r2) eyVar, 3, true).show();
                }
                l80Var.u();
                return;
            case 21:
                bw0 bw0Var = (bw0) obj3;
                g5.R(bw0Var.getContext(), null, bw0Var.H1, new ks0(bw0Var, (TL_stories.StoryItem) obj2));
                ((l80) obj).u();
                return;
            case 22:
                bw0 bw0Var2 = (bw0) obj3;
                String str6 = (String) obj2;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj;
                du0 du0Var = new du0(bw0Var2.getContext(), str6, str6, bw0Var2.H1, r2Var2);
                if (r2Var2 != null) {
                    r2Var2.showDialog(du0Var);
                    return;
                } else {
                    du0Var.show();
                    return;
                }
            case 23:
                mu0 mu0Var = (mu0) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                bw0 bw0Var3 = mu0Var.n;
                int h = mu0Var.h();
                if (tL_error3 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject4;
                    bw0Var3.x1.getMessagesController().putChats(messages_chats.chats, false);
                    mu0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    mu0Var.d.addAll(messages_chats.chats);
                } else {
                    mu0Var.h = true;
                }
                int i24 = 0;
                while (true) {
                    uu0[] uu0VarArr = bw0Var3.m0;
                    if (i24 >= uu0VarArr.length) {
                        mu0Var.e = false;
                        mu0Var.f = true;
                        mu0Var.l();
                        return;
                    } else {
                        uu0 uu0Var = uu0VarArr[i24];
                        if (uu0Var.E == 6 && (et0Var = uu0Var.h) != null && (mu0Var.f || h == 0)) {
                            bw0Var3.C(et0Var, 0, null);
                        }
                        i24++;
                    }
                }
                break;
            case 24:
                su0 su0Var = (su0) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.ActionBar.r2 r2Var3 = su0Var.s.x1;
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int i25 = 25;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new kg(su0Var, new ArrayList(), new ArrayList(), i25));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i26 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i26];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                int size5 = arrayList8.size();
                int i27 = 0;
                while (i27 < size5) {
                    TLObject tLObject5 = (TLObject) arrayList8.get(i27);
                    if (tLObject5 instanceof TLRPC.ChatParticipant) {
                        peerId = ((TLRPC.ChatParticipant) tLObject5).user_id;
                    } else {
                        if (tLObject5 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject5).peer);
                        }
                        r2Var = r2Var3;
                        i27++;
                        r2Var3 = r2Var;
                    }
                    TLRPC.User user4 = r2Var3.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user4.id != r2Var3.getUserConfig().getClientUserId()) {
                        String lowerCase2 = UserObject.getUserName(user4).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i28 = 0;
                        boolean z12 = false;
                        while (i28 < i26) {
                            String str7 = strArr[i28];
                            if (lowerCase2.startsWith(str7)) {
                                r2Var = r2Var3;
                            } else {
                                r2Var = r2Var3;
                                if (!org.telegram.messenger.wh.u(" ", str7, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str7) && !org.telegram.messenger.wh.u(" ", str7, translitString2)))) {
                                    String publicUsername = UserObject.getPublicUsername(user4);
                                    r02 = (publicUsername == null || !publicUsername.startsWith(str7)) ? z12 : 2;
                                    if (r02 == 0) {
                                        if (r02 == 1) {
                                            arrayList9.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str7));
                                        } else {
                                            arrayList9.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str7));
                                        }
                                        arrayList10.add(tLObject5);
                                        i27++;
                                        r2Var3 = r2Var;
                                    } else {
                                        i28++;
                                        z12 = r02;
                                        r2Var3 = r2Var;
                                    }
                                }
                            }
                            r02 = 1;
                            if (r02 == 0) {
                            }
                        }
                    }
                    r2Var = r2Var3;
                    i27++;
                    r2Var3 = r2Var;
                }
                AndroidUtilities.runOnUIThread(new kg(su0Var, arrayList9, arrayList10, 25));
                return;
            case 25:
                su0 su0Var2 = (su0) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                bw0 bw0Var4 = su0Var2.s;
                if (bw0Var4.X0) {
                    su0Var2.d = arrayList11;
                    su0Var2.r--;
                    if (!ChatObject.isChannel(su0Var2.n)) {
                        ArrayList arrayList13 = su0Var2.e.g;
                        arrayList13.clear();
                        arrayList13.addAll(arrayList12);
                    }
                    if (su0Var2.r == 0) {
                        int i29 = 0;
                        while (true) {
                            uu0[] uu0VarArr2 = bw0Var4.m0;
                            if (i29 < uu0VarArr2.length) {
                                uu0 uu0Var2 = uu0VarArr2[i29];
                                if (uu0Var2.E == 7) {
                                    if (su0Var2.h == 0) {
                                        uu0Var2.v.e(false, true);
                                    } else {
                                        bw0Var4.C(uu0Var2.h, 0, null);
                                    }
                                }
                                i29++;
                            }
                        }
                    }
                    su0Var2.l();
                    return;
                }
                return;
            case 26:
                xu0 xu0Var = (xu0) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                xu0Var.getClass();
                String lowerCase3 = ((String) obj2).trim().toLowerCase();
                int i30 = 21;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new u90(i30, xu0Var, new ArrayList()));
                    return;
                }
                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                if (!lowerCase3.equals(translitString3) && translitString3.length() != 0) {
                    str3 = translitString3;
                }
                int i31 = (str3 != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i31];
                strArr2[0] = lowerCase3;
                if (str3 != null) {
                    strArr2[1] = str3;
                }
                ArrayList arrayList15 = new ArrayList();
                int i32 = 0;
                while (i32 < arrayList14.size()) {
                    MessageObject messageObject = (MessageObject) arrayList14.get(i32);
                    int i33 = 0;
                    while (true) {
                        if (i33 < i31) {
                            String str8 = strArr2[i33];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str8)) {
                                    arrayList15.add(messageObject);
                                } else if (xu0Var.r == i15) {
                                    TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i34);
                                            i13 = i15;
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str9 = documentAttribute.performer;
                                                z10 = str9 != null ? str9.toLowerCase().contains(str8) : false;
                                                if (!z10 && (str2 = documentAttribute.title) != null) {
                                                    z10 = str2.toLowerCase().contains(str8);
                                                }
                                            } else {
                                                i34++;
                                                i15 = i13;
                                            }
                                        } else {
                                            i13 = i15;
                                            z10 = false;
                                        }
                                    }
                                    if (z10) {
                                        arrayList15.add(messageObject);
                                    } else {
                                        i33++;
                                        i15 = i13;
                                    }
                                }
                            }
                            i13 = i15;
                            i33++;
                            i15 = i13;
                        }
                    }
                    i13 = i15;
                    i32++;
                    i15 = i13;
                }
                AndroidUtilities.runOnUIThread(new u90(i30, xu0Var, arrayList15));
                return;
            case 27:
                a();
                return;
            case 28:
                dz0.y((dz0) obj3, (ArrayList) obj2, (Boolean) obj);
                return;
            default:
                dz0.G((dz0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
        }
    }

    public /* synthetic */ kg(ue0 ue0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 16;
        this.b = ue0Var;
        this.d = tL_error;
        this.c = tLObject;
    }
}
