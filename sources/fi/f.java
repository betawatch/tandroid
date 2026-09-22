package fi;

import ai.y1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.m2;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.i51;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class f extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public long a;
    public TLRPC.Chat b;
    public TLRPC.User c;
    public FrameLayout d;
    public e61 e;
    public e f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup n;

    public static void U(f fVar, i51 i51Var) {
        f fVar2;
        if (i51Var.d == 1) {
            fVar2 = fVar;
            c5.R(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, ConnectionsManager.DEFAULT_DATACENTER_ID, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.a));
            fVar2.showDialog(new hi.b(fVar2.getParentActivity(), chat, fVar2.a, new m2(12, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (ChatObject.isChannel(this.b) || this.c != null) {
            getMessagesController().createCommunity(str, this.a, z10, new b(this, 1));
            return;
        }
        b2 b2Var = new b2(getParentActivity(), 3, null);
        b2Var.q(250L);
        getMessagesController().convertToMegaGroup(getParentActivity(), -this.a, this, new ca.b(this, b2Var, str, z10, 1));
    }

    public final void W(long j3, boolean z10) {
        if (ChatObject.isChannel(this.b) || this.c != null) {
            int i10 = this.currentAccount;
            long j10 = -this.a;
            MessagesController.getInstance(i10).linkCommunity(-j10, j3, z10, new o0(this, j10, 0));
        } else {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.a, this, new d(this, b2Var, j3, z10, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 3));
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(i6.d6));
        ah.c cVar2 = new ah.c(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(cVar2, eh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(i6.w0(null, i6.a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        this.f.setSubtitle(LocaleController.getString(this.c != null ? R.string.CommunityDescriptionBot : ChatObject.isChannelAndNotMegaGroup(this.b) ? R.string.CommunityDescriptionChannel : R.string.CommunityDescriptionGroup));
        this.f.setTag(-33024);
        TLRPC.User user = this.c;
        if (user != null) {
            this.f.a.e(user, new f9(0, this.c));
        } else {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                this.f.a.e(chat, new f9(this.b));
            }
        }
        e61 e61Var = new e61(this, new b(this, 0), new c(this), new c(this));
        this.e = e61Var;
        e61Var.setClipToPadding(false);
        e61 e61Var2 = this.e;
        e61Var2.Y2.r = false;
        e61Var2.p1();
        this.d.addView(this.e, x5.c(-1.0f, -1));
        this.d.addView(this.actionBar, x5.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.id;
            View y12 = this.e.y1((int) (j3 ^ (j3 >>> 32)));
            if (!(y12 instanceof org.telegram.ui.Cells.i6)) {
                this.e.Y2.N(false);
                return;
            }
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) y12;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            i6Var.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        this.a = this.arguments.getLong("dialog_id", 0L);
        this.b = getMessagesController().getChat(Long.valueOf(-this.a));
        this.c = getMessagesController().getUser(Long.valueOf(this.a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new y1(this, 16), this.classGuid);
        this.n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.n = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.e.setPadding(0, i11, 0, i13);
    }
}
