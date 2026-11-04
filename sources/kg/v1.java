package kg;

import android.util.Pair;
import ci.t8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.do0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final int m = h10.t0;
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
            qr.a0(this.m).a.c(new ii.e(16, this, this.q));
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
        qr.a0(this.m).a.c(new s1(this, 0));
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
            int i3 = 0;
            int size = arrayList == null ? 0 : arrayList.size();
            int size2 = (arrayList2 == null ? 0 : arrayList2.size()) + size;
            while (i3 < size2) {
                Object obj = i3 < size ? arrayList.get(i3) : arrayList2.get(i3 - size);
                if (obj instanceof d0) {
                    obj = ((d0) obj).a;
                }
                if (obj instanceof do0) {
                    obj = ((do0) obj).b;
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
                i3++;
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j10, boolean z14, int i3, int i10) {
        h(str, z10, z11, z12, z13, false, j10, z14, i3, i10, 0L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a A[LOOP:2: B:56:0x0194->B:58:0x019a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(final String str, boolean z10, final boolean z11, final boolean z12, boolean z13, final boolean z14, long j10, boolean z15, int i3, final int i10, final long j11, final Runnable runnable) {
        int i11;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i12;
        int size;
        int i13;
        boolean z20;
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
            this.a.r(i10);
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        if (str.length() > 0) {
            if (j10 != 0) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                if (i3 == 1) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
                } else if (i3 == 3) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
                } else if (i3 == 0) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsSearch();
                }
                tL_channels_getParticipants.filter.q = str;
                tL_channels_getParticipants.limit = 50;
                tL_channels_getParticipants.offset = 0;
                tL_channels_getParticipants.channel = hp.s1(i11).h1(j10);
                z17 = z13;
                arrayList6.add(new Pair(tL_channels_getParticipants, new t8(this, str, z17, 2)));
            } else {
                z17 = z13;
                this.n = str.toLowerCase();
            }
            z16 = true;
            z18 = false;
        } else {
            z16 = true;
            z17 = z13;
            arrayList4.clear();
            hVar2.b();
            z18 = true;
        }
        if (z10) {
            if (str.length() <= 0) {
                arrayList3.clear();
                hVar.b();
                arrayList2.clear();
                z19 = false;
                if (!z14 && z15 && str.startsWith("+") && str.length() > 3) {
                    arrayList5.clear();
                    hVar3.b();
                    String d = mf.b.d(str, false);
                    ArrayList arrayList7 = g5.r(i11).f0;
                    size = arrayList7.size();
                    z20 = false;
                    for (i13 = 0; i13 < size; i13++) {
                        TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(((TLRPC.TL_contact) arrayList7.get(i13)).user_id));
                        if (a22 != null && (str2 = a22.phone) != null && str2.startsWith(d)) {
                            if (!z20) {
                                z20 = a22.phone.length() == d.length() ? z16 : false;
                            }
                            arrayList5.add(a22);
                            hVar3.k(a22, a22.id);
                        }
                    }
                    if (!z20) {
                        arrayList5.add("section");
                        arrayList5.add(d);
                    }
                    z19 = false;
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
                    atomicInteger2.set(ConnectionsManager.getInstance(i11).sendRequest(tLObject, new RequestDelegate() { // from class: kg.q1
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                            final v1 v1Var = v1.this;
                            final ArrayList arrayList11 = arrayList9;
                            final int i16 = i15;
                            final AtomicInteger atomicInteger4 = atomicInteger2;
                            final AtomicInteger atomicInteger5 = atomicInteger3;
                            final ArrayList arrayList12 = arrayList10;
                            final int i17 = i10;
                            final Runnable runnable2 = runnable;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: kg.r1
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
                                                a0.h k1 = u1Var.k1();
                                                if (k1 != null) {
                                                    int m10 = k1.m();
                                                    for (int i19 = 0; i19 < m10; i19++) {
                                                        TLRPC.User user = (TLRPC.User) hVar4.f(k1.j(i19));
                                                        if (user != null) {
                                                            arrayList18.remove(user);
                                                            arrayList17.remove(user);
                                                            hVar4.l(user.id);
                                                        }
                                                    }
                                                }
                                                a0.h C0 = v1Var2.a.C0();
                                                if (C0 != null) {
                                                    int m11 = C0.m();
                                                    for (int i20 = 0; i20 < m11; i20++) {
                                                        TLRPC.User user2 = (TLRPC.User) hVar4.f(C0.j(i20));
                                                        if (user2 != null) {
                                                            arrayList18.remove(user2);
                                                            arrayList17.remove(user2);
                                                            hVar4.l(user2.id);
                                                        }
                                                    }
                                                }
                                            }
                                            v1Var2.a.r(i17);
                                            Runnable runnable3 = runnable2;
                                            if (runnable3 != null) {
                                                runnable3.run();
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
                if (z19) {
                    return;
                }
                this.a.r(i10);
                return;
            }
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 20;
            final boolean z21 = z17;
            arrayList6.add(new Pair(tL_contacts_search, new RequestDelegate() { // from class: kg.p1
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
                    boolean z22;
                    boolean z23;
                    boolean z24;
                    boolean z25;
                    a0.h hVar4;
                    TLRPC.Chat chat;
                    TLRPC.User user;
                    TLRPC.TL_contacts_found tL_contacts_found;
                    a0.h hVar5;
                    ArrayList<TLRPC.Peer> arrayList11;
                    boolean z26;
                    TLRPC.Chat chat2;
                    TLRPC.User user2;
                    a0.h hVar6;
                    v1 v1Var = v1.this;
                    boolean z27 = v1Var.o;
                    int i16 = v1Var.m;
                    ArrayList arrayList12 = v1Var.d;
                    ArrayList arrayList13 = v1Var.e;
                    a0.h hVar7 = v1Var.f;
                    if (v1Var.a.J1(i10) && tL_error == null) {
                        TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) tLObject2;
                        arrayList13.clear();
                        hVar7.b();
                        arrayList12.clear();
                        hp.s1(i16).S3(tL_contacts_found2.chats, false);
                        hp.s1(i16).Y3(tL_contacts_found2.users, false);
                        qr.a0(i16).m1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        a0.h hVar8 = new a0.h();
                        a0.h hVar9 = new a0.h();
                        for (int i17 = 0; i17 < tL_contacts_found2.chats.size(); i17++) {
                            TLRPC.Chat chat3 = tL_contacts_found2.chats.get(i17);
                            hVar8.k(chat3, chat3.id);
                        }
                        for (int i18 = 0; i18 < tL_contacts_found2.users.size(); i18++) {
                            TLRPC.User user3 = tL_contacts_found2.users.get(i18);
                            hVar9.k(user3, user3.id);
                        }
                        int i19 = 0;
                        while (true) {
                            z22 = z11;
                            z23 = z14;
                            z24 = z12;
                            z25 = z21;
                            if (i19 >= 2) {
                                break;
                            }
                            if (i19 != 0) {
                                arrayList11 = tL_contacts_found2.results;
                            } else if (z27) {
                                arrayList11 = tL_contacts_found2.my_results;
                            } else {
                                z26 = z27;
                                i19++;
                                hVar8 = hVar8;
                                z27 = z26;
                            }
                            z26 = z27;
                            int i20 = 0;
                            while (i20 < arrayList11.size()) {
                                TLRPC.Peer peer = arrayList11.get(i20);
                                boolean z28 = z25;
                                int i21 = i20;
                                long j12 = peer.user_id;
                                if (j12 != 0) {
                                    user2 = (TLRPC.User) hVar9.f(j12);
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
                                            user2 = null;
                                        }
                                    }
                                    user2 = null;
                                }
                                if (chat2 != null) {
                                    if (z22 && ((!z23 || t3.b(chat2)) && ((v1Var.p || !t3.r0(chat2)) && v1Var.d(chat2)))) {
                                        arrayList13.add(chat2);
                                        hVar7.k(chat2, -chat2.id);
                                    }
                                } else if (user2 != null) {
                                    if (!z23) {
                                        if (!z24) {
                                        }
                                        if (!z28) {
                                        }
                                        if (!v1Var.p) {
                                            if (i19 == 1) {
                                            }
                                        }
                                        if (v1Var.d(user2)) {
                                            arrayList13.add(user2);
                                            hVar6 = hVar8;
                                            hVar7.k(user2, user2.id);
                                            hVar8 = hVar6;
                                            i20 = i21 + 1;
                                            z25 = z28;
                                        }
                                    }
                                }
                                hVar6 = hVar8;
                                hVar8 = hVar6;
                                i20 = i21 + 1;
                                z25 = z28;
                            }
                            i19++;
                            hVar8 = hVar8;
                            z27 = z26;
                        }
                        a0.h hVar10 = hVar8;
                        if (!z27) {
                            int i22 = 0;
                            while (i22 < tL_contacts_found2.my_results.size()) {
                                TLRPC.Peer peer2 = tL_contacts_found2.my_results.get(i22);
                                long j15 = peer2.user_id;
                                if (j15 != 0) {
                                    hVar4 = hVar10;
                                    user = (TLRPC.User) hVar9.f(j15);
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
                                            user = null;
                                        }
                                    }
                                    user = null;
                                }
                                long j18 = j11;
                                if (chat == null) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                    if (user != null && !z23 && ((z24 || !user.bot) && ((z25 || !user.self) && user.id != j18 && v1Var.d(user)))) {
                                        arrayList12.add(user);
                                        hVar7.k(user, user.id);
                                    }
                                } else if (!z22 || (z23 && !t3.b(chat))) {
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
        z19 = z18;
        if (!z14) {
            arrayList5.clear();
            hVar3.b();
            String d10 = mf.b.d(str, false);
            ArrayList arrayList72 = g5.r(i11).f0;
            size = arrayList72.size();
            z20 = false;
            while (i13 < size) {
            }
            if (!z20) {
            }
            z19 = false;
        }
        AtomicInteger atomicInteger4 = new AtomicInteger(0);
        ArrayList arrayList82 = new ArrayList();
        i12 = 0;
        while (i12 < arrayList6.size()) {
        }
        if (z19) {
        }
    }

    public final void i() {
        a0.h hVar = this.f;
        if (hVar.m() == 0) {
            return;
        }
        a0.h hVar2 = this.h;
        int m10 = hVar2.m();
        for (int i3 = 0; i3 < m10; i3++) {
            TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i3));
            if (user != null) {
                this.e.remove(user);
                this.d.remove(user);
                hVar.l(user.id);
            }
        }
    }
}
