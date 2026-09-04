package fi;

import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.location.Location;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ji.g6;
import ji.s5;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:59|(2:60|61)|(3:108|109|(10:111|112|(2:103|104)|65|(1:67)|68|69|70|(1:(1:73))(7:75|76|77|78|79|80|81)|74))|63|(0)|65|(0)|68|69|70|(0)(0)|74) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0189, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01dc, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        TLRPC.Message message;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        View y12;
        switch (this.a) {
            case 0:
                r4 r4Var = (r4) this.b;
                qc Q = new yc(r4Var.b.getContainer(), r4Var.a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 1:
                gi.s sVar = (gi.s) this.b;
                hi.f fVar = (hi.f) this.c;
                sVar.getClass();
                sVar.presentFragment(co.R9(fVar.b.id));
                return;
            case 2:
                ((gi.k0) this.b).s.presentFragment(co.R9(((hi.f) this.c).b.id));
                return;
            case 3:
                ((e2.a0) this.b).e((Typeface) this.c);
                return;
            case 4:
                hg.c cVar = (hg.c) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                int i11 = cVar.G;
                MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.w, location, false);
                return;
            case 5:
                hg.i0 i0Var = (hg.i0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i12 = i0Var.s0;
                ArrayList arrayList = i0Var.K;
                i0Var.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    arrayList.clear();
                    i0Var.l();
                    return;
                }
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i12).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    i0Var.l();
                    return;
                }
                return;
            case 6:
                hg.i0 i0Var2 = (hg.i0) this.b;
                View view = (View) this.c;
                i0Var2.m0 = false;
                i0Var2.o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                hg.i0 i0Var3 = (hg.i0) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                i0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(i0Var3.s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 8:
                hg.u1 u1Var = (hg.u1) this.b;
                String str3 = (String) this.c;
                u1Var.I = str3;
                if (u1Var.r) {
                    u1Var.f.g(str3, true, false, u1Var.s, u1Var.v, u1Var.x, u1Var.w, -1, 1);
                }
                int i13 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i13).contacts);
                u1Var.y = true;
                int i14 = u1Var.F;
                u1Var.F = i14 + 1;
                u1Var.E = i14;
                u1Var.l();
                Utilities.searchQueue.postRunnable(new y4(u1Var, str3, i14, arrayList2, i13, 1));
                return;
            case 9:
                hg.b2 b2Var = (hg.b2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                int i15 = b2Var.m;
                try {
                    MessagesStorage.getInstance(i15).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i15).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList3.size() && i16 != 100) {
                            hg.z1 z1Var = (hg.z1) arrayList3.get(i16);
                            executeFast.requery();
                            executeFast.bindString(1, z1Var.a);
                            executeFast.bindInteger(2, z1Var.b);
                            executeFast.step();
                            i16++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i15).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList3.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((hg.z1) arrayList3.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i15).getDatabase().commitTransaction();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 10:
                i2.f0 f0Var = (i2.f0) this.b;
                i2.l0 l0Var = (i2.l0) this.c;
                int i17 = f0Var.H - l0Var.b;
                f0Var.H = i17;
                boolean z10 = true;
                if (l0Var.d) {
                    f0Var.I = l0Var.e;
                    f0Var.J = true;
                }
                if (i17 == 0) {
                    b2.k1 k1Var = ((i2.g1) l0Var.f).a;
                    if (!f0Var.j0.a.p() && k1Var.p()) {
                        f0Var.k0 = -1;
                        f0Var.l0 = 0L;
                    }
                    if (!k1Var.p()) {
                        List asList = Arrays.asList(((i2.l1) k1Var).l);
                        e2.d.g(asList.size() == f0Var.p.size());
                        for (int i18 = 0; i18 < asList.size(); i18++) {
                            ((i2.e0) f0Var.p.get(i18)).c = (b2.k1) asList.get(i18);
                        }
                    }
                    long j3 = -9223372036854775807L;
                    if (f0Var.J) {
                        if (((i2.g1) l0Var.f).b.equals(f0Var.j0.b) && ((i2.g1) l0Var.f).d == f0Var.j0.s) {
                            z10 = false;
                        }
                        if (z10) {
                            if (k1Var.p() || ((i2.g1) l0Var.f).b.b()) {
                                j3 = ((i2.g1) l0Var.f).d;
                            } else {
                                i2.g1 g1Var = (i2.g1) l0Var.f;
                                u2.f0 f0Var2 = g1Var.b;
                                long j10 = g1Var.d;
                                Object obj = f0Var2.a;
                                b2.h1 h1Var = f0Var.o;
                                k1Var.g(obj, h1Var);
                                j3 = j10 + h1Var.e;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    f0Var.J = false;
                    f0Var.z1((i2.g1) l0Var.f, 1, z10, f0Var.I, j3, -1, false);
                    return;
                }
                return;
            case 11:
                i2.c0 c0Var = (i2.c0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList4 = c0Var.a.n0;
                int size = arrayList4.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj2 = arrayList4.get(i19);
                    i19++;
                    ((g71) ((b2.w1) obj2)).J.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 12:
                ig.f fVar2 = (ig.f) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                fVar2.e = false;
                TL_account.connectedBots connectedbots = tLObject2 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject2 : null;
                fVar2.c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(fVar2.a).putUsers(fVar2.c.users, false);
                }
                fVar2.b = System.currentTimeMillis();
                fVar2.f = true;
                fVar2.d();
                return;
            case 13:
                ig.k0.R((ig.k0) this.b, (m8) this.c);
                return;
            case 14:
                MessagesController.getInstance(((ig.u0) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 15:
                ig.g1 g1Var2 = (ig.g1) this.b;
                h51 h51Var = (h51) this.c;
                g1Var2.getClass();
                g1Var2.X(h51Var.d);
                return;
            case 16:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                ig.a2 a2Var = (ig.a2) this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, a2Var.a);
                        sQLitePreparedStatement.bindString(2, a2Var.b);
                        sQLitePreparedStatement.bindInteger(3, a2Var.c);
                        sQLitePreparedStatement.bindInteger(4, a2Var.f);
                        sQLitePreparedStatement.step();
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
            case 17:
                ig.b2 b2Var2 = (ig.b2) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                ArrayList arrayList5 = b2Var2.b;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement2 = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            ig.a2 a2Var2 = (ig.a2) arrayList5.get(i20);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, a2Var2.a);
                            sQLitePreparedStatement2.bindString(2, a2Var2.b);
                            sQLitePreparedStatement2.bindInteger(3, a2Var2.c);
                            sQLitePreparedStatement2.bindInteger(4, a2Var2.f);
                            sQLitePreparedStatement2.step();
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Exception e12) {
                        FileLog.e(e12);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
            case 18:
                ig.b2 b2Var3 = (ig.b2) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList6 = b2Var3.b;
                int i21 = b2Var3.a;
                ArrayList arrayList7 = null;
                if (tLObject3 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject3;
                    MessagesController.getInstance(i21).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i21).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i21).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList8 = new ArrayList();
                    for (int i22 = 0; i22 < tL_messages_quickReplies.quick_replies.size(); i22++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i22);
                        ig.a2 a2Var3 = new ig.a2();
                        a2Var3.a = tL_quickReply.shortcut_id;
                        a2Var3.b = tL_quickReply.shortcut;
                        a2Var3.f = tL_quickReply.count;
                        a2Var3.d = tL_quickReply.top_message;
                        a2Var3.c = i22;
                        int i23 = 0;
                        while (true) {
                            if (i23 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i23);
                                if (message.id != tL_quickReply.top_message) {
                                    i23++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject = new MessageObject(i21, message, false, true);
                            a2Var3.e = messageObject;
                            messageObject.generateThumbs(false);
                            a2Var3.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList8.add(a2Var3);
                    }
                    arrayList7 = arrayList8;
                }
                b2Var3.e = false;
                if (arrayList7 != null) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList7);
                }
                b2Var3.f = true;
                b2Var3.l();
                NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 19:
                ((j2.i) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 20:
                ((j2.i) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 21:
                ((j2.i) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 22:
                ((j2.i) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 23:
                ((j2.i) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 24:
                String[] strArr = (String[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                boolean z11 = false;
                ji.s a2 = ji.s.a(strArr[0], AndroidUtilities.dp(26.0f), false);
                if (a2 == null) {
                    a2 = ji.s.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                    z11 = true;
                }
                AndroidUtilities.runOnUIThread(new di.y0(callback2, a2 != null ? a2.a : null, z11, 4));
                return;
            case 25:
                ji.x xVar = (ji.x) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                xVar.g0 = false;
                xVar.h0 = 0;
                di.d dVar = xVar.f0;
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
                xVar.i0 = richMessage;
                xVar.c0.set(richMessage);
                dVar.g(LocaleController.getString(R.string.ArticleAIAddToPage), true, true);
                xVar.P();
                v51 v51Var = xVar.Z;
                if (v51Var != null) {
                    v51Var.N(true);
                    return;
                }
                return;
            case 26:
                ji.v3 v3Var = (ji.v3) this.b;
                Uri uri = (Uri) this.c;
                String str4 = null;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e13) {
                    FileLog.e(e13);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !w.f.o(str)) {
                    try {
                        query = v3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e14) {
                        e = e14;
                        str2 = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = v3Var.getContext().getContentResolver().openInputStream(uri);
                        if (openInputStream == null) {
                        }
                        str = str4;
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
                                    } catch (Exception e15) {
                                        e = e15;
                                        FileLog.e(e);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = v3Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream == null) {
                                        }
                                        str = str4;
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
                                openInputStream = v3Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            AndroidUtilities.copyFile(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            String absolutePath = file.getAbsolutePath();
                                            openInputStream.close();
                                            str4 = absolutePath;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else if (openInputStream != null) {
                                    openInputStream.close();
                                }
                                str = str4;
                            }
                        } catch (Throwable th4) {
                            try {
                                query.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                    str2 = null;
                    if (query != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace222 = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = v3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str4;
                }
                if (TextUtils.isEmpty(str) || !w.f.o(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new j4(27, v3Var, str));
                return;
            case 27:
                ((ji.v3) this.b).b2((String) this.c);
                return;
            case 28:
                ji.v3 v3Var2 = (ji.v3) this.b;
                ji.d2 d2Var = (ji.d2) this.c;
                v3Var2.getClass();
                long j11 = d2Var.a;
                int i24 = d2Var.d;
                int i25 = d2Var.c;
                ArrayList arrayList9 = v3Var2.l3;
                int i26 = 0;
                while (true) {
                    if (i26 >= arrayList9.size()) {
                        i26 = -1;
                    } else if (((ji.a) arrayList9.get(i26)).a != j11) {
                        i26++;
                    }
                }
                if (i26 < 0) {
                    return;
                }
                KeyEvent.Callback m10 = v3Var2.X2.m(i26);
                if (m10 instanceof g6) {
                    g6 g6Var = (g6) m10;
                    g6Var.B();
                    ji.h1 editText = g6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i25, length)), Math.max(0, Math.min(i24, length)));
                    return;
                }
                if (!(m10 instanceof s5)) {
                    if (m10 instanceof ji.l0) {
                        ji.h1 captionEditText = ((ji.l0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i25, length2)), Math.max(0, Math.min(i24, length2)));
                        return;
                    }
                    return;
                }
                s5 s5Var = (s5) m10;
                ji.h1 l4 = s5Var.l(d2Var.b);
                if (l4 == null) {
                    l4 = s5Var.l(0);
                }
                if (l4 == null) {
                    return;
                }
                l4.r();
                int length3 = l4.length();
                l4.setSelection(Math.max(0, Math.min(i25, length3)), Math.max(0, Math.min(i24, length3)));
                return;
            default:
                ji.m3 m3Var = (ji.m3) this.b;
                ji.a aVar = (ji.a) this.c;
                if (aVar == null) {
                    m3Var.getClass();
                    y12 = null;
                } else {
                    y12 = m3Var.e.y1(aVar);
                }
                if (y12 instanceof g6) {
                    g6 g6Var2 = (g6) y12;
                    g6Var2.B();
                    g6Var2.getEditText().setSelection(g6Var2.getEditText().length());
                    return;
                }
                return;
        }
    }
}
