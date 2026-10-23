package hi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import i2.o1;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class f extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public gh.c a;
    public long b;
    public TLRPC.Chat c;
    public TLRPC.User d;
    public FrameLayout e;
    public j71 f;
    public e h;
    public ArrayList n;
    public NotificationCenter.ObserversGroup r;

    public static void U(f fVar, m61 m61Var) {
        f fVar2;
        if (m61Var.d == 1) {
            fVar2 = fVar;
            f5.R(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, ConnectionsManager.DEFAULT_DATACENTER_ID, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = m61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.b));
            fVar2.showDialog(new ji.a(fVar2.getParentActivity(), chat, fVar2.b, new ai.o2(19, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (ChatObject.isChannel(this.c) || this.d != null) {
            getMessagesController().createCommunity(str, this.b, z10, new b(this, 1));
            return;
        }
        c2 c2Var = new c2(getParentActivity(), 3, null);
        c2Var.r(250L);
        getMessagesController().convertToMegaGroup(getParentActivity(), -this.b, this, new da.b(this, c2Var, str, z10, 1));
    }

    public final void W(long j10, boolean z10) {
        if (ChatObject.isChannel(this.c) || this.d != null) {
            int i10 = this.currentAccount;
            long j11 = -this.b;
            MessagesController.getInstance(i10).linkCommunity(-j11, j10, z10, new n0(this, j11, 0));
        } else {
            c2 c2Var = new c2(getParentActivity(), 3, null);
            c2Var.r(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.b, this, new d(this, c2Var, j10, z10, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 5));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(k6.d6));
        this.a = cVar;
        bh.b bVar = new bh.b(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.L(bVar, fh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        r6.i(k6.a7, frameLayout, null);
        e eVar = new e(context, this.resourceProvider);
        this.h = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        this.h.setSubtitle(LocaleController.getString(this.d != null ? R.string.CommunityDescriptionBot : ChatObject.isChannelAndNotMegaGroup(this.c) ? R.string.CommunityDescriptionChannel : R.string.CommunityDescriptionGroup));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.a.e(user, new h9(0, this.d));
        } else {
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.h.a.e(chat, new h9(this.c));
            }
        }
        j71 j71Var = new j71(this, new b(this, 0), new c(this), new c(this));
        this.f = j71Var;
        j71Var.setClipToPadding(false);
        j71 j71Var2 = this.f;
        b71 b71Var = j71Var2.Z2;
        b71Var.r = false;
        b71Var.s = true;
        j71Var2.t1();
        this.e.addView(this.f, z5.c(-1.0f, -1));
        this.e.addView(this.actionBar, z5.e(-1, -2, 48));
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
            if (!(E1 instanceof i6)) {
                this.f.Z2.N(false);
                return;
            }
            i6 i6Var = (i6) E1;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            i6Var.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("dialog_id", 0L);
        this.c = getMessagesController().getChat(Long.valueOf(-this.b));
        this.d = getMessagesController().getUser(Long.valueOf(this.b));
        this.n = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new ai.r0(this, 27), this.classGuid);
        this.r = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.r;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.r = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.f.setPadding(0, i11, 0, i13);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            gh.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.d6));
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
