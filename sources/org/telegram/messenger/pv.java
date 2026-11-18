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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class pv {
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
    public final nv n = new nv(this, 4);
    public final a0.h p = new a0.h();

    public pv(int i7) {
        this.a = i7;
        this.b = mp.u1(i7).h7.getBoolean("savedMessagesUnsupported", true);
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ov ovVar = (ov) arrayList.get(i7);
            if (ovVar.b) {
                arrayList2.add(Long.valueOf(ovVar.a));
            }
        }
        return arrayList2;
    }

    public static void h() {
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", j10.i(Q.getCurrentAccount()).e());
        Q.presentFragment(new org.telegram.ui.bn(bundle));
    }

    public static boolean k(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (Objects.equals(arrayList.get(i7), arrayList2.get(i7))) {
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
        int i7 = 0;
        while (i7 < arrayList.size()) {
            ov ovVar = (ov) arrayList.get(i7);
            if (ovVar.b) {
                ovVar.b = false;
                arrayList3.add(ovVar);
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            ov ovVar2 = (ov) arrayList.get(i10);
            int indexOf = arrayList2.indexOf(Long.valueOf(ovVar2.a));
            if (indexOf >= 0) {
                ovVar2.k = indexOf;
                ovVar2.b = true;
                arrayList4.add(ovVar2);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        Collections.sort(arrayList, new dl(14));
        Collections.sort(arrayList4, new dl(15));
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
        int i7 = this.a;
        if (!z10) {
            this.o = true;
            tr a02 = tr.a0(i7);
            a02.a.c(new rq(this, a02));
        }
        this.b = true;
        mp.u1(i7).h7.edit().remove("savedMessagesUnsupported").apply();
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
        long e10 = j10.i(this.a).e();
        ArrayList arrayList = this.j;
        return (arrayList.size() == 1 && ((ov) arrayList.get(0)).a == e10) ? false : true;
    }

    public final void f(long j3, x10 x10Var) {
        ov ovVar;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i7 >= arrayList.size()) {
                ovVar = null;
                break;
            }
            ovVar = (ov) arrayList.get(i7);
            if (ovVar.a == j3) {
                break;
            } else {
                i7++;
            }
        }
        if (ovVar != null && ovVar.e > 0 && ovVar.i) {
            if (x10Var != null) {
                x10Var.a(Boolean.TRUE);
                return;
            }
            return;
        }
        a0.h hVar = this.p;
        ArrayList arrayList2 = (ArrayList) hVar.f(j3);
        if (arrayList2 != null) {
            if (x10Var != null) {
                arrayList2.add(x10Var);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        if (x10Var != null) {
            arrayList3.add(x10Var);
        }
        hVar.k(arrayList3, j3);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        int i10 = this.a;
        tL_messages_getSavedHistory.peer = mp.u1(i10).l1(j3);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = ConnectionsManager.DEFAULT_DATACENTER_ID;
        tL_messages_getSavedHistory.offset_date = ConnectionsManager.DEFAULT_DATACENTER_ID;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getSavedHistory, new x4(this, j3, 2));
    }

    public final void g(boolean z10) {
        boolean z11;
        this.m = z10;
        if (!this.d && !this.f && !(z11 = this.k)) {
            boolean z12 = this.l;
            int i7 = this.a;
            if (z12) {
                if (z10) {
                    return;
                }
                this.d = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                ArrayList arrayList = this.i;
                ov ovVar = arrayList.isEmpty() ? null : (ov) i5.c.h(1, arrayList);
                if (ovVar != null) {
                    tL_messages_getSavedDialogs.offset_id = ovVar.c;
                    tL_messages_getSavedDialogs.offset_date = ovVar.c();
                    tL_messages_getSavedDialogs.offset_peer = mp.u1(i7).l1(ovVar.a);
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
                    ov ovVar2 = (ov) arrayList2.get(i10);
                    long r10 = ri.r(tL_messages_getSavedDialogs.hash, ovVar2.b ? 1L : 0L);
                    tL_messages_getSavedDialogs.hash = r10;
                    long r11 = ri.r(r10, Math.abs(ovVar2.a));
                    tL_messages_getSavedDialogs.hash = r11;
                    long r12 = ri.r(r11, ovVar2.c);
                    tL_messages_getSavedDialogs.hash = r12;
                    tL_messages_getSavedDialogs.hash = ri.r(r12, ovVar2.c());
                }
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getSavedDialogs, new t4(8, this, arrayList2));
                return;
            }
            nv nvVar = new nv(this, 0);
            if (!z11) {
                this.k = true;
                long e10 = j10.i(i7).e();
                tr a02 = tr.a0(i7);
                a02.a.c(new fm(this, a02, e10, nvVar, 18));
            }
        }
    }

    public final void i(TLRPC.Update update) {
        boolean z10 = false;
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (dialogPeer instanceof TLRPC.TL_dialogPeer) {
                long o4 = n5.o(((TLRPC.TL_dialogPeer) dialogPeer).peer);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(o4));
                z10 = n(arrayList, tL_updateSavedDialogPinned.pinned, false);
            }
        } else if (update instanceof TL_update.TL_updatePinnedSavedDialogs) {
            TL_update.TL_updatePinnedSavedDialogs tL_updatePinnedSavedDialogs = (TL_update.TL_updatePinnedSavedDialogs) update;
            ArrayList arrayList2 = new ArrayList(tL_updatePinnedSavedDialogs.order.size());
            for (int i7 = 0; i7 < tL_updatePinnedSavedDialogs.order.size(); i7++) {
                TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i7);
                if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                    arrayList2.add(Long.valueOf(n5.o(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
                }
            }
            boolean o10 = o(this.i, arrayList2);
            boolean o11 = o(this.c, arrayList2);
            if (o10 || o11) {
                z10 = true;
            }
        }
        if (z10) {
            l();
        }
    }

    public final int j(long j3) {
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((ov) arrayList.get(i10)).a == j3) {
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
            if (((ov) arrayList2.get(i12)).a == j3) {
                arrayList2.remove(i12);
                i13++;
                i12--;
            }
            i12++;
        }
        while (true) {
            ArrayList arrayList3 = this.c;
            if (i7 >= arrayList3.size()) {
                return Math.max(i11, i13);
            }
            if (((ov) arrayList3.get(i7)).a == j3) {
                arrayList3.remove(i7);
                i7--;
            }
            i7++;
        }
    }

    public final void l() {
        m();
        nv nvVar = this.n;
        g0.r(nvVar);
        g0.h3(nvVar, 450L);
    }

    public final void m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.j;
        arrayList3.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            arrayList = this.c;
            if (i7 >= arrayList.size()) {
                break;
            }
            ov ovVar = (ov) arrayList.get(i7);
            if (ovVar.b && !hashSet.contains(Long.valueOf(ovVar.a)) && !ovVar.d()) {
                arrayList3.add(ovVar);
                hashSet.add(Long.valueOf(ovVar.a));
            }
            i7++;
        }
        int i10 = 0;
        while (true) {
            arrayList2 = this.i;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ov ovVar2 = (ov) arrayList2.get(i10);
            if (ovVar2.b && !hashSet.contains(Long.valueOf(ovVar2.a)) && !ovVar2.d()) {
                arrayList3.add(ovVar2);
                hashSet.add(Long.valueOf(ovVar2.a));
            }
            i10++;
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ov ovVar3 = (ov) arrayList2.get(i11);
            if (!hashSet.contains(Long.valueOf(ovVar3.a)) && !ovVar3.d()) {
                arrayList4.add(ovVar3);
                hashSet.add(Long.valueOf(ovVar3.a));
            }
        }
        if (!this.f) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ov ovVar4 = (ov) arrayList.get(i12);
                if (!hashSet.contains(Long.valueOf(ovVar4.a)) && !ovVar4.d()) {
                    arrayList4.add(ovVar4);
                    hashSet.add(Long.valueOf(ovVar4.a));
                }
            }
        }
        Collections.sort(arrayList4, new dl(16));
        arrayList3.addAll(arrayList4);
        int i13 = this.a;
        ks.f(i13).k(ks.i3, new Object[0]);
        if (e() || !mp.u1(i13).r6) {
            return;
        }
        mp.u1(i13).Z4(false);
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
        int i7 = this.a;
        if (arrayList2.size() <= (j10.i(i7).q() ? mp.u1(i7).q6 : mp.u1(i7).p6) && !k(d, arrayList2)) {
            if (z11) {
                p(arrayList2);
                return true;
            }
            boolean o4 = o(this.i, arrayList2);
            boolean o10 = o(this.c, arrayList2);
            if (o4 || o10) {
                return true;
            }
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        boolean o4 = o(this.i, arrayList);
        boolean o10 = o(this.c, arrayList);
        if (!o4 && !o10) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            int i10 = this.a;
            if (i7 >= size) {
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_reorderPinnedSavedDialogs, null);
                l();
                return;
            } else {
                long longValue = ((Long) arrayList.get(i7)).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                tL_inputDialogPeer.peer = mp.u1(i10).l1(longValue);
                tL_messages_reorderPinnedSavedDialogs.order.add(tL_inputDialogPeer);
                i7++;
            }
        }
    }

    public final boolean q(ArrayList arrayList) {
        ArrayList arrayList2;
        a0.h hVar;
        boolean z10;
        ArrayList arrayList3;
        int i7;
        boolean z11;
        int i10 = 0;
        if (arrayList == null) {
            return false;
        }
        a0.h hVar2 = new a0.h();
        a0.h hVar3 = new a0.h();
        new HashSet();
        int i11 = this.a;
        long e10 = j10.i(i11).e();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
            long Q1 = fj.Q1(e10, message);
            if (Q1 == e10 || (message.id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar2.f(Q1);
                if (message2 == null || message2.id < message.id) {
                    hVar2.k(message, Q1);
                }
                Integer num = (Integer) hVar3.f(Q1);
                hVar3.k(Integer.valueOf((num == null ? 0 : num.intValue()) + 1), Q1);
            }
        }
        int i13 = 0;
        boolean z12 = false;
        while (i13 < hVar2.m()) {
            long j3 = hVar2.j(i13);
            TLRPC.Message message3 = (TLRPC.Message) hVar2.n(i13);
            Integer num2 = (Integer) hVar3.f(j3);
            int i14 = i10;
            while (true) {
                arrayList2 = this.c;
                if (i14 >= arrayList2.size()) {
                    hVar = hVar2;
                    z10 = false;
                    break;
                }
                ov ovVar = (ov) arrayList2.get(i14);
                hVar = hVar2;
                if (ovVar.a == j3) {
                    int i15 = ovVar.c;
                    int i16 = message3.id;
                    if (i15 < i16 || (i16 < 0 && message3.date > ovVar.c())) {
                        if (ovVar.c < message3.id) {
                            int i17 = 0;
                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                if (((TLRPC.Message) arrayList.get(i18)).id > ovVar.c) {
                                    i17++;
                                }
                            }
                            ovVar.e += i17;
                        }
                        fj fjVar = new fj(i11, message3, false, false);
                        ovVar.d = fjVar;
                        ovVar.c = fjVar.e1();
                        z12 = true;
                    }
                    num2 = Integer.valueOf(num2 != null ? Math.max(num2.intValue(), ovVar.e) : ovVar.e);
                    z10 = true;
                } else {
                    i14++;
                    hVar2 = hVar;
                }
            }
            if (!z10) {
                ov a10 = ov.a(i11, message3);
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
                    i7 = 0;
                    z11 = false;
                    break;
                }
                ov ovVar2 = (ov) arrayList3.get(i19);
                if (ovVar2.a == j3) {
                    int i20 = ovVar2.c;
                    int i21 = message3.id;
                    if (i20 < i21 || (i21 < 0 && message3.date > ovVar2.c())) {
                        if (ovVar2.c < message3.id) {
                            int i22 = 0;
                            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                                if (((TLRPC.Message) arrayList.get(i23)).id > ovVar2.c) {
                                    i22++;
                                }
                            }
                            ovVar2.e += i22;
                        }
                        i7 = 0;
                        fj fjVar2 = new fj(i11, message3, false, false);
                        ovVar2.d = fjVar2;
                        ovVar2.c = fjVar2.e1();
                        z12 = true;
                    } else {
                        i7 = 0;
                    }
                    num2 = Integer.valueOf(num2 != null ? Math.max(num2.intValue(), ovVar2.e) : ovVar2.e);
                    z11 = true;
                } else {
                    i19++;
                }
            }
            if (!z11) {
                ov a11 = ov.a(i11, message3);
                if (num2 != null) {
                    a11.e = num2.intValue();
                }
                arrayList3.add(a11);
                z12 = true;
            }
            i13++;
            i10 = i7;
            hVar2 = hVar;
        }
        return z12;
    }

    public final boolean r(int i7, long j3, boolean z10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i10 >= arrayList.size()) {
                break;
            }
            ov ovVar = (ov) arrayList.get(i10);
            if (ovVar.a != j3) {
                i10++;
            } else if (ovVar.e != i7 || (!ovVar.i && z10)) {
                ovVar.e = i7;
                ovVar.i = true;
                return true;
            }
        }
        return false;
    }
}
