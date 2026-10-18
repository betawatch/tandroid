package hi;

import ai.o2;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h9;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public long a;
    public TLRPC.Chat b;
    public TLRPC.User c;
    public FrameLayout d;
    public a71 e;
    public e f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup n;

    public static void U(f fVar, f61 f61Var) {
        f fVar2;
        if (f61Var.d == 1) {
            fVar2 = fVar;
            f5.Q(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, ConnectionsManager.DEFAULT_DATACENTER_ID, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = f61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.a));
            fVar2.showDialog(new ji.a(fVar2.getParentActivity(), chat, fVar2.a, new o2(19, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (ChatObject.isChannel(this.b) || this.c != null) {
            getMessagesController().createCommunity(str, this.a, z10, new b(this, 1));
            return;
        }
        b2 b2Var = new b2(getParentActivity(), 3, null);
        b2Var.q(250L);
        getMessagesController().convertToMegaGroup(getParentActivity(), -this.a, this, new da.b(this, b2Var, str, z10, 1));
    }

    public final void W(long j10, boolean z10) {
        if (ChatObject.isChannel(this.b) || this.c != null) {
            int i10 = this.currentAccount;
            long j11 = -this.a;
            MessagesController.getInstance(i10).linkCommunity(-j11, j10, z10, new n0(this, j11, 0));
        } else {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.a, this, new d(this, b2Var, j10, z10, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 5));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(h6.d6));
        bh.b bVar = new bh.b(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(bVar, fh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(h6.x0(null, h6.a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        this.f.setSubtitle(LocaleController.getString(this.c != null ? R.string.CommunityDescriptionBot : ChatObject.isChannelAndNotMegaGroup(this.b) ? R.string.CommunityDescriptionChannel : R.string.CommunityDescriptionGroup));
        this.f.setTag(-33024);
        TLRPC.User user = this.c;
        if (user != null) {
            this.f.a.e(user, new h9(0, this.c));
        } else {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                this.f.a.e(chat, new h9(this.b));
            }
        }
        a71 a71Var = new a71(this, new b(this, 0), new c(this), new c(this));
        this.e = a71Var;
        a71Var.setClipToPadding(false);
        a71 a71Var2 = this.e;
        a71Var2.W2.r = false;
        a71Var2.p1();
        this.d.addView(this.e, z5.d(-1.0f, -1));
        this.d.addView(this.actionBar, z5.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.id;
            View z12 = this.e.z1((int) (j10 ^ (j10 >>> 32)));
            if (!(z12 instanceof org.telegram.ui.Cells.h6)) {
                this.e.W2.N(false);
                return;
            }
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) z12;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            h6Var.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
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
        getMessagesController().fetchJoinedCommunities(new ai.r0(this, 27), this.classGuid);
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
