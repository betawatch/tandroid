package org.telegram.ui;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ai1(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:131|(2:132|133)|(3:180|181|(10:183|184|(2:175|176)|137|(1:139)|140|141|142|(1:(1:145))(7:147|148|149|150|151|152|153)|146))|135|(0)|137|(0)|140|141|142|(0)(0)|146) */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0301, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        int i10;
        org.telegram.ui.web.y0 y0Var;
        org.telegram.ui.web.e0 e0Var;
        mh.m2 m2Var;
        TLRPC.Message message;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        int i11 = this.a;
        View z12 = null;
        r6 = null;
        r6 = null;
        String str3 = null;
        ArrayList arrayList = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                bi1 bi1Var = (bi1) obj2;
                String str4 = (String) obj;
                bi1Var.d.clear();
                bi1Var.e.clear();
                bi1Var.f = true;
                bi1Var.F(str4, "", true);
                bi1Var.h = str4;
                bi1Var.l();
                bi1Var.y = null;
                return;
            case 1:
                bi1 bi1Var2 = (bi1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = bi1Var2.A;
                i9 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                MessagesController.getInstance(i9).putUsers(tL_contacts_resolvedPeer.users, false);
                i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                MessagesController.getInstance(i10).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = bi1Var2.x;
                bi1Var2.x = null;
                bi1Var2.F(str5, "", false);
                return;
            case 2:
                String str6 = (String) obj;
                ii1 ii1Var = ((hi1) obj2).a;
                Activity parentActivity = ii1Var.getParentActivity();
                MessageObject messageObject = ii1Var.n;
                if (parentActivity == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d(str6);
                }
                str6.getClass();
                if (str6.equals("share_game")) {
                    messageObject.messageOwner.with_my_score = false;
                } else if (str6.equals("share_score")) {
                    messageObject.messageOwner.with_my_score = true;
                }
                ii1Var.showDialog(org.telegram.ui.Components.rp0.N0(ii1Var.getParentActivity(), messageObject, null, false, ii1Var.h));
                return;
            case 3:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy == null || (y0Var = botWebViewContainer$BotWebViewProxy.a) == null || (e0Var = y0Var.c) == null) {
                    return;
                }
                e0Var.f(arrayList2);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.a1.c.addAll(0, arrayList3);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    org.telegram.ui.web.a1.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.z0) longSparseArray.valueAt(i13));
                }
                org.telegram.ui.web.a1.b = true;
                org.telegram.ui.web.a1.a = false;
                ArrayList arrayList4 = org.telegram.ui.web.a1.e;
                if (arrayList4 != null) {
                    int size = arrayList4.size();
                    while (i12 < size) {
                        Object obj3 = arrayList4.get(i12);
                        i12++;
                        ((Utilities.Callback) obj3).run(arrayList3);
                    }
                    org.telegram.ui.web.a1.e = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.web.c1 c1Var = ((org.telegram.ui.web.b1) obj2).h;
                ArrayList arrayList5 = c1Var.f;
                arrayList5.clear();
                arrayList5.addAll((ArrayList) obj);
                c1Var.h = false;
                org.telegram.ui.Components.c51 c51Var = c1Var.a;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                g1Var.setEnabled(((org.telegram.ui.web.b2) obj).b() != null);
                g1Var.animate().alpha(g1Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 7:
                ((n0) obj2).b0.run((Integer) obj);
                return;
            case 8:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj2;
                u1Var.getMessagesController().removeWebBrowserException((String) obj);
                u1Var.a.U2.N(true);
                return;
            case 9:
                org.telegram.ui.web.b2 b2Var = (org.telegram.ui.web.b2) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = b2Var.a;
                b2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i14).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i14).putChats(tL_messages_webPage.chats, false);
                    b2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            b2Var.h = tL_webPage;
                        }
                    }
                    b2Var.h = null;
                }
                TLRPC.WebPage webPage = b2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    b2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && b2Var.h != null && (m2Var = b2Var.l) != null) {
                    m2Var.run();
                }
                b2Var.c();
                return;
            case 10:
                ((org.telegram.ui.web.b2) obj2).m.remove((ai1) obj);
                return;
            case 11:
                p4.b bVar = (p4.b) obj2;
                bVar.r = false;
                bVar.b((Uri) obj);
                return;
            case 12:
                pf.g gVar = (pf.g) obj2;
                TLObject tLObject2 = (TLObject) obj;
                gVar.e = false;
                TL_account.connectedBots connectedbots = tLObject2 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject2 : null;
                gVar.c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(gVar.a).putUsers(gVar.c.users, false);
                }
                gVar.b = System.currentTimeMillis();
                gVar.f = true;
                gVar.d();
                return;
            case 13:
                pf.g0.Q((pf.g0) obj2, (org.telegram.ui.Components.qd) obj);
                return;
            case 14:
                MessagesController.getInstance(((pf.m0) obj2).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 15:
                pf.y0 y0Var2 = (pf.y0) obj2;
                y0Var2.getClass();
                y0Var2.W(((org.telegram.ui.Components.l41) obj).d);
                return;
            case 16:
                pf.q1 q1Var = (pf.q1) obj;
                try {
                    try {
                        sQLitePreparedStatement2 = ((MessagesStorage) obj2).getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, q1Var.a);
                        sQLitePreparedStatement2.bindString(2, q1Var.b);
                        sQLitePreparedStatement2.bindInteger(3, q1Var.c);
                        sQLitePreparedStatement2.bindInteger(4, q1Var.f);
                        sQLitePreparedStatement2.step();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th;
                }
            case 17:
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                ArrayList arrayList6 = ((pf.r1) obj2).b;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        while (i12 < arrayList6.size()) {
                            pf.q1 q1Var2 = (pf.q1) arrayList6.get(i12);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, q1Var2.a);
                            sQLitePreparedStatement.bindString(2, q1Var2.b);
                            sQLitePreparedStatement.bindInteger(3, q1Var2.c);
                            sQLitePreparedStatement.bindInteger(4, q1Var2.f);
                            sQLitePreparedStatement.step();
                            i12++;
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            case 18:
                pf.r1 r1Var = (pf.r1) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList7 = r1Var.b;
                int i15 = r1Var.a;
                if (tLObject3 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject3;
                    MessagesController.getInstance(i15).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i15).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i15).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList8 = new ArrayList();
                    for (int i16 = 0; i16 < tL_messages_quickReplies.quick_replies.size(); i16++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i16);
                        pf.q1 q1Var3 = new pf.q1();
                        q1Var3.a = tL_quickReply.shortcut_id;
                        q1Var3.b = tL_quickReply.shortcut;
                        q1Var3.f = tL_quickReply.count;
                        q1Var3.d = tL_quickReply.top_message;
                        q1Var3.c = i16;
                        int i17 = 0;
                        while (true) {
                            if (i17 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i17);
                                if (message.id != tL_quickReply.top_message) {
                                    i17++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject2 = new MessageObject(i15, message, false, true);
                            q1Var3.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            q1Var3.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList8.add(q1Var3);
                    }
                    arrayList = arrayList8;
                }
                r1Var.e = false;
                if (arrayList != null) {
                    arrayList7.clear();
                    arrayList7.addAll(arrayList);
                }
                r1Var.f = true;
                r1Var.l();
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 19:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                qh.q a2 = qh.q.a(((String[]) obj2)[0], AndroidUtilities.dp(26.0f), false);
                if (a2 == null) {
                    a2 = qh.q.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                } else {
                    r7 = false;
                }
                AndroidUtilities.runOnUIThread(new np0(callback2, a2 != null ? a2.a : null, r7, 12));
                return;
            case 20:
                qh.v vVar = (qh.v) obj2;
                TLObject tLObject4 = (TLObject) obj;
                vVar.c0 = false;
                vVar.d0 = 0;
                kh.d dVar = vVar.b0;
                dVar.setLoading(false);
                if (!(tLObject4 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject4).result;
                if (richMessage == null) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                vVar.e0 = richMessage;
                vVar.Y.set(richMessage);
                dVar.g(LocaleController.getString(R.string.ArticleAIAddToPage), true, true);
                vVar.O();
                org.telegram.ui.Components.z41 z41Var = vVar.V;
                if (z41Var != null) {
                    z41Var.N(true);
                    return;
                }
                return;
            case 21:
                qh.o3 o3Var = (qh.o3) obj2;
                Uri uri = (Uri) obj;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e12) {
                    FileLog.e(e12);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !e2.c.w(str)) {
                    try {
                        query = o3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e13) {
                        e = e13;
                        str2 = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = o3Var.getContext().getContentResolver().openInputStream(uri);
                        if (openInputStream == null) {
                        }
                        str = str3;
                        if (TextUtils.isEmpty(str)) {
                        }
                    }
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str2 = query.getString(0);
                                if (query != null) {
                                    try {
                                        query.close();
                                    } catch (Exception e14) {
                                        e = e14;
                                        FileLog.e(e);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = o3Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream == null) {
                                        }
                                        str = str3;
                                        if (TextUtils.isEmpty(str)) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = "document_" + SharedConfig.getLastLocalId();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = o3Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            AndroidUtilities.copyFile(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            String absolutePath = file.getAbsolutePath();
                                            openInputStream.close();
                                            str3 = absolutePath;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else if (openInputStream != null) {
                                    openInputStream.close();
                                }
                                str = str3;
                            }
                        } finally {
                        }
                    }
                    str2 = null;
                    if (query != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace222 = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = o3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !e2.c.w(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new ai1(22, o3Var, str));
                return;
            case 22:
                ((qh.o3) obj2).c2((String) obj);
                return;
            case 23:
                qh.o3 o3Var2 = (qh.o3) obj2;
                qh.y1 y1Var = (qh.y1) obj;
                o3Var2.getClass();
                long j10 = y1Var.a;
                int i18 = y1Var.d;
                int i19 = y1Var.c;
                ArrayList arrayList9 = o3Var2.h3;
                int i20 = 0;
                while (true) {
                    if (i20 >= arrayList9.size()) {
                        i20 = -1;
                    } else if (((qh.a) arrayList9.get(i20)).a != j10) {
                        i20++;
                    }
                }
                if (i20 < 0) {
                    return;
                }
                View m10 = o3Var2.T2.m(i20);
                if (m10 instanceof qh.s5) {
                    qh.s5 s5Var = (qh.s5) m10;
                    s5Var.B();
                    qh.d1 editText = s5Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i19, length)), Math.max(0, Math.min(i18, length)));
                    return;
                }
                if (!(m10 instanceof qh.f5)) {
                    if (m10 instanceof qh.i0) {
                        qh.d1 captionEditText = ((qh.i0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i19, length2)), Math.max(0, Math.min(i18, length2)));
                        return;
                    }
                    return;
                }
                qh.f5 f5Var = (qh.f5) m10;
                qh.d1 l10 = f5Var.l(y1Var.b);
                if (l10 == null) {
                    l10 = f5Var.l(0);
                }
                if (l10 == null) {
                    return;
                }
                l10.r();
                int length3 = l10.length();
                l10.setSelection(Math.max(0, Math.min(i19, length3)), Math.max(0, Math.min(i18, length3)));
                return;
            case 24:
                qh.f3 f3Var = (qh.f3) obj2;
                qh.a aVar = (qh.a) obj;
                if (aVar == null) {
                    f3Var.getClass();
                } else {
                    z12 = f3Var.e.z1(aVar);
                }
                if (z12 instanceof qh.s5) {
                    qh.s5 s5Var2 = (qh.s5) z12;
                    s5Var2.B();
                    s5Var2.getEditText().setSelection(s5Var2.getEditText().length());
                    return;
                }
                return;
            case 25:
                qh.r4 r4Var = (qh.r4) obj2;
                TLObject tLObject5 = (TLObject) obj;
                boolean z10 = r4Var.e;
                boolean z11 = r4Var.d;
                qh.q4 q4Var = r4Var.s;
                if (r4Var.w) {
                    return;
                }
                r4Var.y = 0;
                if (r4Var.c || z11 || z10) {
                    if ((tLObject5 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject5).document) != null) {
                        if (!z10) {
                            if (z11) {
                                r4Var.x = true;
                                r4Var.e();
                                q4Var.e(document);
                                return;
                            } else {
                                r4Var.x = true;
                                r4Var.e();
                                q4Var.c(document);
                                return;
                            }
                        }
                        int i21 = r4Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            r4Var.x = true;
                            r4Var.e();
                            q4Var.onError();
                            return;
                        }
                        r4Var.x = true;
                        r4Var.e();
                        if (!TextUtils.isEmpty(r4Var.B) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i21).setLocalPathTo(closestPhotoSizeWithSize, r4Var.B);
                            AndroidUtilities.copyFileSafe(new File(r4Var.B), FileLoader.getInstance(i21).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        q4Var.d(document);
                        return;
                    }
                } else if ((tLObject5 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject5).photo) != null) {
                    r4Var.x = true;
                    r4Var.e();
                    q4Var.b(photo);
                    return;
                }
                r4Var.x = true;
                r4Var.e();
                q4Var.onError();
                return;
            case 26:
                qh.r4 r4Var2 = (qh.r4) obj2;
                String str7 = (String) obj;
                if (r4Var2.w || r4Var2.x) {
                    return;
                }
                r4Var2.a(str7);
                return;
            case 27:
                qh.i5 m11 = ((qh.f5) obj2).v.m((TL_iv.pageTableCell) obj);
                if (m11 == null) {
                    return;
                }
                qh.d1 d1Var = m11.a;
                d1Var.r();
                d1Var.setSelection(d1Var.length());
                return;
            case 28:
                CarResultStub.lambda$notifyResults$1((Map.Entry) obj2, obj);
                return;
            default:
                ud.b bVar2 = (ud.b) obj2;
                View view = (View) obj;
                ud.a aVar2 = bVar2.a;
                if ((bVar2.c & 2) != 0) {
                    if (!aVar2.onLongPressRequestedAt(view, bVar2.d, bVar2.e)) {
                        bVar2.c |= 8;
                        return;
                    }
                    bVar2.c &= -3;
                    bVar2.b = null;
                    float f10 = bVar2.d;
                    float f11 = bVar2.e;
                    bVar2.f = f10;
                    bVar2.g = f11;
                    if (aVar2.ignoreHapticFeedbackSettings(f10, f11)) {
                        boolean forceEnableVibration = aVar2.forceEnableVibration();
                        if (view != null) {
                            view.performHapticFeedback(0, forceEnableVibration ? 2 : 0);
                        }
                    } else {
                        view.performHapticFeedback(0);
                    }
                    bVar2.c = (bVar2.c | 4) & (-11);
                    bVar2.b = null;
                    return;
                }
                return;
        }
    }
}
