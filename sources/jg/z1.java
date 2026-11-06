package jg;

import android.util.Pair;
import bi.u9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.g5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bo0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class z1 {
    public y1 a;
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
    public final int m = p10.s0;
    public boolean p = true;
    public boolean s = false;

    public z1(boolean z9) {
        this.o = z9;
    }

    public final void a(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        Matcher matcher = Pattern.compile("(^|\\s)#[^0-9][\\w@.]+").matcher(charSequence);
        boolean z9 = false;
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
            x1 x1Var = (x1) this.r.get(charSequence2);
            if (x1Var == null) {
                x1Var = new x1();
                x1Var.a = charSequence2;
                this.r.put(charSequence2, x1Var);
            } else {
                this.q.remove(x1Var);
            }
            x1Var.b = (int) (System.currentTimeMillis() / 1000);
            this.q.add(0, x1Var);
            z9 = true;
        }
        if (z9) {
            yr.a0(this.m).a.c(new ha.b(15, this, this.q));
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
        yr.a0(this.m).a.c(new w1(this, 0));
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
            int i7 = 0;
            int size = arrayList == null ? 0 : arrayList.size();
            int size2 = (arrayList2 == null ? 0 : arrayList2.size()) + size;
            while (i7 < size2) {
                Object obj = i7 < size ? arrayList.get(i7) : arrayList2.get(i7 - size);
                if (obj instanceof g0) {
                    obj = ((g0) obj).a;
                }
                if (obj instanceof bo0) {
                    obj = ((bo0) obj).b;
                }
                boolean z9 = obj instanceof TLRPC.User;
                ArrayList arrayList3 = this.d;
                ArrayList arrayList4 = this.e;
                if (z9) {
                    TLRPC.User user = (TLRPC.User) obj;
                    TLRPC.User user2 = (TLRPC.User) hVar.f(user.id);
                    if (user2 != null) {
                        arrayList4.remove(user2);
                        arrayList3.remove(user2);
                        hVar.l(user2.id);
                    }
                    long j3 = user.id;
                    a0.h hVar2 = this.h;
                    TLObject tLObject = (TLObject) hVar2.f(j3);
                    if (tLObject != null) {
                        this.g.remove(tLObject);
                        hVar2.l(user.id);
                    }
                    long j10 = user.id;
                    a0.h hVar3 = this.i;
                    Object f10 = hVar3.f(j10);
                    if (f10 != null) {
                        this.j.remove(f10);
                        hVar3.l(user.id);
                    }
                } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) hVar.f(-((TLRPC.Chat) obj).id)) != null) {
                    arrayList4.remove(chat);
                    arrayList3.remove(chat);
                    hVar.l(-chat.id);
                }
                i7++;
            }
        }
    }

    public final void g(String str, boolean z9, boolean z10, boolean z11, boolean z12, long j3, boolean z13, int i7, int i10) {
        h(str, z9, z10, z11, z12, false, j3, z13, i7, i10, 0L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a A[LOOP:2: B:56:0x0194->B:58:0x019a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(final String str, boolean z9, final boolean z10, final boolean z11, boolean z12, final boolean z13, long j3, boolean z14, int i7, final int i10, final long j10, final Runnable runnable) {
        int i11;
        boolean z15;
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
            this.a.q(i10);
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        if (str.length() > 0) {
            if (j3 != 0) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                if (i7 == 1) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
                } else if (i7 == 3) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
                } else if (i7 == 0) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsSearch();
                }
                tL_channels_getParticipants.filter.q = str;
                tL_channels_getParticipants.limit = 50;
                tL_channels_getParticipants.offset = 0;
                tL_channels_getParticipants.channel = qp.s1(i11).h1(j3);
                z16 = z12;
                arrayList6.add(new Pair(tL_channels_getParticipants, new u9(this, str, z16, 2)));
            } else {
                z16 = z12;
                this.n = str.toLowerCase();
            }
            z15 = true;
            z17 = false;
        } else {
            z15 = true;
            z16 = z12;
            arrayList4.clear();
            hVar2.b();
            z17 = true;
        }
        if (z9) {
            if (str.length() <= 0) {
                arrayList3.clear();
                hVar.b();
                arrayList2.clear();
                z18 = false;
                if (!z13 && z14 && str.startsWith("+") && str.length() > 3) {
                    arrayList5.clear();
                    hVar3.b();
                    String d = pf.b.d(str, false);
                    ArrayList arrayList7 = g5.r(i11).e0;
                    size = arrayList7.size();
                    z19 = false;
                    for (i13 = 0; i13 < size; i13++) {
                        TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(((TLRPC.TL_contact) arrayList7.get(i13)).user_id));
                        if (a22 != null && (str2 = a22.phone) != null && str2.startsWith(d)) {
                            if (!z19) {
                                z19 = a22.phone.length() == d.length() ? z15 : false;
                            }
                            arrayList5.add(a22);
                            hVar3.k(a22, a22.id);
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
                    atomicInteger2.set(ConnectionsManager.getInstance(i11).sendRequest(tLObject, new RequestDelegate() { // from class: jg.u1
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                            final z1 z1Var = z1.this;
                            final ArrayList arrayList11 = arrayList9;
                            final int i16 = i15;
                            final AtomicInteger atomicInteger4 = atomicInteger2;
                            final AtomicInteger atomicInteger5 = atomicInteger3;
                            final ArrayList arrayList12 = arrayList10;
                            final int i17 = i10;
                            final Runnable runnable2 = runnable;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: jg.v1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Pair pair = new Pair(tLObject2, tL_error);
                                    ArrayList arrayList13 = arrayList11;
                                    arrayList13.set(i16, pair);
                                    Integer valueOf = Integer.valueOf(atomicInteger4.get());
                                    z1 z1Var2 = z1.this;
                                    ArrayList arrayList14 = z1Var2.b;
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
                                            z1Var2.i();
                                            ArrayList arrayList16 = z1Var2.k;
                                            if (arrayList16 != null) {
                                                z1Var2.f(arrayList16, z1Var2.l);
                                            }
                                            ArrayList arrayList17 = z1Var2.d;
                                            ArrayList arrayList18 = z1Var2.e;
                                            a0.h hVar4 = z1Var2.f;
                                            y1 y1Var = z1Var2.a;
                                            if (y1Var != null) {
                                                a0.h X0 = y1Var.X0();
                                                if (X0 != null) {
                                                    int m10 = X0.m();
                                                    for (int i19 = 0; i19 < m10; i19++) {
                                                        TLRPC.User user = (TLRPC.User) hVar4.f(X0.j(i19));
                                                        if (user != null) {
                                                            arrayList18.remove(user);
                                                            arrayList17.remove(user);
                                                            hVar4.l(user.id);
                                                        }
                                                    }
                                                }
                                                a0.h v02 = z1Var2.a.v0();
                                                if (v02 != null) {
                                                    int m11 = v02.m();
                                                    for (int i20 = 0; i20 < m11; i20++) {
                                                        TLRPC.User user2 = (TLRPC.User) hVar4.f(v02.j(i20));
                                                        if (user2 != null) {
                                                            arrayList18.remove(user2);
                                                            arrayList17.remove(user2);
                                                            hVar4.l(user2.id);
                                                        }
                                                    }
                                                }
                                            }
                                            z1Var2.a.q(i17);
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
                if (z18) {
                    return;
                }
                this.a.q(i10);
                return;
            }
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 20;
            final boolean z20 = z16;
            arrayList6.add(new Pair(tL_contacts_search, new RequestDelegate() { // from class: jg.t1
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
                    TLRPC.User user;
                    TLRPC.TL_contacts_found tL_contacts_found;
                    a0.h hVar5;
                    ArrayList<TLRPC.Peer> arrayList11;
                    boolean z25;
                    TLRPC.Chat chat2;
                    TLRPC.User user2;
                    a0.h hVar6;
                    z1 z1Var = z1.this;
                    boolean z26 = z1Var.o;
                    int i16 = z1Var.m;
                    ArrayList arrayList12 = z1Var.d;
                    ArrayList arrayList13 = z1Var.e;
                    a0.h hVar7 = z1Var.f;
                    if (z1Var.a.k1(i10) && tL_error == null) {
                        TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) tLObject2;
                        arrayList13.clear();
                        hVar7.b();
                        arrayList12.clear();
                        qp.s1(i16).S3(tL_contacts_found2.chats, false);
                        qp.s1(i16).Y3(tL_contacts_found2.users, false);
                        yr.a0(i16).m1(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
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
                            z21 = z10;
                            z22 = z13;
                            z23 = z11;
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
                                long j11 = peer.user_id;
                                if (j11 != 0) {
                                    user2 = (TLRPC.User) hVar9.f(j11);
                                    chat2 = null;
                                } else {
                                    long j12 = peer.chat_id;
                                    if (j12 != 0) {
                                        chat2 = (TLRPC.Chat) hVar8.f(j12);
                                    } else {
                                        long j13 = peer.channel_id;
                                        if (j13 != 0) {
                                            chat2 = (TLRPC.Chat) hVar8.f(j13);
                                        } else {
                                            chat2 = null;
                                            user2 = null;
                                        }
                                    }
                                    user2 = null;
                                }
                                if (chat2 != null) {
                                    if (z21 && ((!z22 || t3.b(chat2)) && ((z1Var.p || !t3.r0(chat2)) && z1Var.d(chat2)))) {
                                        arrayList13.add(chat2);
                                        hVar7.k(chat2, -chat2.id);
                                    }
                                } else if (user2 != null) {
                                    if (!z22) {
                                        if (!z23) {
                                        }
                                        if (!z27) {
                                        }
                                        if (!z1Var.p) {
                                            if (i19 == 1) {
                                            }
                                        }
                                        if (z1Var.d(user2)) {
                                            arrayList13.add(user2);
                                            hVar6 = hVar8;
                                            hVar7.k(user2, user2.id);
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
                                long j14 = peer2.user_id;
                                if (j14 != 0) {
                                    hVar4 = hVar10;
                                    user = (TLRPC.User) hVar9.f(j14);
                                    chat = null;
                                } else {
                                    long j15 = peer2.chat_id;
                                    if (j15 != 0) {
                                        hVar4 = hVar10;
                                        chat = (TLRPC.Chat) hVar4.f(j15);
                                    } else {
                                        hVar4 = hVar10;
                                        long j16 = peer2.channel_id;
                                        if (j16 != 0) {
                                            chat = (TLRPC.Chat) hVar4.f(j16);
                                        } else {
                                            chat = null;
                                            user = null;
                                        }
                                    }
                                    user = null;
                                }
                                long j17 = j10;
                                if (chat == null) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                    if (user != null && !z22 && ((z23 || !user.bot) && ((z24 || !user.self) && user.id != j17 && z1Var.d(user)))) {
                                        arrayList12.add(user);
                                        hVar7.k(user, user.id);
                                    }
                                } else if (!z21 || (z22 && !t3.b(chat))) {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                } else {
                                    tL_contacts_found = tL_contacts_found2;
                                    hVar5 = hVar9;
                                    if ((-chat.id) != j17 && z1Var.d(chat)) {
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
                        z1Var.c = str.toLowerCase();
                    }
                }
            }));
        }
        z18 = z17;
        if (!z13) {
            arrayList5.clear();
            hVar3.b();
            String d2 = pf.b.d(str, false);
            ArrayList arrayList72 = g5.r(i11).e0;
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
        for (int i7 = 0; i7 < m10; i7++) {
            TLRPC.User user = (TLRPC.User) hVar.f(hVar2.j(i7));
            if (user != null) {
                this.e.remove(user);
                this.d.remove(user);
                hVar.l(user.id);
            }
        }
    }
}
