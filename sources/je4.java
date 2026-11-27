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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class je4 extends e {
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
    public nn4 P;
    public yd4 Q;
    public final lw3 R;
    public qob a;
    public ie4 b;
    public final ac7 c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public nla n;
    public int r;
    public long s;
    public long w;
    public pcc x;
    public pcc y;

    public je4(ac7 ac7Var, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        this.R = new lw3(this, (byte) 21);
        this.c = ac7Var;
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
            String M0 = ob6.M0(2131743490, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131743489, null);
            alertDialog$Builder.j(ob6.M0(2131754209, null), new fd(this) { // from class: xd4
                public final /* synthetic */ je4 b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar2, int i) {
                    byte b3 = b2;
                    je4 je4Var = this.b;
                    switch (b3) {
                        case 0:
                            je4Var.g0();
                            break;
                        default:
                            je4Var.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.g(ob6.M0(2131747307, null), new fd(this) { // from class: xd4
                public final /* synthetic */ je4 b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar2, int i) {
                    byte b3 = b;
                    je4 je4Var = this.b;
                    switch (b3) {
                        case 0:
                            je4Var.g0();
                            break;
                        default:
                            je4Var.finishFragment();
                            break;
                    }
                }
            });
            showDialog(idVar);
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
                if (!arrayList.contains(Long.valueOf(wf3.n(tL_exportedChatlistInvite.peers.get(i))))) {
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

    public final void b0(nn4 nn4Var, boolean z) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z) {
            arrayList.addAll(arrayList2.subList(0, Math.min(c0(), arrayList2.size())));
        }
        nn4Var.a(ob6.M0(arrayList.size() >= Math.min(c0(), arrayList2.size()) ? 2131751422 : 2131745398, null), new ds6((Object) this, (Object) nn4Var, z, (byte) 20));
        this.G = true;
        a0();
        Z();
        j0(true);
        k0();
        for (int i = 0; i < this.a.getChildCount(); i++) {
            View childAt = this.a.getChildAt(i);
            if (childAt instanceof bd5) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((bd5) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int c0() {
        boolean p = getUserConfig().p();
        hr hrVar = getMessagesController().k4;
        return (p ? hrVar.k1 : hrVar.j1).f();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        return Y(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ArrayList arrayList;
        ie4 ie4Var;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        h0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 16));
        this.n = this.simpleActionBar.u(ob6.M0(2131745674, null));
        Z();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        qob qobVar = new qob(context, null, (byte) 7);
        this.a = qobVar;
        qobVar.setLayoutManager(new x46(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.s1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        qob qobVar2 = this.a;
        ie4 ie4Var2 = new ie4(this);
        this.b = ie4Var2;
        qobVar2.setAdapter(ie4Var2);
        this.a.setOnItemClickListener(new u(this, (byte) 26));
        uc7 messagesController = getMessagesController();
        ac7 ac7Var = this.c;
        messagesController.y5(ac7Var);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i = 0; i < tL_exportedChatlistInvite.peers.size(); i++) {
                long n = wf3.n(tL_exportedChatlistInvite.peers.get(i));
                arrayList2.add(Long.valueOf(n));
                this.e.add(Long.valueOf(n));
                arrayList3.add(Long.valueOf(n));
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList4 = ac7Var.k;
            arrayList = ac7Var.k;
            if (i2 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i2);
            if (dialog != null && !wf3.B(dialog.id) && !arrayList2.contains(Long.valueOf(dialog.id))) {
                if (dialog.id < 0 ? nf4.i0(getMessagesController().M0(Long.valueOf(-dialog.id))) : false) {
                    arrayList2.add(Long.valueOf(dialog.id));
                    arrayList3.add(Long.valueOf(dialog.id));
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i3);
            if (dialog2 != null && !wf3.B(dialog2.id) && !arrayList2.contains(Long.valueOf(dialog2.id)) && !arrayList3.contains(Long.valueOf(dialog2.id))) {
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
                ie4Var = this.b;
                if (ie4Var != null) {
                    ie4Var.f();
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
        ie4Var = this.b;
        if (ie4Var != null) {
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
        je4 je4Var;
        if (getParentActivity() == null || !(view instanceof bd5)) {
            return;
        }
        Long l = (Long) this.h.get(i - this.M);
        long longValue = l.longValue();
        ArrayList arrayList = this.e;
        if (arrayList.contains(l)) {
            arrayList.remove(l);
            this.G = true;
            Z();
            ((bd5) view).c(false, true);
            je4Var = this;
        } else {
            if (!this.f.contains(l)) {
                int i2 = -this.r;
                this.r = i2;
                hl.A3(i2, view, null);
                yw0.E.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(getMessagesController().X1(l));
                    TLRPC.User X1 = getMessagesController().X1(l);
                    str = (X1 == null || !X1.bot) ? ob6.M0(2131750703, null) : ob6.M0(2131750735, null);
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-longValue));
                    String M02 = xc2.V(M0) ? xc2.t0(M0) ? ob6.M0(2131750733, null) : ob6.M0(2131750706, null) : xc2.t0(M0) ? ob6.M0(2131750722, null) : ob6.M0(2131750705, null);
                    arrayList2.add(M0);
                    str = M02;
                }
                if (this.s != longValue || System.currentTimeMillis() - this.w > 1500) {
                    this.s = longValue;
                    this.w = System.currentTimeMillis();
                    d31.b0(this).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            if (arrayList.size() + 1 > c0()) {
                showDialog(new l46(4, this.currentAccount, null, getParentActivity(), this));
                return;
            }
            je4Var = this;
            arrayList.add(l);
            je4Var.G = true;
            je4Var.Z();
            ((bd5) view).c(true, true);
        }
        je4Var.a0();
        je4Var.j0(true);
        je4Var.k0();
    }

    public final void f0(TLRPC.TL_error tL_error) {
        je4 je4Var;
        i0(false);
        this.E = false;
        if (tL_error == null) {
            je4Var = this;
        } else {
            if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                showDialog(new l46(12, this.currentAccount, null, getParentActivity(), this));
                return;
            }
            je4Var = this;
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                je4Var.showDialog(new l46(4, je4Var.currentAccount, null, je4Var.getParentActivity(), je4Var));
                return;
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                je4Var.showDialog(new l46(13, je4Var.currentAccount, null, je4Var.getParentActivity(), je4Var));
                return;
            }
        }
        je4Var.finishFragment();
    }

    public final void g0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null || this.E || !this.G) {
            return;
        }
        byte b = 1;
        i0(true);
        this.E = true;
        tL_exportedChatlistInvite.peers.clear();
        int i = 0;
        while (true) {
            arrayList = this.e;
            if (i >= arrayList.size()) {
                break;
            }
            tL_exportedChatlistInvite.peers.add(getMessagesController().y1(((Long) arrayList.get(i)).longValue()));
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
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().j1(((Long) arrayList.get(i2)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new vd4(this, b));
        pcc pccVar = this.y;
        if (pccVar != null) {
            pccVar.a(tL_exportedChatlistInvite);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0(boolean z) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        String M0 = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? ob6.M0(2131750669, null) : tL_exportedChatlistInvite.title;
        jla jlaVar = this.simpleActionBar;
        if (!z) {
            jlaVar.setTitle(M0);
        } else {
            jlaVar.getClass();
            jlaVar.K(M0, false, 220L, k43.h);
        }
    }

    public final void i0(boolean z) {
        if (!z) {
            hl.r(this.R);
        }
        nla nlaVar = this.n;
        if (nlaVar != null) {
            nlaVar.b(z);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z) {
        nn4 nn4Var = this.P;
        if (nn4Var != null) {
            ArrayList arrayList = this.e;
            nn4Var.b(arrayList.size() <= 0 ? ob6.N0("FilterInviteHeaderChatsEmpty") : ob6.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]), z);
            ArrayList arrayList2 = this.f;
            if (arrayList2.size() > 1) {
                boolean z2 = arrayList.size() >= Math.min(c0(), arrayList2.size());
                this.P.a(ob6.M0(!z2 ? 2131745398 : 2131751422, null), new xac((byte) 19, this, z2));
            } else {
                this.P.a("", null);
            }
            if (z) {
                hl.g2(((Object) this.P.a.getText()) + ", " + ((Object) this.P.b.getText()));
            }
        }
    }

    public final void k0() {
        yd4 yd4Var = this.Q;
        if (yd4Var == null) {
            return;
        }
        if (this.d == null) {
            String M0 = ob6.M0(2131750715, null);
            tpa tpaVar = yd4Var.a;
            tpaVar.setText(M0);
            tpaVar.s = (byte) 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = yd4Var.getSubtitleTextView().getPaint().getFontMetricsInt();
        ac7 ac7Var = this.c;
        Spannable A5 = r47.A5(pv3.m(ac7Var.b, fontMetricsInt, false, null, 0), ac7Var.c, fontMetricsInt, false);
        yd4 yd4Var2 = this.Q;
        SpannableStringBuilder R2 = hl.R2(ob6.F("FilterInviteHeader", this.e.size(), A5));
        boolean z = ac7Var.n;
        tpa tpaVar2 = yd4Var2.a;
        tpaVar2.setText(R2);
        tpaVar2.s = z ? (byte) 26 : (byte) 0;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        return Y(z);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
            this.F = 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
