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
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:21|(2:22|23)|(3:70|71|(10:73|74|(2:65|66)|27|(1:29)|30|31|32|(1:(1:35))(7:37|38|39|40|41|42|43)|36))|25|(0)|27|(0)|30|31|32|(0)(0)|36) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fe, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        TLRPC.Message message;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                f4Var.getClass();
                f4Var.presentFragment(fo.W9(connectedbotstarref.bot_id));
                return;
            case 1:
                q4 q4Var = (q4) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (q4Var.T) {
                    return;
                }
                if (tL_error != null) {
                    q4Var.b.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(q4Var.U, 60000L);
                    return;
                }
            case 2:
                q4 q4Var2 = (q4) this.b;
                sc Q = new zc(q4Var2.b.getContainer(), q4Var2.a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 3:
                gi.s sVar = (gi.s) this.b;
                hi.f fVar = (hi.f) this.c;
                sVar.getClass();
                sVar.presentFragment(fo.W9(fVar.b.id));
                return;
            case 4:
                ((gi.k0) this.b).s.presentFragment(fo.W9(((hi.f) this.c).b.id));
                return;
            case 5:
                ((e2.j0) this.b).g((Typeface) this.c);
                return;
            case 6:
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
            case 7:
                hg.h0 h0Var = (hg.h0) this.b;
                View view = (View) this.c;
                h0Var.m0 = false;
                h0Var.o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                hg.h0 h0Var2 = (hg.h0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i12 = h0Var2.s0;
                ArrayList arrayList = h0Var2.K;
                h0Var2.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    arrayList.clear();
                    h0Var2.l();
                    return;
                }
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i12).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var2.l();
                    return;
                }
                return;
            case 9:
                hg.h0 h0Var3 = (hg.h0) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                h0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(h0Var3.s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 10:
                hg.t1 t1Var = (hg.t1) this.b;
                String str3 = (String) this.c;
                t1Var.I = str3;
                if (t1Var.r) {
                    t1Var.f.g(str3, true, false, t1Var.s, t1Var.v, t1Var.x, t1Var.w, -1, 1);
                }
                int i13 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i13).contacts);
                t1Var.y = true;
                int i14 = t1Var.F;
                t1Var.F = i14 + 1;
                t1Var.E = i14;
                t1Var.l();
                Utilities.searchQueue.postRunnable(new x4(t1Var, str3, i14, arrayList2, i13, 1));
                return;
            case 11:
                hg.a2 a2Var = (hg.a2) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                int i15 = a2Var.m;
                try {
                    MessagesStorage.getInstance(i15).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i15).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList3.size() && i16 != 100) {
                            hg.y1 y1Var = (hg.y1) arrayList3.get(i16);
                            executeFast.requery();
                            executeFast.bindString(1, y1Var.a);
                            executeFast.bindInteger(2, y1Var.b);
                            executeFast.step();
                            i16++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i15).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList3.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((hg.y1) arrayList3.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i15).getDatabase().commitTransaction();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 12:
                i2.h0 h0Var4 = (i2.h0) this.b;
                i2.o0 o0Var = (i2.o0) this.c;
                int i17 = h0Var4.J - o0Var.b;
                h0Var4.J = i17;
                boolean z11 = true;
                if (o0Var.d) {
                    h0Var4.K = o0Var.e;
                    h0Var4.L = true;
                }
                if (i17 == 0) {
                    b2.p1 p1Var = ((i2.k1) o0Var.f).a;
                    int i18 = -1;
                    if (!h0Var4.p0.a.p() && p1Var.p()) {
                        h0Var4.q0 = -1;
                        h0Var4.r0 = 0L;
                    }
                    if (!p1Var.p()) {
                        List asList = Arrays.asList(((i2.p1) p1Var).l);
                        u6.p(asList.size() == h0Var4.p.size());
                        for (int i19 = 0; i19 < asList.size(); i19++) {
                            ((i2.d0) h0Var4.p.get(i19)).c = (b2.p1) asList.get(i19);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (h0Var4.L) {
                        boolean z12 = ((i2.k1) o0Var.f).a.p() && h0Var4.p0.a.p();
                        boolean equals = ((i2.k1) o0Var.f).b.equals(h0Var4.p0.b);
                        boolean z13 = ((i2.k1) o0Var.f).d == h0Var4.p0.s;
                        if (z12 || (equals && z13)) {
                            z11 = false;
                        }
                        if (z11) {
                            i18 = h0Var4.n0();
                            if (p1Var.p() || ((i2.k1) o0Var.f).b.b()) {
                                j10 = ((i2.k1) o0Var.f).d;
                            } else {
                                i2.k1 k1Var = (i2.k1) o0Var.f;
                                u2.g0 g0Var = k1Var.b;
                                long j11 = k1Var.d;
                                Object obj = g0Var.a;
                                b2.m1 m1Var = h0Var4.o;
                                p1Var.g(obj, m1Var);
                                j10 = j11 + m1Var.e;
                            }
                        }
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    long j12 = j10;
                    int i20 = i18;
                    h0Var4.L = z10;
                    h0Var4.D1((i2.k1) o0Var.f, 1, z11, h0Var4.K, j12, i20, false);
                    return;
                }
                return;
            case 13:
                i2.b0 b0Var = (i2.b0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                ArrayList arrayList4 = b0Var.a.t0;
                int size = arrayList4.size();
                int i21 = 0;
                while (i21 < size) {
                    Object obj2 = arrayList4.get(i21);
                    i21++;
                    ((h81) ((b2.a2) obj2)).J.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 14:
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
            case 15:
                ig.k0.S((ig.k0) this.b, (o8) this.c);
                return;
            case 16:
                MessagesController.getInstance(((ig.u0) this.b).currentAccount).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 17:
                ig.g1 g1Var = (ig.g1) this.b;
                l61 l61Var = (l61) this.c;
                g1Var.getClass();
                g1Var.X(l61Var.d);
                return;
            case 18:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                ig.a2 a2Var2 = (ig.a2) this.c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, a2Var2.a);
                        sQLitePreparedStatement.bindString(2, a2Var2.b);
                        sQLitePreparedStatement.bindInteger(3, a2Var2.c);
                        sQLitePreparedStatement.bindInteger(4, a2Var2.f);
                        sQLitePreparedStatement.step();
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
            case 19:
                ig.b2 b2Var = (ig.b2) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                ArrayList arrayList5 = b2Var.b;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement2 = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                            ig.a2 a2Var3 = (ig.a2) arrayList5.get(i22);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, a2Var3.a);
                            sQLitePreparedStatement2.bindString(2, a2Var3.b);
                            sQLitePreparedStatement2.bindInteger(3, a2Var3.c);
                            sQLitePreparedStatement2.bindInteger(4, a2Var3.f);
                            sQLitePreparedStatement2.step();
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
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
            case 20:
                ig.b2 b2Var2 = (ig.b2) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList6 = b2Var2.b;
                int i23 = b2Var2.a;
                ArrayList arrayList7 = null;
                if (tLObject3 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject3;
                    MessagesController.getInstance(i23).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i23).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i23).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList8 = new ArrayList();
                    for (int i24 = 0; i24 < tL_messages_quickReplies.quick_replies.size(); i24++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i24);
                        ig.a2 a2Var4 = new ig.a2();
                        a2Var4.a = tL_quickReply.shortcut_id;
                        a2Var4.b = tL_quickReply.shortcut;
                        a2Var4.f = tL_quickReply.count;
                        a2Var4.d = tL_quickReply.top_message;
                        a2Var4.c = i24;
                        int i25 = 0;
                        while (true) {
                            if (i25 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i25);
                                if (message.id != tL_quickReply.top_message) {
                                    i25++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject = new MessageObject(i23, message, false, true);
                            a2Var4.e = messageObject;
                            messageObject.generateThumbs(false);
                            a2Var4.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList8.add(a2Var4);
                    }
                    arrayList7 = arrayList8;
                }
                b2Var2.e = false;
                if (arrayList7 != null) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList7);
                }
                b2Var2.f = true;
                b2Var2.l();
                NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 21:
                ((j2.i) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 22:
                ((j2.i) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 23:
                ((j2.i) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 24:
                ((j2.i) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 25:
                ((j2.i) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 26:
                String[] strArr = (String[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                boolean z14 = false;
                ji.s a2 = ji.s.a(strArr[0], AndroidUtilities.dp(26.0f), false);
                if (a2 == null) {
                    a2 = ji.s.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                    z14 = true;
                }
                AndroidUtilities.runOnUIThread(new di.x0(callback2, a2 != null ? a2.a : null, z14, 4));
                return;
            case 27:
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
                xVar.Q();
                z61 z61Var = xVar.Z;
                if (z61Var != null) {
                    z61Var.N(true);
                    return;
                }
                return;
            case 28:
                ji.x3 x3Var = (ji.x3) this.b;
                Uri uri = (Uri) this.c;
                String str4 = null;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e12) {
                    FileLog.e(e12);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !t8.b.t(str)) {
                    try {
                        query = x3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e13) {
                        e = e13;
                        str2 = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = x3Var.getContext().getContentResolver().openInputStream(uri);
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
                                    } catch (Exception e14) {
                                        e = e14;
                                        FileLog.e(e);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = x3Var.getContext().getContentResolver().openInputStream(uri);
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
                                openInputStream = x3Var.getContext().getContentResolver().openInputStream(uri);
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
                    openInputStream = x3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str4;
                }
                if (TextUtils.isEmpty(str) || !t8.b.t(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new q3(29, x3Var, str));
                return;
            default:
                ((ji.x3) this.b).d2((String) this.c);
                return;
        }
    }
}
