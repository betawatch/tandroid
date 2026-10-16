package gi;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.g9;
import bi.v2;
import di.ab;
import di.f9;
import di.g2;
import di.h1;
import di.ya;
import fi.q3;
import fi.r4;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.b20;
import org.telegram.ui.fo;
import org.telegram.ui.kg1;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class k0 extends e3 implements NotificationCenter.NotificationCenterDelegate, ne.d, o2 {
    public static final /* synthetic */ int V = 0;
    public final o20 E;
    public final b20 F;
    public final i71 G;
    public final ab H;
    public final ab I;
    public final zf.z J;
    public final zf.z K;
    public final View L;
    public final t0 M;
    public final boolean N;
    public final Utilities.Callback O;
    public final Paint P;
    public ArrayList Q;
    public String R;
    public String S;
    public i0.b T;
    public i0.b U;
    public final ne.b b;
    public final ne.b c;
    public final h1 d;
    public final long e;
    public TLRPC.Chat f;
    public boolean h;
    public di.d n;
    public di.d r;
    public final m2 s;
    public final f0 v;
    public final j0 w;
    public final e0 x;
    public final o20 y;

    public k0(m2 m2Var, long j10) {
        this(m2Var, j10, null, null);
    }

    public static void B(k0 k0Var, m61 m61Var, View view) {
        long j10;
        TLRPC.Chat chat;
        m2 m2Var = k0Var.s;
        if (k0Var.U(m61Var)) {
            return;
        }
        int i10 = m61Var.d;
        boolean z10 = false;
        if (i10 == 101) {
            k0Var.h = !k0Var.h;
            MessagesController.getInstance(k0Var.currentAccount).toggleCommunityCollapsedInDialogs(k0Var.e, k0Var.h);
            if (view instanceof v8) {
                ((v8) view).getCheckBox().c(k0Var.h, true);
                return;
            } else {
                k0Var.v.d.W2.N(false);
                return;
            }
        }
        if (i10 == 100) {
            k0Var.d.D(1);
            k0Var.M.e();
            return;
        }
        Object obj = m61Var.G;
        if (obj instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) obj;
            z10 = ChatObject.isChannelAndNotMegaGroup(chat);
            j10 = -chat.id;
        } else {
            if (!(obj instanceof TLRPC.User)) {
                return;
            }
            j10 = ((TLRPC.User) obj).id;
            chat = null;
        }
        TLRPC.Chat chat2 = chat;
        int b10 = u0.b(k0Var.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            if (b10 == 3) {
                f90 f90Var = new f90(k0Var.getContext(), chat2, null, k0Var.s, k0Var.resourcesProvider);
                f90Var.n = new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                f90Var.show();
                return;
            } else {
                if (b10 == 4) {
                    org.telegram.messenger.g0.q(z10 ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.e_hand_2, 36);
                    return;
                }
                return;
            }
        }
        if (m2Var instanceof fo) {
            fo foVar = (fo) m2Var;
            TLRPC.Chat chat3 = foVar.e;
            TLRPC.User i11 = foVar.i();
            if ((chat3 != null && chat3.id == (-j10)) || (i11 != null && i11.id == j10)) {
                k0Var.dismiss();
                return;
            }
        }
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (!ChatObject.isForum(chat2)) {
            m2Var.presentFragment(new fo(bundle));
        } else if (ChatObject.areTabsEnabled(chat2)) {
            fo foVar2 = new fo(bundle);
            og.d.a(foVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.id)));
            m2Var.presentFragment(foVar2);
        } else {
            m2Var.presentFragment(new kg1(bundle));
        }
        k0Var.dismiss();
    }

    public static void C(k0 k0Var, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(m61.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(m61.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        m61 m61Var = new m61(39);
        m61Var.d = 101;
        m61Var.l = string;
        m61Var.z = 0;
        m61Var.K(k0Var.h);
        arrayList.add(m61Var);
        arrayList.add(m61.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        t0 t0Var = k0Var.M;
        boolean z11 = true;
        if (t0Var.n && t0Var.l == 1 && (arrayList2 = t0Var.j) != null && arrayList2.size() == 1) {
            arrayList.add(m61.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            t0Var.c(arrayList);
            arrayList.add(m61.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = t0Var.l;
            if (i11 > 0) {
                int i12 = t0Var.p;
                int i13 = R.drawable.filled_requests_24;
                String string2 = i11 == i12 ? LocaleController.getString(R.string.CommunityPendingRequests) : LocaleController.formatPluralString("CommunityPendingRequestsRow", i11, new Object[0]);
                String num = i12 > 0 ? Integer.toString(i12) : null;
                int i14 = hi.i.a;
                m61 J = m61.J(hi.i.class);
                J.d = 100;
                J.k = i13;
                J.l = string2;
                J.n = num;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.q = true;
                arrayList.add(J);
                arrayList.add(m61.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.e);
        if (buildCommunityPeers == null) {
            return;
        }
        if (buildCommunityPeers.chatsYouAreIn.isEmpty()) {
            z10 = false;
        } else {
            arrayList.add(m61.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
            int size = arrayList3.size();
            int i15 = 0;
            while (i15 < size) {
                MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                i15++;
                arrayList.add(q0.a(communityPeerDialog, k0Var));
            }
            z10 = true;
        }
        if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
            if (z10) {
                arrayList.add(m61.D(22, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(m61.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
            int size2 = arrayList4.size();
            int i16 = 0;
            while (i16 < size2) {
                MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                i16++;
                arrayList.add(q0.a(communityPeerDialog2, k0Var));
            }
            z10 = true;
        }
        if (buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
            z11 = z10;
        } else {
            if (z10) {
                arrayList.add(m61.D(24, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(m61.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
            int size3 = arrayList5.size();
            int i17 = 0;
            while (i17 < size3) {
                MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                i17++;
                arrayList.add(q0.a(communityPeerDialog3, k0Var));
            }
        }
        if (buildCommunityPeers.chatsOther.isEmpty()) {
            return;
        }
        if (z11) {
            arrayList.add(m61.D(26, AndroidUtilities.dp(12.0f)));
        }
        arrayList.add(m61.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
        ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
        int size4 = arrayList6.size();
        while (i10 < size4) {
            MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
            i10++;
            arrayList.add(q0.a(communityPeerDialog4, k0Var));
        }
    }

    public static void n(k0 k0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            u0.f(new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
            k0Var.d.D(0);
        } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
            c1.p((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else {
            u0.f(new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
            k0Var.d.D(0);
        }
    }

    public static void o(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.n.setLoading(false);
        if (tL_error != null) {
            c1.p((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        if (arrayList != null) {
            k0Var.Q = arrayList;
            if (!arrayList.isEmpty()) {
                k0Var.x.d.W2.N(false);
                k0Var.d.D(2);
            } else {
                org.telegram.messenger.g0.q(R.string.CommunityNoChatsToAdd, new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
            }
        }
    }

    public static void q(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            c1.p((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static /* synthetic */ void r(k0 k0Var, a2 a2Var, long j10, boolean z10, long j11) {
        a2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        k0Var.W(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void s(k0 k0Var, boolean z10, boolean z11, long j10) {
        a2 O = g5.O(k0Var.getContext(), k0Var.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(z10 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : z11 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), new bi.g(k0Var, j10, 8));
        O.show();
        TextView textView = (TextView) O.d(-1);
        if (textView != null) {
            textView.setTextColor(g6.x0(null, g6.q7, false));
        }
    }

    public static void z(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f)) {
            k0Var.dismiss();
            return;
        }
        di.d dVar = k0Var.n;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new t(k0Var, 2));
    }

    public final boolean U(m61 m61Var) {
        Object obj = m61Var.G;
        if (!(obj instanceof hi.f)) {
            return false;
        }
        hi.f fVar = (hi.f) obj;
        long j10 = fVar.a;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        m2 m2Var = this.s;
        if (user != null) {
            m2Var.presentFragment(fo.W9(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            m2Var.presentFragment(fo.W9(-chat.id));
            return true;
        }
        new ii.c(getContext(), chat, new q3(4, this, fVar)).show();
        return true;
    }

    public final void V(ArrayList arrayList, boolean z10) {
        String str;
        int i10 = 0;
        if (!z10) {
            arrayList.add(m61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(m61.D(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.Q != null) {
            String lowerCase = (!z10 || (str = this.S) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.Q;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z10 || TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(m61.v(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(m61.v(chat));
                    }
                }
            }
        }
    }

    public final void W(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (ChatObject.isChannel(chat)) {
            MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new ya(1, this, isChannelAndNotMegaGroup));
            return;
        }
        a2 a2Var = new a2(getContext(), 3, null);
        a2Var.q(250L);
        MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, a2Var, j10, z10, 1));
    }

    public final void X(m61 m61Var) {
        Object obj = m61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.N) {
                new ii.b(getContext(), this.f, -chat.id, new v2(15, this, chat)).show();
            } else {
                this.O.run(chat);
                dismiss();
            }
        }
    }

    @Override // org.telegram.ui.Cells.o2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        if (this.b.f || this.c.f) {
            return false;
        }
        View currentView = this.d.getCurrentView();
        if (currentView instanceof h0) {
            return ((h0) currentView).e;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.e;
        f0 f0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).id == j10) {
                f0Var.d.W2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) == 0) {
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
            this.f = chat;
            f0Var.a.setTitle(DialogObject.getName(chat));
            f0Var.h.e(this.f, f0Var.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    @Override // org.telegram.ui.Cells.o2
    public final void e(s2 s2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (s2Var.getMessage() == null || (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-s2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, s2Var.getMessage().messageOwner, true))) == null) {
            return;
        }
        og.d.m(this.s, -s2Var.getDialogId(), findTopic, 0);
    }

    @Override // org.telegram.ui.Cells.o2
    public final void f(s2 s2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(s2Var.getDialogId())) {
            m2 m2Var = this.s;
            m2Var.getOrCreateStoryViewer().getClass();
            m2Var.getOrCreateStoryViewer().D(m2Var.getContext(), s2Var.getDialogId(), g9.a((mm0) s2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.d.getCurrentPosition() == 2) {
            ne.b bVar = this.c;
            if (bVar.f) {
                this.x.d.V2.h1(1, this.U.b);
                bVar.a(false, true);
                setAllowNestedScroll(true);
                o20 o20Var = this.E;
                AndroidUtilities.hideKeyboard(o20Var.r);
                o20Var.r.clearFocus();
                return;
            }
        }
        this.d.D(0);
    }

    @Override // ne.d
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 1) {
            float b10 = zf.f0.b(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            f0 f0Var = this.v;
            f0Var.a.setAlpha(b10);
            f0Var.a.setScaleX(lerp);
            f0Var.a.setScaleY(lerp);
            f0Var.a.setVisibility(b10 > 0.0f ? 0 : 8);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            o20 o20Var = this.y;
            o20Var.setAlpha(f7);
            o20Var.setScaleX(lerp2);
            o20Var.setScaleY(lerp2);
            o20Var.setVisibility(f7 > 0.0f ? 0 : 8);
            f0Var.d.setAlpha(b10);
            f0Var.d.setVisibility(b10 > 0.0f ? 0 : 8);
            this.n.setAlpha(b10);
            this.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setVisibility(b10 > 0.0f ? 0 : 8);
            b20 b20Var = this.F;
            b20Var.setAlpha(f7);
            b20Var.setVisibility(f7 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float b11 = zf.f0.b(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            e0 e0Var = this.x;
            e0Var.a.setAlpha(b11);
            e0Var.a.setScaleX(lerp3);
            e0Var.a.setScaleY(lerp3);
            e0Var.a.setVisibility(b11 > 0.0f ? 0 : 8);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            o20 o20Var2 = this.E;
            o20Var2.setAlpha(f7);
            o20Var2.setScaleX(lerp4);
            o20Var2.setScaleY(lerp4);
            o20Var2.setVisibility(f7 > 0.0f ? 0 : 8);
            e0Var.d.setAlpha(b11);
            e0Var.d.setVisibility(b11 > 0.0f ? 0 : 8);
            if (!this.N) {
                this.r.setAlpha(b11);
                this.r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.r.setVisibility(b11 > 0.0f ? 0 : 8);
            }
            i71 i71Var = this.G;
            i71Var.setAlpha(f7);
            i71Var.setVisibility(f7 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m2 m2Var, long j10, ArrayList arrayList, r4 r4Var) {
        super(m2Var.getContext(), m2Var.getResourceProvider(), true, true);
        int i10 = 1;
        es esVar = es.h;
        this.b = new ne.b(1, this, esVar, 350L, false);
        int i11 = 2;
        this.c = new ne.b(2, this, esVar, 350L, false);
        this.J = new zf.z(2);
        this.K = new zf.z(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.s = m2Var;
        int i12 = 0;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = r4Var;
        Context context = m2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i13 = g6.a7;
        paint.setColor(g6.w0(i13, this.resourcesProvider));
        fixNavigationBar(g6.w0(i13, this.resourcesProvider));
        this.containerView = new f9(this, context);
        h1 h1Var = new h1(this, context, i11);
        this.d = h1Var;
        int i14 = this.backgroundPaddingLeft;
        h1Var.setPadding(i14, 0, i14, 0);
        this.containerView.addView(this.d, z5.e(-1, -1, 119));
        int i15 = 3;
        this.H = new ab(this, context, i15);
        this.I = new ab(this, context, i15);
        o20 o20Var = new o20(context, this.resourcesProvider);
        this.y = o20Var;
        o20Var.setCloseButtonVisible(true);
        o20Var.x = true;
        o20Var.d();
        String string = LocaleController.getString(R.string.Search);
        g2 g2Var = o20Var.r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new w(this));
        o20Var.setVisibility(8);
        o20 o20Var2 = new o20(context, this.resourcesProvider);
        this.E = o20Var2;
        o20Var2.setCloseButtonVisible(true);
        o20Var2.x = true;
        o20Var2.d();
        String string2 = LocaleController.getString(R.string.Search);
        g2 g2Var2 = o20Var2.r;
        g2Var2.setHint(string2);
        g2Var2.addTextChangedListener(new x(this));
        o20Var2.setVisibility(8);
        i71 i71Var = new i71(context, this.currentAccount, 0, false, new t(this, i12), new u(this, i12), null, this.resourcesProvider);
        this.G = i71Var;
        i71Var.j(new y(this));
        i71Var.setClipToPadding(false);
        i71Var.setVisibility(8);
        i71Var.p1();
        i71Var.W2.r = false;
        i71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        b20 b20Var = new b20(m2Var);
        this.F = b20Var;
        b20Var.setVisibility(8);
        b20Var.setBackground(null);
        b20Var.setChatPreviewDelegate(new z());
        b20Var.setUiCallback(new a0(this));
        b20Var.b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        c6 c6Var = this.resourcesProvider;
        t0 t0Var = new t0(context2, c6Var, new zc((FrameLayout) this.containerView, c6Var), this.currentAccount, j10);
        this.M = t0Var;
        t0Var.h = new b0(this, m2Var);
        this.e = j10;
        this.f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        hg.p0 p0Var = new hg.p0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        p0Var.f = this.f;
        p0Var.h = false;
        ArrayList arrayList2 = o20Var.F;
        arrayList2.add(p0Var);
        o20Var.I = arrayList2.size() - 1;
        o20Var.f();
        setBackgroundColor(g6.w0(i13, this.resourcesProvider));
        this.w = new j0(this, context);
        this.v = new f0(this, context);
        this.x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        o20Var.setCloseButtonOnClickListener(new v(this, i12));
        o20Var2.setCloseButtonOnClickListener(new v(this, i10));
        t0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        sc.a((FrameLayout) this.containerView, new d0());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup, uVar);
    }

    @Override // org.telegram.ui.Cells.o2
    public final void a(s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void g(s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void c() {
    }

    @Override // ne.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
