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
import bi.d9;
import di.cb;
import di.eb;
import di.h2;
import di.i1;
import di.i9;
import di.m2;
import fi.j4;
import fi.s4;
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
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
import org.telegram.ui.eg1;
import org.telegram.ui.x10;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class k0 extends f3 implements NotificationCenter.NotificationCenterDelegate, le.d, n2 {
    public static final /* synthetic */ int V = 0;
    public final b20 E;
    public final x10 F;
    public final d61 G;
    public final eb H;
    public final eb I;
    public final yf.z J;
    public final yf.z K;
    public final View L;
    public final t0 M;
    public final boolean N;
    public final Utilities.Callback O;
    public final Paint P;
    public ArrayList Q;
    public String R;
    public String S;
    public i0.c T;
    public i0.c U;
    public final le.b b;
    public final le.b c;
    public final i1 d;
    public final long e;
    public TLRPC.Chat f;
    public boolean h;
    public di.d n;
    public di.d r;
    public final org.telegram.ui.ActionBar.n2 s;
    public final f0 v;
    public final j0 w;
    public final e0 x;
    public final b20 y;

    public k0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        this(n2Var, j3, null, null);
    }

    public static void A(k0 k0Var, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(h51.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(h51.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        h51 h51Var = new h51(39);
        h51Var.d = 101;
        h51Var.l = string;
        h51Var.z = 0;
        h51Var.K(k0Var.h);
        arrayList.add(h51Var);
        arrayList.add(h51.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        t0 t0Var = k0Var.M;
        boolean z11 = true;
        if (t0Var.n && t0Var.l == 1 && (arrayList2 = t0Var.j) != null && arrayList2.size() == 1) {
            arrayList.add(h51.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            t0Var.c(arrayList);
            arrayList.add(h51.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = t0Var.l;
            if (i11 > 0) {
                int i12 = t0Var.p;
                int i13 = R.drawable.filled_requests_24;
                String string2 = i11 == i12 ? LocaleController.getString(R.string.CommunityPendingRequests) : LocaleController.formatPluralString("CommunityPendingRequestsRow", i11, new Object[0]);
                String num = i12 > 0 ? Integer.toString(i12) : null;
                int i14 = hi.i.a;
                h51 J = h51.J(hi.i.class);
                J.d = 100;
                J.k = i13;
                J.l = string2;
                J.n = num;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.q = true;
                arrayList.add(J);
                arrayList.add(h51.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.e);
        if (buildCommunityPeers == null) {
            return;
        }
        if (buildCommunityPeers.chatsYouAreIn.isEmpty()) {
            z10 = false;
        } else {
            arrayList.add(h51.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
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
                arrayList.add(h51.D(22, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(h51.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
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
                arrayList.add(h51.D(24, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(h51.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
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
            arrayList.add(h51.D(26, AndroidUtilities.dp(12.0f)));
        }
        arrayList.add(h51.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
        ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
        int size4 = arrayList6.size();
        while (i10 < size4) {
            MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
            i10++;
            arrayList.add(q0.a(communityPeerDialog4, k0Var));
        }
    }

    public static void m(k0 k0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            u0.f(new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
            k0Var.d.D(0);
        } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
            p6.q((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else {
            u0.f(new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
            k0Var.d.D(0);
        }
    }

    public static void n(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.n.setLoading(false);
        if (tL_error != null) {
            p6.q((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        if (arrayList != null) {
            k0Var.Q = arrayList;
            if (!arrayList.isEmpty()) {
                k0Var.x.d.Y2.N(false);
                k0Var.d.D(2);
            } else {
                w1.o(R.string.CommunityNoChatsToAdd, new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
            }
        }
    }

    public static void o(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            p6.q((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static /* synthetic */ void p(k0 k0Var, b2 b2Var, long j3, boolean z10, long j10) {
        b2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        k0Var.V(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j10)), j3, z10);
    }

    public static void q(k0 k0Var, boolean z10, boolean z11, long j3) {
        b2 P = e5.P(k0Var.getContext(), k0Var.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(z10 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : z11 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), new bi.g(k0Var, j3, 8));
        P.show();
        TextView textView = (TextView) P.d(-1);
        if (textView != null) {
            textView.setTextColor(j6.w0(null, j6.q7, false));
        }
    }

    public static void x(k0 k0Var) {
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

    public static void y(k0 k0Var, h51 h51Var, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.n2 n2Var = k0Var.s;
        if (k0Var.T(h51Var)) {
            return;
        }
        int i10 = h51Var.d;
        boolean z10 = false;
        if (i10 == 101) {
            k0Var.h = !k0Var.h;
            MessagesController.getInstance(k0Var.currentAccount).toggleCommunityCollapsedInDialogs(k0Var.e, k0Var.h);
            if (view instanceof v8) {
                ((v8) view).getCheckBox().c(k0Var.h, true);
                return;
            } else {
                k0Var.v.d.Y2.N(false);
                return;
            }
        }
        if (i10 == 100) {
            k0Var.d.D(1);
            k0Var.M.e();
            return;
        }
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) obj;
            z10 = ChatObject.isChannelAndNotMegaGroup(chat);
            j3 = -chat.id;
        } else {
            if (!(obj instanceof TLRPC.User)) {
                return;
            }
            j3 = ((TLRPC.User) obj).id;
            chat = null;
        }
        TLRPC.Chat chat2 = chat;
        int b10 = u0.b(k0Var.currentAccount, j3);
        if (b10 != 1 && b10 != 2) {
            if (b10 == 3) {
                g80 g80Var = new g80(k0Var.getContext(), chat2, null, k0Var.s, k0Var.resourcesProvider);
                g80Var.n = new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                g80Var.show();
                return;
            } else {
                if (b10 == 4) {
                    w1.o(z10 ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.e_hand_2, 36);
                    return;
                }
                return;
            }
        }
        if (n2Var instanceof co) {
            co coVar = (co) n2Var;
            TLRPC.Chat chat3 = coVar.e;
            TLRPC.User i11 = coVar.i();
            if ((chat3 != null && chat3.id == (-j3)) || (i11 != null && i11.id == j3)) {
                k0Var.dismiss();
                return;
            }
        }
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        if (!ChatObject.isForum(chat2)) {
            n2Var.presentFragment(new co(bundle));
        } else if (ChatObject.areTabsEnabled(chat2)) {
            co coVar2 = new co(bundle);
            og.d.a(coVar2, MessagesStorage.TopicKey.of(j3, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.id)));
            n2Var.presentFragment(coVar2);
        } else {
            n2Var.presentFragment(new eg1(bundle));
        }
        k0Var.dismiss();
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 1) {
            float b10 = yf.f0.b(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            f0 f0Var = this.v;
            f0Var.a.setAlpha(b10);
            f0Var.a.setScaleX(lerp);
            f0Var.a.setScaleY(lerp);
            f0Var.a.setVisibility(b10 > 0.0f ? 0 : 8);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            b20 b20Var = this.y;
            b20Var.setAlpha(f7);
            b20Var.setScaleX(lerp2);
            b20Var.setScaleY(lerp2);
            b20Var.setVisibility(f7 > 0.0f ? 0 : 8);
            f0Var.d.setAlpha(b10);
            f0Var.d.setVisibility(b10 > 0.0f ? 0 : 8);
            this.n.setAlpha(b10);
            this.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setVisibility(b10 > 0.0f ? 0 : 8);
            x10 x10Var = this.F;
            x10Var.setAlpha(f7);
            x10Var.setVisibility(f7 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float b11 = yf.f0.b(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            e0 e0Var = this.x;
            e0Var.a.setAlpha(b11);
            e0Var.a.setScaleX(lerp3);
            e0Var.a.setScaleY(lerp3);
            e0Var.a.setVisibility(b11 > 0.0f ? 0 : 8);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            b20 b20Var2 = this.E;
            b20Var2.setAlpha(f7);
            b20Var2.setScaleX(lerp4);
            b20Var2.setScaleY(lerp4);
            b20Var2.setVisibility(f7 > 0.0f ? 0 : 8);
            e0Var.d.setAlpha(b11);
            e0Var.d.setVisibility(b11 > 0.0f ? 0 : 8);
            if (!this.N) {
                this.r.setAlpha(b11);
                this.r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.r.setVisibility(b11 > 0.0f ? 0 : 8);
            }
            d61 d61Var = this.G;
            d61Var.setAlpha(f7);
            d61Var.setVisibility(f7 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    public final boolean T(h51 h51Var) {
        Object obj = h51Var.G;
        if (!(obj instanceof hi.f)) {
            return false;
        }
        hi.f fVar = (hi.f) obj;
        long j3 = fVar.a;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
        org.telegram.ui.ActionBar.n2 n2Var = this.s;
        if (user != null) {
            n2Var.presentFragment(co.R9(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            n2Var.presentFragment(co.R9(-chat.id));
            return true;
        }
        new ii.c(getContext(), chat, new j4(2, this, fVar)).show();
        return true;
    }

    public final void U(ArrayList arrayList, boolean z10) {
        String str;
        int i10 = 0;
        if (!z10) {
            arrayList.add(h51.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(h51.D(0, AndroidUtilities.dp(56.0f)));
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
                    arrayList.add(h51.v(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(h51.v(chat));
                    }
                }
            }
        }
    }

    public final void V(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (ChatObject.isChannel(chat)) {
            MessagesController.getInstance(this.currentAccount).linkCommunity(j10, j3, z10, new cb(isChannelAndNotMegaGroup, this, 1));
            return;
        }
        b2 b2Var = new b2(getContext(), 3, null);
        b2Var.q(250L);
        MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j10, null, new d(this, b2Var, j3, z10, 1));
    }

    public final void W(h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.N) {
                new ii.b(getContext(), this.f, -chat.id, new m2(14, this, chat)).show();
            } else {
                this.O.run(chat);
                dismiss();
            }
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3
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

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void d(r2 r2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (r2Var.getMessage() == null || (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, r2Var.getMessage().messageOwner, true))) == null) {
            return;
        }
        og.d.m(this.s, -r2Var.getDialogId(), findTopic, 0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j3 = this.e;
        f0 f0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).id == j3) {
                f0Var.d.Y2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) == 0) {
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
            this.f = chat;
            f0Var.a.setTitle(DialogObject.getName(chat));
            f0Var.h.e(this.f, f0Var.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(r2Var.getDialogId())) {
            org.telegram.ui.ActionBar.n2 n2Var = this.s;
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), r2Var.getDialogId(), d9.a((ll0) r2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.d.getCurrentPosition() == 2) {
            le.b bVar = this.c;
            if (bVar.f) {
                this.x.d.X2.h1(1, this.U.b);
                bVar.a(false, true);
                setAllowNestedScroll(true);
                b20 b20Var = this.E;
                AndroidUtilities.hideKeyboard(b20Var.r);
                b20Var.r.clearFocus();
                return;
            }
        }
        this.d.D(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(org.telegram.ui.ActionBar.n2 n2Var, long j3, ArrayList arrayList, s4 s4Var) {
        super(n2Var.getContext(), n2Var.getResourceProvider(), true, true);
        int i10 = 1;
        pr prVar = pr.h;
        this.b = new le.b(1, this, prVar, 350L, false);
        int i11 = 2;
        this.c = new le.b(2, this, prVar, 350L, false);
        this.J = new yf.z(2);
        this.K = new yf.z(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.c cVar = i0.c.e;
        this.T = cVar;
        this.U = cVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.s = n2Var;
        int i12 = 0;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = s4Var;
        Context context = n2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i13 = j6.a7;
        paint.setColor(j6.v0(i13, this.resourcesProvider));
        fixNavigationBar(j6.v0(i13, this.resourcesProvider));
        this.containerView = new i9(this, context);
        i1 i1Var = new i1(this, context, i11);
        this.d = i1Var;
        int i14 = this.backgroundPaddingLeft;
        i1Var.setPadding(i14, 0, i14, 0);
        this.containerView.addView(this.d, x5.e(-1, -1, 119));
        int i15 = 3;
        this.H = new eb(this, context, i15);
        this.I = new eb(this, context, i15);
        b20 b20Var = new b20(context, this.resourcesProvider);
        this.y = b20Var;
        b20Var.setCloseButtonVisible(true);
        b20Var.x = true;
        b20Var.d();
        String string = LocaleController.getString(R.string.Search);
        h2 h2Var = b20Var.r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new w(this));
        b20Var.setVisibility(8);
        b20 b20Var2 = new b20(context, this.resourcesProvider);
        this.E = b20Var2;
        b20Var2.setCloseButtonVisible(true);
        b20Var2.x = true;
        b20Var2.d();
        String string2 = LocaleController.getString(R.string.Search);
        h2 h2Var2 = b20Var2.r;
        h2Var2.setHint(string2);
        h2Var2.addTextChangedListener(new x(this));
        b20Var2.setVisibility(8);
        d61 d61Var = new d61(context, this.currentAccount, 0, false, new t(this, i12), new u(this, i12), null, this.resourcesProvider);
        this.G = d61Var;
        d61Var.j(new y(this));
        d61Var.setClipToPadding(false);
        d61Var.setVisibility(8);
        d61Var.o1();
        d61Var.Y2.r = false;
        d61Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        x10 x10Var = new x10(n2Var);
        this.F = x10Var;
        x10Var.setVisibility(8);
        x10Var.setBackground(null);
        x10Var.setChatPreviewDelegate(new z());
        x10Var.setUiCallback(new a0(this));
        x10Var.b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        f6 f6Var = this.resourcesProvider;
        t0 t0Var = new t0(context2, f6Var, new yc((FrameLayout) this.containerView, f6Var), this.currentAccount, j3);
        this.M = t0Var;
        t0Var.h = new b0(this, n2Var);
        this.e = j3;
        this.f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        MessagesController.getInstance(this.currentAccount).getChatFull(j3);
        TLRPC.Chat chat = this.f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        hg.q0 q0Var = new hg.q0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        q0Var.f = this.f;
        q0Var.h = false;
        ArrayList arrayList2 = b20Var.F;
        arrayList2.add(q0Var);
        b20Var.I = arrayList2.size() - 1;
        b20Var.f();
        setBackgroundColor(j6.v0(i13, this.resourcesProvider));
        this.w = new j0(this, context);
        this.v = new f0(this, context);
        this.x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        b20Var.setCloseButtonOnClickListener(new v(this, i12));
        b20Var2.setCloseButtonOnClickListener(new v(this, i10));
        t0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j3, 0, true);
        qc.a((FrameLayout) this.containerView, new d0());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(viewGroup, uVar);
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void a(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(r2 r2Var) {
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
