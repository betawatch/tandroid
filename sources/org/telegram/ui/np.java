package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class np extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public kp a;
    public org.telegram.ui.Components.mm0 b;
    public org.telegram.ui.ActionBar.y5 c;
    public org.telegram.ui.Components.uz d;
    public mp e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public org.telegram.ui.ActionBar.e2 r;
    public boolean s;
    public ArrayList v;
    public boolean w;
    public boolean x;
    public jp y;

    public static /* synthetic */ void V(np npVar, org.telegram.ui.ActionBar.e2[] e2VarArr) {
        try {
            e2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        e2VarArr[0] = null;
        npVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(npVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, npVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new bp(npVar, 2), 1000L);
        if (npVar.s) {
            return;
        }
        npVar.finishFragment();
    }

    public static /* synthetic */ void X(np npVar, org.telegram.ui.ActionBar.e2[] e2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.r2 r2Var) {
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        if (e2Var != null) {
            try {
                e2Var.dismiss();
            } catch (Throwable unused) {
            }
            e2VarArr[0] = null;
        }
        npVar.h.linked_chat_id = chat.id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(npVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, npVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new bp(npVar, 1), 1000L);
        if (r2Var == null) {
            npVar.finishFragment();
        } else {
            npVar.removeSelfFromStack();
            r2Var.finishFragment();
        }
    }

    public final void Z(TLRPC.Chat chat, org.telegram.ui.ActionBar.r2 r2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.id, this, new m4.s0(24, this, r2Var));
            return;
        }
        org.telegram.ui.ActionBar.e2[] e2VarArr = {r2Var == null ? new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new cp(this, e2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.i2(this, e2VarArr, chat, r2Var, 10), 64), 1), 500L);
    }

    public final void a0() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.y5 y5Var = this.c;
            if (y5Var != null) {
                y5Var.setVisibility(8);
            }
        }
        if (!this.w && this.s && this.h.linked_chat_id == 0) {
            this.w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new l(this, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    public final void b0(TLRPC.Chat chat, boolean z10) {
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.id);
        int i10 = 0;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.id, 0, true);
                this.n = chat;
                this.r = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new bp(this, i10), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        String formatString = !ChatObject.isPublic(chat) ? LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f.title) : !ChatObject.isPublic(this.f) ? LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f.title) : LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f.title);
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.t.h(R.string.DiscussionLinkGroupAlertHistory, org.telegram.ui.Components.b10.l(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.h(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.t.r(textView2, org.telegram.ui.ActionBar.y6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(textView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        j9Var.k(this.currentAccount, chat);
        y9Var.f(chat, j9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new e7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void c0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.s;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.E));
        this.f = chat;
        if (chat == null) {
            return;
        }
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = 1;
        if (z10) {
            if (this.h.linked_chat_id == 0) {
                this.M = 2;
                this.F = 1;
            }
            int i10 = this.M;
            this.G = i10;
            int size = this.v.size() + i10;
            this.M = size;
            this.H = size;
            if (this.h.linked_chat_id != 0) {
                this.M = size + 1;
                this.F = size;
            }
        } else {
            this.G = 1;
            int size2 = this.v.size();
            int i11 = 1 + size2;
            this.H = i11;
            this.M = size2 + 2;
            this.F = i11;
        }
        int i12 = this.M;
        this.M = i12 + 1;
        this.J = i12;
        if (!z10 || (this.v.size() > 0 && this.h.linked_chat_id != 0)) {
            TLRPC.Chat chat2 = z10 ? (TLRPC.Chat) this.v.get(0) : this.f;
            if (chat2 != null && ((!ChatObject.isPublic(chat2) || z10) && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                int i13 = this.M;
                this.M = i13 + 1;
                this.K = i13;
            }
        }
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.l();
        }
        org.telegram.ui.ActionBar.y5 y5Var = this.c;
        if (y5Var != null) {
            y5Var.setVisibility(this.v.size() <= 10 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.N = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 5));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.z0 = new jg.e2(this, 2);
        this.c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new mp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.d = uzVar;
        uzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.b = mm0Var;
        mm0Var.u1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new s4.c0(1, false));
        org.telegram.ui.Components.mm0 mm0Var2 = this.b;
        kp kpVar = new kp(this, context);
        this.a = kpVar;
        mm0Var2.setAdapter(kpVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.b.setOnItemClickListener(new h(this, 4));
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        try {
            if (this.b == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.n6, false);
            if (this.Q && x02 == this.R && x03 == this.S) {
                return;
            }
            this.Q = true;
            this.R = x02;
            this.S = x03;
            int i10 = 0;
            while (i10 < 4) {
                int childCount = i10 == 0 ? this.b.getChildCount() : i10 == 1 ? this.b.getHiddenChildCount() : i10 == 2 ? this.b.getCachedChildCount() : this.b.getAttachedScrapChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = i10 == 0 ? this.b.getChildAt(i11) : i10 == 1 ? this.b.V(i11) : i10 == 2 ? this.b.P(i11) : this.b.O(i11);
                    if (childAt instanceof org.telegram.ui.Cells.f5) {
                        org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) childAt;
                        f5Var.O = true;
                        f5Var.H = x02;
                        f5Var.I = x03;
                        if (i10 != 0) {
                            ((org.telegram.ui.Cells.f5) childAt).d(0);
                        }
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jp jpVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.id;
            if (j10 == this.E) {
                this.h = chatFull;
                a0();
                c0();
                return;
            }
            TLRPC.Chat chat3 = this.n;
            if (chat3 == null || chat3.id != j10) {
                return;
            }
            try {
                this.r.dismiss();
            } catch (Throwable unused) {
            }
            this.r = null;
            b0(this.n, false);
            this.n = null;
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.dialogDeleted) {
                if ((-this.E) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
                    if (j5Var == null || j5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
            return;
        }
        if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 || this.f == null) {
            return;
        }
        TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f.id));
        if (chat4 != null) {
            this.f = chat4;
        }
        if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).id))) != null) {
            this.v.set(0, chat);
        }
        if (!this.s) {
            chat2 = this.f;
        } else if (this.v.size() > 0) {
            chat2 = (TLRPC.Chat) this.v.get(0);
        }
        if (chat2 == null || (jpVar = this.y) == null) {
            return;
        }
        if (!this.P) {
            jpVar.setJoinRequest(chat2.join_request);
        }
        if (this.O) {
            return;
        }
        this.y.setJoinToSend(chat2.join_to_send);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        a0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
