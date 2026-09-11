package hg;

import android.util.Pair;
import fi.j4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class b2 {
    public a2 a;
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
    public final a0.i f = new a0.i();
    public final ArrayList g = new ArrayList();
    public final a0.i h = new a0.i();
    public final a0.i i = new a0.i();
    public final ArrayList j = new ArrayList();
    public final int m = UserConfig.selectedAccount;
    public boolean p = true;
    public boolean s = false;

    public b2(boolean z10) {
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
            z1 z1Var = (z1) this.r.get(charSequence2);
            if (z1Var == null) {
                z1Var = new z1();
                z1Var.a = charSequence2;
                this.r.put(charSequence2, z1Var);
            } else {
                this.q.remove(z1Var);
            }
            z1Var.b = (int) (System.currentTimeMillis() / 1000);
            this.q.add(0, z1Var);
            z10 = true;
        }
        if (z10) {
            MessagesStorage.getInstance(this.m).getStorageQueue().postRunnable(new j4(9, this, this.q));
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
        MessagesStorage.getInstance(this.m).getStorageQueue().postRunnable(new y1(this, 0));
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
        a0.i iVar = this.f;
        if (iVar.m() != 0) {
            if (arrayList == null && arrayList2 == null) {
                return;
            }
            int i10 = 0;
            int size = arrayList == null ? 0 : arrayList.size();
            int size2 = (arrayList2 == null ? 0 : arrayList2.size()) + size;
            while (i10 < size2) {
                Object obj = i10 < size ? arrayList.get(i10) : arrayList2.get(i10 - size);
                if (obj instanceof h0) {
                    obj = ((h0) obj).a;
                }
                if (obj instanceof vp0) {
                    obj = ((vp0) obj).b;
                }
                boolean z10 = obj instanceof TLRPC.User;
                ArrayList arrayList3 = this.d;
                ArrayList arrayList4 = this.e;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) obj;
                    TLRPC.User user2 = (TLRPC.User) iVar.f(user.id);
                    if (user2 != null) {
                        arrayList4.remove(user2);
                        arrayList3.remove(user2);
                        iVar.l(user2.id);
                    }
                    long j3 = user.id;
                    a0.i iVar2 = this.h;
                    TLObject tLObject = (TLObject) iVar2.f(j3);
                    if (tLObject != null) {
                        this.g.remove(tLObject);
                        iVar2.l(user.id);
                    }
                    long j10 = user.id;
                    a0.i iVar3 = this.i;
                    Object f7 = iVar3.f(j10);
                    if (f7 != null) {
                        this.j.remove(f7);
                        iVar3.l(user.id);
                    }
                } else if ((obj instanceof TLRPC.Chat) && (chat = (TLRPC.Chat) iVar.f(-((TLRPC.Chat) obj).id)) != null) {
                    arrayList4.remove(chat);
                    arrayList3.remove(chat);
                    iVar.l(-chat.id);
                }
                i10++;
            }
        }
    }

    public final void g(String str, boolean z10, boolean z11, boolean z12, boolean z13, long j3, boolean z14, int i10, int i11) {
        h(str, z10, z11, z12, z13, false, j3, z14, i10, i11, 0L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0199 A[LOOP:2: B:56:0x0193->B:58:0x0199, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(final String str, boolean z10, final boolean z11, final boolean z12, boolean z13, final boolean z14, long j3, boolean z15, int i10, final int i11, final long j10, final n5 n5Var) {
        int i12;
        boolean z16;
        boolean z17;
        boolean z18;
        int i13;
        int size;
        int i14;
        boolean z19;
        String str2;
        ArrayList arrayList = this.b;
        int size2 = arrayList.size();
        int i15 = 0;
        while (true) {
            i12 = this.m;
            if (i15 >= size2) {
                break;
            }
            Object obj = arrayList.get(i15);
            i15++;
            ConnectionsManager.getInstance(i12).cancelRequest(((Integer) obj).intValue(), true);
        }
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        a0.i iVar = this.f;
        ArrayList arrayList3 = this.e;
        a0.i iVar2 = this.h;
        ArrayList arrayList4 = this.g;
        a0.i iVar3 = this.i;
        ArrayList arrayList5 = this.j;
        if (str == null) {
            arrayList4.clear();
            iVar2.b();
            arrayList3.clear();
            iVar.b();
            arrayList2.clear();
            arrayList5.clear();
            iVar3.b();
            this.a.f(i11);
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        if (str.length() > 0) {
            if (j3 != 0) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                if (i10 == 1) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
                } else if (i10 == 3) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
                } else if (i10 == 0) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsSearch();
                }
                tL_channels_getParticipants.filter.q = str;
                tL_channels_getParticipants.limit = 50;
                tL_channels_getParticipants.offset = 0;
                tL_channels_getParticipants.channel = MessagesController.getInstance(i12).getInputChannel(j3);
                z16 = z13;
                arrayList6.add(new Pair(tL_channels_getParticipants, new di.v1(this, str, z16, 1)));
            } else {
                z16 = z13;
                this.n = str.toLowerCase();
            }
            z17 = false;
        } else {
            z16 = z13;
            arrayList4.clear();
            iVar2.b();
            z17 = true;
        }
        if (z10) {
            if (str.length() <= 0) {
                arrayList3.clear();
                iVar.b();
                arrayList2.clear();
                z18 = false;
                if (!z14 && z15 && str.startsWith("+") && str.length() > 3) {
                    arrayList5.clear();
                    iVar3.b();
                    String d = gf.b.d(str, false);
                    ArrayList<TLRPC.TL_contact> arrayList7 = ContactsController.getInstance(i12).contacts;
                    size = arrayList7.size();
                    z19 = false;
                    for (i14 = 0; i14 < size; i14++) {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(arrayList7.get(i14).user_id));
                        if (user != null && (str2 = user.phone) != null && str2.startsWith(d)) {
                            if (!z19) {
                                z19 = user.phone.length() == d.length();
                            }
                            arrayList5.add(user);
                            iVar3.k(user, user.id);
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
                i13 = 0;
                while (i13 < arrayList6.size()) {
                    TLObject tLObject = (TLObject) ((Pair) arrayList6.get(i13)).first;
                    arrayList8.add(null);
                    final AtomicInteger atomicInteger2 = new AtomicInteger();
                    final AtomicInteger atomicInteger3 = atomicInteger;
                    final ArrayList arrayList9 = arrayList8;
                    final int i16 = i13;
                    final ArrayList arrayList10 = arrayList6;
                    atomicInteger2.set(ConnectionsManager.getInstance(i12).sendRequest(tLObject, new RequestDelegate() { // from class: hg.w1
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                            final b2 b2Var = b2.this;
                            final ArrayList arrayList11 = arrayList9;
                            final int i17 = i16;
                            final AtomicInteger atomicInteger4 = atomicInteger2;
                            final AtomicInteger atomicInteger5 = atomicInteger3;
                            final ArrayList arrayList12 = arrayList10;
                            final int i18 = i11;
                            final Runnable runnable = n5Var;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: hg.x1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Pair pair = new Pair(tLObject2, tL_error);
                                    ArrayList arrayList13 = arrayList11;
                                    arrayList13.set(i17, pair);
                                    Integer valueOf = Integer.valueOf(atomicInteger4.get());
                                    b2 b2Var2 = b2.this;
                                    ArrayList arrayList14 = b2Var2.b;
                                    if (arrayList14.contains(valueOf)) {
                                        arrayList14.remove(valueOf);
                                        int incrementAndGet = atomicInteger5.incrementAndGet();
                                        ArrayList arrayList15 = arrayList12;
                                        if (incrementAndGet == arrayList15.size()) {
                                            for (int i19 = 0; i19 < arrayList15.size(); i19++) {
                                                RequestDelegate requestDelegate = (RequestDelegate) ((Pair) arrayList15.get(i19)).second;
                                                Pair pair2 = (Pair) arrayList13.get(i19);
                                                if (pair2 != null) {
                                                    requestDelegate.run((TLObject) pair2.first, (TLRPC.TL_error) pair2.second);
                                                }
                                            }
                                            b2Var2.i();
                                            ArrayList arrayList16 = b2Var2.k;
                                            if (arrayList16 != null) {
                                                b2Var2.f(arrayList16, b2Var2.l);
                                            }
                                            ArrayList arrayList17 = b2Var2.d;
                                            ArrayList arrayList18 = b2Var2.e;
                                            a0.i iVar4 = b2Var2.f;
                                            a2 a2Var = b2Var2.a;
                                            if (a2Var != null) {
                                                a0.i G = a2Var.G();
                                                if (G != null) {
                                                    int m10 = G.m();
                                                    for (int i20 = 0; i20 < m10; i20++) {
                                                        TLRPC.User user2 = (TLRPC.User) iVar4.f(G.j(i20));
                                                        if (user2 != null) {
                                                            arrayList18.remove(user2);
                                                            arrayList17.remove(user2);
                                                            iVar4.l(user2.id);
                                                        }
                                                    }
                                                }
                                                a0.i w10 = b2Var2.a.w();
                                                if (w10 != null) {
                                                    int m11 = w10.m();
                                                    for (int i21 = 0; i21 < m11; i21++) {
                                                        TLRPC.User user3 = (TLRPC.User) iVar4.f(w10.j(i21));
                                                        if (user3 != null) {
                                                            arrayList18.remove(user3);
                                                            arrayList17.remove(user3);
                                                            iVar4.l(user3.id);
                                                        }
                                                    }
                                                }
                                            }
                                            b2Var2.a.f(i18);
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
                    i13 = i16 + 1;
                    arrayList6 = arrayList10;
                    atomicInteger = atomicInteger3;
                    arrayList8 = arrayList9;
                }
                if (z18) {
                    return;
                }
                this.a.f(i11);
                return;
            }
            TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
            tL_contacts_search.q = str;
            tL_contacts_search.limit = 20;
            final boolean z20 = z16;
            arrayList6.add(new Pair(tL_contacts_search, new RequestDelegate() { // from class: hg.v1
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
                    a0.i iVar4;
                    TLRPC.Chat chat;
                    TLRPC.User user2;
                    TLRPC.TL_contacts_found tL_contacts_found;
                    a0.i iVar5;
                    ArrayList<TLRPC.Peer> arrayList11;
                    boolean z25;
                    TLRPC.Chat chat2;
                    TLRPC.User user3;
                    a0.i iVar6;
                    b2 b2Var = b2.this;
                    boolean z26 = b2Var.o;
                    int i17 = b2Var.m;
                    ArrayList arrayList12 = b2Var.d;
                    ArrayList arrayList13 = b2Var.e;
                    a0.i iVar7 = b2Var.f;
                    if (b2Var.a.Q(i11) && tL_error == null) {
                        TLRPC.TL_contacts_found tL_contacts_found2 = (TLRPC.TL_contacts_found) tLObject2;
                        arrayList13.clear();
                        iVar7.b();
                        arrayList12.clear();
                        MessagesController.getInstance(i17).putChats(tL_contacts_found2.chats, false);
                        MessagesController.getInstance(i17).putUsers(tL_contacts_found2.users, false);
                        MessagesStorage.getInstance(i17).putUsersAndChats(tL_contacts_found2.users, tL_contacts_found2.chats, true, true);
                        a0.i iVar8 = new a0.i();
                        a0.i iVar9 = new a0.i();
                        for (int i18 = 0; i18 < tL_contacts_found2.chats.size(); i18++) {
                            TLRPC.Chat chat3 = tL_contacts_found2.chats.get(i18);
                            iVar8.k(chat3, chat3.id);
                        }
                        for (int i19 = 0; i19 < tL_contacts_found2.users.size(); i19++) {
                            TLRPC.User user4 = tL_contacts_found2.users.get(i19);
                            iVar9.k(user4, user4.id);
                        }
                        int i20 = 0;
                        while (true) {
                            z21 = z11;
                            z22 = z14;
                            z23 = z12;
                            z24 = z20;
                            if (i20 >= 2) {
                                break;
                            }
                            if (i20 != 0) {
                                arrayList11 = tL_contacts_found2.results;
                            } else if (z26) {
                                arrayList11 = tL_contacts_found2.my_results;
                            } else {
                                z25 = z26;
                                i20++;
                                iVar8 = iVar8;
                                z26 = z25;
                            }
                            z25 = z26;
                            int i21 = 0;
                            while (i21 < arrayList11.size()) {
                                TLRPC.Peer peer = arrayList11.get(i21);
                                boolean z27 = z24;
                                int i22 = i21;
                                long j11 = peer.user_id;
                                if (j11 != 0) {
                                    user3 = (TLRPC.User) iVar9.f(j11);
                                    chat2 = null;
                                } else {
                                    long j12 = peer.chat_id;
                                    if (j12 != 0) {
                                        chat2 = (TLRPC.Chat) iVar8.f(j12);
                                    } else {
                                        long j13 = peer.channel_id;
                                        if (j13 != 0) {
                                            chat2 = (TLRPC.Chat) iVar8.f(j13);
                                        } else {
                                            chat2 = null;
                                            user3 = null;
                                        }
                                    }
                                    user3 = null;
                                }
                                if (chat2 != null) {
                                    if (z21 && ((!z22 || ChatObject.canAddBotsToChat(chat2)) && ((b2Var.p || !ChatObject.isNotInChat(chat2)) && b2Var.d(chat2)))) {
                                        arrayList13.add(chat2);
                                        iVar7.k(chat2, -chat2.id);
                                    }
                                } else if (user3 != null) {
                                    if (!z22) {
                                        if (!z23) {
                                        }
                                        if (!z27) {
                                        }
                                        if (!b2Var.p) {
                                            if (i20 == 1) {
                                            }
                                        }
                                        if (b2Var.d(user3)) {
                                            arrayList13.add(user3);
                                            iVar6 = iVar8;
                                            iVar7.k(user3, user3.id);
                                            iVar8 = iVar6;
                                            i21 = i22 + 1;
                                            z24 = z27;
                                        }
                                    }
                                }
                                iVar6 = iVar8;
                                iVar8 = iVar6;
                                i21 = i22 + 1;
                                z24 = z27;
                            }
                            i20++;
                            iVar8 = iVar8;
                            z26 = z25;
                        }
                        a0.i iVar10 = iVar8;
                        if (!z26) {
                            int i23 = 0;
                            while (i23 < tL_contacts_found2.my_results.size()) {
                                TLRPC.Peer peer2 = tL_contacts_found2.my_results.get(i23);
                                long j14 = peer2.user_id;
                                if (j14 != 0) {
                                    iVar4 = iVar10;
                                    user2 = (TLRPC.User) iVar9.f(j14);
                                    chat = null;
                                } else {
                                    long j15 = peer2.chat_id;
                                    if (j15 != 0) {
                                        iVar4 = iVar10;
                                        chat = (TLRPC.Chat) iVar4.f(j15);
                                    } else {
                                        iVar4 = iVar10;
                                        long j16 = peer2.channel_id;
                                        if (j16 != 0) {
                                            chat = (TLRPC.Chat) iVar4.f(j16);
                                        } else {
                                            chat = null;
                                            user2 = null;
                                        }
                                    }
                                    user2 = null;
                                }
                                long j17 = j10;
                                if (chat == null) {
                                    tL_contacts_found = tL_contacts_found2;
                                    iVar5 = iVar9;
                                    if (user2 != null && !z22 && ((z23 || !user2.bot) && ((z24 || !user2.self) && user2.id != j17 && b2Var.d(user2)))) {
                                        arrayList12.add(user2);
                                        iVar7.k(user2, user2.id);
                                    }
                                } else if (!z21 || (z22 && !ChatObject.canAddBotsToChat(chat))) {
                                    tL_contacts_found = tL_contacts_found2;
                                    iVar5 = iVar9;
                                } else {
                                    tL_contacts_found = tL_contacts_found2;
                                    iVar5 = iVar9;
                                    if ((-chat.id) != j17 && b2Var.d(chat)) {
                                        arrayList12.add(chat);
                                        iVar7.k(chat, -chat.id);
                                    }
                                }
                                i23++;
                                tL_contacts_found2 = tL_contacts_found;
                                iVar9 = iVar5;
                                iVar10 = iVar4;
                            }
                        }
                        b2Var.c = str.toLowerCase();
                    }
                }
            }));
        }
        z18 = z17;
        if (!z14) {
            arrayList5.clear();
            iVar3.b();
            String d10 = gf.b.d(str, false);
            ArrayList<TLRPC.TL_contact> arrayList72 = ContactsController.getInstance(i12).contacts;
            size = arrayList72.size();
            z19 = false;
            while (i14 < size) {
            }
            if (!z19) {
            }
            z18 = false;
        }
        AtomicInteger atomicInteger4 = new AtomicInteger(0);
        ArrayList arrayList82 = new ArrayList();
        i13 = 0;
        while (i13 < arrayList6.size()) {
        }
        if (z18) {
        }
    }

    public final void i() {
        a0.i iVar = this.f;
        if (iVar.m() == 0) {
            return;
        }
        a0.i iVar2 = this.h;
        int m10 = iVar2.m();
        for (int i10 = 0; i10 < m10; i10++) {
            TLRPC.User user = (TLRPC.User) iVar.f(iVar2.j(i10));
            if (user != null) {
                this.e.remove(user);
                this.d.remove(user);
                iVar.l(user.id);
            }
        }
    }
}
