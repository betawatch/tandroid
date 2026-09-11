package org.telegram.ui.ActionBar;

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
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.na;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.os;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
import org.telegram.ui.hb;
import org.telegram.ui.hu0;
import org.telegram.ui.qb;
import org.telegram.ui.ro;
import org.telegram.ui.ub;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0533  */
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
        int i14 = 3;
        int i15 = 8;
        Bitmap bitmap = null;
        int i16 = 0;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i13) {
            case 0:
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
            case 1:
                ((n2) obj2).presentFragment((co) obj);
                ((o3) obj3).c = false;
                return;
            case 2:
                o3 o3Var = (o3) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                n3 n3Var = (n3) obj;
                o3Var.getClass();
                int i17 = 0;
                while (i17 < arrayList2.size()) {
                    if (((l3) arrayList2.get(i17)).a == n3Var) {
                        arrayList2.remove(i17);
                        i17--;
                    }
                    i17++;
                }
                o3Var.invalidate();
                return;
            case 3:
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
            case 4:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj3;
                w0Var.X0.C1(w0Var, (TLRPC.TL_premiumGiftOption) obj2, (String) obj);
                return;
            case 5:
                i6 i6Var3 = (i6) obj2;
                i6Var3.f = !i6Var3.d((File) obj, i6Var3.c);
                AndroidUtilities.runOnUIThread(new na(i15, (pa) obj3, i6Var3));
                return;
            case 6:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) obj3;
                org.telegram.ui.Components.e5.M((Context) obj2, f0Var.l0, new k2.g0(f0Var, i15), (f6) obj);
                return;
            case 7:
                k8.o((k8) obj3, (b2) obj2, (TLObject) obj);
                return;
            case 8:
                gf gfVar = (gf) obj3;
                gfVar.getClass();
                ((ev0) obj2).getViewTreeObserver().removeOnDrawListener(gfVar);
                ((uo0) obj).a.setHideAvatar(true);
                return;
            case 9:
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
                            AndroidUtilities.runOnUIThread(new p(ngVar, arrayList3, file, 10));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 10:
                ((ng) obj3).n((File) obj, (ArrayList) obj2);
                return;
            case 11:
                vi.n((vi) obj3, (AnimationNotificationsLocker) obj2, (z2) obj);
                return;
            case 12:
                final vi viVar = (vi) obj3;
                final hh hhVar = (hh) obj;
                final boolean z11 = viVar.z0.getCurrentItemTop() <= ((ni) obj2).getButtonsHideOffset();
                float alpha = viVar.X0.getAlpha();
                float f7 = z11 ? 1.0f : 0.0f;
                o1.k kVar = new o1.k(new o1.j(0.0f));
                kVar.b(new oh(viVar, alpha, f7, z11));
                kVar.a(new o1.f() { // from class: org.telegram.ui.Components.ph
                    @Override // o1.f
                    public final void a(o1.h hVar, boolean z12, float f10, float f11) {
                        vi.t(vi.this, z11, hhVar);
                    }
                });
                o1.l lVar = new o1.l(500.0f);
                kVar.u = lVar;
                lVar.a(1.0f);
                kVar.u.b(1000.0f);
                kVar.f();
                viVar.t1 = kVar;
                return;
            case 13:
                TLObject tLObject2 = (TLObject) obj2;
                i6 i6Var4 = (i6) obj;
                HashMap hashMap = ((jp) obj3).s;
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
            case 14:
                ps psVar = (ps) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                os osVar = (os) obj;
                ArrayList arrayList4 = new ArrayList();
                ArrayList<Long> arrayList5 = new ArrayList<>();
                long j3 = 0;
                try {
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            arrayList5.add(Long.valueOf(queryFinalized.longValue(i16)));
                            j3 = Math.max(j3, queryFinalized.longValue(1));
                            str = queryFinalized.stringValue(2);
                            i16 = 0;
                        } catch (Exception e7) {
                            e = e7;
                            sQLiteCursor = queryFinalized;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(psVar, arrayList4, j3, str, osVar, 4));
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
                        int i18 = 0;
                        while (i18 < size) {
                            Long l4 = arrayList5.get(i18);
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
                } catch (Exception e10) {
                    e = e10;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f(psVar, arrayList4, j3, str, osVar, 4));
                return;
            case 15:
                vz vzVar = (vz) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                zz zzVar = vzVar.J;
                int[] iArr = zzVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!zzVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, zzVar.g(!vzVar.T ? 1 : 0), 0);
                GLES20.glClear(0);
                int i20 = vzVar.U;
                if (i20 != 0 && (i10 = vzVar.V) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i20 * i10 * 4);
                    GLES20.glReadPixels(0, 0, vzVar.U, vzVar.V, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(vzVar.U, vzVar.V, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 16:
                c10 c10Var = (c10) obj3;
                c10Var.z0 = -1;
                qc M = yc.a0((n2) obj2).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, c10Var.c0), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                c10Var.A0 = true;
                c10Var.dismiss();
                c10Var.n.getMessagesController().invalidateChatlistFolderUpdate(c10Var.Y);
                return;
            case 17:
                c10 c10Var2 = (c10) obj3;
                c10Var2.z0 = c10Var2.n.getConnectionsManager().sendRequest((TLObject) obj2, new ro(i15, c10Var2, (Pair) obj));
                return;
            case 18:
                r60 r60Var = (r60) obj3;
                r60Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj).id);
                ((n2) obj2).presentFragment(new ProfileActivity(bundle, null));
                r60Var.l0 = true;
                return;
            case 19:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj;
                r60 r60Var2 = ((l60) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
                        TLRPC.ChatFull chatFull = r60Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (r60Var2.j0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = r60Var2.d;
                    if (chatFull2 != null) {
                        int i21 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i21;
                        if (i21 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = r60Var2.currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(r60Var2.g0, chatFull2.invitesCount);
                    }
                    hb hbVar = r60Var2.j0;
                    if (hbVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = r60Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        ub ubVar = hbVar.a;
                        ArrayList arrayList6 = ubVar.s0;
                        int size3 = arrayList6.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                        i11 = ubVar.currentAccount;
                        if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.r0, (HashMap<String, ArrayList<MessageObject>>) ubVar.q0, ubVar.s, ubVar.X, true).contentType < 0) {
                            return;
                        }
                        ubVar.R0();
                        int size4 = arrayList6.size() - size3;
                        if (size4 > 0) {
                            ubVar.G0.N = true;
                            qb qbVar = ubVar.I;
                            qbVar.s(qbVar.h, size4);
                            ub.K0(ubVar);
                        }
                        ubVar.C0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                b70.O((b70) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 21:
                x60 x60Var = (x60) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                x60Var.h = null;
                x60Var.c = arrayList7;
                x60Var.d = (ArrayList) obj;
                hg.b2 b2Var = x60Var.e;
                b2Var.f(arrayList7, null);
                b70 b70Var = x60Var.n;
                b70Var.J(x60Var.f - 1);
                x60Var.l();
                if (b2Var.e() || x60Var.h() > 2) {
                    return;
                }
                b70Var.s.e(false, true);
                return;
            case 22:
                d90 d90Var = (d90) obj3;
                e90 e90Var = (e90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                c90 c90Var = d90Var.h;
                if (c90Var == null || d90Var.e != e90Var) {
                    return;
                }
                c90Var.a(clickableSpan);
                d90Var.e = null;
                d90Var.b.d(true);
                return;
            case 23:
                ac0 ac0Var = (ac0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj;
                f6 f6Var = ac0Var.c;
                TextView textView = ac0Var.f;
                TextView textView2 = ac0Var.e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        ac0Var.E = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new yc(lb.a(ac0Var.getContext()), f6Var).d0(tL_error2, false);
                    }
                } else if (tLObject4 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject4).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = ac0Var.d.animate().alpha(1.0f);
                pr prVar = pr.h;
                vl.q(alpha2, prVar, 320L);
                ac0Var.h.animate().alpha(0.0f).setInterpolator(prVar).setDuration(320L).start();
                if (ac0Var.E) {
                    ac0Var.setBackground(j6.Y(j6.v0(j6.i6, f6Var), 6, 0));
                    ac0Var.setOnClickListener(new x70(ac0Var, i14));
                    return;
                } else {
                    ac0Var.setBackground(null);
                    ac0Var.setOnClickListener(null);
                    return;
                }
            case 24:
                ae0.o((ae0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 25:
                String str2 = (String) obj2;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                hu0 hu0Var = (hu0) ((fg.i) obj3).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
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
                                qf0.a(hu0Var, optString);
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
            case 26:
                pg0.n((pg0) obj3, (og0) obj2, (TLObject) obj);
                return;
            case 27:
                vm0 vm0Var = (vm0) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                ArrayList<MessageObject> arrayList9 = (ArrayList) obj;
                int i22 = vm0Var.d;
                for (int i23 = 0; i23 < arrayList8.size(); i23++) {
                    DownloadController.getInstance(i22).onDownloadComplete((MessageObject) arrayList8.get(i23));
                }
                if (!arrayList9.isEmpty()) {
                    DownloadController.getInstance(i22).deleteRecentFiles(arrayList9);
                }
                vm0Var.O = false;
                vm0Var.d(true);
                return;
            case 28:
                rn0 rn0Var = (rn0) obj3;
                uy uyVar = (uy) obj2;
                n70 n70Var = (n70) obj;
                if (UserConfig.getInstance(rn0Var.K0.H0).isPremium()) {
                    uyVar.getMessagesController().disableAds(true);
                    rn0Var.T();
                    yc.a0(uyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new sg.a1((n2) uyVar, 3, true).show();
                }
                n70Var.u();
                return;
            default:
                xu0 xu0Var = (xu0) obj3;
                org.telegram.ui.Components.e5.S(xu0Var.getContext(), null, xu0Var.F1, new zq0(xu0Var, (TL_stories.StoryItem) obj2));
                ((n70) obj).u();
                return;
        }
    }

    public /* synthetic */ p(r60 r60Var, TLRPC.User user, n2 n2Var) {
        this.a = 18;
        this.c = r60Var;
        this.d = user;
        this.b = n2Var;
    }

    public /* synthetic */ p(ae0 ae0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 24;
        this.c = ae0Var;
        this.b = tL_error;
        this.d = tLObject;
    }
}
