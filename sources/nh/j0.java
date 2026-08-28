package nh;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.i2;
import fh.f1;
import fh.l2;
import fh.v2;
import g7.e6;
import ih.e7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kh.j1;
import kh.la;
import kh.o8;
import kh.v8;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.f10;
import org.telegram.ui.qn;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j0 extends f3 implements NotificationCenter.NotificationCenterDelegate, td.b, n2 {
    public static final /* synthetic */ int R = 0;
    public final m10 A;
    public final f10 B;
    public final i51 C;
    public final l2 D;
    public final l2 E;
    public final ff.c0 F;
    public final ff.c0 G;
    public final View H;
    public final q0 I;
    public final boolean J;
    public final Utilities.Callback K;
    public final Paint L;
    public ArrayList M;
    public String N;
    public String O;
    public i0.b P;
    public i0.b Q;
    public final td.a b;
    public final td.a c;
    public final j1 d;
    public final long e;
    public TLRPC.Chat f;
    public boolean h;
    public kh.d n;
    public kh.d r;
    public final o2 s;
    public final e0 v;
    public final i0 w;
    public final d0 x;
    public final m10 y;

    public j0(o2 o2Var, long j10) {
        this(o2Var, j10, null, null);
    }

    public static void m(j0 j0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            r0.f(new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), 1, z10);
            j0Var.d.D(0);
        } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
            j2.s((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
        } else {
            r0.f(new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), 2, z10);
            j0Var.d.D(0);
        }
    }

    public static void n(j0 j0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        j0Var.n.setLoading(false);
        if (tL_error != null) {
            j2.s((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
            return;
        }
        if (arrayList != null) {
            j0Var.M = arrayList;
            if (!arrayList.isEmpty()) {
                j0Var.x.d.U2.N(false);
                j0Var.d.D(2);
            } else {
                org.telegram.messenger.l0.p(R.string.CommunityNoChatsToAdd, new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), R.raw.info, 36);
            }
        }
    }

    public static void o(j0 j0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            j2.s((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
        }
    }

    public static /* synthetic */ void p(j0 j0Var, c2 c2Var, long j10, boolean z10, long j11) {
        c2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        j0Var.U(MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void q(j0 j0Var, boolean z10, boolean z11, long j10) {
        c2 P = y4.P(j0Var.getContext(), j0Var.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(z10 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : z11 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), new i2(j0Var, j10, 12));
        P.show();
        TextView textView = (TextView) P.d(-1);
        if (textView != null) {
            textView.setTextColor(f6.w0(null, f6.q7, false));
        }
    }

    public static void x(j0 j0Var) {
        if (!ChatObject.canAddChatToCommunity(j0Var.f)) {
            j0Var.dismiss();
            return;
        }
        kh.d dVar = j0Var.n;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(j0Var.currentAccount).fetchChatsToAddToCommunity(new s(j0Var, 2));
    }

    public static void y(j0 j0Var, l41 l41Var, View view) {
        long j10;
        TLRPC.Chat chat;
        o2 o2Var = j0Var.s;
        if (j0Var.S(l41Var)) {
            return;
        }
        int i9 = l41Var.d;
        boolean z10 = false;
        if (i9 == 101) {
            j0Var.h = !j0Var.h;
            MessagesController.getInstance(j0Var.currentAccount).toggleCommunityCollapsedInDialogs(j0Var.e, j0Var.h);
            if (view instanceof s8) {
                ((s8) view).getCheckBox().c(j0Var.h, true);
                return;
            } else {
                j0Var.v.d.U2.N(false);
                return;
            }
        }
        if (i9 == 100) {
            j0Var.d.D(1);
            j0Var.I.e();
            return;
        }
        Object obj = l41Var.G;
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
        int b10 = r0.b(j0Var.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            if (b10 == 3) {
                p70 p70Var = new p70(j0Var.getContext(), chat2, null, j0Var.s, j0Var.resourcesProvider);
                p70Var.n = new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider);
                p70Var.show();
                return;
            } else {
                if (b10 == 4) {
                    org.telegram.messenger.l0.p(z10 ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), R.raw.e_hand_2, 36);
                    return;
                }
                return;
            }
        }
        if (o2Var instanceof qn) {
            qn qnVar = (qn) o2Var;
            TLRPC.Chat chat3 = qnVar.e;
            TLRPC.User i10 = qnVar.i();
            if ((chat3 != null && chat3.id == (-j10)) || (i10 != null && i10.id == j10)) {
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
            o2Var.presentFragment(new qn(bundle));
        } else if (ChatObject.areTabsEnabled(chat2)) {
            qn qnVar2 = new qn(bundle);
            vf.c.a(qnVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(j0Var.currentAccount).getForumLastTopicId(chat2.id)));
            o2Var.presentFragment(qnVar2);
        } else {
            o2Var.presentFragment(new we1(bundle));
        }
        j0Var.dismiss();
    }

    public static void z(j0 j0Var, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(l41.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i9 = 0;
        arrayList.add(l41.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        l41 l41Var = new l41(39);
        l41Var.d = 101;
        l41Var.l = string;
        l41Var.z = 0;
        l41Var.K(j0Var.h);
        arrayList.add(l41Var);
        arrayList.add(l41.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        q0 q0Var = j0Var.I;
        boolean z11 = true;
        if (q0Var.n && q0Var.l == 1 && (arrayList2 = q0Var.j) != null && arrayList2.size() == 1) {
            arrayList.add(l41.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            q0Var.c(arrayList);
            arrayList.add(l41.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i10 = q0Var.l;
            if (i10 > 0) {
                int i11 = q0Var.p;
                int i12 = R.drawable.filled_requests_24;
                String string2 = i10 == i11 ? LocaleController.getString(R.string.CommunityPendingRequests) : LocaleController.formatPluralString("CommunityPendingRequestsRow", i10, new Object[0]);
                String num = i11 > 0 ? Integer.toString(i11) : null;
                int i13 = oh.h.a;
                l41 J = l41.J(oh.h.class);
                J.d = 100;
                J.k = i12;
                J.l = string2;
                J.n = num;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.q = true;
                arrayList.add(J);
                arrayList.add(l41.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(j0Var.currentAccount).buildCommunityPeers(j0Var.e);
        if (buildCommunityPeers == null) {
            return;
        }
        if (buildCommunityPeers.chatsYouAreIn.isEmpty()) {
            z10 = false;
        } else {
            arrayList.add(l41.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
            int size = arrayList3.size();
            int i14 = 0;
            while (i14 < size) {
                MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i14);
                i14++;
                arrayList.add(n0.a(communityPeerDialog, j0Var));
            }
            z10 = true;
        }
        if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
            if (z10) {
                arrayList.add(l41.D(22, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(l41.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
            int size2 = arrayList4.size();
            int i15 = 0;
            while (i15 < size2) {
                MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i15);
                i15++;
                arrayList.add(n0.a(communityPeerDialog2, j0Var));
            }
            z10 = true;
        }
        if (buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
            z11 = z10;
        } else {
            if (z10) {
                arrayList.add(l41.D(24, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(l41.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
            int size3 = arrayList5.size();
            int i16 = 0;
            while (i16 < size3) {
                MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i16);
                i16++;
                arrayList.add(n0.a(communityPeerDialog3, j0Var));
            }
        }
        if (buildCommunityPeers.chatsOther.isEmpty()) {
            return;
        }
        if (z11) {
            arrayList.add(l41.D(26, AndroidUtilities.dp(12.0f)));
        }
        arrayList.add(l41.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
        ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
        int size4 = arrayList6.size();
        while (i9 < size4) {
            MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i9);
            i9++;
            arrayList.add(n0.a(communityPeerDialog4, j0Var));
        }
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 1) {
            float b10 = ff.m0.b(f10);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            e0 e0Var = this.v;
            e0Var.a.setAlpha(b10);
            e0Var.a.setScaleX(lerp);
            e0Var.a.setScaleY(lerp);
            e0Var.a.setVisibility(b10 > 0.0f ? 0 : 8);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            m10 m10Var = this.y;
            m10Var.setAlpha(f10);
            m10Var.setScaleX(lerp2);
            m10Var.setScaleY(lerp2);
            m10Var.setVisibility(f10 > 0.0f ? 0 : 8);
            e0Var.d.setAlpha(b10);
            e0Var.d.setVisibility(b10 > 0.0f ? 0 : 8);
            this.n.setAlpha(b10);
            this.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.n.setVisibility(b10 > 0.0f ? 0 : 8);
            f10 f10Var = this.B;
            f10Var.setAlpha(f10);
            f10Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.D.invalidate();
        }
        if (i9 == 2) {
            float b11 = ff.m0.b(f10);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            d0 d0Var = this.x;
            d0Var.a.setAlpha(b11);
            d0Var.a.setScaleX(lerp3);
            d0Var.a.setScaleY(lerp3);
            d0Var.a.setVisibility(b11 > 0.0f ? 0 : 8);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            m10 m10Var2 = this.A;
            m10Var2.setAlpha(f10);
            m10Var2.setScaleX(lerp4);
            m10Var2.setScaleY(lerp4);
            m10Var2.setVisibility(f10 > 0.0f ? 0 : 8);
            d0Var.d.setAlpha(b11);
            d0Var.d.setVisibility(b11 > 0.0f ? 0 : 8);
            if (!this.J) {
                this.r.setAlpha(b11);
                this.r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.r.setVisibility(b11 > 0.0f ? 0 : 8);
            }
            i51 i51Var = this.C;
            i51Var.setAlpha(f10);
            i51Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.E.invalidate();
        }
    }

    public final boolean S(l41 l41Var) {
        Object obj = l41Var.G;
        if (!(obj instanceof oh.e)) {
            return false;
        }
        oh.e eVar = (oh.e) obj;
        long j10 = eVar.a;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        o2 o2Var = this.s;
        if (user != null) {
            o2Var.presentFragment(qn.R9(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            o2Var.presentFragment(qn.R9(-chat.id));
            return true;
        }
        new ph.b(getContext(), chat, new o8(12, this, eVar)).show();
        return true;
    }

    public final void T(ArrayList arrayList, boolean z10) {
        String str;
        int i9 = 0;
        if (!z10) {
            arrayList.add(l41.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(l41.D(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.M != null) {
            String lowerCase = (!z10 || (str = this.O) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.M;
            int size = arrayList2.size();
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z10 || TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(l41.v(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(l41.v(chat));
                    }
                }
            }
        }
    }

    public final void U(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (ChatObject.isChannel(chat)) {
            MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new la(isChannelAndNotMegaGroup, this, 1));
            return;
        }
        c2 c2Var = new c2(getContext(), 3, null);
        c2Var.q(250L);
        MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, c2Var, j10, z10, 1));
    }

    public final void V(l41 l41Var) {
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.J) {
                new ph.a(getContext(), this.f, -chat.id, new f1(23, this, chat)).show();
            } else {
                this.K.run(chat);
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
        if (currentView instanceof g0) {
            return ((g0) currentView).e;
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
        vf.c.m(this.s, -r2Var.getDialogId(), findTopic, 0);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.e;
        e0 e0Var = this.v;
        if (i9 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).id == j10) {
                e0Var.d.U2.N(true);
            }
        } else if (i9 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) == 0) {
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
            this.f = chat;
            e0Var.a.setTitle(DialogObject.getName(chat));
            e0Var.h.e(this.f, e0Var.n);
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
            o2 o2Var = this.s;
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), r2Var.getDialogId(), e7.a((wk0) r2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.d.getCurrentPosition() == 2) {
            td.a aVar = this.c;
            if (aVar.f) {
                this.x.d.T2.h1(1, this.Q.b);
                aVar.a(false, true);
                setAllowNestedScroll(true);
                m10 m10Var = this.A;
                AndroidUtilities.hideKeyboard(m10Var.r);
                m10Var.r.clearFocus();
                return;
            }
        }
        this.d.D(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(o2 o2Var, long j10, ArrayList arrayList, v2 v2Var) {
        super(o2Var.getContext(), o2Var.getResourceProvider(), true, true);
        int i9 = 1;
        gr grVar = gr.h;
        this.b = new td.a(1, this, grVar, 350L, false);
        int i10 = 2;
        this.c = new td.a(2, this, grVar, 350L, false);
        this.F = new ff.c0(2);
        this.G = new ff.c0(8);
        Paint paint = new Paint(1);
        this.L = paint;
        i0.b bVar = i0.b.e;
        this.P = bVar;
        this.Q = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.s = o2Var;
        int i11 = 0;
        this.J = arrayList != null;
        this.M = arrayList;
        this.K = v2Var;
        Context context = o2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i12 = f6.a7;
        paint.setColor(f6.v0(i12, this.resourcesProvider));
        fixNavigationBar(f6.v0(i12, this.resourcesProvider));
        this.containerView = new v8(this, context);
        j1 j1Var = new j1(this, context, i10);
        this.d = j1Var;
        int i13 = this.backgroundPaddingLeft;
        j1Var.setPadding(i13, 0, i13, 0);
        this.containerView.addView(this.d, e6.e(-1, -1, 119));
        int i14 = 5;
        this.D = new l2(this, context, i14);
        this.E = new l2(this, context, i14);
        m10 m10Var = new m10(context, this.resourcesProvider);
        this.y = m10Var;
        m10Var.setCloseButtonVisible(true);
        m10Var.x = true;
        m10Var.d();
        String string = LocaleController.getString(R.string.Search);
        fg.g gVar = m10Var.r;
        gVar.setHint(string);
        gVar.addTextChangedListener(new v(this));
        m10Var.setVisibility(8);
        m10 m10Var2 = new m10(context, this.resourcesProvider);
        this.A = m10Var2;
        m10Var2.setCloseButtonVisible(true);
        m10Var2.x = true;
        m10Var2.d();
        String string2 = LocaleController.getString(R.string.Search);
        fg.g gVar2 = m10Var2.r;
        gVar2.setHint(string2);
        gVar2.addTextChangedListener(new w(this));
        m10Var2.setVisibility(8);
        i51 i51Var = new i51(context, this.currentAccount, 0, false, new s(this, i11), new t(this, i11), null, this.resourcesProvider);
        this.C = i51Var;
        i51Var.j(new x(this));
        i51Var.setClipToPadding(false);
        i51Var.setVisibility(8);
        i51Var.p1();
        i51Var.U2.r = false;
        i51Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        f10 f10Var = new f10(o2Var);
        this.B = f10Var;
        f10Var.setVisibility(8);
        f10Var.setBackground(null);
        f10Var.setChatPreviewDelegate(new y());
        f10Var.setUiCallback(new z(this));
        f10Var.b.setClipToPadding(false);
        this.H = new View(getContext());
        Context context2 = getContext();
        b6 b6Var = this.resourcesProvider;
        q0 q0Var = new q0(context2, b6Var, new oc((FrameLayout) this.containerView, b6Var), this.currentAccount, j10);
        this.I = q0Var;
        q0Var.h = new a0(this, o2Var);
        this.e = j10;
        this.f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        of.m0 m0Var = new of.m0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        m0Var.f = this.f;
        m0Var.h = false;
        ArrayList arrayList2 = m10Var.B;
        arrayList2.add(m0Var);
        m10Var.E = arrayList2.size() - 1;
        m10Var.f();
        setBackgroundColor(f6.v0(i12, this.resourcesProvider));
        this.w = new i0(this, context);
        this.v = new e0(this, context);
        this.x = new d0(this, context);
        this.d.setAdapter(new b0(this));
        m10Var.setCloseButtonOnClickListener(new u(this, i11));
        m10Var2.setCloseButtonOnClickListener(new u(this, i9));
        q0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        gc.a((FrameLayout) this.containerView, new c0());
        ViewGroup viewGroup = this.containerView;
        t tVar = new t(this, i9);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(viewGroup, tVar);
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

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
