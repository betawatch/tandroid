package kh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import fg.e2;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MemberRequestsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class v implements f5 {
    public final boolean a;
    public boolean b;
    public final p2 g;
    public final FrameLayout h;
    public final MemberRequestsController i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public zw0 n;
    public zw0 o;
    public sl0 p;
    public u00 q;
    public TLRPC.TL_chatInviteImporter r;
    public u s;
    public String t;
    public i u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final n f = new n(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final i C = new i(this, 0);
    public final e2 D = new e2(this, 3);

    public v(p2 p2Var, FrameLayout frameLayout, long j10, boolean z4) {
        this.g = p2Var;
        this.h = frameLayout;
        this.j = j10;
        int currentAccount = p2Var.getCurrentAccount();
        this.k = currentAccount;
        this.a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.l = z4;
        this.i = MemberRequestsController.getInstance(currentAccount);
    }

    public static void k(View view, boolean z4, boolean z10) {
        if (view == null) {
            return;
        }
        boolean z11 = view.getVisibility() == 0;
        float f10 = z4 ? 1.0f : 0.0f;
        if (z4 == z11 && f10 == view.getAlpha()) {
            return;
        }
        if (!z10) {
            view.setVisibility(z4 ? 0 : 4);
            return;
        }
        if (z4) {
            view.setAlpha(0.0f);
        }
        view.setVisibility(0);
        view.animate().alpha(f10).setDuration(150L).start();
    }

    public final zw0 a() {
        if (this.n == null) {
            p2 p2Var = this.g;
            zw0 zw0Var = new zw0(p2Var.getParentActivity(), null, 16, p2Var.getResourceProvider());
            this.n = zw0Var;
            boolean z4 = this.a;
            zw0Var.d.setText(LocaleController.getString(z4 ? R.string.NoSubscribeRequests : R.string.NoMemberRequests));
            this.n.e.setText(LocaleController.getString(z4 ? R.string.NoSubscribeRequestsDescription : R.string.NoMemberRequestsDescription));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final u00 b() {
        if (this.q == null) {
            p2 p2Var = this.g;
            u00 u00Var = new u00(p2Var.getParentActivity(), p2Var.getResourceProvider());
            this.q = u00Var;
            u00Var.setAlpha(0.0f);
            if (this.B) {
                this.q.setBackgroundColor(k6.v0(k6.d6, p2Var.getResourceProvider()));
            }
            this.q.f(k6.d6, k6.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final zw0 c() {
        if (this.o == null) {
            p2 p2Var = this.g;
            zw0 zw0Var = new zw0(p2Var.getParentActivity(), null, 1, p2Var.getResourceProvider());
            this.o = zw0Var;
            if (this.B) {
                zw0Var.setBackgroundColor(k6.v0(k6.d6, p2Var.getResourceProvider()));
            }
            this.o.d.setText(LocaleController.getString(R.string.NoResult));
            this.o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.o.setAnimateLayoutChange(true);
            this.o.setVisibility(8);
        }
        return this.o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z4;
        int i10 = this.k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new g(this, tL_chatInviteImporter, z4, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z4 = true;
        if (this.A && (cachedImporters = this.i.getCachedImporters(this.j)) != null) {
            this.z = true;
            g(cachedImporters, null, true, true);
            z4 = false;
        }
        AndroidUtilities.runOnUIThread(new f(0, this, z4));
    }

    public void f(String str, boolean z4, boolean z10) {
        boolean z11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z11 = !arrayList.isEmpty() || z4;
            zw0 zw0Var = this.n;
            if (zw0Var != null) {
                zw0Var.setVisibility(z11 ? 4 : 0);
            }
            zw0 zw0Var2 = this.o;
            if (zw0Var2 != null) {
                zw0Var2.setVisibility(4);
            }
        } else {
            z11 = !this.c.isEmpty() || z4;
            zw0 zw0Var3 = this.n;
            if (zw0Var3 != null) {
                zw0Var3.setVisibility(4);
            }
            zw0 zw0Var4 = this.o;
            if (zw0Var4 != null) {
                zw0Var4.setVisibility(z11 ? 4 : 0);
            }
        }
        k(this.p, z11, true);
        if (arrayList.isEmpty()) {
            zw0 zw0Var5 = this.n;
            if (zw0Var5 != null) {
                zw0Var5.setVisibility(0);
            }
            zw0 zw0Var6 = this.o;
            if (zw0Var6 != null) {
                zw0Var6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().n().j(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z4, boolean z10) {
        boolean z11;
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList;
        int i10;
        boolean z12;
        ArrayList arrayList2 = this.c;
        boolean z13 = !arrayList2.isEmpty() && this.x;
        for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
            this.d.put(user.id, user);
        }
        n nVar = this.f;
        if (z4) {
            nVar.E(tL_messages_chatInviteImporters.importers);
        } else {
            if (tL_messages_chatInviteImporters.importers.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z11 = true;
                    if (z11) {
                        nVar.u(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    v vVar = nVar.c;
                    ArrayList arrayList3 = vVar.c;
                    i10 = 0;
                    while (i10 < arrayList.size()) {
                        long j10 = arrayList.get(i10).user_id;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList3.size()) {
                                break;
                            }
                            if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == j10) {
                                arrayList.remove(i10);
                                i10--;
                                break;
                            }
                            i12++;
                        }
                        i10++;
                    }
                    arrayList3.addAll(arrayList);
                    nVar.s((arrayList3.size() + (!vVar.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z11) {
                        nVar.o(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z11 = false;
            if (z11) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            v vVar2 = nVar.c;
            ArrayList arrayList32 = vVar2.c;
            i10 = 0;
            while (i10 < arrayList.size()) {
            }
            arrayList32.addAll(arrayList);
            nVar.s((arrayList32.size() + (!vVar2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
            if (z11) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList4 = this.e;
            if (z4) {
                arrayList4.clear();
            }
            arrayList4.addAll(tL_messages_chatInviteImporters.importers);
            if (this.l) {
                z12 = false;
                this.g.getActionBar().n().k(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
                f(str, z10, z12);
                this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count;
                if (z13 == (arrayList2.isEmpty() && this.x)) {
                    if (this.x) {
                        nVar.o(nVar.h() - 1);
                        return;
                    } else {
                        nVar.u(nVar.h());
                        return;
                    }
                }
                return;
            }
        }
        z12 = false;
        f(str, z10, z12);
        this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count;
        if (z13 == (arrayList2.isEmpty() && this.x)) {
        }
    }

    public final void h(View view) {
        if (view instanceof g5) {
            if (this.y) {
                AndroidUtilities.hideKeyboard(this.g.getParentActivity().getCurrentFocus());
            }
            AndroidUtilities.runOnUIThread(new gf.c(19, this, (g5) view), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z4) {
        int i10;
        sl0 sl0Var = this.p;
        if (sl0Var == null || (i10 = !this.f.c.B ? 1 : 0) < 0 || i10 >= sl0Var.getChildCount()) {
            return;
        }
        this.p.getChildAt(i10).setEnabled(z4);
    }

    public final void j(String str) {
        if (this.u != null) {
            Utilities.searchQueue.cancelRunnable(this.u);
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
            zw0 zw0Var = this.o;
            if (zw0Var != null) {
                zw0Var.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().n().k(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            this.f.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            i iVar = new i(this, 2);
            this.u = iVar;
            dispatchQueue.postRunnable(iVar, 300L);
        }
        if (str != null) {
            zw0 zw0Var2 = this.n;
            if (zw0Var2 != null) {
                zw0Var2.setVisibility(4);
            }
            zw0 zw0Var3 = this.o;
            if (zw0Var3 != null) {
                zw0Var3.setVisibility(4);
            }
        }
    }
}
