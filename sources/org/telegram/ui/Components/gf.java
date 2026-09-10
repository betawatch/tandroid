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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gf(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        hy0 hy0Var = (hy0) this.b;
        String str = (String) this.c;
        SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.d;
        if (hy0Var.isDismissed()) {
            return;
        }
        hy0Var.Z.remove(str);
        if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
            importingSticker.validated = true;
            int indexOf = hy0Var.Y.indexOf(importingSticker);
            if (indexOf >= 0) {
                s4.c1 K = hy0Var.c.K(indexOf);
                if (K != null) {
                    ((org.telegram.ui.Cells.g8) K.a).setSticker(importingSticker);
                }
            } else {
                hy0Var.d.l();
            }
        } else {
            hy0Var.u0(importingSticker);
        }
        if (hy0Var.Z.isEmpty()) {
            hy0Var.B0();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:347|348|349)|344|345) */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x086f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0870, code lost:
    
        r19 = r2;
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x086b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x086c, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028b A[LOOP:5: B:125:0x0219->B:141:0x028b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x08b5  */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r2v19 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        String str;
        SQLiteCursor sQLiteCursor2;
        TLRPC.User user;
        Bitmap bitmap;
        int i10;
        int i11;
        int i12;
        JSONObject optJSONObject;
        String optString;
        gs0 gs0Var;
        long peerId;
        org.telegram.ui.ActionBar.p2 p2Var;
        ?? r02;
        boolean z10;
        String str2;
        int i13 = this.a;
        int i14 = 4;
        int i15 = 3;
        int i16 = 7;
        String str3 = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                hf hfVar = (hf) obj3;
                hfVar.getClass();
                ((pv0) obj2).getViewTreeObserver().removeOnDrawListener(hfVar);
                ((ep0) obj).a.setHideAvatar(true);
                return;
            case 1:
                pg pgVar = (pg) obj3;
                File file = (File) obj;
                try {
                    InputStream openInputStream = pgVar.getContext().getContentResolver().openInputStream((Uri) obj2);
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
                            AndroidUtilities.runOnUIThread(new gf(pgVar, arrayList, file, 2));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 2:
                ((pg) obj3).n((File) obj, (ArrayList) obj2);
                return;
            case 3:
                yi.n((yi) obj3, (AnimationNotificationsLocker) obj2, (org.telegram.ui.ActionBar.b3) obj);
                return;
            case 4:
                final yi yiVar = (yi) obj3;
                final jh jhVar = (jh) obj;
                final boolean z11 = yiVar.z0.getCurrentItemTop() <= ((qi) obj2).getButtonsHideOffset();
                float alpha = yiVar.X0.getAlpha();
                float f7 = z11 ? 1.0f : 0.0f;
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.b(new qh(yiVar, alpha, f7, z11));
                kVar.a(new o1.f() { // from class: org.telegram.ui.Components.rh
                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f10, float f11) {
                        yi.t(yi.this, z11, jhVar);
                    }
                });
                o1.l lVar = new o1.l(500.0f);
                kVar.u = lVar;
                lVar.a(1.0f);
                kVar.u.b(1000.0f);
                kVar.f();
                yiVar.t1 = kVar;
                return;
            case 5:
                TLObject tLObject = (TLObject) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                HashMap hashMap = ((qp) obj3).s;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    i6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, i6Var);
                FileLoader.getInstance(i6Var.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 6:
                ws wsVar = (ws) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                vs vsVar = (vs) obj;
                ArrayList arrayList2 = new ArrayList();
                ArrayList<Long> arrayList3 = new ArrayList<>();
                long j3 = 0;
                try {
                    int i17 = 0;
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    String str4 = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList3.add(Long.valueOf(queryFinalized.longValue(i17)));
                            j3 = Math.max(j3, queryFinalized.longValue(1));
                            str4 = queryFinalized.stringValue(2);
                            i17 = 0;
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = queryFinalized;
                            str = str4;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                }
                                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.g(wsVar, arrayList2, j3, str, vsVar, 4));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
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
                        int i18 = 0;
                        while (i18 < size) {
                            Long l4 = arrayList3.get(i18);
                            i18++;
                            long longValue = l4.longValue();
                            int size2 = users.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 < size2) {
                                    TLRPC.User user2 = users.get(i19);
                                    i19++;
                                    user = user2;
                                    if (user != null) {
                                        sQLiteCursor2 = queryFinalized;
                                        str = str4;
                                        try {
                                            if (user.id == longValue) {
                                            }
                                        } catch (Exception e7) {
                                            e = e7;
                                            sQLiteCursor = sQLiteCursor2;
                                            FileLog.e(e);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.g(wsVar, arrayList2, j3, str, vsVar, 4));
                                            return;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            sQLiteCursor = sQLiteCursor2;
                                            if (sQLiteCursor != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        sQLiteCursor2 = queryFinalized;
                                        str = str4;
                                    }
                                    str4 = str;
                                    queryFinalized = sQLiteCursor2;
                                } else {
                                    sQLiteCursor2 = queryFinalized;
                                    str = str4;
                                    user = null;
                                }
                            }
                            if (user != null) {
                                arrayList2.add(user);
                            }
                            str4 = str;
                            queryFinalized = sQLiteCursor2;
                        }
                    }
                    str = str4;
                    queryFinalized.dispose();
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = null;
                    str = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.g(wsVar, arrayList2, j3, str, vsVar, 4));
                return;
            case 7:
                c00 c00Var = (c00) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                g00 g00Var = c00Var.J;
                int[] iArr = g00Var.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!g00Var.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, g00Var.g(!c00Var.T ? 1 : 0), 0);
                GLES20.glClear(0);
                int i20 = c00Var.U;
                if (i20 == 0 || (i10 = c00Var.V) == 0) {
                    bitmap = null;
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i20 * i10 * 4);
                    GLES20.glReadPixels(0, 0, c00Var.U, c00Var.V, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(c00Var.U, c00Var.V, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 8:
                k10 k10Var = (k10) obj3;
                k10Var.z0 = -1;
                pc M = wc.a0((org.telegram.ui.ActionBar.p2) obj2).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, k10Var.c0), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                k10Var.A0 = true;
                k10Var.dismiss();
                k10Var.n.getMessagesController().invalidateChatlistFolderUpdate(k10Var.Y);
                return;
            case 9:
                k10 k10Var2 = (k10) obj3;
                k10Var2.z0 = k10Var2.n.getConnectionsManager().sendRequest((TLObject) obj2, new th(i15, k10Var2, (Pair) obj));
                return;
            case 10:
                a70 a70Var = (a70) obj3;
                a70Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new ProfileActivity(bundle, null));
                a70Var.l0 = true;
                return;
            case 11:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                a70 a70Var2 = ((u60) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = a70Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (a70Var2.j0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = a70Var2.d;
                    if (chatFull2 != null) {
                        int i21 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i21;
                        if (i21 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = ((org.telegram.ui.ActionBar.h3) a70Var2).currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(a70Var2.g0, chatFull2.invitesCount);
                    }
                    org.telegram.ui.jb jbVar = a70Var2.j0;
                    if (jbVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = a70Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.wb wbVar = jbVar.a;
                        ArrayList arrayList4 = wbVar.s0;
                        int size3 = arrayList4.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
                        i11 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
                        if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.r0, (HashMap<String, ArrayList<MessageObject>>) wbVar.q0, wbVar.s, wbVar.X, true).contentType < 0) {
                            return;
                        }
                        wbVar.R0();
                        int size4 = arrayList4.size() - size3;
                        if (size4 > 0) {
                            wbVar.G0.N = true;
                            org.telegram.ui.sb sbVar = wbVar.I;
                            sbVar.s(sbVar.h, size4);
                            org.telegram.ui.wb.K0(wbVar);
                        }
                        wbVar.C0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                k70.O((k70) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 13:
                g70 g70Var = (g70) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                g70Var.h = null;
                g70Var.c = arrayList5;
                g70Var.d = (ArrayList) obj;
                fg.d2 d2Var = g70Var.e;
                d2Var.f(arrayList5, null);
                k70 k70Var = g70Var.n;
                k70Var.J(g70Var.f - 1);
                g70Var.l();
                if (d2Var.e() || g70Var.h() > 2) {
                    return;
                }
                k70Var.s.e(false, true);
                return;
            case 14:
                m90 m90Var = (m90) obj3;
                n90 n90Var = (n90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                l90 l90Var = m90Var.h;
                if (l90Var == null || m90Var.e != n90Var) {
                    return;
                }
                l90Var.a(clickableSpan);
                m90Var.e = null;
                m90Var.b.d(true);
                return;
            case 15:
                ic0 ic0Var = (ic0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.f6 f6Var = ic0Var.c;
                TextView textView = ic0Var.f;
                TextView textView2 = ic0Var.e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        ic0Var.E = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new wc(kb.a(ic0Var.getContext()), f6Var).d0(tL_error2, false);
                    }
                } else if (tLObject3 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject3).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = ic0Var.d.animate().alpha(1.0f);
                wr wrVar = wr.h;
                org.telegram.messenger.em.q(alpha2, wrVar, 320L);
                ic0Var.h.animate().alpha(0.0f).setInterpolator(wrVar).setDuration(320L).start();
                if (ic0Var.E) {
                    ic0Var.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 6, 0));
                    ic0Var.setOnClickListener(new g80(ic0Var, i15));
                    return;
                } else {
                    ic0Var.setBackground(null);
                    ic0Var.setOnClickListener(null);
                    return;
                }
            case 16:
                je0.o((je0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 17:
                String str5 = (String) obj2;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                org.telegram.ui.hu0 hu0Var = (org.telegram.ui.hu0) ((ki.i) obj3).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str5).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + hu0Var.w).put("platform", "DESKTOP"))).put("videoId", hu0Var.w).toString().getBytes("UTF-8"));
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
                            if (hu0Var.H == 0) {
                                hu0Var.s = optString;
                                return;
                            } else {
                                zf0.a(hu0Var, optString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr2, 0, read2);
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                break;
            case 18:
                zg0.n((zg0) obj3, (yg0) obj2, (TLObject) obj);
                return;
            case 19:
                fn0 fn0Var = (fn0) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList<MessageObject> arrayList7 = (ArrayList) obj;
                int i22 = fn0Var.d;
                for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                    DownloadController.getInstance(i22).onDownloadComplete((MessageObject) arrayList6.get(i23));
                }
                if (!arrayList7.isEmpty()) {
                    DownloadController.getInstance(i22).deleteRecentFiles(arrayList7);
                }
                fn0Var.O = false;
                fn0Var.d(true);
                return;
            case 20:
                ao0 ao0Var = (ao0) obj3;
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) obj2;
                w70 w70Var = (w70) obj;
                if (UserConfig.getInstance(ao0Var.K0.H0).isPremium()) {
                    wyVar.getMessagesController().disableAds(true);
                    ao0Var.T();
                    wc.a0(wyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new qg.a1((org.telegram.ui.ActionBar.p2) wyVar, 3, true).show();
                }
                w70Var.u();
                return;
            case 21:
                iv0 iv0Var = (iv0) obj3;
                d5.S(iv0Var.getContext(), null, iv0Var.F1, new kr0(iv0Var, (TL_stories.StoryItem) obj2));
                ((w70) obj).u();
                return;
            case 22:
                iv0 iv0Var2 = (iv0) obj3;
                String str6 = (String) obj2;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                kt0 kt0Var = new kt0(iv0Var2.getContext(), str6, str6, iv0Var2.F1, p2Var2);
                if (p2Var2 != null) {
                    p2Var2.showDialog(kt0Var);
                    return;
                } else {
                    kt0Var.show();
                    return;
                }
            case 23:
                lt0 lt0Var = (lt0) obj3;
                iv0 iv0Var3 = lt0Var.d;
                d5.S(iv0Var3.getContext(), iv0Var3.v1, (org.telegram.ui.ActionBar.f6) obj2, new pv(lt0Var, 20));
                ((w70) obj).u();
                return;
            case 24:
                st0 st0Var = (st0) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                iv0 iv0Var4 = st0Var.n;
                int h = st0Var.h();
                if (tL_error3 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject4;
                    iv0Var4.v1.getMessagesController().putChats(messages_chats.chats, false);
                    st0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    st0Var.d.addAll(messages_chats.chats);
                } else {
                    st0Var.h = true;
                }
                int i24 = 0;
                while (true) {
                    au0[] au0VarArr = iv0Var4.k0;
                    if (i24 >= au0VarArr.length) {
                        st0Var.e = false;
                        st0Var.f = true;
                        st0Var.l();
                        return;
                    } else {
                        au0 au0Var = au0VarArr[i24];
                        if (au0Var.F == 6 && (gs0Var = au0Var.h) != null && (st0Var.f || h == 0)) {
                            iv0Var4.z(gs0Var, 0, null);
                        }
                        i24++;
                    }
                }
                break;
            case 25:
                yt0 yt0Var = (yt0) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.ActionBar.p2 p2Var3 = yt0Var.s.v1;
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int i25 = 26;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new gf(yt0Var, new ArrayList(), new ArrayList(), i25));
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
                        p2Var = p2Var3;
                        i27++;
                        p2Var3 = p2Var;
                    }
                    TLRPC.User user3 = p2Var3.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user3.id != p2Var3.getUserConfig().getClientUserId()) {
                        String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i28 = 0;
                        boolean z12 = false;
                        while (i28 < i26) {
                            String str7 = strArr[i28];
                            if (lowerCase2.startsWith(str7)) {
                                p2Var = p2Var3;
                            } else {
                                p2Var = p2Var3;
                                if (!org.telegram.messenger.a2.w(" ", str7, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str7) && !org.telegram.messenger.a2.w(" ", str7, translitString2)))) {
                                    String publicUsername = UserObject.getPublicUsername(user3);
                                    r02 = (publicUsername == null || !publicUsername.startsWith(str7)) ? z12 : 2;
                                    if (r02 == 0) {
                                        if (r02 == 1) {
                                            arrayList9.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str7));
                                        } else {
                                            arrayList9.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user3), null, "@" + str7));
                                        }
                                        arrayList10.add(tLObject5);
                                        i27++;
                                        p2Var3 = p2Var;
                                    } else {
                                        i28++;
                                        z12 = r02;
                                        p2Var3 = p2Var;
                                    }
                                }
                            }
                            r02 = 1;
                            if (r02 == 0) {
                            }
                        }
                    }
                    p2Var = p2Var3;
                    i27++;
                    p2Var3 = p2Var;
                }
                AndroidUtilities.runOnUIThread(new gf(yt0Var, arrayList9, arrayList10, 26));
                return;
            case 26:
                yt0 yt0Var2 = (yt0) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                iv0 iv0Var5 = yt0Var2.s;
                if (iv0Var5.V0) {
                    yt0Var2.d = arrayList11;
                    yt0Var2.r--;
                    if (!ChatObject.isChannel(yt0Var2.n)) {
                        ArrayList arrayList13 = yt0Var2.e.g;
                        arrayList13.clear();
                        arrayList13.addAll(arrayList12);
                    }
                    if (yt0Var2.r == 0) {
                        int i29 = 0;
                        while (true) {
                            au0[] au0VarArr2 = iv0Var5.k0;
                            if (i29 < au0VarArr2.length) {
                                au0 au0Var2 = au0VarArr2[i29];
                                if (au0Var2.F == 7) {
                                    if (yt0Var2.h == 0) {
                                        au0Var2.w.e(false, true);
                                    } else {
                                        iv0Var5.z(au0Var2.h, 0, null);
                                    }
                                }
                                i29++;
                            }
                        }
                    }
                    yt0Var2.l();
                    return;
                }
                return;
            case 27:
                du0 du0Var = (du0) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                du0Var.getClass();
                String lowerCase3 = ((String) obj2).trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new yo0(i16, du0Var, new ArrayList()));
                    return;
                }
                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                if (!lowerCase3.equals(translitString3) && translitString3.length() != 0) {
                    str3 = translitString3;
                }
                int i30 = (str3 != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i30];
                strArr2[0] = lowerCase3;
                if (str3 != null) {
                    strArr2[1] = str3;
                }
                ArrayList arrayList15 = new ArrayList();
                int i31 = 0;
                while (i31 < arrayList14.size()) {
                    MessageObject messageObject = (MessageObject) arrayList14.get(i31);
                    int i32 = 0;
                    while (true) {
                        if (i32 >= i30) {
                            break;
                        } else {
                            String str8 = strArr2[i32];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str8)) {
                                    arrayList15.add(messageObject);
                                    break;
                                } else if (du0Var.r == i14) {
                                    TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i33);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str9 = documentAttribute.performer;
                                                z10 = str9 != null ? str9.toLowerCase().contains(str8) : false;
                                                if (!z10 && (str2 = documentAttribute.title) != null) {
                                                    z10 = str2.toLowerCase().contains(str8);
                                                }
                                            } else {
                                                i33++;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                    if (z10) {
                                        arrayList15.add(messageObject);
                                    } else {
                                        i32++;
                                        i14 = 4;
                                    }
                                }
                            }
                            i32++;
                            i14 = 4;
                        }
                    }
                    i31++;
                    i14 = 4;
                }
                AndroidUtilities.runOnUIThread(new yo0(i16, du0Var, arrayList15));
                return;
            case 28:
                a();
                return;
            default:
                hy0.w((hy0) obj3, (ArrayList) obj2, (Boolean) obj);
                return;
        }
    }

    public /* synthetic */ gf(je0 je0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 16;
        this.b = je0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
