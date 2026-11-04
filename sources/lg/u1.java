package lg;

import android.text.TextUtils;
import ci.l2;
import ei.u5;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u1 {
    public static volatile u1[] g = new u1[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            h[i3] = new Object();
        }
    }

    public u1(int i3) {
        this.a = i3;
    }

    public static u1 f(int i3) {
        u1 u1Var;
        u1 u1Var2 = g[i3];
        if (u1Var2 != null) {
            return u1Var2;
        }
        synchronized (h[i3]) {
            try {
                u1Var = g[i3];
                if (u1Var == null) {
                    u1[] u1VarArr = g;
                    u1 u1Var3 = new u1(i3);
                    u1VarArr[i3] = u1Var3;
                    u1Var = u1Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u1Var;
    }

    public static boolean g(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void a(String str) {
        t1 t1Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                t1Var = null;
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            t1Var = (t1) obj;
            if (TextUtils.equals(str, t1Var.b)) {
                break;
            }
        }
        if (t1Var != null) {
            arrayList.remove(t1Var);
            hs.f(this.a).k(hs.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final t1 c(long j10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            t1 t1Var = (t1) obj;
            if (t1Var.a == j10) {
                return t1Var;
            }
        }
        return null;
    }

    public final t1 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            t1 t1Var = (t1) obj;
            if (TextUtils.equals(str, t1Var.b)) {
                return t1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i3 >= arrayList2.size()) {
                return arrayList;
            }
            if (!g(((t1) arrayList2.get(i3)).b)) {
                arrayList.add((t1) arrayList2.get(i3));
            }
            i3++;
        }
    }

    public final void h() {
        i(null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010d A[EDGE_INSN: B:58:0x010d->B:59:0x010d BREAK  A[LOOP:0: B:11:0x003b->B:28:0x0167, LOOP_LABEL: LOOP:0: B:11:0x003b->B:28:0x0167], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Runnable runnable, boolean z10) {
        String substring;
        long j10;
        long j11;
        int i3;
        long j12;
        long j13;
        long j14;
        TLRPC.Message message;
        if (this.e || this.f) {
            return;
        }
        int i10 = 1;
        this.e = true;
        int i11 = this.a;
        if (z10) {
            qr a02 = qr.a0(i11);
            a02.a.c(new l2(this, a02, h10.i(i11).e(), runnable, 13));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        long j15 = 0;
        tL_messages_getQuickReplies.hash = 0L;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.b;
            if (i13 >= arrayList.size()) {
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getQuickReplies, new ci.d0(this, 19));
                return;
            }
            t1 t1Var = (t1) arrayList.get(i13);
            long p10 = li.p(tL_messages_getQuickReplies.hash, t1Var.a);
            tL_messages_getQuickReplies.hash = p10;
            String str = t1Var.b;
            if (str == null) {
                j10 = j15;
            } else {
                substring = Utilities.a(str).substring(i12, 16);
                int length = substring.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                long j16 = 16;
                if (j16 >= j15) {
                    long j17 = (Long.MAX_VALUE / j16) << i10;
                    j10 = j15;
                    j11 = j17 + ((((-1) - (j17 * j16)) ^ Long.MIN_VALUE) >= (j16 ^ Long.MIN_VALUE) ? i10 : i12);
                } else if (Long.MAX_VALUE < (j16 ^ Long.MIN_VALUE)) {
                    j10 = j15;
                    j11 = j10;
                } else {
                    j11 = 1;
                    j10 = j15;
                }
                int i14 = (substring.charAt(i12) != '+' || length <= i10) ? i12 : i10;
                long j18 = j10;
                while (i14 < length) {
                    int digit = Character.digit(substring.charAt(i14), 16);
                    int i15 = i10;
                    if (digit == -1) {
                        throw new NumberFormatException(substring.toString());
                    }
                    if (j18 < j10 || j18 > j11) {
                        break loop0;
                    }
                    if (j18 == j11) {
                        if (j16 >= j15) {
                            long j19 = (-1) - (((Long.MAX_VALUE / j16) << i15) * j16);
                            j12 = j19 - ((j19 ^ Long.MIN_VALUE) >= (j16 ^ Long.MIN_VALUE) ? j16 : j10);
                        } else if (Long.MAX_VALUE < (j16 ^ Long.MIN_VALUE)) {
                            i3 = i13;
                            j13 = -1;
                            if (digit <= ((int) j13)) {
                                break loop0;
                            }
                        } else {
                            j12 = (-1) - j16;
                        }
                        i3 = i13;
                        j13 = j12;
                        if (digit <= ((int) j13)) {
                        }
                    } else {
                        i3 = i13;
                    }
                    j18 = (j18 * j16) + digit;
                    i14++;
                    i10 = i15;
                    i13 = i3;
                }
                j15 = j18;
            }
            int i16 = i10;
            int i17 = i13;
            long p11 = li.p(p10, j15);
            tL_messages_getQuickReplies.hash = p11;
            long p12 = li.p(p11, t1Var.e == null ? j10 : r6.f1());
            tL_messages_getQuickReplies.hash = p12;
            zi ziVar = t1Var.e;
            if (ziVar == null || (message = ziVar.k) == null || (message.flags & 32768) == 0) {
                j14 = j10;
                tL_messages_getQuickReplies.hash = li.p(p12, j14);
            } else {
                tL_messages_getQuickReplies.hash = li.p(p12, message.edit_date);
                j14 = j10;
            }
            i13 = i17 + 1;
            j15 = j14;
            i10 = i16;
            i12 = 0;
        }
        throw new NumberFormatException("Too large for unsigned long: ".concat(substring.toString()));
    }

    public final boolean j(final TLRPC.Update update, String str, int i3) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new bi.q0(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i3));
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final int i10 = 3;
            b(new Runnable(this) { // from class: lg.s1
                public final /* synthetic */ u1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    t1 t1Var;
                    switch (i10) {
                        case 0:
                            u1 u1Var = this.b;
                            ArrayList arrayList = u1Var.b;
                            int i11 = u1Var.a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            t1 c2 = u1Var.c(tL_quickReply.shortcut_id);
                            if (c2 != null) {
                                c2.b = tL_quickReply.shortcut;
                                c2.f = tL_quickReply.count;
                                c2.d = tL_quickReply.top_message;
                                zi ziVar = c2.e;
                                if (ziVar != null && ziVar.f1() != tL_quickReply.top_message) {
                                    c2.e = null;
                                    long e10 = h10.i(i11).e();
                                    qr a02 = qr.a0(i11);
                                    a02.a.c(new l2(u1Var, a02, c2, e10, 14));
                                    break;
                                }
                            } else {
                                t1 t1Var2 = new t1();
                                t1Var2.a = tL_quickReply.shortcut_id;
                                t1Var2.b = tL_quickReply.shortcut;
                                t1Var2.f = tL_quickReply.count;
                                t1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((t1) arrayList.get(i12)).c = i12;
                                }
                                arrayList.add(t1Var2);
                                u1Var.a(t1Var2.b);
                            }
                            u1Var.l();
                            hs.f(i11).k(hs.F1, new Object[0]);
                            break;
                        case 1:
                            u1 u1Var2 = this.b;
                            int i13 = u1Var2.a;
                            t1 c10 = u1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                u1Var2.b.remove(c10);
                                u1Var2.a(c10.b);
                                int i14 = c10.a;
                                qr a03 = qr.a0(i13);
                                a03.a.c(new cg.l0(a03, i14, 13));
                                u1Var2.l();
                                hs.f(i13).k(hs.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 2:
                            u1 u1Var3 = this.b;
                            int i15 = u1Var3.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            t1 c11 = u1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f = size;
                                if (size <= 0) {
                                    u1Var3.b.remove(c11);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                zi ziVar2 = c11.e;
                                if (!arrayList2.contains(Integer.valueOf(ziVar2 != null ? ziVar2.f1() : c11.d)) && c11.e != null) {
                                    u1Var3.l();
                                    hs.f(i15).k(hs.F1, new Object[0]);
                                    break;
                                } else {
                                    c11.e = null;
                                    long e11 = h10.i(i15).e();
                                    qr a04 = qr.a0(i15);
                                    a04.a.c(new l2(u1Var3, a04, c11, e11, 14));
                                    break;
                                }
                            }
                            break;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            u1 u1Var4 = this.b;
                            ArrayList arrayList4 = u1Var4.b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList5.size()) {
                                        t1Var = null;
                                    } else if (((t1) arrayList5.get(i17)).a == tL_quickReply2.shortcut_id) {
                                        t1Var = (t1) arrayList5.get(i17);
                                    } else {
                                        i17++;
                                    }
                                }
                                if (t1Var == null) {
                                    t1Var = new t1();
                                }
                                t1Var.a = tL_quickReply2.shortcut_id;
                                t1Var.b = tL_quickReply2.shortcut;
                                t1Var.f = tL_quickReply2.count;
                                t1Var.c = i16;
                                t1Var.d = tL_quickReply2.top_message;
                                zi ziVar3 = t1Var.e;
                                if (ziVar3 != null && ziVar3.f1() != tL_quickReply2.top_message) {
                                    t1Var.e = null;
                                }
                                arrayList4.add(t1Var);
                                u1Var4.a(t1Var.b);
                            }
                            u1Var4.l();
                            hs.f(u1Var4.a).k(hs.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            final int i11 = 0;
            b(new Runnable(this) { // from class: lg.s1
                public final /* synthetic */ u1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    t1 t1Var;
                    switch (i11) {
                        case 0:
                            u1 u1Var = this.b;
                            ArrayList arrayList = u1Var.b;
                            int i112 = u1Var.a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            t1 c2 = u1Var.c(tL_quickReply.shortcut_id);
                            if (c2 != null) {
                                c2.b = tL_quickReply.shortcut;
                                c2.f = tL_quickReply.count;
                                c2.d = tL_quickReply.top_message;
                                zi ziVar = c2.e;
                                if (ziVar != null && ziVar.f1() != tL_quickReply.top_message) {
                                    c2.e = null;
                                    long e10 = h10.i(i112).e();
                                    qr a02 = qr.a0(i112);
                                    a02.a.c(new l2(u1Var, a02, c2, e10, 14));
                                    break;
                                }
                            } else {
                                t1 t1Var2 = new t1();
                                t1Var2.a = tL_quickReply.shortcut_id;
                                t1Var2.b = tL_quickReply.shortcut;
                                t1Var2.f = tL_quickReply.count;
                                t1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((t1) arrayList.get(i12)).c = i12;
                                }
                                arrayList.add(t1Var2);
                                u1Var.a(t1Var2.b);
                            }
                            u1Var.l();
                            hs.f(i112).k(hs.F1, new Object[0]);
                            break;
                        case 1:
                            u1 u1Var2 = this.b;
                            int i13 = u1Var2.a;
                            t1 c10 = u1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                u1Var2.b.remove(c10);
                                u1Var2.a(c10.b);
                                int i14 = c10.a;
                                qr a03 = qr.a0(i13);
                                a03.a.c(new cg.l0(a03, i14, 13));
                                u1Var2.l();
                                hs.f(i13).k(hs.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 2:
                            u1 u1Var3 = this.b;
                            int i15 = u1Var3.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            t1 c11 = u1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f = size;
                                if (size <= 0) {
                                    u1Var3.b.remove(c11);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                zi ziVar2 = c11.e;
                                if (!arrayList2.contains(Integer.valueOf(ziVar2 != null ? ziVar2.f1() : c11.d)) && c11.e != null) {
                                    u1Var3.l();
                                    hs.f(i15).k(hs.F1, new Object[0]);
                                    break;
                                } else {
                                    c11.e = null;
                                    long e11 = h10.i(i15).e();
                                    qr a04 = qr.a0(i15);
                                    a04.a.c(new l2(u1Var3, a04, c11, e11, 14));
                                    break;
                                }
                            }
                            break;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            u1 u1Var4 = this.b;
                            ArrayList arrayList4 = u1Var4.b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList5.size()) {
                                        t1Var = null;
                                    } else if (((t1) arrayList5.get(i17)).a == tL_quickReply2.shortcut_id) {
                                        t1Var = (t1) arrayList5.get(i17);
                                    } else {
                                        i17++;
                                    }
                                }
                                if (t1Var == null) {
                                    t1Var = new t1();
                                }
                                t1Var.a = tL_quickReply2.shortcut_id;
                                t1Var.b = tL_quickReply2.shortcut;
                                t1Var.f = tL_quickReply2.count;
                                t1Var.c = i16;
                                t1Var.d = tL_quickReply2.top_message;
                                zi ziVar3 = t1Var.e;
                                if (ziVar3 != null && ziVar3.f1() != tL_quickReply2.top_message) {
                                    t1Var.e = null;
                                }
                                arrayList4.add(t1Var);
                                u1Var4.a(t1Var.b);
                            }
                            u1Var4.l();
                            hs.f(u1Var4.a).k(hs.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            final int i12 = 1;
            b(new Runnable(this) { // from class: lg.s1
                public final /* synthetic */ u1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    t1 t1Var;
                    switch (i12) {
                        case 0:
                            u1 u1Var = this.b;
                            ArrayList arrayList = u1Var.b;
                            int i112 = u1Var.a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            t1 c2 = u1Var.c(tL_quickReply.shortcut_id);
                            if (c2 != null) {
                                c2.b = tL_quickReply.shortcut;
                                c2.f = tL_quickReply.count;
                                c2.d = tL_quickReply.top_message;
                                zi ziVar = c2.e;
                                if (ziVar != null && ziVar.f1() != tL_quickReply.top_message) {
                                    c2.e = null;
                                    long e10 = h10.i(i112).e();
                                    qr a02 = qr.a0(i112);
                                    a02.a.c(new l2(u1Var, a02, c2, e10, 14));
                                    break;
                                }
                            } else {
                                t1 t1Var2 = new t1();
                                t1Var2.a = tL_quickReply.shortcut_id;
                                t1Var2.b = tL_quickReply.shortcut;
                                t1Var2.f = tL_quickReply.count;
                                t1Var2.d = tL_quickReply.top_message;
                                for (int i122 = 0; i122 < arrayList.size(); i122++) {
                                    ((t1) arrayList.get(i122)).c = i122;
                                }
                                arrayList.add(t1Var2);
                                u1Var.a(t1Var2.b);
                            }
                            u1Var.l();
                            hs.f(i112).k(hs.F1, new Object[0]);
                            break;
                        case 1:
                            u1 u1Var2 = this.b;
                            int i13 = u1Var2.a;
                            t1 c10 = u1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                u1Var2.b.remove(c10);
                                u1Var2.a(c10.b);
                                int i14 = c10.a;
                                qr a03 = qr.a0(i13);
                                a03.a.c(new cg.l0(a03, i14, 13));
                                u1Var2.l();
                                hs.f(i13).k(hs.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 2:
                            u1 u1Var3 = this.b;
                            int i15 = u1Var3.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            t1 c11 = u1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f = size;
                                if (size <= 0) {
                                    u1Var3.b.remove(c11);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                zi ziVar2 = c11.e;
                                if (!arrayList2.contains(Integer.valueOf(ziVar2 != null ? ziVar2.f1() : c11.d)) && c11.e != null) {
                                    u1Var3.l();
                                    hs.f(i15).k(hs.F1, new Object[0]);
                                    break;
                                } else {
                                    c11.e = null;
                                    long e11 = h10.i(i15).e();
                                    qr a04 = qr.a0(i15);
                                    a04.a.c(new l2(u1Var3, a04, c11, e11, 14));
                                    break;
                                }
                            }
                            break;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            u1 u1Var4 = this.b;
                            ArrayList arrayList4 = u1Var4.b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList5.size()) {
                                        t1Var = null;
                                    } else if (((t1) arrayList5.get(i17)).a == tL_quickReply2.shortcut_id) {
                                        t1Var = (t1) arrayList5.get(i17);
                                    } else {
                                        i17++;
                                    }
                                }
                                if (t1Var == null) {
                                    t1Var = new t1();
                                }
                                t1Var.a = tL_quickReply2.shortcut_id;
                                t1Var.b = tL_quickReply2.shortcut;
                                t1Var.f = tL_quickReply2.count;
                                t1Var.c = i16;
                                t1Var.d = tL_quickReply2.top_message;
                                zi ziVar3 = t1Var.e;
                                if (ziVar3 != null && ziVar3.f1() != tL_quickReply2.top_message) {
                                    t1Var.e = null;
                                }
                                arrayList4.add(t1Var);
                                u1Var4.a(t1Var.b);
                            }
                            u1Var4.l();
                            hs.f(u1Var4.a).k(hs.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        final int i13 = 2;
        b(new Runnable(this) { // from class: lg.s1
            public final /* synthetic */ u1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t1 t1Var;
                switch (i13) {
                    case 0:
                        u1 u1Var = this.b;
                        ArrayList arrayList = u1Var.b;
                        int i112 = u1Var.a;
                        TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                        t1 c2 = u1Var.c(tL_quickReply.shortcut_id);
                        if (c2 != null) {
                            c2.b = tL_quickReply.shortcut;
                            c2.f = tL_quickReply.count;
                            c2.d = tL_quickReply.top_message;
                            zi ziVar = c2.e;
                            if (ziVar != null && ziVar.f1() != tL_quickReply.top_message) {
                                c2.e = null;
                                long e10 = h10.i(i112).e();
                                qr a02 = qr.a0(i112);
                                a02.a.c(new l2(u1Var, a02, c2, e10, 14));
                                break;
                            }
                        } else {
                            t1 t1Var2 = new t1();
                            t1Var2.a = tL_quickReply.shortcut_id;
                            t1Var2.b = tL_quickReply.shortcut;
                            t1Var2.f = tL_quickReply.count;
                            t1Var2.d = tL_quickReply.top_message;
                            for (int i122 = 0; i122 < arrayList.size(); i122++) {
                                ((t1) arrayList.get(i122)).c = i122;
                            }
                            arrayList.add(t1Var2);
                            u1Var.a(t1Var2.b);
                        }
                        u1Var.l();
                        hs.f(i112).k(hs.F1, new Object[0]);
                        break;
                    case 1:
                        u1 u1Var2 = this.b;
                        int i132 = u1Var2.a;
                        t1 c10 = u1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                        if (c10 != null) {
                            u1Var2.b.remove(c10);
                            u1Var2.a(c10.b);
                            int i14 = c10.a;
                            qr a03 = qr.a0(i132);
                            a03.a.c(new cg.l0(a03, i14, 13));
                            u1Var2.l();
                            hs.f(i132).k(hs.F1, new Object[0]);
                            break;
                        }
                        break;
                    case 2:
                        u1 u1Var3 = this.b;
                        int i15 = u1Var3.a;
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                        t1 c11 = u1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (c11 != null) {
                            int size = c11.f - tL_updateDeleteQuickReplyMessages.messages.size();
                            c11.f = size;
                            if (size <= 0) {
                                u1Var3.b.remove(c11);
                            }
                            ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                            zi ziVar2 = c11.e;
                            if (!arrayList2.contains(Integer.valueOf(ziVar2 != null ? ziVar2.f1() : c11.d)) && c11.e != null) {
                                u1Var3.l();
                                hs.f(i15).k(hs.F1, new Object[0]);
                                break;
                            } else {
                                c11.e = null;
                                long e11 = h10.i(i15).e();
                                qr a04 = qr.a0(i15);
                                a04.a.c(new l2(u1Var3, a04, c11, e11, 14));
                                break;
                            }
                        }
                        break;
                    default:
                        ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                        u1 u1Var4 = this.b;
                        ArrayList arrayList4 = u1Var4.b;
                        ArrayList arrayList5 = new ArrayList(arrayList4);
                        arrayList4.clear();
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                            int i17 = 0;
                            while (true) {
                                if (i17 >= arrayList5.size()) {
                                    t1Var = null;
                                } else if (((t1) arrayList5.get(i17)).a == tL_quickReply2.shortcut_id) {
                                    t1Var = (t1) arrayList5.get(i17);
                                } else {
                                    i17++;
                                }
                            }
                            if (t1Var == null) {
                                t1Var = new t1();
                            }
                            t1Var.a = tL_quickReply2.shortcut_id;
                            t1Var.b = tL_quickReply2.shortcut;
                            t1Var.f = tL_quickReply2.count;
                            t1Var.c = i16;
                            t1Var.d = tL_quickReply2.top_message;
                            zi ziVar3 = t1Var.e;
                            if (ziVar3 != null && ziVar3.f1() != tL_quickReply2.top_message) {
                                t1Var.e = null;
                            }
                            arrayList4.add(t1Var);
                            u1Var4.a(t1Var.b);
                        }
                        u1Var4.l();
                        hs.f(u1Var4.a).k(hs.F1, new Object[0]);
                        break;
                }
            }
        });
        return true;
    }

    public final void k(int i3, String str) {
        t1 c2 = c(i3);
        if (c2 == null) {
            return;
        }
        c2.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i3;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i10 = this.a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editQuickReplyShortcut, new u5(7));
        l();
        hs.f(i10).k(hs.F1, new Object[0]);
    }

    public final void l() {
        qr a02 = qr.a0(this.a);
        a02.a.c(new ii.e(28, this, a02));
    }
}
