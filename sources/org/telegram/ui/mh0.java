package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class mh0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public int T;
    public int U;
    public int V;
    public boolean W;
    public int X;
    public Drawable Y;
    public Drawable Z;
    public lh0 a;
    public Drawable a0;
    public org.telegram.ui.Components.mm0 b;
    public boolean b0;
    public TLRPC.Chat c;
    public boolean c0;
    public TLRPC.ChatFull d;
    public boolean d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean e0;
    public final long f;
    public final int f0;
    public boolean g0;
    public final boolean h;
    public org.telegram.ui.Components.rl0 h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final HashMap k0;
    public org.telegram.ui.Components.m70 l0;
    public final ArrayList m0;
    public final long n;
    public long n0;
    public boolean o0;
    public final boolean p0;
    public final ah0 q0;
    public int r;
    public boolean r0;
    public int s;
    public final ch0 s0;
    public final AnimationNotificationsLocker t0;
    public int v;
    public int w;
    public int x;
    public int y;

    public mh0(long j10, long j11, int i10) {
        super(null);
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new HashMap();
        this.m0 = new ArrayList();
        this.q0 = new ah0(this);
        boolean z10 = false;
        this.r0 = false;
        this.s0 = new ch0(this);
        this.t0 = new AnimationNotificationsLocker();
        this.n = j10;
        this.f0 = i10;
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
        this.p0 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0147, code lost:
    
        if ((r9.m0.size() + (r2.size() + r3.size())) >= 5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void U(mh0 mh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        boolean z11;
        boolean z12;
        long j10 = mh0Var.f;
        ArrayList arrayList = mh0Var.j0;
        ArrayList arrayList2 = mh0Var.i0;
        dh0 g02 = mh0Var.g0();
        mh0Var.W = false;
        mh0Var.b0 = false;
        if (tL_chatInviteExported != null) {
            mh0Var.e = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = mh0Var.d;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z10) {
                for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10);
                    mh0Var.d0(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j10 != mh0Var.getAccountInstance().getUserConfig().clientUserId && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    mh0Var.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11);
                    mh0Var.d0(tL_chatInviteExported3);
                    arrayList2.add(tL_chatInviteExported3);
                }
            }
            for (int i12 = 0; i12 < tL_messages_exportedChatInvites.users.size(); i12++) {
                mh0Var.k0.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i12).id), tL_messages_exportedChatInvites.users.get(i12));
            }
            int i13 = mh0Var.X;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                mh0Var.b0 = false;
            } else if (z10) {
                mh0Var.b0 = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                mh0Var.b0 = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !mh0Var.g0) {
                z11 = true;
            } else {
                org.telegram.ui.Components.rl0 rl0Var = mh0Var.h0;
                if (rl0Var != null && !mh0Var.isPaused) {
                    rl0Var.b(i13 + 1);
                }
                z11 = false;
            }
            TLRPC.ChatFull chatFull2 = mh0Var.d;
            if (chatFull2 != null && !z10) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                mh0Var.getMessagesStorage().saveChatLinksCount(mh0Var.n, mh0Var.d.invitesCount);
            }
        } else {
            mh0Var.b0 = false;
            z11 = false;
        }
        if (mh0Var.b0 || mh0Var.r0 || j10 != mh0Var.getAccountInstance().getUserConfig().clientUserId) {
            if (mh0Var.b0 || mh0Var.r0) {
                z12 = false;
                if (mh0Var.b0) {
                }
                mh0Var.resumeDelayedFragmentAnimation();
                if (z12) {
                    mh0Var.e0(false);
                }
                if (!z11 && mh0Var.a != null && mh0Var.b.getChildCount() > 0) {
                    mh0Var.i0(g02);
                    return;
                }
                mh0Var.j0(true);
            }
            mh0Var.b0 = true;
            mh0Var.r0 = true;
        } else {
            mh0Var.b0 = true;
            mh0Var.d0 = true;
        }
        z12 = true;
        if (mh0Var.b0) {
        }
        mh0Var.resumeDelayedFragmentAnimation();
        if (z12) {
        }
        if (!z11) {
        }
        mh0Var.j0(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if ((r0.size() + (r7.j0.size() + r7.i0.size())) >= 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void V(mh0 mh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.Components.rl0 rl0Var;
        ArrayList arrayList = mh0Var.m0;
        mh0Var.W = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i10 = 0; i10 < tL_messages_chatAdminsWithInvites.admins.size(); i10++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i10);
                if (tL_chatAdminWithInvites.admin_id != mh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i11 = 0; i11 < tL_messages_chatAdminsWithInvites.users.size(); i11++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i11);
                mh0Var.k0.put(Long.valueOf(user.id), user);
            }
        }
        int i12 = mh0Var.X;
        mh0Var.e0 = true;
        mh0Var.b0 = false;
        if (arrayList.size() > 0 && (rl0Var = mh0Var.h0) != null && !mh0Var.isPaused && mh0Var.g0) {
            rl0Var.b(i12 + 1);
        }
        if (mh0Var.b0) {
        }
        mh0Var.resumeDelayedFragmentAnimation();
        if (!mh0Var.b0 && !mh0Var.r0) {
            mh0Var.b0 = true;
            mh0Var.r0 = true;
            mh0Var.e0(false);
        }
        mh0Var.j0(true);
    }

    public static void W(mh0 mh0Var) {
        if (mh0Var.f != mh0Var.getAccountInstance().getUserConfig().clientUserId) {
            mh0Var.f0(mh0Var.e);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = mh0Var.getMessagesController().getInputPeer(-mh0Var.n);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = mh0Var.e;
        mh0Var.e = null;
        mh0Var.d.exported_invite = null;
        int sendRequest = mh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new vg0(mh0Var, tL_chatInviteExported, 0));
        AndroidUtilities.updateVisibleRows(mh0Var.b);
        mh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, mh0Var.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    public final void b0() {
        org.telegram.ui.Components.mm0 mm0Var = this.b;
        if (mm0Var != null) {
            int childCount = mm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.b.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.r90) {
                    ((org.telegram.ui.Components.r90) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.m70 m70Var = this.l0;
        if (m70Var != null) {
            m70Var.updateColors();
        }
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new vg0(this, tL_chatInviteExported, 1));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 10));
        l0 l0Var = new l0(this, context, 14);
        this.fragmentView = l0Var;
        int i10 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i10, l0Var, null);
        this.fragmentView.setTag(Integer.valueOf(i10));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.b = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.b);
        hg.a0 a0Var = new hg.a0(1, false, 12);
        this.b.setLayoutManager(a0Var);
        org.telegram.ui.Components.mm0 mm0Var2 = this.b;
        lh0 lh0Var = new lh0(this, context);
        this.a = lh0Var;
        mm0Var2.setAdapter(lh0Var);
        this.b.setOnScrollListener(new ki.m3(6, this, a0Var));
        this.h0 = new org.telegram.ui.Components.rl0(this.b, false);
        s4.k kVar = new s4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.b, w7.z5.c(-1.0f, -1));
        this.b.setOnItemClickListener(new ci.x4(19, this, context));
        this.b.setOnItemLongClickListener(new xg0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        j0(true);
        this.n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_chatInviteExported.expire_date > 0) {
            tL_chatInviteExported.expired = getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date;
            return;
        }
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            tL_chatInviteExported.expired = tL_chatInviteExported.usage >= i10;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.n)) {
            org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
            if (h5Var == null || h5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0(boolean z10) {
        boolean z11 = this.d0;
        long j10 = this.n;
        if (!z11 || this.e0) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
            long clientUserId = getUserConfig().getClientUserId();
            long j11 = this.f;
            if (j11 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j11);
            }
            boolean z12 = this.r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.o1.i(1, arrayList2)).date;
                }
            }
            this.W = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ai.w9(this, this.o0 ? null : this.e, z12, 7)), getClassGuid());
        } else {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new ug0(this, 0)), getClassGuid());
        }
        if (z10) {
            j0(true);
        }
    }

    public final void f0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new vg0(this, tL_chatInviteExported, 2));
    }

    public final dh0 g0() {
        dh0 dh0Var = new dh0(this);
        dh0Var.f(dh0Var.i);
        dh0Var.c = this.y;
        dh0Var.d = this.E;
        dh0Var.e = this.H;
        dh0Var.f = this.I;
        dh0Var.g = this.U;
        dh0Var.h = this.V;
        dh0Var.b = this.X;
        dh0Var.k.clear();
        dh0Var.k.addAll(this.i0);
        dh0Var.l.clear();
        dh0Var.l.addAll(this.j0);
        return dh0Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(13, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 32, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k7));
        return arrayList;
    }

    public final void h0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.o0 = ChatObject.isPublic(this.c);
        e0(true);
    }

    public final void i0(dh0 dh0Var) {
        if (this.isPaused || this.a == null || this.b == null) {
            j0(true);
            return;
        }
        j0(false);
        dh0Var.f(dh0Var.j);
        s4.o.c(dh0Var, true).c(this.a);
        AndroidUtilities.updateVisibleRows(this.b);
    }

    public final void j0(boolean z10) {
        lh0 lh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.n));
        this.c = chat;
        if (chat == null) {
            return;
        }
        this.Q = -1;
        this.R = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.L = -1;
        this.J = -1;
        this.K = -1;
        this.N = -1;
        this.M = -1;
        this.O = -1;
        this.r = -1;
        this.x = -1;
        this.V = -1;
        this.U = -1;
        this.T = -1;
        this.S = -1;
        this.P = -1;
        this.w = -1;
        this.G = -1;
        this.X = 0;
        boolean z11 = this.f != getAccountInstance().getUserConfig().clientUserId;
        if (z11) {
            int i10 = this.X;
            this.Q = i10;
            this.X = i10 + 2;
            this.R = i10 + 1;
        } else {
            int i11 = this.X;
            this.X = i11 + 1;
            this.r = i11;
        }
        int i12 = this.X;
        this.s = i12;
        int i13 = i12 + 2;
        this.X = i13;
        this.v = i12 + 1;
        ArrayList arrayList = this.i0;
        if (!z11) {
            this.w = i13;
            this.X = i12 + 4;
            this.x = i12 + 3;
        } else if (!arrayList.isEmpty()) {
            int i14 = this.X;
            this.w = i14;
            this.X = i14 + 2;
            this.P = i14 + 1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.X;
            this.y = i15;
            int size = arrayList.size() + i15;
            this.X = size;
            this.E = size;
        }
        if (!z11 && arrayList.isEmpty() && this.x >= 0 && (!this.W || this.d0 || this.r0)) {
            int i16 = this.X;
            this.X = i16 + 1;
            this.O = i16;
        }
        if (!z11) {
            ArrayList arrayList2 = this.m0;
            if (arrayList2.size() > 0) {
                if ((!arrayList.isEmpty() || this.x >= 0) && this.O == -1) {
                    int i17 = this.X;
                    this.X = i17 + 1;
                    this.T = i17;
                }
                int i18 = this.X;
                int i19 = i18 + 1;
                this.X = i19;
                this.S = i18;
                this.U = i19;
                int size2 = arrayList2.size() + i19;
                this.X = size2;
                this.V = size2;
            }
        }
        ArrayList arrayList3 = this.j0;
        if (!arrayList3.isEmpty()) {
            if (this.U >= 0) {
                int i20 = this.X;
                this.X = i20 + 1;
                this.J = i20;
            } else if ((!arrayList.isEmpty() || this.x >= 0) && this.O == -1) {
                int i21 = this.X;
                this.X = i21 + 1;
                this.J = i21;
            } else if (z11 && this.y == -1) {
                int i22 = this.X;
                this.X = i22 + 1;
                this.J = i22;
            }
            int i23 = this.X;
            int i24 = i23 + 1;
            this.X = i24;
            this.L = i23;
            this.H = i24;
            int size3 = arrayList3.size() + i24;
            this.I = size3;
            this.M = size3;
            this.X = size3 + 2;
            this.N = size3 + 1;
        }
        if (!this.d0 && !this.r0 && ((this.W || this.b0) && !z11)) {
            int i25 = this.X;
            this.X = i25 + 1;
            this.F = i25;
        }
        if (!arrayList.isEmpty()) {
            int i26 = this.E;
            int i27 = this.X;
            if (i26 == i27) {
                this.X = i27 + 1;
                this.G = i27;
                lh0Var = this.a;
                if (lh0Var == null && z10) {
                    lh0Var.l();
                    return;
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
            int i28 = this.X;
            this.X = i28 + 1;
            this.K = i28;
        }
        lh0Var = this.a;
        if (lh0Var == null) {
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
        lh0 lh0Var = this.a;
        if (lh0Var != null) {
            lh0Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            b0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.m70 m70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.g0 = true;
            if (z11 && (m70Var = this.l0) != null && m70Var.l0) {
                m70Var.show();
            }
        }
        this.t0.unlock();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.t0.lock();
    }
}
