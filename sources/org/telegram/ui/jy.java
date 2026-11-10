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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jy extends org.telegram.ui.ActionBar.f2 {
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
    public org.telegram.ui.Components.sz O;
    public yx P;
    public final dh Q;
    public g61 a;
    public iy b;
    public final org.telegram.messenger.vo c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.c5 n;
    public int r;
    public long s;
    public long w;
    public org.telegram.messenger.c20 x;
    public org.telegram.messenger.c20 y;

    public jy(org.telegram.messenger.vo voVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        this.Q = new dh(this, 28);
        this.c = voVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(jy jyVar, TLRPC.TL_error tL_error) {
        jyVar.j0(false);
        jyVar.D = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            jyVar.showDialog(new ug.i0(12, jyVar.currentAccount, jyVar.getParentActivity(), jyVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            jyVar.showDialog(new ug.i0(4, jyVar.currentAccount, jyVar.getParentActivity(), jyVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            jyVar.finishFragment();
        } else {
            jyVar.showDialog(new ug.i0(13, jyVar.currentAccount, jyVar.getParentActivity(), jyVar, null));
        }
    }

    public static void a0(jy jyVar, View view, int i7) {
        String str;
        jy jyVar2;
        ArrayList arrayList = jyVar.e;
        if (jyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.h4)) {
            Long l10 = (Long) jyVar.h.get(i7 - jyVar.L);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                jyVar.F = true;
                jyVar.c0();
                ((org.telegram.ui.Cells.h4) view).c(false, true);
                jyVar2 = jyVar;
            } else {
                if (!jyVar.f.contains(l10)) {
                    int i10 = -jyVar.r;
                    jyVar.r = i10;
                    org.telegram.messenger.g0.G3(i10, view, null);
                    org.telegram.messenger.p2.D.a();
                    ArrayList arrayList2 = new ArrayList();
                    if (longValue >= 0) {
                        arrayList2.add(jyVar.getMessagesController().a2(l10));
                        TLRPC.User a22 = jyVar.getMessagesController().a2(l10);
                        str = (a22 == null || !a22.bot) ? org.telegram.messenger.id.M0(2131750738, null) : org.telegram.messenger.id.M0(2131750770, null);
                    } else {
                        TLRPC.Chat M0 = jyVar.getMessagesController().M0(Long.valueOf(-longValue));
                        String M02 = org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.t3.t0(M0) ? org.telegram.messenger.id.M0(2131750768, null) : org.telegram.messenger.id.M0(2131750741, null) : org.telegram.messenger.t3.t0(M0) ? org.telegram.messenger.id.M0(2131750757, null) : org.telegram.messenger.id.M0(2131750740, null);
                        arrayList2.add(M0);
                        str = M02;
                    }
                    if (jyVar.s != longValue || System.currentTimeMillis() - jyVar.w > 1500) {
                        jyVar.s = longValue;
                        jyVar.w = System.currentTimeMillis();
                        org.telegram.ui.Components.gc.a0(jyVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > jyVar.f0()) {
                    jyVar.showDialog(new ug.i0(4, jyVar.currentAccount, jyVar.getParentActivity(), jyVar, null));
                    return;
                }
                jyVar2 = jyVar;
                arrayList.add(l10);
                jyVar2.F = true;
                jyVar2.c0();
                ((org.telegram.ui.Cells.h4) view).c(true, true);
            }
            jyVar2.d0();
            jyVar2.k0(true);
            jyVar2.l0();
        }
    }

    public final boolean b0(boolean z9) {
        final int i7 = 1;
        if (this.e.isEmpty() || !this.F) {
            return true;
        }
        final int i10 = 0;
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131743835, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131743834, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.vx
                public final /* synthetic */ jy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
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
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747580, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.vx
                public final /* synthetic */ jy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
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
            showDialog(u1Var);
        }
        return false;
    }

    public final void c0() {
        this.n.a(this.F && !this.e.isEmpty(), true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        return b0(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i7 = 0;
        i0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new xx(this, i7));
        this.n = this.simpleActionBar.p(org.telegram.messenger.id.M0(2131745946, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g61 g61Var = new g61(10, context, null);
        this.a = g61Var;
        g61Var.setLayoutManager(new v4.b0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, c8.ha.c(-1.0f, -1));
        g61 g61Var2 = this.a;
        iy iyVar = new iy(this);
        this.b = iyVar;
        g61Var2.setAdapter(iyVar);
        this.a.setOnItemClickListener(new h(this, 9));
        org.telegram.messenger.qp messagesController = getMessagesController();
        org.telegram.messenger.vo voVar = this.c;
        messagesController.k5(voVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                long o4 = org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i10));
                arrayList2.add(Long.valueOf(o4));
                this.e.add(Long.valueOf(o4));
                arrayList3.add(Long.valueOf(o4));
            }
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList4 = voVar.k;
            arrayList = voVar.k;
            if (i11 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (dialog != null && !org.telegram.messenger.m5.C(dialog.id) && !arrayList2.contains(Long.valueOf(dialog.id))) {
                long j3 = dialog.id;
                boolean z9 = j3 < 0;
                if (j3 < 0) {
                    z9 = jz.m0(getMessagesController().M0(Long.valueOf(-dialog.id)));
                }
                if (z9) {
                    arrayList2.add(Long.valueOf(dialog.id));
                    arrayList3.add(Long.valueOf(dialog.id));
                }
            }
            i11++;
        }
        while (i7 < arrayList.size()) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i7);
            if (dialog2 != null && !org.telegram.messenger.m5.C(dialog2.id) && !arrayList2.contains(Long.valueOf(dialog2.id)) && !arrayList3.contains(Long.valueOf(dialog2.id))) {
                arrayList2.add(Long.valueOf(dialog2.id));
            }
            i7++;
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
            int i12 = this.G;
            int i13 = i12 + 1;
            this.K = i12;
            int i14 = i12 + 2;
            this.G = i14;
            this.L = i13;
            int size = (arrayList2.size() - 1) + i14;
            this.M = size;
            this.G = size + 1;
            this.N = size;
        }
        iy iyVar2 = this.b;
        if (iyVar2 != null) {
            iyVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.F) {
            return;
        }
        ArrayList arrayList = this.e;
        boolean z9 = true;
        boolean z10 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z10) {
            for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                if (!arrayList.contains(Long.valueOf(org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i7))))) {
                    break;
                }
            }
        }
        z9 = z10;
        if (z9) {
            return;
        }
        this.F = false;
        c0();
    }

    public final void e0(org.telegram.ui.Components.sz szVar, boolean z9) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z9) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        szVar.a(org.telegram.messenger.id.M0(arrayList.size() >= Math.min(f0(), arrayList2.size()) ? 2131751457 : 2131745670, null), new bi.u7(this, szVar, z9, 29));
        this.F = true;
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
        return getUserConfig().q() ? getMessagesController().O4 : getMessagesController().N4;
    }

    public final String g0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
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
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new wx(this, 0));
        org.telegram.messenger.c20 c20Var = this.y;
        if (c20Var != null) {
            c20Var.a(tL_exportedChatlistInvite);
        }
    }

    public final void i0(boolean z9) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String M0 = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? org.telegram.messenger.id.M0(2131750706, null) : tL_exportedChatlistInvite.title;
        if (!z9) {
            this.simpleActionBar.setTitle(M0);
            return;
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        z4Var.getClass();
        z4Var.C(M0, false, 220L, org.telegram.ui.Components.wq.h);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.r(this.Q);
        }
        org.telegram.ui.ActionBar.c5 c5Var = this.n;
        if (c5Var != null) {
            c5Var.b(z9);
        }
    }

    public final void k0(boolean z9) {
        org.telegram.ui.Components.sz szVar = this.O;
        if (szVar == null) {
            return;
        }
        ArrayList arrayList = this.e;
        szVar.b(arrayList.size() <= 0 ? org.telegram.messenger.id.N0("FilterInviteHeaderChatsEmpty") : org.telegram.messenger.id.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]), z9);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z10 = arrayList.size() >= Math.min(f0(), arrayList2.size());
            this.O.a(org.telegram.messenger.id.M0(!z10 ? 2131745670 : 2131751457, null), new org.telegram.ui.Components.tp0(7, this, z10));
        } else {
            this.O.a("", null);
        }
        if (z9) {
            org.telegram.messenger.g0.i2(((Object) this.O.a.getText()) + ", " + ((Object) this.O.b.getText()));
        }
    }

    public final void l0() {
        yx yxVar = this.P;
        if (yxVar == null) {
            return;
        }
        if (this.d == null) {
            String M0 = org.telegram.messenger.id.M0(2131750750, null);
            xh.l lVar = yxVar.a;
            lVar.setText(M0);
            lVar.s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = yxVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.vo voVar = this.c;
        Spannable B5 = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(voVar.b, fontMetricsInt, false, null, 0), voVar.c, fontMetricsInt, false);
        yx yxVar2 = this.P;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.id.F("FilterInviteHeader", this.e.size(), B5));
        boolean z9 = voVar.n;
        xh.l lVar2 = yxVar2.a;
        lVar2.setText(W2);
        lVar2.s = z9 ? 26 : 0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        return b0(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.E != 0) {
            getConnectionsManager().cancelRequest(this.E, true);
            this.E = 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
