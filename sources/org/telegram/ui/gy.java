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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class gy extends org.telegram.ui.ActionBar.f2 {
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
    public org.telegram.ui.Components.tz O;
    public vx P;
    public final bh Q;
    public e61 a;
    public fy b;
    public final org.telegram.messenger.vo c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.b5 n;
    public int r;
    public long s;
    public long w;
    public org.telegram.messenger.c20 x;
    public org.telegram.messenger.c20 y;

    public gy(org.telegram.messenger.vo voVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        this.Q = new bh(this, 28);
        this.c = voVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(gy gyVar, TLRPC.TL_error tL_error) {
        gyVar.j0(false);
        gyVar.D = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            gyVar.showDialog(new ug.i0(12, gyVar.currentAccount, gyVar.getParentActivity(), gyVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            gyVar.showDialog(new ug.i0(4, gyVar.currentAccount, gyVar.getParentActivity(), gyVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            gyVar.finishFragment();
        } else {
            gyVar.showDialog(new ug.i0(13, gyVar.currentAccount, gyVar.getParentActivity(), gyVar, null));
        }
    }

    public static void a0(gy gyVar, View view, int i7) {
        String str;
        gy gyVar2;
        ArrayList arrayList = gyVar.e;
        if (gyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.h4)) {
            Long l10 = (Long) gyVar.h.get(i7 - gyVar.L);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                gyVar.F = true;
                gyVar.c0();
                ((org.telegram.ui.Cells.h4) view).c(false, true);
                gyVar2 = gyVar;
            } else {
                if (!gyVar.f.contains(l10)) {
                    int i10 = -gyVar.r;
                    gyVar.r = i10;
                    org.telegram.messenger.g0.G3(i10, view, null);
                    org.telegram.messenger.p2.D.a();
                    ArrayList arrayList2 = new ArrayList();
                    if (longValue >= 0) {
                        arrayList2.add(gyVar.getMessagesController().a2(l10));
                        TLRPC.User a22 = gyVar.getMessagesController().a2(l10);
                        str = (a22 == null || !a22.bot) ? org.telegram.messenger.id.M0(2131750739, null) : org.telegram.messenger.id.M0(2131750771, null);
                    } else {
                        TLRPC.Chat M0 = gyVar.getMessagesController().M0(Long.valueOf(-longValue));
                        String M02 = org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.t3.t0(M0) ? org.telegram.messenger.id.M0(2131750769, null) : org.telegram.messenger.id.M0(2131750742, null) : org.telegram.messenger.t3.t0(M0) ? org.telegram.messenger.id.M0(2131750758, null) : org.telegram.messenger.id.M0(2131750741, null);
                        arrayList2.add(M0);
                        str = M02;
                    }
                    if (gyVar.s != longValue || System.currentTimeMillis() - gyVar.w > 1500) {
                        gyVar.s = longValue;
                        gyVar.w = System.currentTimeMillis();
                        org.telegram.ui.Components.hc.a0(gyVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > gyVar.f0()) {
                    gyVar.showDialog(new ug.i0(4, gyVar.currentAccount, gyVar.getParentActivity(), gyVar, null));
                    return;
                }
                gyVar2 = gyVar;
                arrayList.add(l10);
                gyVar2.F = true;
                gyVar2.c0();
                ((org.telegram.ui.Cells.h4) view).c(true, true);
            }
            gyVar2.d0();
            gyVar2.k0(true);
            gyVar2.l0();
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
            String M0 = org.telegram.messenger.id.M0(2131743838, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131743837, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.sx
                public final /* synthetic */ gy b;

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
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747581, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.sx
                public final /* synthetic */ gy b;

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
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, i7));
        this.n = this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        e61 e61Var = new e61(10, context, null);
        this.a = e61Var;
        e61Var.setLayoutManager(new v4.b0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, c8.ha.c(-1.0f, -1));
        e61 e61Var2 = this.a;
        fy fyVar = new fy(this);
        this.b = fyVar;
        e61Var2.setAdapter(fyVar);
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
                    z9 = gz.m0(getMessagesController().M0(Long.valueOf(-dialog.id)));
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
        fy fyVar2 = this.b;
        if (fyVar2 != null) {
            fyVar2.f();
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

    public final void e0(org.telegram.ui.Components.tz tzVar, boolean z9) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z9) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        tzVar.a(org.telegram.messenger.id.M0(arrayList.size() >= Math.min(f0(), arrayList2.size()) ? 2131751458 : 2131745673, null), new bi.u7(this, tzVar, z9, 29));
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
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new tx(this, 0));
        org.telegram.messenger.c20 c20Var = this.y;
        if (c20Var != null) {
            c20Var.a(tL_exportedChatlistInvite);
        }
    }

    public final void i0(boolean z9) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String M0 = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? org.telegram.messenger.id.M0(2131750707, null) : tL_exportedChatlistInvite.title;
        if (!z9) {
            this.simpleActionBar.setTitle(M0);
            return;
        }
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        y4Var.getClass();
        y4Var.A(M0, false, 220L, org.telegram.ui.Components.xq.h);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.r(this.Q);
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.n;
        if (b5Var != null) {
            b5Var.b(z9);
        }
    }

    public final void k0(boolean z9) {
        org.telegram.ui.Components.tz tzVar = this.O;
        if (tzVar == null) {
            return;
        }
        ArrayList arrayList = this.e;
        tzVar.b(arrayList.size() <= 0 ? org.telegram.messenger.id.N0("FilterInviteHeaderChatsEmpty") : org.telegram.messenger.id.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]), z9);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z10 = arrayList.size() >= Math.min(f0(), arrayList2.size());
            this.O.a(org.telegram.messenger.id.M0(!z10 ? 2131745673 : 2131751458, null), new org.telegram.ui.Components.tp0(7, this, z10));
        } else {
            this.O.a("", null);
        }
        if (z9) {
            org.telegram.messenger.g0.i2(((Object) this.O.a.getText()) + ", " + ((Object) this.O.b.getText()));
        }
    }

    public final void l0() {
        vx vxVar = this.P;
        if (vxVar == null) {
            return;
        }
        if (this.d == null) {
            String M0 = org.telegram.messenger.id.M0(2131750751, null);
            xh.l lVar = vxVar.a;
            lVar.setText(M0);
            lVar.s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = vxVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.vo voVar = this.c;
        Spannable C5 = org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(voVar.b, fontMetricsInt, false, null, 0), voVar.c, fontMetricsInt, false);
        vx vxVar2 = this.P;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.id.F("FilterInviteHeader", this.e.size(), C5));
        boolean z9 = voVar.n;
        xh.l lVar2 = vxVar2.a;
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
