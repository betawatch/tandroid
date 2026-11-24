// default package

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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mc4 extends d {
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
    public il4 P;
    public bc4 Q;
    public final s54 R;
    public rkb a;
    public lc4 b;
    public final t97 c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public sha n;
    public int r;
    public long s;
    public long w;
    public p8c x;
    public p8c y;

    public mc4(t97 t97Var, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        this.R = new s54(this, (byte) 8);
        this.c = t97Var;
        this.d = tL_exportedChatlistInvite;
    }

    public final boolean Y(boolean z) {
        final byte b = 1;
        if (this.e.isEmpty() || !this.G) {
            return true;
        }
        final byte b2 = 0;
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131743596, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131743595, null);
            alertDialog$Builder.j(k96.M0(2131754213, null), new ed(this) { // from class: zb4
                public final /* synthetic */ mc4 b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar2, int i) {
                    byte b3 = b2;
                    mc4 mc4Var = this.b;
                    switch (b3) {
                        case 0:
                            mc4Var.g0();
                            break;
                        default:
                            mc4Var.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.g(k96.M0(2131747387, null), new ed(this) { // from class: zb4
                public final /* synthetic */ mc4 b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar2, int i) {
                    byte b3 = b;
                    mc4 mc4Var = this.b;
                    switch (b3) {
                        case 0:
                            mc4Var.g0();
                            break;
                        default:
                            mc4Var.finishFragment();
                            break;
                    }
                }
            });
            showDialog(hdVar);
        }
        return false;
    }

    public final void Z() {
        this.n.a(this.G && !this.e.isEmpty(), true);
    }

    public final void a0() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.G) {
            return;
        }
        ArrayList arrayList = this.e;
        boolean z = true;
        boolean z2 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z2) {
            for (int i = 0; i < tL_exportedChatlistInvite.peers.size(); i++) {
                if (!arrayList.contains(Long.valueOf(cf3.n(tL_exportedChatlistInvite.peers.get(i))))) {
                    break;
                }
            }
        }
        z = z2;
        if (z) {
            return;
        }
        this.G = false;
        Z();
    }

    public final void b0(il4 il4Var, boolean z) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z) {
            arrayList.addAll(arrayList2.subList(0, Math.min(c0(), arrayList2.size())));
        }
        il4Var.a(k96.M0(arrayList.size() >= Math.min(c0(), arrayList2.size()) ? 2131751445 : 2131745478, null), new mn6((Object) this, (Object) il4Var, z, (byte) 21));
        this.G = true;
        a0();
        Z();
        j0(true);
        k0();
        for (int i = 0; i < this.a.getChildCount(); i++) {
            View childAt = this.a.getChildAt(i);
            if (childAt instanceof za5) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((za5) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int c0() {
        boolean p = getUserConfig().p();
        gr grVar = getMessagesController().k4;
        return (p ? grVar.c1 : grVar.b1).f();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        return Y(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ArrayList arrayList;
        lc4 lc4Var;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        h0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 15));
        this.n = this.simpleActionBar.s(k96.M0(2131745754, null));
        Z();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        rkb rkbVar = new rkb(context, null, (byte) 7);
        this.a = rkbVar;
        rkbVar.setLayoutManager(new t26(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        rkb rkbVar2 = this.a;
        lc4 lc4Var2 = new lc4(this);
        this.b = lc4Var2;
        rkbVar2.setAdapter(lc4Var2);
        this.a.setOnItemClickListener(new u(this, (byte) 26));
        na7 messagesController = getMessagesController();
        t97 t97Var = this.c;
        messagesController.p5(t97Var);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i = 0; i < tL_exportedChatlistInvite.peers.size(); i++) {
                long n = cf3.n(tL_exportedChatlistInvite.peers.get(i));
                arrayList2.add(Long.valueOf(n));
                this.e.add(Long.valueOf(n));
                arrayList3.add(Long.valueOf(n));
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList4 = t97Var.k;
            arrayList = t97Var.k;
            if (i2 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i2);
            if (dialog != null && !cf3.B(dialog.id) && !arrayList2.contains(Long.valueOf(dialog.id))) {
                if (dialog.id < 0 ? pd4.i0(getMessagesController().K0(Long.valueOf(-dialog.id))) : false) {
                    arrayList2.add(Long.valueOf(dialog.id));
                    arrayList3.add(Long.valueOf(dialog.id));
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i3);
            if (dialog2 != null && !cf3.B(dialog2.id) && !arrayList2.contains(Long.valueOf(dialog2.id)) && !arrayList3.contains(Long.valueOf(dialog2.id))) {
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
            if (arrayList2.isEmpty()) {
                this.L = -1;
                this.M = -1;
                this.N = -1;
                this.O = -1;
                lc4Var = this.b;
                if (lc4Var != null) {
                    lc4Var.f();
                }
                return this.fragmentView;
            }
        }
        int i4 = this.H;
        int i5 = i4 + 1;
        this.L = i4;
        int i6 = i4 + 2;
        this.H = i6;
        this.M = i5;
        int size = (arrayList2.size() - 1) + i6;
        this.N = size;
        this.H = size + 1;
        this.O = size;
        lc4Var = this.b;
        if (lc4Var != null) {
        }
        return this.fragmentView;
    }

    public final String d0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    public final void e0(int i, View view) {
        String str;
        mc4 mc4Var;
        if (getParentActivity() == null || !(view instanceof za5)) {
            return;
        }
        Long l = (Long) this.h.get(i - this.M);
        long longValue = l.longValue();
        ArrayList arrayList = this.e;
        if (arrayList.contains(l)) {
            arrayList.remove(l);
            this.G = true;
            Z();
            ((za5) view).c(false, true);
            mc4Var = this;
        } else {
            if (!this.f.contains(l)) {
                int i2 = -this.r;
                this.r = i2;
                gl.B3(i2, view, null);
                pw0.E.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(getMessagesController().V1(l));
                    TLRPC.User V1 = getMessagesController().V1(l);
                    str = (V1 == null || !V1.bot) ? k96.M0(2131750726, null) : k96.M0(2131750758, null);
                } else {
                    TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-longValue));
                    String M0 = hc2.V(K0) ? hc2.t0(K0) ? k96.M0(2131750756, null) : k96.M0(2131750729, null) : hc2.t0(K0) ? k96.M0(2131750745, null) : k96.M0(2131750728, null);
                    arrayList2.add(K0);
                    str = M0;
                }
                if (this.s != longValue || System.currentTimeMillis() - this.w > 1500) {
                    this.s = longValue;
                    this.w = System.currentTimeMillis();
                    u21.b0(this).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            if (arrayList.size() + 1 > c0()) {
                showDialog(new h26(4, this.currentAccount, null, getParentActivity(), this));
                return;
            }
            mc4Var = this;
            arrayList.add(l);
            mc4Var.G = true;
            mc4Var.Z();
            ((za5) view).c(true, true);
        }
        mc4Var.a0();
        mc4Var.j0(true);
        mc4Var.k0();
    }

    public final void f0(TLRPC.TL_error tL_error) {
        mc4 mc4Var;
        i0(false);
        this.E = false;
        if (tL_error == null) {
            mc4Var = this;
        } else {
            if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                showDialog(new h26(12, this.currentAccount, null, getParentActivity(), this));
                return;
            }
            mc4Var = this;
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                mc4Var.showDialog(new h26(4, mc4Var.currentAccount, null, mc4Var.getParentActivity(), mc4Var));
                return;
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                mc4Var.showDialog(new h26(13, mc4Var.currentAccount, null, mc4Var.getParentActivity(), mc4Var));
                return;
            }
        }
        mc4Var.finishFragment();
    }

    public final void g0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || this.E || !this.G) {
            return;
        }
        i0(true);
        this.E = true;
        tL_exportedChatlistInvite.peers.clear();
        byte b = 0;
        int i = 0;
        while (true) {
            arrayList = this.e;
            if (i >= arrayList.size()) {
                break;
            }
            tL_exportedChatlistInvite.peers.add(getMessagesController().w1(((Long) arrayList.get(i)).longValue()));
            i++;
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c.a;
        tL_chatlists_editExportedInvite.slug = d0();
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().h1(((Long) arrayList.get(i2)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new ac4(this, b));
        p8c p8cVar = this.y;
        if (p8cVar != null) {
            p8cVar.a(tL_exportedChatlistInvite);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0(boolean z) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String M0 = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? k96.M0(2131750692, null) : tL_exportedChatlistInvite.title;
        pha phaVar = this.simpleActionBar;
        if (!z) {
            phaVar.setTitle(M0);
        } else {
            phaVar.getClass();
            phaVar.I(M0, false, 220L, s33.h);
        }
    }

    public final void i0(boolean z) {
        if (!z) {
            gl.r(this.R);
        }
        sha shaVar = this.n;
        if (shaVar != null) {
            shaVar.b(z);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z) {
        il4 il4Var = this.P;
        if (il4Var != null) {
            ArrayList arrayList = this.e;
            il4Var.b(arrayList.size() <= 0 ? k96.N0("FilterInviteHeaderChatsEmpty") : k96.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]), z);
            ArrayList arrayList2 = this.f;
            if (arrayList2.size() > 1) {
                boolean z2 = arrayList.size() >= Math.min(c0(), arrayList2.size());
                this.P.a(k96.M0(!z2 ? 2131745478 : 2131751445, null), new x6c((byte) 19, this, z2));
            } else {
                this.P.a("", null);
            }
            if (z) {
                gl.g2(((Object) this.P.a.getText()) + ", " + ((Object) this.P.b.getText()));
            }
        }
    }

    public final void k0() {
        bc4 bc4Var = this.Q;
        if (bc4Var == null) {
            return;
        }
        if (this.d == null) {
            String M0 = k96.M0(2131750738, null);
            wla wlaVar = bc4Var.a;
            wlaVar.setText(M0);
            wlaVar.s = (byte) 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = bc4Var.getSubtitleTextView().getPaint().getFontMetricsInt();
        t97 t97Var = this.c;
        Spannable A5 = k27.A5(vu3.m(t97Var.b, fontMetricsInt, false, null, 0), t97Var.c, fontMetricsInt, false);
        bc4 bc4Var2 = this.Q;
        SpannableStringBuilder S2 = gl.S2(k96.F("FilterInviteHeader", this.e.size(), A5));
        boolean z = t97Var.n;
        wla wlaVar2 = bc4Var2.a;
        wlaVar2.setText(S2);
        wlaVar2.s = z ? (byte) 26 : (byte) 0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        return Y(z);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
            this.F = 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
