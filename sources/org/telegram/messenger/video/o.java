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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.na;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.e0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.ip0;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zf0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ib;
import org.telegram.ui.iu0;
import org.telegram.ui.oo;
import org.telegram.ui.rb;
import org.telegram.ui.vb;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                n2 n2Var = (n2) obj2;
                n2 n2Var2 = (n2) obj;
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
                actionBarLayout.m(n2Var);
                n2Var.setRemovingFromStack(z10);
                n2Var.onTransitionAnimationEnd(z10, true);
                n2Var2.onTransitionAnimationEnd(true, true);
                n2Var2.onBecomeFullyVisible();
                return;
            case 4:
                ((n2) obj2).presentFragment((zn) obj);
                ((o3) obj3).c = false;
                return;
            case 5:
                o3 o3Var = (o3) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                n3 n3Var = (n3) obj;
                o3Var.getClass();
                int i16 = 0;
                while (i16 < arrayList2.size()) {
                    if (((l3) arrayList2.get(i16)).a == n3Var) {
                        arrayList2.remove(i16);
                        i16--;
                    }
                    i16++;
                }
                o3Var.invalidate();
                return;
            case 6:
                i6 i6Var = (i6) obj3;
                TLObject tLObject = (TLObject) obj2;
                i6 i6Var2 = (i6) obj;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    i6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                i6Var.g0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoadFailed);
                FileLoader.getInstance(i6Var2.E).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 7:
                w0 w0Var = (w0) obj3;
                w0Var.X0.J1(w0Var, (TLRPC.TL_premiumGiftOption) obj2, (String) obj);
                return;
            case 8:
                i6 i6Var3 = (i6) obj2;
                i6Var3.f = !i6Var3.d((File) obj, i6Var3.c);
                AndroidUtilities.runOnUIThread(new na(i14, (pa) obj3, i6Var3));
                return;
            case 9:
                e0 e0Var = (e0) obj3;
                e5.M((Context) obj2, e0Var.l0, new u(e0Var, 11), (e6) obj);
                return;
            case 10:
                j8.o((j8) obj3, (b2) obj2, (TLObject) obj);
                return;
            case 11:
                ff ffVar = (ff) obj3;
                ffVar.getClass();
                ((rv0) obj2).getViewTreeObserver().removeOnDrawListener(ffVar);
                ((ip0) obj).a.setHideAvatar(true);
                return;
            case 12:
                mg mgVar = (mg) obj3;
                File file = (File) obj;
                try {
                    InputStream openInputStream = mgVar.getContext().getContentResolver().openInputStream((Uri) obj2);
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
                            AndroidUtilities.runOnUIThread(new o(mgVar, arrayList3, file, 13));
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
                ((mg) obj3).n((File) obj, (ArrayList) obj2);
                return;
            case 14:
                vi.n((vi) obj3, (AnimationNotificationsLocker) obj2, (z2) obj);
                return;
            case 15:
                final vi viVar = (vi) obj3;
                final gh ghVar = (gh) obj;
                final boolean z11 = viVar.z0.getCurrentItemTop() <= ((ni) obj2).getButtonsHideOffset();
                float alpha = viVar.X0.getAlpha();
                float f7 = z11 ? 1.0f : 0.0f;
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.b(new nh(viVar, alpha, f7, z11));
                kVar.a(new o1.f() { // from class: org.telegram.ui.Components.oh
                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f10, float f11) {
                        vi.t(vi.this, z11, ghVar);
                    }
                });
                o1.l lVar = new o1.l(500.0f);
                kVar.u = lVar;
                lVar.a(1.0f);
                kVar.u.b(1000.0f);
                kVar.f();
                viVar.t1 = kVar;
                return;
            case 16:
                TLObject tLObject2 = (TLObject) obj2;
                i6 i6Var4 = (i6) obj;
                HashMap hashMap = ((kp) obj3).s;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    i6Var4.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, i6Var4);
                FileLoader.getInstance(i6Var4.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 17:
                qs qsVar = (qs) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                ps psVar = (ps) obj;
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
                                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(qsVar, arrayList4, j3, str, psVar, 4));
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
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(qsVar, arrayList4, j3, str, psVar, 4));
                return;
            case 18:
                vz vzVar = (vz) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                zz zzVar = vzVar.J;
                int[] iArr = zzVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!zzVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, zzVar.g(!vzVar.T ? 1 : 0), 0);
                GLES20.glClear(0);
                int i19 = vzVar.U;
                if (i19 != 0 && (i10 = vzVar.V) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i19 * i10 * 4);
                    GLES20.glReadPixels(0, 0, vzVar.U, vzVar.V, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(vzVar.U, vzVar.V, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 19:
                c10 c10Var = (c10) obj3;
                c10Var.z0 = -1;
                qc M = xc.a0((n2) obj2).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, c10Var.c0), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                c10Var.A0 = true;
                c10Var.dismiss();
                c10Var.n.getMessagesController().invalidateChatlistFolderUpdate(c10Var.Y);
                return;
            case 20:
                c10 c10Var2 = (c10) obj3;
                c10Var2.z0 = c10Var2.n.getConnectionsManager().sendRequest((TLObject) obj2, new oo(i14, c10Var2, (Pair) obj));
                return;
            case 21:
                a70 a70Var = (a70) obj3;
                a70Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((n2) obj).presentFragment(new ProfileActivity(bundle, null));
                a70Var.l0 = true;
                return;
            case 22:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                a70 a70Var2 = ((u60) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
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
                        int i20 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i20;
                        if (i20 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = ((f3) a70Var2).currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(a70Var2.g0, chatFull2.invitesCount);
                    }
                    ib ibVar = a70Var2.j0;
                    if (ibVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = a70Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        vb vbVar = ibVar.a;
                        ArrayList arrayList6 = vbVar.o0;
                        int size3 = arrayList6.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                        i11 = ((n2) vbVar).currentAccount;
                        if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f, vbVar.T, true).contentType < 0) {
                            return;
                        }
                        vbVar.R0();
                        int size4 = arrayList6.size() - size3;
                        if (size4 > 0) {
                            vbVar.C0.N = true;
                            rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size4);
                            vb.K0(vbVar);
                        }
                        vbVar.y0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                k70.O((k70) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 24:
                g70 g70Var = (g70) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                g70Var.h = null;
                g70Var.c = arrayList7;
                g70Var.d = (ArrayList) obj;
                c2 c2Var = g70Var.e;
                c2Var.f(arrayList7, null);
                k70 k70Var = g70Var.n;
                k70Var.J(g70Var.f - 1);
                g70Var.l();
                if (c2Var.e() || g70Var.h() > 2) {
                    return;
                }
                k70Var.s.e(false, true);
                return;
            case 25:
                l90 l90Var = (l90) obj3;
                m90 m90Var = (m90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                k90 k90Var = l90Var.h;
                if (k90Var == null || l90Var.e != m90Var) {
                    return;
                }
                k90Var.a(clickableSpan);
                l90Var.e = null;
                l90Var.b.d(true);
                return;
            case 26:
                ic0 ic0Var = (ic0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                e6 e6Var = ic0Var.c;
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
                        new xc(lb.a(ic0Var.getContext()), e6Var).d0(tL_error2, false);
                    }
                } else if (tLObject4 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject4).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = ic0Var.d.animate().alpha(1.0f);
                qr qrVar = qr.h;
                wh.r(alpha2, qrVar, 320L);
                ic0Var.h.animate().alpha(0.0f).setInterpolator(qrVar).setDuration(320L).start();
                if (ic0Var.E) {
                    ic0Var.setBackground(j6.Y(j6.v0(j6.i6, e6Var), 6, 0));
                    ic0Var.setOnClickListener(new g80(ic0Var, 3));
                    return;
                } else {
                    ic0Var.setBackground(null);
                    ic0Var.setOnClickListener(null);
                    return;
                }
            case 27:
                je0.o((je0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 28:
                String str2 = (String) obj2;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                iu0 iu0Var = (iu0) ((oi.i) obj3).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + iu0Var.w).put("platform", "DESKTOP"))).put("videoId", iu0Var.w).toString().getBytes("UTF-8"));
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
                            if (iu0Var.H == 0) {
                                iu0Var.s = optString;
                                return;
                            } else {
                                zf0.a(iu0Var, optString);
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
                ah0.n((ah0) obj3, (zg0) obj2, (TLObject) obj);
                return;
        }
    }

    public /* synthetic */ o(je0 je0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 27;
        this.b = je0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
