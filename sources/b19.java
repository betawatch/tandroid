// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class b19 {
    public static volatile b19[] g = new b19[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i = 0; i < 4; i++) {
            h[i] = new Object();
        }
    }

    public b19(int i) {
        this.a = i;
    }

    public static b19 f(int i) {
        b19 b19Var;
        b19 b19Var2 = g[i];
        if (b19Var2 != null) {
            return b19Var2;
        }
        synchronized (h[i]) {
            b19Var = g[i];
            if (b19Var == null) {
                b19[] b19VarArr = g;
                b19 b19Var3 = new b19(i);
                b19VarArr[i] = b19Var3;
                b19Var = b19Var3;
            }
        }
        return b19Var;
    }

    public static boolean g(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void a(String str) {
        a19 a19Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                a19Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            a19Var = (a19) obj;
            if (TextUtils.equals(str, a19Var.b)) {
                break;
            }
        }
        if (a19Var != null) {
            arrayList.remove(a19Var);
            jn7.f(this.a).k(jn7.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final a19 c(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a19 a19Var = (a19) obj;
            if (a19Var.a == j) {
                return a19Var;
            }
        }
        return null;
    }

    public final a19 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a19 a19Var = (a19) obj;
            if (TextUtils.equals(str, a19Var.b)) {
                return a19Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i >= arrayList2.size()) {
                return arrayList;
            }
            if (!g(((a19) arrayList2.get(i)).b)) {
                arrayList.add((a19) arrayList2.get(i));
            }
            i++;
        }
    }

    public final void h() {
        i(null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
    
        throw new java.lang.NumberFormatException("Too large for unsigned long: ".concat(r11.toString()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Runnable runnable, boolean z) {
        long j;
        TLRPC.Message message;
        if (this.e || this.f) {
            return;
        }
        int i = 1;
        this.e = true;
        int i2 = this.a;
        if (z) {
            jf7 Y = jf7.Y(i2);
            Y.a.c(new ba7((Object) this, (Object) Y, yac.h(i2).e(), (Object) runnable, (byte) 29));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        tL_messages_getQuickReplies.hash = 0L;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.b;
            if (i4 >= arrayList.size()) {
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_getQuickReplies, new w15(this, (byte) 23));
                return;
            }
            a19 a19Var = (a19) arrayList.get(i4);
            long r = ls6.r(tL_messages_getQuickReplies.hash, a19Var.a);
            tL_messages_getQuickReplies.hash = r;
            String str = a19Var.b;
            if (str == null) {
                j = 0;
            } else {
                int i5 = 16;
                String substring = Utilities.a(str).substring(i3, 16);
                int length = substring.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                int i6 = (substring.charAt(i3) != '+' || length <= i) ? i3 : i;
                long j2 = 0;
                while (i6 < length) {
                    int digit = Character.digit(substring.charAt(i6), i5);
                    if (digit == -1) {
                        throw new NumberFormatException(substring.toString());
                    }
                    if (j2 < 0 || j2 > 1152921504606846975L || (j2 == 1152921504606846975L && digit > 15)) {
                        break loop0;
                    }
                    j2 = (j2 << 4) + digit;
                    i6++;
                    length = length;
                    i5 = 16;
                }
                j = j2;
            }
            long r2 = ls6.r(r, j);
            tL_messages_getQuickReplies.hash = r2;
            long r3 = ls6.r(r2, a19Var.e == null ? 0L : r0.e1());
            tL_messages_getQuickReplies.hash = r3;
            r47 r47Var = a19Var.e;
            if (r47Var == null || (message = r47Var.k) == null || (message.flags & 32768) == 0) {
                tL_messages_getQuickReplies.hash = ls6.r(r3, 0L);
            } else {
                tL_messages_getQuickReplies.hash = ls6.r(r3, message.edit_date);
            }
            i4++;
            i = 1;
            i3 = 0;
        }
    }

    public final boolean j(final TLRPC.Update update, String str, int i) {
        final byte b = 1;
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new y36((Object) this, (Object) ((TL_update.TL_updateQuickReplyMessage) update).message, (Object) str, i, (byte) 24));
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final byte b2 = 2;
            b(new Runnable(this) { // from class: x09
                public final /* synthetic */ b19 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a19 a19Var;
                    byte b3 = b2;
                    b19 b19Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b3) {
                        case 0:
                            int i2 = b19Var.a;
                            a19 c = b19Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                b19Var.b.remove(c);
                                b19Var.a(c.b);
                                int i3 = c.a;
                                jf7 Y = jf7.Y(i2);
                                Y.a.c(new ad7(Y, i3, (byte) 5));
                                b19Var.l();
                                jn7.f(i2).k(jn7.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 1:
                            b19 b19Var2 = this.b;
                            int i4 = b19Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            a19 c2 = b19Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    b19Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                r47 r47Var = c2.e;
                                if (!arrayList.contains(Integer.valueOf(r47Var != null ? r47Var.e1() : c2.d)) && c2.e != null) {
                                    b19Var2.l();
                                    jn7.f(i4).k(jn7.F1, new Object[0]);
                                    break;
                                } else {
                                    c2.e = null;
                                    long e = yac.h(i4).e();
                                    jf7 Y2 = jf7.Y(i4);
                                    Y2.a.c(new y09(b19Var2, Y2, c2, e, (byte) 0));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = b19Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        a19Var = null;
                                    } else if (((a19) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                        a19Var = (a19) arrayList4.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                if (a19Var == null) {
                                    a19Var = new a19();
                                }
                                a19Var.a = tL_quickReply.shortcut_id;
                                a19Var.b = tL_quickReply.shortcut;
                                a19Var.f = tL_quickReply.count;
                                a19Var.c = i5;
                                a19Var.d = tL_quickReply.top_message;
                                r47 r47Var2 = a19Var.e;
                                if (r47Var2 != null && r47Var2.e1() != tL_quickReply.top_message) {
                                    a19Var.e = null;
                                }
                                arrayList3.add(a19Var);
                                b19Var.a(a19Var.b);
                            }
                            b19Var.l();
                            jn7.f(b19Var.a).k(jn7.F1, new Object[0]);
                            break;
                        default:
                            b19 b19Var3 = this.b;
                            ArrayList arrayList5 = b19Var3.b;
                            int i7 = b19Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            a19 c3 = b19Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                r47 r47Var3 = c3.e;
                                if (r47Var3 != null && r47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = yac.h(i7).e();
                                    jf7 Y3 = jf7.Y(i7);
                                    Y3.a.c(new y09(b19Var3, Y3, c3, e2, (byte) 0));
                                    break;
                                }
                            } else {
                                a19 a19Var2 = new a19();
                                a19Var2.a = tL_quickReply2.shortcut_id;
                                a19Var2.b = tL_quickReply2.shortcut;
                                a19Var2.f = tL_quickReply2.count;
                                a19Var2.d = tL_quickReply2.top_message;
                                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                    ((a19) arrayList5.get(i8)).c = i8;
                                }
                                arrayList5.add(a19Var2);
                                b19Var3.a(a19Var2.b);
                            }
                            b19Var3.l();
                            jn7.f(i7).k(jn7.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            final byte b3 = 3;
            b(new Runnable(this) { // from class: x09
                public final /* synthetic */ b19 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a19 a19Var;
                    byte b32 = b3;
                    b19 b19Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b32) {
                        case 0:
                            int i2 = b19Var.a;
                            a19 c = b19Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                b19Var.b.remove(c);
                                b19Var.a(c.b);
                                int i3 = c.a;
                                jf7 Y = jf7.Y(i2);
                                Y.a.c(new ad7(Y, i3, (byte) 5));
                                b19Var.l();
                                jn7.f(i2).k(jn7.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 1:
                            b19 b19Var2 = this.b;
                            int i4 = b19Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            a19 c2 = b19Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    b19Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                r47 r47Var = c2.e;
                                if (!arrayList.contains(Integer.valueOf(r47Var != null ? r47Var.e1() : c2.d)) && c2.e != null) {
                                    b19Var2.l();
                                    jn7.f(i4).k(jn7.F1, new Object[0]);
                                    break;
                                } else {
                                    c2.e = null;
                                    long e = yac.h(i4).e();
                                    jf7 Y2 = jf7.Y(i4);
                                    Y2.a.c(new y09(b19Var2, Y2, c2, e, (byte) 0));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = b19Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        a19Var = null;
                                    } else if (((a19) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                        a19Var = (a19) arrayList4.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                if (a19Var == null) {
                                    a19Var = new a19();
                                }
                                a19Var.a = tL_quickReply.shortcut_id;
                                a19Var.b = tL_quickReply.shortcut;
                                a19Var.f = tL_quickReply.count;
                                a19Var.c = i5;
                                a19Var.d = tL_quickReply.top_message;
                                r47 r47Var2 = a19Var.e;
                                if (r47Var2 != null && r47Var2.e1() != tL_quickReply.top_message) {
                                    a19Var.e = null;
                                }
                                arrayList3.add(a19Var);
                                b19Var.a(a19Var.b);
                            }
                            b19Var.l();
                            jn7.f(b19Var.a).k(jn7.F1, new Object[0]);
                            break;
                        default:
                            b19 b19Var3 = this.b;
                            ArrayList arrayList5 = b19Var3.b;
                            int i7 = b19Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            a19 c3 = b19Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                r47 r47Var3 = c3.e;
                                if (r47Var3 != null && r47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = yac.h(i7).e();
                                    jf7 Y3 = jf7.Y(i7);
                                    Y3.a.c(new y09(b19Var3, Y3, c3, e2, (byte) 0));
                                    break;
                                }
                            } else {
                                a19 a19Var2 = new a19();
                                a19Var2.a = tL_quickReply2.shortcut_id;
                                a19Var2.b = tL_quickReply2.shortcut;
                                a19Var2.f = tL_quickReply2.count;
                                a19Var2.d = tL_quickReply2.top_message;
                                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                    ((a19) arrayList5.get(i8)).c = i8;
                                }
                                arrayList5.add(a19Var2);
                                b19Var3.a(a19Var2.b);
                            }
                            b19Var3.l();
                            jn7.f(i7).k(jn7.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        final byte b4 = 0;
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) { // from class: x09
                public final /* synthetic */ b19 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a19 a19Var;
                    byte b32 = b4;
                    b19 b19Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b32) {
                        case 0:
                            int i2 = b19Var.a;
                            a19 c = b19Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                b19Var.b.remove(c);
                                b19Var.a(c.b);
                                int i3 = c.a;
                                jf7 Y = jf7.Y(i2);
                                Y.a.c(new ad7(Y, i3, (byte) 5));
                                b19Var.l();
                                jn7.f(i2).k(jn7.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 1:
                            b19 b19Var2 = this.b;
                            int i4 = b19Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            a19 c2 = b19Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    b19Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                r47 r47Var = c2.e;
                                if (!arrayList.contains(Integer.valueOf(r47Var != null ? r47Var.e1() : c2.d)) && c2.e != null) {
                                    b19Var2.l();
                                    jn7.f(i4).k(jn7.F1, new Object[0]);
                                    break;
                                } else {
                                    c2.e = null;
                                    long e = yac.h(i4).e();
                                    jf7 Y2 = jf7.Y(i4);
                                    Y2.a.c(new y09(b19Var2, Y2, c2, e, (byte) 0));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = b19Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        a19Var = null;
                                    } else if (((a19) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                        a19Var = (a19) arrayList4.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                if (a19Var == null) {
                                    a19Var = new a19();
                                }
                                a19Var.a = tL_quickReply.shortcut_id;
                                a19Var.b = tL_quickReply.shortcut;
                                a19Var.f = tL_quickReply.count;
                                a19Var.c = i5;
                                a19Var.d = tL_quickReply.top_message;
                                r47 r47Var2 = a19Var.e;
                                if (r47Var2 != null && r47Var2.e1() != tL_quickReply.top_message) {
                                    a19Var.e = null;
                                }
                                arrayList3.add(a19Var);
                                b19Var.a(a19Var.b);
                            }
                            b19Var.l();
                            jn7.f(b19Var.a).k(jn7.F1, new Object[0]);
                            break;
                        default:
                            b19 b19Var3 = this.b;
                            ArrayList arrayList5 = b19Var3.b;
                            int i7 = b19Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            a19 c3 = b19Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                r47 r47Var3 = c3.e;
                                if (r47Var3 != null && r47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = yac.h(i7).e();
                                    jf7 Y3 = jf7.Y(i7);
                                    Y3.a.c(new y09(b19Var3, Y3, c3, e2, (byte) 0));
                                    break;
                                }
                            } else {
                                a19 a19Var2 = new a19();
                                a19Var2.a = tL_quickReply2.shortcut_id;
                                a19Var2.b = tL_quickReply2.shortcut;
                                a19Var2.f = tL_quickReply2.count;
                                a19Var2.d = tL_quickReply2.top_message;
                                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                    ((a19) arrayList5.get(i8)).c = i8;
                                }
                                arrayList5.add(a19Var2);
                                b19Var3.a(a19Var2.b);
                            }
                            b19Var3.l();
                            jn7.f(i7).k(jn7.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        b(new Runnable(this) { // from class: x09
            public final /* synthetic */ b19 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a19 a19Var;
                byte b32 = b;
                b19 b19Var = this.b;
                TLRPC.Update update2 = update;
                switch (b32) {
                    case 0:
                        int i2 = b19Var.a;
                        a19 c = b19Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                        if (c != null) {
                            b19Var.b.remove(c);
                            b19Var.a(c.b);
                            int i3 = c.a;
                            jf7 Y = jf7.Y(i2);
                            Y.a.c(new ad7(Y, i3, (byte) 5));
                            b19Var.l();
                            jn7.f(i2).k(jn7.F1, new Object[0]);
                            break;
                        }
                        break;
                    case 1:
                        b19 b19Var2 = this.b;
                        int i4 = b19Var2.a;
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                        a19 c2 = b19Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (c2 != null) {
                            int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                            c2.f = size;
                            if (size <= 0) {
                                b19Var2.b.remove(c2);
                            }
                            ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                            r47 r47Var = c2.e;
                            if (!arrayList.contains(Integer.valueOf(r47Var != null ? r47Var.e1() : c2.d)) && c2.e != null) {
                                b19Var2.l();
                                jn7.f(i4).k(jn7.F1, new Object[0]);
                                break;
                            } else {
                                c2.e = null;
                                long e = yac.h(i4).e();
                                jf7 Y2 = jf7.Y(i4);
                                Y2.a.c(new y09(b19Var2, Y2, c2, e, (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 2:
                        ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                        ArrayList arrayList3 = b19Var.b;
                        ArrayList arrayList4 = new ArrayList(arrayList3);
                        arrayList3.clear();
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                            int i6 = 0;
                            while (true) {
                                if (i6 >= arrayList4.size()) {
                                    a19Var = null;
                                } else if (((a19) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                    a19Var = (a19) arrayList4.get(i6);
                                } else {
                                    i6++;
                                }
                            }
                            if (a19Var == null) {
                                a19Var = new a19();
                            }
                            a19Var.a = tL_quickReply.shortcut_id;
                            a19Var.b = tL_quickReply.shortcut;
                            a19Var.f = tL_quickReply.count;
                            a19Var.c = i5;
                            a19Var.d = tL_quickReply.top_message;
                            r47 r47Var2 = a19Var.e;
                            if (r47Var2 != null && r47Var2.e1() != tL_quickReply.top_message) {
                                a19Var.e = null;
                            }
                            arrayList3.add(a19Var);
                            b19Var.a(a19Var.b);
                        }
                        b19Var.l();
                        jn7.f(b19Var.a).k(jn7.F1, new Object[0]);
                        break;
                    default:
                        b19 b19Var3 = this.b;
                        ArrayList arrayList5 = b19Var3.b;
                        int i7 = b19Var3.a;
                        TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                        a19 c3 = b19Var3.c(tL_quickReply2.shortcut_id);
                        if (c3 != null) {
                            c3.b = tL_quickReply2.shortcut;
                            c3.f = tL_quickReply2.count;
                            c3.d = tL_quickReply2.top_message;
                            r47 r47Var3 = c3.e;
                            if (r47Var3 != null && r47Var3.e1() != tL_quickReply2.top_message) {
                                c3.e = null;
                                long e2 = yac.h(i7).e();
                                jf7 Y3 = jf7.Y(i7);
                                Y3.a.c(new y09(b19Var3, Y3, c3, e2, (byte) 0));
                                break;
                            }
                        } else {
                            a19 a19Var2 = new a19();
                            a19Var2.a = tL_quickReply2.shortcut_id;
                            a19Var2.b = tL_quickReply2.shortcut;
                            a19Var2.f = tL_quickReply2.count;
                            a19Var2.d = tL_quickReply2.top_message;
                            for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                ((a19) arrayList5.get(i8)).c = i8;
                            }
                            arrayList5.add(a19Var2);
                            b19Var3.a(a19Var2.b);
                        }
                        b19Var3.l();
                        jn7.f(i7).k(jn7.F1, new Object[0]);
                        break;
                }
            }
        });
        return true;
    }

    public final void k(int i, String str) {
        a19 c = c(i);
        if (c == null) {
            return;
        }
        c.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i2 = this.a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editQuickReplyShortcut, new xe2((byte) 7));
        l();
        jn7.f(i2).k(jn7.F1, new Object[0]);
    }

    public final void l() {
        jf7 Y = jf7.Y(this.a);
        Y.a.c(new z09(this, Y));
    }
}
