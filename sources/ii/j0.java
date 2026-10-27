package ii;

import a8.v0;
import ai.n1;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.cc;
import bi.r3;
import di.q7;
import fi.c2;
import fi.ga;
import fi.h1;
import fi.q8;
import hi.p4;
import hi.u2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.cf1;
import org.telegram.ui.d3;
import org.telegram.ui.j10;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j0 extends k3 implements NotificationCenter.NotificationCenterDelegate, oe.d, l2 {
    public static final /* synthetic */ int V = 0;
    public final m20 E;
    public final j10 F;
    public final s71 G;
    public final cc H;
    public final cc I;
    public final ag.h0 J;
    public final ag.h0 K;
    public final View L;
    public final r0 M;
    public final boolean N;
    public final Utilities.Callback O;
    public final Paint P;
    public ArrayList Q;
    public String R;
    public String S;
    public i0.b T;
    public i0.b U;
    public final oe.b b;
    public final oe.b c;
    public final h1 d;
    public final long e;
    public TLRPC.Chat f;
    public boolean h;
    public fi.d n;
    public fi.d r;
    public final r2 s;
    public final e0 v;
    public final i0 w;
    public final d0 x;
    public final m20 y;

    public j0(r2 r2Var, long j10) {
        this(r2Var, j10, null, null);
    }

    public static void B(j0 j0Var) {
        if (!ChatObject.canAddChatToCommunity(j0Var.f)) {
            j0Var.dismiss();
            return;
        }
        fi.d dVar = j0Var.n;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(j0Var.currentAccount).fetchChatsToAddToCommunity(new s(j0Var, 2));
    }

    public static void C(j0 j0Var, u61 u61Var, View view) {
        long j10;
        TLRPC.Chat chat;
        r2 r2Var = j0Var.s;
        if (j0Var.d0(u61Var)) {
            return;
        }
        int i10 = u61Var.d;
        boolean z10 = false;
        if (i10 == 101) {
            j0Var.h = !j0Var.h;
            MessagesController.getInstance(j0Var.currentAccount).toggleCommunityCollapsedInDialogs(j0Var.e, j0Var.h);
            if (view instanceof z8) {
                ((z8) view).getCheckBox().c(j0Var.h, true);
                return;
            } else {
                j0Var.v.d.g3.O(false);
                return;
            }
        }
        if (i10 == 100) {
            j0Var.d.E(1);
            j0Var.M.e();
            return;
        }
        Object obj = u61Var.G;
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
        int b10 = s0.b(j0Var.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            if (b10 == 3) {
                d90 d90Var = new d90(j0Var.getContext(), chat2, null, j0Var.s, j0Var.resourcesProvider);
                d90Var.r = new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider);
                d90Var.show();
                return;
            } else {
                if (b10 == 4) {
                    org.telegram.messenger.t.q(z10 ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), R.raw.e_hand_2, 36);
                    return;
                }
                return;
            }
        }
        if (r2Var instanceof wn) {
            wn wnVar = (wn) r2Var;
            TLRPC.Chat chat3 = wnVar.e;
            TLRPC.User i11 = wnVar.i();
            if ((chat3 != null && chat3.id == (-j10)) || (i11 != null && i11.id == j10)) {
                j0Var.dismiss();
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
            r2Var.presentFragment(new wn(bundle));
        } else if (ChatObject.areTabsEnabled(chat2)) {
            wn wnVar2 = new wn(bundle);
            pg.d.a(wnVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(j0Var.currentAccount).getForumLastTopicId(chat2.id)));
            r2Var.presentFragment(wnVar2);
        } else {
            r2Var.presentFragment(new cf1(bundle));
        }
        j0Var.dismiss();
    }

    public static void D(j0 j0Var, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(u61.E(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(u61.E(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        u61 u61Var = new u61(39);
        u61Var.d = 101;
        u61Var.l = string;
        u61Var.z = 0;
        u61Var.L(j0Var.h);
        arrayList.add(u61Var);
        arrayList.add(u61.B(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        r0 r0Var = j0Var.M;
        boolean z11 = true;
        if (r0Var.n && r0Var.l == 1 && (arrayList2 = r0Var.j) != null && arrayList2.size() == 1) {
            arrayList.add(u61.t(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            r0Var.c(arrayList);
            arrayList.add(u61.E(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = r0Var.l;
            if (i11 > 0) {
                int i12 = r0Var.p;
                int i13 = R.drawable.filled_requests_24;
                String string2 = i11 == i12 ? LocaleController.getString(R.string.CommunityPendingRequests) : LocaleController.formatPluralString("CommunityPendingRequestsRow", i11, new Object[0]);
                String num = i12 > 0 ? Integer.toString(i12) : null;
                int i14 = ji.i.a;
                u61 K = u61.K(ji.i.class);
                K.d = 100;
                K.k = i13;
                K.l = string2;
                K.n = num;
                K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                K.q = true;
                arrayList.add(K);
                arrayList.add(u61.E(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(j0Var.currentAccount).buildCommunityPeers(j0Var.e);
        if (buildCommunityPeers == null) {
            return;
        }
        if (buildCommunityPeers.chatsYouAreIn.isEmpty()) {
            z10 = false;
        } else {
            arrayList.add(u61.t(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
            int size = arrayList3.size();
            int i15 = 0;
            while (i15 < size) {
                MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                i15++;
                arrayList.add(o0.a(communityPeerDialog, j0Var));
            }
            z10 = true;
        }
        if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
            if (z10) {
                arrayList.add(u61.E(22, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(u61.t(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
            int size2 = arrayList4.size();
            int i16 = 0;
            while (i16 < size2) {
                MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                i16++;
                arrayList.add(o0.a(communityPeerDialog2, j0Var));
            }
            z10 = true;
        }
        if (buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
            z11 = z10;
        } else {
            if (z10) {
                arrayList.add(u61.E(24, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(u61.t(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
            int size3 = arrayList5.size();
            int i17 = 0;
            while (i17 < size3) {
                MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                i17++;
                arrayList.add(o0.a(communityPeerDialog3, j0Var));
            }
        }
        if (buildCommunityPeers.chatsOther.isEmpty()) {
            return;
        }
        if (z11) {
            arrayList.add(u61.E(26, AndroidUtilities.dp(12.0f)));
        }
        arrayList.add(u61.t(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
        ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
        int size4 = arrayList6.size();
        while (i10 < size4) {
            MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
            i10++;
            arrayList.add(o0.a(communityPeerDialog4, j0Var));
        }
    }

    public static void m(j0 j0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            s0.f(new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), 1, z10);
            j0Var.d.E(0);
        } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
            d3.t((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
        } else {
            s0.f(new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), 2, z10);
            j0Var.d.E(0);
        }
    }

    public static void n(j0 j0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        j0Var.n.setLoading(false);
        if (tL_error != null) {
            d3.t((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
            return;
        }
        if (arrayList != null) {
            j0Var.Q = arrayList;
            if (!arrayList.isEmpty()) {
                j0Var.x.d.g3.O(false);
                j0Var.d.E(2);
            } else {
                org.telegram.messenger.t.q(R.string.CommunityNoChatsToAdd, new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), R.raw.info, 36);
            }
        }
    }

    public static void o(j0 j0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            d3.t((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
        }
    }

    public static /* synthetic */ void p(j0 j0Var, e2 e2Var, long j10, boolean z10, long j11) {
        e2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        j0Var.f0(MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void q(j0 j0Var, boolean z10, boolean z11, long j10) {
        e2 O = g5.O(j0Var.getContext(), j0Var.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(z10 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : z11 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), new r3(j0Var, j10, 11));
        O.show();
        TextView textView = (TextView) O.d(-1);
        if (textView != null) {
            f7.V(textView, y6.q7, null);
        }
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 1) {
            float a2 = v0.a(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, a2);
            e0 e0Var = this.v;
            e0Var.a.setAlpha(a2);
            e0Var.a.setScaleX(lerp);
            e0Var.a.setScaleY(lerp);
            e0Var.a.setVisibility(a2 > 0.0f ? 0 : 8);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            m20 m20Var = this.y;
            m20Var.setAlpha(f7);
            m20Var.setScaleX(lerp2);
            m20Var.setScaleY(lerp2);
            m20Var.setVisibility(f7 > 0.0f ? 0 : 8);
            e0Var.d.setAlpha(a2);
            e0Var.d.setVisibility(a2 > 0.0f ? 0 : 8);
            this.n.setAlpha(a2);
            this.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, a2));
            this.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, a2));
            this.n.setVisibility(a2 > 0.0f ? 0 : 8);
            j10 j10Var = this.F;
            j10Var.setAlpha(f7);
            j10Var.setVisibility(f7 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float a10 = v0.a(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, a10);
            d0 d0Var = this.x;
            d0Var.a.setAlpha(a10);
            d0Var.a.setScaleX(lerp3);
            d0Var.a.setScaleY(lerp3);
            d0Var.a.setVisibility(a10 > 0.0f ? 0 : 8);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            m20 m20Var2 = this.E;
            m20Var2.setAlpha(f7);
            m20Var2.setScaleX(lerp4);
            m20Var2.setScaleY(lerp4);
            m20Var2.setVisibility(f7 > 0.0f ? 0 : 8);
            d0Var.d.setAlpha(a10);
            d0Var.d.setVisibility(a10 > 0.0f ? 0 : 8);
            if (!this.N) {
                this.r.setAlpha(a10);
                this.r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, a10));
                this.r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, a10));
                this.r.setVisibility(a10 > 0.0f ? 0 : 8);
            }
            s71 s71Var = this.G;
            s71Var.setAlpha(f7);
            s71Var.setVisibility(f7 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.l2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canDismissWithSwipe() {
        if (this.b.f || this.c.f) {
            return false;
        }
        View currentView = this.d.getCurrentView();
        if (currentView instanceof g0) {
            return ((g0) currentView).e;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void d(p2 p2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (p2Var.getMessage() == null || (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-p2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, p2Var.getMessage().messageOwner, true))) == null) {
            return;
        }
        pg.d.m(this.s, -p2Var.getDialogId(), findTopic, 0);
    }

    public final boolean d0(u61 u61Var) {
        Object obj = u61Var.G;
        if (!(obj instanceof ji.f)) {
            return false;
        }
        ji.f fVar = (ji.f) obj;
        long j10 = fVar.a;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        r2 r2Var = this.s;
        if (user != null) {
            r2Var.presentFragment(wn.ea(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            r2Var.presentFragment(wn.ea(-chat.id));
            return true;
        }
        new ki.b(getContext(), chat, new u2(14, this, fVar)).show();
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.e;
        e0 e0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).id == j10) {
                e0Var.d.g3.O(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) == 0) {
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
            this.f = chat;
            e0Var.a.setTitle(DialogObject.getName(chat));
            e0Var.h.f(this.f, e0Var.n);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    @Override // org.telegram.ui.Cells.l2
    public final void e(p2 p2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().K(p2Var.getDialogId())) {
            r2 r2Var = this.s;
            r2Var.getOrCreateStoryViewer().getClass();
            r2Var.getOrCreateStoryViewer().E(r2Var.getContext(), p2Var.getDialogId(), q7.a((nm0) p2Var.getParent()));
        }
    }

    public final void e0(ArrayList arrayList, boolean z10) {
        String str;
        int i10 = 0;
        if (!z10) {
            arrayList.add(u61.E(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(u61.E(0, AndroidUtilities.dp(56.0f)));
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
                    arrayList.add(u61.w(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(u61.w(chat));
                    }
                }
            }
        }
    }

    public final void f0(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (ChatObject.isChannel(chat)) {
            MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new ga(1, this, isChannelAndNotMegaGroup));
            return;
        }
        e2 e2Var = new e2(getContext(), 3, null);
        e2Var.r(250L);
        MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, e2Var, j10, z10, 1));
    }

    public final void g0(u61 u61Var) {
        Object obj = u61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.N) {
                new ki.a(getContext(), this.f, -chat.id, new n1(23, this, chat)).show();
            } else {
                this.O.run(chat);
                dismiss();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.d.getCurrentPosition() == 2) {
            oe.b bVar = this.c;
            if (bVar.f) {
                this.x.d.f3.h1(1, this.U.b);
                bVar.a(false, true);
                setAllowNestedScroll(true);
                m20 m20Var = this.E;
                AndroidUtilities.hideKeyboard(m20Var.r);
                m20Var.r.clearFocus();
                return;
            }
        }
        this.d.E(0);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        Paint paint = this.P;
        try {
            super.onThemeColorsChanged();
            int w02 = y6.w0(y6.a7, this.resourcesProvider);
            if (paint.getColor() != w02) {
                setBackgroundColor(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.containerView;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(r2 r2Var, long j10, ArrayList arrayList, p4 p4Var) {
        super(r2Var.getContext(), r2Var.getResourceProvider(), true, true);
        int i10 = 1;
        ds dsVar = ds.h;
        this.b = new oe.b(1, this, dsVar, 350L, false);
        int i11 = 2;
        this.c = new oe.b(2, this, dsVar, 350L, false);
        this.J = new ag.h0(2);
        this.K = new ag.h0(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.s = r2Var;
        int i12 = 0;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = p4Var;
        Context context = r2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.updateInterfaces);
        int i13 = y6.a7;
        paint.setColor(y6.w0(i13, this.resourcesProvider));
        fixNavigationBarKey(i13);
        this.containerView = new q8(this, context);
        h1 h1Var = new h1(this, context, i11);
        this.d = h1Var;
        int i14 = this.backgroundPaddingLeft;
        h1Var.setPadding(i14, 0, i14, 0);
        this.containerView.addView(this.d, kb1.i(-1, -1, 119));
        int i15 = 5;
        this.H = new cc(this, context, i15);
        this.I = new cc(this, context, i15);
        m20 m20Var = new m20(context, this.resourcesProvider);
        this.y = m20Var;
        m20Var.setCloseButtonVisible(true);
        m20Var.x = true;
        m20Var.updateColors();
        String string = LocaleController.getString(R.string.Search);
        c2 c2Var = m20Var.r;
        c2Var.setHint(string);
        c2Var.addTextChangedListener(new v(this));
        m20Var.setVisibility(8);
        m20 m20Var2 = new m20(context, this.resourcesProvider);
        this.E = m20Var2;
        m20Var2.setCloseButtonVisible(true);
        m20Var2.x = true;
        m20Var2.updateColors();
        String string2 = LocaleController.getString(R.string.Search);
        c2 c2Var2 = m20Var2.r;
        c2Var2.setHint(string2);
        c2Var2.addTextChangedListener(new w(this));
        m20Var2.setVisibility(8);
        s71 s71Var = new s71(context, this.currentAccount, 0, false, new s(this, i12), new t(this, i12), null, this.resourcesProvider);
        this.G = s71Var;
        s71Var.j(new x(this));
        s71Var.setClipToPadding(false);
        s71Var.setVisibility(8);
        s71Var.u1();
        s71Var.g3.r = false;
        s71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        j10 j10Var = new j10(r2Var);
        this.F = j10Var;
        j10Var.setVisibility(8);
        j10Var.setBackground(null);
        j10Var.setChatPreviewDelegate(new y());
        j10Var.setUiCallback(new z(this));
        j10Var.b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        u6 u6Var = this.resourcesProvider;
        r0 r0Var = new r0(context2, u6Var, new wc((FrameLayout) this.containerView, u6Var), this.currentAccount, j10);
        this.M = r0Var;
        r0Var.h = new a0(this, r2Var);
        this.e = j10;
        this.f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        ig.p0 p0Var = new ig.p0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        p0Var.f = this.f;
        p0Var.h = false;
        ArrayList arrayList2 = m20Var.F;
        arrayList2.add(p0Var);
        m20Var.I = arrayList2.size() - 1;
        m20Var.e();
        setBackgroundColor(y6.w0(i13, this.resourcesProvider));
        this.w = new i0(this, context);
        this.v = new e0(this, context);
        this.x = new d0(this, context);
        this.d.setAdapter(new b0(this));
        m20Var.setCloseButtonOnClickListener(new u(this, i12));
        m20Var2.setCloseButtonOnClickListener(new u(this, i10));
        r0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        qc.a((FrameLayout) this.containerView, new c0());
        ViewGroup viewGroup = this.containerView;
        t tVar = new t(this, i10);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup, tVar);
    }

    @Override // org.telegram.ui.Cells.l2
    public final void a(p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void f(p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void c() {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
