package ig;

import android.text.TextUtils;
import bi.c7;
import bi.k8;
import bi.v7;
import bi.x7;
import fi.j4;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class b2 {
    public static volatile b2[] g = new b2[4];
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

    public b2(int i10) {
        this.a = i10;
    }

    public static b2 f(int i10) {
        b2 b2Var;
        b2 b2Var2 = g[i10];
        if (b2Var2 != null) {
            return b2Var2;
        }
        synchronized (h[i10]) {
            try {
                b2Var = g[i10];
                if (b2Var == null) {
                    b2[] b2VarArr = g;
                    b2 b2Var3 = new b2(i10);
                    b2VarArr[i10] = b2Var3;
                    b2Var = b2Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b2Var;
    }

    public static boolean g(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void a(String str) {
        a2 a2Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                a2Var = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            a2Var = (a2) obj;
            if (TextUtils.equals(str, a2Var.b)) {
                break;
            }
        }
        if (a2Var != null) {
            arrayList.remove(a2Var);
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final a2 c(long j3) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            if (a2Var.a == j3) {
                return a2Var;
            }
        }
        return null;
    }

    public final a2 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            if (TextUtils.equals(str, a2Var.b)) {
                return a2Var;
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
            if (!g(((a2) arrayList2.get(i10)).b)) {
                arrayList.add((a2) arrayList2.get(i10));
            }
            i10++;
        }
    }

    public final void h() {
        i(null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010d A[EDGE_INSN: B:58:0x010d->B:59:0x010d BREAK  A[LOOP:0: B:11:0x003c->B:28:0x0167, LOOP_LABEL: LOOP:0: B:11:0x003c->B:28:0x0167], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Runnable runnable, boolean z10) {
        String substring;
        long j3;
        long j10;
        int i10;
        long j11;
        long j12;
        long j13;
        TLRPC.Message message;
        if (this.e || this.f) {
            return;
        }
        int i11 = 1;
        this.e = true;
        int i12 = this.a;
        if (z10) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
            messagesStorage.getStorageQueue().postRunnable(new x7(this, messagesStorage, UserConfig.getInstance(i12).getClientUserId(), runnable, 5));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        long j14 = 0;
        tL_messages_getQuickReplies.hash = 0L;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.b;
            if (i14 >= arrayList.size()) {
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getQuickReplies, new v7(this, 15));
                return;
            }
            a2 a2Var = (a2) arrayList.get(i14);
            long calcHash = MediaDataController.calcHash(tL_messages_getQuickReplies.hash, a2Var.a);
            tL_messages_getQuickReplies.hash = calcHash;
            String str = a2Var.b;
            if (str == null) {
                j3 = j14;
            } else {
                substring = Utilities.MD5(str).substring(i13, 16);
                int length = substring.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                long j15 = 16;
                if (j15 >= j14) {
                    long j16 = (Long.MAX_VALUE / j15) << i11;
                    j3 = j14;
                    j10 = j16 + ((((-1) - (j16 * j15)) ^ Long.MIN_VALUE) >= (j15 ^ Long.MIN_VALUE) ? 1 : 0);
                } else if (Long.MAX_VALUE < (j15 ^ Long.MIN_VALUE)) {
                    j3 = j14;
                    j10 = j3;
                } else {
                    j10 = 1;
                    j3 = j14;
                }
                int i15 = (substring.charAt(i13) != '+' || length <= i11) ? 0 : 1;
                long j17 = j3;
                while (i15 < length) {
                    int digit = Character.digit(substring.charAt(i15), 16);
                    if (digit == -1) {
                        throw new NumberFormatException(substring.toString());
                    }
                    if (j17 < j3 || j17 > j10) {
                        break loop0;
                    }
                    if (j17 == j10) {
                        if (j15 >= j14) {
                            long j18 = (-1) - (((Long.MAX_VALUE / j15) << 1) * j15);
                            j11 = j18 - ((j18 ^ Long.MIN_VALUE) >= (j15 ^ Long.MIN_VALUE) ? j15 : j3);
                        } else if (Long.MAX_VALUE < (j15 ^ Long.MIN_VALUE)) {
                            i10 = i14;
                            j12 = -1;
                            if (digit <= ((int) j12)) {
                                break loop0;
                            }
                        } else {
                            j11 = (-1) - j15;
                        }
                        i10 = i14;
                        j12 = j11;
                        if (digit <= ((int) j12)) {
                        }
                    } else {
                        i10 = i14;
                    }
                    j17 = (j17 * j15) + digit;
                    i15++;
                    i14 = i10;
                }
                j14 = j17;
            }
            int i16 = i14;
            long calcHash2 = MediaDataController.calcHash(calcHash, j14);
            tL_messages_getQuickReplies.hash = calcHash2;
            long calcHash3 = MediaDataController.calcHash(calcHash2, a2Var.e == null ? j3 : r6.getId());
            tL_messages_getQuickReplies.hash = calcHash3;
            MessageObject messageObject = a2Var.e;
            if (messageObject == null || (message = messageObject.messageOwner) == null || (message.flags & 32768) == 0) {
                j13 = j3;
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(calcHash3, j13);
            } else {
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(calcHash3, message.edit_date);
                j13 = j3;
            }
            i14 = i16 + 1;
            j14 = j13;
            i11 = 1;
            i13 = 0;
        }
        throw new NumberFormatException("Too large for unsigned long: ".concat(substring.toString()));
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new k8(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 5));
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final int i11 = 0;
            b(new Runnable(this) { // from class: ig.z1
                public final /* synthetic */ b2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a2 a2Var;
                    switch (i11) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            b2 b2Var = this.b;
                            ArrayList arrayList2 = b2Var.b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList3.size()) {
                                        a2Var = null;
                                    } else if (((a2) arrayList3.get(i13)).a == tL_quickReply.shortcut_id) {
                                        a2Var = (a2) arrayList3.get(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                                if (a2Var == null) {
                                    a2Var = new a2();
                                }
                                a2Var.a = tL_quickReply.shortcut_id;
                                a2Var.b = tL_quickReply.shortcut;
                                a2Var.f = tL_quickReply.count;
                                a2Var.c = i12;
                                a2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = a2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    a2Var.e = null;
                                }
                                arrayList2.add(a2Var);
                                b2Var.a(a2Var.b);
                            }
                            b2Var.l();
                            NotificationCenter.getInstance(b2Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            b2 b2Var2 = this.b;
                            ArrayList arrayList4 = b2Var2.b;
                            int i14 = b2Var2.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            a2 c10 = b2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply2.shortcut;
                                c10.f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new x7(b2Var2, messagesStorage, c10, clientUserId, 6));
                                    break;
                                }
                            } else {
                                a2 a2Var2 = new a2();
                                a2Var2.a = tL_quickReply2.shortcut_id;
                                a2Var2.b = tL_quickReply2.shortcut;
                                a2Var2.f = tL_quickReply2.count;
                                a2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((a2) arrayList4.get(i15)).c = i15;
                                }
                                arrayList4.add(a2Var2);
                                b2Var2.a(a2Var2.b);
                            }
                            b2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            b2 b2Var3 = this.b;
                            int i16 = b2Var3.a;
                            a2 c11 = b2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                b2Var3.b.remove(c11);
                                b2Var3.a(c11.b);
                                int i17 = c11.a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 9));
                                b2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            }
                            break;
                        default:
                            b2 b2Var4 = this.b;
                            int i18 = b2Var4.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            a2 c12 = b2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    b2Var4.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c12.d)) && c12.e != null) {
                                    b2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                    messagesStorage3.getStorageQueue().postRunnable(new x7(b2Var4, messagesStorage3, c12, clientUserId2, 6));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            final int i12 = 1;
            b(new Runnable(this) { // from class: ig.z1
                public final /* synthetic */ b2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a2 a2Var;
                    switch (i12) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            b2 b2Var = this.b;
                            ArrayList arrayList2 = b2Var.b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i122 = 0; i122 < arrayList.size(); i122++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i122);
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList3.size()) {
                                        a2Var = null;
                                    } else if (((a2) arrayList3.get(i13)).a == tL_quickReply.shortcut_id) {
                                        a2Var = (a2) arrayList3.get(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                                if (a2Var == null) {
                                    a2Var = new a2();
                                }
                                a2Var.a = tL_quickReply.shortcut_id;
                                a2Var.b = tL_quickReply.shortcut;
                                a2Var.f = tL_quickReply.count;
                                a2Var.c = i122;
                                a2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = a2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    a2Var.e = null;
                                }
                                arrayList2.add(a2Var);
                                b2Var.a(a2Var.b);
                            }
                            b2Var.l();
                            NotificationCenter.getInstance(b2Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            b2 b2Var2 = this.b;
                            ArrayList arrayList4 = b2Var2.b;
                            int i14 = b2Var2.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            a2 c10 = b2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply2.shortcut;
                                c10.f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new x7(b2Var2, messagesStorage, c10, clientUserId, 6));
                                    break;
                                }
                            } else {
                                a2 a2Var2 = new a2();
                                a2Var2.a = tL_quickReply2.shortcut_id;
                                a2Var2.b = tL_quickReply2.shortcut;
                                a2Var2.f = tL_quickReply2.count;
                                a2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((a2) arrayList4.get(i15)).c = i15;
                                }
                                arrayList4.add(a2Var2);
                                b2Var2.a(a2Var2.b);
                            }
                            b2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            b2 b2Var3 = this.b;
                            int i16 = b2Var3.a;
                            a2 c11 = b2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                b2Var3.b.remove(c11);
                                b2Var3.a(c11.b);
                                int i17 = c11.a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 9));
                                b2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            }
                            break;
                        default:
                            b2 b2Var4 = this.b;
                            int i18 = b2Var4.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            a2 c12 = b2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    b2Var4.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c12.d)) && c12.e != null) {
                                    b2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                    messagesStorage3.getStorageQueue().postRunnable(new x7(b2Var4, messagesStorage3, c12, clientUserId2, 6));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            final int i13 = 2;
            b(new Runnable(this) { // from class: ig.z1
                public final /* synthetic */ b2 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a2 a2Var;
                    switch (i13) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            b2 b2Var = this.b;
                            ArrayList arrayList2 = b2Var.b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i122 = 0; i122 < arrayList.size(); i122++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i122);
                                int i132 = 0;
                                while (true) {
                                    if (i132 >= arrayList3.size()) {
                                        a2Var = null;
                                    } else if (((a2) arrayList3.get(i132)).a == tL_quickReply.shortcut_id) {
                                        a2Var = (a2) arrayList3.get(i132);
                                    } else {
                                        i132++;
                                    }
                                }
                                if (a2Var == null) {
                                    a2Var = new a2();
                                }
                                a2Var.a = tL_quickReply.shortcut_id;
                                a2Var.b = tL_quickReply.shortcut;
                                a2Var.f = tL_quickReply.count;
                                a2Var.c = i122;
                                a2Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = a2Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    a2Var.e = null;
                                }
                                arrayList2.add(a2Var);
                                b2Var.a(a2Var.b);
                            }
                            b2Var.l();
                            NotificationCenter.getInstance(b2Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            b2 b2Var2 = this.b;
                            ArrayList arrayList4 = b2Var2.b;
                            int i14 = b2Var2.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            a2 c10 = b2Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply2.shortcut;
                                c10.f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new x7(b2Var2, messagesStorage, c10, clientUserId, 6));
                                    break;
                                }
                            } else {
                                a2 a2Var2 = new a2();
                                a2Var2.a = tL_quickReply2.shortcut_id;
                                a2Var2.b = tL_quickReply2.shortcut;
                                a2Var2.f = tL_quickReply2.count;
                                a2Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((a2) arrayList4.get(i15)).c = i15;
                                }
                                arrayList4.add(a2Var2);
                                b2Var2.a(a2Var2.b);
                            }
                            b2Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            b2 b2Var3 = this.b;
                            int i16 = b2Var3.a;
                            a2 c11 = b2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                b2Var3.b.remove(c11);
                                b2Var3.a(c11.b);
                                int i17 = c11.a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 9));
                                b2Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            }
                            break;
                        default:
                            b2 b2Var4 = this.b;
                            int i18 = b2Var4.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            a2 c12 = b2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    b2Var4.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c12.d)) && c12.e != null) {
                                    b2Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                    messagesStorage3.getStorageQueue().postRunnable(new x7(b2Var4, messagesStorage3, c12, clientUserId2, 6));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        final int i14 = 3;
        b(new Runnable(this) { // from class: ig.z1
            public final /* synthetic */ b2 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a2 a2Var;
                switch (i14) {
                    case 0:
                        ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                        b2 b2Var = this.b;
                        ArrayList arrayList2 = b2Var.b;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        arrayList2.clear();
                        for (int i122 = 0; i122 < arrayList.size(); i122++) {
                            TLRPC.TL_quickReply tL_quickReply = arrayList.get(i122);
                            int i132 = 0;
                            while (true) {
                                if (i132 >= arrayList3.size()) {
                                    a2Var = null;
                                } else if (((a2) arrayList3.get(i132)).a == tL_quickReply.shortcut_id) {
                                    a2Var = (a2) arrayList3.get(i132);
                                } else {
                                    i132++;
                                }
                            }
                            if (a2Var == null) {
                                a2Var = new a2();
                            }
                            a2Var.a = tL_quickReply.shortcut_id;
                            a2Var.b = tL_quickReply.shortcut;
                            a2Var.f = tL_quickReply.count;
                            a2Var.c = i122;
                            a2Var.d = tL_quickReply.top_message;
                            MessageObject messageObject = a2Var.e;
                            if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                a2Var.e = null;
                            }
                            arrayList2.add(a2Var);
                            b2Var.a(a2Var.b);
                        }
                        b2Var.l();
                        NotificationCenter.getInstance(b2Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        break;
                    case 1:
                        b2 b2Var2 = this.b;
                        ArrayList arrayList4 = b2Var2.b;
                        int i142 = b2Var2.a;
                        TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                        a2 c10 = b2Var2.c(tL_quickReply2.shortcut_id);
                        if (c10 != null) {
                            c10.b = tL_quickReply2.shortcut;
                            c10.f = tL_quickReply2.count;
                            c10.d = tL_quickReply2.top_message;
                            MessageObject messageObject2 = c10.e;
                            if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                c10.e = null;
                                long clientUserId = UserConfig.getInstance(i142).getClientUserId();
                                MessagesStorage messagesStorage = MessagesStorage.getInstance(i142);
                                messagesStorage.getStorageQueue().postRunnable(new x7(b2Var2, messagesStorage, c10, clientUserId, 6));
                                break;
                            }
                        } else {
                            a2 a2Var2 = new a2();
                            a2Var2.a = tL_quickReply2.shortcut_id;
                            a2Var2.b = tL_quickReply2.shortcut;
                            a2Var2.f = tL_quickReply2.count;
                            a2Var2.d = tL_quickReply2.top_message;
                            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                ((a2) arrayList4.get(i15)).c = i15;
                            }
                            arrayList4.add(a2Var2);
                            b2Var2.a(a2Var2.b);
                        }
                        b2Var2.l();
                        NotificationCenter.getInstance(i142).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        break;
                    case 2:
                        b2 b2Var3 = this.b;
                        int i16 = b2Var3.a;
                        a2 c11 = b2Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                        if (c11 != null) {
                            b2Var3.b.remove(c11);
                            b2Var3.a(c11.b);
                            int i17 = c11.a;
                            MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                            messagesStorage2.getStorageQueue().postRunnable(new ah.g(messagesStorage2, i17, 9));
                            b2Var3.l();
                            NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        }
                        break;
                    default:
                        b2 b2Var4 = this.b;
                        int i18 = b2Var4.a;
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                        a2 c12 = b2Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (c12 != null) {
                            int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                            c12.f = size;
                            if (size <= 0) {
                                b2Var4.b.remove(c12);
                            }
                            ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                            MessageObject messageObject3 = c12.e;
                            if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c12.d)) && c12.e != null) {
                                b2Var4.l();
                                NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            } else {
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new x7(b2Var4, messagesStorage3, c12, clientUserId2, 6));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        return true;
    }

    public final void k(int i10, String str) {
        a2 c10 = c(i10);
        if (c10 == null) {
            return;
        }
        c10.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new c7(7));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.a);
        messagesStorage.getStorageQueue().postRunnable(new j4(17, this, messagesStorage));
    }
}
