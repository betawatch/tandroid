package hi;

import ai.jc;
import ai.v3;
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
import ei.u8;
import gi.g4;
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
import org.telegram.messenger.v0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.i10;
import org.telegram.ui.sn;
import org.telegram.ui.ye1;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class k0 extends h3 implements NotificationCenter.NotificationCenterDelegate, ne.d, m2 {
    public static final /* synthetic */ int V = 0;
    public final k20 E;
    public final i10 F;
    public final j71 G;
    public final jc H;
    public final jc I;
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
    public final o2 s;
    public final f0 v;
    public final j0 w;
    public final e0 x;
    public final k20 y;

    public k0(o2 o2Var, long j10) {
        this(o2Var, j10, null, null);
    }

    public static void B(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f)) {
            k0Var.dismiss();
            return;
        }
        ei.d dVar = k0Var.n;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new s(k0Var, 2));
    }

    public static void C(k0 k0Var, m61 m61Var, View view) {
        long j10;
        TLRPC.Chat chat;
        o2 o2Var = k0Var.s;
        if (k0Var.d0(m61Var)) {
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
                k0Var.v.d.Z2.N(false);
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
        int b10 = t0.b(k0Var.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            if (b10 == 3) {
                b90 b90Var = new b90(k0Var.getContext(), chat2, null, k0Var.s, k0Var.resourcesProvider);
                b90Var.r = new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                b90Var.show();
                return;
            } else {
                if (b10 == 4) {
                    v0.p(z10 ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.e_hand_2, 36);
                    return;
                }
                return;
            }
        }
        if (o2Var instanceof sn) {
            sn snVar = (sn) o2Var;
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
            o2Var.presentFragment(new sn(bundle));
        } else if (ChatObject.areTabsEnabled(chat2)) {
            sn snVar2 = new sn(bundle);
            og.d.a(snVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.id)));
            o2Var.presentFragment(snVar2);
        } else {
            o2Var.presentFragment(new ye1(bundle));
        }
        k0Var.dismiss();
    }

    public static void D(k0 k0Var, ArrayList arrayList) {
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
        s0 s0Var = k0Var.M;
        boolean z11 = true;
        if (s0Var.n && s0Var.l == 1 && (arrayList2 = s0Var.j) != null && arrayList2.size() == 1) {
            arrayList.add(m61.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            s0Var.c(arrayList);
            arrayList.add(m61.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = s0Var.l;
            if (i11 > 0) {
                int i12 = s0Var.p;
                int i13 = R.drawable.filled_requests_24;
                String string2 = i11 == i12 ? LocaleController.getString(R.string.CommunityPendingRequests) : LocaleController.formatPluralString("CommunityPendingRequestsRow", i11, new Object[0]);
                String num = i12 > 0 ? Integer.toString(i12) : null;
                int i14 = ii.i.a;
                m61 J = m61.J(ii.i.class);
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
                arrayList.add(p0.a(communityPeerDialog, k0Var));
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
                arrayList.add(p0.a(communityPeerDialog2, k0Var));
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
                arrayList.add(p0.a(communityPeerDialog3, k0Var));
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
            arrayList.add(p0.a(communityPeerDialog4, k0Var));
        }
    }

    public static void m(k0 k0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            t0.f(new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
            k0Var.d.D(0);
        } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
            b1.s((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else {
            t0.f(new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
            k0Var.d.D(0);
        }
    }

    public static void n(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.n.setLoading(false);
        if (tL_error != null) {
            b1.s((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        if (arrayList != null) {
            k0Var.Q = arrayList;
            if (!arrayList.isEmpty()) {
                k0Var.x.d.Z2.N(false);
                k0Var.d.D(2);
            } else {
                v0.p(R.string.CommunityNoChatsToAdd, new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
            }
        }
    }

    public static void p(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            b1.s((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static /* synthetic */ void q(k0 k0Var, c2 c2Var, long j10, boolean z10, long j11) {
        c2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        k0Var.f0(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void r(k0 k0Var, boolean z10, boolean z11, long j10) {
        c2 P = f5.P(k0Var.getContext(), k0Var.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(z10 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : z11 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), new v3(k0Var, j10, 11));
        P.show();
        TextView textView = (TextView) P.d(-1);
        if (textView != null) {
            r6.W(textView, k6.q7, null);
        }
    }

    @Override // org.telegram.ui.Cells.m2
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h3
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

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m2
    public final void d(q2 q2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (q2Var.getMessage() == null || (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-q2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, q2Var.getMessage().messageOwner, true))) == null) {
            return;
        }
        og.d.m(this.s, -q2Var.getDialogId(), findTopic, 0);
    }

    public final boolean d0(m61 m61Var) {
        Object obj = m61Var.G;
        if (!(obj instanceof ii.f)) {
            return false;
        }
        ii.f fVar = (ii.f) obj;
        long j10 = fVar.a;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        o2 o2Var = this.s;
        if (user != null) {
            o2Var.presentFragment(sn.W9(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            o2Var.presentFragment(sn.W9(-chat.id));
            return true;
        }
        new ji.b(getContext(), chat, new t(0, this, fVar)).show();
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.e;
        f0 f0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).id == j10) {
                f0Var.d.Z2.N(true);
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

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    @Override // org.telegram.ui.Cells.m2
    public final void e(q2 q2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(q2Var.getDialogId())) {
            o2 o2Var = this.s;
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), q2Var.getDialogId(), q7.a((mm0) q2Var.getParent()));
        }
    }

    public final void e0(ArrayList arrayList, boolean z10) {
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

    public final void f0(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (ChatObject.isChannel(chat)) {
            MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new ka(1, this, isChannelAndNotMegaGroup));
            return;
        }
        c2 c2Var = new c2(getContext(), 3, null);
        c2Var.r(250L);
        MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, c2Var, j10, z10, 1));
    }

    public final void g0(m61 m61Var) {
        Object obj = m61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.N) {
                new ji.a(getContext(), this.f, -chat.id, new ai.o2(21, this, chat)).show();
            } else {
                this.O.run(chat);
                dismiss();
            }
        }
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
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
            i10 i10Var = this.F;
            i10Var.setAlpha(f7);
            i10Var.setVisibility(f7 > 0.0f ? 0 : 8);
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
            j71 j71Var = this.G;
            j71Var.setAlpha(f7);
            j71Var.setVisibility(f7 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.d.getCurrentPosition() == 2) {
            ne.b bVar = this.c;
            if (bVar.f) {
                this.x.d.Y2.h1(1, this.U.b);
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

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        Paint paint = this.P;
        try {
            super.onThemeColorsChanged();
            int w02 = k6.w0(k6.a7, this.resourcesProvider);
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
    public k0(o2 o2Var, long j10, ArrayList arrayList, g4 g4Var) {
        super(o2Var.getContext(), o2Var.getResourceProvider(), true, true);
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
        this.s = o2Var;
        int i12 = 0;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = g4Var;
        Context context = o2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i13 = k6.a7;
        paint.setColor(k6.w0(i13, this.resourcesProvider));
        fixNavigationBarKey(i13);
        this.containerView = new u8(this, context);
        h1 h1Var = new h1(this, context, i11);
        this.d = h1Var;
        int i14 = this.backgroundPaddingLeft;
        h1Var.setPadding(i14, 0, i14, 0);
        this.containerView.addView(this.d, z5.e(-1, -1, 119));
        int i15 = 5;
        this.H = new jc(this, context, i15);
        this.I = new jc(this, context, i15);
        k20 k20Var = new k20(context, this.resourcesProvider);
        this.y = k20Var;
        k20Var.setCloseButtonVisible(true);
        k20Var.x = true;
        k20Var.updateColors();
        String string = LocaleController.getString(R.string.Search);
        e2 e2Var = k20Var.r;
        e2Var.setHint(string);
        e2Var.addTextChangedListener(new w(this));
        k20Var.setVisibility(8);
        k20 k20Var2 = new k20(context, this.resourcesProvider);
        this.E = k20Var2;
        k20Var2.setCloseButtonVisible(true);
        k20Var2.x = true;
        k20Var2.updateColors();
        String string2 = LocaleController.getString(R.string.Search);
        e2 e2Var2 = k20Var2.r;
        e2Var2.setHint(string2);
        e2Var2.addTextChangedListener(new x(this));
        k20Var2.setVisibility(8);
        j71 j71Var = new j71(context, this.currentAccount, 0, false, new s(this, i12), new u(this, i12), null, this.resourcesProvider);
        this.G = j71Var;
        j71Var.j(new y(this));
        j71Var.setClipToPadding(false);
        j71Var.setVisibility(8);
        j71Var.t1();
        j71Var.Z2.r = false;
        j71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        i10 i10Var = new i10(o2Var);
        this.F = i10Var;
        i10Var.setVisibility(8);
        i10Var.setBackground(null);
        i10Var.setChatPreviewDelegate(new z());
        i10Var.setUiCallback(new a0(this));
        i10Var.b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        g6 g6Var = this.resourcesProvider;
        s0 s0Var = new s0(context2, g6Var, new xc((FrameLayout) this.containerView, g6Var), this.currentAccount, j10);
        this.M = s0Var;
        s0Var.h = new b0(this, o2Var);
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
        k20Var.e();
        setBackgroundColor(k6.w0(i13, this.resourcesProvider));
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

    @Override // org.telegram.ui.Cells.m2
    public final void a(q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void f(q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void c() {
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
