package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hz extends org.telegram.ui.ActionBar.k2 {
    public boolean D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public org.telegram.ui.Components.g00 O;
    public wy P;
    public final rh Q;
    public u71 a;
    public gz b;
    public final org.telegram.messenger.bp c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.l5 n;
    public int r;
    public long s;
    public long w;
    public org.telegram.messenger.r20 x;
    public org.telegram.messenger.r20 y;

    public hz(org.telegram.messenger.bp bpVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.r = -5;
        this.D = false;
        this.G = 0;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.Q = new rh(this, 29);
        this.c = bpVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(hz hzVar, TLRPC.TL_error tL_error) {
        hzVar.j0(false);
        hzVar.D = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            hzVar.showDialog(new kg.q0(12, hzVar.currentAccount, hzVar.getParentActivity(), hzVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            hzVar.showDialog(new kg.q0(4, hzVar.currentAccount, hzVar.getParentActivity(), hzVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            hzVar.finishFragment();
        } else {
            hzVar.showDialog(new kg.q0(13, hzVar.currentAccount, hzVar.getParentActivity(), hzVar, null));
        }
    }

    public static void a0(hz hzVar, View view, int i10) {
        String str;
        hz hzVar2;
        ArrayList arrayList = hzVar.e;
        if (hzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.j4)) {
            Long l4 = (Long) hzVar.h.get(i10 - hzVar.L);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                hzVar.F = true;
                hzVar.c0();
                ((org.telegram.ui.Cells.j4) view).c(false, true);
                hzVar2 = hzVar;
            } else {
                if (!hzVar.f.contains(l4)) {
                    int i11 = -hzVar.r;
                    hzVar.r = i11;
                    org.telegram.messenger.i0.F3(i11, view, null);
                    org.telegram.messenger.t2.D.a();
                    ArrayList arrayList2 = new ArrayList();
                    if (longValue >= 0) {
                        arrayList2.add(hzVar.getMessagesController().Z1(l4));
                        TLRPC.User Z1 = hzVar.getMessagesController().Z1(l4);
                        str = (Z1 == null || !Z1.bot) ? org.telegram.messenger.dd.L0(2131750739, null) : org.telegram.messenger.dd.L0(2131750771, null);
                    } else {
                        TLRPC.Chat L0 = hzVar.getMessagesController().L0(Long.valueOf(-longValue));
                        String L02 = org.telegram.messenger.w3.V(L0) ? org.telegram.messenger.w3.t0(L0) ? org.telegram.messenger.dd.L0(2131750769, null) : org.telegram.messenger.dd.L0(2131750742, null) : org.telegram.messenger.w3.t0(L0) ? org.telegram.messenger.dd.L0(2131750758, null) : org.telegram.messenger.dd.L0(2131750741, null);
                        arrayList2.add(L0);
                        str = L02;
                    }
                    if (hzVar.s != longValue || System.currentTimeMillis() - hzVar.w > 1500) {
                        hzVar.s = longValue;
                        hzVar.w = System.currentTimeMillis();
                        org.telegram.ui.Components.cc.a0(hzVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > hzVar.f0()) {
                    hzVar.showDialog(new kg.q0(4, hzVar.currentAccount, hzVar.getParentActivity(), hzVar, null));
                    return;
                }
                hzVar2 = hzVar;
                arrayList.add(l4);
                hzVar2.F = true;
                hzVar2.c0();
                ((org.telegram.ui.Cells.j4) view).c(true, true);
            }
            hzVar2.d0();
            hzVar2.k0(true);
            hzVar2.l0();
        }
    }

    public final boolean b0(boolean z10) {
        final int i10 = 1;
        if (this.e.isEmpty() || !this.F) {
            return true;
        }
        final int i11 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131743860, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131743859, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754216, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.uy
                public final /* synthetic */ hz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                    switch (i11) {
                        case 0:
                            this.b.h0();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747596, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.uy
                public final /* synthetic */ hz b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                    switch (i10) {
                        case 0:
                            this.b.h0();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            showDialog(x1Var);
        }
        return false;
    }

    public final void c0() {
        this.n.a(this.F && !this.e.isEmpty(), true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        return b0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        i0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 21));
        this.n = this.simpleActionBar.n(org.telegram.messenger.dd.L0(2131745963, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        u71 u71Var = new u71(7, context, null);
        this.a = u71Var;
        u71Var.setLayoutManager(new s4.a0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        u71 u71Var2 = this.a;
        gz gzVar = new gz(this);
        this.b = gzVar;
        u71Var2.setAdapter(gzVar);
        this.a.setOnItemClickListener(new g(this, 9));
        org.telegram.messenger.wp messagesController = getMessagesController();
        org.telegram.messenger.bp bpVar = this.c;
        messagesController.h5(bpVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                long o10 = org.telegram.messenger.o5.o(tL_exportedChatlistInvite.peers.get(i10));
                arrayList2.add(Long.valueOf(o10));
                this.e.add(Long.valueOf(o10));
                arrayList3.add(Long.valueOf(o10));
            }
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList4 = bpVar.k;
            arrayList = bpVar.k;
            if (i11 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (dialog != null && !org.telegram.messenger.o5.C(dialog.id) && !arrayList2.contains(Long.valueOf(dialog.id))) {
                long j10 = dialog.id;
                boolean z10 = j10 < 0;
                if (j10 < 0) {
                    z10 = h00.m0(getMessagesController().L0(Long.valueOf(-dialog.id)));
                }
                if (z10) {
                    arrayList2.add(Long.valueOf(dialog.id));
                    arrayList3.add(Long.valueOf(dialog.id));
                }
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i12);
            if (dialog2 != null && !org.telegram.messenger.o5.C(dialog2.id) && !arrayList2.contains(Long.valueOf(dialog2.id)) && !arrayList3.contains(Long.valueOf(dialog2.id))) {
                arrayList2.add(Long.valueOf(dialog2.id));
            }
        }
        this.G = 1;
        if (tL_exportedChatlistInvite != null) {
            this.I = 1;
            this.H = 2;
            this.G = 4;
            this.J = 3;
        } else {
            this.I = -1;
            this.H = -1;
            this.J = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList2.isEmpty()) {
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
        } else {
            int i13 = this.G;
            int i14 = i13 + 1;
            this.K = i13;
            int i15 = i13 + 2;
            this.G = i15;
            this.L = i14;
            int size = (arrayList2.size() - 1) + i15;
            this.M = size;
            this.G = size + 1;
            this.N = size;
        }
        gz gzVar2 = this.b;
        if (gzVar2 != null) {
            gzVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.F) {
            return;
        }
        ArrayList arrayList = this.e;
        boolean z10 = true;
        boolean z11 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z11) {
            for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                if (!arrayList.contains(Long.valueOf(org.telegram.messenger.o5.o(tL_exportedChatlistInvite.peers.get(i10))))) {
                    break;
                }
            }
        }
        z10 = z11;
        if (z10) {
            return;
        }
        this.F = false;
        c0();
    }

    public final void e0(org.telegram.ui.Components.g00 g00Var, boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        g00Var.a(org.telegram.messenger.dd.L0(arrayList.size() >= Math.min(f0(), arrayList2.size()) ? 2131751458 : 2131745687, null), new ag.j0(this, g00Var, z10, 26));
        this.F = true;
        d0();
        c0();
        k0(true);
        l0();
        for (int i10 = 0; i10 < this.a.getChildCount(); i10++) {
            View childAt = this.a.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.j4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int f0() {
        return getUserConfig().q() ? getMessagesController().P4 : getMessagesController().O4;
    }

    public final String g0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || this.D || !this.F) {
            return;
        }
        j0(true);
        this.D = true;
        tL_exportedChatlistInvite.peers.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.e;
            if (i10 >= arrayList.size()) {
                break;
            }
            tL_exportedChatlistInvite.peers.add(getMessagesController().y1(((Long) arrayList.get(i10)).longValue()));
            i10++;
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c.a;
        tL_chatlists_editExportedInvite.slug = g0();
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().i1(((Long) arrayList.get(i11)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new vy(this, 0));
        org.telegram.messenger.r20 r20Var = this.y;
        if (r20Var != null) {
            r20Var.a(tL_exportedChatlistInvite);
        }
    }

    public final void i0(boolean z10) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String L0 = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? org.telegram.messenger.dd.L0(2131750707, null) : tL_exportedChatlistInvite.title;
        if (!z10) {
            this.simpleActionBar.setTitle(L0);
            return;
        }
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        i5Var.getClass();
        i5Var.B(L0, false, 220L, org.telegram.ui.Components.gr.h);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.i0.r(this.Q);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.n;
        if (l5Var != null) {
            l5Var.b(z10);
        }
    }

    public final void k0(boolean z10) {
        org.telegram.ui.Components.g00 g00Var = this.O;
        if (g00Var == null) {
            return;
        }
        ArrayList arrayList = this.e;
        g00Var.b(arrayList.size() <= 0 ? org.telegram.messenger.dd.M0("FilterInviteHeaderChatsEmpty") : org.telegram.messenger.dd.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]), z10);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z11 = arrayList.size() >= Math.min(f0(), arrayList2.size());
            this.O.a(org.telegram.messenger.dd.L0(!z11 ? 2131745687 : 2131751458, null), new k2.v(27, this, z11));
        } else {
            this.O.a("", null);
        }
        if (z10) {
            org.telegram.messenger.i0.i2(((Object) this.O.a.getText()) + ", " + ((Object) this.O.b.getText()));
        }
    }

    public final void l0() {
        wy wyVar = this.P;
        if (wyVar == null) {
            return;
        }
        if (this.d == null) {
            String L0 = org.telegram.messenger.dd.L0(2131750751, null);
            nh.p pVar = wyVar.a;
            pVar.setText(L0);
            pVar.s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = wyVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.bp bpVar = this.c;
        Spannable A5 = org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(bpVar.b, fontMetricsInt, false, null, 0), bpVar.c, fontMetricsInt, false);
        wy wyVar2 = this.P;
        SpannableStringBuilder V2 = org.telegram.messenger.i0.V2(org.telegram.messenger.dd.F("FilterInviteHeader", this.e.size(), A5));
        boolean z10 = bpVar.n;
        nh.p pVar2 = wyVar2.a;
        pVar2.setText(V2);
        pVar2.s = z10 ? 26 : 0;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        return b0(z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.E != 0) {
            getConnectionsManager().cancelRequest(this.E, true);
            this.E = 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
