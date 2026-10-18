package hi;

import ai.ic;
import ai.t3;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.q7;
import ei.e2;
import ei.h1;
import ei.ka;
import gi.g4;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.u8;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.g10;
import org.telegram.ui.sn;
import org.telegram.ui.te1;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class k0 extends f3 implements NotificationCenter.NotificationCenterDelegate, ne.d, n2 {
    public static final /* synthetic */ int V = 0;
    public final k20 E;
    public final g10 F;
    public final a71 G;
    public final ic H;
    public final ic I;
    public final zf.y J;
    public final zf.y K;
    public final View L;
    public final s0 M;
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
    public ei.d n;
    public ei.d r;
    public final org.telegram.ui.ActionBar.n2 s;
    public final f0 v;
    public final j0 w;
    public final e0 x;
    public final k20 y;

    public k0(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        this(n2Var, j10, null, null);
    }

    public static void A(k0 k0Var, f61 f61Var, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.n2 n2Var = k0Var.s;
        if (k0Var.U(f61Var)) {
            return;
        }
        int i10 = f61Var.d;
        boolean z10 = false;
        if (i10 == 101) {
            k0Var.h = !k0Var.h;
            MessagesController.getInstance(k0Var.currentAccount).toggleCommunityCollapsedInDialogs(k0Var.e, k0Var.h);
            if (view instanceof u8) {
                ((u8) view).getCheckBox().c(k0Var.h, true);
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
        Object obj = f61Var.G;
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
        int b10 = t0.b(k0Var.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            if (b10 == 3) {
                a90 a90Var = new a90(k0Var.getContext(), chat2, null, k0Var.s, k0Var.resourcesProvider);
                a90Var.n = new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                a90Var.show();
                return;
            } else {
                if (b10 == 4) {
                    org.telegram.messenger.g0.q(z10 ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.e_hand_2, 36);
                    return;
                }
                return;
            }
        }
        if (n2Var instanceof sn) {
            sn snVar = (sn) n2Var;
            TLRPC.Chat chat3 = snVar.e;
            TLRPC.User i11 = snVar.i();
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
            n2Var.presentFragment(new sn(bundle));
        } else if (ChatObject.areTabsEnabled(chat2)) {
            sn snVar2 = new sn(bundle);
            og.d.a(snVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.id)));
            n2Var.presentFragment(snVar2);
        } else {
            n2Var.presentFragment(new te1(bundle));
        }
        k0Var.dismiss();
    }

    public static void B(k0 k0Var, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(f61.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(f61.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        f61 f61Var = new f61(39);
        f61Var.d = 101;
        f61Var.l = string;
        f61Var.z = 0;
        f61Var.K(k0Var.h);
        arrayList.add(f61Var);
        arrayList.add(f61.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        s0 s0Var = k0Var.M;
        boolean z11 = true;
        if (s0Var.n && s0Var.l == 1 && (arrayList2 = s0Var.j) != null && arrayList2.size() == 1) {
            arrayList.add(f61.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            s0Var.c(arrayList);
            arrayList.add(f61.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = s0Var.l;
            if (i11 > 0) {
                int i12 = s0Var.p;
                int i13 = R.drawable.filled_requests_24;
                String string2 = i11 == i12 ? LocaleController.getString(R.string.CommunityPendingRequests) : LocaleController.formatPluralString("CommunityPendingRequestsRow", i11, new Object[0]);
                String num = i12 > 0 ? Integer.toString(i12) : null;
                int i14 = ii.h.a;
                f61 J = f61.J(ii.h.class);
                J.d = 100;
                J.k = i13;
                J.l = string2;
                J.n = num;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.q = true;
                arrayList.add(J);
                arrayList.add(f61.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.e);
        if (buildCommunityPeers == null) {
            return;
        }
        if (buildCommunityPeers.chatsYouAreIn.isEmpty()) {
            z10 = false;
        } else {
            arrayList.add(f61.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
            int size = arrayList3.size();
            int i15 = 0;
            while (i15 < size) {
                MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                i15++;
                arrayList.add(p0.a(communityPeerDialog, k0Var));
            }
            z10 = true;
        }
        if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
            if (z10) {
                arrayList.add(f61.D(22, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(f61.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
            int size2 = arrayList4.size();
            int i16 = 0;
            while (i16 < size2) {
                MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                i16++;
                arrayList.add(p0.a(communityPeerDialog2, k0Var));
            }
            z10 = true;
        }
        if (buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
            z11 = z10;
        } else {
            if (z10) {
                arrayList.add(f61.D(24, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(f61.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
            int size3 = arrayList5.size();
            int i17 = 0;
            while (i17 < size3) {
                MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                i17++;
                arrayList.add(p0.a(communityPeerDialog3, k0Var));
            }
        }
        if (buildCommunityPeers.chatsOther.isEmpty()) {
            return;
        }
        if (z11) {
            arrayList.add(f61.D(26, AndroidUtilities.dp(12.0f)));
        }
        arrayList.add(f61.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
        ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
        int size4 = arrayList6.size();
        while (i10 < size4) {
            MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
            i10++;
            arrayList.add(p0.a(communityPeerDialog4, k0Var));
        }
    }

    public static void n(k0 k0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            t0.f(new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
            k0Var.d.D(0);
        } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
            c1.t((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else {
            t0.f(new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
            k0Var.d.D(0);
        }
    }

    public static void o(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.n.setLoading(false);
        if (tL_error != null) {
            c1.t((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        if (arrayList != null) {
            k0Var.Q = arrayList;
            if (!arrayList.isEmpty()) {
                k0Var.x.d.W2.N(false);
                k0Var.d.D(2);
            } else {
                org.telegram.messenger.g0.q(R.string.CommunityNoChatsToAdd, new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
            }
        }
    }

    public static void p(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            c1.t((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static /* synthetic */ void q(k0 k0Var, b2 b2Var, long j10, boolean z10, long j11) {
        b2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        k0Var.W(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void r(k0 k0Var, boolean z10, boolean z11, long j10) {
        b2 O = f5.O(k0Var.getContext(), k0Var.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(z10 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : z11 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), new t3(k0Var, j10, 11));
        O.show();
        TextView textView = (TextView) O.d(-1);
        if (textView != null) {
            textView.setTextColor(h6.x0(null, h6.q7, false));
        }
    }

    public static void z(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f)) {
            k0Var.dismiss();
            return;
        }
        ei.d dVar = k0Var.n;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new s(k0Var, 2));
    }

    public final boolean U(f61 f61Var) {
        Object obj = f61Var.G;
        if (!(obj instanceof ii.e)) {
            return false;
        }
        ii.e eVar = (ii.e) obj;
        long j10 = eVar.a;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        org.telegram.ui.ActionBar.n2 n2Var = this.s;
        if (user != null) {
            n2Var.presentFragment(sn.W9(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            n2Var.presentFragment(sn.W9(-chat.id));
            return true;
        }
        new ji.b(getContext(), chat, new t(0, this, eVar)).show();
        return true;
    }

    public final void V(ArrayList arrayList, boolean z10) {
        String str;
        int i10 = 0;
        if (!z10) {
            arrayList.add(f61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(f61.D(0, AndroidUtilities.dp(56.0f)));
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
                    arrayList.add(f61.v(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(f61.v(chat));
                    }
                }
            }
        }
    }

    public final void W(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (ChatObject.isChannel(chat)) {
            MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new ka(1, this, isChannelAndNotMegaGroup));
            return;
        }
        b2 b2Var = new b2(getContext(), 3, null);
        b2Var.q(250L);
        MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, b2Var, j10, z10, 1));
    }

    public final void X(f61 f61Var) {
        Object obj = f61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.N) {
                new ji.a(getContext(), this.f, -chat.id, new ai.n2(21, this, chat)).show();
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

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (r2Var.getMessage() == null || (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, r2Var.getMessage().messageOwner, true))) == null) {
            return;
        }
        og.d.m(this.s, -r2Var.getDialogId(), findTopic, 0);
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(r2 r2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(r2Var.getDialogId())) {
            org.telegram.ui.ActionBar.n2 n2Var = this.s;
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), r2Var.getDialogId(), q7.a((im0) r2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
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
                k20 k20Var = this.E;
                AndroidUtilities.hideKeyboard(k20Var.r);
                k20Var.r.clearFocus();
                return;
            }
        }
        this.d.D(0);
    }

    @Override // ne.d
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 1) {
            float b10 = zf.f0.b(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            f0 f0Var = this.v;
            f0Var.a.setAlpha(b10);
            f0Var.a.setScaleX(lerp);
            f0Var.a.setScaleY(lerp);
            f0Var.a.setVisibility(b10 > 0.0f ? 0 : 8);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            k20 k20Var = this.y;
            k20Var.setAlpha(f7);
            k20Var.setScaleX(lerp2);
            k20Var.setScaleY(lerp2);
            k20Var.setVisibility(f7 > 0.0f ? 0 : 8);
            f0Var.d.setAlpha(b10);
            f0Var.d.setVisibility(b10 > 0.0f ? 0 : 8);
            this.n.setAlpha(b10);
            this.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setVisibility(b10 > 0.0f ? 0 : 8);
            g10 g10Var = this.F;
            g10Var.setAlpha(f7);
            g10Var.setVisibility(f7 > 0.0f ? 0 : 8);
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
            k20 k20Var2 = this.E;
            k20Var2.setAlpha(f7);
            k20Var2.setScaleX(lerp4);
            k20Var2.setScaleY(lerp4);
            k20Var2.setVisibility(f7 > 0.0f ? 0 : 8);
            e0Var.d.setAlpha(b11);
            e0Var.d.setVisibility(b11 > 0.0f ? 0 : 8);
            if (!this.N) {
                this.r.setAlpha(b11);
                this.r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.r.setVisibility(b11 > 0.0f ? 0 : 8);
            }
            a71 a71Var = this.G;
            a71Var.setAlpha(f7);
            a71Var.setVisibility(f7 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(org.telegram.ui.ActionBar.n2 n2Var, long j10, ArrayList arrayList, g4 g4Var) {
        super(n2Var.getContext(), n2Var.getResourceProvider(), true, true);
        int i10 = 1;
        bs bsVar = bs.h;
        this.b = new ne.b(1, this, bsVar, 350L, false);
        int i11 = 2;
        this.c = new ne.b(2, this, bsVar, 350L, false);
        this.J = new zf.y(2);
        this.K = new zf.y(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.s = n2Var;
        int i12 = 0;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = g4Var;
        Context context = n2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i13 = h6.a7;
        paint.setColor(h6.w0(i13, this.resourcesProvider));
        fixNavigationBar(h6.w0(i13, this.resourcesProvider));
        this.containerView = new ei.u8(this, context);
        h1 h1Var = new h1(this, context, i11);
        this.d = h1Var;
        int i14 = this.backgroundPaddingLeft;
        h1Var.setPadding(i14, 0, i14, 0);
        this.containerView.addView(this.d, z5.e(-1, -1, 119));
        int i15 = 5;
        this.H = new ic(this, context, i15);
        this.I = new ic(this, context, i15);
        k20 k20Var = new k20(context, this.resourcesProvider);
        this.y = k20Var;
        k20Var.setCloseButtonVisible(true);
        k20Var.x = true;
        k20Var.d();
        String string = LocaleController.getString(R.string.Search);
        e2 e2Var = k20Var.r;
        e2Var.setHint(string);
        e2Var.addTextChangedListener(new w(this));
        k20Var.setVisibility(8);
        k20 k20Var2 = new k20(context, this.resourcesProvider);
        this.E = k20Var2;
        k20Var2.setCloseButtonVisible(true);
        k20Var2.x = true;
        k20Var2.d();
        String string2 = LocaleController.getString(R.string.Search);
        e2 e2Var2 = k20Var2.r;
        e2Var2.setHint(string2);
        e2Var2.addTextChangedListener(new x(this));
        k20Var2.setVisibility(8);
        a71 a71Var = new a71(context, this.currentAccount, 0, false, new s(this, i12), new u(this, i12), null, this.resourcesProvider);
        this.G = a71Var;
        a71Var.j(new y(this));
        a71Var.setClipToPadding(false);
        a71Var.setVisibility(8);
        a71Var.p1();
        a71Var.W2.r = false;
        a71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        g10 g10Var = new g10(n2Var);
        this.F = g10Var;
        g10Var.setVisibility(8);
        g10Var.setBackground(null);
        g10Var.setChatPreviewDelegate(new z());
        g10Var.setUiCallback(new a0(this));
        g10Var.b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        d6 d6Var = this.resourcesProvider;
        s0 s0Var = new s0(context2, d6Var, new xc((FrameLayout) this.containerView, d6Var), this.currentAccount, j10);
        this.M = s0Var;
        s0Var.h = new b0(this, n2Var);
        this.e = j10;
        this.f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        hg.o0 o0Var = new hg.o0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        o0Var.f = this.f;
        o0Var.h = false;
        ArrayList arrayList2 = k20Var.F;
        arrayList2.add(o0Var);
        k20Var.I = arrayList2.size() - 1;
        k20Var.f();
        setBackgroundColor(h6.w0(i13, this.resourcesProvider));
        this.w = new j0(this, context);
        this.v = new f0(this, context);
        this.x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        k20Var.setCloseButtonOnClickListener(new v(this, i12));
        k20Var2.setCloseButtonOnClickListener(new v(this, i10));
        s0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        qc.a((FrameLayout) this.containerView, new d0());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup, uVar);
    }

    @Override // org.telegram.ui.Cells.n2
    public final void a(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void g(r2 r2Var) {
    }

    @Override // ne.d
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
