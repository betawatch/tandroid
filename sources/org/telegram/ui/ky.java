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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ky extends org.telegram.ui.ActionBar.g2 {
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
    public org.telegram.ui.Components.f00 P;
    public yx Q;
    public final bh R;
    public f61 a;
    public jy b;
    public final org.telegram.messenger.ro c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.c5 n;
    public int r;
    public long s;
    public long w;
    public org.telegram.messenger.x10 x;
    public org.telegram.messenger.x10 y;

    public ky(org.telegram.messenger.ro roVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        this.c = roVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(ky kyVar, TLRPC.TL_error tL_error) {
        kyVar.j0(false);
        kyVar.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            kyVar.showDialog(new ug.k0(12, kyVar.currentAccount, kyVar.getParentActivity(), kyVar, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            kyVar.showDialog(new ug.k0(4, kyVar.currentAccount, kyVar.getParentActivity(), kyVar, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            kyVar.finishFragment();
        } else {
            kyVar.showDialog(new ug.k0(13, kyVar.currentAccount, kyVar.getParentActivity(), kyVar, null));
        }
    }

    public static void a0(ky kyVar, View view, int i7) {
        String str;
        ky kyVar2;
        ArrayList arrayList = kyVar.e;
        if (kyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.i4)) {
            Long l10 = (Long) kyVar.h.get(i7 - kyVar.M);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                kyVar.G = true;
                kyVar.c0();
                ((org.telegram.ui.Cells.i4) view).c(false, true);
                kyVar2 = kyVar;
            } else {
                if (!kyVar.f.contains(l10)) {
                    int i10 = -kyVar.r;
                    kyVar.r = i10;
                    org.telegram.messenger.g0.E3(i10, view, null);
                    org.telegram.messenger.q2.E.a();
                    ArrayList arrayList2 = new ArrayList();
                    if (longValue >= 0) {
                        arrayList2.add(kyVar.getMessagesController().c2(l10));
                        TLRPC.User c22 = kyVar.getMessagesController().c2(l10);
                        str = (c22 == null || !c22.bot) ? org.telegram.messenger.gd.N0(2131750726, null) : org.telegram.messenger.gd.N0(2131750758, null);
                    } else {
                        TLRPC.Chat O0 = kyVar.getMessagesController().O0(Long.valueOf(-longValue));
                        String N0 = org.telegram.messenger.v3.V(O0) ? org.telegram.messenger.v3.t0(O0) ? org.telegram.messenger.gd.N0(2131750756, null) : org.telegram.messenger.gd.N0(2131750729, null) : org.telegram.messenger.v3.t0(O0) ? org.telegram.messenger.gd.N0(2131750745, null) : org.telegram.messenger.gd.N0(2131750728, null);
                        arrayList2.add(O0);
                        str = N0;
                    }
                    if (kyVar.s != longValue || System.currentTimeMillis() - kyVar.w > 1500) {
                        kyVar.s = longValue;
                        kyVar.w = System.currentTimeMillis();
                        org.telegram.ui.Components.lc.b0(kyVar).g(str, arrayList2).j();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > kyVar.f0()) {
                    kyVar.showDialog(new ug.k0(4, kyVar.currentAccount, kyVar.getParentActivity(), kyVar, null));
                    return;
                }
                kyVar2 = kyVar;
                arrayList.add(l10);
                kyVar2.G = true;
                kyVar2.c0();
                ((org.telegram.ui.Cells.i4) view).c(true, true);
            }
            kyVar2.d0();
            kyVar2.k0(true);
            kyVar2.l0();
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
            String N0 = org.telegram.messenger.gd.N0(2131743592, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131743591, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754213, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.wx
                public final /* synthetic */ ky b;

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
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747386, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.wx
                public final /* synthetic */ ky b;

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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean canBeginSlide() {
        return b0(true);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        i0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 3));
        this.n = this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        f61 f61Var = new f61(10, context, null);
        this.a = f61Var;
        f61Var.setLayoutManager(new v4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, c8.ma.c(-1.0f, -1));
        f61 f61Var2 = this.a;
        jy jyVar = new jy(this);
        this.b = jyVar;
        f61Var2.setAdapter(jyVar);
        this.a.setOnItemClickListener(new h(this, 9));
        org.telegram.messenger.mp messagesController = getMessagesController();
        org.telegram.messenger.ro roVar = this.c;
        messagesController.w5(roVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                long o4 = org.telegram.messenger.n5.o(tL_exportedChatlistInvite.peers.get(i7));
                arrayList2.add(Long.valueOf(o4));
                this.e.add(Long.valueOf(o4));
                arrayList3.add(Long.valueOf(o4));
            }
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = roVar.k;
            arrayList = roVar.k;
            if (i10 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (dialog != null && !org.telegram.messenger.n5.C(dialog.id) && !arrayList2.contains(Long.valueOf(dialog.id))) {
                long j3 = dialog.id;
                boolean z10 = j3 < 0;
                if (j3 < 0) {
                    z10 = kz.m0(getMessagesController().O0(Long.valueOf(-dialog.id)));
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
            if (dialog2 != null && !org.telegram.messenger.n5.C(dialog2.id) && !arrayList2.contains(Long.valueOf(dialog2.id)) && !arrayList3.contains(Long.valueOf(dialog2.id))) {
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
        jy jyVar2 = this.b;
        if (jyVar2 != null) {
            jyVar2.f();
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
                if (!arrayList.contains(Long.valueOf(org.telegram.messenger.n5.o(tL_exportedChatlistInvite.peers.get(i7))))) {
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

    public final void e0(org.telegram.ui.Components.f00 f00Var, boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        f00Var.a(org.telegram.messenger.gd.N0(arrayList.size() >= Math.min(f0(), arrayList2.size()) ? 2131751445 : 2131745474, null), new di.p6(this, f00Var, z10, 28));
        this.G = true;
        d0();
        c0();
        k0(true);
        l0();
        for (int i7 = 0; i7 < this.a.getChildCount(); i7++) {
            View childAt = this.a.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.i4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.i4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int f0() {
        return getUserConfig().q() ? getMessagesController().R4 : getMessagesController().Q4;
    }

    public final String g0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
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
            tL_exportedChatlistInvite.peers.add(getMessagesController().B1(((Long) arrayList.get(i7)).longValue()));
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
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().l1(((Long) arrayList.get(i10)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new xx(this, 0));
        org.telegram.messenger.x10 x10Var = this.y;
        if (x10Var != null) {
            x10Var.a(tL_exportedChatlistInvite);
        }
    }

    public final void i0(boolean z10) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String N0 = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? org.telegram.messenger.gd.N0(2131750692, null) : tL_exportedChatlistInvite.title;
        if (!z10) {
            this.simpleActionBar.setTitle(N0);
            return;
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        z4Var.getClass();
        z4Var.I(N0, false, 220L, org.telegram.ui.Components.nr.h);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.R);
        }
        org.telegram.ui.ActionBar.c5 c5Var = this.n;
        if (c5Var != null) {
            c5Var.b(z10);
        }
    }

    public final void k0(boolean z10) {
        org.telegram.ui.Components.f00 f00Var = this.P;
        if (f00Var == null) {
            return;
        }
        ArrayList arrayList = this.e;
        f00Var.b(arrayList.size() <= 0 ? org.telegram.messenger.gd.O0("FilterInviteHeaderChatsEmpty") : org.telegram.messenger.gd.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]), z10);
        ArrayList arrayList2 = this.f;
        if (arrayList2.size() > 1) {
            boolean z11 = arrayList.size() >= Math.min(f0(), arrayList2.size());
            this.P.a(org.telegram.messenger.gd.N0(!z11 ? 2131745474 : 2131751445, null), new org.telegram.ui.Components.rp0(8, this, z11));
        } else {
            this.P.a("", null);
        }
        if (z10) {
            org.telegram.messenger.g0.i2(((Object) this.P.a.getText()) + ", " + ((Object) this.P.b.getText()));
        }
    }

    public final void l0() {
        yx yxVar = this.Q;
        if (yxVar == null) {
            return;
        }
        if (this.d == null) {
            String N0 = org.telegram.messenger.gd.N0(2131750738, null);
            xh.l lVar = yxVar.a;
            lVar.setText(N0);
            lVar.s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = yxVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.ro roVar = this.c;
        Spannable B5 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(roVar.b, fontMetricsInt, false, null, 0), roVar.c, fontMetricsInt, false);
        yx yxVar2 = this.Q;
        SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(org.telegram.messenger.gd.F("FilterInviteHeader", this.e.size(), B5));
        boolean z10 = roVar.n;
        xh.l lVar2 = yxVar2.a;
        lVar2.setText(V2);
        lVar2.s = z10 ? 26 : 0;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        return b0(z10);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
            this.F = 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
