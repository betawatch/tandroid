package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.webkit.WebResourceRequest;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lg(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e1 A[LOOP:5: B:142:0x026f->B:158:0x02e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08f0  */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        String str;
        ArrayList<TLRPC.User> arrayList;
        TLRPC.User user;
        Bitmap bitmap;
        int i10;
        int i11;
        int i12;
        JSONObject optJSONObject;
        String optString;
        ws0 ws0Var;
        long peerId;
        org.telegram.ui.ActionBar.o2 o2Var;
        ?? r02;
        int i13;
        boolean z10;
        String str2;
        int i14 = this.a;
        int i15 = 4;
        String str3 = null;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i14) {
            case 0:
                ((ng) obj3).n((File) obj, (ArrayList) obj2);
                return;
            case 1:
                final ti tiVar = (ti) obj3;
                final gh ghVar = (gh) obj;
                final boolean z11 = tiVar.C0.getCurrentItemTop() <= ((li) obj2).getButtonsHideOffset();
                float alpha = tiVar.a1.getAlpha();
                float f7 = z11 ? 1.0f : 0.0f;
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.b(new nh(tiVar, alpha, f7, z11));
                kVar.a(new o1.f() { // from class: org.telegram.ui.Components.oh
                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f10, float f11) {
                        ti.w(ti.this, z11, ghVar);
                    }
                });
                o1.l lVar = new o1.l(500.0f);
                kVar.u = lVar;
                lVar.a(1.0f);
                kVar.u.b(1000.0f);
                kVar.h();
                tiVar.w1 = kVar;
                return;
            case 2:
                ti.p((ti) obj3, (AnimationNotificationsLocker) obj2, (org.telegram.ui.ActionBar.a3) obj);
                return;
            case 3:
                TLObject tLObject = (TLObject) obj2;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                HashMap hashMap = ((up) obj3).s;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    j6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, j6Var);
                FileLoader.getInstance(j6Var.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) obj3;
                e9Var.setText((CharSequence) obj2);
                org.telegram.ui.ActionBar.r6.W(e9Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, (org.telegram.ui.ActionBar.g6) obj);
                return;
            case 5:
                zs zsVar = (zs) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                ys ysVar = (ys) obj;
                ArrayList arrayList2 = new ArrayList();
                ArrayList<Long> arrayList3 = new ArrayList<>();
                long j10 = 0;
                try {
                    int i16 = 0;
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList3.add(Long.valueOf(queryFinalized.longValue(0)));
                            j10 = Math.max(j10, queryFinalized.longValue(1));
                            str = queryFinalized.stringValue(2);
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = queryFinalized;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                AndroidUtilities.runOnUIThread(new ai.z(zsVar, arrayList2, j10, str, ysVar, 12));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
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
                            int i18 = i16;
                            while (true) {
                                if (i18 < size2) {
                                    TLRPC.User user2 = users.get(i18);
                                    i18++;
                                    user = user2;
                                    if (user != null) {
                                        arrayList = users;
                                        if (user.id == longValue) {
                                        }
                                    } else {
                                        arrayList = users;
                                    }
                                    users = arrayList;
                                } else {
                                    arrayList = users;
                                    user = null;
                                }
                            }
                            if (user != null) {
                                arrayList2.add(user);
                            }
                            users = arrayList;
                            i16 = 0;
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e7) {
                    e = e7;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new ai.z(zsVar, arrayList2, j10, str, ysVar, 12));
                return;
            case 6:
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
            case 7:
                k10 k10Var = (k10) obj3;
                k10Var.z0 = -1;
                qc M = xc.a0((org.telegram.ui.ActionBar.o2) obj).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, k10Var.c0), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj2).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                k10Var.A0 = true;
                k10Var.dismiss();
                k10Var.n.getMessagesController().invalidateChatlistFolderUpdate(k10Var.Y);
                return;
            case 8:
                k10 k10Var2 = (k10) obj3;
                k10Var2.z0 = k10Var2.n.getConnectionsManager().sendRequest((TLObject) obj2, new org.telegram.ui.vc(15, k10Var2, (Pair) obj));
                return;
            case 9:
                m70 m70Var = (m70) obj3;
                m70Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new ProfileActivity(bundle, null));
                m70Var.l0 = true;
                return;
            case 10:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                m70 m70Var2 = ((g70) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = m70Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (m70Var2.j0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = m70Var2.d;
                    if (chatFull2 != null) {
                        int i20 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i20;
                        if (i20 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = ((org.telegram.ui.ActionBar.h3) m70Var2).currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(m70Var2.g0, chatFull2.invitesCount);
                    }
                    org.telegram.ui.ib ibVar = m70Var2.j0;
                    if (ibVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = m70Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.vb vbVar = ibVar.a;
                        ArrayList arrayList4 = vbVar.o0;
                        int size3 = arrayList4.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                        i11 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
                        if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f, vbVar.T, true).contentType < 0) {
                            return;
                        }
                        vbVar.R0();
                        int size4 = arrayList4.size() - size3;
                        if (size4 > 0) {
                            vbVar.C0.N = true;
                            org.telegram.ui.rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size4);
                            org.telegram.ui.vb.K0(vbVar);
                        }
                        vbVar.y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                x70.O((x70) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 12:
                t70 t70Var = (t70) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                t70Var.h = null;
                t70Var.c = arrayList5;
                t70Var.d = (ArrayList) obj;
                hg.a2 a2Var = t70Var.e;
                a2Var.f(arrayList5, null);
                x70 x70Var = t70Var.n;
                x70Var.J(t70Var.f - 1);
                t70Var.l();
                if (a2Var.e() || t70Var.h() > 2) {
                    return;
                }
                x70Var.s.e(false, true);
                return;
            case 13:
                y90 y90Var = (y90) obj3;
                z90 z90Var = (z90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                x90 x90Var = y90Var.h;
                if (x90Var == null || y90Var.e != z90Var) {
                    return;
                }
                x90Var.a(clickableSpan);
                y90Var.e = null;
                y90Var.b.d(true);
                return;
            case 14:
                vc0 vc0Var = (vc0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.g6 g6Var = vc0Var.c;
                TextView textView = vc0Var.f;
                TextView textView2 = vc0Var.e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        vc0Var.E = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new xc(lb.a(vc0Var.getContext()), g6Var).f0(tL_error2, false);
                    }
                } else if (tLObject3 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject3).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = vc0Var.d.animate().alpha(1.0f);
                bs bsVar = bs.h;
                org.telegram.messenger.sl.t(alpha2, bsVar, 320L);
                vc0Var.h.animate().alpha(0.0f).setInterpolator(bsVar).setDuration(320L).start();
                if (!vc0Var.E) {
                    vc0Var.setBackground(null);
                    vc0Var.setOnClickListener(null);
                    return;
                }
                int i21 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i21, g6Var), 6, 0);
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i21);
                vc0Var.setBackground(Z);
                org.telegram.ui.ActionBar.r6.k(vc0Var, Z, null, O, g6Var);
                vc0Var.setOnClickListener(new v80(vc0Var, 2));
                return;
            case 15:
                xe0.p((xe0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 16:
                String str4 = (String) obj2;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                org.telegram.ui.rt0 rt0Var = (org.telegram.ui.rt0) ((lg0) obj3).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + rt0Var.w).put("platform", "DESKTOP"))).put("videoId", rt0Var.w).toString().getBytes("UTF-8"));
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    byte[] bArr = new byte[10240];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            byteArrayOutputStream.close();
                            inputStream.close();
                            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (optString = optJSONObject.optString("spec")) == null) {
                                return;
                            }
                            if (rt0Var.H == 0) {
                                rt0Var.s = optString;
                                return;
                            } else {
                                pg0.a(rt0Var, optString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 17:
                oh0.n((oh0) obj3, (nh0) obj2, (TLObject) obj);
                return;
            case 18:
                xn0 xn0Var = (xn0) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList<MessageObject> arrayList7 = (ArrayList) obj;
                int i22 = xn0Var.d;
                for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                    DownloadController.getInstance(i22).onDownloadComplete((MessageObject) arrayList6.get(i23));
                }
                if (!arrayList7.isEmpty()) {
                    DownloadController.getInstance(i22).deleteRecentFiles(arrayList7);
                }
                xn0Var.O = false;
                xn0Var.d(true);
                return;
            case 19:
                so0 so0Var = (so0) obj3;
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj2;
                j80 j80Var = (j80) obj;
                if (UserConfig.getInstance(so0Var.K0.H0).isPremium()) {
                    eyVar.getMessagesController().disableAds(true);
                    so0Var.S();
                    xc.a0(eyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new sg.y0((org.telegram.ui.ActionBar.o2) eyVar, 3, true).show();
                }
                j80Var.u();
                return;
            case 20:
                xv0 xv0Var = (xv0) obj3;
                f5.S(xv0Var.getContext(), null, xv0Var.F1, new bs0(xv0Var, (TL_stories.StoryItem) obj2));
                ((j80) obj).u();
                return;
            case 21:
                xv0 xv0Var2 = (xv0) obj3;
                String str5 = (String) obj2;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                au0 au0Var = new au0(xv0Var2.getContext(), str5, str5, xv0Var2.F1, o2Var2);
                if (o2Var2 != null) {
                    o2Var2.showDialog(au0Var);
                    return;
                } else {
                    au0Var.show();
                    return;
                }
            case 22:
                bu0 bu0Var = (bu0) obj3;
                xv0 xv0Var3 = bu0Var.d;
                f5.S(xv0Var3.getContext(), xv0Var3.v1, (org.telegram.ui.ActionBar.g6) obj2, new tv(bu0Var, 21));
                ((j80) obj).u();
                return;
            case 23:
                iu0 iu0Var = (iu0) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                xv0 xv0Var4 = iu0Var.n;
                int h = iu0Var.h();
                if (tL_error3 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject4;
                    xv0Var4.v1.getMessagesController().putChats(messages_chats.chats, false);
                    iu0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    iu0Var.d.addAll(messages_chats.chats);
                } else {
                    iu0Var.h = true;
                }
                int i24 = 0;
                while (true) {
                    qu0[] qu0VarArr = xv0Var4.k0;
                    if (i24 >= qu0VarArr.length) {
                        iu0Var.e = false;
                        iu0Var.f = true;
                        iu0Var.l();
                        return;
                    } else {
                        qu0 qu0Var = qu0VarArr[i24];
                        if (qu0Var.F == 6 && (ws0Var = qu0Var.h) != null && (iu0Var.f || h == 0)) {
                            xv0Var4.z(ws0Var, 0, null);
                        }
                        i24++;
                    }
                }
                break;
            case 24:
                ou0 ou0Var = (ou0) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var3 = ou0Var.s.v1;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i25 = 25;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new lg((Object) ou0Var, (Object) new ArrayList(), (Object) new ArrayList(), i25));
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
                        o2Var = o2Var3;
                        i27++;
                        o2Var3 = o2Var;
                    }
                    TLRPC.User user3 = o2Var3.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user3.id != o2Var3.getUserConfig().getClientUserId()) {
                        String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i28 = 0;
                        boolean z12 = false;
                        while (i28 < i26) {
                            String str6 = strArr[i28];
                            if (lowerCase2.startsWith(str6)) {
                                o2Var = o2Var3;
                            } else {
                                o2Var = o2Var3;
                                if (!org.telegram.messenger.v0.w(" ", str6, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str6) && !org.telegram.messenger.v0.w(" ", str6, translitString2)))) {
                                    String publicUsername = UserObject.getPublicUsername(user3);
                                    r02 = (publicUsername == null || !publicUsername.startsWith(str6)) ? z12 : 2;
                                    if (r02 == 0) {
                                        if (r02 == 1) {
                                            arrayList9.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str6));
                                        } else {
                                            arrayList9.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user3), null, "@" + str6));
                                        }
                                        arrayList10.add(tLObject5);
                                        i27++;
                                        o2Var3 = o2Var;
                                    } else {
                                        i28++;
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
                    i27++;
                    o2Var3 = o2Var;
                }
                AndroidUtilities.runOnUIThread(new lg((Object) ou0Var, (Object) arrayList9, (Object) arrayList10, 25));
                return;
            case 25:
                ou0 ou0Var2 = (ou0) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                xv0 xv0Var5 = ou0Var2.s;
                if (xv0Var5.V0) {
                    ou0Var2.d = arrayList11;
                    ou0Var2.r--;
                    if (!ChatObject.isChannel(ou0Var2.n)) {
                        ArrayList arrayList13 = ou0Var2.e.g;
                        arrayList13.clear();
                        arrayList13.addAll(arrayList12);
                    }
                    if (ou0Var2.r == 0) {
                        int i29 = 0;
                        while (true) {
                            qu0[] qu0VarArr2 = xv0Var5.k0;
                            if (i29 < qu0VarArr2.length) {
                                qu0 qu0Var2 = qu0VarArr2[i29];
                                if (qu0Var2.F == 7) {
                                    if (ou0Var2.h == 0) {
                                        qu0Var2.w.e(false, true);
                                    } else {
                                        xv0Var5.z(qu0Var2.h, 0, null);
                                    }
                                }
                                i29++;
                            }
                        }
                    }
                    ou0Var2.l();
                    return;
                }
                return;
            case 26:
                tu0 tu0Var = (tu0) obj3;
                ArrayList arrayList14 = (ArrayList) obj2;
                tu0Var.getClass();
                String lowerCase3 = ((String) obj).trim().toLowerCase();
                int i30 = 10;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ko0(i30, tu0Var, new ArrayList()));
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
                            String str7 = strArr2[i33];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str7)) {
                                    arrayList15.add(messageObject);
                                } else if (tu0Var.r == i15) {
                                    TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i34);
                                            i13 = i15;
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str8 = documentAttribute.performer;
                                                z10 = str8 != null ? str8.toLowerCase().contains(str7) : false;
                                                if (!z10 && (str2 = documentAttribute.title) != null) {
                                                    z10 = str2.toLowerCase().contains(str7);
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
                AndroidUtilities.runOnUIThread(new ko0(i30, tu0Var, arrayList15));
                return;
            case 27:
                ty0 ty0Var = (ty0) obj3;
                String str9 = (String) obj2;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj;
                if (ty0Var.isDismissed()) {
                    return;
                }
                ty0Var.Z.remove(str9);
                if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                    importingSticker.validated = true;
                    int indexOf = ty0Var.Y.indexOf(importingSticker);
                    if (indexOf >= 0) {
                        s4.b1 K = ty0Var.c.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.e8) K.a).setSticker(importingSticker);
                        }
                    } else {
                        ty0Var.d.l();
                    }
                } else {
                    ty0Var.w0(importingSticker);
                }
                if (ty0Var.Z.isEmpty()) {
                    ty0Var.D0();
                    return;
                }
                return;
            case 28:
                ty0.z((ty0) obj3, (ArrayList) obj2, (Boolean) obj);
                return;
            default:
                ty0.F((ty0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
        }
    }

    public /* synthetic */ lg(Object obj, Object obj2, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = arrayList;
    }

    public /* synthetic */ lg(xe0 xe0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 15;
        this.b = xe0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
