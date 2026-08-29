package org.telegram.ui.Components;

import android.content.Context;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:343|344|345)|340|341) */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0859, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027f A[LOOP:5: B:121:0x020d->B:137:0x027f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0894  */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r2v11 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        String str;
        long j10;
        long j11;
        TLRPC.User user;
        Bitmap bitmap;
        int i10;
        int i11;
        int i12;
        JSONObject optJSONObject;
        String optString;
        or0 or0Var;
        long peerId;
        org.telegram.ui.ActionBar.o2 o2Var;
        ?? r02;
        boolean z10;
        String str2;
        int i13 = this.a;
        int i14 = 3;
        int i15 = 4;
        String str3 = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                g0 g0Var = (g0) obj3;
                c5.M((Context) obj2, g0Var.h0, new n(g0Var, 0), (org.telegram.ui.ActionBar.c6) obj);
                return;
            case 1:
                g8.o((g8) obj3, (org.telegram.ui.ActionBar.c2) obj2, (TLObject) obj);
                return;
            case 2:
                ze zeVar = (ze) obj3;
                zeVar.getClass();
                ((xu0) obj2).getViewTreeObserver().removeOnDrawListener(zeVar);
                ((oo0) obj).a.setHideAvatar(true);
                return;
            case 3:
                gg ggVar = (gg) obj3;
                File file = (File) obj;
                try {
                    InputStream openInputStream = ggVar.getContext().getContentResolver().openInputStream((Uri) obj2);
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
                            AndroidUtilities.runOnUIThread(new g(ggVar, arrayList, file, 4));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 4:
                ((gg) obj3).n((File) obj, (ArrayList) obj2);
                return;
            case 5:
                ni.n((ni) obj3, (AnimationNotificationsLocker) obj2, (org.telegram.ui.ActionBar.z2) obj);
                return;
            case 6:
                final ni niVar = (ni) obj3;
                final zg zgVar = (zg) obj;
                final boolean z11 = niVar.v0.getCurrentItemTop() <= ((fi) obj2).getButtonsHideOffset();
                float alpha = niVar.T0.getAlpha();
                float f9 = z11 ? 1.0f : 0.0f;
                o1.k kVar = new o1.k(new ib.a(0.0f));
                kVar.b(new gh(niVar, alpha, f9, z11));
                kVar.a(new o1.g() { // from class: org.telegram.ui.Components.hh
                    @Override // o1.g
                    public final void a(o1.i iVar, boolean z12, float f10, float f11) {
                        ni.t(ni.this, z11, zgVar);
                    }
                });
                o1.l lVar = new o1.l(500.0f);
                kVar.u = lVar;
                lVar.a(1.0f);
                kVar.u.b(1000.0f);
                kVar.f();
                niVar.p1 = kVar;
                return;
            case 7:
                TLObject tLObject = (TLObject) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                HashMap hashMap = ((ep) obj3).s;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    f6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, f6Var);
                FileLoader.getInstance(f6Var.A).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 8:
                ks ksVar = (ks) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                js jsVar = (js) obj;
                ArrayList arrayList2 = new ArrayList();
                ArrayList<Long> arrayList3 = new ArrayList<>();
                long j12 = 0;
                try {
                    int i16 = 0;
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            try {
                                arrayList3.add(Long.valueOf(queryFinalized.longValue(i16)));
                                j12 = Math.max(j12, queryFinalized.longValue(1));
                                str = queryFinalized.stringValue(2);
                                i16 = 0;
                            } catch (Exception e10) {
                                e = e10;
                                sQLiteCursor = queryFinalized;
                                try {
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                    }
                                    j10 = j12;
                                    AndroidUtilities.runOnUIThread(new ih.h1(ksVar, arrayList2, j10, str, jsVar, 12));
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
                            Long l10 = arrayList3.get(i17);
                            i17++;
                            long longValue = l10.longValue();
                            int size2 = users.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size2) {
                                    TLRPC.User user2 = users.get(i18);
                                    i18++;
                                    TLRPC.User user3 = user2;
                                    if (user3 != null) {
                                        j11 = j12;
                                        try {
                                            if (user3.id == longValue) {
                                                user = user3;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            sQLiteCursor = queryFinalized;
                                            j12 = j11;
                                            FileLog.e(e);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            j10 = j12;
                                            AndroidUtilities.runOnUIThread(new ih.h1(ksVar, arrayList2, j10, str, jsVar, 12));
                                            return;
                                        }
                                    } else {
                                        j11 = j12;
                                    }
                                    j12 = j11;
                                } else {
                                    j11 = j12;
                                    user = null;
                                }
                            }
                            if (user != null) {
                                arrayList2.add(user);
                            }
                            j12 = j11;
                        }
                    }
                    queryFinalized.dispose();
                    j10 = j12;
                } catch (Exception e12) {
                    e = e12;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new ih.h1(ksVar, arrayList2, j10, str, jsVar, 12));
                return;
            case 9:
                qz qzVar = (qz) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                uz uzVar = qzVar.F;
                int[] iArr = uzVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!uzVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, uzVar.g(!qzVar.P ? 1 : 0), 0);
                GLES20.glClear(0);
                int i19 = qzVar.Q;
                if (i19 == 0 || (i10 = qzVar.R) == 0) {
                    bitmap = null;
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i19 * i10 * 4);
                    GLES20.glReadPixels(0, 0, qzVar.Q, qzVar.R, 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(qzVar.Q, qzVar.R, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    bitmap = createBitmap;
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 10:
                y00 y00Var = (y00) obj3;
                y00Var.v0 = -1;
                mc M = tc.a0((org.telegram.ui.ActionBar.o2) obj2).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, y00Var.Y), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                y00Var.w0 = true;
                y00Var.dismiss();
                y00Var.n.getMessagesController().invalidateChatlistFolderUpdate(y00Var.U);
                return;
            case 11:
                y00 y00Var2 = (y00) obj3;
                y00Var2.v0 = y00Var2.n.getConnectionsManager().sendRequest((TLObject) obj2, new org.telegram.ui.zg(11, y00Var2, (Pair) obj));
                return;
            case 12:
                n60 n60Var = (n60) obj3;
                n60Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new ProfileActivity(bundle, null));
                n60Var.h0 = true;
                return;
            case 13:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                n60 n60Var2 = ((h60) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = n60Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (n60Var2.f0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = n60Var2.d;
                    if (chatFull2 != null) {
                        int i20 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i20;
                        if (i20 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = ((org.telegram.ui.ActionBar.f3) n60Var2).currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(n60Var2.c0, chatFull2.invitesCount);
                    }
                    org.telegram.ui.ab abVar = n60Var2.f0;
                    if (abVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = n60Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.ob obVar = abVar.a;
                        ArrayList arrayList4 = obVar.o0;
                        int size3 = arrayList4.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = obVar.getAccountInstance().getUserConfig().clientUserId;
                        i11 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
                        if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) obVar.n0, (HashMap<String, ArrayList<MessageObject>>) obVar.m0, obVar.s, obVar.T, true).contentType < 0) {
                            return;
                        }
                        obVar.R0();
                        int size4 = arrayList4.size() - size3;
                        if (size4 > 0) {
                            obVar.C0.N = true;
                            org.telegram.ui.kb kbVar = obVar.E;
                            kbVar.s(kbVar.h, size4);
                            org.telegram.ui.ob.K0(obVar);
                        }
                        obVar.y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                x60.O((x60) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 15:
                t60 t60Var = (t60) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                t60Var.h = null;
                t60Var.c = arrayList5;
                t60Var.d = (ArrayList) obj;
                rf.k1 k1Var = t60Var.e;
                k1Var.f(arrayList5, null);
                x60 x60Var = t60Var.n;
                x60Var.I(t60Var.f - 1);
                t60Var.l();
                if (k1Var.e() || t60Var.h() > 2) {
                    return;
                }
                x60Var.s.e(false, true);
                return;
            case 16:
                y80 y80Var = (y80) obj3;
                z80 z80Var = (z80) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                x80 x80Var = y80Var.h;
                if (x80Var == null || y80Var.e != z80Var) {
                    return;
                }
                x80Var.a(clickableSpan);
                y80Var.e = null;
                y80Var.b.d(true);
                return;
            case 17:
                vb0 vb0Var = (vb0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.c6 c6Var = vb0Var.c;
                TextView textView = vb0Var.f;
                TextView textView2 = vb0Var.e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        vb0Var.A = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new tc(hb.a(vb0Var.getContext()), c6Var).d0(tL_error2, false);
                    }
                } else if (tLObject3 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject3).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = vb0Var.d.animate().alpha(1.0f);
                jr jrVar = jr.h;
                org.telegram.ui.b.q(alpha2, jrVar, 320L);
                vb0Var.h.animate().alpha(0.0f).setInterpolator(jrVar).setDuration(320L).start();
                if (vb0Var.A) {
                    vb0Var.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 6, 0));
                    vb0Var.setOnClickListener(new u70(vb0Var, i14));
                    return;
                } else {
                    vb0Var.setBackground(null);
                    vb0Var.setOnClickListener(null);
                    return;
                }
            case 18:
                vd0.o((vd0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 19:
                String str4 = (String) obj2;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                org.telegram.ui.et0 et0Var = (org.telegram.ui.et0) ((if0) obj3).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + et0Var.w).put("platform", "DESKTOP"))).put("videoId", et0Var.w).toString().getBytes("UTF-8"));
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
                            if (et0Var.D == 0) {
                                et0Var.s = optString;
                                return;
                            } else {
                                mf0.a(et0Var, optString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr2, 0, read2);
                    }
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
                break;
            case 20:
                lg0.n((lg0) obj3, (kg0) obj2, (TLObject) obj);
                return;
            case 21:
                tm0 tm0Var = (tm0) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList<MessageObject> arrayList7 = (ArrayList) obj;
                int i21 = tm0Var.d;
                for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                    DownloadController.getInstance(i21).onDownloadComplete((MessageObject) arrayList6.get(i22));
                }
                if (!arrayList7.isEmpty()) {
                    DownloadController.getInstance(i21).deleteRecentFiles(arrayList7);
                }
                tm0Var.K = false;
                tm0Var.d(true);
                return;
            case 22:
                mn0 mn0Var = (mn0) obj3;
                org.telegram.ui.fy fyVar = (org.telegram.ui.fy) obj2;
                j70 j70Var = (j70) obj;
                if (UserConfig.getInstance(mn0Var.G0.D0).isPremium()) {
                    fyVar.getMessagesController().disableAds(true);
                    mn0Var.T();
                    tc.a0(fyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new cg.p1((org.telegram.ui.ActionBar.o2) fyVar, 3, true).show();
                }
                j70Var.u();
                return;
            case 23:
                qu0 qu0Var = (qu0) obj3;
                c5.S(qu0Var.getContext(), null, qu0Var.B1, new uq0(qu0Var, (TL_stories.StoryItem) obj2));
                ((j70) obj).u();
                return;
            case 24:
                qu0 qu0Var2 = (qu0) obj3;
                String str5 = (String) obj2;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                ss0 ss0Var = new ss0(qu0Var2.getContext(), str5, str5, qu0Var2.B1, o2Var2);
                if (o2Var2 != null) {
                    o2Var2.showDialog(ss0Var);
                    return;
                } else {
                    ss0Var.show();
                    return;
                }
            case 25:
                ts0 ts0Var = (ts0) obj3;
                qu0 qu0Var3 = ts0Var.d;
                c5.S(qu0Var3.getContext(), qu0Var3.r1, (org.telegram.ui.ActionBar.c6) obj, new cv(ts0Var, 20));
                ((j70) obj2).u();
                return;
            case 26:
                at0 at0Var = (at0) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                qu0 qu0Var4 = at0Var.n;
                int h = at0Var.h();
                if (tL_error3 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject4;
                    qu0Var4.r1.getMessagesController().putChats(messages_chats.chats, false);
                    at0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    at0Var.d.addAll(messages_chats.chats);
                } else {
                    at0Var.h = true;
                }
                int i23 = 0;
                while (true) {
                    it0[] it0VarArr = qu0Var4.g0;
                    if (i23 >= it0VarArr.length) {
                        at0Var.e = false;
                        at0Var.f = true;
                        at0Var.l();
                        return;
                    } else {
                        it0 it0Var = it0VarArr[i23];
                        if (it0Var.B == 6 && (or0Var = it0Var.h) != null && (at0Var.f || h == 0)) {
                            qu0Var4.z(or0Var, 0, null);
                        }
                        i23++;
                    }
                }
                break;
            case 27:
                gt0 gt0Var = (gt0) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.ActionBar.o2 o2Var3 = gt0Var.s.r1;
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int i24 = 28;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new g(gt0Var, new ArrayList(), new ArrayList(), i24));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i25 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i25];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                int size5 = arrayList8.size();
                int i26 = 0;
                while (i26 < size5) {
                    TLObject tLObject5 = (TLObject) arrayList8.get(i26);
                    if (tLObject5 instanceof TLRPC.ChatParticipant) {
                        peerId = ((TLRPC.ChatParticipant) tLObject5).user_id;
                    } else {
                        if (tLObject5 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject5).peer);
                        }
                        o2Var = o2Var3;
                        i26++;
                        o2Var3 = o2Var;
                    }
                    TLRPC.User user4 = o2Var3.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user4.id != o2Var3.getUserConfig().getClientUserId()) {
                        String lowerCase2 = UserObject.getUserName(user4).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i27 = 0;
                        boolean z12 = false;
                        while (i27 < i25) {
                            String str6 = strArr[i27];
                            if (lowerCase2.startsWith(str6)) {
                                o2Var = o2Var3;
                            } else {
                                o2Var = o2Var3;
                                if (!org.telegram.messenger.x3.w(" ", str6, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str6) && !org.telegram.messenger.x3.w(" ", str6, translitString2)))) {
                                    String publicUsername = UserObject.getPublicUsername(user4);
                                    r02 = (publicUsername == null || !publicUsername.startsWith(str6)) ? z12 : 2;
                                    if (r02 == 0) {
                                        if (r02 == 1) {
                                            arrayList9.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str6));
                                        } else {
                                            arrayList9.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str6));
                                        }
                                        arrayList10.add(tLObject5);
                                        i26++;
                                        o2Var3 = o2Var;
                                    } else {
                                        i27++;
                                        z12 = r02;
                                        o2Var3 = o2Var;
                                    }
                                }
                            }
                            r02 = 1;
                            if (r02 == 0) {
                            }
                        }
                    }
                    o2Var = o2Var3;
                    i26++;
                    o2Var3 = o2Var;
                }
                AndroidUtilities.runOnUIThread(new g(gt0Var, arrayList9, arrayList10, 28));
                return;
            case 28:
                gt0 gt0Var2 = (gt0) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                qu0 qu0Var5 = gt0Var2.s;
                if (qu0Var5.R0) {
                    gt0Var2.d = arrayList11;
                    gt0Var2.r--;
                    if (!ChatObject.isChannel(gt0Var2.n)) {
                        ArrayList arrayList13 = gt0Var2.e.g;
                        arrayList13.clear();
                        arrayList13.addAll(arrayList12);
                    }
                    if (gt0Var2.r == 0) {
                        int i28 = 0;
                        while (true) {
                            it0[] it0VarArr2 = qu0Var5.g0;
                            if (i28 < it0VarArr2.length) {
                                it0 it0Var2 = it0VarArr2[i28];
                                if (it0Var2.B == 7) {
                                    if (gt0Var2.h == 0) {
                                        it0Var2.w.e(false, true);
                                    } else {
                                        qu0Var5.z(it0Var2.h, 0, null);
                                    }
                                }
                                i28++;
                            }
                        }
                    }
                    gt0Var2.l();
                    return;
                }
                return;
            default:
                lt0 lt0Var = (lt0) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                lt0Var.getClass();
                String lowerCase3 = ((String) obj2).trim().toLowerCase();
                int i29 = 13;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ii0(i29, lt0Var, new ArrayList()));
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
                        if (i32 < i30) {
                            String str7 = strArr2[i32];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str7)) {
                                    arrayList15.add(messageObject);
                                } else if (lt0Var.r == i15) {
                                    TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i33);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str8 = documentAttribute.performer;
                                                z10 = str8 != null ? str8.toLowerCase().contains(str7) : false;
                                                if (!z10 && (str2 = documentAttribute.title) != null) {
                                                    z10 = str2.toLowerCase().contains(str7);
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
                                        i15 = 4;
                                    }
                                }
                            }
                            i32++;
                            i15 = 4;
                        }
                    }
                    i31++;
                    i15 = 4;
                }
                AndroidUtilities.runOnUIThread(new ii0(i29, lt0Var, arrayList15));
                return;
        }
    }

    public /* synthetic */ g(vd0 vd0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 18;
        this.b = vd0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    public /* synthetic */ g(ts0 ts0Var, org.telegram.ui.ActionBar.c6 c6Var, j70 j70Var) {
        this.a = 25;
        this.b = ts0Var;
        this.d = c6Var;
        this.c = j70Var;
    }
}
