package li;

import ai.u1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import hi.g7;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.t3;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class e extends e2 implements is {
    public ui.c a;
    public long b;
    public TLRPC.Chat c;
    public TLRPC.User d;
    public FrameLayout e;
    public u41 f;
    public d h;
    public ArrayList n;
    public xi.e r;

    public static void Z(e eVar, b41 b41Var) {
        e eVar2;
        if (b41Var.d == 1) {
            eVar2 = eVar;
            t4.O(eVar.getParentActivity(), eVar2, hd.M0(2131751906, null), null, hd.M0(2131751907, null), null, ConnectionsManager.DEFAULT_DATACENTER_ID, hd.M0(2131751753, null), eVar.resourceProvider, new b(eVar));
        } else {
            eVar2 = eVar;
        }
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            eVar2.getMessagesController().M0(Long.valueOf(-eVar2.b));
            eVar2.showDialog(new ni.a(eVar2.getParentActivity(), chat, eVar2.b, new u1(28, eVar2, chat)));
        }
    }

    public final void a0(String str, boolean z10) {
        if (!t3.T(this.c) && this.d == null) {
            t1 t1Var = new t1(3, getParentActivity(), null);
            t1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.b, this, new a3.g(this, t1Var, str, z10, 2), null);
            return;
        }
        np messagesController = getMessagesController();
        long j3 = this.b;
        a aVar = new a(this, 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.j1(j3);
        tL_communities_create.hidden = z10;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new d3.b(1), new org.telegram.messenger.d(aVar, 5));
    }

    public final void b0(long j3, boolean z10) {
        if (t3.T(this.c) || this.d != null) {
            int i7 = this.currentAccount;
            long j10 = -this.b;
            np.s1(i7).Q2(-j10, j3, false, z10, new bi.n(this, j10, 1));
        } else {
            t1 t1Var = new t1(3, getParentActivity(), null);
            t1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.b, this, new c(this, t1Var, j3, z10, 0), null);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new x4(this, 15));
        ui.c cVar = new ui.c();
        cVar.a(getThemedColor(j6.d6));
        this.a = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.actionBar.setBackground(null);
        this.actionBar.P(cVar2, c8.g0.o(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        q6.h(j6.a7, frameLayout, null);
        d dVar = new d(context, this.resourceProvider);
        this.h = dVar;
        dVar.setTitle(hd.M0(2131751847, null));
        this.h.setSubtitle(hd.M0(this.d != null ? 2131751933 : t3.V(this.c) ? 2131751932 : 2131751931, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.a.f(user, new t8(0, this.d));
        } else {
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.h.a.f(chat, new t8(this.c));
            }
        }
        u41 u41Var = new u41(this, new a(this, 0), new b(this), new i0.b(this, 29));
        this.f = u41Var;
        u41Var.setClipToPadding(false);
        u41 u41Var2 = this.f;
        p41 p41Var = u41Var2.g3;
        p41Var.r = false;
        p41Var.s = true;
        u41Var2.r1();
        this.e.addView(this.f, ja.c(-1.0f, -1));
        this.e.addView(this.actionBar, ja.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.id;
            View B1 = this.f.B1((int) (j3 ^ (j3 >>> 32)));
            if (!(B1 instanceof f6)) {
                this.f.g3.O(false);
                return;
            }
            f6 f6Var = (f6) B1;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            f6Var.setSubLabel(hd.G(arrayList != null ? arrayList.size() : 0, "Chats", new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("dialog_id", 0L);
        this.c = getMessagesController().M0(Long.valueOf(-this.b));
        this.d = getMessagesController().a2(Long.valueOf(this.b));
        this.n = getMessagesController().R7;
        np messagesController = getMessagesController();
        g7 g7Var = new g7(this, 13);
        int i7 = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new d3.b(1), new x3(4, messagesController, g7Var)), i7);
        ns notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(ns.T);
        this.r = eVar;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        xi.e eVar = this.r;
        if (eVar != null) {
            eVar.b();
            this.r = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        this.f.setPadding(0, i10, 0, i12);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ui.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(j6.d6));
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
