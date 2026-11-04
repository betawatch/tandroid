package org.telegram.messenger;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class nv {
    public final int a;
    public boolean b;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean o;
    public final ArrayList c = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final lv n = new lv(this, 4);
    public final a0.h p = new a0.h();

    public nv(int i3) {
        this.a = i3;
        this.b = hp.s1(i3).e7.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            mv mvVar = (mv) arrayList.get(i3);
            if (mvVar.b) {
                arrayList2.add(Long.valueOf(mvVar.a));
            }
        }
        return arrayList2;
    }

    public static void h() {
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", h10.i(Q.getCurrentAccount()).e());
        Q.presentFragment(new org.telegram.ui.wm(bundle));
    }

    public static boolean k(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (Objects.equals(arrayList.get(i3), arrayList2.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean o(ArrayList arrayList, ArrayList arrayList2) {
        if (k(arrayList2, d(arrayList))) {
            return false;
        }
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            mv mvVar = (mv) arrayList.get(i3);
            if (mvVar.b) {
                mvVar.b = false;
                arrayList3.add(mvVar);
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            mv mvVar2 = (mv) arrayList.get(i10);
            int indexOf = arrayList2.indexOf(Long.valueOf(mvVar2.a));
            if (indexOf >= 0) {
                mvVar2.k = indexOf;
                mvVar2.b = true;
                arrayList4.add(mvVar2);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        Collections.sort(arrayList, new tq(5));
        Collections.sort(arrayList4, new tq(6));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public final void a() {
        this.c.clear();
        this.i.clear();
        this.e = false;
        this.g = 0;
        this.h = 0;
        this.f = false;
        this.l = true;
        boolean z10 = this.o;
        int i3 = this.a;
        if (!z10) {
            this.o = true;
            qr a02 = qr.a0(i3);
            a02.a.c(new pq(this, a02));
        }
        this.b = true;
        hp.s1(i3).e7.edit().remove("savedMessagesUnsupported").apply();
    }

    public final void b() {
        this.g = 0;
        this.j.clear();
        this.i.clear();
        this.c.clear();
        l();
    }

    public final int c() {
        return this.f ? this.j.size() : this.e ? this.g - this.h : this.c.size();
    }

    public final boolean e() {
        if (c() <= 0) {
            return false;
        }
        long e10 = h10.i(this.a).e();
        ArrayList arrayList = this.j;
        return (arrayList.size() == 1 && ((mv) arrayList.get(0)).a == e10) ? false : true;
    }

    public final void f(long j10, u10 u10Var) {
        mv mvVar;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i3 >= arrayList.size()) {
                mvVar = null;
                break;
            }
            mvVar = (mv) arrayList.get(i3);
            if (mvVar.a == j10) {
                break;
            } else {
                i3++;
            }
        }
        if (mvVar != null && mvVar.e > 0 && mvVar.i) {
            if (u10Var != null) {
                u10Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        a0.h hVar = this.p;
        ArrayList arrayList2 = (ArrayList) hVar.f(j10);
        if (arrayList2 != null) {
            if (u10Var != null) {
                arrayList2.add(u10Var);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (u10Var != null) {
            arrayList3.add(u10Var);
        }
        hVar.k(arrayList3, j10);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i10 = this.a;
        tL_messages_getSavedHistory.peer = hp.s1(i10).j1(j10);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = ConnectionsManager.DEFAULT_DATACENTER_ID;
        tL_messages_getSavedHistory.offset_date = ConnectionsManager.DEFAULT_DATACENTER_ID;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getSavedHistory, new p4(this, j10, 2));
    }

    public final void g(boolean z10) {
        boolean z11;
        this.m = z10;
        if (!this.d && !this.f && !(z11 = this.k)) {
            boolean z12 = this.l;
            int i3 = this.a;
            if (z12) {
                if (z10) {
                    return;
                }
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.i;
                mv mvVar = arrayList.isEmpty() ? null : (mv) k2.p1.h(1, arrayList);
                if (mvVar != null) {
                    tL_messages_getSavedDialogs.offset_id = mvVar.c;
                    tL_messages_getSavedDialogs.offset_date = mvVar.c();
                    tL_messages_getSavedDialogs.offset_peer = hp.s1(i3).j1(mvVar.a);
                } else {
                    tL_messages_getSavedDialogs.offset_id = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    tL_messages_getSavedDialogs.offset_date = 0;
                    tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                tL_messages_getSavedDialogs.limit = 20;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                ArrayList arrayList3 = this.j;
                arrayList2.addAll(arrayList3.subList(Math.min(size, arrayList3.size()), Math.min(arrayList.size() + tL_messages_getSavedDialogs.limit, arrayList3.size())));
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    mv mvVar2 = (mv) arrayList2.get(i10);
                    long p10 = li.p(tL_messages_getSavedDialogs.hash, mvVar2.b ? 1L : 0L);
                    tL_messages_getSavedDialogs.hash = p10;
                    long p11 = li.p(p10, Math.abs(mvVar2.a));
                    tL_messages_getSavedDialogs.hash = p11;
                    long p12 = li.p(p11, mvVar2.c);
                    tL_messages_getSavedDialogs.hash = p12;
                    tL_messages_getSavedDialogs.hash = li.p(p12, mvVar2.c());
                }
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getSavedDialogs, new s4(8, this, arrayList2));
                return;
            }
            lv lvVar = new lv(this, 0);
            if (!z11) {
                this.k = true;
                long e10 = h10.i(i3).e();
                qr a02 = qr.a0(i3);
                a02.a.c(new zl(this, a02, e10, lvVar, 18));
            }
        }
    }

    public final void i(TLRPC.Update update) {
        boolean z10 = false;
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                long o10 = m5.o(((TLRPC.TL_dialogPeer) dialogPeer).peer);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(o10));
                z10 = n(arrayList, tL_updateSavedDialogPinned.pinned, false);
            }
        } else if (update instanceof TL_update.TL_updatePinnedSavedDialogs) {
            TL_update.TL_updatePinnedSavedDialogs tL_updatePinnedSavedDialogs = (TL_update.TL_updatePinnedSavedDialogs) update;
            ArrayList arrayList2 = new ArrayList(tL_updatePinnedSavedDialogs.order.size());
            for (int i3 = 0; i3 < tL_updatePinnedSavedDialogs.order.size(); i3++) {
                TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i3);
                if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                    arrayList2.add(Long.valueOf(m5.o(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
                }
            }
            boolean o11 = o(this.i, arrayList2);
            boolean o12 = o(this.c, arrayList2);
            if (o11 || o12) {
                z10 = true;
            }
        }
        if (z10) {
            l();
        }
    }

    public final int j(long j10) {
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((mv) arrayList.get(i10)).a == j10) {
                arrayList.remove(i10);
                i11++;
                i10--;
            }
            i10++;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((mv) arrayList2.get(i12)).a == j10) {
                arrayList2.remove(i12);
                i13++;
                i12--;
            }
            i12++;
        }
        while (true) {
            ArrayList arrayList3 = this.c;
            if (i3 >= arrayList3.size()) {
                return Math.max(i11, i13);
            }
            if (((mv) arrayList3.get(i3)).a == j10) {
                arrayList3.remove(i3);
                i3--;
            }
            i3++;
        }
    }

    public final void l() {
        m();
        lv lvVar = this.n;
        g0.r(lvVar);
        g0.i3(lvVar, 450L);
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            arrayList = this.c;
            if (i3 >= arrayList.size()) {
                break;
            }
            mv mvVar = (mv) arrayList.get(i3);
            if (mvVar.b && !hashSet.contains(Long.valueOf(mvVar.a)) && !mvVar.d()) {
                arrayList3.add(mvVar);
                hashSet.add(Long.valueOf(mvVar.a));
            }
            i3++;
        }
        int i10 = 0;
        while (true) {
            arrayList2 = this.i;
            if (i10 >= arrayList2.size()) {
                break;
            }
            mv mvVar2 = (mv) arrayList2.get(i10);
            if (mvVar2.b && !hashSet.contains(Long.valueOf(mvVar2.a)) && !mvVar2.d()) {
                arrayList3.add(mvVar2);
                hashSet.add(Long.valueOf(mvVar2.a));
            }
            i10++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            mv mvVar3 = (mv) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(mvVar3.a)) && !mvVar3.d()) {
                arrayList4.add(mvVar3);
                hashSet.add(Long.valueOf(mvVar3.a));
            }
        }
        if (!this.f) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                mv mvVar4 = (mv) arrayList.get(i12);
                if (!hashSet.contains(Long.valueOf(mvVar4.a)) && !mvVar4.d()) {
                    arrayList4.add(mvVar4);
                    hashSet.add(Long.valueOf(mvVar4.a));
                }
            }
        }
        Collections.sort(arrayList4, new tq(7));
        arrayList3.addAll(arrayList4);
        int i13 = this.a;
        hs.f(i13).k(hs.g3, new Object[0]);
        if (e() || !hp.s1(i13).o6) {
            return;
        }
        hp.s1(i13).N4(false);
    }

    public final boolean n(ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList d = d(this.j);
        ArrayList arrayList2 = new ArrayList(d);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Long l10 = (Long) arrayList.get(size);
            l10.getClass();
            if (z10 && !arrayList2.contains(l10)) {
                arrayList2.add(0, l10);
            } else if (!z10) {
                arrayList2.remove(l10);
            }
        }
        int i3 = this.a;
        if (arrayList2.size() <= (h10.i(i3).q() ? hp.s1(i3).n6 : hp.s1(i3).m6) && !k(d, arrayList2)) {
            if (z11) {
                p(arrayList2);
                return true;
            }
            boolean o10 = o(this.i, arrayList2);
            boolean o11 = o(this.c, arrayList2);
            if (o10 || o11) {
                return true;
            }
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        boolean o10 = o(this.i, arrayList);
        boolean o11 = o(this.c, arrayList);
        if (!o10 && !o11) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        int i3 = 0;
        while (true) {
            int size = arrayList.size();
            int i10 = this.a;
            if (i3 >= size) {
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reorderPinnedSavedDialogs, null);
                l();
                return;
            } else {
                long longValue = ((Long) arrayList.get(i3)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = hp.s1(i10).j1(longValue);
                tL_messages_reorderPinnedSavedDialogs.order.add(tL_inputDialogPeer);
                i3++;
            }
        }
    }

    public final boolean q(ArrayList arrayList) {
        ArrayList arrayList2;
        a0.h hVar;
        boolean z10;
        ArrayList arrayList3;
        int i3;
        boolean z11;
        int i10 = 0;
        if (arrayList == null) {
            return false;
        }
        a0.h hVar2 = new a0.h();
        a0.h hVar3 = new a0.h();
        new HashSet();
        int i11 = this.a;
        long e10 = h10.i(i11).e();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
            long R1 = zi.R1(e10, message);
            if (R1 == e10 || (message.id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar2.f(R1);
                if (message2 == null || message2.id < message.id) {
                    hVar2.k(message, R1);
                }
                Integer num = (Integer) hVar3.f(R1);
                hVar3.k(Integer.valueOf((num == null ? 0 : num.intValue()) + 1), R1);
            }
        }
        int i13 = 0;
        boolean z12 = false;
        while (i13 < hVar2.m()) {
            long j10 = hVar2.j(i13);
            TLRPC.Message message3 = (TLRPC.Message) hVar2.n(i13);
            Integer num2 = (Integer) hVar3.f(j10);
            int i14 = i10;
            while (true) {
                arrayList2 = this.c;
                if (i14 >= arrayList2.size()) {
                    hVar = hVar2;
                    z10 = false;
                    break;
                }
                mv mvVar = (mv) arrayList2.get(i14);
                hVar = hVar2;
                if (mvVar.a == j10) {
                    int i15 = mvVar.c;
                    int i16 = message3.id;
                    if (i15 < i16 || (i16 < 0 && message3.date > mvVar.c())) {
                        if (mvVar.c < message3.id) {
                            int i17 = 0;
                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                if (((TLRPC.Message) arrayList.get(i18)).id > mvVar.c) {
                                    i17++;
                                }
                            }
                            mvVar.e += i17;
                        }
                        zi ziVar = new zi(i11, message3, false, false);
                        mvVar.d = ziVar;
                        mvVar.c = ziVar.f1();
                        z12 = true;
                    }
                    num2 = Integer.valueOf(num2 != null ? Math.max(num2.intValue(), mvVar.e) : mvVar.e);
                    z10 = true;
                } else {
                    i14++;
                    hVar2 = hVar;
                }
            }
            if (!z10) {
                mv a10 = mv.a(i11, message3);
                if (num2 != null) {
                    a10.e = num2.intValue();
                }
                arrayList2.add(a10);
                z12 = true;
            }
            int i19 = 0;
            while (true) {
                arrayList3 = this.i;
                if (i19 >= arrayList3.size()) {
                    i3 = 0;
                    z11 = false;
                    break;
                }
                mv mvVar2 = (mv) arrayList3.get(i19);
                if (mvVar2.a == j10) {
                    int i20 = mvVar2.c;
                    int i21 = message3.id;
                    if (i20 < i21 || (i21 < 0 && message3.date > mvVar2.c())) {
                        if (mvVar2.c < message3.id) {
                            int i22 = 0;
                            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                                if (((TLRPC.Message) arrayList.get(i23)).id > mvVar2.c) {
                                    i22++;
                                }
                            }
                            mvVar2.e += i22;
                        }
                        i3 = 0;
                        zi ziVar2 = new zi(i11, message3, false, false);
                        mvVar2.d = ziVar2;
                        mvVar2.c = ziVar2.f1();
                        z12 = true;
                    } else {
                        i3 = 0;
                    }
                    num2 = Integer.valueOf(num2 != null ? Math.max(num2.intValue(), mvVar2.e) : mvVar2.e);
                    z11 = true;
                } else {
                    i19++;
                }
            }
            if (!z11) {
                mv a11 = mv.a(i11, message3);
                if (num2 != null) {
                    a11.e = num2.intValue();
                }
                arrayList3.add(a11);
                z12 = true;
            }
            i13++;
            i10 = i3;
            hVar2 = hVar;
        }
        return z12;
    }

    public final boolean r(int i3, long j10, boolean z10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i10 >= arrayList.size()) {
                break;
            }
            mv mvVar = (mv) arrayList.get(i10);
            if (mvVar.a != j10) {
                i10++;
            } else if (mvVar.e != i3 || (!mvVar.i && z10)) {
                mvVar.e = i3;
                mvVar.i = true;
                return true;
            }
        }
        return false;
    }
}
