package org.telegram.ui.Cells;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
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
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.gp;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.mq0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.ze;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ab;
import org.telegram.ui.bx;
import org.telegram.ui.dq0;
import org.telegram.ui.ib;
import org.telegram.ui.lb;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fa(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        JSONObject optJSONObject;
        String optString;
        org.telegram.ui.n1 n1Var = (org.telegram.ui.n1) this.b;
        String str = (String) this.c;
        WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
        dq0 dq0Var = (dq0) n1Var.b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + dq0Var.x).put("platform", "DESKTOP"))).put("videoId", dq0Var.x).toString().getBytes("UTF-8"));
            outputStream.close();
            InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            byte[] bArr = new byte[10240];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            byteArrayOutputStream.close();
            inputStream.close();
            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) == null || (optString = optJSONObject.optString("spec")) == null) {
                return;
            }
            if (dq0Var.I == 0) {
                dq0Var.s = optString;
            } else {
                ke0.a(dq0Var, optString);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0823  */
    /* JADX WARN: Type inference failed for: r11v16, types: [org.telegram.messenger.gd] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r4v111 */
    /* JADX WARN: Type inference failed for: r4v112 */
    /* JADX WARN: Type inference failed for: r4v118 */
    /* JADX WARN: Type inference failed for: r4v120 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        hf hfVar;
        Editable text;
        SQLiteCursor sQLiteCursor;
        gs gsVar;
        boolean z10;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.User user;
        Bitmap bitmap;
        int i7;
        int i10;
        String str2;
        mq0 mq0Var;
        long B1;
        org.telegram.ui.ActionBar.g2 g2Var;
        int i11;
        ArrayList arrayList3;
        ?? r42;
        int i12 = 8;
        int i13 = 6;
        ?? r12 = 0;
        switch (this.a) {
            case 0:
                ja jaVar = (ja) this.b;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.c;
                m6Var.f = !m6Var.d((File) this.d, m6Var.c);
                org.telegram.messenger.g0.g3(new ha(i12, jaVar, m6Var));
                return;
            case 1:
                org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) this.b;
                org.telegram.ui.Components.b5.J((Context) this.c, m0Var.h2, new org.telegram.ui.ActionBar.i5(m0Var), (org.telegram.ui.ActionBar.i6) this.d);
                return;
            case 2:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                TLObject tLObject = (TLObject) this.d;
                t1Var.dismiss();
                if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    gp gpVar = e8Var.q2;
                    if (gpVar != null) {
                        gpVar.c.add(0, gpVar.d(document));
                        gpVar.e();
                    }
                    e8Var.r2.clear();
                    e8Var.r2.addAll(e8Var.q2.c);
                    e8Var.u1.f();
                    ConnectionsManager.getInstance(e8Var.a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                String str3 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                if (chatActivityEnterView.O2 || (hfVar = chatActivityEnterView.F0) == null || (text = hfVar.getText()) == null) {
                    return;
                }
                int length = text.length();
                String concat = ((length <= 0 || Character.isWhitespace(text.charAt(length + (-1)))) ? "" : " ").concat(str3);
                chatActivityEnterView.s1 = true;
                text.insert(length, concat);
                chatActivityEnterView.F0.setSelection(text.length());
                if (runnable != null) {
                    runnable.run();
                    return;
                } else {
                    chatActivityEnterView.j1();
                    org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 0), 420L);
                    return;
                }
            case 4:
                ze zeVar = (ze) this.b;
                tt0 tt0Var = (tt0) this.c;
                on0 on0Var = (on0) this.d;
                zeVar.getClass();
                tt0Var.getViewTreeObserver().removeOnDrawListener(zeVar);
                on0Var.a.setHideAvatar(true);
                return;
            case 5:
                lg lgVar = (lg) this.b;
                Uri uri = (Uri) this.c;
                File file = (File) this.d;
                try {
                    InputStream openInputStream = lgVar.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            ef efVar = new ef(-1, file.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(efVar);
                            org.telegram.messenger.g0.g3(new fa(lgVar, arrayList4, file, i13));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 6:
                ((lg) this.b).K((File) this.d, (ArrayList) this.c);
                return;
            case 7:
                final ti tiVar = (ti) this.b;
                li liVar = (li) this.c;
                final fh fhVar = (fh) this.d;
                final boolean z11 = tiVar.x2.getCurrentItemTop() <= liVar.getButtonsHideOffset();
                float alpha = tiVar.V2.getAlpha();
                float f10 = z11 ? 1.0f : 0.0f;
                r1.g gVar = new r1.g(new r1.f(0.0f));
                gVar.b(new mh(tiVar, alpha, f10, z11));
                gVar.a(new r1.c() { // from class: org.telegram.ui.Components.nh
                    @Override // r1.c
                    public final void a(r1.g gVar2, boolean z12, float f11, float f12) {
                        ti tiVar2 = ti.this;
                        tiVar2.w2.v(1.0f);
                        tiVar2.x2.v(1.0f);
                        tiVar2.w2.m(tiVar2.j4);
                        tiVar2.x2.m(tiVar2.j4);
                        tiVar2.Y0.g();
                        tiVar2.b.invalidate();
                        tiVar2.V2.setTag(z11 ? 1 : null);
                        fhVar.run();
                    }
                });
                r1.h hVar = new r1.h(500.0f);
                gVar.m = hVar;
                hVar.a(1.0f);
                gVar.m.b(1000.0f);
                gVar.h();
                tiVar.r3 = gVar;
                return;
            case 8:
                ti tiVar2 = (ti) this.b;
                h2.f fVar = (h2.f) this.c;
                org.telegram.ui.ActionBar.q2 q2Var = (org.telegram.ui.ActionBar.q2) this.d;
                tiVar2.A0 = null;
                tiVar2.n4 = null;
                fVar.e();
                tiVar2.B0 = 0;
                if (q2Var != null) {
                    q2Var.v();
                }
                if (tiVar2.K) {
                    tiVar2.c.setLayerType(0, null);
                }
                if (tiVar2.W) {
                    WindowManager.LayoutParams attributes = tiVar2.getWindow().getAttributes();
                    attributes.flags &= -1025;
                    tiVar2.getWindow().setAttributes(attributes);
                }
                ks.e().k(99, 512);
                return;
            case 9:
                ip ipVar = (ip) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                org.telegram.ui.ActionBar.m6 m6Var2 = (org.telegram.ui.ActionBar.m6) this.c;
                HashMap hashMap = ipVar.s;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    m6Var2.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, m6Var2);
                org.telegram.messenger.w7.G(m6Var2.F).W(wallPaper.document, wallPaper, 1, 1);
                return;
            case 10:
                z8 z8Var = (z8) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                z8Var.setText(charSequence);
                org.telegram.ui.ActionBar.u6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.n6.B6, i6Var);
                return;
            case 11:
                gs gsVar2 = (gs) this.b;
                tr trVar = (tr) this.c;
                fs fsVar = (fs) this.d;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                long j3 = 0;
                try {
                    int i14 = 0;
                    SQLiteCursor queryFinalized = trVar.b.queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            try {
                                arrayList6.add(Long.valueOf(queryFinalized.longValue(i14)));
                                j3 = Math.max(j3, queryFinalized.longValue(1));
                                str = queryFinalized.stringValue(2);
                                i14 = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            gsVar = gsVar2;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList l02 = trVar.l0(arrayList6);
                    int size = arrayList6.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList6.get(i15);
                        i15++;
                        long longValue = ((Long) obj).longValue();
                        int size2 = l02.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                Object obj2 = l02.get(i16);
                                i16++;
                                arrayList = l02;
                                user = (TLRPC.User) obj2;
                                if (user != null) {
                                    arrayList2 = arrayList6;
                                    gsVar = gsVar2;
                                    try {
                                        if (user.id == longValue) {
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        sQLiteCursor = queryFinalized;
                                        z10 = true;
                                        try {
                                            org.telegram.messenger.a8.g(e, z10);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            org.telegram.messenger.g0.g3(new bi.q2(gsVar, arrayList5, j3, str, fsVar, 12));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList6;
                                    gsVar = gsVar2;
                                }
                                gsVar2 = gsVar;
                                l02 = arrayList;
                                arrayList6 = arrayList2;
                            } else {
                                arrayList = l02;
                                arrayList2 = arrayList6;
                                gsVar = gsVar2;
                                user = null;
                            }
                        }
                        if (user != null) {
                            arrayList5.add(user);
                        }
                        gsVar2 = gsVar;
                        l02 = arrayList;
                        arrayList6 = arrayList2;
                    }
                    gsVar = gsVar2;
                    queryFinalized.dispose();
                } catch (Exception e12) {
                    e = e12;
                    gsVar = gsVar2;
                    z10 = true;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                org.telegram.messenger.g0.g3(new bi.q2(gsVar, arrayList5, j3, str, fsVar, 12));
                return;
            case 12:
                bz bzVar = (bz) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                ez ezVar = bzVar.K;
                int[] iArr = ezVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!ezVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, ezVar.g(!bzVar.U ? 1 : 0), 0);
                GLES20.glClear(0);
                int i17 = bzVar.V;
                if (i17 == 0 || (i7 = bzVar.W) == 0) {
                    bitmap = null;
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i17 * i7 * 4);
                    GLES20.glReadPixels(0, 0, bzVar.V, bzVar.W, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(bzVar.V, bzVar.W, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 13:
                g00 g00Var = (g00) this.b;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                g00Var.v2 = -1;
                fc I = kc.b0(g2Var2).I(R.raw.ic_delete, gd.a0(null, null, 2131750646, g00Var.Y1), gd.G(arrayList7.size(), "FolderLinkDeletedSubtitle", new Object[0]));
                I.j = 5000;
                I.j();
                g00Var.w2 = true;
                g00Var.dismiss();
                g00Var.s1.getMessagesController().n2(g00Var.U1);
                return;
            case 14:
                g00 g00Var2 = (g00) this.b;
                g00Var2.v2 = g00Var2.s1.getConnectionsManager().sendRequest((TLObject) this.c, new org.telegram.ui.v7(16, g00Var2, (Pair) this.d));
                return;
            case 15:
                x50 x50Var = (x50) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) this.d;
                x50Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                g2Var3.presentFragment(new ProfileActivity(bundle, null));
                x50Var.g2 = true;
                return;
            case 16:
                r50 r50Var = (r50) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                x50 x50Var2 = r50Var.a.c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
                        TLRPC.ChatFull chatFull = x50Var2.o1;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (x50Var2.e2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = x50Var2.o1;
                    if (chatFull2 != null) {
                        int i18 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i18;
                        if (i18 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        tr.a0(x50Var2.a).w1(chatFull2.invitesCount, x50Var2.b2);
                    }
                    ab abVar = x50Var2.e2;
                    if (abVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = x50Var2.m1;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        lb lbVar = abVar.a;
                        ArrayList arrayList8 = lbVar.p0;
                        int size3 = arrayList8.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = i10.i(lbVar.getAccountInstance().a).n;
                        i10 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
                        if (new fj(i10, tL_channelAdminLogEvent, lbVar.o0, lbVar.n0, lbVar.f, lbVar.U, true).U < 0) {
                            return;
                        }
                        lbVar.W0();
                        int size4 = arrayList8.size() - size3;
                        if (size4 > 0) {
                            lbVar.D0.N = true;
                            ib ibVar = lbVar.F;
                            ibVar.o(ibVar.h, size4);
                            lb.P0(lbVar);
                        }
                        lbVar.z0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                i60 i60Var = (i60) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error2 == null) {
                    i60Var.u2 = (TLRPC.TL_chatInviteExported) tLObject4;
                    TLRPC.ChatFull P0 = mp.u1(i60Var.a).P0(i60Var.q2);
                    if (P0 != null) {
                        P0.exported_invite = i60Var.u2;
                    }
                    if (i60Var.u2.link == null) {
                        return;
                    }
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i60Var.u2.link));
                    kc.j(i60Var.l2).j();
                    i60Var.dismiss();
                }
                i60Var.t2 = false;
                return;
            case 18:
                d60 d60Var = (d60) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                d60Var.h = null;
                d60Var.c = arrayList9;
                d60Var.d = arrayList10;
                jg.z1 z1Var = d60Var.e;
                z1Var.f(arrayList9, null);
                i60 i60Var2 = d60Var.n;
                i60Var2.P0(d60Var.f - 1);
                d60Var.f();
                if (z1Var.e() || d60Var.b() > 2) {
                    return;
                }
                i60Var2.u1.e(false, true);
                return;
            case 19:
                j80 j80Var = (j80) this.b;
                k80 k80Var = (k80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                i80 i80Var = j80Var.h;
                if (i80Var == null || j80Var.e != k80Var) {
                    return;
                }
                i80Var.a(clickableSpan);
                j80Var.e = null;
                j80Var.b.f(true);
                return;
            case 20:
                wa0 wa0Var = (wa0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                org.telegram.ui.ActionBar.i6 i6Var2 = wa0Var.c;
                TextView textView = wa0Var.f;
                TextView textView2 = wa0Var.e;
                if (tL_error3 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        textView2.setText(gd.N0(2131746999, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        wa0Var.F = true;
                        textView2.setText(gd.N0(2131747003, null));
                        textView.setText(gd.N0(2131747001, null));
                    } else {
                        textView2.setText(gd.O0("UnknownError"));
                        textView.setVisibility(8);
                        new kc(bb.a(wa0Var.getContext()), i6Var2).g0(tL_error3, false);
                    }
                } else if (tLObject5 instanceof TLRPC.TL_outboxReadDate) {
                    long j10 = ((TLRPC.TL_outboxReadDate) tLObject5).date * 1000;
                    try {
                        Calendar calendar = Calendar.getInstance();
                        int i19 = calendar.get(6);
                        int i20 = calendar.get(1);
                        calendar.setTimeInMillis(j10);
                        int i21 = calendar.get(6);
                        int i22 = calendar.get(1);
                        str2 = (i21 == i19 && i20 == i22) ? gd.a0(null, null, 2131747000, gd.E0().p0().format(new Date(j10))) : (i21 + 1 == i19 && i20 == i22) ? gd.a0(null, null, 2131746998, gd.E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? gd.a0(null, null, 2131747002, gd.E0().q0().format(new Date(j10)), gd.E0().p0().format(new Date(j10))) : gd.a0(null, null, 2131747002, gd.E0().C0().format(new Date(j10)), gd.E0().p0().format(new Date(j10)));
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, true);
                        str2 = "LOC_ERR";
                    }
                    textView2.setText(str2);
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha2 = wa0Var.d.animate().alpha(1.0f);
                kr krVar = kr.h;
                m10.o(alpha2, krVar, 320L);
                wa0Var.h.animate().alpha(0.0f).setInterpolator(krVar).setDuration(320L).start();
                if (!wa0Var.F) {
                    wa0Var.setBackground(null);
                    wa0Var.setOnClickListener(null);
                    return;
                }
                int i23 = org.telegram.ui.ActionBar.n6.i6;
                y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i23, i6Var2), 6, 0);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i23);
                wa0Var.setBackground(a02);
                org.telegram.ui.ActionBar.u6.j(wa0Var, a02, null, M, i6Var2);
                wa0Var.setOnClickListener(new g70(wa0Var, 2));
                return;
            case 21:
                wc0 wc0Var = (wc0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                if (tL_error4 == null) {
                    wc0Var.getClass();
                    wc0Var.s1 = (TLRPC.TL_chatInviteExported) tLObject6;
                    TLRPC.ChatFull P02 = mp.u1(wc0Var.a).P0(wc0Var.q1);
                    if (P02 != null) {
                        P02.exported_invite = wc0Var.s1;
                    }
                    wc0Var.p1.setLink(wc0Var.s1.link);
                }
                wc0Var.r1 = false;
                return;
            case 22:
                a();
                return;
            case 23:
                ef0 ef0Var = (ef0) this.b;
                df0 df0Var = (df0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (ef0Var.isShowing()) {
                    ef0Var.v1.remove(df0Var);
                    if (tLObject7 != null) {
                        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject7;
                        mp.u1(ef0Var.a).f4(tL_messages_votesList.users, false);
                        df0Var.b.addAll(tL_messages_votesList.votes);
                        df0Var.c = tL_messages_votesList.next_offset;
                        ef0Var.K0(null);
                        ef0Var.n1.X(true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                sl0 sl0Var = (sl0) this.b;
                ArrayList arrayList11 = (ArrayList) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                int i24 = sl0Var.d;
                for (int i25 = 0; i25 < arrayList11.size(); i25++) {
                    org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(i24);
                    fj fjVar = (fj) arrayList11.get(i25);
                    if (fjVar != null && fjVar.F0() != null) {
                        org.telegram.messenger.g0.g3(new org.telegram.messenger.v5(q10, fjVar.F0(), fjVar, 0));
                    }
                }
                if (!arrayList12.isEmpty()) {
                    org.telegram.messenger.a6.q(i24).j(arrayList12);
                }
                sl0Var.P = false;
                sl0Var.d(true);
                return;
            case 25:
                mm0 mm0Var = (mm0) this.b;
                bx bxVar = (bx) this.c;
                x60 x60Var = (x60) this.d;
                if (i10.i(mm0Var.L0.K0).q()) {
                    bxVar.getMessagesController().p0(true);
                    mm0Var.S();
                    kc.b0(bxVar).c(gd.N0(2131754485, null)).j();
                } else {
                    new ug.y0((org.telegram.ui.ActionBar.g2) bxVar, 3, true).show();
                }
                x60Var.v();
                return;
            case 26:
                it0 it0Var = (it0) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                x60 x60Var2 = (x60) this.d;
                org.telegram.ui.Components.b5.P(it0Var.getContext(), null, it0Var.I1, new up0(it0Var, storyItem));
                x60Var2.v();
                return;
            case 27:
                it0 it0Var2 = (it0) this.b;
                String str4 = (String) this.c;
                org.telegram.ui.ActionBar.g2 g2Var4 = (org.telegram.ui.ActionBar.g2) this.d;
                nr0 nr0Var = new nr0(it0Var2.getContext(), str4, str4, it0Var2.I1, g2Var4);
                if (g2Var4 != null) {
                    g2Var4.showDialog(nr0Var);
                    return;
                } else {
                    nr0Var.show();
                    return;
                }
            case 28:
                vr0 vr0Var = (vr0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                it0 it0Var3 = vr0Var.r;
                vr0Var.n = 0;
                int b10 = vr0Var.b();
                if (tL_error5 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject8;
                    it0Var3.y1.getMessagesController().Z3(messages_chats.chats, false);
                    vr0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    vr0Var.d.addAll(messages_chats.chats);
                } else {
                    vr0Var.h = true;
                }
                int i26 = 0;
                while (true) {
                    ds0[] ds0VarArr = it0Var3.n0;
                    if (i26 >= ds0VarArr.length) {
                        vr0Var.e = false;
                        vr0Var.f = true;
                        vr0Var.f();
                        return;
                    } else {
                        ds0 ds0Var = ds0VarArr[i26];
                        if (ds0Var.F == 6 && (mq0Var = ds0Var.h) != null && (vr0Var.f || b10 == 0)) {
                            it0Var3.D(mq0Var, 0, null);
                        }
                        i26++;
                    }
                }
                break;
            default:
                bs0 bs0Var = (bs0) this.b;
                String str5 = (String) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                org.telegram.ui.ActionBar.g2 g2Var5 = bs0Var.s.y1;
                String lowerCase = str5.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new as0((Object) bs0Var, (Object) new ArrayList(), (Object) new ArrayList(), (int) (false ? 1 : 0)));
                    return;
                }
                String T0 = gd.E0().T0(lowerCase, true, false);
                if (lowerCase.equals(T0) || T0.length() == 0) {
                    T0 = null;
                }
                int i27 = (T0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i27];
                strArr[0] = lowerCase;
                if (T0 != null) {
                    strArr[1] = T0;
                }
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                int size5 = arrayList13.size();
                int i28 = 0;
                while (i28 < size5) {
                    TLObject tLObject9 = (TLObject) arrayList13.get(i28);
                    if (tLObject9 instanceof TLRPC.ChatParticipant) {
                        B1 = ((TLRPC.ChatParticipant) tLObject9).user_id;
                    } else {
                        if (tLObject9 instanceof TLRPC.ChannelParticipant) {
                            B1 = fj.B1(((TLRPC.ChannelParticipant) tLObject9).peer);
                        }
                        arrayList3 = arrayList13;
                        g2Var = g2Var5;
                        i11 = i27;
                        i28++;
                        arrayList13 = arrayList3;
                        i27 = i11;
                        g2Var5 = g2Var;
                        r12 = 0;
                    }
                    TLRPC.User c22 = g2Var5.getMessagesController().c2(Long.valueOf(B1));
                    if (c22.id != g2Var5.getUserConfig().e()) {
                        String lowerCase2 = n10.q(c22).toLowerCase();
                        arrayList3 = arrayList13;
                        String T02 = gd.E0().T0(lowerCase2, true, r12);
                        if (lowerCase2.equals(T02)) {
                            T02 = null;
                        }
                        boolean z12 = r12;
                        for (int i29 = r12; i29 < i27; i29++) {
                            boolean z13 = z12;
                            String str6 = strArr[i29];
                            if (lowerCase2.startsWith(str6) || i5.c.B(" ", str6, lowerCase2) || (T02 != null && (T02.startsWith(str6) || i5.c.B(" ", str6, T02)))) {
                                g2Var = g2Var5;
                                r42 = 1;
                            } else {
                                g2Var = g2Var5;
                                String o4 = n10.o(c22);
                                r42 = (o4 == null || !o4.startsWith(str6)) ? z13 ? 1 : 0 : 2;
                            }
                            if (r42 != 0) {
                                i11 = i27;
                                if (r42 == 1) {
                                    arrayList14.add(org.telegram.messenger.g0.r0(c22.first_name, c22.last_name, str6));
                                } else {
                                    arrayList14.add(org.telegram.messenger.g0.r0("@" + n10.o(c22), null, "@" + str6));
                                }
                                arrayList15.add(tLObject9);
                                i28++;
                                arrayList13 = arrayList3;
                                i27 = i11;
                                g2Var5 = g2Var;
                                r12 = 0;
                            } else {
                                z12 = r42;
                                g2Var5 = g2Var;
                            }
                        }
                        g2Var = g2Var5;
                        i11 = i27;
                        i28++;
                        arrayList13 = arrayList3;
                        i27 = i11;
                        g2Var5 = g2Var;
                        r12 = 0;
                    }
                    arrayList3 = arrayList13;
                    g2Var = g2Var5;
                    i11 = i27;
                    i28++;
                    arrayList13 = arrayList3;
                    i27 = i11;
                    g2Var5 = g2Var;
                    r12 = 0;
                }
                org.telegram.messenger.g0.g3(new as0((Object) bs0Var, (Object) arrayList14, (Object) arrayList15, 0));
                return;
        }
    }

    public /* synthetic */ fa(ip ipVar, TLObject tLObject, org.telegram.ui.ActionBar.m6 m6Var) {
        this.a = 9;
        this.b = ipVar;
        this.d = tLObject;
        this.c = m6Var;
    }

    public /* synthetic */ fa(wc0 wc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 21;
        this.b = wc0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
