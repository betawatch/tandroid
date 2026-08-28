package eh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class x implements f5 {
    public final boolean a;
    public boolean b;
    public final o2 g;
    public final FrameLayout h;
    public final MemberRequestsController i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public gw0 n;
    public gw0 o;
    public wk0 p;
    public e00 q;
    public TLRPC.TL_chatInviteImporter r;
    public w s;
    public String t;
    public i u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final p f = new p(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final i C = new i(this, 0);
    public final bg.o2 D = new bg.o2(this, 2);

    public x(o2 o2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.g = o2Var;
        this.h = frameLayout;
        this.j = j10;
        int currentAccount = o2Var.getCurrentAccount();
        this.k = currentAccount;
        this.a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.l = z10;
        this.i = MemberRequestsController.getInstance(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        boolean z12 = view.getVisibility() == 0;
        float f10 = z10 ? 1.0f : 0.0f;
        if (z10 == z12 && f10 == view.getAlpha()) {
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
        view.animate().alpha(f10).setDuration(150L).start();
    }

    public final gw0 a() {
        if (this.n == null) {
            o2 o2Var = this.g;
            gw0 gw0Var = new gw0(o2Var.getParentActivity(), null, 16, o2Var.getResourceProvider());
            this.n = gw0Var;
            boolean z10 = this.a;
            gw0Var.d.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequests : R.string.NoMemberRequests));
            this.n.e.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequestsDescription : R.string.NoMemberRequestsDescription));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final e00 b() {
        if (this.q == null) {
            o2 o2Var = this.g;
            e00 e00Var = new e00(o2Var.getParentActivity(), o2Var.getResourceProvider());
            this.q = e00Var;
            e00Var.setAlpha(0.0f);
            if (this.B) {
                this.q.setBackgroundColor(f6.v0(f6.d6, o2Var.getResourceProvider()));
            }
            this.q.f(f6.d6, f6.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final gw0 c() {
        if (this.o == null) {
            o2 o2Var = this.g;
            gw0 gw0Var = new gw0(o2Var.getParentActivity(), null, 1, o2Var.getResourceProvider());
            this.o = gw0Var;
            if (this.B) {
                gw0Var.setBackgroundColor(f6.v0(f6.d6, o2Var.getResourceProvider()));
            }
            this.o.d.setText(LocaleController.getString(R.string.NoResult));
            this.o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
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
        int i9 = this.k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i9).getInputPeer(-this.j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i9).getInputUser(user);
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_hideChatJoinRequest, new g(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.i.getCachedImporters(this.j)) != null) {
            this.z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new f(0, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z12 = !arrayList.isEmpty() || z10;
            gw0 gw0Var = this.n;
            if (gw0Var != null) {
                gw0Var.setVisibility(z12 ? 4 : 0);
            }
            gw0 gw0Var2 = this.o;
            if (gw0Var2 != null) {
                gw0Var2.setVisibility(4);
            }
        } else {
            z12 = !this.c.isEmpty() || z10;
            gw0 gw0Var3 = this.n;
            if (gw0Var3 != null) {
                gw0Var3.setVisibility(4);
            }
            gw0 gw0Var4 = this.o;
            if (gw0Var4 != null) {
                gw0Var4.setVisibility(z12 ? 4 : 0);
            }
        }
        k(this.p, z12, true);
        if (arrayList.isEmpty()) {
            gw0 gw0Var5 = this.n;
            if (gw0Var5 != null) {
                gw0Var5.setVisibility(0);
            }
            gw0 gw0Var6 = this.o;
            if (gw0Var6 != null) {
                gw0Var6.setVisibility(4);
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
    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z10, boolean z11) {
        boolean z12;
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList;
        int i9;
        boolean z13;
        ArrayList arrayList2 = this.c;
        boolean z14 = !arrayList2.isEmpty() && this.x;
        for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i10);
            this.d.put(user.id, user);
        }
        p pVar = this.f;
        if (z10) {
            pVar.E(tL_messages_chatInviteImporters.importers);
        } else {
            if (tL_messages_chatInviteImporters.importers.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z12 = true;
                    if (z12) {
                        pVar.u(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    x xVar = pVar.c;
                    ArrayList arrayList3 = xVar.c;
                    i9 = 0;
                    while (i9 < arrayList.size()) {
                        long j10 = arrayList.get(i9).user_id;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList3.size()) {
                                break;
                            }
                            if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i11)).user_id == j10) {
                                arrayList.remove(i9);
                                i9--;
                                break;
                            }
                            i11++;
                        }
                        i9++;
                    }
                    arrayList3.addAll(arrayList);
                    pVar.s((arrayList3.size() + (!xVar.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z12) {
                        pVar.o(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z12 = false;
            if (z12) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            x xVar2 = pVar.c;
            ArrayList arrayList32 = xVar2.c;
            i9 = 0;
            while (i9 < arrayList.size()) {
            }
            arrayList32.addAll(arrayList);
            pVar.s((arrayList32.size() + (!xVar2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
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
                z13 = false;
                this.g.getActionBar().n().k(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
                f(str, z11, z13);
                this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count;
                if (z14 == (arrayList2.isEmpty() && this.x)) {
                    if (this.x) {
                        pVar.o(pVar.h() - 1);
                        return;
                    } else {
                        pVar.u(pVar.h());
                        return;
                    }
                }
                return;
            }
        }
        z13 = false;
        f(str, z11, z13);
        this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count;
        if (z14 == (arrayList2.isEmpty() && this.x)) {
        }
    }

    public final void h(View view) {
        if (view instanceof g5) {
            if (this.y) {
                AndroidUtilities.hideKeyboard(this.g.getParentActivity().getCurrentFocus());
            }
            AndroidUtilities.runOnUIThread(new e5.u(3, this, (g5) view), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z10) {
        int i9;
        wk0 wk0Var = this.p;
        if (wk0Var == null || (i9 = !this.f.c.B ? 1 : 0) < 0 || i9 >= wk0Var.getChildCount()) {
            return;
        }
        this.p.getChildAt(i9).setEnabled(z10);
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
            gw0 gw0Var = this.o;
            if (gw0Var != null) {
                gw0Var.setVisibility(4);
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
            gw0 gw0Var2 = this.n;
            if (gw0Var2 != null) {
                gw0Var2.setVisibility(4);
            }
            gw0 gw0Var3 = this.o;
            if (gw0Var3 != null) {
                gw0Var3.setVisibility(4);
            }
        }
    }
}
