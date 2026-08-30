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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ph0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public int S;
    public boolean T;
    public int U;
    public Drawable V;
    public Drawable W;
    public Drawable X;
    public boolean Y;
    public boolean Z;
    public oh0 a;
    public boolean a0;
    public org.telegram.ui.Components.sl0 b;
    public boolean b0;
    public TLRPC.Chat c;
    public final int c0;
    public TLRPC.ChatFull d;
    public boolean d0;
    public TLRPC.TL_chatInviteExported e;
    public org.telegram.ui.Components.zk0 e0;
    public final long f;
    public final ArrayList f0;
    public final ArrayList g0;
    public final boolean h;
    public final HashMap h0;
    public org.telegram.ui.Components.s60 i0;
    public final ArrayList j0;
    public long k0;
    public boolean l0;
    public final boolean m0;
    public final long n;
    public final eh0 n0;
    public boolean o0;
    public final fh0 p0;
    public final AnimationNotificationsLocker q0;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public ph0(long j10, long j11, int i10) {
        super(null);
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.h0 = new HashMap();
        this.j0 = new ArrayList();
        this.n0 = new eh0(this);
        boolean z4 = false;
        this.o0 = false;
        this.p0 = new fh0(this);
        this.q0 = new AnimationNotificationsLocker();
        this.n = j10;
        this.c0 = i10;
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
            z4 = true;
        }
        this.m0 = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0147, code lost:
    
        if ((r9.j0.size() + (r2.size() + r3.size())) >= 5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void U(ph0 ph0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4) {
        boolean z10;
        boolean z11;
        long j10 = ph0Var.f;
        ArrayList arrayList = ph0Var.g0;
        ArrayList arrayList2 = ph0Var.f0;
        gh0 f02 = ph0Var.f0();
        ph0Var.T = false;
        ph0Var.Y = false;
        if (tL_chatInviteExported != null) {
            ph0Var.e = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = ph0Var.d;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z4) {
                for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10);
                    ph0Var.c0(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j10 != ph0Var.getAccountInstance().getUserConfig().clientUserId && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    ph0Var.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11);
                    ph0Var.c0(tL_chatInviteExported3);
                    arrayList2.add(tL_chatInviteExported3);
                }
            }
            for (int i12 = 0; i12 < tL_messages_exportedChatInvites.users.size(); i12++) {
                ph0Var.h0.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i12).id), tL_messages_exportedChatInvites.users.get(i12));
            }
            int i13 = ph0Var.U;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                ph0Var.Y = false;
            } else if (z4) {
                ph0Var.Y = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                ph0Var.Y = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !ph0Var.d0) {
                z10 = true;
            } else {
                org.telegram.ui.Components.zk0 zk0Var = ph0Var.e0;
                if (zk0Var != null && !ph0Var.isPaused) {
                    zk0Var.b(i13 + 1);
                }
                z10 = false;
            }
            TLRPC.ChatFull chatFull2 = ph0Var.d;
            if (chatFull2 != null && !z4) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                ph0Var.getMessagesStorage().saveChatLinksCount(ph0Var.n, ph0Var.d.invitesCount);
            }
        } else {
            ph0Var.Y = false;
            z10 = false;
        }
        if (ph0Var.Y || ph0Var.o0 || j10 != ph0Var.getAccountInstance().getUserConfig().clientUserId) {
            if (ph0Var.Y || ph0Var.o0) {
                z11 = false;
                if (ph0Var.Y) {
                }
                ph0Var.resumeDelayedFragmentAnimation();
                if (z11) {
                    ph0Var.d0(false);
                }
                if (!z10 && ph0Var.a != null && ph0Var.b.getChildCount() > 0) {
                    ph0Var.h0(f02);
                    return;
                }
                ph0Var.i0(true);
            }
            ph0Var.Y = true;
            ph0Var.o0 = true;
        } else {
            ph0Var.Y = true;
            ph0Var.a0 = true;
        }
        z11 = true;
        if (ph0Var.Y) {
        }
        ph0Var.resumeDelayedFragmentAnimation();
        if (z11) {
        }
        if (!z10) {
        }
        ph0Var.i0(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if ((r0.size() + (r8.g0.size() + r8.f0.size())) >= 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void V(ph0 ph0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.Components.zk0 zk0Var;
        ArrayList arrayList = ph0Var.j0;
        ph0Var.T = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i10 = 0; i10 < tL_messages_chatAdminsWithInvites.admins.size(); i10++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i10);
                if (tL_chatAdminWithInvites.admin_id != ph0Var.getAccountInstance().getUserConfig().clientUserId) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i11 = 0; i11 < tL_messages_chatAdminsWithInvites.users.size(); i11++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i11);
                ph0Var.h0.put(Long.valueOf(user.id), user);
            }
        }
        int i12 = ph0Var.U;
        ph0Var.b0 = true;
        ph0Var.Y = false;
        if (arrayList.size() > 0 && (zk0Var = ph0Var.e0) != null && !ph0Var.isPaused && ph0Var.d0) {
            zk0Var.b(i12 + 1);
        }
        if (ph0Var.Y) {
        }
        ph0Var.resumeDelayedFragmentAnimation();
        if (!ph0Var.Y && !ph0Var.o0) {
            ph0Var.Y = true;
            ph0Var.o0 = true;
            ph0Var.d0(false);
        }
        ph0Var.i0(true);
    }

    public static void W(ph0 ph0Var) {
        if (ph0Var.f != ph0Var.getAccountInstance().getUserConfig().clientUserId) {
            ph0Var.e0(ph0Var.e);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = ph0Var.getMessagesController().getInputPeer(-ph0Var.n);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = ph0Var.e;
        ph0Var.e = null;
        ph0Var.d.exported_invite = null;
        int sendRequest = ph0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new zg0(ph0Var, tL_chatInviteExported, 0));
        AndroidUtilities.updateVisibleRows(ph0Var.b);
        ph0Var.getConnectionsManager().bindRequestToGuid(sendRequest, ph0Var.classGuid);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new zg0(this, tL_chatInviteExported, 1));
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

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 24));
        l0 l0Var = new l0(this, context, 14);
        this.fragmentView = l0Var;
        int i10 = org.telegram.ui.ActionBar.j6.a7;
        l0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.fragmentView.setTag(Integer.valueOf(i10));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.b = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        k kVar = new k(1, false, 10);
        this.b.setLayoutManager(kVar);
        org.telegram.ui.Components.sl0 sl0Var2 = this.b;
        oh0 oh0Var = new oh0(this, context);
        this.a = oh0Var;
        sl0Var2.setAdapter(oh0Var);
        this.b.setOnScrollListener(new jh.l(7, this, kVar));
        this.e0 = new org.telegram.ui.Components.zk0(this.b, false);
        f2.l lVar = new f2.l();
        lVar.n(420L);
        lVar.o(org.telegram.ui.Components.nr.h);
        lVar.C = false;
        lVar.m = false;
        this.b.setItemAnimator(lVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.b, k7.b6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new gg.v0(20, this, context));
        this.b.setOnItemLongClickListener(new bh0(this));
        this.V = context.getDrawable(R.drawable.msg_link_1);
        this.W = context.getDrawable(R.drawable.msg_link_2);
        this.X = context.getDrawable(R.drawable.large_income);
        this.V.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.k0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z4) {
        boolean z10 = this.a0;
        long j10 = this.n;
        if (!z10 || this.b0) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z11 = this.o0;
            if (z11) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.g0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) kh.a2.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) kh.a2.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) kh.a2.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) kh.a2.i(1, arrayList2)).date;
                }
            }
            this.T = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new lh.k7(this, this.l0 ? null : this.e, z11, 5)), getClassGuid());
        } else {
            this.T = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new yg0(this, 0)), getClassGuid());
        }
        if (z4) {
            i0(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.n)) {
            org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
            if (e5Var == null || e5Var.getLastFragment() != this) {
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
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new zg0(this, tL_chatInviteExported, 2));
    }

    public final gh0 f0() {
        gh0 gh0Var = new gh0(this);
        gh0Var.f(gh0Var.i);
        gh0Var.c = this.y;
        gh0Var.d = this.B;
        gh0Var.e = this.E;
        gh0Var.f = this.F;
        gh0Var.g = this.R;
        gh0Var.h = this.S;
        gh0Var.b = this.U;
        gh0Var.k.clear();
        gh0Var.k.addAll(this.f0);
        gh0Var.l.clear();
        gh0Var.l.addAll(this.g0);
        return gh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.l0 = ChatObject.isPublic(this.c);
        d0(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 24);
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.f2.class, org.telegram.ui.Components.x80.class, mh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{ih0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{mh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{mh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 8, new Class[]{mh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Uh));
        return arrayList;
    }

    public final void h0(gh0 gh0Var) {
        if (this.isPaused || this.a == null || this.b == null) {
            i0(true);
            return;
        }
        i0(false);
        gh0Var.f(gh0Var.j);
        f2.q.c(gh0Var, true).b(this.a);
        AndroidUtilities.updateVisibleRows(this.b);
    }

    public final void i0(boolean z4) {
        oh0 oh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.n));
        this.c = chat;
        if (chat == null) {
            return;
        }
        this.N = -1;
        this.O = -1;
        this.y = -1;
        this.B = -1;
        this.C = -1;
        this.E = -1;
        this.F = -1;
        this.I = -1;
        this.G = -1;
        this.H = -1;
        this.K = -1;
        this.J = -1;
        this.L = -1;
        this.r = -1;
        this.x = -1;
        this.S = -1;
        this.R = -1;
        this.Q = -1;
        this.P = -1;
        this.M = -1;
        this.w = -1;
        this.D = -1;
        this.U = 0;
        boolean z10 = this.f != getAccountInstance().getUserConfig().clientUserId;
        if (z10) {
            int i10 = this.U;
            this.N = i10;
            this.U = i10 + 2;
            this.O = i10 + 1;
        } else {
            int i11 = this.U;
            this.U = i11 + 1;
            this.r = i11;
        }
        int i12 = this.U;
        this.s = i12;
        int i13 = i12 + 2;
        this.U = i13;
        this.v = i12 + 1;
        ArrayList arrayList = this.f0;
        if (!z10) {
            this.w = i13;
            this.U = i12 + 4;
            this.x = i12 + 3;
        } else if (!arrayList.isEmpty()) {
            int i14 = this.U;
            this.w = i14;
            this.U = i14 + 2;
            this.M = i14 + 1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.U;
            this.y = i15;
            int size = arrayList.size() + i15;
            this.U = size;
            this.B = size;
        }
        if (!z10 && arrayList.isEmpty() && this.x >= 0 && (!this.T || this.a0 || this.o0)) {
            int i16 = this.U;
            this.U = i16 + 1;
            this.L = i16;
        }
        if (!z10) {
            ArrayList arrayList2 = this.j0;
            if (arrayList2.size() > 0) {
                if ((!arrayList.isEmpty() || this.x >= 0) && this.L == -1) {
                    int i17 = this.U;
                    this.U = i17 + 1;
                    this.Q = i17;
                }
                int i18 = this.U;
                int i19 = i18 + 1;
                this.U = i19;
                this.P = i18;
                this.R = i19;
                int size2 = arrayList2.size() + i19;
                this.U = size2;
                this.S = size2;
            }
        }
        ArrayList arrayList3 = this.g0;
        if (!arrayList3.isEmpty()) {
            if (this.R >= 0) {
                int i20 = this.U;
                this.U = i20 + 1;
                this.G = i20;
            } else if ((!arrayList.isEmpty() || this.x >= 0) && this.L == -1) {
                int i21 = this.U;
                this.U = i21 + 1;
                this.G = i21;
            } else if (z10 && this.y == -1) {
                int i22 = this.U;
                this.U = i22 + 1;
                this.G = i22;
            }
            int i23 = this.U;
            int i24 = i23 + 1;
            this.U = i24;
            this.I = i23;
            this.E = i24;
            int size3 = arrayList3.size() + i24;
            this.F = size3;
            this.J = size3;
            this.U = size3 + 2;
            this.K = size3 + 1;
        }
        if (!this.a0 && !this.o0 && ((this.T || this.Y) && !z10)) {
            int i25 = this.U;
            this.U = i25 + 1;
            this.C = i25;
        }
        if (!arrayList.isEmpty()) {
            int i26 = this.B;
            int i27 = this.U;
            if (i26 == i27) {
                this.U = i27 + 1;
                this.D = i27;
                oh0Var = this.a;
                if (oh0Var == null && z4) {
                    oh0Var.l();
                    return;
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
            int i28 = this.U;
            this.U = i28 + 1;
            this.H = i28;
        }
        oh0Var = this.a;
        if (oh0Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        oh0 oh0Var = this.a;
        if (oh0Var != null) {
            oh0Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        org.telegram.ui.Components.s60 s60Var;
        super.onTransitionAnimationEnd(z4, z10);
        if (z4) {
            this.d0 = true;
            if (z10 && (s60Var = this.i0) != null && s60Var.i0) {
                s60Var.show();
            }
        }
        this.q0.unlock();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        this.q0.lock();
    }
}
