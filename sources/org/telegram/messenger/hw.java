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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class hw {
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
    public final fw n = new fw(this, 4);
    public final a0.h p = new a0.h();

    public hw(int i10) {
        this.a = i10;
        this.b = wp.r1(i10).f7.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            gw gwVar = (gw) arrayList.get(i10);
            if (gwVar.b) {
                arrayList2.add(Long.valueOf(gwVar.a));
            }
        }
        return arrayList2;
    }

    public static void h() {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", e20.i(Q.getCurrentAccount()).e());
        Q.presentFragment(new org.telegram.ui.un(bundle));
    }

    public static boolean k(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (Objects.equals(arrayList.get(i10), arrayList2.get(i10))) {
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
        int i10 = 0;
        while (i10 < arrayList.size()) {
            gw gwVar = (gw) arrayList.get(i10);
            if (gwVar.b) {
                gwVar.b = false;
                arrayList3.add(gwVar);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            gw gwVar2 = (gw) arrayList.get(i11);
            int indexOf = arrayList2.indexOf(Long.valueOf(gwVar2.a));
            if (indexOf >= 0) {
                gwVar2.k = indexOf;
                gwVar2.b = true;
                arrayList4.add(gwVar2);
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        Collections.sort(arrayList, new ck(17));
        Collections.sort(arrayList4, new ck(18));
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
        int i10 = this.a;
        if (!z10) {
            this.o = true;
            is a02 = is.a0(i10);
            a02.a.c(new ir(this, a02));
        }
        this.b = true;
        wp.r1(i10).f7.edit().remove("savedMessagesUnsupported").apply();
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
        long e = e20.i(this.a).e();
        ArrayList arrayList = this.j;
        return (arrayList.size() == 1 && ((gw) arrayList.get(0)).a == e) ? false : true;
    }

    public final void f(long j10, r20 r20Var) {
        gw gwVar;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i10 >= arrayList.size()) {
                gwVar = null;
                break;
            }
            gwVar = (gw) arrayList.get(i10);
            if (gwVar.a == j10) {
                break;
            } else {
                i10++;
            }
        }
        if (gwVar != null && gwVar.e > 0 && gwVar.i) {
            if (r20Var != null) {
                r20Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        a0.h hVar = this.p;
        ArrayList arrayList2 = (ArrayList) hVar.f(j10);
        if (arrayList2 != null) {
            if (r20Var != null) {
                arrayList2.add(r20Var);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (r20Var != null) {
            arrayList3.add(r20Var);
        }
        hVar.k(arrayList3, j10);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i11 = this.a;
        tL_messages_getSavedHistory.peer = wp.r1(i11).i1(j10);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = ConnectionsManager.DEFAULT_DATACENTER_ID;
        tL_messages_getSavedHistory.offset_date = ConnectionsManager.DEFAULT_DATACENTER_ID;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getSavedHistory, new s4(this, j10, 2));
    }

    public final void g(boolean z10) {
        boolean z11;
        this.m = z10;
        if (!this.d && !this.f && !(z11 = this.k)) {
            boolean z12 = this.l;
            int i10 = this.a;
            if (z12) {
                if (z10) {
                    return;
                }
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.i;
                gw gwVar = arrayList.isEmpty() ? null : (gw) i0.a.g(1, arrayList);
                if (gwVar != null) {
                    tL_messages_getSavedDialogs.offset_id = gwVar.c;
                    tL_messages_getSavedDialogs.offset_date = gwVar.c();
                    tL_messages_getSavedDialogs.offset_peer = wp.r1(i10).i1(gwVar.a);
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
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    gw gwVar2 = (gw) arrayList2.get(i11);
                    long p5 = vi.p(tL_messages_getSavedDialogs.hash, gwVar2.b ? 1L : 0L);
                    tL_messages_getSavedDialogs.hash = p5;
                    long p9 = vi.p(p5, Math.abs(gwVar2.a));
                    tL_messages_getSavedDialogs.hash = p9;
                    long p10 = vi.p(p9, gwVar2.c);
                    tL_messages_getSavedDialogs.hash = p10;
                    tL_messages_getSavedDialogs.hash = vi.p(p10, gwVar2.c());
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getSavedDialogs, new v4(8, this, arrayList2));
                return;
            }
            fw fwVar = new fw(this, 0);
            if (!z11) {
                this.k = true;
                long e = e20.i(i10).e();
                is a02 = is.a0(i10);
                a02.a.c(new xm(this, a02, e, fwVar, 19));
            }
        }
    }

    public final void i(TLRPC.Update update) {
        boolean z10 = false;
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                long o10 = o5.o(((TLRPC.TL_dialogPeer) dialogPeer).peer);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(o10));
                z10 = n(arrayList, tL_updateSavedDialogPinned.pinned, false);
            }
        } else if (update instanceof TL_update.TL_updatePinnedSavedDialogs) {
            TL_update.TL_updatePinnedSavedDialogs tL_updatePinnedSavedDialogs = (TL_update.TL_updatePinnedSavedDialogs) update;
            ArrayList arrayList2 = new ArrayList(tL_updatePinnedSavedDialogs.order.size());
            for (int i10 = 0; i10 < tL_updatePinnedSavedDialogs.order.size(); i10++) {
                TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i10);
                if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                    arrayList2.add(Long.valueOf(o5.o(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
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
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (((gw) arrayList.get(i11)).a == j10) {
                arrayList.remove(i11);
                i12++;
                i11--;
            }
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i13 >= arrayList2.size()) {
                break;
            }
            if (((gw) arrayList2.get(i13)).a == j10) {
                arrayList2.remove(i13);
                i14++;
                i13--;
            }
            i13++;
        }
        while (true) {
            ArrayList arrayList3 = this.c;
            if (i10 >= arrayList3.size()) {
                return Math.max(i12, i14);
            }
            if (((gw) arrayList3.get(i10)).a == j10) {
                arrayList3.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void l() {
        m();
        fw fwVar = this.n;
        i0.r(fwVar);
        i0.h3(fwVar, 450L);
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            gw gwVar = (gw) arrayList.get(i10);
            if (gwVar.b && !hashSet.contains(Long.valueOf(gwVar.a)) && !gwVar.d()) {
                arrayList3.add(gwVar);
                hashSet.add(Long.valueOf(gwVar.a));
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            arrayList2 = this.i;
            if (i11 >= arrayList2.size()) {
                break;
            }
            gw gwVar2 = (gw) arrayList2.get(i11);
            if (gwVar2.b && !hashSet.contains(Long.valueOf(gwVar2.a)) && !gwVar2.d()) {
                arrayList3.add(gwVar2);
                hashSet.add(Long.valueOf(gwVar2.a));
            }
            i11++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            gw gwVar3 = (gw) arrayList2.get(i12);
            if (!hashSet.contains(Long.valueOf(gwVar3.a)) && !gwVar3.d()) {
                arrayList4.add(gwVar3);
                hashSet.add(Long.valueOf(gwVar3.a));
            }
        }
        if (!this.f) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                gw gwVar4 = (gw) arrayList.get(i13);
                if (!hashSet.contains(Long.valueOf(gwVar4.a)) && !gwVar4.d()) {
                    arrayList4.add(gwVar4);
                    hashSet.add(Long.valueOf(gwVar4.a));
                }
            }
        }
        Collections.sort(arrayList4, new ck(19));
        arrayList3.addAll(arrayList4);
        int i14 = this.a;
        at.f(i14).k(at.g3, new Object[0]);
        if (e() || !wp.r1(i14).p6) {
            return;
        }
        wp.r1(i14).K4(false);
    }

    public final boolean n(ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList d = d(this.j);
        ArrayList arrayList2 = new ArrayList(d);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Long l4 = (Long) arrayList.get(size);
            l4.getClass();
            if (z10 && !arrayList2.contains(l4)) {
                arrayList2.add(0, l4);
            } else if (!z10) {
                arrayList2.remove(l4);
            }
        }
        int i10 = this.a;
        if (arrayList2.size() <= (e20.i(i10).q() ? wp.r1(i10).o6 : wp.r1(i10).n6) && !k(d, arrayList2)) {
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
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            int i11 = this.a;
            if (i10 >= size) {
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_reorderPinnedSavedDialogs, null);
                l();
                return;
            } else {
                long longValue = ((Long) arrayList.get(i10)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = wp.r1(i11).i1(longValue);
                tL_messages_reorderPinnedSavedDialogs.order.add(tL_inputDialogPeer);
                i10++;
            }
        }
    }

    public final boolean q(ArrayList arrayList) {
        ArrayList arrayList2;
        a0.h hVar;
        boolean z10;
        ArrayList arrayList3;
        int i10;
        boolean z11;
        int i11 = 0;
        if (arrayList == null) {
            return false;
        }
        a0.h hVar2 = new a0.h();
        a0.h hVar3 = new a0.h();
        new HashSet();
        int i12 = this.a;
        long e = e20.i(i12).e();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i13);
            long R1 = kj.R1(e, message);
            if (R1 == e || (message.id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar2.f(R1);
                if (message2 == null || message2.id < message.id) {
                    hVar2.k(message, R1);
                }
                Integer num = (Integer) hVar3.f(R1);
                hVar3.k(Integer.valueOf((num == null ? 0 : num.intValue()) + 1), R1);
            }
        }
        int i14 = 0;
        boolean z12 = false;
        while (i14 < hVar2.m()) {
            long j10 = hVar2.j(i14);
            TLRPC.Message message3 = (TLRPC.Message) hVar2.n(i14);
            Integer num2 = (Integer) hVar3.f(j10);
            int i15 = i11;
            while (true) {
                arrayList2 = this.c;
                if (i15 >= arrayList2.size()) {
                    hVar = hVar2;
                    z10 = false;
                    break;
                }
                gw gwVar = (gw) arrayList2.get(i15);
                hVar = hVar2;
                if (gwVar.a == j10) {
                    int i16 = gwVar.c;
                    int i17 = message3.id;
                    if (i16 < i17 || (i17 < 0 && message3.date > gwVar.c())) {
                        if (gwVar.c < message3.id) {
                            int i18 = 0;
                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                if (((TLRPC.Message) arrayList.get(i19)).id > gwVar.c) {
                                    i18++;
                                }
                            }
                            gwVar.e += i18;
                        }
                        kj kjVar = new kj(i12, message3, false, false);
                        gwVar.d = kjVar;
                        gwVar.c = kjVar.f1();
                        z12 = true;
                    }
                    num2 = Integer.valueOf(num2 != null ? Math.max(num2.intValue(), gwVar.e) : gwVar.e);
                    z10 = true;
                } else {
                    i15++;
                    hVar2 = hVar;
                }
            }
            if (!z10) {
                gw a2 = gw.a(i12, message3);
                if (num2 != null) {
                    a2.e = num2.intValue();
                }
                arrayList2.add(a2);
                z12 = true;
            }
            int i20 = 0;
            while (true) {
                arrayList3 = this.i;
                if (i20 >= arrayList3.size()) {
                    i10 = 0;
                    z11 = false;
                    break;
                }
                gw gwVar2 = (gw) arrayList3.get(i20);
                if (gwVar2.a == j10) {
                    int i21 = gwVar2.c;
                    int i22 = message3.id;
                    if (i21 < i22 || (i22 < 0 && message3.date > gwVar2.c())) {
                        if (gwVar2.c < message3.id) {
                            int i23 = 0;
                            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                                if (((TLRPC.Message) arrayList.get(i24)).id > gwVar2.c) {
                                    i23++;
                                }
                            }
                            gwVar2.e += i23;
                        }
                        i10 = 0;
                        kj kjVar2 = new kj(i12, message3, false, false);
                        gwVar2.d = kjVar2;
                        gwVar2.c = kjVar2.f1();
                        z12 = true;
                    } else {
                        i10 = 0;
                    }
                    num2 = Integer.valueOf(num2 != null ? Math.max(num2.intValue(), gwVar2.e) : gwVar2.e);
                    z11 = true;
                } else {
                    i20++;
                }
            }
            if (!z11) {
                gw a10 = gw.a(i12, message3);
                if (num2 != null) {
                    a10.e = num2.intValue();
                }
                arrayList3.add(a10);
                z12 = true;
            }
            i14++;
            i11 = i10;
            hVar2 = hVar;
        }
        return z12;
    }

    public final boolean r(int i10, long j10, boolean z10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i11 >= arrayList.size()) {
                break;
            }
            gw gwVar = (gw) arrayList.get(i11);
            if (gwVar.a != j10) {
                i11++;
            } else if (gwVar.e != i10 || (!gwVar.i && z10)) {
                gwVar.e = i10;
                gwVar.i = true;
                return true;
            }
        }
        return false;
    }
}
