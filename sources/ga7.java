// default package

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.WearReplyReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ga7 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ga7(fu5 fu5Var, int i, long j, long j2, fu5 fu5Var2, zu1 zu1Var, vnb vnbVar) {
        this.e = fu5Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.f = fu5Var2;
        this.h = zu1Var;
        this.n = vnbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0299  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        long j2;
        byte b;
        byte b2;
        uc7 uc7Var;
        boolean z;
        Integer num;
        boolean z2;
        ArrayList arrayList;
        r47 r47Var;
        long j3;
        int i;
        long j4;
        TLRPC.Message message;
        ArrayList arrayList2;
        boolean z3;
        byte b3 = this.a;
        long j5 = this.d;
        Object obj = this.n;
        Object obj2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.e;
        switch (b3) {
            case 0:
                uc7 uc7Var2 = (uc7) obj4;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                zh6 zh6Var = (zh6) obj;
                ConcurrentHashMap concurrentHashMap = uc7Var2.Q;
                ConcurrentHashMap concurrentHashMap2 = uc7Var2.P;
                boolean z4 = updates_channeldifference instanceof TLRPC.TL_updates_channelDifference;
                long j6 = this.c;
                if (z4 || (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceEmpty)) {
                    j = j6;
                    if (updates_channeldifference.new_messages.isEmpty()) {
                        j2 = j5;
                        b = 2;
                    } else {
                        zh6 zh6Var2 = new zh6();
                        in5.S(updates_channeldifference.new_messages);
                        ArrayList arrayList3 = new ArrayList();
                        long j7 = -j;
                        Integer num2 = (Integer) concurrentHashMap2.get(Long.valueOf(j7));
                        if (num2 == null) {
                            num2 = Integer.valueOf(uc7Var2.getMessagesStorage().U(j7, false));
                            concurrentHashMap2.put(Long.valueOf(j7), num2);
                        }
                        Integer num3 = num2;
                        Integer num4 = (Integer) concurrentHashMap.get(Long.valueOf(j7));
                        if (num4 == null) {
                            num4 = Integer.valueOf(uc7Var2.getMessagesStorage().U(j7, true));
                            concurrentHashMap.put(Long.valueOf(j7), num4);
                        }
                        Integer num5 = num4;
                        int i2 = 0;
                        while (i2 < updates_channeldifference.new_messages.size()) {
                            TLRPC.Message message2 = updates_channeldifference.new_messages.get(i2);
                            Integer num6 = num5;
                            if (message2 instanceof TLRPC.TL_messageEmpty) {
                                j3 = j5;
                                num = num3;
                                arrayList = arrayList3;
                                j4 = j7;
                                i = i2;
                            } else {
                                if (chat == null || !chat.left) {
                                    num = num3;
                                    if ((message2.out ? num6 : num3).intValue() < message2.id && !(message2.action instanceof TLRPC.TL_messageActionChannelCreate)) {
                                        z2 = true;
                                        message2.unread = z2;
                                        boolean contains = uc7Var2.l0.contains(Long.valueOf(j7));
                                        arrayList = arrayList3;
                                        j3 = j5;
                                        i = i2;
                                        j4 = j7;
                                        r47Var = new r47(uc7Var2.currentAccount, message2, zh6Var, (zh6) null, contains, contains);
                                        message = r47Var.k;
                                        if ((message.out || message.from_scheduled) && r47Var.E4()) {
                                            arrayList.add(r47Var);
                                        }
                                        arrayList2 = (ArrayList) zh6Var2.f(j4);
                                        if (arrayList2 == null) {
                                            arrayList2 = qd4.s(zh6Var2, j4);
                                        }
                                        arrayList2.add(r47Var);
                                    }
                                } else {
                                    num = num3;
                                }
                                z2 = false;
                                message2.unread = z2;
                                boolean contains2 = uc7Var2.l0.contains(Long.valueOf(j7));
                                arrayList = arrayList3;
                                j3 = j5;
                                i = i2;
                                j4 = j7;
                                r47Var = new r47(uc7Var2.currentAccount, message2, zh6Var, (zh6) null, contains2, contains2);
                                message = r47Var.k;
                                if (message.out) {
                                }
                                arrayList.add(r47Var);
                                arrayList2 = (ArrayList) zh6Var2.f(j4);
                                if (arrayList2 == null) {
                                }
                                arrayList2.add(r47Var);
                            }
                            i2 = i + 1;
                            num5 = num6;
                            j7 = j4;
                            arrayList3 = arrayList;
                            num3 = num;
                            j5 = j3;
                        }
                        j2 = j5;
                        b = 2;
                        hl.c3(new q87(uc7Var2, zh6Var2, b));
                        uc7Var2.getMessagesStorage().a.c(new yg6(uc7Var2, arrayList3, updates_channeldifference, (byte) 26));
                    }
                    if (updates_channeldifference.other_updates.isEmpty()) {
                        b2 = b;
                        uc7Var = uc7Var2;
                    } else {
                        b2 = b;
                        uc7Var = uc7Var2;
                        uc7Var.X3(updates_channeldifference.other_updates, updates_channeldifference.users, updates_channeldifference.chats, true, 0);
                    }
                    z = true;
                    uc7Var.P3(1, j);
                    kf7 messagesStorage = uc7Var.getMessagesStorage();
                    messagesStorage.a.c(new id7(messagesStorage, updates_channeldifference.pts, j, (byte) 5));
                } else if (updates_channeldifference instanceof TLRPC.TL_updates_channelDifferenceTooLong) {
                    long j8 = -j6;
                    Integer num7 = (Integer) concurrentHashMap2.get(Long.valueOf(j8));
                    if (num7 == null) {
                        num7 = Integer.valueOf(uc7Var2.getMessagesStorage().U(j8, false));
                        concurrentHashMap2.put(Long.valueOf(j8), num7);
                    }
                    Integer num8 = (Integer) concurrentHashMap.get(Long.valueOf(j8));
                    if (num8 == null) {
                        num8 = Integer.valueOf(uc7Var2.getMessagesStorage().U(j8, true));
                        concurrentHashMap.put(Long.valueOf(j8), num8);
                    }
                    for (int i3 = 0; i3 < updates_channeldifference.messages.size(); i3++) {
                        TLRPC.Message message3 = updates_channeldifference.messages.get(i3);
                        message3.dialog_id = j8;
                        if (!(message3.action instanceof TLRPC.TL_messageActionChannelCreate) && (chat == null || !chat.left)) {
                            if ((message3.out ? num8 : num7).intValue() < message3.id) {
                                z3 = true;
                                message3.unread = z3;
                            }
                        }
                        z3 = false;
                        message3.unread = z3;
                    }
                    kf7 messagesStorage2 = uc7Var2.getMessagesStorage();
                    t77 t77Var = new t77(uc7Var2, j6, (byte) 15);
                    to3 to3Var = messagesStorage2.a;
                    wy wyVar = new wy((Object) messagesStorage2, j6, this.b, updates_channeldifference, (Object) t77Var, (byte) 7);
                    j = j6;
                    to3Var.c(wyVar);
                    j2 = j5;
                    uc7Var = uc7Var2;
                    b2 = 2;
                    z = false;
                } else {
                    j2 = j5;
                    z = true;
                    uc7Var = uc7Var2;
                    j = j6;
                    b2 = 2;
                }
                uc7Var.Q0.e(j);
                uc7Var.P0.put(j, updates_channeldifference.pts);
                if ((updates_channeldifference.flags & b2) != 0) {
                    uc7Var.q0.put(j, ((int) (System.currentTimeMillis() / 1000)) + updates_channeldifference.timeout);
                }
                if (!updates_channeldifference.isFinal) {
                    uc7Var.I0(j);
                }
                if (f11.a) {
                    cc4.b("received channel difference with pts = " + updates_channeldifference.pts + " channelId = " + j);
                    cc4.b("new_messages = " + updates_channeldifference.new_messages.size() + " messages = " + updates_channeldifference.messages.size() + " users = " + updates_channeldifference.users.size() + " chats = " + updates_channeldifference.chats.size() + " other updates = " + updates_channeldifference.other_updates.size());
                }
                if (j2 != 0) {
                    uc7Var.getMessagesStorage().r1(j2);
                }
                if (z) {
                    hl.c3(new t77(uc7Var, j, (byte) 4));
                    break;
                }
                break;
            case 1:
                zu1 zu1Var = (zu1) obj3;
                vnb vnbVar = (vnb) obj;
                ((fu5) obj4).u();
                SharedPreferences sharedPreferences = uc7.s1(this.b).X3;
                StringBuilder sb = new StringBuilder("sound_enabled_");
                long j9 = this.c;
                sb.append(ip7.p(j9, j5, false));
                boolean z5 = sharedPreferences.getBoolean(sb.toString(), true);
                boolean z6 = !z5;
                sharedPreferences.edit().putBoolean("sound_enabled_" + ip7.p(j9, j5, false), z6).apply();
                ((fu5) obj2).u();
                if (d31.a(zu1Var)) {
                    d31.S(z5 ? 1 : 0, vnbVar, zu1Var).j();
                    break;
                }
                break;
            case 2:
                r7a r7aVar = (r7a) obj4;
                TLRPC.Message message4 = (TLRPC.Message) obj2;
                r47 r47Var2 = (r47) obj;
                kf7 messagesStorage3 = r7aVar.getMessagesStorage();
                int i4 = this.b;
                Integer valueOf = Integer.valueOf(i4);
                int i5 = message4.id;
                int i6 = message4.date;
                long j10 = this.c;
                long j11 = this.d;
                messagesStorage3.c2(j10, j11, valueOf, i5, i6, 0, 0);
                r7aVar.getMessagesStorage().k1((ArrayList) obj3, true, false, false, 0, false, 0, 0L);
                hl.c3(new wy(r7aVar, r47Var2, message4, j11, i4));
                break;
            case 3:
                k5 k5Var = (k5) obj4;
                int i7 = WearReplyReceiver.a;
                uc7.s1(k5Var.a).i4((TLRPC.User) obj2, true, false);
                WearReplyReceiver.a(k5Var, (CharSequence) obj3, this.c, this.d, this.b, (int[]) obj);
                break;
            default:
                k5 k5Var2 = (k5) obj4;
                int i8 = WearReplyReceiver.a;
                uc7.s1(k5Var2.a).a4((TLRPC.Chat) obj3, true);
                WearReplyReceiver.a(k5Var2, (CharSequence) obj2, this.c, this.d, this.b, (int[]) obj);
                break;
        }
    }

    public /* synthetic */ ga7(uc7 uc7Var, TLRPC.updates_ChannelDifference updates_channeldifference, long j, TLRPC.Chat chat, zh6 zh6Var, int i, long j2) {
        this.e = uc7Var;
        this.f = updates_channeldifference;
        this.c = j;
        this.h = chat;
        this.n = zh6Var;
        this.b = i;
        this.d = j2;
    }

    public /* synthetic */ ga7(r7a r7aVar, long j, long j2, int i, TLRPC.Message message, ArrayList arrayList, r47 r47Var) {
        this.e = r7aVar;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.f = message;
        this.h = arrayList;
        this.n = r47Var;
    }

    public /* synthetic */ ga7(WearReplyReceiver wearReplyReceiver, k5 k5Var, TLRPC.Chat chat, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = k5Var;
        this.h = chat;
        this.f = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }

    public /* synthetic */ ga7(WearReplyReceiver wearReplyReceiver, k5 k5Var, TLRPC.User user, CharSequence charSequence, long j, long j2, int i, int[] iArr) {
        this.e = k5Var;
        this.f = user;
        this.h = charSequence;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.n = iArr;
    }
}
