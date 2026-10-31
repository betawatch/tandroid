package ag;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i3 {
    public static volatile i3[] g = new i3[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public i3(int i10) {
        this.a = i10;
    }

    public static i3 f(int i10) {
        i3 i3Var;
        i3 i3Var2 = g[i10];
        if (i3Var2 != null) {
            return i3Var2;
        }
        synchronized (h[i10]) {
            try {
                i3Var = g[i10];
                if (i3Var == null) {
                    i3[] i3VarArr = g;
                    i3 i3Var3 = new i3(i10);
                    i3VarArr[i10] = i3Var3;
                    i3Var = i3Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i3Var;
    }

    public static boolean g(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void a(String str) {
        h3 h3Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                h3Var = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            h3Var = (h3) obj;
            if (TextUtils.equals(str, h3Var.b)) {
                break;
            }
        }
        if (h3Var != null) {
            arrayList.remove(h3Var);
            zs.f(this.a).k(zs.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final h3 c(long j10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h3 h3Var = (h3) obj;
            if (h3Var.a == j10) {
                return h3Var;
            }
        }
        return null;
    }

    public final h3 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h3 h3Var = (h3) obj;
            if (TextUtils.equals(str, h3Var.b)) {
                return h3Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            if (!g(((h3) arrayList2.get(i10)).b)) {
                arrayList.add((h3) arrayList2.get(i10));
            }
            i10++;
        }
    }

    public final void h() {
        i(null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010c A[EDGE_INSN: B:58:0x010c->B:59:0x010c BREAK  A[LOOP:0: B:11:0x003a->B:28:0x0166, LOOP_LABEL: LOOP:0: B:11:0x003a->B:28:0x0166], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Runnable runnable, boolean z10) {
        String substring;
        long j10;
        long j11;
        int i10;
        long j12;
        long j13;
        long j14;
        TLRPC.Message message;
        if (this.e || this.f) {
            return;
        }
        int i11 = 1;
        this.e = true;
        int i12 = this.a;
        if (z10) {
            hs a02 = hs.a0(i12);
            a02.a.c(new a3(this, a02, d20.i(i12).e(), runnable, 0));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        long j15 = 0;
        tL_messages_getQuickReplies.hash = 0L;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.b;
            if (i14 >= arrayList.size()) {
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getQuickReplies, new c(this, 5));
                return;
            }
            h3 h3Var = (h3) arrayList.get(i14);
            long p5 = ui.p(tL_messages_getQuickReplies.hash, h3Var.a);
            tL_messages_getQuickReplies.hash = p5;
            String str = h3Var.b;
            if (str == null) {
                j10 = j15;
            } else {
                substring = Utilities.a(str).substring(i13, 16);
                int length = substring.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                long j16 = 16;
                if (j16 >= j15) {
                    long j17 = (Long.MAX_VALUE / j16) << i11;
                    j10 = j15;
                    j11 = j17 + ((((-1) - (j17 * j16)) ^ Long.MIN_VALUE) >= (j16 ^ Long.MIN_VALUE) ? i11 : i13);
                } else if (Long.MAX_VALUE < (j16 ^ Long.MIN_VALUE)) {
                    j10 = j15;
                    j11 = j10;
                } else {
                    j11 = 1;
                    j10 = j15;
                }
                int i15 = (substring.charAt(i13) != '+' || length <= i11) ? i13 : i11;
                long j18 = j10;
                while (i15 < length) {
                    int digit = Character.digit(substring.charAt(i15), 16);
                    int i16 = i11;
                    if (digit == -1) {
                        throw new NumberFormatException(substring.toString());
                    }
                    if (j18 < j10 || j18 > j11) {
                        break loop0;
                    }
                    if (j18 == j11) {
                        if (j16 >= j15) {
                            long j19 = (-1) - (((Long.MAX_VALUE / j16) << i16) * j16);
                            j12 = j19 - ((j19 ^ Long.MIN_VALUE) >= (j16 ^ Long.MIN_VALUE) ? j16 : j10);
                        } else if (Long.MAX_VALUE < (j16 ^ Long.MIN_VALUE)) {
                            i10 = i14;
                            j13 = -1;
                            if (digit <= ((int) j13)) {
                                break loop0;
                            }
                        } else {
                            j12 = (-1) - j16;
                        }
                        i10 = i14;
                        j13 = j12;
                        if (digit <= ((int) j13)) {
                        }
                    } else {
                        i10 = i14;
                    }
                    j18 = (j18 * j16) + digit;
                    i15++;
                    i11 = i16;
                    i14 = i10;
                }
                j15 = j18;
            }
            int i17 = i11;
            int i18 = i14;
            long p9 = ui.p(p5, j15);
            tL_messages_getQuickReplies.hash = p9;
            long p10 = ui.p(p9, h3Var.e == null ? j10 : r6.f1());
            tL_messages_getQuickReplies.hash = p10;
            jj jjVar = h3Var.e;
            if (jjVar == null || (message = jjVar.k) == null || (message.flags & 32768) == 0) {
                j14 = j10;
                tL_messages_getQuickReplies.hash = ui.p(p10, j14);
            } else {
                tL_messages_getQuickReplies.hash = ui.p(p10, message.edit_date);
                j14 = j10;
            }
            i14 = i18 + 1;
            j15 = j14;
            i11 = i17;
            i13 = 0;
        }
        throw new NumberFormatException("Too large for unsigned long: ".concat(substring.toString()));
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new g3(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 0));
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final int i11 = 3;
            b(new Runnable(this) { // from class: ag.b3
                public final /* synthetic */ i3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h3 h3Var;
                    switch (i11) {
                        case 0:
                            i3 i3Var = this.b;
                            ArrayList arrayList = i3Var.b;
                            int i12 = i3Var.a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            h3 c10 = i3Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply.shortcut;
                                c10.f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                jj jjVar = c10.e;
                                if (jjVar != null && jjVar.f1() != tL_quickReply.top_message) {
                                    c10.e = null;
                                    long e = d20.i(i12).e();
                                    hs a02 = hs.a0(i12);
                                    a02.a.c(new a3(i3Var, a02, c10, e, 1));
                                    break;
                                }
                            } else {
                                h3 h3Var2 = new h3();
                                h3Var2.a = tL_quickReply.shortcut_id;
                                h3Var2.b = tL_quickReply.shortcut;
                                h3Var2.f = tL_quickReply.count;
                                h3Var2.d = tL_quickReply.top_message;
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    ((h3) arrayList.get(i13)).c = i13;
                                }
                                arrayList.add(h3Var2);
                                i3Var.a(h3Var2.b);
                            }
                            i3Var.l();
                            zs.f(i12).k(zs.F1, new Object[0]);
                            break;
                        case 1:
                            i3 i3Var2 = this.b;
                            int i14 = i3Var2.a;
                            h3 c11 = i3Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                i3Var2.b.remove(c11);
                                i3Var2.a(c11.b);
                                int i15 = c11.a;
                                hs a03 = hs.a0(i14);
                                a03.a.c(new d3(a03, i15, 0));
                                i3Var2.l();
                                zs.f(i14).k(zs.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 2:
                            i3 i3Var3 = this.b;
                            int i16 = i3Var3.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            h3 c12 = i3Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    i3Var3.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                jj jjVar2 = c12.e;
                                if (!arrayList2.contains(Integer.valueOf(jjVar2 != null ? jjVar2.f1() : c12.d)) && c12.e != null) {
                                    i3Var3.l();
                                    zs.f(i16).k(zs.F1, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long e7 = d20.i(i16).e();
                                    hs a04 = hs.a0(i16);
                                    a04.a.c(new a3(i3Var3, a04, c12, e7, 1));
                                    break;
                                }
                            }
                            break;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            i3 i3Var4 = this.b;
                            ArrayList arrayList4 = i3Var4.b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i17);
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList5.size()) {
                                        h3Var = null;
                                    } else if (((h3) arrayList5.get(i18)).a == tL_quickReply2.shortcut_id) {
                                        h3Var = (h3) arrayList5.get(i18);
                                    } else {
                                        i18++;
                                    }
                                }
                                if (h3Var == null) {
                                    h3Var = new h3();
                                }
                                h3Var.a = tL_quickReply2.shortcut_id;
                                h3Var.b = tL_quickReply2.shortcut;
                                h3Var.f = tL_quickReply2.count;
                                h3Var.c = i17;
                                h3Var.d = tL_quickReply2.top_message;
                                jj jjVar3 = h3Var.e;
                                if (jjVar3 != null && jjVar3.f1() != tL_quickReply2.top_message) {
                                    h3Var.e = null;
                                }
                                arrayList4.add(h3Var);
                                i3Var4.a(h3Var.b);
                            }
                            i3Var4.l();
                            zs.f(i3Var4.a).k(zs.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            final int i12 = 0;
            b(new Runnable(this) { // from class: ag.b3
                public final /* synthetic */ i3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h3 h3Var;
                    switch (i12) {
                        case 0:
                            i3 i3Var = this.b;
                            ArrayList arrayList = i3Var.b;
                            int i122 = i3Var.a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            h3 c10 = i3Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply.shortcut;
                                c10.f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                jj jjVar = c10.e;
                                if (jjVar != null && jjVar.f1() != tL_quickReply.top_message) {
                                    c10.e = null;
                                    long e = d20.i(i122).e();
                                    hs a02 = hs.a0(i122);
                                    a02.a.c(new a3(i3Var, a02, c10, e, 1));
                                    break;
                                }
                            } else {
                                h3 h3Var2 = new h3();
                                h3Var2.a = tL_quickReply.shortcut_id;
                                h3Var2.b = tL_quickReply.shortcut;
                                h3Var2.f = tL_quickReply.count;
                                h3Var2.d = tL_quickReply.top_message;
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    ((h3) arrayList.get(i13)).c = i13;
                                }
                                arrayList.add(h3Var2);
                                i3Var.a(h3Var2.b);
                            }
                            i3Var.l();
                            zs.f(i122).k(zs.F1, new Object[0]);
                            break;
                        case 1:
                            i3 i3Var2 = this.b;
                            int i14 = i3Var2.a;
                            h3 c11 = i3Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                i3Var2.b.remove(c11);
                                i3Var2.a(c11.b);
                                int i15 = c11.a;
                                hs a03 = hs.a0(i14);
                                a03.a.c(new d3(a03, i15, 0));
                                i3Var2.l();
                                zs.f(i14).k(zs.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 2:
                            i3 i3Var3 = this.b;
                            int i16 = i3Var3.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            h3 c12 = i3Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    i3Var3.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                jj jjVar2 = c12.e;
                                if (!arrayList2.contains(Integer.valueOf(jjVar2 != null ? jjVar2.f1() : c12.d)) && c12.e != null) {
                                    i3Var3.l();
                                    zs.f(i16).k(zs.F1, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long e7 = d20.i(i16).e();
                                    hs a04 = hs.a0(i16);
                                    a04.a.c(new a3(i3Var3, a04, c12, e7, 1));
                                    break;
                                }
                            }
                            break;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            i3 i3Var4 = this.b;
                            ArrayList arrayList4 = i3Var4.b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i17);
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList5.size()) {
                                        h3Var = null;
                                    } else if (((h3) arrayList5.get(i18)).a == tL_quickReply2.shortcut_id) {
                                        h3Var = (h3) arrayList5.get(i18);
                                    } else {
                                        i18++;
                                    }
                                }
                                if (h3Var == null) {
                                    h3Var = new h3();
                                }
                                h3Var.a = tL_quickReply2.shortcut_id;
                                h3Var.b = tL_quickReply2.shortcut;
                                h3Var.f = tL_quickReply2.count;
                                h3Var.c = i17;
                                h3Var.d = tL_quickReply2.top_message;
                                jj jjVar3 = h3Var.e;
                                if (jjVar3 != null && jjVar3.f1() != tL_quickReply2.top_message) {
                                    h3Var.e = null;
                                }
                                arrayList4.add(h3Var);
                                i3Var4.a(h3Var.b);
                            }
                            i3Var4.l();
                            zs.f(i3Var4.a).k(zs.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            final int i13 = 1;
            b(new Runnable(this) { // from class: ag.b3
                public final /* synthetic */ i3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h3 h3Var;
                    switch (i13) {
                        case 0:
                            i3 i3Var = this.b;
                            ArrayList arrayList = i3Var.b;
                            int i122 = i3Var.a;
                            TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            h3 c10 = i3Var.c(tL_quickReply.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply.shortcut;
                                c10.f = tL_quickReply.count;
                                c10.d = tL_quickReply.top_message;
                                jj jjVar = c10.e;
                                if (jjVar != null && jjVar.f1() != tL_quickReply.top_message) {
                                    c10.e = null;
                                    long e = d20.i(i122).e();
                                    hs a02 = hs.a0(i122);
                                    a02.a.c(new a3(i3Var, a02, c10, e, 1));
                                    break;
                                }
                            } else {
                                h3 h3Var2 = new h3();
                                h3Var2.a = tL_quickReply.shortcut_id;
                                h3Var2.b = tL_quickReply.shortcut;
                                h3Var2.f = tL_quickReply.count;
                                h3Var2.d = tL_quickReply.top_message;
                                for (int i132 = 0; i132 < arrayList.size(); i132++) {
                                    ((h3) arrayList.get(i132)).c = i132;
                                }
                                arrayList.add(h3Var2);
                                i3Var.a(h3Var2.b);
                            }
                            i3Var.l();
                            zs.f(i122).k(zs.F1, new Object[0]);
                            break;
                        case 1:
                            i3 i3Var2 = this.b;
                            int i14 = i3Var2.a;
                            h3 c11 = i3Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                i3Var2.b.remove(c11);
                                i3Var2.a(c11.b);
                                int i15 = c11.a;
                                hs a03 = hs.a0(i14);
                                a03.a.c(new d3(a03, i15, 0));
                                i3Var2.l();
                                zs.f(i14).k(zs.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 2:
                            i3 i3Var3 = this.b;
                            int i16 = i3Var3.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            h3 c12 = i3Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    i3Var3.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                                jj jjVar2 = c12.e;
                                if (!arrayList2.contains(Integer.valueOf(jjVar2 != null ? jjVar2.f1() : c12.d)) && c12.e != null) {
                                    i3Var3.l();
                                    zs.f(i16).k(zs.F1, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long e7 = d20.i(i16).e();
                                    hs a04 = hs.a0(i16);
                                    a04.a.c(new a3(i3Var3, a04, c12, e7, 1));
                                    break;
                                }
                            }
                            break;
                        default:
                            ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            i3 i3Var4 = this.b;
                            ArrayList arrayList4 = i3Var4.b;
                            ArrayList arrayList5 = new ArrayList(arrayList4);
                            arrayList4.clear();
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i17);
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList5.size()) {
                                        h3Var = null;
                                    } else if (((h3) arrayList5.get(i18)).a == tL_quickReply2.shortcut_id) {
                                        h3Var = (h3) arrayList5.get(i18);
                                    } else {
                                        i18++;
                                    }
                                }
                                if (h3Var == null) {
                                    h3Var = new h3();
                                }
                                h3Var.a = tL_quickReply2.shortcut_id;
                                h3Var.b = tL_quickReply2.shortcut;
                                h3Var.f = tL_quickReply2.count;
                                h3Var.c = i17;
                                h3Var.d = tL_quickReply2.top_message;
                                jj jjVar3 = h3Var.e;
                                if (jjVar3 != null && jjVar3.f1() != tL_quickReply2.top_message) {
                                    h3Var.e = null;
                                }
                                arrayList4.add(h3Var);
                                i3Var4.a(h3Var.b);
                            }
                            i3Var4.l();
                            zs.f(i3Var4.a).k(zs.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        final int i14 = 2;
        b(new Runnable(this) { // from class: ag.b3
            public final /* synthetic */ i3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h3 h3Var;
                switch (i14) {
                    case 0:
                        i3 i3Var = this.b;
                        ArrayList arrayList = i3Var.b;
                        int i122 = i3Var.a;
                        TLRPC.TL_quickReply tL_quickReply = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                        h3 c10 = i3Var.c(tL_quickReply.shortcut_id);
                        if (c10 != null) {
                            c10.b = tL_quickReply.shortcut;
                            c10.f = tL_quickReply.count;
                            c10.d = tL_quickReply.top_message;
                            jj jjVar = c10.e;
                            if (jjVar != null && jjVar.f1() != tL_quickReply.top_message) {
                                c10.e = null;
                                long e = d20.i(i122).e();
                                hs a02 = hs.a0(i122);
                                a02.a.c(new a3(i3Var, a02, c10, e, 1));
                                break;
                            }
                        } else {
                            h3 h3Var2 = new h3();
                            h3Var2.a = tL_quickReply.shortcut_id;
                            h3Var2.b = tL_quickReply.shortcut;
                            h3Var2.f = tL_quickReply.count;
                            h3Var2.d = tL_quickReply.top_message;
                            for (int i132 = 0; i132 < arrayList.size(); i132++) {
                                ((h3) arrayList.get(i132)).c = i132;
                            }
                            arrayList.add(h3Var2);
                            i3Var.a(h3Var2.b);
                        }
                        i3Var.l();
                        zs.f(i122).k(zs.F1, new Object[0]);
                        break;
                    case 1:
                        i3 i3Var2 = this.b;
                        int i142 = i3Var2.a;
                        h3 c11 = i3Var2.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                        if (c11 != null) {
                            i3Var2.b.remove(c11);
                            i3Var2.a(c11.b);
                            int i15 = c11.a;
                            hs a03 = hs.a0(i142);
                            a03.a.c(new d3(a03, i15, 0));
                            i3Var2.l();
                            zs.f(i142).k(zs.F1, new Object[0]);
                            break;
                        }
                        break;
                    case 2:
                        i3 i3Var3 = this.b;
                        int i16 = i3Var3.a;
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                        h3 c12 = i3Var3.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (c12 != null) {
                            int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                            c12.f = size;
                            if (size <= 0) {
                                i3Var3.b.remove(c12);
                            }
                            ArrayList<Integer> arrayList2 = tL_updateDeleteQuickReplyMessages.messages;
                            jj jjVar2 = c12.e;
                            if (!arrayList2.contains(Integer.valueOf(jjVar2 != null ? jjVar2.f1() : c12.d)) && c12.e != null) {
                                i3Var3.l();
                                zs.f(i16).k(zs.F1, new Object[0]);
                                break;
                            } else {
                                c12.e = null;
                                long e7 = d20.i(i16).e();
                                hs a04 = hs.a0(i16);
                                a04.a.c(new a3(i3Var3, a04, c12, e7, 1));
                                break;
                            }
                        }
                        break;
                    default:
                        ArrayList<TLRPC.TL_quickReply> arrayList3 = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                        i3 i3Var4 = this.b;
                        ArrayList arrayList4 = i3Var4.b;
                        ArrayList arrayList5 = new ArrayList(arrayList4);
                        arrayList4.clear();
                        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                            TLRPC.TL_quickReply tL_quickReply2 = arrayList3.get(i17);
                            int i18 = 0;
                            while (true) {
                                if (i18 >= arrayList5.size()) {
                                    h3Var = null;
                                } else if (((h3) arrayList5.get(i18)).a == tL_quickReply2.shortcut_id) {
                                    h3Var = (h3) arrayList5.get(i18);
                                } else {
                                    i18++;
                                }
                            }
                            if (h3Var == null) {
                                h3Var = new h3();
                            }
                            h3Var.a = tL_quickReply2.shortcut_id;
                            h3Var.b = tL_quickReply2.shortcut;
                            h3Var.f = tL_quickReply2.count;
                            h3Var.c = i17;
                            h3Var.d = tL_quickReply2.top_message;
                            jj jjVar3 = h3Var.e;
                            if (jjVar3 != null && jjVar3.f1() != tL_quickReply2.top_message) {
                                h3Var.e = null;
                            }
                            arrayList4.add(h3Var);
                            i3Var4.a(h3Var.b);
                        }
                        i3Var4.l();
                        zs.f(i3Var4.a).k(zs.F1, new Object[0]);
                        break;
                }
            }
        });
        return true;
    }

    public final void k(int i10, String str) {
        h3 c10 = c(i10);
        if (c10 == null) {
            return;
        }
        c10.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new c3(2));
        l();
        zs.f(i11).k(zs.F1, new Object[0]);
    }

    public final void l() {
        hs a02 = hs.a0(this.a);
        a02.a.c(new a1.f(13, this, a02));
    }
}
