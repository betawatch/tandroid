// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class de2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ de2(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    private final void a() {
        int i;
        wt1 wt1Var = (wt1) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        mu1 mu1Var = wt1Var.a;
        i = ((d) mu1Var).currentAccount;
        ij.q0(z3a.B(i).p0(arrayList, this.b, false, false, true, 0, 0, null, -1, 0L, mu1Var.a7(), mu1Var.y5), null, mu1Var);
    }

    private final void b() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        ux1 ux1Var = (ux1) this.d;
        int i = ChatActivityEnterView.r7;
        ux1Var.run();
        bue.c(chatActivityEnterView.R, this.b);
    }

    private final void c() {
        x02 x02Var = (x02) this.c;
        wjb wjbVar = (wjb) this.d;
        ij.J(x02Var.getContext(), this.b, new fz1(x02Var, (byte) 16), wjbVar);
    }

    private final void d() {
        j52 j52Var;
        l52 l52Var = (l52) this.c;
        j52 j52Var2 = (j52) this.d;
        m52 m52Var = l52Var.Q;
        if (!m52Var.r.J1 && l52Var.E == this.b && (j52Var = l52Var.G) == j52Var2) {
            m52Var.K = j52Var;
            m52Var.N = j52Var.a.a;
            m52Var.L = false;
            l52Var.H = 0.0f;
            l52Var.invalidate();
            ValueAnimator valueAnimator = m52Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            m52Var.M = ofFloat;
            ofFloat.addUpdateListener(new h52(l52Var, (byte) 0));
            m52Var.M.setDuration(200L);
            m52Var.M.start();
            j52 j52Var3 = m52Var.K;
            RectF e = j52Var3.e(j52Var3.c());
            RectF b = m52Var.K.b();
            m52Var.H = (((m52Var.E - e.left) / e.width()) + 0.5f) / 2.0f;
            m52Var.G = (m52Var.F - e.top) / e.height();
            m52Var.I = b.width();
            m52Var.J = b.height();
            try {
                m52Var.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
        }
    }

    private final void e() {
        kf2 kf2Var = (kf2) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        kf2Var.getMessagesController().b0(kf2Var.N, user);
        kf2Var.y0(this.b);
        if (kf2Var.n == null || user == null || !u21.a(kf2Var)) {
            return;
        }
        u21.D(kf2Var, user, kf2Var.n.title).j();
    }

    private final void f() {
        boolean z;
        boolean z2;
        boolean z3;
        vf3 vf3Var = (vf3) this.c;
        uf3 uf3Var = (uf3) this.d;
        g2b g2bVar = vf3Var.s;
        ArrayList arrayList = vf3Var.y;
        cj3 cj3Var = vf3Var.f0;
        if (cj3Var == null || cj3Var.getParentActivity() == null) {
            return;
        }
        int i = uf3Var.b;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                z = true;
                break;
            }
            long j = ((sf3) arrayList.get(i2)).c;
            if (j != y6c.h(vf3Var.f).n && g2bVar.K(j)) {
                z = false;
                break;
            }
            i2++;
        }
        if (uf3Var.G && (!z || arrayList.size() == 1)) {
            arrayList2.add(Long.valueOf(uf3Var.F));
            z3 = false;
            z2 = true;
        } else if (uf3Var.G || !g2bVar.K(uf3Var.F)) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (g2bVar.J(((sf3) arrayList.get(i3)).c)) {
                    arrayList2.add(Long.valueOf(((sf3) arrayList.get(i3)).c));
                } else if (i3 <= i) {
                    i--;
                }
            }
            z2 = false;
            z3 = false;
        } else {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                long j2 = ((sf3) arrayList.get(i4)).c;
                if (!uf3Var.G && g2bVar.K(j2)) {
                    arrayList2.add(Long.valueOf(j2));
                }
                if (j2 == uf3Var.F) {
                    i = arrayList2.size() - 1;
                }
            }
            z2 = false;
            z3 = true;
        }
        m8b orCreateStoryViewer = cj3Var.getOrCreateStoryViewer();
        orCreateStoryViewer.s(new et((Object) vf3Var, this.b, (byte) 13));
        Context context = vf3Var.getContext();
        p2b a = p2b.a(vf3Var.h);
        a.e = new l41((byte) 4, vf3Var, z2);
        a.f = vf3Var.b == 1;
        a.h = z3;
        a.n = z2;
        a.r = true;
        orCreateStoryViewer.K(context, null, arrayList2, i, null, null, a, false);
    }

    private final void g() {
        cj3 cj3Var = (cj3) this.c;
        n30 n30Var = (n30) this.d;
        if (cj3Var.H.bot_admin_rights == null) {
            n30Var.run();
        } else {
            cj3Var.getMessagesController().U4(-this.b, cj3Var.getMessagesController().V1(Long.valueOf(cj3Var.I)), cj3Var.H.bot_admin_rights, null, false, cj3Var, true, true, null, n30Var, new vu2(n30Var, (byte) 23));
        }
    }

    private final void h() {
        tv4 tv4Var = (tv4) this.c;
        p8c p8cVar = (p8c) this.d;
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        tv4Var.dismiss();
        if (p8cVar != null) {
            p8cVar.a(Boolean.FALSE);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.b);
        bundle.putBoolean("open_gifts", true);
        S.presentFragment(new ProfileActivity(bundle, null));
    }

    private final void i() {
        h75 h75Var = (h75) this.c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        h75Var.getClass();
        TLRPC.Update update = updates.update;
        int i = 0;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = message.id;
            }
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else if (updates.updates != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= updates.updates.size()) {
                    break;
                }
                TLRPC.Update update2 = updates.updates.get(i2);
                if (update2 instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                    if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i = message2.id;
                        break;
                    }
                    i2++;
                } else {
                    if (update2 instanceof TL_update.TL_updateMessageID) {
                        i = ((TL_update.TL_updateMessageID) update2).id;
                        break;
                    }
                    i2++;
                }
            }
        }
        fc2 fc2Var = h75Var.T2;
        if (fc2Var == null || i == 0) {
            return;
        }
        HashMap hashMap = fc2Var.k;
        Long valueOf = Long.valueOf(this.b);
        ec2 ec2Var = new ec2();
        ec2Var.a = i;
        ec2Var.b = true;
        ec2Var.c = System.currentTimeMillis();
        hashMap.put(valueOf, ec2Var);
        h75Var.D0(true);
    }

    private final void j() {
        ((eu5) this.c).td(this.b, (TLRPC.Chat) this.d);
    }

    private final void k() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        Long l = (Long) this.d;
        d S = LaunchActivity.S();
        if (S != null) {
            mu1 U9 = mu1.U9(l.longValue());
            S.presentFragment(U9);
            TLRPC.Chat K0 = na7.q1(launchActivity.P).K0(Long.valueOf(-l.longValue()));
            if (K0 != null) {
                gl.e3(new zy5(U9, this.b, K0, (byte) 0), 250L);
            }
        }
    }

    private final void l() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        bz5 bz5Var = (bz5) this.d;
        String str = LaunchActivity.C1;
        gl.d3(new sx5((Object) launchActivity, (Object) ad7.Y(launchActivity.P).g0(this.b), (Object) bz5Var, (byte) 5));
    }

    private final void m() {
        qa6 qa6Var = (qa6) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (qa6Var.F != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            byte b = 0;
            int i = 0;
            while (i < messages_messages.messages.size()) {
                if (!(messages_messages.messages.get(i).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                    messages_messages.messages.remove(i);
                    i--;
                }
                i++;
            }
            qa6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
            qa6Var.getMessagesController().a4(messages_messages.users, false);
            qa6Var.getMessagesController().U3(messages_messages.chats, false);
            vf6 vf6Var = qa6Var.getLocationController().c;
            ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
            long j = this.b;
            vf6Var.k(arrayList, j);
            qa6Var.getNotificationCenter().k(kk7.H4, Long.valueOf(j));
            qa6Var.j0(messages_messages.messages);
            qa6Var.getLocationController().j(qa6Var.m0);
            if (qa6Var.Q0 == null) {
                t96 t96Var = new t96(qa6Var, b);
                qa6Var.Q0 = t96Var;
                gl.e3(t96Var, 5000L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05cc A[Catch: Exception -> 0x05ef, all -> 0x05f3, TryCatch #2 {Exception -> 0x05ef, blocks: (B:184:0x03f3, B:185:0x03f9, B:280:0x0570, B:283:0x0586, B:285:0x0590, B:289:0x0598, B:291:0x05a2, B:296:0x05ac, B:298:0x05cc, B:299:0x05d3, B:301:0x05d9, B:302:0x05dd), top: B:183:0x03f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05d9 A[Catch: Exception -> 0x05ef, all -> 0x05f3, TryCatch #2 {Exception -> 0x05ef, blocks: (B:184:0x03f3, B:185:0x03f9, B:280:0x0570, B:283:0x0586, B:285:0x0590, B:289:0x0598, B:291:0x05a2, B:296:0x05ac, B:298:0x05cc, B:299:0x05d3, B:301:0x05d9, B:302:0x05dd), top: B:183:0x03f3 }] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        Consumer consumer;
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor queryFinalized;
        String str;
        String str2;
        SparseArray sparseArray;
        HashSet hashSet;
        vf6 vf6Var;
        int size;
        int i;
        String str3;
        String str4;
        SparseArray sparseArray2;
        HashSet hashSet2;
        TLRPC.MessageReplyHeader messageReplyHeader;
        NativeByteBuffer byteBufferValue;
        SparseArray sparseArray3;
        HashSet hashSet3;
        int i2;
        ArrayList arrayList3;
        Boolean bool;
        byte b = 8;
        int i3 = 2;
        int i4 = 1;
        ?? r9 = 0;
        switch (this.a) {
            case 0:
                kk7.f(((je2) this.c).currentAccount).k(67, Long.valueOf(this.b), (TLRPC.UserFull) this.d);
                return;
            case 1:
                eb6 eb6Var = (eb6) this.c;
                long j = this.b;
                TLObject tLObject = (TLObject) this.d;
                eb6Var.H.e(j);
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i5 = 0;
                while (i5 < messages_messages.messages.size()) {
                    if (!(messages_messages.messages.get(i5).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                        messages_messages.messages.remove(i5);
                        i5--;
                    }
                    i5++;
                }
                eb6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                eb6Var.getMessagesController().a4(messages_messages.users, false);
                eb6Var.getMessagesController().U3(messages_messages.chats, false);
                eb6Var.c.k(messages_messages.messages, j);
                kk7.e().k(kk7.H4, Long.valueOf(j), Integer.valueOf(eb6Var.currentAccount));
                return;
            case 2:
                na7 na7Var = (na7) this.c;
                long j2 = this.b;
                TL_update.TL_updateMessageWidgetData tL_updateMessageWidgetData = (TL_update.TL_updateMessageWidgetData) this.d;
                int i6 = na7Var.currentAccount;
                int i7 = tL_updateMessageWidgetData.msg_id;
                String str5 = tL_updateMessageWidgetData.public_data;
                long j3 = tL_updateMessageWidgetData.public_data_hash;
                String str6 = tL_updateMessageWidgetData.chat_data;
                for (svc svcVar : vvc.a.values()) {
                    if (!svcVar.k && svcVar.b == i6 && svcVar.c == j2 && svcVar.d == i7) {
                        if (str5 != null) {
                            svcVar.q = j3;
                            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = svcVar.r;
                            if (tL_messageMediaWidget != null) {
                                tL_messageMediaWidget.public_data_hash = j3;
                            }
                        }
                        vvc.a(svcVar, str6 != null ? vvc.C(str6) : svcVar.o, str5 != null ? vvc.C(str5) : svcVar.p);
                    }
                }
                return;
            case 3:
                na7 na7Var2 = (na7) this.c;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.d;
                long j4 = this.b;
                na7Var2.a4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(na7Var2.currentAccount).c(-j4, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 4:
                na7 na7Var3 = (na7) this.c;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.d;
                long j5 = this.b;
                na7Var3.a4(tL_messages_invitedUsers.updates.users, false);
                na7Var3.U3(tL_messages_invitedUsers.updates.chats, false);
                ij.f(na7Var3.currentAccount, na7Var3.K0(Long.valueOf(j5)), tL_messages_invitedUsers);
                return;
            case 5:
                ad7 ad7Var = (ad7) this.c;
                long j6 = this.b;
                Consumer consumer2 = (Consumer) this.d;
                String str7 = ")";
                String str8 = " AND mid IN (";
                try {
                    SQLiteDatabase sQLiteDatabase = ad7Var.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT top_message, data, topic_message, unread_count, max_read_id, unread_mentions, unread_reactions, read_outbox, pinned, total_messages_count, nopaid_messages_exception, unread_poll_votes FROM topics WHERE did = " + j6 + " ORDER BY pinned ASC", new Object[0]);
                    arrayList2 = null;
                    SparseArray sparseArray4 = null;
                    HashSet hashSet4 = null;
                    while (queryFinalized2.next()) {
                        try {
                            if (arrayList2 == null) {
                                try {
                                    try {
                                        ArrayList arrayList4 = new ArrayList();
                                        try {
                                            sparseArray3 = new SparseArray();
                                            hashSet3 = new HashSet();
                                            arrayList2 = arrayList4;
                                        } catch (Exception e) {
                                            e = e;
                                            consumer = consumer2;
                                            sQLiteCursor = queryFinalized2;
                                            z = i4;
                                            arrayList = arrayList4;
                                            try {
                                                ad7Var.n(e, z);
                                                if (sQLiteCursor != null) {
                                                }
                                                arrayList2 = arrayList;
                                                consumer.x(arrayList2);
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (sQLiteCursor != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteCursor = queryFinalized2;
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    consumer = consumer2;
                                    arrayList = arrayList2;
                                    sQLiteCursor = queryFinalized2;
                                    z = i4;
                                }
                            } else {
                                sparseArray3 = sparseArray4;
                                hashSet3 = hashSet4;
                            }
                            try {
                                int intValue = queryFinalized2.intValue(r9);
                                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(i4);
                                if (byteBufferValue2 != 0) {
                                    i2 = i4;
                                    try {
                                        TLRPC.TL_forumTopic TLdeserialize = TLRPC.TL_forumTopic.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r9), r9);
                                        if (TLdeserialize != null) {
                                            TLdeserialize.top_message = intValue;
                                            ArrayList arrayList5 = (ArrayList) sparseArray3.get(intValue);
                                            if (arrayList5 == null) {
                                                arrayList3 = new ArrayList();
                                                sparseArray3.put(intValue, arrayList3);
                                            } else {
                                                arrayList3 = arrayList5;
                                            }
                                            arrayList3.add(TLdeserialize);
                                            hashSet3.add(Integer.valueOf(intValue));
                                            arrayList2.add(TLdeserialize);
                                            NativeByteBuffer byteBufferValue3 = queryFinalized2.byteBufferValue(i3);
                                            TLdeserialize.topicStartMessage = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                            byteBufferValue3.reuse();
                                            TLdeserialize.unread_count = queryFinalized2.intValue(3);
                                            TLdeserialize.read_inbox_max_id = queryFinalized2.intValue(4);
                                            TLdeserialize.unread_mentions_count = queryFinalized2.intValue(5);
                                            TLdeserialize.unread_reactions_count = queryFinalized2.intValue(6);
                                            TLdeserialize.read_outbox_max_id = queryFinalized2.intValue(7);
                                            int intValue2 = queryFinalized2.intValue(8) - 1;
                                            TLdeserialize.pinnedOrder = intValue2;
                                            TLdeserialize.pinned = intValue2 >= 0 ? i2 : 0;
                                            TLdeserialize.totalMessagesCount = queryFinalized2.intValue(9);
                                            TLdeserialize.nopaid_messages_exception = queryFinalized2.intValue(10) != 0 ? i2 : 0;
                                            TLdeserialize.unread_poll_votes_count = queryFinalized2.intValue(11);
                                        }
                                        byteBufferValue2.reuse();
                                    } catch (Exception e3) {
                                        e = e3;
                                        consumer = consumer2;
                                        arrayList = arrayList2;
                                        sQLiteCursor = queryFinalized2;
                                        z = i2;
                                        ad7Var.n(e, z);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        arrayList2 = arrayList;
                                        consumer.x(arrayList2);
                                        return;
                                    }
                                } else {
                                    i2 = i4;
                                }
                                sparseArray4 = sparseArray3;
                                hashSet4 = hashSet3;
                                i4 = i2;
                                i3 = 2;
                                r9 = 0;
                            } catch (Exception e4) {
                                e = e4;
                                i2 = i4;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            consumer = consumer2;
                            sQLiteCursor2 = queryFinalized2;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor2 = queryFinalized2;
                        }
                    }
                    int i8 = i4;
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    vf6 vf6Var2 = new vf6();
                    vf6 vf6Var3 = new vf6();
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        consumer = consumer2;
                        sQLiteCursor2 = queryFinalized2;
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SELECT mid, data, replydata FROM messages_v2 WHERE uid = ");
                        sb.append(j6);
                        sb.append(" AND mid IN (");
                        sQLiteCursor2 = queryFinalized2;
                        HashSet hashSet5 = hashSet4;
                        try {
                            try {
                                sb.append(TextUtils.join(",", hashSet5));
                                sb.append(")");
                                String sb2 = sb.toString();
                                consumer = consumer2;
                                int i9 = 0;
                                try {
                                    queryFinalized = sQLiteDatabase2.queryFinalized(sb2, new Object[0]);
                                    while (queryFinalized.next()) {
                                        try {
                                            int intValue3 = queryFinalized.intValue(i9);
                                            NativeByteBuffer byteBufferValue4 = queryFinalized.byteBufferValue(i8);
                                            if (byteBufferValue4 != null) {
                                                arrayList = arrayList2;
                                                try {
                                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue4, byteBufferValue4.readInt32(false), false);
                                                    if (TLdeserialize2 != null) {
                                                        str3 = str7;
                                                        str4 = str8;
                                                        TLdeserialize2.readAttachPath(byteBufferValue4, y6c.h(ad7Var.currentAccount).n);
                                                    } else {
                                                        str3 = str7;
                                                        str4 = str8;
                                                    }
                                                    byteBufferValue4.reuse();
                                                    hashSet5.remove(Integer.valueOf(intValue3));
                                                    sparseArray2 = sparseArray4;
                                                    ArrayList arrayList8 = (ArrayList) sparseArray2.get(intValue3);
                                                    if (arrayList8 != null) {
                                                        for (int i10 = 0; i10 < arrayList8.size(); i10++) {
                                                            ((TLRPC.TL_forumTopic) arrayList8.get(i10)).topMessage = TLdeserialize2;
                                                        }
                                                    }
                                                    ad7.d(TLdeserialize2, arrayList6, arrayList7, null);
                                                    try {
                                                        messageReplyHeader = TLdeserialize2.reply_to;
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        hashSet2 = hashSet5;
                                                    }
                                                    if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0 && ad7.s0(TLdeserialize2.action)) {
                                                        if (queryFinalized.isNull(2) || (byteBufferValue = queryFinalized.byteBufferValue(2)) == null) {
                                                            hashSet2 = hashSet5;
                                                        } else {
                                                            TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                            TLdeserialize2.replyMessage = TLdeserialize3;
                                                            hashSet2 = hashSet5;
                                                            try {
                                                                TLdeserialize3.readAttachPath(byteBufferValue, ad7Var.getUserConfig().n);
                                                                byteBufferValue.reuse();
                                                                TLRPC.Message message = TLdeserialize2.replyMessage;
                                                                if (message != null) {
                                                                    ad7.d(message, arrayList6, arrayList7, null);
                                                                }
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                ad7Var.n(e, true);
                                                                sparseArray4 = sparseArray2;
                                                                hashSet5 = hashSet2;
                                                                arrayList2 = arrayList;
                                                                str7 = str3;
                                                                str8 = str4;
                                                                i9 = 0;
                                                                i8 = 1;
                                                            }
                                                        }
                                                        if (TLdeserialize2.replyMessage == null) {
                                                            ad7.c(TLdeserialize2, vf6Var2, vf6Var3);
                                                        }
                                                        sparseArray4 = sparseArray2;
                                                        hashSet5 = hashSet2;
                                                        arrayList2 = arrayList;
                                                        str7 = str3;
                                                        str8 = str4;
                                                        i9 = 0;
                                                        i8 = 1;
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    sQLiteCursor = sQLiteCursor2;
                                                    z = 1;
                                                    ad7Var.n(e, z);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    arrayList2 = arrayList;
                                                    consumer.x(arrayList2);
                                                    return;
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                                str3 = str7;
                                                str4 = str8;
                                                sparseArray2 = sparseArray4;
                                            }
                                            hashSet2 = hashSet5;
                                            sparseArray4 = sparseArray2;
                                            hashSet5 = hashSet2;
                                            arrayList2 = arrayList;
                                            str7 = str3;
                                            str8 = str4;
                                            i9 = 0;
                                            i8 = 1;
                                        } catch (Exception e9) {
                                            e = e9;
                                            arrayList = arrayList2;
                                            sQLiteCursor = sQLiteCursor2;
                                            z = 1;
                                            ad7Var.n(e, z);
                                            if (sQLiteCursor != null) {
                                            }
                                            arrayList2 = arrayList;
                                            consumer.x(arrayList2);
                                            return;
                                        }
                                    }
                                    arrayList = arrayList2;
                                    str = str7;
                                    str2 = str8;
                                    sparseArray = sparseArray4;
                                    hashSet = hashSet5;
                                } catch (Exception e10) {
                                    e = e10;
                                    arrayList = arrayList2;
                                    z = 1;
                                    sQLiteCursor = sQLiteCursor2;
                                    ad7Var.n(e, z);
                                    if (sQLiteCursor != null) {
                                    }
                                    arrayList2 = arrayList;
                                    consumer.x(arrayList2);
                                    return;
                                }
                                try {
                                    queryFinalized.dispose();
                                    if (!hashSet.isEmpty()) {
                                        ?? r8 = 0;
                                        SQLiteCursor queryFinalized3 = ad7Var.b.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = " + j6 + str2 + TextUtils.join(",", hashSet) + str, new Object[0]);
                                        while (queryFinalized3.next()) {
                                            try {
                                                int intValue4 = queryFinalized3.intValue(r8);
                                                NativeByteBuffer byteBufferValue5 = queryFinalized3.byteBufferValue(1);
                                                if (byteBufferValue5 != 0) {
                                                    TLRPC.Message TLdeserialize4 = TLRPC.Message.TLdeserialize(byteBufferValue5, byteBufferValue5.readInt32(r8), r8);
                                                    if (TLdeserialize4 != null) {
                                                        vf6Var = vf6Var3;
                                                        try {
                                                            TLdeserialize4.readAttachPath(byteBufferValue5, y6c.h(ad7Var.currentAccount).n);
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            ad7Var.n(e, true);
                                                            size = arrayList.size();
                                                            i = 0;
                                                            while (i < size) {
                                                            }
                                                            arrayList2 = arrayList;
                                                            ad7Var.H0(vf6Var2, vf6Var, arrayList6, arrayList7, 0);
                                                            ArrayList arrayList9 = new ArrayList();
                                                            ArrayList arrayList10 = new ArrayList();
                                                            if (!arrayList7.isEmpty()) {
                                                            }
                                                            if (!arrayList6.isEmpty()) {
                                                            }
                                                            gl.d3(new ya7(ad7Var, arrayList10, arrayList9, (byte) 1));
                                                            ad7Var.G0(arrayList2, j6);
                                                            sQLiteCursor2.dispose();
                                                            consumer.x(arrayList2);
                                                            return;
                                                        }
                                                    } else {
                                                        vf6Var = vf6Var3;
                                                    }
                                                    byteBufferValue5.reuse();
                                                    hashSet.remove(Integer.valueOf(intValue4));
                                                    ad7.d(TLdeserialize4, arrayList6, arrayList7, null);
                                                    ArrayList arrayList11 = (ArrayList) sparseArray.get(intValue4);
                                                    if (arrayList11 != null) {
                                                        for (int i11 = 0; i11 < arrayList11.size(); i11++) {
                                                            ((TLRPC.TL_forumTopic) arrayList11.get(i11)).topMessage = TLdeserialize4;
                                                        }
                                                    }
                                                } else {
                                                    vf6Var = vf6Var3;
                                                }
                                                vf6Var3 = vf6Var;
                                                r8 = 0;
                                            } catch (Exception e12) {
                                                e = e12;
                                                vf6Var = vf6Var3;
                                            }
                                        }
                                    }
                                    vf6Var = vf6Var3;
                                    size = arrayList.size();
                                    i = 0;
                                    while (i < size) {
                                        ArrayList arrayList12 = arrayList;
                                        Object obj = arrayList12.get(i);
                                        i++;
                                        long n = cf3.n(((TLRPC.TL_forumTopic) obj).from_id);
                                        if (n != 0) {
                                            if (n > 0) {
                                                if (!arrayList6.contains(Long.valueOf(n))) {
                                                    arrayList6.add(Long.valueOf(n));
                                                }
                                            } else if (!arrayList7.contains(Long.valueOf(n))) {
                                                arrayList7.add(Long.valueOf(n));
                                            }
                                        }
                                        arrayList = arrayList12;
                                    }
                                    arrayList2 = arrayList;
                                    ad7Var.H0(vf6Var2, vf6Var, arrayList6, arrayList7, 0);
                                    ArrayList arrayList92 = new ArrayList();
                                    ArrayList arrayList102 = new ArrayList();
                                    if (!arrayList7.isEmpty()) {
                                        ad7Var.P(TextUtils.join(",", arrayList7), arrayList92);
                                    }
                                    if (!arrayList6.isEmpty()) {
                                        ad7Var.k0(arrayList6, arrayList102, false);
                                    }
                                    gl.d3(new ya7(ad7Var, arrayList102, arrayList92, (byte) 1));
                                    ad7Var.G0(arrayList2, j6);
                                } catch (Exception e13) {
                                    e = e13;
                                    z = 1;
                                    sQLiteCursor = sQLiteCursor2;
                                    ad7Var.n(e, z);
                                    if (sQLiteCursor != null) {
                                    }
                                    arrayList2 = arrayList;
                                    consumer.x(arrayList2);
                                    return;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                consumer = consumer2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = sQLiteCursor2;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    sQLiteCursor2.dispose();
                } catch (Exception e15) {
                    e = e15;
                    consumer = consumer2;
                    sQLiteCursor = null;
                    arrayList = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                consumer.x(arrayList2);
                return;
            case 6:
                im7 im7Var = (im7) this.c;
                long j7 = this.b;
                km8 km8Var = (km8) this.d;
                HashSet hashSet6 = new HashSet();
                Iterator<Map.Entry<String, ?>> it = na7.q1(im7Var.currentAccount).W3.getAll().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (key.startsWith("notify2_" + j7)) {
                        Integer z2 = Utilities.z(key.replace("notify2_" + j7, ""));
                        int intValue5 = z2.intValue();
                        if (intValue5 != 0 && im7Var.getMessagesController().n2(j7, intValue5, null) != im7Var.getMessagesController().n2(j7, 0L, null)) {
                            hashSet6.add(z2);
                        }
                    }
                }
                gl.d3(new bj7(km8Var, hashSet6, b));
                return;
            case 7:
                bu9 bu9Var = (bu9) this.c;
                TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) this.d;
                long j8 = this.b;
                bu9Var.getClass();
                if (tL_dialog.folder_id == 1) {
                    SharedPreferences.Editor edit = na7.q1(bu9Var.currentAccount).W3.edit();
                    edit.putBoolean("dialog_bar_archived" + j8, true);
                    edit.commit();
                }
                bu9Var.getMessagesController().R.k(tL_dialog, tL_dialog.id);
                bu9Var.getMessagesController().y.add(tL_dialog);
                bu9Var.getMessagesController().Y4(null);
                bu9Var.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                b1c b1cVar = (b1c) this.c;
                kk7.f(b1cVar.currentAccount).k(128, (k27) this.d, Boolean.FALSE, Boolean.valueOf(b1cVar.A(this.b)));
                return;
            case 9:
                b1c b1cVar2 = (b1c) this.c;
                long j9 = this.b;
                String str9 = (String) this.d;
                synchronized (b1cVar2) {
                    b1cVar2.d.put(Long.valueOf(j9), str9);
                    LongSparseArray longSparseArray = b1cVar2.a;
                    bool = Boolean.TRUE;
                    longSparseArray.put(j9, bool);
                    b1cVar2.H();
                }
                kk7.f(b1cVar2.currentAccount).k(kk7.O1, Long.valueOf(j9), bool);
                return;
            case 10:
                boolean[] zArr = (boolean[]) this.c;
                long j10 = this.b;
                q41[] q41VarArr = (q41[]) this.d;
                zArr[0] = false;
                if (j10 == -1) {
                    q41VarArr[0].setText(k96.M0(2131743674, null));
                    zkb.X(q41VarArr[0], bkb.o7, null);
                    return;
                } else {
                    q41VarArr[0].setText(k96.a0(null, null, 2131747042, Long.valueOf(j10)));
                    zkb.X(q41VarArr[0], bkb.v6, null);
                    return;
                }
            case 11:
                m20 m20Var = (m20) this.c;
                long j11 = this.b;
                Exception exc = (Exception) this.d;
                h30 h30Var = (h30) m20Var.c;
                if (j11 == h30Var.o) {
                    h30Var.n = null;
                    int i12 = h30Var.G;
                    if (i12 != 10 && i12 != 9) {
                        h30Var.g(exc);
                        return;
                    }
                    h30Var.h.a("capture error after session end", exc);
                    h30Var.c();
                    h30Var.t();
                    return;
                }
                return;
            case 12:
                q21 q21Var = (q21) this.c;
                d dVar = (d) this.d;
                long j12 = this.b;
                if (q21Var != null) {
                    q21Var.run();
                }
                if (dVar != null) {
                    dVar.presentFragment(mu1.U9(j12));
                    return;
                }
                return;
            case 13:
                long[] jArr = (long[]) this.c;
                long j13 = this.b;
                i57 i57Var = (i57) this.d;
                jArr[0] = j13;
                i57Var.run();
                return;
            case 14:
                mu1 mu1Var = (mu1) this.c;
                mu1Var.getMessagesController().m0(this.b, ((k27) this.d).e1(), mu1Var.l6);
                return;
            case 15:
                a();
                return;
            case 16:
                b();
                return;
            case 17:
                c();
                return;
            case 18:
                d();
                return;
            case 19:
                e();
                return;
            case 20:
                f();
                return;
            case 21:
                g();
                return;
            case 22:
                kt4 kt4Var = (kt4) this.c;
                ht4 ht4Var = (ht4) this.d;
                long j14 = this.b;
                ht4Var.d = null;
                kt4Var.m(j14);
                return;
            case 23:
                h();
                return;
            case 24:
                i();
                return;
            case 25:
                j();
                return;
            case 26:
                k();
                return;
            case 27:
                l();
                return;
            case 28:
                m();
                return;
            default:
                hq6 hq6Var = (hq6) this.c;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.d;
                long j15 = this.b;
                hq6Var.getClass();
                try {
                    SQLitePreparedStatement executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
                    executeFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
                    botInfo.serializeToStream(nativeByteBuffer);
                    executeFast.bindLong(1, botInfo.user_id);
                    executeFast.bindLong(2, j15);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    executeFast.dispose();
                    return;
                } catch (Exception e16) {
                    fa4.g(e16, true);
                    return;
                }
        }
    }

    public /* synthetic */ de2(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
