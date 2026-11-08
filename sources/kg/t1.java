package kg;

import android.text.TextUtils;
import bi.w2;
import di.u5;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class t1 {
    public static volatile t1[] g = new t1[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public t1(int i7) {
        this.a = i7;
    }

    public static t1 f(int i7) {
        t1 t1Var;
        t1 t1Var2 = g[i7];
        if (t1Var2 != null) {
            return t1Var2;
        }
        synchronized (h[i7]) {
            try {
                t1Var = g[i7];
                if (t1Var == null) {
                    t1[] t1VarArr = g;
                    t1 t1Var3 = new t1(i7);
                    t1VarArr[i7] = t1Var3;
                    t1Var = t1Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t1Var;
    }

    public static boolean g(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void a(String str) {
        s1 s1Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                s1Var = null;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            s1Var = (s1) obj;
            if (TextUtils.equals(str, s1Var.b)) {
                break;
            }
        }
        if (s1Var != null) {
            arrayList.remove(s1Var);
            qs.f(this.a).k(qs.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final s1 c(long j3) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s1 s1Var = (s1) obj;
            if (s1Var.a == j3) {
                return s1Var;
            }
        }
        return null;
    }

    public final s1 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s1 s1Var = (s1) obj;
            if (TextUtils.equals(str, s1Var.b)) {
                return s1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i7 >= arrayList2.size()) {
                return arrayList;
            }
            if (!g(((s1) arrayList2.get(i7)).b)) {
                arrayList.add((s1) arrayList2.get(i7));
            }
            i7++;
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
    public final void i(Runnable runnable, boolean z9) {
        String substring;
        long j3;
        long j10;
        int i7;
        long j11;
        long j12;
        long j13;
        TLRPC.Message message;
        if (this.e || this.f) {
            return;
        }
        int i10 = 1;
        this.e = true;
        int i11 = this.a;
        if (z9) {
            yr a02 = yr.a0(i11);
            a02.a.c(new w2(this, a02, p10.i(i11).e(), runnable, 13));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        long j14 = 0;
        tL_messages_getQuickReplies.hash = 0L;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.b;
            if (i13 >= arrayList.size()) {
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getQuickReplies, new bi.j0(this, 19));
                return;
            }
            s1 s1Var = (s1) arrayList.get(i13);
            long p10 = ui.p(tL_messages_getQuickReplies.hash, s1Var.a);
            tL_messages_getQuickReplies.hash = p10;
            String str = s1Var.b;
            if (str == null) {
                j3 = j14;
            } else {
                substring = Utilities.a(str).substring(i12, 16);
                int length = substring.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                long j15 = 16;
                if (j15 >= j14) {
                    long j16 = (Long.MAX_VALUE / j15) << i10;
                    j3 = j14;
                    j10 = j16 + ((((-1) - (j16 * j15)) ^ Long.MIN_VALUE) >= (j15 ^ Long.MIN_VALUE) ? i10 : i12);
                } else if (Long.MAX_VALUE < (j15 ^ Long.MIN_VALUE)) {
                    j3 = j14;
                    j10 = j3;
                } else {
                    j10 = 1;
                    j3 = j14;
                }
                int i14 = (substring.charAt(i12) != '+' || length <= i10) ? i12 : i10;
                long j17 = j3;
                while (i14 < length) {
                    int digit = Character.digit(substring.charAt(i14), 16);
                    int i15 = i10;
                    if (digit == -1) {
                        throw new NumberFormatException(substring.toString());
                    }
                    if (j17 < j3 || j17 > j10) {
                        break loop0;
                    }
                    if (j17 == j10) {
                        if (j15 >= j14) {
                            long j18 = (-1) - (((Long.MAX_VALUE / j15) << i15) * j15);
                            j11 = j18 - ((j18 ^ Long.MIN_VALUE) >= (j15 ^ Long.MIN_VALUE) ? j15 : j3);
                        } else if (Long.MAX_VALUE < (j15 ^ Long.MIN_VALUE)) {
                            i7 = i13;
                            j12 = -1;
                            if (digit <= ((int) j12)) {
                                break loop0;
                            }
                        } else {
                            j11 = (-1) - j15;
                        }
                        i7 = i13;
                        j12 = j11;
                        if (digit <= ((int) j12)) {
                        }
                    } else {
                        i7 = i13;
                    }
                    j17 = (j17 * j15) + digit;
                    i14++;
                    i10 = i15;
                    i13 = i7;
                }
                j14 = j17;
            }
            int i16 = i10;
            int i17 = i13;
            long p11 = ui.p(p10, j14);
            tL_messages_getQuickReplies.hash = p11;
            long p12 = ui.p(p11, s1Var.e == null ? j3 : r6.f1());
            tL_messages_getQuickReplies.hash = p12;
            ij ijVar = s1Var.e;
            if (ijVar == null || (message = ijVar.k) == null || (message.flags & 32768) == 0) {
                j13 = j3;
                tL_messages_getQuickReplies.hash = ui.p(p12, j13);
            } else {
                tL_messages_getQuickReplies.hash = ui.p(p12, message.edit_date);
                j13 = j3;
            }
            i13 = i17 + 1;
            j14 = j13;
            i10 = i16;
            i12 = 0;
        }
        throw new NumberFormatException("Too large for unsigned long: ".concat(substring.toString()));
    }

    public final boolean j(final TLRPC.Update update, String str, int i7) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new ai.a1(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i7));
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final int i10 = 3;
            b(new Runnable(this) { // from class: kg.r1
                public final /* synthetic */ t1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s1 s1Var;
                    switch (i10) {
                        case 0:
                            t1 t1Var = this.b;
                            ArrayList arrayList = t1Var.b;
                            int i11 = t1Var.a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            s1 c10 = t1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply.shortcut;
                                c10.f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                ij ijVar = c10.e;
                                if (ijVar != null && ijVar.f1() != tL_quickReply.top_message) {
                                    c10.e = null;
                                    long e10 = p10.i(i11).e();
                                    yr a02 = yr.a0(i11);
                                    a02.a.c(new w2(t1Var, a02, c10, e10, 14));
                                    break;
                                }
                            } else {
                                s1 s1Var2 = new s1();
                                s1Var2.a = tL_quickReply.shortcut_id;
                                s1Var2.b = tL_quickReply.shortcut;
                                s1Var2.f = tL_quickReply.count;
                                s1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((s1) arrayList.get(i12)).c = i12;
                                }
                                arrayList.add(s1Var2);
                                t1Var.a(s1Var2.b);
                            }
                            t1Var.l();
                            qs.f(i11).k(qs.F1, new Object[0]);
                            break;
                        case 1:
                            t1 t1Var2 = this.b;
                            int i13 = t1Var2.a;
                            s1 c11 = t1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                t1Var2.b.remove(c11);
                                t1Var2.a(c11.b);
                                int i14 = c11.a;
                                yr a03 = yr.a0(i13);
                                a03.a.c(new bg.m0(a03, i14, 12));
                                t1Var2.l();
                                qs.f(i13).k(qs.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 2:
                            t1 t1Var3 = this.b;
                            int i15 = t1Var3.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            s1 c12 = t1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    t1Var3.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                ij ijVar2 = c12.e;
                                if (!arrayList2.contains(Integer.valueOf(ijVar2 != null ? ijVar2.f1() : c12.d)) && c12.e != null) {
                                    t1Var3.l();
                                    qs.f(i15).k(qs.F1, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long e11 = p10.i(i15).e();
                                    yr a04 = yr.a0(i15);
                                    a04.a.c(new w2(t1Var3, a04, c12, e11, 14));
                                    break;
                                }
                            }
                            break;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            t1 t1Var4 = this.b;
                            ArrayList arrayList4 = t1Var4.b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList5.size()) {
                                        s1Var = null;
                                    } else if (((s1) arrayList5.get(i17)).a == tL_quickReply2.shortcut_id) {
                                        s1Var = (s1) arrayList5.get(i17);
                                    } else {
                                        i17++;
                                    }
                                }
                                if (s1Var == null) {
                                    s1Var = new s1();
                                }
                                s1Var.a = tL_quickReply2.shortcut_id;
                                s1Var.b = tL_quickReply2.shortcut;
                                s1Var.f = tL_quickReply2.count;
                                s1Var.c = i16;
                                s1Var.d = tL_quickReply2.top_message;
                                ij ijVar3 = s1Var.e;
                                if (ijVar3 != null && ijVar3.f1() != tL_quickReply2.top_message) {
                                    s1Var.e = null;
                                }
                                arrayList4.add(s1Var);
                                t1Var4.a(s1Var.b);
                            }
                            t1Var4.l();
                            qs.f(t1Var4.a).k(qs.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            final int i11 = 0;
            b(new Runnable(this) { // from class: kg.r1
                public final /* synthetic */ t1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s1 s1Var;
                    switch (i11) {
                        case 0:
                            t1 t1Var = this.b;
                            ArrayList arrayList = t1Var.b;
                            int i112 = t1Var.a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            s1 c10 = t1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply.shortcut;
                                c10.f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                ij ijVar = c10.e;
                                if (ijVar != null && ijVar.f1() != tL_quickReply.top_message) {
                                    c10.e = null;
                                    long e10 = p10.i(i112).e();
                                    yr a02 = yr.a0(i112);
                                    a02.a.c(new w2(t1Var, a02, c10, e10, 14));
                                    break;
                                }
                            } else {
                                s1 s1Var2 = new s1();
                                s1Var2.a = tL_quickReply.shortcut_id;
                                s1Var2.b = tL_quickReply.shortcut;
                                s1Var2.f = tL_quickReply.count;
                                s1Var2.d = tL_quickReply.top_message;
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    ((s1) arrayList.get(i12)).c = i12;
                                }
                                arrayList.add(s1Var2);
                                t1Var.a(s1Var2.b);
                            }
                            t1Var.l();
                            qs.f(i112).k(qs.F1, new Object[0]);
                            break;
                        case 1:
                            t1 t1Var2 = this.b;
                            int i13 = t1Var2.a;
                            s1 c11 = t1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                t1Var2.b.remove(c11);
                                t1Var2.a(c11.b);
                                int i14 = c11.a;
                                yr a03 = yr.a0(i13);
                                a03.a.c(new bg.m0(a03, i14, 12));
                                t1Var2.l();
                                qs.f(i13).k(qs.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 2:
                            t1 t1Var3 = this.b;
                            int i15 = t1Var3.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            s1 c12 = t1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    t1Var3.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                ij ijVar2 = c12.e;
                                if (!arrayList2.contains(Integer.valueOf(ijVar2 != null ? ijVar2.f1() : c12.d)) && c12.e != null) {
                                    t1Var3.l();
                                    qs.f(i15).k(qs.F1, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long e11 = p10.i(i15).e();
                                    yr a04 = yr.a0(i15);
                                    a04.a.c(new w2(t1Var3, a04, c12, e11, 14));
                                    break;
                                }
                            }
                            break;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            t1 t1Var4 = this.b;
                            ArrayList arrayList4 = t1Var4.b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList5.size()) {
                                        s1Var = null;
                                    } else if (((s1) arrayList5.get(i17)).a == tL_quickReply2.shortcut_id) {
                                        s1Var = (s1) arrayList5.get(i17);
                                    } else {
                                        i17++;
                                    }
                                }
                                if (s1Var == null) {
                                    s1Var = new s1();
                                }
                                s1Var.a = tL_quickReply2.shortcut_id;
                                s1Var.b = tL_quickReply2.shortcut;
                                s1Var.f = tL_quickReply2.count;
                                s1Var.c = i16;
                                s1Var.d = tL_quickReply2.top_message;
                                ij ijVar3 = s1Var.e;
                                if (ijVar3 != null && ijVar3.f1() != tL_quickReply2.top_message) {
                                    s1Var.e = null;
                                }
                                arrayList4.add(s1Var);
                                t1Var4.a(s1Var.b);
                            }
                            t1Var4.l();
                            qs.f(t1Var4.a).k(qs.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            final int i12 = 1;
            b(new Runnable(this) { // from class: kg.r1
                public final /* synthetic */ t1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    s1 s1Var;
                    switch (i12) {
                        case 0:
                            t1 t1Var = this.b;
                            ArrayList arrayList = t1Var.b;
                            int i112 = t1Var.a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            s1 c10 = t1Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply.shortcut;
                                c10.f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                ij ijVar = c10.e;
                                if (ijVar != null && ijVar.f1() != tL_quickReply.top_message) {
                                    c10.e = null;
                                    long e10 = p10.i(i112).e();
                                    yr a02 = yr.a0(i112);
                                    a02.a.c(new w2(t1Var, a02, c10, e10, 14));
                                    break;
                                }
                            } else {
                                s1 s1Var2 = new s1();
                                s1Var2.a = tL_quickReply.shortcut_id;
                                s1Var2.b = tL_quickReply.shortcut;
                                s1Var2.f = tL_quickReply.count;
                                s1Var2.d = tL_quickReply.top_message;
                                for (int i122 = 0; i122 < arrayList.size(); i122++) {
                                    ((s1) arrayList.get(i122)).c = i122;
                                }
                                arrayList.add(s1Var2);
                                t1Var.a(s1Var2.b);
                            }
                            t1Var.l();
                            qs.f(i112).k(qs.F1, new Object[0]);
                            break;
                        case 1:
                            t1 t1Var2 = this.b;
                            int i13 = t1Var2.a;
                            s1 c11 = t1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                t1Var2.b.remove(c11);
                                t1Var2.a(c11.b);
                                int i14 = c11.a;
                                yr a03 = yr.a0(i13);
                                a03.a.c(new bg.m0(a03, i14, 12));
                                t1Var2.l();
                                qs.f(i13).k(qs.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 2:
                            t1 t1Var3 = this.b;
                            int i15 = t1Var3.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            s1 c12 = t1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    t1Var3.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                ij ijVar2 = c12.e;
                                if (!arrayList2.contains(Integer.valueOf(ijVar2 != null ? ijVar2.f1() : c12.d)) && c12.e != null) {
                                    t1Var3.l();
                                    qs.f(i15).k(qs.F1, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long e11 = p10.i(i15).e();
                                    yr a04 = yr.a0(i15);
                                    a04.a.c(new w2(t1Var3, a04, c12, e11, 14));
                                    break;
                                }
                            }
                            break;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            t1 t1Var4 = this.b;
                            ArrayList arrayList4 = t1Var4.b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList5.size()) {
                                        s1Var = null;
                                    } else if (((s1) arrayList5.get(i17)).a == tL_quickReply2.shortcut_id) {
                                        s1Var = (s1) arrayList5.get(i17);
                                    } else {
                                        i17++;
                                    }
                                }
                                if (s1Var == null) {
                                    s1Var = new s1();
                                }
                                s1Var.a = tL_quickReply2.shortcut_id;
                                s1Var.b = tL_quickReply2.shortcut;
                                s1Var.f = tL_quickReply2.count;
                                s1Var.c = i16;
                                s1Var.d = tL_quickReply2.top_message;
                                ij ijVar3 = s1Var.e;
                                if (ijVar3 != null && ijVar3.f1() != tL_quickReply2.top_message) {
                                    s1Var.e = null;
                                }
                                arrayList4.add(s1Var);
                                t1Var4.a(s1Var.b);
                            }
                            t1Var4.l();
                            qs.f(t1Var4.a).k(qs.F1, new Object[0]);
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
        b(new Runnable(this) { // from class: kg.r1
            public final /* synthetic */ t1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                s1 s1Var;
                switch (i13) {
                    case 0:
                        t1 t1Var = this.b;
                        ArrayList arrayList = t1Var.b;
                        int i112 = t1Var.a;
                        TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                        s1 c10 = t1Var.c(tL_quickReply.shortcut_id);
                        if (c10 != null) {
                            c10.b = tL_quickReply.shortcut;
                            c10.f = tL_quickReply.count;
                            c10.d = tL_quickReply.top_message;
                            ij ijVar = c10.e;
                            if (ijVar != null && ijVar.f1() != tL_quickReply.top_message) {
                                c10.e = null;
                                long e10 = p10.i(i112).e();
                                yr a02 = yr.a0(i112);
                                a02.a.c(new w2(t1Var, a02, c10, e10, 14));
                                break;
                            }
                        } else {
                            s1 s1Var2 = new s1();
                            s1Var2.a = tL_quickReply.shortcut_id;
                            s1Var2.b = tL_quickReply.shortcut;
                            s1Var2.f = tL_quickReply.count;
                            s1Var2.d = tL_quickReply.top_message;
                            for (int i122 = 0; i122 < arrayList.size(); i122++) {
                                ((s1) arrayList.get(i122)).c = i122;
                            }
                            arrayList.add(s1Var2);
                            t1Var.a(s1Var2.b);
                        }
                        t1Var.l();
                        qs.f(i112).k(qs.F1, new Object[0]);
                        break;
                    case 1:
                        t1 t1Var2 = this.b;
                        int i132 = t1Var2.a;
                        s1 c11 = t1Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                        if (c11 != null) {
                            t1Var2.b.remove(c11);
                            t1Var2.a(c11.b);
                            int i14 = c11.a;
                            yr a03 = yr.a0(i132);
                            a03.a.c(new bg.m0(a03, i14, 12));
                            t1Var2.l();
                            qs.f(i132).k(qs.F1, new Object[0]);
                            break;
                        }
                        break;
                    case 2:
                        t1 t1Var3 = this.b;
                        int i15 = t1Var3.a;
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                        s1 c12 = t1Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (c12 != null) {
                            int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                            c12.f = size;
                            if (size <= 0) {
                                t1Var3.b.remove(c12);
                            }
                            ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                            ij ijVar2 = c12.e;
                            if (!arrayList2.contains(Integer.valueOf(ijVar2 != null ? ijVar2.f1() : c12.d)) && c12.e != null) {
                                t1Var3.l();
                                qs.f(i15).k(qs.F1, new Object[0]);
                                break;
                            } else {
                                c12.e = null;
                                long e11 = p10.i(i15).e();
                                yr a04 = yr.a0(i15);
                                a04.a.c(new w2(t1Var3, a04, c12, e11, 14));
                                break;
                            }
                        }
                        break;
                    default:
                        ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                        t1 t1Var4 = this.b;
                        ArrayList arrayList4 = t1Var4.b;
                        ArrayList arrayList5 = new ArrayList(arrayList4);
                        arrayList4.clear();
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i16);
                            int i17 = 0;
                            while (true) {
                                if (i17 >= arrayList5.size()) {
                                    s1Var = null;
                                } else if (((s1) arrayList5.get(i17)).a == tL_quickReply2.shortcut_id) {
                                    s1Var = (s1) arrayList5.get(i17);
                                } else {
                                    i17++;
                                }
                            }
                            if (s1Var == null) {
                                s1Var = new s1();
                            }
                            s1Var.a = tL_quickReply2.shortcut_id;
                            s1Var.b = tL_quickReply2.shortcut;
                            s1Var.f = tL_quickReply2.count;
                            s1Var.c = i16;
                            s1Var.d = tL_quickReply2.top_message;
                            ij ijVar3 = s1Var.e;
                            if (ijVar3 != null && ijVar3.f1() != tL_quickReply2.top_message) {
                                s1Var.e = null;
                            }
                            arrayList4.add(s1Var);
                            t1Var4.a(s1Var.b);
                        }
                        t1Var4.l();
                        qs.f(t1Var4.a).k(qs.F1, new Object[0]);
                        break;
                }
            }
        });
        return true;
    }

    public final void k(int i7, String str) {
        s1 c10 = c(i7);
        if (c10 == null) {
            return;
        }
        c10.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i7;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i10 = this.a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editQuickReplyShortcut, new u5(7));
        l();
        qs.f(i10).k(qs.F1, new Object[0]);
    }

    public final void l() {
        yr a02 = yr.a0(this.a);
        a02.a.c(new ha.b(22, this, a02));
    }
}
