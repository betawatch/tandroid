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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class me4 extends d {
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
    public in4 P;
    public be4 Q;
    public final a14 R;
    public smb a;
    public le4 b;
    public final ub7 c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public uja n;
    public int r;
    public long s;
    public long w;
    public qac x;
    public qac y;

    public me4(ub7 ub7Var, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        this.R = new a14(this, (byte) 15);
        this.c = ub7Var;
        this.d = tL_exportedChatlistInvite;
    }

    public final boolean Z(boolean z) {
        final byte b = 1;
        if (this.e.isEmpty() || !this.G) {
            return true;
        }
        final byte b2 = 0;
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131743522, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131743521, null);
            alertDialog$Builder.j(jb6.M0(2131754181, null), new ee(this) { // from class: zd4
                public final /* synthetic */ me4 b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i) {
                    byte b3 = b2;
                    me4 me4Var = this.b;
                    switch (b3) {
                        case 0:
                            me4Var.h0();
                            break;
                        default:
                            me4Var.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.g(jb6.M0(2131747313, null), new ee(this) { // from class: zd4
                public final /* synthetic */ me4 b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i) {
                    byte b3 = b;
                    me4 me4Var = this.b;
                    switch (b3) {
                        case 0:
                            me4Var.h0();
                            break;
                        default:
                            me4Var.finishFragment();
                            break;
                    }
                }
            });
            showDialog(heVar);
        }
        return false;
    }

    public final void a0() {
        this.n.a(this.G && !this.e.isEmpty(), true);
    }

    public final void b0() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.G) {
            return;
        }
        ArrayList arrayList = this.e;
        boolean z = true;
        boolean z2 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z2) {
            for (int i = 0; i < tL_exportedChatlistInvite.peers.size(); i++) {
                if (!arrayList.contains(Long.valueOf(pg3.n(tL_exportedChatlistInvite.peers.get(i))))) {
                    break;
                }
            }
        }
        z = z2;
        if (z) {
            return;
        }
        this.G = false;
        a0();
    }

    public final void c0(in4 in4Var, boolean z) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z) {
            arrayList.addAll(arrayList2.subList(0, Math.min(d0(), arrayList2.size())));
        }
        in4Var.a(jb6.M0(arrayList.size() >= Math.min(d0(), arrayList2.size()) ? 2131751394 : 2131745404, null), new np6((Object) this, (Object) in4Var, z, (byte) 21));
        this.G = true;
        b0();
        a0();
        k0(true);
        l0();
        for (int i = 0; i < this.a.getChildCount(); i++) {
            View childAt = this.a.getChildAt(i);
            if (childAt instanceof xc5) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((xc5) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        return Z(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ArrayList arrayList;
        le4 le4Var;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        i0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 16));
        this.n = this.simpleActionBar.s(jb6.M0(2131745680, null));
        a0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        smb smbVar = new smb(context, null, (byte) 7);
        this.a = smbVar;
        smbVar.setLayoutManager(new u46(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        smb smbVar2 = this.a;
        le4 le4Var2 = new le4(this);
        this.b = le4Var2;
        smbVar2.setAdapter(le4Var2);
        this.a.setOnItemClickListener(new u(this, (byte) 27));
        oc7 messagesController = getMessagesController();
        ub7 ub7Var = this.c;
        messagesController.s5(ub7Var);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i = 0; i < tL_exportedChatlistInvite.peers.size(); i++) {
                long n = pg3.n(tL_exportedChatlistInvite.peers.get(i));
                arrayList2.add(Long.valueOf(n));
                this.e.add(Long.valueOf(n));
                arrayList3.add(Long.valueOf(n));
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList4 = ub7Var.k;
            arrayList = ub7Var.k;
            if (i2 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i2);
            if (dialog != null && !pg3.B(dialog.id) && !arrayList2.contains(Long.valueOf(dialog.id))) {
                if (dialog.id < 0 ? qf4.j0(getMessagesController().L0(Long.valueOf(-dialog.id))) : false) {
                    arrayList2.add(Long.valueOf(dialog.id));
                    arrayList3.add(Long.valueOf(dialog.id));
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i3);
            if (dialog2 != null && !pg3.B(dialog2.id) && !arrayList2.contains(Long.valueOf(dialog2.id)) && !arrayList3.contains(Long.valueOf(dialog2.id))) {
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
                le4Var = this.b;
                if (le4Var != null) {
                    le4Var.f();
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
        le4Var = this.b;
        if (le4Var != null) {
        }
        return this.fragmentView;
    }

    public final int d0() {
        boolean p = getUserConfig().p();
        gs gsVar = getMessagesController().l4;
        return (p ? gsVar.c1 : gsVar.b1).f();
    }

    public final String e0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || (str = tL_exportedChatlistInvite.url) == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    public final void f0(int i, View view) {
        String str;
        me4 me4Var;
        if (getParentActivity() == null || !(view instanceof xc5)) {
            return;
        }
        Long l = (Long) this.h.get(i - this.M);
        long longValue = l.longValue();
        ArrayList arrayList = this.e;
        if (arrayList.contains(l)) {
            arrayList.remove(l);
            this.G = true;
            a0();
            ((xc5) view).c(false, true);
            me4Var = this;
        } else {
            if (!this.f.contains(l)) {
                int i2 = -this.r;
                this.r = i2;
                gm.A3(i2, view, null);
                xx0.E.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(getMessagesController().W1(l));
                    TLRPC.User W1 = getMessagesController().W1(l);
                    str = (W1 == null || !W1.bot) ? jb6.M0(2131750675, null) : jb6.M0(2131750707, null);
                } else {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-longValue));
                    String M0 = sd2.V(L0) ? sd2.t0(L0) ? jb6.M0(2131750705, null) : jb6.M0(2131750678, null) : sd2.t0(L0) ? jb6.M0(2131750694, null) : jb6.M0(2131750677, null);
                    arrayList2.add(L0);
                    str = M0;
                }
                if (this.s != longValue || System.currentTimeMillis() - this.w > 1500) {
                    this.s = longValue;
                    this.w = System.currentTimeMillis();
                    c41.b0(this).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            if (arrayList.size() + 1 > d0()) {
                showDialog(new i46(4, this.currentAccount, null, getParentActivity(), this));
                return;
            }
            me4Var = this;
            arrayList.add(l);
            me4Var.G = true;
            me4Var.a0();
            ((xc5) view).c(true, true);
        }
        me4Var.b0();
        me4Var.k0(true);
        me4Var.l0();
    }

    public final void g0(TLRPC.TL_error tL_error) {
        me4 me4Var;
        j0(false);
        this.E = false;
        if (tL_error == null) {
            me4Var = this;
        } else {
            if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                showDialog(new i46(12, this.currentAccount, null, getParentActivity(), this));
                return;
            }
            me4Var = this;
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                me4Var.showDialog(new i46(4, me4Var.currentAccount, null, me4Var.getParentActivity(), me4Var));
                return;
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                me4Var.showDialog(new i46(13, me4Var.currentAccount, null, me4Var.getParentActivity(), me4Var));
                return;
            }
        }
        me4Var.finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
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
        byte b = 0;
        int i = 0;
        while (true) {
            arrayList = this.e;
            if (i >= arrayList.size()) {
                break;
            }
            tL_exportedChatlistInvite.peers.add(getMessagesController().x1(((Long) arrayList.get(i)).longValue()));
            i++;
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c.a;
        tL_chatlists_editExportedInvite.slug = e0();
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().i1(((Long) arrayList.get(i2)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new ae4(this, b));
        qac qacVar = this.y;
        if (qacVar != null) {
            qacVar.a(tL_exportedChatlistInvite);
        }
    }

    public final void i0(boolean z) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String M0 = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? jb6.M0(2131750641, null) : tL_exportedChatlistInvite.title;
        rja rjaVar = this.simpleActionBar;
        if (!z) {
            rjaVar.setTitle(M0);
        } else {
            rjaVar.getClass();
            rjaVar.I(M0, false, 220L, d53.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z) {
        if (!z) {
            gm.r(this.R);
        }
        uja ujaVar = this.n;
        if (ujaVar != null) {
            ujaVar.b(z);
        }
    }

    public final void k0(boolean z) {
        in4 in4Var = this.P;
        if (in4Var != null) {
            ArrayList arrayList = this.e;
            in4Var.b(arrayList.size() <= 0 ? jb6.N0("FilterInviteHeaderChatsEmpty") : jb6.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]), z);
            ArrayList arrayList2 = this.f;
            if (arrayList2.size() > 1) {
                boolean z2 = arrayList.size() >= Math.min(d0(), arrayList2.size());
                this.P.a(jb6.M0(!z2 ? 2131745404 : 2131751394, null), new y8c((byte) 19, this, z2));
            } else {
                this.P.a("", null);
            }
            if (z) {
                gm.g2(((Object) this.P.a.getText()) + ", " + ((Object) this.P.b.getText()));
            }
        }
    }

    public final void l0() {
        be4 be4Var = this.Q;
        if (be4Var == null) {
            return;
        }
        if (this.d == null) {
            String M0 = jb6.M0(2131750687, null);
            xna xnaVar = be4Var.a;
            xnaVar.setText(M0);
            xnaVar.s = (byte) 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = be4Var.getSubtitleTextView().getPaint().getFontMetricsInt();
        ub7 ub7Var = this.c;
        Spannable A5 = k47.A5(gw3.m(ub7Var.b, fontMetricsInt, false, null, 0), ub7Var.c, fontMetricsInt, false);
        be4 be4Var2 = this.Q;
        SpannableStringBuilder R2 = gm.R2(jb6.F("FilterInviteHeader", this.e.size(), A5));
        boolean z = ub7Var.n;
        xna xnaVar2 = be4Var2.a;
        xnaVar2.setText(R2);
        xnaVar2.s = z ? (byte) 26 : (byte) 0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        return Z(z);
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
