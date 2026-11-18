package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.r1;
import c8.ma;
import hi.t6;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.messenger.z3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class g extends h2 implements fs {
    public ui.c a;
    public long b;
    public TLRPC.Chat c;
    public TLRPC.User d;
    public FrameLayout e;
    public e51 f;
    public f h;
    public ArrayList n;
    public xi.e r;

    public static void Z(g gVar, l41 l41Var) {
        g gVar2;
        if (l41Var.d == 1) {
            gVar2 = gVar;
            b5.O(gVar.getParentActivity(), gVar2, gd.M0(2131751895, null), null, gd.M0(2131751896, null), null, ConnectionsManager.DEFAULT_DATACENTER_ID, gd.M0(2131751742, null), gVar.resourceProvider, new b(gVar));
        } else {
            gVar2 = gVar;
        }
        Object obj = l41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            gVar2.getMessagesController().O0(Long.valueOf(-gVar2.b));
            gVar2.showDialog(new ni.a(gVar2.getParentActivity(), chat, gVar2.b, new d(0, gVar2, chat)));
        }
    }

    public final void a0(String str, boolean z10) {
        if (!v3.T(this.c) && this.d == null) {
            u1 u1Var = new u1(3, getParentActivity(), null);
            u1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.b, this, new a3.g(this, u1Var, str, z10, 3), null);
            return;
        }
        mp messagesController = getMessagesController();
        long j3 = this.b;
        a aVar = new a(this, 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.l1(j3);
        tL_communities_create.hidden = z10;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new d3.b(1), new org.telegram.messenger.d(aVar, 5));
    }

    public final void b0(long j3, boolean z10) {
        if (v3.T(this.c) || this.d != null) {
            int i7 = this.currentAccount;
            long j10 = -this.b;
            mp.u1(i7).W2(-j10, j3, false, z10, new bi.n(this, j10, 1));
        } else {
            u1 u1Var = new u1(3, getParentActivity(), null);
            u1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.b, this, new e(this, u1Var, j3, z10, 0), null);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new r1(this, 17));
        ui.c cVar = new ui.c();
        cVar.a(getThemedColor(n6.d6));
        this.a = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.actionBar.setBackground(null);
        this.actionBar.Q(cVar2, c8.i0.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        u6.h(n6.a7, frameLayout, null);
        f fVar = new f(context, this.resourceProvider);
        this.h = fVar;
        fVar.setTitle(gd.M0(2131751836, null));
        this.h.setSubtitle(gd.M0(this.d != null ? 2131751922 : v3.V(this.c) ? 2131751921 : 2131751920, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.a.f(user, new b9(0, this.d));
        } else {
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.h.a.f(chat, new b9(this.c));
            }
        }
        e51 e51Var = new e51(this, new a(this, 0), new b(this), new c(this, 0));
        this.f = e51Var;
        e51Var.setClipToPadding(false);
        e51 e51Var2 = this.f;
        z41 z41Var = e51Var2.g3;
        z41Var.r = false;
        z41Var.s = true;
        e51Var2.r1();
        this.e.addView(this.f, ma.c(-1.0f, -1));
        this.e.addView(this.actionBar, ma.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.id;
            View B1 = this.f.B1((int) (j3 ^ (j3 >>> 32)));
            if (!(B1 instanceof h6)) {
                this.f.g3.O(false);
                return;
            }
            h6 h6Var = (h6) B1;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            h6Var.setSubLabel(gd.G(arrayList != null ? arrayList.size() : 0, "Chats", new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("dialog_id", 0L);
        this.c = getMessagesController().O0(Long.valueOf(-this.b));
        this.d = getMessagesController().c2(Long.valueOf(this.b));
        this.n = getMessagesController().W7;
        mp messagesController = getMessagesController();
        t6 t6Var = new t6(this, 14);
        int i7 = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new d3.b(1), new z3(4, messagesController, t6Var)), i7);
        ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(ks.T);
        this.r = eVar;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        xi.e eVar = this.r;
        if (eVar != null) {
            eVar.b();
            this.r = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        this.f.setPadding(0, i10, 0, i12);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ui.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(n6.d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
