package ii;

import ai.n1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public hh.c a;
    public long b;
    public TLRPC.Chat c;
    public TLRPC.User d;
    public FrameLayout e;
    public s71 f;
    public e h;
    public ArrayList n;
    public NotificationCenter.ObserversGroup r;

    public static void V(f fVar, u61 u61Var) {
        f fVar2;
        if (u61Var.d == 1) {
            fVar2 = fVar;
            g5.Q(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, ConnectionsManager.DEFAULT_DATACENTER_ID, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = u61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.b));
            fVar2.showDialog(new ki.a(fVar2.getParentActivity(), chat, fVar2.b, new n1(21, fVar2, chat)));
        }
    }

    public final void W(String str, boolean z10) {
        if (ChatObject.isChannel(this.c) || this.d != null) {
            getMessagesController().createCommunity(str, this.b, z10, new b(this, 1));
            return;
        }
        e2 e2Var = new e2(getParentActivity(), 3, null);
        e2Var.r(250L);
        getMessagesController().convertToMegaGroup(getParentActivity(), -this.b, this, new ea.b(this, e2Var, str, z10, 1));
    }

    public final void X(long j10, boolean z10) {
        if (ChatObject.isChannel(this.c) || this.d != null) {
            int i10 = this.currentAccount;
            long j11 = -this.b;
            MessagesController.getInstance(i10).linkCommunity(-j11, j10, z10, new m0(this, j11, 0));
        } else {
            e2 e2Var = new e2(getParentActivity(), 3, null);
            e2Var.r(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.b, this, new d(this, e2Var, j10, z10, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new j2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 5));
        hh.c cVar = new hh.c();
        cVar.a(getThemedColor(y6.d6));
        this.a = cVar;
        ch.b bVar = new ch.b(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.I(bVar, gh.c.p(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        f7.i(y6.a7, frameLayout, null);
        e eVar = new e(context, this.resourceProvider);
        this.h = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        this.h.setSubtitle(LocaleController.getString(this.d != null ? R.string.CommunityDescriptionBot : ChatObject.isChannelAndNotMegaGroup(this.c) ? R.string.CommunityDescriptionChannel : R.string.CommunityDescriptionGroup));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.a.f(user, new j9(0, this.d));
        } else {
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.h.a.f(chat, new j9(this.c));
            }
        }
        s71 s71Var = new s71(this, new b(this, 0), new c(this), new c(this));
        this.f = s71Var;
        s71Var.setClipToPadding(false);
        s71 s71Var2 = this.f;
        k71 k71Var = s71Var2.g3;
        k71Var.r = false;
        k71Var.s = true;
        s71Var2.u1();
        this.e.addView(this.f, kb1.g(-1.0f, -1));
        this.e.addView(this.actionBar, kb1.i(-1, -2, 48));
        FrameLayout frameLayout2 = this.e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.id;
            View E1 = this.f.E1((int) (j10 ^ (j10 >>> 32)));
            if (!(E1 instanceof m6)) {
                this.f.g3.O(false);
                return;
            }
            m6 m6Var = (m6) E1;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            m6Var.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("dialog_id", 0L);
        this.c = getMessagesController().getChat(Long.valueOf(-this.b));
        this.d = getMessagesController().getUser(Long.valueOf(this.b));
        this.n = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new ig.o(this, 1), this.classGuid);
        this.r = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.r;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.r = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.f.setPadding(0, i11, 0, i13);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hh.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(y6.d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
