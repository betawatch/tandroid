// default package

import android.text.style.ClickableSpan;
import android.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jr9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jr9(wua wuaVar, Runnable runnable, l01 l01Var, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.a = (byte) 24;
        this.d = runnable;
        this.b = l01Var;
        this.c = twoStepVerificationActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0984  */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r13v9, types: [ob6] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        SQLitePreparedStatement sQLitePreparedStatement;
        byte b;
        char c;
        jga jgaVar;
        long B1;
        ArrayList arrayList;
        e eVar;
        boolean z;
        String str;
        TLRPC.Message message;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        int i2 = 8;
        byte b2 = 17;
        byte b3 = 7;
        byte b4 = 6;
        ?? r14 = 0;
        boolean z5 = true;
        switch (this.a) {
            case 0:
                rr9 rr9Var = (rr9) this.b;
                qr9 qr9Var = (qr9) this.c;
                Runnable runnable = (Runnable) this.d;
                if (rr9Var.g != qr9Var) {
                    rr9Var.g = qr9Var;
                    s64 s64Var = rr9Var.f;
                    if (s64Var != null) {
                        s64Var.r1((!rr9Var.o || qr9Var == null) ? null : qr9Var.getSurface());
                        if (qr9Var != null) {
                            s64 s64Var2 = rr9Var.f;
                            s64Var2.y1();
                            ggc ggcVar = s64Var2.k0;
                            int i3 = ggcVar.a;
                            if (i3 > 0 && (i = ggcVar.b) > 0) {
                                qr9Var.a(i3, i);
                            }
                        }
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                int i4 = 2;
                nt9 nt9Var = (nt9) this.b;
                jf7 jf7Var = (jf7) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                try {
                    try {
                        SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                        executeFast.requery();
                        executeFast.bindLong(1, 0L);
                        executeFast.step();
                        executeFast.dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO saved_dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        int i5 = 0;
                        while (i5 < arrayList2.size()) {
                            try {
                                mt9 mt9Var = (mt9) arrayList2.get(i5);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindLong(1, mt9Var.a);
                                int i6 = i4;
                                sQLitePreparedStatement.bindInteger(i6, mt9Var.c());
                                sQLitePreparedStatement.bindInteger(3, mt9Var.c);
                                sQLitePreparedStatement.bindInteger(4, mt9Var.b ? i5 : 999);
                                sQLitePreparedStatement.bindInteger(5, mt9Var.i ? 1 : 0);
                                sQLitePreparedStatement.bindInteger(6, 0);
                                sQLitePreparedStatement.bindInteger(7, 0);
                                sQLitePreparedStatement.bindInteger(i2, mt9Var.e);
                                sQLitePreparedStatement.bindLong(9, 0L);
                                sQLitePreparedStatement.bindLong(10, mt9Var.f);
                                sQLitePreparedStatement.bindLong(11, mt9Var.g);
                                sQLitePreparedStatement.bindLong(12, mt9Var.h);
                                sQLitePreparedStatement.step();
                                i5++;
                                i4 = i6;
                                i2 = 8;
                            } catch (Exception e) {
                                e = e;
                                b = 1;
                                cc4.g(e, true);
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                hl.c3(new lt9(nt9Var, b));
                                return;
                            }
                        }
                        sQLitePreparedStatement.dispose();
                        sQLitePreparedStatement.dispose();
                        b = 1;
                    } catch (Throwable th) {
                        th = th;
                        if (0 != 0) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLitePreparedStatement = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                    }
                    throw th;
                }
                hl.c3(new lt9(nt9Var, b));
                return;
            case 2:
                sv9 sv9Var = (sv9) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                HashMap hashMap = (HashMap) this.d;
                sv9Var.q = arrayList3;
                sv9Var.r = hashMap;
                sv9Var.s = true;
                sv9Var.a.X1(arrayList3);
                return;
            case 3:
                aw9 aw9Var = (aw9) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                int i7 = aw9Var.d;
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    lq3 q = lq3.q(i7);
                    r47 r47Var = (r47) arrayList4.get(i8);
                    if (r47Var != null && r47Var.F0() != null) {
                        hl.c3(new iq3(q, r47Var.F0(), r47Var, (byte) 1));
                    }
                }
                if (!arrayList5.isEmpty()) {
                    lq3.q(i7).j(arrayList5);
                }
                aw9Var.P = false;
                aw9Var.d(true);
                return;
            case 4:
                gx9 gx9Var = (gx9) this.b;
                uj3 uj3Var = (uj3) this.c;
                fu5 fu5Var = (fu5) this.d;
                if (yac.h(gx9Var.L0.K0).p()) {
                    uj3Var.getMessagesController().n0(true);
                    gx9Var.S();
                    d31.b0(uj3Var).c(ob6.M0(2131754481, null)).j();
                } else {
                    new xk8((e) uj3Var, 3, true).show();
                }
                fu5Var.u();
                return;
            case 5:
                wx9 wx9Var = (wx9) this.b;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) this.d;
                if (encryptedChat != null) {
                    c = 0;
                    wx9Var.getMessagesController().f4(encryptedChat2, false);
                } else {
                    c = 0;
                }
                wx9Var.getMessagesStorage().S1(encryptedChat2);
                jn7 notificationCenter = wx9Var.getNotificationCenter();
                Object[] objArr = new Object[1];
                objArr[c] = encryptedChat2;
                notificationCenter.k(36, objArr);
                return;
            case 6:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                fm1 fm1Var = (fm1) this.c;
                r47 r47Var2 = (r47) this.d;
                secretMediaViewer.l0 = (byte) 0;
                secretMediaViewer.J0 = null;
                if (fm1Var != null) {
                    fm1Var.run();
                }
                tt ttVar = secretMediaViewer.e;
                if (ttVar != null) {
                    ttVar.setLayerType(0, null);
                    secretMediaViewer.e.invalidate();
                    dy9 dy9Var = secretMediaViewer.n;
                    TLRPC.Message message2 = r47Var2.k;
                    long j2 = message2.destroyTimeMillis;
                    long j3 = message2.ttl;
                    int i9 = dy9.E;
                    dy9Var.e = false;
                    dy9Var.f = j2;
                    dy9Var.h = j3;
                    dy9Var.n.start();
                    dy9Var.invalidate();
                    if (secretMediaViewer.g1) {
                        secretMediaViewer.c(true, true);
                        return;
                    } else {
                        if (!secretMediaViewer.p1 || uc7.e1().getInt("viewoncehint", 0) >= 3) {
                            return;
                        }
                        secretMediaViewer.m();
                        return;
                    }
                }
                return;
            case 7:
                r7a r7aVar = (r7a) this.b;
                String str2 = (String) this.c;
                Runnable runnable2 = (Runnable) this.d;
                r7aVar.w.remove(str2);
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 8:
                h7a h7aVar = (h7a) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
                i7a i7aVar = h7aVar.b;
                r7a r7aVar2 = i7aVar.q;
                r7aVar2.E.l(i7aVar.j);
                if (tL_error == null) {
                    r7aVar2.getNotificationCenter().k(jn7.v1, Long.valueOf(i7aVar.j));
                    return;
                } else {
                    r7aVar2.getNotificationCenter().k(jn7.v1, Long.valueOf(i7aVar.j), tL_messages_startHistoryImport, tL_error);
                    return;
                }
            case 9:
                j7a j7aVar = (j7a) this.b;
                TLObject tLObject = (TLObject) this.c;
                Runnable runnable3 = (Runnable) this.d;
                boolean z6 = tLObject instanceof TLRPC.TL_messageMediaDocument;
                k7a k7aVar = j7aVar.b;
                if (z6) {
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
                    k7aVar.f = tL_inputStickerSetItem;
                    tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = k7aVar.f;
                    TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
                    inputDocument.id = document.id;
                    inputDocument.access_hash = document.access_hash;
                    inputDocument.file_reference = document.file_reference;
                    String str3 = k7aVar.b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    tL_inputStickerSetItem2.emoji = str3;
                    k7aVar.d = document.mime_type;
                } else if (k7aVar.e) {
                    k7aVar.d = "application/x-bad-tgsticker";
                }
                runnable3.run();
                return;
            case 10:
                taa taaVar = (taa) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity = taaVar.k0;
                if (tL_error2 == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.q0();
                    xaa xaaVar = sessionsActivity.a;
                    if (xaaVar != null) {
                        xaaVar.f();
                    }
                    sessionsActivity.o0(true);
                    return;
                }
                return;
            case 11:
                uaa uaaVar = (uaa) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) this.d;
                SessionsActivity sessionsActivity2 = uaaVar.a;
                if (tL_error3 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.q0();
                    xaa xaaVar2 = sessionsActivity2.a;
                    if (xaaVar2 != null) {
                        xaaVar2.f();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                waa waaVar = (waa) this.b;
                String str4 = (String) this.c;
                da1 da1Var = (da1) this.d;
                try {
                    byte[] decode = Base64.decode(str4.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    waaVar.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new ol7(waaVar, da1Var, (byte) 24));
                    return;
                } catch (Exception e3) {
                    cc4.e("Failed to pass qr code auth", e3);
                    hl.c3(new vaa(waaVar, (byte) 1));
                    da1Var.run();
                    return;
                }
            case 13:
                eja ejaVar = (eja) this.b;
                String str5 = (String) this.c;
                e eVar2 = (e) this.d;
                eVar2.showDialog(new kha(ejaVar.getContext(), str5, str5, ejaVar.I1, eVar2));
                return;
            case 14:
                eja ejaVar2 = (eja) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                fu5 fu5Var2 = (fu5) this.d;
                jj.P(ejaVar2.getContext(), null, ejaVar2.I1, new vfa(ejaVar2, storyItem));
                fu5Var2.u();
                return;
            case 15:
                sha shaVar = (sha) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                eja ejaVar3 = shaVar.r;
                shaVar.n = 0;
                int b5 = shaVar.b();
                if (tL_error4 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    ejaVar3.y1.getMessagesController().c4(messages_chats.chats, false);
                    shaVar.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    shaVar.d.addAll(messages_chats.chats);
                } else {
                    shaVar.h = true;
                }
                int i10 = 0;
                while (true) {
                    zha[] zhaVarArr = ejaVar3.n0;
                    if (i10 >= zhaVarArr.length) {
                        shaVar.e = false;
                        shaVar.f = true;
                        shaVar.f();
                        return;
                    } else {
                        zha zhaVar = zhaVarArr[i10];
                        if (zhaVar.F == 6 && (jgaVar = zhaVar.h) != null && (shaVar.f || b5 == 0)) {
                            ejaVar3.i(jgaVar, 0, null);
                        }
                        i10++;
                    }
                }
                break;
            case 16:
                xha xhaVar = (xha) this.b;
                String str6 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                e eVar3 = xhaVar.s.y1;
                String lowerCase = str6.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    hl.c3(new jr9(xhaVar, new ArrayList(), new ArrayList(), b2));
                    return;
                }
                String S0 = ob6.D0().S0(lowerCase, true, false);
                if (lowerCase.equals(S0) || S0.length() == 0) {
                    S0 = null;
                }
                int i11 = (S0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                int size = arrayList6.size();
                int i12 = 0;
                while (i12 < size) {
                    TLObject tLObject3 = (TLObject) arrayList6.get(i12);
                    if (tLObject3 instanceof TLRPC.ChatParticipant) {
                        B1 = ((TLRPC.ChatParticipant) tLObject3).user_id;
                    } else {
                        if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                            B1 = r47.B1(((TLRPC.ChannelParticipant) tLObject3).peer);
                        }
                        arrayList = arrayList6;
                        eVar = eVar3;
                        i12++;
                        eVar3 = eVar;
                        r14 = 0;
                        arrayList6 = arrayList;
                    }
                    TLRPC.User X1 = eVar3.getMessagesController().X1(Long.valueOf(B1));
                    if (X1.id != eVar3.getUserConfig().e()) {
                        String lowerCase2 = lbc.r(X1).toLowerCase();
                        String S02 = ob6.D0().S0(lowerCase2, true, r14);
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        boolean z7 = r14;
                        for (int i13 = r14; i13 < i11; i13++) {
                            String str7 = strArr[i13];
                            arrayList = arrayList6;
                            if (lowerCase2.startsWith(str7) || uh9.t(" ", str7, lowerCase2) || (S02 != null && (S02.startsWith(str7) || uh9.t(" ", str7, S02)))) {
                                z7 = true;
                            } else {
                                String p = lbc.p(X1);
                                if (p != null && p.startsWith(str7)) {
                                    z7 = 2;
                                }
                            }
                            if (z7) {
                                eVar = eVar3;
                                if (z7) {
                                    arrayList7.add(hl.r0(X1.first_name, X1.last_name, str7));
                                } else {
                                    arrayList7.add(hl.r0("@" + lbc.p(X1), null, "@" + str7));
                                }
                                arrayList8.add(tLObject3);
                                i12++;
                                eVar3 = eVar;
                                r14 = 0;
                                arrayList6 = arrayList;
                            } else {
                                arrayList6 = arrayList;
                            }
                        }
                    }
                    arrayList = arrayList6;
                    eVar = eVar3;
                    i12++;
                    eVar3 = eVar;
                    r14 = 0;
                    arrayList6 = arrayList;
                }
                hl.c3(new jr9((Object) xhaVar, (Object) arrayList7, (Object) arrayList8, (byte) 17));
                return;
            case 17:
                xha xhaVar2 = (xha) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                eja ejaVar4 = xhaVar2.s;
                if (ejaVar4.Y0) {
                    xhaVar2.d = arrayList9;
                    xhaVar2.r--;
                    if (!xc2.T(xhaVar2.n)) {
                        ArrayList arrayList11 = xhaVar2.e.g;
                        arrayList11.clear();
                        arrayList11.addAll(arrayList10);
                    }
                    if (xhaVar2.r == 0) {
                        int i14 = 0;
                        while (true) {
                            zha[] zhaVarArr2 = ejaVar4.n0;
                            if (i14 < zhaVarArr2.length) {
                                zha zhaVar2 = zhaVarArr2[i14];
                                if (zhaVar2.F == 7) {
                                    if (xhaVar2.h == 0) {
                                        zhaVar2.w.e(false, true);
                                    } else {
                                        ejaVar4.i(zhaVar2.h, 0, null);
                                    }
                                }
                                i14++;
                            }
                        }
                    }
                    xhaVar2.f();
                    return;
                }
                return;
            case 18:
                byte b6 = 4;
                bia biaVar = (bia) this.b;
                String str8 = (String) this.c;
                ArrayList arrayList12 = (ArrayList) this.d;
                biaVar.getClass();
                String lowerCase3 = str8.trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    hl.c3(new ida(biaVar, new ArrayList(), b4));
                    return;
                }
                String S03 = ob6.D0().S0(lowerCase3, true, false);
                String str9 = (lowerCase3.equals(S03) || S03.length() == 0) ? null : S03;
                int i15 = (str9 != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i15];
                strArr2[0] = lowerCase3;
                if (str9 != null) {
                    strArr2[1] = str9;
                }
                ArrayList arrayList13 = new ArrayList();
                int i16 = 0;
                while (i16 < arrayList12.size()) {
                    r47 r47Var3 = (r47) arrayList12.get(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 < i15) {
                            String str10 = strArr2[i17];
                            String I0 = r47Var3.I0();
                            if (I0 != null && I0.length() != 0) {
                                if (I0.toLowerCase().contains(str10)) {
                                    arrayList13.add(r47Var3);
                                } else if (biaVar.r == b6) {
                                    int i18 = r47Var3.D;
                                    TLRPC.Message message3 = r47Var3.k;
                                    TLRPC.Document document2 = i18 == 0 ? r47.n1(message3).webpage.document : r47.n1(message3).document;
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < document2.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document2.attributes.get(i19);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str11 = documentAttribute.performer;
                                                z = str11 != null ? str11.toLowerCase().contains(str10) : false;
                                                if (!z && (str = documentAttribute.title) != null) {
                                                    z = str.toLowerCase().contains(str10);
                                                }
                                            } else {
                                                i19++;
                                            }
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        arrayList13.add(r47Var3);
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i17++;
                            b6 = 4;
                        }
                    }
                    i16++;
                    b6 = 4;
                }
                hl.c3(new ida(biaVar, arrayList13, b4));
                return;
            case 19:
                tpa tpaVar = (tpa) this.b;
                q66 q66Var = (q66) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                o66 o66Var = tpaVar.H;
                if (o66Var == null || tpaVar.I != q66Var) {
                    return;
                }
                o66Var.a(clickableSpan);
                tpaVar.I = null;
                tpaVar.y.e(true);
                return;
            case 20:
                wua wuaVar = (wua) this.b;
                Long l = (Long) this.c;
                wuaVar.d2(l.longValue(), new v58(wuaVar, l, (bx4[]) this.d, b3));
                return;
            case 21:
                wua wuaVar2 = (wua) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                r47 r47Var4 = (r47) this.d;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                uc7.s1(wuaVar2.a).j4(messages_messages.users, false);
                uc7.s1(wuaVar2.a).c4(messages_messages.chats, false);
                wuaVar2.H2 = true;
                wuaVar2.G2 = false;
                if (wuaVar2.k3 != null && (message = r47Var4.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction).saved = !r3.booleanValue();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = !r3.booleanValue();
                    }
                }
                wuaVar2.m2(r47Var4, null);
                return;
            case 22:
                wua wuaVar3 = (wua) this.b;
                l01 l01Var = (l01) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                l01Var.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                wuaVar3.a2.setResellPrice(oj.j(0L, pj.a));
                qt8 qt8Var = wuaVar3.i3;
                if (qt8Var != null) {
                    qt8Var.run();
                }
                wuaVar3.j().Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131749981, wuaVar3.t1())).j();
                return;
            case 23:
                wua wuaVar4 = (wua) this.b;
                l01 l01Var2 = (l01) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                l01Var2.c(false);
                wuaVar4.j().g0(tL_error5, false);
                return;
            case 24:
                Runnable runnable4 = (Runnable) this.d;
                l01 l01Var3 = (l01) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.c;
                runnable4.run();
                l01Var3.c(false);
                wua.h2(twoStepVerificationActivity);
                return;
            case 25:
                Runnable runnable5 = (Runnable) this.d;
                TLRPC.Document document3 = (TLRPC.Document) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                e S = LaunchActivity.S();
                d31 b0 = S != null ? d31.b0(S) : d31.Y();
                v21 q2 = runnable5 == null ? document3 != null ? b0.q(document3, charSequence) : b0.Q(R.raw.contact_check, 36, charSequence) : document3 != null ? b0.r(document3, charSequence, ob6.M0(2131749834, null), runnable5) : b0.K(R.raw.contact_check, charSequence, ob6.M0(2131749834, null), runnable5);
                q2.u = true;
                q2.j();
                return;
            case 26:
                ((wua) this.b).L1((id) this.c, (r47) this.d);
                return;
            case 27:
                wua wuaVar5 = (wua) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                String str12 = (String) this.d;
                long j4 = tL_starGiftUnique2.gift_id;
                String str13 = tL_starGiftUnique2.title;
                String t1 = wuaVar5.t1();
                TLRPC.Document document4 = tL_starGiftUnique2.getDocument();
                String str14 = tL_starGiftUnique2.slug;
                id idVar = new id(3, null, a.b);
                idVar.q(500L);
                TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
                getuniquestargiftvalueinfo.slug = str14;
                ConnectionsManager.getInstance(wuaVar5.a).sendRequest(getuniquestargiftvalueinfo, new v97(wuaVar5, idVar, document4, str12, str13, t1, j4));
                return;
            case 28:
                TLObject tLObject5 = (TLObject) this.b;
                f fVar = (f) this.c;
                String str15 = (String) this.d;
                if (tLObject5 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift = ((TL_stars.TL_payments_uniqueStarGift) tLObject5).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) starGift;
                        Long valueOf = Long.valueOf(tL_starGiftUnique3.gift_id);
                        String str16 = tL_starGiftUnique3.title;
                        if (str16 != null) {
                            str15 = str16;
                        }
                        fVar.a(valueOf, str15);
                        return;
                    }
                }
                fVar.a(0L, str15);
                return;
            default:
                jxa jxaVar = (jxa) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                Runnable runnable6 = (Runnable) this.d;
                ArrayList arrayList14 = jxaVar.v;
                boolean[] zArr = jxaVar.r;
                boolean[] zArr2 = jxaVar.t;
                ArrayList[] arrayListArr = jxaVar.q;
                int i20 = jxaVar.a;
                boolean z8 = !jxaVar.e;
                jxaVar.c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    uc7.s1(i20).j4(starsStatus.users, false);
                    uc7.s1(i20).c4(starsStatus.chats, false);
                    if (!arrayListArr[0].isEmpty() || zArr2[0]) {
                        z2 = true;
                        j = 0;
                        z4 = false;
                    } else {
                        ArrayList<TL_stars.StarsTransaction> arrayList15 = starsStatus.history;
                        int size2 = arrayList15.size();
                        int i21 = 0;
                        while (i21 < size2) {
                            TL_stars.StarsTransaction starsTransaction = arrayList15.get(i21);
                            i21++;
                            boolean z9 = z5;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            arrayListArr[starsTransaction2.amount.amount > 0 ? z9 : 2].add(starsTransaction2);
                            z5 = z9;
                        }
                        z2 = z5;
                        j = 0;
                        for (int i22 = 0; i22 < 3; i22++) {
                            zArr[i22] = (!arrayListArr[i22].isEmpty() || zArr[i22]) ? z2 : false;
                            boolean[] zArr3 = jxaVar.u;
                            boolean z10 = (starsStatus.flags & 1) == 0 ? z2 : false;
                            zArr3[i22] = z10;
                            if (z10) {
                                zArr2[i22] = false;
                            }
                            jxaVar.s[i22] = zArr3[i22] ? null : starsStatus.next_offset;
                        }
                        z4 = z2;
                    }
                    if (arrayList14.isEmpty()) {
                        arrayList14.addAll(starsStatus.subscriptions);
                        jxaVar.x = false;
                        jxaVar.w = starsStatus.subscriptions_next_offset;
                        jxaVar.y = (starsStatus.flags & 4) == 0 ? z2 : false;
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    long j5 = jxaVar.f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j5 != starsAmount.amount) {
                        z8 = z2;
                    }
                    jxaVar.f = starsAmount;
                    jxaVar.g = j;
                } else {
                    z2 = true;
                    z3 = false;
                    z4 = false;
                }
                jxaVar.d = false;
                jxaVar.e = z2;
                if (z8) {
                    jn7.f(i20).k(jn7.A3, new Object[0]);
                }
                if (z4) {
                    jn7.f(i20).k(jn7.B3, new Object[0]);
                }
                if (z3) {
                    jn7.f(i20).k(jn7.C3, new Object[0]);
                }
                if (runnable6 != null) {
                    runnable6.run();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jr9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ jr9(Runnable runnable, TLRPC.Document document, CharSequence charSequence) {
        this.a = (byte) 25;
        this.d = runnable;
        this.b = document;
        this.c = charSequence;
    }
}
