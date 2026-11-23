package org.telegram.ui.Components;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        jt0 jt0Var = (jt0) this.b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
        a70 a70Var = (a70) this.d;
        c5.P(jt0Var.getContext(), null, jt0Var.I1, new vp0(jt0Var, storyItem));
        a70Var.v();
    }

    private final void b() {
        jt0 jt0Var = (jt0) this.b;
        String str = (String) this.c;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
        or0 or0Var = new or0(jt0Var.getContext(), str, str, jt0Var.I1, g2Var);
        if (g2Var != null) {
            g2Var.showDialog(or0Var);
        } else {
            or0Var.show();
        }
    }

    private final void c() {
        nq0 nq0Var;
        wr0 wr0Var = (wr0) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        jt0 jt0Var = wr0Var.r;
        wr0Var.n = 0;
        int b10 = wr0Var.b();
        if (tL_error == null) {
            TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
            jt0Var.y1.getMessagesController().Z3(messages_chats.chats, false);
            wr0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
            wr0Var.d.addAll(messages_chats.chats);
        } else {
            wr0Var.h = true;
        }
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = jt0Var.n0;
            if (i7 >= ds0VarArr.length) {
                wr0Var.e = false;
                wr0Var.f = true;
                wr0Var.f();
                return;
            } else {
                ds0 ds0Var = ds0VarArr[i7];
                if (ds0Var.F == 6 && (nq0Var = ds0Var.h) != null && (wr0Var.f || b10 == 0)) {
                    jt0Var.D(nq0Var, 0, null);
                }
                i7++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d() {
        long B1;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        bs0 bs0Var = (bs0) this.b;
        String str = (String) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.g2 g2Var = bs0Var.s.y1;
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.g3(new g(bs0Var, new ArrayList(), new ArrayList(), 29));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
        String T0 = org.telegram.messenger.hd.E0().T0(lowerCase, true, false);
        if (lowerCase.equals(T0) || T0.length() == 0) {
            T0 = null;
        }
        int i7 = (T0 != null ? 1 : 0) + 1;
        String[] strArr = new String[i7];
        strArr[0] = lowerCase;
        if (T0 != null) {
            strArr[1] = T0;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i10);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                B1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else {
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    B1 = org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z10 = z11;
                i10++;
                z11 = z10;
                arrayList2 = arrayList;
                z12 = 0;
            }
            TLRPC.User c22 = g2Var.getMessagesController().c2(Long.valueOf(B1));
            if (c22.id != g2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.p10.q(c22).toLowerCase();
                String T02 = org.telegram.messenger.hd.E0().T0(lowerCase2, z11, z12);
                if (lowerCase2.equals(T02)) {
                    T02 = null;
                }
                char c11 = z12;
                for (int i11 = z12; i11 < i7; i11++) {
                    String str2 = strArr[i11];
                    if (lowerCase2.startsWith(str2) || i5.c.B(" ", str2, lowerCase2) || (T02 != null && (T02.startsWith(str2) || i5.c.B(" ", str2, T02)))) {
                        c10 = 1;
                    } else {
                        String o4 = org.telegram.messenger.p10.o(c22);
                        if (o4 != null && o4.startsWith(str2)) {
                            c11 = 2;
                        }
                        c10 = c11;
                    }
                    if (c10 != 0) {
                        arrayList = arrayList2;
                        z10 = true;
                        if (c10 == 1) {
                            arrayList3.add(org.telegram.messenger.g0.r0(c22.first_name, c22.last_name, str2));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.p10.o(c22), null, "@" + str2));
                        }
                        arrayList4.add(tLObject);
                        i10++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        z12 = 0;
                    } else {
                        z11 = true;
                        arrayList2 = arrayList2;
                        c11 = c10;
                    }
                }
            }
            arrayList = arrayList2;
            z10 = z11;
            i10++;
            z11 = z10;
            arrayList2 = arrayList;
            z12 = 0;
        }
        org.telegram.messenger.g0.g3(new g(bs0Var, arrayList3, arrayList4, 29));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:236|237|238)|233|234) */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x072b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x072c, code lost:
    
        r8 = r3;
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x075e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        gf gfVar;
        Editable text;
        SQLiteCursor sQLiteCursor;
        boolean z10;
        String str;
        TLRPC.User user;
        int i7;
        int i10;
        int i11;
        String str2;
        Calendar calendar;
        JSONObject optJSONObject;
        String optString;
        int i12 = 2;
        Bitmap bitmap = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.b;
                c5.J((Context) this.c, n0Var.h2, new org.telegram.ui.Cells.c5(n0Var), (org.telegram.ui.ActionBar.h6) this.d);
                return;
            case 1:
                f8 f8Var = (f8) this.b;
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
                    org.telegram.messenger.hp hpVar = f8Var.q2;
                    if (hpVar != null) {
                        hpVar.c.add(0, hpVar.d(document));
                        hpVar.e();
                    }
                    f8Var.r2.clear();
                    f8Var.r2.addAll(f8Var.q2.c);
                    f8Var.u1.f();
                    ConnectionsManager.getInstance(f8Var.a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                String str3 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                if (chatActivityEnterView.O2 || (gfVar = chatActivityEnterView.F0) == null || (text = gfVar.getText()) == null) {
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
                    chatActivityEnterView.i1();
                    org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 0), 420L);
                    return;
                }
            case 3:
                ye yeVar = (ye) this.b;
                ut0 ut0Var = (ut0) this.c;
                pn0 pn0Var = (pn0) this.d;
                yeVar.getClass();
                ut0Var.getViewTreeObserver().removeOnDrawListener(yeVar);
                pn0Var.a.setHideAvatar(true);
                return;
            case 4:
                mg mgVar = (mg) this.b;
                Uri uri = (Uri) this.c;
                File file = (File) this.d;
                try {
                    InputStream openInputStream = mgVar.getContext().getContentResolver().openInputStream(uri);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            openInputStream.close();
                            fileOutputStream.close();
                            org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(-1, file.getAbsolutePath(), 0, false, 0, 0);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(ffVar);
                            org.telegram.messenger.g0.g3(new g(mgVar, arrayList, file, 5));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            case 5:
                ((mg) this.b).K((File) this.d, (ArrayList) this.c);
                return;
            case 6:
                final ui uiVar = (ui) this.b;
                mi miVar = (mi) this.c;
                final gh ghVar = (gh) this.d;
                final boolean z11 = uiVar.x2.getCurrentItemTop() <= miVar.getButtonsHideOffset();
                float alpha = uiVar.V2.getAlpha();
                float f10 = z11 ? 1.0f : 0.0f;
                r1.g gVar = new r1.g(new r1.f(0.0f));
                gVar.b(new nh(uiVar, alpha, f10, z11));
                gVar.a(new r1.c() { // from class: org.telegram.ui.Components.oh
                    @Override // r1.c
                    public final void a(r1.g gVar2, boolean z12, float f11, float f12) {
                        ui uiVar2 = ui.this;
                        uiVar2.w2.v(1.0f);
                        uiVar2.x2.v(1.0f);
                        uiVar2.w2.m(uiVar2.j4);
                        uiVar2.x2.m(uiVar2.j4);
                        uiVar2.Y0.g();
                        uiVar2.b.invalidate();
                        uiVar2.V2.setTag(z11 ? 1 : null);
                        ghVar.run();
                    }
                });
                r1.h hVar = new r1.h(500.0f);
                gVar.m = hVar;
                hVar.a(1.0f);
                gVar.m.b(1000.0f);
                gVar.h();
                uiVar.r3 = gVar;
                return;
            case 7:
                ui uiVar2 = (ui) this.b;
                h2.f fVar = (h2.f) this.c;
                org.telegram.ui.ActionBar.q2 q2Var = (org.telegram.ui.ActionBar.q2) this.d;
                uiVar2.A0 = null;
                uiVar2.n4 = null;
                fVar.e();
                uiVar2.B0 = 0;
                if (q2Var != null) {
                    q2Var.v();
                }
                if (uiVar2.K) {
                    uiVar2.c.setLayerType(0, null);
                }
                if (uiVar2.W) {
                    WindowManager.LayoutParams attributes = uiVar2.getWindow().getAttributes();
                    attributes.flags &= -1025;
                    uiVar2.getWindow().setAttributes(attributes);
                }
                org.telegram.messenger.ls.e().k(99, 512);
                return;
            case 8:
                lp lpVar = (lp) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) this.d;
                HashMap hashMap = lpVar.s;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    l6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, l6Var);
                org.telegram.messenger.w7.G(l6Var.F).W(wallPaper.document, wallPaper, 1, 1);
                return;
            case 9:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                a9Var.setText(charSequence);
                org.telegram.ui.ActionBar.t6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.m6.B6, h6Var);
                return;
            case 10:
                js jsVar = (js) this.b;
                org.telegram.messenger.ur urVar = (org.telegram.messenger.ur) this.c;
                is isVar = (is) this.d;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long j3 = 0;
                try {
                    int i14 = 0;
                    SQLiteCursor queryFinalized = urVar.b.queryFinalized("SELECT uid, time, offset FROM popular_bots ORDER BY pos", new Object[0]);
                    str = null;
                    while (queryFinalized.next()) {
                        try {
                            try {
                                arrayList3.add(Long.valueOf(queryFinalized.longValue(i14)));
                                j3 = Math.max(j3, queryFinalized.longValue(1));
                                str = queryFinalized.stringValue(2);
                                i14 = 0;
                            } catch (Exception e10) {
                                e = e10;
                                sQLiteCursor = queryFinalized;
                                z10 = true;
                                try {
                                    org.telegram.messenger.a8.g(e, z10);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    org.telegram.messenger.g0.g3(new bi.o2(jsVar, arrayList2, j3, str, isVar, 12));
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (sQLiteCursor != null) {
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList l02 = urVar.l0(arrayList3);
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayList3.get(i15);
                        i15++;
                        long longValue = ((Long) obj).longValue();
                        int size2 = l02.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                Object obj2 = l02.get(i16);
                                i16++;
                                user = (TLRPC.User) obj2;
                                if (user == null || user.id != longValue) {
                                }
                            } else {
                                user = null;
                            }
                        }
                        if (user != null) {
                            arrayList2.add(user);
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                    str = null;
                    sQLiteCursor = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                org.telegram.messenger.g0.g3(new bi.o2(jsVar, arrayList2, j3, str, isVar, 12));
                return;
            case 11:
                ez ezVar = (ez) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                hz hzVar = ezVar.K;
                int[] iArr = hzVar.U0;
                GLES20.glBindFramebuffer(36160, iArr != null ? iArr[!hzVar.g1 ? 1 : 0] : 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, hzVar.g(!ezVar.U ? 1 : 0), 0);
                GLES20.glClear(0);
                int i17 = ezVar.V;
                if (i17 != 0 && (i7 = ezVar.W) != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i17 * i7 * 4);
                    GLES20.glReadPixels(0, 0, ezVar.V, ezVar.W, 6408, 5121, allocateDirect);
                    bitmap = Bitmap.createBitmap(ezVar.V, ezVar.W, Bitmap.Config.ARGB_8888);
                    bitmap.copyPixelsFromBuffer(allocateDirect);
                }
                bitmapArr[0] = bitmap;
                countDownLatch.countDown();
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glClear(0);
                return;
            case 12:
                i00 i00Var = (i00) this.b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                i00Var.v2 = -1;
                gc I = lc.b0(g2Var).I(R.raw.ic_delete, org.telegram.messenger.hd.a0(null, null, 2131750646, i00Var.Y1), org.telegram.messenger.hd.G(arrayList4.size(), "FolderLinkDeletedSubtitle", new Object[0]));
                I.j = 5000;
                I.j();
                i00Var.w2 = true;
                i00Var.dismiss();
                i00Var.s1.getMessagesController().n2(i00Var.U1);
                return;
            case 13:
                i00 i00Var2 = (i00) this.b;
                i00Var2.v2 = i00Var2.s1.getConnectionsManager().sendRequest((TLObject) this.c, new org.telegram.ui.u7(16, i00Var2, (Pair) this.d));
                return;
            case 14:
                a60 a60Var = (a60) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.d;
                a60Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                g2Var2.presentFragment(new ProfileActivity(bundle, null));
                a60Var.g2 = true;
                return;
            case 15:
                u50 u50Var = (u50) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                a60 a60Var2 = u50Var.a.c;
                if (tL_error == null) {
                    if (tLObject3 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject3;
                        TLRPC.ChatFull chatFull = a60Var2.o1;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        if (a60Var2.e2 != null) {
                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = a60Var2.o1;
                    if (chatFull2 != null) {
                        int i18 = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i18;
                        if (i18 < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        org.telegram.messenger.ur.a0(a60Var2.a).w1(chatFull2.invitesCount, a60Var2.b2);
                    }
                    org.telegram.ui.ab abVar = a60Var2.e2;
                    if (abVar != null) {
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = a60Var2.m1;
                        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                        org.telegram.ui.lb lbVar = abVar.a;
                        ArrayList arrayList5 = lbVar.p0;
                        int size3 = arrayList5.size();
                        tL_chatInviteExported2.revoked = true;
                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                        tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported2;
                        tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                        tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                        tL_channelAdminLogEvent.user_id = org.telegram.messenger.k10.i(lbVar.getAccountInstance().a).n;
                        i10 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
                        if (new org.telegram.messenger.gj(i10, tL_channelAdminLogEvent, lbVar.o0, lbVar.n0, lbVar.f, lbVar.U, true).U < 0) {
                            return;
                        }
                        lbVar.W0();
                        int size4 = arrayList5.size() - size3;
                        if (size4 > 0) {
                            lbVar.D0.N = true;
                            org.telegram.ui.ib ibVar = lbVar.F;
                            ibVar.o(ibVar.h, size4);
                            org.telegram.ui.lb.P0(lbVar);
                        }
                        lbVar.z0.remove(tL_chatInviteExported2.link);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                l60 l60Var = (l60) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                if (tL_error2 == null) {
                    l60Var.u2 = (TLRPC.TL_chatInviteExported) tLObject4;
                    TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(l60Var.a).P0(l60Var.q2);
                    if (P0 != null) {
                        P0.exported_invite = l60Var.u2;
                    }
                    if (l60Var.u2.link == null) {
                        return;
                    }
                    ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", l60Var.u2.link));
                    lc.j(l60Var.l2).j();
                    l60Var.dismiss();
                }
                l60Var.t2 = false;
                return;
            case 17:
                g60 g60Var = (g60) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                g60Var.h = null;
                g60Var.c = arrayList6;
                g60Var.d = arrayList7;
                jg.z1 z1Var = g60Var.e;
                z1Var.f(arrayList6, null);
                l60 l60Var2 = g60Var.n;
                l60Var2.P0(g60Var.f - 1);
                g60Var.f();
                if (z1Var.e() || g60Var.b() > 2) {
                    return;
                }
                l60Var2.u1.e(false, true);
                return;
            case 18:
                m80 m80Var = (m80) this.b;
                n80 n80Var = (n80) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                l80 l80Var = m80Var.h;
                if (l80Var == null || m80Var.e != n80Var) {
                    return;
                }
                l80Var.a(clickableSpan);
                m80Var.e = null;
                m80Var.b.f(true);
                return;
            case 19:
                za0 za0Var = (za0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                org.telegram.ui.ActionBar.h6 h6Var2 = za0Var.c;
                TextView textView = za0Var.f;
                TextView textView2 = za0Var.e;
                if (tL_error3 != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        textView2.setText(org.telegram.messenger.hd.N0(2131746999, null));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error3.text)) {
                        za0Var.F = true;
                        textView2.setText(org.telegram.messenger.hd.N0(2131747003, null));
                        textView.setText(org.telegram.messenger.hd.N0(2131747001, null));
                    } else {
                        textView2.setText(org.telegram.messenger.hd.O0("UnknownError"));
                        textView.setVisibility(8);
                        new lc(cb.a(za0Var.getContext()), h6Var2).g0(tL_error3, false);
                    }
                } else if (tLObject5 instanceof TLRPC.TL_outboxReadDate) {
                    long j10 = ((TLRPC.TL_outboxReadDate) tLObject5).date * 1000;
                    try {
                        calendar = Calendar.getInstance();
                        i11 = 0;
                    } catch (Exception e12) {
                        e = e12;
                        i11 = 0;
                    }
                    try {
                        int i19 = calendar.get(6);
                        int i20 = calendar.get(1);
                        calendar.setTimeInMillis(j10);
                        int i21 = calendar.get(6);
                        int i22 = calendar.get(1);
                        str2 = (i21 == i19 && i20 == i22) ? org.telegram.messenger.hd.a0(null, null, 2131747000, org.telegram.messenger.hd.E0().p0().format(new Date(j10))) : (i21 + 1 == i19 && i20 == i22) ? org.telegram.messenger.hd.a0(null, null, 2131746998, org.telegram.messenger.hd.E0().p0().format(new Date(j10))) : Math.abs(System.currentTimeMillis() - j10) < 31536000000L ? org.telegram.messenger.hd.a0(null, null, 2131747002, org.telegram.messenger.hd.E0().q0().format(new Date(j10)), org.telegram.messenger.hd.E0().p0().format(new Date(j10))) : org.telegram.messenger.hd.a0(null, null, 2131747002, org.telegram.messenger.hd.E0().C0().format(new Date(j10)), org.telegram.messenger.hd.E0().p0().format(new Date(j10)));
                    } catch (Exception e13) {
                        e = e13;
                        org.telegram.messenger.a8.g(e, true);
                        str2 = "LOC_ERR";
                        textView2.setText(str2);
                        textView.setVisibility(8);
                        ViewPropertyAnimator alpha2 = za0Var.d.animate().alpha(1.0f);
                        nr nrVar = nr.h;
                        org.telegram.messenger.o10.o(alpha2, nrVar, 320L);
                        za0Var.h.animate().alpha(0.0f).setInterpolator(nrVar).setDuration(320L).start();
                        if (!za0Var.F) {
                        }
                    }
                    textView2.setText(str2);
                    textView.setVisibility(8);
                    ViewPropertyAnimator alpha22 = za0Var.d.animate().alpha(1.0f);
                    nr nrVar2 = nr.h;
                    org.telegram.messenger.o10.o(alpha22, nrVar2, 320L);
                    za0Var.h.animate().alpha(0.0f).setInterpolator(nrVar2).setDuration(320L).start();
                    if (!za0Var.F) {
                        za0Var.setBackground(null);
                        za0Var.setOnClickListener(null);
                        return;
                    }
                    int i23 = org.telegram.ui.ActionBar.m6.i6;
                    org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i23, h6Var2), 6, i11);
                    org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i23);
                    za0Var.setBackground(a02);
                    org.telegram.ui.ActionBar.t6.j(za0Var, a02, null, M, h6Var2);
                    za0Var.setOnClickListener(new j70(za0Var, i12));
                    return;
                }
                i11 = 0;
                ViewPropertyAnimator alpha222 = za0Var.d.animate().alpha(1.0f);
                nr nrVar22 = nr.h;
                org.telegram.messenger.o10.o(alpha222, nrVar22, 320L);
                za0Var.h.animate().alpha(0.0f).setInterpolator(nrVar22).setDuration(320L).start();
                if (!za0Var.F) {
                }
            case 20:
                yc0 yc0Var = (yc0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                if (tL_error4 == null) {
                    yc0Var.getClass();
                    yc0Var.s1 = (TLRPC.TL_chatInviteExported) tLObject6;
                    TLRPC.ChatFull P02 = org.telegram.messenger.np.u1(yc0Var.a).P0(yc0Var.q1);
                    if (P02 != null) {
                        P02.exported_invite = yc0Var.s1;
                    }
                    yc0Var.p1.setLink(yc0Var.s1.link);
                }
                yc0Var.r1 = false;
                return;
            case 21:
                org.telegram.ui.n1 n1Var = (org.telegram.ui.n1) this.b;
                String str4 = (String) this.c;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
                org.telegram.ui.dq0 dq0Var = (org.telegram.ui.dq0) n1Var.b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + dq0Var.x).put("platform", "DESKTOP"))).put("videoId", dq0Var.x).toString().getBytes("UTF-8"));
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
                            if (dq0Var.I == 0) {
                                dq0Var.s = optString;
                                return;
                            } else {
                                le0.a(dq0Var, optString);
                                return;
                            }
                        }
                        byteArrayOutputStream.write(bArr2, 0, read2);
                    }
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                    return;
                }
                break;
            case 22:
                ff0 ff0Var = (ff0) this.b;
                ef0 ef0Var = (ef0) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (ff0Var.isShowing()) {
                    ff0Var.v1.remove(ef0Var);
                    if (tLObject7 != null) {
                        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject7;
                        org.telegram.messenger.np.u1(ff0Var.a).f4(tL_messages_votesList.users, false);
                        ef0Var.b.addAll(tL_messages_votesList.votes);
                        ef0Var.c = tL_messages_votesList.next_offset;
                        ff0Var.K0(null);
                        ff0Var.n1.X(true);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                sl0 sl0Var = (sl0) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                int i24 = sl0Var.d;
                for (int i25 = 0; i25 < arrayList8.size(); i25++) {
                    org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(i24);
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList8.get(i25);
                    if (gjVar != null && gjVar.F0() != null) {
                        org.telegram.messenger.g0.g3(new org.telegram.messenger.v5(q10, gjVar.F0(), gjVar, i13));
                    }
                }
                if (!arrayList9.isEmpty()) {
                    org.telegram.messenger.a6.q(i24).j(arrayList9);
                }
                sl0Var.P = false;
                sl0Var.d(true);
                return;
            case 24:
                nm0 nm0Var = (nm0) this.b;
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.c;
                a70 a70Var = (a70) this.d;
                if (org.telegram.messenger.k10.i(nm0Var.L0.K0).q()) {
                    cxVar.getMessagesController().p0(true);
                    nm0Var.S();
                    lc.b0(cxVar).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                } else {
                    new ug.y0((org.telegram.ui.ActionBar.g2) cxVar, 3, true).show();
                }
                a70Var.v();
                return;
            case 25:
                a();
                return;
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            case 28:
                d();
                return;
            default:
                bs0 bs0Var = (bs0) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                jt0 jt0Var = bs0Var.s;
                if (jt0Var.Y0) {
                    bs0Var.d = arrayList10;
                    bs0Var.r--;
                    if (!org.telegram.messenger.v3.T(bs0Var.n)) {
                        ArrayList arrayList12 = bs0Var.e.g;
                        arrayList12.clear();
                        arrayList12.addAll(arrayList11);
                    }
                    if (bs0Var.r == 0) {
                        int i26 = 0;
                        while (true) {
                            ds0[] ds0VarArr = jt0Var.n0;
                            if (i26 < ds0VarArr.length) {
                                ds0 ds0Var = ds0VarArr[i26];
                                if (ds0Var.F == 7) {
                                    if (bs0Var.h == 0) {
                                        ds0Var.w.e(false, true);
                                    } else {
                                        jt0Var.D(ds0Var.h, 0, null);
                                    }
                                }
                                i26++;
                            }
                        }
                    }
                    bs0Var.f();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(yc0 yc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 20;
        this.b = yc0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
