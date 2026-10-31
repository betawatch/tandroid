package oh;

import ag.m1;
import ag.u;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import k2.v;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.r5;
import org.telegram.messenger.vi;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class q implements h5 {
    public final boolean a;
    public boolean b;
    public final k2 g;
    public final FrameLayout h;
    public final vi i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public dw0 n;
    public dw0 o;
    public tk0 p;
    public zz q;
    public TLRPC.TL_chatInviteImporter r;
    public p s;
    public String t;
    public f u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final j f = new j(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final f C = new f(this, 0);
    public final u D = new u(this, 8);

    public q(k2 k2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.g = k2Var;
        this.h = frameLayout;
        this.j = j10;
        int currentAccount = k2Var.getCurrentAccount();
        this.k = currentAccount;
        this.a = w3.U(currentAccount, j10);
        this.l = z10;
        this.i = vi.b(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        boolean z12 = view.getVisibility() == 0;
        float f7 = z10 ? 1.0f : 0.0f;
        if (z10 == z12 && f7 == view.getAlpha()) {
            return;
        }
        if (!z11) {
            view.setVisibility(z10 ? 0 : 4);
            return;
        }
        if (z10) {
            view.setAlpha(0.0f);
        }
        view.setVisibility(0);
        view.animate().alpha(f7).setDuration(150L).start();
    }

    public final dw0 a() {
        if (this.n == null) {
            k2 k2Var = this.g;
            dw0 dw0Var = new dw0(k2Var.getParentActivity(), null, 16, k2Var.getResourceProvider());
            this.n = dw0Var;
            boolean z10 = this.a;
            dw0Var.d.setText(cd.L0(z10 ? 2131748162 : 2131748212, null));
            this.n.e.setText(cd.L0(z10 ? 2131748161 : 2131748211, null));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final zz b() {
        if (this.q == null) {
            k2 k2Var = this.g;
            zz zzVar = new zz(k2Var.getParentActivity(), k2Var.getResourceProvider());
            this.q = zzVar;
            zzVar.setAlpha(0.0f);
            if (this.B) {
                a7.i(t6.d6, this.q, k2Var.getResourceProvider());
            }
            this.q.e(t6.d6, t6.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final dw0 c() {
        if (this.o == null) {
            k2 k2Var = this.g;
            dw0 dw0Var = new dw0(k2Var.getParentActivity(), null, 1, k2Var.getResourceProvider());
            this.o = dw0Var;
            if (this.B) {
                a7.i(t6.d6, dw0Var, k2Var.getResourceProvider());
            }
            this.o.d.setText(cd.L0(2131748183, null));
            this.o.e.setText(cd.L0(2131745824, null));
            this.o.setAnimateLayoutChange(true);
            this.o.setVisibility(8);
        }
        return this.o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.k;
        tL_messages_hideChatJoinRequest.peer = vp.r1(i10).i1(-this.j);
        tL_messages_hideChatJoinRequest.user_id = vp.r1(i10).p1(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new m1(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.i.a.get(this.j);
            if (tL_messages_chatInviteImporters != null) {
                this.z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z10 = false;
            }
        }
        i0.g3(new v(2, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z12 = !arrayList.isEmpty() || z10;
            dw0 dw0Var = this.n;
            if (dw0Var != null) {
                dw0Var.setVisibility(z12 ? 4 : 0);
            }
            dw0 dw0Var2 = this.o;
            if (dw0Var2 != null) {
                dw0Var2.setVisibility(4);
            }
        } else {
            z12 = !this.c.isEmpty() || z10;
            dw0 dw0Var3 = this.n;
            if (dw0Var3 != null) {
                dw0Var3.setVisibility(4);
            }
            dw0 dw0Var4 = this.o;
            if (dw0Var4 != null) {
                dw0Var4.setVisibility(z12 ? 4 : 0);
            }
        }
        k(this.p, z12, true);
        if (arrayList.isEmpty()) {
            dw0 dw0Var5 = this.n;
            if (dw0Var5 != null) {
                dw0Var5.setVisibility(0);
            }
            dw0 dw0Var6 = this.o;
            if (dw0Var6 != null) {
                dw0Var6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().p().i(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z10, boolean z11) {
        boolean z12;
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList;
        int i10;
        boolean z13;
        boolean z14;
        boolean z15;
        ArrayList arrayList2 = this.c;
        boolean z16 = true;
        boolean z17 = !arrayList2.isEmpty() && this.x;
        for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
            this.d.put(user.id, user);
        }
        j jVar = this.f;
        if (z10) {
            jVar.E(tL_messages_chatInviteImporters.importers);
            z13 = true;
        } else {
            if (tL_messages_chatInviteImporters.importers.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z12 = true;
                    if (z12) {
                        jVar.s(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    q qVar = jVar.c;
                    ArrayList arrayList3 = qVar.c;
                    i10 = 0;
                    while (i10 < arrayList.size()) {
                        long j10 = arrayList.get(i10).user_id;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList3.size()) {
                                z14 = z16;
                                break;
                            }
                            z14 = z16;
                            if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == j10) {
                                arrayList.remove(i10);
                                i10--;
                                break;
                            } else {
                                i12++;
                                z16 = z14;
                            }
                        }
                        i10++;
                        z16 = z14;
                    }
                    z13 = z16;
                    arrayList3.addAll(arrayList);
                    jVar.o((arrayList3.size() + (!qVar.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z12) {
                        jVar.i(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z12 = false;
            if (z12) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            q qVar2 = jVar.c;
            ArrayList arrayList32 = qVar2.c;
            i10 = 0;
            while (i10 < arrayList.size()) {
            }
            z13 = z16;
            arrayList32.addAll(arrayList);
            jVar.o((arrayList32.size() + (!qVar2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
            if (z12) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList4 = this.e;
            if (z10) {
                arrayList4.clear();
            }
            arrayList4.addAll(tL_messages_chatInviteImporters.importers);
            if (this.l) {
                z15 = false;
                this.g.getActionBar().p().j(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
                f(str, z11, z15);
                this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count ? z13 : z15;
                if (z17 == ((arrayList2.isEmpty() && this.x) ? z13 : z15)) {
                    if (this.x) {
                        jVar.i(jVar.b() - 1);
                        return;
                    } else {
                        jVar.s(jVar.b());
                        return;
                    }
                }
                return;
            }
        }
        z15 = false;
        f(str, z11, z15);
        this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count ? z13 : z15;
        if (z17 == ((arrayList2.isEmpty() && this.x) ? z13 : z15)) {
        }
    }

    public final void h(View view) {
        if (view instanceof i5) {
            if (this.y) {
                i0.v1(this.g.getParentActivity().getCurrentFocus());
            }
            i0.h3(new mh.k(8, this, (i5) view), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z10) {
        int i10;
        tk0 tk0Var = this.p;
        if (tk0Var == null || (i10 = !this.f.c.B ? 1 : 0) < 0 || i10 >= tk0Var.getChildCount()) {
            return;
        }
        this.p.getChildAt(i10).setEnabled(z10);
    }

    public final void j(String str) {
        if (this.u != null) {
            Utilities.g.a(this.u);
            this.u = null;
        }
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.t = str;
        if (this.z && this.e.isEmpty()) {
            k(this.q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f.E(this.e);
            k(this.p, true, true);
            k(this.q, false, false);
            dw0 dw0Var = this.o;
            if (dw0Var != null) {
                dw0Var.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().p().j(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            this.f.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            r5 r5Var = Utilities.g;
            f fVar = new f(this, 2);
            this.u = fVar;
            r5Var.d(fVar, 300L);
        }
        if (str != null) {
            dw0 dw0Var2 = this.n;
            if (dw0Var2 != null) {
                dw0Var2.setVisibility(4);
            }
            dw0 dw0Var3 = this.o;
            if (dw0Var3 != null) {
                dw0Var3.setVisibility(4);
            }
        }
    }
}
