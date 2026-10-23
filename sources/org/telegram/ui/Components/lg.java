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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
    /* JADX WARN: Removed duplicated region for block: B:404:0x08e8  */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v92 */
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
        ts0 ts0Var;
        long peerId;
        org.telegram.ui.ActionBar.n2 n2Var;
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
                        ti.x(ti.this, z11, ghVar);
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
                ti.p((ti) obj3, (AnimationNotificationsLocker) obj2, (org.telegram.ui.ActionBar.z2) obj);
                return;
            case 3:
                TLObject tLObject = (TLObject) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                HashMap hashMap = ((up) obj3).s;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    g6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, g6Var);
                FileLoader.getInstance(g6Var.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 4:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) obj3;
                d9Var.setText((CharSequence) obj2);
                d9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, (org.telegram.ui.ActionBar.d6) obj));
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
                qc M = xc.a0((org.telegram.ui.ActionBar.n2) obj).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, k10Var.c0), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj2).size(), new Object[0]), R.raw.ic_delete);
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
                l70 l70Var = (l70) obj3;
                l70Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new ProfileActivity(bundle, null));
                l70Var.l0 = true;
                return;
            case 10:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                l70 l70Var2 = ((f70) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = l70Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (l70Var2.j0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = l70Var2.d;
                    if (chatFull2 != null) {
                        int i20 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i20;
                        if (i20 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = ((org.telegram.ui.ActionBar.f3) l70Var2).currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(l70Var2.g0, chatFull2.invitesCount);
                    }
                    org.telegram.ui.ib ibVar = l70Var2.j0;
                    if (ibVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = l70Var2.b;
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
                        i11 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
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
                v70.P((v70) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 12:
                r70 r70Var = (r70) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                r70Var.h = null;
                r70Var.c = arrayList5;
                r70Var.d = (ArrayList) obj;
                hg.a2 a2Var = r70Var.e;
                a2Var.f(arrayList5, null);
                v70 v70Var = r70Var.n;
                v70Var.K(r70Var.f - 1);
                r70Var.l();
                if (a2Var.e() || r70Var.h() > 2) {
                    return;
                }
                v70Var.s.e(false, true);
                return;
            case 13:
                x90 x90Var = (x90) obj3;
                y90 y90Var = (y90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                w90 w90Var = x90Var.h;
                if (w90Var == null || x90Var.e != y90Var) {
                    return;
                }
                w90Var.a(clickableSpan);
                x90Var.e = null;
                x90Var.b.d(true);
                return;
            case 14:
                tc0 tc0Var = (tc0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                org.telegram.ui.ActionBar.d6 d6Var = tc0Var.c;
                TextView textView = tc0Var.f;
                TextView textView2 = tc0Var.e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        tc0Var.E = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new xc(lb.a(tc0Var.getContext()), d6Var).f0(tL_error2, false);
                    }
                } else if (tLObject3 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject3).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = tc0Var.d.animate().alpha(1.0f);
                bs bsVar = bs.h;
                org.telegram.messenger.nk.t(alpha2, bsVar, 320L);
                tc0Var.h.animate().alpha(0.0f).setInterpolator(bsVar).setDuration(320L).start();
                if (tc0Var.E) {
                    tc0Var.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), 6, 0));
                    tc0Var.setOnClickListener(new u80(tc0Var, 2));
                    return;
                } else {
                    tc0Var.setBackground(null);
                    tc0Var.setOnClickListener(null);
                    return;
                }
            case 15:
                ue0.p((ue0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 16:
                String str4 = (String) obj2;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                org.telegram.ui.ot0 ot0Var = (org.telegram.ui.ot0) ((hg0) obj3).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + ot0Var.w).put("platform", "DESKTOP"))).put("videoId", ot0Var.w).toString().getBytes("UTF-8"));
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
                            if (ot0Var.H == 0) {
                                ot0Var.s = optString;
                                return;
                            } else {
                                lg0.a(ot0Var, optString);
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
                lh0.o((lh0) obj3, (kh0) obj2, (TLObject) obj);
                return;
            case 18:
                un0 un0Var = (un0) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList<MessageObject> arrayList7 = (ArrayList) obj;
                int i21 = un0Var.d;
                for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                    DownloadController.getInstance(i21).onDownloadComplete((MessageObject) arrayList6.get(i22));
                }
                if (!arrayList7.isEmpty()) {
                    DownloadController.getInstance(i21).deleteRecentFiles(arrayList7);
                }
                un0Var.O = false;
                un0Var.d(true);
                return;
            case 19:
                po0 po0Var = (po0) obj3;
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj2;
                i80 i80Var = (i80) obj;
                if (UserConfig.getInstance(po0Var.K0.H0).isPremium()) {
                    cyVar.getMessagesController().disableAds(true);
                    po0Var.T();
                    xc.a0(cyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new sg.y0((org.telegram.ui.ActionBar.n2) cyVar, 3, true).show();
                }
                i80Var.u();
                return;
            case 20:
                uv0 uv0Var = (uv0) obj3;
                f5.R(uv0Var.getContext(), null, uv0Var.F1, new yr0(uv0Var, (TL_stories.StoryItem) obj2));
                ((i80) obj).u();
                return;
            case 21:
                uv0 uv0Var2 = (uv0) obj3;
                String str5 = (String) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                xt0 xt0Var = new xt0(uv0Var2.getContext(), str5, str5, uv0Var2.F1, n2Var2);
                if (n2Var2 != null) {
                    n2Var2.showDialog(xt0Var);
                    return;
                } else {
                    xt0Var.show();
                    return;
                }
            case 22:
                yt0 yt0Var = (yt0) obj3;
                uv0 uv0Var3 = yt0Var.d;
                f5.R(uv0Var3.getContext(), uv0Var3.v1, (org.telegram.ui.ActionBar.d6) obj2, new tv(yt0Var, 21));
                ((i80) obj).u();
                return;
            case 23:
                fu0 fu0Var = (fu0) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                uv0 uv0Var4 = fu0Var.n;
                int h = fu0Var.h();
                if (tL_error3 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject4;
                    uv0Var4.v1.getMessagesController().putChats(messages_chats.chats, false);
                    fu0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    fu0Var.d.addAll(messages_chats.chats);
                } else {
                    fu0Var.h = true;
                }
                int i23 = 0;
                while (true) {
                    nu0[] nu0VarArr = uv0Var4.k0;
                    if (i23 >= nu0VarArr.length) {
                        fu0Var.e = false;
                        fu0Var.f = true;
                        fu0Var.l();
                        return;
                    } else {
                        nu0 nu0Var = nu0VarArr[i23];
                        if (nu0Var.F == 6 && (ts0Var = nu0Var.h) != null && (fu0Var.f || h == 0)) {
                            uv0Var4.z(ts0Var, 0, null);
                        }
                        i23++;
                    }
                }
                break;
            case 24:
                lu0 lu0Var = (lu0) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = lu0Var.s.v1;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i24 = 25;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new lg((Object) lu0Var, (Object) new ArrayList(), (Object) new ArrayList(), i24));
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
                        n2Var = n2Var3;
                        i26++;
                        n2Var3 = n2Var;
                    }
                    TLRPC.User user3 = n2Var3.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user3.id != n2Var3.getUserConfig().getClientUserId()) {
                        String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i27 = 0;
                        boolean z12 = false;
                        while (i27 < i25) {
                            String str6 = strArr[i27];
                            if (lowerCase2.startsWith(str6)) {
                                n2Var = n2Var3;
                            } else {
                                n2Var = n2Var3;
                                if (!org.telegram.messenger.g0.w(" ", str6, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str6) && !org.telegram.messenger.g0.w(" ", str6, translitString2)))) {
                                    String publicUsername = UserObject.getPublicUsername(user3);
                                    r02 = (publicUsername == null || !publicUsername.startsWith(str6)) ? z12 : 2;
                                    if (r02 == 0) {
                                        if (r02 == 1) {
                                            arrayList9.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str6));
                                        } else {
                                            arrayList9.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user3), null, "@" + str6));
                                        }
                                        arrayList10.add(tLObject5);
                                        i26++;
                                        n2Var3 = n2Var;
                                    } else {
                                        i27++;
                                        z12 = r02;
                                        n2Var3 = n2Var;
                                    }
                                }
                            }
                            r02 = 1;
                            if (r02 == 0) {
                            }
                        }
                    }
                    n2Var = n2Var3;
                    i26++;
                    n2Var3 = n2Var;
                }
                AndroidUtilities.runOnUIThread(new lg((Object) lu0Var, (Object) arrayList9, (Object) arrayList10, 25));
                return;
            case 25:
                lu0 lu0Var2 = (lu0) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                uv0 uv0Var5 = lu0Var2.s;
                if (uv0Var5.V0) {
                    lu0Var2.d = arrayList11;
                    lu0Var2.r--;
                    if (!ChatObject.isChannel(lu0Var2.n)) {
                        ArrayList arrayList13 = lu0Var2.e.g;
                        arrayList13.clear();
                        arrayList13.addAll(arrayList12);
                    }
                    if (lu0Var2.r == 0) {
                        int i28 = 0;
                        while (true) {
                            nu0[] nu0VarArr2 = uv0Var5.k0;
                            if (i28 < nu0VarArr2.length) {
                                nu0 nu0Var2 = nu0VarArr2[i28];
                                if (nu0Var2.F == 7) {
                                    if (lu0Var2.h == 0) {
                                        nu0Var2.w.e(false, true);
                                    } else {
                                        uv0Var5.z(nu0Var2.h, 0, null);
                                    }
                                }
                                i28++;
                            }
                        }
                    }
                    lu0Var2.l();
                    return;
                }
                return;
            case 26:
                qu0 qu0Var = (qu0) obj3;
                ArrayList arrayList14 = (ArrayList) obj2;
                qu0Var.getClass();
                String lowerCase3 = ((String) obj).trim().toLowerCase();
                int i29 = 10;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ho0(i29, qu0Var, new ArrayList()));
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
                                } else if (qu0Var.r == i15) {
                                    TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i33);
                                            i13 = i15;
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str8 = documentAttribute.performer;
                                                z10 = str8 != null ? str8.toLowerCase().contains(str7) : false;
                                                if (!z10 && (str2 = documentAttribute.title) != null) {
                                                    z10 = str2.toLowerCase().contains(str7);
                                                }
                                            } else {
                                                i33++;
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
                                        i32++;
                                        i15 = i13;
                                    }
                                }
                            }
                            i13 = i15;
                            i32++;
                            i15 = i13;
                        }
                    }
                    i13 = i15;
                    i31++;
                    i15 = i13;
                }
                AndroidUtilities.runOnUIThread(new ho0(i29, qu0Var, arrayList15));
                return;
            case 27:
                qy0 qy0Var = (qy0) obj3;
                String str9 = (String) obj2;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj;
                if (qy0Var.isDismissed()) {
                    return;
                }
                qy0Var.Z.remove(str9);
                if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                    importingSticker.validated = true;
                    int indexOf = qy0Var.Y.indexOf(importingSticker);
                    if (indexOf >= 0) {
                        s4.b1 K = qy0Var.c.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.e8) K.a).setSticker(importingSticker);
                        }
                    } else {
                        qy0Var.d.l();
                    }
                } else {
                    qy0Var.v0(importingSticker);
                }
                if (qy0Var.Z.isEmpty()) {
                    qy0Var.C0();
                    return;
                }
                return;
            case 28:
                qy0.y((qy0) obj3, (ArrayList) obj2, (Boolean) obj);
                return;
            default:
                qy0.E((qy0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
        }
    }

    public /* synthetic */ lg(Object obj, Object obj2, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = arrayList;
    }

    public /* synthetic */ lg(ue0 ue0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 15;
        this.b = ue0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
