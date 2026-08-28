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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hh0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public gh0 a;
    public boolean a0;
    public org.telegram.ui.Components.wk0 b;
    public final int b0;
    public TLRPC.Chat c;
    public boolean c0;
    public TLRPC.ChatFull d;
    public org.telegram.ui.Components.dk0 d0;
    public TLRPC.TL_chatInviteExported e;
    public final ArrayList e0;
    public final long f;
    public final ArrayList f0;
    public final HashMap g0;
    public final boolean h;
    public org.telegram.ui.Components.a60 h0;
    public final ArrayList i0;
    public long j0;
    public boolean k0;
    public final boolean l0;
    public final wg0 m0;
    public final long n;
    public boolean n0;
    public final xg0 o0;
    public final AnimationNotificationsLocker p0;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public hh0(long j10, long j11, int i9) {
        super(null);
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.g0 = new HashMap();
        this.i0 = new ArrayList();
        this.m0 = new wg0(this);
        boolean z10 = false;
        this.n0 = false;
        this.o0 = new xg0(this);
        this.p0 = new AnimationNotificationsLocker();
        this.n = j10;
        this.b0 = i9;
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
    public static /* synthetic */ void T(hh0 hh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        boolean z11;
        boolean z12;
        long j10 = hh0Var.f;
        ArrayList arrayList = hh0Var.f0;
        ArrayList arrayList2 = hh0Var.e0;
        yg0 e02 = hh0Var.e0();
        hh0Var.S = false;
        hh0Var.X = false;
        if (tL_chatInviteExported != null) {
            hh0Var.e = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = hh0Var.d;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z10) {
                for (int i9 = 0; i9 < tL_messages_exportedChatInvites.invites.size(); i9++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i9);
                    hh0Var.b0(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j10 != hh0Var.getAccountInstance().getUserConfig().clientUserId && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    hh0Var.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10);
                    hh0Var.b0(tL_chatInviteExported3);
                    arrayList2.add(tL_chatInviteExported3);
                }
            }
            for (int i11 = 0; i11 < tL_messages_exportedChatInvites.users.size(); i11++) {
                hh0Var.g0.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i11).id), tL_messages_exportedChatInvites.users.get(i11));
            }
            int i12 = hh0Var.T;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                hh0Var.X = false;
            } else if (z10) {
                hh0Var.X = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                hh0Var.X = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !hh0Var.c0) {
                z11 = true;
            } else {
                org.telegram.ui.Components.dk0 dk0Var = hh0Var.d0;
                if (dk0Var != null && !hh0Var.isPaused) {
                    dk0Var.b(i12 + 1);
                }
                z11 = false;
            }
            TLRPC.ChatFull chatFull2 = hh0Var.d;
            if (chatFull2 != null && !z10) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                hh0Var.getMessagesStorage().saveChatLinksCount(hh0Var.n, hh0Var.d.invitesCount);
            }
        } else {
            hh0Var.X = false;
            z11 = false;
        }
        if (hh0Var.X || hh0Var.n0 || j10 != hh0Var.getAccountInstance().getUserConfig().clientUserId) {
            if (hh0Var.X || hh0Var.n0) {
                z12 = false;
                if (hh0Var.X) {
                }
                hh0Var.resumeDelayedFragmentAnimation();
                if (z12) {
                    hh0Var.c0(false);
                }
                if (!z11 && hh0Var.a != null && hh0Var.b.getChildCount() > 0) {
                    hh0Var.g0(e02);
                    return;
                }
                hh0Var.h0(true);
            }
            hh0Var.X = true;
            hh0Var.n0 = true;
        } else {
            hh0Var.X = true;
            hh0Var.Z = true;
        }
        z12 = true;
        if (hh0Var.X) {
        }
        hh0Var.resumeDelayedFragmentAnimation();
        if (z12) {
        }
        if (!z11) {
        }
        hh0Var.h0(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if ((r0.size() + (r8.f0.size() + r8.e0.size())) >= 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void U(hh0 hh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.Components.dk0 dk0Var;
        ArrayList arrayList = hh0Var.i0;
        hh0Var.S = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i9 = 0; i9 < tL_messages_chatAdminsWithInvites.admins.size(); i9++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i9);
                if (tL_chatAdminWithInvites.admin_id != hh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i10 = 0; i10 < tL_messages_chatAdminsWithInvites.users.size(); i10++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i10);
                hh0Var.g0.put(Long.valueOf(user.id), user);
            }
        }
        int i11 = hh0Var.T;
        hh0Var.a0 = true;
        hh0Var.X = false;
        if (arrayList.size() > 0 && (dk0Var = hh0Var.d0) != null && !hh0Var.isPaused && hh0Var.c0) {
            dk0Var.b(i11 + 1);
        }
        if (hh0Var.X) {
        }
        hh0Var.resumeDelayedFragmentAnimation();
        if (!hh0Var.X && !hh0Var.n0) {
            hh0Var.X = true;
            hh0Var.n0 = true;
            hh0Var.c0(false);
        }
        hh0Var.h0(true);
    }

    public static void V(hh0 hh0Var) {
        if (hh0Var.f != hh0Var.getAccountInstance().getUserConfig().clientUserId) {
            hh0Var.d0(hh0Var.e);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = hh0Var.getMessagesController().getInputPeer(-hh0Var.n);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var.e;
        hh0Var.e = null;
        hh0Var.d.exported_invite = null;
        int sendRequest = hh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new rg0(hh0Var, tL_chatInviteExported, 0));
        AndroidUtilities.updateVisibleRows(hh0Var.b);
        hh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, hh0Var.classGuid);
    }

    public final void a0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new rg0(this, tL_chatInviteExported, 1));
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_chatInviteExported.expire_date > 0) {
            tL_chatInviteExported.expired = getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date;
            return;
        }
        int i9 = tL_chatInviteExported.usage_limit;
        if (i9 > 0) {
            tL_chatInviteExported.expired = tL_chatInviteExported.usage >= i9;
        }
    }

    public final void c0(boolean z10) {
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
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) j3.r0.j(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) j3.r0.j(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.e0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) j3.r0.j(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) j3.r0.j(1, arrayList2)).date;
                }
            }
            this.S = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new gh.m7(this, this.k0 ? null : this.e, z12, 7)), getClassGuid());
        } else {
            this.S = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new qg0(this, 0)), getClassGuid());
        }
        if (z10) {
            h0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 2));
        m0 m0Var = new m0(this, context, 14);
        this.fragmentView = m0Var;
        int i9 = org.telegram.ui.ActionBar.f6.a7;
        m0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.fragmentView.setTag(Integer.valueOf(i9));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        of.y yVar = new of.y(1, false, 11);
        this.b.setLayoutManager(yVar);
        org.telegram.ui.Components.wk0 wk0Var2 = this.b;
        gh0 gh0Var = new gh0(this, context);
        this.a = gh0Var;
        wk0Var2.setAdapter(gh0Var);
        this.b.setOnScrollListener(new eh.n(7, this, yVar));
        this.d0 = new org.telegram.ui.Components.dk0(this.b, false);
        f2.n nVar = new f2.n();
        nVar.n(420L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.m = false;
        this.b.setItemAnimator(nVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.b, g7.e6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new bg.b1(21, this, context));
        this.b.setOnItemLongClickListener(new tg0(this));
        this.U = context.getDrawable(R.drawable.msg_link_1);
        this.V = context.getDrawable(R.drawable.msg_link_2);
        this.W = context.getDrawable(R.drawable.large_income);
        this.U.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        h0(true);
        this.j0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new rg0(this, tL_chatInviteExported, 2));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.n)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final yg0 e0() {
        yg0 yg0Var = new yg0(this);
        yg0Var.f(yg0Var.i);
        yg0Var.c = this.y;
        yg0Var.d = this.A;
        yg0Var.e = this.D;
        yg0Var.f = this.E;
        yg0Var.g = this.Q;
        yg0Var.h = this.R;
        yg0Var.b = this.T;
        yg0Var.k.clear();
        yg0Var.k.addAll(this.e0);
        yg0Var.l.clear();
        yg0Var.l.addAll(this.f0);
        return yg0Var;
    }

    public final void f0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.k0 = ChatObject.isPublic(this.c);
        c0(true);
    }

    public final void g0(yg0 yg0Var) {
        if (this.isPaused || this.a == null || this.b == null) {
            h0(true);
            return;
        }
        h0(false);
        yg0Var.f(yg0Var.j);
        f2.s.c(yg0Var, true).b(this.a);
        AndroidUtilities.updateVisibleRows(this.b);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.f2.class, org.telegram.ui.Components.e80.class, eh0.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{ah0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{eh0.class}, new String[]{"titleView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{eh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 8, new Class[]{eh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Uh));
        return arrayList;
    }

    public final void h0(boolean z10) {
        gh0 gh0Var;
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
            int i9 = this.T;
            this.M = i9;
            this.T = i9 + 2;
            this.N = i9 + 1;
        } else {
            int i10 = this.T;
            this.T = i10 + 1;
            this.r = i10;
        }
        int i11 = this.T;
        this.s = i11;
        int i12 = i11 + 2;
        this.T = i12;
        this.v = i11 + 1;
        ArrayList arrayList = this.e0;
        if (!z11) {
            this.w = i12;
            this.T = i11 + 4;
            this.x = i11 + 3;
        } else if (!arrayList.isEmpty()) {
            int i13 = this.T;
            this.w = i13;
            this.T = i13 + 2;
            this.L = i13 + 1;
        }
        if (!arrayList.isEmpty()) {
            int i14 = this.T;
            this.y = i14;
            int size = arrayList.size() + i14;
            this.T = size;
            this.A = size;
        }
        if (!z11 && arrayList.isEmpty() && this.x >= 0 && (!this.S || this.Z || this.n0)) {
            int i15 = this.T;
            this.T = i15 + 1;
            this.K = i15;
        }
        if (!z11) {
            ArrayList arrayList2 = this.i0;
            if (arrayList2.size() > 0) {
                if ((!arrayList.isEmpty() || this.x >= 0) && this.K == -1) {
                    int i16 = this.T;
                    this.T = i16 + 1;
                    this.P = i16;
                }
                int i17 = this.T;
                int i18 = i17 + 1;
                this.T = i18;
                this.O = i17;
                this.Q = i18;
                int size2 = arrayList2.size() + i18;
                this.T = size2;
                this.R = size2;
            }
        }
        ArrayList arrayList3 = this.f0;
        if (!arrayList3.isEmpty()) {
            if (this.Q >= 0) {
                int i19 = this.T;
                this.T = i19 + 1;
                this.F = i19;
            } else if ((!arrayList.isEmpty() || this.x >= 0) && this.K == -1) {
                int i20 = this.T;
                this.T = i20 + 1;
                this.F = i20;
            } else if (z11 && this.y == -1) {
                int i21 = this.T;
                this.T = i21 + 1;
                this.F = i21;
            }
            int i22 = this.T;
            int i23 = i22 + 1;
            this.T = i23;
            this.H = i22;
            this.D = i23;
            int size3 = arrayList3.size() + i23;
            this.E = size3;
            this.I = size3;
            this.T = size3 + 2;
            this.J = size3 + 1;
        }
        if (!this.Z && !this.n0 && ((this.S || this.X) && !z11)) {
            int i24 = this.T;
            this.T = i24 + 1;
            this.B = i24;
        }
        if (!arrayList.isEmpty()) {
            int i25 = this.A;
            int i26 = this.T;
            if (i25 == i26) {
                this.T = i26 + 1;
                this.C = i26;
                gh0Var = this.a;
                if (gh0Var == null && z10) {
                    gh0Var.l();
                    return;
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
            int i27 = this.T;
            this.T = i27 + 1;
            this.G = i27;
        }
        gh0Var = this.a;
        if (gh0Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        gh0 gh0Var = this.a;
        if (gh0Var != null) {
            gh0Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.a60 a60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.c0 = true;
            if (z11 && (a60Var = this.h0) != null && a60Var.h0) {
                a60Var.show();
            }
        }
        this.p0.unlock();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.p0.lock();
    }
}
