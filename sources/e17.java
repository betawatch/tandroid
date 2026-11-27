// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class e17 implements r07 {
    public final boolean a;
    public boolean b;
    public final e g;
    public final FrameLayout h;
    public final u07 i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public z2b n;
    public z2b o;
    public d79 p;
    public tk4 q;
    public TLRPC.TL_chatInviteImporter r;
    public d17 s;
    public String t;
    public v07 u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final x07 f = new x07(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final v07 C = new v07(this, (byte) 0);
    public final to2 D = new to2(this, 23);

    public e17(e eVar, FrameLayout frameLayout, long j, boolean z) {
        this.g = eVar;
        this.h = frameLayout;
        this.j = j;
        int currentAccount = eVar.getCurrentAccount();
        this.k = currentAccount;
        this.a = xc2.U(currentAccount, j);
        this.l = z;
        this.i = u07.a(currentAccount);
    }

    public static void k(View view, boolean z, boolean z2) {
        if (view != null) {
            boolean z3 = view.getVisibility() == 0;
            float f = z ? 1.0f : 0.0f;
            if (z == z3 && f == view.getAlpha()) {
                return;
            }
            if (!z2) {
                view.setVisibility(z ? 0 : 4);
                return;
            }
            if (z) {
                view.setAlpha(0.0f);
            }
            view.setVisibility(0);
            view.animate().alpha(f).setDuration(150L).start();
        }
    }

    public final z2b a() {
        if (this.n == null) {
            e eVar = this.g;
            z2b z2bVar = new z2b(eVar.getParentActivity(), null, 16, eVar.getResourceProvider());
            this.n = z2bVar;
            boolean z = this.a;
            z2bVar.d.setText(ob6.M0(z ? 2131747877 : 2131747926, null));
            this.n.e.setText(ob6.M0(z ? 2131747876 : 2131747925, null));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final tk4 b() {
        if (this.q == null) {
            e eVar = this.g;
            tk4 tk4Var = new tk4(eVar.getParentActivity(), eVar.getResourceProvider());
            this.q = tk4Var;
            tk4Var.setAlpha(0.0f);
            if (this.B) {
                yob.h(aob.d6, eVar.getResourceProvider(), this.q);
            }
            this.q.e(aob.d6, aob.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final z2b c() {
        if (this.o == null) {
            e eVar = this.g;
            z2b z2bVar = new z2b(eVar.getParentActivity(), null, 1, eVar.getResourceProvider());
            this.o = z2bVar;
            if (this.B) {
                yob.h(aob.d6, eVar.getResourceProvider(), z2bVar);
            }
            this.o.d.setText(ob6.M0(2131747898, null));
            this.o.e.setText(ob6.M0(2131745535, null));
            this.o.setAnimateLayoutChange(true);
            this.o.setVisibility(8);
        }
        return this.o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z;
        int i = this.k;
        tL_messages_hideChatJoinRequest.peer = uc7.s1(i).j1(-this.j);
        tL_messages_hideChatJoinRequest.user_id = uc7.s1(i).q1(user);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_hideChatJoinRequest, new gg2(this, tL_chatInviteImporter, z, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.i.a.get(this.j);
            if (tL_messages_chatInviteImporters != null) {
                this.z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z = false;
            }
        }
        hl.c3(new xac((byte) 27, this, z));
    }

    public void f(String str, boolean z, boolean z2) {
        boolean z3;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z3 = !arrayList.isEmpty() || z;
            z2b z2bVar = this.n;
            if (z2bVar != null) {
                z2bVar.setVisibility(z3 ? 4 : 0);
            }
            z2b z2bVar2 = this.o;
            if (z2bVar2 != null) {
                z2bVar2.setVisibility(4);
            }
        } else {
            z3 = !this.c.isEmpty() || z;
            z2b z2bVar3 = this.n;
            if (z2bVar3 != null) {
                z2bVar3.setVisibility(4);
            }
            z2b z2bVar4 = this.o;
            if (z2bVar4 != null) {
                z2bVar4.setVisibility(z3 ? 4 : 0);
            }
        }
        k(this.p, z3, true);
        if (arrayList.isEmpty()) {
            z2b z2bVar5 = this.n;
            if (z2bVar5 != null) {
                z2bVar5.setVisibility(0);
            }
            z2b z2bVar6 = this.o;
            if (z2bVar6 != null) {
                z2bVar6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().u().i(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z, boolean z2) {
        boolean z3;
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ArrayList arrayList2 = this.c;
        boolean z8 = false;
        boolean z9 = true;
        boolean z10 = !arrayList2.isEmpty() && this.x;
        for (int i2 = 0; i2 < tL_messages_chatInviteImporters.users.size(); i2++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i2);
            this.d.put(user.id, user);
        }
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList3 = tL_messages_chatInviteImporters.importers;
        x07 x07Var = this.f;
        if (z) {
            x07Var.E(arrayList3);
            z4 = true;
        } else {
            if (arrayList3.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z3 = true;
                    if (z3) {
                        x07Var.s(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    e17 e17Var = x07Var.c;
                    ArrayList arrayList4 = e17Var.c;
                    i = 0;
                    boolean z11 = z3;
                    while (i < arrayList.size()) {
                        long j = arrayList.get(i).user_id;
                        int i3 = 0;
                        boolean z12 = z11;
                        while (true) {
                            if (i3 >= arrayList4.size()) {
                                z6 = z9;
                                z7 = z12;
                                break;
                            }
                            z6 = z9;
                            z7 = z12;
                            if (((TLRPC.TL_chatInviteImporter) arrayList4.get(i3)).user_id == j) {
                                arrayList.remove(i);
                                i--;
                                break;
                            } else {
                                i3++;
                                z9 = z6;
                                z12 = z7;
                            }
                        }
                        i++;
                        z9 = z6;
                        z11 = z7;
                    }
                    z4 = z9;
                    z5 = z11;
                    arrayList4.addAll(arrayList);
                    x07Var.p((arrayList4.size() + (!e17Var.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z5) {
                        x07Var.i(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z3 = false;
            if (z3) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            e17 e17Var2 = x07Var.c;
            ArrayList arrayList42 = e17Var2.c;
            i = 0;
            boolean z112 = z3;
            while (i < arrayList.size()) {
            }
            z4 = z9;
            z5 = z112;
            arrayList42.addAll(arrayList);
            x07Var.p((arrayList42.size() + (!e17Var2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
            if (z5) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList5 = this.e;
            if (z) {
                arrayList5.clear();
            }
            arrayList5.addAll(tL_messages_chatInviteImporters.importers);
            if (this.l) {
                this.g.getActionBar().u().j(0).setVisibility(arrayList5.isEmpty() ? 8 : 0);
            }
        }
        f(str, z2, false);
        this.x = arrayList2.size() < tL_messages_chatInviteImporters.count ? z4 : false;
        if (!arrayList2.isEmpty() && this.x) {
            z8 = z4;
        }
        if (z10 != z8) {
            if (this.x) {
                x07Var.i(x07Var.b() - 1);
            } else {
                x07Var.s(x07Var.b());
            }
        }
    }

    public final void h(View view) {
        if (view instanceof s07) {
            if (this.y) {
                hl.t1(this.g.getParentActivity().getCurrentFocus());
            }
            hl.d3(new mn6((Object) this, view, (byte) 16), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z) {
        int i;
        d79 d79Var = this.p;
        if (d79Var == null || (i = !this.f.c.B ? 1 : 0) < 0 || i >= d79Var.getChildCount()) {
            return;
        }
        this.p.getChildAt(i).setEnabled(z);
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
        boolean isEmpty = TextUtils.isEmpty(str);
        x07 x07Var = this.f;
        if (isEmpty) {
            x07Var.E(this.e);
            k(this.p, true, true);
            k(this.q, false, false);
            z2b z2bVar = this.o;
            if (z2bVar != null) {
                z2bVar.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().u().j(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            x07Var.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            to3 to3Var = Utilities.g;
            v07 v07Var = new v07(this, (byte) 2);
            this.u = v07Var;
            to3Var.d(v07Var, 300L);
        }
        if (str != null) {
            z2b z2bVar2 = this.n;
            if (z2bVar2 != null) {
                z2bVar2.setVisibility(4);
            }
            z2b z2bVar3 = this.o;
            if (z2bVar3 != null) {
                z2bVar3.setVisibility(4);
            }
        }
    }
}
