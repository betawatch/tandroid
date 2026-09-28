package org.telegram.messenger.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.WebResourceRequest;
import android.widget.TextView;
import gg.c2;
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
import k2.u;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.y2;
import org.telegram.ui.Cells.na;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.y60;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au0;
import org.telegram.ui.hb;
import org.telegram.ui.lo;
import org.telegram.ui.qb;
import org.telegram.ui.ub;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x04b4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        ViewGroup viewGroup;
        SQLiteCursor sQLiteCursor;
        String str;
        ArrayList<Long> arrayList;
        TLRPC.User user;
        int i10;
        int i11;
        int i12;
        JSONObject optJSONObject;
        String optString;
        int i13 = this.a;
        int i14 = 8;
        Bitmap bitmap = null;
        int i15 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                ((VideoPlayerHolderBase) obj3).lambda$release$3((TLRPC.Document) obj2, (Runnable) obj);
                return;
            case 1:
                ((Utilities.Callback2) obj3).run((TLObject) obj2, (TLRPC.TL_error) obj);
                return;
            case 2:
                ((Utilities.Callback2) obj3).run((TLRPC.Updates) obj2, (TLRPC.TL_error) obj);
                return;
            case 3:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                m2 m2Var = (m2) obj2;
                m2 m2Var2 = (m2) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.J;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.J);
                }
                if (actionBarLayout.h || actionBarLayout.a0) {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    z10 = false;
                    actionBarLayout.h = false;
                    actionBarLayout.J = null;
                    actionBarLayout.a0 = false;
                } else {
                    actionBarLayout.v.setTranslationX(0.0f);
                    z10 = false;
                }
                actionBarLayout.m(m2Var);
                m2Var.setRemovingFromStack(z10);
                m2Var.onTransitionAnimationEnd(z10, true);
                m2Var2.onTransitionAnimationEnd(true, true);
                m2Var2.onBecomeFullyVisible();
                return;
            case 4:
                ((m2) obj2).presentFragment((wn) obj);
                ((m3) obj3).c = false;
                return;
            case 5:
                m3 m3Var = (m3) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                l3 l3Var = (l3) obj;
                m3Var.getClass();
                int i16 = 0;
                while (i16 < arrayList2.size()) {
                    if (((j3) arrayList2.get(i16)).a == l3Var) {
                        arrayList2.remove(i16);
                        i16--;
                    }
                    i16++;
                }
                m3Var.invalidate();
                return;
            case 6:
                g6 g6Var = (g6) obj3;
                TLObject tLObject = (TLObject) obj2;
                g6 g6Var2 = (g6) obj;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    g6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                g6Var.g0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(g6Var.E).addObserver(g6Var, NotificationCenter.fileLoadFailed);
                FileLoader.getInstance(g6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 7:
                w0 w0Var = (w0) obj3;
                w0Var.X0.J1(w0Var, (TLRPC.TL_premiumGiftOption) obj2, (String) obj);
                return;
            case 8:
                g6 g6Var3 = (g6) obj2;
                g6Var3.f = !g6Var3.d((File) obj, g6Var3.c);
                AndroidUtilities.runOnUIThread(new na(i14, (pa) obj3, g6Var3));
                return;
            case 9:
                e0 e0Var = (e0) obj3;
                e5.M((Context) obj2, e0Var.l0, new u(e0Var, 11), (d6) obj);
                return;
            case 10:
                j8.o((j8) obj3, (a2) obj2, (TLObject) obj);
                return;
            case 11:
                gf gfVar = (gf) obj3;
                gfVar.getClass();
                ((sv0) obj2).getViewTreeObserver().removeOnDrawListener(gfVar);
                ((jp0) obj).a.setHideAvatar(true);
                return;
            case 12:
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
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(photoEntry);
                            AndroidUtilities.runOnUIThread(new o(ngVar, arrayList3, file, 13));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 13:
                ((ng) obj3).n((File) obj, (ArrayList) obj2);
                return;
            case 14:
                wi.n((wi) obj3, (AnimationNotificationsLocker) obj2, (y2) obj);
                return;
            case 15:
                final wi wiVar = (wi) obj3;
                final hh hhVar = (hh) obj;
                final boolean z11 = wiVar.z0.getCurrentItemTop() <= ((oi) obj2).getButtonsHideOffset();
                float alpha = wiVar.X0.getAlpha();
                float f7 = z11 ? 1.0f : 0.0f;
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.b(new oh(wiVar, alpha, f7, z11));
                kVar.a(new o1.f() { // from class: org.telegram.ui.Components.ph
                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f10, float f11) {
                        wi.t(wi.this, z11, hhVar);
                    }
                });
                o1.l lVar = new o1.l(500.0f);
                kVar.u = lVar;
                lVar.a(1.0f);
                kVar.u.b(1000.0f);
                kVar.f();
                wiVar.t1 = kVar;
                return;
            case 16:
                TLObject tLObject2 = (TLObject) obj2;
                g6 g6Var4 = (g6) obj;
                HashMap hashMap = ((mp) obj3).s;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    g6Var4.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, g6Var4);
                FileLoader.getInstance(g6Var4.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 17:
                ss ssVar = (ss) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                rs rsVar = (rs) obj;
                ArrayList arrayList4 = new ArrayList();
                ArrayList<Long> arrayList5 = new ArrayList<>();
                long j3 = 0;
                try {
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList5.add(Long.valueOf(queryFinalized.longValue(i15)));
                            j3 = Math.max(j3, queryFinalized.longValue(1));
                            str = queryFinalized.stringValue(2);
                            i15 = 0;
                        } catch (Exception e) {
                            e = e;
                            sQLiteCursor = queryFinalized;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(ssVar, arrayList4, j3, str, rsVar, 4));
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
                    ArrayList<TLRPC.User> users = messagesStorage.getUsers(arrayList5);
                    if (users != null) {
                        int size = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Long l4 = arrayList5.get(i17);
                            i17++;
                            long longValue = l4.longValue();
                            int size2 = users.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size2) {
                                    TLRPC.User user2 = users.get(i18);
                                    i18++;
                                    user = user2;
                                    if (user != null) {
                                        arrayList = arrayList5;
                                        if (user.id == longValue) {
                                        }
                                    } else {
                                        arrayList = arrayList5;
                                    }
                                    arrayList5 = arrayList;
                                } else {
                                    arrayList = arrayList5;
                                    user = null;
                                }
                            }
                            if (user != null) {
                                arrayList4.add(user);
                            }
                            arrayList5 = arrayList;
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e7) {
                    e = e7;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(ssVar, arrayList4, j3, str, rsVar, 4));
                return;
            case 18:
                xz xzVar = (xz) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                b00 b00Var = xzVar.J;
                int[] iArr = b00Var.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!b00Var.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, b00Var.g(!xzVar.T ? 1 : 0), 0);
                GLES20.glClear(0);
                int i19 = xzVar.U;
                if (i19 != 0 && (i10 = xzVar.V) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i19 * i10 * 4);
                    GLES20.glReadPixels(0, 0, xzVar.U, xzVar.V, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(xzVar.U, xzVar.V, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 19:
                e10 e10Var = (e10) obj3;
                e10Var.z0 = -1;
                qc M = xc.a0((m2) obj2).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, e10Var.c0), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                e10Var.A0 = true;
                e10Var.dismiss();
                e10Var.n.getMessagesController().invalidateChatlistFolderUpdate(e10Var.Y);
                return;
            case 20:
                e10 e10Var2 = (e10) obj3;
                e10Var2.z0 = e10Var2.n.getConnectionsManager().sendRequest((TLObject) obj2, new lo(i14, e10Var2, (Pair) obj));
                return;
            case 21:
                e70 e70Var = (e70) obj3;
                e70Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((m2) obj).presentFragment(new ProfileActivity(bundle, null));
                e70Var.l0 = true;
                return;
            case 22:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                e70 e70Var2 = ((y60) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
                        TLRPC.ChatFull chatFull = e70Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (e70Var2.j0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = e70Var2.d;
                    if (chatFull2 != null) {
                        int i20 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i20;
                        if (i20 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = ((e3) e70Var2).currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(e70Var2.g0, chatFull2.invitesCount);
                    }
                    hb hbVar = e70Var2.j0;
                    if (hbVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = e70Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        ub ubVar = hbVar.a;
                        ArrayList arrayList6 = ubVar.o0;
                        int size3 = arrayList6.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                        i11 = ((m2) ubVar).currentAccount;
                        if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f, ubVar.T, true).contentType < 0) {
                            return;
                        }
                        ubVar.R0();
                        int size4 = arrayList6.size() - size3;
                        if (size4 > 0) {
                            ubVar.C0.N = true;
                            qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size4);
                            ub.K0(ubVar);
                        }
                        ubVar.y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                o70.O((o70) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 24:
                k70 k70Var = (k70) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                k70Var.h = null;
                k70Var.c = arrayList7;
                k70Var.d = (ArrayList) obj;
                c2 c2Var = k70Var.e;
                c2Var.f(arrayList7, null);
                o70 o70Var = k70Var.n;
                o70Var.J(k70Var.f - 1);
                k70Var.l();
                if (c2Var.e() || k70Var.h() > 2) {
                    return;
                }
                o70Var.s.e(false, true);
                return;
            case 25:
                p90 p90Var = (p90) obj3;
                q90 q90Var = (q90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                o90 o90Var = p90Var.h;
                if (o90Var == null || p90Var.e != q90Var) {
                    return;
                }
                o90Var.a(clickableSpan);
                p90Var.e = null;
                p90Var.b.d(true);
                return;
            case 26:
                mc0 mc0Var = (mc0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                d6 d6Var = mc0Var.c;
                TextView textView = mc0Var.f;
                TextView textView2 = mc0Var.e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        mc0Var.E = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new xc(lb.a(mc0Var.getContext()), d6Var).d0(tL_error2, false);
                    }
                } else if (tLObject4 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject4).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = mc0Var.d.animate().alpha(1.0f);
                sr srVar = sr.h;
                ok.s(alpha2, srVar, 320L);
                mc0Var.h.animate().alpha(0.0f).setInterpolator(srVar).setDuration(320L).start();
                if (mc0Var.E) {
                    mc0Var.setBackground(h6.Y(h6.v0(h6.i6, d6Var), 6, 0));
                    mc0Var.setOnClickListener(new k80(mc0Var, 3));
                    return;
                } else {
                    mc0Var.setBackground(null);
                    mc0Var.setOnClickListener(null);
                    return;
                }
            case 27:
                me0.o((me0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 28:
                String str2 = (String) obj2;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                au0 au0Var = (au0) ((oi.i) obj3).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + au0Var.w).put("platform", "DESKTOP"))).put("videoId", au0Var.w).toString().getBytes("UTF-8"));
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
                            if (au0Var.H == 0) {
                                au0Var.s = optString;
                                return;
                            } else {
                                cg0.a(au0Var, optString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr2, 0, read2);
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            default:
                ch0.n((ch0) obj3, (bh0) obj2, (TLObject) obj);
                return;
        }
    }

    public /* synthetic */ o(me0 me0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 27;
        this.b = me0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
