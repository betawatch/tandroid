package nh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fh.f1;
import fh.w4;
import g7.e6;
import java.util.ArrayList;
import kh.i9;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public long a;
    public TLRPC.Chat b;
    public TLRPC.User c;
    public FrameLayout d;
    public i51 e;
    public e f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup n;

    public static void T(f fVar, l41 l41Var) {
        f fVar2;
        if (l41Var.d == 1) {
            fVar2 = fVar;
            y4.R(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, ConnectionsManager.DEFAULT_DATACENTER_ID, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.a));
            fVar2.showDialog(new ph.a(fVar2.getParentActivity(), chat, fVar2.a, new f1(21, fVar2, chat)));
        }
    }

    public final void U(String str, boolean z10) {
        if (ChatObject.isChannel(this.b) || this.c != null) {
            getMessagesController().createCommunity(str, this.a, z10, new b(this, 1));
            return;
        }
        c2 c2Var = new c2(getParentActivity(), 3, null);
        c2Var.q(250L);
        getMessagesController().convertToMegaGroup(getParentActivity(), -this.a, this, new k9.b(this, c2Var, str, z10, 1));
    }

    public final void V(long j10, boolean z10) {
        if (ChatObject.isChannel(this.b) || this.c != null) {
            int i9 = this.currentAccount;
            long j11 = -this.a;
            MessagesController.getInstance(i9).linkCommunity(-j11, j10, z10, new fh.m(this, j11, 1));
        } else {
            c2 c2Var = new c2(getParentActivity(), 3, null);
            c2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.a, this, new d(this, c2Var, j10, z10, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w4(this, 6));
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(f6.d6));
        ig.a aVar = new ig.a(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.L(aVar, mg.c.n(this.resourceProvider), false);
        this.actionBar.L0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(f6.w0(null, f6.a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        this.f.setSubtitle(LocaleController.getString(this.c != null ? R.string.CommunityDescriptionBot : ChatObject.isChannelAndNotMegaGroup(this.b) ? R.string.CommunityDescriptionChannel : R.string.CommunityDescriptionGroup));
        this.f.setTag(-33024);
        TLRPC.User user = this.c;
        if (user != null) {
            this.f.a.e(user, new z8(0, this.c));
        } else {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                this.f.a.e(chat, new z8(this.b));
            }
        }
        i51 i51Var = new i51(this, new b(this, 0), new c(this), new c(this));
        this.e = i51Var;
        i51Var.setClipToPadding(false);
        i51 i51Var2 = this.e;
        i51Var2.U2.r = false;
        i51Var2.p1();
        this.d.addView(this.e, e6.c(-1.0f, -1));
        this.d.addView(this.actionBar, e6.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.id;
            View y12 = this.e.y1((int) (j10 ^ (j10 >>> 32)));
            if (!(y12 instanceof h6)) {
                this.e.U2.N(false);
                return;
            }
            h6 h6Var = (h6) y12;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            h6Var.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.a = this.arguments.getLong("dialog_id", 0L);
        this.b = getMessagesController().getChat(Long.valueOf(-this.a));
        this.c = getMessagesController().getUser(Long.valueOf(this.a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new i9(this, 3), this.classGuid);
        this.n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.n = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        super.onInsets(i9, i10, i11, i12);
        this.e.setPadding(0, i10, 0, i12);
    }
}
