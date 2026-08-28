package of;

import android.util.Pair;
import gh.m7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.k6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class v1 {
    public u1 a;
    public ArrayList k;
    public ArrayList l;
    public String n;
    public final boolean o;
    public ArrayList q;
    public HashMap r;
    public final ArrayList b = new ArrayList();
    public String c = null;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final a0.h f = new a0.h();
    public final ArrayList g = new ArrayList();
    public final a0.h h = new a0.h();
    public final a0.h i = new a0.h();
    public final ArrayList j = new ArrayList();
    public final int m = UserConfig.selectedAccount;
    public boolean p = true;
    public boolean s = false;

    public v1(boolean z10) {
        this.o = z10;
    }

    public final void a(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
        boolean z10 = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (charSequence.charAt(start) != '@' && charSequence.charAt(start) != '#') {
                start++;
            }
            String charSequence2 = charSequence.subSequence(start, end).toString();
            if (this.r == null) {
                this.r = new HashMap();
                this.q = new ArrayList();
            }
            t1 t1Var = (t1) this.r.get(charSequence2);
            if (t1Var == null) {
                t1Var = new t1();
                t1Var.a = charSequence2;
                this.r.put(charSequence2, t1Var);
            } else {
                this.q.remove(t1Var);
            }
            t1Var.b = (int) (System.currentTimeMillis() / 1000);
            this.q.add(0, t1Var);
            z10 = true;
        }
        if (z10) {
            MessagesStorage.getInstance(this.m).getStorageQueue().postRunnable(new o8(18, this, this.q));
        }
    }

    public final void b() {
        this.e.clear();
        this.f.b();
        this.d.clear();
    }

    public final void c() {
        this.q = new ArrayList();
        this.r = new HashMap();
        MessagesStorage.getInstance(this.m).getStorageQueue().postRunnable(new s1(this, 0));
    }

    public boolean d(TLObject tLObject) {
        return true;
    }

    public final boolean e() {
        return this.b.size() > 0;
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        TLRPC.Chat chat;
        this.k = arrayList;
        this.l = arrayList2;
        a0.h hVar = this.f;
        if (hVar.m() != 0) {
            if (arrayList == null && arrayList2 == null) {
                return;
            }
            int i9 = 0;
            int size = arrayList == null ? 0 : arrayList.size();
            int size2 = (arrayList2 == null ? 0 : arrayList2.size()) + size;
            while (i9 < size2) {
                Object obj = i9 < size ? arrayList.get(i9) : arrayList2.get(i9 - size);
                if (obj instanceof e0) {
                    obj = ((e0) obj).a;
                }
                if (obj instanceof fp0) {
                    obj = ((fp0) obj).b;
                }
                boolean z10 = obj instanceof TLRPC.User;
                ArrayList arrayList3 = this.d;
                ArrayList arrayList4 = this.e;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) obj;
                    TLRPC.User user2 = (TLRPC.User) hVar.f(user.id);
                    if (user2 != null) {
                        arrayList4.remove(user2);
                        arrayList3.remove(user2);
                        hVar.l(user2.id);
                    }
                    long j10 = user.id;
                    a0.h hVar2 = this.h;
                    TLObject tLObject = (TLObject) hVar2.f(j10);
                    if (tLObject != null) {
                        this.g.remove(tLObject);
                        hVar2.l(user.id);
                    }
                    long j11 = user.id;
                    a0.h hVar3 = this.i;
                    Object f10 = hVar3.f(j11);
                    if (f10 != null) {
                        this.j.remove(f10);
                        hVar3.l(user.id);
                    }
                } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).id)) != null) {
                    arrayList4.remove(chat);
                    arrayList3.remove(chat);
                    hVar.l(-chat.id);
                }
                i9++;
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, boolean z14, int i9, int i10) {
        h(str, z10, z11, z12, z13, false, j10, z14, i9, i10, 0L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0199 A[LOOP:2: B:56:0x0193->B:58:0x0199, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(final String str, boolean z10, final boolean z11, final boolean z12, boolean z13, final boolean z14, long j10, boolean z15, int i9, final int i10, final long j11, final k6 k6Var) {
        int i11;
        boolean z16;
        boolean z17;
        boolean z18;
        int i12;
        int size;
        int i13;
        boolean z19;
        String str2;
        ArrayList arrayList = this.b;
        int size2 = arrayList.size();
        int i14 = 0;
        while (true) {
            i11 = this.m;
            if (i14 >= size2) {
                break;
            }
            Object obj = arrayList.get(i14);
            i14++;
            ConnectionsManager.getInstance(i11).cancelRequest(((Integer) obj).intValue(), true);
        }
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        a0.h hVar = this.f;
        ArrayList arrayList3 = this.e;
        a0.h hVar2 = this.h;
        ArrayList arrayList4 = this.g;
        a0.h hVar3 = this.i;
        ArrayList arrayList5 = this.j;
        if (str == null) {
            arrayList4.clear();
            hVar2.b();
            arrayList3.clear();
            hVar.b();
            arrayList2.clear();
            arrayList5.clear();
            hVar3.b();
            this.a.e(i10);
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        if (str.length() > 0) {
            if (j10 != 0) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                if (i9 == 1) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
                } else if (i9 == 3) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
                } else if (i9 == 0) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsSearch();
                }
                tL_channels_getParticipants.filter.q = str;
                tL_channels_getParticipants.limit = 50;
                tL_channels_getParticipants.offset = 0;
                tL_channels_getParticipants.channel = MessagesController.getInstance(i11).getInputChannel(j10);
                z16 = z13;
                arrayList6.add(new Pair(tL_channels_getParticipants, new m7(this, str, z16, 2)));
            } else {
                z16 = z13;
                this.n = str.toLowerCase();
            }
            z17 = false;
        } else {
            z16 = z13;
            arrayList4.clear();
            hVar2.b();
            z17 = true;
        }
        if (z10) {
            if (str.length() <= 0) {
                arrayList3.clear();
                hVar.b();
                arrayList2.clear();
                z18 = false;
                if (!z14 && z15 && str.startsWith("+") && str.length() > 3) {
                    arrayList5.clear();
                    hVar3.b();
                    String d = ne.b.d(str, false);
                    ArrayList<TLRPC.TL_contact> arrayList7 = ContactsController.getInstance(i11).contacts;
                    size = arrayList7.size();
                    z19 = false;
                    for (i13 = 0; i13 < size; i13++) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(arrayList7.get(i13).user_id));
                        if (user != null && (str2 = user.phone) != null && str2.startsWith(d)) {
                            if (!z19) {
                                z19 = user.phone.length() == d.length();
                            }
                            arrayList5.add(user);
                            hVar3.k(user, user.id);
                        }
                    }
                    if (!z19) {
                        arrayList5.add("section");
                        arrayList5.add(d);
                    }
                    z18 = false;
                }
                AtomicInteger atomicInteger = new AtomicInteger(0);
                ArrayList arrayList8 = new ArrayList();
                i12 = 0;
                while (i12 < arrayList6.size()) {
                    TLObject tLObject = (TLObject) ((Pair) arrayList6.get(i12)).first;
                    arrayList8.add(null);
                    final AtomicInteger atomicInteger2 = new AtomicInteger();
                    final AtomicInteger atomicInteger3 = atomicInteger;
                    final ArrayList arrayList9 = arrayList8;
                    final int i15 = i12;
                    final ArrayList arrayList10 = arrayList6;
                    atomicInteger2.set(ConnectionsManager.getInstance(i11).sendRequest(tLObject, new RequestDelegate() { // from class: of.q1
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                            final v1 v1Var = v1.this;
                            final ArrayList arrayList11 = arrayList9;
                            final int i16 = i15;
                            final AtomicInteger atomicInteger4 = atomicInteger2;
                            final AtomicInteger atomicInteger5 = atomicInteger3;
                            final ArrayList arrayList12 = arrayList10;
                            final int i17 = i10;
                            final Runnable runnable = k6Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: of.r1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Pair pair = new Pair(tLObject2, tL_error);
                                    ArrayList arrayList13 = arrayList11;
                                    arrayList13.set(i16, pair);
                                    Integer valueOf = Integer.valueOf(atomicInteger4.get());
                                    v1 v1Var2 = v1.this;
                                    ArrayList arrayList14 = v1Var2.b;
                                    if (arrayList14.contains(valueOf)) {
                                        arrayList14.remove(valueOf);
                                        int incrementAndGet = atomicInteger5.incrementAndGet();
                                        ArrayList arrayList15 = arrayList12;
                                        if (incrementAndGet == arrayList15.size()) {
                                            for (int i18 = 0; i18 < arrayList15.size(); i18++) {
                                                RequestDelegate requestDelegate = (RequestDelegate) ((Pair) arrayList15.get(i18)).second;
                                                Pair pair2 = (Pair) arrayList13.get(i18);
                                                if (pair2 != null) {
                                                    requestDelegate.run((TLObject) pair2.first, (TLRPC.TL_error) pair2.second);
                                                }
                                            }
                                            v1Var2.i();
                                            ArrayList arrayList16 = v1Var2.k;
                                            if (arrayList16 != null) {
                                                v1Var2.f(arrayList16, v1Var2.l);
                                            }
                                            ArrayList arrayList17 = v1Var2.d;
                                            ArrayList arrayList18 = v1Var2.e;
                                            a0.h hVar4 = v1Var2.f;
                                            u1 u1Var = v1Var2.a;
                                            if (u1Var != null) {
                                                a0.h O = u1Var.O();
                                                if (O != null) {
                                                    int m10 = O.m();
                                                    for (int i19 = 0; i19 < m10; i19++) {
                                                        TLRPC.User user2 = (TLRPC.User) hVar4.f(O.j(i19));
                                                        if (user2 != null) {
                                                            arrayList18.remove(user2);
                                                            arrayList17.remove(user2);
                                                            hVar4.l(user2.id);
                                                        }
                                                    }
                                                }
                                                a0.h y10 = v1Var2.a.y();
                                                if (y10 != null) {
                                                    int m11 = y10.m();
                                                    for (int i20 = 0; i20 < m11; i20++) {
                                                        TLRPC.User user3 = (TLRPC.User) hVar4.f(y10.j(i20));
                                                        if (user3 != null) {
                                                            arrayList18.remove(user3);
                                                            arrayList17.remove(user3);
                                                            hVar4.l(user3.id);
                                                        }
                                                    }
                                                }
                                            }
                                            v1Var2.a.e(i17);
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                            }
                                        }
                                    }
                                }
                            });
                        }
                    }));
                    arrayList.add(Integer.valueOf(atomicInteger2.get()));
                    i12 = i15 + 1;
                    arrayList6 = arrayList10;
                    atomicInteger = atomicInteger3;
                    arrayList8 = arrayList9;
                }
                if (z18) {
                    return;
                }
                this.a.e(i10);
                return;
            }
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 20;
            final boolean z20 = z16;
            arrayList6.add(new Pair(tL_contacts_search, new RequestDelegate() { // from class: of.p1
                /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
                
                    if (r10.bot == false) goto L56;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x011c, code lost:
                
                    if (r10.self == false) goto L59;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
                
                    if (r10.contact != false) goto L67;
                 */
                @Override // org.telegram.tgnet.RequestDelegate
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    boolean z21;
                    boolean z22;
                    boolean z23;
                    boolean z24;
                    a0.h hVar4;
                    TLRPC.Chat chat;
                    TLRPC.User user2;
                    TLRPC.TL_contacts_found tL_contacts_found;
                    a0.h hVar5;
                    ArrayList<TLRPC.Peer> arrayList11;
                    boolean z25;
                    TLRPC.Chat chat2;
                    TLRPC.User user3;
                    a0.h hVar6;
                    v1 v1Var = v1.this;
                    boolean z26 = v1Var.o;
                    int i16 = v1Var.m;
                    ArrayList arrayList12 = v1Var.d;
                    ArrayList arrayList13 = v1Var.e;
                    a0.h hVar7 = v1Var.f;
                    if (v1Var.a.p0(i10) && tL_error == null) {
                        TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) tLObject2;
                        arrayList13.clear();
                        hVar7.b();
                        arrayList12.clear();
                        MessagesController.getInstance(i16).putChats(tL_contacts_found2.chats, false);
                        MessagesController.getInstance(i16).putUsers(tL_contacts_found2.users, false);
                        MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        a0.h hVar8 = new a0.h();
                        a0.h hVar9 = new a0.h();
                        for (int i17 = 0; i17 < tL_contacts_found2.chats.size(); i17++) {
                            TLRPC.Chat chat3 = tL_contacts_found2.chats.get(i17);
                            hVar8.k(chat3, chat3.id);
                        }
                        for (int i18 = 0; i18 < tL_contacts_found2.users.size(); i18++) {
                            TLRPC.User user4 = tL_contacts_found2.users.get(i18);
                            hVar9.k(user4, user4.id);
                        }
                        int i19 = 0;
                        while (true) {
                            z21 = z11;
                            z22 = z14;
                            z23 = z12;
                            z24 = z20;
                            if (i19 >= 2) {
                                break;
                            }
                            if (i19 != 0) {
                                arrayList11 = tL_contacts_found2.results;
                            } else if (z26) {
                                arrayList11 = tL_contacts_found2.my_results;
                            } else {
                                z25 = z26;
                                i19++;
                                hVar8 = hVar8;
                                z26 = z25;
                            }
                            z25 = z26;
                            int i20 = 0;
                            while (i20 < arrayList11.size()) {
                                TLRPC.Peer peer = arrayList11.get(i20);
                                boolean z27 = z24;
                                int i21 = i20;
                                long j12 = peer.user_id;
                                if (j12 != 0) {
                                    user3 = (TLRPC.User) hVar9.f(j12);
                                    chat2 = null;
                                } else {
                                    long j13 = peer.chat_id;
                                    if (j13 != 0) {
                                        chat2 = (TLRPC.Chat) hVar8.f(j13);
                                    } else {
                                        long j14 = peer.channel_id;
                                        if (j14 != 0) {
                                            chat2 = (TLRPC.Chat) hVar8.f(j14);
                                        } else {
                                            chat2 = null;
                                            user3 = null;
                                        }
                                    }
                                    user3 = null;
                                }
                                if (chat2 != null) {
                                    if (z21 && ((!z22 || ChatObject.canAddBotsToChat(chat2)) && ((v1Var.p || !ChatObject.isNotInChat(chat2)) && v1Var.d(chat2)))) {
                                        arrayList13.add(chat2);
                                        hVar7.k(chat2, -chat2.id);
                                    }
                                } else if (user3 != null) {
                                    if (!z22) {
                                        if (!z23) {
                                        }
                                        if (!z27) {
                                        }
                                        if (!v1Var.p) {
                                            if (i19 == 1) {
                                            }
                                        }
                                        if (v1Var.d(user3)) {
                                            arrayList13.add(user3);
                                            hVar6 = hVar8;
                                            hVar7.k(user3, user3.id);
                                            hVar8 = hVar6;
                                            i20 = i21 + 1;
                                            z24 = z27;
                                        }
                                    }
                                }
                                hVar6 = hVar8;
                                hVar8 = hVar6;
                                i20 = i21 + 1;
                                z24 = z27;
                            }
                            i19++;
                            hVar8 = hVar8;
                            z26 = z25;
                        }
                        a0.h hVar10 = hVar8;
                        if (!z26) {
                            int i22 = 0;
                            while (i22 < tL_contacts_found2.my_results.size()) {
                                TLRPC.Peer peer2 = tL_contacts_found2.my_results.get(i22);
                                long j15 = peer2.user_id;
                                if (j15 != 0) {
                                    hVar4 = hVar10;
                                    user2 = (TLRPC.User) hVar9.f(j15);
                                    chat = null;
                                } else {
                                    long j16 = peer2.chat_id;
                                    if (j16 != 0) {
                                        hVar4 = hVar10;
                                        chat = (TLRPC.Chat) hVar4.f(j16);
                                    } else {
                                        hVar4 = hVar10;
                                        long j17 = peer2.channel_id;
                                        if (j17 != 0) {
                                            chat = (TLRPC.Chat) hVar4.f(j17);
                                        } else {
                                            chat = null;
                                            user2 = null;
                                        }
                                    }
                                    user2 = null;
                                }
                                long j18 = j11;
                                if (chat == null) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                    if (user2 != null && !z22 && ((z23 || !user2.bot) && ((z24 || !user2.self) && user2.id != j18 && v1Var.d(user2)))) {
                                        arrayList12.add(user2);
                                        hVar7.k(user2, user2.id);
                                    }
                                } else if (!z21 || (z22 && !ChatObject.canAddBotsToChat(chat))) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                } else {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                    if ((-chat.id) != j18 && v1Var.d(chat)) {
                                        arrayList12.add(chat);
                                        hVar7.k(chat, -chat.id);
                                    }
                                }
                                i22++;
                                tL_contacts_found2 = tL_contacts_found;
                                hVar9 = hVar5;
                                hVar10 = hVar4;
                            }
                        }
                        v1Var.c = str.toLowerCase();
                    }
                }
            }));
        }
        z18 = z17;
        if (!z14) {
            arrayList5.clear();
            hVar3.b();
            String d9 = ne.b.d(str, false);
            ArrayList<TLRPC.TL_contact> arrayList72 = ContactsController.getInstance(i11).contacts;
            size = arrayList72.size();
            z19 = false;
            while (i13 < size) {
            }
            if (!z19) {
            }
            z18 = false;
        }
        AtomicInteger atomicInteger4 = new AtomicInteger(0);
        ArrayList arrayList82 = new ArrayList();
        i12 = 0;
        while (i12 < arrayList6.size()) {
        }
        if (z18) {
        }
    }

    public final void i() {
        a0.h hVar = this.f;
        if (hVar.m() == 0) {
            return;
        }
        a0.h hVar2 = this.h;
        int m10 = hVar2.m();
        for (int i9 = 0; i9 < m10; i9++) {
            TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i9));
            if (user != null) {
                this.e.remove(user);
                this.d.remove(user);
                hVar.l(user.id);
            }
        }
    }
}
