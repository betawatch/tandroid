package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kh0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public int T;
    public Drawable U;
    public Drawable V;
    public Drawable W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public jh0 a;
    public boolean a0;
    public org.telegram.ui.Components.zk0 b;
    public final int b0;
    public TLRPC.Chat c;
    public boolean c0;
    public TLRPC.ChatFull d;
    public org.telegram.ui.Components.gk0 d0;
    public TLRPC.TL_chatInviteExported e;
    public final ArrayList e0;
    public final long f;
    public final ArrayList f0;
    public final HashMap g0;
    public final boolean h;
    public org.telegram.ui.Components.f60 h0;
    public final ArrayList i0;
    public long j0;
    public boolean k0;
    public final boolean l0;
    public final zg0 m0;
    public final long n;
    public boolean n0;
    public final ah0 o0;
    public final AnimationNotificationsLocker p0;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public kh0(long j10, long j11, int i10) {
        super(null);
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.g0 = new HashMap();
        this.i0 = new ArrayList();
        this.m0 = new zg0(this);
        boolean z10 = false;
        this.n0 = false;
        this.o0 = new ah0(this);
        this.p0 = new AnimationNotificationsLocker();
        this.n = j10;
        this.b0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        this.c = chat;
        this.h = ChatObject.isChannel(chat) && !this.c.megagroup;
        if (j11 == 0) {
            this.f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f = j11;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f));
        if (this.f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z10 = true;
        }
        this.l0 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0147, code lost:
    
        if ((r9.i0.size() + (r2.size() + r3.size())) >= 5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void U(kh0 kh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        boolean z11;
        boolean z12;
        long j10 = kh0Var.f;
        ArrayList arrayList = kh0Var.f0;
        ArrayList arrayList2 = kh0Var.e0;
        bh0 f02 = kh0Var.f0();
        kh0Var.S = false;
        kh0Var.X = false;
        if (tL_chatInviteExported != null) {
            kh0Var.e = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = kh0Var.d;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z10) {
                for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10);
                    kh0Var.c0(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j10 != kh0Var.getAccountInstance().getUserConfig().clientUserId && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    kh0Var.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11);
                    kh0Var.c0(tL_chatInviteExported3);
                    arrayList2.add(tL_chatInviteExported3);
                }
            }
            for (int i12 = 0; i12 < tL_messages_exportedChatInvites.users.size(); i12++) {
                kh0Var.g0.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i12).id), tL_messages_exportedChatInvites.users.get(i12));
            }
            int i13 = kh0Var.T;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                kh0Var.X = false;
            } else if (z10) {
                kh0Var.X = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                kh0Var.X = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !kh0Var.c0) {
                z11 = true;
            } else {
                org.telegram.ui.Components.gk0 gk0Var = kh0Var.d0;
                if (gk0Var != null && !kh0Var.isPaused) {
                    gk0Var.b(i13 + 1);
                }
                z11 = false;
            }
            TLRPC.ChatFull chatFull2 = kh0Var.d;
            if (chatFull2 != null && !z10) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                kh0Var.getMessagesStorage().saveChatLinksCount(kh0Var.n, kh0Var.d.invitesCount);
            }
        } else {
            kh0Var.X = false;
            z11 = false;
        }
        if (kh0Var.X || kh0Var.n0 || j10 != kh0Var.getAccountInstance().getUserConfig().clientUserId) {
            if (kh0Var.X || kh0Var.n0) {
                z12 = false;
                if (kh0Var.X) {
                }
                kh0Var.resumeDelayedFragmentAnimation();
                if (z12) {
                    kh0Var.d0(false);
                }
                if (!z11 && kh0Var.a != null && kh0Var.b.getChildCount() > 0) {
                    kh0Var.h0(f02);
                    return;
                }
                kh0Var.i0(true);
            }
            kh0Var.X = true;
            kh0Var.n0 = true;
        } else {
            kh0Var.X = true;
            kh0Var.Z = true;
        }
        z12 = true;
        if (kh0Var.X) {
        }
        kh0Var.resumeDelayedFragmentAnimation();
        if (z12) {
        }
        if (!z11) {
        }
        kh0Var.i0(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if ((r0.size() + (r8.f0.size() + r8.e0.size())) >= 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void V(kh0 kh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.Components.gk0 gk0Var;
        ArrayList arrayList = kh0Var.i0;
        kh0Var.S = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i10 = 0; i10 < tL_messages_chatAdminsWithInvites.admins.size(); i10++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i10);
                if (tL_chatAdminWithInvites.admin_id != kh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i11 = 0; i11 < tL_messages_chatAdminsWithInvites.users.size(); i11++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i11);
                kh0Var.g0.put(Long.valueOf(user.id), user);
            }
        }
        int i12 = kh0Var.T;
        kh0Var.a0 = true;
        kh0Var.X = false;
        if (arrayList.size() > 0 && (gk0Var = kh0Var.d0) != null && !kh0Var.isPaused && kh0Var.c0) {
            gk0Var.b(i12 + 1);
        }
        if (kh0Var.X) {
        }
        kh0Var.resumeDelayedFragmentAnimation();
        if (!kh0Var.X && !kh0Var.n0) {
            kh0Var.X = true;
            kh0Var.n0 = true;
            kh0Var.d0(false);
        }
        kh0Var.i0(true);
    }

    public static void W(kh0 kh0Var) {
        if (kh0Var.f != kh0Var.getAccountInstance().getUserConfig().clientUserId) {
            kh0Var.e0(kh0Var.e);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = kh0Var.getMessagesController().getInputPeer(-kh0Var.n);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = kh0Var.e;
        kh0Var.e = null;
        kh0Var.d.exported_invite = null;
        int sendRequest = kh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ug0(kh0Var, tL_chatInviteExported, 0));
        AndroidUtilities.updateVisibleRows(kh0Var.b);
        kh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, kh0Var.classGuid);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ug0(this, tL_chatInviteExported, 1));
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_chatInviteExported.expire_date > 0) {
            tL_chatInviteExported.expired = getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date;
            return;
        }
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            tL_chatInviteExported.expired = tL_chatInviteExported.usage >= i10;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 3));
        n0 n0Var = new n0(this, context, 14);
        this.fragmentView = n0Var;
        int i10 = org.telegram.ui.ActionBar.g6.a7;
        n0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.fragmentView.setTag(Integer.valueOf(i10));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.b = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        j jVar = new j(1, false, 10);
        this.b.setLayoutManager(jVar);
        org.telegram.ui.Components.zk0 zk0Var2 = this.b;
        jh0 jh0Var = new jh0(this, context);
        this.a = jh0Var;
        zk0Var2.setAdapter(jh0Var);
        this.b.setOnScrollListener(new fh.l(7, this, jVar));
        this.d0 = new org.telegram.ui.Components.gk0(this.b, false);
        f2.l lVar = new f2.l();
        lVar.n(420L);
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.C = false;
        lVar.m = false;
        this.b.setItemAnimator(lVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.b, h7.z5.c(-1.0f, -1));
        this.b.setOnItemClickListener(new cg.x0(21, this, context));
        this.b.setOnItemLongClickListener(new wg0(this));
        this.U = context.getDrawable(R.drawable.msg_link_1);
        this.V = context.getDrawable(R.drawable.msg_link_2);
        this.W = context.getDrawable(R.drawable.large_income);
        this.U.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.j0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        boolean z11 = this.Z;
        long j10 = this.n;
        if (!z11 || this.a0) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.n0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.e0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i0.a.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i0.a.i(1, arrayList2)).date;
                }
            }
            this.S = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new hh.l7(this, this.k0 ? null : this.e, z12, 6)), getClassGuid());
        } else {
            this.S = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new tg0(this, 0)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.n)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ug0(this, tL_chatInviteExported, 2));
    }

    public final bh0 f0() {
        bh0 bh0Var = new bh0(this);
        bh0Var.f(bh0Var.i);
        bh0Var.c = this.y;
        bh0Var.d = this.A;
        bh0Var.e = this.D;
        bh0Var.f = this.E;
        bh0Var.g = this.Q;
        bh0Var.h = this.R;
        bh0Var.b = this.T;
        bh0Var.k.clear();
        bh0Var.k.addAll(this.e0);
        bh0Var.l.clear();
        bh0Var.l.addAll(this.f0);
        return bh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.k0 = ChatObject.isPublic(this.c);
        d0(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.e2.class, org.telegram.ui.Components.i80.class, hh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.y4.class}, null, org.telegram.ui.ActionBar.g6.r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{dh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 32, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.e2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{hh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{hh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 8, new Class[]{hh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Uh));
        return arrayList;
    }

    public final void h0(bh0 bh0Var) {
        if (this.isPaused || this.a == null || this.b == null) {
            i0(true);
            return;
        }
        i0(false);
        bh0Var.f(bh0Var.j);
        f2.q.c(bh0Var, true).b(this.a);
        AndroidUtilities.updateVisibleRows(this.b);
    }

    public final void i0(boolean z10) {
        jh0 jh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.n));
        this.c = chat;
        if (chat == null) {
            return;
        }
        this.M = -1;
        this.N = -1;
        this.y = -1;
        this.A = -1;
        this.B = -1;
        this.D = -1;
        this.E = -1;
        this.H = -1;
        this.F = -1;
        this.G = -1;
        this.J = -1;
        this.I = -1;
        this.K = -1;
        this.r = -1;
        this.x = -1;
        this.R = -1;
        this.Q = -1;
        this.P = -1;
        this.O = -1;
        this.L = -1;
        this.w = -1;
        this.C = -1;
        this.T = 0;
        boolean z11 = this.f != getAccountInstance().getUserConfig().clientUserId;
        if (z11) {
            int i10 = this.T;
            this.M = i10;
            this.T = i10 + 2;
            this.N = i10 + 1;
        } else {
            int i11 = this.T;
            this.T = i11 + 1;
            this.r = i11;
        }
        int i12 = this.T;
        this.s = i12;
        int i13 = i12 + 2;
        this.T = i13;
        this.v = i12 + 1;
        ArrayList arrayList = this.e0;
        if (!z11) {
            this.w = i13;
            this.T = i12 + 4;
            this.x = i12 + 3;
        } else if (!arrayList.isEmpty()) {
            int i14 = this.T;
            this.w = i14;
            this.T = i14 + 2;
            this.L = i14 + 1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.T;
            this.y = i15;
            int size = arrayList.size() + i15;
            this.T = size;
            this.A = size;
        }
        if (!z11 && arrayList.isEmpty() && this.x >= 0 && (!this.S || this.Z || this.n0)) {
            int i16 = this.T;
            this.T = i16 + 1;
            this.K = i16;
        }
        if (!z11) {
            ArrayList arrayList2 = this.i0;
            if (arrayList2.size() > 0) {
                if ((!arrayList.isEmpty() || this.x >= 0) && this.K == -1) {
                    int i17 = this.T;
                    this.T = i17 + 1;
                    this.P = i17;
                }
                int i18 = this.T;
                int i19 = i18 + 1;
                this.T = i19;
                this.O = i18;
                this.Q = i19;
                int size2 = arrayList2.size() + i19;
                this.T = size2;
                this.R = size2;
            }
        }
        ArrayList arrayList3 = this.f0;
        if (!arrayList3.isEmpty()) {
            if (this.Q >= 0) {
                int i20 = this.T;
                this.T = i20 + 1;
                this.F = i20;
            } else if ((!arrayList.isEmpty() || this.x >= 0) && this.K == -1) {
                int i21 = this.T;
                this.T = i21 + 1;
                this.F = i21;
            } else if (z11 && this.y == -1) {
                int i22 = this.T;
                this.T = i22 + 1;
                this.F = i22;
            }
            int i23 = this.T;
            int i24 = i23 + 1;
            this.T = i24;
            this.H = i23;
            this.D = i24;
            int size3 = arrayList3.size() + i24;
            this.E = size3;
            this.I = size3;
            this.T = size3 + 2;
            this.J = size3 + 1;
        }
        if (!this.Z && !this.n0 && ((this.S || this.X) && !z11)) {
            int i25 = this.T;
            this.T = i25 + 1;
            this.B = i25;
        }
        if (!arrayList.isEmpty()) {
            int i26 = this.A;
            int i27 = this.T;
            if (i26 == i27) {
                this.T = i27 + 1;
                this.C = i27;
                jh0Var = this.a;
                if (jh0Var == null && z10) {
                    jh0Var.l();
                    return;
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
            int i28 = this.T;
            this.T = i28 + 1;
            this.G = i28;
        }
        jh0Var = this.a;
        if (jh0Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        jh0 jh0Var = this.a;
        if (jh0Var != null) {
            jh0Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.f60 f60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.c0 = true;
            if (z11 && (f60Var = this.h0) != null && f60Var.h0) {
                f60Var.show();
            }
        }
        this.p0.unlock();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.p0.lock();
    }
}
