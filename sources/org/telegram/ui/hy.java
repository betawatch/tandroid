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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hy extends org.telegram.ui.ActionBar.e2 {
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public org.telegram.ui.Components.wz P;
    public vx Q;
    public final bh R;
    public b61 a;
    public gy b;
    public final org.telegram.messenger.so c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.z4 n;
    public int r;
    public long s;
    public long w;
    public org.telegram.messenger.z10 x;
    public org.telegram.messenger.z10 y;

    public hy(org.telegram.messenger.so soVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.r = -5;
        this.E = false;
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.R = new bh(this, 28);
        this.c = soVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(hy hyVar, TLRPC.TL_error tL_error) {
        hyVar.j0(false);
        hyVar.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            hyVar.showDialog(new ug.j0(12, hyVar.currentAccount, hyVar.getParentActivity(), hyVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            hyVar.showDialog(new ug.j0(4, hyVar.currentAccount, hyVar.getParentActivity(), hyVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            hyVar.finishFragment();
        } else {
            hyVar.showDialog(new ug.j0(13, hyVar.currentAccount, hyVar.getParentActivity(), hyVar, null));
        }
    }

    public static void a0(hy hyVar, View view, int i7) {
        String str;
        hy hyVar2;
        ArrayList arrayList = hyVar.e;
        if (hyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.h4)) {
            Long l10 = (Long) hyVar.h.get(i7 - hyVar.M);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                hyVar.G = true;
                hyVar.c0();
                ((org.telegram.ui.Cells.h4) view).c(false, true);
                hyVar2 = hyVar;
            } else {
                if (!hyVar.f.contains(l10)) {
                    int i10 = -hyVar.r;
                    hyVar.r = i10;
                    org.telegram.messenger.g0.F3(i10, view, null);
                    org.telegram.messenger.p2.E.a();
                    ArrayList arrayList2 = new ArrayList();
                    if (longValue >= 0) {
                        arrayList2.add(hyVar.getMessagesController().a2(l10));
                        TLRPC.User a22 = hyVar.getMessagesController().a2(l10);
                        str = (a22 == null || !a22.bot) ? org.telegram.messenger.hd.M0(2131750738, null) : org.telegram.messenger.hd.M0(2131750770, null);
                    } else {
                        TLRPC.Chat M0 = hyVar.getMessagesController().M0(Long.valueOf(-longValue));
                        String M02 = org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.t3.t0(M0) ? org.telegram.messenger.hd.M0(2131750768, null) : org.telegram.messenger.hd.M0(2131750741, null) : org.telegram.messenger.t3.t0(M0) ? org.telegram.messenger.hd.M0(2131750757, null) : org.telegram.messenger.hd.M0(2131750740, null);
                        arrayList2.add(M0);
                        str = M02;
                    }
                    if (hyVar.s != longValue || System.currentTimeMillis() - hyVar.w > 1500) {
                        hyVar.s = longValue;
                        hyVar.w = System.currentTimeMillis();
                        org.telegram.ui.Components.cc.a0(hyVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > hyVar.f0()) {
                    hyVar.showDialog(new ug.j0(4, hyVar.currentAccount, hyVar.getParentActivity(), hyVar, null));
                    return;
                }
                hyVar2 = hyVar;
                arrayList.add(l10);
                hyVar2.G = true;
                hyVar2.c0();
                ((org.telegram.ui.Cells.h4) view).c(true, true);
            }
            hyVar2.d0();
            hyVar2.k0(true);
            hyVar2.l0();
        }
    }

    public final boolean b0(boolean z10) {
        final int i7 = 1;
        if (this.e.isEmpty() || !this.G) {
            return true;
        }
        final int i10 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131743835, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131743834, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.tx
                public final /* synthetic */ hy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
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
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747580, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.tx
                public final /* synthetic */ hy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                    switch (i7) {
                        case 0:
                            this.b.h0();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            showDialog(t1Var);
        }
        return false;
    }

    public final void c0() {
        this.n.a(this.G && !this.e.isEmpty(), true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean canBeginSlide() {
        return b0(true);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        i0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 1));
        this.n = this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b61 b61Var = new b61(10, context, null);
        this.a = b61Var;
        b61Var.setLayoutManager(new v4.b0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, c8.ja.c(-1.0f, -1));
        b61 b61Var2 = this.a;
        gy gyVar = new gy(this);
        this.b = gyVar;
        b61Var2.setAdapter(gyVar);
        this.a.setOnItemClickListener(new h(this, 9));
        org.telegram.messenger.np messagesController = getMessagesController();
        org.telegram.messenger.so soVar = this.c;
        messagesController.l5(soVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                long o4 = org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i7));
                arrayList2.add(Long.valueOf(o4));
                this.e.add(Long.valueOf(o4));
                arrayList3.add(Long.valueOf(o4));
            }
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = soVar.k;
            arrayList = soVar.k;
            if (i10 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (dialog != null && !org.telegram.messenger.m5.C(dialog.id) && !arrayList2.contains(Long.valueOf(dialog.id))) {
                long j3 = dialog.id;
                boolean z10 = j3 < 0;
                if (j3 < 0) {
                    z10 = hz.m0(getMessagesController().M0(Long.valueOf(-dialog.id)));
                }
                if (z10) {
                    arrayList2.add(Long.valueOf(dialog.id));
                    arrayList3.add(Long.valueOf(dialog.id));
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i11);
            if (dialog2 != null && !org.telegram.messenger.m5.C(dialog2.id) && !arrayList2.contains(Long.valueOf(dialog2.id)) && !arrayList3.contains(Long.valueOf(dialog2.id))) {
                arrayList2.add(Long.valueOf(dialog2.id));
            }
        }
        this.H = 1;
        if (tL_exportedChatlistInvite != null) {
            this.J = 1;
            this.I = 2;
            this.H = 4;
            this.K = 3;
        } else {
            this.J = -1;
            this.I = -1;
            this.K = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList2.isEmpty()) {
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
        } else {
            int i12 = this.H;
            int i13 = i12 + 1;
            this.L = i12;
            int i14 = i12 + 2;
            this.H = i14;
            this.M = i13;
            int size = (arrayList2.size() - 1) + i14;
            this.N = size;
            this.H = size + 1;
            this.O = size;
        }
        gy gyVar2 = this.b;
        if (gyVar2 != null) {
            gyVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.G) {
            return;
        }
        ArrayList arrayList = this.e;
        boolean z10 = true;
        boolean z11 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z11) {
            for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                if (!arrayList.contains(Long.valueOf(org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i7))))) {
                    break;
                }
            }
        }
        z10 = z11;
        if (z10) {
            return;
        }
        this.G = false;
        c0();
    }

    public final void e0(org.telegram.ui.Components.wz wzVar, boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        wzVar.a(org.telegram.messenger.hd.M0(arrayList.size() >= Math.min(f0(), arrayList2.size()) ? 2131751457 : 2131745670, null), new di.m6(this, wzVar, z10, 29));
        this.G = true;
        d0();
        c0();
        k0(true);
        l0();
        for (int i7 = 0; i7 < this.a.getChildCount(); i7++) {
            View childAt = this.a.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.h4) childAt).c(arrayList.contains((Long) tag), true);
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

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || this.E || !this.G) {
            return;
        }
        j0(true);
        this.E = true;
        tL_exportedChatlistInvite.peers.clear();
        int i7 = 0;
        while (true) {
            arrayList = this.e;
            if (i7 >= arrayList.size()) {
                break;
            }
            tL_exportedChatlistInvite.peers.add(getMessagesController().z1(((Long) arrayList.get(i7)).longValue()));
            i7++;
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c.a;
        tL_chatlists_editExportedInvite.slug = g0();
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().j1(((Long) arrayList.get(i10)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new ux(this, 0));
        org.telegram.messenger.z10 z10Var = this.y;
        if (z10Var != null) {
            z10Var.a(tL_exportedChatlistInvite);
        }
    }

    public final void i0(boolean z10) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String M0 = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? org.telegram.messenger.hd.M0(2131750706, null) : tL_exportedChatlistInvite.title;
        if (!z10) {
            this.simpleActionBar.setTitle(M0);
            return;
        }
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        w4Var.getClass();
        w4Var.D(M0, false, 220L, org.telegram.ui.Components.er.h);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.R);
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.n;
        if (z4Var != null) {
            z4Var.b(z10);
        }
    }

    public final void k0(boolean z10) {
        org.telegram.ui.Components.wz wzVar = this.P;
        if (wzVar == null) {
            return;
        }
        ArrayList arrayList = this.e;
        wzVar.b(arrayList.size() <= 0 ? org.telegram.messenger.hd.N0("FilterInviteHeaderChatsEmpty") : org.telegram.messenger.hd.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]), z10);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z11 = arrayList.size() >= Math.min(f0(), arrayList2.size());
            this.P.a(org.telegram.messenger.hd.M0(!z11 ? 2131745670 : 2131751457, null), new org.telegram.ui.Components.fp0(8, this, z11));
        } else {
            this.P.a("", null);
        }
        if (z10) {
            org.telegram.messenger.g0.i2(((Object) this.P.a.getText()) + ", " + ((Object) this.P.b.getText()));
        }
    }

    public final void l0() {
        vx vxVar = this.Q;
        if (vxVar == null) {
            return;
        }
        if (this.d == null) {
            String M0 = org.telegram.messenger.hd.M0(2131750750, null);
            xh.l lVar = vxVar.a;
            lVar.setText(M0);
            lVar.s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = vxVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.so soVar = this.c;
        Spannable B5 = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(soVar.b, fontMetricsInt, false, null, 0), soVar.c, fontMetricsInt, false);
        vx vxVar2 = this.Q;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.F("FilterInviteHeader", this.e.size(), B5));
        boolean z10 = soVar.n;
        xh.l lVar2 = vxVar2.a;
        lVar2.setText(W2);
        lVar2.s = z10 ? 26 : 0;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        return b0(z10);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
            this.F = 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
