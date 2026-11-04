package ji;

import ai.g5;
import ai.o1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.cd;
import b8.mf;
import gi.j8;
import ii.y3;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.t3;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends d2 implements cs {
    public si.c a;
    public long b;
    public TLRPC.Chat c;
    public TLRPC.User d;
    public FrameLayout e;
    public l41 f;
    public d h;
    public ArrayList n;
    public za.p r;

    public static void Z(e eVar, r31 r31Var) {
        e eVar2;
        if (r31Var.d == 1) {
            eVar2 = eVar;
            t4.Q(eVar.getParentActivity(), eVar2, bd.M0(2131751906, null), null, bd.M0(2131751907, null), null, ConnectionsManager.DEFAULT_DATACENTER_ID, bd.M0(2131751753, null), eVar.resourceProvider, new b(eVar));
        } else {
            eVar2 = eVar;
        }
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            eVar2.getMessagesController().M0(Long.valueOf(-eVar2.b));
            eVar2.showDialog(new li.a(eVar2.getParentActivity(), chat, eVar2.b, new o1(24, eVar2, chat)));
        }
    }

    public final void a0(String str, boolean z10) {
        if (!t3.T(this.c) && this.d == null) {
            s1 s1Var = new s1(3, getParentActivity(), null);
            s1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.b, this, new ga.b(this, s1Var, str, z10, 1), null);
            return;
        }
        hp messagesController = getMessagesController();
        long j10 = this.b;
        a aVar = new a(this, 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.j1(j10);
        tL_communities_create.hidden = z10;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new c3.b(1), new org.telegram.messenger.d(aVar, 5));
    }

    public final void b0(long j10, boolean z10) {
        if (t3.T(this.c) || this.d != null) {
            int i3 = this.currentAccount;
            long j11 = -this.b;
            hp.s1(i3).Q2(-j11, j10, false, z10, new ai.r(this, j11, 1));
        } else {
            s1 s1Var = new s1(3, getParentActivity(), null);
            s1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.b, this, new c(this, s1Var, j10, z10, 0), null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new w1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new g5(this, 6));
        si.c cVar = new si.c();
        cVar.a(getThemedColor(k6.d6));
        this.a = cVar;
        eh.c cVar2 = new eh.c(cVar, cVar, cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(cVar2, cd.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        r6.i(k6.a7, frameLayout, null);
        d dVar = new d(context, this.resourceProvider);
        this.h = dVar;
        dVar.setTitle(bd.M0(2131751847, null));
        this.h.setSubtitle(bd.M0(this.d != null ? 2131751933 : t3.V(this.c) ? 2131751932 : 2131751931, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.a.e(user, new u8(0, this.d));
        } else {
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.h.a.e(chat, new u8(this.c));
            }
        }
        l41 l41Var = new l41(this, new a(this, 0), new b(this), new y3(this, 4));
        this.f = l41Var;
        l41Var.setClipToPadding(false);
        l41 l41Var2 = this.f;
        f41 f41Var = l41Var2.g3;
        f41Var.r = false;
        f41Var.s = true;
        l41Var2.r1();
        this.e.addView(this.f, mf.c(-1.0f, -1));
        this.e.addView(this.actionBar, mf.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.id;
            View B1 = this.f.B1((int) (j10 ^ (j10 >>> 32)));
            if (!(B1 instanceof f6)) {
                this.f.g3.O(false);
                return;
            }
            f6 f6Var = (f6) B1;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            f6Var.setSubLabel(bd.G(arrayList != null ? arrayList.size() : 0, "Chats", new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("dialog_id", 0L);
        this.c = getMessagesController().M0(Long.valueOf(-this.b));
        this.d = getMessagesController().a2(Long.valueOf(this.b));
        this.n = getMessagesController().Q7;
        hp messagesController = getMessagesController();
        j8 j8Var = new j8(this, 3);
        int i3 = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new c3.b(1), new x3(3, messagesController, j8Var)), i3);
        hs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        za.p pVar = new za.p(notificationCenter, this);
        pVar.b(hs.T);
        this.r = pVar;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        za.p pVar = this.r;
        if (pVar != null) {
            pVar.a();
            this.r = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        super.onInsets(i3, i10, i11, i12);
        this.f.setPadding(0, i10, 0, i12);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            si.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.d6));
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
