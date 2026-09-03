package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.util.SparseArray;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jp(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        xx0.w((xx0) this.b, (ArrayList) this.c, (Boolean) this.d);
    }

    private final void b() {
        xx0.D((xx0) this.b, (TLRPC.TL_error) this.d, (TLObject) this.c);
    }

    private final void c() {
        xx0.F((xx0) this.b, (String) this.c, (TextView) this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:
    
        if (r6 > 512) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0047, code lost:
    
        if (r8.booleanValue() != r12) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1 A[EDGE_INSN: B:35:0x00d1->B:36:0x00d1 BREAK  A[LOOP:0: B:2:0x0021->B:19:0x00cc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void e() {
        int i10;
        Uri uri;
        String stickerExt;
        int i11;
        xx0 xx0Var = (xx0) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = new ArrayList();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int size = arrayList.size();
        Boolean bool = null;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            if ((obj instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj))) != null) {
                boolean equals = "tgs".equals(stickerExt);
                if (bool == null) {
                    bool = Boolean.valueOf(equals);
                }
                if (xx0Var.isDismissed()) {
                    return;
                }
                SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                importingSticker.animated = equals;
                int i13 = size;
                String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                importingSticker.path = copyFileToCache;
                if (copyFileToCache != null) {
                    if (equals) {
                        importingSticker.mimeType = "application/x-tgsticker";
                    } else {
                        BitmapFactory.decodeFile(copyFileToCache, options);
                        int i14 = options.outWidth;
                        if (i14 != 512 || (i11 = options.outHeight) <= 0 || i11 > 512) {
                            if (options.outHeight != 512 || i14 <= 0) {
                                i10 = i13;
                                i12++;
                                size = i10;
                            }
                        }
                        importingSticker.mimeType = "image/".concat(stickerExt);
                        importingSticker.validated = true;
                    }
                    if (arrayList2 != null) {
                        i10 = i13;
                        if (arrayList2.size() == i10 && (arrayList2.get(i12) instanceof String)) {
                            importingSticker.emoji = (String) arrayList2.get(i12);
                            arrayList3.add(importingSticker);
                            if (arrayList3.size() < 200) {
                                break;
                            }
                            i12++;
                            size = i10;
                        }
                    } else {
                        i10 = i13;
                    }
                    importingSticker.emoji = "#️⃣";
                    arrayList3.add(importingSticker);
                    if (arrayList3.size() < 200) {
                    }
                }
                i10 = i13;
                i12++;
                size = i10;
            }
            i10 = size;
            i12++;
            size = i10;
        }
        AndroidUtilities.runOnUIThread(new jp(xx0Var, arrayList3, bool, 24));
    }

    private final void f() {
        int i10;
        int i11;
        c51 c51Var = (c51) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.c;
        SparseArray sparseArray = c51Var.f;
        ArrayList arrayList = c51Var.e;
        ArrayList arrayList2 = c51Var.n;
        SparseArray sparseArray2 = c51Var.d;
        c51Var.r = false;
        if (tL_error != null || !(tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
            c51Var.s = true;
            return;
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList3 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
        if (arrayList3.size() < 40) {
            c51Var.s = true;
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        if (arrayList2.isEmpty()) {
            int i12 = c51Var.w;
            c51Var.w = i12 + 1;
            sparseArray2.put(i12, -1);
        }
        arrayList2.addAll(arrayList3);
        int size = arrayList.size();
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            TLRPC.StickerSetCovered stickerSetCovered = arrayList3.get(i13);
            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                arrayList.add(stickerSetCovered);
                sparseArray.put(c51Var.w, stickerSetCovered);
                int i14 = c51Var.w;
                c51Var.w = i14 + 1;
                int i15 = size + 1;
                sparseArray2.put(i14, Integer.valueOf(size));
                if (stickerSetCovered.covers.isEmpty()) {
                    sparseArray2.put(c51Var.w, stickerSetCovered.cover);
                    i10 = 1;
                } else {
                    i10 = (int) Math.ceil(stickerSetCovered.covers.size() / c51Var.v);
                    for (int i16 = 0; i16 < stickerSetCovered.covers.size(); i16++) {
                        sparseArray2.put(c51Var.w + i16, stickerSetCovered.covers.get(i16));
                    }
                }
                int i17 = 0;
                while (true) {
                    i11 = c51Var.v * i10;
                    if (i17 >= i11) {
                        break;
                    }
                    sparseArray.put(c51Var.w + i17, stickerSetCovered);
                    i17++;
                }
                c51Var.w = i11 + c51Var.w;
                size = i15;
            }
        }
        c51Var.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x043b A[LOOP:5: B:161:0x03c9->B:177:0x043b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0a64  */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r2v14 */
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
        wr0 wr0Var;
        long peerId;
        org.telegram.ui.ActionBar.p2 p2Var;
        ?? r02;
        boolean z4;
        String str2;
        String absolutePath;
        int i13 = this.a;
        int i14 = 8;
        int i15 = 3;
        int i16 = 20;
        int i17 = 4;
        String str3 = null;
        int i18 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                TLObject tLObject = (TLObject) obj2;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                HashMap hashMap = ((kp) obj3).s;
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
                FileLoader.getInstance(j6Var.B).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 1:
                qs qsVar = (qs) obj3;
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                ps psVar = (ps) obj;
                ArrayList arrayList = new ArrayList();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                long j10 = 0;
                try {
                    SQLiteCursor queryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    String str4 = null;
                    while (queryFinalized.next()) {
                        try {
                            try {
                                arrayList2.add(Long.valueOf(queryFinalized.longValue(0)));
                                j10 = Math.max(j10, queryFinalized.longValue(1));
                                str4 = queryFinalized.stringValue(2);
                            } catch (Exception e6) {
                                e = e6;
                                sQLiteCursor = queryFinalized;
                                str = str4;
                                try {
                                    FileLog.e(e);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    AndroidUtilities.runOnUIThread(new lh.g1(qsVar, arrayList, j10, str, psVar, 12));
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
                        } catch (Exception e10) {
                            e = e10;
                            sQLiteCursor2 = queryFinalized;
                            str = str4;
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor2 = queryFinalized;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> users = messagesStorage.getUsers(arrayList2);
                    if (users != null) {
                        int size = arrayList2.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Long l10 = arrayList2.get(i19);
                            i19++;
                            long longValue = l10.longValue();
                            int size2 = users.size();
                            int i20 = 0;
                            while (true) {
                                if (i20 < size2) {
                                    TLRPC.User user2 = users.get(i20);
                                    i20++;
                                    TLRPC.User user3 = user2;
                                    if (user3 != null) {
                                        sQLiteCursor2 = queryFinalized;
                                        str = str4;
                                        try {
                                            if (user3.id == longValue) {
                                                user = user3;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            sQLiteCursor = sQLiteCursor2;
                                            FileLog.e(e);
                                            if (sQLiteCursor != null) {
                                            }
                                            AndroidUtilities.runOnUIThread(new lh.g1(qsVar, arrayList, j10, str, psVar, 12));
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
                                    queryFinalized = sQLiteCursor2;
                                    str4 = str;
                                } else {
                                    sQLiteCursor2 = queryFinalized;
                                    str = str4;
                                    user = null;
                                }
                            }
                            if (user != null) {
                                arrayList.add(user);
                            }
                            queryFinalized = sQLiteCursor2;
                            str4 = str;
                        }
                    }
                    str = str4;
                    queryFinalized.dispose();
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor = null;
                    str = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                AndroidUtilities.runOnUIThread(new lh.g1(qsVar, arrayList, j10, str, psVar, 12));
                return;
            case 2:
                xz xzVar = (xz) obj3;
                Bitmap[] bitmapArr = (Bitmap[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                b00 b00Var = xzVar.G;
                int[] iArr = b00Var.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!b00Var.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, b00Var.g(!xzVar.Q ? 1 : 0), 0);
                GLES20.glClear(0);
                int i21 = xzVar.R;
                if (i21 == 0 || (i10 = xzVar.S) == 0) {
                    bitmap = null;
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i21 * i10 * 4);
                    GLES20.glReadPixels(0, 0, xzVar.R, xzVar.S, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(xzVar.R, xzVar.S, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 3:
                d10 d10Var = (d10) obj3;
                d10Var.w0 = -1;
                ic M = qc.a0((org.telegram.ui.ActionBar.p2) obj2).M(LocaleController.formatString(R.string.FolderLinkDeletedTitle, d10Var.Z), LocaleController.formatPluralString("FolderLinkDeletedSubtitle", ((ArrayList) obj).size(), new Object[0]), R.raw.ic_delete);
                M.j = 5000;
                M.j();
                d10Var.x0 = true;
                d10Var.dismiss();
                d10Var.n.getMessagesController().invalidateChatlistFolderUpdate(d10Var.V);
                return;
            case 4:
                d10 d10Var2 = (d10) obj3;
                d10Var2.w0 = d10Var2.n.getConnectionsManager().sendRequest((TLObject) obj2, new org.telegram.ui.lo(i14, d10Var2, (Pair) obj));
                return;
            case 5:
                u60 u60Var = (u60) obj3;
                u60Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.User) obj2).id);
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new ProfileActivity(bundle, null));
                u60Var.i0 = true;
                return;
            case 6:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLObject tLObject2 = (TLObject) obj2;
                u60 u60Var2 = ((o60) obj3).a.c;
                if (tL_error == null) {
                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                        TLRPC.ChatFull chatFull = u60Var2.d;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (u60Var2.g0 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = u60Var2.d;
                    if (chatFull2 != null) {
                        int i22 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i22;
                        if (i22 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        i12 = ((org.telegram.ui.ActionBar.h3) u60Var2).currentAccount;
                        MessagesStorage.getInstance(i12).saveChatLinksCount(u60Var2.d0, chatFull2.invitesCount);
                    }
                    org.telegram.ui.eb ebVar = u60Var2.g0;
                    if (ebVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = u60Var2.b;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.sb sbVar = ebVar.a;
                        ArrayList arrayList3 = sbVar.p0;
                        int size3 = arrayList3.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = sbVar.getAccountInstance().getUserConfig().clientUserId;
                        i11 = ((org.telegram.ui.ActionBar.p2) sbVar).currentAccount;
                        if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) sbVar.o0, (HashMap<String, ArrayList<MessageObject>>) sbVar.n0, sbVar.s, sbVar.U, true).contentType < 0) {
                            return;
                        }
                        sbVar.R0();
                        int size4 = arrayList3.size() - size3;
                        if (size4 > 0) {
                            sbVar.D0.N = true;
                            org.telegram.ui.ob obVar = sbVar.F;
                            obVar.s(obVar.h, size4);
                            org.telegram.ui.sb.K0(sbVar);
                        }
                        sbVar.z0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                e70.O((e70) obj3, (TLRPC.TL_error) obj, (TLObject) obj2);
                return;
            case 8:
                a70 a70Var = (a70) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                a70Var.h = null;
                a70Var.c = arrayList4;
                a70Var.d = (ArrayList) obj;
                uf.k1 k1Var = a70Var.e;
                k1Var.f(arrayList4, null);
                e70 e70Var = a70Var.n;
                e70Var.I(a70Var.f - 1);
                a70Var.l();
                if (k1Var.e() || a70Var.h() > 2) {
                    return;
                }
                e70Var.s.e(false, true);
                return;
            case 9:
                g90 g90Var = (g90) obj3;
                h90 h90Var = (h90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                f90 f90Var = g90Var.h;
                if (f90Var == null || g90Var.e != h90Var) {
                    return;
                }
                f90Var.a(clickableSpan);
                g90Var.e = null;
                g90Var.b.d(true);
                return;
            case 10:
                cc0 cc0Var = (cc0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                TLObject tLObject3 = (TLObject) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = cc0Var.c;
                TextView textView = cc0Var.f;
                TextView textView2 = cc0Var.e;
                if (tL_error2 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error2.text)) {
                        cc0Var.B = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new qc(cb.a(cc0Var.getContext()), g6Var).d0(tL_error2, false);
                    }
                } else if (tLObject3 instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject3).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha = cc0Var.d.animate().alpha(1.0f);
                pr prVar = pr.h;
                org.telegram.ui.b.p(alpha, prVar, 320L);
                cc0Var.h.animate().alpha(0.0f).setInterpolator(prVar).setDuration(320L).start();
                if (cc0Var.B) {
                    cc0Var.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var), 6, 0));
                    cc0Var.setOnClickListener(new b80(cc0Var, i15));
                    return;
                } else {
                    cc0Var.setBackground(null);
                    cc0Var.setOnClickListener(null);
                    return;
                }
            case 11:
                fe0.o((fe0) obj3, (TLRPC.TL_error) obj, (TLObject) obj2);
                return;
            case 12:
                String str5 = (String) obj2;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                org.telegram.ui.ut0 ut0Var = (org.telegram.ui.ut0) ((tf0) obj3).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str5).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + ut0Var.w).put("platform", "DESKTOP"))).put("videoId", ut0Var.w).toString().getBytes("UTF-8"));
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
                            if (ut0Var.E == 0) {
                                ut0Var.s = optString;
                                return;
                            } else {
                                xf0.a(ut0Var, optString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
                break;
            case 13:
                xg0.n((xg0) obj3, (wg0) obj, (TLObject) obj2);
                return;
            case 14:
                dn0 dn0Var = (dn0) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList<MessageObject> arrayList6 = (ArrayList) obj;
                int i23 = dn0Var.d;
                for (int i24 = 0; i24 < arrayList5.size(); i24++) {
                    DownloadController.getInstance(i23).onDownloadComplete((MessageObject) arrayList5.get(i24));
                }
                if (!arrayList6.isEmpty()) {
                    DownloadController.getInstance(i23).deleteRecentFiles(arrayList6);
                }
                dn0Var.L = false;
                dn0Var.d(true);
                return;
            case 15:
                wn0 wn0Var = (wn0) obj3;
                org.telegram.ui.py pyVar = (org.telegram.ui.py) obj2;
                q70 q70Var = (q70) obj;
                if (UserConfig.getInstance(wn0Var.H0.E0).isPremium()) {
                    pyVar.getMessagesController().disableAds(true);
                    wn0Var.T();
                    qc.a0(pyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new fg.n1((org.telegram.ui.ActionBar.p2) pyVar, 3, true).show();
                }
                q70Var.u();
                return;
            case 16:
                yu0 yu0Var = (yu0) obj3;
                z4.S(yu0Var.getContext(), null, yu0Var.C1, new cr0(yu0Var, (TL_stories.StoryItem) obj2));
                ((q70) obj).u();
                return;
            case 17:
                yu0 yu0Var2 = (yu0) obj3;
                String str6 = (String) obj2;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                at0 at0Var = new at0(yu0Var2.getContext(), str6, str6, yu0Var2.C1, p2Var2);
                if (p2Var2 != null) {
                    p2Var2.showDialog(at0Var);
                    return;
                } else {
                    at0Var.show();
                    return;
                }
            case 18:
                bt0 bt0Var = (bt0) obj3;
                yu0 yu0Var3 = bt0Var.d;
                z4.S(yu0Var3.getContext(), yu0Var3.s1, (org.telegram.ui.ActionBar.g6) obj2, new hv(bt0Var, i16));
                ((q70) obj).u();
                return;
            case 19:
                it0 it0Var = (it0) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                TLObject tLObject4 = (TLObject) obj2;
                yu0 yu0Var4 = it0Var.n;
                int h = it0Var.h();
                if (tL_error3 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject4;
                    yu0Var4.s1.getMessagesController().putChats(messages_chats.chats, false);
                    it0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    it0Var.d.addAll(messages_chats.chats);
                } else {
                    it0Var.h = true;
                }
                int i25 = 0;
                while (true) {
                    qt0[] qt0VarArr = yu0Var4.h0;
                    if (i25 >= qt0VarArr.length) {
                        it0Var.e = false;
                        it0Var.f = true;
                        it0Var.l();
                        return;
                    } else {
                        qt0 qt0Var = qt0VarArr[i25];
                        if (qt0Var.C == 6 && (wr0Var = qt0Var.h) != null && (it0Var.f || h == 0)) {
                            yu0Var4.z(wr0Var, 0, null);
                        }
                        i25++;
                    }
                }
                break;
            case 20:
                ot0 ot0Var = (ot0) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.ActionBar.p2 p2Var3 = ot0Var.s.s1;
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int i26 = 21;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new jp(ot0Var, new ArrayList(), new ArrayList(), i26));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i27 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i27];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                int size5 = arrayList7.size();
                int i28 = 0;
                while (i28 < size5) {
                    TLObject tLObject5 = (TLObject) arrayList7.get(i28);
                    if (tLObject5 instanceof TLRPC.ChatParticipant) {
                        peerId = ((TLRPC.ChatParticipant) tLObject5).user_id;
                    } else {
                        if (tLObject5 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject5).peer);
                        }
                        p2Var = p2Var3;
                        i28++;
                        p2Var3 = p2Var;
                    }
                    TLRPC.User user4 = p2Var3.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user4.id != p2Var3.getUserConfig().getClientUserId()) {
                        String lowerCase2 = UserObject.getUserName(user4).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i29 = 0;
                        boolean z10 = false;
                        while (i29 < i27) {
                            String str7 = strArr[i29];
                            if (lowerCase2.startsWith(str7)) {
                                p2Var = p2Var3;
                            } else {
                                p2Var = p2Var3;
                                if (!org.telegram.messenger.y3.w(" ", str7, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str7) && !org.telegram.messenger.y3.w(" ", str7, translitString2)))) {
                                    String publicUsername = UserObject.getPublicUsername(user4);
                                    r02 = (publicUsername == null || !publicUsername.startsWith(str7)) ? z10 : 2;
                                    if (r02 == 0) {
                                        if (r02 == 1) {
                                            arrayList8.add(AndroidUtilities.generateSearchName(user4.first_name, user4.last_name, str7));
                                        } else {
                                            arrayList8.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user4), null, "@" + str7));
                                        }
                                        arrayList9.add(tLObject5);
                                        i28++;
                                        p2Var3 = p2Var;
                                    } else {
                                        i29++;
                                        z10 = r02;
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
                    i28++;
                    p2Var3 = p2Var;
                }
                AndroidUtilities.runOnUIThread(new jp(ot0Var, arrayList8, arrayList9, 21));
                return;
            case 21:
                ot0 ot0Var2 = (ot0) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                yu0 yu0Var5 = ot0Var2.s;
                if (yu0Var5.S0) {
                    ot0Var2.d = arrayList10;
                    ot0Var2.r--;
                    if (!ChatObject.isChannel(ot0Var2.n)) {
                        ArrayList arrayList12 = ot0Var2.e.g;
                        arrayList12.clear();
                        arrayList12.addAll(arrayList11);
                    }
                    if (ot0Var2.r == 0) {
                        int i30 = 0;
                        while (true) {
                            qt0[] qt0VarArr2 = yu0Var5.h0;
                            if (i30 < qt0VarArr2.length) {
                                qt0 qt0Var2 = qt0VarArr2[i30];
                                if (qt0Var2.C == 7) {
                                    if (ot0Var2.h == 0) {
                                        qt0Var2.w.e(false, true);
                                    } else {
                                        yu0Var5.z(qt0Var2.h, 0, null);
                                    }
                                }
                                i30++;
                            }
                        }
                    }
                    ot0Var2.l();
                    return;
                }
                return;
            case 22:
                tt0 tt0Var = (tt0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                tt0Var.getClass();
                String lowerCase3 = ((String) obj2).trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new b90(i16, tt0Var, new ArrayList()));
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
                ArrayList arrayList14 = new ArrayList();
                int i32 = 0;
                while (i32 < arrayList13.size()) {
                    MessageObject messageObject = (MessageObject) arrayList13.get(i32);
                    int i33 = 0;
                    while (true) {
                        if (i33 < i31) {
                            String str8 = strArr2[i33];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str8)) {
                                    arrayList14.add(messageObject);
                                } else if (tt0Var.r == i17) {
                                    TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i34);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str9 = documentAttribute.performer;
                                                z4 = str9 != null ? str9.toLowerCase().contains(str8) : false;
                                                if (!z4 && (str2 = documentAttribute.title) != null) {
                                                    z4 = str2.toLowerCase().contains(str8);
                                                }
                                            } else {
                                                i34++;
                                            }
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    if (z4) {
                                        arrayList14.add(messageObject);
                                    } else {
                                        i33++;
                                        i17 = 4;
                                    }
                                }
                            }
                            i33++;
                            i17 = 4;
                        }
                    }
                    i32++;
                    i17 = 4;
                }
                AndroidUtilities.runOnUIThread(new b90(i16, tt0Var, arrayList14));
                return;
            case 23:
                xx0 xx0Var = (xx0) obj3;
                String str10 = (String) obj2;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj;
                if (xx0Var.isDismissed()) {
                    return;
                }
                xx0Var.W.remove(str10);
                if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                    importingSticker.validated = true;
                    int indexOf = xx0Var.V.indexOf(importingSticker);
                    if (indexOf >= 0) {
                        f2.m1 K = xx0Var.c.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.d8) K.a).setSticker(importingSticker);
                        }
                    } else {
                        xx0Var.d.l();
                    }
                } else {
                    xx0Var.u0(importingSticker);
                }
                if (xx0Var.W.isEmpty()) {
                    xx0Var.B0();
                    return;
                }
                return;
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                e();
                return;
            case 28:
                f();
                return;
            default:
                q71 q71Var = (q71) obj3;
                Uri uri = (Uri) obj2;
                MessageObject messageObject2 = (MessageObject) obj;
                q71Var.getClass();
                if ("tg".equals(uri.getScheme())) {
                    int intValue = Utilities.parseInt((CharSequence) uri.getQueryParameter("account")).intValue();
                    Object parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) uri.getQueryParameter("rid")).intValue());
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.parseLong(uri.getQueryParameter("hash")).longValue();
                    tL_document.id = Utilities.parseLong(uri.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.parseLong(uri.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.parseInt((CharSequence) uri.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.hexToBytes(uri.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (FileLoader.getInstance(intValue).isLoadingFile(FileLoader.getAttachFileName(tL_document))) {
                        File directory = FileLoader.getDirectory(4);
                        StringBuilder sb = new StringBuilder();
                        sb.append(tL_document.dc_id);
                        sb.append("_");
                        absolutePath = new File(directory, android.support.v4.media.a.q(sb, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    q71Var.b = new y5(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    q71Var.b = new y5(new File(uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                q71Var.c = q71Var.b.d[4];
                float f10 = q71Var.h;
                if (f10 != 0.0f) {
                    q71Var.e(messageObject2, f10, q71Var.r);
                    q71Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new m71(q71Var, i18));
                return;
        }
    }

    public /* synthetic */ jp(Object obj, Object obj2, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = tLObject;
    }

    public /* synthetic */ jp(fe0 fe0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4) {
        this.a = 11;
        this.b = fe0Var;
        this.d = tL_error;
        this.c = tLObject;
    }
}
